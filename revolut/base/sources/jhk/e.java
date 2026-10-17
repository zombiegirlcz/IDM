package jhk;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f174286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanOffer f174287b;

    public e(hha.d selectedPlan, PricingPlanOffer pricingPlanOffer) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        this.f174286a = selectedPlan;
        this.f174287b = pricingPlanOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f174286a, eVar.f174286a) && Intrinsics.f(this.f174287b, eVar.f174287b);
    }

    public final int hashCode() {
        int iHashCode = this.f174286a.hashCode() * 31;
        PricingPlanOffer pricingPlanOffer = this.f174287b;
        return iHashCode + (pricingPlanOffer == null ? 0 : pricingPlanOffer.hashCode());
    }
}
