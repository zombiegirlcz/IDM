package igk;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f161262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f161263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanOffer f161264c;

    public n0(hha.d plan, hha.i billing, PricingPlanOffer pricingPlanOffer) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(billing, "billing");
        this.f161262a = plan;
        this.f161263b = billing;
        this.f161264c = pricingPlanOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f161262a, n0Var.f161262a) && this.f161263b == n0Var.f161263b && Intrinsics.f(this.f161264c, n0Var.f161264c);
    }

    public final int hashCode() {
        int iHashCode = (this.f161263b.hashCode() + (this.f161262a.hashCode() * 31)) * 31;
        PricingPlanOffer pricingPlanOffer = this.f161264c;
        return iHashCode + (pricingPlanOffer == null ? 0 : pricingPlanOffer.hashCode());
    }
}
