package xfg;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u000b\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\f"}, d2 = {"Lxfg/o;", "", "", "toString", "()Ljava/lang/String;", "", "Lxfg/o$b;", "a", "Ljava/util/List;", "()Ljava/util/List;", "cities", "b", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("cities")
    @NotNull
    private final List<b> cities;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lxfg/o$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "iataCode", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("iataCode")
        @NotNull
        private final String iataCode;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIataCode() {
            return this.iataCode;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.iataCode, ((a) obj2).iataCode);
        }

        public final int hashCode() {
            return this.iataCode.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lxfg/o$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "city", "c", "country", "d", "countryCode", "", "Lxfg/o$a;", "Ljava/util/List;", "()Ljava/util/List;", "airports", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("city")
        @NotNull
        private final String city;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("country")
        @NotNull
        private final String country;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("countryCode")
        @NotNull
        private final String countryCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("airports")
        @NotNull
        private final List<a> airports;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getAirports() {
            return this.airports;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.city, bVar.city) && Intrinsics.f(this.country, bVar.country) && Intrinsics.f(this.countryCode, bVar.countryCode) && Intrinsics.f(this.airports, bVar.airports);
        }

        public final int hashCode() {
            return this.airports.hashCode() + p.a.c(p.a.c(this.city.hashCode() * 31, 31, this.country), 31, this.countryCode);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCities() {
        return this.cities;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.cities, ((o) obj2).cities);
    }

    public final int hashCode() {
        return this.cities.hashCode();
    }
}
