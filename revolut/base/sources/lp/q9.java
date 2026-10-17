package lp;

import com.google.common.collect.ImmutableSet;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.transfer.core.impl.quotes.data.network.TransferQuoteService;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes17.dex */
public abstract class q9 implements e4m.e {
    public static b60.a A(pth.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f239687t.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static pth.a B(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19) {
        return new pth.a(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19);
    }

    public static zgi.e C(a31.a aVar, ecm.q qVar) {
        return new zgi.e(aVar, qVar);
    }

    public static a31.a D(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a a(nvh.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f219698c.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a b(nvh.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f219698c.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a c(hsh.c cVar) {
        b60.a aVar = (b60.a) cVar.f.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a d(hsh.c cVar) {
        b60.a aVar = (b60.a) cVar.f.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a e(nab.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a f(nab.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a g(pth.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f239687t.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a h(pth.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f239687t.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a i(ath.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f9083a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a j(ath.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f9083a.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a k(fvh.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a l(fvh.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a m(zgi.e eVar) {
        b60.a aVar = (b60.a) eVar.f322137c.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a n(zgi.e eVar) {
        b60.a aVar = (b60.a) eVar.f322137c.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static oab.a o(b60.a aVar) {
        oab.a aVar2 = (oab.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static qth.g p(b60.a aVar) {
        qth.g gVar = (qth.g) aVar.b();
        vc.s.k(gVar);
        return gVar;
    }

    public static kg.o q(lpf.g0 g0Var) {
        kg.o oVarA = GsonHolder.a();
        oVarA.getClass();
        kg.p pVar = new kg.p(oVarA);
        pVar.c(new tpf.a(), upf.k.class);
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static Retrofit r(lpf.g0 g0Var, Retrofit retrofit, kg.o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static if0.a s(oab.a aVar) {
        aVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(aVar.e, "Set contributions cannot be null", arrayList);
        return new if0.a(kii.e.C(aVar.f, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList));
    }

    public static if0.a t(gvh.a aVar) {
        return new if0.a(ImmutableSet.of((od0.e) aVar.f147168h.get()));
    }

    public static if0.a u(hsh.b bVar) {
        return new if0.a(ImmutableSet.of((hsh.a) bVar.f.get(), new hsh.a((CoroutineScope) bVar.f155051g.get(), 0)));
    }

    public static TransferQuoteService v(lpf.g0 g0Var, Retrofit retrofit) {
        TransferQuoteService transferQuoteService = (TransferQuoteService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", TransferQuoteService.class, "create(...)");
        vc.s.k(transferQuoteService);
        return transferQuoteService;
    }

    public static a31.a w(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a x(nab.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static nab.a y(a31.a aVar, a31.a aVar2, a31.a aVar3, ecm.q qVar) {
        return new nab.a(aVar, aVar2, aVar3, qVar);
    }

    public static a31.a z(p1 p1Var) {
        return new a31.a(p1Var);
    }
}
