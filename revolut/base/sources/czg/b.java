package czg;

import java.util.Comparator;
import rxg.j;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(Math.abs(((j) obj3).d().f115082a)), Long.valueOf(Math.abs(((j) obj2).d().f115082a)));
    }
}
