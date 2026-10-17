package u07;

import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerTaxProfile f276083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f276084c;
    public final wi0.b d;

    public j(String str, FreelancerTaxProfile freelancerTaxProfile, LinkedHashSet enlistedTaxTypes, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(enlistedTaxTypes, "enlistedTaxTypes");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f276082a = str;
        this.f276083b = freelancerTaxProfile;
        this.f276084c = enlistedTaxTypes;
        this.d = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f276082a, jVar.f276082a) && Intrinsics.f(this.f276083b, jVar.f276083b) && this.f276084c.equals(jVar.f276084c) && this.d.equals(jVar.d);
    }

    public final int hashCode() {
        String str = this.f276082a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        FreelancerTaxProfile freelancerTaxProfile = this.f276083b;
        return this.d.f297794a.hashCode() + ((this.f276084c.hashCode() + ((iHashCode + (freelancerTaxProfile != null ? freelancerTaxProfile.hashCode() : 0)) * 31)) * 31);
    }
}
