package m04;

import java.util.Comparator;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((a) obj2).getOrder()), Integer.valueOf(((a) obj3).getOrder()));
    }
}
