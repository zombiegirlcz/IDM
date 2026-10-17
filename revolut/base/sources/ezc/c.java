package ezc;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        hyc.c cVar = (hyc.c) ((Pair) obj2).f186386b;
        Integer numValueOf = Integer.valueOf(cVar != null ? cVar.ordinal() : -1);
        hyc.c cVar2 = (hyc.c) ((Pair) obj3).f186386b;
        return cim.b.b(numValueOf, Integer.valueOf(cVar2 != null ? cVar2.ordinal() : -1));
    }
}
