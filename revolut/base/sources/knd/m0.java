package knd;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Long l2 = (Long) ((Pair) obj3).f186386b;
        if (l2 == null) {
            l2 = l;
        }
        Long l3 = (Long) ((Pair) obj2).f186386b;
        return cim.b.b(l2, l3 != null ? l3 : 0L);
    }
}
