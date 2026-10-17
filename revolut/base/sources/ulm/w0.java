package ulm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class w0 {
    public static final void a(w0 w0Var, List list, StringBuilder sb6) {
        w0Var.getClass();
        kotlin.ranges.c cVarN = kotlin.ranges.f.n(2, kotlin.ranges.f.o(0, list.size()));
        int i = cVarN.f186448a;
        int i2 = cVarN.f186449b;
        int i3 = cVarN.f186450c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb6.append('&');
            }
            sb6.append(str);
            if (str2 != null) {
                sb6.append('=');
                sb6.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public static int b(String scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (Intrinsics.f(scheme, "http")) {
            return 80;
        }
        return Intrinsics.f(scheme, "https") ? 443 : -1;
    }

    public static x0 c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        v0 v0Var = new v0();
        v0Var.d(null, str);
        return v0Var.b();
    }

    public static x0 d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
