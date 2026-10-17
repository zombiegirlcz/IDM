package k6f;

import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((m6f.j) obj3).getAllocation(), ((m6f.j) obj2).getAllocation());
    }
}
