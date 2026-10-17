package lp;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public abstract class t0 implements e4m.e {
    public static nf0.b A(ecm.q qVar) {
        return new nf0.b(qVar);
    }

    public static if0.a B(y60.c cVar) {
        return new if0.a(Collections.singleton((od0.e) cVar.d.get()));
    }

    public static if0.d C(l70.e eVar) {
        eVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        l70.d dataManager = new l70.d(new v70.b(eVar.f192431a, eVar.f192439h.f183264b), (zk0.b) eVar.V.get());
        l70.s.Companion.getClass();
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        arrayList.add(dataManager);
        t70.d dVar = eVar.e;
        vc.s.i(dVar, "Set contributions cannot be null");
        arrayList.add(dVar);
        return new if0.d(arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static if0.a D(om2.e eVar) {
        ue0.c storage = (ue0.c) eVar.f226505j.get();
        om2.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        vc.s.k(storage);
        return new if0.a(ImmutableSet.of((od0.e) storage, (od0.e) eVar.i.get()));
    }

    public static b60.a a(ee0.b bVar) {
        b60.a aVar = (b60.a) bVar.f125060c.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a b(kf0.d dVar) {
        b60.a aVar = (b60.a) dVar.f183267c.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a c(l70.f fVar) {
        b60.a aVar = (b60.a) fVar.f192456h.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a d(nf0.b bVar) {
        b60.a aVar = (b60.a) bVar.f214799b.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a e(z60.a aVar) {
        b60.a aVar2 = (b60.a) aVar.d.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a f(jm2.c cVar) {
        b60.a aVar = (b60.a) cVar.f175931h.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a g(jm2.c cVar) {
        b60.a aVar = (b60.a) cVar.f175931h.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a h(sn3.a aVar) {
        b60.a aVar2 = (b60.a) aVar.d.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a i(bf0.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f14892b.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static y60.c j(b60.a aVar) {
        y60.c cVar = (y60.c) aVar.b();
        vc.s.k(cVar);
        return cVar;
    }

    public static l70.e k(b60.a aVar) {
        l70.e eVar = (l70.e) aVar.b();
        vc.s.k(eVar);
        return eVar;
    }

    public static kf0.c l(b60.a aVar) {
        kf0.c cVar = (kf0.c) aVar.b();
        vc.s.k(cVar);
        return cVar;
    }

    public static ee0.a m(b60.a aVar) {
        ee0.a aVar2 = (ee0.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static nf0.a n(b60.a aVar) {
        nf0.a aVar2 = (nf0.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a o(ee0.b bVar) {
        b60.a aVar = (b60.a) bVar.f125060c.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a p(kf0.d dVar) {
        b60.a aVar = (b60.a) dVar.f183267c.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a q(l70.f fVar) {
        b60.a aVar = (b60.a) fVar.f192456h.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a r(nf0.b bVar) {
        b60.a aVar = (b60.a) bVar.f214799b.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a s(z60.a aVar) {
        b60.a aVar2 = (b60.a) aVar.d.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static a31.a t(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static z60.a u(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new z60.a(aVar, aVar2, aVar3);
    }

    public static a31.a v(phm.a aVar) {
        return new a31.a(aVar);
    }

    public static l70.f w(ecm.q qVar, ecm.q qVar2, ecm.q qVar3, ecm.q qVar4, ecm.q qVar5, ecm.q qVar6, a31.a aVar) {
        return new l70.f(qVar, qVar2, qVar3, qVar4, qVar5, qVar6, aVar);
    }

    public static a31.a x(phm.a aVar) {
        return new a31.a(aVar);
    }

    public static ee0.b y(a31.a aVar, ecm.q qVar) {
        return new ee0.b(aVar, qVar);
    }

    public static a31.a z(phm.a aVar) {
        return new a31.a(aVar);
    }
}
