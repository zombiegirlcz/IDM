package uk5;

import java.util.Comparator;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((Set) ((Pair) obj3).f186386b).size()), Integer.valueOf(((Set) ((Pair) obj2).f186386b).size()));
    }
}
