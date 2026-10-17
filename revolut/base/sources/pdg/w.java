package pdg;

import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomsSelectionParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsRoomsSelectionParams f235220a;

    public w(TravelHotelsRoomsSelectionParams roomsSelection) {
        Intrinsics.checkNotNullParameter(roomsSelection, "roomsSelection");
        this.f235220a = roomsSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f235220a, ((w) obj2).f235220a);
    }

    public final int hashCode() {
        return this.f235220a.hashCode();
    }
}
