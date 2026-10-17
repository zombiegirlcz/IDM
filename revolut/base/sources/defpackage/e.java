package defpackage;

import com.youTransactor.uCube.log.LogManager;

/* JADX INFO: loaded from: classes13.dex */
public abstract class e {
    public static void a(String str) {
        if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.RPC.getCode()) {
            LogManager.d("[RPC]", str);
        }
    }

    public static void b(String str, Exception... excArr) {
        if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.RPC.getCode()) {
            if (excArr.length > 0) {
                LogManager.e("[RPC]", str, excArr[0]);
            } else {
                LogManager.e("[RPC]", str);
            }
        }
    }
}
