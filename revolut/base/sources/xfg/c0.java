package xfg;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010*\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b\u001d\u0010)R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004¨\u0006,"}, d2 = {"Lxfg/c0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "flightId", "", "Lxfg/c0$a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "airlines", "c", "d", "departsAt", "arrivesAt", "e", "departureIataCode", "f", "arrivalIataCode", "", "J", "k", "()J", "totalDuration", "", "h", "D", "i", "()D", "revpointsPrice", "Ljo3/a;", "Ljo3/a;", "j", "()Ljo3/a;", "taxesPrice", "", "I", "()I", "numberOfSegments", "externalPartner", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("flightId")
    @NotNull
    private final String flightId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("airlines")
    @NotNull
    private final List<a> airlines;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("departsAt")
    @NotNull
    private final String departsAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("arrivesAt")
    @NotNull
    private final String arrivesAt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("departureIataCode")
    @NotNull
    private final String departureIataCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("arrivalIataCode")
    @NotNull
    private final String arrivalIataCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalDuration")
    private final long totalDuration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("revpointsPrice")
    private final double revpointsPrice;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("taxesPrice")
    @NotNull
    private final jo3.a taxesPrice;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("numberOfSegments")
    private final int numberOfSegments;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("externalPartner")
    private final String externalPartner;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u000e"}, d2 = {"Lxfg/c0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "airlineName", "b", "airlineIconUrl", "airlineIconName", "d", "airlineRef", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("airlineName")
        @NotNull
        private final String airlineName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("airlineIconUrl")
        private final String airlineIconUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("airlineIconName")
        private final String airlineIconName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("airlineRef")
        private final String airlineRef;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAirlineIconName() {
            return this.airlineIconName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAirlineIconUrl() {
            return this.airlineIconUrl;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAirlineName() {
            return this.airlineName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getAirlineRef() {
            return this.airlineRef;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.airlineName, aVar.airlineName) && Intrinsics.f(this.airlineIconUrl, aVar.airlineIconUrl) && Intrinsics.f(this.airlineIconName, aVar.airlineIconName) && Intrinsics.f(this.airlineRef, aVar.airlineRef);
        }

        public final int hashCode() {
            int iHashCode = this.airlineName.hashCode() * 31;
            String str = this.airlineIconUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.airlineIconName;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.airlineRef;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAirlines() {
        return this.airlines;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getArrivalIataCode() {
        return this.arrivalIataCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getArrivesAt() {
        return this.arrivesAt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDepartsAt() {
        return this.departsAt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDepartureIataCode() {
        return this.departureIataCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.flightId, c0Var.flightId) && Intrinsics.f(this.airlines, c0Var.airlines) && Intrinsics.f(this.departsAt, c0Var.departsAt) && Intrinsics.f(this.arrivesAt, c0Var.arrivesAt) && Intrinsics.f(this.departureIataCode, c0Var.departureIataCode) && Intrinsics.f(this.arrivalIataCode, c0Var.arrivalIataCode) && this.totalDuration == c0Var.totalDuration && Double.compare(this.revpointsPrice, c0Var.revpointsPrice) == 0 && Intrinsics.f(this.taxesPrice, c0Var.taxesPrice) && this.numberOfSegments == c0Var.numberOfSegments && Intrinsics.f(this.externalPartner, c0Var.externalPartner);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getExternalPartner() {
        return this.externalPartner;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFlightId() {
        return this.flightId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getNumberOfSegments() {
        return this.numberOfSegments;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.numberOfSegments, v7.j(this.taxesPrice, m72.b.c(a0.d.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.d(this.flightId.hashCode() * 31, 31, this.airlines), 31, this.departsAt), 31, this.arrivesAt), 31, this.departureIataCode), 31, this.arrivalIataCode), 31, this.totalDuration), this.revpointsPrice, 31), 31), 31);
        String str = this.externalPartner;
        return iB + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final double getRevpointsPrice() {
        return this.revpointsPrice;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final jo3.a getTaxesPrice() {
        return this.taxesPrice;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getTotalDuration() {
        return this.totalDuration;
    }
}
