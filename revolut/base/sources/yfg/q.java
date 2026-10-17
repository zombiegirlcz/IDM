package yfg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0019"}, d2 = {"Lyfg/q;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "h", "title", "c", "g", "subtitle", "d", "f", "points", "assetUrl", "icon", "Lyfg/q$a;", "Lyfg/q$a;", "()Lyfg/q$a;", "departureLocation", "arrivalLocation", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("points")
    @NotNull
    private final String points;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("assetUrl")
    @NotNull
    private final String assetUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("icon")
    @NotNull
    private final String icon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("departureLocation")
    @NotNull
    private final a departureLocation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("arrivalLocation")
    @NotNull
    private final a arrivalLocation;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lyfg/q$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "cityName", "b", "countryCode", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("cityName")
        @NotNull
        private final String cityName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("countryCode")
        @NotNull
        private final String countryCode;

        public a(String cityName, String countryCode) {
            Intrinsics.checkNotNullParameter(cityName, "cityName");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.cityName = cityName;
            this.countryCode = countryCode;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCityName() {
            return this.cityName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.cityName, aVar.cityName) && Intrinsics.f(this.countryCode, aVar.countryCode);
        }

        public final int hashCode() {
            return this.countryCode.hashCode() + (this.cityName.hashCode() * 31);
        }
    }

    public q(String id10, String title, String subtitle, String points, String assetUrl, String icon, a departureLocation, a arrivalLocation) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(departureLocation, "departureLocation");
        Intrinsics.checkNotNullParameter(arrivalLocation, "arrivalLocation");
        this.id = id10;
        this.title = title;
        this.subtitle = subtitle;
        this.points = points;
        this.assetUrl = assetUrl;
        this.icon = icon;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getArrivalLocation() {
        return this.arrivalLocation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAssetUrl() {
        return this.assetUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getDepartureLocation() {
        return this.departureLocation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.id, qVar.id) && Intrinsics.f(this.title, qVar.title) && Intrinsics.f(this.subtitle, qVar.subtitle) && Intrinsics.f(this.points, qVar.points) && Intrinsics.f(this.assetUrl, qVar.assetUrl) && Intrinsics.f(this.icon, qVar.icon) && Intrinsics.f(this.departureLocation, qVar.departureLocation) && Intrinsics.f(this.arrivalLocation, qVar.arrivalLocation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPoints() {
        return this.points;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.arrivalLocation.hashCode() + ((this.departureLocation.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.points), 31, this.assetUrl), 31, this.icon)) * 31);
    }
}
