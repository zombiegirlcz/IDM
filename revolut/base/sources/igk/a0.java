package igk;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f161232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f161233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanOffer f161234c;

    public a0(hha.d selectedPlan, hha.i selectedBilling, PricingPlanOffer pricingPlanOffer) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
        this.f161232a = selectedPlan;
        this.f161233b = selectedBilling;
        this.f161234c = pricingPlanOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f161232a, a0Var.f161232a) && this.f161233b == a0Var.f161233b && Intrinsics.f(this.f161234c, a0Var.f161234c);
    }

    public final int hashCode() {
        int iHashCode = (this.f161233b.hashCode() + (this.f161232a.hashCode() * 31)) * 31;
        PricingPlanOffer pricingPlanOffer = this.f161234c;
        return iHashCode + (pricingPlanOffer == null ? 0 : pricingPlanOffer.hashCode());
    }
}
