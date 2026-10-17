package lp;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public abstract class n implements e4m.e {
    public static b60.a A(crb.a aVar) {
        b60.a aVarA = aVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static if0.a B(zse.d dVar) {
        dVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        CoroutineScope coroutineScope = (CoroutineScope) dVar.d.get();
        zse.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        arrayList.add(new hsh.a(coroutineScope, 6, false));
        return new if0.a(kii.e.C(dVar.e, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static if0.a C(xse.a aVar) {
        return new if0.a(ImmutableSet.of((od0.e) ((drb.a) aVar).d.get()));
    }

    public static b60.a a(op.c cVar) {
        b60.a aVar = (b60.a) cVar.f227151a.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a b(sp.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f264852a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a c(sp.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f264852a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a d(ij2.b bVar) {
        b60.a aVar = (b60.a) bVar.f161672b.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a e(ij2.b bVar) {
        b60.a aVar = (b60.a) bVar.f161672b.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a f(xp.b bVar) {
        b60.a aVar = (b60.a) bVar.f307871c.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a g(wse.c cVar) {
        b60.a aVar = (b60.a) cVar.e.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a h(wse.c cVar) {
        b60.a aVar = (b60.a) cVar.e.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a i(crb.a aVar) {
        b60.a aVarA = aVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static b60.a j(crb.a aVar) {
        b60.a aVarA = aVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static b60.a k(erb.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f128630a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a l(erb.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f128630a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a m(p41.c cVar) {
        b60.a aVar = (b60.a) cVar.f232805b.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a n(p41.c cVar) {
        b60.a aVar = (b60.a) cVar.f232805b.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static yi2.a o(b60.a aVar) {
        yi2.a aVar2 = (yi2.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static op.b p(b60.a aVar) {
        op.b bVar = (op.b) aVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static ij2.a q(b60.a aVar) {
        ij2.a aVar2 = (ij2.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static xse.a r(b60.a aVar) {
        xse.a aVar2 = (xse.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a s(op.c cVar) {
        b60.a aVar = (b60.a) cVar.f227151a.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a t(xi2.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f306298b.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static a31.a u(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static xi2.a v(ecm.q qVar) {
        return new xi2.a(qVar);
    }

    public static a31.a w(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static a31.a x(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a y(ij2.b bVar) {
        b60.a aVar = (b60.a) bVar.f161672b.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static ij2.b z(ecm.q qVar) {
        return new ij2.b(qVar);
    }
}
