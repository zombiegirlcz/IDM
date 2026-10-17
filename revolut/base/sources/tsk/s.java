package tsk;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Pair pair = (Pair) obj2;
        int iIntValue = ((Number) pair.f186385a).intValue();
        Integer num = (Integer) pair.f186386b;
        Integer numValueOf = Integer.valueOf(((num != null ? num.intValue() : 0) * 2) + (iIntValue * 100));
        Pair pair2 = (Pair) obj3;
        int iIntValue2 = ((Number) pair2.f186385a).intValue();
        Integer num2 = (Integer) pair2.f186386b;
        return cim.b.b(numValueOf, Integer.valueOf(((num2 != null ? num2.intValue() : 0) * 2) + (iIntValue2 * 100)));
    }
}
