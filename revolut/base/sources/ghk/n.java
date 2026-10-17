package ghk;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f143970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f143971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanOffer f143972c;

    public n(hha.d selectedPlan, hha.i iVar, PricingPlanOffer pricingPlanOffer) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        this.f143970a = selectedPlan;
        this.f143971b = iVar;
        this.f143972c = pricingPlanOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f143970a, nVar.f143970a) && this.f143971b == nVar.f143971b && Intrinsics.f(this.f143972c, nVar.f143972c);
    }

    public final int hashCode() {
        int iHashCode = this.f143970a.hashCode() * 31;
        hha.i iVar = this.f143971b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        PricingPlanOffer pricingPlanOffer = this.f143972c;
        return iHashCode2 + (pricingPlanOffer != null ? pricingPlanOffer.hashCode() : 0);
    }
}
