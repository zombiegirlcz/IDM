package ove;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.data.network.services.ExternalCardsService;
import com.revolut.data.network.services.TopupService;
import com.revolut.feature.topup_screen.impl.data.network.service.RevertTransferService;
import com.revolut.feature.topup_screen.impl.data.network.service.StoredMethodService;
import com.revolut.feature.topup_screen.impl.data.network.service.TopUpLimitsService;
import com.revolut.feature.topup_screen.impl.flows.checkout.post_activation.network.PostActivationService;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes13.dex */
public final class s implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f230116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f230117b;

    public s(t tVar, int i) {
        this.f230116a = tVar;
        this.f230117b = i;
    }

    @Override // phm.a
    public final Object get() {
        t tVar = this.f230116a;
        int i = this.f230117b;
        switch (i) {
            case 0:
                sri.m mVarD = ((g8b.a) tVar.f230118a).d();
                vc.s.j(mVarD);
                return new nve.c(mVarD);
            case 1:
                return new mve.c(ImmutableSet.of((nve.b) new nve.a(), (nve.b) new aac.a((vte.a) tVar.X.get()), new nve.b()));
            case 2:
                y51.a aVar = (y51.a) tVar.U.get();
                fk3.a aVarA = tVar.f230136q.a();
                vc.s.j(aVarA);
                wsg.n nVarB = tVar.f230125g.b();
                ng0.b bVar = (ng0.b) tVar.W.get();
                w71.b bVar2 = (w71.b) tVar.S.get();
                mt8.d dVarB = tVar.f230138s.b();
                vc.s.j(dVarB);
                gte.a aVarB = tVar.f230131m.b();
                vc.s.j(aVarB);
                ang.f fVarE = tVar.f230126h.e();
                xoj.a aVarA2 = tVar.f230139t.a();
                vc.s.j(aVarA2);
                return new e0f.v0(aVar, aVarA, nVarB, bVar, bVar2, dVarB, aVarB, fVarE, aVarA2);
            case 3:
                p71.a aVar2 = (p71.a) tVar.N.get();
                wsg.n nVarB2 = tVar.f230125g.b();
                ang.f fVarE2 = tVar.f230126h.e();
                wwh.a aVarB2 = tVar.i.b();
                vc.s.j(aVarB2);
                sh3.a aVarA3 = tVar.f230128j.a();
                vc.s.j(aVarA3);
                dha.c cVarI = tVar.k.i();
                vc.s.j(cVarI);
                l93.f fVarJ = tVar.f230130l.j();
                vc.s.j(fVarJ);
                gte.a aVarB3 = tVar.f230131m.b();
                vc.s.j(aVarB3);
                lfm.c cVarB = ((g8b.a) tVar.f230118a).b();
                vc.s.j(cVarB);
                return new e0f.z(aVar2, nVarB2, fVarE2, aVarB2, aVarA3, cVarI, fVarJ, aVarB3, cVarB, (e0f.i) tVar.T.get());
            case 4:
                return new u21.k((ExternalCardsService) tVar.J.get(), (ue0.c) tVar.K.get(), (ne0.j) tVar.L.get(), (wze.b) tVar.M.get(), tVar.f.c());
            case 5:
                w0 w0Var = tVar.f230120b;
                ExternalCardsService externalCardsService = (ExternalCardsService) v0.a.f((c21.b) tVar.f230122c, "retrofit", ExternalCardsService.class, "create(...)");
                vc.s.k(externalCardsService);
                return externalCardsService;
            case 6:
                je0.d mapper = tVar.d.b();
                vc.s.j(mapper);
                yk0.a databaseSecurityProvider = tVar.e.b();
                vc.s.j(databaseSecurityProvider);
                xe0.f storageFactory = tVar.d.f();
                vc.s.j(storageFactory);
                m0.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSecurityProvider, "external_card", mapper, 2, zhm.u.c(new exa.a(1, 2, 5)), 32);
            case 7:
                return new ne0.d();
            case 8:
                return new wze.b(tVar.f.c());
            case 9:
                return new e0f.i((p71.a) tVar.N.get(), (w71.b) tVar.S.get());
            case 10:
                ue0.c cVar = (ue0.c) tVar.O.get();
                lfm.c cVar2 = (lfm.c) ((c21.b) tVar.f230122c).U.get();
                vc.s.j(cVar2);
                TopupService topupService = (TopupService) tVar.R.get();
                zk0.b bVarL = tVar.o.l();
                vc.s.j(bVarL);
                CoroutineScope coroutineScopeA = tVar.f230135p.a();
                vc.s.j(coroutineScopeA);
                return new e31.j(cVar, cVar2, topupService, bVarL, coroutineScopeA);
            case 11:
                je0.d mapper2 = tVar.d.b();
                vc.s.j(mapper2);
                yk0.a databaseSecurityProvider2 = tVar.e.b();
                vc.s.j(databaseSecurityProvider2);
                xe0.f storageFactory2 = tVar.d.f();
                vc.s.j(storageFactory2);
                m0.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(databaseSecurityProvider2, "databaseSecurityProvider");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.f(storageFactory2, databaseSecurityProvider2, "global", mapper2, 3, zhm.v.k(new m21.a(), new m21.b()), 32);
            case 12:
                w0 w0Var2 = tVar.f230120b;
                TopupService topupService2 = (TopupService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) tVar.Q.get(), "retrofit", TopupService.class, "create(...)");
                vc.s.k(topupService2);
                return topupService2;
            case 13:
                w0 w0Var3 = tVar.f230120b;
                ik0.b retrofitFactory = ((nj0.d) tVar.f230132n).m();
                vc.s.j(retrofitFactory);
                OkHttpClient okHttpClient = (OkHttpClient) tVar.P.get();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
                Retrofit retrofitA = ik0.b.a(retrofitFactory, okHttpClient, null, null, null, 30);
                vc.s.k(retrofitA);
                return retrofitA;
            case 14:
                w0 w0Var4 = tVar.f230120b;
                xj0.i okHttpClientFactory = ((nj0.d) tVar.f230132n).l();
                vc.s.j(okHttpClientFactory);
                Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
                return xj0.i.a(okHttpClientFactory, null, true, false, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            case 15:
                return new vze.a((yze.a) tVar.V.get());
            case 16:
                Context context = tVar.f230137r;
                th0.h.a();
                ni0.d dVar = new ni0.d();
                ni0.k kVar = new ni0.k();
                ni0.b bVar3 = new ni0.b();
                gte.a aVarB4 = tVar.f230131m.b();
                vc.s.j(aVarB4);
                return new yze.c(context, dVar, kVar, bVar3, aVarB4);
            case 17:
                p71.a aVar3 = (p71.a) tVar.N.get();
                wsg.n nVarB3 = tVar.f230125g.b();
                vte.a aVar4 = (vte.a) tVar.X.get();
                wwh.a aVarB5 = tVar.i.b();
                vc.s.j(aVarB5);
                sh3.a aVarA4 = tVar.f230128j.a();
                vc.s.j(aVarA4);
                l93.f fVarJ2 = tVar.f230130l.j();
                vc.s.j(fVarJ2);
                dha.c cVarI2 = tVar.k.i();
                vc.s.j(cVarI2);
                lfm.c cVarB2 = ((g8b.a) tVar.f230118a).b();
                vc.s.j(cVarB2);
                return new r10.r(aVar3, nVarB3, aVar4, aVarB5, aVarA4, fVarJ2, cVarI2, cVarB2);
            case 18:
                oe6.a aVarA5 = tVar.u.a();
                vc.s.j(aVarA5);
                return new rve.i(aVarA5, (gve.b) tVar.f230119a0.get());
            case 19:
                return new gve.b((StoredMethodService) tVar.Z.get());
            case 20:
                return olc.c.t(((nj0.d) tVar.f230132n).f());
            case 21:
                je0.d dVarB2 = tVar.d.b();
                vc.s.j(dVarB2);
                yk0.a aVarB6 = tVar.e.b();
                vc.s.j(aVarB6);
                xe0.f fVarF = tVar.d.f();
                vc.s.j(fVarF);
                return olc.c.k(dVarB2, fVarF, aVarB6);
            case 22:
                return new zwe.a((axe.b) tVar.f0.get());
            case 23:
                return new axe.b((PostActivationService) tVar.f230123d0.get(), (ne0.j) tVar.L.get(), (ue0.c) tVar.f230124e0.get());
            case 24:
                ik0.b bVarM = ((nj0.d) tVar.f230132n).m();
                vc.s.j(bVarM);
                return ywe.c.a(((nj0.d) tVar.f230132n).d(), bVarM);
            case 25:
                je0.d dVarD = tVar.d.d();
                vc.s.j(dVarD);
                yk0.a aVarB7 = tVar.e.b();
                vc.s.j(aVarB7);
                xe0.f fVarF2 = tVar.d.f();
                vc.s.j(fVarF2);
                return yf6.b.q(dVarD, fVarF2, aVarB7);
            case 26:
                sf0.h hVarB = tVar.v.b();
                vc.s.j(hVarB);
                v60.e eVarA = tVar.f230140w.a();
                vc.s.j(eVarA);
                return new c1f.a(hVarB, eVarA);
            case 27:
                return new xve.d(tVar.f230125g.b(), (eve.b) tVar.f230129k0.get());
            case 28:
                return new eve.b((TopUpLimitsService) tVar.i0.get(), new lue.b(), new lue.d(), new lue.f(), (ne0.j) tVar.L.get(), (ue0.c) tVar.j0.get());
            case 29:
                return olc.c.u(((nj0.d) tVar.f230132n).f());
            case 30:
                je0.d dVarB3 = tVar.d.b();
                vc.s.j(dVarB3);
                yk0.a aVarB8 = tVar.e.b();
                vc.s.j(aVarB8);
                xe0.f fVarF3 = tVar.d.f();
                vc.s.j(fVarF3);
                return olc.c.h(dVarB3, fVarF3, aVarB8);
            case 31:
                je0.d mapper3 = tVar.d.b();
                vc.s.j(mapper3);
                yk0.a databaseSecurityProvider3 = tVar.e.b();
                vc.s.j(databaseSecurityProvider3);
                xe0.f storageFactory3 = tVar.d.f();
                vc.s.j(storageFactory3);
                m0.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper3, "mapper");
                Intrinsics.checkNotNullParameter(databaseSecurityProvider3, "databaseSecurityProvider");
                Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                return xe0.f.f(storageFactory3, databaseSecurityProvider3, "ideal_issuer", mapper3, 0, null, 56);
            case 32:
                cpf.b bVarE = tVar.B.e();
                vc.s.j(bVarE);
                return new pze.a(bVarE, (c1f.e) tVar.f230133n0.get());
            case 33:
                mt8.a aVarA6 = tVar.f230138s.a();
                vc.s.j(aVarA6);
                sze.f fVar = new sze.f(aVarA6);
                gte.a aVarB9 = tVar.f230131m.b();
                vc.s.j(aVarB9);
                q06.l lVarA = tVar.C.a();
                vc.s.j(lVarA);
                bze.b bVar4 = new bze.b(aVarB9, lVarA);
                v60.e eVarA2 = tVar.f230140w.a();
                vc.s.j(eVarA2);
                com.revolut.feature.external_accounts.api.navigation.a aVarB10 = ((xf6.t) tVar.D).b();
                vc.s.j(aVarB10);
                return new c1f.g(fVar, bVar4, eVarA2, aVarB10);
            case 34:
                return new fve.a((RevertTransferService) tVar.p0.get());
            case 35:
                w0 w0Var5 = tVar.f230120b;
                Retrofit retrofitI = ((c21.b) tVar.f230122c).i();
                vc.s.j(retrofitI);
                return olc.c.r(w0Var5, retrofitI);
            case 36:
                return new zjh.c((TopupService) tVar.R.get());
            default:
                throw new AssertionError(i);
        }
    }
}
