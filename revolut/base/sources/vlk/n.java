package vlk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanAction f290490a;

    public n(PricingPlanAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f290490a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f290490a, ((n) obj2).f290490a);
    }

    public final int hashCode() {
        return this.f290490a.hashCode();
    }
}
