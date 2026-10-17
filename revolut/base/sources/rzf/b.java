package rzf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lrzf/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "streetLine1", "b", "f", "streetLine2", "c", "d", "region", "city", "country", "postcode", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetLine1")
    @NotNull
    private final String streetLine1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetLine2")
    @NotNull
    private final String streetLine2;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("region")
    @NotNull
    private final String region;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("city")
    @NotNull
    private final String city;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("postcode")
    @NotNull
    private final String postcode;

    public b(String streetLine1, String streetLine2, String region, String city, String country, String postcode) {
        Intrinsics.checkNotNullParameter(streetLine1, "streetLine1");
        Intrinsics.checkNotNullParameter(streetLine2, "streetLine2");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        this.streetLine1 = streetLine1;
        this.streetLine2 = streetLine2;
        this.region = region;
        this.city = city;
        this.country = country;
        this.postcode = postcode;
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
    public final String getPostcode() {
        return this.postcode;
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
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.streetLine1, bVar.streetLine1) && Intrinsics.f(this.streetLine2, bVar.streetLine2) && Intrinsics.f(this.region, bVar.region) && Intrinsics.f(this.city, bVar.city) && Intrinsics.f(this.country, bVar.country) && Intrinsics.f(this.postcode, bVar.postcode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStreetLine2() {
        return this.streetLine2;
    }

    public final int hashCode() {
        return this.postcode.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.streetLine1.hashCode() * 31, 31, this.streetLine2), 31, this.region), 31, this.city), 31, this.country);
    }
}
