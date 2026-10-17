package pqd;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((b) ((Pair) obj2).f186385a).ordinal()), Integer.valueOf(((b) ((Pair) obj3).f186385a).ordinal()));
    }
}
