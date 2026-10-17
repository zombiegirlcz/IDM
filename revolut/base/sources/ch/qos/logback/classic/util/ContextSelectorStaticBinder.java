package ch.qos.logback.classic.util;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.selector.ContextSelector;
import ch.qos.logback.classic.selector.DefaultContextSelector;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class ContextSelectorStaticBinder {
    static ContextSelectorStaticBinder singleton = new ContextSelectorStaticBinder();
    ContextSelector contextSelector;
    Object key;

    public static ContextSelector dynamicalContextSelector(LoggerContext loggerContext, String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        return (ContextSelector) Loader.loadClass(str).getConstructor(LoggerContext.class).newInstance(loggerContext);
    }

    public static ContextSelectorStaticBinder getSingleton() {
        return singleton;
    }

    public ContextSelector getContextSelector() {
        return this.contextSelector;
    }

    public void init(LoggerContext loggerContext, Object obj2) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        Object obj3 = this.key;
        if (obj3 == null) {
            this.key = obj2;
        } else if (obj3 != obj2) {
            throw new IllegalAccessException("Only certain classes can access this method.");
        }
        String systemProperty = OptionHelper.getSystemProperty("logback.ContextSelector");
        if (systemProperty == null) {
            this.contextSelector = new DefaultContextSelector(loggerContext);
        } else {
            if (systemProperty.equals("JNDI")) {
                throw new RuntimeException("JNDI not supported");
            }
            this.contextSelector = dynamicalContextSelector(loggerContext, systemProperty);
        }
    }
}
