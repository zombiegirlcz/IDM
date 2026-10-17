package igk;

import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanGiftSending$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanGiftSending$InputData f161261a;

    public n(PricingPlanGiftSending$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f161261a = inputData;
    }

    public final PricingPlanGiftSending$InputData b() {
        return this.f161261a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f161261a, ((n) obj2).f161261a);
    }

    public final int hashCode() {
        return this.f161261a.hashCode();
    }
}
