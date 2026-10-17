package ji7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import qi7.g;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class d {
    public static ArrayList a(List list, Function1 function1) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((bi7.a) it8.next()).f15437b);
        }
        ArrayList arrayListU = w.u(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayListU) {
            g gVar = ((qi7.a) obj2).f246659c;
            qi7.c cVar = gVar instanceof qi7.c ? (qi7.c) gVar : null;
            if (cVar != null ? ((Boolean) function1.invoke(cVar)).booleanValue() : false) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
