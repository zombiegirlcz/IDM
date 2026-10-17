package a7g;

import com.revolut.feature.travel.flights.models.domain.search.Passengers;
import com.revolut.feature.travel.flights.models.domain.search.TravelFlightsItinerary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsItinerary f1898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m7g.d f1899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Passengers f1900c;

    public u(TravelFlightsItinerary itinerary, m7g.d cabinClass, Passengers passengers) {
        Intrinsics.checkNotNullParameter(itinerary, "itinerary");
        Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        this.f1898a = itinerary;
        this.f1899b = cabinClass;
        this.f1900c = passengers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f1898a, uVar.f1898a) && this.f1899b == uVar.f1899b && Intrinsics.f(this.f1900c, uVar.f1900c);
    }

    public final int hashCode() {
        return this.f1900c.hashCode() + ((this.f1899b.hashCode() + (this.f1898a.hashCode() * 31)) * 31);
    }
}
