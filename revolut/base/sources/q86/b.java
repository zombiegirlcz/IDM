package q86;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0015"}, d2 = {"Lq86/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "postcode", "b", "country", "c", "f", "region", "d", "city", "", "D", "()D", "lat", "lon", "feature_device_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("postcode")
    @NotNull
    private final String postcode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("region")
    @NotNull
    private final String region;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("city")
    @NotNull
    private final String city;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("lat")
    private final double lat;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("lon")
    private final double lon;

    public b(double d, double d5, String postcode, String country, String region, String city) {
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(city, "city");
        this.postcode = postcode;
        this.country = country;
        this.region = region;
        this.city = city;
        this.lat = d;
        this.lon = d5;
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
    public final double getLat() {
        return this.lat;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.postcode, bVar.postcode) && Intrinsics.f(this.country, bVar.country) && Intrinsics.f(this.region, bVar.region) && Intrinsics.f(this.city, bVar.city) && Double.compare(this.lat, bVar.lat) == 0 && Double.compare(this.lon, bVar.lon) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    public final int hashCode() {
        return Double.hashCode(this.lon) + m72.b.c(p.a.c(p.a.c(p.a.c(this.postcode.hashCode() * 31, 31, this.country), 31, this.region), 31, this.city), this.lat, 31);
    }
}
