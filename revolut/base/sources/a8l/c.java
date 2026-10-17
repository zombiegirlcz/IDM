package a8l;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd0.g;
import sd0.j;
import xi0.e;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static boolean a(f8l.c assetType) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        int i = d.f2286a[assetType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4 || i == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean b(xi0.b currency) {
        String code;
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (cp5.d.A(currency) || cp5.d.z(currency) || cp5.d.y(currency)) {
            return true;
        }
        if (currency != null && (code = currency.f306286a) != null) {
            g.f261792c.getClass();
            Intrinsics.checkNotNullParameter(code, "code");
            j.a();
            yf.c cVar = g.d;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(code, "code");
            xi0.c cVar2 = (xi0.c) ((Map) cVar.b).get(code);
            if ((cVar2 != null ? cVar2.f306289b : null) == e.VIRTUAL) {
                return true;
            }
        }
        return Intrinsics.f(currency.f306286a, "PTS");
    }
}
