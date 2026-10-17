package lp;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rewards.impl.data.database.RewardsDatabase;
import java.util.Collection;

/* JADX INFO: loaded from: classes17.dex */
public abstract class x6 implements e4m.e {
    public static w4c.a A(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6) {
        return new w4c.a(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static a31.a B(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a C(ptj.a aVar) {
        b60.a aVar2 = (b60.a) aVar.k.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static ptj.a D(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, ecm.q qVar) {
        return new ptj.a(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, qVar);
    }

    public static b60.a a(uhc.b bVar) {
        b60.a aVar = (b60.a) bVar.J.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a b(uhc.b bVar) {
        b60.a aVar = (b60.a) bVar.J.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a c(uhc.b bVar) {
        b60.a aVar = (b60.a) bVar.H.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a d(uhc.b bVar) {
        b60.a aVar = (b60.a) bVar.M.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a e(uhc.b bVar) {
        b60.a aVar = (b60.a) bVar.M.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a f(w4c.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f294534g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a g(w4c.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f294534g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a h(f5c.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f132301g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a i(f5c.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f132301g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a j(w4c.b bVar) {
        b60.a aVar = (b60.a) bVar.f294535a.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a k(w4c.b bVar) {
        b60.a aVar = (b60.a) bVar.f294535a.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a l(l5c.a aVar) {
        b60.a aVar2 = (b60.a) aVar.k.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a m(l5c.a aVar) {
        b60.a aVar2 = (b60.a) aVar.k.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a n(uhc.b bVar) {
        b60.a aVar = (b60.a) bVar.L.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a o(uhc.b bVar) {
        b60.a aVar = (b60.a) bVar.L.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a p(ptj.a aVar) {
        b60.a aVar2 = (b60.a) aVar.k.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a q(ptj.a aVar) {
        b60.a aVar2 = (b60.a) aVar.k.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static whc.b r(uhc.b bVar) {
        whc.b bVar2 = (whc.b) ((b60.a) bVar.H.get()).b();
        vc.s.k(bVar2);
        return bVar2;
    }

    public static whc.c s(b60.a aVar) {
        whc.c cVar = (whc.c) aVar.b();
        vc.s.k(cVar);
        return cVar;
    }

    public static rtj.g t(b60.a aVar) {
        rtj.g gVar = (rtj.g) aVar.b();
        vc.s.k(gVar);
        return gVar;
    }

    public static if0.a u(whc.b bVar) {
        ne0.d dVar = new ne0.d();
        od0.e eVar = (od0.e) bVar.f297498q.get();
        od0.e eVar2 = (od0.e) bVar.f297499r.get();
        whc.j0.Companion.getClass();
        return new if0.a(ImmutableSet.of(dVar, eVar, eVar2, new ne0.d(), (od0.e) bVar.f297500s.get(), (od0.e) bVar.f297497p.get(), (od0.e) bVar.f297501t.get(), (od0.e) bVar.u.get(), (od0.e) bVar.v.get(), (od0.e) bVar.f297502w.get(), new mfg.a(bVar.f297490c, (RewardsDatabase) bVar.f297494l.get())));
    }

    public static if0.a v(h5c.a aVar) {
        return new if0.a(ImmutableSet.copyOf((Collection) h5c.e.a()));
    }

    public static if0.a w(m5c.c cVar) {
        return new if0.a(ImmutableSet.of((od0.e) cVar.f202890l.get(), (od0.e) cVar.f202891m.get()));
    }

    public static if0.a x(rtj.g gVar) {
        return new if0.a(ImmutableSet.of((ne0.d) gVar.b(), new ne0.d()));
    }

    public static a31.a y(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a z(uhc.b bVar) {
        b60.a aVar = (b60.a) bVar.M.get();
        vc.s.k(aVar);
        return aVar;
    }
}
