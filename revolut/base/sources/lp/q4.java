package lp;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes17.dex */
public abstract class q4 implements e4m.e {
    public static hla.a A(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new hla.a(aVar, aVar2, aVar3, aVar4);
    }

    public static gja.a B(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5) {
        return new gja.a(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static a31.a C(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a D(rja.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f254648j.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a a(xfc.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a b(xfc.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a c(xha.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f305848s.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a d(mia.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f205633g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a e(mia.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f205633g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a f(yia.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a g(yia.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a h(hka.b bVar) {
        b60.a aVar = (b60.a) bVar.i.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a i(hka.b bVar) {
        b60.a aVar = (b60.a) bVar.i.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a j(hka.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a k(hka.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a l(hla.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a m(hla.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a n(mla.b bVar) {
        b60.a aVar = (b60.a) bVar.d.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a o(mla.b bVar) {
        b60.a aVar = (b60.a) bVar.d.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a p(gja.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a q(gja.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a r(rja.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f254648j.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a s(rja.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f254648j.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static ila.b t(b60.a aVar) {
        ila.b bVar = (ila.b) aVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static sja.a u(b60.a aVar) {
        sja.a aVar2 = (sja.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static if0.a v(ika.f fVar) {
        return new if0.a(ImmutableSet.of((od0.e) ((ika.b) fVar).o.get()));
    }

    public static if0.a w(ila.b bVar) {
        bVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(bVar.f162210g, "Set contributions cannot be null", arrayList);
        return new if0.a(kii.e.C(bVar.f, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static if0.a x(yfc.a aVar) {
        return new if0.a(ImmutableSet.of((od0.e) aVar.b(), (od0.e) aVar.e.get()));
    }

    public static a31.a y(phm.a aVar) {
        return new a31.a(aVar);
    }

    public static b60.a z(hla.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }
}
