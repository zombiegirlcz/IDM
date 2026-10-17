package lp;

import com.google.common.collect.ImmutableSet;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.CorporateEventsDatabase;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.WealthDiscoveryDomainDatabase;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes17.dex */
public abstract class i9 implements e4m.e {
    public static a31.a A(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a B(vhl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.o.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static vhl.a C(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, ecm.q qVar) {
        return new vhl.a(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, qVar);
    }

    public static ioh.a D(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, ecm.q qVar) {
        return new ioh.a(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, qVar);
    }

    public static b60.a a(ioh.a aVar) {
        b60.a aVar2 = (b60.a) aVar.o.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a b(ioh.a aVar) {
        b60.a aVar2 = (b60.a) aVar.o.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a c(vhl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f289490m.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a d(vhl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f289490m.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a e(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312708q.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a f(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312708q.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a g(ioh.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f163336n.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a h(ioh.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f163336n.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a i(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312704l.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a j(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312704l.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a k(vhl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.o.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a l(vhl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.o.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a m(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312706n.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a n(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312706n.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static whl.e o(b60.a aVar) {
        whl.e eVar = (whl.e) aVar.b();
        vc.s.k(eVar);
        return eVar;
    }

    public static vnh.b p(b60.a aVar) {
        vnh.b bVar = (vnh.b) aVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static whl.f q(b60.a aVar) {
        whl.f fVar = (whl.f) aVar.b();
        vc.s.k(fVar);
        return fVar;
    }

    public static a31.a r(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a s(vhl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f289490m.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static if0.a t(whl.e eVar) {
        eVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        Object obj2 = eVar.f297699j.get();
        vc.s.i(obj2, "Set contributions cannot be null");
        arrayList.add(obj2);
        arrayList.add(new ahl.a(eVar.f297696c, (CorporateEventsDatabase) eVar.f297702n.get()));
        return new if0.a(arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static if0.a u(u8h.c cVar) {
        return new if0.a(ImmutableSet.of(((u8h.b) cVar).e()));
    }

    public static if0.a v(whl.f fVar) {
        fVar.getClass();
        ArrayList arrayList = new ArrayList(4);
        kii.e.w(fVar.o, "Set contributions cannot be null", arrayList);
        Object obj2 = fVar.C.get();
        vc.s.i(obj2, "Set contributions cannot be null");
        arrayList.add(obj2);
        arrayList.add(new ahl.a(fVar.e, (WealthDiscoveryDomainDatabase) fVar.f297724y.get()));
        return new if0.a(kii.e.C(fVar.v, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static a31.a w(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a x(r8h.c cVar) {
        b60.a aVar = (b60.a) cVar.f252440m.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a y(ioh.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f163336n.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static a31.a z(p1 p1Var) {
        return new a31.a(p1Var);
    }
}
