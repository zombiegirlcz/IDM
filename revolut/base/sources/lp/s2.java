package lp;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.global_markets.impl.data.database.GlobalMarketsDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public abstract class s2 implements e4m.e {
    public static y67.f A(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, ecm.q qVar) {
        return new y67.f(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, qVar);
    }

    public static m9b.a B(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, ecm.q qVar) {
        return new m9b.a(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, qVar);
    }

    public static a31.a C(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a D(f97.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f132853m.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a a(o67.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f222523a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a b(o67.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f222523a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a c(y67.f fVar) {
        b60.a aVar = (b60.a) fVar.i.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a d(y67.f fVar) {
        b60.a aVar = (b60.a) fVar.i.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a e(y67.f fVar) {
        b60.a aVar = (b60.a) fVar.f311227j.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a f(y67.f fVar) {
        b60.a aVar = (b60.a) fVar.f311227j.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a g(m9b.a aVar) {
        b60.a aVar2 = (b60.a) aVar.k.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a h(m9b.a aVar) {
        b60.a aVar2 = (b60.a) aVar.k.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a i(x77.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f303158w.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a j(x77.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f303158w.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a k(x77.a aVar) {
        b60.a aVar2 = (b60.a) aVar.u.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a l(x77.a aVar) {
        b60.a aVar2 = (b60.a) aVar.u.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a m(f97.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f132856q.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a n(f97.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f132856q.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a o(f97.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f132853m.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a p(f97.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f132853m.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a q(f97.a aVar) {
        b60.a aVar2 = (b60.a) aVar.o.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a r(jm0.b bVar) {
        b60.a aVar = (b60.a) bVar.f175913j.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static y67.a s(b60.a aVar) {
        y67.a aVar2 = (y67.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static g97.c t(b60.a aVar) {
        g97.c cVar = (g97.c) aVar.b();
        vc.s.k(cVar);
        return cVar;
    }

    public static g97.d u(f97.a aVar) {
        g97.d dVar = (g97.d) ((b60.a) aVar.o.get()).b();
        vc.s.k(dVar);
        return dVar;
    }

    public static jm0.a v(b60.a aVar) {
        jm0.a aVar2 = (jm0.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static if0.a w(h77.a aVar) {
        y77.i iVar = (y77.i) aVar;
        return new if0.a(ImmutableSet.of((od0.e) new mfg.a(iVar.d, (GlobalMarketsDatabase) iVar.f311414n.get()), (od0.e) iVar.f311418s.get(), (od0.e) iVar.f311416q.get()));
    }

    public static if0.a x(g97.d dVar) {
        ue0.c storage = (ue0.c) dVar.i.get();
        h97.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        vc.s.k(storage);
        return new if0.a(ImmutableSet.of(storage));
    }

    public static a31.a y(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a z(y67.f fVar) {
        b60.a aVar = (b60.a) fVar.i.get();
        vc.s.k(aVar);
        return aVar;
    }
}
