package phk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanAction.Common f236317a;

    public b(PricingPlanAction.Common action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f236317a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f236317a, ((b) obj2).f236317a);
    }

    public final int hashCode() {
        return this.f236317a.hashCode();
    }
}
