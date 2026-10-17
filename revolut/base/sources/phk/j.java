package phk;

import aii.r;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.i f236326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanOffer f236327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f236328c;

    public j(hha.i selectedBilling, PricingPlanOffer pricingPlanOffer, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
        this.f236326a = selectedBilling;
        this.f236327b = pricingPlanOffer;
        this.f236328c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f236326a == jVar.f236326a && Intrinsics.f(this.f236327b, jVar.f236327b) && Intrinsics.f(this.f236328c, jVar.f236328c);
    }

    public final int hashCode() {
        int iHashCode = this.f236326a.hashCode() * 31;
        PricingPlanOffer pricingPlanOffer = this.f236327b;
        int iHashCode2 = (iHashCode + (pricingPlanOffer == null ? 0 : pricingPlanOffer.hashCode())) * 31;
        dj0.d dVar = this.f236328c;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
