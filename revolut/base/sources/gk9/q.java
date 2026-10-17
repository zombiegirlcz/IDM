package gk9;

import java.util.Comparator;
import zh9.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((r0) obj3).f322330h.toEpochMilli()), Long.valueOf(((r0) obj2).f322330h.toEpochMilli()));
    }
}
