package phk;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f236315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanOffer f236316c;
    public final dj0.d d;

    public a(PricingPlanOffer pricingPlanOffer, dj0.d dVar, hha.i selectedBilling, String selectedPlanId) {
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
        this.f236314a = selectedPlanId;
        this.f236315b = selectedBilling;
        this.f236316c = pricingPlanOffer;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f236314a, aVar.f236314a) && this.f236315b == aVar.f236315b && Intrinsics.f(this.f236316c, aVar.f236316c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f236315b.hashCode() + (this.f236314a.hashCode() * 31)) * 31;
        PricingPlanOffer pricingPlanOffer = this.f236316c;
        int iHashCode2 = (iHashCode + (pricingPlanOffer == null ? 0 : pricingPlanOffer.hashCode())) * 31;
        dj0.d dVar = this.d;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
