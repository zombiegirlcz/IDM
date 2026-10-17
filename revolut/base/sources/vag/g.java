package vag;

import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomsSelectionParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsRoomsSelectionParams f287291a;

    public g(TravelHotelsRoomsSelectionParams roomsSelection) {
        Intrinsics.checkNotNullParameter(roomsSelection, "roomsSelection");
        this.f287291a = roomsSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f287291a, ((g) obj2).f287291a);
    }

    public final int hashCode() {
        return this.f287291a.hashCode();
    }
}
