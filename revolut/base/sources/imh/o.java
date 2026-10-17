package imh;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    public static boolean a(List list, List list2, Set set) {
        if (!set.containsAll(list)) {
            return false;
        }
        List list3 = list2;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            return true;
        }
        Iterator it8 = list3.iterator();
        while (it8.hasNext()) {
            if (set.contains((vmh.f) it8.next())) {
                return false;
            }
        }
        return true;
    }
}
