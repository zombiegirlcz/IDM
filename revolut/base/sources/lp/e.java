package lp;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.airtip.impl.data.database.AirTipDatabase;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes17.dex */
public abstract class e implements e4m.e {
    public static j5d.c A(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, ecm.q qVar) {
        return new j5d.c(aVar, aVar2, aVar3, aVar4, aVar5, qVar);
    }

    public static if0.a B(t0b.k kVar) {
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(kVar.f266973g, "Set contributions cannot be null", arrayList);
        return new if0.a(kii.e.C(kVar.f266974h, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static if0.a C(j5d.b bVar) {
        return new if0.a(ImmutableSet.of(new ahl.a(bVar.f171617a, (AirTipDatabase) bVar.f171620g.get())));
    }

    public static b60.a D(j5d.c cVar) {
        b60.a aVar = (b60.a) cVar.f171627g.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a a(un.b bVar) {
        b60.a aVar = (b60.a) bVar.f281335c.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a b(un.b bVar) {
        b60.a aVar = (b60.a) bVar.f281335c.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a c(s0b.b bVar) {
        b60.a aVar = (b60.a) bVar.f258926g.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a d(s0b.b bVar) {
        b60.a aVar = (b60.a) bVar.f258926g.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a e(jp.b bVar) {
        b60.a aVar = (b60.a) bVar.f177176c.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a f(jp.b bVar) {
        b60.a aVar = (b60.a) bVar.f177176c.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a g(qj1.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a h(qj1.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a i(awi.c cVar) {
        b60.a aVar = (b60.a) cVar.G.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a j(awi.c cVar) {
        b60.a aVar = (b60.a) cVar.G.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a k(awi.c cVar) {
        b60.a aVar = (b60.a) cVar.D.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a l(awi.c cVar) {
        b60.a aVar = (b60.a) cVar.D.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a m(awi.c cVar) {
        b60.a aVar = (b60.a) cVar.F.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a n(awi.c cVar) {
        b60.a aVar = (b60.a) cVar.F.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a o(awi.c cVar) {
        b60.a aVar = (b60.a) cVar.H.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a p(awi.c cVar) {
        b60.a aVar = (b60.a) cVar.H.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a q(awi.c cVar) {
        b60.a aVar = (b60.a) cVar.I.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a r(awi.c cVar) {
        b60.a aVar = (b60.a) cVar.I.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a s(j5d.c cVar) {
        b60.a aVar = (b60.a) cVar.f171627g.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a t(j5d.c cVar) {
        b60.a aVar = (b60.a) cVar.f171627g.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static jp.a u(b60.a aVar) {
        jp.a aVar2 = (jp.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static j5d.b v(b60.a aVar) {
        j5d.b bVar = (j5d.b) aVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static a31.a w(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a x(jp.b bVar) {
        b60.a aVar = (b60.a) bVar.f177176c.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static jp.b y(a31.a aVar, a31.a aVar2) {
        return new jp.b(aVar, aVar2);
    }

    public static a31.a z(p1 p1Var) {
        return new a31.a(p1Var);
    }
}
