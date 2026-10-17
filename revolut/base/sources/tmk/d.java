package tmk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanAction f272232a;

    public d(PricingPlanAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f272232a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f272232a, ((d) obj2).f272232a);
    }

    public final int hashCode() {
        return this.f272232a.hashCode();
    }
}
