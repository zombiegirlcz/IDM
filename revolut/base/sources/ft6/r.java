package ft6;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        as6.l lVar = (as6.l) obj2;
        int i = 3;
        Integer numValueOf = Integer.valueOf(lVar instanceof as6.j ? 0 : lVar instanceof as6.i ? 1 : lVar instanceof as6.k ? 2 : 3);
        as6.l lVar2 = (as6.l) obj3;
        if (lVar2 instanceof as6.j) {
            i = 0;
        } else if (lVar2 instanceof as6.i) {
            i = 1;
        } else if (lVar2 instanceof as6.k) {
            i = 2;
        }
        return cim.b.b(numValueOf, Integer.valueOf(i));
    }
}
