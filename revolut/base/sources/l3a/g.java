package l3a;

import java.util.Comparator;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        d3a.a aVar = (d3a.a) ((Pair) obj2).f186385a;
        LinkedHashMap linkedHashMap = i.f191872l;
        return cim.b.b((Integer) linkedHashMap.get(aVar), (Integer) linkedHashMap.get((d3a.a) ((Pair) obj3).f186385a));
    }
}
