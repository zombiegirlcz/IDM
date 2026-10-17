package a1j;

import afj.d4;
import afj.x3;
import afj.y3;
import android.content.Context;
import androidx.biometric.BiometricManager;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import bn0.a;
import c2d.i0;
import c2d.o0;
import c2d.x0;
import c2d.z;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cashback.impl.network.CashbackBoxService;
import com.revolut.feature.cashback.impl.network.CashbackService;
import com.revolut.feature.cashback.impl.network.CashbackStatusService;
import com.revolut.feature.checkout.impl.services.CheckoutService;
import com.revolut.feature.referrals.code.data.impl.service.ReferralCodeService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsPlanService;
import com.revolut.feature.revpro.card_reader.impl.repository.service.RevProRequirementsService;
import com.revolut.feature.trading.impl.data.database.TradingDatabase;
import com.revolut.feature.trading.impl.data.network.TradingTransactionsService;
import com.revolut.feature.transactions.impl.data.network.CryptoExchangeTransactionsService;
import com.revolut.feature.transactions.impl.data.network.DeFiTransactionsService;
import com.revolut.feature.transactions.impl.data.network.SavingsInterestTransactionsService;
import com.revolut.feature.transactions.impl.data.network.TransactionsService;
import com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase;
import com.revolut.retail.feature.esim.impl.network.EsimCheckoutService;
import com.revolut.retail.feature.esim.impl.network.EsimConfigurationService;
import com.revolut.retail.feature.esim.impl.network.EsimConnectEligibilityService;
import com.revolut.retail.feature.esim.impl.network.EsimDataPlanService;
import com.revolut.retail.feature.esim.impl.network.EsimEventsService;
import com.revolut.retail.feature.esim.impl.network.EsimFeedbackService;
import com.revolut.retail.feature.esim.impl.network.EsimGiftingService;
import com.revolut.retail.feature.esim.impl.network.EsimHelpService;
import com.revolut.retail.feature.esim.impl.network.EsimPhoneNumberCheckoutService;
import com.revolut.retail.feature.esim.impl.network.EsimPhoneNumberPortingService;
import com.revolut.retail.feature.esim.impl.network.EsimPhoneNumberService;
import com.revolut.retail.feature.esim.impl.network.EsimPlanOffersService;
import com.revolut.retail.feature.esim.impl.network.EsimProfilesService;
import com.revolut.retail.feature.esim.impl.network.EsimStatementsService;
import com.revolut.retail.feature.esim.impl.network.EsimSubscriptionsRefundQuoteService;
import com.revolut.retail.feature.esim.impl.network.EsimSubscriptionsService;
import com.revolut.retail.feature.esim.impl.network.EsimWidgetsConfigService;
import com.revolut.retail.feature.features.impl.network.FeaturesService;
import dfj.a1;
import dfj.b2;
import dfj.b5;
import dfj.c0;
import dfj.c1;
import dfj.d5;
import dfj.e5;
import dfj.f5;
import dfj.g0;
import dfj.g1;
import dfj.i1;
import dfj.k;
import dfj.k0;
import dfj.k4;
import dfj.l;
import dfj.l2;
import dfj.q1;
import dfj.q3;
import dfj.s3;
import dfj.v2;
import dfj.w;
import dfj.w1;
import dfj.x;
import dfj.x2;
import dfj.y0;
import dfj.z0;
import dfj.z2;
import dmc.h0;
import e4m.e;
import ffk.t;
import g48.r0;
import ifj.g;
import ika.f;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ljl.h2;
import mif.d0;
import ne0.j;
import nfj.a2;
import nfj.b0;
import nfj.f0;
import nfj.j0;
import nfj.m1;
import nfj.n1;
import nfj.p;
import nfj.q;
import nfj.s2;
import nfj.t2;
import nfj.u;
import nfj.u0;
import nfj.v;
import nfj.v0;
import nfj.v1;
import nfj.w2;
import nfj.y;
import nfj.z1;
import nj0.d;
import okhttp3.OkHttpClient;
import q7c.m;
import qgk.k3;
import qij.o;
import r10.r;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sf0.h;
import skm.p0;
import tof.e0;
import tof.hc;
import tof.m0;
import tof.r2;
import us6.w3;
import vc.s;
import vdl.t0;
import wsg.n;
import yej.c;
import ynj.i;
import z6e.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f641c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f639a = i2;
        this.f641c = obj2;
        this.f640b = i;
    }

    private final Object a() {
        afj.b bVar = (afj.b) this.f641c;
        int i = this.f640b;
        switch (i) {
            case 0:
                gte.a aVarB = bVar.f4120a.b();
                s.j(aVarB);
                return new c(ImmutableSet.of(new zej.c(aVarB, e4m.b.a(bVar.E), e4m.b.a(bVar.F), (z0) bVar.G.get(), e4m.b.a(bVar.H), e4m.b.a(bVar.I))), new xej.a(), (fej.b) bVar.F.get());
            case 1:
                oej.a aVarA = bVar.f4122b.a();
                s.j(aVarA);
                return aVarA;
            case 2:
                ite.a aVar = bVar.f4120a;
                f fVar = bVar.f4125c;
                gte.a aVarB2 = aVar.b();
                s.j(aVarB2);
                zja.a aVarA2 = ((ika.b) fVar).a();
                s.j(aVarA2);
                t tVarF = bVar.d.f();
                s.j(tVarF);
                return new ifj.f(aVarB2, aVarA2, new l2(tVarF, ((k3) bVar.e).b(), bVar.f.a()), ((ika.b) fVar).b());
            case 3:
                return new a1();
            case 4:
                gte.a aVarB3 = bVar.f4120a.b();
                s.j(aVarB3);
                return new efj.c(aVarB3, bVar.f.a());
            case 5:
                return new g();
            case 6:
                return new ynj.a();
            case 7:
                return new v2((nfj.a1) bVar.Q.get(), new i());
            case 8:
                EsimProfilesService esimProfilesService = (EsimProfilesService) bVar.N.get();
                j jVar = (j) bVar.O.get();
                ue0.c cVar = (ue0.c) bVar.P.get();
                gte.a aVarB4 = bVar.f4120a.b();
                s.j(aVarB4);
                return new m1(esimProfilesService, jVar, cVar, aVarB4);
            case 9:
                return y3.p(bVar.f4132g, (Retrofit) bVar.M.get());
            case 10:
                x3 x3Var = bVar.f4132g;
                nj0.a aVar2 = bVar.f4134h;
                Retrofit retrofitF = ((d) aVar2).f();
                OkHttpClient okHttpClientE = ((d) aVar2).e();
                s.j(okHttpClientE);
                return y3.r(x3Var, retrofitF, okHttpClientE, new com.revolut.retail.feature.esim.impl.network.interceptor.c(fe0.c.a(), (n1) bVar.L.get()));
            case 11:
                return new n1();
            case 12:
                return new ne0.d();
            case 13:
                je0.d dVarB = bVar.i.b();
                s.j(dVarB);
                yk0.a aVarB5 = bVar.f4138j.b();
                s.j(aVarB5);
                xe0.f fVarF = bVar.i.f();
                s.j(fVarF);
                return y3.q(dVarB, fVarF, aVarB5);
            case 14:
                m mVarD = bVar.k.d();
                s.j(mVarD);
                nfj.d dVar = (nfj.d) bVar.T.get();
                gte.a aVarB6 = bVar.f4120a.b();
                s.j(aVarB6);
                return new k(mVarD, dVar, aVarB6);
            case 15:
                return new nfj.d((EsimCheckoutService) bVar.S.get(), new i(), fe0.c.a());
            case 16:
                return a0k.b.o(bVar.f4132g, (Retrofit) bVar.M.get());
            case 17:
                return new w((nfj.k) bVar.Z.get(), (k0) bVar.Y.get(), (cej.b) bVar.X.get(), (i1) bVar.g0.get());
            case 18:
                EsimDataPlanService esimDataPlanService = (EsimDataPlanService) bVar.V.get();
                j jVar2 = (j) bVar.O.get();
                ue0.c cVar2 = (ue0.c) bVar.W.get();
                gte.a aVarB7 = bVar.f4120a.b();
                s.j(aVarB7);
                return new p(esimDataPlanService, jVar2, cVar2, aVarB7, (cej.b) bVar.X.get(), (k0) bVar.Y.get(), bVar.h());
            case 19:
                return a0k.b.r(bVar.f4132g, (Retrofit) bVar.M.get());
            case 20:
                je0.d dVarB2 = bVar.i.b();
                s.j(dVarB2);
                yk0.a aVarB8 = bVar.f4138j.b();
                s.j(aVarB8);
                xe0.f fVarF2 = bVar.i.f();
                s.j(fVarF2);
                return y3.e(dVarB2, fVarF2, aVarB8);
            case 21:
                gte.a aVarB9 = bVar.f4120a.b();
                s.j(aVarB9);
                return new efj.d(aVarB9, bVar.f.a());
            case 22:
                ang.f fVarE = bVar.f4142l.e();
                dm0.d dVarD = bVar.f4144m.d();
                s.j(dVarD);
                return new k0(fVarE, dVarD, (oej.a) bVar.E.get(), (v2) bVar.R.get());
            case 23:
                return new i1((nfj.k0) bVar.c0.get(), (a2) bVar.f0.get());
            case 24:
                EsimPhoneNumberService esimPhoneNumberService = (EsimPhoneNumberService) bVar.f4121a0.get();
                j jVar3 = (j) bVar.O.get();
                ue0.c cVar3 = (ue0.c) bVar.f4123b0.get();
                i iVar = new i();
                ffj.a aVar3 = new ffj.a();
                h hVarB = bVar.f4145n.b();
                s.j(hVarB);
                return new u0(esimPhoneNumberService, jVar3, cVar3, iVar, aVar3, hVarB, bVar.h());
            case 25:
                return y3.l(bVar.f4132g, (Retrofit) bVar.M.get());
            case 26:
                je0.d dVarB3 = bVar.i.b();
                s.j(dVarB3);
                yk0.a aVarB10 = bVar.f4138j.b();
                s.j(aVarB10);
                xe0.f fVarF3 = bVar.i.f();
                s.j(fVarF3);
                return y3.m(dVarB3, fVarF3, aVarB10);
            case 27:
                EsimSubscriptionsService esimSubscriptionsService = (EsimSubscriptionsService) bVar.f4127d0.get();
                j jVar4 = (j) bVar.O.get();
                ue0.c cVar4 = (ue0.c) bVar.f4129e0.get();
                ffj.a aVar4 = new ffj.a();
                h hVarB2 = bVar.f4145n.b();
                s.j(hVarB2);
                return new s2(esimSubscriptionsService, jVar4, cVar4, aVar4, hVarB2);
            case 28:
                return y3.u(bVar.f4132g, (Retrofit) bVar.M.get());
            case 29:
                je0.d dVarB4 = bVar.i.b();
                s.j(dVarB4);
                yk0.a aVarB11 = bVar.f4138j.b();
                s.j(aVarB11);
                xe0.f fVarF4 = bVar.i.f();
                s.j(fVarF4);
                return y3.v(dVarB4, fVarF4, aVarB11);
            case 30:
                v0 v0Var = (v0) bVar.j0.get();
                t tVarF2 = bVar.d.f();
                s.j(tVarF2);
                return new b2(v0Var, tVarF2, (s3) bVar.f4140k0.get());
            case 31:
                EsimPlanOffersService esimPlanOffersService = (EsimPlanOffersService) bVar.i0.get();
                j jVar5 = (j) bVar.O.get();
                ue0.c cVar5 = (ue0.c) bVar.W.get();
                gte.a aVarB12 = bVar.f4120a.b();
                s.j(aVarB12);
                return new nfj.z0(esimPlanOffersService, jVar5, cVar5, aVarB12);
            case 32:
                return y3.n(bVar.f4132g, (Retrofit) bVar.M.get());
            case 33:
                a2 a2Var = (a2) bVar.f0.get();
                k0 k0Var = (k0) bVar.Y.get();
                dm0.d dVarD2 = bVar.f4144m.d();
                s.j(dVarD2);
                return new s3(a2Var, k0Var, dVarD2);
            case 34:
                return new gfj.b((a2) bVar.f0.get(), bVar.g());
            case 35:
                return new l((nfj.e) bVar.p0.get());
            case 36:
                EsimConfigurationService esimConfigurationService = (EsimConfigurationService) bVar.f4146n0.get();
                j jVar6 = (j) bVar.O.get();
                gte.a aVarB13 = bVar.f4120a.b();
                s.j(aVarB13);
                return new nfj.g(esimConfigurationService, jVar6, aVarB13, (ue0.c) bVar.f4148o0.get());
            case 37:
                return a0k.b.p(bVar.f4132g, (Retrofit) bVar.M.get());
            case 38:
                je0.d dVarB5 = bVar.i.b();
                s.j(dVarB5);
                yk0.a aVarB14 = bVar.f4138j.b();
                s.j(aVarB14);
                xe0.f fVarF5 = bVar.i.f();
                s.j(fVarF5);
                return y3.d(dVarB5, fVarF5, aVarB14);
            case 39:
                s3 s3Var = (s3) bVar.f4140k0.get();
                k0 k0Var2 = (k0) bVar.Y.get();
                cfj.d dVar2 = new cfj.d(bVar.a(), bVar.d());
                cej.b bVar2 = (cej.b) bVar.X.get();
                dm0.d dVarD3 = bVar.f4144m.d();
                s.j(dVarD3);
                return new cfj.b(new cfj.g(s3Var, k0Var2, dVar2, bVar2, dVarD3, ((n86.d) bVar.f4152q).d()), new r(bVar.o.g()), (cej.a) bVar.H.get(), (cej.b) bVar.X.get());
            case 40:
                return new ioj.b(new foj.c(bVar.k(), bVar.i(), new goj.a(), new eoj.b()), new foj.b(bVar.j(), bVar.k(), bVar.i(), new goj.a(), new eoj.b()), (k0) bVar.Y.get(), (f5) bVar.f4163v0.get(), (bej.c) bVar.y0.get());
            case 41:
                return new f5((t2) bVar.u0.get());
            case 42:
                return new w2((EsimWidgetsConfigService) bVar.f4157s0.get(), (j) bVar.O.get(), (ue0.c) bVar.f4160t0.get());
            case 43:
                return y3.x(bVar.f4132g, (Retrofit) bVar.M.get());
            case 44:
                je0.d dVarB6 = bVar.i.b();
                s.j(dVarB6);
                yk0.a aVarB15 = bVar.f4138j.b();
                s.j(aVarB15);
                xe0.f fVarF6 = bVar.i.f();
                s.j(fVarF6);
                return y3.y(dVarB6, fVarF6, aVarB15);
            case 45:
                nfj.j jVar7 = (nfj.j) bVar.f4167x0.get();
                gte.a aVarB16 = bVar.f4120a.b();
                s.j(aVarB16);
                return new dfj.m(jVar7, aVarB16);
            case 46:
                return new nfj.j((EsimConnectEligibilityService) bVar.f4165w0.get(), (j) bVar.O.get());
            case 47:
                return a0k.b.q(bVar.f4132g, (Retrofit) bVar.M.get());
            case 48:
                return new ioj.a();
            case 49:
                gte.a aVarB17 = bVar.f4120a.b();
                s.j(aVarB17);
                return new efj.e(aVarB17);
            case 50:
                return new efj.a((cej.a) bVar.H.get(), (cej.b) bVar.X.get(), (oej.a) bVar.E.get());
            case 51:
                return new x2((v2) bVar.R.get(), (cej.b) bVar.X.get(), ((n86.d) bVar.f4152q).d());
            case 52:
                return new q3((v1) bVar.E0.get());
            case 53:
                return new v1((EsimStatementsService) bVar.D0.get(), fe0.c.a());
            case 54:
                return y3.s(bVar.f4132g, (Retrofit) bVar.M.get());
            case 55:
                l70.e eVar = bVar.f4150p;
                nej.a aVar5 = bVar.f4122b;
                he2.b bVar3 = new he2.b(new n80.b());
                cej.a aVar6 = (cej.a) bVar.H.get();
                oej.c cVarB = aVar5.b();
                s.j(cVarB);
                v2 v2Var = (v2) bVar.R.get();
                oej.a aVar7 = (oej.a) bVar.E.get();
                kej.d dVar3 = (kej.d) aVar5.f214558n.get();
                s.j(dVar3);
                return new dfj.j(bVar3, aVar6, cVarB, v2Var, aVar7, dVar3);
            case 56:
                efj.a aVar8 = (efj.a) bVar.B0.get();
                gfj.a aVar9 = (gfj.a) bVar.H0.get();
                fej.b bVar4 = (fej.b) bVar.F.get();
                gte.a aVarB18 = bVar.f4120a.b();
                s.j(aVarB18);
                return new uej.c(aVar8, aVar9, bVar4, aVarB18);
            case 57:
                return new gfj.a((a2) bVar.f0.get(), bVar.g());
            case 58:
                return new zej.e((y0) bVar.G.get());
            case 59:
                je0.d dVarB7 = bVar.i.b();
                s.j(dVarB7);
                yk0.a aVarB19 = bVar.f4138j.b();
                s.j(aVarB19);
                xe0.f fVarF7 = bVar.i.f();
                s.j(fVarF7);
                return y3.i(dVarB7, fVarF7, aVarB19);
            case 60:
                je0.d dVarB8 = bVar.i.b();
                s.j(dVarB8);
                yk0.a aVarB20 = bVar.f4138j.b();
                s.j(aVarB20);
                xe0.f fVarF8 = bVar.i.f();
                s.j(fVarF8);
                return y3.g(dVarB8, fVarF8, aVarB20);
            case 61:
                je0.d dVarB9 = bVar.i.b();
                s.j(dVarB9);
                yk0.a aVarB21 = bVar.f4138j.b();
                s.j(aVarB21);
                xe0.f fVarF9 = bVar.i.f();
                s.j(fVarF9);
                return y3.o(dVarB9, fVarF9, aVarB21);
            case 62:
                je0.d dVarB10 = bVar.i.b();
                s.j(dVarB10);
                yk0.a aVarB22 = bVar.f4138j.b();
                s.j(aVarB22);
                xe0.f fVarF10 = bVar.i.f();
                s.j(fVarF10);
                return y3.c(dVarB10, fVarF10, aVarB22);
            case 63:
                je0.d dVarB11 = bVar.i.b();
                s.j(dVarB11);
                yk0.a aVarB23 = bVar.f4138j.b();
                s.j(aVarB23);
                xe0.f fVarF11 = bVar.i.f();
                s.j(fVarF11);
                return y3.w(dVarB11, fVarF11, aVarB23);
            case 64:
                je0.d dVarB12 = bVar.i.b();
                s.j(dVarB12);
                yk0.a aVarB24 = bVar.f4138j.b();
                s.j(aVarB24);
                xe0.f fVarF12 = bVar.i.f();
                s.j(fVarF12);
                return y3.f(dVarB12, fVarF12, aVarB24);
            case 65:
                n1 n1Var = (n1) bVar.L.get();
                ifj.h hVar = new ifj.h();
                gte.a aVarB25 = bVar.f4120a.b();
                s.j(aVarB25);
                return new z2(n1Var, hVar, aVarB25);
            case 66:
                return new xnj.a();
            case 67:
                return new k4((a2) bVar.f0.get(), (k0) bVar.Y.get(), (v2) bVar.R.get());
            case 68:
                qij.t tVar = (qij.t) bVar.T0.get();
                k0 k0Var3 = (k0) bVar.Y.get();
                s3 s3Var2 = (s3) bVar.f4140k0.get();
                x xVar = (x) bVar.W0.get();
                v2 v2Var2 = (v2) bVar.R.get();
                cej.b bVar5 = (cej.b) bVar.X.get();
                gte.a aVarB26 = bVar.f4120a.b();
                s.j(aVarB26);
                return new o(tVar, k0Var3, s3Var2, xVar, v2Var2, bVar5, aVarB26);
            case 69:
                return new qij.t((ue0.c) bVar.N0.get());
            case 70:
                return new x((q) bVar.V0.get(), (k0) bVar.Y.get());
            case 71:
                return new u((EsimEventsService) bVar.U0.get(), (j) bVar.O.get(), (ue0.c) bVar.P0.get(), (k0) bVar.Y.get());
            case 72:
                return a0k.b.s(bVar.f4132g, (Retrofit) bVar.M.get());
            case 73:
                pre.c cVarA = bVar.u.a();
                s.j(cVarA);
                return new d5(cVarA, (nfj.e) bVar.p0.get());
            case 74:
                y yVar = (y) bVar.a1.get();
                hj8.a aVarA3 = bVar.v.a();
                s.j(aVarA3);
                return new c0(yVar, aVarA3, (s3) bVar.f4140k0.get());
            case 75:
                return new y((j) bVar.O.get(), (EsimGiftingService) bVar.Z0.get(), (ue0.c) bVar.L0.get(), bVar.h());
            case 76:
                return a0k.b.u(bVar.f4132g, (Retrofit) bVar.M.get());
            case 77:
                return new q1((j0) bVar.f4128d1.get(), (a2) bVar.f0.get(), d4.a());
            case 78:
                return new j0((EsimPhoneNumberPortingService) bVar.f4126c1.get(), new i(), fe0.c.a());
            case 79:
                return y3.k(bVar.f4132g, (Retrofit) bVar.M.get());
            case 80:
                n nVarB = bVar.B.b();
                gte.a aVarB27 = bVar.f4120a.b();
                s.j(aVarB27);
                return new e5(nVarB, aVarB27, bVar.k.e());
            case 81:
                m mVarD2 = bVar.k.d();
                s.j(mVarD2);
                return new c1(mVarD2, (nfj.d) bVar.T.get());
            case 82:
                return new b5((s3) bVar.f4140k0.get(), (z1) bVar.f4137i1.get(), new i());
            case 83:
                return new z1((EsimSubscriptionsRefundQuoteService) bVar.f4136h1.get(), fe0.c.a(), new i());
            case 84:
                return y3.t(bVar.f4132g, (Retrofit) bVar.M.get());
            case 85:
                return new dfj.y((v) bVar.f4143l1.get());
            case 86:
                return new v((EsimFeedbackService) bVar.f4141k1.get());
            case 87:
                return a0k.b.t(bVar.f4132g, (Retrofit) bVar.M.get());
            case 88:
                m mVarD3 = bVar.k.d();
                s.j(mVarD3);
                return new g1(mVarD3, (f0) bVar.f4149o1.get());
            case 89:
                return new f0((EsimPhoneNumberCheckoutService) bVar.f4147n1.get());
            case 90:
                return y3.j(bVar.f4132g, (Retrofit) bVar.M.get());
            case 91:
                return new w1((nfj.k0) bVar.c0.get());
            case 92:
                return new g0((b0) bVar.f4161t1.get(), (k0) bVar.Y.get());
            case 93:
                return new b0((EsimHelpService) bVar.f4155r1.get(), (j) bVar.O.get(), (ue0.c) bVar.f4158s1.get());
            case 94:
                return a0k.b.v(bVar.f4132g, (Retrofit) bVar.M.get());
            case 95:
                je0.d dVarB13 = bVar.i.b();
                s.j(dVarB13);
                yk0.a aVarB28 = bVar.f4138j.b();
                s.j(aVarB28);
                xe0.f fVarF13 = bVar.i.f();
                s.j(fVarF13);
                return y3.h(dVarB13, fVarF13, aVarB28);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        b3j.p pVar = (b3j.p) this.f641c;
        ee0.a aVar = pVar.f12068g;
        int i = this.f640b;
        if (i == 0) {
            return k3j.c.a();
        }
        if (i == 1) {
            return new ne0.d();
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        je0.d dVarD = aVar.d();
        s.j(dVarD);
        yk0.a aVarB = pVar.f12069h.b();
        s.j(aVarB);
        xe0.f fVarF = aVar.f();
        s.j(fVarF);
        return agk.b.u(dVarD, aVarB, fVarF);
    }

    private final Object c() {
        int i = this.f640b;
        if (i == 0) {
            return new a3j.a(((b3j.t) this.f641c).f12095a);
        }
        if (i == 1) {
            return b3j.k.a();
        }
        if (i == 2) {
            return b3j.l.a();
        }
        throw new AssertionError(i);
    }

    private final Object d() {
        b3j.y yVar = (b3j.y) this.f641c;
        a31.a aVar = yVar.f;
        a31.a aVar2 = yVar.e;
        a31.a aVar3 = yVar.f12123a;
        int i = this.f640b;
        if (i == 0) {
            return new b3j.a(aVar3, yVar.f12124b, yVar.f12125c, yVar.d, aVar2, aVar, yVar.f12126g, yVar.f12127h, yVar.i);
        }
        if (i == 1) {
            return new b3j.h(yVar.B, aVar3, aVar2, aVar, yVar.f12128j, yVar.k, yVar.f12129l, yVar.f12130m, yVar.f12131n, yVar.o, yVar.f12132p, yVar.f12133q, yVar.f12134r, yVar.f12135s, yVar.f12136t, yVar.u, yVar.v, yVar.f12137w, yVar.f12138x, yVar.f12139y, yVar.z);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        t2j.a aVar4 = (t2j.a) ((b3j.a) yVar.A.get()).b();
        s.k(aVar4);
        return aVar4;
    }

    private final Object e() {
        b7e.a aVar = (b7e.a) this.f641c;
        int i = this.f640b;
        switch (i) {
            case 0:
                g6e.d dVarB = aVar.f12998a.b();
                s.j(dVarB);
                x6e.i iVar = (x6e.i) aVar.H.get();
                ssi.o oVarC = aVar.k.c();
                s.j(oVarC);
                g6e.f fVarD = aVar.f12998a.d();
                s.j(fVarD);
                g6e.g gVarA = aVar.f13004l.a();
                s.j(gVarA);
                return new z6e.r(aVar.b(), dVarB, fVarD, gVarA, oVarC, iVar);
            case 1:
                xmg.a aVar2 = aVar.f12999b;
                ta7.a aVar3 = aVar.f13003j;
                c89.b bVar = aVar.d;
                ang.f fVarE = aVar2.e();
                g6e.d dVarB2 = aVar.f12998a.b();
                s.j(dVarB2);
                g6e.b bVarA = aVar.f13000c.a();
                s.j(bVarA);
                x79.a aVarA = bVar.a();
                s.j(aVarA);
                y79.a aVarB = bVar.b();
                s.j(aVarB);
                x6e.c cVar = new x6e.c(aVar.e.a());
                hj8.a aVarA2 = aVar.f.a();
                s.j(aVarA2);
                xqe.b bVarA2 = aVar.f13001g.a();
                s.j(bVarA2);
                zf8.n nVarB = aVar.f13002h.b();
                s.j(nVarB);
                return new x6e.o(fVarE, dVarB2, bVarA, aVarA, aVarB, cVar, aVarA2, bVarA2, nVarB, aVar.i.a(), aVar3.d(), aVar3.c());
            case 2:
                g6e.d dVarB3 = aVar.f12998a.b();
                s.j(dVarB3);
                x6e.i iVar2 = (x6e.i) aVar.H.get();
                ssi.o oVarC2 = aVar.k.c();
                s.j(oVarC2);
                g6e.f fVarD2 = aVar.f12998a.d();
                s.j(fVarD2);
                g6e.g gVarA2 = aVar.f13004l.a();
                s.j(gVarA2);
                return new z6e.f(dVarB3, iVar2, oVarC2, fVarD2, gVarA2, aVar.f12999b.e(), aVar.b());
            case 3:
                g6e.d dVarB4 = aVar.f12998a.b();
                s.j(dVarB4);
                x6e.i iVar3 = (x6e.i) aVar.H.get();
                ssi.o oVarC3 = aVar.k.c();
                s.j(oVarC3);
                g6e.f fVarD3 = aVar.f12998a.d();
                s.j(fVarD3);
                g6e.g gVarA3 = aVar.f13004l.a();
                s.j(gVarA3);
                gte.a aVarB2 = aVar.o.b();
                s.j(aVarB2);
                a7e.f fVarB = aVar.b();
                xvh.c cVarA = ((a6d.e) aVar.f13007p).a();
                s.j(cVarA);
                return new z6e.k(dVarB4, iVar3, oVarC3, fVarD3, gVarA3, aVarB2, fVarB, cVarA);
            case 4:
                g6e.d dVarB5 = aVar.f12998a.b();
                s.j(dVarB5);
                x6e.i iVar4 = (x6e.i) aVar.H.get();
                ssi.o oVarC4 = aVar.k.c();
                s.j(oVarC4);
                g6e.f fVarD4 = aVar.f12998a.d();
                s.j(fVarD4);
                g6e.g gVarA4 = aVar.f13004l.a();
                s.j(gVarA4);
                return new z6e.n(aVar.b(), dVarB5, fVarD4, gVarA4, oVarC4, iVar4);
            case 5:
                g6e.d dVarB6 = aVar.f12998a.b();
                s.j(dVarB6);
                x6e.i iVar5 = (x6e.i) aVar.H.get();
                ssi.o oVarC5 = aVar.k.c();
                s.j(oVarC5);
                g6e.f fVarD5 = aVar.f12998a.d();
                s.j(fVarD5);
                g6e.g gVarA5 = aVar.f13004l.a();
                s.j(gVarA5);
                return new a0(dVarB6, iVar5, oVarC5, fVarD5, gVarA5);
            case 6:
                e eVar = aVar.H;
                r6e.a0 a0Var = aVar.f12998a;
                x6e.i iVar6 = (x6e.i) eVar.get();
                g6e.g gVarA6 = aVar.f13004l.a();
                s.j(gVarA6);
                g6e.d dVarB7 = a0Var.b();
                s.j(dVarB7);
                g6e.f fVarD6 = a0Var.d();
                s.j(fVarD6);
                ssi.o oVarC6 = aVar.k.c();
                s.j(oVarC6);
                return new z6e.u(aVar.b(), dVarB7, fVarD6, gVarA6, oVarC6, iVar6);
            case 7:
                g6e.d dVarB8 = aVar.f12998a.b();
                s.j(dVarB8);
                x6e.i iVar7 = (x6e.i) aVar.H.get();
                ssi.o oVarC7 = aVar.k.c();
                s.j(oVarC7);
                g6e.f fVarD7 = aVar.f12998a.d();
                s.j(fVarD7);
                g6e.g gVarA7 = aVar.f13004l.a();
                s.j(gVarA7);
                return new z6e.x(aVar.b(), dVarB8, fVarD7, gVarA7, oVarC7, iVar7);
            case 8:
                g6e.f fVarD8 = aVar.f12998a.d();
                s.j(fVarD8);
                return new f7e.b(fVarD8, aVar.f13008q.c());
            case 9:
                d7e.h hVar = new d7e.h();
                d7e.c cVar2 = new d7e.c();
                d7e.b bVar2 = new d7e.b(aVar.f12999b.e(), 0);
                hj8.a aVarA3 = aVar.f.a();
                s.j(aVarA3);
                d7e.g gVar = new d7e.g(aVarA3);
                d7e.i iVar8 = new d7e.i();
                g6e.d dVarB9 = aVar.f12998a.b();
                s.j(dVarB9);
                return new d7e.l(hVar, cVar2, bVar2, gVar, iVar8, dVarB9);
            case 10:
                fpg.c cVar3 = aVar.f13009r;
                r6e.a0 a0Var2 = aVar.f12998a;
                l70.e eVar2 = aVar.f13011t;
                ppg.b bVarB = ((wpg.l) cVar3).b();
                s.j(bVarB);
                ang.f fVarE2 = aVar.f12999b.e();
                g6e.d dVarB10 = a0Var2.b();
                s.j(dVarB10);
                n nVarB2 = aVar.f13005m.b();
                mt8.d dVarB11 = aVar.f13010s.b();
                s.j(dVarB11);
                l80.e eVarH = eVar2.h();
                s.j(eVarH);
                j7e.h hVar2 = new j7e.h((a9e.a) aVar.R.get(), eVarH);
                rsi.i iVar9 = (rsi.i) aVar.k.H.get();
                s.j(iVar9);
                m7e.d dVar = new m7e.d(iVar9);
                da3.j jVar = aVar.f13012w;
                ia3.r rVarB = jVar.b();
                m93.d dVarF = jVar.f();
                s.j(dVarF);
                k7e.j jVar2 = new k7e.j(rVarB, dVarF);
                l80.e eVarH2 = eVar2.h();
                s.j(eVarH2);
                i7e.g gVar2 = new i7e.g(eVarH2);
                hj8.a aVarA4 = aVar.f.a();
                s.j(aVarA4);
                s6e.b0 b0VarC = a0Var2.c();
                l7e.j jVar3 = new l7e.j(eVar2.d());
                g6e.b bVarA3 = aVar.f13000c.a();
                s.j(bVarA3);
                gte.a aVarB3 = aVar.o.b();
                s.j(aVarB3);
                l7e.k kVar = new l7e.k();
                al4.b bVarN = aVar.f13013x.n();
                s.j(bVarN);
                y91.b bVarA4 = aVar.f13014y.a();
                p38.a aVarA5 = aVar.f13008q.a();
                s.j(aVarA5);
                nhf.a aVarA6 = aVar.z.a();
                s.j(aVarA6);
                return new g7e.a(bVarB, fVarE2, dVarB10, nVarB2, dVarB11, hVar2, dVar, jVar2, gVar2, aVarA4, b0VarC, jVar3, bVarA3, aVarB3, kVar, bVarN, bVarA4, aVarA5, aVarA6);
            case 11:
                mae.p pVarE = aVar.u.e();
                s.j(pVarE);
                f01.c cVarG = aVar.v.g();
                t70.b bVarG = aVar.f13011t.g();
                s.j(bVarG);
                return agk.b.f(pVarE, cVarG, bVarG);
            case 12:
                g6e.d dVarB12 = aVar.f12998a.b();
                s.j(dVarB12);
                xua.a aVarA7 = aVar.A.a();
                s.j(aVarA7);
                wzi.a aVarA8 = ((ctj.b) aVar.B).a();
                s.j(aVarA8);
                gte.a aVarB4 = aVar.o.b();
                s.j(aVarB4);
                return new s6e.b(dVarB12, aVarA7, aVarA8, aVarB4);
            case 13:
                p8e.a aVar4 = new p8e.a();
                fqk.a aVar5 = aVar.k;
                da3.j jVar4 = aVar.f13012w;
                x9e.a aVar6 = aVar.u;
                lqk.e eVar3 = (lqk.e) aVar5.G.get();
                s.j(eVar3);
                g6e.g gVarA8 = aVar.f13004l.a();
                s.j(gVarA8);
                o7e.n nVar = new o7e.n();
                c9e.c cVarB = aVar6.b();
                s.j(cVarB);
                g6e.d dVarB13 = aVar.f12998a.b();
                s.j(dVarB13);
                w5i.b bVarB2 = aVar.C.b();
                s.j(bVarB2);
                m93.d dVarF2 = jVar4.f();
                s.j(dVarF2);
                c7e.b bVar3 = new c7e.b(dVarF2);
                x6e.d dVar2 = (x6e.d) aVar.U.get();
                l93.f fVarJ = jVar4.j();
                s.j(fVarJ);
                xua.a aVarA9 = aVar.A.a();
                s.j(aVarA9);
                g9e.b bVar4 = (g9e.b) aVar6.I.get();
                s.j(bVar4);
                zja.a aVarA10 = ((ika.b) aVar.D).a();
                s.j(aVarA10);
                kbb.c cVarB2 = aVar.f13003j.b();
                y8k.b bVarA5 = aVar.E.a();
                l61.a aVarB5 = aVar.f12999b.b();
                s.j(aVarB5);
                return new c7e.h(aVar4, eVar3, gVarA8, nVar, cVarB, dVarB13, bVarB2, bVar3, dVar2, fVarJ, aVarA9, bVar4, aVarA10, cVarB2, bVarA5, aVarB5);
            case 14:
                return new x6e.d();
            case 15:
                ppg.b bVarB3 = ((wpg.l) aVar.f13009r).b();
                s.j(bVarB3);
                g6e.b bVarA6 = aVar.f13000c.a();
                s.j(bVarA6);
                qpa.b bVarB4 = aVar.F.b();
                s.j(bVarB4);
                return new x6e.g(bVarB3, bVarA6, bVarB4);
            case 16:
                g6e.d dVarB14 = aVar.f12998a.b();
                s.j(dVarB14);
                return new x6e.a(dVarB14);
            case 17:
                v6e.s sVar = (v6e.s) aVar.Y.get();
                g6e.d dVarB15 = aVar.f12998a.b();
                s.j(dVarB15);
                return new e7e.b(sVar, dVarB15);
            case 18:
                iva.a aVarA11 = aVar.G.a();
                s.j(aVarA11);
                return agk.b.x(aVarA11);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        b89.a aVar = (b89.a) this.f641c;
        a31.a aVar2 = aVar.f13141a;
        int i = this.f640b;
        if (i == 0) {
            return new c89.c(aVar2, aVar.f13142b, aVar.f13145h);
        }
        if (i != 1) {
            if (i == 2) {
                return new c89.d(aVar.f13143c, aVar.d, aVar.e, aVar2, aVar.f);
            }
            throw new AssertionError(i);
        }
        c89.b bVar = (c89.b) ((c89.d) aVar.f13144g.get()).b();
        s.k(bVar);
        return bVar;
    }

    private final Object g() {
        bfc.d dVar = (bfc.d) this.f641c;
        int i = this.f640b;
        switch (i) {
            case 0:
                return new dfc.a(dVar.f14947a.b(), (cfc.b) dVar.f14953l.get());
            case 1:
                gr6.a aVarA = dVar.f14948b.a();
                s.j(aVarA);
                gr6.e eVarA = dVar.f14949c.a();
                s.j(eVarA);
                ad1.a aVar = (ad1.a) dVar.d.i.get();
                s.j(aVar);
                return new cfc.b(aVarA, eVarA, aVar, dVar.e.e(), (ffc.c) dVar.k.get());
            case 2:
                return new ffc.c((RevProRequirementsService) dVar.i.get(), (j) dVar.f14952j.get());
            case 3:
                Retrofit retrofitI = ((c21.b) dVar.f).i();
                s.j(retrofitI);
                return agk.b.s(retrofitI);
            case 4:
                return new ne0.d();
            case 5:
                return new cfc.a();
            case 6:
                return new efc.c();
            case 7:
                eb1.a aVar2 = (eb1.a) dVar.f14950g.d.get();
                s.j(aVar2);
                return new efc.a(aVar2);
            case 8:
                return new efc.b(dVar.f14951h.d());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        bi3.d dVar = (bi3.d) this.f641c;
        an0.c cVar = dVar.f15407c;
        ee0.a aVar = dVar.f15406b;
        da3.j jVar = dVar.e;
        int i = this.f640b;
        if (i == 0) {
            hi3.a aVar2 = (hi3.a) dVar.f15412m.get();
            v6l.s sVarH = jVar.h();
            u13.g gVar = (u13.g) dVar.f.i.get();
            s.j(gVar);
            l93.b bVarG = jVar.g();
            s.j(bVarG);
            l93.f fVarJ = jVar.j();
            s.j(fVarJ);
            dha.c cVarI = dVar.f15408g.i();
            s.j(cVarI);
            mg0.a aVar3 = (mg0.a) cVar.C.get();
            s.j(aVar3);
            n nVarB = dVar.f15409h.b();
            mt8.d dVarB = dVar.i.b();
            s.j(dVarB);
            gte.a aVarB = dVar.f15410j.b();
            s.j(aVarB);
            return new ei3.m(aVar2, sVarH, gVar, bVarG, fVarJ, cVarI, aVar3, nVarB, dVarB, aVarB, new ei3.o(fe0.c.a(), 0));
        }
        int i2 = 1;
        if (i == 1) {
            CheckoutService checkoutService = (CheckoutService) dVar.k.get();
            ne0.d dVar2 = new ne0.d();
            ue0.c cVar2 = (ue0.c) dVar.f15411l.get();
            l80.e eVarH = dVar.d.h();
            s.j(eVarH);
            return new hi3.i(checkoutService, dVar2, cVar2, eVarH);
        }
        int i3 = 2;
        if (i == 2) {
            Retrofit retrofit = ((d) dVar.f15405a).f();
            bi3.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object objCreate = retrofit.create(CheckoutService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            CheckoutService checkoutService2 = (CheckoutService) objCreate;
            s.k(checkoutService2);
            return checkoutService2;
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        je0.d mapper = aVar.b();
        s.j(mapper);
        yk0.a databaseSecurityProvider = cVar.b();
        s.j(databaseSecurityProvider);
        xe0.f storageFactory = aVar.f();
        s.j(storageFactory);
        bi3.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSecurityProvider, "preorders", mapper, 2, zhm.u.c(new exa.a(i2, i3, 5)), 32);
    }

    private final Object i() {
        bid.a aVar = (bid.a) this.f641c;
        a31.a aVar2 = aVar.f15474c;
        a31.a aVar3 = aVar.A;
        int i = this.f640b;
        if (i == 0) {
            return new did.a0(aVar.f15472a, aVar.f15473b, aVar2, aVar.d, aVar.e, aVar.f, aVar.f15475g, aVar.f15476h, aVar.i, aVar.f15477j, aVar.k, aVar.f15478l, aVar.f15479m, aVar.f15480n, aVar.o, aVar.f15481p, aVar.f15482q, aVar.f15483r, aVar.f15484s, aVar.f15485t, aVar.C, aVar.f15486w, aVar.f15487x, aVar.f15488y, aVar.z, aVar3);
        }
        if (i == 1) {
            return agk.b.C((did.b0) aVar.B.get());
        }
        if (i == 2) {
            return db5.e.d(aVar2, aVar.u, aVar.v);
        }
        if (i == 3) {
            return db5.e.a(aVar.C);
        }
        if (i == 4) {
            return db5.e.b(aVar.C, aVar3);
        }
        throw new AssertionError(i);
    }

    private final Object j() {
        bjf.a aVar = (bjf.a) this.f641c;
        int i = this.f640b;
        switch (i) {
            case 0:
                return new mjf.b((xif.a) aVar.B.get());
            case 1:
                return new xif.a((TransactionsService) aVar.A.get());
            case 2:
                Retrofit retrofit = (Retrofit) aVar.z.get();
                bjf.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(TransactionsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                TransactionsService transactionsService = (TransactionsService) objCreate;
                s.k(transactionsService);
                return transactionsService;
            case 3:
                ik0.b factory = ((d) aVar.f15611a).m();
                s.j(factory);
                OkHttpClient okHttpClient = (OkHttpClient) aVar.f15640y.get();
                bjf.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
                Retrofit retrofitA = ik0.b.a(factory, okHttpClient, null, null, null, 30);
                s.k(retrofitA);
                return retrofitA;
            case 4:
                xj0.i okHttpClientFactory = ((d) aVar.f15611a).l();
                s.j(okHttpClientFactory);
                iif.b headersInterceptor = (iif.b) aVar.f15639x.get();
                bjf.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
                Intrinsics.checkNotNullParameter(headersInterceptor, "headersInterceptor");
                return xj0.i.a(okHttpClientFactory, null, false, false, null, zhm.u.c(headersInterceptor), null, 239);
            case 5:
                g31.i iVar = (g31.i) ((c21.b) aVar.f15613b).f20583t0.get();
                s.j(iVar);
                return new iif.b(iVar);
            case 6:
                c21.b bVar = (c21.b) aVar.f15613b;
                return new mjf.a(c21.l.e(bVar.o, e4m.b.a(bVar.f20574n0)), (com.revolut.domain.interactors.transactions.a) aVar.R.get(), aVar.i.e());
            case 7:
                x71.e eVar = (x71.e) aVar.f15626n0.get();
                gif.a aVar2 = (gif.a) aVar.q0.get();
                x71.d dVar = (x71.d) aVar.f15635t0.get();
                ang.f fVarE = aVar.i.e();
                pe0.q qVar = (pe0.q) aVar.f15630r.f125057q.get();
                s.j(qVar);
                return new mjf.b0(eVar, aVar2, dVar, fVarE, qVar, aVar.T);
            case 8:
                TransactionsService transactionsService2 = (TransactionsService) aVar.A.get();
                y71.c cVar = (y71.c) ((c21.b) aVar.f15613b).f20585w.get();
                s.j(cVar);
                return new xif.s(transactionsService2, cVar, (eif.e) aVar.i0.get(), (fif.b) aVar.m0.get(), (tif.d) aVar.I.get(), (tif.r) aVar.M.get(), (ue0.c) aVar.f15622k0.get(), (mjf.q) aVar.Q.get());
            case 9:
                aVar.getClass();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
                builderBuilderWithExpectedSize.put(tof.t.class, aVar.U);
                builderBuilderWithExpectedSize.put(hc.class, aVar.V);
                builderBuilderWithExpectedSize.put(tof.i1.class, aVar.V);
                builderBuilderWithExpectedSize.put(r2.class, aVar.W);
                builderBuilderWithExpectedSize.put(m0.class, aVar.X);
                builderBuilderWithExpectedSize.put(e0.class, aVar.X);
                ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize.build();
                ImmutableMap.Builder builderBuilderWithExpectedSize2 = ImmutableMap.builderWithExpectedSize(6);
                builderBuilderWithExpectedSize2.put(tof.i1.class, agk.b.n(aVar.f15623l.b(), e4m.b.a(aVar.Y), e4m.b.a(aVar.f15612a0)));
                builderBuilderWithExpectedSize2.put(tof.t.class, aVar.f15614b0.get());
                builderBuilderWithExpectedSize2.put(hc.class, aVar.c0.get());
                builderBuilderWithExpectedSize2.put(r2.class, aVar.f15617e0.get());
                builderBuilderWithExpectedSize2.put(m0.class, aVar.g0.get());
                builderBuilderWithExpectedSize2.put(e0.class, aVar.f15620h0.get());
                return new eif.e(immutableMapBuild, builderBuilderWithExpectedSize2.build());
            case 10:
                return new eif.a((tif.d) aVar.I.get(), (mif.j) aVar.J.get(), (tif.r) aVar.M.get(), (tif.b) aVar.O.get(), aVar.i.e(), (mjf.q) aVar.Q.get(), (mhf.j) aVar.T.get());
            case 11:
                gte.a aVarB = aVar.f15615c.b();
                s.j(aVarB);
                fk3.a aVarA = aVar.d.a();
                s.j(aVarA);
                return new tif.q(aVarB, aVarA, (mif.o) aVar.F.get(), (mif.b) aVar.G.get(), (uif.g) aVar.H.get(), new kif.a());
            case 12:
                TransactionsDatabase database = (TransactionsDatabase) aVar.D.get();
                mif.t queryBuilder = (mif.t) aVar.E.get();
                bjf.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(database, "database");
                Intrinsics.checkNotNullParameter(queryBuilder, "queryBuilder");
                mif.o oVarK = database.k();
                oVarK.getClass();
                Intrinsics.checkNotNullParameter(queryBuilder, "<set-?>");
                oVarK.f205818b = queryBuilder;
                return oVarK;
            case 13:
                Context context = aVar.e;
                yk0.a databaseSessionProvider = aVar.f.b();
                s.j(databaseSessionProvider);
                de0.a databaseEncryptionMigratorFactory = ((c21.b) aVar.f15613b).b();
                bjf.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                TransactionsDatabase.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                TransactionsDatabase transactionsDatabase = (TransactionsDatabase) ce0.a.b(new ao.a(context, 3, databaseEncryptionMigratorFactory, databaseSessionProvider));
                s.k(transactionsDatabase);
                return transactionsDatabase;
            case 14:
                gte.a aVarB2 = aVar.f15615c.b();
                s.j(aVarB2);
                return new d0(aVarB2);
            case 15:
                TransactionsDatabase database2 = (TransactionsDatabase) aVar.D.get();
                bjf.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(database2, "database");
                mif.b bVarG = database2.g();
                s.k(bVarG);
                return bVarG;
            case 16:
                kf0.c cVar2 = aVar.f15618g;
                yk0.d dVar2 = new yk0.d();
                l80.h hVarV = aVar.f15619h.v();
                s.j(hVarV);
                return new uif.g(dVar2, hVarV);
            case 17:
                TransactionsDatabase database3 = (TransactionsDatabase) aVar.D.get();
                bjf.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(database3, "database");
                mif.j jVarJ = database3.j();
                s.k(jVarJ);
                return jVarJ;
            case 18:
                return new tif.r((pif.a) aVar.K.get(), (rif.b) aVar.L.get());
            case 19:
                return new pif.b();
            case 20:
                gte.a aVarB3 = aVar.f15615c.b();
                s.j(aVarB3);
                return new rif.d(aVarB3);
            case 21:
                return new tif.b((mif.f) aVar.N.get(), new tif.a());
            case 22:
                return agk.b.m((TransactionsDatabase) aVar.D.get());
            case 23:
                xif.b bVar2 = (xif.b) aVar.P.get();
                tif.b bVar3 = (tif.b) aVar.O.get();
                com.revolut.analytics.tracking.v3.d dVarF = aVar.f15621j.f();
                s.j(dVarF);
                return new mjf.q(bVar2, bVar3, dVarF, aVar.k.a(), aVar.f15623l.a());
            case 24:
                return new xif.b((tif.d) aVar.I.get());
            case 25:
                da3.j jVar = aVar.f15624m;
                l70.e eVar2 = aVar.f15619h;
                l93.f fVarJ = jVar.j();
                s.j(fVarJ);
                com.revolut.domain.interactors.transactions.a aVar3 = (com.revolut.domain.interactors.transactions.a) aVar.R.get();
                xif.u uVar = new xif.u((mif.h) aVar.S.get());
                Context context2 = aVar.e;
                n8b.a aVarA2 = aVar.f15625n.a();
                s.j(aVarA2);
                t70.b bVarG2 = eVar2.g();
                s.j(bVarG2);
                r10.q qVar2 = new r10.q(context2, aVarA2, bVarG2);
                qd0.b bVarN = eVar2.n();
                s.j(bVarN);
                return new mjf.k0(fVarJ, aVar3, uVar, qVar2, bVarN, aVar.f15618g.a());
            case 26:
                return bjf.f.s((TransactionsDatabase) aVar.D.get());
            case 27:
                tif.d dVar3 = (tif.d) aVar.I.get();
                mif.j jVar2 = (mif.j) aVar.J.get();
                tif.r rVar = (tif.r) aVar.M.get();
                tif.b bVar4 = (tif.b) aVar.O.get();
                ang.f fVarE2 = aVar.i.e();
                g31.i iVar2 = (g31.i) ((c21.b) aVar.f15613b).f20583t0.get();
                s.j(iVar2);
                l80.h hVarV2 = aVar.f15619h.v();
                s.j(hVarV2);
                fk3.b bVarB = aVar.d.b();
                s.j(bVarB);
                return new eif.l(dVar3, jVar2, rVar, bVar4, fVarE2, iVar2, hVarV2, bVarB, (mjf.q) aVar.Q.get(), (mhf.j) aVar.T.get());
            case 28:
                return new eif.d((tif.d) aVar.I.get(), (mif.j) aVar.J.get(), (tif.r) aVar.M.get(), (tif.b) aVar.O.get(), aVar.i.e(), (mjf.q) aVar.Q.get(), (mhf.j) aVar.T.get());
            case 29:
                return new eif.k((tif.d) aVar.I.get(), (mif.j) aVar.J.get(), (tif.r) aVar.M.get(), (tif.b) aVar.O.get(), aVar.i.e(), (mjf.q) aVar.Q.get(), (mhf.j) aVar.T.get());
            case 30:
                return new vif.a((TransactionsService) aVar.A.get(), 1);
            case 31:
                return new vif.b((CryptoExchangeTransactionsService) aVar.Z.get(), aVar.f15623l.b());
            case 32:
                return bjf.f.r((Retrofit) aVar.z.get());
            case 33:
                return new vif.a((TransactionsService) aVar.A.get(), 0);
            case 34:
                return new vif.a((TransactionsService) aVar.A.get(), 2);
            case 35:
                return new vif.a((SavingsInterestTransactionsService) aVar.f15616d0.get());
            case 36:
                Retrofit retrofit3 = ((c21.b) aVar.f15613b).i();
                s.j(retrofit3);
                bjf.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Object objCreate2 = retrofit3.create(SavingsInterestTransactionsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                SavingsInterestTransactionsService savingsInterestTransactionsService = (SavingsInterestTransactionsService) objCreate2;
                s.k(savingsInterestTransactionsService);
                return savingsInterestTransactionsService;
            case 37:
                DeFiTransactionsService deFiTransactionsService = (DeFiTransactionsService) aVar.f0.get();
                xv5.c cVarA = aVar.o.a();
                s.j(cVarA);
                return new vif.e(deFiTransactionsService, cVarA);
            case 38:
                return agk.b.k((Retrofit) aVar.z.get());
            case 39:
                e eVar3 = aVar.I;
                c21.e eVar4 = aVar.f15613b;
                usg.b bVar5 = aVar.f15628p;
                tif.d dVar4 = (tif.d) eVar3.get();
                tif.r rVar2 = (tif.r) aVar.M.get();
                atg.l lVar = (atg.l) bVar5.k.get();
                s.j(lVar);
                qsg.b bVarB2 = bVar5.b();
                s.j(bVarB2);
                g31.h hVar = (g31.h) ((c21.b) eVar4).W.get();
                s.j(hVar);
                mlk.b0 b0VarA = ((mp.i) aVar.f15629q).a();
                sjf.e eVar5 = (sjf.e) aVar.l0.get();
                lfm.c cVar3 = (lfm.c) ((c21.b) eVar4).U.get();
                s.j(cVar3);
                fl3.a aVarE = aVar.f15632s.e();
                s.j(aVarE);
                fy1.r rVar3 = (fy1.r) ((ey1.e) aVar.f15634t).B.get();
                s.j(rVar3);
                wif.a aVarA3 = aVar.u.a();
                gte.a aVarB4 = aVar.f15615c.b();
                s.j(aVarB4);
                fbj.a aVarA4 = ((qbj.m) aVar.v).a();
                s.j(aVarA4);
                return new fif.m(dVar4, rVar2, lVar, bVarB2, hVar, b0VarA, eVar5, cVar3, aVarE, rVar3, aVarA3, aVarB4, aVarA4, aVar.f15637w.a());
            case 40:
                CoroutineScope coroutineScope = (CoroutineScope) aVar.j0.get();
                l80.e eVarH = aVar.f15619h.h();
                s.j(eVarH);
                com.revolut.analytics.tracking.v3.d dVarF2 = aVar.f15621j.f();
                s.j(dVarF2);
                return new sjf.e(coroutineScope, eVarH, dVarF2, aoi.f.a(), (ue0.c) aVar.f15622k0.get(), (tif.d) aVar.I.get());
            case 41:
                bjf.e.Companion.getClass();
                p0 p0Var = p0.f264001a;
                return rd0.e.a(elm.f.f127540b);
            case 42:
                xe0.f storageFactory = aVar.f15630r.f();
                s.j(storageFactory);
                yk0.a databaseSessionProvider2 = aVar.f.b();
                s.j(databaseSessionProvider2);
                je0.d mapper = aVar.f15630r.b();
                s.j(mapper);
                bjf.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                return xe0.f.f(storageFactory, databaseSessionProvider2, "transactions", mapper, 0, null, 56);
            case 43:
                return new gif.a((gif.b) aVar.p0.get());
            case 44:
                aVar.getClass();
                ImmutableMap.Builder builderBuilderWithExpectedSize3 = ImmutableMap.builderWithExpectedSize(6);
                builderBuilderWithExpectedSize3.put(tof.t.class, aVar.f15627o0);
                builderBuilderWithExpectedSize3.put(hc.class, aVar.f15627o0);
                builderBuilderWithExpectedSize3.put(tof.i1.class, aVar.f15627o0);
                builderBuilderWithExpectedSize3.put(r2.class, aVar.f15627o0);
                builderBuilderWithExpectedSize3.put(m0.class, aVar.f15627o0);
                builderBuilderWithExpectedSize3.put(e0.class, aVar.f15627o0);
                return new gif.b(builderBuilderWithExpectedSize3.build(), (eif.e) aVar.i0.get());
            case 45:
                lfm.c cVar4 = (lfm.c) ((c21.b) aVar.f15613b).U.get();
                s.j(cVar4);
                b80.c cVarP = aVar.f15619h.p();
                s.j(cVarP);
                return new gif.h(cVar4, cVarP, (tif.b) aVar.O.get(), (tif.d) aVar.I.get(), (mhf.j) aVar.T.get(), new zjh.i((tif.b) aVar.O.get()));
            case 46:
                return new xif.o((j) aVar.f15631r0.get(), aVar.i.e(), (wif.d) aVar.f15633s0.get(), (tif.d) aVar.I.get(), (mif.j) aVar.J.get(), (tif.r) aVar.M.get(), new tif.c(), (sjf.e) aVar.l0.get(), (mjf.q) aVar.Q.get(), aVar.T);
            case 47:
                return new ne0.d();
            case 48:
                return new wif.d(new a31.a((TransactionsService) aVar.A.get()), new wif.a((SavingsInterestTransactionsService) aVar.f15616d0.get()), new tul.b((CryptoExchangeTransactionsService) aVar.Z.get()));
            case 49:
                return new mjf.x();
            case 50:
                return new xif.e((x71.e) aVar.f15626n0.get(), aVar.k.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        bmc.a aVar = (bmc.a) this.f641c;
        int i = this.f640b;
        switch (i) {
            case 0:
                return new dmc.e0(aVar.f16812b, aVar.f16813c, aVar.d, aVar.e, aVar.f, aVar.f16814g, aVar.f16811a);
            case 1:
                return new h0(aVar.f16811a, aVar.z, aVar.D, aVar.B, aVar.i, aVar.f16812b, aVar.f16818m, aVar.f16819n, aVar.o, aVar.f16814g, aVar.f16820p, aVar.f16821q, aVar.f16817l, aVar.f16822r, aVar.f16823s, aVar.k, aVar.f16824t, aVar.f16815h, aVar.u);
            case 2:
                dmc.a aVar2 = (dmc.a) ((dmc.e0) aVar.f16827y.get()).b();
                s.k(aVar2);
                return aVar2;
            case 3:
                return bjf.f.B((dmc.f0) aVar.C.get());
            case 4:
                return db5.e.e(aVar.f16811a, aVar.z, aVar.B, aVar.i, aVar.f16814g, aVar.f16816j, aVar.k, aVar.f16817l, aVar.f16815h);
            case 5:
                return bjf.f.C((dmc.g0) aVar.A.get());
            case 6:
                return db5.e.f(aVar.z, aVar.f16815h);
            case 7:
                return gmf.b.k(aVar.z, aVar.B, aVar.f16814g);
            case 8:
                return agk.b.a(aVar.f16814g, aVar.z, aVar.i, aVar.f16815h, aVar.f16812b, aVar.G, aVar.B, aVar.v);
            case 9:
                return bjf.f.D((h0) aVar.E.get());
            case 10:
                a31.a aVar3 = aVar.f16814g;
                a31.a aVar4 = aVar.i;
                return fp8.c.c(aVar.z, aVar.B, aVar3, aVar4, aVar.f16815h);
            case 11:
                return ka1.c.c(aVar.z, aVar.G, aVar.f16823s, aVar.f16814g, aVar.f16825w);
            case 12:
                return sg8.j.b(aVar.z, aVar.B, aVar.f16826x, aVar.f16814g);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        bpj.a aVar = (bpj.a) this.f641c;
        an0.c cVar = aVar.f17627c;
        ee0.a aVar2 = aVar.f17626b;
        int i = this.f640b;
        if (i == 0) {
            fpj.e eVar = (fpj.e) aVar.f17629h.get();
            fk3.a aVarA = aVar.d.a();
            s.j(aVarA);
            zm0.c cVarJ = cVar.j();
            s.j(cVarJ);
            return new cpj.b(eVar, aVarA, cVarJ);
        }
        if (i == 1) {
            FeaturesService featuresService = (FeaturesService) aVar.e.get();
            j jVar = (j) aVar.f.get();
            ue0.c cVar2 = (ue0.c) aVar.f17628g.get();
            ze0.a aVarA2 = aVar2.a();
            s.j(aVarA2);
            return new fpj.e(featuresService, jVar, cVar2, aVarA2);
        }
        if (i == 2) {
            Retrofit retrofit = ((d) aVar.f17625a).f();
            bpj.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object objCreate = retrofit.create(FeaturesService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            FeaturesService featuresService2 = (FeaturesService) objCreate;
            s.k(featuresService2);
            return featuresService2;
        }
        if (i == 3) {
            return new ne0.d();
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        je0.d mapper = aVar2.b();
        s.j(mapper);
        yk0.a databaseSessionProvider = cVar.b();
        s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar2.f();
        s.j(storageFactory);
        bpj.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, ib.b.Features, mapper, 2, null, 48);
    }

    private final Object m() {
        bw3.d dVar = (bw3.d) this.f641c;
        int i = this.f640b;
        if (i == 0) {
            return new dw3.f(dVar.f19194a, dVar.f19196b, dVar.f19198c, dVar.d, dVar.e, dVar.f, dVar.f19201g, dVar.f19202h, dVar.i, dVar.f19204j, dVar.k, dVar.f19206l, dVar.f19207m, dVar.f19208n, dVar.o, dVar.f19211p, dVar.f19212q, dVar.f19213r, dVar.f19214s, dVar.f19215t, dVar.u, dVar.v, dVar.f19216w, dVar.f19217x, dVar.f19218y, dVar.z, dVar.A, dVar.B, dVar.C, dVar.D, dVar.E, dVar.F, dVar.G, dVar.H, dVar.I, dVar.J, dVar.K, dVar.L, dVar.M, dVar.N, dVar.O, dVar.P, dVar.Q, dVar.R, dVar.S, dVar.T, dVar.U, dVar.V, dVar.W, dVar.X, dVar.Y, dVar.Z, dVar.f19195a0, dVar.f19197b0, dVar.c0, dVar.f19199d0, dVar.f19200e0, dVar.f0, dVar.g0, dVar.f19203h0, dVar.i0);
        }
        if (i == 1) {
            return bjf.f.A((dw3.f) dVar.f19210o0.get());
        }
        throw new AssertionError(i);
    }

    private final Object n() {
        bwa.a aVar = (bwa.a) this.f641c;
        ee0.a aVar2 = aVar.f19267a;
        kh7.a aVar3 = aVar.i;
        int i = this.f640b;
        if (i == 0) {
            return new if0.a(Collections.singleton((od0.e) aVar.f19272j.get()));
        }
        if (i == 1) {
            je0.d dVarB = aVar2.b();
            s.j(dVarB);
            yk0.a aVarB = aVar.f19268b.b();
            s.j(aVarB);
            xe0.f fVarF = aVar2.f();
            s.j(fVarF);
            return bjf.f.q(dVarB, fVarF, aVarB);
        }
        if (i == 2) {
            return new dwa.a(new awa.b((yva.a) aVar.f19275n.get()));
        }
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    return bjf.f.t(((d) aVar.f19269c).f());
                }
                throw new AssertionError(i);
            }
            ReferralCodeService referralCodeService = (ReferralCodeService) aVar.f19273l.get();
            ue0.c cVar = (ue0.c) aVar.f19272j.get();
            mk0.a aVarA = aVar.d.a();
            s.j(aVarA);
            return new ewa.e(referralCodeService, cVar, aVarA);
        }
        ewa.a aVar4 = (ewa.a) aVar.f19274m.get();
        fk3.a aVarA2 = aVar.e.a();
        s.j(aVarA2);
        ang.f fVarE = aVar.f.e();
        l80.e eVarH = aVar.f19270g.h();
        s.j(eVarH);
        gte.a aVarB2 = aVar.f19271h.b();
        s.j(aVarB2);
        mh7.c cVarA = aVar3.a();
        s.j(cVarA);
        ih7.b bVarB = aVar3.b();
        s.j(bVarB);
        return new cwa.j(aVar4, aVarA2, fVarE, eVarH, aVarB2, cVarA, bVarB);
    }

    private final Object o() {
        bwj.a aVar = (bwj.a) this.f641c;
        int i = this.f640b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            vte.a aVarC = aVar.f19363b.c();
            s.j(aVarC);
            return new uwj.a(aVarC);
        }
        mt8.d dVarB = aVar.f19362a.b();
        s.j(dVarB);
        r0j.c cVar = (r0j.c) aVar.d.get();
        gte.a aVarB = aVar.f19364c.b();
        s.j(aVarB);
        return new swj.a(dVarB, cVar, aVarB);
    }

    private final Object p() {
        c43.h hVar = (c43.h) this.f641c;
        r6e.a0 a0Var = hVar.f;
        ee0.a aVar = hVar.i;
        int i = this.f640b;
        if (i == 0) {
            ppk.f fVarA = hVar.f21015b.a();
            n nVarB = hVar.f21016c.b();
            l93.f fVarJ = hVar.d.j();
            s.j(fVarJ);
            xoj.a aVarA = hVar.e.a();
            s.j(aVarA);
            n6e.b bVarA = a0Var.a();
            g6e.d dVarB = a0Var.b();
            s.j(dVarB);
            return new w43.i(fVarA, nVarB, fVarJ, aVarA, bVarA, dVarB, hVar.f21014a.a());
        }
        if (i == 1) {
            return c21.l.p(hVar.f21017g);
        }
        if (i != 2) {
            if (i != 3) {
                throw new AssertionError(i);
            }
            kg.o oVarA = fe0.c.a();
            le0.b bVarC = aVar.c();
            s.j(bVarC);
            return c21.l.t(oVarA, bVarC);
        }
        yk0.a aVarB = hVar.f21018h.b();
        s.j(aVarB);
        je0.d dVar = (je0.d) hVar.z.get();
        xe0.f fVarF = aVar.f();
        s.j(fVarF);
        return c21.l.y(aVarB, dVar, fVarF);
    }

    private final Object q() {
        c4f.a aVar = (c4f.a) this.f641c;
        int i = this.f640b;
        switch (i) {
            case 0:
                ybl.d dVarH = aVar.f21176a.h();
                s.j(dVarH);
                t0 t0VarJ = aVar.f21176a.j();
                s.j(t0VarJ);
                return new d4f.f(dVarH, t0VarJ);
            case 1:
                f4f.a aVar2 = (f4f.a) aVar.u.get();
                cl3.a aVarD = aVar.f21181j.d();
                s.j(aVarD);
                zjh.f fVar = new zjh.f(aVarD);
                d4f.q qVar = (d4f.q) aVar.f21189t.get();
                ybl.k kVarD = aVar.k.d();
                s.j(kVarD);
                gte.a aVarB = aVar.e.b();
                s.j(aVarB);
                return new d4f.p(aVar2, fVar, qVar, kVarD, aVarB);
            case 2:
                TradingTransactionsService tradingTransactionsService = (TradingTransactionsService) aVar.f21184n.get();
                y3f.l lVar = new y3f.l((TradingTransactionsService) aVar.f21184n.get());
                g3f.b bVar = new g3f.b();
                g3f.a aVar3 = new g3f.a();
                j3f.f fVar2 = (j3f.f) aVar.f21185p.get();
                j jVar = (j) aVar.f21186q.get();
                gte.a aVarB2 = aVar.e.b();
                s.j(aVarB2);
                return new y3f.v(tradingTransactionsService, lVar, bVar, aVar3, fVar2, jVar, aVarB2, (d4f.q) aVar.f21189t.get());
            case 3:
                return w3.D(aVar.f21177b, (Retrofit) aVar.f21183m.get());
            case 4:
                v3f.a aVar4 = aVar.f21177b;
                Retrofit retrofit = ((d) aVar.f21178c).f();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
                builderNewBuilder.converterFactories().clear();
                builderNewBuilder.addConverterFactory(GsonConverterFactory.create(f3f.a.a()));
                Retrofit retrofitBuild = builderNewBuilder.build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                s.k(retrofitBuild);
                return retrofitBuild;
            case 5:
                return kxa.j.y((TradingDatabase) aVar.o.get());
            case 6:
                return s2l.c.v(aVar.d.a());
            case 7:
                return new ne0.d();
            case 8:
                y3f.h hVar = new y3f.h((TradingTransactionsService) aVar.f21184n.get());
                y3f.c cVar = new y3f.c((TradingTransactionsService) aVar.f21184n.get());
                j3f.f fVar3 = (j3f.f) aVar.f21185p.get();
                z3f.d dVar = (z3f.d) aVar.f21188s.get();
                gte.a aVarB3 = aVar.e.b();
                s.j(aVarB3);
                b80.c cVarP = aVar.f21180h.p();
                s.j(cVarP);
                CoroutineScope coroutineScopeA = aVar.i.a();
                s.j(coroutineScopeA);
                return new t3f.o(hVar, cVar, fVar3, dVar, aVarB3, cVarP, coroutineScopeA);
            case 9:
                return new z3f.d((ue0.c) aVar.f21187r.get());
            case 10:
                je0.d dVarB = aVar.f.b();
                s.j(dVarB);
                yk0.a aVarB4 = aVar.f21179g.b();
                s.j(aVarB4);
                xe0.f fVarF = aVar.f.f();
                s.j(fVarF);
                return gsi.d.y(dVarB, fVarF, aVarB4);
            case 11:
                je0.d dVarB2 = aVar.f.b();
                s.j(dVarB2);
                yk0.a aVarB5 = aVar.f21179g.b();
                s.j(aVarB5);
                xe0.f fVarF2 = aVar.f.f();
                s.j(fVarF2);
                return gsi.d.u(dVarB2, fVarF2, aVarB5);
            case 12:
                return new a4f.e();
            case 13:
                return new g4f.a(new l4f.a());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object mVar;
        yk0.a aVar;
        Object fVar;
        Object iVar;
        Object obj2;
        Object aVar2;
        Object f0Var;
        switch (this.f639a) {
            case 0:
                b bVar = (b) this.f641c;
                a31.a aVar3 = bVar.f642a;
                int i = this.f640b;
                if (i == 0) {
                    return new c1j.b(aVar3, bVar.e, 0);
                }
                if (i != 1) {
                    if (i == 2) {
                        return new e1j.b(bVar.f644c, aVar3, bVar.f643b);
                    }
                    throw new AssertionError(i);
                }
                e1j.a aVar4 = (e1j.a) ((e1j.b) bVar.d.get()).b();
                s.k(aVar4);
                return aVar4;
            case 1:
                a2d.j jVar = (a2d.j) this.f641c;
                int i2 = this.f640b;
                switch (i2) {
                    case 0:
                        ppk.f fVarA = jVar.f751a.a();
                        fk3.a aVarA = jVar.f753b.a();
                        s.j(aVarA);
                        return new x0(fVarA, aVarA, vd0.d.a(), jVar.f755c.b(), new d2d.c());
                    case 1:
                        n nVarB = jVar.f755c.b();
                        ppk.f fVarA2 = jVar.f751a.a();
                        td0.b bVarA = vd0.d.a();
                        fk3.a aVarA2 = jVar.f753b.a();
                        s.j(aVarA2);
                        return new o0(nVarB, fVarA2, bVarA, aVarA2, jVar.d.d(), new d2d.c());
                    case 2:
                        n nVarB2 = jVar.f755c.b();
                        ppk.f fVarA3 = jVar.f751a.a();
                        td0.b bVarA2 = vd0.d.a();
                        fk3.a aVarA3 = jVar.f753b.a();
                        s.j(aVarA3);
                        xv5.c cVarA = jVar.e.a();
                        s.j(cVarA);
                        return new c2d.t0(nVarB2, fVarA3, bVarA2, aVarA3, cVarA, new d2d.c());
                    case 3:
                        ybl.b bVarB = jVar.f.b();
                        s.j(bVarB);
                        return new c2d.u0(bVarB, (e2d.a) jVar.f767r.get(), 0);
                    case 4:
                        ybl.b bVarB2 = jVar.f.b();
                        s.j(bVarB2);
                        ael.t tVarF = jVar.f.f();
                        s.j(tVarF);
                        ybl.k kVarD = jVar.f758g.d();
                        s.j(kVarD);
                        return new e2d.e(bVarB2, tVarF, kVarD, jVar.d.d());
                    case 5:
                        ybl.b bVarB3 = jVar.f.b();
                        s.j(bVarB3);
                        e2d.a aVar5 = (e2d.a) jVar.f767r.get();
                        tzg.m mVarT = jVar.d.t();
                        s.j(mVarT);
                        return new c2d.a1(bVarB3, aVar5, mVarT);
                    case 6:
                        ybl.b bVarB4 = jVar.f.b();
                        s.j(bVarB4);
                        return new c2d.u0(bVarB4, (e2d.a) jVar.f767r.get(), 1);
                    case 7:
                        return new c2d.g0((e2d.a) jVar.f767r.get());
                    case 8:
                        ybl.b bVarB5 = jVar.f.b();
                        s.j(bVarB5);
                        return new i0(bVarB5);
                    case 9:
                        return new c2d.z0(((y77.i) jVar.f759h).b(), ((y77.i) jVar.f759h).a());
                    case 10:
                        ppk.f fVarA4 = jVar.f751a.a();
                        vpk.p pVar = (vpk.p) jVar.f751a.v.get();
                        s.j(pVar);
                        t70.b bVarG = jVar.i.g();
                        s.j(bVarG);
                        return new c2d.s(fVarA4, pVar, bVarG);
                    case 11:
                        bpj.a aVar6 = jVar.f761j;
                        npk.a aVar7 = jVar.f751a;
                        xoj.a aVarA4 = aVar6.a();
                        s.j(aVarA4);
                        ppk.f fVarA5 = aVar7.a();
                        vpk.p pVar2 = (vpk.p) aVar7.v.get();
                        s.j(pVar2);
                        t70.b bVarG2 = jVar.i.g();
                        s.j(bVarG2);
                        mVar = new c2d.m(aVarA4, fVarA5, pVar2, bVarG2, jVar.d.f());
                        break;
                    case 12:
                        c2d.o oVarA = jVar.k.a();
                        s.j(oVarA);
                        return oVarA;
                    case 13:
                        z1d.a aVarA5 = jVar.f762l.a();
                        s.j(aVarA5);
                        return aVarA5;
                    case 14:
                        ybl.i iVarB = jVar.f758g.b();
                        s.j(iVarB);
                        ybl.b bVarB6 = jVar.f.b();
                        s.j(bVarB6);
                        return new c2d.r(bVarB6, iVarB, jVar.f763m.a());
                    case 15:
                        ybl.b bVarB7 = jVar.f.b();
                        s.j(bVarB7);
                        xoj.a aVarA6 = jVar.f761j.a();
                        s.j(aVarA6);
                        return new c2d.c0(bVarB7, aVarA6, jVar.f763m.a());
                    case 16:
                        ybl.b bVarB8 = jVar.f.b();
                        s.j(bVarB8);
                        xoj.a aVarA7 = jVar.f761j.a();
                        s.j(aVarA7);
                        return new c2d.f0(bVarB8, aVarA7, jVar.f763m.a());
                    case 17:
                        ybl.b bVarB9 = jVar.f.b();
                        s.j(bVarB9);
                        ybl.i iVarB2 = jVar.f758g.b();
                        s.j(iVarB2);
                        return new c2d.k(bVarB9, iVarB2, jVar.f763m.a());
                    case 18:
                        ybl.i iVarB3 = jVar.f758g.b();
                        s.j(iVarB3);
                        ybl.b bVarB10 = jVar.f.b();
                        s.j(bVarB10);
                        return new c2d.l(iVarB3, bVarB10);
                    case 19:
                        h77.a aVar8 = jVar.f759h;
                        h77.a aVar9 = jVar.f759h;
                        a87.c cVar = new a87.c(((y77.i) aVar8).f311406a.f(), 0);
                        jpf.a aVarB = ((y77.i) aVar9).b();
                        l77.a aVar10 = (l77.a) ((y77.i) aVar9).u.get();
                        s.j(aVar10);
                        mVar = new c2d.v(cVar, aVarB, aVar10, ((y77.i) aVar9).a(), jVar.f763m.a());
                        break;
                    case 20:
                        return new h2d.l();
                    case 21:
                        return new h2d.i(new h2d.o());
                    case 22:
                        return new h2d.j(new h2d.o());
                    case 23:
                        return new h2d.m(new h2d.o());
                    case 24:
                        return new h2d.k(new h2d.o());
                    case 25:
                        return new h2d.p(new h2d.o());
                    case 26:
                        return new h2d.q(new h2d.o());
                    case 27:
                        return new h2d.g(new h2d.o());
                    case 28:
                        return new h2d.h(new h2d.o());
                    case 29:
                        return new h2d.n(new h2d.o());
                    case 30:
                        return new h2d.f();
                    case 31:
                        return new f2d.i();
                    case 32:
                        return new f2d.c();
                    case 33:
                        xv5.c cVarA2 = jVar.e.a();
                        s.j(cVarA2);
                        return new f2d.g(cVarA2);
                    case 34:
                        xv5.c cVarA3 = jVar.e.a();
                        s.j(cVarA3);
                        return new f2d.k(cVarA3);
                    case 35:
                        return new f2d.n();
                    case 36:
                        return new f2d.h();
                    case 37:
                        return new f2d.o();
                    case 38:
                        return new f2d.a();
                    case 39:
                        return new f2d.b();
                    case 40:
                        return new f2d.m(((y77.i) jVar.f759h).b());
                    case 41:
                        tzg.m mVarT2 = jVar.d.t();
                        s.j(mVarT2);
                        return new g2d.g(mVarT2, (aah.h) jVar.f756d0.get(), (z0h.q1) jVar.f757e0.get());
                    case 42:
                        aah.i iVarD = ((u8h.b) jVar.f764n).d();
                        s.j(iVarD);
                        return a0k.b.z(iVarD);
                    case 43:
                        aah.i iVarD2 = ((u8h.b) jVar.f764n).d();
                        s.j(iVarD2);
                        return a0k.b.A(iVarD2);
                    case 44:
                        return new g2d.d((aah.h) jVar.f756d0.get(), (z0h.q1) jVar.f757e0.get(), 0);
                    case 45:
                        return new g2d.d((aah.h) jVar.f756d0.get(), (z0h.q1) jVar.f757e0.get(), 1);
                    case 46:
                        n nVarB3 = jVar.f755c.b();
                        ImmutableSet immutableSetA = jVar.a();
                        x8h.k kVarD2 = jVar.d.d();
                        xv5.c cVarA4 = jVar.e.a();
                        s.j(cVarA4);
                        return new z(nVarB3, immutableSetA, kVarD2, cVarA4);
                    default:
                        throw new AssertionError(i2);
                }
                return mVar;
            case 2:
                a4f.d dVar = (a4f.d) this.f641c;
                int i3 = this.f640b;
                switch (i3) {
                    case 0:
                        return c21.l.d(dVar.f1257b, dVar.f1258c, dVar.f1256a);
                    case 1:
                        return c21.l.b(dVar.f1267r, dVar.d, dVar.e, dVar.f, dVar.f1259g);
                    case 2:
                        return a0k.b.C((c4f.m) dVar.f1266q.get());
                    case 3:
                        return c21.l.a(dVar.f1267r);
                    case 4:
                        return new c4f.l(dVar.f1256a, dVar.d, dVar.f1260h, dVar.i, dVar.f1258c, dVar.f1261j, dVar.f1267r, dVar.k, dVar.f1259g, dVar.f1262l, dVar.f1263m);
                    case 5:
                        return c21.l.c(dVar.f1259g, dVar.k, dVar.f1264n, dVar.o, dVar.f1262l, dVar.f1265p);
                    case 6:
                        return pl1.d.a(dVar.f1263m, dVar.o, dVar.k, dVar.f1262l);
                    case 7:
                        return fp8.c.b(dVar.f1259g, dVar.o, dVar.f1264n, dVar.k, dVar.f1262l);
                    case 8:
                        return e5f.b.c(dVar.o, dVar.e);
                    case 9:
                        return jr9.h.a(dVar.o);
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                ad3.f fVar2 = (ad3.f) this.f641c;
                ee0.a aVar11 = fVar2.d;
                nj0.a aVar12 = fVar2.f3246b;
                ad3.c cVar2 = fVar2.f3245a;
                int i5 = this.f640b;
                switch (i5) {
                    case 0:
                        return new bd3.a((gd3.c) fVar2.f3252m.get(), fVar2.f3248g.b(), fVar2.f3249h.a(), (gd3.h) fVar2.o.get());
                    case 1:
                        CashbackBoxService cashbackBoxService = (CashbackBoxService) fVar2.i.get();
                        CashbackService cashbackService = (CashbackService) fVar2.f3250j.get();
                        qsg.b bVarB11 = fVar2.f3247c.b();
                        s.j(bVarB11);
                        return new gd3.g(cashbackBoxService, cashbackService, bVarB11, (ue0.c) fVar2.k.get(), (j) fVar2.f3251l.get(), fVar2.f);
                    case 2:
                        return a0k.b.f(cVar2, ((d) aVar12).f());
                    case 3:
                        return a0k.b.g(cVar2, ((d) aVar12).f());
                    case 4:
                        je0.d dVarB = aVar11.b();
                        s.j(dVarB);
                        yk0.a aVarB2 = fVar2.e.b();
                        s.j(aVarB2);
                        xe0.f fVarF = aVar11.f();
                        s.j(fVarF);
                        return a0k.b.i(dVarB, fVarF, aVarB2);
                    case 5:
                        return new ne0.d();
                    case 6:
                        return new gd3.k((CashbackStatusService) fVar2.f3253n.get(), (j) fVar2.f3251l.get(), (ue0.c) fVar2.k.get());
                    case 7:
                        return a0k.b.h(cVar2, ((d) aVar12).f());
                    case 8:
                        return new gd3.b((ue0.c) fVar2.k.get());
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                ad3.g gVar = (ad3.g) this.f641c;
                usg.a aVar13 = gVar.f3258c;
                ad3.f fVar3 = gVar.f3256a;
                int i6 = this.f640b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new AssertionError(i6);
                    }
                    od3.t0 t0Var = new od3.t0();
                    nd3.d dVar2 = new nd3.d(aVar13.b());
                    x6e.d dVar3 = (x6e.d) gVar.f3259g.U.get();
                    s.j(dVar3);
                    com.revolut.feature.rev_points.api.navigation.a aVarA8 = gVar.f3260h.a();
                    s.j(aVarA8);
                    bd3.a aVarA9 = fVar3.a();
                    s.j(aVarA9);
                    id3.c cVar3 = new id3.c(aVarA9, new od3.a());
                    bd3.a aVarA10 = fVar3.a();
                    s.j(aVarA10);
                    fk3.a aVarA11 = gVar.i.a();
                    s.j(aVarA11);
                    return new jd3.i(t0Var, dVar2, dVar3, aVarA8, cVar3, aVarA10, aVarA11);
                }
                bd3.a aVarA12 = fVar3.a();
                s.j(aVarA12);
                t tVarF2 = gVar.f3257b.f();
                s.j(tVarF2);
                jd3.k kVar = new jd3.k(aVarA12, tVarF2, aVar13.b(), gVar.d.c());
                bd3.a aVarA13 = fVar3.a();
                s.j(aVarA13);
                od3.b bVar2 = new od3.b();
                zxb.k0 k0Var = gVar.e;
                eub.i iVarE = k0Var.e();
                s.j(iVarE);
                ssi.o oVarC = gVar.f.c();
                s.j(oVarC);
                eub.a aVarA14 = k0Var.a();
                s.j(aVarA14);
                jd3.c cVar4 = new jd3.c(aVarA13, bVar2, iVarE, oVarC, aVarA14, new nd3.d(aVar13.b()), new md3.a());
                bd3.a aVarA15 = fVar3.a();
                s.j(aVarA15);
                return new jd3.l(kVar, cVar4, aVarA15);
            case 5:
                return a();
            case 6:
                ak5.j jVar2 = (ak5.j) this.f641c;
                l70.e eVar = jVar2.f5704b;
                int i21 = this.f640b;
                if (i21 == 0) {
                    return new qk5.a();
                }
                if (i21 == 1) {
                    return new zj5.a();
                }
                if (i21 != 2) {
                    if (i21 != 3) {
                        throw new AssertionError(i21);
                    }
                    dl3.f fVarC = jVar2.f5705c.c();
                    s.j(fVarC);
                    return new vk5.c(fVarC);
                }
                s70.a aVarM = eVar.m();
                s.j(aVarM);
                y80.a aVarR = eVar.r();
                s.j(aVarR);
                return new pn3.b(aVarM, aVarR);
            case 7:
                an0.c cVar5 = (an0.c) this.f641c;
                int i22 = this.f640b;
                switch (i22) {
                    case 0:
                        return new cn0.h(new ne0.d());
                    case 1:
                        ym0.a aVar14 = cVar5.f6520a;
                        ue0.c cardsStorage = (ue0.c) cVar5.f6527m.get();
                        rm0.v cryptoInteractor = (rm0.v) cVar5.f6529p.get();
                        rm0.e0 securityFeatureToggles = cVar5.g();
                        Intrinsics.checkNotNullParameter(cardsStorage, "cardsStorage");
                        Intrinsics.checkNotNullParameter(cryptoInteractor, "cryptoInteractor");
                        Intrinsics.checkNotNullParameter(securityFeatureToggles, "securityFeatureToggles");
                        return new xm0.a(securityFeatureToggles, cardsStorage, cryptoInteractor, hn0.b.f154014a);
                    case 2:
                        ym0.a aVar15 = cVar5.f6520a;
                        ee0.a aVar16 = cVar5.f6521b;
                        je0.d mapper = aVar16.b();
                        s.j(mapper);
                        fni.a nativeValuesProvider = cVar5.f6522c.f175897c;
                        xe0.f storageFactory = aVar16.f();
                        s.j(storageFactory);
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(nativeValuesProvider, "nativeValuesProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.f(storageFactory, new bn0.f(nativeValuesProvider, 6), "s_cdss.ds", mapper, 1, zhm.f0.f322471a, 32);
                    case 3:
                        rm0.q qVar = (rm0.q) cVar5.o.get();
                        qf0.c cVarA5 = cVar5.f.a();
                        s.j(cVarA5);
                        return new rm0.y(qVar, cVarA5);
                    case 4:
                        cVar5.getClass();
                        rm0.n cipherCertificateGenerator = new rm0.n(cVar5.d(), (rm0.b0) cVar5.f6528n.get(), cVar5.g());
                        qm.e secureKeyChecker = new qm.e(cVar5.g());
                        rm0.e0 securityFeatureToggles2 = cVar5.g();
                        wm0.c keyStoreProvider = new wm0.c();
                        rm0.o cipherFactory = new rm0.o();
                        rm0.a0 keyStoreErrorsTracker = cVar5.d();
                        bn0.a.Companion.getClass();
                        CoroutineScope coroutineScope = rd0.e.a(p0.f264002b);
                        bn0.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(cipherCertificateGenerator, "cipherCertificateGenerator");
                        Intrinsics.checkNotNullParameter(secureKeyChecker, "secureKeyChecker");
                        Intrinsics.checkNotNullParameter(securityFeatureToggles2, "securityFeatureToggles");
                        Intrinsics.checkNotNullParameter(keyStoreProvider, "keyStoreProvider");
                        Intrinsics.checkNotNullParameter(cipherFactory, "cipherFactory");
                        Intrinsics.checkNotNullParameter(keyStoreErrorsTracker, "keyStoreErrorsTracker");
                        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
                        return new rm0.b(secureKeyChecker, securityFeatureToggles2, coroutineScope, keyStoreProvider, cipherCertificateGenerator, cipherFactory, keyStoreErrorsTracker);
                    case 5:
                        return new rm0.b0();
                    case 6:
                        tm0.a aVar17 = cVar5.f6523g;
                        ee0.a aVar18 = cVar5.f6521b;
                        je0.d mapper2 = aVar18.b();
                        s.j(mapper2);
                        fni.a nativeValuesProvider2 = cVar5.f6522c.f175897c;
                        xe0.f storageFactory2 = aVar18.f();
                        s.j(storageFactory2);
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(nativeValuesProvider2, "nativeValuesProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, new bn0.f(nativeValuesProvider2, 5), "s_general.ds", mapper2, 1, zhm.f0.f322471a, 32);
                    case 7:
                        return new cn0.g((hn0.n) cVar5.u.get(), cVar5.f6522c.f175897c, cVar5.g());
                    case 8:
                        return new hn0.n((hn0.m) cVar5.f6533t.get(), new cn0.b(cVar5.g()), new cn0.a());
                    case 9:
                        return new hn0.m((ue0.c) cVar5.f6532s.get(), (rm0.v) cVar5.f6529p.get(), (rm0.h) cVar5.o.get(), new hn0.l(), cVar5.g());
                    case 10:
                        je0.d mapper3 = cVar5.f6521b.b();
                        s.j(mapper3);
                        fni.a nativeValuesProvider3 = cVar5.f6522c.f175897c;
                        xe0.f storageFactory3 = cVar5.f6521b.f();
                        s.j(storageFactory3);
                        Intrinsics.checkNotNullParameter(mapper3, "mapper");
                        Intrinsics.checkNotNullParameter(nativeValuesProvider3, "nativeValuesProvider");
                        Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                        return xe0.f.f(storageFactory3, new bn0.f(nativeValuesProvider3, 0), "s_general.st", mapper3, 1, null, 48);
                    case 11:
                        tm0.a aVar19 = cVar5.f6523g;
                        um0.b migrator = (um0.b) cVar5.f6534w.get();
                        d4m.a provider0 = e4m.b.a(cVar5.f6535x);
                        d4m.a provider1 = e4m.b.a(cVar5.f6536y);
                        Intrinsics.checkNotNullParameter(migrator, "migrator");
                        Intrinsics.checkNotNullParameter(provider0, "provider0");
                        Intrinsics.checkNotNullParameter(provider1, "provider1");
                        int iIntValue = ((Number) migrator.f281176c.getValue()).intValue();
                        if (iIntValue == 0) {
                            Object obj3 = provider0.get();
                            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                            aVar = (yk0.a) obj3;
                        } else {
                            if (iIntValue != 1) {
                                throw new IllegalStateException("Unsupported database version");
                            }
                            Object obj4 = provider1.get();
                            Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                            aVar = (yk0.a) obj4;
                        }
                        yk0.a aVar20 = aVar;
                        s.k(aVar20);
                        return aVar20;
                    case 12:
                        return new um0.b(cVar5.f6524h, (ue0.c) cVar5.f6531r.get());
                    case 13:
                        i70.a aVar21 = (i70.a) cVar5.i.f192443n.get();
                        s.j(aVar21);
                        ue0.c cVar6 = (ue0.c) cVar5.f6531r.get();
                        cVar5.f6522c.getClass();
                        return new sm0.a(aVar21, cVar6, new bm0.a());
                    case 14:
                        return new sm0.c((rm0.v) cVar5.f6529p.get(), new nm0.b(), (ue0.c) cVar5.f6531r.get(), cVar5.g());
                    case 15:
                        return new cn0.c((hn0.m) cVar5.f6533t.get(), (hn0.n) cVar5.u.get());
                    case 16:
                        return new cn0.e((hn0.n) cVar5.u.get(), (cn0.c) cVar5.A.get());
                    case 17:
                        e eVar2 = cVar5.v;
                        jm0.a aVar22 = cVar5.f6522c;
                        zm0.c cVar7 = (zm0.c) eVar2.get();
                        aVar22.getClass();
                        return new am0.b(cVar7, new bm0.a(), aVar22.c());
                    case 18:
                        Context context = cVar5.f6525j;
                        a.C0119a c0119a = bn0.a.Companion;
                        c0119a.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        BiometricManager biometricManagerFrom = BiometricManager.from(context);
                        Intrinsics.checkNotNullExpressionValue(biometricManagerFrom, "from(...)");
                        s.k(biometricManagerFrom);
                        Context context2 = cVar5.f6525j;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        FingerprintManagerCompat fingerprintManagerCompatFrom = FingerprintManagerCompat.from(context2);
                        Intrinsics.checkNotNullExpressionValue(fingerprintManagerCompatFrom, "from(...)");
                        s.k(fingerprintManagerCompatFrom);
                        usc.a aVar23 = new usc.a(fingerprintManagerCompatFrom);
                        c0119a.getClass();
                        return new vl0.c(biometricManagerFrom, aVar23, rd0.e.a(p0.f264002b));
                    case 19:
                        ym0.b bVar3 = cVar5.k;
                        ue0.c ssoAuthenticationSessionStorage = (ue0.c) cVar5.E.get();
                        rm0.v keyStoreCryptoInteractor = (rm0.v) cVar5.f6529p.get();
                        rm0.e0 securityFeatureToggles3 = cVar5.g();
                        Intrinsics.checkNotNullParameter(ssoAuthenticationSessionStorage, "ssoAuthenticationSessionStorage");
                        Intrinsics.checkNotNullParameter(keyStoreCryptoInteractor, "keyStoreCryptoInteractor");
                        Intrinsics.checkNotNullParameter(securityFeatureToggles3, "securityFeatureToggles");
                        return new xm0.a(securityFeatureToggles3, ssoAuthenticationSessionStorage, keyStoreCryptoInteractor, hn0.h.f154021a);
                    case 20:
                        ym0.b bVar4 = cVar5.k;
                        ee0.a aVar24 = cVar5.f6521b;
                        je0.d mapper4 = aVar24.b();
                        s.j(mapper4);
                        fni.a nativeValuesProvider4 = cVar5.f6522c.f175897c;
                        xe0.f storageFactory4 = aVar24.f();
                        s.j(storageFactory4);
                        Intrinsics.checkNotNullParameter(mapper4, "mapper");
                        Intrinsics.checkNotNullParameter(nativeValuesProvider4, "nativeValuesProvider");
                        Intrinsics.checkNotNullParameter(storageFactory4, "storageFactory");
                        return xe0.f.f(storageFactory4, new h2(nativeValuesProvider4, 1), "sso_authentication_session", mapper4, 0, null, 56);
                    case 21:
                        return new om0.b();
                    case 22:
                        return new jn0.d((dn0.b) cVar5.H.get(), cVar5.d());
                    case 23:
                        return new dn0.b(new wm0.b(), new wm0.d(), cVar5.d(), new wm0.c(), bjf.f.p(cVar5.f6525j));
                    default:
                        throw new AssertionError(i22);
                }
            case 8:
                anb.n nVar = (anb.n) this.f641c;
                tib.b bVar5 = nVar.f6663b;
                bnb.a aVar25 = nVar.f6664c;
                rg0.e eVar3 = nVar.f6670n;
                int i32 = this.f640b;
                if (i32 == 0) {
                    sri.m mVar2 = (sri.m) nVar.G.get();
                    ijb.a aVarG = ((blb.e) bVar5).g();
                    s.j(aVarG);
                    rnb.w wVarB = aVar25.b();
                    s.j(wVarB);
                    fVar = new zmb.f(mVar2, aVarG, wVarB, nVar.d.a(), (mjb.a) nVar.H.get(), ((vjb.b) nVar.k).a());
                } else {
                    if (i32 == 1) {
                        return agk.b.p(nVar.f6662a);
                    }
                    if (i32 == 2) {
                        w5i.b bVarB12 = nVar.e.b();
                        s.j(bVarB12);
                        r0 r0VarC = nVar.f.c();
                        l80.e eVarH = nVar.f6665g.h();
                        s.j(eVarH);
                        cob.f fVar4 = new cob.f(eVarH);
                        c9e.c cVarB = nVar.f6666h.b();
                        s.j(cVarB);
                        djb.n nVarA = nVar.i.a();
                        s.j(nVarA);
                        return new hob.d(bVarB12, r0VarC, fVar4, cVarB, nVarA, nVar.b());
                    }
                    if (i32 != 3) {
                        if (i32 == 4) {
                            rnb.w wVarB2 = aVar25.b();
                            s.j(wVarB2);
                            CoroutineScope coroutineScopeA = eVar3.a();
                            s.j(coroutineScopeA);
                            return new job.b(wVarB2, coroutineScopeA);
                        }
                        if (i32 != 5) {
                            throw new AssertionError(i32);
                        }
                        ijb.a aVarG2 = ((blb.e) bVar5).g();
                        s.j(aVarG2);
                        CoroutineScope coroutineScopeA2 = eVar3.a();
                        s.j(coroutineScopeA2);
                        return new job.e(aVarG2, coroutineScopeA2);
                    }
                    ybl.k kVarD3 = nVar.f6668l.d();
                    s.j(kVarD3);
                    rnb.w wVarB3 = aVar25.b();
                    s.j(wVarB3);
                    skd.i iVarC = nVar.f6669m.c();
                    CoroutineScope coroutineScopeA3 = eVar3.a();
                    s.j(coroutineScopeA3);
                    fVar = new job.c(kVarD3, wVarB3, iVarC, coroutineScopeA3);
                }
                return fVar;
            case 9:
                anb.s sVar = (anb.s) this.f641c;
                fpg.c cVar8 = sVar.d;
                usg.a aVar26 = sVar.f;
                bnb.a aVar27 = sVar.e;
                int i33 = this.f640b;
                if (i33 == 0) {
                    ijb.a aVarG3 = ((blb.e) sVar.f6698c).g();
                    s.j(aVarG3);
                    ppg.b bVarB13 = ((wpg.l) cVar8).b();
                    s.j(bVarB13);
                    rnb.w wVarB4 = aVar27.b();
                    s.j(wVarB4);
                    n nVarB4 = aVar26.b();
                    ypg.c cVar9 = (ypg.c) ((wpg.l) cVar8).R.get();
                    s.j(cVar9);
                    iVar = new rnb.i(aVarG3, bVarB13, wVarB4, nVarB4, cVar9, sVar.f6699g.d());
                } else {
                    if (i33 == 1) {
                        ybl.k kVarD4 = sVar.f6700h.d();
                        s.j(kVarD4);
                        return new rnb.x(kVarD4);
                    }
                    if (i33 != 2) {
                        if (i33 == 3) {
                            ppk.f fVarA6 = sVar.f6701j.a();
                            com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) sVar.k).c();
                            s.j(aVarC);
                            l80.e eVarH2 = sVar.f6702l.h();
                            s.j(eVarH2);
                            return new rnb.r(fVarA6, aVarC, eVarH2, new lqg.a(), (djb.q) sVar.f6708s.get());
                        }
                        if (i33 != 4) {
                            throw new AssertionError(i33);
                        }
                        djb.n nVar2 = (djb.n) sVar.f6706q.get();
                        xua.a aVarA16 = sVar.f6703m.a();
                        s.j(aVarA16);
                        xvh.c cVarA6 = ((a6d.e) sVar.f6704n).a();
                        s.j(cVarA6);
                        wzi.a aVarA17 = ((ctj.b) sVar.o).a();
                        s.j(aVarA17);
                        return new rnb.m(nVar2, aVarA16, cVarA6, aVarA17, sVar.f6705p.a());
                    }
                    rnb.w wVarB5 = aVar27.b();
                    s.j(wVarB5);
                    djb.n nVar3 = (djb.n) sVar.f6706q.get();
                    n nVarB5 = aVar26.b();
                    lqg.a aVar28 = new lqg.a();
                    gte.a aVarB3 = sVar.i.b();
                    s.j(aVarB3);
                    iVar = new rnb.v(wVarB5, nVar3, nVarB5, aVar28, aVarB3);
                }
                return iVar;
            case 10:
                ava.a aVar29 = (ava.a) this.f641c;
                usg.a aVar30 = aVar29.f9967h;
                c21.e eVar4 = aVar29.f9963a;
                ee0.a aVar31 = aVar29.f9971n;
                int i43 = this.f640b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        aVar2 = new dva.a((bva.d) aVar29.f9974r.get());
                    } else {
                        if (i43 != 2) {
                            if (i43 == 3) {
                                return cva.c.a();
                            }
                            if (i43 != 4) {
                                throw new AssertionError(i43);
                            }
                            le0.b bVarC = aVar31.c();
                            s.j(bVarC);
                            kg.o oVarA2 = fe0.c.a();
                            yk0.a aVarB4 = aVar29.o.b();
                            s.j(aVarB4);
                            xe0.f fVarF2 = aVar31.f();
                            s.j(fVarF2);
                            return cdj.b.B(oVarA2, bVarC, fVarF2, aVarB4);
                        }
                        aVar2 = new bva.d((j) aVar29.f9972p.get(), (ue0.c) aVar29.f9973q.get());
                    }
                    return aVar2;
                }
                c21.b bVar6 = (c21.b) eVar4;
                c21.n nVar4 = bVar6.o;
                d4m.a repositoryLazy = e4m.b.a(bVar6.f20581s0);
                Intrinsics.checkNotNullParameter(repositoryLazy, "repositoryLazy");
                HashMap map = nVar4.f20605a;
                Object obj5 = map.get(a31.x.class);
                WeakReference weakReference = obj5 instanceof WeakReference ? (WeakReference) obj5 : null;
                if (weakReference == null || (obj2 = weakReference.get()) == null) {
                    obj2 = repositoryLazy.get();
                    map.put(a31.x.class, new WeakReference(obj2));
                }
                s71.a aVar32 = (s71.a) obj2;
                s.k(aVar32);
                xoj.a aVarA18 = aVar29.f9964b.a();
                s.j(aVarA18);
                gte.a aVarB5 = aVar29.f9965c.b();
                s.j(aVarB5);
                al4.p pVarI = aVar29.d.i();
                s.j(pVarI);
                y45.h hVarG = aVar29.e.g();
                s.j(hVarG);
                ti9.h hVarB = aVar29.f.b();
                s.j(hVarB);
                r0 r0VarC2 = aVar29.f9966g.c();
                n nVarB6 = aVar30.b();
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) aVar29.i).c();
                s.j(aVarC2);
                l80.e eVarH3 = aVar29.f9968j.h();
                s.j(eVarH3);
                kg.o oVarH = ((c21.b) eVar4).h();
                s.j(oVarH);
                return new yua.q(aVar32, aVarA18, aVarB5, pVarI, hVarG, hVarB, r0VarC2, nVarB6, aVarC2, eVarH3, oVarH, aVar29.k.a(), aVar29.f9969l.a(), new r10.t(aVar30.b(), aVar29.f9970m.a()), (dva.a) aVar29.f9975s.get());
            case 11:
                awi.c cVar10 = (awi.c) this.f641c;
                a31.a aVar33 = cVar10.k;
                a31.a aVar34 = cVar10.f10778j;
                a31.a aVar35 = cVar10.f;
                ecm.q qVar2 = cVar10.f10773a;
                a31.a aVar36 = cVar10.f10774b;
                int i59 = this.f640b;
                if (i59 == 0) {
                    return new cwi.a(aVar36, cVar10.f10775c, cVar10.d, cVar10.e, aVar35, cVar10.f10776g, cVar10.f10777h, cVar10.i, aVar34, aVar33, qVar2);
                }
                if (i59 == 1) {
                    return cdj.b.b(qVar2, cVar10.E, cVar10.f10779l, cVar10.f10780m, aVar35, cVar10.f10781n, cVar10.o, aVar34, aVar33, cVar10.f10782p, cVar10.f10783q, cVar10.f10784r, aVar36, cVar10.f10785s, cVar10.f10786t, cVar10.u, cVar10.v, cVar10.f10787w, cVar10.f10788x, cVar10.f10789y, cVar10.z, cVar10.A, cVar10.B, cVar10.C);
                }
                if (i59 == 2) {
                    return agk.b.A((cwi.a) cVar10.D.get());
                }
                if (i59 == 3) {
                    return cdj.b.a(cVar10.E);
                }
                if (i59 == 4) {
                    return cdj.b.c(cVar10.E);
                }
                if (i59 == 5) {
                    return cwi.u.c(cVar10.E, aVar36);
                }
                throw new AssertionError(i59);
            case 12:
                ayb.a aVar37 = (ayb.a) this.f641c;
                ee0.a aVar38 = aVar37.f11114c;
                int i66 = this.f640b;
                if (i66 == 0) {
                    f0Var = new nyb.f0((jxb.e) aVar37.f11116h.get());
                } else {
                    if (i66 != 1) {
                        if (i66 == 2) {
                            return agk.b.t(aVar37.f11112a, ((d) aVar37.f11113b).f());
                        }
                        if (i66 != 3) {
                            if (i66 == 4) {
                                return new ne0.d();
                            }
                            throw new AssertionError(i66);
                        }
                        je0.d dVarB2 = aVar38.b();
                        s.j(dVarB2);
                        yk0.a aVarB6 = aVar37.d.b();
                        s.j(aVarB6);
                        xe0.f fVarF3 = aVar38.f();
                        s.j(fVarF3);
                        return agk.b.r(dVarB2, fVarF3, aVarB6);
                    }
                    f0Var = new jxb.e((RevPointsPlanService) aVar37.e.get(), (ue0.c) aVar37.f.get(), (j) aVar37.f11115g.get());
                }
                return f0Var;
            case 13:
                return b();
            case 14:
                return c();
            case 15:
                return d();
            case 16:
                return e();
            case 17:
                return f();
            case 18:
                return g();
            case 19:
                return h();
            case 20:
                return i();
            case 21:
                return j();
            case 22:
                return k();
            case 23:
                return l();
            case 24:
                return m();
            case 25:
                return n();
            case 26:
                return o();
            case 27:
                return p();
            case 28:
                return q();
            default:
                c4f.i iVar2 = (c4f.i) this.f641c;
                int i74 = this.f640b;
                if (i74 == 0) {
                    return new o4f.a((sri.m) iVar2.f21218b.get());
                }
                if (i74 == 1) {
                    return c21.l.q(iVar2.f21217a);
                }
                throw new AssertionError(i74);
        }
    }
}
