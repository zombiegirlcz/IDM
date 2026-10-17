package n59;

import e4m.e;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import vc.s;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements e {
    public static Map a() {
        a.Companion.getClass();
        l59.b[] bVarArrValues = l59.b.values();
        ArrayList arrayList = new ArrayList(bVarArrValues.length);
        for (l59.b bVar : bVarArrValues) {
            arrayList.add(new Pair(bVar.getId(), bVar));
        }
        Map mapT = r0.t(arrayList);
        s.k(mapT);
        return mapT;
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
