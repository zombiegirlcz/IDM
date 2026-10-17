package lnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n {
    public static Pair a(String str, Map map) {
        Iterable iterable = (List) map.get(str);
        if (iterable == null) {
            iterable = zhm.f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : iterable) {
            if (Intrinsics.f(((he3.j) obj2).f151563a, "excluded_transactions")) {
                arrayList2.add(obj2);
            } else {
                arrayList.add(obj2);
            }
        }
        return new Pair(arrayList, zhm.d0.d0(arrayList2));
    }
}
