package x0i;

import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        io3.l lVar = ((io3.d) obj3).e;
        io3.l lVar2 = io3.l.CURRENT;
        return cim.b.b(Boolean.valueOf(lVar == lVar2), Boolean.valueOf(((io3.d) obj2).e == lVar2));
    }
}
