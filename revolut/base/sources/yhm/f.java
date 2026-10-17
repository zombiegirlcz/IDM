package yhm;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public class f {
    public static void a(Throwable th10, Throwable exception) {
        Intrinsics.checkNotNullParameter(th10, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (th10 != exception) {
            iim.b.f161642a.a(th10, exception);
        }
    }

    public static String b(Throwable th10) {
        Intrinsics.checkNotNullParameter(th10, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th10.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
