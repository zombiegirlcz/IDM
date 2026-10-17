package qcg;

import com.revolut.feature_travel_hotels_models.favorites.HotelsFavoriteDestination;
import com.revolut.feature_travel_hotels_models.favorites.HotelsFavoriteProperty;
import com.revolut.feature_travel_hotels_models.favorites.HotelsFavorites;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.k0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    private d() {
    }

    public static e a(HotelsFavorites favorites) {
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        List list = favorites.f97947b;
        int iB = q0.b(w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : list) {
            linkedHashMap.put(((HotelsFavoriteDestination) obj2).f97941a, obj2);
        }
        ArrayList arrayList = favorites.f97946a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            String str = ((HotelsFavoriteProperty) it8.next()).f97945b;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        return new e(linkedHashMap, k0.a(new io.grpc.okhttp.internal.e(arrayList2)));
    }
}
