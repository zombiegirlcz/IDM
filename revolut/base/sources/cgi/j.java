package cgi;

import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import com.revolut.feature_travel_hotels_models.amenity.HotelsCategorisedAmenities;
import com.revolut.feature_travel_hotels_models.property.room.RoomView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f23997a = new LinkedHashMap();

    public final void a(p room) {
        Intrinsics.checkNotNullParameter(room, "room");
        Iterator it8 = room.b().iterator();
        while (it8.hasNext()) {
            d((HotelsCategorisedAmenities) it8.next());
        }
        oei.b bVar = oei.b.VIEW;
        List<RoomView> listD = room.d();
        ArrayList arrayList = new ArrayList(w.t(listD, 10));
        for (RoomView roomView : listD) {
            arrayList.add(new HotelsAmenity(roomView.f98121a, oei.a.ROOM, roomView.f98122b, null, Integer.MAX_VALUE));
        }
        d(new HotelsCategorisedAmenities(bVar, arrayList));
    }

    public final void b(r rates) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        Iterator it8 = rates.b().iterator();
        while (it8.hasNext()) {
            d((HotelsCategorisedAmenities) it8.next());
        }
    }

    public final void c(p room) {
        Intrinsics.checkNotNullParameter(room, "room");
        Iterator it8 = room.a().iterator();
        while (it8.hasNext()) {
            b((r) it8.next());
        }
        a(room);
    }

    public final void d(HotelsCategorisedAmenities categorisedAmenities) {
        Intrinsics.checkNotNullParameter(categorisedAmenities, "categorisedAmenities");
        oei.b bVar = categorisedAmenities.f97840a;
        LinkedHashMap linkedHashMap = this.f23997a;
        Object linkedHashSet = linkedHashMap.get(bVar);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            linkedHashMap.put(bVar, linkedHashSet);
        }
        Set set = (Set) linkedHashSet;
        Iterator it8 = categorisedAmenities.f97841b.iterator();
        while (it8.hasNext()) {
            set.add((HotelsAmenity) it8.next());
        }
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f23997a.entrySet()) {
            HotelsCategorisedAmenities hotelsCategorisedAmenities = !((Collection) entry.getValue()).isEmpty() ? new HotelsCategorisedAmenities((oei.b) entry.getKey(), d0.P0(d0.d1((Iterable) entry.getValue()), new i())) : null;
            if (hotelsCategorisedAmenities != null) {
                arrayList.add(hotelsCategorisedAmenities);
            }
        }
        return d0.P0(arrayList, new h());
    }
}
