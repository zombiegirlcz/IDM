package fb6;

import aw0.n6;
import aw0.o9;
import aw0.x4;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.R$string;
import fag.o0;
import ip0.ck0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static n6 a(TextLocalisedClause textLocalisedClause, boolean z, c cVar) {
        return new n6(textLocalisedClause, LargeActionButton.ButtonStyle.d, null, "DONATE_BUTTON_TAG", z, null, cVar, 460);
    }

    public static TextDelegate.Model b() {
        m70.a.c(t0.f186434a);
        return d(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    public static TextDelegate.Model d(Clause clause) {
        return new TextDelegate.Model("ID_DISCLAIMER_TEXT", clause, false, new ck0(yj0.CENTER_HORIZONTAL), null, null, R$attr.uikit_dp8, R$attr.uikit_dp0, 0, 0, 1616);
    }

    public static ArrayList e(ArrayList arrayList) {
        ArrayList arrayListS = d0.S(arrayList, 3);
        ArrayList arrayList2 = new ArrayList(w.t(arrayListS, 10));
        int i = 0;
        for (Object obj2 : arrayListS) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            hg hgVar = new hg(a0.d.n("SCROLLER_DELEGATE_ID_", i), (List) obj2, 3, x4.c.f10604a, null, new gg.b(false, 3), false, false, null, null, 0, 0, 0, 0, 32720);
            int i3 = i == 0 ? R$attr.uikit_dp8 : R$attr.uikit_dp0;
            int i5 = R$attr.uikit_dp0;
            yp0.b.r(hgVar, i3, 0, i5, i5, 2);
            arrayList2.add(hgVar);
            i = i2;
        }
        return arrayList2;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f133445a;
        Data data2 = domainState.f133447c;
        return new cii.b(new aw0.e(false, null, null, (n6) iii.c.f(t1.t(domainState.f133445a, data2), new o0(this, 13), new f5g.l(this, 26), new m(domainState.f133446b, this)), null, null, 55), (List) iii.c.f(t1.t(data, data2), new o0(this, 12), new f5g.l(25), new f0e.i(this, domainState, 5)), new lw0.a(new TextLocalisedClause(R$string.donations_rev_points_donation_title, null, null, 14), null, null, null, false, 30));
    }
}
