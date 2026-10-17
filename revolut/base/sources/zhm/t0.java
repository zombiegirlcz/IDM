package zhm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class t0 extends s0 {
    public static boolean A(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return !linkedHashMap.isEmpty();
    }

    public static lim.q B(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return d0.Q(map.entrySet());
    }

    public static List C(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.size() == 0) {
            return f0.f322471a;
        }
        Iterator it8 = map.entrySet().iterator();
        if (!it8.hasNext()) {
            return f0.f322471a;
        }
        Map.Entry entry = (Map.Entry) it8.next();
        if (!it8.hasNext()) {
            return u.c(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it8.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it8.hasNext());
        return arrayList;
    }
}
