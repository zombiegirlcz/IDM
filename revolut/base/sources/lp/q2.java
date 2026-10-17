package lp;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.database.tax_pockets.FreelancerTaxPocketsDatabase;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes17.dex */
public abstract class q2 implements e4m.e {
    public static a31.a A(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a B(jpj.b bVar) {
        b60.a aVar = (b60.a) bVar.f177296j.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static a31.a C(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a D(jpj.b bVar) {
        b60.a aVar = (b60.a) bVar.k.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a a(jpj.b bVar) {
        b60.a aVar = (b60.a) bVar.i.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a b(jpj.b bVar) {
        b60.a aVar = (b60.a) bVar.i.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a c(p57.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f233033n.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a d(p57.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f233033n.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a e(f67.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f132405a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a f(f67.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f132405a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a g(j67.b bVar) {
        b60.a aVar = (b60.a) bVar.e.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a h(j67.b bVar) {
        b60.a aVar = (b60.a) bVar.e.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a i(jpj.b bVar) {
        b60.a aVar = (b60.a) bVar.f177296j.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a j(jpj.b bVar) {
        b60.a aVar = (b60.a) bVar.f177296j.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a k(jpj.b bVar) {
        b60.a aVar = (b60.a) bVar.k.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a l(jpj.b bVar) {
        b60.a aVar = (b60.a) bVar.k.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static jpj.a m(b60.a aVar) {
        jpj.a aVar2 = (jpj.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static jpj.d n(b60.a aVar) {
        jpj.d dVar = (jpj.d) aVar.b();
        vc.s.k(dVar);
        return dVar;
    }

    public static jpj.e o(b60.a aVar) {
        jpj.e eVar = (jpj.e) aVar.b();
        vc.s.k(eVar);
        return eVar;
    }

    public static if0.a p(j67.a aVar) {
        aVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(aVar.f, "Set contributions cannot be null", arrayList);
        return new if0.a(kii.e.C(aVar.f171676g, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static b60.a q(ss6.c cVar) {
        b60.a aVar = (b60.a) cVar.f265325b0.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static if0.a r(at6.a aVar) {
        return new if0.a(ImmutableSet.of((od0.e) aVar.f.get()));
    }

    public static a31.a s(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a t(jpj.b bVar) {
        b60.a aVar = (b60.a) bVar.i.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static jpj.b u(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8) {
        return new jpj.b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static a31.a v(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a w(ss6.c cVar) {
        b60.a aVar = (b60.a) cVar.f265327d0.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static if0.a x(bt6.b bVar) {
        return new if0.a(ImmutableSet.of((xe0.e) new mfg.a(bVar.f18298h, (FreelancerTaxPocketsDatabase) bVar.A.get()), bVar.k()));
    }

    public static a31.a y(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a z(ss6.c cVar) {
        b60.a aVar = (b60.a) cVar.j0.get();
        vc.s.k(aVar);
        return aVar;
    }
}
