package yna;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f315368a;

    public q(w pricingPlanData) {
        Intrinsics.checkNotNullParameter(pricingPlanData, "pricingPlanData");
        this.f315368a = pricingPlanData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f315368a, ((q) obj2).f315368a);
    }

    public final int hashCode() {
        return this.f315368a.hashCode();
    }
}
