package yfg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class h {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lyfg/h$a;", "Lyfg/h;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "iataCode", "b", "city", "c", "country", "countryCode", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("iataCode")
        @NotNull
        private final String iataCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("city")
        @NotNull
        private final String city;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("country")
        @NotNull
        private final String country;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("countryCode")
        @NotNull
        private final String countryCode;

        public a(String iataCode, String city, String country, String countryCode) {
            Intrinsics.checkNotNullParameter(iataCode, "iataCode");
            Intrinsics.checkNotNullParameter(city, "city");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.iataCode = iataCode;
            this.city = city;
            this.country = country;
            this.countryCode = countryCode;
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
        public final String getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getIataCode() {
            return this.iataCode;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.iataCode, aVar.iataCode) && Intrinsics.f(this.city, aVar.city) && Intrinsics.f(this.country, aVar.country) && Intrinsics.f(this.countryCode, aVar.countryCode);
        }

        public final int hashCode() {
            return this.countryCode.hashCode() + p.a.c(p.a.c(this.iataCode.hashCode() * 31, 31, this.city), 31, this.country);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lyfg/h$b;", "Lyfg/h;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "city", "b", "country", "c", "countryCode", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends h {

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

        public b(String city, String country, String countryCode) {
            Intrinsics.checkNotNullParameter(city, "city");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.city = city;
            this.country = country;
            this.countryCode = countryCode;
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
            return Intrinsics.f(this.city, bVar.city) && Intrinsics.f(this.country, bVar.country) && Intrinsics.f(this.countryCode, bVar.countryCode);
        }

        public final int hashCode() {
            return this.countryCode.hashCode() + p.a.c(this.city.hashCode() * 31, 31, this.country);
        }
    }

    private h() {
    }
}
