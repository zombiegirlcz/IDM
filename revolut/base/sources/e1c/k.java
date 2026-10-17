package e1c;

import hha.z0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f121953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f121954b;

    public k(hha.d pricingPlan, z0 loyaltyEarningRate) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(loyaltyEarningRate, "loyaltyEarningRate");
        this.f121953a = pricingPlan;
        this.f121954b = loyaltyEarningRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f121953a, kVar.f121953a) && Intrinsics.f(this.f121954b, kVar.f121954b);
    }

    public final int hashCode() {
        return this.f121954b.hashCode() + (this.f121953a.hashCode() * 31);
    }
}
