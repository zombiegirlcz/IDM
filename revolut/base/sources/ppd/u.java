package ppd;

import com.revolut.camerakit.revolut.ui.barcodeqr.BarcodeQrReaderFlowContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.edit.EditCycleScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.delete.IncomeSorterDeleteContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$InputData;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositReturnDetailsBottomSheetControllerInputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$InputData;
import com.revolut.retail.feature.payments.payment_links.impl.data.TransferLinkService;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.EditKeyStatsScreenContract$Input;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.StockOrderBookControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.recommendation_history_screen.RecommendationHistoryScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f238555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f238556c;

    public /* synthetic */ u(Object obj2, Object obj3, int i) {
        this.f238554a = i;
        this.f238555b = obj2;
        this.f238556c = obj3;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f238554a) {
            case 0:
                srd.c cVar = ((v) this.f238556c).f238560a;
                tsj.g gVarE = ((dqj.r) ((n) this.f238555b).f238484b).e();
                vc.s.j(gVarE);
                rrd.b categoryMapper = new rrd.b();
                rrd.f performanceMapper = new rrd.f();
                rrd.g disclaimerProvider = new rrd.g();
                Intrinsics.checkNotNullParameter(categoryMapper, "categoryMapper");
                Intrinsics.checkNotNullParameter(performanceMapper, "performanceMapper");
                Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
                return new srd.q(cVar, gVarE, new srd.s());
            case 1:
                x xVar = (x) this.f238556c;
                wrd.c cVar2 = xVar.f238571a;
                tsj.g gVarE2 = ((dqj.r) ((n) this.f238555b).f238484b).e();
                vc.s.j(gVarE2);
                l80.e eVarH = xVar.f238572b.d.h();
                vc.s.j(eVarH);
                return new wrd.s(cVar2, gVarE2, new wrd.w(eVarH));
            case 2:
                jrd.k kVar = new jrd.k();
                jrd.c cVar3 = ((z) this.f238556c).f238583a;
                l80.e eVarH2 = ((n) this.f238555b).d.h();
                vc.s.j(eVarH2);
                return new jrd.j(kVar, cVar3, eVarH2);
            case 3:
                EditCycleScreenContract$InputData editCycleScreenContract$InputData = ((b0) this.f238556c).f238377a;
                lpd.u uVar = new lpd.u(editCycleScreenContract$InputData);
                b80.c cVarP = ((n) this.f238555b).d.p();
                vc.s.j(cVarP);
                return new lpd.r(editCycleScreenContract$InputData, uVar, cVarP);
            case 4:
                d0 d0Var = (d0) this.f238556c;
                djf.c cVar4 = d0Var.f238390b.f238490h;
                thf.d dVarD = cVar4.d();
                vc.s.j(dVarD);
                thf.m mVarG = cVar4.g();
                vc.s.j(mVarG);
                rpd.m mVar = new rpd.m(new pqd.f(dVarD, mVarG, new j9l.a()));
                IncomeSorterDeleteContract$InputData incomeSorterDeleteContract$InputData = d0Var.f238389a;
                n nVar = (n) this.f238555b;
                wzi.a aVarA = ((ctj.b) nVar.I).a();
                vc.s.j(aVarA);
                whf.b bVarA = nVar.f238490h.a();
                vc.s.j(bVarA);
                return new rpd.k(mVar, incomeSorterDeleteContract$InputData, aVarA, bVarA);
            case 5:
                e0 e0Var = (e0) this.f238556c;
                n nVar2 = e0Var.f238399b;
                xpd.b bVar = new xpd.b(nVar2.f238489g.h());
                end.f fVarB = e0Var.b();
                cqd.b bVar2 = new cqd.b(new dcd.b());
                gte.a aVarB = nVar2.f238482a.b();
                vc.s.j(aVarB);
                vpd.z0 z0Var = new vpd.z0(bVar, fVarB, bVar2, aVarB);
                IncomeSorterDestinationsContract$InputData incomeSorterDestinationsContract$InputData = e0Var.f238398a;
                n nVar3 = (n) this.f238555b;
                jmd.d dVar = nVar3.f238489g;
                xld.b bVar3 = (xld.b) dVar.D0.get();
                vc.s.j(bVar3);
                rqd.h hVar = (rqd.h) dVar.C0.get();
                vc.s.j(hVar);
                ijb.a aVarG = ((blb.e) nVar2.M).g();
                vc.s.j(aVarG);
                toh.d dVarA = nVar2.f238505t.a();
                g48.r0 r0VarC = nVar2.f238494l.c();
                g6e.d dVarB = nVar2.F.b();
                vc.s.j(dVarB);
                wsg.n nVarB = nVar2.f.b();
                ybl.k kVarD = nVar2.N.d();
                vc.s.j(kVarD);
                ybl.l lVarF = nVar2.O.f();
                ite.a aVar = nVar2.f238482a;
                gte.a aVarB2 = aVar.b();
                vc.s.j(aVarB2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers.a aVar2 = new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers.a(kVarD, lVarF, aVarB2);
                gte.a aVarB3 = aVar.b();
                vc.s.j(aVarB3);
                ffk.t tVarF = nVar2.D.f();
                vc.s.j(tVarF);
                mqd.o oVar = new mqd.o(aVarG, dVarA, r0VarC, dVarB, nVarB, aVar2, aVarB3, tVarF);
                gte.a aVarB4 = nVar3.f238482a.b();
                vc.s.j(aVarB4);
                return new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a(z0Var, incomeSorterDestinationsContract$InputData, bVar3, hVar, oVar, aVarB4, e0Var.b(), ((blb.e) nVar3.M).e());
            case 6:
                k0 k0Var = (k0) this.f238556c;
                sqd.d dVar2 = k0Var.f238457a;
                n nVar4 = (n) this.f238555b;
                whf.b bVarA2 = nVar4.f238490h.a();
                vc.s.j(bVarA2);
                j9l.a aVar3 = new j9l.a();
                ybl.l lVarF2 = nVar4.O.f();
                dqd.k kVar2 = new dqd.k();
                uqd.a aVar4 = new uqd.a();
                q06.l lVarA = nVar4.R.a();
                vc.s.j(lVarA);
                wzi.a aVarA2 = ((ctj.b) nVar4.I).a();
                vc.s.j(aVarA2);
                sh5.d dVarF = nVar4.S.f();
                vc.s.j(dVarF);
                mre.c cVarB = nVar4.T.b();
                vc.s.j(cVarB);
                n nVar5 = k0Var.f238458b;
                djf.c cVar5 = nVar5.f238490h;
                thf.d dVarD2 = cVar5.d();
                vc.s.j(dVarD2);
                thf.m mVarG2 = cVar5.g();
                vc.s.j(mVarG2);
                end.d dVarH = nVar5.f238489g.h();
                nmc.d dVarD3 = nVar5.J.d();
                gte.a aVarB5 = nVar5.f238482a.b();
                vc.s.j(aVarB5);
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.j jVar = new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.j(dVarD2, mVarG2, dVarH, new pqd.a(new end.f(dVarD3, aVarB5, new ufl.b(new tfl.a()))), new uqd.a());
                v60.e eVarA = nVar4.U.a();
                vc.s.j(eVarA);
                return new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i(dVar2, bVarA2, aVar3, lVarF2, kVar2, aVar4, lVarA, aVarA2, dVarF, cVarB, jVar, eVarA);
            case 7:
                jqd.d dVar3 = ((l0) this.f238556c).f238470a;
                r3a.b bVar4 = (r3a.b) ((n) this.f238555b).W.e.get();
                vc.s.j(bVar4);
                return new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.transfer.a(dVar3, bVar4, new x2k.a());
            case 8:
                s0 s0Var = (s0) this.f238556c;
                SetupBudgetContract$InputData setupBudgetContract$InputData = s0Var.f238543a;
                n nVar6 = s0Var.f238544b;
                izi.a aVar5 = nVar6.f238484b;
                eqj.f fVar = (eqj.f) ((dqj.r) aVar5).H.get();
                vc.s.j(fVar);
                dqj.r rVar = (dqj.r) aVar5;
                jzi.a aVarD = rVar.d();
                vc.s.j(aVarD);
                wsg.b bVarA3 = nVar6.f.a();
                g48.r0 r0VarC2 = nVar6.f238494l.c();
                ke3.e eVar = nVar6.f238486c;
                wmd.c cVar6 = new wmd.c(bVarA3, r0VarC2, eVar.a());
                l5i.q qVarB = eVar.b();
                ge3.a aVarE = eVar.e();
                vc.s.j(aVarE);
                ang.f fVarE = nVar6.i.e();
                ge3.d dVarF2 = eVar.f();
                vc.s.j(dVarF2);
                kzi.a aVarB6 = rVar.b();
                vc.s.j(aVarB6);
                wmd.f fVar2 = new wmd.f(qVarB, aVarE, fVarE, dVarF2, aVarB6);
                xld.f fVar3 = (xld.f) nVar6.f238489g.z0.get();
                vc.s.j(fVar3);
                ppk.f fVarA = nVar6.f238510x.a();
                l70.e eVar2 = nVar6.d;
                l80.e eVarH3 = eVar2.h();
                vc.s.j(eVarH3);
                uc.d dVar4 = new uc.d(fVar3, fVarA, eVarH3);
                l80.e eVarH4 = eVar2.h();
                vc.s.j(eVarH4);
                kzi.a aVarB7 = rVar.b();
                vc.s.j(aVarB7);
                xmd.p0 p0Var = new xmd.p0(fVar, aVarD, cVar6, fVar2, dVar4, eVarH4, aVarB7);
                w80.b bVarJ = ((n) this.f238555b).d.j();
                vc.s.j(bVarJ);
                w80.b bVarJ2 = nVar6.d.j();
                vc.s.j(bVarJ2);
                return new xmd.s0(setupBudgetContract$InputData, p0Var, bVarJ, new xmd.v0(setupBudgetContract$InputData, bVarJ2, (a9e.a) nVar6.R0.get()));
            case 9:
                t0 t0Var = (t0) this.f238556c;
                btd.a aVar6 = t0Var.f238551a;
                wli.x xVarD = ((s41.a) ((n) this.f238555b).q0).d();
                rrd.g gVar = new rrd.g();
                n nVar7 = t0Var.f238552b;
                egk.e eVarE = nVar7.A.e();
                vc.s.j(eVarE);
                l80.e eVarH5 = nVar7.d.h();
                vc.s.j(eVarH5);
                return new com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.b(aVar6, xVarD, new com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.c(aVar6, gVar, eVarE, eVarH5));
            case 10:
                TotalWealthFlowContract$InputData totalWealthFlowContract$InputData = ((u0) this.f238556c).f238557a;
                n nVar8 = (n) this.f238555b;
                frd.i iVarI = nVar8.f238489g.i();
                izi.a aVar7 = nVar8.f238484b;
                tsj.g gVarE3 = ((dqj.r) aVar7).e();
                vc.s.j(gVarE3);
                wsg.n nVarB2 = nVar8.f.b();
                dtd.a aVar8 = (dtd.a) nVar8.S0.get();
                nqj.c cVarC = ((dqj.r) aVar7).c();
                vc.s.j(cVarC);
                return new com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f(totalWealthFlowContract$InputData, iVarI, gVarE3, nVarB2, aVar8, cVarC);
            case 11:
                return new com.revolut.biometric_verification.impl.ui.step.selfie_search.flow.a(((pr.f0) this.f238556c).f238842a, new mu.e(), (zr.l) ((pr.q) this.f238555b).f238877n.get());
            case 12:
                pr.g0 g0Var = (pr.g0) this.f238556c;
                tr.d dVar5 = new tr.d();
                pr.q qVar = g0Var.f238846b;
                qd0.b bVarN = qVar.f.n();
                vc.s.j(bVarN);
                tr.b bVar5 = new tr.b(dVar5, bVarN, new tr.c(), qVar.f238872g.a(), pl1.d.w(qVar.f238869a));
                sw.c cVar7 = qVar.e.f240527a;
                qw.a aVarC = cVar7.c();
                vc.s.j(aVarC);
                nw.a aVar9 = (nw.a) cVar7.f266050j.get();
                vc.s.j(aVar9);
                ku.e eVar3 = new ku.e(bVar5, aVarC, aVar9);
                pr.q qVar2 = (pr.q) this.f238555b;
                zr.l lVar = (zr.l) qVar2.f238877n.get();
                uq.a aVar10 = (uq.a) qVar2.i.f273441c.get();
                vc.s.j(aVar10);
                lu.a aVar11 = new lu.a();
                i5j.a aVar12 = (i5j.a) qVar2.f238874j.f149571b.get();
                vc.s.j(aVar12);
                return new com.revolut.biometric_verification.impl.ui.step.selfie.flow.c(eVar3, lVar, aVar10, aVar11, aVar12, new ju.a(), qVar2.f238872g.a(), g0Var.f238845a);
            case 13:
                ntk.c cVar8 = ((prk.g) this.f238556c).f239137a;
                prk.g0 g0Var2 = (prk.g0) this.f238555b;
                a2b.b bVarF = g0Var2.K.f();
                vc.s.j(bVarF);
                zdl.c cVar9 = g0Var2.e;
                ybl.b bVarB = cVar9.b();
                vc.s.j(bVarB);
                c1l.e eVarA2 = g0Var2.L.a();
                ael.d0 d0VarK = cVar9.k();
                vc.s.j(d0VarK);
                return new com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a(cVar8, bVarF, bVarB, eVarA2, d0VarK, g0Var2.v.w(), new wxk.c(((kyk.v) g0Var2.M).k.f()));
            case 14:
                prk.m mVar2 = (prk.m) this.f238556c;
                zvk.d assetStatsUIMapper = new zvk.d(new o7.d(new x3h.a()));
                Intrinsics.checkNotNullParameter(assetStatsUIMapper, "assetStatsUIMapper");
                yvk.k itemMapper = new yvk.k();
                Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
                yvk.l lVar2 = new yvk.l();
                EditKeyStatsScreenContract$Input editKeyStatsScreenContract$Input = mVar2.f239233a;
                mk0.a aVarA3 = mVar2.f239234b.o.a();
                vc.s.j(aVarA3);
                return new com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a(lVar2, editKeyStatsScreenContract$Input, new ogm.i(new lrk.e(aVarA3, new grk.b(), new lrk.d()), new rrk.b()), ((prk.g0) this.f238555b).v.f(), new nd.p(new zvk.b(), 22));
            case 15:
                prk.s sVar = (prk.s) this.f238556c;
                ztk.g gVar2 = new ztk.g(new ytk.a(new ytk.c()), new t1j.b(new ytk.a(new ytk.c())));
                qrk.c cVarA = ((prk.a) ((prk.g0) this.f238555b).f239147n).a();
                vc.s.j(cVarA);
                return new ztk.h(gVar2, cVarA, sVar.f239291a);
            case 16:
                prk.a0 a0Var = (prk.a0) this.f238556c;
                fwk.f recommendationHistoryRowBuilder = new fwk.f();
                Intrinsics.checkNotNullParameter(recommendationHistoryRowBuilder, "recommendationHistoryRowBuilder");
                fwk.h hVar2 = new fwk.h();
                RecommendationHistoryScreenContract$InputData recommendationHistoryScreenContract$InputData = a0Var.f239057a;
                qrk.c cVarA2 = ((prk.a) ((prk.g0) this.f238555b).f239147n).a();
                vc.s.j(cVarA2);
                return new fwk.e(hVar2, recommendationHistoryScreenContract$InputData, cVarA2);
            case 17:
                prk.c0 c0Var = (prk.c0) this.f238556c;
                duk.h hVar3 = new duk.h(new ytk.a(new ytk.c()), new t1j.b(new ytk.a(new ytk.c())), new ytk.b());
                qrk.c cVarA3 = ((prk.a) ((prk.g0) this.f238555b).f239147n).a();
                vc.s.j(cVarA3);
                return new duk.i(hVar3, cVarA3, c0Var.f239070a);
            case 18:
                prk.i0 i0Var = (prk.i0) this.f238556c;
                StockFinancialsStatementsControllerContract$InputData stockFinancialsStatementsControllerContract$InputData = i0Var.f239164a;
                nvk.a0 a0Var2 = new nvk.a0(new csk.j(), new fsk.d(), i0Var.f239165b, i0Var.f239166c.B.b());
                prk.g0 g0Var3 = (prk.g0) this.f238555b;
                qrk.b bVar6 = (qrk.b) ((prk.a) g0Var3.f239147n).f239052s.get();
                vc.s.j(bVar6);
                ybl.b bVarB2 = g0Var3.e.b();
                vc.s.j(bVarB2);
                z0h.d dVarC = ((u8h.b) g0Var3.d).c();
                vc.s.j(dVarC);
                return new com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a(stockFinancialsStatementsControllerContract$InputData, a0Var2, bVar6, bVarB2, dVarC);
            case 19:
                StockOrderBookControllerContract$InputData stockOrderBookControllerContract$InputData = ((prk.j0) this.f238556c).f239198a;
                cwk.a aVar13 = new cwk.a();
                prk.g0 g0Var4 = (prk.g0) this.f238555b;
                pgl.a aVar14 = (pgl.a) g0Var4.G.k.get();
                vc.s.j(aVar14);
                trl.a aVar15 = g0Var4.H;
                vrl.g gVarB = aVar15.b();
                vc.s.j(gVarB);
                zdl.c cVar10 = g0Var4.e;
                ybl.d dVarH2 = cVar10.h();
                vc.s.j(dVarH2);
                ybl.b bVarB3 = cVar10.b();
                vc.s.j(bVarB3);
                ybl.k kVarD2 = g0Var4.f239155y.d();
                vc.s.j(kVarD2);
                ybl.q qVarW = g0Var4.v.w();
                udf.a aVar16 = (udf.a) aVar15.F.get();
                vc.s.j(aVar16);
                return new bwk.m(stockOrderBookControllerContract$InputData, aVar13, aVar14, gVarB, dVarH2, bVarB3, kVarD2, qVarW, aVar16, new a3e.u(new dwk.b()));
            case 20:
                BarcodeQrReaderFlowContract$InputData barcodeQrReaderFlowContract$InputData = ((px.c) this.f238556c).f240495a;
                y80.a aVarR = ((px.g) this.f238555b).f.r();
                vc.s.j(aVarR);
                return new com.revolut.camerakit.revolut.ui.barcodeqr.a(barcodeQrReaderFlowContract$InputData, aVarR);
            case 21:
                px.g gVar3 = (px.g) this.f238555b;
                y80.a aVarR2 = gVar3.f.r();
                vc.s.j(aVarR2);
                return new com.revolut.camerakit.revolut.ui.barcode.a(aVarR2, gVar3.f240530g, ((px.e) this.f238556c).f240512a);
            case 22:
                q05.g gVar4 = (q05.g) this.f238556c;
                v05.j jVar2 = new v05.j(new v05.g());
                q05.e eVar4 = gVar4.f241155a;
                aq3.b creditProductIconProvider = (aq3.b) eVar4.e.i0.get();
                vc.s.j(creditProductIconProvider);
                Intrinsics.checkNotNullParameter(creditProductIconProvider, "creditProductIconProvider");
                v05.c cVar11 = new v05.c();
                v05.k kVar3 = new v05.k();
                l80.e eVarH6 = eVar4.f.h();
                vc.s.j(eVarH6);
                t05.z zVar = new t05.z(jVar2, cVar11, kVar3, eVarH6);
                q05.e eVar5 = (q05.e) this.f238555b;
                p56.a aVar17 = new p56.a((l05.c) eVar5.f241149l.get());
                r05.f fVar4 = (r05.f) eVar5.f241151n.get();
                r05.g gVar5 = (r05.g) eVar5.k.get();
                xq3.j jVarH = eVar5.e.h();
                vc.s.j(jVarH);
                return new t05.x(zVar, aVar17, fVar4, gVar5, jVarH);
            case 23:
                return new a15.m(new a15.p(new v05.j(new v05.g())), ((q05.i) this.f238556c).f241159a, (r05.f) ((q05.e) this.f238555b).f241151n.get());
            case 24:
                v48.c cVar12 = ((q38.a) this.f238556c).f241863a;
                q38.b bVar7 = (q38.b) this.f238555b;
                r38.b bVar8 = (r38.b) bVar7.f241880x.get();
                g48.r0 r0VarC3 = bVar7.i.c();
                cu8.r0 r0VarA = bVar7.f241878t.a();
                gte.a aVarB8 = bVar7.f241865a.b();
                vc.s.j(aVarB8);
                return new com.revolut.feature.joint.impl.ui.creation_flow.b(cVar12, bVar8, r0VarC3, r0VarA, aVarB8, new w38.t());
            case 25:
                q7a.a aVar18 = (q7a.a) this.f238556c;
                PermissionsControllerContract$InputData permissionsControllerContract$InputData = aVar18.f242786a;
                qr0.i iVar = new qr0.i(aVar18.f242787b, new r7a.a());
                s70.a aVarM = ((q7a.b) this.f238555b).f242789a.m();
                vc.s.j(aVarM);
                return new com.revolut.feature.permissions.flow.b(permissionsControllerContract$InputData, iVar, aVarM);
            case 26:
                q7k.j jVar3 = (q7k.j) this.f238555b;
                pqi.a aVar19 = jVar3.e;
                tqi.g gVarE4 = aVar19.e();
                q7k.h hVar4 = (q7k.h) this.f238556c;
                q7k.j jVar4 = hVar4.f242886b;
                uli.c cVarA4 = jVar4.f.a();
                vc.s.j(cVarA4);
                g8k.b bVar9 = new g8k.b(cVarA4);
                p56.a aVar20 = new p56.a(new ks0.n((TransferLinkService) jVar3.f242907c.f242877j.get()));
                c70.a aVarZ = jVar3.f242906b.z();
                vc.s.j(aVarZ);
                return new com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.b(gVarE4, bVar9, aVar20, aVarZ, aVar19.g(), hVar4.f242885a, new k8k.e(jVar4.f242906b.d()));
            case 27:
                CryptoDepositInput cryptoDepositInput = ((qbj.o) this.f238556c).f244324a;
                qbj.q qVar3 = (qbj.q) this.f238555b;
                fbj.a aVarA4 = ((qbj.m) qVar3.f244329a).a();
                vc.s.j(aVarA4);
                uj5.b bVarE = ((ak5.i) qVar3.f244330b).e();
                vc.s.j(bVarE);
                zja.a aVarA5 = ((ika.b) qVar3.f244331c).a();
                vc.s.j(aVarA5);
                return new com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.b(cryptoDepositInput, aVarA4, bVarE, aVarA5);
            case 28:
                qbj.p pVar = (qbj.p) this.f238556c;
                sj5.b bVar10 = (sj5.b) ((ak5.i) pVar.f244327b.f244330b).f5693h.get();
                vc.s.j(bVar10);
                wbj.h hVar5 = new wbj.h(bVar10);
                CryptoDepositReturnDetailsBottomSheetControllerInputData cryptoDepositReturnDetailsBottomSheetControllerInputData = pVar.f244326a;
                qbj.q qVar4 = (qbj.q) this.f238555b;
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) qVar4.f244338p).c();
                vc.s.j(aVarC2);
                fbj.a aVarA6 = ((qbj.m) qVar4.f244329a).a();
                vc.s.j(aVarA6);
                return new wbj.f(hVar5, cryptoDepositReturnDetailsBottomSheetControllerInputData, aVarC2, aVarA6);
            default:
                CryptoDirectDepositFlowContract$InputData cryptoDirectDepositFlowContract$InputData = ((qbj.t) this.f238556c).f244357a;
                qbj.q qVar5 = (qbj.q) this.f238555b;
                ibj.a aVar21 = (ibj.a) ((qbj.m) qVar5.f244329a).f244318q.get();
                vc.s.j(aVar21);
                zm5.e eVar6 = new zm5.e(qVar5.f244342t.f281235c, zm5.h.a(), new zm5.a());
                gte.a aVarB9 = qVar5.d.b();
                vc.s.j(aVarB9);
                ybj.a aVar22 = new ybj.a();
                gk5.a aVar23 = (gk5.a) ((ak5.i) qVar5.f244330b).f5698p.get();
                vc.s.j(aVar23);
                asi.d dVarC2 = ((j51.a) qVar5.u).c();
                vc.s.j(dVarC2);
                zja.a aVarA7 = ((ika.b) qVar5.f244331c).a();
                vc.s.j(aVarA7);
                return new com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b(cryptoDirectDepositFlowContract$InputData, aVar21, eVar6, aVarB9, aVar22, aVar23, dVarC2, aVarA7);
        }
    }
}
