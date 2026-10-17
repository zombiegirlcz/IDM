package m8h;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m8h.a;
import xzg.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static final ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new f0(((a.C1151a) it8.next()).getRef()));
        }
        return arrayList;
    }

    public static final ArrayList b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new a.C1151a(((f0) it8.next()).f309988a));
        }
        return arrayList;
    }
}
