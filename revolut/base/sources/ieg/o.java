package ieg;

import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsPropertyRoomOccupancyRatesSelection f160726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f160727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelHotelsRoomsInformation f160728c;

    public o(HotelsPropertyRoomOccupancyRatesSelection occupancyRatesSelection, List amenities, TravelHotelsRoomsInformation roomInformation) {
        Intrinsics.checkNotNullParameter(occupancyRatesSelection, "occupancyRatesSelection");
        Intrinsics.checkNotNullParameter(amenities, "amenities");
        Intrinsics.checkNotNullParameter(roomInformation, "roomInformation");
        this.f160726a = occupancyRatesSelection;
        this.f160727b = amenities;
        this.f160728c = roomInformation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f160726a.equals(oVar.f160726a) && Intrinsics.f(this.f160727b, oVar.f160727b) && this.f160728c.equals(oVar.f160728c);
    }

    public final int hashCode() {
        return this.f160728c.hashCode() + j6.a.c(p.a.d(this.f160726a.hashCode() * 31, 31, this.f160727b), 31, true);
    }
}
