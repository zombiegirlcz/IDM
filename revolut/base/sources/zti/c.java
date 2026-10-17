package zti;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((Number) ((Pair) obj3).f186386b).intValue()), Integer.valueOf(((Number) ((Pair) obj2).f186386b).intValue()));
    }
}
