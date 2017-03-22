package org.sonar.java.checks.targets;

import java.util.Properties;

public class ArchitectureUseProperties {

    public Properties produceProperties() {
        Properties props = new Properties();
        props.put("java.naming.factory.initial", "weblogic.jndi.WLInitialContextFactory");
        return props;
    }
}