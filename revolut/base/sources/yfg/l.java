package yfg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010 \u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001a\u0010)\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b\u001a\u0010(¨\u0006*"}, d2 = {"Lyfg/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "flightId", "b", "airlineName", "c", "airlineRef", "d", "airlineIconUrl", "e", "f", "departsAt", "arrivesAt", "", "g", "J", "l", "()J", "totalDuration", "bookingUrl", "i", "flightClass", "", "j", "D", "()D", "revpointsCost", "Ljo3/b;", "k", "Ljo3/b;", "()Ljo3/b;", "taxesCost", "", "I", "()I", "numberOfSegments", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("flightId")
    @NotNull
    private final String flightId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("airlineName")
    @NotNull
    private final String airlineName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("airlineRef")
    @NotNull
    private final String airlineRef;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("airlineIconUrl")
    private final String airlineIconUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("departsAt")
    @NotNull
    private final String departsAt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("arrivesAt")
    @NotNull
    private final String arrivesAt;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalDuration")
    private final long totalDuration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("bookingUrl")
    @NotNull
    private final String bookingUrl;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("flightClass")
    @NotNull
    private final String flightClass;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("revpointsCost")
    private final double revpointsCost;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("taxesCost")
    @NotNull
    private final jo3.b taxesCost;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("numberOfSegments")
    private final int numberOfSegments;

    public l(String flightId, String airlineName, String airlineRef, String str, String departsAt, String arrivesAt, long j2, String bookingUrl, String flightClass, double d, jo3.b taxesCost, int i) {
        Intrinsics.checkNotNullParameter(flightId, "flightId");
        Intrinsics.checkNotNullParameter(airlineName, "airlineName");
        Intrinsics.checkNotNullParameter(airlineRef, "airlineRef");
        Intrinsics.checkNotNullParameter(departsAt, "departsAt");
        Intrinsics.checkNotNullParameter(arrivesAt, "arrivesAt");
        Intrinsics.checkNotNullParameter(bookingUrl, "bookingUrl");
        Intrinsics.checkNotNullParameter(flightClass, "flightClass");
        Intrinsics.checkNotNullParameter(taxesCost, "taxesCost");
        this.flightId = flightId;
        this.airlineName = airlineName;
        this.airlineRef = airlineRef;
        this.airlineIconUrl = str;
        this.departsAt = departsAt;
        this.arrivesAt = arrivesAt;
        this.totalDuration = j2;
        this.bookingUrl = bookingUrl;
        this.flightClass = flightClass;
        this.revpointsCost = d;
        this.taxesCost = taxesCost;
        this.numberOfSegments = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAirlineIconUrl() {
        return this.airlineIconUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAirlineName() {
        return this.airlineName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAirlineRef() {
        return this.airlineRef;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getArrivesAt() {
        return this.arrivesAt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getBookingUrl() {
        return this.bookingUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.flightId, lVar.flightId) && Intrinsics.f(this.airlineName, lVar.airlineName) && Intrinsics.f(this.airlineRef, lVar.airlineRef) && Intrinsics.f(this.airlineIconUrl, lVar.airlineIconUrl) && Intrinsics.f(this.departsAt, lVar.departsAt) && Intrinsics.f(this.arrivesAt, lVar.arrivesAt) && this.totalDuration == lVar.totalDuration && Intrinsics.f(this.bookingUrl, lVar.bookingUrl) && Intrinsics.f(this.flightClass, lVar.flightClass) && Double.compare(this.revpointsCost, lVar.revpointsCost) == 0 && Intrinsics.f(this.taxesCost, lVar.taxesCost) && this.numberOfSegments == lVar.numberOfSegments;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDepartsAt() {
        return this.departsAt;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFlightClass() {
        return this.flightClass;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFlightId() {
        return this.flightId;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.flightId.hashCode() * 31, 31, this.airlineName), 31, this.airlineRef);
        String str = this.airlineIconUrl;
        return Integer.hashCode(this.numberOfSegments) + y.e(this.taxesCost, m72.b.c(p.a.c(p.a.c(a0.d.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.departsAt), 31, this.arrivesAt), 31, this.totalDuration), 31, this.bookingUrl), 31, this.flightClass), this.revpointsCost, 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getNumberOfSegments() {
        return this.numberOfSegments;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final double getRevpointsCost() {
        return this.revpointsCost;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final jo3.b getTaxesCost() {
        return this.taxesCost;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getTotalDuration() {
        return this.totalDuration;
    }
}
