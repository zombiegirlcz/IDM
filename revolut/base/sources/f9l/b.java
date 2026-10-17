package f9l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import zhm.d0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {
    public void a(ArrayList arrayList) {
        Map mapG;
        ArrayList arrayListS = t61.a.s("rates", arrayList);
        for (Object obj2 : arrayList) {
            if (((e) obj2).d == null) {
                arrayListS.add(obj2);
            }
        }
        if (arrayListS.isEmpty()) {
            mapG = r0.g();
        } else {
            ArrayList arrayList2 = new ArrayList(w.t(arrayListS, 10));
            Iterator it8 = arrayListS.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((e) it8.next()).f132995a);
            }
            List listU = d0.U(arrayList2);
            ArrayList arrayList3 = new ArrayList(w.t(arrayListS, 10));
            Iterator it9 = arrayListS.iterator();
            while (it9.hasNext()) {
                arrayList3.add(((e) it9.next()).f132996b);
            }
            List listC = c(listU, d0.U(arrayList3));
            int iB = q0.b(w.t(listC, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
            for (Object obj3 : listC) {
                e eVar = (e) obj3;
                linkedHashMap.put(new Pair(eVar.f132995a, eVar.f132996b), obj3);
            }
            mapG = linkedHashMap;
        }
        ArrayList arrayList4 = new ArrayList(w.t(arrayList, 10));
        Iterator it10 = arrayList.iterator();
        while (it10.hasNext()) {
            e eVar2 = (e) it10.next();
            Double d = eVar2.d;
            if (d == null) {
                e eVar3 = (e) mapG.get(new Pair(eVar2.f132995a, eVar2.f132996b));
                d = eVar3 != null ? eVar3.d : null;
            }
            Double d5 = d;
            String from = eVar2.f132995a;
            String to6 = eVar2.f132996b;
            double d6 = eVar2.f132997c;
            long j2 = eVar2.e;
            Boolean bool = eVar2.f;
            DateTime dateTime = eVar2.f132998g;
            DateTime dateTime2 = eVar2.f132999h;
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to6, "to");
            arrayList4.add(new e(from, to6, d6, d5, j2, bool, dateTime, dateTime2));
        }
        b(arrayList4);
    }

    public abstract void b(ArrayList arrayList);

    public abstract List c(List list, List list2);
}
