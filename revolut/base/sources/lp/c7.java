package lp;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes17.dex */
public abstract class c7 implements e4m.e {
    public static a31.a A(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static a31.a B(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a C(esc.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f128933a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static csc.a D(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6) {
        return new csc.a(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static b60.a a(oad.f fVar) {
        b60.a aVarA = fVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static b60.a b(csc.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f108466g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a c(vcd.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a d(vcd.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a e(zcd.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f321263b.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a f(zcd.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f321263b.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a g(esc.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f128933a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a h(esc.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f128933a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static wcd.b i(b60.a aVar) {
        wcd.b bVar = (wcd.b) aVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static add.a j(b60.a aVar) {
        add.a aVar2 = (add.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static gsc.c k(b60.a aVar) {
        gsc.c cVar = (gsc.c) aVar.b();
        vc.s.k(cVar);
        return cVar;
    }

    public static fsc.a l(b60.a aVar) {
        fsc.a aVar2 = (fsc.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static if0.a m(wcd.b bVar) {
        bVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(bVar.e, "Set contributions cannot be null", arrayList);
        return new if0.a(kii.e.C(bVar.f, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static if0.a n(gsc.c cVar) {
        return new if0.a(ImmutableSet.of((od0.e) cVar.i.get(), (od0.e) cVar.f146379h.get()));
    }

    public static b60.a o(csc.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f108466g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static a31.a p(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a q(ymb.b bVar) {
        b60.a aVar = (b60.a) bVar.f314960n0.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static a31.a r(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a s(ymb.b bVar) {
        b60.a aVar = (b60.a) bVar.f314969t0.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static a31.a t(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a u(vcd.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static vcd.a v(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new vcd.a(aVar, aVar2, aVar3, aVar4);
    }

    public static a31.a w(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a x(zcd.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f321263b.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static zcd.a y(ecm.q qVar) {
        return new zcd.a(qVar);
    }

    public static b60.a z(ymb.b bVar) {
        b60.a aVar = (b60.a) bVar.m0.get();
        vc.s.k(aVar);
        return aVar;
    }
}
