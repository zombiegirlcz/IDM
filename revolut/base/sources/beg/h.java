package beg;

import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsRoomsInformation f14831a;

    public h(TravelHotelsRoomsInformation selectedBed) {
        Intrinsics.checkNotNullParameter(selectedBed, "selectedBed");
        this.f14831a = selectedBed;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f14831a, ((h) obj2).f14831a);
    }

    public final int hashCode() {
        return this.f14831a.hashCode();
    }
}
