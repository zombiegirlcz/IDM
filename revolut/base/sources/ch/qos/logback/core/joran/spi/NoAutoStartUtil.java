package ch.qos.logback.core.joran.spi;

/* JADX INFO: loaded from: classes.dex */
public class NoAutoStartUtil {
    public static boolean notMarkedWithNoAutoStart(Object obj2) {
        return obj2 != null && ((NoAutoStart) obj2.getClass().getAnnotation(NoAutoStart.class)) == null;
    }
}
