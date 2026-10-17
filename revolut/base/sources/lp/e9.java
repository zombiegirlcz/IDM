package lp;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.account_closure.impl.data.database.WealthAccountClosureDatabase;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import com.revolut.feature.wealth.analytics.insights.repository.database.PortfolioInsightsDatabase;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes17.dex */
public abstract class e9 implements e4m.e {
    public static b60.a A(ngl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static ngl.a B(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5) {
        return new ngl.a(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static a31.a C(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a D(cwg.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f109608a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a a(gvg.c cVar) {
        b60.a aVar = (b60.a) cVar.e.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a b(gvg.c cVar) {
        b60.a aVar = (b60.a) cVar.e.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a c(ftg.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a d(ftg.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a e(ytg.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f316809n.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a f(ytg.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f316809n.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a g(n4f.b bVar) {
        b60.a aVar = (b60.a) bVar.f212432a.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a h(n4f.b bVar) {
        b60.a aVar = (b60.a) bVar.f212432a.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a i(ngl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a j(ngl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a k(fwg.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f138638a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a l(fwg.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f138638a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a m(fwg.b bVar) {
        b60.a aVar = (b60.a) bVar.z.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a n(fwg.b bVar) {
        b60.a aVar = (b60.a) bVar.z.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a o(cwg.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f109608a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a p(cwg.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f109608a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static n4f.a q(b60.a aVar) {
        n4f.a aVar2 = (n4f.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static ogl.a r(b60.a aVar) {
        ogl.a aVar2 = (ogl.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static dwg.a s(b60.a aVar) {
        dwg.a aVar2 = (dwg.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static if0.a t(gtg.a aVar) {
        return new if0.a(ImmutableSet.of((od0.e) aVar.f146608g.get()));
    }

    public static if0.a u(ztg.n nVar) {
        return new if0.a(ImmutableSet.of((od0.e) new mfg.a(nVar.d, (WealthAccountClosureDatabase) nVar.f325159r.get()), (od0.e) nVar.u.get(), (od0.e) nVar.f325158q.get()));
    }

    public static if0.a v(ogl.a aVar) {
        aVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(aVar.f, "Set contributions cannot be null", arrayList);
        return new if0.a(kii.e.C(aVar.f225199g, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static if0.a w(ewg.p pVar) {
        ewg.h hVar = (ewg.h) pVar;
        od0.e eVar = (od0.e) hVar.B.get();
        od0.e eVar2 = (od0.e) hVar.O.get();
        od0.e eVar3 = (od0.e) hVar.m0.get();
        Context context = hVar.e;
        return new if0.a(ImmutableSet.of((ne0.d) eVar, (ne0.d) eVar2, (ne0.d) eVar3, (ne0.d) new ahl.a(context, (WealthAnalyticsDatabase) hVar.C.get()), (ne0.d) new mfg.a(context, (PortfolioInsightsDatabase) hVar.f130206n0.get()), uwg.c.a(), (ne0.d[]) new od0.e[0]));
    }

    public static a31.a x(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a y(n4f.b bVar) {
        b60.a aVar = (b60.a) bVar.f212432a.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static a31.a z(p1 p1Var) {
        return new a31.a(p1Var);
    }
}
