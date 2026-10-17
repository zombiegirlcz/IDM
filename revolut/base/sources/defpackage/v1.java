package defpackage;

import com.youTransactor.uCube.log.LogManager;

/* JADX INFO: loaded from: classes22.dex */
public abstract class v1 {
    public static void a(String str) {
        if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.MDM.getCode()) {
            LogManager.d("[MDM]", str);
        }
    }

    public static void b(String str, Exception... excArr) {
        if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.MDM.getCode()) {
            if (excArr.length > 0) {
                LogManager.e("[MDM]", str, excArr[0]);
            } else {
                LogManager.e("[MDM]", str);
            }
        }
    }
}
