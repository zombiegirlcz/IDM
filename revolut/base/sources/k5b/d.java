package k5b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wel.e;
import y49.f;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static List a(e portfolio, f fVar) {
        Object next;
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        ArrayList arrayList = portfolio.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof kel.b) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.size() <= 1) {
            return arrayList2;
        }
        if (fVar == null) {
            return d0.P0(arrayList2, new a());
        }
        List<y49.c> listP0 = d0.P0(fVar.d, new b());
        ArrayList arrayList3 = new ArrayList();
        for (y49.c cVar : listP0) {
            Iterator it8 = arrayList2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((kel.b) next).f183148a.f183145a, cVar.f310834a)) {
                    break;
                }
            }
            kel.b bVar = (kel.b) next;
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }
}
