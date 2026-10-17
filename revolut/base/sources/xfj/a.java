package xfj;

import afj.m;
import amh.f;
import com.revolut.feature.business.referrals.ui.screens.eligibility_criteria.EligibilityCriteriaScreen;
import com.revolut.feature.business.referrals.ui.screens.eligibility_criteria.EligibilityCriteriaScreenContract$InputData;
import com.revolut.feature.card_management.impl.ui.change_pin.ChangePinFlow;
import com.revolut.feature.card_management.impl.ui.change_pin.ChangePinFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreen;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.revpoints_locked.CreditCardRevPointsLockedBottomDialogScreen;
import com.revolut.feature.credit.card.impl.ui.revpoints_locked.CreditCardRevPointsLockedBottomDialogScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_details.details.CreditCardStatementDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.statement_details.details.CreditCardStatementDetailsScreenContract$InputData;
import com.revolut.feature.crypto.tfr.validation.api.navigation.TfrValidationFlowContract$InputData;
import com.revolut.feature.crypto.tfr.validation.impl.flow.TfrValidationFlow;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlow;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlowContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.expense_details.CFACClaimExpenseDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.expense_details.CFACClaimExpenseDetailsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.unplugged.TelematicsDeviceUnpluggedScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.unplugged.TelematicsDeviceUnpluggedScreenContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.reward.ChallengeEditRewardScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.reward.ChallengeEditRewardScreenContract$InputData;
import com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.DocumentScanFlow;
import com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.DocumentScanFlowContract$InputData;
import com.revolut.feature.pay_with_smile.impl.ui.consent.PayWithSmileConsentScreen;
import com.revolut.feature.pay_with_smile.impl.ui.consent.PayWithSmileConsentScreenContract$InputData;
import com.revolut.feature.rev_points.buying.api.navigation.InputData;
import com.revolut.feature.rev_points.buying.impl.ui.flow.RevPointsBuyingFlow;
import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsPurchaseController$InputData;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.RevPointsGiftCardPurchaseScreen;
import com.revolut.feature.robo.impl.ui.screen.acknowledgement.AgreementsScreen;
import com.revolut.feature.robo.impl.ui.screen.acknowledgement.AgreementsScreenContract$Input;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.review_details.ReviewDetailsScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.review_details.ReviewDetailsScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.common_linked_wallets_tab.CommonLinkedWalletsTabScreen;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.common_linked_wallets_tab.CommonLinkedWalletsTabScreenContract$InputData;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.impl.unstake.v2.UnstakeController;
import com.revolut.feature.tax_residency.impl.flows.collection.CollectTaxResidencyFlow;
import com.revolut.feature.tax_residency.impl.flows.collection.CollectTaxResidencyFlowContract$InputData;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreen;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreenContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.WithdrawMoneyFlowContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.with_result_navigation.WithdrawMoneyWithResultNavigationFlow;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.review_closure_conditions.ReviewClosureConditionsBottomSheetController;
import com.revolut.feature.wealth.ui.impl.statements.flow.StatementFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlowContract$InputData;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreen;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreenContract$InputData;
import dmc.i;
import ggk.u0;
import ine.o;
import jm4.a3;
import jm4.f2;
import jm4.m4;
import jm4.n2;
import jm4.w3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lpf.y;
import mkh.s;
import mkh.u;
import nk7.q;
import nk7.r;
import nsf.j;
import ql7.j1;
import tl9.g;
import ue0.e;
import um5.h;
import vtc.t;
import xkk.n;
import zpc.k;
import zpc.l;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f305434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f305435c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f305433a = i;
        this.f305434b = obj2;
        this.f305435c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f305433a;
        Object obj2 = this.f305435c;
        Object obj3 = this.f305434b;
        switch (i) {
            case 0:
                EsimHomeFlow esimHomeFlow = (EsimHomeFlow) obj3;
                EsimHomeFlowContract$InputData esimHomeFlowContract$InputData = (EsimHomeFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) e.j(esimHomeFlow.m2()).a().get(afj.b.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new m(((afj.b) aVar.b()).D, esimHomeFlow, esimHomeFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
            case 1:
                CFACClaimExpenseDetailsScreenContract$InputData cFACClaimExpenseDetailsScreenContract$InputData = (CFACClaimExpenseDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr = CFACClaimExpenseDetailsScreen.f75139b0;
                qji.b bVarQ2 = ((CFACClaimExpenseDetailsScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.my_claims.expense_details.di.CFACClaimExpenseDetailsScreenInjector");
                r rVar = (r) bVarQ2;
                q qVar = rVar.f216721b;
                r rVar2 = rVar.f216722c;
                cFACClaimExpenseDetailsScreenContract$InputData.getClass();
                return new nk7.d(qVar, rVar2, cFACClaimExpenseDetailsScreenContract$InputData);
            case 2:
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a aVar3 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a) obj3;
                aVar3.l2(new n(aVar3, (u0) obj2, (Continuation) null), new yi5.b(26));
                return Unit.f186387a;
            case 3:
                PayWithSmileConsentScreenContract$InputData payWithSmileConsentScreenContract$InputData = (PayWithSmileConsentScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = PayWithSmileConsentScreen.S;
                phm.a aVar4 = (phm.a) e.j(((PayWithSmileConsentScreen) obj3).m2()).a().get(g.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new tl9.d(((tl9.c) ((g) aVar.b())).k, payWithSmileConsentScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
            case 4:
                f fVar = (f) obj2;
                phm.a aVar5 = (phm.a) e.j(((StatementFlow) obj3).m2()).a().get(vhh.a.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new mkh.m(((s) ((u) aVar.b())).l0, fVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
            case 5:
                TfrValidationFlowContract$InputData tfrValidationFlowContract$InputData = (TfrValidationFlowContract$InputData) obj2;
                phm.a aVar6 = (phm.a) e.j(((TfrValidationFlow) obj3).m2()).a().get(um5.c.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", um5.c.class, " is not found"));
                }
                um5.c cVar = ((um5.c) aVar.b()).f281237h;
                tfrValidationFlowContract$InputData.getClass();
                return new h(cVar, tfrValidationFlowContract$InputData);
            case 6:
                KProperty[] kPropertyArr3 = AgreementsScreen.f85128b0;
                qji.b bVarQ22 = ((AgreementsScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.robo.impl.ui.screen.acknowledgement.di.AgreementsScreenInjector");
                i iVar = (i) bVarQ22;
                return new dmc.d(iVar.f115968b, iVar.f115969c, (AgreementsScreenContract$Input) obj2);
            case 7:
                CollectTaxResidencyFlowContract$InputData collectTaxResidencyFlowContract$InputData = (CollectTaxResidencyFlowContract$InputData) obj2;
                phm.a aVar7 = (phm.a) e.j(((CollectTaxResidencyFlow) obj3).m2()).a().get(o.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar != null) {
                    return new ine.b(((o) aVar.b()).f162885l, collectTaxResidencyFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
            case 8:
                KProperty[] kPropertyArr4 = ChallengeEditRewardScreen.R;
                qji.b bVarU2 = ((ChallengeEditRewardScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.reward.di.ChallengeEditRewardScreenComponent.Injector");
                gp8.i iVar2 = (gp8.i) bVarU2;
                return new gp8.h(iVar2.f145310b, iVar2.f145311c, (ChallengeEditRewardScreenContract$InputData) obj2);
            case 9:
                ScheduleTransferScreen scheduleTransferScreen = (ScheduleTransferScreen) obj3;
                ScheduleTransferInputData scheduleTransferInputData = (ScheduleTransferInputData) obj2;
                ScheduleTransferScreen.Companion aVar8 = ScheduleTransferScreen.INSTANCE;
                phm.a aVar9 = (phm.a) e.j(scheduleTransferScreen.m2()).a().get(wof.a.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new lpf.g(((lpf.i) ((y) aVar.b())).o, scheduleTransferScreen, scheduleTransferInputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", wof.a.class, " is not found"));
            case 10:
                RateDetailsScreen rateDetailsScreen = (RateDetailsScreen) obj3;
                RateDetailsScreenContract$InputData rateDetailsScreenContract$InputData = (RateDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr5 = RateDetailsScreen.f103723e0;
                phm.a aVar10 = (phm.a) e.j(rateDetailsScreen.m2()).a().get(npk.c.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new npk.d(((npk.c) aVar.b()).f218255l, rateDetailsScreen, rateDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", npk.c.class, " is not found"));
            case 11:
                CreditCardDescriptionScreen creditCardDescriptionScreen = (CreditCardDescriptionScreen) obj3;
                CreditCardDescriptionScreenContract$InputData creditCardDescriptionScreenContract$InputData = (CreditCardDescriptionScreenContract$InputData) obj2;
                KProperty[] kPropertyArr6 = CreditCardDescriptionScreen.f69205e0;
                phm.a aVar11 = (phm.a) e.j(creditCardDescriptionScreen.m2()).a().get(a3.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return (w3) ((yq4.c) ((yq4.d) aVar.b()).q().O(creditCardDescriptionScreenContract$InputData).S(creditCardDescriptionScreen)).mo3800build();
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 12:
                KProperty[] kPropertyArr7 = TelematicsDeviceUnpluggedScreen.f75679b0;
                qji.b bVarQ23 = ((TelematicsDeviceUnpluggedScreen) obj3).Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.unplugged.di.TelematicsDeviceUnpluggedScreenInjector");
                ql7.o oVar = (ql7.o) bVarQ23;
                return new j1(oVar.f247408b, oVar.f247409c, (TelematicsDeviceUnpluggedScreenContract$InputData) obj2);
            case 13:
                ReviewDetailsScreenContract$InputData reviewDetailsScreenContract$InputData = (ReviewDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr8 = ReviewDetailsScreen.P;
                qji.b bVarU22 = ((ReviewDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.salary_switch.impl.ui.brazil.screen.review_details.di.ReviewDetailsScreenInjector");
                l lVar = (l) bVarU22;
                k kVar = lVar.f324270b;
                l lVar2 = lVar.f324271c;
                reviewDetailsScreenContract$InputData.getClass();
                return new zpc.f(kVar, lVar2, reviewDetailsScreenContract$InputData);
            case 14:
                WithdrawMoneyFlowContract$InputData withdrawMoneyFlowContract$InputData = (WithdrawMoneyFlowContract$InputData) obj2;
                phm.a aVar12 = (phm.a) e.j(((WithdrawMoneyWithResultNavigationFlow) obj3).m2()).a().get(fpg.c.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return new wpg.n(((wpg.l) aVar.b()).F, withdrawMoneyFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
            case 15:
                EligibilityCriteriaScreen eligibilityCriteriaScreen = (EligibilityCriteriaScreen) obj3;
                qji.b bVarU23 = eligibilityCriteriaScreen.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.business.referrals.ui.screens.eligibility_criteria.di.EligibilityCriteriaScreenInjector");
                us2.h hVar = (us2.h) bVarU23;
                return new us2.c(hVar.f282403b, hVar.f282404c, eligibilityCriteriaScreen, (EligibilityCriteriaScreenContract$InputData) obj2);
            case 16:
                TransferReasonsAdditionalInfoScreen transferReasonsAdditionalInfoScreen = (TransferReasonsAdditionalInfoScreen) obj3;
                TransferReasonsAdditionalInfoScreenContract$InputData transferReasonsAdditionalInfoScreenContract$InputData = (TransferReasonsAdditionalInfoScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = TransferReasonsAdditionalInfoScreen.T;
                qji.b bVarU24 = transferReasonsAdditionalInfoScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.additional_info.di.TransferReasonsAdditionalInfoScreenInjector");
                nsf.i iVar3 = (nsf.i) ((ysf.a) bVarU24).s().mo3808a(transferReasonsAdditionalInfoScreen);
                switch (iVar3.f218823a) {
                    case 0:
                        iVar3.d = transferReasonsAdditionalInfoScreenContract$InputData;
                        break;
                    default:
                        iVar3.d = transferReasonsAdditionalInfoScreenContract$InputData;
                        break;
                }
                return (j) iVar3.mo3783build();
            case 17:
                ((xu0.b) obj3).a((vu0.r) obj2);
                return Unit.f186387a;
            case 18:
                CreditCardRevPointsLockedBottomDialogScreenContract$InputData creditCardRevPointsLockedBottomDialogScreenContract$InputData = (CreditCardRevPointsLockedBottomDialogScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = CreditCardRevPointsLockedBottomDialogScreen.Q;
                phm.a aVar13 = (phm.a) e.j(((CreditCardRevPointsLockedBottomDialogScreen) obj3).m2()).a().get(a3.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar != null) {
                    return new f2(((a3) aVar.b()).Y, creditCardRevPointsLockedBottomDialogScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 19:
                InputData inputData = (InputData) obj2;
                phm.a aVar14 = (phm.a) e.j(((RevPointsBuyingFlow) obj3).m2()).a().get(vub.a.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", vub.a.class, " is not found"));
                }
                vub.a aVar15 = ((vub.a) aVar.b()).i;
                inputData.getClass();
                return new vub.c(aVar15, inputData);
            case 20:
                CommonLinkedWalletsTabScreenContract$InputData commonLinkedWalletsTabScreenContract$InputData = (CommonLinkedWalletsTabScreenContract$InputData) obj2;
                KProperty[] kPropertyArr11 = CommonLinkedWalletsTabScreen.R;
                phm.a aVar16 = (phm.a) e.j(((CommonLinkedWalletsTabScreen) obj3).m2()).a().get(t.class);
                aVar = aVar16 != null ? (b60.a) aVar16.get() : null;
                if (aVar != null) {
                    return new vtc.c(((t) aVar.b()).M, commonLinkedWalletsTabScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
            case 21:
                int i2 = ReviewClosureConditionsBottomSheetController.U;
                qji.b bVarU25 = ((ReviewClosureConditionsBottomSheetController) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.review_closure_conditions.di.ReviewClosureConditionsBottomSheetComponent.Injector");
                return new ztg.l((xug.h) obj2);
            case 22:
                Function0 function0 = (Function0) obj2;
                ((xv0.m) obj3).setItemRenderState(xv0.e.f309148a);
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 23:
                CreditCardStatementDetailsScreen creditCardStatementDetailsScreen = (CreditCardStatementDetailsScreen) obj3;
                KProperty[] kPropertyArr12 = CreditCardStatementDetailsScreen.V;
                qji.b bVarU26 = creditCardStatementDetailsScreen.U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.statement_details.details.di.CreditCardStatementDetailsScreenInjector");
                n2 n2Var = (n2) bVarU26;
                return new m4(n2Var.f176216b, n2Var.f176217c, creditCardStatementDetailsScreen, (CreditCardStatementDetailsScreenContract$InputData) obj2);
            case 24:
                ((xvi.g) obj3).f309281a.getContentResolver().unregisterContentObserver((gti.g) obj2);
                return Unit.f186387a;
            case 25:
                CryptoCommodityBuyCollectionFlow cryptoCommodityBuyCollectionFlow = (CryptoCommodityBuyCollectionFlow) obj3;
                CryptoCommodityBuyCollectionFlowContract$InputData cryptoCommodityBuyCollectionFlowContract$InputData = (CryptoCommodityBuyCollectionFlowContract$InputData) obj2;
                phm.a aVar17 = (phm.a) e.j(cryptoCommodityBuyCollectionFlow.m2()).a().get(mw5.l.class);
                aVar = aVar17 != null ? (b60.a) aVar17.get() : null;
                if (aVar != null) {
                    return new mw5.j(((mw5.l) aVar.b()).f209388x, cryptoCommodityBuyCollectionFlow, cryptoCommodityBuyCollectionFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", mw5.l.class, " is not found"));
            case 26:
                RevPointsGiftcardsPurchaseController$InputData revPointsGiftcardsPurchaseController$InputData = (RevPointsGiftcardsPurchaseController$InputData) obj2;
                int i3 = RevPointsGiftCardPurchaseScreen.V;
                phm.a aVar18 = (phm.a) e.j(((RevPointsGiftCardPurchaseScreen) obj3).m2()).a().get(iwb.e.class);
                aVar = aVar18 != null ? (b60.a) aVar18.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                }
                iwb.e eVar = ((iwb.e) aVar.b()).f169026r;
                revPointsGiftcardsPurchaseController$InputData.getClass();
                return new iwb.a(eVar, revPointsGiftcardsPurchaseController$InputData);
            case 27:
                UnstakeController unstakeController = (UnstakeController) obj3;
                StakingPocket stakingPocket = (StakingPocket) obj2;
                UnstakeController.Companion aVar19 = UnstakeController.INSTANCE;
                phm.a aVar20 = (phm.a) e.j(unstakeController.m2()).a().get(qud.c.class);
                aVar = aVar20 != null ? (b60.a) aVar20.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", qud.c.class, " is not found"));
                }
                Object objB = aVar.b();
                Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.staking.impl.declaration.di.StakingApiComponent");
                qud.c cVar2 = ((qud.c) objB).f249379y;
                stakingPocket.getClass();
                return new qud.h(cVar2, unstakeController, stakingPocket);
            case 28:
                DocumentScanFlowContract$InputData documentScanFlowContract$InputData = (DocumentScanFlowContract$InputData) obj2;
                phm.a aVar21 = (phm.a) e.j(((DocumentScanFlow) obj3).m2()).a().get(qy8.a.class);
                aVar = aVar21 != null ? (b60.a) aVar21.get() : null;
                if (aVar != null) {
                    return new qy8.b(((qy8.a) aVar.b()).d, documentScanFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", qy8.a.class, " is not found"));
            default:
                ChangePinFlowContract$InputData changePinFlowContract$InputData = (ChangePinFlowContract$InputData) obj2;
                phm.a aVar22 = (phm.a) e.j(((ChangePinFlow) obj3).m2()).a().get(tz2.e.class);
                aVar = aVar22 != null ? (b60.a) aVar22.get() : null;
                if (aVar != null) {
                    return new tz2.k(((tz2.e) aVar.b()).f275770s, changePinFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", tz2.e.class, " is not found"));
        }
    }
}
