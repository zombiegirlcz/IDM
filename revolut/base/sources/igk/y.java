package igk;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f161278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f161279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanOffer f161280c;

    public y(hha.d selectedPlan, hha.i iVar, PricingPlanOffer pricingPlanOffer) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        this.f161278a = selectedPlan;
        this.f161279b = iVar;
        this.f161280c = pricingPlanOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f161278a, yVar.f161278a) && this.f161279b == yVar.f161279b && Intrinsics.f(this.f161280c, yVar.f161280c);
    }

    public final int hashCode() {
        int iHashCode = this.f161278a.hashCode() * 31;
        hha.i iVar = this.f161279b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        PricingPlanOffer pricingPlanOffer = this.f161280c;
        return iHashCode2 + (pricingPlanOffer != null ? pricingPlanOffer.hashCode() : 0);
    }
}
