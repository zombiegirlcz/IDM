package ds6;

import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubVatSummary f117256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerTaxProfile f117257b;

    public z(TaxHubVatSummary vatSummary, FreelancerTaxProfile vatProfile) {
        Intrinsics.checkNotNullParameter(vatSummary, "vatSummary");
        Intrinsics.checkNotNullParameter(vatProfile, "vatProfile");
        this.f117256a = vatSummary;
        this.f117257b = vatProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f117256a, zVar.f117256a) && Intrinsics.f(this.f117257b, zVar.f117257b);
    }

    public final int hashCode() {
        return this.f117257b.hashCode() + (this.f117256a.hashCode() * 31);
    }
}
