package qoa;

import aw0.ka;
import cjk.g;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.profile.impl.R$plurals;
import com.revolut.feature.profile.impl.R$string;
import hha.s;
import java.util.Date;
import java.util.List;
import jgk.i;
import jgk.j;
import jgk.k;
import jgk.m;
import jgk.n;
import jgk.p;
import jgk.q;
import jgk.t;
import jgk.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import yik.h;
import yna.w;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f248095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f248096b;

    public f(u planSubscriptionStateProvider, h pricingPlanStringMapper) {
        Intrinsics.checkNotNullParameter(planSubscriptionStateProvider, "planSubscriptionStateProvider");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        this.f248095a = planSubscriptionStateProvider;
        this.f248096b = pricingPlanStringMapper;
    }

    public static CdnImage a(hha.d dVar) {
        return (dVar == null || !s.o(dVar)) ? (dVar == null || !s.p(dVar)) ? (dVar == null || !s.j(dVar)) ? (dVar == null || !s.n(dVar)) ? ez0.c.a("standard_cards") : ez0.c.a("premium_green_cards") : ez0.c.a("metal_bronze_cards") : ez0.c.a("ultra_cards") : ez0.c.a("private_banking_cards");
    }

    public final Clause b(w pricingPlanData) {
        Clause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        Intrinsics.checkNotNullParameter(pricingPlanData, "pricingPlanData");
        PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) pricingPlanData.f315379a.getContent();
        List list = (List) pricingPlanData.f315380b.getContent();
        List list2 = (List) pricingPlanData.f315381c.getContent();
        if (pricingPlanSubscription == null || list == null || list2 == null) {
            return new TextLocalisedClause(R$string.profile_pricing_plan_title, null, null, 14);
        }
        t tVarC = ((g) this.f248095a).c(pricingPlanSubscription, list, null, list2, null);
        p pVar = tVarC.f174090a;
        m mVar = tVarC.f174092c;
        k kVar = tVarC.d;
        q qVar = tVarC.f;
        if (pVar instanceof n) {
            int i = R$plurals.profile_pricing_plan_title_gift;
            int i2 = ((n) pVar).f174081a;
            textLocalisedClause = new TextLocalisedQuantityClause(i, Integer.valueOf(i2), zhm.u.c(Integer.valueOf(i2)), (Style) null, 24);
        } else if (qVar != null) {
            hha.d dVar = pricingPlanSubscription.f81129a;
            boolean z = qVar.f174087c;
            hha.d dVar2 = qVar.f174085a;
            if (z) {
                if (dVar2.f152294m > dVar.f152294m) {
                    textLocalisedClause2 = new TextLocalisedClause(R$string.profile_pricing_plan_title_pre_order_waiting_terms, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10);
                }
                textLocalisedClause = null;
            } else {
                boolean z3 = qVar.f174086b;
                h hVar = this.f248096b;
                if (z3) {
                    textLocalisedClause = new TextLocalisedClause(R$string.profile_pricing_plan_title_pre_order_credit, zhm.u.c(fgk.b.a(hVar, dVar2)), new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 8);
                } else {
                    textLocalisedClause2 = new TextLocalisedClause(R$string.profile_pricing_plan_title_pre_order, zhm.u.c(fgk.b.a(hVar, dVar2)), null, 12);
                }
            }
            textLocalisedClause = textLocalisedClause2;
        } else {
            textLocalisedClause = pricingPlanData.e;
            if (textLocalisedClause == null) {
                if (mVar != null) {
                    DateTime dateTime = mVar.f174080a.f152376b;
                    if (dateTime != null) {
                        textLocalisedClause3 = new TextLocalisedClause(R$string.profile_pricing_plan_title_free_trial, zhm.u.c(new TimeClause(dateTime.getMillis(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12);
                        textLocalisedClause = textLocalisedClause3;
                    }
                    textLocalisedClause = null;
                } else {
                    if (kVar != null) {
                        if (kVar instanceof i) {
                            Date date = ((i) kVar).d;
                            if (date != null) {
                                textLocalisedClause3 = new TextLocalisedClause(R$string.profile_pricing_plan_title_downgrade, zhm.u.c(new TimeClause(date.getTime(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12);
                                textLocalisedClause = textLocalisedClause3;
                            }
                        } else {
                            if (!(kVar instanceof j)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            textLocalisedClause2 = new TextLocalisedClause(R$string.profile_pricing_plan_title_renewal, zhm.u.c(new TimeClause(((j) kVar).f174078a.getTime(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12);
                            textLocalisedClause = textLocalisedClause2;
                        }
                    }
                    textLocalisedClause = null;
                }
            }
        }
        return textLocalisedClause == null ? new TextLocalisedClause(R$string.profile_pricing_plan_title, null, null, 14) : textLocalisedClause;
    }
}
