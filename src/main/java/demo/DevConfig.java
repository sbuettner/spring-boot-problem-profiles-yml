package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

/**
 * @author Simon Buettner
 */
@Configuration
@Profile("development")
public class DevConfig {

    @Value("${my.prop}")
    String myProp;

    @PostConstruct
    public void verifyProductionConfigExists() {
        System.out.println("Value of 'my.prop' is " + myProp);
    }

}
