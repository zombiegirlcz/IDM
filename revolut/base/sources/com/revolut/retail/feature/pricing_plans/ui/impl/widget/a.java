package com.revolut.retail.feature.pricing_plans.ui.impl.widget;

import com.revolut.feature.pricingplans.models.PricingPlanNextPlanInfo;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.impl.widget.PricingPlanHomeBanner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private a() {
    }

    public static PricingPlanHomeBanner.CancelScheduledDowngrade a(PricingPlanSubscription pricingPlanSubscription) {
        Intrinsics.checkNotNullParameter(pricingPlanSubscription, "<this>");
        String str = pricingPlanSubscription.f81129a.f152287a;
        PricingPlanNextPlanInfo pricingPlanNextPlanInfo = pricingPlanSubscription.f81134j;
        String str2 = pricingPlanNextPlanInfo != null ? pricingPlanNextPlanInfo.f81118a : null;
        if (str2 == null) {
            str2 = "";
        }
        return new PricingPlanHomeBanner.CancelScheduledDowngrade(str, pricingPlanNextPlanInfo != null ? pricingPlanNextPlanInfo.d : null, str2);
    }
}
