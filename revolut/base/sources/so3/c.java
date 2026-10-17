package so3;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\u0005R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\u0005R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u0006\u0010\u0005R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\r\u0010\u0005R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0012\u0010\u0005R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\n\u0010\u0005¨\u0006\u0016"}, d2 = {"Lso3/c;", "Lso3/a;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "streetLine1", "b", "f", "streetLine2", "c", "d", "region", "city", "postalCode", "getCountry", "country", "g", "neighborhood", "feature_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c implements a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetLine1")
    private final String streetLine1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetLine2")
    private final String streetLine2;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("region")
    private final String region;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("city")
    private final String city;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("postcode")
    private final String postalCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("country")
    private final String country;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("neighbourhood")
    private final String neighborhood;

    public c() {
        this(null, null, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNeighborhood() {
        return this.neighborhood;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStreetLine1() {
        return this.streetLine1;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.streetLine1, cVar.streetLine1) && Intrinsics.f(this.streetLine2, cVar.streetLine2) && Intrinsics.f(this.region, cVar.region) && Intrinsics.f(this.city, cVar.city) && Intrinsics.f(this.postalCode, cVar.postalCode) && Intrinsics.f(this.country, cVar.country) && Intrinsics.f(this.neighborhood, cVar.neighborhood);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStreetLine2() {
        return this.streetLine2;
    }

    public final String getCountry() {
        return this.country;
    }

    public final int hashCode() {
        String str = this.streetLine1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.streetLine2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.region;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.country;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.neighborhood;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.streetLine1 = str;
        this.streetLine2 = str2;
        this.region = str3;
        this.city = str4;
        this.postalCode = str5;
        this.country = str6;
        this.neighborhood = str7;
    }
}
