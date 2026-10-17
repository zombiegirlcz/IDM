package q8f;

import java.util.Comparator;
import m6f.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((p) obj3).getAllocation(), ((p) obj2).getAllocation());
    }
}
