package glk;

import com.revolut.feature.pricingplans.models.subscribe_info.PricingPlanSubscribeInfoIneligibilityReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanSubscribeInfoIneligibilityReason f144721a;

    public i(PricingPlanSubscribeInfoIneligibilityReason ineligibilityReason) {
        Intrinsics.checkNotNullParameter(ineligibilityReason, "ineligibilityReason");
        this.f144721a = ineligibilityReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f144721a == ((i) obj2).f144721a;
    }

    public final int hashCode() {
        return this.f144721a.hashCode();
    }
}
