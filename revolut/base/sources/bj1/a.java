package bj1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\"\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004¨\u0006$"}, d2 = {"Lbj1/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCountry", "country", "b", "getPostcode", "postcode", "c", "getStreetLine1", "streetLine1", "d", "getStreetLine2", "streetLine2", "e", "getCity", "city", "f", "getRegion", "region", "g", "getStreetType", "streetType", "h", "getStreet", "street", "i", "getHouseNumber", "houseNumber", "j", "getNeighborhood", "neighborhood", "feature_address_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("postcode")
    private final String postcode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetLine1")
    private final String streetLine1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("streetLine2")
    private final String streetLine2;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("city")
    private final String city;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("region")
    private final String region;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetType")
    private final String streetType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("street")
    private final String street;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("houseNumber")
    private final String houseNumber;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("neighbourhood")
    private final String neighborhood;

    public a(String country, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.country = country;
        this.postcode = str;
        this.streetLine1 = str2;
        this.streetLine2 = str3;
        this.city = str4;
        this.region = str5;
        this.streetType = str6;
        this.street = str7;
        this.houseNumber = str8;
        this.neighborhood = str9;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.country, aVar.country) && Intrinsics.f(this.postcode, aVar.postcode) && Intrinsics.f(this.streetLine1, aVar.streetLine1) && Intrinsics.f(this.streetLine2, aVar.streetLine2) && Intrinsics.f(this.city, aVar.city) && Intrinsics.f(this.region, aVar.region) && Intrinsics.f(this.streetType, aVar.streetType) && Intrinsics.f(this.street, aVar.street) && Intrinsics.f(this.houseNumber, aVar.houseNumber) && Intrinsics.f(this.neighborhood, aVar.neighborhood);
    }

    public final int hashCode() {
        int iHashCode = this.country.hashCode() * 31;
        String str = this.postcode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.streetLine1;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.streetLine2;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.region;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.streetType;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.street;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.houseNumber;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.neighborhood;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }
}
