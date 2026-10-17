package ieg;

import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsPropertyRoomOccupancyRatesSelection f160723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f160724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fgi.a f160725c;

    public n(HotelsPropertyRoomOccupancyRatesSelection occupancyRatesSelection, int i, fgi.a aVar) {
        Intrinsics.checkNotNullParameter(occupancyRatesSelection, "occupancyRatesSelection");
        this.f160723a = occupancyRatesSelection;
        this.f160724b = i;
        this.f160725c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f160723a, nVar.f160723a) && this.f160724b == nVar.f160724b && this.f160725c == nVar.f160725c;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f160724b, this.f160723a.hashCode() * 31, 31);
        fgi.a aVar = this.f160725c;
        return iB + (aVar == null ? 0 : aVar.hashCode());
    }
}
