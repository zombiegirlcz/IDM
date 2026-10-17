package nbf;

import a0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lbf.m;
import lbf.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private a() {
    }

    public static Pair a(m pricingPlan) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        List list = pricingPlan.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof lbf.a) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((lbf.a) next).f193664b == o.TRADE) {
                break;
            }
        }
        lbf.a aVar = (lbf.a) next;
        List list2 = pricingPlan.f;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof lbf.a) {
                arrayList2.add(obj3);
            }
        }
        Iterator it9 = arrayList2.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (((lbf.a) next2).f193664b == o.TRADE) {
                break;
            }
        }
        lbf.a aVar2 = (lbf.a) next2;
        String str = aVar != null ? aVar.f193665c : null;
        String str2 = aVar2 != null ? aVar2.f193665c : null;
        if (str == null || str2 == null) {
            return null;
        }
        return new Pair(str, str2);
    }

    public static Pair b(m pricingPlan) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Pair pairA = a(pricingPlan);
        if (pairA == null) {
            return null;
        }
        return new Pair(d.r((String) pairA.f186385a, "%"), d.r((String) pairA.f186386b, "%"));
    }
}
