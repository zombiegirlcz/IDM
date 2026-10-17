package ttl;

import java.util.Comparator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public final class z implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        k4l.k kVar = (k4l.k) ((Pair) obj2).f186385a;
        nvl.a aVar = nvl.g.Companion;
        aVar.getClass();
        List list = nvl.a.f219744b;
        Integer numValueOf = Integer.valueOf(list.indexOf(kVar));
        k4l.k kVar2 = (k4l.k) ((Pair) obj3).f186385a;
        aVar.getClass();
        return cim.b.b(numValueOf, Integer.valueOf(list.indexOf(kVar2)));
    }
}
