package a6g;

import aii.r;
import com.revolut.feature.travel.flights.models.domain.itinerary.TravelFlightsFare;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsFare f1689a;

    public h(TravelFlightsFare selectedFare) {
        Intrinsics.checkNotNullParameter(selectedFare, "selectedFare");
        this.f1689a = selectedFare;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f1689a, ((h) obj2).f1689a);
    }

    public final int hashCode() {
        return this.f1689a.hashCode();
    }
}
