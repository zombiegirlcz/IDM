package sjk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanSubscription f263738a;

    public d(PricingPlanSubscription subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f263738a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f263738a, ((d) obj2).f263738a);
    }

    public final int hashCode() {
        return this.f263738a.hashCode();
    }
}
