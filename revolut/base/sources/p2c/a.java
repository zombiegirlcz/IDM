package p2c;

import java.util.Iterator;
import java.util.List;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private a() {
    }

    public static int a(int i) {
        Object obj2;
        n.Companion.getClass();
        List list = g.f232210b;
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            Object next = it8.next();
            if (it8.hasNext()) {
                int iAbs = Math.abs(i - ((Number) next).intValue());
                do {
                    Object next2 = it8.next();
                    int iAbs2 = Math.abs(i - ((Number) next2).intValue());
                    if (iAbs > iAbs2) {
                        next = next2;
                        iAbs = iAbs2;
                    }
                } while (it8.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        Integer num = (Integer) obj2;
        return num != null ? num.intValue() : ((Number) d0.b0(list)).intValue();
    }
}
