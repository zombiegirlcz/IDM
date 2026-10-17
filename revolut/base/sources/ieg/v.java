package ieg;

import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(v04.b.e(v04.b.M(((HotelsPropertyRoomOccupancyRatesSelection) obj2).f98106c.f98112a))), Integer.valueOf(v04.b.e(v04.b.M(((HotelsPropertyRoomOccupancyRatesSelection) obj3).f98106c.f98112a))));
    }
}
