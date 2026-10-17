package b4d;

import androidx.sqlite.db.SimpleSQLiteQuery;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {
    public abstract List a(SimpleSQLiteQuery simpleSQLiteQuery);

    public final ArrayList b(mgd.g params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("select\n    a.id,\n    a.from_id,\n    a.from_name,\n    a.from_type_key,\n    a.`to`,\n    a.target_rate,\n    a.created_at,\n    a.completed_at,\n    a.type,\n    a.note,\n    a.frequency,\n    a.percentage,\n    a.time_range,\n    a.completed_at IS NOT NULL is_completed\nFROM alert_items a\nWHERE");
        if (params.c().isEmpty()) {
            throw new IllegalArgumentException("assetTypeKeys is empty");
        }
        arrayList2.add(d0.k0(params.c(), ", ", "a.from_type_key in ( ", " )", 0, new b0a.j(21), 24));
        Iterator it8 = params.c().iterator();
        while (it8.hasNext()) {
            arrayList.add(((FavouritesAssetTypeKey) it8.next()).f86866a);
        }
        int size = params.a().size();
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        if (size == 1) {
            arrayList2.add("AND is_completed = ?");
            arrayList.add(Integer.valueOf(d0.b0(params.a()) == mgd.d.COMPLETED ? 1 : 0));
        } else if (size != 2) {
            throw new IllegalArgumentException(a0.d.n("alertStates unexpected size=", size));
        }
        List listD = params.d();
        if (listD != null) {
            if (listD.isEmpty()) {
                listD = null;
            }
            if (listD != null) {
                arrayList2.add(d0.k0(listD, ", ", "AND a.from_id in ( ", " )", 0, new b0a.j(22), 24));
                arrayList.addAll(listD);
            }
        }
        List listB = params.b();
        if (listB != null) {
            List list = listB;
            ArrayList arrayList3 = new ArrayList(w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList3.add(((mgd.f) it9.next()).name());
            }
            ArrayList arrayList4 = !arrayList3.isEmpty() ? arrayList3 : null;
            if (arrayList4 != null) {
                arrayList2.add(d0.k0(arrayList4, ", ", "AND a.type in ( ", " )", 0, new b0a.j(23), 24));
                arrayList.addAll(arrayList4);
            }
        }
        List listA = a(new SimpleSQLiteQuery(d0.k0(arrayList2, "\n", null, null, 0, null, 62), arrayList.toArray(new Object[0])));
        HashMap map = new HashMap(listA.size());
        List list2 = listA;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list2) {
            c4d.a aVar = (c4d.a) obj2;
            Pair pair = new Pair(aVar.f(), Boolean.valueOf(aVar.a() != null));
            Object arrayList5 = linkedHashMap.get(pair);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(pair, arrayList5);
            }
            ((List) arrayList5).add(obj2);
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList6 = new ArrayList(w.t(collectionValues, 10));
        Iterator it10 = collectionValues.iterator();
        while (true) {
            int i5 = 3;
            if (!it10.hasNext()) {
                break;
            }
            arrayList6.add(d0.P0((List) it10.next(), new a9j.f(new a9j.f(cim.b.f(cim.b.e()), i), i5)));
        }
        Iterator it11 = arrayList6.iterator();
        while (it11.hasNext()) {
            int i6 = 0;
            for (Object obj3 : (List) it11.next()) {
                int i21 = i6 + 1;
                if (i6 < 0) {
                    v.s();
                    throw null;
                }
                map.put(((c4d.a) obj3).g(), Integer.valueOf(i6));
                i6 = i21;
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i22 = 0;
        for (Object obj4 : params.c()) {
            int i32 = i22 + 1;
            if (i22 < 0) {
                v.s();
                throw null;
            }
            linkedHashMap2.put(((FavouritesAssetTypeKey) obj4).f86866a, Integer.valueOf(i22));
            i22 = i32;
        }
        List listP0 = d0.P0(list2, cim.b.a(new b0a.j(20), new a(map, 0), new awk.j(linkedHashMap2, i3)));
        Integer numF = params.f();
        int iIntValue = numF != null ? numF.intValue() : 0;
        Integer numE = params.e();
        int iIntValue2 = (numE != null ? numE.intValue() : listP0.size()) + iIntValue;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj5 : listP0) {
            int i33 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            c4d.a aVar2 = (c4d.a) obj5;
            if (iIntValue > i2 || i2 >= iIntValue2) {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList7.add(aVar2);
            }
            i2 = i33;
        }
        return arrayList7;
    }

    public abstract void c(List list);

    public abstract void d(String str);

    public void e(ArrayList alertIds) {
        Intrinsics.checkNotNullParameter(alertIds, "alertIds");
        Iterator it8 = alertIds.iterator();
        while (it8.hasNext()) {
            d((String) it8.next());
        }
    }
}
