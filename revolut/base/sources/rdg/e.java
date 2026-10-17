package rdg;

import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((HotelsAmenity) ((Pair) obj2).f186385a).e), Integer.valueOf(((HotelsAmenity) ((Pair) obj3).f186385a).e));
    }
}
