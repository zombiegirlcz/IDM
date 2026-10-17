package yfg;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, d2 = {"Lyfg/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "departureCity", "b", "arrivalCity", "c", "e", "departureIataCode", "arrivalIataCode", "h", "provider", "f", "flightImageUrl", "g", "ctaText", "", "Lyfg/l;", "Ljava/util/List;", "()Ljava/util/List;", "flights", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("departureCity")
    @NotNull
    private final String departureCity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("arrivalCity")
    @NotNull
    private final String arrivalCity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("departureIataCode")
    @NotNull
    private final String departureIataCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("arrivalIataCode")
    @NotNull
    private final String arrivalIataCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("provider")
    @NotNull
    private final String provider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("flightImageUrl")
    @NotNull
    private final String flightImageUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("ctaText")
    @NotNull
    private final String ctaText;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("flights")
    @NotNull
    private final List<l> flights;

    public m(String departureCity, String arrivalCity, String departureIataCode, String arrivalIataCode, String provider, String flightImageUrl, String ctaText, ArrayList flights) {
        Intrinsics.checkNotNullParameter(departureCity, "departureCity");
        Intrinsics.checkNotNullParameter(arrivalCity, "arrivalCity");
        Intrinsics.checkNotNullParameter(departureIataCode, "departureIataCode");
        Intrinsics.checkNotNullParameter(arrivalIataCode, "arrivalIataCode");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(flightImageUrl, "flightImageUrl");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(flights, "flights");
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureIataCode = departureIataCode;
        this.arrivalIataCode = arrivalIataCode;
        this.provider = provider;
        this.flightImageUrl = flightImageUrl;
        this.ctaText = ctaText;
        this.flights = flights;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getArrivalCity() {
        return this.arrivalCity;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getArrivalIataCode() {
        return this.arrivalIataCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDepartureCity() {
        return this.departureCity;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDepartureIataCode() {
        return this.departureIataCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.departureCity, mVar.departureCity) && Intrinsics.f(this.arrivalCity, mVar.arrivalCity) && Intrinsics.f(this.departureIataCode, mVar.departureIataCode) && Intrinsics.f(this.arrivalIataCode, mVar.arrivalIataCode) && Intrinsics.f(this.provider, mVar.provider) && Intrinsics.f(this.flightImageUrl, mVar.flightImageUrl) && Intrinsics.f(this.ctaText, mVar.ctaText) && Intrinsics.f(this.flights, mVar.flights);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFlightImageUrl() {
        return this.flightImageUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getFlights() {
        return this.flights;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    public final int hashCode() {
        return this.flights.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.departureCity.hashCode() * 31, 31, this.arrivalCity), 31, this.departureIataCode), 31, this.arrivalIataCode), 31, this.provider), 31, this.flightImageUrl), 31, this.ctaText);
    }
}
