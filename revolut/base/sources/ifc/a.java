package ifc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Lifc/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getAddressLine1", "addressLine1", "b", "getAddressLine2", "addressLine2", "c", "getRegion", "region", "d", "getCity", "city", "e", "getPostcode", "postcode", "f", "getCountry", "country", "g", "getFullAddress", "fullAddress", "feature_revpro_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetLine1")
    private final String addressLine1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetLine2")
    private final String addressLine2;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("region")
    private final String region;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("city")
    private final String city;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("postcode")
    private final String postcode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("fullAddress")
    private final String fullAddress;

    public a(String str, String str2, String str3, String str4, String str5, String country, String str6) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.region = str3;
        this.city = str4;
        this.postcode = str5;
        this.country = country;
        this.fullAddress = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.addressLine1, aVar.addressLine1) && Intrinsics.f(this.addressLine2, aVar.addressLine2) && Intrinsics.f(this.region, aVar.region) && Intrinsics.f(this.city, aVar.city) && Intrinsics.f(this.postcode, aVar.postcode) && Intrinsics.f(this.country, aVar.country) && Intrinsics.f(this.fullAddress, aVar.fullAddress);
    }

    public final int hashCode() {
        String str = this.addressLine1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressLine2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.region;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postcode;
        int iC = p.a.c((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.country);
        String str6 = this.fullAddress;
        return iC + (str6 != null ? str6.hashCode() : 0);
    }
}
