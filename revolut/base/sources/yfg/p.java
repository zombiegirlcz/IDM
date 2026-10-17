package yfg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lyfg/p;", "", "", "toString", "()Ljava/lang/String;", "Lyfg/p$a;", "a", "Lyfg/p$a;", "b", "()Lyfg/p$a;", "origin", "destination", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("origin")
    private final a origin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("destination")
    private final a destination;

    public static abstract class a {

        /* JADX INFO: renamed from: yfg.p$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lyfg/p$a$a;", "Lyfg/p$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "city", "b", "iataCode", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1744a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("city")
            @NotNull
            private final String city;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("iataCode")
            @NotNull
            private final String iataCode;

            public C1744a(String city, String iataCode) {
                Intrinsics.checkNotNullParameter(city, "city");
                Intrinsics.checkNotNullParameter(iataCode, "iataCode");
                this.city = city;
                this.iataCode = iataCode;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCity() {
                return this.city;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getIataCode() {
                return this.iataCode;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1744a)) {
                    return false;
                }
                C1744a c1744a = (C1744a) obj2;
                return Intrinsics.f(this.city, c1744a.city) && Intrinsics.f(this.iataCode, c1744a.iataCode);
            }

            public final int hashCode() {
                return this.iataCode.hashCode() + (this.city.hashCode() * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lyfg/p$a$b;", "Lyfg/p$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "city", "b", "countryCode", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("city")
            @NotNull
            private final String city;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("countryCode")
            @NotNull
            private final String countryCode;

            public b(String city, String countryCode) {
                Intrinsics.checkNotNullParameter(city, "city");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                this.city = city;
                this.countryCode = countryCode;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCity() {
                return this.city;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
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
                return Intrinsics.f(this.city, bVar.city) && Intrinsics.f(this.countryCode, bVar.countryCode);
            }

            public final int hashCode() {
                return this.countryCode.hashCode() + (this.city.hashCode() * 31);
            }
        }

        private a() {
        }
    }

    public p(a aVar, a aVar2) {
        this.origin = aVar;
        this.destination = aVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getOrigin() {
        return this.origin;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.origin, pVar.origin) && Intrinsics.f(this.destination, pVar.destination);
    }

    public final int hashCode() {
        a aVar = this.origin;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.destination;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
