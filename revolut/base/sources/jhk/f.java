package jhk;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f174288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f174289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanOffer f174290c;

    public f(hha.d selectedPlan, hha.i selectedBilling, PricingPlanOffer pricingPlanOffer) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
        this.f174288a = selectedPlan;
        this.f174289b = selectedBilling;
        this.f174290c = pricingPlanOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f174288a, fVar.f174288a) && this.f174289b == fVar.f174289b && Intrinsics.f(this.f174290c, fVar.f174290c);
    }

    public final int hashCode() {
        int iHashCode = (this.f174289b.hashCode() + (this.f174288a.hashCode() * 31)) * 31;
        PricingPlanOffer pricingPlanOffer = this.f174290c;
        return iHashCode + (pricingPlanOffer == null ? 0 : pricingPlanOffer.hashCode());
    }
}
