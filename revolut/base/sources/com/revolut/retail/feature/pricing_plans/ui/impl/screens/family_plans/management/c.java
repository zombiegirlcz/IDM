package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management;

import aw0.o9;
import cli.j;
import cli.n;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import dj0.d;
import hha.i0;
import hha.z;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lha.g;
import lha.o;
import mkk.e;
import mkk.f;
import mkk.s;
import mkk.t;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zjk.a;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f103418a;

    public c(com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.c moreForFamilyMapper, mkk.a billingClauseProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(moreForFamilyMapper, "moreForFamilyMapper");
        Intrinsics.checkNotNullParameter(billingClauseProvider, "billingClauseProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f103418a = featureToggleInteractor;
    }

    public static CompositeClause a(TextLocalisedClause textLocalisedClause) {
        int i = R$drawable.uikit_icn_24_people;
        Float fValueOf = Float.valueOf(16.0f);
        return new CompositeClause(v.k(new ImageClause(i, ImageClauseTint.TextColor.f57790a, fValueOf, fValueOf, 16), textLocalisedClause), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static boolean b(g gVar) {
        return gVar.f.size() == 1 && gVar.f195206g.isEmpty() && gVar.e == o.MANAGER;
    }

    @Override // cli.n
    public final cli.o c(j jVar) {
        char c2;
        Clause clauseA;
        CompositeClause compositeClauseA;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f206480b, new mk3.c(this), new mh1.e(13), new m88.c(this, domainState, 9));
        Data data = domainState.f206479a;
        Data data2 = domainState.f206480b;
        Object content = data.getContent();
        Object content2 = data2.getContent();
        Clause textClause = null;
        if (content != null && content2 != null) {
            g gVar = (g) content2;
            PricingPlanSubscription subscription = (PricingPlanSubscription) content;
            o oVar = subscription.f81142t;
            int i = oVar == null ? -1 : t.f206499a[oVar.ordinal()];
            if (i == -1) {
                c2 = 1;
                clauseA = null;
            } else if (i == 1) {
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                i0 i0Var = subscription.f81135l;
                z zVar = subscription.f81136m;
                hha.o oVarC = hha.s.c(subscription);
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                a.C1791a chargeDisplayStyle = a.C1791a.f322873a;
                Intrinsics.checkNotNullParameter(chargeDisplayStyle, "chargeDisplayStyle");
                hha.o oVarC2 = hha.s.c(subscription);
                if (oVarC2 == null) {
                    clauseA = null;
                    c2 = 1;
                } else {
                    c2 = 1;
                    clauseA = zjk.c.a(oVarC2, chargeDisplayStyle, false, new t9f.n((Object) subscription, false, 22));
                }
                if (zVar != null && clauseA != null) {
                    clauseA = vc.o.f(zVar, R$plurals.plan_billing_dialog_free_subtitle_day_period, R$plurals.plan_billing_dialog_free_subtitle_week_period, R$plurals.plan_billing_dialog_free_subtitle_month_period, u.c(clauseA));
                } else if (i0Var != null && oVarC != null) {
                    hha.o oVarA = i0Var.e;
                    if (oVarA == null) {
                        hha.n nVar = hha.o.Companion;
                        d dVar = i0Var.d;
                        nVar.getClass();
                        oVarA = hha.n.a(dVar);
                    }
                    clauseA = zjk.c.c(oVarC, subscription.d, oVarA, i0Var.f152313c, chargeDisplayStyle, i0Var.f152315h);
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = R$string.family_plans_management_subtitle_paid_by;
                String str = gVar.a().e;
                if (str == null) {
                    str = "";
                }
                clauseA = new TextLocalisedClause(i2, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                c2 = 1;
            }
            if (gVar.f195207h) {
                int i3 = R$string.family_plans_management_subtitle;
                Clause clauseD = dok.g.d(subscription.f81129a, null);
                if (clauseA != null) {
                    Clause[] clauseArr = new Clause[2];
                    clauseArr[0] = clauseD;
                    clauseArr[c2] = clauseA;
                    compositeClauseA = a(new TextLocalisedClause(i3, v.k(clauseArr), null, 12));
                    textClause = compositeClauseA;
                }
            } else {
                int i5 = R$string.family_plans_management_two_members_subtitle;
                if (clauseA != null) {
                    compositeClauseA = a(new TextLocalisedClause(i5, u.c(clauseA), null, 12));
                    textClause = compositeClauseA;
                }
            }
        }
        if (textClause == null) {
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new mkk.j(list, new f(textClause));
    }

    public final boolean d(g gVar) {
        if (gVar.f195207h) {
            return false;
        }
        return ((jte.d) this.f103418a).c(PricingPlansUiApi$Toggles.DuoBillingCycleExtrasEEA2.f102629c);
    }
}
