package lp;

import android.content.Context;
import com.revolut.feature.shared.vaults.domain.impl.data.database.TransactionsExtraDatabase;
import com.revolut.feature.shared.vaults.domain.impl.data.database.VaultsDatabase;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes17.dex */
public abstract class o7 implements e4m.e {
    public static ced.a A(ecm.q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, ecm.q qVar2, a31.a aVar5, a31.a aVar6) {
        return new ced.a(qVar, qVar2, aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static a31.a B(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a C(dgl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f114712b.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static dgl.a D(a31.a aVar) {
        return new dgl.a(aVar);
    }

    public static b60.a a(bid.a aVar) {
        b60.a aVar2 = (b60.a) aVar.D.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a b(bid.a aVar) {
        b60.a aVar2 = (b60.a) aVar.D.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a c(ced.a aVar) {
        b60.a aVar2 = (b60.a) aVar.i.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a d(ced.a aVar) {
        b60.a aVar2 = (b60.a) aVar.i.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a e(ehd.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a f(ehd.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a g(dgl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f114712b.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a h(dgl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f114712b.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a i(bid.a aVar) {
        b60.a aVar2 = (b60.a) aVar.B.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a j(bid.a aVar) {
        b60.a aVar2 = (b60.a) aVar.B.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a k(bid.a aVar) {
        b60.a aVar2 = (b60.a) aVar.E.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a l(hsb.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f155028b.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a m(hsb.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f155028b.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static vbd.c n(b60.a aVar) {
        vbd.c cVar = (vbd.c) aVar.b();
        vc.s.k(cVar);
        return cVar;
    }

    public static ndd.b o(b60.a aVar) {
        ndd.b bVar = (ndd.b) aVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static egl.a p(b60.a aVar) {
        egl.a aVar2 = (egl.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static if0.a q(xbd.c cVar) {
        xbd.b bVar = (xbd.b) cVar;
        bVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(bVar.f304052h, "Set contributions cannot be null", arrayList);
        return new if0.a(kii.e.C(bVar.i, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static if0.a r(vbd.c cVar) {
        vbd.b bVar = (vbd.b) cVar;
        bVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(bVar.f287506j, "Set contributions cannot be null", arrayList);
        return new if0.a(kii.e.C(bVar.f287505h, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static b60.a s(wbd.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f296134g.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static a31.a t(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a u(wbd.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static a31.a v(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static wbd.a w(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, ecm.q qVar) {
        return new wbd.a(aVar, aVar2, aVar3, aVar4, qVar);
    }

    public static a31.a x(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a y(ced.a aVar) {
        b60.a aVar2 = (b60.a) aVar.i.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static if0.a z(ndd.b bVar) {
        ded.a aVar = (ded.a) bVar;
        aVar.getClass();
        e4m.f fVar = new e4m.f(6);
        Context context = aVar.f113388c;
        fVar.a(new mfg.a(context, (VaultsDatabase) aVar.k.get()));
        fVar.a(new mfg.a(context, (TransactionsExtraDatabase) aVar.f113393m.get()));
        fVar.a(aVar.f113397r.get());
        fVar.a(aVar.o.get());
        fVar.a(aVar.f113395p.get());
        fVar.a(aVar.f113396q.get());
        return new if0.a(fVar.c());
    }
}
