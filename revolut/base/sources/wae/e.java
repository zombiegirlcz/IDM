package wae;

import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import te0.w;
import tof.i7;
import tof.ib;
import tof.s9;
import ua2.r;
import ufm.i;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements d9e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xua.a f295870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f295871b;

    public e(xua.a recurringPaymentInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f295870a = recurringPaymentInteractor;
        this.f295871b = transactionsInteractor;
    }

    public final d0 a(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((p) obj2).G != null && (!r3.isEmpty())) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return w.j(f0.f322471a);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            Set set = ((p) it8.next()).G;
            if (set != null) {
                arrayList2.add(set);
            }
        }
        Set setI1 = zhm.d0.i1(zhm.w.u(arrayList2));
        i7.c cVar = i7.Companion;
        s9 s9Var = new s9(setI1);
        ib ibVar = str != null ? new ib(str) : null;
        cVar.getClass();
        i iVar = new i(ue0.e.F(com.revolut.domain.interactors.transactions.a.b(this.f295871b, i7.c.a(s9Var, ibVar), null, null, null, null, 30), f0.f322471a), new w4l.c(new r(9, arrayList), 15), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
