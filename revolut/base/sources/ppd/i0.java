package ppd;

import android.app.Activity;
import androidx.view.ComponentActivity;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.BiometricVerificationNfcV2ConsolidatedScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsSection;
import com.revolut.retail.feature.stockdetails.impl.ui.delegates.stats.kompot.CustomisedStatsDialogProvider;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.sentiment.IndexMarketSentimentControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsScreenContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.attrs.AttributesScreenContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.DetailedStatsControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.insights.InsightsScreenContract$InputData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import xf6.n1;
import z0h.q1;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f238435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f238436c;
    public final Object d;

    public /* synthetic */ i0(Object obj2, Object obj3, int i, int i2) {
        this.f238434a = i2;
        this.f238435b = obj2;
        this.d = obj3;
        this.f238436c = i;
    }

    private final Object a() {
        n nVar = (n) this.f238435b;
        ite.a aVar = nVar.f238482a;
        jmd.d dVar = nVar.f238489g;
        zc6.b bVar = nVar.f238502r0;
        k1 k1Var = (k1) this.d;
        n nVar2 = k1Var.f238462c;
        int i = this.f238436c;
        if (i == 0) {
            fd6.a aVar2 = (fd6.a) k1Var.e.get();
            va.g.t(aVar2);
            return aVar2;
        }
        if (i == 1) {
            return va.g.s(((zc6.a) bVar).d(), (xc6.a) k1Var.d.get());
        }
        if (i == 2) {
            return r6.b.k((zc6.a) bVar, "factory");
        }
        if (i == 3) {
            return va.g.u((xc6.a) k1Var.d.get());
        }
        if (i != 4) {
            if (i != 5) {
                throw new AssertionError(i);
            }
            fsd.c cVar = new fsd.c();
            fsd.b bVar2 = new fsd.b(new fsd.c());
            mzi.b bVarF = ((dqj.r) nVar2.f238484b).f();
            vc.s.j(bVarF);
            lnd.k0 k0Var = new lnd.k0(bVarF);
            TotalWealthContract$InputData totalWealthContract$InputData = k1Var.f238461b;
            ipd.h hVar = new ipd.h();
            mzi.b bVarF2 = ((dqj.r) nVar2.f238484b).f();
            vc.s.j(bVarF2);
            l80.e eVarH = nVar2.d.h();
            vc.s.j(eVarH);
            bsd.j jVar = new bsd.j(totalWealthContract$InputData, hVar, bVarF2, eVarH);
            bsd.e eVar = new bsd.e();
            l80.e eVarH2 = nVar2.d.h();
            vc.s.j(eVarH2);
            rrd.r rVar = new rrd.r();
            gte.a aVarB = nVar2.f238482a.b();
            vc.s.j(aVarB);
            bsd.h hVar2 = new bsd.h(eVar, eVarH2, rVar, aVarB);
            rrd.g gVar = new rrd.g();
            tsj.g gVarE = ((dqj.r) nVar.f238484b).e();
            vc.s.j(gVarE);
            TotalWealthContract$InputData totalWealthContract$InputData2 = k1Var.f238461b;
            zjh.j jVarC = ((zc6.a) bVar).c();
            rrd.k kVar = new rrd.k();
            gte.a aVarB2 = aVar.b();
            vc.s.j(aVarB2);
            return new zrd.y(cVar, bVar2, k0Var, jVar, hVar2, gVar, gVarE, totalWealthContract$InputData2, jVarC, kVar, aVarB2);
        }
        cli.n nVar3 = (cli.n) k1Var.f238464h.get();
        TotalWealthContract$InputData totalWealthContract$InputData3 = k1Var.f238461b;
        frd.i iVarI = dVar.i();
        usg.a aVar3 = nVar2.f;
        uq3.b bVar3 = nVar2.F0;
        oi9.f fVar = nVar2.D0;
        bpj.a aVar4 = nVar2.z0;
        ku5.g gVar2 = nVar2.y0;
        tib.b bVar4 = nVar2.M;
        aa1.a aVar5 = nVar2.f0;
        n1 n1Var = nVar2.f238511x0;
        ta7.a aVar6 = nVar2.f238488e0;
        e48.a aVar7 = nVar2.f238494l;
        ite.a aVar8 = nVar2.f238482a;
        xmg.a aVar9 = nVar2.i;
        npk.a aVar10 = nVar2.f238510x;
        jsd.a aVar11 = new jsd.a(aVar3.b(), aVar10.a(), new jsd.c(), k1Var.b());
        g48.r0 r0VarC = aVar7.c();
        wsg.n nVarB = aVar3.b();
        ppk.f fVarA = aVar10.a();
        hsd.b bVar5 = new hsd.b();
        twg.c cVarB = k1Var.b();
        gte.a aVarB3 = aVar8.b();
        vc.s.j(aVarB3);
        hsd.f fVar2 = new hsd.f(r0VarC, nVarB, fVarA, bVar5, cVarB, aVarB3);
        gr6.e eVarA = nVar2.u0.a();
        vc.s.j(eVarA);
        gr6.a aVarA = nVar2.f238483a0.a();
        vc.s.j(aVarA);
        a5h.g gVar3 = new a5h.g(eVarA, aVarA, new msd.d(), aVar3.b(), aVar10.a(), k1Var.b());
        bd3.a aVarA2 = nVar2.f238507v0.a();
        vc.s.j(aVarA2);
        ffk.t tVarF = nVar2.D.f();
        vc.s.j(tVarF);
        ppk.f fVarA2 = aVar10.a();
        wsg.n nVarB2 = aVar3.b();
        g6e.b bVarA = nVar2.f238491h0.a();
        vc.s.j(bVarA);
        gte.a aVarB4 = aVar8.b();
        vc.s.j(aVarB4);
        ksd.i iVar = new ksd.i(aVarB4);
        ldi.f fVarA3 = nVar2.f238509w0.a();
        vc.s.j(fVarA3);
        p38.a aVarA3 = aVar7.a();
        vc.s.j(aVarA3);
        gsd.c cVar2 = new gsd.c(aVar11, fVar2, gVar3, new ksd.g(aVarA2, tVarF, fVarA2, nVarB2, bVarA, iVar, fVarA3, aVarA3, k1Var.b(), aVar9.e(), aVar6.i()));
        wsg.n nVarB3 = aVar3.b();
        je6.h hVarC = ((xf6.t) nVar2.g0).c();
        vc.s.j(hVarC);
        vsd.e eVar2 = new vsd.e(hVarC);
        oe6.a aVarA4 = n1Var.a();
        vc.s.j(aVarA4);
        vsd.c cVar3 = new vsd.c(nVarB3, eVar2, aVarA4, aVar5.a(), 1);
        zsd.f fVar3 = new zsd.f(new dcd.b());
        blb.e eVar3 = (blb.e) bVar4;
        ijb.a aVarG = eVar3.g();
        vc.s.j(aVarG);
        toh.d dVarA = nVar2.f238505t.a();
        anb.s sVar = nVar2.f238492j;
        djb.n nVarA = sVar.a();
        vc.s.j(nVarA);
        djb.u uVarD = sVar.d();
        vc.s.j(uVarD);
        elb.b bVarE = eVar3.e();
        g48.r0 r0VarC2 = aVar7.c();
        gte.a aVarB5 = aVar8.b();
        vc.s.j(aVarB5);
        zsd.l lVar = new zsd.l(fVar3, aVarG, dVarA, nVarA, uVarD, bVarE, r0VarC2, aVarB5, aVar6.i(), ((fob.a) nVar2.f238497n0).h(), aVar9.e());
        wsg.n nVarB4 = aVar3.b();
        zdl.c cVar4 = nVar2.f238498o0;
        ybl.d dVarH = cVar4.h();
        vc.s.j(dVarH);
        zjh.f fVarA4 = nVar2.J.a();
        h9h.a aVar12 = nVar2.O;
        tzg.m mVarT = aVar12.t();
        vc.s.j(mVarT);
        ael.t tVarF2 = cVar4.f();
        vc.s.j(tVarF2);
        ybl.k kVarD = nVar2.N.d();
        vc.s.j(kVarD);
        ybl.l lVarF = aVar12.f();
        mu5.f fVarD = gVar2.d();
        rsd.d dVar2 = new rsd.d(nVar2.l());
        xoj.a aVarA5 = aVar4.a();
        vc.s.j(aVarA5);
        y1b.a aVarD = nVar2.A0.d();
        vc.s.j(aVarD);
        rsd.k kVar2 = new rsd.k(nVarB4, dVarH, fVarA4, mVarT, tVarF2, kVarD, lVarF, fVarD, dVar2, aVarA5, aVarD, aVar9.e());
        wsg.n nVarB5 = aVar3.b();
        mu5.f fVarD2 = gVar2.d();
        psd.g gVar4 = new psd.g(new wt5.a());
        ji5.m mVarE = nVar2.S.e();
        vc.s.j(mVarE);
        ppk.f fVarA5 = aVar10.a();
        xoj.a aVarA6 = aVar4.a();
        vc.s.j(aVarA6);
        ur5.c cVarD = t2d.c.d(aVar10.a(), aVar3.b());
        gte.a aVarB6 = aVar8.b();
        vc.s.j(aVarB6);
        p76.b bVar6 = nVar2.B0;
        psd.j jVar2 = new psd.j(nVarB5, fVarD2, gVar4, mVarE, fVarA5, aVarA6, cVarD, aVarB6, new psd.d(bVar6.b(), bVar6.a(), aVar10.a()));
        tsj.g gVarE2 = ((dqj.r) nVar2.f238484b).e();
        vc.s.j(gVarE2);
        gsd.c cVar5 = new gsd.c(gVarE2, new qsd.d(new rrd.b(), new rrd.f()), aVar10.a(), aVar3.b(), new j9l.a());
        wsg.n nVarB6 = aVar3.b();
        jm4.r rVar2 = nVar2.Z;
        al4.p pVarI = rVar2.i();
        al4.n nVarS = rVar2.s();
        vc.s.j(nVarS);
        osd.e eVar4 = new osd.e(nVarB6, pVarI, nVarS, aVar10.a(), new osd.a(nVar2.C0.f175963a.g()), rVar2.e());
        wsg.n nVarB7 = aVar3.b();
        je6.h hVarC2 = ((xf6.t) nVar2.g0).c();
        vc.s.j(hVarC2);
        vsd.e eVar5 = new vsd.e(hVarC2);
        oe6.a aVarA7 = n1Var.a();
        vc.s.j(aVarA7);
        vsd.c cVar6 = new vsd.c(nVarB7, eVar5, aVarA7, aVar5.a(), 0);
        xh9.a aVarE = fVar.e();
        vc.s.j(aVarE);
        gsd.c cVar7 = new gsd.c(aVarE, fVar.b(), aVar10.a(), aVar3.b(), new ysd.a());
        wsg.n nVarB8 = aVar3.b();
        ppk.f fVarA6 = aVar10.a();
        u45.h hVar3 = nVar2.E0;
        y45.i iVarI2 = hVar3.i();
        y45.h hVarG = hVar3.g();
        m35.r rVarO = hVar3.o();
        vc.s.j(rVarO);
        xsd.e eVar6 = new xsd.e(rVarO);
        xq3.j jVarG = bVar3.g();
        vc.s.j(jVarG);
        xsd.i iVar2 = new xsd.i(nVarB8, fVarA6, iVarI2, hVarG, eVar6, jVarG, aVar9.e());
        xld.d dVar3 = (xld.d) nVar2.f238489g.q0.get();
        vc.s.j(dVar3);
        xq3.j jVarG2 = bVar3.g();
        vc.s.j(jVarG2);
        dsd.i iVar3 = new dsd.i(cVar2, cVar3, lVar, kVar2, jVar2, cVar5, eVar4, cVar6, cVar7, iVar2, dVar3, jVarG2);
        yf8.a aVar13 = nVar2.l0;
        mj8.b bVar7 = nVar2.f238485b0;
        usg.a aVar14 = nVar2.f;
        zf8.o oVar = (zf8.o) aVar13.k.get();
        vc.s.j(oVar);
        wsg.n nVarB9 = aVar14.b();
        npk.a aVar15 = nVar2.f238510x;
        ppk.f fVarA7 = aVar15.a();
        isd.c cVar8 = new isd.c();
        g6e.d dVarB = nVar2.F.b();
        vc.s.j(dVarB);
        te8.v vVarD = nVar2.c0.d();
        vc.s.j(vVarD);
        g6e.b bVarA2 = nVar2.f238491h0.a();
        vc.s.j(bVarA2);
        a5h.g gVar5 = new a5h.g(dVarB, vVarD, new ksd.a(bVarA2), aVar15.a(), aVar14.b());
        hj8.a aVarA8 = bVar7.a();
        vc.s.j(aVarA8);
        a5h.g gVar6 = new a5h.g(oVar, nVarB9, fVarA7, cVar8, gVar5, aVarA8);
        djb.n nVarA2 = nVar2.f238492j.a();
        vc.s.j(nVarA2);
        zsd.f fVar4 = new zsd.f(new dcd.b());
        an8.b bVarA3 = nVar2.m0.a();
        vc.s.j(bVarA3);
        zsd.d dVar4 = new zsd.d(nVarA2, fVar4, bVarA3, nVar2.f238488e0.i(), ((fob.a) nVar2.f238497n0).h());
        jla.h hVarA = nVar2.f238487d0.a();
        ybl.k kVarD2 = nVar2.N.d();
        vc.s.j(kVarD2);
        ael.t tVarF3 = nVar2.f238498o0.f();
        vc.s.j(tVarF3);
        wsg.n nVarB10 = aVar14.b();
        hj8.a aVarA9 = bVar7.a();
        vc.s.j(aVarA9);
        ufm.d dVar5 = new ufm.d(gVar6, dVar4, new ssd.b(hVarA, kVarD2, tVarF3, nVarB10, aVarA9, nVar2.O.f(), new ssd.g(nVar2.l())));
        wsg.n nVarB11 = nVar.f.b();
        lmd.a aVarF = dVar.f();
        vc.s.j(aVarF);
        nqj.c cVarC = ((dqj.r) nVar2.f238484b).c();
        vc.s.j(cVarC);
        l80.e eVarH3 = nVar2.d.h();
        vc.s.j(eVarH3);
        r10.t tVar = new r10.t(cVarC, new c8i.j0(eVarH3, 1));
        dsd.f fVarK = dVar.k();
        wli.x xVarD = ((s41.a) nVar.q0).d();
        zjh.j jVar3 = new zjh.j(((zc6.a) nVar2.f238502r0).b());
        gte.a aVarB7 = aVar.b();
        vc.s.j(aVarB7);
        return new com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a(nVar3, totalWealthContract$InputData3, iVarI, iVar3, dVar5, nVarB11, aVarF, tVar, fVarK, xVarD, jVar3, aVarB7);
    }

    private final Object b() {
        pr.u uVar = (pr.u) this.f238435b;
        pr.w wVar = (pr.w) this.d;
        int i = this.f238436c;
        if (i == 0) {
            return new com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a(wVar.f238903a, (cli.n) wVar.f238904b.get(), new rt.b(), e4m.b.a(wVar.d), new st.a(), new st.b());
        }
        if (i == 1) {
            return new at.r(new rt.a(), new rt.c());
        }
        if (i == 2) {
            return new st.d((pt.m) wVar.f238905c.get(), new zjh.i(uVar.f238897c.f238869a), (f01.a) uVar.e.get());
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        pr.q qVar = (pr.q) this.f238435b;
        nmi.a aVar = qVar.k;
        pr.e0 e0Var = (pr.e0) this.d;
        int i = this.f238436c;
        if (i == 0) {
            ny.a extension = (ny.a) e0Var.d.get();
            ny.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            vc.s.k(extension);
            return extension;
        }
        if (i == 1) {
            return new ny.a((kmi.g) e0Var.f238841c.get());
        }
        if (i != 2) {
            if (i != 3) {
                throw new AssertionError(i);
            }
            au.f0 f0Var = new au.f0(e0Var.f238840b);
            BiometricVerificationNfcV2ConsolidatedScreenContract$InputData biometricVerificationNfcV2ConsolidatedScreenContract$InputData = e0Var.f238840b;
            yt.a aVarB = e0Var.b();
            ny.a aVar2 = (ny.a) e0Var.d.get();
            kmi.j jVar = (kmi.j) aVar.f217368c.get();
            vc.s.j(jVar);
            return new com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a(f0Var, biometricVerificationNfcV2ConsolidatedScreenContract$InputData, aVarB, aVar2, jVar, new hu.c(e0Var.b()), qVar.f238872g.a(), new cu.e(), new cu.c(), new cu.g(), new cu.b());
        }
        ViewController controller = e0Var.f238839a;
        kmi.c nfcDelegateFactory = (kmi.c) aVar.d.get();
        vc.s.j(nfcDelegateFactory);
        bu.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(nfcDelegateFactory, "nfcDelegateFactory");
        Activity activityM2 = controller.m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        ComponentActivity activity = (ComponentActivity) activityM2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        return new kmi.g(activity, new ogm.i(activity));
    }

    private final Object d() {
        prk.g0 g0Var = (prk.g0) this.f238435b;
        zdl.c cVar = g0Var.e;
        u8h.c cVar2 = g0Var.d;
        prk.e eVar = (prk.e) this.d;
        int i = this.f238436c;
        if (i == 0) {
            BaseScreen screen = eVar.f239082a;
            suk.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(screen, "screen");
            return (AnalystDetailsScreen) screen;
        }
        if (i == 1) {
            return a10.b.f((u8h.b) cVar2, "factory");
        }
        if (i != 2) {
            if (i == 3) {
                return new ruk.b0(new ruk.a0(new qwk.b(), new ruk.x(), new ruk.y(), new ruk.z(), (q1) eVar.f.get()), new ruk.w(eVar.f239083b, (q1) eVar.f.get(), new twk.b()));
            }
            if (i == 4) {
                return a10.b.g((u8h.b) cVar2, "factory");
            }
            throw new AssertionError(i);
        }
        jki.p pVar = (jki.p) eVar.f239085g.get();
        aah.h hVar = (aah.h) eVar.e.get();
        AnalystDetailsScreenContract$InputData analystDetailsScreenContract$InputData = eVar.f239083b;
        ael.d0 d0VarK = cVar.k();
        vc.s.j(d0VarK);
        ybl.b bVarB = cVar.b();
        vc.s.j(bVarB);
        l80.e eVarH = g0Var.f.h();
        vc.s.j(eVarH);
        return new ruk.t(pVar, hVar, analystDetailsScreenContract$InputData, d0VarK, bVarB, eVarH);
    }

    private final Object e() {
        u8h.c cVar = ((prk.g0) this.f238435b).d;
        prk.f fVar = (prk.f) this.d;
        prk.g0 g0Var = fVar.f239105c;
        int i = this.f238436c;
        if (i == 0) {
            return a10.b.f((u8h.b) cVar, "factory");
        }
        if (i != 1) {
            if (i == 2) {
                return a10.b.g((u8h.b) cVar, "factory");
            }
            throw new AssertionError(i);
        }
        ttk.c cVar2 = new ttk.c();
        utk.c fanChartGraphBuilder = new utk.c();
        utk.d fanChartXAxisLegendBuilder = new utk.d();
        Intrinsics.checkNotNullParameter(fanChartGraphBuilder, "fanChartGraphBuilder");
        Intrinsics.checkNotNullParameter(fanChartXAxisLegendBuilder, "fanChartXAxisLegendBuilder");
        utk.e eVar = new utk.e();
        vtk.b horizontalBarsMapper = new vtk.b();
        Intrinsics.checkNotNullParameter(horizontalBarsMapper, "horizontalBarsMapper");
        cq9.m mVar = new cq9.m(cVar2, eVar, new vtk.c(), (q1) fVar.e.get());
        rtk.d dVar = fVar.f239104b;
        qrk.c cVarA = ((prk.a) g0Var.f239147n).a();
        vc.s.j(cVarA);
        ttk.d dVar2 = new ttk.d(cVarA, 0);
        ybl.b bVarB = g0Var.e.b();
        vc.s.j(bVarB);
        qrk.c cVarA2 = ((prk.a) g0Var.f239147n).a();
        vc.s.j(cVarA2);
        utk.f fVar2 = new utk.f(bVarB, cVarA2, g0Var.D.a());
        qrk.c cVarA3 = ((prk.a) g0Var.f239147n).a();
        vc.s.j(cVarA3);
        ttk.d dVar3 = new ttk.d(cVarA3, 1);
        z0h.d dVarC = ((u8h.b) g0Var.d).c();
        vc.s.j(dVarC);
        return new rtk.g(mVar, dVar, dVar2, fVar2, dVar3, new f61.a(dVarC));
    }

    private final Object f() {
        prk.h hVar = (prk.h) this.d;
        int i = this.f238436c;
        if (i == 0) {
            AttributesScreenContract$InputData attributesScreenContract$InputData = hVar.f239156a;
            ael.d0 d0VarK = ((prk.g0) this.f238435b).e.k();
            vc.s.j(d0VarK);
            return new tuk.n(attributesScreenContract$InputData, d0VarK, ImmutableSet.of((tuk.h) hVar.f239157b.get()), (jki.p) hVar.e.get());
        }
        if (i == 1) {
            return new uuk.a();
        }
        if (i == 2) {
            nel.z zVar = nel.z.BOND;
            return new tuk.o(ImmutableMap.of(zVar, (tuk.d) hVar.f239158c.get()), ImmutableMap.of(zVar, (tuk.g) hVar.d.get()));
        }
        if (i == 3) {
            return new vuk.b();
        }
        if (i == 4) {
            return new vuk.c();
        }
        throw new AssertionError(i);
    }

    private final Object g() {
        prk.g0 g0Var = (prk.g0) this.f238435b;
        prk.j jVar = (prk.j) this.d;
        int i = 0;
        int i2 = this.f238436c;
        switch (i2) {
            case 0:
                return oyj.c.f(((z3h.g) g0Var.f239142g).a(), jVar.f239167a, (n2h.a) jVar.J.get());
            case 1:
                return oyj.c.h(((z3h.g) g0Var.f239142g).a(), jVar.f239169b, new geh.a((gdh.a) jVar.I.get(), 1));
            case 2:
                kbb.c factory = g0Var.f239143h.a();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.s();
            case 3:
                return f0k.d.f(g0Var.i.a(), jVar.f239171c, (e5d.a) jVar.M.get());
            case 4:
                a5h.g gVarA = g0Var.i.a();
                BondDetailsControllerContract$InputData inputData = jVar.d;
                prk.i factory2 = (prk.i) jVar.L.get();
                xuk.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return f0k.d.c(gVarA, factory2.a(inputData.f103901a));
            case 5:
                return new prk.i(this, i);
            case 6:
                return h7d.d.a(jVar.e, (i7d.o) jVar.O.get(), g0Var.f239145l.d());
            case 7:
                return h7d.f.a(g0Var.f239145l.d(), Optional.empty());
            case 8:
                return f0k.d.g(jVar.f, ((z3h.g) g0Var.f239142g).h(), (e3h.d) jVar.Q.get(), jVar.f239174g);
            case 9:
                BondDetailsControllerContract$InputData inputData2 = jVar.d;
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                zuk.a provider = new zuk.a();
                xuk.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                String str = inputData2.f103901a;
                eel.c cVar = eel.c.ONE_WEEK;
                eel.c cVar2 = eel.c.ONE_MONTH;
                eel.c cVar3 = eel.c.SIX_MONTHS;
                eel.c cVar4 = eel.c.ONE_YEAR;
                List listK = zhm.v.k(cVar, cVar2, cVar3, cVar4, eel.c.FIVE_YEAR, eel.c.ALL);
                eel.c cVar5 = inputData2.f103903c;
                TradingAccountType[] elements = {TradingAccountType.Gia.f105270a, TradingAccountType.Taa.f105275a};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new e3h.d(str, listK, cVar4, kotlin.collections.d.y0(elements), true, cVar5, false, false, false, eel.d.SCROLLABLE, 960);
            case 10:
                return efk.j.d((dtl.a) jVar.T.get());
            case 11:
                return efk.j.q(g0Var.f239146m.a(), jVar.f239175h, (dtl.b) jVar.S.get());
            case 12:
                return efk.j.r(g0Var.f239146m.a());
            case 13:
                return a10.b.f((u8h.b) g0Var.d, "factory");
            case 14:
                return kxa.j.k((j60.a) jVar.Y.get());
            case 15:
                return ehe.n.s((com.revolut.kompot.navigable.a) jVar.W.get(), (rp0.m) jVar.X.get());
            case 16:
                return new rp0.m();
            case 17:
                ksk.e eVar = jVar.f239177j;
                ael.d0 d0VarK = g0Var.e.k();
                vc.s.j(d0VarK);
                ybl.b bVarB = g0Var.e.b();
                vc.s.j(bVarB);
                return new ksk.g(eVar, d0VarK, bVarB, ((z3h.g) g0Var.f239142g).l());
            case 18:
                return qw7.u.k(((z3h.g) g0Var.f239142g).e(), jVar.f239179l, (q2h.b) jVar.f239170b0.get());
            case 19:
                return qw7.u.l(((z3h.g) g0Var.f239142g).e());
            case 20:
                psk.f fVar = jVar.f239180m;
                ael.d0 d0VarK2 = g0Var.e.k();
                vc.s.j(d0VarK2);
                ybl.b bVarB2 = g0Var.e.b();
                vc.s.j(bVarB2);
                return new psk.i(fVar, d0VarK2, bVarB2, ((z3h.g) g0Var.f239142g).l());
            case 21:
                rsk.d dVar = jVar.o;
                ael.d0 d0VarK3 = g0Var.e.k();
                vc.s.j(d0VarK3);
                qrk.d dVarB = ((prk.a) g0Var.f239147n).b();
                vc.s.j(dVarB);
                ssk.a aVar = new ssk.a();
                ybl.b bVarB3 = g0Var.e.b();
                vc.s.j(bVarB3);
                return new rsk.j(dVar, d0VarK3, dVarB, aVar, bVarB3, ((z3h.g) g0Var.f239142g).l());
            case 22:
                return new etk.g(jVar.f239185q, (dtk.b) jVar.f0.get());
            case 23:
                mk0.a aVarA = jVar.H.o.a();
                vc.s.j(aVarA);
                ogm.i iVar = new ogm.i(new lrk.e(aVarA, new grk.b(), new lrk.d()), new rrk.b());
                ael.h hVar = (ael.h) g0Var.e.f321569x0.get();
                vc.s.j(hVar);
                CustomisedStatsDialogProvider customisedStatsDialogProvider = new CustomisedStatsDialogProvider();
                gte.a aVarB = g0Var.f239141c.b();
                vc.s.j(aVarB);
                return new etk.a(iVar, hVar, customisedStatsDialogProvider, aVarB);
            case 24:
                kbb.c cVarA = g0Var.f239148p.a();
                prk.g0 g0Var2 = jVar.H;
                return rga.l.B(cVarA, rga.l.C(g0Var2.f239148p.a(), g0Var2.f239149q.g()));
            case 25:
                atk.e eVar2 = jVar.f239190t;
                ael.d0 d0VarK4 = g0Var.e.k();
                vc.s.j(d0VarK4);
                return new atk.l(eVar2, d0VarK4, ((z3h.g) g0Var.f239142g).l());
            case 26:
                return hy1.g.c(((z3h.g) g0Var.f239142g).i(), jVar.u, (h3h.b) jVar.j0.get());
            case 27:
                return hy1.g.d(((z3h.g) g0Var.f239142g).i(), jVar.v);
            case 28:
                fsl.t tVarA = g0Var.f239150r.a();
                vc.s.j(tVarA);
                return fp8.c.p(tVarA, jVar.f239193w, (fsl.i) jVar.l0.get());
            case 29:
                fsl.t tVarA2 = g0Var.f239150r.a();
                vc.s.j(tVarA2);
                return fp8.c.q(tVarA2, new zuk.b());
            case 30:
                return ige.d.m(g0Var.f239151s.b(), (htl.g) jVar.f239182n0.get(), (htl.d) jVar.f239183o0.get());
            case 31:
                return ige.d.n(g0Var.f239151s.b());
            case 32:
                hbh.j jVarA = g0Var.f239152t.a();
                vc.s.j(jVarA);
                return hy1.g.k(jVarA, jVar.f239195x, (h1h.b) jVar.q0.get());
            case 33:
                hbh.j jVarA2 = g0Var.f239152t.a();
                vc.s.j(jVarA2);
                return hy1.g.l(jVarA2);
            case 34:
                f1h.c cVarA2 = g0Var.u.a();
                vc.s.j(cVarA2);
                return fp8.c.s(cVarA2, (f1h.f) jVar.f239189s0.get(), (f1h.b) jVar.f239191t0.get());
            case 35:
                f1h.c cVarA3 = g0Var.u.a();
                vc.s.j(cVarA3);
                return fp8.c.t(cVarA3);
            case 36:
                return kxa.j.i(((z3h.g) g0Var.f239142g).j(), jVar.f239197y, (k3h.b) jVar.f239192v0.get());
            case 37:
                return kxa.j.n(((z3h.g) g0Var.f239142g).j(), jVar.z);
            case 38:
                return new ctk.r(jVar.B, new ctk.c(jVar.H.v.b()));
            case 39:
                jtk.d dVar2 = jVar.D;
                prk.g0 g0Var3 = jVar.H;
                zdl.c cVar6 = g0Var3.e;
                ael.d0 d0VarK5 = cVar6.k();
                vc.s.j(d0VarK5);
                ybl.b bVarB4 = cVar6.b();
                vc.s.j(bVarB4);
                yhl.b bVar = (yhl.b) g0Var3.f239153w.f297707t.get();
                vc.s.j(bVar);
                gte.a aVarB2 = g0Var3.f239141c.b();
                vc.s.j(aVarB2);
                fxk.a aVarA2 = g0Var3.f239154x.a();
                vc.s.j(aVarA2);
                return new ktk.f(dVar2, new jtk.o(d0VarK5, bVarB4, bVar, aVarB2, aVarA2), new jtk.k(new m4h.b()));
            case 40:
                prk.g0 g0Var4 = jVar.H;
                prk.g0 g0Var5 = jVar.H;
                yhl.d dVarA = g0Var4.f239153w.a();
                vc.s.j(dVarA);
                ybl.b bVarB5 = g0Var4.e.b();
                vc.s.j(bVarB5);
                fkg.a aVar2 = new fkg.a(bVarB5);
                l80.e eVarH = g0Var4.f.h();
                vc.s.j(eVarH);
                h8b.k kVar = new h8b.k(aVar2, eVarH, dVarA);
                j60.a aVar3 = (j60.a) jVar.Y.get();
                j8b.a aVar4 = new j8b.a();
                jx0.a aVar5 = new jx0.a(new t1(jVar.b()), new m8b.r(jVar.b()), new m8b.q());
                ybl.d dVarH = g0Var5.e.h();
                vc.s.j(dVarH);
                ybl.k kVarD = g0Var5.f239155y.d();
                vc.s.j(kVarD);
                l80.e eVarH2 = g0Var5.f.h();
                vc.s.j(eVarH2);
                h8b.c cVar7 = new h8b.c(aVar4, aVar5, dVarH, kVarD, eVarH2);
                h8b.a aVar6 = new h8b.a();
                f80.a aVarX = g0Var.f.x();
                vc.s.j(aVarX);
                l70.e eVar3 = g0Var5.f;
                l80.e eVarH3 = eVar3.h();
                vc.s.j(eVarH3);
                j8b.f fVar2 = new j8b.f();
                l80.e eVarH4 = eVar3.h();
                vc.s.j(eVarH4);
                return new i8b.b(kVar, aVar3, cVar7, aVar6, aVarX, new j8b.h(eVarH3, fVar2, new j8b.e(eVarH4), new j8b.d(), new j8b.c()));
            case 41:
                xuk.c cVar8 = jVar.F;
                u1d.a controllerModelExtension = (u1d.a) jVar.A0.get();
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                vc.s.k(controllerModelExtension);
                return controllerModelExtension;
            case 42:
                xuk.c cVar9 = jVar.F;
                jpc.e factory3 = g0Var.z.a();
                j60.a bottomExpandableDialog = (j60.a) jVar.Y.get();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
                return factory3.c("COMBINED_WATCHLIST_ORDERING_SECURITIES", bottomExpandableDialog);
            case 43:
                return efk.j.e((dtl.b) jVar.S.get());
            case 44:
                BondDetailsControllerContract$InputData bondDetailsControllerContract$InputData = jVar.d;
                prk.g0 g0Var6 = jVar.H;
                zdl.c cVar10 = g0Var.e;
                m2h.b bVar2 = g0Var.f239142g;
                ybl.b bVarB6 = cVar10.b();
                vc.s.j(bVarB6);
                b4h.c cVarB = ((z3h.g) bVar2).b();
                ybl.b bVarB7 = g0Var6.e.b();
                vc.s.j(bVarB7);
                owk.a aVar7 = new owk.a(bVarB7, g0Var6.v.w());
                gte.a aVarB3 = g0Var.f239141c.b();
                vc.s.j(aVarB3);
                ksk.b bVar3 = (ksk.b) jVar.f239168a0.get();
                n2h.a aVar8 = (n2h.a) jVar.J.get();
                e5d.a aVar9 = (e5d.a) jVar.M.get();
                psk.b bVar4 = (psk.b) jVar.f239172d0.get();
                rsk.b bVar5 = (rsk.b) jVar.f239173e0.get();
                e3h.a extensions = (e3h.a) jVar.R.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                i4h.p0 p0Var = extensions.f122271b;
                s2h.e eVar4 = (s2h.e) jVar.f239176h0.get();
                atk.c cVar11 = (atk.c) jVar.i0.get();
                h3h.b bVar6 = (h3h.b) jVar.j0.get();
                fsl.m mVarB = g0Var.f239150r.b();
                vc.s.j(mVarB);
                h1h.b bVar7 = (h1h.b) jVar.q0.get();
                dtk.b bVar8 = (dtk.b) jVar.f0.get();
                c4h.c cVarL = ((z3h.g) bVar2).l();
                k3h.b bVar9 = (k3h.b) jVar.f239192v0.get();
                ctk.e eVar5 = (ctk.e) jVar.f239196x0.get();
                jtk.b bVar10 = (jtk.b) jVar.y0.get();
                u1d.a aVar10 = (u1d.a) jVar.A0.get();
                aah.h hVar2 = (aah.h) jVar.V.get();
                h8b.h hVar3 = (h8b.h) jVar.z0.get();
                i7d.o oVar = (i7d.o) jVar.O.get();
                yuk.a aVar11 = new yuk.a();
                ksk.i iVar2 = new ksk.i();
                m2h.b bVar11 = g0Var6.f239142g;
                m3h.c cVarM = oyj.c.m(((z3h.g) bVar11).a());
                psk.j jVar2 = new psk.j();
                z3h.g gVar = (z3h.g) bVar11;
                n3h.e eVarC = gVar.c();
                l80.e eVarH5 = g0Var6.f.h();
                vc.s.j(eVarH5);
                rsk.k kVar2 = new rsk.k(eVarH5);
                e3h.f fVarN = f0k.d.n(jVar.G, gVar.h());
                atk.a aVar12 = new atk.a();
                q4h.g gVarY = hy1.g.y(gVar.i());
                fsl.k kVar3 = (fsl.k) jVar.D0.get();
                t1j.b bVar12 = new t1j.b(new dtk.a(new zvk.d(new o7.d(new x3h.a()))));
                a5h.g factory4 = gVar.j();
                l3h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                a5h.i iVar3 = new a5h.i((u4h.b) factory4.f);
                ctk.t tVar = new ctk.t(g0Var6.v.C());
                ib7.j jVarB = jVar.b();
                df0.b bVarA = g0Var6.A.a();
                vc.s.j(bVarA);
                jtk.l lVar = new jtk.l(new kgm.i(jVarB, bVarA), new m4h.d(), new m4h.b());
                Intrinsics.checkNotNullParameter(g0Var6.z.a(), "factory");
                return new wuk.y(bondDetailsControllerContract$InputData, bVarB6, cVarB, aVar7, aVarB3, bVar3, aVar8, aVar9, bVar4, bVar5, p0Var, eVar4, cVar11, bVar6, mVarB, bVar7, bVar8, cVarL, bVar9, eVar5, bVar10, aVar10, hVar2, hVar3, oVar, new igh.b0(aVar11, iVar2, cVarM, jVar2, eVarC, kVar2, fVarN, aVar12, gVarY, kVar3, bVar12, iVar3, tVar, lVar, new o3d.f(), (q1) jVar.E0.get()));
            case 45:
                fsl.t tVarA3 = g0Var.f239150r.a();
                vc.s.j(tVarA3);
                return fp8.c.r(tVarA3, g0Var.f239151s.a());
            case 46:
                return a10.b.g((u8h.b) g0Var.d, "factory");
            default:
                throw new AssertionError(i2);
        }
    }

    private final Object h() {
        prk.g0 g0Var = (prk.g0) this.f238435b;
        prk.k kVar = (prk.k) this.d;
        int i = this.f238436c;
        switch (i) {
            case 0:
                return oyj.c.f(((z3h.g) g0Var.f239142g).a(), kVar.f239200a, (n2h.a) kVar.f239222y.get());
            case 1:
                return oyj.c.h(((z3h.g) g0Var.f239142g).a(), kVar.f239202b, new geh.a((gdh.a) kVar.f239221x.get(), 1));
            case 2:
                kbb.c factory = g0Var.f239143h.a();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.s();
            case 3:
                return f0k.d.f(g0Var.i.a(), kVar.f239204c, (e5d.a) kVar.B.get());
            case 4:
                a5h.g gVarA = g0Var.i.a();
                CfdDetailsControllerContract$InputData inputData = kVar.d;
                prk.i factory2 = (prk.i) kVar.A.get();
                bvk.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return f0k.d.c(gVarA, factory2.a(inputData.f103914a));
            case 5:
                return new prk.i(this, 1);
            case 6:
                n2d.h hVarB = g0Var.E.b();
                vc.s.j(hVarB);
                return ms1.g.h(hVarB, kVar.e, (m1d.a) kVar.E.get());
            case 7:
                n2d.h hVarB2 = g0Var.E.b();
                vc.s.j(hVarB2);
                return ms1.g.g(hVarB2, (rp0.g1) kVar.D.get());
            case 8:
                ViewController viewController = kVar.f;
                bvk.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                return rp0.x0.a(rp0.g1.Companion, viewController.D2());
            case 9:
                return kxa.j.k((j60.a) kVar.I.get());
            case 10:
                return ehe.n.s((com.revolut.kompot.navigable.a) kVar.G.get(), (rp0.m) kVar.H.get());
            case 11:
                return new rp0.m();
            case 12:
                return h7d.d.a(kVar.f239207g, (i7d.o) kVar.K.get(), g0Var.f239145l.d());
            case 13:
                return h7d.f.a(g0Var.f239145l.d(), Optional.empty());
            case 14:
                return f0k.d.g(kVar.f239208h, ((z3h.g) g0Var.f239142g).h(), (e3h.d) kVar.M.get(), kVar.i);
            case 15:
                CfdDetailsControllerContract$InputData inputData2 = kVar.d;
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                p96.a provider = new p96.a(7);
                bvk.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                String str = inputData2.f103914a;
                eel.c cVar = eel.c.ONE_DAY;
                return new e3h.d(str, zhm.v.k(cVar, eel.c.ONE_WEEK, eel.c.ONE_MONTH, eel.c.SIX_MONTHS, eel.c.ONE_YEAR, eel.c.FIVE_YEAR, eel.c.ALL), cVar, zhm.h0.f322473a, true, inputData2.f103916c, false, false, false, eel.d.SCROLLABLE, 960);
            case 16:
                return efk.j.d((dtl.a) kVar.P.get());
            case 17:
                return efk.j.q(g0Var.f239146m.a(), kVar.f239210j, (dtl.b) kVar.O.get());
            case 18:
                return efk.j.r(g0Var.f239146m.a());
            case 19:
                return a10.b.f((u8h.b) g0Var.d, "factory");
            case 20:
                kbb.c cVarA = g0Var.f239148p.a();
                prk.g0 g0Var2 = kVar.f239220w;
                return rga.l.B(cVarA, rga.l.C(g0Var2.f239148p.a(), g0Var2.f239149q.g()));
            case 21:
                fsl.t tVarA = g0Var.f239150r.a();
                vc.s.j(tVarA);
                return fp8.c.p(tVarA, kVar.f239213m, (fsl.i) kVar.T.get());
            case 22:
                fsl.t tVarA2 = g0Var.f239150r.a();
                vc.s.j(tVarA2);
                return fp8.c.q(tVarA2, new cvk.a());
            case 23:
                return ige.d.m(g0Var.f239151s.b(), (htl.g) kVar.V.get(), (htl.d) kVar.W.get());
            case 24:
                return ige.d.n(g0Var.f239151s.b());
            case 25:
                hbh.j jVarA = g0Var.f239152t.a();
                vc.s.j(jVarA);
                return hy1.g.k(jVarA, kVar.f239214n, (h1h.b) kVar.Y.get());
            case 26:
                hbh.j jVarA2 = g0Var.f239152t.a();
                vc.s.j(jVarA2);
                return hy1.g.l(jVarA2);
            case 27:
                f1h.c cVarA2 = g0Var.u.a();
                vc.s.j(cVarA2);
                return fp8.c.s(cVarA2, (f1h.f) kVar.f239201a0.get(), (f1h.b) kVar.f239203b0.get());
            case 28:
                f1h.c cVarA3 = g0Var.u.a();
                vc.s.j(cVarA3);
                return fp8.c.t(cVarA3);
            case 29:
                atk.e eVar = kVar.f239215p;
                ael.d0 d0VarK = g0Var.e.k();
                vc.s.j(d0VarK);
                return new atk.l(eVar, d0VarK, ((z3h.g) g0Var.f239142g).l());
            case 30:
                return hy1.g.c(((z3h.g) g0Var.f239142g).i(), kVar.f239216q, (h3h.b) kVar.f239206e0.get());
            case 31:
                return hy1.g.d(((z3h.g) g0Var.f239142g).i(), kVar.f239217r);
            case 32:
                jtk.d dVar = kVar.f239219t;
                prk.g0 g0Var3 = kVar.f239220w;
                zdl.c cVar2 = g0Var3.e;
                ael.d0 d0VarK2 = cVar2.k();
                vc.s.j(d0VarK2);
                ybl.b bVarB = cVar2.b();
                vc.s.j(bVarB);
                yhl.b bVar = (yhl.b) g0Var3.f239153w.f297707t.get();
                vc.s.j(bVar);
                gte.a aVarB = g0Var3.f239141c.b();
                vc.s.j(aVarB);
                fxk.a aVarA = g0Var3.f239154x.a();
                vc.s.j(aVarA);
                return new ktk.f(dVar, new jtk.o(d0VarK2, bVarB, bVar, aVarB, aVarA), new jtk.k(new m4h.b()));
            case 33:
                bvk.d dVar2 = kVar.u;
                k2d.d dVar3 = g0Var.E;
                Intrinsics.checkNotNullParameter(new m2d.a(), "factory");
                return m2d.a.a();
            case 34:
                jpc.e factory3 = g0Var.z.a();
                j60.a bottomExpandableDialog = (j60.a) kVar.I.get();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
                return factory3.c("COMBINED_WATCHLIST_ORDERING_SECURITIES", bottomExpandableDialog);
            case 35:
                return efk.j.e((dtl.b) kVar.O.get());
            case 36:
                n2h.a aVar = (n2h.a) kVar.f239222y.get();
                l1d.a aVar2 = (l1d.a) kVar.f239209h0.get();
                m1d.a aVar3 = (m1d.a) kVar.E.get();
                e5d.a aVar4 = (e5d.a) kVar.B.get();
                gte.a aVarB2 = g0Var.f239141c.b();
                vc.s.j(aVarB2);
                e3h.a extensions = (e3h.a) kVar.N.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                i4h.p0 p0Var = extensions.f122271b;
                CfdDetailsControllerContract$InputData cfdDetailsControllerContract$InputData = kVar.d;
                s2h.e eVar2 = (s2h.e) kVar.S.get();
                ybl.b bVarB2 = g0Var.e.b();
                vc.s.j(bVarB2);
                fsl.m mVarB = g0Var.f239150r.b();
                vc.s.j(mVarB);
                h1h.b bVar2 = (h1h.b) kVar.Y.get();
                atk.c cVar3 = (atk.c) kVar.f239205d0.get();
                h3h.b bVar3 = (h3h.b) kVar.f239206e0.get();
                c4h.c cVarL = ((z3h.g) g0Var.f239142g).l();
                jtk.b bVar4 = (jtk.b) kVar.g0.get();
                u1d.a aVar5 = (u1d.a) kVar.i0.get();
                aah.h hVar = (aah.h) kVar.R.get();
                i7d.o oVar = (i7d.o) kVar.K.get();
                prk.g0 g0Var4 = kVar.f239220w;
                m2h.b bVar5 = g0Var4.f239142g;
                m3h.c cVarM = oyj.c.m(((z3h.g) bVar5).a());
                Intrinsics.checkNotNullParameter(new m2d.a(), "factory");
                q2d.a aVar6 = new q2d.a();
                z3h.g gVar = (z3h.g) bVar5;
                c3h.a aVarA2 = cwi.u.A(new f4h.a(new f4h.d()));
                e3h.f fVarN = f0k.d.n(kVar.v, gVar.h());
                fsl.k kVar2 = (fsl.k) kVar.f239211k0.get();
                atk.a aVar7 = new atk.a();
                q4h.g gVarY = hy1.g.y(gVar.i());
                jtk.l lVar = new jtk.l(g0Var4.a(), new m4h.d(), new m4h.b());
                Intrinsics.checkNotNullParameter(g0Var4.z.a(), "factory");
                return new avk.h0(aVar, aVar2, aVar3, aVar4, aVarB2, p0Var, cfdDetailsControllerContract$InputData, eVar2, bVarB2, mVarB, bVar2, cVar3, bVar3, cVarL, bVar4, aVar5, hVar, oVar, new avk.i0(cVarM, aVar6, aVarA2, fVarN, kVar2, aVar7, gVarY, lVar, new o3d.f(), (q1) kVar.l0.get()));
            case 37:
                fsl.t tVarA3 = g0Var.f239150r.a();
                vc.s.j(tVarA3);
                return fp8.c.r(tVarA3, g0Var.f239151s.a());
            case 38:
                return a10.b.g((u8h.b) g0Var.d, "factory");
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        prk.l lVar = (prk.l) this.d;
        prk.g0 g0Var = (prk.g0) this.f238435b;
        u8h.c cVar = g0Var.d;
        int i = this.f238436c;
        if (i == 0) {
            return a10.b.f((u8h.b) cVar, "factory");
        }
        if (i != 1) {
            if (i == 2) {
                return a10.b.g((u8h.b) cVar, "factory");
            }
            throw new AssertionError(i);
        }
        DetailedStatsControllerContract$InputData detailedStatsControllerContract$InputData = lVar.f239227b;
        ael.h hVar = (ael.h) g0Var.e.f321569x0.get();
        vc.s.j(hVar);
        ybl.l lVarF = g0Var.v.f();
        kwk.b bVar = new kwk.b();
        CustomisedStatsDialogProvider customisedStatsDialogProvider = new CustomisedStatsDialogProvider();
        aah.h hVar2 = (aah.h) lVar.e.get();
        dvk.n nVar = new dvk.n();
        Map mapC = lVar.c();
        rrk.e statsExtractors = new rrk.e();
        ImmutableMap screenToSections = (ImmutableMap) mapC;
        Intrinsics.checkNotNullParameter(screenToSections, "screenToSections");
        Intrinsics.checkNotNullParameter(statsExtractors, "statsExtractors");
        com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.b bVar2 = new com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.b(new a7j.g(screenToSections, statsExtractors));
        Map mapC2 = lVar.c();
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(20);
        builderBuilderWithExpectedSize.put(StatsSection.DividendInformation.class, new lwk.b(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.Dividends.class, new lwk.e(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.ExpenseRatios.class, new lwk.j(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.ManagementEfectiveness.class, new lwk.l(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.ManagementFees.class, new lwk.n(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.MarketCapitalisation.class, new lwk.p(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.EeaMarketCapitalisation.class, new lwk.f(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.PerShareData.class, new lwk.r(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.Price.class, new lwk.v(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.EeaPrice.class, new lwk.g(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.ProfitabilityRatios.class, new lwk.x(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.Valuation.class, new lwk.c0(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.Volume.class, new lwk.e0(lVar.b()));
        prk.g0 g0Var2 = lVar.d;
        builderBuilderWithExpectedSize.put(StatsSection.DividendsAndCharges.class, new lwk.c(new x3h.a()));
        builderBuilderWithExpectedSize.put(StatsSection.PriceRange.class, new lwk.t(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.Risk.class, new lwk.a0(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.YieldRange.class, new lwk.g0(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.Yield.class, new lwk.i0(lVar.b()));
        builderBuilderWithExpectedSize.put(StatsSection.RiskRating.class, new lwk.y(new zvk.d(lVar.b())));
        builderBuilderWithExpectedSize.put(StatsSection.EeaRiskRating.class, new lwk.h(new zvk.d(lVar.b())));
        return new com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.a(detailedStatsControllerContract$InputData, hVar, lVarF, bVar, customisedStatsDialogProvider, hVar2, new dvk.j(nVar, bVar2, (ImmutableMap) mapC2, builderBuilderWithExpectedSize.build(), new iwk.a(), (q1) lVar.f.get(), g0Var2.B.b()));
    }

    private final Object j() {
        prk.g0 g0Var = (prk.g0) this.f238435b;
        prk.n nVar = (prk.n) this.d;
        int i = this.f238436c;
        switch (i) {
            case 0:
                return oyj.c.e(((z3h.g) g0Var.f239142g).a(), nVar.f239240a, (n2h.a) nVar.f239245j.get());
            case 1:
                return oyj.c.g(((z3h.g) g0Var.f239142g).a(), nVar.f239241b, new geh.a((gdh.a) nVar.i.get(), 1));
            case 2:
                kbb.c factory = g0Var.f239143h.a();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.s();
            case 3:
                return kxa.j.m((j60.a) nVar.f239248n.get());
            case 4:
                return wp5.y.r((com.revolut.kompot.navigable.a) nVar.f239246l.get(), (rp0.m) nVar.f239247m.get());
            case 5:
                return new rp0.m();
            case 6:
                gdh.a aVar = (gdh.a) nVar.i.get();
                f9f.b.e(aVar);
                return aVar;
            case 7:
                return f9f.b.j((gdh.a) nVar.i.get());
            case 8:
                ptk.b bVar = nVar.f239242c;
                l1d.a extension = (l1d.a) nVar.f239251r.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 9:
                ptk.b bVar2 = nVar.f239242c;
                k2d.d dVar = g0Var.E;
                Intrinsics.checkNotNullParameter(new m2d.a(), "factory");
                return m2d.a.a();
            case 10:
                ptk.c cVar = nVar.d;
                u1d.a controllerModelExtension = (u1d.a) nVar.f239253t.get();
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                vc.s.k(controllerModelExtension);
                return controllerModelExtension;
            case 11:
                ptk.c cVar2 = nVar.d;
                jpc.e factory2 = g0Var.z.a();
                j60.a bottomExpandableDialog = (j60.a) nVar.f239248n.get();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
                return factory2.c("COMBINED_WATCHLIST_ORDERING_SECURITIES", bottomExpandableDialog);
            case 12:
                return new ltk.d(nVar.e, g0Var.f239143h.b(), (gdh.a) nVar.i.get());
            case 13:
                EtfDetailsFlowControllerContract$InputData etfDetailsFlowControllerContract$InputData = nVar.f;
                c3h.a aVarA = cwi.u.A(new f4h.a(new f4h.d()));
                prk.g0 g0Var2 = nVar.f239243g;
                Intrinsics.checkNotNullParameter(new m2d.a(), "factory");
                q2d.a aVar2 = new q2d.a();
                Intrinsics.checkNotNullParameter(g0Var2.z.a(), "factory");
                o3d.f fVar = new o3d.f();
                jid.z factory3 = ((z3h.g) g0Var2.f239142g).a();
                p2h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                otk.r rVar = new otk.r(aVarA, aVar2, fVar, new m3h.c((d4h.b) factory3.f174462c));
                c3h.a aVarA2 = cwi.u.A(new f4h.a(new f4h.d()));
                gte.a aVarB = g0Var.f239141c.b();
                vc.s.j(aVarB);
                ybl.b bVarB = g0Var.e.b();
                vc.s.j(bVarB);
                return new com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a(etfDetailsFlowControllerContract$InputData, rVar, aVarA2, aVarB, bVarB, (n2h.a) nVar.f239245j.get(), (l1d.a) nVar.f239251r.get(), (u1d.a) nVar.f239253t.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        prk.g0 g0Var = (prk.g0) this.f238435b;
        prk.p pVar = (prk.p) this.d;
        int i = 2;
        int i2 = this.f238436c;
        switch (i2) {
            case 0:
                n2d.h hVarB = g0Var.E.b();
                vc.s.j(hVarB);
                return ms1.g.h(hVarB, pVar.f239256a, (m1d.a) pVar.H.get());
            case 1:
                n2d.h hVarB2 = g0Var.E.b();
                vc.s.j(hVarB2);
                return ms1.g.g(hVarB2, (rp0.g1) pVar.G.get());
            case 2:
                ViewController viewController = pVar.f239258b;
                gvk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                return rp0.x0.a(rp0.g1.Companion, viewController.D2());
            case 3:
                return f0k.d.f(g0Var.i.a(), pVar.f239260c, (e5d.a) pVar.K.get());
            case 4:
                a5h.g gVarA = g0Var.i.a();
                EtfDetailsOverviewControllerContract$InputData inputData = pVar.d;
                prk.i factory = (prk.i) pVar.J.get();
                gvk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return f0k.d.c(gVarA, factory.a(inputData.f103946a));
            case 5:
                return new prk.i(this, i);
            case 6:
                return qw7.u.q(pVar.e, g0Var.H.a(), pVar.f, (qdf.b) pVar.M.get());
            case 7:
                return qw7.u.r(pVar.e, g0Var.H.a(), vtc.p0.o(g0Var.H.a()));
            case 8:
                return h7d.d.a(pVar.f239263g, (i7d.o) pVar.O.get(), g0Var.f239145l.d());
            case 9:
                return h7d.f.a(g0Var.f239145l.d(), Optional.empty());
            case 10:
                return f0k.d.g(pVar.f239264h, ((z3h.g) g0Var.f239142g).h(), (e3h.d) pVar.Q.get(), pVar.i);
            case 11:
                EtfDetailsOverviewControllerContract$InputData inputData2 = pVar.d;
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                hvk.a provider = new hvk.a();
                gvk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                String str = inputData2.f103946a;
                eel.c cVar = eel.c.ONE_DAY;
                List listK = zhm.v.k(cVar, eel.c.ONE_WEEK, eel.c.ONE_MONTH, eel.c.SIX_MONTHS, eel.c.ONE_YEAR, eel.c.FIVE_YEAR, eel.c.ALL);
                eel.c cVar2 = inputData2.f103948c;
                TradingAccountType[] elements = {TradingAccountType.Gia.f105270a, TradingAccountType.Taa.f105275a};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new e3h.d(str, listK, cVar, kotlin.collections.d.y0(elements), true, cVar2, false, false, false, eel.d.SCROLLABLE, 960);
            case 12:
                return a10.b.f((u8h.b) g0Var.d, "factory");
            case 13:
                return efk.j.d((dtl.a) pVar.U.get());
            case 14:
                return efk.j.q(g0Var.f239146m.a(), pVar.k, (dtl.b) pVar.T.get());
            case 15:
                return efk.j.r(g0Var.f239146m.a());
            case 16:
                return qw7.u.k(((z3h.g) g0Var.f239142g).e(), pVar.f239268l, (q2h.b) pVar.W.get());
            case 17:
                return qw7.u.l(((z3h.g) g0Var.f239142g).e());
            case 18:
                return new etk.g(pVar.f239269m, (dtk.b) pVar.Y.get());
            case 19:
                mk0.a aVarA = pVar.F.o.a();
                vc.s.j(aVarA);
                ogm.i iVar = new ogm.i(new lrk.e(aVarA, new grk.b(), new lrk.d()), new rrk.b());
                ael.h hVar = (ael.h) g0Var.e.f321569x0.get();
                vc.s.j(hVar);
                CustomisedStatsDialogProvider customisedStatsDialogProvider = new CustomisedStatsDialogProvider();
                gte.a aVarB = g0Var.f239141c.b();
                vc.s.j(aVarB);
                return new etk.a(iVar, hVar, customisedStatsDialogProvider, aVarB);
            case 20:
                vsk.d dVar = pVar.o;
                ybl.b bVarB = g0Var.e.b();
                vc.s.j(bVarB);
                ybl.b bVarB2 = pVar.F.e.b();
                vc.s.j(bVarB2);
                return new wsk.c(dVar, bVarB, new toh.c(bVarB2, 1));
            case 21:
                kbb.c cVarA = g0Var.f239148p.a();
                prk.g0 g0Var2 = pVar.F;
                return rga.l.B(cVarA, rga.l.C(g0Var2.f239148p.a(), g0Var2.f239149q.g()));
            case 22:
                atk.e eVar = pVar.f239275r;
                ael.d0 d0VarK = g0Var.e.k();
                vc.s.j(d0VarK);
                return new atk.l(eVar, d0VarK, ((z3h.g) g0Var.f239142g).l());
            case 23:
                btk.e eVar2 = pVar.f239277s;
                prk.g0 g0Var3 = pVar.F;
                ybl.b bVarB3 = g0Var3.e.b();
                vc.s.j(bVarB3);
                vrl.g gVarB = g0Var3.H.b();
                vc.s.j(gVarB);
                nil.c cVarA2 = g0Var3.J.a();
                vc.s.j(cVarA2);
                btk.n nVar = new btk.n(bVarB3, gVarB, cVarA2, g0Var3.v.w());
                udf.a aVar = (udf.a) g0Var.H.F.get();
                vc.s.j(aVar);
                return new btk.k(eVar2, nVar, aVar, ((z3h.g) g0Var.f239142g).l());
            case 24:
                return hy1.g.c(((z3h.g) g0Var.f239142g).i(), pVar.u, (h3h.b) pVar.f239262e0.get());
            case 25:
                return hy1.g.d(((z3h.g) g0Var.f239142g).i(), pVar.v);
            case 26:
                hbh.j jVarA = g0Var.f239152t.a();
                vc.s.j(jVarA);
                return hy1.g.k(jVarA, pVar.f239282w, (h1h.b) pVar.g0.get());
            case 27:
                hbh.j jVarA2 = g0Var.f239152t.a();
                vc.s.j(jVarA2);
                return hy1.g.l(jVarA2);
            case 28:
                f1h.c cVarA3 = g0Var.u.a();
                vc.s.j(cVarA3);
                return fp8.c.s(cVarA3, (f1h.f) pVar.i0.get(), (f1h.b) pVar.j0.get());
            case 29:
                f1h.c cVarA4 = g0Var.u.a();
                vc.s.j(cVarA4);
                return fp8.c.t(cVarA4);
            case 30:
                return new ctk.r(pVar.f239286y, new ctk.c(pVar.F.v.b()));
            case 31:
                jtk.d dVar2 = pVar.A;
                prk.g0 g0Var4 = pVar.F;
                zdl.c cVar3 = g0Var4.e;
                ael.d0 d0VarK2 = cVar3.k();
                vc.s.j(d0VarK2);
                ybl.b bVarB4 = cVar3.b();
                vc.s.j(bVarB4);
                yhl.b bVar = (yhl.b) g0Var4.f239153w.f297707t.get();
                vc.s.j(bVar);
                gte.a aVarB2 = g0Var4.f239141c.b();
                vc.s.j(aVarB2);
                fxk.a aVarA2 = g0Var4.f239154x.a();
                vc.s.j(aVarA2);
                return new ktk.f(dVar2, new jtk.o(d0VarK2, bVarB4, bVar, aVarB2, aVarA2), new jtk.k(new m4h.b()));
            case 32:
                fsl.t tVarA = g0Var.f239150r.a();
                vc.s.j(tVarA);
                return fp8.c.p(tVarA, pVar.B, (fsl.i) pVar.f239271n0.get());
            case 33:
                fsl.t tVarA2 = g0Var.f239150r.a();
                vc.s.j(tVarA2);
                return fp8.c.q(tVarA2, new hvk.b());
            case 34:
                return ige.d.m(g0Var.f239151s.b(), (htl.g) pVar.p0.get(), (htl.d) pVar.q0.get());
            case 35:
                return ige.d.n(g0Var.f239151s.b());
            case 36:
                return agk.b.g(((z3h.g) g0Var.f239142g).f(), pVar.C, (a3h.c) pVar.f239278s0.get());
            case 37:
                return agk.b.h(((z3h.g) g0Var.f239142g).f(), pVar.D);
            case 38:
                rdf.a aVar2 = pVar.e;
                qdf.b extension = (qdf.b) pVar.M.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 39:
                return efk.j.e((dtl.b) pVar.T.get());
            case 40:
                EtfDetailsOverviewControllerContract$InputData etfDetailsOverviewControllerContract$InputData = pVar.d;
                prk.g0 g0Var5 = pVar.F;
                m2h.b bVar2 = g0Var5.f239142g;
                h9h.a aVar3 = g0Var5.v;
                n3h.e eVarC = ((z3h.g) bVar2).c();
                z3h.g gVar = (z3h.g) bVar2;
                e4h.h hVarG = gVar.g();
                vsk.h hVar2 = new vsk.h(aVar3.C());
                Intrinsics.checkNotNullParameter(g0Var5.H.a(), "factory");
                fvk.y yVar = new fvk.y(eVarC, hVarG, hVar2, new uvl.a(), f0k.d.n(pVar.E, gVar.h()), new atk.a(), new btk.o(), hy1.g.y(gVar.i()), (fsl.k) pVar.f239283w0.get(), new dtk.a(new zvk.d(new o7.d(new x3h.a()))), new ctk.t(aVar3.C()), new jtk.l(g0Var5.a(), new m4h.d(), new m4h.b()), (q1) pVar.f239285x0.get());
                b4h.c cVarB = ((z3h.g) g0Var.f239142g).b();
                ybl.b bVarB5 = g0Var.e.b();
                vc.s.j(bVarB5);
                ybl.b bVarB6 = g0Var5.e.b();
                vc.s.j(bVarB6);
                owk.a aVar4 = new owk.a(bVarB6, g0Var5.v.w());
                m1d.a aVar5 = (m1d.a) pVar.H.get();
                e5d.a aVar6 = (e5d.a) pVar.K.get();
                a3h.c cVar4 = (a3h.c) pVar.f239278s0.get();
                vsk.c cVar5 = (vsk.c) pVar.f239257a0.get();
                qdf.b bVar3 = (qdf.b) pVar.M.get();
                e3h.a extensions = (e3h.a) pVar.R.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                i4h.p0 p0Var = extensions.f122271b;
                s2h.e eVar3 = (s2h.e) pVar.f239259b0.get();
                atk.c cVar6 = (atk.c) pVar.c0.get();
                btk.b bVar4 = (btk.b) pVar.f239261d0.get();
                h3h.b bVar5 = (h3h.b) pVar.f239262e0.get();
                h1h.b bVar6 = (h1h.b) pVar.g0.get();
                dtk.b bVar7 = (dtk.b) pVar.Y.get();
                fsl.m mVarB = g0Var.f239150r.b();
                vc.s.j(mVarB);
                return new fvk.x(etfDetailsOverviewControllerContract$InputData, yVar, cVarB, bVarB5, aVar4, aVar5, aVar6, cVar4, cVar5, bVar3, p0Var, eVar3, cVar6, bVar4, bVar5, bVar6, bVar7, mVarB, (ctk.e) pVar.l0.get(), (jtk.b) pVar.m0.get(), (aah.h) pVar.S.get(), ((z3h.g) g0Var.f239142g).l(), (i7d.o) pVar.O.get());
            case 41:
                fsl.t tVarA3 = g0Var.f239150r.a();
                vc.s.j(tVarA3);
                return fp8.c.r(tVarA3, g0Var.f239151s.a());
            case 42:
                return a10.b.g((u8h.b) g0Var.d, "factory");
            default:
                throw new AssertionError(i2);
        }
    }

    private final Object l() {
        prk.g0 g0Var = (prk.g0) this.f238435b;
        u8h.c cVar = g0Var.d;
        prk.t tVar = (prk.t) this.d;
        prk.g0 g0Var2 = tVar.e;
        int i = this.f238436c;
        switch (i) {
            case 0:
                fuk.d extensions = (fuk.d) tVar.f.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f138230a;
            case 1:
                sqk.a aVar = g0Var2.f239147n;
                qrk.a aVar2 = (qrk.a) ((prk.a) aVar).A.get();
                vc.s.j(aVar2);
                fuk.y fundamentalsChartsWidgetProvider = new fuk.y(aVar2);
                qrk.c stocksInsightsInteractor = ((prk.a) aVar).a();
                vc.s.j(stocksInsightsInteractor);
                fuk.e input = tVar.f239293a;
                Intrinsics.checkNotNullParameter(fundamentalsChartsWidgetProvider, "fundamentalsChartsWidgetProvider");
                Intrinsics.checkNotNullParameter(stocksInsightsInteractor, "stocksInsightsInteractor");
                Intrinsics.checkNotNullParameter(input, "input");
                qy5.a factory = new qy5.a(12);
                fuk.c delegates = tVar.f239294b;
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                fuk.t tVar2 = new fuk.t(fundamentalsChartsWidgetProvider, stocksInsightsInteractor, input);
                return new fuk.d(new fuk.l(tVar2, delegates), tVar2);
            case 2:
                return a10.b.f((u8h.b) cVar, "factory");
            case 3:
                fuk.f extension = (fuk.f) tVar.i.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 4:
                fuk.d extensions2 = (fuk.d) tVar.f.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f138231b;
            case 5:
                wtk.q qVar = new wtk.q(new ytk.c(), new wtk.t(new ytk.c()));
                wtk.p pVar = new wtk.p(new ytk.c());
                fuk.m mVar = new fuk.m(new ytk.c());
                fuk.p0 p0Var = new fuk.p0(new fuk.g0(new a61.a(new rwk.l(new rwk.e(), new nd.o(new rwk.d())), new nd.o(new rwk.d())), new fuk.a0()), new fuk.o0(new ytk.c()), new fuk.b0());
                l80.e eVarH = g0Var2.f.h();
                vc.s.j(eVarH);
                bof.r rVar = new bof.r(new wtk.r(qVar, pVar, new fmc.z(new fuk.p(mVar, p0Var, new fuk.a(eVarH, 0)))), new wtk.v(new wtk.u(new wtk.t(new ytk.c()), new ytk.b()), new nd.m(new ytk.b())), (q1) tVar.k.get());
                wtk.i iVar = tVar.d;
                qrk.c cVarA = ((prk.a) g0Var.f239147n).a();
                vc.s.j(cVarA);
                qrk.c cVarA2 = ((prk.a) g0Var2.f239147n).a();
                vc.s.j(cVarA2);
                r10.w wVar = new r10.w(cVarA2, ((y77.i) g0Var2.C).a());
                fuk.f fVar = (fuk.f) tVar.i.get();
                z0h.d dVarC = ((u8h.b) g0Var2.d).c();
                vc.s.j(dVarC);
                return new com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.a(rVar, iVar, cVarA, wVar, fVar, new f61.a(dVarC));
            case 6:
                return a10.b.g((u8h.b) cVar, "factory");
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        prk.w wVar = (prk.w) this.d;
        prk.g0 g0Var = wVar.f239308c;
        prk.g0 g0Var2 = (prk.g0) this.f238435b;
        u8h.c cVar = g0Var2.d;
        int i = this.f238436c;
        if (i == 0) {
            return a10.b.f((u8h.b) cVar, "factory");
        }
        if (i != 1) {
            if (i == 2) {
                return a10.b.g((u8h.b) cVar, "factory");
            }
            throw new AssertionError(i);
        }
        IndexMarketSentimentControllerContract$InputData indexMarketSentimentControllerContract$InputData = wVar.f239307b;
        l80.e dateProvider = g0Var.f.h();
        vc.s.j(dateProvider);
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        juk.j jVar = new juk.j(new luk.c(), (q1) wVar.e.get());
        qrk.c cVarA = ((prk.a) g0Var2.f239147n).a();
        vc.s.j(cVarA);
        qrk.c cVarA2 = ((prk.a) g0Var.f239147n).a();
        vc.s.j(cVarA2);
        r10.w wVar2 = new r10.w(cVarA2, ((y77.i) g0Var.C).a());
        z0h.d dVarC = ((u8h.b) g0Var.d).c();
        vc.s.j(dVarC);
        return new juk.h(indexMarketSentimentControllerContract$InputData, jVar, cVarA, wVar2, new f61.a(dVarC));
    }

    private final Object n() {
        prk.y yVar = (prk.y) this.d;
        prk.g0 g0Var = yVar.f;
        prk.g0 g0Var2 = (prk.g0) this.f238435b;
        m2h.b bVar = g0Var2.f239142g;
        h9h.a aVar = g0Var2.v;
        jdh.b bVar2 = g0Var2.f239143h;
        u8h.c cVar = g0Var2.d;
        int i = this.f238436c;
        switch (i) {
            case 0:
                return oyj.c.f(((z3h.g) bVar).a(), yVar.f239312a, (n2h.a) yVar.f239316h.get());
            case 1:
                return oyj.c.h(((z3h.g) bVar).a(), yVar.f239313b, new geh.a((gdh.a) yVar.f239315g.get(), 1));
            case 2:
                kbb.c factory = bVar2.a();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.s();
            case 3:
                r10.r factory2 = aVar.h();
                b1h.f view = yVar.f239314c;
                b1h.a controllerModelExtension = (b1h.a) yVar.f239317j.get();
                c1h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                return new eah.d(view, controllerModelExtension);
            case 4:
                r10.r factory3 = aVar.h();
                c1h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return new eah.b((x8h.g) factory3.f250851a, (x8h.p) factory3.f250853c);
            case 5:
                return a10.b.f((u8h.b) cVar, "factory");
            case 6:
                pvk.o0 o0Var = new pvk.o0(new pvk.n0(new ytk.c()), new pvk.k0(new pvk.l0(), prk.y.b(), new ytk.c(), new rvk.e()));
                rvk.b bVar3 = new rvk.b(prk.y.b(), new rvk.e());
                rvk.d dVar = new rvk.d(prk.y.b(), new rvk.e());
                rvk.g gVar = new rvk.g(prk.y.b(), new rvk.e());
                m3h.c cVarM = oyj.c.m(((z3h.g) g0Var.f239142g).a());
                pvk.g0 g0Var3 = new pvk.g0();
                r10.r factory4 = g0Var.v.h();
                c1h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                j8f.o oVar = new j8f.o(o0Var, bVar3, dVar, gVar, cVarM, g0Var3, new eah.e((jbh.e) factory4.f250852b), (q1) yVar.f239319m.get());
                InsightsScreenContract$InputData insightsScreenContract$InputData = yVar.e;
                qrk.c cVarA = ((prk.a) g0Var2.f239147n).a();
                vc.s.j(cVarA);
                ybl.b bVarB = g0Var2.e.b();
                vc.s.j(bVarB);
                kdh.b bVarB2 = bVar2.b();
                n2h.a aVar2 = (n2h.a) yVar.f239316h.get();
                qrk.c cVarA2 = ((prk.a) g0Var.f239147n).a();
                vc.s.j(cVarA2);
                r10.w wVar = new r10.w(cVarA2, ((y77.i) g0Var.C).a());
                b1h.a aVar3 = (b1h.a) yVar.f239317j.get();
                z0h.d dVarC = ((u8h.b) g0Var.d).c();
                vc.s.j(dVarC);
                return new pvk.e(oVar, insightsScreenContract$InputData, cVarA, bVarB, bVarB2, aVar2, wVar, aVar3, new f61.a(dVarC));
            case 7:
                return a10.b.g((u8h.b) cVar, "factory");
            default:
                throw new AssertionError(i);
        }
    }

    private final Object o() {
        prk.g0 g0Var = (prk.g0) this.f238435b;
        prk.e0 e0Var = (prk.e0) this.d;
        int i = this.f238436c;
        switch (i) {
            case 0:
                prk.g0 g0Var2 = e0Var.f239090g;
                c3h.a aVarA = cwi.u.A(new f4h.a(new f4h.d()));
                m2d.a factory = new m2d.a();
                Intrinsics.checkNotNullParameter(factory, "factory");
                q2d.a aVar = new q2d.a();
                jpc.e factory2 = g0Var2.z.a();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                o3d.f fVar = new o3d.f();
                jid.z factory3 = ((z3h.g) g0Var2.f239142g).a();
                p2h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                puk.u uVar = new puk.u(aVarA, aVar, fVar, new m3h.c((d4h.b) factory3.f174462c));
                StockDetailsFlowControllerContract$InputData stockDetailsFlowControllerContract$InputData = e0Var.f239089c;
                gte.a aVarB = g0Var.f239141c.b();
                vc.s.j(aVarB);
                ybl.b bVarB = g0Var.e.b();
                vc.s.j(bVarB);
                l1d.a aVar2 = (l1d.a) e0Var.i.get();
                u1d.a aVar3 = (u1d.a) e0Var.f239094m.get();
                n2h.a aVar4 = (n2h.a) e0Var.o.get();
                kbf.a aVar5 = (kbf.a) g0Var.F.E.get();
                vc.s.j(aVar5);
                pgl.a aVar6 = (pgl.a) g0Var.G.k.get();
                vc.s.j(aVar6);
                zdl.f fVar2 = g0Var.v.f150256a;
                Map mapA = fVar2.a();
                vc.s.j(mapA);
                ybl.i iVarB = fVar2.b();
                vc.s.j(iVarB);
                y8h.b bVar = new y8h.b(mapA, iVarB);
                y08.a aVar7 = (y08.a) e0Var.f239096p.get();
                l80.e eVarH = g0Var.f.h();
                vc.s.j(eVarH);
                return new puk.s(uVar, stockDetailsFlowControllerContract$InputData, aVarB, bVarB, aVar2, aVar3, aVar4, aVar5, aVar6, bVar, aVar7, eVarH);
            case 1:
                quk.b bVar2 = e0Var.f239087a;
                k2d.d dVar = g0Var.E;
                m2d.a factory4 = new m2d.a();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return m2d.a.a();
            case 2:
                quk.c cVar = e0Var.f239088b;
                jpc.e factory5 = g0Var.z.a();
                j60.a bottomExpandableDialog = (j60.a) e0Var.f239093l.get();
                Intrinsics.checkNotNullParameter(factory5, "factory");
                Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
                return factory5.c("COMBINED_WATCHLIST_ORDERING_SECURITIES", bottomExpandableDialog);
            case 3:
                return wp5.y.r((com.revolut.kompot.navigable.a) e0Var.f239092j.get(), (rp0.m) e0Var.k.get());
            case 4:
                return new rp0.m();
            case 5:
                return oyj.c.g(((z3h.g) g0Var.f239142g).a(), e0Var.d, new geh.a((gdh.a) e0Var.f239095n.get(), 1));
            case 6:
                kbb.c factory6 = g0Var.f239143h.a();
                Intrinsics.checkNotNullParameter(factory6, "factory");
                return factory6.s();
            case 7:
                prl.e factory7 = g0Var.k.b();
                z08.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory7, "factory");
                return new s18.e((mk0.a) factory7.f239325b, (gte.a) factory7.f239326c, (toa.a) factory7.d, (ybl.k) factory7.e);
            case 8:
                return oyj.c.e(((z3h.g) g0Var.f239142g).a(), e0Var.e, (n2h.a) e0Var.o.get());
            case 9:
                return kxa.j.m((j60.a) e0Var.f239093l.get());
            case 10:
                gdh.a aVar8 = (gdh.a) e0Var.f239095n.get();
                f9f.b.e(aVar8);
                return aVar8;
            case 11:
                return f9f.b.j((gdh.a) e0Var.f239095n.get());
            case 12:
                quk.b bVar3 = e0Var.f239087a;
                l1d.a extension = (l1d.a) e0Var.i.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 13:
                quk.c cVar2 = e0Var.f239088b;
                u1d.a controllerModelExtension = (u1d.a) e0Var.f239094m.get();
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                vc.s.k(controllerModelExtension);
                return controllerModelExtension;
            case 14:
                return new ltk.d(e0Var.f, g0Var.f239143h.b(), (gdh.a) e0Var.f239095n.get());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ef A[ADDED_TO_REGION] */
    @Override // phm.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get() {
        /*
            Method dump skipped, instruction units count: 3842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ppd.i0.get():java.lang.Object");
    }
}
