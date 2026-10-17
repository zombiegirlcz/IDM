package p2k;

import az0.w1;
import com.revolut.feature.apm.aani.impl.ui.AaniFlowContract$InputData;
import com.revolut.feature.apm.aani.impl.ui.registration.confirmation.AaniRegistrationConfirmationContract$InputData;
import com.revolut.feature.backgroundpicker.impl.ui.flow.theme_customisation.ThemeCustomisationFlowContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown.DonationBreakdownContract$InputData;
import com.revolut.feature.pix.api.navigation.PixNavigation$InputData;
import com.revolut.feature.pix.impl.flow.alias_deletion.screens.review_delete.ReviewDeleteAliasScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.MyAliasesScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.pix_area.screens.review_trusted_account.ReviewTrustedAccountScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.portability_details.PortabilityDetailsContract$InputData;
import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreenContract$InputData;
import com.revolut.feature.revolutpay.api.domain.models.order.RevolutPayOrderSummaryContract$InputData;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.shared.ui.order_summary.OrderSummaryScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.budget.upcoming_payments.BudgetUpcomingPaymentsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData;
import com.revolut.feature.transaction_list.impl.ui.list.screen.all_accounts_filter.AllAccountsTransactionFiltersScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.plan_gifting.impl.network.PlanGiftingEligibilityService;
import kotlin.jvm.internal.Intrinsics;
import p7c.q0;
import p8a.b1;
import p8a.g1;
import p8a.h1;
import p8a.p1;
import p8a.x0;
import p8a.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f232292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xki.e f232293c;

    public /* synthetic */ c(Object obj2, xki.e eVar, int i) {
        this.f232291a = i;
        this.f232292b = obj2;
        this.f232293c = eVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f232291a) {
            case 0:
                return new com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a(new r2k.b(((b3j.p) ((a) this.f232292b).f232266b).e()), new x2k.e(), ((d) this.f232293c).f232298a);
            case 1:
                j jVar = (j) this.f232293c;
                BankTransferFlowInputData bankTransferFlowInputData = jVar.f232371a;
                od0.i iVar = jVar.f232372b;
                b3a.a aVarA = ((n) this.f232292b).f232413q.a();
                vc.s.j(aVarA);
                return new com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.c(bankTransferFlowInputData, iVar, aVarA);
            case 2:
                k7c.k kVar = (k7c.k) ((p7c.r) this.f232292b).f233692t0.get();
                zcc.a aVar = new zcc.a();
                OrderSummaryScreenContract$InputData orderSummaryScreenContract$InputData = ((p7c.i) this.f232293c).f233620a;
                zdc.a imageMapper = new zdc.a();
                Intrinsics.checkNotNullParameter(imageMapper, "imageMapper");
                zdc.c lineItemsMapper = new zdc.c();
                Intrinsics.checkNotNullParameter(lineItemsMapper, "lineItemsMapper");
                return new zdc.i(kVar, aVar, orderSummaryScreenContract$InputData, new tyc.l(new zdc.d()));
            case 3:
                return new com.revolut.feature.revolutpay.impl.ui.native_move_money.a(new r8c.a(), (f9c.a) ((p7c.r) this.f232292b).l0.get(), ((p7c.s) this.f232293c).f233699a);
            case 4:
                p7c.x xVar = (p7c.x) this.f232293c;
                RevolutPayOrderSummaryContract$InputData revolutPayOrderSummaryContract$InputData = xVar.f233741a;
                p7c.r rVar = (p7c.r) this.f232292b;
                q7c.q qVar = (q7c.q) rVar.L.get();
                f80.a aVarX = xVar.f233742b.f233675g.x();
                vc.s.j(aVarX);
                cdc.b bVar = new cdc.b(new cdc.d(aVarX), new cdc.a());
                f80.a aVarX2 = rVar.f233675g.x();
                vc.s.j(aVarX2);
                return new com.revolut.feature.revolutpay.impl.ui.flow.summary.b(revolutPayOrderSummaryContract$InputData, qVar, bVar, new cdc.f(aVarX2));
            case 5:
                p7c.a0 a0Var = (p7c.a0) this.f232293c;
                AddPaymentMethodControllerDescriptor$InputData addPaymentMethodControllerDescriptor$InputData = a0Var.f233579b;
                q7c.g gVarE = ((p7c.r) this.f232292b).e();
                gdc.u uVar = new gdc.u();
                gdc.d dVar = new gdc.d();
                dec.g gVar = new dec.g();
                l80.e eVarH = a0Var.f233580c.f233675g.h();
                vc.s.j(eVarH);
                return new com.revolut.feature.revolutpay.shared.ui.add_payment_method.c(addPaymentMethodControllerDescriptor$InputData, gVarE, uVar, dVar, new gdc.q(gVar, new gdc.w(eVarH), new lec.c(), new gdc.t()));
            case 6:
                p7c.b0 b0Var = (p7c.b0) this.f232293c;
                AddPaymentMethodControllerDescriptor$InputData addPaymentMethodControllerDescriptor$InputData2 = b0Var.f233583a;
                q7c.g gVarE2 = ((p7c.r) this.f232292b).e();
                gdc.u uVar2 = new gdc.u();
                gdc.d dVar2 = new gdc.d();
                dec.g gVar2 = new dec.g();
                l80.e eVarH2 = b0Var.f233584b.f233675g.h();
                vc.s.j(eVarH2);
                return new com.revolut.feature.revolutpay.shared.ui.add_payment_method.c(addPaymentMethodControllerDescriptor$InputData2, gVarE2, uVar2, dVar2, new gdc.q(gVar2, new gdc.w(eVarH2), new lec.c(), new gdc.t()));
            case 7:
                p7c.a0 a0Var2 = (p7c.a0) this.f232293c;
                AddPaymentMethodControllerDescriptor$InputData addPaymentMethodControllerDescriptor$InputData3 = a0Var2.f233579b;
                q7c.g gVarE3 = ((p7c.r) this.f232292b).e();
                gdc.u uVar3 = new gdc.u();
                gdc.d dVar3 = new gdc.d();
                dec.g gVar3 = new dec.g();
                l80.e eVarH3 = a0Var2.f233580c.f233675g.h();
                vc.s.j(eVarH3);
                return new com.revolut.feature.revolutpay.shared.ui.add_payment_method.c(addPaymentMethodControllerDescriptor$InputData3, gVarE3, uVar3, dVar3, new gdc.q(gVar3, new gdc.w(eVarH3), new lec.c(), new gdc.t()));
            case 8:
                return new jec.q(((q0) this.f232293c).f233666b, (b6c.a) ((p7c.r) this.f232292b).S.get(), new jec.m());
            case 9:
                return new jec.q(((q0) this.f232293c).f233666b, (b6c.a) ((p7c.r) this.f232292b).S.get(), new jec.m());
            case 10:
                PixNavigation$InputData pixNavigation$InputData = ((p8a.e0) this.f232293c).f233952a;
                p8a.d0 d0Var = (p8a.d0) this.f232292b;
                zja.a aVarA2 = ((ika.b) d0Var.f233929a).a();
                vc.s.j(aVarA2);
                return new com.revolut.feature.pix.impl.flow.b(pixNavigation$InputData, aVarA2, d0Var.f233930b.a());
            case 11:
                PortabilityDetailsContract$InputData portabilityDetailsContract$InputData = ((x0) this.f232293c).f234119a;
                p8a.d0 d0Var2 = (p8a.d0) this.f232292b;
                s8a.c cVarA = d0Var2.e.a();
                vc.s.j(cVarA);
                gba.c cVar = new gba.c();
                wj0.a aVarI = ((nj0.d) d0Var2.f233939q).i();
                vc.s.j(aVarI);
                return new com.revolut.feature.pix.impl.flow.portability_details.a(portabilityDetailsContract$InputData, cVarA, cVar, aVarI);
            case 12:
                y0 y0Var = (y0) this.f232293c;
                w8a.l lVar = new w8a.l((j8a.a) y0Var.f234126b.E.get());
                ReviewDeleteAliasScreenContract$InputData reviewDeleteAliasScreenContract$InputData = y0Var.f234125a;
                w8a.i iVar2 = new w8a.i();
                p8a.d0 d0Var3 = (p8a.d0) this.f232292b;
                s8a.c cVarA2 = d0Var3.e.a();
                vc.s.j(cVarA2);
                wj0.a aVarI2 = ((nj0.d) d0Var3.f233939q).i();
                vc.s.j(aVarI2);
                return new w8a.j(lVar, reviewDeleteAliasScreenContract$InputData, iVar2, cVarA2, aVarI2);
            case 13:
                yaa.i iVar3 = new yaa.i();
                ReviewTrustedAccountScreenContract$InputData reviewTrustedAccountScreenContract$InputData = ((b1) this.f232293c).f233898a;
                s8a.n nVar = (s8a.n) ((p8a.d0) this.f232292b).e.J.get();
                vc.s.j(nVar);
                return new yaa.h(iVar3, reviewTrustedAccountScreenContract$InputData, nVar, new aba.a());
            case 14:
                g1 g1Var = (g1) this.f232293c;
                taa.m mVar = new taa.m((j8a.a) g1Var.f233973b.E.get());
                MyAliasesScreenContract$InputData myAliasesScreenContract$InputData = g1Var.f233972a;
                f8a.a aVarB = ((p8a.d0) this.f232292b).e.b();
                vc.s.j(aVarB);
                return new taa.k(mVar, myAliasesScreenContract$InputData, aVarB);
            case 15:
                h1 h1Var = (h1) this.f232293c;
                taa.m mVar2 = new taa.m((j8a.a) h1Var.f233981b.E.get());
                MyAliasesScreenContract$InputData myAliasesScreenContract$InputData2 = h1Var.f233980a;
                f8a.a aVarB2 = ((p8a.d0) this.f232292b).e.b();
                vc.s.j(aVarB2);
                return new taa.k(mVar2, myAliasesScreenContract$InputData2, aVarB2);
            case 16:
                TokenVerificationScreenContract$InputData tokenVerificationScreenContract$InputData = ((p1) this.f232293c).f234055b;
                s8a.c cVarA3 = ((p8a.d0) this.f232292b).e.a();
                vc.s.j(cVarA3);
                return new wca.l(tokenVerificationScreenContract$InputData, cVarA3, new wca.n(tokenVerificationScreenContract$InputData));
            case 17:
                TokenVerificationScreenContract$InputData tokenVerificationScreenContract$InputData2 = ((p1) this.f232293c).f234055b;
                s8a.c cVarA4 = ((p8a.d0) this.f232292b).e.a();
                vc.s.j(cVarA4);
                return new wca.l(tokenVerificationScreenContract$InputData2, cVarA4, new wca.n(tokenVerificationScreenContract$InputData2));
            case 18:
                DonationBreakdownContract$InputData donationBreakdownContract$InputData = ((pa6.k) this.f232293c).f234380a;
                return new com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown.a(donationBreakdownContract$InputData, (aa6.c) ((pa6.m) this.f232292b).T.get(), new hb6.f(donationBreakdownContract$InputData));
            case 19:
                pa6.m mVar3 = (pa6.m) this.f232292b;
                aa6.c cVar2 = (aa6.c) mVar3.T.get();
                mre.c cVarB = mVar3.f234394l.b();
                vc.s.j(cVarB);
                return new com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a(cVar2, cVarB, ((pa6.l) this.f232293c).f234382a);
            case 20:
                return new ib6.n(((pa6.s) this.f232293c).f234426b, (aa6.c) ((pa6.m) this.f232292b).T.get(), new ib6.i());
            case 21:
                return new ib6.n(((pa6.s) this.f232293c).f234426b, (aa6.c) ((pa6.m) this.f232292b).T.get(), new ib6.i());
            case 22:
                pbk.b bVar2 = (pbk.b) this.f232292b;
                i90.b bVar3 = new i90.b();
                cl3.a aVarD = bVar2.f234716b.d();
                vc.s.j(aVarD);
                pbk.g gVar4 = (pbk.g) this.f232293c;
                pbk.b bVar4 = gVar4.f234741b;
                sf0.h hVarB = bVar4.f234717c.b();
                vc.s.j(hVarB);
                cck.c cVar3 = new cck.c(hVarB);
                eck.l lVar2 = new eck.l();
                r10.t tVarB = gVar4.b();
                obk.a aVar2 = bVar2.d;
                tbk.h hVar = (tbk.h) aVar2.f223979n.get();
                vc.s.j(hVar);
                t1j.b bVar5 = new t1j.b(new wbk.b((PlanGiftingEligibilityService) aVar2.f223985w.get(), obk.g.a()));
                qbk.b bVar6 = (qbk.b) aVar2.C.get();
                vc.s.j(bVar6);
                ack.e eVar = gVar4.f234740a;
                tbk.d dVar4 = (tbk.d) aVar2.z.get();
                vc.s.j(dVar4);
                zjh.i iVar4 = new zjh.i(((c21.b) bVar4.e).c());
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) gVar4.d.get();
                bck.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b(bVar3, aVarD, cVar3, lVar2, tVarB, hVar, bVar5, bVar6, eVar, dVar4, iVar4, rp0.x0.a(rp0.g1.Companion, controller.C2().D2()));
            case 23:
                pgf.a aVar3 = (pgf.a) this.f232293c;
                AllAccountsTransactionFiltersScreenContract$InputData allAccountsTransactionFiltersScreenContract$InputData = aVar3.f235878a;
                pgf.e eVar2 = (pgf.e) this.f232292b;
                jge.j jVar2 = eVar2.f235894a;
                rgf.w wVar = new rgf.w(((jge.m) jVar2.e).e(), jVar2.a());
                gte.a aVarB3 = eVar2.f.b();
                vc.s.j(aVarB3);
                xh5.a aVarA3 = eVar2.z.a();
                vc.s.j(aVarA3);
                gv5.d dVarG = eVar2.A.g();
                h9h.a aVar4 = eVar2.B;
                tzg.m mVarT = aVar4.t();
                vc.s.j(mVarT);
                rkg.b bVar7 = new rkg.b();
                ybl.l lVarF = aVar4.f();
                pgf.e eVar3 = aVar3.f235879b;
                return new rgf.t(allAccountsTransactionFiltersScreenContract$InputData, wVar, aVarB3, aVarA3, dVarG, mVarT, bVar7, lVarF, new rgf.l(((jge.m) eVar3.f235894a.e).a(), new rgf.d0(new kpj.f(eVar3.B.H()))));
            case 24:
                pl1.j jVar3 = (pl1.j) this.f232293c;
                AaniFlowContract$InputData aaniFlowContract$InputData = jVar3.f237255a;
                pl1.m mVar4 = jVar3.f237256b;
                fx1.a aVarF = ((lz1.m) mVar4.f237263a).f();
                vc.s.j(aVarF);
                kdh.b bVar8 = new kdh.b(aVarF, (pl1.a) mVar4.f237266g.get());
                ul1.a aVar5 = new ul1.a();
                vl1.c cVar4 = new vl1.c((c12.f) mVar4.i.get());
                pl1.m mVar5 = (pl1.m) this.f232292b;
                zja.a aVarA4 = ((ika.b) mVar5.f237264b).a();
                vc.s.j(aVarA4);
                return new com.revolut.feature.apm.aani.impl.ui.c(aaniFlowContract$InputData, bVar8, aVar5, cVar4, aVarA4, (tak.d) mVar5.f237268j.get());
            case 25:
                pl1.k kVar2 = (pl1.k) this.f232293c;
                AaniRegistrationConfirmationContract$InputData aaniRegistrationConfirmationContract$InputData = kVar2.f237258a;
                z80.b bVarS = kVar2.f237259b.f237265c.s();
                vc.s.j(bVarS);
                xl1.o oVar = new xl1.o(bVarS);
                pl1.m mVar6 = ((pl1.j) this.f232292b).f237256b;
                fx1.a aVarF2 = ((lz1.m) mVar6.f237263a).f();
                vc.s.j(aVarF2);
                return new xl1.m(aaniRegistrationConfirmationContract$InputData, oVar, new kdh.b(aVarF2, (pl1.a) mVar6.f237266g.get()));
            case 26:
                ThemeCustomisationFlowContract$InputData themeCustomisationFlowContract$InputData = ((pm2.e) this.f232293c).f237466a;
                pm2.c cVar5 = (pm2.c) this.f232292b;
                gm2.a aVar6 = new gm2.a();
                ckg.a aVar7 = cVar5.f237460b;
                vjg.g gVarA = aVar7.a();
                vc.s.j(gVarA);
                return new com.revolut.feature.backgroundpicker.impl.ui.flow.theme_customisation.a(themeCustomisationFlowContract$InputData, aVar6, gVarA, new zjh.f(aVar7.b()));
            case 27:
                zm2.k kVar3 = new zm2.k();
                zm2.e eVar4 = ((pm2.g) this.f232293c).f237470a;
                nm2.e eVar5 = ((pm2.c) this.f232292b).d;
                bn2.f fVarE = eVar5.e();
                w1 w1Var = (w1) eVar5.e.get();
                vc.s.j(w1Var);
                return new zm2.j(kVar3, eVar4, fVarE, w1Var);
            case 28:
                ppd.i iVar5 = (ppd.i) this.f232293c;
                AdjustAssetValueContract$InputData adjustAssetValueContract$InputData = iVar5.f238431a;
                tsj.g gVarE4 = ((dqj.r) ((ppd.n) this.f232292b).f238484b).e();
                vc.s.j(gVarE4);
                return new prd.i(adjustAssetValueContract$InputData, gVarE4, iVar5.b(), new com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.c(adjustAssetValueContract$InputData, iVar5.b()));
            default:
                ppd.q qVar2 = (ppd.q) this.f232293c;
                ppd.n nVar2 = qVar2.f238527b;
                l80.e eVarH4 = nVar2.d.h();
                vc.s.j(eVarH4);
                zmd.q qVar3 = new zmd.q((a9e.a) nVar2.R0.get(), eVarH4);
                BudgetUpcomingPaymentsContract$InputData budgetUpcomingPaymentsContract$InputData = qVar2.f238526a;
                wmd.c cVar6 = new wmd.c(nVar2.f.a(), nVar2.f238494l.c(), nVar2.f238486c.a());
                dqj.r rVar2 = (dqj.r) nVar2.f238484b;
                jzi.a aVarD2 = rVar2.d();
                vc.s.j(aVarD2);
                eqj.f fVar = (eqj.f) rVar2.H.get();
                vc.s.j(fVar);
                xld.f fVar2 = (xld.f) nVar2.f238489g.z0.get();
                vc.s.j(fVar2);
                ppk.f fVarA = nVar2.f238510x.a();
                l80.e eVarH5 = nVar2.d.h();
                vc.s.j(eVarH5);
                uc.d dVar5 = new uc.d(fVar2, fVarA, eVarH5);
                whf.b bVarA = nVar2.f238490h.a();
                vc.s.j(bVarA);
                ou5.b bVar9 = new ou5.b(cVar6, aVarD2, fVar, dVar5, bVarA);
                x9e.a aVar8 = ((ppd.n) this.f232292b).G0;
                c9e.c cVarB2 = aVar8.b();
                vc.s.j(cVarB2);
                z8e.a aVarD3 = aVar8.d();
                vc.s.j(aVarD3);
                return new zmd.o(qVar3, budgetUpcomingPaymentsContract$InputData, bVar9, cVarB2, aVarD3);
        }
    }
}
