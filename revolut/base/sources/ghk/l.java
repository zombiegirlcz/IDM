package ghk;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f143965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f143966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanOffer f143967c;

    public l(hha.d selectedPlan, hha.i iVar, PricingPlanOffer pricingPlanOffer) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        this.f143965a = selectedPlan;
        this.f143966b = iVar;
        this.f143967c = pricingPlanOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f143965a, lVar.f143965a) && this.f143966b == lVar.f143966b && Intrinsics.f(this.f143967c, lVar.f143967c);
    }

    public final int hashCode() {
        int iHashCode = this.f143965a.hashCode() * 31;
        hha.i iVar = this.f143966b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        PricingPlanOffer pricingPlanOffer = this.f143967c;
        return iHashCode2 + (pricingPlanOffer != null ? pricingPlanOffer.hashCode() : 0);
    }
}
