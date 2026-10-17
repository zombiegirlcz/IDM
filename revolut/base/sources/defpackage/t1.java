package defpackage;

import com.youTransactor.uCube.log.LogManager;

/* JADX INFO: loaded from: classes22.dex */
public abstract class t1 {
    public static void a(String str) {
        if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.CONNEXION.getCode()) {
            LogManager.d("[CONNECTION]", str);
        }
    }

    public static void b(String str, Exception... excArr) {
        if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.CONNEXION.getCode()) {
            if (excArr.length > 0) {
                LogManager.e("[CONNECTION]", str, excArr[0]);
            } else {
                LogManager.e("[CONNECTION]", str);
            }
        }
    }
}
