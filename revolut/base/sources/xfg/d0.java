package xfg;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u000b\u000e\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010&\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lxfg/d0;", "", "", "toString", "()Ljava/lang/String;", "Lxfg/d0$b;", "a", "Lxfg/d0$b;", "getOrigin", "()Lxfg/d0$b;", "origin", "b", "getDestination", "destination", "c", "Ljava/lang/String;", "getDepartureDateFrom", "departureDateFrom", "", "d", "Ljava/lang/Integer;", "getLimit", "()Ljava/lang/Integer;", "limit", "e", "getCursor", "cursor", "Lxfg/d0$c;", "f", "Lxfg/d0$c;", "getSortCriteria", "()Lxfg/d0$c;", "sortCriteria", "Lxfg/d0$a;", "g", "Lxfg/d0$a;", "getFilters", "()Lxfg/d0$a;", "filters", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("origin")
    @NotNull
    private final b origin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("destination")
    @NotNull
    private final b destination;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("departureDateFrom")
    @NotNull
    private final String departureDateFrom;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("limit")
    private final Integer limit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cursor")
    private final String cursor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("sort")
    private final c sortCriteria;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("filters")
    private final a filters;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b\u001b\u0010\tR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001e\u0010\t¨\u0006 "}, d2 = {"Lxfg/d0$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/Set;", "getNumberOfStops", "()Ljava/util/Set;", "numberOfStops", "b", "getCabin", "cabin", "Lxfg/s;", "c", "Lxfg/s;", "getPriceInPoints", "()Lxfg/s;", "priceInPoints", "Lxfg/r;", "d", "Lxfg/r;", "getFees", "()Lxfg/r;", "fees", "e", "getAirlines", "airlines", "f", "getMilesProgrammes", "milesProgrammes", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("numberOfStops")
        private final Set<String> numberOfStops;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("cabin")
        private final Set<String> cabin;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("priceInPoints")
        private final s priceInPoints;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("fees")
        private final r fees;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("airlines")
        private final Set<String> airlines;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("milesProgrammes")
        private final Set<String> milesProgrammes;

        public a(Set set, Set set2, s sVar, r rVar, Set set3, Set set4) {
            this.numberOfStops = set;
            this.cabin = set2;
            this.priceInPoints = sVar;
            this.fees = rVar;
            this.airlines = set3;
            this.milesProgrammes = set4;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.numberOfStops, aVar.numberOfStops) && Intrinsics.f(this.cabin, aVar.cabin) && Intrinsics.f(this.priceInPoints, aVar.priceInPoints) && Intrinsics.f(this.fees, aVar.fees) && Intrinsics.f(this.airlines, aVar.airlines) && Intrinsics.f(this.milesProgrammes, aVar.milesProgrammes);
        }

        public final int hashCode() {
            Set<String> set = this.numberOfStops;
            int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
            Set<String> set2 = this.cabin;
            int iHashCode2 = (iHashCode + (set2 == null ? 0 : set2.hashCode())) * 31;
            s sVar = this.priceInPoints;
            int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
            r rVar = this.fees;
            int iHashCode4 = (iHashCode3 + (rVar == null ? 0 : rVar.hashCode())) * 31;
            Set<String> set3 = this.airlines;
            int iHashCode5 = (iHashCode4 + (set3 == null ? 0 : set3.hashCode())) * 31;
            Set<String> set4 = this.milesProgrammes;
            return iHashCode5 + (set4 != null ? set4.hashCode() : 0);
        }
    }

    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lxfg/d0$b$a;", "Lxfg/d0$b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getIataCode", "iataCode", "Lxfg/e0;", "b", "Lxfg/e0;", "getType", "()Lxfg/e0;", "type", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("iataCode")
            @NotNull
            private final String iataCode;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final e0 type;

            public a(String iataCode) {
                Intrinsics.checkNotNullParameter(iataCode, "iataCode");
                this.iataCode = iataCode;
                this.type = e0.AIRPORT;
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

        /* JADX INFO: renamed from: xfg.d0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lxfg/d0$b$b;", "Lxfg/d0$b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCityName", "cityName", "b", "getCountryCode", "countryCode", "Lxfg/e0;", "c", "Lxfg/e0;", "getType", "()Lxfg/e0;", "type", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1696b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("cityName")
            @NotNull
            private final String cityName;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("countryCode")
            @NotNull
            private final String countryCode;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final e0 type;

            public C1696b(String cityName, String countryCode) {
                Intrinsics.checkNotNullParameter(cityName, "cityName");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                this.cityName = cityName;
                this.countryCode = countryCode;
                this.type = e0.CITY;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1696b)) {
                    return false;
                }
                C1696b c1696b = (C1696b) obj2;
                return Intrinsics.f(this.cityName, c1696b.cityName) && Intrinsics.f(this.countryCode, c1696b.countryCode);
            }

            public final int hashCode() {
                return this.countryCode.hashCode() + (this.cityName.hashCode() * 31);
            }
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lxfg/d0$c;", "", "", "toString", "()Ljava/lang/String;", "Lxfg/g0;", "a", "Lxfg/g0;", "getSortBy", "()Lxfg/g0;", "sortBy", "Lxfg/f0;", "b", "Lxfg/f0;", "getOrder", "()Lxfg/f0;", "order", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("sortBy")
        @NotNull
        private final g0 sortBy;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("order")
        @NotNull
        private final f0 order;

        public c(g0 sortBy, f0 order) {
            Intrinsics.checkNotNullParameter(sortBy, "sortBy");
            Intrinsics.checkNotNullParameter(order, "order");
            this.sortBy = sortBy;
            this.order = order;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return this.sortBy == cVar.sortBy && this.order == cVar.order;
        }

        public final int hashCode() {
            return this.order.hashCode() + (this.sortBy.hashCode() * 31);
        }
    }

    public d0(b origin, b destination, String departureDateFrom, Integer num, String str, c cVar, a aVar) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(departureDateFrom, "departureDateFrom");
        this.origin = origin;
        this.destination = destination;
        this.departureDateFrom = departureDateFrom;
        this.limit = num;
        this.cursor = str;
        this.sortCriteria = cVar;
        this.filters = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.origin, d0Var.origin) && Intrinsics.f(this.destination, d0Var.destination) && Intrinsics.f(this.departureDateFrom, d0Var.departureDateFrom) && Intrinsics.f(this.limit, d0Var.limit) && Intrinsics.f(this.cursor, d0Var.cursor) && Intrinsics.f(this.sortCriteria, d0Var.sortCriteria) && Intrinsics.f(this.filters, d0Var.filters);
    }

    public final int hashCode() {
        int iC = p.a.c((this.destination.hashCode() + (this.origin.hashCode() * 31)) * 31, 31, this.departureDateFrom);
        Integer num = this.limit;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.cursor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.sortCriteria;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        a aVar = this.filters;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }
}
