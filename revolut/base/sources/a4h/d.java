package a4h;

import a08.n;
import a2g.m;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(String str, String str2, String str3, String str4, String str5, String str6) {
        e[] elements = {c(f.ANNUAL_REPORT, str), c(f.MONTHLY_REPORT, str2), c(f.KID, str3), c(f.PROSPECTUS, str4), c(f.QUARTERLY_REPORT, str5), c(f.SEMIANNUAL_REPORT, str6)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public static e c(f fVar, String str) {
        if (str != null) {
            return new e(fVar, str);
        }
        return null;
    }

    public final List b(v2h.e state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Data dataC = state.c();
        List list = dataC != null ? (List) iii.c.f(dataC, new a35.b(this, 21), new n(25), new m(this, 3)) : null;
        return list == null ? f0.f322471a : list;
    }
}
