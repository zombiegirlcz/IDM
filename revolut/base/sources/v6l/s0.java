package v6l;

import java.util.Comparator;

/* JADX INFO: loaded from: classes12.dex */
public final class s0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Long l2 = ((h93.f0) obj2).B;
        Long lValueOf = Long.valueOf(l2 != null ? l2.longValue() : 0L);
        Long l3 = ((h93.f0) obj3).B;
        return cim.b.b(lValueOf, Long.valueOf(l3 != null ? l3.longValue() : 0L));
    }
}
