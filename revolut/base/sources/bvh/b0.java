package bvh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u001e"}, d2 = {"Lbvh/b0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "country", "j", "streetLine1", "c", "k", "streetLine2", "d", "i", "street", "e", "l", "streetType", "f", "houseNumber", "g", "houseName", "h", "flat", "city", "region", "postcode", "neighbourhood", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    private final String country;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetLine1")
    private final String streetLine1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetLine2")
    private final String streetLine2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("street")
    private final String street;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("streetType")
    private final String streetType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("houseNumber")
    private final String houseNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("houseName")
    private final String houseName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("flat")
    private final String flat;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("city")
    private final String city;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("region")
    private final String region;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("postcode")
    private final String postcode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("neighbourhood")
    private final String neighbourhood;

    public b0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.country = str;
        this.streetLine1 = str2;
        this.streetLine2 = str3;
        this.street = str4;
        this.streetType = str5;
        this.houseNumber = str6;
        this.houseName = str7;
        this.flat = str8;
        this.city = str9;
        this.region = str10;
        this.postcode = str11;
        this.neighbourhood = str12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFlat() {
        return this.flat;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getHouseName() {
        return this.houseName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getHouseNumber() {
        return this.houseNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.country, b0Var.country) && Intrinsics.f(this.streetLine1, b0Var.streetLine1) && Intrinsics.f(this.streetLine2, b0Var.streetLine2) && Intrinsics.f(this.street, b0Var.street) && Intrinsics.f(this.streetType, b0Var.streetType) && Intrinsics.f(this.houseNumber, b0Var.houseNumber) && Intrinsics.f(this.houseName, b0Var.houseName) && Intrinsics.f(this.flat, b0Var.flat) && Intrinsics.f(this.city, b0Var.city) && Intrinsics.f(this.region, b0Var.region) && Intrinsics.f(this.postcode, b0Var.postcode) && Intrinsics.f(this.neighbourhood, b0Var.neighbourhood);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getNeighbourhood() {
        return this.neighbourhood;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    public final int hashCode() {
        String str = this.country;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.streetLine1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.streetLine2;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.street;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.streetType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.houseNumber;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.houseName;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.flat;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.city;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.region;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.postcode;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.neighbourhood;
        return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getStreetLine1() {
        return this.streetLine1;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getStreetLine2() {
        return this.streetLine2;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getStreetType() {
        return this.streetType;
    }
}
