package b1a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public abstract void a(ArrayList arrayList);

    public abstract void b(ArrayList arrayList);

    public abstract List c();

    public void d(ArrayList recurringSplits) {
        Intrinsics.checkNotNullParameter(recurringSplits, "recurringSplits");
        ArrayList arrayList = new ArrayList(w.t(recurringSplits, 10));
        Iterator it8 = recurringSplits.iterator();
        while (it8.hasNext()) {
            arrayList.add(((c1a.a) it8.next()).f20427a);
        }
        Set setI1 = d0.i1(arrayList);
        List listC = c();
        ArrayList arrayList2 = new ArrayList(w.t(listC, 10));
        Iterator it9 = listC.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((c1a.a) it9.next()).f20427a);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!setI1.contains((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            b(arrayList3);
        }
        if (recurringSplits.isEmpty()) {
            return;
        }
        a(recurringSplits);
    }
}
