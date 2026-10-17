package ts6;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "revolut-pro");
    }

    public static boolean b(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return a(deeplink) && Intrinsics.f(deeplink.e(2), "promo-link") && Intrinsics.f(deeplink.e(3), "not-eligible");
    }

    public static tr6.a c(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        HashMap map = deeplink.d;
        kotlin.jvm.internal.t0 t0Var = kotlin.jvm.internal.t0.f186434a;
        m70.a.c(t0Var);
        String str = (String) map.getOrDefault("origin", "");
        HashMap map2 = deeplink.d;
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return new tr6.a(str, (String) map2.getOrDefault("ref_value", ""));
    }
}
