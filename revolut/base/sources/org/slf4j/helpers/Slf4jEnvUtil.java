package org.slf4j.helpers;

/* JADX INFO: loaded from: classes14.dex */
public class Slf4jEnvUtil {
    public static String slf4jVersion() {
        Package r06 = Slf4jEnvUtil.class.getPackage();
        if (r06 == null) {
            return null;
        }
        return r06.getImplementationVersion();
    }
}
