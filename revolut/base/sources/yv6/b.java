package yv6;

import java.util.Comparator;
import sr6.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((i) obj2).ordinal()), Integer.valueOf(((i) obj3).ordinal()));
    }
}
