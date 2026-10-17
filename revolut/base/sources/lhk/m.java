package lhk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanSubscription f195359a;

    public m(PricingPlanSubscription subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f195359a = subscription;
    }

    @Override // lhk.n
    public final PricingPlanSubscription a() {
        return this.f195359a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f195359a, ((m) obj2).f195359a);
    }

    public final int hashCode() {
        return this.f195359a.hashCode();
    }
}
