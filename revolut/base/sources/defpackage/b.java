package defpackage;

import com.youTransactor.uCube.log.LogManager;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {
    public static void a(String str) {
        if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.PAYMENT.getCode()) {
            LogManager.d("[PAYMENT]", str);
        }
    }

    public static void b(String str, Exception... excArr) {
        if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.PAYMENT.getCode()) {
            if (excArr.length > 0) {
                LogManager.e("[PAYMENT]", str, excArr[0]);
            } else {
                LogManager.e("[PAYMENT]", str);
            }
        }
    }
}
