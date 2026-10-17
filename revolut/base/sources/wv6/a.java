package wv6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import hha.d;
import hha.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static TextLocalisedClause a(d pricingPlan) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        return s.o(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_details_upsell_plans_private_plan, null, null, 14) : s.p(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_details_upsell_plans_ultra_plan, null, null, 14) : s.j(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_details_upsell_plans_metal_plan, null, null, 14) : s.n(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_details_upsell_plans_premium_plan, null, null, 14) : s.m(pricingPlan) ? new TextLocalisedClause(R$string.freelancer_cashback_details_upsell_plans_plus_plan, null, null, 14) : new TextLocalisedClause(R$string.freelancer_cashback_details_upsell_plans_standard_plan, null, null, 14);
    }
}
