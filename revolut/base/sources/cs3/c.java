package cs3;

import ft3.c1;
import ft3.d1;
import ft3.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.enums.EnumEntries;
import zhm.a0;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class c {
    private c() {
    }

    public static Set a() {
        EnumEntries enumEntriesA = j1.a();
        c1 c1Var = d1.Companion;
        ArrayList<d1> arrayList = new ArrayList(w.t(enumEntriesA, 10));
        Iterator<E> it8 = enumEntriesA.iterator();
        while (it8.hasNext()) {
            arrayList.add(mif.a.m(c1Var, (j1) it8.next(), null));
        }
        ArrayList arrayList2 = new ArrayList();
        for (d1 d1Var : arrayList) {
            a0.x(d1Var.f137810a != j1.FIXED_TERM_CREDIT ? u.c(d1Var) : v.k(d1.c(d1Var, gt3.d.LOAN, null, 5), d1.c(d1Var, gt3.d.REFINANCING, null, 5)), arrayList2);
        }
        return d0.i1(arrayList2);
    }
}
