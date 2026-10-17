package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public class ContextUtil extends ContextAwareBase {
    public ContextUtil(Context context) {
        setContext(context);
    }

    public static Map<String, String> getFilenameCollisionMap(Context context) {
        if (context == null) {
            return null;
        }
        return (Map) context.getObject("FA_FILENAME_COLLISION_MAP");
    }

    public static Map<String, FileNamePattern> getFilenamePatternCollisionMap(Context context) {
        if (context == null) {
            return null;
        }
        return (Map) context.getObject("RFA_FILENAME_PATTERN_COLLISION_MAP");
    }

    public void addHostNameAsProperty() {
        this.context.putProperty("HOSTNAME", "localhost");
    }

    public void addProperties(Properties properties) {
        if (properties == null) {
            return;
        }
        for (String str : properties.keySet()) {
            this.context.putProperty(str, properties.getProperty(str));
        }
    }
}
