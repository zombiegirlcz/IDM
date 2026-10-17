package f92;

import java.util.Comparator;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((a) obj3).getCreationDate()), Long.valueOf(((a) obj2).getCreationDate()));
    }
}
