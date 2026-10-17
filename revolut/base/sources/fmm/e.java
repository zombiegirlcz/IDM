package fmm;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.text.f0;
import okhttp3.OkHttpClient;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f136486a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f136487b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = OkHttpClient.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(OkHttpClient.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(bmm.i.class.getName(), "okhttp.Http2");
        linkedHashMap.put(xlm.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f136487b = r0.u(linkedHashMap);
    }

    public static void a(int i, String loggerName, String message, Throwable th10) {
        int iMin;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String strU0 = (String) f136487b.get(loggerName);
        if (strU0 == null) {
            strU0 = f0.U0(23, loggerName);
        }
        if (Log.isLoggable(strU0, i)) {
            if (th10 != null) {
                message = message + '\n' + Log.getStackTraceString(th10);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iS = d0.S(message, '\n', i2, 4);
                if (iS == -1) {
                    iS = length;
                }
                while (true) {
                    iMin = Math.min(iS, i2 + 4000);
                    Intrinsics.checkNotNullExpressionValue(message.substring(i2, iMin), "substring(...)");
                    if (iMin >= iS) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    public static void b(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f136486a.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(f.f136488a);
        }
    }
}
