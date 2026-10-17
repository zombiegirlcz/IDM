package igk;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f161281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanOffer f161282b;

    public z(hha.d selectedPlan, PricingPlanOffer pricingPlanOffer) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        this.f161281a = selectedPlan;
        this.f161282b = pricingPlanOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f161281a, zVar.f161281a) && Intrinsics.f(this.f161282b, zVar.f161282b);
    }

    public final int hashCode() {
        int iHashCode = this.f161281a.hashCode() * 31;
        PricingPlanOffer pricingPlanOffer = this.f161282b;
        return iHashCode + (pricingPlanOffer == null ? 0 : pricingPlanOffer.hashCode());
    }
}
