package v6l;

import java.util.Comparator;

/* JADX INFO: loaded from: classes12.dex */
public final class r0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        h93.f0 f0Var = (h93.f0) obj2;
        Long l2 = f0Var.B;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        Long l3 = f0Var.A;
        Long lValueOf = Long.valueOf(Math.max(jLongValue, l3 != null ? l3.longValue() : 0L));
        h93.f0 f0Var2 = (h93.f0) obj3;
        Long l4 = f0Var2.B;
        long jLongValue2 = l4 != null ? l4.longValue() : 0L;
        Long l5 = f0Var2.A;
        return cim.b.b(lValueOf, Long.valueOf(Math.max(jLongValue2, l5 != null ? l5.longValue() : 0L)));
    }
}
