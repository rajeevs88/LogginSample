package com.paju;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginSample {

    private static final Logger logger = LogManager.getLogger(LoginSample.class);

    public static void main(String[] args) {

        logger.debug("Hello from Log4j 2");

        // in old days, we need to check the log level to increase performance
        /*if (logger.isDebugEnabled()) {
            logger.debug("{}", getNumber());
        }*/
        int i=0;
        // with Java 8, we can do this, no need to check the log level
        while(true) {
            logger.debug("{}", () -> getNumber(8));
            logger.debug("Hello from Log4j 2");
            i++;
            if(i>100000){
                break;
            }

        }

    }

    static int getNumber(int a) {
        return a-1;
    }

}

