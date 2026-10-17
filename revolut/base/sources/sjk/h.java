package sjk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pricingplans.models.PricingPlanNextPlanInfo;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import hha.s;
import hha.w0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class h {
    public static Clause a(PricingPlanSubscription subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        return b(s.f(subscription.f81129a), subscription.f81142t != null);
    }

    public static Clause b(w0 w0Var, boolean z) {
        Clause clauseE = dok.g.e(w0Var, null);
        if (clauseE == null) {
            clauseE = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return z ? new TextLocalisedClause(R$string.plan_duo_short_name, u.c(clauseE), null, 12) : clauseE;
    }

    public static Clause c(PricingPlanSubscription subscription) {
        String str;
        w0 w0VarE;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        PricingPlanNextPlanInfo pricingPlanNextPlanInfo = subscription.f81134j;
        Clause clauseB = null;
        if (pricingPlanNextPlanInfo == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "CancelDowngradeScreenPlanNameMapper", "No next plan on plan subscription", null, h0Var);
            Unit unit = Unit.f186387a;
        }
        if (pricingPlanNextPlanInfo != null && (str = pricingPlanNextPlanInfo.f81121g) != null && (w0VarE = s.e(str)) != null) {
            clauseB = b(w0VarE, pricingPlanNextPlanInfo.f);
        }
        return c8g.c.p(clauseB);
    }
}
