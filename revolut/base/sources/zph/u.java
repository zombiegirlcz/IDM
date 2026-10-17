package zph;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class u {
    public static int a(List list, BigDecimal bigDecimal) {
        Iterator it8 = list.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (bigDecimal.compareTo((BigDecimal) ((Pair) it8.next()).f186385a) <= 0) {
                break;
            }
            i++;
        }
        return i != -1 ? ((Number) ((Pair) list.get(i)).f186386b).intValue() : ((Number) ((Pair) d0.m0(list)).f186386b).intValue();
    }
}
