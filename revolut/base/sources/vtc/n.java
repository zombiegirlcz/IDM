package vtc;

import android.content.Context;
import android.net.ConnectivityManager;
import com.revolut.feature.masav.impl.ui.form.MasavDirectDebitFormScreenContract$InputData;
import com.revolut.feature.masav.impl.ui.review.MasavDirectDebitReviewScreenContract$InputData;
import com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlowContract$InputData;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.data.SalarySwitchAssistantService;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.request_summary.RequestSummaryContract$InputData;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.SwitchAssistantFlowContract$InputData;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.PayrollPlatformEmailInputContract$InputData;
import com.revolut.feature.retail.salary_account.impl.work_email.input.WorkEmailInputControllerContract$InputData;
import com.revolut.feature.retail.salary_account.impl.work_email.verification.screen.WorkEmailVerificationControllerContract$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$InputData;
import com.revolut.feature.security_hub.api.navigation.SecurityHubInputData;
import com.revolut.feature.security_hub.impl.ui.lost_card.LostCardControllerContract$InputData;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.TransactionsDayNightLimitsScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.PerformanceDetailsScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.StrategyReportScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealFlowContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealLoadingScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.ManagedPortfolioSelectTemplateScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f292033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xki.e f292034c;

    public /* synthetic */ n(Object obj2, xki.e eVar, int i) {
        this.f292032a = i;
        this.f292033b = obj2;
        this.f292034c = eVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f292032a) {
            case 0:
                o oVar = (o) this.f292034c;
                m93.d dVarF = oVar.f292036b.e.f();
                vc.s.j(dVarF);
                avc.t tVar = new avc.t(new xtc.c(dVarF));
                LostCardControllerContract$InputData lostCardControllerContract$InputData = oVar.f292035a;
                l93.f fVarJ = ((t) this.f292033b).e.j();
                vc.s.j(fVarJ);
                return new avc.r(tVar, lostCardControllerContract$InputData, fVarJ);
            case 1:
                u uVar = (u) this.f292034c;
                SecurityHubInputData securityHubInputData = uVar.f292081a;
                t tVar2 = (t) this.f292033b;
                ika.f fVar = tVar2.f292071m;
                zja.a aVarA = ((ika.b) fVar).a();
                vc.s.j(aVarA);
                wtc.u uVar2 = (wtc.u) tVar2.f292064e0.get();
                huc.a aVar = new huc.a();
                wtc.h hVar = (wtc.h) tVar2.U.get();
                qka.c cVarB = ((ika.b) fVar).b();
                smd.s sVarB = uVar.b();
                k0 k0Var = tVar2.f292068j;
                ufm.d dVarC = k0Var.c();
                wtc.g0 g0VarD = k0Var.d();
                ang.f fVarE = tVar2.f292072n.e();
                wtc.q0 q0Var = (wtc.q0) tVar2.f0.get();
                st2.e eVar = (st2.e) tVar2.o.o.get();
                vc.s.j(eVar);
                wt2.c cVar = new wt2.c();
                tla.d dVarB = tVar2.f292073p.b();
                vc.s.j(dVarB);
                wtc.k kVar = (wtc.k) tVar2.g0.get();
                t tVar3 = uVar.f292082b;
                buc.g gVar = new buc.g(tVar3.f292072n.e(), (wtc.q0) tVar3.f0.get(), uVar.b());
                r10.t tVar4 = new r10.t(tVar3.f292072n.e(), (wtc.q0) tVar3.f0.get());
                gte.a aVarB = tVar2.k.b();
                vc.s.j(aVarB);
                w39.b bVarA = tVar2.i.a();
                vc.s.j(bVarA);
                ConnectivityManager connectivityManager = (ConnectivityManager) tVar3.f292075r.f192451y.get();
                vc.s.j(connectivityManager);
                n80.b bVar = new n80.b();
                Context context = tVar3.d;
                return new com.revolut.feature.security_hub.impl.ui.flow.m(securityHubInputData, aVarA, uVar2, aVar, hVar, cVarB, sVarB, dVarC, g0VarD, fVarE, q0Var, eVar, cVar, dVarB, kVar, gVar, tVar4, aVarB, bVarA, new tb4.t(new wtc.e(connectivityManager, bVar, p0.D(context)), new wtc.f(), new tul.b(new n80.b(), p0.D(context))), new buc.d(), new buc.h(), (ptc.a) tVar2.Z.get());
            case 2:
                z zVar = (z) this.f292034c;
                t tVar5 = zVar.f292098b;
                ewc.g gVar2 = new ewc.g((xtc.d) tVar5.l0.get(), new rwc.c());
                rwc.c securityHubImageProgressStyleMapper = new rwc.c();
                Intrinsics.checkNotNullParameter(securityHubImageProgressStyleMapper, "securityHubImageProgressStyleMapper");
                dwc.j jVar = new dwc.j(gVar2, new ewc.c());
                TransactionsDayNightLimitsScreenContract$InputData transactionsDayNightLimitsScreenContract$InputData = zVar.f292097a;
                t tVar6 = (t) this.f292033b;
                wtc.k kVar2 = (wtc.k) tVar6.g0.get();
                fwc.a aVar2 = new fwc.a((xtc.d) tVar5.l0.get());
                ang.f fVarE2 = tVar6.f292072n.e();
                wtc.q0 q0Var2 = (wtc.q0) tVar6.f0.get();
                ewc.e eVar2 = new ewc.e();
                mt8.d dVarB2 = tVar6.G.b();
                vc.s.j(dVarB2);
                return new com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a(jVar, transactionsDayNightLimitsScreenContract$InputData, kVar2, aVar2, fVarE2, q0Var2, eVar2, dVarB2, ((s41.a) tVar6.H).d());
            case 3:
                b0 b0Var = (b0) this.f292034c;
                hwc.a transactionLimitsHeaderMapper = new hwc.a();
                Intrinsics.checkNotNullParameter(transactionLimitsHeaderMapper, "transactionLimitsHeaderMapper");
                com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.c cVar2 = new com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.c();
                t tVar7 = b0Var.f291953a;
                xmg.a aVar3 = tVar7.f292072n;
                buc.g gVar3 = new buc.g(aVar3.e(), (wtc.q0) tVar7.f0.get(), new smd.s(aVar3.e(), (wtc.q0) tVar7.f0.get()));
                gte.a aVarB2 = ((t) this.f292033b).k.b();
                vc.s.j(aVarB2);
                return new gwc.i(cVar2, gVar3, aVarB2, new iwc.b((wtc.k) tVar7.g0.get()));
            case 4:
                zvc.m mVar = new zvc.m();
                t tVar8 = (t) this.f292033b;
                wtc.g0 g0VarD2 = tVar8.f292068j.d();
                tb4.t tVarB = tVar8.b();
                w39.b bVarA2 = tVar8.i.a();
                vc.s.j(bVarA2);
                com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) ((e0) this.f292034c).f291969a.get();
                l70.e eVar3 = tVar8.f292075r;
                y80.a aVarR = eVar3.r();
                vc.s.j(aVarR);
                s70.a aVarM = eVar3.m();
                vc.s.j(aVarM);
                return new com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a(mVar, g0VarD2, tVarB, bVarA2, aVar4, aVarR, aVarM, new buc.i(), new buc.h(), new ovc.a());
            case 5:
                return new com.revolut.feature.rev_points.buying.impl.ui.flow.a(((vub.c) this.f292034c).f292291a, ((vub.a) this.f292033b).f292282a.a());
            case 6:
                w1c.c cVar3 = (w1c.c) this.f292034c;
                w1c.a aVar5 = cVar3.f293825b;
                gte.a aVarB3 = aVar5.f293817a.b();
                vc.s.j(aVarB3);
                jub.a aVarC = aVar5.f293818b.c();
                vc.s.j(aVarC);
                p2c.y yVar = new p2c.y(aVarB3, aVarC);
                RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData = cVar3.f293824a;
                w1c.a aVar6 = (w1c.a) this.f292033b;
                xvh.c cVarA = ((a6d.e) aVar6.f293819c).a();
                vc.s.j(cVarA);
                rul.e eVarA = aVar6.d.a();
                p2c.z zVar2 = new p2c.z();
                mre.c cVarB2 = aVar6.e.b();
                vc.s.j(cVarB2);
                l61.a aVarB4 = aVar6.f.b();
                vc.s.j(aVarB4);
                return new com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a(yVar, revPointsSpareChangeControllerApi$InputData, cVarA, eVarA, zVar2, cVarB2, aVarB4);
            case 7:
                w1c.e eVar4 = (w1c.e) this.f292034c;
                w1c.a aVar7 = eVar4.f293831b;
                jub.a aVarC2 = aVar7.f293818b.c();
                vc.s.j(aVarC2);
                gte.a aVarB5 = aVar7.f293817a.b();
                vc.s.j(aVarB5);
                f2c.x xVar = new f2c.x(aVarB5, aVarC2);
                RevPointsSpareChangeFullBannerGridControllerApi$InputData revPointsSpareChangeFullBannerGridControllerApi$InputData = eVar4.f293830a;
                w1c.a aVar8 = (w1c.a) this.f292033b;
                xvh.c cVarA2 = ((a6d.e) aVar8.f293819c).a();
                vc.s.j(cVarA2);
                rul.e eVarA2 = aVar8.d.a();
                p2c.z zVar3 = new p2c.z();
                mre.c cVarB3 = aVar8.e.b();
                vc.s.j(cVarB3);
                l61.a aVarB6 = aVar8.f.b();
                vc.s.j(aVarB6);
                return new com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.a(xVar, revPointsSpareChangeFullBannerGridControllerApi$InputData, cVarA2, eVarA2, zVar3, cVarB3, aVarB6);
            case 8:
                w1c.f fVar2 = (w1c.f) this.f292034c;
                jub.a aVarC3 = fVar2.f293834b.f293818b.c();
                vc.s.j(aVarC3);
                h2c.x xVar2 = new h2c.x(aVarC3);
                RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData2 = fVar2.f293833a;
                w1c.a aVar9 = (w1c.a) this.f292033b;
                xvh.c cVarA3 = ((a6d.e) aVar9.f293819c).a();
                vc.s.j(cVarA3);
                rul.e eVarA3 = aVar9.d.a();
                p2c.z zVar4 = new p2c.z();
                mre.c cVarB4 = aVar9.e.b();
                vc.s.j(cVarB4);
                l61.a aVarB7 = aVar9.f.b();
                vc.s.j(aVarB7);
                return new com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a(xVar2, revPointsSpareChangeControllerApi$InputData2, cVarA3, eVarA3, zVar4, cVarB4, aVarB7);
            case 9:
                w1c.a aVar10 = ((w1c.g) this.f292034c).f293836a;
                gte.a aVarB8 = aVar10.f293817a.b();
                vc.s.j(aVarB8);
                jub.a aVarC4 = aVar10.f293818b.c();
                vc.s.j(aVarC4);
                j2c.x xVar3 = new j2c.x(aVarB8, aVarC4);
                w1c.a aVar11 = (w1c.a) this.f292033b;
                xvh.c cVarA4 = ((a6d.e) aVar11.f293819c).a();
                vc.s.j(cVarA4);
                rul.e eVarA4 = aVar11.d.a();
                mre.c cVarB5 = aVar11.e.b();
                vc.s.j(cVarB5);
                p2c.z zVar5 = new p2c.z();
                l61.a aVarB9 = aVar11.f.b();
                vc.s.j(aVarB9);
                return new com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a(xVar3, cVarA4, eVarA4, cVarB5, zVar5, aVarB9);
            case 10:
                w1c.h hVar2 = (w1c.h) this.f292034c;
                w1c.a aVar12 = hVar2.f293839b;
                gte.a aVarB10 = aVar12.f293817a.b();
                vc.s.j(aVarB10);
                jub.a aVarC5 = aVar12.f293818b.c();
                vc.s.j(aVarC5);
                l2c.x xVar4 = new l2c.x(aVarB10, aVarC5);
                RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData3 = hVar2.f293838a;
                w1c.a aVar13 = (w1c.a) this.f292033b;
                nyb.k kVarC = aVar13.f293820g.c();
                vc.s.j(kVarC);
                xvh.c cVarA5 = ((a6d.e) aVar13.f293819c).a();
                vc.s.j(cVarA5);
                rul.e eVarA5 = aVar13.d.a();
                p2c.z zVar6 = new p2c.z();
                mre.c cVarB6 = aVar13.e.b();
                vc.s.j(cVarB6);
                gte.a aVarB11 = aVar13.f293817a.b();
                vc.s.j(aVarB11);
                l61.a aVarB12 = aVar13.f.b();
                vc.s.j(aVarB12);
                return new com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a(xVar4, revPointsSpareChangeControllerApi$InputData3, kVarC, cVarA5, eVarA5, zVar6, cVarB6, aVarB11, aVarB12);
            case 11:
                w59.b bVar2 = (w59.b) this.f292034c;
                MasavDirectDebitReviewScreenContract$InputData masavDirectDebitReviewScreenContract$InputData = bVar2.f294732a;
                w59.d dVar = (w59.d) this.f292033b;
                l2j.a aVar14 = new l2j.a();
                rea.m mVarF = dVar.f294740c.f();
                vz1.g gVarH = ((lz1.m) bVar2.f294733b.e).h();
                vc.s.j(gVarH);
                return new com.revolut.feature.masav.impl.ui.review.a(masavDirectDebitReviewScreenContract$InputData, aVar14, mVarF, new ugc.a(gVarH), new i69.o());
            case 12:
                w59.g gVar4 = (w59.g) this.f292034c;
                MasavDirectDebitFormScreenContract$InputData masavDirectDebitFormScreenContract$InputData = gVar4.f294751b;
                l80.e eVarH = ((w59.d) this.f292033b).d.h();
                vc.s.j(eVarH);
                vz1.g gVarH2 = ((lz1.m) gVar4.f294752c.e).h();
                vc.s.j(gVarH2);
                return new com.revolut.feature.masav.impl.ui.form.c(masavDirectDebitFormScreenContract$InputData, eVarH, new ugc.a(gVarH2), new c69.a(), new c69.u());
            case 13:
                w59.g gVar5 = (w59.g) this.f292034c;
                MasavDirectDebitFormScreenContract$InputData masavDirectDebitFormScreenContract$InputData2 = gVar5.f294751b;
                l80.e eVarH2 = ((w59.d) this.f292033b).d.h();
                vc.s.j(eVarH2);
                vz1.g gVarH3 = ((lz1.m) gVar5.f294752c.e).h();
                vc.s.j(gVarH3);
                return new com.revolut.feature.masav.impl.ui.form.c(masavDirectDebitFormScreenContract$InputData2, eVarH2, new ugc.a(gVarH3), new c69.a(), new c69.u());
            case 14:
                return new com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.pages.a(((w5f.c) this.f292034c).f295120a, (vii.b) ((w5f.b) this.f292033b).d.get(), new n7f.l());
            case 15:
                return new com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.a(((w5f.m) this.f292033b).d.c(), ((w5f.e) this.f292034c).f295133a, new x6f.k());
            case 16:
                w5f.k kVar3 = (w5f.k) this.f292034c;
                ManagedPortfolioSelectTemplateScreenContract$InputData managedPortfolioSelectTemplateScreenContract$InputData = kVar3.f295184a;
                w5f.m mVar2 = (w5f.m) this.f292033b;
                dmc.a aVar15 = mVar2.d;
                zjh.f fVarA = aVar15.a();
                emc.e eVarC = aVar15.c();
                qmc.b bVarF = mVar2.f295190b.f();
                com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.a aVar16 = new com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.a();
                w5f.m mVar3 = kVar3.f295185b;
                f8f.e eVar5 = new f8f.e(mVar3.d.d());
                f8f.a aVar17 = new f8f.a();
                dmc.a aVar18 = mVar3.d;
                return new com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b(managedPortfolioSelectTemplateScreenContract$InputData, fVarA, eVarC, bVarF, aVar16, eVar5, aVar17, new d8f.b0(aVar18.d(), new d8f.z(aVar18.d(), 0)));
            case 17:
                return new com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a(((w5f.o) this.f292034c).f295209a, ((w5f.m) this.f292033b).d.a());
            case 18:
                return new s8f.g(((w5f.m) this.f292033b).c(), ((w5f.q) this.f292034c).f295228a, new com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.b());
            case 19:
                w5f.m mVar4 = (w5f.m) this.f292033b;
                qmc.h hVarA = mVar4.f.a();
                qmc.d dVarG = mVar4.f295190b.g();
                vdl.i0 i0VarD = mVar4.f295195l.d();
                vc.s.j(i0VarD);
                ael.z zVar7 = new ael.z();
                w5f.r rVar = (w5f.r) this.f292034c;
                PerformanceDetailsScreenContract$InputData performanceDetailsScreenContract$InputData = rVar.f295230a;
                ufl.b bVar3 = new ufl.b(new tfl.a());
                w5f.m mVar5 = rVar.f295231b;
                return new com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.a(hVarA, dVarG, i0VarD, zVar7, performanceDetailsScreenContract$InputData, new com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.b(bVar3, mVar5.d.d(), new kpj.f(mVar5.k.H())));
            case 20:
                PortfolioRevealFlowContract$InputData portfolioRevealFlowContract$InputData = ((w5f.u) this.f292034c).f295241a;
                w5f.m mVar6 = (w5f.m) this.f292033b;
                m4f.b bVar4 = new m4f.b();
                tzg.m mVarT = mVar6.k.t();
                vc.s.j(mVarT);
                return new com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a(portfolioRevealFlowContract$InputData, bVar4, mVarT);
            case 21:
                PortfolioRevealLoadingScreenContract$InputData portfolioRevealLoadingScreenContract$InputData = ((w5f.w) this.f292034c).f295246a;
                w5f.m mVar7 = (w5f.m) this.f292033b;
                return new b8f.n(portfolioRevealLoadingScreenContract$InputData, new o7.d(new lrk.a((x4l.c) mVar7.C.get(), 2)), mVar7.d.c(), new b8f.k());
            case 22:
                w5f.a0 a0Var = (w5f.a0) this.f292034c;
                StrategyReportScreenContract$InputData strategyReportScreenContract$InputData = a0Var.f295111a;
                w5f.m mVar8 = (w5f.m) this.f292033b;
                return new com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a(strategyReportScreenContract$InputData, mVar8.a(), ((s41.a) mVar8.f295200r).d(), new p7f.q(new r7f.b(a0Var.f295112b.f295199q.g())));
            case 23:
                PayrollPlatformEmailInputContract$InputData payrollPlatformEmailInputContract$InputData = ((wfb.d) this.f292034c).f297028a;
                com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.b bVar5 = new com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.b(payrollPlatformEmailInputContract$InputData);
                t1j.b bVar6 = new t1j.b(new ugc.a((SalarySwitchAssistantService) ((wfb.q) this.f292033b).f297072c.K.get()));
                aib.b.Companion.getClass();
                return new zhb.k(bVar5, payrollPlatformEmailInputContract$InputData, bVar6, new zzl.c());
            case 24:
                wfb.f fVar3 = (wfb.f) this.f292034c;
                RequestSummaryContract$InputData requestSummaryContract$InputData = fVar3.f297032a;
                ohb.k kVar4 = new ohb.k();
                wfb.i iVar = fVar3.f297033b;
                return new ohb.j(requestSummaryContract$InputData, kVar4, new khb.e(iVar.f.e(), iVar.o.a(), iVar.f297048p.b()), ((wfb.q) this.f292033b).b(), new khb.f(iVar.f297049q.g()));
            case 25:
                return new qhb.f(((wfb.g) this.f292034c).f297035a, new qhb.g(), ((wfb.q) this.f292033b).b());
            case 26:
                SalaryAccountFlowContract$InputData salaryAccountFlowContract$InputData = ((wfb.j) this.f292034c).f297056a;
                wfb.i iVar2 = (wfb.i) this.f292033b;
                zfb.a aVar19 = (zfb.a) iVar2.J.get();
                rfb.b bVar7 = (rfb.b) iVar2.H.get();
                fnc.s sVarC = iVar2.c();
                bhb.a aVar20 = new bhb.a();
                on2.b bVarA3 = iVar2.i.a();
                vc.s.j(bVarA3);
                return new com.revolut.feature.retail.salary_account.impl.flow.ui.d(salaryAccountFlowContract$InputData, aVar19, bVar7, sVarC, aVar20, bVarA3);
            case 27:
                wfb.q qVar = (wfb.q) this.f292034c;
                SwitchAssistantFlowContract$InputData switchAssistantFlowContract$InputData = qVar.f297070a;
                yhb.c cVar4 = new yhb.c();
                t1j.b bVar8 = new t1j.b(new ugc.a((SalarySwitchAssistantService) qVar.f297072c.K.get()));
                wfb.i iVar3 = (wfb.i) this.f292033b;
                fnc.s sVarC2 = iVar3.c();
                fkg.a aVarB13 = qVar.b();
                uhb.a aVar21 = new uhb.a();
                s70.a aVarM2 = iVar3.f297041c.m();
                vc.s.j(aVarM2);
                return new com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b(switchAssistantFlowContract$InputData, cVar4, bVar8, sVarC2, aVarB13, aVar21, aVarM2, new bhb.a(), qVar.f297071b);
            case 28:
                WorkEmailInputControllerContract$InputData workEmailInputControllerContract$InputData = ((wfb.s) this.f292034c).f297076a;
                hib.r rVar2 = new hib.r();
                iib.b.Companion.getClass();
                zzl.c cVar5 = new zzl.c();
                wfb.i iVar4 = (wfb.i) this.f292033b;
                zjh.f fVarD = iVar4.d();
                cib.a aVar22 = new cib.a();
                fib.s sVar = new fib.s();
                mre.c cVarB7 = iVar4.f297051s.b();
                vc.s.j(cVarB7);
                return new hib.q(workEmailInputControllerContract$InputData, rVar2, cVar5, fVarD, aVar22, sVar, cVarB7);
            default:
                WorkEmailVerificationControllerContract$InputData workEmailVerificationControllerContract$InputData = ((wfb.t) this.f292034c).f297078a;
                mib.l lVar = new mib.l();
                wfb.i iVar5 = (wfb.i) this.f292033b;
                return new mib.k(workEmailVerificationControllerContract$InputData, lVar, iVar5.d(), new cib.a(), new fib.s(), (kib.a) iVar5.A.get());
        }
    }
}
