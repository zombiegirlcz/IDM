package whc;

import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.CardReaderConnectionFlowContract$InputData;
import com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.CardOrderExperimentFlowContract$InputData;
import com.revolut.feature.external_accounts.api.navigation.BrazilInboundOpenbankingDescriptor$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.CrossBorderEasyBankTransferFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.flow.link_external.LinkExternalAccountFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.IndiaNetBankingFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow.JapanEasyBankAuthorizationFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer.JapanEasyBankTransferFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.JuniorAccountDetailsConfirmationScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.child_details.JuniorIsaChildDetailsScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.jisa_national_number.JuniorIsaNationalNumberScreenContract$InputData;
import com.revolut.feature.junior_payment_links.api.navigation.JuniorPaymentLinksConsentInput;
import com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.JuniorCardProfileFlowContract$Input;
import com.revolut.feature.rewards.impl.ui.concierge.flow.ConciergeAlbertineFlowContract$InputData;
import com.revolut.feature.rewards.impl.ui.registration.RewardRegistrationFlowContract$InputData;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.select_payment.RentAndBillsSelectPaymentScreenContract$InputData;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment.RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData;
import com.revolut.feature.rewards.impl.ui.subscription.activation.ActivationNoticeContract$InputData;
import com.revolut.feature.rewards.impl.ui.subscription.cancellation.CancellationInstructionsContract$InputData;
import com.revolut.feature.trading_asset_quotes.impl.ui.dialog.total_exchange_fees.TotalExchangeFeesDialogContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import rh8.o0;
import sgm.e3;
import xf6.g3;
import xf6.n1;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f297509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f297510c;

    public /* synthetic */ d(Object obj2, qji.b bVar, int i) {
        this.f297508a = i;
        this.f297509b = obj2;
        this.f297510c = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f297508a) {
            case 0:
                e eVar = (e) this.f297510c;
                ActivationNoticeContract$InputData activationNoticeContract$InputData = eVar.f297512a;
                return new tjc.f(activationNoticeContract$InputData, (bgc.e) ((s) this.f297509b).u.get(), new tjc.h(activationNoticeContract$InputData, eVar.f297513b.d(), new sic.a()));
            case 1:
                CancellationInstructionsContract$InputData cancellationInstructionsContract$InputData = ((h) this.f297510c).f297533a;
                return new xjc.g(cancellationInstructionsContract$InputData, ((s41.a) ((s) this.f297509b).o).d(), new xjc.i(cancellationInstructionsContract$InputData, new sic.c()));
            case 2:
                ConciergeAlbertineFlowContract$InputData conciergeAlbertineFlowContract$InputData = ((j) this.f297510c).f297539a;
                zja.a aVarA = ((ika.b) ((s) this.f297509b).f297575n).a();
                vc.s.j(aVarA);
                return new com.revolut.feature.rewards.impl.ui.concierge.flow.b(conciergeAlbertineFlowContract$InputData, aVarA);
            case 3:
                zjc.a aVar = ((k) this.f297510c).f297541a;
                return new zjc.h(aVar, (bgc.e) ((s) this.f297509b).u.get(), new zjc.l(aVar));
            case 4:
                uic.b bVar = ((m) this.f297510c).f297544a;
                s sVar = (s) this.f297509b;
                bgc.e eVar2 = (bgc.e) sVar.u.get();
                uic.e eVar3 = new uic.e();
                wli.x xVarD = ((s41.a) sVar.o).d();
                sf0.h hVarB = sVar.f297574m.b();
                vc.s.j(hVarB);
                return new uic.d(bVar, eVar2, eVar3, xVarD, hVarB);
            case 5:
                RewardRegistrationFlowContract$InputData rewardRegistrationFlowContract$InputData = ((r) this.f297510c).f297565a;
                vic.d dVar = new vic.d();
                s sVar2 = (s) this.f297509b;
                bgc.e eVar4 = (bgc.e) sVar2.u.get();
                sf0.h hVarB2 = sVar2.f297574m.b();
                vc.s.j(hVarB2);
                return new vic.c(rewardRegistrationFlowContract$InputData, dVar, eVar4, hVarB2);
            case 6:
                x xVar = (x) this.f297510c;
                RentAndBillsSelectPaymentScreenContract$InputData rentAndBillsSelectPaymentScreenContract$InputData = xVar.f297608a;
                z zVar = (z) this.f297509b;
                xua.a aVarA2 = zVar.e.a();
                vc.s.j(aVarA2);
                bgc.d dVarA = zVar.d.a();
                z zVar2 = xVar.f297609b;
                ppk.f fVarA = zVar2.f297620l.a();
                xua.a aVarA3 = zVar2.e.a();
                vc.s.j(aVarA3);
                e3 e3Var = new e3(fVarA, aVarA3);
                cjc.b bVar2 = new cjc.b();
                ojc.a aVar2 = new ojc.a();
                ojc.f fVar = new ojc.f(xVar.b());
                RentAndBillsSelectPaymentScreenContract$InputData rentAndBillsSelectPaymentScreenContract$InputData2 = xVar.f297608a;
                return new ljc.r(rentAndBillsSelectPaymentScreenContract$InputData, aVarA2, dVarA, e3Var, bVar2, aVar2, new ljc.s(fVar, new njc.b(rentAndBillsSelectPaymentScreenContract$InputData2, xVar.b(), zVar2.f297621m.g()), new ojc.g(), rentAndBillsSelectPaymentScreenContract$InputData2));
            case 7:
                y yVar = (y) this.f297510c;
                RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData = yVar.f297611a;
                bgc.d dVarA2 = ((z) this.f297509b).d.a();
                qr0.i iVar = new qr0.i(rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData);
                z zVar3 = yVar.f297612b;
                c3j.c cVar = new c3j.c();
                m3j.j jVarD = b3j.p.d();
                thf.c cVarC = zVar3.k.c();
                vc.s.j(cVarC);
                return new pjc.j(rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData, dVarA2, new bof.r(iVar, new rjc.c(rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData, new ojc.d(cVar, jVarD, cVarC)), new rjc.b(rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData)));
            case 8:
                JuniorCardProfileFlowContract$Input input = ((wi8.a) this.f297510c).f297836a;
                wi8.e eVar5 = (wi8.e) this.f297509b;
                kd8.e juniorConsentInteractor = eVar5.f297849c.a();
                vc.s.j(juniorConsentInteractor);
                wsg.n walletInteractor = eVar5.d.b();
                te8.z juniorProductsInteractor = eVar5.e.e();
                vc.s.j(juniorProductsInteractor);
                hj8.a juniorProfileInteractor = eVar5.f.a();
                vc.s.j(juniorProfileInteractor);
                xi8.c juniorPaymentLinkShotDialogConfirmationProvider = new xi8.c();
                zi8.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(juniorConsentInteractor, "juniorConsentInteractor");
                Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
                Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
                Intrinsics.checkNotNullParameter(juniorPaymentLinkShotDialogConfirmationProvider, "juniorPaymentLinkShotDialogConfirmationProvider");
                return new com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a(input, juniorConsentInteractor, walletInteractor, juniorProductsInteractor, juniorProfileInteractor, juniorPaymentLinkShotDialogConfirmationProvider);
            case 9:
                JuniorPaymentLinksConsentInput juniorPaymentLinksConsentInput = ((wi8.d) this.f297510c).f297845a;
                dj8.d dVar2 = new dj8.d(juniorPaymentLinksConsentInput);
                wi8.e eVar6 = (wi8.e) this.f297509b;
                kd8.e eVarA = eVar6.f297849c.a();
                vc.s.j(eVarA);
                return new dj8.c(dVar2, juniorPaymentLinksConsentInput, eVarA, eVar6.f297850g.a());
            case 10:
                x13.o oVar = (x13.o) this.f297510c;
                CardOrderExperimentFlowContract$InputData cardOrderExperimentFlowContract$InputData = oVar.f302152a;
                x13.p pVar = (x13.p) this.f297509b;
                ffk.t tVarF = pVar.f302160j.f();
                vc.s.j(tVarF);
                q33.f fVar2 = new q33.f();
                gte.a aVarB = oVar.f302153b.f302155a.b();
                vc.s.j(aVarB);
                q33.h hVar = new q33.h(aVarB);
                gte.a aVarB2 = pVar.f302155a.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b(cardOrderExperimentFlowContract$InputData, tVarF, fVar2, hVar, aVarB2);
            case 11:
                JuniorAccountDetailsConfirmationScreenContract$InputData juniorAccountDetailsConfirmationScreenContract$InputData = ((x98.e) this.f297510c).f303610a;
                x98.o oVar2 = (x98.o) this.f297509b;
                qh8.b bVar3 = oVar2.i;
                o0 o0Var = (o0) bVar3.f246500m.get();
                vc.s.j(o0Var);
                lh8.f fVar3 = (lh8.f) bVar3.f246500m.get();
                vc.s.j(fVar3);
                hj8.a aVarA4 = oVar2.d.a();
                vc.s.j(aVarA4);
                prl.e eVarA2 = bVar3.a();
                rh8.l lVar = (rh8.l) bVar3.f246501n.get();
                vc.s.j(lVar);
                return new com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a(juniorAccountDetailsConfirmationScreenContract$InputData, o0Var, fVar3, aVarA4, eVarA2, lVar, oVar2.f303635m.a(), new da8.r());
            case 12:
                x98.o oVar3 = (x98.o) this.f297509b;
                ang.f fVarE = oVar3.f303634l.e();
                o7.d dVarC = oVar3.c();
                hj8.a aVarA5 = oVar3.d.a();
                vc.s.j(aVarA5);
                kbb.c cVarF = oVar3.f303632h.f();
                prl.e eVarA3 = oVar3.i.a();
                ba8.f fVarD = oVar3.d();
                x98.g gVar = (x98.g) this.f297510c;
                return new com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a(fVarE, dVarC, aVarA5, cVarF, eVarA3, fVarD, new na8.u(gVar.f303614a), gVar.f303614a);
            case 13:
                fa8.k kVar = new fa8.k();
                JuniorIsaChildDetailsScreenContract$InputData juniorIsaChildDetailsScreenContract$InputData = ((x98.h) this.f297510c).f303616a;
                x98.o oVar4 = (x98.o) this.f297509b;
                hj8.a aVarA6 = oVar4.d.a();
                vc.s.j(aVarA6);
                return new com.revolut.feature.junior.isa.impl.ui.child_details.a(kVar, juniorIsaChildDetailsScreenContract$InputData, aVarA6, oVar4.d(), oVar4.i.a(), oVar4.c(), oVar4.f303632h.f());
            case 14:
                hj8.a aVarA7 = ((x98.o) this.f297509b).d.a();
                vc.s.j(aVarA7);
                return new ra8.c(aVarA7, ((x98.k) this.f297510c).f303621a);
            case 15:
                JuniorIsaNationalNumberScreenContract$InputData juniorIsaNationalNumberScreenContract$InputData = ((x98.n) this.f297510c).f303626a;
                z98.d dVar3 = (z98.d) ((x98.o) this.f297509b).k.f303604h.get();
                vc.s.j(dVar3);
                return new com.revolut.feature.junior.isa.impl.ui.jisa_national_number.a(juniorIsaNationalNumberScreenContract$InputData, dVar3, new ta8.p());
            case 16:
                hj8.a aVarA8 = ((x98.o) this.f297509b).d.a();
                vc.s.j(aVarA8);
                return new bb8.j(aVarA8, ((x98.r) this.f297510c).f303642a, new bb8.k());
            case 17:
                CardReaderConnectionFlowContract$InputData cardReaderConnectionFlowContract$InputData = ((xb1.h) this.f297510c).f303928a;
                xb1.p pVar2 = (xb1.p) this.f297509b;
                ka1.l lVar2 = pVar2.f303956b;
                ca1.a aVar3 = (ca1.a) lVar2.v.get();
                vc.s.j(aVar3);
                da1.d dVar4 = (da1.d) lVar2.f182384w.get();
                vc.s.j(dVar4);
                da1.b bVar4 = (da1.b) lVar2.Q.get();
                vc.s.j(bVar4);
                dfc.a aVar4 = (dfc.a) pVar2.f303955a.f14954m.get();
                vc.s.j(aVar4);
                ma1.j jVar = (ma1.j) lVar2.i.get();
                vc.s.j(jVar);
                return new com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b(cardReaderConnectionFlowContract$InputData, aVar3, dVar4, bVar4, aVar4, jVar);
            case 18:
                xcf.a aVar5 = (xcf.a) this.f297510c;
                TotalExchangeFeesDialogContract$InputData inputData = aVar5.f304123a;
                bdf.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                adf.b bVar5 = new adf.b(inputData.f91692a, null, inputData.f91694c);
                l4i.a amountConverter = new l4i.a();
                Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
                adf.i iVar2 = new adf.i();
                TotalExchangeFeesDialogContract$InputData totalExchangeFeesDialogContract$InputData = aVar5.f304123a;
                xcf.b bVar6 = (xcf.b) this.f297509b;
                return new adf.h(bVar5, iVar2, totalExchangeFeesDialogContract$InputData, bVar6.a(), ((s41.a) bVar6.f304127c).d(), new cdf.a());
            case 19:
                g3 g3Var = (g3) this.f297510c;
                BrPaymentExpiryDateUpdateScreenContract$InputData brPaymentExpiryDateUpdateScreenContract$InputData = g3Var.f304866b;
                l80.e eVarH = ((xf6.t) g3Var.f304867c).f305066h.h();
                vc.s.j(eVarH);
                hk6.i iVar3 = new hk6.i(eVarH);
                l80.e eVarH2 = ((xf6.t) this.f297509b).f305066h.h();
                vc.s.j(eVarH2);
                return new com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.a(brPaymentExpiryDateUpdateScreenContract$InputData, iVar3, eVarH2);
            case 20:
                BrazilInboundOpenbankingDescriptor$InputData brazilInboundOpenbankingDescriptor$InputData = ((xf6.o) this.f297510c).f304969a;
                zja.a aVarA9 = ((ika.b) ((xf6.t) this.f297509b).z).a();
                vc.s.j(aVarA9);
                return new com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b(brazilInboundOpenbankingDescriptor$InputData, aVarA9, new rj6.b(), new rj6.a());
            case 21:
                xf6.q qVar = (xf6.q) this.f297510c;
                CrossBorderEasyBankTransferFlowContract$InputData crossBorderEasyBankTransferFlowContract$InputData = qVar.f304993a;
                xf6.t tVar = (xf6.t) this.f297509b;
                oe6.k kVar2 = (oe6.k) tVar.u.f305033y.get();
                vc.s.j(kVar2);
                n1 n1Var = tVar.k;
                oe6.a aVarA10 = n1Var.a();
                vc.s.j(aVarA10);
                i90.b bVar7 = new i90.b();
                xf6.t tVar2 = qVar.f304994b;
                r10.a aVar6 = new r10.a(tVar2.f305081t.e(), ((c21.b) tVar2.e).a());
                fm6.a aVar7 = new fm6.a();
                le6.a aVar8 = (le6.a) n1Var.k.get();
                vc.s.j(aVar8);
                fm6.b bVar8 = new fm6.b();
                im6.a aVar9 = new im6.a();
                gte.a aVarB3 = tVar.o.b();
                vc.s.j(aVarB3);
                return new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e(crossBorderEasyBankTransferFlowContract$InputData, kVar2, aVarA10, bVar7, aVar6, aVar7, aVar8, bVar8, aVar9, aVarB3);
            case 22:
                CrossBorderLinkAccountFlowContract$InputData crossBorderLinkAccountFlowContract$InputData = ((xf6.r) this.f297510c).f305011a;
                xf6.t tVar3 = (xf6.t) this.f297509b;
                n1 n1Var2 = tVar3.k;
                oe6.a aVarA11 = n1Var2.a();
                vc.s.j(aVarA11);
                xg6.l lVar3 = (xg6.l) tVar3.f305073n0.get();
                wj0.a aVarI = ((nj0.d) tVar3.d).i();
                vc.s.j(aVarI);
                do6.b bVar9 = (do6.b) tVar3.f305069k0.get();
                le6.c cVar2 = (le6.c) tVar3.f305074o0.get();
                hm6.a aVar10 = new hm6.a();
                fm6.a aVar11 = new fm6.a();
                le6.a aVar12 = (le6.a) n1Var2.k.get();
                vc.s.j(aVar12);
                return new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d(crossBorderLinkAccountFlowContract$InputData, aVarA11, lVar3, aVarI, bVar9, cVar2, aVar10, aVar11, aVar12, new im6.a());
            case 23:
                xf6.s sVar3 = (xf6.s) this.f297510c;
                EasyBankTransferFlowContract$InputData easyBankTransferFlowContract$InputData = sVar3.f305040a;
                xf6.t tVar4 = (xf6.t) this.f297509b;
                n1 n1Var3 = tVar4.k;
                le6.a aVar13 = (le6.a) n1Var3.k.get();
                vc.s.j(aVar13);
                oe6.k kVar3 = (oe6.k) tVar4.u.f305033y.get();
                vc.s.j(kVar3);
                oe6.a aVarA12 = n1Var3.a();
                vc.s.j(aVarA12);
                i90.b bVar10 = new i90.b();
                xf6.t tVar5 = sVar3.f305041b;
                r10.a aVar14 = new r10.a(tVar5.f305081t.e(), ((c21.b) tVar5.e).a());
                gte.a aVarB4 = tVar4.o.b();
                vc.s.j(aVarB4);
                return new com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e(easyBankTransferFlowContract$InputData, aVar13, kVar3, aVarA12, bVar10, aVar14, aVarB4);
            case 24:
                JapanEasyBankAuthorizationFlowContract$InputData japanEasyBankAuthorizationFlowContract$InputData = ((xf6.x) this.f297510c).f305153a;
                wve.a aVar15 = (wve.a) ((xf6.t) this.f297509b).A.d.get();
                vc.s.j(aVar15);
                return new com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow.b(japanEasyBankAuthorizationFlowContract$InputData, aVar15);
            case 25:
                JapanEasyBankTransferFlowContract$InputData japanEasyBankTransferFlowContract$InputData = ((xf6.y) this.f297510c).f305165a;
                oe6.a aVarA13 = ((xf6.t) this.f297509b).k.a();
                vc.s.j(aVarA13);
                return new com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer.a(japanEasyBankTransferFlowContract$InputData, aVarA13);
            case 26:
                xf6.t tVar6 = (xf6.t) this.f297509b;
                n1 n1Var4 = tVar6.k;
                oe6.a aVarA14 = n1Var4.a();
                vc.s.j(aVarA14);
                gte.a aVarB5 = tVar6.o.b();
                vc.s.j(aVarB5);
                xg6.l lVar4 = (xg6.l) tVar6.f305073n0.get();
                le6.c cVar3 = (le6.c) tVar6.f305074o0.get();
                le6.a aVar16 = (le6.a) n1Var4.k.get();
                vc.s.j(aVar16);
                LinkAccountFlowContract$InputData linkAccountFlowContract$InputData = ((xf6.z) this.f297510c).f305182a;
                wj0.a aVarI2 = ((nj0.d) tVar6.d).i();
                vc.s.j(aVarI2);
                return new com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d(aVarA14, aVarB5, lVar4, cVar3, aVar16, linkAccountFlowContract$InputData, aVarI2, (do6.b) tVar6.f305069k0.get());
            case 27:
                xf6.a0 a0Var = (xf6.a0) this.f297510c;
                LinkExternalAccountFlowContract$InputData linkExternalAccountFlowContract$InputData = a0Var.f304782a;
                xf6.t tVar7 = (xf6.t) this.f297509b;
                fk3.a aVarA15 = tVar7.f305071m.a();
                vc.s.j(aVarA15);
                xoj.a aVarA16 = tVar7.f305072n.a();
                vc.s.j(aVarA16);
                gte.a aVarB6 = tVar7.o.b();
                vc.s.j(aVarB6);
                y91.b bVarA = tVar7.f305075p.a();
                xf6.t tVar8 = a0Var.f304783b;
                oe6.a aVarA17 = tVar8.k.a();
                vc.s.j(aVarA17);
                return new com.revolut.feature.external_accounts.impl.ui.flow.link_external.b(linkExternalAccountFlowContract$InputData, aVarA15, aVarA16, aVarB6, bVarA, new vg6.p(aVarA17, tVar8.f305070l.b()));
            case 28:
                km6.c cVar4 = ((xf6.b0) this.f297510c).f304793a;
                f80.a aVarX = ((xf6.t) this.f297509b).f305066h.x();
                vc.s.j(aVarX);
                return new km6.g(cVar4, aVarX);
            default:
                xf6.f0 f0Var = (xf6.f0) this.f297510c;
                IndiaNetBankingFlowContract$InputData indiaNetBankingFlowContract$InputData = f0Var.f304844a;
                xf6.t tVar9 = (xf6.t) this.f297509b;
                sri.m mVar = (sri.m) tVar9.I.get();
                f61.a aVar17 = new f61.a((ig6.b) f0Var.f304845b.z0.get());
                wj0.a aVarI3 = ((nj0.d) tVar9.d).i();
                vc.s.j(aVarI3);
                return new com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b(indiaNetBankingFlowContract$InputData, mVar, aVar17, aVarI3, tVar9.g());
        }
    }
}
