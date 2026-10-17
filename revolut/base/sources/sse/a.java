package sse;

import android.content.Context;
import c55.c0;
import c55.j0;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.credit.impl.notifications.network.CreditCollectionNotificationSettingsService;
import com.revolut.feature.credit.impl.ui.account.creditcard.mappers.CreditCardAdministrationFeeMapper;
import com.revolut.feature.credit.impl.ui.account.creditcard.mappers.CreditCardStatementSectionMapper;
import com.revolut.feature.credit.loan.impl.network.LoanCancellationService;
import com.revolut.feature.credit.loan.impl.network.LoanChecklistService;
import com.revolut.feature.credit.loan.impl.network.LoanService;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.junior_transfer_request.impl.db.JuniorTransferRequestDatabase;
import com.revolut.feature.junior_transfer_request.impl.service.JuniorTransferRequestService;
import com.revolut.feature.onboarding.impl.onboarding.service.WaitingListService;
import com.revolut.feature.onboarding.impl.promo.services.PromptsService;
import com.revolut.feature.retail.advanced_charts.impl.data.AdvancedChartsService;
import com.revolut.feature.rev_pro.network_authentication.impl.data.network.AccessTokenService;
import com.revolut.feature.tickets.impl.TicketsService;
import com.revolut.feature.trading_add_ons.impl.data.network.TradingAddOnsService;
import com.revolut.feature_contextual_prompt_impl.network.ContextualPromptService;
import com.revolut.trading.orders.data.db.OrdersDatabase;
import com.revolut.trading.orders.data.network.services.MonthlyInvestmentsService;
import com.revolut.trading.orders.data.network.services.TradingOrdersService;
import d73.u;
import dw3.c1;
import dw3.l;
import ffk.t;
import g48.r0;
import h6i.i0;
import hsl.q;
import ish.a0;
import java.util.Set;
import jid.x;
import jm4.a3;
import jm4.r;
import knd.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lnd.h0;
import mae.o;
import nx4.f1;
import o55.f0;
import o55.z;
import okhttp3.OkHttpClient;
import om4.m4;
import om4.v0;
import om4.w;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import q6i.g0;
import rc7.f;
import rc7.g;
import rc7.h;
import rc7.i;
import rc7.j;
import rc7.k;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ta9.e0;
import ta9.m0;
import vc.s;
import vrl.d0;
import vrl.l0;
import vrl.n0;
import vrl.o0;
import vrl.u0;
import vrl.y0;
import vtc.p0;
import wsg.n;
import wul.m;
import xf6.l3;
import xx9.p;
import zxb.k0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f265378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f265379c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f265377a = i2;
        this.f265379c = obj2;
        this.f265378b = i;
    }

    private final Object a() {
        tc7.d dVar = (tc7.d) this.f265379c;
        int i = this.f265378b;
        int i2 = i / 100;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new AssertionError(i);
            }
            switch (i) {
                case 100:
                    return new rc7.d();
                case 101:
                    return new rc7.c();
                case 102:
                    return new rc7.a();
                case 103:
                    return new rc7.e();
                case 104:
                    return new g();
                case 105:
                    return new h();
                case 106:
                    return new j();
                case 107:
                    return new k(dVar.f269631t.a());
                case LDSFile.EF_DG12_TAG /* 108 */:
                    return new i();
                case LDSFile.EF_DG13_TAG /* 109 */:
                    return new rc7.b();
                case LDSFile.EF_DG14_TAG /* 110 */:
                    return new f();
                case LDSFile.EF_DG15_TAG /* 111 */:
                    o88.a aVarH = ((k78.b) dVar.o).h();
                    s.j(aVarH);
                    return aVarH;
                case 112:
                    v88.a aVarO = ((k78.b) dVar.o).o();
                    s.j(aVarO);
                    return aVarO;
                case 113:
                    u88.a aVarM = ((k78.b) dVar.o).m();
                    s.j(aVarM);
                    return aVarM;
                case 114:
                    n88.j jVarF = ((k78.b) dVar.o).f();
                    s.j(jVarF);
                    return jVarF;
                case ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG /* 115 */:
                    r88.a aVarJ = ((k78.b) dVar.o).j();
                    s.j(aVarJ);
                    return aVarJ;
                case 116:
                    return ((k78.b) dVar.o).a();
                case LDSFile.EF_DG2_TAG /* 117 */:
                    return new hc7.c(t2d.c.x(dVar.f269637w));
                case LDSFile.EF_DG4_TAG /* 118 */:
                    return t2d.c.l(dVar.f269585b.b(), (csh.k) dVar.R2.get());
                case LDSFile.EF_SOD_TAG /* 119 */:
                    return new ic7.c();
                case SyslogConstants.LOG_CLOCK /* 120 */:
                    return new uc7.a();
                case 121:
                    e8b.a aVarA = dVar.j0.a();
                    s.j(aVarA);
                    ash.d dVar2 = (ash.d) dVar.U2.get();
                    a0 a0VarC = dVar.f269585b.c();
                    s.j(a0VarC);
                    return trl.f.f(aVarA, dVar2, a0VarC);
                case 122:
                    e8b.a aVarA2 = dVar.j0.a();
                    s.j(aVarA2);
                    ash.d dVar3 = (ash.d) dVar.U2.get();
                    a0 a0VarC2 = dVar.f269585b.c();
                    s.j(a0VarC2);
                    return trl.f.d(aVarA2, dVar3, a0VarC2);
                case 123:
                    return l.n(dVar.l0.b(), (ash.d) dVar.U2.get());
                case 124:
                    a95.f fVar = (a95.f) dVar.f269582a.C.get();
                    s.j(fVar);
                    return t2d.c.u(fVar, (uc7.a) dVar.U2.get());
                case ISO781611.SMT_TAG /* 125 */:
                    z85.f fVar2 = (z85.f) dVar.f269582a.D.get();
                    s.j(fVar2);
                    return t2d.c.r(fVar2);
                default:
                    throw new AssertionError(i);
            }
        }
        switch (i) {
            case 0:
                a95.f fVar3 = (a95.f) dVar.f269582a.C.get();
                s.j(fVar3);
                return t2d.c.t(fVar3);
            case 1:
                z85.f fVar4 = (z85.f) dVar.f269582a.D.get();
                s.j(fVar4);
                return t2d.c.q(fVar4);
            case 2:
                gm4.d dVarA = ((rw4.l) dVar.f269589c).a();
                s.j(dVarA);
                return gm4.c.a(dVarA);
            case 3:
                qw4.g gVar = (qw4.g) dVar.d.k.get();
                s.j(gVar);
                return gg0.g.f(gVar);
            case 4:
                pw4.g gVar2 = (pw4.g) dVar.d.u.get();
                s.j(gVar2);
                return gg0.g.e(gVar2);
            case 5:
                uw4.h hVar = (uw4.h) dVar.d.f176288w.get();
                s.j(hVar);
                return gg0.g.j(hVar);
            case 6:
                tw4.f fVar5 = (tw4.f) dVar.d.f176282n.get();
                s.j(fVar5);
                return gg0.g.h(fVar5);
            case 7:
                ww4.g gVar3 = (ww4.g) dVar.d.f176283p.get();
                s.j(gVar3);
                return gg0.g.l(gVar3);
            case 8:
                vw4.g gVar4 = (vw4.g) dVar.d.f176286s.get();
                s.j(gVar4);
                return gg0.g.k(gVar4);
            case 9:
                sw4.j jVar = (sw4.j) dVar.d.f176289x.get();
                s.j(jVar);
                return gg0.g.g(jVar);
            case 10:
                of1.b bVar = (of1.b) ((sf1.s) dVar.e).N.get();
                s.j(bVar);
                of1.a aVarA3 = dVar.f.a();
                s.j(aVarA3);
                return new jc7.c(bVar, aVarA3);
            case 11:
                ox9.a aVar = dVar.f269598g;
                p pVarB = aVar.b();
                s.j(pVarB);
                d3a.b bVarA = ((s3a.k) dVar.f269601h).a();
                s.j(bVarA);
                ex9.a aVar2 = (ex9.a) aVar.U.get();
                s.j(aVar2);
                ex9.b bVar2 = (ex9.b) aVar.V.get();
                s.j(bVar2);
                gc7.c cVar = new gc7.c(aVar2, bVar2, new gc7.d());
                iz9.c cVar2 = (iz9.c) dVar.i.S.get();
                s.j(cVar2);
                r3a.b bVar3 = (r3a.b) dVar.f269605j.e.get();
                s.j(bVar3);
                px9.d dVar4 = (px9.d) aVar.Y.get();
                s.j(dVar4);
                return new sc7.f(pVarB, bVarA, cVar, cVar2, bVar3, dVar4);
            case 12:
                aa6.c cVarB = dVar.k.b();
                s.j(cVarB);
                a31.a aVarA4 = dVar.k.f234384a.a();
                gte.a aVarB = dVar.f269610l.b();
                s.j(aVarB);
                t tVarF = dVar.f269612m.f();
                s.j(tVarF);
                return new vc7.c(cVarB, aVarA4, aVarB, tVarF);
            case 13:
                zf8.k kVarA = dVar.f269614n.a();
                s.j(kVarA);
                u68.i iVarQ = ((k78.b) dVar.o).q();
                s.j(iVarQ);
                return new yc7.j(kVarA, iVarQ, dVar.f269621p.a(), dVar.f269623q.d());
            case 14:
                yj2.d dVar5 = (yj2.d) dVar.f269625r.i.get();
                s.j(dVar5);
                return new pc7.d(dVar5, new gc7.a(), dVar.f269621p.a());
            case 15:
                lkc.a aVar3 = dVar.f269628s;
                o19.c cVar3 = dVar.u;
                gkc.b bVar4 = (gkc.b) aVar3.f196354m.get();
                s.j(bVar4);
                gc7.h hVar2 = new gc7.h(new mkc.a(dVar.f269628s.e.a()));
                o7.b bVar5 = new o7.b(dVar.f269631t.a());
                t tVarF2 = dVar.f269612m.f();
                s.j(tVarF2);
                gte.a aVarB2 = dVar.f269610l.b();
                s.j(aVarB2);
                o19.b bVar6 = (o19.b) cVar3;
                p19.a aVarA5 = bVar6.a();
                s.j(aVarA5);
                m19.e eVarB = bVar6.b();
                s.j(eVarB);
                return new ed7.j(bVar4, hVar2, bVar5, tVarF2, aVarB2, aVarA5, eVarB, new ed7.a());
            case 16:
                k0 k0Var = dVar.v;
                nyb.k kVarC = k0Var.c();
                s.j(kVarC);
                eub.a aVarA6 = k0Var.a();
                s.j(aVarA6);
                return new bd7.c(kVarC, aVarA6, new j1c.a(), dVar.f269637w);
            case 17:
                return new nc7.a(dVar.f269640x.j());
            case 18:
                r2d.h hVarA = dVar.f269644y.a();
                s.j(hVarA);
                r2d.t tVar = (r2d.t) dVar.f269644y.f180472h.get();
                s.j(tVar);
                return oyj.c.p(hVarA, l70.h.a(tVar), dVar.k());
            case 19:
                r2d.h hVarA2 = dVar.f269644y.a();
                s.j(hVarA2);
                r2d.t tVar2 = (r2d.t) dVar.f269644y.f180472h.get();
                s.j(tVar2);
                return oyj.c.i(hVarA2, l70.h.a(tVar2), dVar.k());
            case 20:
                s3d.l lVarB = dVar.A.b();
                s.j(lVarB);
                return p0.s(lVarB, dVar.v(), new fd7.a());
            case 21:
                s3d.l lVarB2 = dVar.A.b();
                s.j(lVarB2);
                return p0.q(lVarB2, dVar.v(), new fd7.a());
            case 22:
                s3d.l lVarB3 = dVar.A.b();
                s.j(lVarB3);
                return p0.A(lVarB3, dVar.v(), new fd7.a());
            case 23:
                s3d.l lVarB4 = dVar.A.b();
                s.j(lVarB4);
                return p0.k(lVarB4, dVar.v(), new fd7.a());
            case 24:
                jmd.d dVar6 = dVar.f269640x;
                xld.e eVar = (xld.e) dVar6.A0.get();
                s.j(eVar);
                pzi.a aVar4 = (pzi.a) dVar.B.B.get();
                s.j(aVar4);
                dmd.b bVar7 = (dmd.b) dVar6.M0.get();
                s.j(bVar7);
                wif.a aVarA7 = dVar.C.a();
                xld.a aVar5 = (xld.a) dVar6.L0.get();
                s.j(aVar5);
                return new mc7.d(eVar, aVar4, bVar7, aVarA7, aVar5);
            case 25:
                l1c.a aVarA8 = dVar.D.a();
                s.j(aVarA8);
                nyb.k0 k0Var2 = (nyb.k0) dVar.v.f0.get();
                s.j(k0Var2);
                return olc.c.a(aVarA8, k0Var2, dVar.D.b());
            case 26:
                da3.j jVar2 = dVar.E;
                c73.j jVar3 = dVar.F;
                r rVar = dVar.J;
                l93.f fVarJ = jVar2.j();
                s.j(fVarJ);
                u uVarA = jVar3.a();
                mt8.d dVarB = dVar.G.b();
                s.j(dVarB);
                wif.a aVarA9 = dVar.C.a();
                f73.a aVar6 = (f73.a) jVar3.v.get();
                s.j(aVar6);
                r0 r0VarC = dVar.H.c();
                ha3.k kVar = (ha3.k) jVar2.H.get();
                s.j(kVar);
                zf8.k kVarA2 = dVar.f269614n.a();
                s.j(kVarA2);
                ia3.r rVarB = jVar2.b();
                m93.g gVarI = jVar2.i();
                s.j(gVarI);
                cf7.b bVar8 = (cf7.b) dVar.I;
                da3.j jVar4 = bVar8.f23575g;
                m93.d dVarF = jVar4.f();
                s.j(dVarF);
                zjh.c cVar4 = new zjh.c(dVarF);
                l80.e eVarH = bVar8.f23576h.h();
                s.j(eVarH);
                ef7.d dVar7 = new ef7.d(cVar4, eVarH);
                m93.d dVarF2 = jVar4.f();
                s.j(dVarF2);
                qc7.i iVar = new qc7.i(rVarB, gVarI, dVar7, new ef7.b(new zjh.c(dVarF2)));
                bm4.a aVarE = rVar.e();
                m4 m4VarD = rVar.d();
                jla.h hVarA3 = dVar.f269621p.a();
                al4.b bVarN = rVar.n();
                s.j(bVarN);
                qe7.a aVarA10 = ((te7.b) dVar.K).a();
                s.j(aVarA10);
                return new qc7.e(fVarJ, uVarA, dVarB, aVarA9, aVar6, r0VarC, kVar, kVarA2, iVar, aVarE, m4VarD, hVarA3, bVarN, aVarA10);
            case 27:
                aoj.a aVar7 = dVar.L;
                afj.b bVar9 = dVar.N;
                doj.a aVarA11 = aVar7.a();
                s.j(aVarA11);
                oej.a aVarA12 = dVar.M.a();
                s.j(aVarA12);
                hej.a aVar8 = (hej.a) bVar9.z0.get();
                s.j(aVar8);
                cej.a aVarL = bVar9.l();
                s.j(aVarL);
                return hy1.g.b(aVarA11, aVarA12, aVar8, aVarL);
            case 28:
                aoj.a aVar9 = dVar.L;
                afj.b bVar10 = dVar.N;
                doj.a aVarA13 = aVar9.a();
                s.j(aVarA13);
                oej.a aVarA14 = dVar.M.a();
                s.j(aVarA14);
                hej.a aVar10 = (hej.a) bVar10.z0.get();
                s.j(aVar10);
                cej.a aVarL2 = bVar10.l();
                s.j(aVarL2);
                return hy1.g.a(aVarA13, aVarA14, aVar10, aVarL2);
            case 29:
                g9e.a aVarC = dVar.O.c();
                s.j(aVarC);
                o7.d dVar8 = new o7.d(aVarC);
                ppg.b bVarB = ((wpg.l) dVar.P).b();
                s.j(bVarB);
                mae.p pVarE = dVar.O.e();
                s.j(pVarE);
                f01.c cVarG = dVar.Q.g();
                l70.e eVar2 = dVar.R;
                t70.b bVarG = eVar2.g();
                s.j(bVarG);
                o oVarY = db5.e.y(pVarE, cVarG, bVarG);
                l80.e eVarH2 = eVar2.h();
                s.j(eVarH2);
                gc7.f fVar6 = new gc7.f(oVarY, eVarH2);
                wif.a aVarA15 = dVar.C.a();
                ypf.b bVarB2 = dVar.S.b();
                r0 r0VarC2 = dVar.H.c();
                vo1.c cVarA = ((up1.e) dVar.T).a();
                s.j(cVarA);
                cl3.a aVarD = dVar.U.d();
                s.j(aVarD);
                nhf.a aVarA16 = dVar.V.a();
                s.j(aVarA16);
                com.revolut.feature.home_feed.impl.widgets.scheduled_payments.a aVar11 = new com.revolut.feature.home_feed.impl.widgets.scheduled_payments.a(dVar.J.a());
                lb5.b bVarA2 = dVar.W.a();
                s.j(bVarA2);
                return new com.revolut.feature.home_feed.impl.widgets.scheduled_payments.b(dVar8, bVarB, fVar6, aVarA15, bVarB2, r0VarC2, cVarA, aVarD, aVarA16, aVar11, bVarA2);
            case 30:
                e15.a aVarA17 = dVar.X.a();
                s.j(aVarA17);
                return hy1.g.e(aVarA17);
            case 31:
                qjb.i iVarF = ((fob.a) dVar.Y).f();
                s.j(iVarF);
                jmd.d dVar9 = dVar.f269640x;
                mmd.b bVar11 = (mmd.b) dVar9.B0.get();
                s.j(bVar11);
                emd.d dVarU = dVar.u();
                wif.a aVarA18 = dVar.C.a();
                ang.f fVarE = dVar.f269583a0.e();
                n nVarB = dVar.f269586b0.b();
                nqj.c cVarC = ((dqj.r) dVar.c0).c();
                s.j(cVarC);
                dsd.f fVarK = dVar9.k();
                gte.a aVarB3 = dVar.f269610l.b();
                s.j(aVarB3);
                l80.e eVarH3 = dVar.R.h();
                s.j(eVarH3);
                return a0k.b.D(iVarF, new zc7.i(bVar11, dVarU, aVarA18, fVarE, nVarB, cVarC, fVarK, aVarB3, eVarH3));
            case 32:
                mmd.b bVar12 = (mmd.b) dVar.f269640x.B0.get();
                s.j(bVar12);
                emd.d dVarU2 = dVar.u();
                wif.a aVarA19 = dVar.C.a();
                ang.f fVarE2 = dVar.f269583a0.e();
                n nVarB2 = dVar.f269586b0.b();
                nqj.c cVarC2 = ((dqj.r) dVar.c0).c();
                s.j(cVarC2);
                dsd.f fVarK2 = dVar.f269640x.k();
                gte.a aVarB4 = dVar.f269610l.b();
                s.j(aVarB4);
                l80.e eVarH4 = dVar.R.h();
                s.j(eVarH4);
                return new zc7.i(bVar12, dVarU2, aVarA19, fVarE2, nVarB2, cVarC2, fVarK2, aVarB4, eVarH4);
            case 33:
                n69.a aVar12 = dVar.f269591d0;
                did.d dVar10 = dVar.f269594e0;
                p69.a aVarA20 = aVar12.a();
                s.j(aVarA20);
                x xVar = new x(dVar10.d());
                w39.b bVarA3 = dVar.f0.a();
                s.j(bVarA3);
                return kxa.j.w(aVarA20, xVar, bVarA3, new mjd.b(new ljd.b(), dVar10.f114992a.a()), dVar.f269631t.a());
            case 34:
                return l.w(dVar.g0.a());
            case 35:
                qjb.i iVarF2 = ((fob.a) dVar.Y).f();
                s.j(iVarF2);
                return qjb.a.a(iVarF2);
            case 36:
                qjb.i iVarF3 = ((fob.a) dVar.Y).f();
                s.j(iVarF3);
                return qjb.h.a(iVarF3);
            case 37:
                qjb.i iVarF4 = ((fob.a) dVar.Y).f();
                s.j(iVarF4);
                return qjb.b.a(iVarF4);
            case 38:
                qjb.i iVarF5 = ((fob.a) dVar.Y).f();
                s.j(iVarF5);
                return qjb.c.a(iVarF5);
            case 39:
                qjb.i iVarF6 = ((fob.a) dVar.Y).f();
                s.j(iVarF6);
                return qjb.g.a(iVarF6);
            case 40:
                qjb.i iVarF7 = ((fob.a) dVar.Y).f();
                s.j(iVarF7);
                return qjb.d.a(iVarF7);
            case 41:
                qjb.i iVarF8 = ((fob.a) dVar.Y).f();
                s.j(iVarF8);
                return qjb.f.a(iVarF8);
            case 42:
                qjb.i iVarF9 = ((fob.a) dVar.Y).f();
                s.j(iVarF9);
                return qjb.e.a(iVarF9);
            case 43:
                return jr9.h.g(new f61.a(((h30.n) dVar.f269602h0).p0));
            case 44:
                return m4d.e.o(dVar.i0.a());
            case 45:
                e8b.a aVarA21 = dVar.j0.a();
                s.j(aVarA21);
                t5b.a aVarB5 = dVar.j0.b();
                s.j(aVarB5);
                q5b.c cVarC3 = dVar.f269607k0.c();
                s.j(cVarC3);
                return trl.f.g(aVarA21, aVarB5, cVarC3);
            case 46:
                e8b.a aVarA22 = dVar.j0.a();
                s.j(aVarA22);
                t5b.a aVarB6 = dVar.j0.b();
                s.j(aVarB6);
                q5b.c cVarC4 = dVar.f269607k0.c();
                s.j(cVarC4);
                return trl.f.e(aVarA22, aVarB6, cVarC4);
            case 47:
                return l.i(dVar.l0.b());
            case 48:
                iw7.b bVar13 = (iw7.b) dVar.m0.f249798l.get();
                s.j(bVar13);
                return new wc7.f(bVar13, new wc7.b(new sr7.i(dVar.Q.g())));
            case 49:
                m6e.a aVarA23 = dVar.f269615n0.a();
                s.j(aVarA23);
                return m6e.c.a(aVarA23);
            case 50:
                m6e.a aVarA24 = dVar.f269615n0.a();
                s.j(aVarA24);
                return m4d.e.f(aVarA24);
            case 51:
                m6e.a aVarA25 = dVar.f269615n0.a();
                s.j(aVarA25);
                return m4d.e.g(aVarA25);
            case 52:
                m6e.a aVarA26 = dVar.f269615n0.a();
                s.j(aVarA26);
                return m4d.e.w(aVarA26);
            case 53:
                qjb.i iVarF10 = ((fob.a) dVar.Y).f();
                s.j(iVarF10);
                return qgh.c.y(iVarF10);
            case 54:
                m6e.a aVarA27 = dVar.f269615n0.a();
                s.j(aVarA27);
                return m6e.b.a(aVarA27);
            case 55:
                r57.b bVarA4 = dVar.f269618o0.a();
                s.j(bVarA4);
                return n57.a.e(bVarA4);
            case 56:
                r57.b bVarA5 = dVar.f269618o0.a();
                s.j(bVarA5);
                return n57.a.n(bVarA5);
            case 57:
                r57.b bVarA6 = dVar.f269618o0.a();
                s.j(bVarA6);
                return n57.a.o(bVarA6);
            case 58:
                r57.b bVarA7 = dVar.f269618o0.a();
                s.j(bVarA7);
                return n57.a.s(bVarA7);
            case 59:
                r57.b bVarA8 = dVar.f269618o0.a();
                s.j(bVarA8);
                return n57.a.q(bVarA8);
            case 60:
                r57.b bVarA9 = dVar.f269618o0.a();
                s.j(bVarA9);
                return n57.a.r(bVarA9);
            case 61:
                r57.b bVarA10 = dVar.f269618o0.a();
                s.j(bVarA10);
                return n57.a.y(bVarA10);
            case 62:
                r57.b bVarA11 = dVar.f269618o0.a();
                s.j(bVarA11);
                return n57.a.B(bVarA11);
            case 63:
                r57.b bVarA12 = dVar.f269618o0.a();
                s.j(bVarA12);
                return n57.a.x(bVarA12);
            case 64:
                r57.b bVarA13 = dVar.f269618o0.a();
                s.j(bVarA13);
                return n57.a.p(bVarA13);
            case 65:
                ppd.n nVar = dVar.p0;
                ite.a aVar13 = nVar.f238482a;
                dqj.r rVar2 = (dqj.r) nVar.f238484b;
                eqj.d dVarA2 = rVar2.a();
                s.j(dVarA2);
                v vVarC = nVar.c();
                kzi.a aVarB7 = rVar2.b();
                s.j(aVarB7);
                cpd.h hVar3 = new cpd.h();
                xod.b bVarF = nVar.f();
                xod.e eVarG = nVar.g();
                fsd.c cVar5 = new fsd.c();
                thf.c cVarC5 = nVar.f238490h.c();
                s.j(cVarC5);
                xod.i iVar2 = new xod.i(new yod.f(cVar5, cVarC5, nVar.k()), nVar.h());
                h0 h0VarI = nVar.i();
                xod.s sVarJ = nVar.j();
                xod.n nVarH = nVar.h();
                gte.a aVarB8 = aVar13.b();
                s.j(aVarB8);
                xod.h hVar4 = new xod.h(h0VarI, sVarJ, nVarH, aVarB8);
                xod.n nVarH2 = nVar.h();
                gte.a aVarB9 = aVar13.b();
                s.j(aVarB9);
                return new mc7.g(new lmd.d(dVarA2, vVarC, aVarB7, hVar3, new xod.p(bVarF, eVarG, iVar2, hVar4, new xod.c(nVarH2, aVarB9)), nVar.d()), dVar.C.a());
            case 66:
                z68.a aVarI = ((k78.b) dVar.o).i();
                s.j(aVarI);
                return aVarI;
            case 67:
                x68.a aVarE2 = ((k78.b) dVar.o).e();
                s.j(aVarE2);
                return aVarE2;
            case 68:
                c78.a aVarP = ((k78.b) dVar.o).p();
                s.j(aVarP);
                return aVarP;
            case 69:
                y68.a aVarG = ((k78.b) dVar.o).g();
                s.j(aVarG);
                return aVarG;
            case 70:
                b78.a aVarL3 = ((k78.b) dVar.o).l();
                s.j(aVarL3);
                return aVarL3;
            case 71:
                a78.b bVarK = ((k78.b) dVar.o).k();
                s.j(bVarK);
                return bVarK;
            case 72:
                return ((k78.b) dVar.o).b();
            case 73:
                p69.a aVarA28 = dVar.f269591d0.a();
                s.j(aVarA28);
                return kxa.j.v(aVarA28);
            case 74:
                return l.v(dVar.g0.a());
            case 75:
                r2d.h hVarA4 = dVar.f269644y.a();
                s.j(hVarA4);
                return oyj.c.d(hVarA4, new kc7.a(), dVar.k());
            case 76:
                doj.a aVarA29 = dVar.L.a();
                s.j(aVarA29);
                ioj.a aVar14 = (ioj.a) dVar.N.A0.get();
                s.j(aVar14);
                return hy1.g.p(aVarA29, aVar14);
            case 77:
                s3d.l lVarB5 = dVar.A.b();
                s.j(lVarB5);
                return p0.g(lVarB5, dVar.v(), new fd7.a());
            case 78:
                s3d.l lVarB6 = dVar.A.b();
                s.j(lVarB6);
                return p0.z(lVarB6, new o7.b(dVar.v()));
            case 79:
                return m4d.e.p(dVar.i0.a());
            case 80:
                e8b.a aVarA30 = dVar.j0.a();
                s.j(aVarA30);
                return trl.f.c(aVarA30);
            case 81:
                return xb1.a.m(dVar.m0);
            case 82:
                r57.b bVarA14 = dVar.f269618o0.a();
                s.j(bVarA14);
                return ms1.g.m(bVarA14);
            case 83:
                r57.b bVarA15 = dVar.f269618o0.a();
                s.j(bVarA15);
                return n57.a.i(bVarA15);
            case 84:
                r57.b bVarA16 = dVar.f269618o0.a();
                s.j(bVarA16);
                return n57.a.k(bVarA16);
            case 85:
                r57.b bVarA17 = dVar.f269618o0.a();
                s.j(bVarA17);
                return n57.a.m(bVarA17);
            case 86:
                r57.b bVarA18 = dVar.f269618o0.a();
                s.j(bVarA18);
                return n57.a.l(bVarA18);
            case 87:
                r57.b bVarA19 = dVar.f269618o0.a();
                s.j(bVarA19);
                return n57.a.j(bVarA19);
            case 88:
                a95.f fVar7 = (a95.f) dVar.f269582a.C.get();
                s.j(fVar7);
                return t2d.c.s(fVar7);
            case 89:
                z85.f fVar8 = (z85.f) dVar.f269582a.D.get();
                s.j(fVar8);
                return t2d.c.p(fVar8);
            case 90:
                pw4.g gVar5 = (pw4.g) dVar.d.u.get();
                s.j(gVar5);
                return gg0.g.d(gVar5);
            case 91:
                uw4.h hVar5 = (uw4.h) dVar.d.f176288w.get();
                s.j(hVar5);
                return gg0.g.i(hVar5);
            case 92:
                m6e.a aVarA31 = dVar.f269615n0.a();
                s.j(aVarA31);
                return m4d.e.v(aVarA31);
            case 93:
                m6e.a aVarA32 = dVar.f269615n0.a();
                s.j(aVarA32);
                return m4d.e.b(aVarA32);
            case 94:
                qjb.i iVarF11 = ((fob.a) dVar.Y).f();
                s.j(iVarF11);
                return qgh.c.B(iVarF11);
            case 95:
                qjb.i iVarF12 = ((fob.a) dVar.Y).f();
                s.j(iVarF12);
                return qgh.c.D(iVarF12);
            case 96:
                qjb.i iVarF13 = ((fob.a) dVar.Y).f();
                s.j(iVarF13);
                return qgh.c.z(iVarF13);
            case 97:
                qjb.i iVarF14 = ((fob.a) dVar.Y).f();
                s.j(iVarF14);
                return qgh.c.A(iVarF14);
            case 98:
                qjb.i iVarF15 = ((fob.a) dVar.Y).f();
                s.j(iVarF15);
                return qgh.c.C(iVarF15);
            case 99:
                return jr9.h.f(new f61.a(((h30.n) dVar.f269602h0).p0));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        trl.a aVar = (trl.a) this.f265379c;
        int i = this.f265378b;
        switch (i) {
            case 0:
                TradingOrdersService tradingOrdersService = (TradingOrdersService) aVar.B.get();
                b80.c cVarP = aVar.f273812c.p();
                s.j(cVarP);
                return new prl.r(tradingOrdersService, cVarP, (ue0.c) aVar.C.get(), new ne0.d());
            case 1:
                return trl.f.z(aVar.f273808a, (Retrofit) aVar.A.get());
            case 2:
                trl.e eVar = aVar.f273808a;
                Retrofit retrofitI = ((c21.b) aVar.f273810b).i();
                s.j(retrofitI);
                return t2d.c.j(eVar, retrofitI, (kg.o) aVar.z.get());
            case 3:
                return t2d.c.i(aVar.f273808a);
            case 4:
                an0.c cVar = aVar.d;
                ee0.a aVar2 = aVar.e;
                yk0.a aVarB = cVar.b();
                s.j(aVarB);
                je0.d dVarB = aVar2.b();
                s.j(dVarB);
                xe0.f fVarF = aVar2.f();
                s.j(fVarF);
                return jr9.h.s(dVarB, fVarF, aVarB);
            case 5:
                j4i.a aVar3 = aVar.f273814g;
                return new m(new l4i.a(), new kpj.f(aVar.f273815h.H()));
            case 6:
                c1l.e eVarA = aVar.i.a();
                ybl.b bVarB = aVar.f273816j.b();
                s.j(bVarB);
                return new csl.c(eVarA, bVarB);
            case 7:
                return new u0((prl.r) aVar.D.get());
            case 8:
                return new vrl.a((prl.b) aVar.I.get());
            case 9:
                return new prl.b((ue0.c) aVar.H.get());
            case 10:
                je0.d dVarB2 = aVar.e.b();
                s.j(dVarB2);
                xe0.f fVarF2 = aVar.e.f();
                s.j(fVarF2);
                return t2d.c.k(dVarB2, fVarF2);
            case 11:
                u0 u0Var = (u0) aVar.G.get();
                vrl.g gVar = (vrl.g) aVar.N.get();
                ybl.d dVarH = aVar.f273816j.h();
                s.j(dVarH);
                return new y0(u0Var, gVar, dVarH);
            case 12:
                e4m.e eVar2 = aVar.M;
                zdl.c cVar2 = aVar.f273816j;
                prl.h hVar = (prl.h) eVar2.get();
                ybl.b bVarB2 = cVar2.b();
                s.j(bVarB2);
                prl.r rVar = (prl.r) aVar.D.get();
                ybl.d dVarH2 = cVar2.h();
                s.j(dVarH2);
                p0i.b bVarE = aVar.f273818m.e();
                s.j(bVarE);
                xua.a aVarA = aVar.f273819n.a();
                s.j(aVarA);
                ang.f fVarE = aVar.o.e();
                gte.a aVarB2 = aVar.f273820p.b();
                s.j(aVarB2);
                return new vrl.m(hVar, bVarB2, rVar, dVarH2, bVarE, aVarA, fVarE, aVarB2);
            case 13:
                e4m.e eVar3 = aVar.B;
                l70.e eVar4 = aVar.f273812c;
                TradingOrdersService tradingOrdersService2 = (TradingOrdersService) eVar3.get();
                b80.c cVarP2 = eVar4.p();
                s.j(cVarP2);
                prl.f fVar = new prl.f(tradingOrdersService2, cVarP2, (krl.l) aVar.L.get(), new ne0.d());
                TradingOrdersService tradingOrdersService3 = (TradingOrdersService) aVar.B.get();
                b80.c cVarP3 = eVar4.p();
                s.j(cVarP3);
                prl.e eVar5 = new prl.e(tradingOrdersService3, cVarP3, (krl.l) aVar.L.get(), new ne0.d());
                CoroutineScope coroutineScopeA = aVar.f273817l.a();
                s.j(coroutineScopeA);
                return new prl.h(fVar, eVar5, coroutineScopeA);
            case 14:
                return jr9.h.n((OrdersDatabase) aVar.K.get());
            case 15:
                Context context = aVar.k;
                yk0.a aVarB3 = aVar.d.b();
                s.j(aVarB3);
                return jr9.h.i(context, aVarB3, ((c21.b) aVar.f273810b).b());
            case 16:
                return new vrl.s((prl.r) aVar.D.get());
            case 17:
                return new vrl.b((prl.r) aVar.D.get());
            case 18:
                return new hsl.h();
            case 19:
                nil.c cVarA = aVar.f273821q.a();
                s.j(cVarA);
                return new q(cVarA);
            case 20:
                hsl.k kVar = new hsl.k();
                ite.a aVar4 = aVar.f273820p;
                ite.a aVar5 = aVar.f273820p;
                gte.a aVarB4 = aVar4.b();
                s.j(aVarB4);
                hsl.l lVar = new hsl.l(aVarB4);
                gte.a aVarB5 = aVar5.b();
                s.j(aVarB5);
                hsl.j jVar = new hsl.j(aVarB5);
                hsl.n nVar = new hsl.n();
                gte.a aVarB6 = aVar5.b();
                s.j(aVarB6);
                return new hsl.o(kVar, lVar, jVar, nVar, aVarB6, new hsl.m());
            case 21:
                return new vrl.o((prl.j) aVar.W.get(), aVar.f273822r.a());
            case 22:
                return new prl.j((MonthlyInvestmentsService) aVar.U.get(), new ne0.d(), (ue0.c) aVar.V.get());
            case 23:
                return t2d.c.v(aVar.f273808a, (Retrofit) aVar.A.get());
            case 24:
                je0.d dVarB3 = aVar.e.b();
                s.j(dVarB3);
                yk0.a aVarB7 = aVar.d.b();
                s.j(aVarB7);
                xe0.f fVarF3 = aVar.e.f();
                s.j(fVarF3);
                return jr9.h.p(dVarB3, fVarF3, aVarB7);
            case 25:
                return new wul.c();
            case 26:
                return new wul.e(aVar.k(), (xul.l) aVar.E.get(), (csl.e) aVar.Z.get(), new nbh.a(), new ssl.b());
            case 27:
                l80.e eVarH = aVar.f273812c.h();
                s.j(eVarH);
                return new csl.g(eVarH);
            case 28:
                n0 n0Var = new n0();
                npk.a aVar6 = aVar.f273822r;
                h9h.a aVar7 = aVar.f273815h;
                d0 d0Var = new d0(aVar6.a(), new o0());
                n nVarB = aVar.f273823s.b();
                ybl.k kVarD = aVar.f273824t.d();
                s.j(kVarD);
                wzg.a aVarE = aVar7.e();
                s.j(aVarE);
                ybl.l lVarF = aVar7.f();
                kpj.f fVar2 = new kpj.f(aVar7.H());
                m2j.j jVarC = aVar.u.c();
                z8h.g gVarU = aVar7.u();
                CoroutineScope coroutineScopeA2 = aVar.f273817l.a();
                s.j(coroutineScopeA2);
                return new l0(n0Var, d0Var, nVarB, kVarD, aVarE, lVarF, fVar2, jVarC, gVarU, coroutineScopeA2);
            case 29:
                return new htl.b();
            case 30:
                an0.c cVar3 = aVar.d;
                ee0.a aVar8 = aVar.e;
                yk0.a aVarB8 = cVar3.b();
                s.j(aVarB8);
                je0.d dVarB4 = aVar8.b();
                s.j(dVarB4);
                xe0.f fVarF4 = aVar8.f();
                s.j(fVarF4);
                return jr9.h.o(dVarB4, fVarF4, aVarB8);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        u06.c cVar = (u06.c) this.f265379c;
        c51.c cVar2 = cVar.f276071a;
        int i = this.f265378b;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return c21.l.o(cVar2.f21322a);
                }
                throw new AssertionError(i);
            }
            wli.d dVar = (wli.d) cVar2.f21325g.get();
            s.j(dVar);
            return new s06.a(dVar, new s06.p());
        }
        s06.a aVar = (s06.a) cVar.f276074g.get();
        uli.b bVarA = cVar2.a();
        uli.d dVar2 = new uli.d();
        q06.d dVarA = cVar.f276072b.a();
        s.j(dVarA);
        uli.e eVar = new uli.e();
        sri.m mVarD = ((g8b.a) cVar.f276073c).d();
        s.j(mVarD);
        com.revolut.analytics.tracking.v3.c cVarE = cVar.d.e();
        f80.a aVarX = cVar.e.x();
        s.j(aVarX);
        return new s06.j(aVar, bVarA, dVar2, dVarA, eVar, mVarD, cVarE, aVarX, e4m.b.a(cVar.f276075h), new wri.b(), cVar.f.a(), new c51.i());
    }

    private final Object d() {
        u45.h hVar = (u45.h) this.f265379c;
        int i = this.f265378b;
        switch (i) {
            case 0:
                y45.i iVarI = hVar.f277124a.i();
                s.j(iVarI);
                return new a95.f(iVarI, new c55.o0());
            case 1:
                y45.i iVarI2 = hVar.f277124a.i();
                s.j(iVarI2);
                z85.g gVar = new z85.g();
                sri.m mVarD = ((g8b.a) hVar.f277126b).d();
                s.j(mVarD);
                return new z85.f(iVarI2, gVar, mVarD);
            case 2:
                return new c55.o();
            case 3:
                return new l45.a();
            case 4:
                e4m.e eVar = hVar.K;
                j35.a aVar = hVar.f277124a;
                z zVar = (z) eVar.get();
                f0 f0VarD = aVar.d();
                s.j(f0VarD);
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) hVar.f277132h).c();
                s.j(aVarC);
                y45.i iVarI3 = aVar.i();
                s.j(iVarI3);
                f0 f0VarD2 = aVar.d();
                s.j(f0VarD2);
                y45.g gVar2 = new y45.g(f0VarD2);
                y51.a aVarA = hVar.i.a();
                s.j(aVarA);
                ang.f fVarE = hVar.f277133j.e();
                n nVarB = hVar.k.b();
                y45.j jVarH = aVar.h();
                s.j(jVarH);
                zj4.a aVar2 = (zj4.a) hVar.f277134l.f.get();
                s.j(aVar2);
                return new y45.f(zVar, f0VarD, aVarC, iVarI3, gVar2, aVarA, fVarE, nVarB, jVarH, aVar2);
            case 5:
                e4m.e eVar2 = hVar.I;
                nj0.a aVar3 = hVar.f277131g;
                LoanService loanService = (LoanService) eVar2.get();
                ne0.d hashMapCache = new ne0.d();
                x45.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(hashMapCache, "hashMapCache");
                xx4.d dVar = new xx4.d(hashMapCache);
                ue0.c storage = (ue0.c) hVar.J.get();
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new z(loanService, dVar, new xx4.e(storage), new ecm.q(((nj0.d) aVar3).f216295c), new mp.r(((nj0.d) aVar3).f216295c), ((nj0.d) aVar3).k());
            case 6:
                x45.b bVar = hVar.f277128c;
                LoanService loanService2 = (LoanService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) hVar.H.get(), "retrofit", LoanService.class, "create(...)");
                s.k(loanService2);
                return loanService2;
            case 7:
                x45.b bVar2 = hVar.f277128c;
                Retrofit retrofitJ = ((c21.b) hVar.d).j();
                s.j(retrofitJ);
                kg.o oVar = (kg.o) hVar.G.get();
                Retrofit.Builder builderX = p.a.x(retrofitJ, "retrofit", oVar, "gson");
                builderX.converterFactories().clear();
                Retrofit retrofitBuild = builderX.addConverterFactory(GsonConverterFactory.create(oVar)).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                s.k(retrofitBuild);
                return retrofitBuild;
            case 8:
                kg.o gson = ((c21.b) hVar.d).h();
                s.j(gson);
                x45.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(gson, "gson");
                return h55.a.a(gson);
            case 9:
                le0.b gsonObjectMapperFactory = hVar.e.c();
                s.j(gsonObjectMapperFactory);
                kg.o baseGson = fe0.c.a();
                yk0.a databaseSessionProvider = hVar.f.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = hVar.e.f();
                s.j(storageFactory);
                x45.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
                Intrinsics.checkNotNullParameter(baseGson, "baseGson");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.g(storageFactory, databaseSessionProvider, "loan", gsonObjectMapperFactory.a(new kg.p(baseGson).b()), m55.d.f202809b, m55.d.f202808a, false, 96);
            case 10:
                return new k45.c(new k45.a(), (m35.r) hVar.M.get());
            case 11:
                return new c55.n0(new c55.r());
            case 12:
                return new c55.l();
            case 13:
                return new c55.h0();
            case 14:
                return new g55.a((r35.e) hVar.P.get());
            case 15:
                y45.i iVarI4 = hVar.f277124a.i();
                s.j(iVarI4);
                l35.h hVarF = hVar.f277124a.f();
                s.j(hVarF);
                return new g55.c(iVarI4, hVarF);
            case 16:
                return new g55.b();
            case 17:
                return new c55.g(hVar.o.a(), hVar.f277133j.e());
            case 18:
                return new c55.n(new c55.m());
            case 19:
                return new c55.a();
            case 20:
                return new j0((m35.k) hVar.O.get());
            case 21:
                return new c55.p(hVar.f277124a.b());
            case 22:
                return new c0(hVar.f277124a.b());
            case 23:
                return new b55.b(new b55.c());
            case 24:
                return new c55.q(new c55.m());
            case 25:
                return new o55.c((LoanChecklistService) hVar.f277125a0.get());
            case 26:
                return wpg.v.r(hVar.f277128c, (Retrofit) hVar.H.get());
            case 27:
                return new y45.b((o55.b) hVar.f277129d0.get());
            case 28:
                return new o55.b((LoanCancellationService) hVar.c0.get(), new e55.a(uq3.b.b(), new f1()));
            case 29:
                return wpg.v.q(hVar.f277128c, (Retrofit) hVar.H.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        u7i.l lVar = (u7i.l) this.f265379c;
        ee0.a aVar = lVar.f277820a;
        w7i.a aVar2 = lVar.e;
        l70.e eVar = lVar.f277824c;
        jk3.c cVar = lVar.i;
        ite.a aVar3 = lVar.f277830j;
        u8h.c cVar2 = lVar.f277832l;
        xmg.a aVar4 = lVar.f277828h;
        int i = this.f265378b;
        switch (i) {
            case 0:
                return new f8i.b();
            case 1:
                je0.d dVarB = aVar.b();
                s.j(dVarB);
                yk0.a aVarB = lVar.f277822b.b();
                s.j(aVarB);
                xe0.f fVarF = aVar.f();
                s.j(fVarF);
                y80.a aVarR = eVar.r();
                s.j(aVarR);
                return trl.f.w(dVarB, aVarB, fVarF, aVarR);
            case 2:
                xua.a aVarA = lVar.d.a();
                s.j(aVarA);
                return new c8i.f0(aVarA, aVar2.c(), lVar.f.a(), aVar2.a());
            case 3:
                l80.e eVarH = eVar.h();
                s.j(eVarH);
                cdi.b bVar = (cdi.b) lVar.f277827g.f173123p.get();
                s.j(bVar);
                n7i.z zVar = new n7i.z(aVar4.e(), new n7i.a0());
                l61.a aVarB2 = aVar4.b();
                s.j(aVarB2);
                tul.b bVar2 = new tul.b(aVarB2);
                fk3.a aVarA2 = cVar.a();
                s.j(aVarA2);
                q6i.n nVar = new q6i.n(aVarA2, aVar4.e());
                g0 g0VarA = lVar.a();
                kdh.b bVar3 = new kdh.b(((zc6.a) lVar.k).b(), new by5.a(new l6i.c()));
                gte.a aVarB3 = aVar3.b();
                s.j(aVarB3);
                r6i.a aVar5 = new r6i.a(aVarB3);
                r6i.b bVar4 = new r6i.b();
                usc.a aVarF = ((u8h.b) cVar2).f();
                gah.f fVarA = ((u8h.b) cVar2).a();
                s.j(fVarA);
                return new q6i.a0(eVarH, bVar, zVar, bVar2, nVar, g0VarA, bVar3, aVar5, bVar4, new q6i.h(aVarF, trl.f.v(fVarA)));
            case 4:
                return new e6i.a(lVar.f277833m.c(), new p1i.i(), new t8i.d());
            case 5:
                aah.i iVarD = ((u8h.b) cVar2).d();
                s.j(iVarD);
                aah.m mVarM = trl.f.m(iVarD);
                z0h.a aVarB4 = ((u8h.b) cVar2).b();
                s.j(aVarB4);
                n7i.o oVar = new n7i.o(lVar.o.f());
                fk3.a aVarA3 = cVar.a();
                s.j(aVarA3);
                q6i.n nVar2 = new q6i.n(aVarA3, aVar4.e());
                n7i.z zVar2 = new n7i.z(aVar4.e(), new n7i.a0());
                l61.a aVarB5 = aVar4.b();
                s.j(aVarB5);
                q06.l lVarA = lVar.f277837p.a();
                s.j(lVarA);
                return new e6i.b(mVarM, aVarB4, oVar, nVar2, zVar2, aVarB5, lVarA);
            case 6:
                djb.n nVarA = lVar.J.a();
                s.j(nVarA);
                ijb.a aVarG = ((blb.e) lVar.U).g();
                s.j(aVarG);
                p6i.j jVar = new p6i.j(nVarA, aVarG);
                gte.a aVarB6 = aVar3.b();
                s.j(aVarB6);
                return new i0(jVar, aVarB6, new p6i.a(), lVar.L.a(), new i6i.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        u8h.b bVar = (u8h.b) this.f265379c;
        cri.b bVar2 = bVar.f278204g;
        int i = this.f265378b;
        switch (i) {
            case 0:
                ybl.l lVarA = bVar.f278201a.a();
                s.j(lVarA);
                fk3.a aVarA = bVar.f278202b.a();
                s.j(aVarA);
                l61.a aVarB = bVar.f278203c.b();
                s.j(aVarB);
                return new aah.f(lVarA, aVarA, aVarB);
            case 1:
                return new gah.c(bVar.f());
            case 2:
                ne0.d dVar = new ne0.d();
                nj0.d dVar2 = (nj0.d) bVar.d;
                ik0.b bVarM = dVar2.m();
                s.j(bVarM);
                return new e8h.p0(dVar, u8h.g.a(dVar2.d(), bVarM), bVar.e());
            case 3:
                return new aah.c();
            case 4:
                return new gah.a(((s41.a) bVar2).d());
            case 5:
                z0h.d dVar3 = (z0h.d) bVar.k.get();
                z0h.a aVar = (z0h.a) bVar.f278209n.get();
                Set setW = qgh.c.w(bVar.f278205h.f245848a);
                aah.b bVar3 = new aah.b();
                qy5.a aVar2 = new qy5.a(new aah.b());
                ite.a aVar3 = bVar.i;
                gte.a aVarB2 = aVar3.b();
                s.j(aVarB2);
                bah.p pVar = new bah.p(bVar3, aVar2, aVarB2);
                bah.n nVar = new bah.n();
                aah.b bVar4 = new aah.b();
                gte.a aVarB3 = aVar3.b();
                s.j(aVarB3);
                bah.d dVar4 = new bah.d(bVar4, aVarB3);
                bah.j jVar = new bah.j();
                bah.k kVar = new bah.k();
                qy5.a aVar4 = new qy5.a(new aah.b());
                cah.b bVar5 = new cah.b();
                gte.a aVarB4 = aVar3.b();
                s.j(aVarB4);
                return new aah.i(dVar3, aVar, setW, ImmutableSet.of((bah.h) pVar, (bah.h) nVar, (bah.h) dVar4, (bah.h) jVar, (bah.h) kVar, new bah.h(aVar4, bVar5, aVarB4), (bah.h[]) new pzg.a[]{new bah.q(), new bah.b(new qy5.a(new aah.b())), new bah.f(new aah.b())}), ImmutableMap.of("UK_DISCLAIMER_COMPARATOR", (aah.j) new aah.k(), "DEFAULT_DISCLAIMER_COMPARATOR", new aah.j()), ((s41.a) bVar2).d());
            case 6:
                return new gah.f((d1h.d) bVar.o.get(), (d1h.f) bVar.f278208m.get(), ((s41.a) bVar2).d());
            case 7:
                return new r8h.e();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        ubf.d dVar = (ubf.d) this.f265379c;
        int i = this.f265378b;
        switch (i) {
            case 0:
                wbf.k kVar = (wbf.k) dVar.C.get();
                wbf.j jVar = (wbf.j) dVar.D.get();
                gte.a aVarB = dVar.e.b();
                s.j(aVarB);
                return new wbf.n(kVar, jVar, aVarB);
            case 1:
                return new wbf.k((rbf.d) dVar.B.get());
            case 2:
                b80.c cVarP = dVar.f278856a.p();
                s.j(cVarP);
                return new rbf.d(cVarP, (TradingAddOnsService) dVar.u.get(), (ne0.j) dVar.v.get(), (pbf.e) dVar.f278870w.get(), (ue0.c) dVar.f278872y.get(), (pbf.d) dVar.z.get(), (pbf.c) dVar.A.get());
            case 3:
                return o5k.i.z((Retrofit) dVar.f278869t.get());
            case 4:
                Retrofit retrofitI = ((c21.b) dVar.f278857b).i();
                s.j(retrofitI);
                return trl.f.h((kg.o) dVar.f278868s.get(), retrofitI);
            case 5:
                return ubf.j.a();
            case 6:
                return new ne0.d();
            case 7:
                return new pbf.e();
            case 8:
                je0.d dVar2 = (je0.d) dVar.f278871x.get();
                yk0.a aVarB2 = dVar.d.b();
                s.j(aVarB2);
                xe0.f fVarF = dVar.f278858c.f();
                s.j(fVarF);
                return o5k.i.i(dVar2, fVarF, aVarB2);
            case 9:
                le0.b bVarC = dVar.f278858c.c();
                s.j(bVarC);
                return o5k.i.o((kg.o) dVar.f278868s.get(), bVarC);
            case 10:
                return new pbf.d();
            case 11:
                return new pbf.c();
            case 12:
                return new wbf.j((rbf.d) dVar.B.get());
            case 13:
                return new wbf.o((rbf.d) dVar.B.get());
            case 14:
                return new wbf.a((rbf.d) dVar.B.get(), dVar.f.f());
            case 15:
                return new xbf.f((kbf.a) dVar.E.get(), (te0.u) dVar.H.get());
            case 16:
                return o5k.i.b((ue0.c) dVar.f278872y.get());
            case 17:
                return new xbf.g((mbf.d) dVar.J.get());
            case 18:
                return new xbf.h(dVar.f278859g.g(), ((ika.b) dVar.f278860h).b());
            case 19:
                return new kcf.f((mbf.c) dVar.I.get(), (xbf.g) dVar.K.get());
            case 20:
                return new ubf.b(this);
            case 21:
                return new ubf.c(this);
            case 22:
                hcf.c cVar = (hcf.c) dVar.i.f278888a.get();
                s.j(cVar);
                return new hcf.b(cVar);
            case 23:
                e4m.e eVar = dVar.E;
                ika.f fVar = dVar.f278860h;
                kbf.a aVar = (kbf.a) eVar.get();
                zja.a aVarA = ((ika.b) fVar).a();
                s.j(aVarA);
                return new xbf.d(aVar, aVarA, (wbf.e) dVar.P.get(), dVar.f.f(), ((ika.b) fVar).b());
            case 24:
                ybl.k kVarD = dVar.f278861j.d();
                s.j(kVarD);
                ybl.d dVarH = dVar.k.h();
                s.j(dVarH);
                return new wbf.g(dVarH, kVarD);
            case 25:
                sri.m mVarD = ((g8b.a) dVar.f278862l).d();
                s.j(mVarD);
                return new zbf.a(mVarD);
            case 26:
                return new wbf.h((rbf.d) dVar.B.get());
            case 27:
                return new wbf.l((rbf.d) dVar.B.get());
            case 28:
                return new wbf.c((kbf.a) dVar.E.get(), (rbf.d) dVar.B.get());
            case 29:
                return new wbf.b((rbf.d) dVar.B.get());
            case 30:
                return new wbf.i((rbf.d) dVar.B.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        uf6.b bVar = (uf6.b) this.f265379c;
        a31.a aVar = bVar.f279548j;
        a31.a aVar2 = bVar.f279556t;
        a31.a aVar3 = bVar.f279549l;
        a31.a aVar4 = bVar.e;
        a31.a aVar5 = bVar.v;
        a31.a aVar6 = bVar.f279547h;
        a31.a aVar7 = bVar.f279544b;
        a31.a aVar8 = bVar.d;
        a31.a aVar9 = bVar.f279553q;
        a31.a aVar10 = bVar.f279545c;
        a31.a aVar11 = bVar.o;
        ecm.q qVar = bVar.f279543a;
        int i = this.f265378b;
        switch (i) {
            case 0:
                return new l3(qVar, aVar7, aVar10, aVar8, aVar4, bVar.f, bVar.f279546g, aVar6, bVar.i, aVar, bVar.k, aVar3, bVar.f279550m, bVar.f279551n, aVar11, bVar.f279552p, aVar9, bVar.f279554r, bVar.f279555s, bVar.D, bVar.u, aVar5, bVar.f279557w, bVar.f279558x, bVar.f279559y, bVar.z, aVar2);
            case 1:
                return trl.f.A((yf6.a) bVar.C.get());
            case 2:
                return yf6.b.d(aVar10, aVar3, aVar2, aVar, qVar);
            case 3:
                return xb1.a.b(bVar.F, aVar5, aVar4);
            case 4:
                return trl.f.B((l3) bVar.E.get());
            case 5:
                return xb1.a.c(bVar.F, aVar11, aVar6, bVar.A);
            case 6:
                return db5.e.c(qVar, bVar.F, aVar11, aVar9, aVar8, bVar.B, aVar10, aVar7);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        ufd.c cVar = (ufd.c) this.f265379c;
        a31.a aVar = cVar.f279657h;
        a31.a aVar2 = cVar.f279656g;
        a31.a aVar3 = cVar.d;
        a31.a aVar4 = cVar.f;
        int i = this.f265378b;
        if (i == 0) {
            return va.g.a(cVar.f279653a, cVar.f279654b, cVar.f279655c, aVar3, cVar.e, aVar4, aVar2, aVar, cVar.i);
        }
        if (i == 1) {
            return new dm5.a(aVar4, aVar3, aVar2, aVar, cVar.f279658j, 16);
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        Object aVar;
        Object aVar2;
        Object uVar;
        Object dVar;
        Object hVar;
        Object cVar;
        switch (this.f265377a) {
            case 0:
                b bVar = (b) this.f265379c;
                ee0.a aVar3 = bVar.f265382c;
                int i = this.f265378b;
                if (i == 0) {
                    TicketsService ticketsService = (TicketsService) bVar.f265383g.get();
                    z9l.b bVar2 = (z9l.b) bVar.f265381b.f293074a.get();
                    s.j(bVar2);
                    qse.i iVar = new qse.i(ticketsService, new qse.e(bVar2), (ne0.j) bVar.f265384h.get(), (ue0.c) bVar.i.get(), (re0.d) bVar.f265385j.get());
                    bal.a aVarB = ((vxc.b) bVar.e).b();
                    s.j(aVarB);
                    return new use.d(iVar, aVarB);
                }
                if (i == 1) {
                    return sg8.j.p(bVar.f265380a);
                }
                if (i == 2) {
                    return e.a();
                }
                if (i != 3) {
                    if (i == 4) {
                        return sg8.j.u((ne0.j) bVar.f265384h.get(), (ue0.c) bVar.i.get());
                    }
                    throw new AssertionError(i);
                }
                je0.d dVarB = aVar3.b();
                s.j(dVarB);
                yk0.a aVarB2 = bVar.d.b();
                s.j(aVarB2);
                xe0.f fVarF = aVar3.f();
                s.j(fVarF);
                return sg8.j.o(dVarB, aVarB2, fVarF);
            case 1:
                swh.a aVar4 = (swh.a) this.f265379c;
                int i2 = this.f265378b;
                if (i2 == 0) {
                    lpa.a aVar5 = (lpa.a) aVar4.f266221a.d.get();
                    s.j(aVar5);
                    l80.e eVarH = aVar4.f266222b.h();
                    s.j(eVarH);
                    uwh.a aVar6 = (uwh.a) aVar4.e.get();
                    lfm.c cVarB = ((g8b.a) aVar4.d).b();
                    s.j(cVarB);
                    return new twh.d(aVar5, eVarH, aVar6, cVarB);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                Retrofit retrofit = ((c21.b) aVar4.f266223c).i();
                s.j(retrofit);
                swh.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(ContextualPromptService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                ContextualPromptService contextualPromptService = (ContextualPromptService) objCreate;
                s.k(contextualPromptService);
                return new uwh.a(contextualPromptService);
            case 2:
                sz2.a aVar7 = (sz2.a) this.f265379c;
                a31.a aVar8 = aVar7.f266731g;
                a31.a aVar9 = aVar7.i;
                a31.a aVar10 = aVar7.e;
                a31.a aVar11 = aVar7.f266728a;
                a31.a aVar12 = aVar7.f266729b;
                int i3 = this.f265378b;
                if (i3 == 0) {
                    aVar = new tz2.a(aVar11, aVar12, aVar7.f266730c, aVar7.d, aVar10, aVar7.f, aVar8, aVar7.f266732h, aVar9);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new AssertionError(i3);
                        }
                        tz2.d dVar2 = (tz2.d) ((tz2.a) aVar7.f266743x.get()).b();
                        s.k(dVar2);
                        return dVar2;
                    }
                    aVar = new cu1.e(aVar7.f266733j, aVar12, aVar7.f266744y, aVar7.k, aVar7.f266734l, aVar11, aVar7.f266735m, aVar10, aVar7.f266736n, aVar9, aVar7.o, aVar7.f266737p, aVar7.f266738q, aVar7.f266739r, aVar7.f266740s, aVar7.f266741t, aVar7.u, aVar7.v, aVar7.f266742w, aVar8);
                }
                return aVar;
            case 3:
                sz5.e eVar = (sz5.e) this.f265379c;
                u2c.a aVar13 = eVar.f266761b;
                nj0.a aVar14 = eVar.f266760a;
                int i5 = this.f265378b;
                switch (i5) {
                    case 0:
                        OkHttpClient okHttpClient = (OkHttpClient) eVar.f266763g.get();
                        ik0.b bVarM = ((nj0.d) aVar14).m();
                        s.j(bVarM);
                        return sg8.j.t(bVarM, okHttpClient);
                    case 1:
                        xj0.i iVarL = ((nj0.d) aVar14).l();
                        s.j(iVarL);
                        ulm.d dVar3 = (ulm.d) eVar.f.get();
                        qz5.b bVar3 = (qz5.b) eVar.e.get();
                        x80.a aVarQ = eVar.f266762c.q();
                        s.j(aVarQ);
                        return sg8.j.r(iVarL, dVar3, bVar3, aVarQ, new nz5.a((qz5.b) eVar.e.get()), new nz5.e(new pz5.h()), ((nj0.d) aVar14).h());
                    case 2:
                        qz5.b bVar4 = (qz5.b) eVar.e.get();
                        ulm.d dVar4 = (ulm.d) aVar13.d.get();
                        s.j(dVar4);
                        aVar2 = new mz5.a(bVar4, dVar4);
                        break;
                    case 3:
                        r2c.a aVar15 = (r2c.a) aVar13.f276600c.get();
                        s.j(aVar15);
                        aVar2 = new qz5.b(aVar15, (ne0.j) eVar.d.get());
                        break;
                    case 4:
                        return new ne0.d();
                    case 5:
                        OkHttpClient okHttpClient2 = (OkHttpClient) eVar.i.get();
                        ik0.b bVarM2 = ((nj0.d) aVar14).m();
                        s.j(bVarM2);
                        return sg8.j.s(bVarM2, okHttpClient2);
                    case 6:
                        xj0.i iVarL2 = ((nj0.d) aVar14).l();
                        s.j(iVarL2);
                        return sg8.j.q(iVarL2, new nz5.e(new pz5.h()), new nz5.a((qz5.b) eVar.e.get()), (ulm.d) eVar.f.get());
                    default:
                        throw new AssertionError(i5);
                }
                return aVar2;
            case 4:
                t0b.k kVar = (t0b.k) this.f265379c;
                int i6 = this.f265378b;
                if (i6 == 0) {
                    return t0b.e.a();
                }
                if (i6 == 1) {
                    return t0b.f.a();
                }
                if (i6 == 2) {
                    return sg8.j.d(kVar.a(), kVar.b());
                }
                if (i6 == 3) {
                    return new o0b.e((AdvancedChartsService) kVar.i.get(), (ne0.j) kVar.f266973g.get(), (ue0.c) kVar.f266974h.get());
                }
                if (i6 == 4) {
                    return t0b.d.a(((nj0.d) kVar.f266970a).f());
                }
                if (i6 == 5) {
                    return t0b.j.a();
                }
                throw new AssertionError(i6);
            case 5:
                t15.d dVar5 = (t15.d) this.f265379c;
                int i21 = this.f265378b;
                switch (i21) {
                    case 0:
                        r rVar = dVar5.f267158b;
                        ite.a aVar16 = dVar5.f;
                        lla.a aVar17 = dVar5.d;
                        a3 a3Var = dVar5.f267159c;
                        r rVar2 = dVar5.f267158b;
                        al4.n nVarS = rVar.s();
                        s.j(nVarS);
                        al4.q qVarA = rVar2.a();
                        zk4.a aVar18 = a3Var.f175963a;
                        cm4.h hVarG = aVar18.g();
                        m25.q qVar = new m25.q(aVar18.g(), new g25.l(), new m25.r(aVar17.a()), dVar5.e.d());
                        m25.a aVar19 = new m25.a();
                        m25.r rVar3 = new m25.r(aVar17.a());
                        gte.a aVarB3 = aVar16.b();
                        s.j(aVarB3);
                        m25.l lVar = new m25.l(hVarG, qVar, new m25.u(aVar19, rVar3, aVarB3));
                        p96.a aVar20 = new p96.a(new CreditCardStatementSectionMapper(), new CreditCardAdministrationFeeMapper());
                        al4.p pVarI = rVar2.i();
                        al4.u uVarJ = rVar2.j();
                        al4.c cVarG = rVar2.g();
                        al4.j jVarC = rVar2.c();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) dVar5.f267160g).c();
                        s.j(aVarC);
                        ang.f fVarE = dVar5.f267161h.e();
                        g25.p pVarD = dVar5.d();
                        o25.i iVarE = dVar5.e();
                        aw4.b bVar5 = (aw4.b) a3Var.f175966b0.get();
                        s.j(bVar5);
                        w wVar = (w) rVar2.E.get();
                        s.j(wVar);
                        al4.n nVarS2 = rVar2.s();
                        s.j(nVarS2);
                        k25.w wVar2 = new k25.w(nVarS2);
                        m4 m4VarD = rVar2.d();
                        v0 v0Var = (v0) rVar2.R.get();
                        s.j(v0Var);
                        ssi.o oVarC = dVar5.f267162j.c();
                        s.j(oVarC);
                        gte.a aVarB4 = aVar16.b();
                        s.j(aVarB4);
                        l80.e eVarH2 = dVar5.k.h();
                        s.j(eVarH2);
                        kpj.f fVar = new kpj.f(new m25.n(eVarH2));
                        mce.a aVar21 = new mce.a();
                        js7.f fVarA = dVar5.f267163l.a();
                        s.j(fVarA);
                        uVar = new k25.u(nVarS, qVarA, lVar, aVar20, pVarI, uVarJ, cVarG, jVarC, aVarC, fVarE, pVarD, iVarE, bVar5, wVar, wVar2, m4VarD, v0Var, oVarC, aVarB4, fVar, aVar21, fVarA);
                        break;
                    case 1:
                        u45.h hVar2 = dVar5.f267164m;
                        u45.h hVar3 = dVar5.f267164m;
                        y45.i iVarI = hVar2.i();
                        l35.b bVarN = hVar3.n();
                        s.j(bVarN);
                        gte.a aVarB5 = dVar5.f.b();
                        s.j(aVarB5);
                        w25.e eVar2 = new w25.e(aVarB5);
                        m35.r rVarO = hVar3.o();
                        s.j(rVarO);
                        w25.a aVar22 = new w25.a(eVar2, rVarO, new g25.l(), new w25.f(dVar5.d.a()));
                        m35.h hVar4 = (m35.h) hVar3.W.get();
                        s.j(hVar4);
                        m35.j jVar = (m35.j) hVar3.X.get();
                        s.j(jVar);
                        return new u25.i(iVarI, bVarN, aVar22, new w25.h(hVar4, jVar, new c55.r()), hVar3.g(), hVar3.e(), hVar3.j(), dVar5.d(), dVar5.e(), dVar5.f267165n.a());
                    case 2:
                        o95.g gVarC = dVar5.o.c();
                        s.j(gVarC);
                        return new x25.c(gVarC, dVar5.d());
                    case 3:
                        oi9.f fVar2 = dVar5.f267166p;
                        oi9.f fVar3 = dVar5.f267166p;
                        xh9.a aVarE = fVar2.e();
                        s.j(aVarE);
                        vi9.n nVarN = fVar3.n();
                        vi9.l lVarM = fVar3.m();
                        gk9.b bVar6 = new gk9.b(fVar3.l());
                        gte.a aVarB6 = dVar5.f.b();
                        s.j(aVarB6);
                        y25.j jVar2 = new y25.j(aVarB6);
                        ti9.h hVarB = fVar3.b();
                        g25.p pVarD2 = dVar5.d();
                        ui9.z zVar = (ui9.z) fVar3.G.get();
                        s.j(zVar);
                        oj9.f fVar4 = new oj9.f();
                        xh9.e eVar3 = (xh9.e) fVar3.F.get();
                        s.j(eVar3);
                        vi9.b bVarL = fVar3.l();
                        l80.e eVarH3 = fVar3.o.h();
                        s.j(eVarH3);
                        uVar = new y25.h(aVarE, nVarN, lVarM, bVar6, jVar2, hVarB, pVarD2, zVar, fVar4, eVar3, new vi9.g0(bVarL, eVarH3));
                        break;
                    case 4:
                        return new r25.e(new os2.g(dVar5, 25));
                    case 5:
                        a35.l lVar2 = new a35.l((a35.n) dVar5.G.get());
                        ms1.g.c(lVar2);
                        return lVar2;
                    case 6:
                        ImmutableMap immutableMapOf = ImmutableMap.of(CreditAccountType.CreditCard.class, (a35.i) dVar5.B.get(), CreditAccountType.Loan.class, (a35.i) dVar5.C.get(), CreditAccountType.PayLater.class, (a35.i) dVar5.E.get(), CreditAccountType.Overdraft.class, (a35.i) dVar5.D.get());
                        uvl.c cVarC = dVar5.c();
                        xq3.j jVarG = dVar5.f267157a.g();
                        s.j(jVarG);
                        return new a35.q(immutableMapOf, cVarC, jVarG);
                    case 7:
                        dVar5.getClass();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
                        builderBuilderWithExpectedSize.put(CreditAccountType.CreditCard.class, dVar5.B.get());
                        builderBuilderWithExpectedSize.put(CreditAccountType.Loan.class, dVar5.C.get());
                        builderBuilderWithExpectedSize.put(CreditAccountType.PayLater.class, dVar5.E.get());
                        builderBuilderWithExpectedSize.put(CreditAccountType.Overdraft.class, dVar5.D.get());
                        uvl.c cVarC2 = dVar5.c();
                        g25.p pVarD3 = dVar5.d();
                        g25.s sVar = new g25.s(new g25.x(), new g25.u(), new g25.w());
                        aq3.a aVarE2 = dVar5.f267157a.e();
                        s.j(aVarE2);
                        builderBuilderWithExpectedSize.put(CreditAccountType.Application.class, new g25.i(cVarC2, pVarD3, sVar, aVarE2, new o25.e(), dVar5.f267165n.b()));
                        builderBuilderWithExpectedSize.put(CreditAccountType.EmptyState.class, dVar5.e());
                        a35.g gVar = new a35.g(builderBuilderWithExpectedSize.build());
                        ms1.g.b(gVar);
                        return gVar;
                    case 8:
                        gte.a aVarB7 = dVar5.f.b();
                        s.j(aVarB7);
                        s25.d dVar6 = new s25.d(aVarB7, new s25.e(new s25.a()), new s25.b());
                        ms1.g.d(dVar6);
                        return dVar6;
                    case 9:
                        dVar5.getClass();
                        return new s25.c(new s25.e(new s25.a()), new s25.b());
                    case 10:
                        return new a35.f();
                    case 11:
                        return new a35.e(dVar5.f267158b.i(), dVar5.f267158b.e());
                    case 12:
                        return new f25.a();
                    case 13:
                        return new y15.d(trl.f.o(dVar5.f267168r), (a35.n) dVar5.G.get());
                    case 14:
                        r rVar4 = dVar5.f267158b;
                        da3.j jVar3 = dVar5.f267170t;
                        al4.q qVarA2 = rVar4.a();
                        mt8.d dVarB2 = dVar5.f267169s.b();
                        s.j(dVarB2);
                        l93.f fVarJ = jVar3.j();
                        s.j(fVarJ);
                        f73.c cVar2 = new f73.c();
                        t70.g gVarO = dVar5.k.o();
                        s.j(gVarO);
                        al4.p pVarI2 = dVar5.f267158b.i();
                        m93.g gVarI = jVar3.i();
                        s.j(gVarI);
                        uVar = new c25.c(qVarA2, dVarB2, fVarJ, cVar2, gVarO, pVarI2, new d25.c(gVarI, dVar5.u.g()));
                        break;
                    case 15:
                        com.revolut.feature.credit.impl.notifications.data.i iVar2 = new com.revolut.feature.credit.impl.notifications.data.i((CreditCollectionNotificationSettingsService) dVar5.R.get(), (ne0.j) dVar5.S.get(), (ue0.c) dVar5.T.get());
                        gte.a aVarB8 = dVar5.f.b();
                        s.j(aVarB8);
                        return new a25.a(iVar2, aVarB8, dVar5.f267158b.i());
                    case 16:
                        return z0g.f1.h((Retrofit) dVar5.Q.get());
                    case 17:
                        Retrofit retrofitJ = ((c21.b) dVar5.v).j();
                        s.j(retrofitJ);
                        kg.o oVarH = ((c21.b) dVar5.v).h();
                        s.j(oVarH);
                        return z0g.f1.i(oVarH, retrofitJ);
                    case 18:
                        return z15.c.a();
                    case 19:
                        ue0.c cVar3 = (ue0.c) ((c21.b) dVar5.v).A.get();
                        s.j(cVar3);
                        z0g.f1.x(cVar3);
                        return cVar3;
                    case 20:
                        hy3.j jVar4 = (hy3.j) ((c1) dVar5.i).Q1.get();
                        s.j(jVar4);
                        return new e25.h(jVar4, dVar5.u.g());
                    case 21:
                        return new e25.b();
                    case 22:
                        return new e25.f(dVar5.f267165n.a(), trl.f.q(dVar5.f267168r), (a35.n) dVar5.G.get());
                    case 23:
                        al4.n nVarS3 = dVar5.f267158b.s();
                        s.j(nVarS3);
                        return new v15.k(nVarS3, dVar5.f267161h.e());
                    default:
                        throw new AssertionError(i21);
                }
                return uVar;
            case 6:
                t15.g gVar2 = (t15.g) this.f265379c;
                a31.a aVar23 = gVar2.f267196y;
                a31.a aVar24 = gVar2.v;
                a31.a aVar25 = gVar2.f267182c;
                int i22 = this.f265378b;
                if (i22 == 0) {
                    return new t15.b(gVar2.f267180a, gVar2.f267181b, aVar25, gVar2.d, gVar2.e, gVar2.f, gVar2.f267183g, gVar2.f267184h, gVar2.i, gVar2.f267185j, gVar2.k, gVar2.f267186l, gVar2.f267187m, gVar2.f267188n, gVar2.o, gVar2.f267189p, gVar2.f267190q, gVar2.f267191r, gVar2.f267192s, gVar2.f267193t, gVar2.u, aVar24, gVar2.f267194w, gVar2.f267195x, aVar23, gVar2.z, gVar2.A, gVar2.B, 0);
                }
                if (i22 == 1) {
                    return iz8.c.c(aVar25, aVar24, aVar23, gVar2.C);
                }
                throw new AssertionError(i22);
            case 7:
                ta9.m mVar = (ta9.m) this.f265379c;
                int i32 = this.f265378b;
                switch (i32) {
                    case 0:
                        qb9.d dVar7 = (qb9.d) mVar.f269236a.i.get();
                        s.j(dVar7);
                        pre.c cVarA = mVar.f269238b.a();
                        s.j(cVarA);
                        fk3.a aVarA = mVar.f269240c.a();
                        s.j(aVarA);
                        dVar = new db9.d(dVar7, cVarA, aVarA);
                        break;
                    case 1:
                        e4m.e eVar4 = mVar.Q;
                        da3.j jVar5 = mVar.d;
                        dc9.b bVar7 = (dc9.b) eVar4.get();
                        q89.e eVar5 = (q89.e) mVar.P.get();
                        l93.f fVarJ2 = jVar5.j();
                        s.j(fVarJ2);
                        l93.a aVar26 = (l93.a) jVar5.A.get();
                        s.j(aVar26);
                        cha.a aVar27 = (cha.a) mVar.f.K.get();
                        s.j(aVar27);
                        return new ec9.b(bVar7, eVar5, fVarJ2, aVar26, aVar27);
                    case 2:
                        l93.f fVarJ3 = mVar.d.j();
                        s.j(fVarJ3);
                        ng0.b bVar8 = (ng0.b) mVar.e.W.get();
                        s.j(bVar8);
                        dVar = new dc9.b(fVarJ3, bVar8);
                        break;
                    case 3:
                        dVar = new gc9.a((x89.a) mVar.U.get());
                        break;
                    case 4:
                        dVar = new jc9.c((PromptsService) mVar.S.get(), (ne0.j) mVar.T.get());
                        break;
                    case 5:
                        return ta9.j0.a(((nj0.d) mVar.f269243g).f());
                    case 6:
                        return new ne0.d();
                    case 7:
                        return new xa9.d();
                    case 8:
                        return new ga9.b();
                    case 9:
                        n8b.a aVarA2 = mVar.f269245j.a();
                        s.j(aVarA2);
                        v60.e eVarA = mVar.k.a();
                        s.j(eVarA);
                        dVar = new ua9.a(aVarA2, eVarA, new jb9.h());
                        break;
                    case 10:
                        je0.d dVarD = mVar.f269252s.d();
                        s.j(dVarD);
                        dVar = new fb9.b(dVarD);
                        break;
                    case 11:
                        dVar = new db9.f((qb9.g) mVar.f269239b0.get());
                        break;
                    case 12:
                        dVar = new qb9.g((WaitingListService) mVar.f269237a0.get());
                        break;
                    case 13:
                        return ta9.l0.a(((nj0.d) mVar.f269243g).f());
                    case 14:
                        return ta9.k0.a(mVar.D);
                    case 15:
                        return m0.a();
                    case 16:
                        return new fc9.a();
                    default:
                        throw new AssertionError(i32);
                }
                return dVar;
            case 8:
                ta9.c0 c0Var = (ta9.c0) this.f265379c;
                a31.a aVar28 = c0Var.f269192y;
                a31.a aVar29 = c0Var.f269191x;
                a31.a aVar30 = c0Var.f269179g;
                a31.a aVar31 = c0Var.f269186q;
                a31.a aVar32 = c0Var.f;
                a31.a aVar33 = c0Var.f269187r;
                a31.a aVar34 = c0Var.f269185p;
                int i33 = this.f265378b;
                if (i33 == 0) {
                    return new ta9.h0(c0Var.f269176a, c0Var.f269177b, c0Var.f269178c, c0Var.d, c0Var.e, aVar32, aVar30, c0Var.f269180h, c0Var.i, c0Var.f269181j, c0Var.k, c0Var.f269182l, c0Var.f269183m, c0Var.f269184n, c0Var.o, aVar34, aVar31, aVar33, c0Var.f269188s, c0Var.f269189t, c0Var.u, c0Var.v, c0Var.f269190w, c0Var.P, c0Var.A, c0Var.B, c0Var.C, c0Var.D, c0Var.E, c0Var.R, c0Var.F, c0Var.G, c0Var.H, c0Var.I, aVar29, c0Var.J, c0Var.K, c0Var.L, aVar28, c0Var.M, c0Var.N);
                }
                if (i33 == 1) {
                    e0 e0Var = (e0) ((ta9.p0) c0Var.O.get()).b();
                    s.k(e0Var);
                    return e0Var;
                }
                if (i33 == 2) {
                    return new ta9.p0(aVar30, aVar29, aVar28, c0Var.z);
                }
                if (i33 == 3) {
                    return t2d.c.C((ta9.o0) c0Var.Q.get());
                }
                if (i33 == 4) {
                    return new ta9.o0(aVar34, aVar33, aVar32, aVar31, c0Var.P);
                }
                throw new AssertionError(i33);
            case 9:
                return a();
            case 10:
                tf5.e eVar6 = (tf5.e) this.f265379c;
                int i43 = this.f265378b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        return s2l.c.p(eVar6.f270227a);
                    }
                    if (i43 == 2) {
                        return new qf5.a();
                    }
                    throw new AssertionError(i43);
                }
                sri.m mVar2 = (sri.m) eVar6.f270236p.get();
                tnb.g0 g0VarA = eVar6.f270228b.a();
                ai5.b bVarB = eVar6.f270229c.b();
                s.j(bVarB);
                mf5.c cVarA2 = eVar6.d.a();
                s.j(cVarA2);
                return new rf5.b(mVar2, g0VarA, bVarB, cVarA2);
            case 11:
                th0.a aVar35 = (th0.a) this.f265379c;
                sg0.c mobileServicesConfiguration = aVar35.f271231b;
                Context context = aVar35.f271230a;
                int i59 = this.f265378b;
                if (i59 == 0) {
                    return new oh0.a(context);
                }
                if (i59 == 1) {
                    th0.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    return new yh0.c(new ufm.g(context), new i90.b());
                }
                if (i59 == 2) {
                    ii0.b impl = new ii0.b();
                    th0.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(impl, "impl");
                    Intrinsics.checkNotNullParameter(mobileServicesConfiguration, "mobileServicesConfiguration");
                    mobileServicesConfiguration.getClass();
                    return impl;
                }
                if (i59 == 3) {
                    return new zh0.e(new uqi.b(context, 3));
                }
                if (i59 == 4) {
                    return new ji0.a(context);
                }
                if (i59 != 5) {
                    throw new AssertionError(i59);
                }
                th0.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(mobileServicesConfiguration, "mobileServicesConfiguration");
                uh0.c cVar4 = new uh0.c();
                Function0 function0B = mobileServicesConfiguration.b();
                ClassLoader classLoader = context.getClassLoader();
                Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
                return new oi0.b(cVar4, new et0.a0(function0B, classLoader));
            case 12:
                ti3.a aVar36 = (ti3.a) this.f265379c;
                q8b.a aVar37 = aVar36.f271409b;
                l70.e eVar7 = aVar36.f271408a;
                int i66 = this.f265378b;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new AssertionError(i66);
                    }
                    z80.b bVarS = eVar7.s();
                    s.j(bVarS);
                    n8b.b bVarB2 = aVar37.b();
                    s.j(bVarB2);
                    return new ri3.b(bVarS, bVarB2);
                }
                ri3.b bVar9 = (ri3.b) aVar36.d.get();
                fk3.b bVarB3 = aVar36.f271410c.b();
                s.j(bVarB3);
                qd0.b bVarN2 = eVar7.n();
                s.j(bVarN2);
                o8b.f fVar5 = (o8b.f) aVar37.e.get();
                s.j(fVar5);
                return new ri3.a(bVar9, bVarB3, bVarN2, fVar5);
            case 13:
                int i74 = this.f265378b;
                if (i74 == 0) {
                    tql.c.Companion.getClass();
                    return new rql.a(new ne0.d(ne0.b.HASH));
                }
                if (i74 == 1) {
                    return new rql.b();
                }
                if (i74 == 2) {
                    tql.a aVar38 = (tql.a) this.f265379c;
                    ij0.a aVar39 = aVar38.f273617b;
                    x60.a aVarA3 = aVar38.f273618c.a();
                    s.j(aVarA3);
                    return t2d.c.z(aVar39, aVarA3);
                }
                if (i74 != 3) {
                    throw new AssertionError(i74);
                }
                uql.a gsonFactory = new uql.a();
                tql.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(gsonFactory, "gsonFactory");
                kg.p pVar = new kg.p();
                pVar.c(new he0.k(), new TypeToken<String>() { // from class: com.revolut.sso.network.impl.gson.GsonFactory$create$1
                }.getType());
                he0.m mVarB = he0.m.b(vql.d.class, "code");
                mVarB.c(vql.a.class, "9401");
                mVarB.c(vql.c.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVarB, "registerFallbackSubtype(...)");
                pVar.e.add(mVarB);
                kg.o oVarB = pVar.b();
                Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                return oVarB;
            case 14:
                tr2.r rVar5 = (tr2.r) this.f265379c;
                int i92 = this.f265378b;
                if (i92 == 0) {
                    return new c43.a(rVar5.f273689a, rVar5.f273690b, rVar5.f273691c, rVar5.d, rVar5.e, rVar5.f, rVar5.f273692g, rVar5.f273693h, rVar5.i, rVar5.f273694j, rVar5.k, rVar5.f273695l, rVar5.f273696m, rVar5.f273697n, rVar5.o, rVar5.f273698p, rVar5.f273703w, rVar5.f273699q, rVar5.f273700r, rVar5.f273701s, rVar5.f273702t, rVar5.u);
                }
                if (i92 != 1) {
                    if (i92 == 2) {
                        return new tr2.h();
                    }
                    throw new AssertionError(i92);
                }
                tr2.s sVar2 = (tr2.s) ((tr2.h) rVar5.v.get()).b();
                s.k(sVar2);
                return sVar2;
            case 15:
                tr8.a aVar40 = (tr8.a) this.f265379c;
                int i96 = this.f265378b;
                switch (i96) {
                    case 0:
                        JuniorTransferRequestService juniorTransferRequestService = (JuniorTransferRequestService) aVar40.k.get();
                        pr8.a aVar41 = (pr8.a) aVar40.f273758m.get();
                        ne0.j jVar6 = (ne0.j) aVar40.f273759n.get();
                        ze0.a aVarA4 = aVar40.f.a();
                        s.j(aVarA4);
                        hVar = new zr8.h(juniorTransferRequestService, aVar41, jVar6, aVarA4);
                        break;
                    case 1:
                        return t2d.c.o(aVar40.f273751a, ((nj0.d) aVar40.f273752b).f());
                    case 2:
                        return t2d.c.m((JuniorTransferRequestDatabase) aVar40.f273757l.get());
                    case 3:
                        Context context2 = aVar40.f273753c;
                        yk0.a aVarB9 = aVar40.d.b();
                        s.j(aVarB9);
                        de0.a aVarA5 = ((cl0.a) aVar40.e).a();
                        s.j(aVarA5);
                        return t2d.c.n(context2, aVarB9, aVarA5);
                    case 4:
                        return new ne0.d();
                    case 5:
                        hVar = new nd.k(aVar40.b());
                        break;
                    case 6:
                        return new vr8.b();
                    default:
                        throw new AssertionError(i96);
                }
                return hVar;
            case 16:
                return b();
            case 17:
                ttc.a aVar42 = (ttc.a) this.f265379c;
                a31.a aVar43 = aVar42.f274299b;
                a31.a aVar44 = aVar42.d;
                a31.a aVar45 = aVar42.f;
                a31.a aVar46 = aVar42.A;
                a31.a aVar47 = aVar42.f274301g;
                a31.a aVar48 = aVar42.e;
                a31.a aVar49 = aVar42.i;
                ecm.q qVar2 = aVar42.f274298a;
                a31.a aVar50 = aVar42.f274302h;
                a31.a aVar51 = aVar42.F;
                a31.a aVar52 = aVar42.f274314y;
                a31.a aVar53 = aVar42.f274309r;
                int i99 = this.f265378b;
                if (i99 == 0) {
                    return new vtc.l0(qVar2, aVar43, aVar42.f274300c, aVar44, aVar48, aVar45, aVar47, aVar50, aVar49, aVar42.f274303j, aVar42.k, aVar42.f274304l, aVar42.f274305m, aVar42.f274306n, aVar42.o, aVar42.f274307p, aVar42.f274308q, aVar53, aVar42.f274310s, aVar42.f274311t, aVar42.u, aVar42.v, aVar42.f274312w, aVar42.f274313x, aVar52, aVar42.z, aVar46, aVar42.B, aVar42.C, aVar42.D, aVar42.N, aVar42.E, aVar51, aVar42.G, aVar42.H, aVar42.I, aVar42.J, aVar42.K, aVar42.L);
                }
                if (i99 == 1) {
                    return trl.f.C((vtc.r0) aVar42.M.get());
                }
                if (i99 == 2) {
                    return p0.b(aVar49, aVar48, aVar47, aVar46, aVar45, aVar44, aVar43, qVar2);
                }
                if (i99 == 3) {
                    return p0.a(aVar53, aVar52, aVar51, aVar50);
                }
                throw new AssertionError(i99);
            case 18:
                tz2.d dVar8 = (tz2.d) this.f265379c;
                int i100 = this.f265378b;
                if (i100 == 0) {
                    l93.f fVarJ4 = dVar8.f275751a.j();
                    s.j(fVarJ4);
                    hy2.f fVarA2 = dVar8.f275752b.a();
                    t tVarF = dVar8.f275753c.f();
                    s.j(tVarF);
                    return new uz2.b(fVarJ4, fVarA2, tVarF);
                }
                if (i100 != 1) {
                    if (i100 != 2) {
                        throw new AssertionError(i100);
                    }
                    n nVarB = dVar8.f275755h.b();
                    hj8.a aVarA6 = dVar8.i.a();
                    s.j(aVarA6);
                    return new u03.c(nVarB, aVarA6);
                }
                mae.p pVarE = dVar8.d.e();
                s.j(pVarE);
                f01.c cVarG2 = dVar8.e.g();
                t70.b bVarG = dVar8.f.g();
                s.j(bVarG);
                o oVarY = trl.f.y(pVarE, cVarG2, bVarG);
                gte.a aVarB10 = dVar8.f275754g.b();
                s.j(aVarB10);
                return new vz2.b(oVarY, aVarB10);
            case 19:
                u06.a aVar54 = (u06.a) this.f265379c;
                int i101 = this.f265378b;
                if (i101 == 0) {
                    q06.f fVar6 = (q06.f) aVar54.d.get();
                    uli.c cVarA3 = aVar54.f276062a.a();
                    s.j(cVarA3);
                    uli.f fVar7 = (uli.f) aVar54.f276063b.f16836b.get();
                    s.j(fVar7);
                    cVar = new s06.c(fVar6, cVarA3, fVar7);
                } else {
                    if (i101 == 1) {
                        return new s06.d(new c51.h());
                    }
                    if (i101 != 2) {
                        if (i101 == 3) {
                            return new x06.a();
                        }
                        if (i101 == 4) {
                            return new v06.g();
                        }
                        throw new AssertionError(i101);
                    }
                    lte.c cVar5 = (lte.c) aVar54.f276064c.f168370h.get();
                    s.j(cVar5);
                    cVar = new x06.b(cVar5, fe0.c.a());
                }
                return cVar;
            case 20:
                return c();
            case 21:
                u2c.a aVar55 = (u2c.a) this.f265379c;
                int i102 = this.f265378b;
                if (i102 == 0) {
                    return new r2c.a((AccessTokenService) aVar55.f276599b.get());
                }
                if (i102 == 1) {
                    Retrofit retrofitI = ((c21.b) aVar55.f276598a).i();
                    s.j(retrofitI);
                    return trl.f.b(retrofitI);
                }
                if (i102 != 2) {
                    throw new AssertionError(i102);
                }
                u2c.d.a();
                return ulm.d.f281081a;
            case 22:
                return d();
            case 23:
                return e();
            case 24:
                return f();
            case 25:
                u9k.a aVar56 = (u9k.a) this.f265379c;
                ecm.q qVar3 = aVar56.f278500a;
                int i103 = this.f265378b;
                if (i103 == 0) {
                    return new e79.j(qVar3, aVar56.f278501b, aVar56.f278502c, aVar56.d, aVar56.e, aVar56.f, aVar56.f278503g, aVar56.f278504h, 13);
                }
                if (i103 == 1) {
                    return e5f.b.b(qVar3);
                }
                throw new AssertionError(i103);
            case 26:
                return g();
            case 27:
                return h();
            case 28:
                return i();
            default:
                ufg.n0 n0Var = (ufg.n0) this.f265379c;
                int i104 = this.f265378b;
                if (i104 != 0) {
                    if (i104 == 1) {
                        return new wfg.b((vfg.g) n0Var.f279774c.get());
                    }
                    throw new AssertionError(i104);
                }
                xoj.a aVarA7 = n0Var.f279772a.a();
                s.j(aVarA7);
                eub.a aVarA8 = n0Var.f279773b.a();
                s.j(aVarA8);
                return new vfg.g(aVarA7, aVarA8);
        }
    }
}
