package lp;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.stock_lending.impl.database.StockLendingDatabase;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes17.dex */
public abstract class w7 implements e4m.e {
    public static a31.a A(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a B(y0e.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f310209q.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static h1e.f C(y0e.a aVar) {
        return new h1e.f(aVar.f310205l, aVar.f310206m, aVar.f310202g, aVar.f310207n, aVar.o, aVar.f310208p, aVar.k, aVar.f310199a);
    }

    public static zrk.f D(ork.a aVar) {
        return new zrk.f(aVar.f229018b, aVar.f229026p, aVar.C, aVar.R, aVar.f229027q, aVar.f229020g, aVar.T);
    }

    public static b60.a a(eyd.c cVar) {
        b60.a aVar = (b60.a) cVar.f130722q.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a b(eyd.j0 j0Var) {
        b60.a aVar = (b60.a) j0Var.f130774p.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a c(eyd.c cVar) {
        b60.a aVar = (b60.a) cVar.f130722q.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a d(eyd.j0 j0Var) {
        b60.a aVar = (b60.a) j0Var.f130774p.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a e(q1e.b bVar) {
        b60.a aVar = (b60.a) bVar.f.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a f(q1e.b bVar) {
        b60.a aVar = (b60.a) bVar.f.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a g(q1e.b bVar) {
        b60.a aVar = (b60.a) bVar.f241426g.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a h(q1e.b bVar) {
        b60.a aVar = (b60.a) bVar.f241426g.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a i(jxd.h hVar) {
        b60.a aVar = (b60.a) hVar.f179162l.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a j(jxd.h hVar) {
        b60.a aVar = (b60.a) hVar.k.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a k(jxd.h hVar) {
        b60.a aVar = (b60.a) hVar.k.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a l(ork.a aVar) {
        b60.a aVar2 = (b60.a) aVar.S.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a m(ork.a aVar) {
        b60.a aVar2 = (b60.a) aVar.S.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a n(ork.a aVar) {
        b60.a aVar2 = (b60.a) aVar.U.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a o(ork.a aVar) {
        b60.a aVar2 = (b60.a) aVar.U.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a p(y0e.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f310209q.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a q(y0e.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f310209q.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a r(z1e.a aVar) {
        b60.a aVar2 = (b60.a) aVar.d.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a s(z1e.a aVar) {
        b60.a aVar2 = (b60.a) aVar.d.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static u0e.a t(b60.a aVar) {
        u0e.a aVar2 = (u0e.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static a2e.b u(b60.a aVar) {
        a2e.b bVar = (a2e.b) aVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static if0.a v(sqk.a aVar) {
        prk.a aVar2 = (prk.a) aVar;
        return new if0.a(ImmutableSet.of((od0.e) aVar2.i.get(), (od0.e) aVar2.f239045j.get(), (od0.e) aVar2.k.get(), (od0.e) aVar2.f239047m.get()));
    }

    public static if0.a w(u0e.a aVar) {
        a1e.b bVar = (a1e.b) aVar;
        return new if0.a(ImmutableSet.of((mfg.a) bVar.f596m.get(), (mfg.a) bVar.f597n.get(), new mfg.a(bVar.f, (StockLendingDatabase) bVar.o.get())));
    }

    public static if0.a x(a2e.b bVar) {
        bVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new ne0.d());
        return new if0.a(kii.e.C(bVar.f, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static if0.a y(vxd.b bVar) {
        eyd.b bVar2 = (eyd.b) bVar;
        return new if0.a(ImmutableSet.of((od0.e) bVar2.v.get(), (od0.e) bVar2.f130693t.get(), (od0.e) bVar2.f130696y.get()));
    }

    public static b60.a z(ork.a aVar) {
        b60.a aVar2 = (b60.a) aVar.S.get();
        vc.s.k(aVar2);
        return aVar2;
    }
}
