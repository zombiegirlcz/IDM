package nfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f215074b;

    public y0(String currentPricingPlanId, x0 filter) {
        Intrinsics.checkNotNullParameter(currentPricingPlanId, "currentPricingPlanId");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f215073a = currentPricingPlanId;
        this.f215074b = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f215073a, y0Var.f215073a) && Intrinsics.f(this.f215074b, y0Var.f215074b);
    }

    public final int hashCode() {
        return this.f215074b.hashCode() + (this.f215073a.hashCode() * 31);
    }
}
