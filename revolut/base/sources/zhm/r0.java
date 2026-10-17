package zhm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes13.dex */
public class r0 extends q0 {
    public static Map g() {
        g0 g0Var = g0.f322472a;
        Intrinsics.i(g0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return g0Var;
    }

    public static Object h(Object obj2, Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof n0) {
            return ((n0) map).D3();
        }
        Object obj3 = map.get(obj2);
        if (obj3 != null || map.containsKey(obj2)) {
            return obj3;
        }
        throw new NoSuchElementException(v0.a.h(obj2, "Key ", " is missing in the map."));
    }

    public static HashMap i(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        HashMap map = new HashMap(q0.b(pairs.length));
        s(map, pairs);
        return map;
    }

    public static LinkedHashMap j(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap destination = new LinkedHashMap(q0.b(pairs.length));
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        s(destination, pairs);
        return destination;
    }

    public static Map k(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (pairs.length <= 0) {
            return g();
        }
        LinkedHashMap destination = new LinkedHashMap(q0.b(pairs.length));
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        s(destination, pairs);
        return destination;
    }

    public static Map l(Object obj2, Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMapZ = z(map);
        linkedHashMapZ.remove(obj2);
        return o(linkedHashMapZ);
    }

    public static Map m(Map map, Iterable keys) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        LinkedHashMap linkedHashMapZ = z(map);
        a0.C(keys, linkedHashMapZ.keySet());
        return o(linkedHashMapZ);
    }

    public static LinkedHashMap n(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(pairs.length));
        s(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map o(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        return size != 0 ? size != 1 ? linkedHashMap : q0.d(linkedHashMap) : g();
    }

    public static LinkedHashMap p(Map map, Map map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map q(Map map, Pair pair) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        if (map.isEmpty()) {
            return q0.c(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.f186385a, pair.f186386b);
        return linkedHashMap;
    }

    public static void r(Map map, Iterable pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator it8 = pairs.iterator();
        while (it8.hasNext()) {
            Pair pair = (Pair) it8.next();
            map.put(pair.f186385a, pair.f186386b);
        }
    }

    public static void s(Map map, Pair[] pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair pair : pairs) {
            map.put(pair.f186385a, pair.f186386b);
        }
    }

    public static Map t(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            x(iterable, linkedHashMap);
            return o(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return g();
        }
        if (size == 1) {
            return q0.c((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(collection.size()));
        x(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    public static Map u(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? z(map) : q0.d(map) : g();
    }

    public static Map v(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        y(sequence, linkedHashMap);
        return o(linkedHashMap);
    }

    public static Map w(Pair[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        int length = pairArr.length;
        if (length == 0) {
            return g();
        }
        if (length == 1) {
            return q0.c(pairArr[0]);
        }
        LinkedHashMap destination = new LinkedHashMap(q0.b(pairArr.length));
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        s(destination, pairArr);
        return destination;
    }

    public static void x(Iterable iterable, LinkedHashMap destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        r(destination, iterable);
    }

    public static void y(Sequence pairs, LinkedHashMap destination) {
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(destination, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator it8 = pairs.iterator();
        while (it8.hasNext()) {
            Pair pair = (Pair) it8.next();
            destination.put(pair.f186385a, pair.f186386b);
        }
    }

    public static LinkedHashMap z(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }
}
