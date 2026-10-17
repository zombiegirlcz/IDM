package xme;

import com.revolut.feature.tax_residency.api.exemption.model.PartnerInformation;
import com.revolut.feature.tax_residency.api.exemption.model.ValidityPeriod;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f307226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ValidityPeriod f307227c;
    public final PartnerInformation d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f307228g;

    public c(String code, String taxYear, ValidityPeriod validityPeriod, PartnerInformation partnerInformation, dj0.d utilisedAmount, dj0.d currentLimit, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(taxYear, "taxYear");
        Intrinsics.checkNotNullParameter(validityPeriod, "validityPeriod");
        Intrinsics.checkNotNullParameter(utilisedAmount, "utilisedAmount");
        Intrinsics.checkNotNullParameter(currentLimit, "currentLimit");
        this.f307225a = code;
        this.f307226b = taxYear;
        this.f307227c = validityPeriod;
        this.d = partnerInformation;
        this.e = utilisedAmount;
        this.f = currentLimit;
        this.f307228g = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f307225a, cVar.f307225a) && Intrinsics.f(this.f307226b, cVar.f307226b) && Intrinsics.f(this.f307227c, cVar.f307227c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f307228g, cVar.f307228g);
    }

    public final int hashCode() {
        int iHashCode = (this.f307227c.hashCode() + p.a.c(this.f307225a.hashCode() * 31, 31, this.f307226b)) * 31;
        PartnerInformation partnerInformation = this.d;
        int iC = v7.c(v7.c((iHashCode + (partnerInformation == null ? 0 : partnerInformation.hashCode())) * 31, 31, this.e), 31, this.f);
        String str = this.f307228g;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
