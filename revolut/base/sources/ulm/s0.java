package ulm;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f281134a = new ArrayList(20);

    public final void a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ue8.c.b(this, name, value);
    }

    public final void b(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        int iS = kotlin.text.d0.S(line, CoreConstants.COLON_CHAR, 1, 4);
        if (iS != -1) {
            String strSubstring = line.substring(0, iS);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = line.substring(iS + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            c(strSubstring, strSubstring2);
            return;
        }
        if (line.charAt(0) != ':') {
            c("", line);
            return;
        }
        String strSubstring3 = line.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        c("", strSubstring3);
    }

    public final void c(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ue8.c.d(this, name, value);
    }

    public final void d(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ue8.c.B(name);
        c(name, value);
    }
}
