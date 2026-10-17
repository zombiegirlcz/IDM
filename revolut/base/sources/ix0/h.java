package ix0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((Number) obj2).intValue()), Integer.valueOf(((Number) obj3).intValue()));
    }
}
