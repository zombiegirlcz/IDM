package m3d;

import amf.n;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f202374a;

    public i(Set interactors) {
        Intrinsics.checkNotNullParameter(interactors, "interactors");
        Set set = interactors;
        int iB = q0.b(w.t(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : set) {
            linkedHashMap.put(((u3d.b) obj2).a(), obj2);
        }
        this.f202374a = linkedHashMap;
    }

    public final Flow a(List keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        List<FavouritesAssetTypeKey> list = keys;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (FavouritesAssetTypeKey favouritesAssetTypeKey : list) {
            u3d.b bVar = (u3d.b) this.f202374a.get(favouritesAssetTypeKey);
            arrayList.add(bVar == null ? new go.g(null, 2) : new l2d.h(bVar.isAvailable(), favouritesAssetTypeKey, 1));
        }
        return q.q(new j23.b((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 7));
    }

    public final Flow b(List items, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(items, "items");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : items) {
            FavouritesAssetTypeKey favouritesAssetTypeKey = ((z3d.e) obj2).d;
            Object arrayList = linkedHashMap.get(favouritesAssetTypeKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(favouritesAssetTypeKey, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            FavouritesAssetTypeKey favouritesAssetTypeKey2 = (FavouritesAssetTypeKey) entry.getKey();
            List list = (List) entry.getValue();
            Object obj3 = this.f202374a.get(favouritesAssetTypeKey2);
            if (obj3 == null) {
                throw new IllegalArgumentException(j6.a.q("No interactor registered for assetTypeKey=", favouritesAssetTypeKey2.f86866a).toString());
            }
            u3d.b bVar = (u3d.b) obj3;
            List<z3d.e> list2 = list;
            ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList3.add(((z3d.e) it8.next()).f319253a);
            }
            ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
            for (z3d.e eVar : list2) {
                arrayList4.add(new Pair(eVar.f319253a, eVar.f319254b));
            }
            r rVarFilter = bVar.i(arrayList3).filter(new m30.b(19, new m30.c(10)));
            Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
            arrayList2.add(ta6.a.h(z ? rd0.e.b(bVar.b(arrayList4, z4)) : new go.g(new Data(f0.f322471a, null, false, 6, null), 2), rd0.e.b(rVarFilter), z3 ? rd0.e.b(bVar.e(arrayList4)) : new go.g(new Data(f0.f322471a, null, false, 6, null), 2), new n(favouritesAssetTypeKey2, bVar, null, 1)));
        }
        return arrayList2.isEmpty() ? new go.g(r0.g(), 2) : new j23.b((Flow[]) d0.d1(arrayList2).toArray(new Flow[0]), 8);
    }
}
