package umk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanAction f281324a;

    public g(PricingPlanAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f281324a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f281324a, ((g) obj2).f281324a);
    }

    public final int hashCode() {
        return this.f281324a.hashCode();
    }
}
