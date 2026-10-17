package bbg;

import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsRoomsInformation f14292a;

    public n(TravelHotelsRoomsInformation selectedBed) {
        Intrinsics.checkNotNullParameter(selectedBed, "selectedBed");
        this.f14292a = selectedBed;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f14292a, ((n) obj2).f14292a);
    }

    public final int hashCode() {
        return this.f14292a.hashCode();
    }
}
