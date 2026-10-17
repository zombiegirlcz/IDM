package m91;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.a1;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class f {
    public abstract void a(ArrayList arrayList);

    public abstract void b(ArrayList arrayList);

    public abstract void c(ArrayList arrayList);

    public abstract List d();

    public abstract List e();

    public abstract List f();

    public abstract List g();

    public abstract void h(ArrayList arrayList);

    public abstract void i(ArrayList arrayList);

    public abstract void j(ArrayList arrayList);

    public abstract void k(ArrayList arrayList);

    public abstract void l();

    public void m(ArrayList directDebits, ArrayList scheduledPayments, ArrayList incomingPayments, ArrayList requiredAttributes) {
        Intrinsics.checkNotNullParameter(directDebits, "directDebits");
        Intrinsics.checkNotNullParameter(scheduledPayments, "scheduledPayments");
        Intrinsics.checkNotNullParameter(incomingPayments, "incomingPayments");
        Intrinsics.checkNotNullParameter(requiredAttributes, "requiredAttributes");
        n(directDebits);
        q(scheduledPayments);
        o(incomingPayments);
        p(requiredAttributes);
    }

    public void n(ArrayList directDebits) {
        Intrinsics.checkNotNullParameter(directDebits, "directDebits");
        List listD = d();
        ArrayList arrayList = new ArrayList(w.t(listD, 10));
        Iterator it8 = listD.iterator();
        while (it8.hasNext()) {
            arrayList.add(((n91.a) it8.next()).f213523a);
        }
        Set setI1 = d0.i1(arrayList);
        ArrayList arrayList2 = new ArrayList(w.t(directDebits, 10));
        Iterator it9 = directDebits.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((n91.a) it9.next()).f213523a);
        }
        Set setI12 = d0.i1(arrayList2);
        Set set = setI1;
        Set setH0 = d0.h0(set, setI12);
        Set setK = a1.k(setI12, set);
        Set setK2 = a1.k(setI1, setI12);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : directDebits) {
            if (setH0.contains(((n91.a) obj2).f213523a)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : directDebits) {
            if (setK.contains(((n91.a) obj3).f213523a)) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : listD) {
            if (setK2.contains(((n91.a) obj4).f213523a)) {
                arrayList5.add(obj4);
            }
        }
        r(arrayList3);
        i(arrayList4);
        a(arrayList5);
    }

    public void o(ArrayList incomingPayments) {
        Intrinsics.checkNotNullParameter(incomingPayments, "incomingPayments");
        l();
        h(incomingPayments);
    }

    public void p(ArrayList requiredAttributes) {
        Intrinsics.checkNotNullParameter(requiredAttributes, "requiredAttributes");
        List listF = f();
        ArrayList arrayList = new ArrayList(w.t(listF, 10));
        Iterator it8 = listF.iterator();
        while (it8.hasNext()) {
            arrayList.add(((n91.c) it8.next()).f213533a);
        }
        Set setI1 = d0.i1(arrayList);
        ArrayList arrayList2 = new ArrayList(w.t(requiredAttributes, 10));
        Iterator it9 = requiredAttributes.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((n91.c) it9.next()).f213533a);
        }
        Set setI12 = d0.i1(arrayList2);
        Set set = setI1;
        Set setH0 = d0.h0(set, setI12);
        Set setK = a1.k(setI12, set);
        Set setK2 = a1.k(setI1, setI12);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : requiredAttributes) {
            if (setH0.contains(((n91.c) obj2).f213533a)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : requiredAttributes) {
            if (setK.contains(((n91.c) obj3).f213533a)) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : listF) {
            if (setK2.contains(((n91.c) obj4).f213533a)) {
                arrayList5.add(obj4);
            }
        }
        s(arrayList3);
        j(arrayList4);
        b(arrayList5);
    }

    public void q(ArrayList scheduledPayments) {
        Intrinsics.checkNotNullParameter(scheduledPayments, "scheduledPayments");
        List listG = g();
        ArrayList arrayList = new ArrayList(w.t(listG, 10));
        Iterator it8 = listG.iterator();
        while (it8.hasNext()) {
            arrayList.add(((n91.d) it8.next()).f213536a);
        }
        Set setI1 = d0.i1(arrayList);
        ArrayList arrayList2 = new ArrayList(w.t(scheduledPayments, 10));
        Iterator it9 = scheduledPayments.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((n91.d) it9.next()).f213536a);
        }
        Set setI12 = d0.i1(arrayList2);
        Set set = setI1;
        Set setH0 = d0.h0(set, setI12);
        Set setK = a1.k(setI12, set);
        Set setK2 = a1.k(setI1, setI12);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : scheduledPayments) {
            if (setH0.contains(((n91.d) obj2).f213536a)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : scheduledPayments) {
            if (setK.contains(((n91.d) obj3).f213536a)) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : listG) {
            if (setK2.contains(((n91.d) obj4).f213536a)) {
                arrayList5.add(obj4);
            }
        }
        t(arrayList3);
        k(arrayList4);
        c(arrayList5);
    }

    public abstract void r(ArrayList arrayList);

    public abstract void s(ArrayList arrayList);

    public abstract void t(ArrayList arrayList);
}
