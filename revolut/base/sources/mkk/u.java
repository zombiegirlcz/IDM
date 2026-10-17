package mkk;

import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        lha.o oVar = ((lha.k) obj3).d;
        lha.o oVar2 = lha.o.MANAGER;
        return cim.b.b(Boolean.valueOf(oVar == oVar2), Boolean.valueOf(((lha.k) obj2).d == oVar2));
    }
}
