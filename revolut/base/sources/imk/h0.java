package imk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 extends com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanOfferPrompt.Available f162515a;

    public h0(PricingPlanOfferPrompt.Available offer) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        this.f162515a = offer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f162515a, ((h0) obj2).f162515a);
    }

    public final int hashCode() {
        return this.f162515a.f102847a.hashCode();
    }
}
