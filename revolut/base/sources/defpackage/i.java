package defpackage;

import com.youTransactor.uCube.log.LogManager;

/* JADX INFO: loaded from: classes15.dex */
public abstract class i {
    public static void a(String str) {
        if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.API.getCode()) {
            LogManager.d("[API]", str);
        }
    }
}
