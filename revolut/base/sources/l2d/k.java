package l2d;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        List list = (List) ((mgd.c) obj2).f205261b.getContent();
        boolean z = false;
        Boolean boolValueOf = Boolean.valueOf(list != null && list.isEmpty());
        List list2 = (List) ((mgd.c) obj3).f205261b.getContent();
        if (list2 != null && list2.isEmpty()) {
            z = true;
        }
        return cim.b.b(boolValueOf, Boolean.valueOf(z));
    }
}
