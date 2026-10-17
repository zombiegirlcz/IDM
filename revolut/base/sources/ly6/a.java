package ly6;

import java.util.Comparator;
import sr6.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((m) obj2).ordinal()), Integer.valueOf(((m) obj3).ordinal()));
    }
}
