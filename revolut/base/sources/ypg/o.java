package ypg;

import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        dj0.d dVar = ((npg.a) obj3).f218205a;
        Long lValueOf = Long.valueOf(dVar != null ? dVar.f115082a : 0L);
        dj0.d dVar2 = ((npg.a) obj2).f218205a;
        return cim.b.b(lValueOf, Long.valueOf(dVar2 != null ? dVar2.f115082a : 0L));
    }
}
