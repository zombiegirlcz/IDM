package a49;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010&\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"La49/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "getLatitude", "()Ljava/lang/Double;", "latitude", "b", "getLongitude", "longitude", "c", "Ljava/lang/String;", "getCity", "city", "d", "getRegion", "region", "e", "getCountry", "country", "", "f", "Ljava/lang/Long;", "getTimestamp", "()Ljava/lang/Long;", "timestamp", "g", "getOwnerId", "ownerId", "", "h", "Z", "getBroadcast", "()Z", "broadcast", "feature_location_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("latitude")
    private final Double latitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("longitude")
    private final Double longitude;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("city")
    private final String city;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("region")
    private final String region;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("country")
    private final String country;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("timestamp")
    private final Long timestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("ownerId")
    private final String ownerId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("broadcast")
    private final boolean broadcast = false;

    public c(Double d, Double d5, String str, String str2, String str3, Long l2, String str4) {
        this.latitude = d;
        this.longitude = d5;
        this.city = str;
        this.region = str2;
        this.country = str3;
        this.timestamp = l2;
        this.ownerId = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.latitude, cVar.latitude) && Intrinsics.f(this.longitude, cVar.longitude) && Intrinsics.f(this.city, cVar.city) && Intrinsics.f(this.region, cVar.region) && Intrinsics.f(this.country, cVar.country) && Intrinsics.f(this.timestamp, cVar.timestamp) && Intrinsics.f(this.ownerId, cVar.ownerId) && this.broadcast == cVar.broadcast;
    }

    public final int hashCode() {
        Double d = this.latitude;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d5 = this.longitude;
        int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
        String str = this.city;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.region;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.timestamp;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.ownerId;
        return Boolean.hashCode(this.broadcast) + ((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
