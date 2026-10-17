package fg0;

import com.revolut.core.model.faq.PigeonNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import zhm.a0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class g {
    public static ArrayList a(PigeonNode pigeonNode) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pigeonNode);
        Iterator it8 = pigeonNode.f51438h.iterator();
        while (it8.hasNext()) {
            a0.x(a((PigeonNode) it8.next()), arrayList);
        }
        return arrayList;
    }

    public static PigeonNode b(PigeonNode pigeonNode, LinkedHashMap linkedHashMap) {
        int i = f.f134873a[pigeonNode.f51436c.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            List list = (List) linkedHashMap.get(pigeonNode.f51434a);
            if (!ue0.e.n(list)) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(b((PigeonNode) it8.next(), linkedHashMap));
                }
                return PigeonNode.a(pigeonNode, arrayList);
            }
        }
        return pigeonNode;
    }
}
