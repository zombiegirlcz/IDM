package jx2;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import hha.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.d0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f179054a;

    public k(g cardDesignRevPointsPricingClauseProvider) {
        Intrinsics.checkNotNullParameter(cardDesignRevPointsPricingClauseProvider, "cardDesignRevPointsPricingClauseProvider");
        this.f179054a = cardDesignRevPointsPricingClauseProvider;
    }

    public static ImageClause a() {
        int i = R$drawable.uikit_icn_24_premium;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorForeground);
        Float fValueOf = Float.valueOf(12.0f);
        return new ImageClause(i, numValueOf, fValueOf, fValueOf, 16);
    }

    public static Clause b(boolean z) {
        if (z) {
            return new TextLocalisedClause(R$string.card_choose_button_subtitle_free_delivery_promo, null, null, 14);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static hha.d c(e93.f fVar, List list) {
        Object next;
        List<hha.d> list2 = list;
        Iterator it8 = d0.P0(list2, new j()).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            ArrayList arrayList = ((hha.d) next).f152290g;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                arrayList2.add(((b93.j) it9.next()).f13639a);
            }
            if (arrayList2.contains(fVar.c())) {
                break;
            }
        }
        hha.d dVar = (hha.d) next;
        if (dVar == null) {
            String str = fVar.c().f13615a;
            ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
            for (hha.d dVar2 : list2) {
                arrayList3.add("Plan Id = " + dVar2.f152287a + " and Plan code = " + dVar2.f152288b);
            }
            IllegalStateException illegalStateException = new IllegalStateException("Card design " + str + " is not available in any of user's plans. Available plans are " + arrayList3 + ". If lack of design in plans is expected, Card design should have a feature PROMO");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return dVar;
    }

    public static TextLocalisedClause d(List list, boolean z, dj0.d dVar, boolean z3) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((c93.m) it8.next()).f22294b);
        }
        c93.o oVar = (c93.o) d0.M0(d0.U(arrayList));
        Integer numA = oVar != null ? hb9.b.A(oVar) : null;
        if (!z) {
            return numA != null ? new TextLocalisedClause(R$string.card_choose_taxes_caption, u.c(new TextLocalisedClause(numA.intValue(), null, null, 14)), null, 12) : new TextLocalisedClause(R$string.card_choose_taxes_caption_fallback, null, null, 14);
        }
        if (numA != null && dVar.f(dj0.d.e)) {
            return new TextLocalisedClause(z3 ? R$string.card_choose_footer_with_delivery_fees_included : R$string.card_choose_footer_with_delivery_fees, u.c(new TextLocalisedClause(R$string.card_choose_taxes_included, u.c(new TextLocalisedClause(numA.intValue(), null, null, 14)), null, 12)), null, 12);
        }
        if (dVar.f(dj0.d.e)) {
            return new TextLocalisedClause(z3 ? R$string.card_choose_footer_with_delivery_fees_included : R$string.card_choose_footer_with_delivery_fees, u.c(new TextLocalisedClause(R$string.card_choose_taxes_included_fallback, null, null, 14)), null, 12);
        }
        return numA != null ? new TextLocalisedClause(R$string.card_choose_taxes_included, u.c(new TextLocalisedClause(numA.intValue(), null, null, 14)), null, 12) : new TextLocalisedClause(R$string.card_choose_taxes_included_fallback, null, null, 14);
    }

    public static TextLocalisedClause e(hha.d dVar) {
        if (s.m(dVar)) {
            return new TextLocalisedClause(R$string.card_choose_button_subtitle_plus_plan, null, null, 14);
        }
        if (s.n(dVar)) {
            return new TextLocalisedClause(R$string.card_choose_button_subtitle_premium_plan, null, null, 14);
        }
        if (s.j(dVar)) {
            return new TextLocalisedClause(R$string.card_choose_button_subtitle_metal_plan, null, null, 14);
        }
        if (s.p(dVar)) {
            return new TextLocalisedClause(R$string.card_choose_button_subtitle_ultra_plan, null, null, 14);
        }
        if (s.o(dVar)) {
            return new TextLocalisedClause(R$string.card_choose_button_subtitle_private_plan, null, null, 14);
        }
        return null;
    }

    public static Clause f(e93.f fVar, List list) {
        hha.d dVarC = c(fVar, list);
        if (dVarC == null) {
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        TextLocalisedClause textLocalisedClauseE = e(dVarC);
        if (textLocalisedClauseE != null) {
            return new CompositeClause(v.k(a(), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.card_choose_button_subtitle_plan_upgrade_required, u.c(textLocalisedClauseE), null, 12)), null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), null, 10);
        }
        return new CompositeClause(v.k(a(), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.card_choose_button_subtitle_plan_upgrade_required_placeholder, null, null, 14)), null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), null, 10);
    }
}
