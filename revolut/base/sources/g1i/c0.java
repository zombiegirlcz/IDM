package g1i;

import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        io3.k kVar = ((io3.d) obj2).f;
        io3.k kVar2 = io3.k.ACTIVE;
        return cim.b.b(Integer.valueOf(kVar == kVar2 ? 0 : 1), Integer.valueOf(((io3.d) obj3).f == kVar2 ? 0 : 1));
    }
}
