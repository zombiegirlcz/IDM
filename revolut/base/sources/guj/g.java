package guj;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit_resources.R$attr;
import fq7.k;
import gs2.t;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(int i) {
        s7 s7Var = new s7(a0.d.n("loading_subheader_row_", i), 0, 0, 0, 0, false, null, 94);
        ArrayList arrayList = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList.add(nb0.a(pb0.Companion, a0.d.g(i, i2, "eligibility_criteria_loading_row__", "_"), true, 4));
        }
        int i3 = R$attr.uikit_dp8;
        yp0.b.k(arrayList, i3, i3, 0, 0, 28);
        return i2b.a.o(u.c(s7Var), arrayList);
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (f) iii.c.f(domainState.f146966a, new t(this, 18), new gug.c(this, 3), new k(this, 29));
    }
}
