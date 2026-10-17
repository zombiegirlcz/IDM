package pfk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanSubscription f235705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f235706b;

    public w0(PricingPlanSubscription subscription, List plans) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f235705a = subscription;
        this.f235706b = plans;
    }

    public final PricingPlanSubscription a() {
        return this.f235705a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.f235705a, w0Var.f235705a) && Intrinsics.f(this.f235706b, w0Var.f235706b);
    }

    public final int hashCode() {
        return this.f235706b.hashCode() + (this.f235705a.hashCode() * 31);
    }
}
