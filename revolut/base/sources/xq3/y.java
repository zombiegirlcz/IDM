package xq3;

import ft3.d1;
import ft3.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class y {
    public static Set a() {
        List listC;
        j1.Companion.getClass();
        EnumEntries enumEntriesA = j1.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : enumEntriesA) {
            j1 j1Var = (j1) obj2;
            j1Var.getClass();
            j1[] elements = {j1.CREDIT_CARD, j1.FIXED_TERM_CREDIT, j1.MORTGAGE, j1.REFINANCING_MORTGAGE, j1.OVERDRAFT, j1.BUY_NOW_PAY_LATER};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (kotlin.collections.d.y0(elements).contains(j1Var)) {
                arrayList.add(obj2);
            }
        }
        Set<j1> setI1 = d0.i1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (j1 j1Var2 : setI1) {
            List listA = x.f308102a[j1Var2.ordinal()] == 1 ? gt3.d.a() : f0.f322471a;
            if (listA.isEmpty()) {
                listC = zhm.u.c(mif.a.m(d1.Companion, j1Var2, null));
            } else {
                List list = listA;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(new d1(j1Var2, (gt3.f) it8.next(), null));
                }
                listC = arrayList3;
            }
            a0.x(listC, arrayList2);
        }
        return d0.i1(arrayList2);
    }
}
