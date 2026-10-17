package iwh;

import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$InputData;
import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardDisplayBalanceSettings$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.amount_confirmation.AutopayAmountConfirmationContract$InputData;
import com.revolut.feature.credit.card.impl.ui.cancellation.checkout.CancellationCheckoutScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.CreditCardCancellationFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.CreditCardCancellationEntryFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.CreditCardWithdrawalFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.cancellation.repayment.CreditCardTerminatedRepaymentScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.CreditCardLimitDecreaseFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.documents_rates.CreditCardDocumentsRatesScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.past.CreditCardInstalmentsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.details.flow.CreditCardPostPurchaseDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.CreditCardEditPostPurchaseInstalmentTermScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_history.CreditCardLimitHistoryControllerContract$InputData;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_settings.CreditCardLimitSettingsControllerContract$InputData;
import com.revolut.feature.credit.card.impl.ui.limit_hub.manage.CreditCardLimitHubManageScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.CreditCardSelectDueDateFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.flow.CreditCardStatementDetailsFlowContract$InputData;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillQrInputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.RecurringPaymentsManageSplitContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogContract$InputData;
import com.revolut.feature.post_activation.impl.ui.flow.PostActivationFlowContract$InputData;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.PromotedMerchantCheckoutContract$InputData;
import jm4.a3;
import jm4.b0;
import jm4.b3;
import jm4.c1;
import jm4.d0;
import jm4.h1;
import jm4.h2;
import jm4.j1;
import jm4.k1;
import jm4.m1;
import jm4.o0;
import jm4.p0;
import jm4.p1;
import jm4.q1;
import jm4.r;
import jm4.r1;
import jm4.t1;
import jm4.v0;
import jm4.w0;
import jm4.x2;
import jm4.y0;
import jm4.z0;
import jm4.z1;
import kotlin.jvm.internal.Intrinsics;
import nd.o;
import nd8.q;
import occ.p;
import om4.b4;
import om4.e3;
import om4.k3;
import om4.n4;
import om4.y2;
import om4.z;
import ove.t;
import thf.m;
import u1a.n;
import vc.s;
import zxb.k0;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f169112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xki.e f169113c;

    public /* synthetic */ k(Object obj2, xki.e eVar, int i) {
        this.f169111a = i;
        this.f169112b = obj2;
        this.f169113c = eVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f169111a) {
            case 0:
                ShowCardPinWithCtaScreenContract$InputData showCardPinWithCtaScreenContract$InputData = ((l) this.f169113c).f169114a;
                com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.f fVar = new com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.f(showCardPinWithCtaScreenContract$InputData);
                c cVar = (c) this.f169112b;
                return new com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.e(fVar, showCardPinWithCtaScreenContract$InputData, (rv2.a) cVar.f169092g.get(), (c90.c) cVar.f169094j.get());
            case 1:
                RecurringPaymentsManageSplitDialogContract$InputData recurringPaymentsManageSplitDialogContract$InputData = ((j1a.b) this.f169113c).f170287a;
                return new x1a.g(recurringPaymentsManageSplitDialogContract$InputData, ((j1a.i) this.f169112b).a(), new com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.b(recurringPaymentsManageSplitDialogContract$InputData));
            case 2:
                j1a.c cVar2 = (j1a.c) this.f169113c;
                RecurringPaymentsManageSplitContract$InputData recurringPaymentsManageSplitContract$InputData = cVar2.f170289a;
                k1a.g gVarA = ((j1a.i) this.f169112b).a();
                dl3.f fVarC = cVar2.f170290b.i.c();
                s.j(fVarC);
                return new com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.b(recurringPaymentsManageSplitContract$InputData, gVarA, new qee.s(new w1a.e(fVarC)));
            case 3:
                return new com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.c(((j1a.f) this.f169113c).f170297a, ((j1a.i) this.f169112b).b(), new s1a.f());
            case 4:
                j1a.g gVar = (j1a.g) this.f169113c;
                SplitBillQrInputData splitBillQrInputData = gVar.f170299a;
                j1a.i iVar = gVar.f170300b;
                fnc.s sVarB = iVar.b();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) iVar.f170312n).c();
                s.j(aVarC);
                jt0.b bVar = new jt0.b(sVarB, aVarC, new l1a.i(iVar.b()));
                pqi.a aVar = ((j1a.i) this.f169112b).f170310l;
                o oVarA = aVar.a();
                f01.c cVarG = aVar.g();
                u1a.b bVar2 = new u1a.b(iVar.d.d());
                djf.c cVar3 = iVar.f;
                thf.d dVarD = cVar3.d();
                s.j(dVarD);
                m mVarG = cVar3.g();
                s.j(mVarG);
                return new u1a.l(splitBillQrInputData, bVar, oVarA, cVarG, new n(bVar2, dVarD, mVarG));
            case 5:
                jcc.e eVar = (jcc.e) this.f169112b;
                k0 k0Var = eVar.f172772h;
                eub.i iVarE = k0Var.e();
                s.j(iVarE);
                eub.a aVarA = k0Var.a();
                s.j(aVarA);
                kcc.b bVar3 = (kcc.b) eVar.f172782w.get();
                mre.c cVarB = eVar.i.b();
                s.j(cVarB);
                a7c.a aVar2 = (a7c.a) eVar.e.f.get();
                s.j(aVar2);
                PromotedMerchantCheckoutContract$InputData promotedMerchantCheckoutContract$InputData = ((jcc.a) this.f169113c).f172758a;
                ncc.b promotedMerchantBadgeMapper = new ncc.b();
                Intrinsics.checkNotNullParameter(promotedMerchantBadgeMapper, "promotedMerchantBadgeMapper");
                return new com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.a(iVarE, aVarA, bVar3, cVarB, aVar2, promotedMerchantCheckoutContract$InputData, new p());
            case 6:
                nd8.g gVar2 = ((jd8.c) this.f169113c).f173017a;
                jd8.e eVar2 = (jd8.e) this.f169112b;
                hj8.a aVarA2 = eVar2.f173024a.a();
                s.j(aVarA2);
                kd8.e eVarA = eVar2.f173025b.a();
                s.j(eVarA);
                return new q(gVar2, aVarA2, eVarA, eVar2.e.c(), new nd8.j());
            case 7:
                PostActivationFlowContract$InputData postActivationFlowContract$InputData = ((jfa.b) this.f169113c).f173748a;
                jfa.a aVar3 = (jfa.a) this.f169112b;
                mfa.b bVarD = aVar3.d();
                pfa.l lVarC = aVar3.c();
                zvj.a aVar4 = aVar3.f173738m;
                cwj.a aVar5 = (cwj.a) aVar4.P.get();
                s.j(aVar5);
                onh.b bVarB = aVar3.b();
                w51.a aVarB = aVar3.f173736j.b();
                s.j(aVarB);
                f80.a aVarX = aVar3.k.x();
                s.j(aVarX);
                l93.b bVarG = aVar3.f173737l.g();
                s.j(bVarG);
                mt8.d dVarB = aVar4.D.b();
                s.j(dVarB);
                t tVar = aVar4.C;
                vte.a aVarC2 = tVar.c();
                s.j(aVarC2);
                uwj.a aVar6 = new uwj.a(aVarC2);
                gte.a aVarB2 = aVar4.e.b();
                s.j(aVarB2);
                swj.a aVar7 = new swj.a(dVarB, aVar6, aVarB2);
                vte.a aVarC3 = tVar.c();
                s.j(aVarC3);
                uwj.a aVar8 = new uwj.a(aVarC3);
                uia.a aVar9 = (uia.a) aVar3.f.i.get();
                s.j(aVar9);
                w9k.a aVar10 = aVar3.f173734g;
                aa5.a aVar11 = (aa5.a) aVar10.f295756n.get();
                s.j(aVar11);
                x9k.a aVarA3 = aVar10.a();
                s.j(aVarA3);
                pfa.a aVar12 = new pfa.a(new ogk.f());
                pfa.m mVar = new pfa.m();
                gte.a aVarB3 = aVar3.f173735h.b();
                s.j(aVarB3);
                pfa.i iVar2 = new pfa.i(bVarB, aVarB, aVarX, bVarG, aVar7, aVar8, aVar9, aVar11, aVarA3, aVar12, mVar, aVarB3);
                wl0.c cVarA = aVar4.d.a();
                pre.c cVarA2 = aVar4.f325709y.a();
                s.j(cVarA2);
                yme.a aVarA4 = aVar4.z.a();
                s.j(aVarA4);
                fwj.p pVar = (fwj.p) aVar4.M.get();
                mli.e eVarA2 = ((j51.a) aVar4.A).a();
                s.j(eVarA2);
                fwj.b bVar4 = new fwj.b(cVarA, cVarA2, aVarA4, pVar, eVarA2);
                com.revolut.retail.feature.api.userauth.navigation.a aVarA5 = aVar3.f173739n.a();
                s.j(aVarA5);
                sf0.h hVarB = aVar3.o.b();
                s.j(hVarB);
                return new com.revolut.feature.post_activation.impl.ui.flow.a(postActivationFlowContract$InputData, bVarD, lVarC, aVar5, iVar2, bVar4, aVarA5, hVarB, (qfa.e) aVar3.f173746x.get());
            case 8:
                jj5.b bVar5 = (jj5.b) this.f169112b;
                xh5.a aVarA6 = bVar5.d.a();
                s.j(aVarA6);
                ebj.b bVar6 = bVar5.e;
                fbj.a aVarA7 = ((qbj.m) bVar6).a();
                s.j(aVarA7);
                ak5.a aVar13 = bVar5.f;
                bk5.a aVarA8 = ((ak5.i) aVar13).a();
                rea.m mVarF = bVar5.f174638g.f();
                jj5.b bVar7 = ((jj5.c) this.f169113c).f174640a;
                uj5.a aVarB4 = ((ak5.i) ((qbj.m) bVar7.e).f).b();
                s.j(aVarB4);
                com.revolut.feature.crypto.receive_widget.impl.ui.customize.e eVar3 = new com.revolut.feature.crypto.receive_widget.impl.ui.customize.e(new fcj.f(aVarB4));
                uj5.a aVarB5 = ((ak5.i) bVar7.f).b();
                s.j(aVarB5);
                com.revolut.feature.crypto.receive_widget.impl.ui.customize.d dVar = new com.revolut.feature.crypto.receive_widget.impl.ui.customize.d(new mj5.b(aVarB5));
                uj5.b bVarE = ((ak5.i) aVar13).e();
                s.j(bVarE);
                se5.a aVar14 = new se5.a();
                vbj.c cVar4 = (vbj.c) ((qbj.m) bVar6).f244320s.get();
                s.j(cVar4);
                return new com.revolut.feature.crypto.receive_widget.impl.ui.customize.c(aVarA6, aVarA7, aVarA8, mVarF, eVar3, dVar, bVarE, aVar14, cVar4);
            case 9:
                AutopayAmountConfirmationContract$InputData autopayAmountConfirmationContract$InputData = ((b0) this.f169113c).f175995a;
                f80.a aVarX2 = ((a3) this.f169112b).k.x();
                s.j(aVarX2);
                return new rp4.j(autopayAmountConfirmationContract$InputData, aVarX2, new rp4.k());
            case 10:
                CancellationCheckoutScreenContract$InputData cancellationCheckoutScreenContract$InputData = ((d0) this.f169113c).f176031a;
                a3 a3Var = (a3) this.f169112b;
                al4.n nVarS = a3Var.f175965b.s();
                s.j(nVarS);
                return new com.revolut.feature.credit.card.impl.ui.cancellation.checkout.b(cancellationCheckoutScreenContract$InputData, nVarS, a3Var.f.e(), new aq4.k());
            case 11:
                CreditCardCancellationEntryFlowContract$InputData creditCardCancellationEntryFlowContract$InputData = ((o0) this.f169113c).f176224a;
                a3 a3Var2 = (a3) this.f169112b;
                z zVar = (z) a3Var2.f175965b.J.get();
                s.j(zVar);
                zp4.b bVar8 = new zp4.b(new bp4.b());
                ang.f fVarE = a3Var2.f.e();
                gte.a aVarB6 = a3Var2.f175982r.b();
                s.j(aVarB6);
                return new com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.a(creditCardCancellationEntryFlowContract$InputData, zVar, bVar8, fVarE, aVarB6, new vt4.a());
            case 12:
                p0 p0Var = (p0) this.f169113c;
                CreditCardCancellationFlowContract$InputData creditCardCancellationFlowContract$InputData = p0Var.f176242a;
                a3 a3Var3 = (a3) this.f169112b;
                r rVar = a3Var3.f175965b;
                al4.q qVarA = rVar.a();
                al4.d dVarO = rVar.o();
                s.j(dVarO);
                al4.n nVarS2 = rVar.s();
                s.j(nVarS2);
                z zVar2 = (z) rVar.J.get();
                s.j(zVar2);
                q06.d dVarA = p0Var.f176243b.R.a();
                s.j(dVarA);
                fq4.a aVar15 = new fq4.a(dVarA);
                zp4.b bVar9 = new zp4.b(new bp4.b());
                gte.a aVarB7 = a3Var3.f175982r.b();
                s.j(aVarB7);
                ffk.t tVarF = a3Var3.i.f();
                s.j(tVarF);
                wj0.a aVarI = ((nj0.d) a3Var3.M).i();
                s.j(aVarI);
                return new com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a(creditCardCancellationFlowContract$InputData, qVarA, dVarO, nVarS2, zVar2, aVar15, bVar9, aVarB7, tVarF, aVarI, a3Var3.f175970g.a());
            case 13:
                v0 v0Var = (v0) this.f169113c;
                CreditCardDisplayBalanceSettings$InputData creditCardDisplayBalanceSettings$InputData = v0Var.f176392a;
                k3 k3Var = (k3) v0Var.f176393b.f175965b.u.get();
                s.j(k3Var);
                return new mr4.g(creditCardDisplayBalanceSettings$InputData, new kgm.c(k3Var), (e3) ((a3) this.f169112b).l0.get(), new mr4.h());
            case 14:
                w0 w0Var = (w0) this.f169113c;
                CreditCardDocumentsRatesScreenContract$InputData creditCardDocumentsRatesScreenContract$InputData = w0Var.f176412a;
                al4.n nVarS3 = ((a3) this.f169112b).f175965b.s();
                s.j(nVarS3);
                return new com.revolut.feature.credit.card.impl.ui.documents_rates.a(creditCardDocumentsRatesScreenContract$InputData, nVarS3, new an4.e(((eyd.b) w0Var.f176413b.F).c()), new lt4.d(), new kxk.o(new er4.b(), new or4.j(new he2.b(new lt4.b(), new lt4.e()))));
            case 15:
                CreditCardEditPostPurchaseInstalmentTermScreenContract$InputData creditCardEditPostPurchaseInstalmentTermScreenContract$InputData = ((y0) this.f169113c).f176443a;
                gs4.i iVar3 = new gs4.i(new bp4.g());
                a3 a3Var4 = (a3) this.f169112b;
                al4.m mVarR = a3Var4.f175965b.r();
                s.j(mVarR);
                return new com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a(creditCardEditPostPurchaseInstalmentTermScreenContract$InputData, iVar3, mVarR, a3Var4.f.e(), new vt4.b(), new js4.p(new vt4.h()));
            case 16:
                CreditCardStatementDetailsFlowContract$InputData creditCardStatementDetailsFlowContract$InputData = ((z0) this.f169113c).f176462a;
                al4.n nVarS4 = ((a3) this.f169112b).f175965b.s();
                s.j(nVarS4);
                return new com.revolut.feature.credit.card.impl.ui.statement.details.flow.a(creditCardStatementDetailsFlowContract$InputData, nVarS4);
            case 17:
                CreditCardInstalmentDetailsFlowContract$InputData creditCardInstalmentDetailsFlowContract$InputData = ((c1) this.f169113c).f176016a;
                gte.a aVarB8 = ((a3) this.f169112b).f175982r.b();
                s.j(aVarB8);
                return new com.revolut.feature.credit.card.impl.ui.instalment.details.flow.b(creditCardInstalmentDetailsFlowContract$InputData, aVarB8);
            case 18:
                CreditCardInstalmentRepayFlowContract$InputData creditCardInstalmentRepayFlowContract$InputData = ((h1) this.f169113c).f176101a;
                al4.m mVarR2 = ((a3) this.f169112b).f175965b.r();
                s.j(mVarR2);
                return new com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a(creditCardInstalmentRepayFlowContract$InputData, mVarR2, new vt4.b());
            case 19:
                j1 j1Var = (j1) this.f169113c;
                CreditCardInstalmentsScreenContract$InputData creditCardInstalmentsScreenContract$InputData = j1Var.f176149a;
                a3 a3Var5 = (a3) this.f169112b;
                al4.m mVarR3 = a3Var5.f175965b.r();
                s.j(mVarR3);
                return new hs4.o(creditCardInstalmentsScreenContract$InputData, mVarR3, a3Var5.f175963a.a(), new hs4.p(j1Var.f176150b.f175963a.f()));
            case 20:
                CreditCardLimitDecreaseFlowContract$InputData creditCardLimitDecreaseFlowContract$InputData = ((k1) this.f169113c).f176165a;
                al4.n nVarS5 = ((a3) this.f169112b).f175965b.s();
                s.j(nVarS5);
                return new com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.b(creditCardLimitDecreaseFlowContract$InputData, nVarS5, new vt4.a(), new vq4.f());
            case 21:
                CreditCardLimitHistoryControllerContract$InputData creditCardLimitHistoryControllerContract$InputData = ((m1) this.f169113c).f176196a;
                al4.n nVarS6 = ((a3) this.f169112b).f175965b.s();
                s.j(nVarS6);
                return new nt4.g(creditCardLimitHistoryControllerContract$InputData, nVarS6, new at.r(new vt4.c()));
            case 22:
                CreditCardLimitHubManageScreenContract$InputData creditCardLimitHubManageScreenContract$InputData = ((p1) this.f169113c).f176245a;
                a3 a3Var6 = (a3) this.f169112b;
                r rVar2 = a3Var6.f175965b;
                al4.n nVarS7 = rVar2.s();
                s.j(nVarS7);
                n4 n4Var = (n4) rVar2.D.get();
                s.j(n4Var);
                gte.a aVarB9 = a3Var6.f175982r.b();
                s.j(aVarB9);
                y2 y2Var = (y2) rVar2.N.get();
                s.j(y2Var);
                om4.k0 k0VarQ = rVar2.q();
                s.j(k0VarQ);
                return new tt4.s(creditCardLimitHubManageScreenContract$InputData, nVarS7, n4Var, aVarB9, y2Var, k0VarQ, a3Var6.f.e(), new tt4.t());
            case 23:
                return new pt4.h(((q1) this.f169113c).f176266a, (al4.o) ((a3) this.f169112b).m0.get(), new pt4.j());
            case 24:
                CreditCardLimitSettingsControllerContract$InputData creditCardLimitSettingsControllerContract$InputData = ((r1) this.f169113c).f176310a;
                a3 a3Var7 = (a3) this.f169112b;
                r rVar3 = a3Var7.f175965b;
                al4.n nVarS8 = rVar3.s();
                s.j(nVarS8);
                om4.k0 k0VarQ2 = rVar3.q();
                s.j(k0VarQ2);
                al4.o oVar = (al4.o) a3Var7.m0.get();
                vt4.c limitHistoryItemMapper = new vt4.c();
                Intrinsics.checkNotNullParameter(limitHistoryItemMapper, "limitHistoryItemMapper");
                return new rt4.p(creditCardLimitSettingsControllerContract$InputData, nVarS8, k0VarQ2, oVar, new rt4.r());
            case 25:
                CreditCardPostPurchaseDetailsFlowContract$InputData creditCardPostPurchaseDetailsFlowContract$InputData = ((t1) this.f169113c).f176362a;
                gte.a aVarB10 = ((a3) this.f169112b).f175982r.b();
                s.j(aVarB10);
                return new com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.details.flow.a(creditCardPostPurchaseDetailsFlowContract$InputData, aVarB10);
            case 26:
                CreditCardRepayFlowContract$InputData creditCardRepayFlowContract$InputData = ((z1) this.f169113c).f176465a;
                a3 a3Var8 = (a3) this.f169112b;
                r rVar4 = a3Var8.f175965b;
                al4.n nVarS9 = rVar4.s();
                s.j(nVarS9);
                vt4.a aVar16 = new vt4.a();
                b4 b4Var = (b4) rVar4.O.get();
                s.j(b4Var);
                gte.a aVarB11 = a3Var8.f175982r.b();
                s.j(aVarB11);
                pm4.e eVar4 = new pm4.e(new bp4.i());
                lb5.b bVarA = a3Var8.d.a();
                s.j(bVarA);
                return new com.revolut.feature.credit.card.impl.ui.repay.flow.b(creditCardRepayFlowContract$InputData, nVarS9, aVar16, b4Var, aVarB11, eVar4, bVarA, new yt4.a());
            case 27:
                CreditCardSelectDueDateFlowContract$InputData creditCardSelectDueDateFlowContract$InputData = ((h2) this.f169113c).f176104a;
                al4.n nVarS10 = ((a3) this.f169112b).f175965b.s();
                s.j(nVarS10);
                return new com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.b(creditCardSelectDueDateFlowContract$InputData, nVarS10, new vt4.a());
            case 28:
                CreditCardTerminatedRepaymentScreenContract$InputData creditCardTerminatedRepaymentScreenContract$InputData = ((x2) this.f169113c).f176435a;
                a3 a3Var9 = (a3) this.f169112b;
                al4.n nVarS11 = a3Var9.f175965b.s();
                s.j(nVarS11);
                return new gq4.r(creditCardTerminatedRepaymentScreenContract$InputData, nVarS11, new vt4.b(), new mw4.a(), a3Var9.f175970g.a(), new gq4.t(new he2.b(new lt4.b(), new lt4.e())));
            default:
                vt4.b bVar10 = new vt4.b();
                a3 a3Var10 = (a3) this.f169112b;
                z zVar3 = (z) a3Var10.f175965b.J.get();
                s.j(zVar3);
                lt4.d dVar2 = new lt4.d();
                q06.l lVarA = a3Var10.S.a();
                s.j(lVarA);
                CreditCardWithdrawalFlowContract$InputData creditCardWithdrawalFlowContract$InputData = ((b3) this.f169113c).f176005a;
                wj0.a aVarI2 = ((nj0.d) a3Var10.M).i();
                s.j(aVarI2);
                return new com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d(bVar10, zVar3, dVar2, lVarA, creditCardWithdrawalFlowContract$InputData, aVarI2, a3Var10.f175970g.a());
        }
    }
}
