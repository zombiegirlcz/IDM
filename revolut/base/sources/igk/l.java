package igk;

import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanGiftBenefits$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanGiftBenefits$InputData f161255a;

    public l(PricingPlanGiftBenefits$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f161255a = inputData;
    }

    public final PricingPlanGiftBenefits$InputData b() {
        return this.f161255a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f161255a, ((l) obj2).f161255a);
    }

    public final int hashCode() {
        return this.f161255a.hashCode();
    }
}
