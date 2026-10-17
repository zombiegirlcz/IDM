package stl;

import io3.g;
import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        dj0.d dVar;
        dj0.d dVar2;
        long jValueOf = Long.MAX_VALUE;
        g gVar = (g) ((Pair) obj2).f186386b;
        Long lValueOf = (gVar == null || (dVar2 = gVar.f163164b) == null) ? Long.MAX_VALUE : Long.valueOf(dVar2.f115082a);
        g gVar2 = (g) ((Pair) obj3).f186386b;
        if (gVar2 != null && (dVar = gVar2.f163164b) != null) {
            jValueOf = Long.valueOf(dVar.f115082a);
        }
        return cim.b.b(lValueOf, jValueOf);
    }
}
