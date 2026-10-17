package afj;

import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.checkout.CheckoutScreenContract$InputData;
import com.revolut.feature.apm.blik.impl.ui.code.BlikCodeScreenContract$InputData;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.LinkCardDetailsReviewScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt.AddDebtScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day.ChangeRepaymentDayScreenContract$InputData;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.TaxHubAssessmentScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.utils.EsimInstallationDialogBuilder;
import dw3.g4;
import dw3.q4;
import dw3.s4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4199c;
    public final qji.b d;
    public final Object e;

    public /* synthetic */ d(Object obj2, qji.b bVar, Object obj3, int i, int i2) {
        this.f4197a = i2;
        this.f4198b = obj2;
        this.d = bVar;
        this.e = obj3;
        this.f4199c = i;
    }

    private final Object a() {
        z1 z1Var = (z1) this.e;
        b bVar = z1Var.f4552c;
        b bVar2 = (b) this.f4198b;
        int i = this.f4199c;
        if (i == 0) {
            oej.c cVarB = bVar2.f4122b.b();
            vc.s.j(cVarB);
            return new chj.g(cVarB, (ynj.l) ((q0) this.d).f.get(), new EsimInstallationDialogBuilder(), new r10.w((dfj.v2) bVar.R.get(), bVar.f4156s.b()));
        }
        if (i == 1) {
            return new bjj.j((dfj.t3) bVar2.S0.get(), new bjj.k());
        }
        if (i == 2) {
            return new sij.d((dfj.v2) bVar2.R.get(), new tij.v());
        }
        if (i != 3) {
            if (i != 4) {
                throw new AssertionError(i);
            }
            ynj.m mVar = new ynj.m();
            xjj.d dVarB = z1Var.b();
            z80.b bVarS = bVar.f4150p.s();
            vc.s.j(bVarS);
            xjj.e eVar = new xjj.e(mVar, dVarB, new xjj.q(bVarS), z1Var.c(), new xjj.o(new xjj.r(), new xjj.g(new unj.f()), new xjj.f(), new bnj.h((gej.a) bVar.K.get(), b.b(), new xjj.h((gej.a) bVar.K.get())), new xjj.m(new unj.f())), new xjj.k(new xjj.h((gej.a) bVar.K.get()), new xjj.r(), new xjj.g(new unj.f())), new xjj.s(new xjj.t()));
            z80.b bVarS2 = bVar.f4150p.s();
            vc.s.j(bVarS2);
            return new vjj.g0(eVar, new xjj.i(new xjj.q(bVarS2), z1Var.b(), z1Var.c(), new unj.e(new ynj.e()), (gej.a) bVar.K.get()));
        }
        cli.n nVar = (cli.n) z1Var.f4553g.get();
        EsimMobilePlanDetailsScreenContract$InputData esimMobilePlanDetailsScreenContract$InputData = z1Var.f4551b;
        wli.x xVarD = ((s41.a) bVar2.f4164w).d();
        dfj.v2 v2Var = (dfj.v2) bVar2.R.get();
        chj.d dVar = (chj.d) z1Var.d.get();
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a aVar = new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a();
        dfj.k0 k0Var = (dfj.k0) bVar2.Y.get();
        dfj.i1 i1Var = (dfj.i1) bVar2.g0.get();
        gte.a aVarB = bVar2.f4120a.b();
        vc.s.j(aVarB);
        tij.x xVar = new tij.x();
        dfj.s3 s3Var = (dfj.s3) bVar2.f4140k0.get();
        dfj.c0 c0Var = (dfj.c0) bVar2.f4124b1.get();
        ynj.p pVar = new ynj.p();
        kdh.b bVarD = ((n86.d) bVar2.f4152q).d();
        sij.b bVar3 = (sij.b) z1Var.f.get();
        bjj.f fVar = (bjj.f) z1Var.e.get();
        bjj.a aVar2 = new bjj.a();
        ijj.u uVar = new ijj.u(b.b());
        i90.b bVar4 = new i90.b();
        dfj.z0 z0Var = (dfj.z0) bVar2.G.get();
        dm0.d dVarD = bVar2.f4144m.d();
        vc.s.j(dVarD);
        return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c(nVar, esimMobilePlanDetailsScreenContract$InputData, xVarD, v2Var, dVar, aVar, k0Var, i1Var, aVarB, xVar, s3Var, c0Var, pVar, bVarD, bVar3, fVar, aVar2, uVar, bVar4, z0Var, dVarD);
    }

    private final Object b() {
        z1 z1Var = (z1) this.e;
        b bVar = z1Var.f4552c;
        b bVar2 = (b) this.f4198b;
        int i = this.f4199c;
        if (i == 0) {
            oej.c cVarB = bVar2.f4122b.b();
            vc.s.j(cVarB);
            return new chj.g(cVarB, (ynj.l) ((m) this.d).f.get(), new EsimInstallationDialogBuilder(), new r10.w((dfj.v2) bVar.R.get(), bVar.f4156s.b()));
        }
        if (i == 1) {
            return new bjj.j((dfj.t3) bVar2.S0.get(), new bjj.k());
        }
        if (i == 2) {
            return new sij.d((dfj.v2) bVar2.R.get(), new tij.v());
        }
        if (i != 3) {
            if (i != 4) {
                throw new AssertionError(i);
            }
            ynj.m mVar = new ynj.m();
            xjj.d dVarB = z1Var.b();
            z80.b bVarS = bVar.f4150p.s();
            vc.s.j(bVarS);
            xjj.e eVar = new xjj.e(mVar, dVarB, new xjj.q(bVarS), z1Var.c(), new xjj.o(new xjj.r(), new xjj.g(new unj.f()), new xjj.f(), new bnj.h((gej.a) bVar.K.get(), b.b(), new xjj.h((gej.a) bVar.K.get())), new xjj.m(new unj.f())), new xjj.k(new xjj.h((gej.a) bVar.K.get()), new xjj.r(), new xjj.g(new unj.f())), new xjj.s(new xjj.t()));
            z80.b bVarS2 = bVar.f4150p.s();
            vc.s.j(bVarS2);
            return new vjj.g0(eVar, new xjj.i(new xjj.q(bVarS2), z1Var.b(), z1Var.c(), new unj.e(new ynj.e()), (gej.a) bVar.K.get()));
        }
        cli.n nVar = (cli.n) z1Var.f4553g.get();
        EsimMobilePlanDetailsScreenContract$InputData esimMobilePlanDetailsScreenContract$InputData = z1Var.f4551b;
        wli.x xVarD = ((s41.a) bVar2.f4164w).d();
        dfj.v2 v2Var = (dfj.v2) bVar2.R.get();
        chj.d dVar = (chj.d) z1Var.d.get();
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a aVar = new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a();
        dfj.k0 k0Var = (dfj.k0) bVar2.Y.get();
        dfj.i1 i1Var = (dfj.i1) bVar2.g0.get();
        gte.a aVarB = bVar2.f4120a.b();
        vc.s.j(aVarB);
        tij.x xVar = new tij.x();
        dfj.s3 s3Var = (dfj.s3) bVar2.f4140k0.get();
        dfj.c0 c0Var = (dfj.c0) bVar2.f4124b1.get();
        ynj.p pVar = new ynj.p();
        kdh.b bVarD = ((n86.d) bVar2.f4152q).d();
        sij.b bVar3 = (sij.b) z1Var.f.get();
        bjj.f fVar = (bjj.f) z1Var.e.get();
        bjj.a aVar2 = new bjj.a();
        ijj.u uVar = new ijj.u(b.b());
        i90.b bVar4 = new i90.b();
        dfj.z0 z0Var = (dfj.z0) bVar2.G.get();
        dm0.d dVarD = bVar2.f4144m.d();
        vc.s.j(dVarD);
        return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c(nVar, esimMobilePlanDetailsScreenContract$InputData, xVarD, v2Var, dVar, aVar, k0Var, i1Var, aVarB, xVar, s3Var, c0Var, pVar, bVarD, bVar3, fVar, aVar2, uVar, bVar4, z0Var, dVarD);
    }

    private final Object c() {
        l3 l3Var = (l3) this.e;
        b bVar = l3Var.f4335c;
        b bVar2 = (b) this.f4198b;
        int i = this.f4199c;
        if (i == 0) {
            oej.c cVarB = bVar2.f4122b.b();
            vc.s.j(cVarB);
            return new chj.g(cVarB, (ynj.l) ((x0) this.d).f.get(), new EsimInstallationDialogBuilder(), new r10.w((dfj.v2) bVar.R.get(), bVar.f4156s.b()));
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            gej.a aVar = (gej.a) bVar2.K.get();
            unj.e eVar = new unj.e(new ynj.e());
            bnj.h hVar = new bnj.h((gej.a) bVar.K.get(), b.b(), new xjj.h((gej.a) bVar.K.get()));
            fhj.d dVar = new fhj.d();
            bnj.s sVar = new bnj.s();
            fhj.b bVar3 = new fhj.b(new ynj.e());
            zjh.j jVar = new zjh.j((cej.b) bVar.X.get(), new ynj.m());
            bnj.r rVar = new bnj.r();
            ynj.m mVar = new ynj.m();
            nd.o oVar = new nd.o(new vnj.a());
            bnj.g gVar = new bnj.g();
            gte.a aVarB = bVar.f4120a.b();
            vc.s.j(aVarB);
            bnj.l lVar = new bnj.l(mVar, oVar, gVar, aVarB, new bnj.d(bVar.c()));
            cej.b bVar4 = (cej.b) bVar.X.get();
            ynj.m mVar2 = new ynj.m();
            xjj.a aVar2 = new xjj.a();
            tsk.t tVar = new tsk.t(bVar.f());
            gte.a aVarB2 = bVar.f4120a.b();
            vc.s.j(aVarB2);
            bnj.q qVar = new bnj.q(bVar4, mVar2, aVar2, tVar, aVarB2);
            gte.a aVarB3 = bVar.f4120a.b();
            vc.s.j(aVarB3);
            return new zmj.r0(aVar, eVar, hVar, dVar, sVar, bVar3, jVar, rVar, lVar, qVar, new bnj.f(aVarB3));
        }
        i90.b bVar5 = new i90.b();
        EsimSubscriptionDetailsScreenContract$InputData esimSubscriptionDetailsScreenContract$InputData = l3Var.f4334b;
        cli.n nVar = (cli.n) l3Var.e.get();
        dfj.w wVar = (dfj.w) bVar2.f4135h0.get();
        dfj.s3 s3Var = (dfj.s3) bVar2.f4140k0.get();
        dfj.k0 k0Var = (dfj.k0) bVar2.Y.get();
        unj.c cVar = new unj.c(new ynj.e());
        bnj.m mVar3 = new bnj.m();
        bej.f fVar = (bej.f) bVar2.l0.get();
        gte.a aVarB4 = bVar2.f4120a.b();
        vc.s.j(aVarB4);
        cej.b bVar6 = (cej.b) bVar2.X.get();
        bej.m mVar4 = (bej.m) bVar2.F0.get();
        unj.j jVar2 = new unj.j();
        dfj.v2 v2Var = (dfj.v2) bVar2.R.get();
        dfj.v2 v2Var2 = (dfj.v2) bVar.R.get();
        nfj.a1 a1Var = (nfj.a1) bVar.Q.get();
        dfj.s3 s3Var2 = (dfj.s3) bVar.f4140k0.get();
        dfj.k0 k0Var2 = (dfj.k0) bVar.Y.get();
        ynj.m mVar5 = new ynj.m();
        dfj.l lVar2 = (dfj.l) bVar.q0.get();
        dm0.d dVarD = bVar.f4144m.d();
        vc.s.j(dVarD);
        dfj.u uVar = new dfj.u(v2Var2, a1Var, s3Var2, k0Var2, mVar5, lVar2, dVarD);
        kdh.b bVarD = ((n86.d) bVar2.f4152q).d();
        dfj.c0 c0Var = (dfj.c0) bVar2.f4124b1.get();
        chj.d dVar2 = (chj.d) l3Var.d.get();
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a aVar3 = new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a();
        z80.b bVarS = bVar.f4150p.s();
        vc.s.j(bVarS);
        cnj.a aVar4 = new cnj.a(bVarS);
        wli.x xVarD = ((s41.a) bVar2.f4164w).d();
        dfj.z0 z0Var = (dfj.z0) bVar2.G.get();
        dm0.d dVarD2 = bVar2.f4144m.d();
        vc.s.j(dVarD2);
        return new com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a(bVar5, esimSubscriptionDetailsScreenContract$InputData, nVar, wVar, s3Var, k0Var, cVar, mVar3, fVar, aVarB4, bVar6, mVar4, jVar2, v2Var, uVar, bVarD, c0Var, dVar2, aVar3, aVar4, xVarD, z0Var, dVarD2);
    }

    private final Object d() {
        l3 l3Var = (l3) this.e;
        b bVar = l3Var.f4335c;
        b bVar2 = (b) this.f4198b;
        int i = this.f4199c;
        if (i == 0) {
            oej.c cVarB = bVar2.f4122b.b();
            vc.s.j(cVarB);
            return new chj.g(cVarB, (ynj.l) ((m) this.d).f.get(), new EsimInstallationDialogBuilder(), new r10.w((dfj.v2) bVar.R.get(), bVar.f4156s.b()));
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            gej.a aVar = (gej.a) bVar2.K.get();
            unj.e eVar = new unj.e(new ynj.e());
            bnj.h hVar = new bnj.h((gej.a) bVar.K.get(), b.b(), new xjj.h((gej.a) bVar.K.get()));
            fhj.d dVar = new fhj.d();
            bnj.s sVar = new bnj.s();
            fhj.b bVar3 = new fhj.b(new ynj.e());
            zjh.j jVar = new zjh.j((cej.b) bVar.X.get(), new ynj.m());
            bnj.r rVar = new bnj.r();
            ynj.m mVar = new ynj.m();
            nd.o oVar = new nd.o(new vnj.a());
            bnj.g gVar = new bnj.g();
            gte.a aVarB = bVar.f4120a.b();
            vc.s.j(aVarB);
            bnj.l lVar = new bnj.l(mVar, oVar, gVar, aVarB, new bnj.d(bVar.c()));
            cej.b bVar4 = (cej.b) bVar.X.get();
            ynj.m mVar2 = new ynj.m();
            xjj.a aVar2 = new xjj.a();
            tsk.t tVar = new tsk.t(bVar.f());
            gte.a aVarB2 = bVar.f4120a.b();
            vc.s.j(aVarB2);
            bnj.q qVar = new bnj.q(bVar4, mVar2, aVar2, tVar, aVarB2);
            gte.a aVarB3 = bVar.f4120a.b();
            vc.s.j(aVarB3);
            return new zmj.r0(aVar, eVar, hVar, dVar, sVar, bVar3, jVar, rVar, lVar, qVar, new bnj.f(aVarB3));
        }
        i90.b bVar5 = new i90.b();
        EsimSubscriptionDetailsScreenContract$InputData esimSubscriptionDetailsScreenContract$InputData = l3Var.f4334b;
        cli.n nVar = (cli.n) l3Var.e.get();
        dfj.w wVar = (dfj.w) bVar2.f4135h0.get();
        dfj.s3 s3Var = (dfj.s3) bVar2.f4140k0.get();
        dfj.k0 k0Var = (dfj.k0) bVar2.Y.get();
        unj.c cVar = new unj.c(new ynj.e());
        bnj.m mVar3 = new bnj.m();
        bej.f fVar = (bej.f) bVar2.l0.get();
        gte.a aVarB4 = bVar2.f4120a.b();
        vc.s.j(aVarB4);
        cej.b bVar6 = (cej.b) bVar2.X.get();
        bej.m mVar4 = (bej.m) bVar2.F0.get();
        unj.j jVar2 = new unj.j();
        dfj.v2 v2Var = (dfj.v2) bVar2.R.get();
        dfj.v2 v2Var2 = (dfj.v2) bVar.R.get();
        nfj.a1 a1Var = (nfj.a1) bVar.Q.get();
        dfj.s3 s3Var2 = (dfj.s3) bVar.f4140k0.get();
        dfj.k0 k0Var2 = (dfj.k0) bVar.Y.get();
        ynj.m mVar5 = new ynj.m();
        dfj.l lVar2 = (dfj.l) bVar.q0.get();
        dm0.d dVarD = bVar.f4144m.d();
        vc.s.j(dVarD);
        dfj.u uVar = new dfj.u(v2Var2, a1Var, s3Var2, k0Var2, mVar5, lVar2, dVarD);
        kdh.b bVarD = ((n86.d) bVar2.f4152q).d();
        dfj.c0 c0Var = (dfj.c0) bVar2.f4124b1.get();
        chj.d dVar2 = (chj.d) l3Var.d.get();
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a aVar3 = new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a();
        z80.b bVarS = bVar.f4150p.s();
        vc.s.j(bVarS);
        cnj.a aVar4 = new cnj.a(bVarS);
        wli.x xVarD = ((s41.a) bVar2.f4164w).d();
        dfj.z0 z0Var = (dfj.z0) bVar2.G.get();
        dm0.d dVarD2 = bVar2.f4144m.d();
        vc.s.j(dVarD2);
        return new com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a(bVar5, esimSubscriptionDetailsScreenContract$InputData, nVar, wVar, s3Var, k0Var, cVar, mVar3, fVar, aVarB4, bVar6, mVar4, jVar2, v2Var, uVar, bVarD, c0Var, dVar2, aVar3, aVar4, xVarD, z0Var, dVarD2);
    }

    private final Object e() {
        n3 n3Var = (n3) this.e;
        b bVar = (b) this.f4198b;
        int i = this.f4199c;
        if (i == 0) {
            oej.c cVarB = bVar.f4122b.b();
            vc.s.j(cVarB);
            ynj.l lVar = (ynj.l) ((t0) this.d).f.get();
            EsimInstallationDialogBuilder esimInstallationDialogBuilder = new EsimInstallationDialogBuilder();
            b bVar2 = n3Var.f4365c;
            return new chj.g(cVarB, lVar, esimInstallationDialogBuilder, new r10.w((dfj.v2) bVar2.R.get(), bVar2.f4156s.b()));
        }
        if (i != 1) {
            if (i == 2) {
                return new nnj.u();
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) n3Var.e.get();
        EsimRefundReasonScreenContract$InputData esimRefundReasonScreenContract$InputData = n3Var.f4364b;
        ang.f fVarE = bVar.f4142l.e();
        dfj.y yVar = (dfj.y) bVar.m1.get();
        dfj.s3 s3Var = (dfj.s3) bVar.f4140k0.get();
        dfj.k0 k0Var = (dfj.k0) bVar.Y.get();
        chj.d dVar = (chj.d) n3Var.d.get();
        dfj.l lVar2 = (dfj.l) bVar.q0.get();
        gte.a aVarB = bVar.f4120a.b();
        vc.s.j(aVarB);
        return new com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c(nVar, esimRefundReasonScreenContract$InputData, fVarE, yVar, s3Var, k0Var, dVar, lVar2, aVarB);
    }

    private final Object f() {
        b6b.i0 i0Var = (b6b.i0) this.e;
        b6b.o oVar = i0Var.f12620b;
        int i = this.f4199c;
        if (i != 0) {
            if (i == 1) {
                return new kxk.o(new y7b.a(new c7b.a(oVar.d.g(), 0), new i7b.g(new c7b.a(oVar.d.g(), 0))), i0Var.f12619a);
            }
            throw new AssertionError(i);
        }
        CobrandedCardsValueReminderScreenContract$InputData cobrandedCardsValueReminderScreenContract$InputData = i0Var.f12619a;
        cli.n nVar = (cli.n) i0Var.d.get();
        c6b.b bVar = (c6b.b) ((b6b.o) this.f4198b).f12651b.P.get();
        vc.s.j(bVar);
        return new com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c(cobrandedCardsValueReminderScreenContract$InputData, nVar, bVar, ((b6b.w) this.d).s(), new w7b.a());
    }

    private final Object g() {
        blb.a aVar = (blb.a) this.d;
        blb.e eVar = (blb.e) this.f4198b;
        blb.b bVar = (blb.b) this.e;
        int i = this.f4199c;
        if (i == 0) {
            Object extension = (hlb.j) bVar.f16494a.get();
            jlb.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i != 1) {
            if (i == 2) {
                return new ilb.d(aVar.f16491a, (hlb.j) bVar.f16494a.get(), new ilb.c(new klb.a(), new klb.b(), 0));
            }
            if (i == 3) {
                return new llb.f(aVar.f16491a, (hlb.j) bVar.f16494a.get(), new ilb.c(new klb.a(), new klb.b(), 1));
            }
            throw new AssertionError(i);
        }
        ccd.a aVar2 = (ccd.a) ((xbd.b) eVar.f16504c).o.get();
        vc.s.j(aVar2);
        f80.a aVarX = eVar.f16506h.x();
        vc.s.j(aVarX);
        return new hlb.d(aVar2, aVarX, ((s41.a) eVar.f16507j).d(), eVar.h());
    }

    private final Object h() {
        bt6.b bVar = (bt6.b) this.f4198b;
        bt6.k kVar = (bt6.k) this.e;
        int i = this.f4199c;
        if (i == 0) {
            Object extension = (ex6.b) kVar.f18358b.get();
            a37.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i == 1) {
            ex6.d extension2 = ((bt6.j) this.d).b();
            a37.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension2, "extension");
            return extension2;
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        b37.c cVar = new b37.c();
        TaxHubAssessmentScreenContract$InputData taxHubAssessmentScreenContract$InputData = kVar.f18357a;
        ex6.b bVar2 = (ex6.b) kVar.f18358b.get();
        zjh.f taxHubAuthorityInteractor = bVar.b();
        r10.d taxHubCalendarEventsInteractor = bVar.c();
        Intrinsics.checkNotNullParameter(taxHubAuthorityInteractor, "taxHubAuthorityInteractor");
        Intrinsics.checkNotNullParameter(taxHubCalendarEventsInteractor, "taxHubCalendarEventsInteractor");
        r10.a aVar = new r10.a();
        aVar.f250811a = taxHubAuthorityInteractor;
        aVar.f250812b = taxHubCalendarEventsInteractor;
        r10.d dVarC = bVar.c();
        ang.f fVarE = bVar.f18301m.e();
        x47.a analyticsContextProvider = new x47.a();
        b37.b taxHubAssessmentClauseFactory = new b37.b();
        Intrinsics.checkNotNullParameter(analyticsContextProvider, "analyticsContextProvider");
        Intrinsics.checkNotNullParameter(taxHubAssessmentClauseFactory, "taxHubAssessmentClauseFactory");
        return new com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f(cVar, taxHubAssessmentScreenContract$InputData, bVar2, aVar, dVarC, fVarE, new z27.a0());
    }

    private final Object i() {
        bt6.b bVar = (bt6.b) this.f4198b;
        bt6.a0 a0Var = (bt6.a0) this.e;
        int i = this.f4199c;
        if (i == 0) {
            Object extension = (u47.g) a0Var.d.get();
            t47.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i != 1) {
            if (i == 2) {
                return new com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a(new v47.a(), (u47.g) a0Var.d.get(), bVar.f18301m.e(), a0Var.f18291a, new s47.u(new w47.b(a0Var.f18292b), a0Var.f18293c));
            }
            throw new AssertionError(i);
        }
        TaxHubTransactionExportReviewScreenContract$InputData inputData = a0Var.f18291a;
        r10.d taxHubCalendarEventsInteractor = bVar.c();
        gr6.q taxHubTransactionExportInteractor = (gr6.q) ((bt6.y) this.d).e.get();
        t47.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxHubCalendarEventsInteractor, "taxHubCalendarEventsInteractor");
        Intrinsics.checkNotNullParameter(taxHubTransactionExportInteractor, "taxHubTransactionExportInteractor");
        if (inputData instanceof TaxHubTransactionExportReviewScreenContract$InputData.Inbound) {
            return new u47.a((TaxHubTransactionExportReviewScreenContract$InputData.Inbound) inputData, taxHubCalendarEventsInteractor, taxHubTransactionExportInteractor);
        }
        if (inputData instanceof TaxHubTransactionExportReviewScreenContract$InputData.Outbound) {
            return new u47.c((TaxHubTransactionExportReviewScreenContract$InputData.Outbound) inputData, taxHubTransactionExportInteractor);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object j() {
        c43.h hVar = (c43.h) this.f4198b;
        c43.o oVar = (c43.o) this.e;
        int i = this.f4199c;
        if (i == 0) {
            return kxa.j.k((j60.a) oVar.f.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) oVar.d.get(), (rp0.m) oVar.e.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        j43.j jVar = new j43.j((mae.o) oVar.b());
        m93.g gVarI = oVar.f21067c.d.i();
        vc.s.j(gVarI);
        j43.i iVar = new j43.i(jVar, gVarI);
        LinkCardDetailsReviewScreenContract$InputData linkCardDetailsReviewScreenContract$InputData = oVar.f21066b;
        l93.f fVarJ = hVar.d.j();
        vc.s.j(fVarJ);
        v43.a aVar = new v43.a((mae.o) oVar.b());
        g6e.d dVarB = hVar.f.b();
        vc.s.j(dVarB);
        rp0.g1 g1Var = (rp0.g1) ((c43.l) this.d).f.get();
        al4.b bVarN = hVar.f21021m.n();
        vc.s.j(bVarN);
        return new com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a(iVar, linkCardDetailsReviewScreenContract$InputData, fVarJ, aVar, dVarB, g1Var, bVarN);
    }

    private final Object k() {
        c43.h hVar = (c43.h) this.f4198b;
        c43.o oVar = (c43.o) this.e;
        int i = this.f4199c;
        if (i == 0) {
            return kxa.j.k((j60.a) oVar.f.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) oVar.d.get(), (rp0.m) oVar.e.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        j43.j jVar = new j43.j((mae.o) oVar.b());
        m93.g gVarI = oVar.f21067c.d.i();
        vc.s.j(gVarI);
        j43.i iVar = new j43.i(jVar, gVarI);
        LinkCardDetailsReviewScreenContract$InputData linkCardDetailsReviewScreenContract$InputData = oVar.f21066b;
        l93.f fVarJ = hVar.d.j();
        vc.s.j(fVarJ);
        v43.a aVar = new v43.a((mae.o) oVar.b());
        g6e.d dVarB = hVar.f.b();
        vc.s.j(dVarB);
        rp0.g1 g1Var = (rp0.g1) ((c43.j) this.d).f.get();
        al4.b bVarN = hVar.f21021m.n();
        vc.s.j(bVarN);
        return new com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a(iVar, linkCardDetailsReviewScreenContract$InputData, fVarJ, aVar, dVarB, g1Var, bVarN);
    }

    private final Object l() {
        cf7.e eVar = (cf7.e) this.e;
        cf7.b bVar = eVar.f23606a;
        cf7.f fVar = eVar.f23607b;
        int i = this.f4199c;
        if (i == 0) {
            return kxa.j.j((j60.a) eVar.e.get());
        }
        if (i == 1) {
            return v1.c.r((com.revolut.kompot.navigable.a) eVar.f23608c.get(), (rp0.m) eVar.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            cli.n nVar = (cli.n) eVar.f23609g.get();
            r10.q qVarA = ((cf7.b) this.f4198b).a();
            ge3.e eVarD = bVar.f23579m.d();
            vc.s.j(eVarD);
            return new mg7.u(nVar, qVarA, new o7.d(eVarD), (j60.a) eVar.f23610h.get(), new mg7.w(bVar.f23577j.g()), new sf7.a(), ((cf7.f) this.d).f23611a);
        }
        if (i == 4) {
            thf.c cVarC = bVar.k.c();
            vc.s.j(cVarC);
            return new bof.r(new og7.b(cVarC, new og7.h(fVar.f23611a), new kl.t1(fVar.f23611a)), new og7.d(new og7.h(fVar.f23611a), new kl.t1(fVar.f23611a)), new og7.f(new og7.h(fVar.f23611a), new kl.t1(fVar.f23611a)));
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        j60.a extension = (j60.a) eVar.e.get();
        ng7.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        vc.s.k(extension);
        return extension;
    }

    private final Object m() {
        cu1.k kVar = ((cu1.o) this.d).f108769b;
        cu1.l lVar = (cu1.l) this.e;
        cu1.k kVar2 = (cu1.k) this.f4198b;
        p12.l lVar2 = kVar2.f108748m;
        int i = this.f4199c;
        if (i == 0) {
            ry9.d extension = (ry9.d) lVar.f108760c.get();
            iu1.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            vc.s.k(extension);
            return extension;
        }
        if (i == 1) {
            vy9.g factory = kVar2.f108749n.b();
            vc.s.j(factory);
            iu1.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory.a();
        }
        if (i != 2) {
            if (i == 3) {
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) lVar.e.get();
                iu1.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return rp0.x0.a(rp0.g1.Companion, controller.D2());
            }
            if (i != 4) {
                if (i == 5) {
                    return new my0.b();
                }
                throw new AssertionError(i);
            }
            my0.b composer = (my0.b) lVar.f108761g.get();
            Intrinsics.checkNotNullParameter(composer, "composer");
            return new my0.e(composer);
        }
        BlikCodeScreenContract$InputData blikCodeScreenContract$InputData = lVar.f108758a;
        eu1.a aVar = (eu1.a) kVar2.z.get();
        h12.a aVarD = lVar2.d();
        vc.s.j(aVarD);
        c70.a aVarZ = kVar2.o.z();
        vc.s.j(aVarZ);
        df0.b bVarA = kVar2.f108750p.a();
        vc.s.j(bVarA);
        ju1.a aVar2 = (ju1.a) kVar2.v.get();
        fnc.s sVar = new fnc.s((c12.f) kVar.f108755w.get());
        fmc.z zVar = new fmc.z((c12.z) kVar.f108756x.get());
        lx1.d dVarB = ((ey1.e) kVar2.d).b();
        vc.s.j(dVarB);
        wt1.b bVar = (wt1.b) kVar2.f108743c.d.get();
        vc.s.j(bVar);
        h12.h hVarF = lVar2.f();
        vc.s.j(hVarF);
        uw1.c cVarD = ((lz1.m) kVar2.f108745h).d();
        vc.s.j(cVarD);
        ang.f fVarE = kVar2.f108751q.e();
        rp0.g1 g1Var = (rp0.g1) lVar.f.get();
        v02.c cVarC = lVar2.c();
        vc.s.j(cVarC);
        ry9.d dVar = (ry9.d) lVar.f108760c.get();
        my0.e eVar = (my0.e) lVar.f108762h.get();
        cu1.k kVar3 = lVar.f108759b;
        p12.l lVar3 = kVar3.f108748m;
        a12.j jVarE = lVar3.e();
        vc.s.j(jVarE);
        a12.e eVarL = lVar3.l();
        vc.s.j(eVarL);
        a12.o oVarM = lVar3.m();
        vc.s.j(oVarM);
        ty9.b bVarC = kVar3.f108749n.c();
        vc.s.j(bVarC);
        z80.b bVarS = kVar3.o.s();
        vc.s.j(bVarS);
        return new hu1.e0(blikCodeScreenContract$InputData, aVar, aVarD, aVarZ, bVarA, aVar2, sVar, zVar, dVarB, bVar, hVarF, cVarD, fVarE, g1Var, cVarC, dVar, new hu1.j0(eVar, jVarE, eVarL, oVarM, bVarC, bVarS));
    }

    private final Object n() {
        db1.a aVar = (db1.a) this.e;
        int i = this.f4199c;
        if (i == 0) {
            return kxa.j.l((j60.a) aVar.d.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) aVar.f112641b.get(), (rp0.m) aVar.f112642c.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            return new hb1.h((jki.p) aVar.f.get(), aVar.f112640a);
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        wa1.a aVarA = ((db1.b) this.f4198b).f112644a.a();
        vc.s.j(aVarA);
        return new hb1.i(aVarA, (fb1.d) ((db1.c) this.d).d.get());
    }

    private final Object o() {
        db1.c cVar = (db1.c) this.d;
        db1.e eVar = (db1.e) this.e;
        lfc.b bVar = ((db1.b) this.f4198b).f112644a;
        int i = this.f4199c;
        if (i == 0) {
            jki.p pVar = (jki.p) eVar.f112655c.get();
            CheckoutScreenContract$InputData checkoutScreenContract$InputData = eVar.f112653a;
            xa1.a aVar = (xa1.a) bVar.f194851j.get();
            vc.s.j(aVar);
            return new jb1.x(pVar, checkoutScreenContract$InputData, aVar, new i90.b(), (nb1.a) cVar.e.get());
        }
        if (i == 1) {
            jb1.a aVar2 = (jb1.a) eVar.f112654b.get();
            wa1.a aVarA = bVar.a();
            vc.s.j(aVarA);
            return new anl.j(aVar2, aVarA);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        wa1.a aVarA2 = bVar.a();
        vc.s.j(aVarA2);
        return new jb1.b(aVarA2, (fb1.d) cVar.d.get());
    }

    private final Object p() {
        dd9.f fVar = (dd9.f) this.d;
        dd9.e eVar = (dd9.e) this.f4198b;
        ore.b bVar = eVar.k;
        dd9.d dVar = (dd9.d) this.e;
        int i = this.f4199c;
        if (i != 0) {
            if (i == 1) {
                return new oc9.e0(new oc9.d0(new m99.a(), new pc9.a()), dVar.f113127a, (oc9.m) fVar.e.get());
            }
            throw new AssertionError(i);
        }
        pre.c cVarA = bVar.a();
        vc.s.j(cVarA);
        mre.c cVarB = bVar.b();
        vc.s.j(cVarB);
        return new oc9.b0(cVarA, cVarB, (o99.a) eVar.u.get(), dVar.f113127a, (oc9.m) fVar.e.get(), (oc9.e0) dVar.f113128b.get());
    }

    private final Object q() {
        dw3.c1 c1Var = (dw3.c1) this.f4198b;
        je6.g gVar = c1Var.R;
        dw3.o oVar = (dw3.o) this.e;
        int i = this.f4199c;
        if (i == 0) {
            return kxa.j.l((j60.a) oVar.e.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) oVar.f119377c.get(), (rp0.m) oVar.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i == 4) {
                return new ty4.q((vy4.b) oVar.f119378g.get());
            }
            if (i == 5) {
                return new vy4.d(new vy4.a());
            }
            throw new AssertionError(i);
        }
        wli.x xVarD = ((s41.a) c1Var.f118485x).d();
        DirectDebitAccountSelectionScreenContract$InputData directDebitAccountSelectionScreenContract$InputData = oVar.f119376b;
        f01.c cVarG = c1Var.f118482w.g();
        cz4.b bVar = (cz4.b) ((dw3.h2) this.d).v.get();
        xy4.b bVar2 = new xy4.b();
        je6.h hVarC = ((xf6.t) gVar).c();
        vc.s.j(hVarC);
        t70.b bVarG = c1Var.f118443h.g();
        vc.s.j(bVarG);
        wsg.n nVarB = c1Var.f118452l.b();
        z71.a aVarF = ((c21.b) c1Var.f).f();
        vc.s.j(aVarF);
        dw3.c1 c1Var2 = (dw3.c1) oVar.f119380j;
        wsg.n nVarB2 = c1Var2.f118452l.b();
        oe6.a aVarA = c1Var2.S.a();
        vc.s.j(aVarA);
        je6.h hVarC2 = ((xf6.t) c1Var2.R).c();
        vc.s.j(hVarC2);
        cz4.a aVar = new cz4.a(nVarB2, aVarA, hVarC2);
        j60.a aVar2 = (j60.a) oVar.e.get();
        com.revolut.feature.external_accounts.api.navigation.a aVarB = ((xf6.t) gVar).b();
        vc.s.j(aVarB);
        gte.a aVarB2 = c1Var.f118423b.b();
        vc.s.j(aVarB2);
        return new ty4.o(xVarD, directDebitAccountSelectionScreenContract$InputData, cVarG, bVar, bVar2, hVarC, bVarG, nVarB, aVarF, aVar, aVar2, aVarB, aVarB2, (jki.p) oVar.f119379h.get());
    }

    private final Object r() {
        dw3.c1 c1Var = (dw3.c1) this.f4198b;
        dw3.p pVar = (dw3.p) this.e;
        AddDebtScreenContract$InputData addDebtScreenContract$InputData = pVar.f119471a;
        int i = this.f4199c;
        if (i == 0) {
            return e5f.b.d((com.revolut.kompot.navigable.a) pVar.f119473c.get(), (c84.b) pVar.e.get(), (PluginFlowContract$Input) ((s4) this.d).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            return new r84.j(addDebtScreenContract$InputData, (ww3.c) c1Var.f118435e1.get(), (w80.b) pVar.f119475h.get(), (jki.p) pVar.i.get());
        }
        if (i != 3) {
            if (i == 4) {
                return new r84.l(addDebtScreenContract$InputData);
            }
            throw new AssertionError(i);
        }
        w80.b amountFormatter = c1Var.f118443h.j();
        vc.s.j(amountFormatter);
        s84.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        return amountFormatter;
    }

    private final Object s() {
        dw3.s sVar = (dw3.s) this.e;
        int i = this.f4199c;
        if (i == 0) {
            return e5f.b.e((com.revolut.kompot.navigable.a) sVar.f119705b.get(), (c84.b) sVar.d.get(), (PluginFlowContract$Input) ((g4) this.d).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            return new he4.s(((dw3.c1) this.f4198b).k.e(), (cli.n) sVar.f119707g.get());
        }
        if (i == 3) {
            return new he4.t(sVar.f119704a, new q74.b());
        }
        throw new AssertionError(i);
    }

    private final Object t() {
        dw3.z zVar = (dw3.z) this.e;
        int i = this.f4199c;
        if (i == 0) {
            return e5f.b.d((com.revolut.kompot.navigable.a) zVar.f120246b.get(), (c84.b) zVar.d.get(), (PluginFlowContract$Input) ((dw3.a0) this.d).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            return new a64.j((jki.p) zVar.f120248g.get(), zVar.f120245a);
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        n8b.b bVarB = ((dw3.c1) this.f4198b).C.b();
        vc.s.j(bVarB);
        return new a64.l(bVarB);
    }

    @Override // phm.a
    public final Object get() {
        Object gVar;
        switch (this.f4197a) {
            case 0:
                b bVar = (b) this.f4198b;
                e eVar = (e) this.e;
                b bVar2 = eVar.f4213b;
                int i = this.f4199c;
                if (i == 0) {
                    Object extension = (a6c.f) eVar.f4214c.get();
                    dhj.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    yji.n nVar = (yji.n) extension;
                    vc.s.k(nVar);
                    return nVar;
                }
                if (i == 1) {
                    o8c.a factory = bVar.k.a();
                    vc.s.j(factory);
                    dhj.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    return factory.a();
                }
                if (i == 2) {
                    oej.c cVarB = bVar.f4122b.b();
                    vc.s.j(cVarB);
                    return new chj.g(cVarB, (ynj.l) ((c) this.d).f.get(), new EsimInstallationDialogBuilder(), new r10.w((dfj.v2) bVar2.R.get(), bVar2.f4156s.b()));
                }
                if (i == 3) {
                    sf0.h hVarB = bVar.f4145n.b();
                    vc.s.j(hVarB);
                    gej.a aVar = (gej.a) bVar2.K.get();
                    ynj.e eVar2 = new ynj.e();
                    cej.b bVar3 = (cej.b) bVar2.X.get();
                    z80.b bVarS = bVar2.f4150p.s();
                    vc.s.j(bVarS);
                    com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a aVar2 = new com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a(aVar, eVar2, new a61.a(bVar3, bVarS), new zjh.i((cej.b) bVar2.X.get()), new bhj.f(), new vnj.a());
                    dfj.t3 t3Var = (dfj.t3) bVar.S0.get();
                    ugc.a aVar3 = new ugc.a(b.b());
                    pjj.b bVar4 = new pjj.b();
                    nfj.a2 a2Var = (nfj.a2) bVar2.f0.get();
                    a6c.f fVar = (a6c.f) eVar.f4214c.get();
                    gte.a aVarB = bVar2.f4120a.b();
                    vc.s.j(aVarB);
                    return new chj.u0(hVarB, aVar2, t3Var, aVar3, bVar4, new chj.q(a2Var, fVar, aVarB));
                }
                if (i == 4) {
                    i90.b bVar5 = new i90.b();
                    EsimCheckoutScreenContract$InputData esimCheckoutScreenContract$InputData = eVar.f4212a;
                    cli.n nVar2 = (cli.n) eVar.f4215g.get();
                    dfj.w wVar = (dfj.w) bVar.f4135h0.get();
                    bej.o oVar = (bej.o) bVar.f4131f1.get();
                    dfj.s3 s3Var = (dfj.s3) bVar.f4140k0.get();
                    dfj.l lVar = (dfj.l) bVar.q0.get();
                    unj.c cVar = new unj.c(new ynj.e());
                    dfj.k0 k0Var = (dfj.k0) bVar.Y.get();
                    chj.d dVar = (chj.d) eVar.e.get();
                    chj.c0 c0Var = (chj.c0) eVar.f.get();
                    wli.x xVarD = ((s41.a) bVar.f4164w).d();
                    gte.a aVarB2 = bVar.f4120a.b();
                    vc.s.j(aVarB2);
                    nyb.k kVarC = bVar.f4166x.c();
                    vc.s.j(kVarC);
                    bej.b bVar6 = (bej.b) bVar.U.get();
                    bej.m mVar = (bej.m) bVar.F0.get();
                    unj.j jVar = new unj.j();
                    l61.a aVarB3 = bVar.f4142l.b();
                    vc.s.j(aVarB3);
                    return new com.revolut.retail.feature.esim.impl.ui.screens.checkout.a(bVar5, esimCheckoutScreenContract$InputData, nVar2, wVar, oVar, s3Var, lVar, cVar, k0Var, dVar, c0Var, xVarD, aVarB2, kVarC, bVar6, mVar, jVar, aVarB3, new ugc.a(bVar2.f4142l.d()), (dfj.v2) bVar.R.get(), new ugc.a(b.b()));
                }
                if (i != 5) {
                    throw new AssertionError(i);
                }
                EsimCheckoutScreenContract$InputData esimCheckoutScreenContract$InputData2 = eVar.f4212a;
                gej.a aVar4 = (gej.a) bVar.K.get();
                unj.e eVar3 = new unj.e(new ynj.e());
                gte.a aVarB4 = bVar2.f4120a.b();
                vc.s.j(aVarB4);
                dec.r rVar = new dec.r();
                dec.g gVar2 = new dec.g();
                dec.a aVar5 = new dec.a();
                l80.e eVarH = bVar2.f4150p.h();
                vc.s.j(eVarH);
                fhj.g gVar3 = new fhj.g(aVarB4, new dec.q(rVar, gVar2, aVar5, eVarH));
                fhj.d dVar2 = new fhj.d();
                fhj.b bVar7 = new fhj.b(new ynj.e());
                gte.a aVarB5 = bVar2.f4120a.b();
                vc.s.j(aVarB5);
                fhj.a aVar6 = new fhj.a(aVarB5);
                com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a aVar7 = new com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a(new ghj.a(), b.b());
                fhj.m mVar2 = new fhj.m();
                gte.a aVarB6 = bVar2.f4120a.b();
                vc.s.j(aVarB6);
                fhj.j jVar2 = new fhj.j(aVarB6);
                n8b.a aVarA = bVar2.A.a();
                vc.s.j(aVarA);
                return new zgj.l0(esimCheckoutScreenContract$InputData2, aVar4, eVar3, gVar3, dVar2, bVar7, aVar6, aVar7, mVar2, jVar2, new fhj.e(aVarA), new fhj.h(), new fhj.c());
            case 1:
                f fVar2 = (f) this.d;
                b bVar8 = (b) this.f4198b;
                g gVar4 = (g) this.e;
                b bVar9 = gVar4.f4248a;
                int i2 = this.f4199c;
                if (i2 == 0) {
                    oej.c cVarB2 = bVar8.f4122b.b();
                    vc.s.j(cVarB2);
                    return new chj.g(cVarB2, (ynj.l) fVar2.f.get(), new EsimInstallationDialogBuilder(), new r10.w((dfj.v2) bVar9.R.get(), bVar9.f4156s.b()));
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new bof.r(new tnj.d((tnj.a) gVar4.f4250c.get()), new tnj.e((tnj.a) gVar4.f4250c.get()), new tnj.c((tnj.a) gVar4.f4250c.get(), new vnj.a()));
                    }
                    if (i2 == 3) {
                        return new tnj.a();
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar3 = (cli.n) gVar4.d.get();
                dfj.v2 v2Var = (dfj.v2) bVar9.R.get();
                nfj.a1 a1Var = (nfj.a1) bVar9.Q.get();
                dfj.s3 s3Var2 = (dfj.s3) bVar9.f4140k0.get();
                dfj.k0 k0Var2 = (dfj.k0) bVar9.Y.get();
                ynj.m mVar3 = new ynj.m();
                dfj.l lVar2 = (dfj.l) bVar9.q0.get();
                dm0.d dVarD = bVar9.f4144m.d();
                vc.s.j(dVarD);
                dfj.u uVar = new dfj.u(v2Var, a1Var, s3Var2, k0Var2, mVar3, lVar2, dVarD);
                unj.i iVar = new unj.i((tnj.a) gVar4.f4250c.get());
                ehj.d dVar3 = new ehj.d();
                chj.d dVar4 = (chj.d) gVar4.f4249b.get();
                gte.a aVarB7 = bVar8.f4120a.b();
                vc.s.j(aVarB7);
                return new com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a(nVar3, uVar, iVar, dVar3, dVar4, aVarB7, fVar2.f4233a);
            case 2:
                b bVar10 = (b) this.f4198b;
                p7c.r rVar2 = bVar10.k;
                r rVar3 = (r) this.e;
                b bVar11 = rVar3.f4412b;
                int i3 = this.f4199c;
                if (i3 == 0) {
                    Object extension2 = (a6c.f) rVar3.f4413c.get();
                    dhj.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    yji.n nVar4 = (yji.n) extension2;
                    vc.s.k(nVar4);
                    return nVar4;
                }
                if (i3 == 1) {
                    o8c.a factory2 = rVar2.a();
                    vc.s.j(factory2);
                    dhj.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                    return factory2.a();
                }
                if (i3 == 2) {
                    oej.c cVarB3 = bVar10.f4122b.b();
                    vc.s.j(cVarB3);
                    return new chj.g(cVarB3, (ynj.l) ((q) this.d).f.get(), new EsimInstallationDialogBuilder(), new r10.w((dfj.v2) bVar11.R.get(), bVar11.f4156s.b()));
                }
                if (i3 == 3) {
                    sf0.h hVarB2 = bVar10.f4145n.b();
                    vc.s.j(hVarB2);
                    gej.a aVar8 = (gej.a) bVar11.K.get();
                    ynj.e eVar4 = new ynj.e();
                    cej.b bVar12 = (cej.b) bVar11.X.get();
                    z80.b bVarS2 = bVar11.f4150p.s();
                    vc.s.j(bVarS2);
                    com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a aVar9 = new com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a(aVar8, eVar4, new a61.a(bVar12, bVarS2), new zjh.i((cej.b) bVar11.X.get()), new bhj.f(), new vnj.a());
                    dfj.t3 t3Var2 = (dfj.t3) bVar10.S0.get();
                    ugc.a aVar10 = new ugc.a(b.b());
                    pjj.b bVar13 = new pjj.b();
                    nfj.a2 a2Var2 = (nfj.a2) bVar11.f0.get();
                    a6c.f fVar3 = (a6c.f) rVar3.f4413c.get();
                    gte.a aVarB8 = bVar11.f4120a.b();
                    vc.s.j(aVarB8);
                    return new chj.u0(hVarB2, aVar9, t3Var2, aVar10, bVar13, new chj.q(a2Var2, fVar3, aVarB8));
                }
                if (i3 == 4) {
                    cli.n nVar5 = (cli.n) rVar3.f4414g.get();
                    i90.b bVar14 = new i90.b();
                    EsimMobilePlanCheckoutScreenContract$InputData esimMobilePlanCheckoutScreenContract$InputData = rVar3.f4411a;
                    q7c.g gVarE = rVar2.e();
                    dfj.w wVar2 = (dfj.w) bVar10.f4135h0.get();
                    bej.d dVar5 = (bej.d) bVar10.f4133g1.get();
                    wli.x xVarD2 = ((s41.a) bVar10.f4164w).d();
                    nyb.k kVarC2 = bVar10.f4166x.c();
                    vc.s.j(kVarC2);
                    bej.m mVar4 = (bej.m) bVar10.F0.get();
                    unj.j jVar3 = new unj.j();
                    chj.d dVar6 = (chj.d) rVar3.e.get();
                    chj.c0 c0Var2 = (chj.c0) rVar3.f.get();
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a aVar11 = new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a();
                    dfj.s3 s3Var3 = (dfj.s3) bVar10.f4140k0.get();
                    gte.a aVarB9 = bVar10.f4120a.b();
                    vc.s.j(aVarB9);
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a(nVar5, bVar14, esimMobilePlanCheckoutScreenContract$InputData, gVarE, wVar2, dVar5, xVarD2, kVarC2, mVar4, jVar3, dVar6, c0Var2, aVar11, s3Var3, aVarB9, new qjj.o(), new ynj.b(), new ugc.a(b.b()));
                }
                if (i3 != 5) {
                    throw new AssertionError(i3);
                }
                EsimMobilePlanCheckoutScreenContract$InputData esimMobilePlanCheckoutScreenContract$InputData2 = rVar3.f4411a;
                dec.r rVar4 = new dec.r();
                dec.g gVar5 = new dec.g();
                dec.a aVar12 = new dec.a();
                l80.e eVarH2 = bVar11.f4150p.h();
                vc.s.j(eVarH2);
                qjj.f fVar4 = new qjj.f(new dec.q(rVar4, gVar5, aVar12, eVarH2));
                ynj.b checkoutPlanChangeResolver = new ynj.b();
                fhj.h refundDueItemMapper = new fhj.h();
                Intrinsics.checkNotNullParameter(checkoutPlanChangeResolver, "checkoutPlanChangeResolver");
                Intrinsics.checkNotNullParameter(refundDueItemMapper, "refundDueItemMapper");
                qjj.i iVar2 = new qjj.i();
                unj.e eVar5 = new unj.e(new ynj.e());
                qjj.n finalPriceMapper = new qjj.n();
                ynj.b checkoutPlanChangeResolver2 = new ynj.b();
                Intrinsics.checkNotNullParameter(finalPriceMapper, "finalPriceMapper");
                Intrinsics.checkNotNullParameter(checkoutPlanChangeResolver2, "checkoutPlanChangeResolver");
                qjj.b bVar15 = new qjj.b();
                com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a aVar13 = new com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a(new ghj.a(), b.b());
                qjj.a aVar14 = new qjj.a((gej.a) bVar11.K.get(), bVar11.f());
                EsimMobilePlanCheckoutScreenContract$InputData esimMobilePlanCheckoutScreenContract$InputData3 = rVar3.f4411a;
                z80.b bVarS3 = bVar11.f4150p.s();
                vc.s.j(bVarS3);
                qjj.k kVar = new qjj.k(esimMobilePlanCheckoutScreenContract$InputData3, bVarS3);
                qjj.e eVar6 = new qjj.e();
                qjj.m mVar5 = new qjj.m();
                unj.g planPriceClauseMapper = new unj.g();
                ynj.b checkoutPlanChangeResolver3 = new ynj.b();
                Intrinsics.checkNotNullParameter(planPriceClauseMapper, "planPriceClauseMapper");
                Intrinsics.checkNotNullParameter(checkoutPlanChangeResolver3, "checkoutPlanChangeResolver");
                return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.b(esimMobilePlanCheckoutScreenContract$InputData2, fVar4, iVar2, eVar5, bVar15, aVar13, aVar14, kVar, eVar6, mVar5, new qjj.l(), new qjj.c());
            case 3:
                b bVar16 = (b) this.f4198b;
                u uVar2 = (u) this.e;
                int i5 = this.f4199c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new AssertionError(i5);
                    }
                    EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData = uVar2.f4461a;
                    z80.b bVarS4 = uVar2.f4462b.f4150p.s();
                    vc.s.j(bVarS4);
                    return new fu6.t(esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData, new rlj.a(bVarS4, new ynj.e()), new rlj.f(), new rlj.b(), new rlj.c(), new rlj.d(), new zkj.c(new alj.a(), b.b()), new alj.a(), b.b(), new ugc.a(b.b()));
                }
                cli.n nVar6 = (cli.n) uVar2.f4463c.get();
                EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData2 = uVar2.f4461a;
                dfj.q1 q1Var = (dfj.q1) bVar16.f4130e1.get();
                zkj.a aVar15 = new zkj.a();
                skj.a aVar16 = new skj.a();
                wli.x xVarD3 = ((s41.a) bVar16.f4164w).d();
                dfj.z0 z0Var = (dfj.z0) bVar16.G.get();
                z80.b bVarS5 = ((b0) this.d).f4170b.f4150p.s();
                vc.s.j(bVarS5);
                return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b(nVar6, esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData2, q1Var, aVar15, aVar16, xVarD3, z0Var, new qhj.e(bVarS5, 1), new ugc.a(b.b()));
            case 4:
                b bVar17 = (b) this.f4198b;
                d0 d0Var = (d0) this.e;
                int i6 = this.f4199c;
                if (i6 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e((cli.n) d0Var.f4202c.get(), d0Var.f4200a, (dfj.q1) bVar17.f4130e1.get(), ((s41.a) bVar17.f4164w).d(), new blj.w());
                }
                if (i6 != 1) {
                    throw new AssertionError(i6);
                }
                EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData = d0Var.f4200a;
                z80.b bVarS6 = d0Var.f4201b.f4150p.s();
                vc.s.j(bVarS6);
                rlj.a aVar17 = new rlj.a(bVarS6, new ynj.e());
                wnj.a aVarB10 = b.b();
                dlj.b bVar18 = new dlj.b(new zkj.c(new alj.a(), b.b()));
                alj.a aVar18 = new alj.a();
                z80.b bVarS7 = ((z) this.d).f4545b.f4150p.s();
                vc.s.j(bVarS7);
                return new blj.v(esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData, aVar17, aVarB10, bVar18, aVar18, new qhj.e(bVarS7, 1), new ugc.a(b.b()));
            case 5:
                b bVar19 = (b) this.f4198b;
                p0 p0Var = (p0) this.e;
                int i21 = this.f4199c;
                if (i21 == 0) {
                    return new slj.k((cli.n) p0Var.f4385b.get(), p0Var.f4384a, ((s41.a) bVar19.f4164w).d(), (dfj.q1) bVar19.f4130e1.get(), new skj.a());
                }
                if (i21 != 1) {
                    throw new AssertionError(i21);
                }
                EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData = p0Var.f4384a;
                wnj.a aVarB11 = b.b();
                z80.b bVarS8 = ((n0) this.d).f4355b.f4150p.s();
                vc.s.j(bVarS8);
                return new slj.m(esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData, aVarB11, new qhj.e(bVarS8, 1));
            case 6:
                y0 y0Var = (y0) this.e;
                b bVar20 = (b) this.f4198b;
                int i22 = this.f4199c;
                switch (i22) {
                    case 0:
                        return kxa.j.k((j60.a) y0Var.f.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) y0Var.d.get(), (rp0.m) y0Var.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension3 = (a6c.f) y0Var.f4532h.get();
                        dhj.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.n nVar7 = (yji.n) extension3;
                        vc.s.k(nVar7);
                        return nVar7;
                    case 4:
                        o8c.a factory3 = bVar20.k.a();
                        vc.s.j(factory3);
                        dhj.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        return factory3.a();
                    case 5:
                        oej.c cVarB4 = bVar20.f4122b.b();
                        vc.s.j(cVarB4);
                        ynj.l lVar3 = (ynj.l) ((m) this.d).f.get();
                        EsimInstallationDialogBuilder esimInstallationDialogBuilder = new EsimInstallationDialogBuilder();
                        b bVar21 = y0Var.f4530c;
                        return new chj.g(cVarB4, lVar3, esimInstallationDialogBuilder, new r10.w((dfj.v2) bVar21.R.get(), bVar21.f4156s.b()));
                    case 6:
                        sf0.h hVarB3 = bVar20.f4145n.b();
                        vc.s.j(hVarB3);
                        b bVar22 = y0Var.f4530c;
                        gej.a aVar19 = (gej.a) bVar22.K.get();
                        ynj.e eVar7 = new ynj.e();
                        cej.b bVar23 = (cej.b) bVar22.X.get();
                        z80.b bVarS9 = bVar22.f4150p.s();
                        vc.s.j(bVarS9);
                        com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a aVar20 = new com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.a(aVar19, eVar7, new a61.a(bVar23, bVarS9), new zjh.i((cej.b) bVar22.X.get()), new bhj.f(), new vnj.a());
                        dfj.t3 t3Var3 = (dfj.t3) bVar20.S0.get();
                        ugc.a aVar21 = new ugc.a(b.b());
                        pjj.b bVar24 = new pjj.b();
                        b bVar25 = y0Var.f4530c;
                        nfj.a2 a2Var3 = (nfj.a2) bVar25.f0.get();
                        a6c.f fVar5 = (a6c.f) y0Var.f4532h.get();
                        gte.a aVarB12 = bVar25.f4120a.b();
                        vc.s.j(aVarB12);
                        return new chj.u0(hVarB3, aVar20, t3Var3, aVar21, bVar24, new chj.q(a2Var3, fVar5, aVarB12));
                    case 7:
                        return new bjj.j((dfj.t3) bVar20.S0.get(), new bjj.k());
                    case 8:
                        return new sij.d((dfj.v2) bVar20.R.get(), new tij.v());
                    case 9:
                        mkd.g view = y0Var.f4528a;
                        rkd.m factory4 = bVar20.f4159t.a();
                        vc.s.j(factory4);
                        rij.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        return factory4.a(view);
                    case 10:
                        EsimSubscriptionsScreenContract$InputData esimSubscriptionsScreenContract$InputData = y0Var.f4529b;
                        b bVar26 = y0Var.f4530c;
                        l70.e eVar8 = bVar20.f4150p;
                        i90.b bVar27 = new i90.b();
                        cli.n nVar8 = (cli.n) y0Var.o.get();
                        ffk.t tVarF = bVar20.d.f();
                        vc.s.j(tVarF);
                        dfj.v2 v2Var2 = (dfj.v2) bVar20.R.get();
                        bej.f fVar6 = (bej.f) bVar20.l0.get();
                        qij.l lVar4 = (qij.l) bVar20.X0.get();
                        bej.n nVar9 = (bej.n) bVar20.Y0.get();
                        dfj.s3 s3Var4 = (dfj.s3) bVar20.f4140k0.get();
                        EsimSubscriptionsScreenContract$InputData esimSubscriptionsScreenContract$InputData2 = y0Var.f4529b;
                        gte.a aVarB13 = bVar26.f4120a.b();
                        vc.s.j(aVarB13);
                        tij.t tVar = new tij.t(esimSubscriptionsScreenContract$InputData2, aVarB13);
                        dfj.k0 k0Var3 = (dfj.k0) bVar20.Y.get();
                        g2e.t tVar2 = new g2e.t(((n86.d) bVar26.f4152q).d());
                        r10.d dVar7 = new r10.d((dfj.c0) bVar26.f4124b1.get(), new g2e.t(((n86.d) bVar26.f4152q).d()));
                        gfj.a aVar22 = (gfj.a) bVar20.H0.get();
                        gfj.b bVar28 = (gfj.b) bVar20.m0.get();
                        unj.c cVar2 = new unj.c(new ynj.e());
                        j60.a aVar23 = (j60.a) y0Var.f.get();
                        chj.d dVar8 = (chj.d) y0Var.f4533j.get();
                        gej.a aVar24 = (gej.a) bVar26.K.get();
                        unj.e eVar9 = new unj.e(new ynj.e());
                        l80.e eVarH3 = bVar26.f4150p.h();
                        vc.s.j(eVarH3);
                        com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a aVar25 = new com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a(new ghj.a(), b.b());
                        gte.a aVarB14 = bVar26.f4120a.b();
                        vc.s.j(aVarB14);
                        vij.c cVar3 = new vij.c(aVar24, eVar9, new vij.e(eVarH3, aVar25, aVarB14));
                        chj.c0 c0Var3 = (chj.c0) y0Var.k.get();
                        bjj.f fVar7 = (bjj.f) y0Var.f4534l.get();
                        bjj.a aVar26 = new bjj.a();
                        mkd.d dVar9 = (mkd.d) y0Var.f4536n.get();
                        wli.x xVarD4 = ((s41.a) bVar20.f4164w).d();
                        bej.m mVar6 = (bej.m) bVar20.F0.get();
                        unj.j jVar4 = new unj.j();
                        l61.a aVarB15 = bVar20.f4142l.b();
                        vc.s.j(aVarB15);
                        dfj.l lVar5 = (dfj.l) bVar20.q0.get();
                        gte.a aVarB16 = bVar20.f4120a.b();
                        vc.s.j(aVarB16);
                        cej.b bVar29 = (cej.b) bVar20.X.get();
                        tij.x xVar = new tij.x();
                        kdh.b bVarD = ((n86.d) bVar20.f4152q).d();
                        dfj.z0 z0Var2 = (dfj.z0) bVar20.G.get();
                        c70.a aVarZ = bVar20.f4150p.z();
                        vc.s.j(aVarZ);
                        nkj.d dVar10 = new nkj.d();
                        ehj.d dVar11 = new ehj.d();
                        sij.b bVar30 = (sij.b) y0Var.f4535m.get();
                        dfj.i1 i1Var = (dfj.i1) bVar20.g0.get();
                        dfj.c0 c0Var4 = (dfj.c0) bVar20.f4124b1.get();
                        dm0.d dVarD2 = bVar20.f4144m.d();
                        vc.s.j(dVarD2);
                        return new com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b(esimSubscriptionsScreenContract$InputData, bVar27, nVar8, tVarF, v2Var2, fVar6, lVar4, nVar9, s3Var4, tVar, k0Var3, tVar2, dVar7, aVar22, bVar28, cVar2, aVar23, dVar8, cVar3, c0Var3, fVar7, aVar26, dVar9, xVarD4, mVar6, jVar4, aVarB15, lVar5, aVarB16, bVar29, xVar, bVarD, z0Var2, aVarZ, dVar10, dVar11, bVar30, i1Var, c0Var4, dVarD2);
                    case 11:
                        b bVar31 = y0Var.f4530c;
                        b bVar32 = y0Var.f4530c;
                        tij.b dataPlanItemsBuilder = bVar31.a();
                        tij.g mobilePlanItemsBuilder = bVar31.d();
                        Intrinsics.checkNotNullParameter(dataPlanItemsBuilder, "dataPlanItemsBuilder");
                        Intrinsics.checkNotNullParameter(mobilePlanItemsBuilder, "mobilePlanItemsBuilder");
                        tij.s sVar = new tij.s();
                        gte.a aVarB17 = bVar32.f4120a.b();
                        vc.s.j(aVarB17);
                        tij.m mVar7 = new tij.m(aVarB17, new tij.e(new tij.k(bVar32.c()), new tij.w(), new tij.u(), new vnj.a()), new tij.w());
                        tb4.t tVarB = y0Var.b();
                        ugc.a aVar27 = new ugc.a(b.b());
                        uij.d dVar12 = new uij.d(new uij.a((gej.a) bVar32.K.get(), new ynj.e(), new uij.b(((qgk.k3) bVar32.e).b())), new uij.e(new ynj.e(), new uij.b(((qgk.k3) bVar32.e).b())));
                        tb4.t tVarB2 = y0Var.b();
                        dm0.d dVarD3 = bVar32.f4144m.d();
                        vc.s.j(dVarD3);
                        tij.a aVar28 = new tij.a(tVarB2, new tij.q(dVarD3, y0Var.b(), bVar32.a(), bVar32.d()), b.b());
                        gte.a aVarB18 = bVar32.f4120a.b();
                        vc.s.j(aVarB18);
                        tij.r rVar5 = new tij.r(aVarB18);
                        cej.b bVar33 = (cej.b) bVar20.X.get();
                        gte.a aVarB19 = bVar20.f4120a.b();
                        vc.s.j(aVarB19);
                        return new pij.m1(sVar, mVar7, tVarB, aVar27, dVar12, aVar28, rVar5, bVar33, aVarB19);
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                z1 z1Var = (z1) this.e;
                b bVar34 = z1Var.f4552c;
                b bVar35 = (b) this.f4198b;
                int i32 = this.f4199c;
                if (i32 == 0) {
                    oej.c cVarB5 = bVar35.f4122b.b();
                    vc.s.j(cVarB5);
                    gVar = new chj.g(cVarB5, (ynj.l) ((x0) this.d).f.get(), new EsimInstallationDialogBuilder(), new r10.w((dfj.v2) bVar34.R.get(), bVar34.f4156s.b()));
                } else if (i32 == 1) {
                    gVar = new bjj.j((dfj.t3) bVar35.S0.get(), new bjj.k());
                } else {
                    if (i32 != 2) {
                        if (i32 != 3) {
                            if (i32 != 4) {
                                throw new AssertionError(i32);
                            }
                            ynj.m mVar8 = new ynj.m();
                            xjj.d dVarB = z1Var.b();
                            z80.b bVarS10 = bVar34.f4150p.s();
                            vc.s.j(bVarS10);
                            xjj.e eVar10 = new xjj.e(mVar8, dVarB, new xjj.q(bVarS10), z1Var.c(), new xjj.o(new xjj.r(), new xjj.g(new unj.f()), new xjj.f(), new bnj.h((gej.a) bVar34.K.get(), b.b(), new xjj.h((gej.a) bVar34.K.get())), new xjj.m(new unj.f())), new xjj.k(new xjj.h((gej.a) bVar34.K.get()), new xjj.r(), new xjj.g(new unj.f())), new xjj.s(new xjj.t()));
                            z80.b bVarS11 = bVar34.f4150p.s();
                            vc.s.j(bVarS11);
                            return new vjj.g0(eVar10, new xjj.i(new xjj.q(bVarS11), z1Var.b(), z1Var.c(), new unj.e(new ynj.e()), (gej.a) bVar34.K.get()));
                        }
                        cli.n nVar10 = (cli.n) z1Var.f4553g.get();
                        EsimMobilePlanDetailsScreenContract$InputData esimMobilePlanDetailsScreenContract$InputData = z1Var.f4551b;
                        wli.x xVarD5 = ((s41.a) bVar35.f4164w).d();
                        dfj.v2 v2Var3 = (dfj.v2) bVar35.R.get();
                        chj.d dVar13 = (chj.d) z1Var.d.get();
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a aVar29 = new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a();
                        dfj.k0 k0Var4 = (dfj.k0) bVar35.Y.get();
                        dfj.i1 i1Var2 = (dfj.i1) bVar35.g0.get();
                        gte.a aVarB20 = bVar35.f4120a.b();
                        vc.s.j(aVarB20);
                        tij.x xVar2 = new tij.x();
                        dfj.s3 s3Var5 = (dfj.s3) bVar35.f4140k0.get();
                        dfj.c0 c0Var5 = (dfj.c0) bVar35.f4124b1.get();
                        ynj.p pVar = new ynj.p();
                        kdh.b bVarD2 = ((n86.d) bVar35.f4152q).d();
                        sij.b bVar36 = (sij.b) z1Var.f.get();
                        bjj.f fVar8 = (bjj.f) z1Var.e.get();
                        bjj.a aVar30 = new bjj.a();
                        ijj.u uVar3 = new ijj.u(b.b());
                        i90.b bVar37 = new i90.b();
                        dfj.z0 z0Var3 = (dfj.z0) bVar35.G.get();
                        dm0.d dVarD4 = bVar35.f4144m.d();
                        vc.s.j(dVarD4);
                        return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c(nVar10, esimMobilePlanDetailsScreenContract$InputData, xVarD5, v2Var3, dVar13, aVar29, k0Var4, i1Var2, aVarB20, xVar2, s3Var5, c0Var5, pVar, bVarD2, bVar36, fVar8, aVar30, uVar3, bVar37, z0Var3, dVarD4);
                    }
                    gVar = new sij.d((dfj.v2) bVar35.R.get(), new tij.v());
                }
                return gVar;
            case 8:
                return a();
            case 9:
                return b();
            case 10:
                return c();
            case 11:
                return d();
            case 12:
                n3 n3Var = (n3) this.e;
                b bVar38 = (b) this.f4198b;
                int i33 = this.f4199c;
                if (i33 == 0) {
                    oej.c cVarB6 = bVar38.f4122b.b();
                    vc.s.j(cVarB6);
                    ynj.l lVar6 = (ynj.l) ((p) this.d).f.get();
                    EsimInstallationDialogBuilder esimInstallationDialogBuilder2 = new EsimInstallationDialogBuilder();
                    b bVar39 = n3Var.f4365c;
                    return new chj.g(cVarB6, lVar6, esimInstallationDialogBuilder2, new r10.w((dfj.v2) bVar39.R.get(), bVar39.f4156s.b()));
                }
                if (i33 != 1) {
                    if (i33 == 2) {
                        return new nnj.u();
                    }
                    throw new AssertionError(i33);
                }
                cli.n nVar11 = (cli.n) n3Var.e.get();
                EsimRefundReasonScreenContract$InputData esimRefundReasonScreenContract$InputData = n3Var.f4364b;
                ang.f fVarE = bVar38.f4142l.e();
                dfj.y yVar = (dfj.y) bVar38.m1.get();
                dfj.s3 s3Var6 = (dfj.s3) bVar38.f4140k0.get();
                dfj.k0 k0Var5 = (dfj.k0) bVar38.Y.get();
                chj.d dVar14 = (chj.d) n3Var.d.get();
                dfj.l lVar7 = (dfj.l) bVar38.q0.get();
                gte.a aVarB21 = bVar38.f4120a.b();
                vc.s.j(aVarB21);
                return new com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c(nVar11, esimRefundReasonScreenContract$InputData, fVarE, yVar, s3Var6, k0Var5, dVar14, lVar7, aVarB21);
            case 13:
                return e();
            case 14:
                return f();
            case 15:
                return g();
            case 16:
                return h();
            case 17:
                return i();
            case 18:
                return j();
            case 19:
                return k();
            case 20:
                return l();
            case 21:
                return m();
            case 22:
                return n();
            case 23:
                return o();
            case 24:
                return p();
            case 25:
                return q();
            case 26:
                return r();
            case 27:
                return s();
            case 28:
                return t();
            default:
                q4 q4Var = (q4) this.d;
                dw3.c1 c1Var = (dw3.c1) this.f4198b;
                dw3.d0 d0Var2 = (dw3.d0) this.e;
                ChangeRepaymentDayScreenContract$InputData changeRepaymentDayScreenContract$InputData = d0Var2.f118528a;
                int i43 = this.f4199c;
                if (i43 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) d0Var2.f118530c.get(), (c84.b) d0Var2.e.get(), (PluginFlowContract$Input) q4Var.i.get());
                }
                if (i43 == 1) {
                    return new c84.b();
                }
                if (i43 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var.f118443h, (com.revolut.kompot.navigable.a) d0Var2.f118530c.get());
                }
                if (i43 == 3) {
                    lx4.a aVarE = c1Var.f118489y.e();
                    return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) c1Var.f118485x).d());
                }
                if (i43 == 4) {
                    return new yf4.j((cx4.a) d0Var2.f118532h.get(), (mf4.e) q4Var.f119582y.get(), changeRepaymentDayScreenContract$InputData, new yf4.l(d0Var2.f118529b.f118489y.c(), changeRepaymentDayScreenContract$InputData));
                }
                throw new AssertionError(i43);
        }
    }
}
