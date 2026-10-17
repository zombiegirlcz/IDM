package igk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanBottomSheetDeeplinkNavigation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends PlanBottomSheetDeeplinkNavigation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanBottomSheetDescriptor f161241a;

    public d(PricingPlanBottomSheetDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f161241a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f161241a, ((d) obj2).f161241a);
    }

    public final int hashCode() {
        return this.f161241a.hashCode();
    }
}
