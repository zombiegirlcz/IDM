package f1m;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class k extends a {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131315c;
    public final Throwable d;

    public k(String source, String message, Throwable th10) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f131314b = source;
        this.f131315c = message;
        this.d = th10;
    }

    public static String c(int i, String str) {
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

    @Override // f1m.a
    public final Map a() {
        String strC = c(2048, this.f131315c);
        if (strC == null || strC.length() == 0) {
            strC = "Empty message found";
        }
        HashMap map = new HashMap();
        map.put("className", this.f131314b);
        map.put("message", strC);
        Throwable th10 = this.d;
        if (th10 != null) {
            String strC2 = c(8192, a1m.e.K(th10));
            String strC3 = c(1024, th10.getClass().getName());
            map.put("stackTrace", strC2);
            map.put("exceptionName", strC3);
        }
        return map;
    }

    @Override // f1m.a
    public final String b() {
        return "iglu:com.snowplowanalytics.snowplow/diagnostic_error/jsonschema/1-0-0";
    }
}
