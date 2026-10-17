package lp;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.invest.smart_notifications.impl.data.database.SmartNotificationsDatabase;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes17.dex */
public abstract class a3 implements e4m.e {
    public static bad.a A(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new bad.a(aVar, aVar2, aVar3, aVar4);
    }

    public static b60.a B(bad.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static a31.a C(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a D(p28.e eVar) {
        b60.a aVarA = eVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static b60.a a(l18.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f191491q.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a b(l18.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f191491q.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a c(a4f.b bVar) {
        b60.a aVarA = bVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static b60.a d(a4f.b bVar) {
        b60.a aVarA = bVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static b60.a e(vwa.c cVar) {
        b60.a aVar = (b60.a) cVar.i.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a f(vwa.c cVar) {
        b60.a aVar = (b60.a) cVar.i.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a g(bad.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a h(bad.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a i(e48.b bVar) {
        b60.a aVar = (b60.a) bVar.f122408p.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a j(e48.b bVar) {
        b60.a aVar = (b60.a) bVar.f122408p.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a k(e48.b bVar) {
        b60.a aVar = (b60.a) bVar.f122410r.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a l(e48.b bVar) {
        b60.a aVar = (b60.a) bVar.f122410r.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a m(p28.e eVar) {
        b60.a aVarA = eVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static b60.a n(p28.e eVar) {
        b60.a aVarA = eVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static m18.e o(b60.a aVar) {
        m18.e eVar = (m18.e) aVar.b();
        vc.s.k(eVar);
        return eVar;
    }

    public static cad.d p(b60.a aVar) {
        cad.d dVar = (cad.d) aVar.b();
        vc.s.k(dVar);
        return dVar;
    }

    public static e48.c q(b60.a aVar) {
        e48.c cVar = (e48.c) aVar.b();
        vc.s.k(cVar);
        return cVar;
    }

    public static if0.a r(m18.e eVar) {
        return new if0.a(ImmutableSet.of((od0.e) eVar.f201274t.get(), (od0.e) new ahl.a(eVar.d, (SmartNotificationsDatabase) eVar.u.get()), (od0.e) eVar.f201277y.get()));
    }

    public static if0.a s(vwa.b bVar) {
        bVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(bVar.f292673j, "Set contributions cannot be null", arrayList);
        return new if0.a(kii.e.C(bVar.k, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static if0.a t(cad.d dVar) {
        return new if0.a(Collections.singleton((od0.e) dVar.f22610h.get()));
    }

    public static b60.a u(l18.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f191491q.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a v(ow7.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f230327q.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static a31.a w(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static l18.a x(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, ecm.q qVar) {
        return new l18.a(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, qVar);
    }

    public static b60.a y(a4f.b bVar) {
        b60.a aVarA = bVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static a31.a z(p1 p1Var) {
        return new a31.a(p1Var);
    }
}
