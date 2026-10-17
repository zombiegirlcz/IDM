package oac;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u001b"}, d2 = {"Loac/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "airlineName", "b", "airlineIataCode", "airlineLogoUrl", "d", "g", "flightNumber", "", "e", "I", "f", "()I", "durationMinutes", "Loac/c;", "Loac/c;", "()Loac/c;", "departure", "arrival", "Companion", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("airlineName")
    @NotNull
    private final String airlineName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("airlineIataCode")
    @NotNull
    private final String airlineIataCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("airlineLogoUrl")
    @NotNull
    private final String airlineLogoUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("flightNumber")
    @NotNull
    private final String flightNumber;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("durationMinutes")
    private final int durationMinutes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("departure")
    @NotNull
    private final c departure;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("arrival")
    @NotNull
    private final c arrival;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAirlineIataCode() {
        return this.airlineIataCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAirlineLogoUrl() {
        return this.airlineLogoUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAirlineName() {
        return this.airlineName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getArrival() {
        return this.arrival;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getDeparture() {
        return this.departure;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.airlineName, dVar.airlineName) && Intrinsics.f(this.airlineIataCode, dVar.airlineIataCode) && Intrinsics.f(this.airlineLogoUrl, dVar.airlineLogoUrl) && Intrinsics.f(this.flightNumber, dVar.flightNumber) && this.durationMinutes == dVar.durationMinutes && Intrinsics.f(this.departure, dVar.departure) && Intrinsics.f(this.arrival, dVar.arrival);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDurationMinutes() {
        return this.durationMinutes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFlightNumber() {
        return this.flightNumber;
    }

    public final int hashCode() {
        return this.arrival.hashCode() + ((this.departure.hashCode() + j6.a.b(this.durationMinutes, p.a.c(p.a.c(p.a.c(this.airlineName.hashCode() * 31, 31, this.airlineIataCode), 31, this.airlineLogoUrl), 31, this.flightNumber), 31)) * 31);
    }
}
