package lp;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public abstract class n1 implements e4m.e {
    public static if0.a A(c21.e eVar) {
        return new if0.a(ImmutableSet.copyOf((Collection) ((c21.b) eVar).O.get()));
    }

    public static if0.a B(n06.a aVar) {
        ArrayList arrayList = new ArrayList(2);
        Set setA = n06.e.a();
        Iterator it8 = setA.iterator();
        while (it8.hasNext()) {
            vc.s.i(it8.next(), "Set contributions cannot be null");
        }
        arrayList.addAll(setA);
        return new if0.a(kii.e.C(aVar.f210875c, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static b60.a C(c21.c cVar) {
        b60.a aVar = (b60.a) cVar.f20596l.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static a31.a D(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a a(ud0.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f279066g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a b(ud0.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f279066g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a c(f2j.b bVar) {
        b60.a aVar = (b60.a) bVar.K.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a d(fz5.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f139108c.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a e(fz5.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f139108c.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a f(rz5.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a g(rz5.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a h(rz5.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f258513g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a i(rz5.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f258513g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a j(b06.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f11618c.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a k(b06.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f11618c.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a l(m16.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f201248s.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a m(n06.b bVar) {
        b60.a aVar = (b60.a) bVar.d.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a n(n06.b bVar) {
        b60.a aVar = (b60.a) bVar.d.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a o(c21.c cVar) {
        b60.a aVar = (b60.a) cVar.f20596l.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a p(c21.c cVar) {
        b60.a aVar = (b60.a) cVar.f20596l.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static sd0.c q(b60.a aVar) {
        sd0.c cVar = (sd0.c) aVar.b();
        vc.s.k(cVar);
        return cVar;
    }

    public static c21.e r(b60.a aVar) {
        c21.e eVar = (c21.e) aVar.b();
        vc.s.k(eVar);
        return eVar;
    }

    public static c21.e s(b60.a aVar) {
        c21.e eVar = (c21.e) aVar.b();
        vc.s.k(eVar);
        return eVar;
    }

    public static a31.a t(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a u(ud0.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f279066g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static ud0.a v(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, ecm.q qVar) {
        return new ud0.a(aVar, aVar2, aVar3, aVar4, aVar5, qVar);
    }

    public static a31.a w(phm.a aVar) {
        return new a31.a(aVar);
    }

    public static c21.c x(ecm.q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, ecm.q qVar2, a31.a aVar9) {
        return new c21.c(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, qVar2, aVar8, aVar9);
    }

    public static if0.a y(sd0.c cVar) {
        vd0.e eVar = (vd0.e) cVar;
        eVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        Set setA = vd0.c.a();
        Iterator it8 = setA.iterator();
        while (it8.hasNext()) {
            vc.s.i(it8.next(), "Set contributions cannot be null");
        }
        arrayList.addAll(setA);
        return new if0.a(kii.e.C(eVar.f287765g, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static if0.a z(gz5.c cVar) {
        return new if0.a(Collections.singleton((od0.e) cVar.f147938c.get()));
    }
}
