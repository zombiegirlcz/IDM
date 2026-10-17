package hwi;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public final class u0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((iwi.k) ((Pair) obj3).f186386b).getTimestamp()), Long.valueOf(((iwi.k) ((Pair) obj2).f186386b).getTimestamp()));
    }
}
