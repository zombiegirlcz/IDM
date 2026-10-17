package x8b;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        cw5.b bVar = (cw5.b) ((Pair) obj3).f186386b;
        Long lValueOf = bVar != null ? Long.valueOf(bVar.f109535b) : null;
        cw5.b bVar2 = (cw5.b) ((Pair) obj2).f186386b;
        return cim.b.b(lValueOf, bVar2 != null ? Long.valueOf(bVar2.f109535b) : null);
    }
}
