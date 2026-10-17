package t5g;

import aii.r;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreenContract$Trip;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsDatesSelectionScreenContract$Trip f268108a;

    public e(TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip) {
        this.f268108a = travelFlightsDatesSelectionScreenContract$Trip;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f268108a, ((e) obj2).f268108a);
    }

    public final int hashCode() {
        TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip = this.f268108a;
        if (travelFlightsDatesSelectionScreenContract$Trip == null) {
            return 0;
        }
        return travelFlightsDatesSelectionScreenContract$Trip.hashCode();
    }
}
