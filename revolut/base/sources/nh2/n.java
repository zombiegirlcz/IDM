package nh2;

import com.revolut.feature.apm.wero.impl.data.WeroPayService;
import hy1.m0;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f215311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f215312b;

    public n(o oVar, int i) {
        this.f215311a = oVar;
        this.f215312b = i;
    }

    @Override // phm.a
    public final Object get() {
        o oVar = this.f215311a;
        int i = this.f215312b;
        switch (i) {
            case 0:
                return new kh2.a();
            case 1:
                qh2.a aVarA = oVar.f215314b.a();
                vc.s.j(aVarA);
                return new rs1.c(aVarA, oVar.a());
            case 2:
                qh2.a aVarA2 = oVar.f215314b.a();
                vc.s.j(aVarA2);
                return new sh2.j(aVarA2);
            case 3:
                kz9.a aVarA3 = oVar.f.a();
                vc.s.j(aVarA3);
                fh2.a aVar = (fh2.a) oVar.f215316g.d.get();
                vc.s.j(aVar);
                return new sh2.c(aVarA3, aVar);
            case 4:
                qh2.a aVarA4 = oVar.f215314b.a();
                vc.s.j(aVarA4);
                m0 m0Var = (m0) ((ey1.e) oVar.f215317h).P.get();
                vc.s.j(m0Var);
                sh2.d dVar = new sh2.d((c12.f) oVar.f215328x.get());
                fh2.a aVar2 = (fh2.a) oVar.f215316g.d.get();
                vc.s.j(aVar2);
                return new sh2.s(aVarA4, m0Var, dVar, aVar2);
            case 5:
                return new ih2.c((WeroPayService) oVar.A.get());
            case 6:
                k kVar = oVar.f215318j;
                WeroPayService weroPayService = (WeroPayService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) oVar.z.get(), "retrofit", WeroPayService.class, "create(...)");
                vc.s.k(weroPayService);
                return weroPayService;
            case 7:
                k kVar2 = oVar.f215318j;
                ik0.b factory = ((nj0.d) oVar.e).m();
                vc.s.j(factory);
                kg.o gson = ((c21.b) oVar.k).h();
                vc.s.j(gson);
                Intrinsics.checkNotNullParameter(gson, "gson");
                kg.p pVar = new kg.p(gson);
                he0.m mVarB = he0.m.b(jh2.j.class, "action");
                mVarB.c(jh2.g.class, "CHAT");
                mVarB.c(jh2.h.class, "PAY");
                mVarB.c(jh2.f.class, "AUTHORISATION");
                mVarB.c(jh2.i.class, "REDIRECTION");
                Intrinsics.checkNotNullExpressionValue(mVarB, "registerSubtype(...)");
                pVar.e.add(mVarB);
                kg.o gson2 = pVar.b();
                Intrinsics.checkNotNullExpressionValue(gson2, "create(...)");
                Intrinsics.checkNotNullParameter(gson2, "gson");
                GsonConverterFactory converterFactory = GsonConverterFactory.create(gson2);
                Intrinsics.checkNotNullExpressionValue(converterFactory, "create(...)");
                vc.s.k(converterFactory);
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Retrofit retrofitA = ik0.b.a(factory, null, null, converterFactory, null, 27);
                vc.s.k(retrofitA);
                return retrofitA;
            case 8:
                uy1.b factory2 = ((lz1.m) oVar.f215313a).b();
                vc.s.j(factory2);
                j.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                zz1.h.Companion.getClass();
                return factory2.a(zz1.h.f326491n);
            case 9:
                s70.a aVarM = oVar.i.m();
                vc.s.j(aVarM);
                y80.a aVarR = oVar.i.r();
                vc.s.j(aVarR);
                return new pn3.b(aVarM, aVarR);
            case 10:
                h12.h hVarF = oVar.f215321n.f();
                vc.s.j(hVarF);
                return new sh2.t(hVarF);
            case 11:
                qh2.a aVarA5 = oVar.f215314b.a();
                vc.s.j(aVarA5);
                a12.v vVar = (a12.v) oVar.f215321n.F.get();
                vc.s.j(vVar);
                thf.g gVarE = oVar.f215322p.e();
                vc.s.j(gVarE);
                return new sh2.v(aVarA5, vVar, new xh2.b(gVarE));
            case 12:
                oz1.j jVarG = ((lz1.m) oVar.f215313a).g();
                e eVar = (e) oVar.f215314b.f.get();
                vc.s.j(eVar);
                return new sh2.f(jVarG, eVar);
            case 13:
                oz1.j jVarG2 = ((lz1.m) oVar.f215313a).g();
                e eVar2 = (e) oVar.f215314b.f.get();
                vc.s.j(eVar2);
                return new sh2.m(jVarG2, eVar2);
            default:
                throw new AssertionError(i);
        }
    }
}
