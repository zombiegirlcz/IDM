package u37;

import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds6.i f276797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f276798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FreelancerTaxProfile f276799c;

    public l(ds6.i taxSchedulingOptions, wi0.b countryCode, FreelancerTaxProfile freelancerTaxProfile) {
        Intrinsics.checkNotNullParameter(taxSchedulingOptions, "taxSchedulingOptions");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f276797a = taxSchedulingOptions;
        this.f276798b = countryCode;
        this.f276799c = freelancerTaxProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f276797a, lVar.f276797a) && Intrinsics.f(this.f276798b, lVar.f276798b) && Intrinsics.f(this.f276799c, lVar.f276799c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f276797a.hashCode() * 31, 31, this.f276798b.f297794a);
        FreelancerTaxProfile freelancerTaxProfile = this.f276799c;
        return iC + (freelancerTaxProfile == null ? 0 : freelancerTaxProfile.hashCode());
    }
}
