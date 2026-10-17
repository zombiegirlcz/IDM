package sra;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0019"}, d2 = {"Lsra/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "lastFour", "b", "billingCurrency", "c", "h", "scheme", "d", "e", "issuerName", "issuerCountry", "Lso3/c;", "Lso3/c;", "()Lso3/c;", "address", "g", "city", "logoUrl", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastFour")
    @NotNull
    private final String lastFour;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingCurrency")
    @NotNull
    private final String billingCurrency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheme")
    @NotNull
    private final String scheme;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("issuerName")
    @NotNull
    private final String issuerName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("issuerCountry")
    @NotNull
    private final String issuerCountry;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("address")
    private final so3.c address;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("city")
    private final String city;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("logoUrl")
    private final String logoUrl;

    public a(String lastFour, String billingCurrency, String scheme, String issuerName, String issuerCountry, so3.c cVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(billingCurrency, "billingCurrency");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(issuerName, "issuerName");
        Intrinsics.checkNotNullParameter(issuerCountry, "issuerCountry");
        this.lastFour = lastFour;
        this.billingCurrency = billingCurrency;
        this.scheme = scheme;
        this.issuerName = issuerName;
        this.issuerCountry = issuerCountry;
        this.address = cVar;
        this.city = str;
        this.logoUrl = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final so3.c getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBillingCurrency() {
        return this.billingCurrency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIssuerCountry() {
        return this.issuerCountry;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIssuerName() {
        return this.issuerName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.lastFour, aVar.lastFour) && Intrinsics.f(this.billingCurrency, aVar.billingCurrency) && Intrinsics.f(this.scheme, aVar.scheme) && Intrinsics.f(this.issuerName, aVar.issuerName) && Intrinsics.f(this.issuerCountry, aVar.issuerCountry) && Intrinsics.f(this.address, aVar.address) && Intrinsics.f(this.city, aVar.city) && Intrinsics.f(this.logoUrl, aVar.logoUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.lastFour.hashCode() * 31, 31, this.billingCurrency), 31, this.scheme), 31, this.issuerName), 31, this.issuerCountry);
        so3.c cVar = this.address;
        int iHashCode = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.city;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logoUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
