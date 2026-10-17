package yx2;

import aw0.o9;
import aw0.t0;
import c93.m;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.cards_core.R$string;
import e93.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        boolean z;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.rev_points_discounts_breakdown_title, null, null, 14), null, null, null, false, 30);
        List list = domainState.f317542c;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (((m) it8.next()).f22293a.f(dj0.d.e)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        j0 j0Var = domainState.f317541b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            arrayList.add(((m) it9.next()).f22294b);
        }
        c93.o oVar = (c93.o) d0.M0(d0.U(arrayList));
        Integer numA = oVar != null ? hb9.b.A(oVar) : null;
        List listK = v.k(new CellDetailsDelegate.Model("ORIGINAL_PRICE_LIST_ID", new t0((Clause) (numA != null ? new TextLocalisedClause(R$string.rev_points_discounts_breakdown_card_price_with_tax, u.c(new TextLocalisedClause(numA.intValue(), null, null, 14)), null, 12) : z ? new TextLocalisedClause(R$string.rev_points_discounts_breakdown_card_price_with_taxes, null, null, 14) : new TextLocalisedClause(R$string.rev_points_discounts_breakdown_card_price, null, null, 14)), (Image) null, 0, false, 30), new MoneyClause(domainState.f317540a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("DISCOUNT_PRICE_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.rev_points_discounts_breakdown_or_with_points_title, null, null, 14), (Image) null, 0, false, 30), new CompositeClause(v.k(a13.a.a(j0Var.f123876a, null), new MoneyClause(j0Var.f123878c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new TextClause(" + ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(null, listK, aVar);
    }
}
