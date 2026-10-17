package lp;

import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public abstract class j9 implements e4m.e {
    public static a31.a A(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a B(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312710s.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static a31.a C(phm.a aVar) {
        return new a31.a(aVar);
    }

    public static b60.a D(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312707p.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a a(r8h.d dVar) {
        b60.a aVar = (b60.a) dVar.V.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a b(r8h.d dVar) {
        b60.a aVar = (b60.a) dVar.V.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a c(r8h.d dVar) {
        b60.a aVar = (b60.a) dVar.P.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a d(r8h.d dVar) {
        b60.a aVar = (b60.a) dVar.P.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a e(r8h.d dVar) {
        b60.a aVar = (b60.a) dVar.X.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a f(r8h.d dVar) {
        b60.a aVar = (b60.a) dVar.X.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a g(r8h.d dVar) {
        b60.a aVar = (b60.a) dVar.U.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a h(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312710s.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a i(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312710s.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a j(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312707p.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a k(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312707p.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static zdl.a l(b60.a aVar) {
        zdl.a aVar2 = (zdl.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static zdl.b m(b60.a aVar) {
        zdl.b bVar = (zdl.b) aVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static zdl.c n(b60.a aVar) {
        zdl.c cVar = (zdl.c) aVar.b();
        vc.s.k(cVar);
        return cVar;
    }

    public static zdl.e o(b60.a aVar) {
        zdl.e eVar = (zdl.e) aVar.b();
        vc.s.k(eVar);
        return eVar;
    }

    public static zdl.f p(b60.a aVar) {
        zdl.f fVar = (zdl.f) aVar.b();
        vc.s.k(fVar);
        return fVar;
    }

    public static if0.a q(zdl.a aVar) {
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(aVar.e, "Set contributions cannot be null", arrayList);
        return new if0.a(kii.e.C(aVar.f321531g, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static if0.d r(zdl.b bVar) {
        return new if0.d(Collections.singleton((od0.e) bVar.f321537g.get()));
    }

    public static if0.a s(zdl.c cVar) {
        cVar.getClass();
        e4m.f fVar = new e4m.f(15);
        fVar.a(cVar.f321554n.get());
        rcl.a aVar = rcl.b.Companion;
        aVar.getClass();
        fVar.a(new ne0.d());
        fVar.a(cVar.o.get());
        aVar.getClass();
        fVar.a(new ne0.d());
        fVar.a(cVar.f321557p.get());
        fVar.a(cVar.f321558q.get());
        fVar.a(cVar.f321559r.get());
        fVar.a(cVar.f321561s.get());
        fVar.a(cVar.f321563t.get());
        fVar.a(cVar.u.get());
        fVar.a(cVar.v.get());
        fVar.a(cVar.f321566w.get());
        fVar.a(cVar.f321568x.get());
        fVar.a(cVar.z.get());
        fVar.a(new ahl.a(cVar.d, (WealthDomainDatabase) cVar.A.get()));
        return new if0.a(fVar.c());
    }

    public static if0.d t(zdl.f fVar) {
        fVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        CoroutineScope scope = (CoroutineScope) fVar.f321585p.get();
        rcl.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(scope, "scope");
        arrayList.add(new efk.b(scope, 2));
        ue0.c storage = (ue0.c) fVar.f321581j.get();
        acl.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        vc.s.k(storage);
        arrayList.add(storage);
        return new if0.d(arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static b60.a u(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312708q.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static a31.a v(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a w(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312704l.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static a31.a x(phm.a aVar) {
        return new a31.a(aVar);
    }

    public static b60.a y(ydl.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f312706n.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static ydl.a z(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, ecm.q qVar) {
        return new ydl.a(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, qVar);
    }
}
