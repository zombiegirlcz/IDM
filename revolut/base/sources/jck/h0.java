package jck;

import java.time.LocalDate;
import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b((LocalDate) ((Pair) obj2).f186386b, (LocalDate) ((Pair) obj3).f186386b);
    }
}
