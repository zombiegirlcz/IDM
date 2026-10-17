package mhf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import mjf.x;
import tof.i7;
import tof.k2;
import tof.q7;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public interface b {
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    static i7 a(b bVar, i7 i7Var, Collection includePredefinedFilters, Collection excludePredefinedFilters, int i) {
        if ((i & 2) != 0) {
            ((x) bVar).getClass();
            k2[] elements = {k2.VALID_STATES, k2.NOT_SPARE_CHANGE, k2.NOT_HIDDEN, k2.NOT_COLLECTION_EXCHANGE, k2.NOT_PENDING_CARD_REFUND};
            Intrinsics.checkNotNullParameter(elements, "elements");
            includePredefinedFilters = kotlin.collections.d.y0(elements);
        }
        if ((i & 4) != 0) {
            excludePredefinedFilters = h0.f322473a;
        }
        ?? r4 = ((x) bVar).f206040a;
        Intrinsics.checkNotNullParameter(includePredefinedFilters, "includePredefinedFilters");
        Intrinsics.checkNotNullParameter(excludePredefinedFilters, "excludePredefinedFilters");
        List listB0 = d0.B0(includePredefinedFilters, excludePredefinedFilters);
        if (i7Var == null || listB0.isEmpty()) {
            if (i7Var != null) {
                return i7Var;
            }
            if (listB0.size() <= 1) {
                if (listB0.size() == 1) {
                    return (i7) r4.get(listB0.get(0));
                }
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it8 = listB0.iterator();
            while (it8.hasNext()) {
                i7 i7Var2 = (i7) r4.get((k2) it8.next());
                if (i7Var2 != null) {
                    arrayList.add(i7Var2);
                }
            }
            return new q7(arrayList);
        }
        i7.c cVar = i7.Companion;
        s0 s0Var = new s0(2);
        s0Var.a(i7Var);
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = listB0.iterator();
        while (it9.hasNext()) {
            i7 i7Var3 = (i7) r4.get((k2) it9.next());
            if (i7Var3 != null) {
                arrayList2.add(i7Var3);
            }
        }
        s0Var.b(arrayList2.toArray(new i7[0]));
        ArrayList arrayList3 = s0Var.f186433a;
        i7[] i7VarArr = (i7[]) arrayList3.toArray(new i7[arrayList3.size()]);
        cVar.getClass();
        return i7.c.a(i7VarArr);
    }
}
