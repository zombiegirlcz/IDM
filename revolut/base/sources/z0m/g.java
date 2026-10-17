package z0m;

import java.lang.Thread;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class g implements Thread.UncaughtExceptionHandler {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f318645a = Thread.getDefaultUncaughtExceptionHandler();

    public static String a(int i, String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length <= i) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t2, Throwable e) {
        String strA;
        Intrinsics.checkNotNullParameter(t2, "t");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullExpressionValue("g", "TAG");
        j.a("g", "Uncaught exception being tracked...", new Object[0]);
        String strA2 = a(2048, e.getMessage());
        if (strA2 == null || strA2.length() == 0) {
            strA2 = "Android Exception. Null or empty message found";
        }
        String strA3 = a(8096, a1m.e.K(e));
        String strA4 = a(1024, t2.getName());
        StackTraceElement[] stackTrace = e.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
        if (stackTrace.length == 0) {
            strA = null;
        } else {
            StackTraceElement stackTraceElement = e.getStackTrace()[0];
            int lineNumber = stackTraceElement.getLineNumber();
            numValueOf = lineNumber >= 0 ? Integer.valueOf(lineNumber) : null;
            strA = a(1024, stackTraceElement.getClassName());
        }
        String strA5 = a(1024, e.getClass().getName());
        HashMap map = new HashMap();
        a1m.e.d("message", strA2, map);
        a1m.e.d("stackTrace", strA3, map);
        a1m.e.d("threadName", strA4, map);
        a1m.e.d("threadId", Long.valueOf(t2.getId()), map);
        a1m.e.d("programmingLanguage", "JAVA", map);
        a1m.e.d("lineNumber", numValueOf, map);
        a1m.e.d("className", strA, map);
        a1m.e.d("exceptionName", strA5, map);
        a1m.e.d("isFatal", Boolean.TRUE, map);
        f1m.i iVar = new f1m.i(new h1m.a("iglu:com.snowplowanalytics.snowplow/application_error/jsonschema/1-0-0", map));
        HashMap map2 = new HashMap();
        map2.put("event", iVar);
        a1m.d.b("SnowplowCrashReporting", map2);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f318645a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t2, e);
        }
    }
}
