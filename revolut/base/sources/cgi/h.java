package cgi;

import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import com.revolut.feature_travel_hotels_models.amenity.HotelsCategorisedAmenities;
import java.util.Comparator;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((HotelsAmenity) d0.b0(((HotelsCategorisedAmenities) obj2).f97841b)).e), Integer.valueOf(((HotelsAmenity) d0.b0(((HotelsCategorisedAmenities) obj3).f97841b)).e));
    }
}
