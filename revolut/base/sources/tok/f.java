package tok;

import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$BottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanWaitlistLayout$BottomSheet f273236a;

    public f(PricingPlanWaitlistLayout$BottomSheet data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f273236a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f273236a, ((f) obj2).f273236a);
    }

    public final int hashCode() {
        return this.f273236a.hashCode();
    }
}
