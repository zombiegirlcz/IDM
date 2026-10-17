package hbg;

import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomDetailsParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsRoomDetailsParams f150715a;

    public r(TravelHotelsRoomDetailsParams roomDetails) {
        Intrinsics.checkNotNullParameter(roomDetails, "roomDetails");
        this.f150715a = roomDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f150715a, ((r) obj2).f150715a);
    }

    public final int hashCode() {
        return this.f150715a.hashCode();
    }
}
