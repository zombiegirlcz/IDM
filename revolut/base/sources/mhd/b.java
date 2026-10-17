package mhd;

import android.content.Context;
import com.revolut.biometric_verification.impl.ui.step.selfie_search.flow.BiometricVerificationSelfieSearchFlow;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.feature.apm.bills.postal_check.impl.ui.form.FormScreen;
import com.revolut.feature.apm.bills.postal_check.impl.ui.form.FormScreenContract$InputData;
import com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.flow.BizumTransferFlow;
import com.revolut.feature.card.verification.impl.screen.transaction_code.TransactionCodeScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting.WaitingPopupScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting.WaitingPopupScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreen;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.spei_details.CreditCardRepaySpeiDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.repay.spei_details.CreditCardRepaySpeiDetailsScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.crypto.tfr.validation.impl.action_required.ActionRequiredScreen;
import com.revolut.feature.crypto.tfr.validation.impl.action_required.ActionRequiredScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.us.plaid.flow.UsPlaidFlow;
import com.revolut.feature.external_accounts.impl.ui.us.plaid.flow.UsPlaidFlowContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.CFACInsuranceClaimFlow;
import com.revolut.feature.insurance.impl.ui.cfac.claim.CFACInsuranceClaimFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.DriverNumberInputScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.DriverNumberInputScreenContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.limits.JuniorSettingsLimitsScreen;
import com.revolut.feature.raffle.impl.screen.share_raffle.ShareRaffleScreen;
import com.revolut.feature.raffle.impl.screen.share_raffle.ShareRaffleScreenContract$InputData;
import com.revolut.feature.second_device_login.impl.ui.details.SecondDeviceLoginDetailsController;
import com.revolut.feature.second_device_login.impl.ui.details.SecondDeviceLoginDetailsControllerContract$InputData;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.WatchlistHomeScreen;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.WatchlistHomeScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.sheet.TravelRemoveWidgetContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.sheet.TravelRemoveWidgetController;
import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreen;
import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreenContract$InputData;
import com.revolut.feature.trading_orders.api.invest.placement.locked_period.SecurityAssetBalanceBreakdownScreenDescriptor$InputData;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.business_details.EsimMobilePlanPowerOfAttorneyBusinessDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.business_details.EsimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.TechnicalInsightsController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.TechnicalInsightsControllerContract$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.sso.impl.ui.manual_review.ManualReviewFlow;
import com.revolut.sso.impl.ui.manual_review.ManualReviewFlowContract$InputData;
import com.revolut.trading.orders.ui.invest.placement.security_asset_balance_breakdown.SecurityAssetBalanceBreakdownScreen;
import dw3.c1;
import dw3.j7;
import jm4.a3;
import jm4.d2;
import jm4.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mx0.a7;
import mx0.j4;
import ppd.x0;
import ppd.y0;
import ql7.e1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f205487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f205488c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f205486a = i;
        this.f205487b = obj2;
        this.f205488c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f205486a;
        Object obj2 = this.f205488c;
        Object obj3 = this.f205487b;
        switch (i) {
            case 0:
                WatchlistHomeScreen watchlistHomeScreen = (WatchlistHomeScreen) obj3;
                KProperty[] kPropertyArr = WatchlistHomeScreen.i0;
                qji.b bVarQ2 = watchlistHomeScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.di.WatchlistHomeComponent.Injector");
                vfd.b bVar = (vfd.b) bVarQ2;
                vfd.a aVar2 = bVar.f288575b;
                vfd.b bVar2 = bVar.f288576c;
                ScreenContentRecyclerView recyclerView = watchlistHomeScreen.h3().f174540c;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                return new vfd.c(aVar2, bVar2, (WatchlistHomeScreenContract$InputData) obj2, recyclerView, watchlistHomeScreen, watchlistHomeScreen, new o5d.b(watchlistHomeScreen.f86972h0));
            case 1:
                WaitingPopupScreen waitingPopupScreen = (WaitingPopupScreen) obj3;
                WaitingPopupScreenContract$InputData waitingPopupScreenContract$InputData = (WaitingPopupScreenContract$InputData) obj2;
                phm.a aVar3 = (phm.a) ue0.e.j(waitingPopupScreen.m2()).a().get(dw3.e.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new j7(((c1) ((dw3.e) aVar.b())).m0, waitingPopupScreen, waitingPopupScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
            case 2:
                CFACInsuranceClaimFlowContract$InputData.MakeClaim makeClaim = (CFACInsuranceClaimFlowContract$InputData.MakeClaim) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((CFACInsuranceClaimFlow) obj3).m2()).a().get(nk7.a.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new nk7.j(((nk7.q) aVar.b()).f216719h, makeClaim);
                }
                throw new IllegalStateException(a0.d.q("Api ", nk7.a.class, " is not found"));
            case 3:
                InvestSettingsScreen investSettingsScreen = (InvestSettingsScreen) obj3;
                InvestSettingsScreenContract$InputData investSettingsScreenContract$InputData = (InvestSettingsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr2 = InvestSettingsScreen.f0;
                phm.a aVar5 = (phm.a) ue0.e.j(investSettingsScreen.m2()).a().get(gke.a.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new ske.b(((ske.c) aVar.b()).f263861a0, investSettingsScreen, investSettingsScreenContract$InputData, new kdh.b(investSettingsScreen), new kge.d(investSettingsScreen));
                }
                throw new IllegalStateException(a0.d.q("Api ", gke.a.class, " is not found"));
            case 4:
                KProperty[] kPropertyArr3 = EsimMobilePlanPowerOfAttorneyBusinessDetailsScreen.Q;
                qji.b bVarU2 = ((EsimMobilePlanPowerOfAttorneyBusinessDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.business_details.di.EsimMobilePlanPowerOfAttorneyBusinessDetailsScreenInjector");
                afj.n0 n0Var = (afj.n0) bVarU2;
                return new afj.m0(n0Var.f4355b, n0Var.f4356c, (EsimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData) obj2);
            case 5:
                return com.bumptech.glide.c.e((String) obj3, olm.c.f226469c, new SerialDescriptor[0], new mlm.e((mlm.f) obj2, 0));
            case 6:
                ActionRequiredScreenContract$InputData actionRequiredScreenContract$InputData = (ActionRequiredScreenContract$InputData) obj2;
                phm.a aVar6 = (phm.a) ue0.e.j(((ActionRequiredScreen) obj3).m2()).a().get(um5.c.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar != null) {
                    return new um5.a(((um5.c) aVar.b()).f281237h, actionRequiredScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", um5.c.class, " is not found"));
            case 7:
                CarOnboardingFlowContract$InputData carOnboardingFlowContract$InputData = (CarOnboardingFlowContract$InputData) obj2;
                phm.a aVar7 = (phm.a) ue0.e.j(((CarOnboardingFlow) obj3).m2()).a().get(fl7.a.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar != null) {
                    return new ql7.n(((ql7.k0) aVar.b()).f247359n, carOnboardingFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", fl7.a.class, " is not found"));
            case 8:
                ManualReviewFlow manualReviewFlow = (ManualReviewFlow) obj3;
                return new ljl.b0(((ljl.q0) kli.a.n(manualReviewFlow.m2())).E, manualReviewFlow, (ManualReviewFlowContract$InputData) obj2);
            case 9:
                UsPlaidFlowContract$InputData usPlaidFlowContract$InputData = (UsPlaidFlowContract$InputData) obj2;
                phm.a aVar8 = (phm.a) ue0.e.j(((UsPlaidFlow) obj3).m2()).a().get(je6.g.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", je6.g.class, " is not found"));
                }
                xf6.t tVar = ((xf6.t) aVar.b()).B;
                usPlaidFlowContract$InputData.getClass();
                return new xf6.q0(tVar, usPlaidFlowContract$InputData);
            case 10:
                mo8.e eVar = (mo8.e) obj2;
                KProperty[] kPropertyArr4 = JuniorSettingsLimitsScreen.Q;
                phm.a aVar9 = (phm.a) ue0.e.j(((JuniorSettingsLimitsScreen) obj3).m2()).a().get(mn8.o.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new mn8.n(((mn8.o) aVar.b()).f207476w, eVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", mn8.o.class, " is not found"));
            case 11:
                KProperty[] kPropertyArr5 = DriverNumberInputScreen.Q;
                qji.b bVarU22 = ((DriverNumberInputScreen) obj3).U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.di.DriverNumberInputScreenInjector");
                e1 e1Var = (e1) bVarU22;
                return new ql7.c0(e1Var.f247285b, e1Var.f247286c, (DriverNumberInputScreenContract$InputData) obj2);
            case 12:
                CollateralMoveMoneyScreen collateralMoveMoneyScreen = (CollateralMoveMoneyScreen) obj3;
                CollateralMoveMoneyScreenContract$InputData collateralMoveMoneyScreenContract$InputData = (CollateralMoveMoneyScreenContract$InputData) obj2;
                KProperty[] kPropertyArr6 = CollateralMoveMoneyScreen.X;
                phm.a aVar10 = (phm.a) ue0.e.j(collateralMoveMoneyScreen.m2()).a().get(a3.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new jm4.e0(((a3) aVar.b()).Y, collateralMoveMoneyScreen, collateralMoveMoneyScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 13:
                FormScreenContract$InputData formScreenContract$InputData = (FormScreenContract$InputData) obj2;
                KProperty[] kPropertyArr7 = FormScreen.Q;
                phm.a aVar11 = (phm.a) ue0.e.j(((FormScreen) obj3).m2()).a().get(ir1.i.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new ir1.c(((ir1.e) ((ir1.i) aVar.b())).i, formScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ir1.i.class, " is not found"));
            case 14:
                BizumTransferInputData bizumTransferInputData = (BizumTransferInputData) obj2;
                phm.a aVar12 = (phm.a) ue0.e.j(((BizumTransferFlow) obj3).m2()).a().get(ms1.j.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", ms1.j.class, " is not found"));
                }
                Object objB = aVar.b();
                Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.apm.bizum.impl.ui.transfer.flow.di.BizumTransferFlowInjector");
                ms1.j jVar = ((ms1.j) objB).B;
                bizumTransferInputData.getClass();
                return new ms1.t(jVar, bizumTransferInputData);
            case 15:
                ShareRaffleScreen shareRaffleScreen = (ShareRaffleScreen) obj3;
                KProperty[] kPropertyArr8 = ShareRaffleScreen.P;
                qji.b bVarU23 = shareRaffleScreen.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.raffle.impl.screen.share_raffle.di.ShareRaffleScreenInjector");
                fta.c cVar = (fta.c) bVarU23;
                return new fta.f(cVar.f137989b, cVar.f137990c, shareRaffleScreen, (ShareRaffleScreenContract$InputData) obj2);
            case 16:
                KProperty[] kPropertyArr9 = SecondDeviceLoginDetailsController.P;
                qji.b bVarU24 = ((SecondDeviceLoginDetailsController) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.second_device_login.impl.ui.flow.di.SecondDeviceLoginFlowComponent");
                htc.d dVar = (htc.d) bVarU24;
                return new htc.c(dVar.f155353b, dVar.f155354c, (SecondDeviceLoginDetailsControllerContract$InputData) obj2);
            case 17:
                TravelRemoveWidgetController travelRemoveWidgetController = (TravelRemoveWidgetController) obj3;
                TravelRemoveWidgetContract$InputData travelRemoveWidgetContract$InputData = (TravelRemoveWidgetContract$InputData) obj2;
                KProperty[] kPropertyArr10 = TravelRemoveWidgetController.Q;
                qji.b bVarU25 = travelRemoveWidgetController.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.sheet.di.TravelRemoveWidgetComponentScreenInjector");
                y0 y0Var = (y0) bVarU25;
                ppd.n nVar = y0Var.f238581b;
                y0 y0Var2 = y0Var.f238582c;
                phm.a aVar13 = (phm.a) ue0.e.j(travelRemoveWidgetController.m2()).a().get(fc7.b.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", fc7.b.class, " is not found"));
                }
                ash.i iVarI = ((tc7.d) ((fc7.b) aVar.b())).i();
                iVarI.getClass();
                return new x0(nVar, y0Var2, travelRemoveWidgetContract$InputData, iVarI);
            case 18:
                pr.q qVarQ = pu7.a.q(((BiometricVerificationSelfieSearchFlow) obj3).m2());
                Intrinsics.i(qVarQ, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.selfie_search.flow.di.BiometricVerificationSelfieSearchFlowInjector");
                return new pr.f0(qVarQ.f238875l, (mu.c) obj2);
            case 19:
                KProperty[] kPropertyArr11 = CreditCardRepaySpeiDetailsScreen.S;
                qji.b bVarU26 = ((CreditCardRepaySpeiDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay.spei_details.di.CreditCardRepaySpeiDetailsScreenInjector");
                z1 z1Var = (z1) bVarU26;
                return new d2(z1Var.f176466b, z1Var.f176467c, (CreditCardRepaySpeiDetailsScreenContract$InputData) obj2);
            case 20:
                ((mu4.g) obj3).X1(new mii.f("id_repay_spei_details_dialog_success_copy_to_clipboard", new TextLocalisedClause(R$string.credit_card_payment_spei_text_copied, zhm.u.c((String) obj2), null, 12), null, null, null, null, 124));
                return Unit.f186387a;
            case 21:
                TechnicalInsightsController technicalInsightsController = (TechnicalInsightsController) obj3;
                KProperty[] kPropertyArr12 = TechnicalInsightsController.T;
                qji.b bVarR1 = technicalInsightsController.z2().R1();
                Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.di.TechnicalInsightsControllerInjector");
                prk.x xVar = (prk.x) bVarR1;
                prk.g0 g0Var = xVar.f239310b;
                prk.x xVar2 = xVar.f239311c;
                avk.j jVar2 = technicalInsightsController.S;
                jVar2.getClass();
                return new prk.l0(g0Var, xVar2, (TechnicalInsightsControllerContract$InputData) obj2, jVar2);
            case 22:
                SecurityAssetBalanceBreakdownScreenDescriptor$InputData securityAssetBalanceBreakdownScreenDescriptor$InputData = (SecurityAssetBalanceBreakdownScreenDescriptor$InputData) obj2;
                int i2 = SecurityAssetBalanceBreakdownScreen.V;
                phm.a aVar14 = (phm.a) ue0.e.j(((SecurityAssetBalanceBreakdownScreen) obj3).m2()).a().get(xsl.p.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                }
                xsl.p pVar = ((xsl.p) aVar.b()).O;
                securityAssetBalanceBreakdownScreenDescriptor$InputData.getClass();
                return new xsl.m(pVar, securityAssetBalanceBreakdownScreenDescriptor$InputData);
            case 23:
                KProperty[] kPropertyArr13 = TransactionCodeScreen.Q;
                qji.b bVarU27 = ((TransactionCodeScreen) obj3).U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.card.verification.impl.screen.transaction_code.di.TransactionCodeScreenInjector");
                ev2.d dVar2 = (ev2.d) bVarU27;
                return new ev2.f(dVar2.f129691b, dVar2.f129692c, (mv2.d) obj2);
            case 24:
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_dialog_insufficient_funds_subtitle_fund_or_switch_account, zhm.u.c(e4i.c.a((Amount) obj2, null, null, null, null, null, 63)), null, 12);
                ((mvl.b) obj3).getClass();
                return mvl.b.h(textLocalisedClause);
            case 25:
                ChatInputView chatInputView = (ChatInputView) obj3;
                Context context = (Context) obj2;
                int i3 = chatInputView.D;
                urg.a aVar15 = chatInputView.m0;
                if (aVar15 != null) {
                    return new j4(context, chatInputView, i3, aVar15);
                }
                Intrinsics.r("recordAudioViewModel");
                throw null;
            case 26:
                com.revolut.core.ui_kit.views.o oVar = (com.revolut.core.ui_kit.views.o) obj3;
                oVar.f59581x.e(oVar);
                ((lki.s) obj2).invoke();
                return Unit.f186387a;
            case 27:
                return ((com.google.firebase.messaging.t) obj3).f(new a7((my7.b) obj2, 13));
            case 28:
                return ((com.google.firebase.messaging.t) obj3).f(new a7((du8.b) obj2, 14));
            default:
                return ((com.google.firebase.messaging.t) obj3).f(new a7((my7.d) obj2, 15));
        }
    }
}
