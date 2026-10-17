package igk;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f161238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f161239c;
    public final PricingPlanOffer d;

    public c(PricingPlanOffer pricingPlanOffer, dj0.d dVar, hha.i selectedBilling, String selectedPlanId) {
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
        this.f161237a = selectedPlanId;
        this.f161238b = selectedBilling;
        this.f161239c = dVar;
        this.d = pricingPlanOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f161237a, cVar.f161237a) && this.f161238b == cVar.f161238b && Intrinsics.f(this.f161239c, cVar.f161239c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f161238b.hashCode() + (this.f161237a.hashCode() * 31)) * 31;
        dj0.d dVar = this.f161239c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        PricingPlanOffer pricingPlanOffer = this.d;
        return iHashCode2 + (pricingPlanOffer != null ? pricingPlanOffer.hashCode() : 0);
    }
}
