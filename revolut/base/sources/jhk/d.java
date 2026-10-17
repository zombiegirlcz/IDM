package jhk;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f174283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f174284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanOffer f174285c;

    public d(hha.d selectedPlan, hha.i iVar, PricingPlanOffer pricingPlanOffer) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        this.f174283a = selectedPlan;
        this.f174284b = iVar;
        this.f174285c = pricingPlanOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f174283a, dVar.f174283a) && this.f174284b == dVar.f174284b && Intrinsics.f(this.f174285c, dVar.f174285c);
    }

    public final int hashCode() {
        int iHashCode = this.f174283a.hashCode() * 31;
        hha.i iVar = this.f174284b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        PricingPlanOffer pricingPlanOffer = this.f174285c;
        return iHashCode2 + (pricingPlanOffer != null ? pricingPlanOffer.hashCode() : 0);
    }
}
