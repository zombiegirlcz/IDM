package o0g;

import kotlin.jvm.internal.Intrinsics;
import x3g.g;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private c() {
    }

    public static String a(g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String str = request.f302746a;
        String str2 = request.f302747b;
        if (str2 == null) {
            str2 = "";
        }
        return p.a.p("CACHE_KEY_REVIEWS_", str, str2);
    }
}
