package lp;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public abstract class z4 implements e4m.e {
    public static a31.a A(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a B(ud0.c cVar) {
        b60.a aVar = (b60.a) cVar.d.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static ud0.c C(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new ud0.c(aVar, aVar2, aVar3);
    }

    public static v0j.a D(a31.a aVar, ecm.q qVar, ecm.q qVar2, ecm.q qVar3) {
        return new v0j.a(aVar, qVar, qVar2, qVar3);
    }

    public static b60.a a(ooi.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f227131x.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a b(ooi.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f227131x.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a c(v0j.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a d(zza.e eVar) {
        b60.a aVarA = eVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    public static b60.a e(e1b.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f121944j.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a f(e1b.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f121944j.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a g(ud0.c cVar) {
        b60.a aVar = (b60.a) cVar.d.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a h(ud0.c cVar) {
        b60.a aVar = (b60.a) cVar.d.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a i(iza.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f169862n.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a j(iza.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f169862n.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a k(iza.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f169860l.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a l(fqk.b bVar) {
        b60.a aVar = (b60.a) bVar.A.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a m(fqk.b bVar) {
        b60.a aVar = (b60.a) bVar.A.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a n(toi.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f273228a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a o(toi.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f273228a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static ymg.a p(b60.a aVar) {
        ymg.a aVar2 = (ymg.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static vd0.g q(b60.a aVar) {
        vd0.g gVar = (vd0.g) aVar.b();
        vc.s.k(gVar);
        return gVar;
    }

    public static jza.f r(iza.a aVar) {
        jza.f fVar = (jza.f) ((b60.a) aVar.f169860l.get()).b();
        vc.s.k(fVar);
        return fVar;
    }

    public static if0.d s(ymg.a aVar) {
        aVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(aVar.e, "Set contributions cannot be null", arrayList);
        return new if0.d(kii.e.C(aVar.d, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static if0.a t(jza.f fVar) {
        jza.b bVar = (jza.b) fVar;
        return new if0.a(ImmutableSet.of((od0.e) bVar.f179693l.get(), (od0.e) bVar.k.get()));
    }

    public static if0.a u(uza.a aVar) {
        ue0.c storage = (ue0.c) ((a0b.d) aVar).f310g.get();
        a0b.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        vc.s.k(storage);
        return new if0.a(Collections.singleton(storage));
    }

    public static if0.a v(poi.b bVar) {
        ue0.c storage = (ue0.c) bVar.C.get();
        Intrinsics.checkNotNullParameter(storage, "storage");
        vc.s.k(storage);
        ue0.c storage2 = (ue0.c) bVar.N.get();
        Intrinsics.checkNotNullParameter(storage2, "storage");
        vc.s.k(storage2);
        ue0.c storage3 = (ue0.c) bVar.U.get();
        Intrinsics.checkNotNullParameter(storage3, "storage");
        vc.s.k(storage3);
        return new if0.a(ImmutableSet.of((la1.a) storage, (la1.a) storage2, (la1.a) storage3, new la1.a((ifm.b) bVar.Z.get(), new hsh.a((CoroutineScope) bVar.f238041y.get(), 2), (no.y2) bVar.f238029o0.get(), (lo.d) bVar.X.get())));
    }

    public static a31.a w(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a x(wmg.a aVar) {
        b60.a aVar2 = (b60.a) aVar.d.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static a31.a y(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static wmg.a z(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new wmg.a(aVar, aVar2, aVar3);
    }
}
