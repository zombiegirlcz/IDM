package uq3;

import android.content.Context;
import com.revolut.feature.credit.application.impl.network.CreditEntryPointsService;
import com.revolut.feature.credit.application.impl.network.CreditExternalClientMonitoringService;
import com.revolut.feature.credit.application.impl.network.CreditLimitIncreaseService;
import com.revolut.feature.credit.application.impl.network.CreditOnboardingService;
import cr3.n;
import e4m.e;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import ne0.d;
import okhttp3.OkHttpClient;
import qr3.f;
import retrofit2.Retrofit;
import sf0.h;
import va.g;
import vc.s;
import ve0.c;
import xj0.i;
import xq3.j;
import xq3.q;
import xq3.r;
import xq3.t;
import xq3.w;
import xq3.z;
import xr3.f0;
import xr3.g0;
import xr3.k;
import xr3.l;
import xr3.u;
import xr3.y;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f282080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f282081b;

    public a(b bVar, int i) {
        this.f282080a = bVar;
        this.f282081b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f282080a;
        int i = this.f282081b;
        switch (i) {
            case 0:
                return new y(new d());
            case 1:
                return new j((k) bVar.f282103y.get(), (l) bVar.z.get(), (up3.b) bVar.B.get());
            case 2:
                bVar.getClass();
                p pVarA = b.a();
                CreditOnboardingService creditOnboardingService = (CreditOnboardingService) bVar.f282102x.get();
                d dVar = new d();
                c cVarC = bVar.c();
                h hVarB = bVar.d.b();
                s.j(hVarB);
                ze0.a aVarA = bVar.f282082a.a();
                s.j(aVarA);
                return new k(pVarA, creditOnboardingService, dVar, cVarC, hVarB, aVarA);
            case 3:
                vq3.a aVar = bVar.f282084b;
                CreditOnboardingService creditOnboardingService2 = (CreditOnboardingService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.f282101w.get(), "retrofit", CreditOnboardingService.class, "create(...)");
                s.k(creditOnboardingService2);
                return creditOnboardingService2;
            case 4:
                vq3.a aVar2 = bVar.f282084b;
                Retrofit retrofitJ = ((c21.b) bVar.f282086c).j();
                s.j(retrofitJ);
                o oVar = (o) bVar.v.get();
                return j6.a.B(p.a.x(retrofitJ, "retrofit", oVar, "gson"), oVar, "build(...)");
            case 5:
                o gson = ((c21.b) bVar.f282086c).h();
                s.j(gson);
                vq3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(gson, "gson");
                kg.p pVar = new kg.p(gson);
                Intrinsics.checkNotNullExpressionValue(pVar, "newBuilder(...)");
                kt3.a.a(pVar);
                pVar.e.add(f.a());
                o oVarB = pVar.b();
                Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                return oVarB;
            case 6:
                return new l((CreditOnboardingService) bVar.f282102x.get(), new n());
            case 7:
                xq3.y yVar = (xq3.y) bVar.A.get();
                jla.h hVarA = bVar.e.a();
                xoj.a aVarA2 = bVar.f.a();
                s.j(aVarA2);
                gte.a aVarB = bVar.f282089g.b();
                s.j(aVarB);
                return new q(yVar, hVarA, aVarA2, aVarB);
            case 8:
                return new xq3.y();
            case 9:
                bq3.a aVar3 = (bq3.a) bVar.E.get();
                xoj.a aVarA3 = bVar.f.a();
                s.j(aVarA3);
                return new t(aVar3, aVarA3);
            case 10:
                bVar.getClass();
                return new u(b.a(), (CreditLimitIncreaseService) bVar.D.get(), new d(), bVar.c());
            case 11:
                return g.m(bVar.f282084b, (Retrofit) bVar.f282101w.get());
            case 12:
                return new xq3.c((k) bVar.f282103y.get(), (xr3.n) bVar.J.get());
            case 13:
                return new xr3.n((CreditExternalClientMonitoringService) bVar.I.get());
            case 14:
                return g.l(bVar.f282090h, (Retrofit) bVar.H.get());
            case 15:
                vq3.e eVar = bVar.f282090h;
                ik0.b bVarM = ((nj0.d) bVar.i).m();
                s.j(bVarM);
                return vq3.f.a(eVar, bVarM, (OkHttpClient) bVar.G.get(), vq3.g.a(bVar.f282090h));
            case 16:
                vq3.e eVar2 = bVar.f282090h;
                i iVarL = ((nj0.d) bVar.i).l();
                s.j(iVarL);
                return g.p(eVar2, iVarL);
            case 17:
                return new xq3.d((xr3.e) bVar.L.get());
            case 18:
                return new xr3.e((CreditOnboardingService) bVar.f282102x.get());
            case 19:
                k kVar = (k) bVar.f282103y.get();
                lx0.j jVarA = kqi.b.a(bVar.f282092j);
                j jVar = (j) bVar.C.get();
                ffk.t tVarF = bVar.k.f();
                s.j(tVarF);
                sh3.a aVarA4 = bVar.f282093l.a();
                s.j(aVarA4);
                jla.h hVarA2 = bVar.e.a();
                gte.a aVarB2 = bVar.f282089g.b();
                s.j(aVarB2);
                return new yq3.b(kVar, jVarA, jVar, tVarF, aVarA4, hVarA2, aVarB2);
            case 20:
                return new ar3.c(bVar.f282095n.a(), bVar.f282094m.b());
            case 21:
                return new xq3.k();
            case 22:
                return new w((f0) bVar.Q.get());
            case 23:
                CreditOnboardingService creditOnboardingService3 = (CreditOnboardingService) bVar.f282102x.get();
                d dVar2 = new d();
                c cVarC2 = bVar.c();
                ze0.a aVarA5 = bVar.f282082a.a();
                s.j(aVarA5);
                return new f0(creditOnboardingService3, dVar2, cVarC2, aVarA5);
            case 24:
                return new zq3.a((yr3.b) bVar.T.get());
            case 25:
                return new yr3.b((CreditEntryPointsService) bVar.S.get(), new d(), bVar.c());
            case 26:
                return g.k(bVar.f282084b, (Retrofit) bVar.f282101w.get());
            case 27:
                return new qq3.g((qq3.h) bVar.V.get(), (xq3.c) bVar.K.get(), (rq3.d) bVar.W.get(), (rq3.e) bVar.X.get());
            case 28:
                return new qq3.i();
            case 29:
                th0.a aVar4 = bVar.o;
                Context context = bVar.f282092j;
                xg0.a aVarA6 = aVar4.a();
                s.j(aVarA6);
                w31.e eVarA = ((x31.a) bVar.f282096p).a();
                s.j(eVarA);
                return new rq3.d(new com.revolut.feature_credit_data_monitoring_sdk_proxy.b(aVarA6, context, eVarA), context);
            case 30:
                return new rq3.f();
            case 31:
                return new r((xr3.p) bVar.Z.get());
            case 32:
                return new xr3.p((CreditOnboardingService) bVar.f282102x.get(), new cr3.i());
            case 33:
                return new xq3.u((xr3.w) bVar.f282085b0.get());
            case 34:
                CreditOnboardingService creditOnboardingService4 = (CreditOnboardingService) bVar.f282102x.get();
                d dVar3 = new d();
                c cVarC3 = bVar.c();
                ze0.a aVarA7 = bVar.f282082a.a();
                s.j(aVarA7);
                return new xr3.w(creditOnboardingService4, dVar3, cVarC3, aVarA7);
            case 35:
                return new z((g0) bVar.f282087d0.get());
            case 36:
                return new g0((CreditOnboardingService) bVar.f282102x.get());
            case 37:
                return new wr3.f(bVar.f282092j);
            case 38:
                s70.a aVarM = bVar.f282098r.m();
                s.j(aVarM);
                return new wr3.e(aVarM);
            case 39:
                gte.a aVarB3 = bVar.f282089g.b();
                s.j(aVarB3);
                return new wr3.b(aVarB3);
            case 40:
                return new wr3.d();
            default:
                throw new AssertionError(i);
        }
    }
}
