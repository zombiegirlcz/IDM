package dsd;

import java.util.Comparator;
import java.util.List;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        List list = ((amd.j) obj3).f6333b;
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        int i2 = 0;
        for (Object obj4 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            dVarO = i2 == 0 ? ((amd.d) obj4).d : pyd.c.O(dVarO, ((amd.d) obj4).d);
            i2 = i3;
        }
        dj0.d dVarA = dVarO.a();
        List list2 = ((amd.j) obj2).f6333b;
        dj0.d.Companion.getClass();
        dj0.d dVarO2 = dj0.d.e;
        for (Object obj5 : list2) {
            int i5 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarO2 = i == 0 ? ((amd.d) obj5).d : pyd.c.O(dVarO2, ((amd.d) obj5).d);
            i = i5;
        }
        return cim.b.b(dVarA, dVarO2.a());
    }
}
