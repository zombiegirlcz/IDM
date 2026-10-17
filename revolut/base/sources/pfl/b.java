package pfl;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((Number) ((Pair) obj3).f186385a).intValue()), Integer.valueOf(((Number) ((Pair) obj2).f186385a).intValue()));
    }
}
