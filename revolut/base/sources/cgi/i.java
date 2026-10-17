package cgi;

import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((HotelsAmenity) obj2).e), Integer.valueOf(((HotelsAmenity) obj3).e));
    }
}
