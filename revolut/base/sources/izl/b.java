package izl;

import a0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private b() {
    }

    public static final void a(a aVar, LinkedHashMap linkedHashMap, Object obj2) {
        if (aVar.a(obj2) != null) {
            return;
        }
        LinkedHashMap linkedHashMap2 = aVar.f169893a;
        if (!linkedHashMap2.containsKey(obj2)) {
            linkedHashMap2.put(obj2, obj2);
            aVar.f169894b.put(obj2, 1);
        }
        Set set = (Set) linkedHashMap.get(obj2);
        if (set == null) {
            set = h0.f322473a;
        }
        for (Object obj3 : set) {
            if (aVar.a(obj3) == null) {
                a(aVar, linkedHashMap, obj3);
                aVar.b(obj2, obj3);
            } else {
                aVar.b(obj2, obj3);
            }
        }
    }

    public static final void b(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashMap linkedHashMap, ArrayList arrayList, Object obj2) {
        if (linkedHashSet.contains(obj2)) {
            throw new IllegalArgumentException(d.m(obj2, "Cycle detected at node: "));
        }
        if (linkedHashSet2.contains(obj2)) {
            return;
        }
        linkedHashSet.add(obj2);
        Set set = (Set) linkedHashMap.get(obj2);
        if (set != null) {
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                b(linkedHashSet, linkedHashSet2, linkedHashMap, arrayList, it8.next());
            }
        }
        linkedHashSet.remove(obj2);
        linkedHashSet2.add(obj2);
        arrayList.add(obj2);
    }
}
