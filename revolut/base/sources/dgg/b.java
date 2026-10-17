package dgg;

import android.app.Activity;
import androidx.compose.foundation.FocusableNode;
import com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.BiometricVerificationManualInputContract$InputData;
import com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.BiometricVerificationManualInputViewController;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreenContract$InputData;
import com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.ReferralCampaignStateScreen;
import com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.ReferralCampaignStateScreenContract$InputData;
import com.revolut.feature.card_management.impl.ui.kompot.RevolutCardSettingsFlow;
import com.revolut.feature.card_management.impl.ui.kompot.RevolutCardSettingsFlowContract$InputData;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.ContactDetailsScreen;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.ContactDetailsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.RefinancingAccountDetailsHomeController;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.RefinancingAccountDetailsHomeScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.term.InstalmentTermScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.term.InstalmentTermScreenContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.confirmation.CryptoCommodityBuyCollectionConfirmationScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.confirmation.CryptoCommodityBuyCollectionConfirmationScreenContract$InputData;
import com.revolut.feature.customer_present.tips.impl.screen.custom_tip.CustomTipScreen;
import com.revolut.feature.customer_present.tips.impl.screen.custom_tip.CustomTipScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation_details.CancellationDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation_details.CancellationDetailsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.list.UploadDocumentsListScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.list.UploadDocumentsListScreenContract$InputData;
import com.revolut.feature.junior_transfer.impl.ui.flow.transfer.JuniorTransferFlow;
import com.revolut.feature.junior_transfer.impl.ui.flow.transfer.JuniorTransferFlowContract$InputData;
import com.revolut.feature.pay_later.impl.ui.plandetails.PayLaterPlanDetailsScreen;
import com.revolut.feature.pay_later.impl.ui.plandetails.PayLaterPlanDetailsScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.pick_your_rate.PickYourRateScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.pick_your_rate.PickYourRateScreenContract$InputData;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreen;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.add_to_click_to_pay.AddToClickToPayScreen;
import com.revolut.feature.security_hub.impl.ui.add_to_click_to_pay.AddToClickToPayScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.widget_watchlist_selector.WidgetSelectorScreen;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.widget_watchlist_selector.WidgetSelectorScreenContract$InputData;
import com.revolut.feature.tax_residency.impl.flows.single_tin.SingleTinCollectionFlow;
import com.revolut.feature.tax_residency.impl.flows.single_tin.SingleTinCollectionFlowContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlow;
import com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlowContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.allocation.WidgetisedAnalyticsAllocationScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.allocation.WidgetisedAnalyticsAllocationScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.collection.popular_first_buy.PopularFirstBuyScreen;
import com.revolut.feature.wealth_discovery.impl.collection.popular_first_buy.PopularFirstBuyScreenContract$Input;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.GiaOnboardingFailedFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.GiaOnboardingFailedFlowContract$InputData;
import com.revolut.sso.impl.ui.consent.common.select_identity.SelectIdentityScreen;
import com.revolut.sso.impl.ui.consent.common.select_identity.SelectIdentityScreenContract$InputData;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.ConnectedAppDetailsFlow;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.ConnectedAppDetailsFlowContract$InputData;
import dmc.v;
import dw3.k5;
import dw3.l5;
import ine.i;
import ine.o;
import jm4.a3;
import jm4.e1;
import jm4.k3;
import jm4.l3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.s;
import kotlin.reflect.KProperty;
import kyk.y;
import ljl.m0;
import ljl.r0;
import mjl.m;
import mjl.q;
import oi9.k;
import oq8.f;
import p2k.n;
import pr.i0;
import pr.j0;
import ql7.k1;
import ql7.l1;
import ue0.e;
import ufg.g;
import ufg.r;
import vgd.h;
import vl3.j;
import vl3.l;
import vtc.t;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f114661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f114662c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f114660a = i;
        this.f114661b = obj2;
        this.f114662c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f114660a;
        Object obj2 = this.f114662c;
        Object obj3 = this.f114661b;
        switch (i) {
            case 0:
                TravelMilesFlowContract$InputData travelMilesFlowContract$InputData = (TravelMilesFlowContract$InputData) obj2;
                phm.a aVar2 = (phm.a) e.j(((TravelMilesFlow) obj3).m2()).a().get(ffg.a.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new r(((g) aVar.b()).A, travelMilesFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", ffg.a.class, " is not found"));
            case 1:
                RefinancingAccountDetailsHomeController refinancingAccountDetailsHomeController = (RefinancingAccountDetailsHomeController) obj3;
                KProperty[] kPropertyArr = RefinancingAccountDetailsHomeController.T;
                qji.b bVarU2 = refinancingAccountDetailsHomeController.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.di.RefinancingAccountDetailsHomeScreenInjector");
                k5 k5Var = (k5) bVarU2;
                return new l5(k5Var.f119118c, k5Var.d, refinancingAccountDetailsHomeController, (RefinancingAccountDetailsHomeScreenContract$InputData) obj2);
            case 2:
                WidgetSelectorScreenContract$InputData widgetSelectorScreenContract$InputData = (WidgetSelectorScreenContract$InputData) obj2;
                int i2 = WidgetSelectorScreen.T;
                phm.a aVar3 = (phm.a) e.j(((WidgetSelectorScreen) obj3).m2()).a().get(vgd.b.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new h(((vgd.b) aVar.b()).e, widgetSelectorScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vgd.b.class, " is not found"));
            case 3:
                PayLaterPlanDetailsScreen payLaterPlanDetailsScreen = (PayLaterPlanDetailsScreen) obj3;
                KProperty[] kPropertyArr2 = PayLaterPlanDetailsScreen.j0;
                return new k(s.n(payLaterPlanDetailsScreen.m2()).v, payLaterPlanDetailsScreen, (PayLaterPlanDetailsScreenContract$InputData) obj2);
            case 4:
                ContactDetailsScreen contactDetailsScreen = (ContactDetailsScreen) obj3;
                KProperty[] kPropertyArr3 = ContactDetailsScreen.X;
                qji.b bVarU22 = contactDetailsScreen.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.contacts.impl.ui.contact.screen.details.di.ContactDetailsScreenInjector");
                l lVar = (l) bVarU22;
                return new j(lVar.f290220b, lVar.f290221c, contactDetailsScreen, (ContactDetailsScreenContract$InputData) obj2);
            case 5:
                PickYourRateScreen pickYourRateScreen = (PickYourRateScreen) obj3;
                KProperty[] kPropertyArr4 = PickYourRateScreen.V;
                qji.b bVarU23 = pickYourRateScreen.U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.pick_your_rate.di.PickYourRateScreenInjector");
                rlb.g gVar = (rlb.g) bVarU23;
                return new rlb.b(gVar.f254990b, gVar.f254991c, pickYourRateScreen, (PickYourRateScreenContract$InputData) obj2);
            case 6:
                KProperty[] kPropertyArr5 = SelectIdentityScreen.R;
                qji.b bVarU24 = ((SelectIdentityScreen) obj3).U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.sso.impl.ui.consent.common.select_identity.di.SelectIdentityScreenInjector");
                m0 m0Var = (m0) bVarU24;
                return new r0(m0Var.f196030c, m0Var.d, (SelectIdentityScreenContract$InputData) obj2);
            case 7:
                PortfolioAllocationsDetailsScreen portfolioAllocationsDetailsScreen = (PortfolioAllocationsDetailsScreen) obj3;
                PortfolioAllocationsDetailsScreenContract$InputData portfolioAllocationsDetailsScreenContract$InputData = (PortfolioAllocationsDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr6 = PortfolioAllocationsDetailsScreen.g0;
                qji.b bVarR1 = portfolioAllocationsDetailsScreen.z2().R1();
                enc.b bVar = bVarR1 instanceof enc.b ? (enc.b) bVarR1 : null;
                if (bVar == null) {
                    phm.a aVar4 = (phm.a) e.j(portfolioAllocationsDetailsScreen.m2()).a().get(dmc.r.class);
                    aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                    if (aVar == null) {
                        throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                    }
                    bVar = (enc.b) aVar.b();
                }
                return (v) ((enc.a) bVar.c().S(portfolioAllocationsDetailsScreen)).E(portfolioAllocationsDetailsScreen).k0(portfolioAllocationsDetailsScreenContract$InputData).mo3800build();
            case 8:
                SingleTinCollectionFlowContract$InputData singleTinCollectionFlowContract$InputData = (SingleTinCollectionFlowContract$InputData) obj2;
                phm.a aVar5 = (phm.a) e.j(((SingleTinCollectionFlow) obj3).m2()).a().get(o.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new i(((o) aVar.b()).f162885l, singleTinCollectionFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
            case 9:
                PopularFirstBuyScreen popularFirstBuyScreen = (PopularFirstBuyScreen) obj3;
                PopularFirstBuyScreenContract$Input popularFirstBuyScreenContract$Input = (PopularFirstBuyScreenContract$Input) obj2;
                KProperty[] kPropertyArr7 = PopularFirstBuyScreen.f0;
                phm.a aVar6 = (phm.a) e.j(popularFirstBuyScreen.m2()).a().get(joh.a.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", joh.a.class, " is not found"));
                }
                joh.a aVar7 = ((joh.a) aVar.b()).f176957c;
                avk.j jVar = popularFirstBuyScreen.f96137e0;
                jVar.getClass();
                return new joh.c(aVar7, popularFirstBuyScreenContract$Input, jVar);
            case 10:
                ConnectedAppDetailsFlow connectedAppDetailsFlow = (ConnectedAppDetailsFlow) obj3;
                ConnectedAppDetailsFlowContract$InputData connectedAppDetailsFlowContract$InputData = (ConnectedAppDetailsFlowContract$InputData) obj2;
                phm.a aVar8 = (phm.a) e.j(connectedAppDetailsFlow.m2()).a().get(q.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new mjl.c(((m) ((q) aVar.b())).f206109t, connectedAppDetailsFlow, connectedAppDetailsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
            case 11:
                KProperty[] kPropertyArr8 = CancellationDetailsScreen.f75647a0;
                qji.b bVarQ2 = ((CancellationDetailsScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation_details.di.CancellationDetailsScreenInjector");
                ql7.o oVar = (ql7.o) bVarQ2;
                return new ql7.h(oVar.f247408b, oVar.f247409c, (CancellationDetailsScreenContract$InputData) obj2);
            case 12:
                KProperty[] kPropertyArr9 = UploadDocumentsListScreen.c0;
                qji.b bVarQ22 = ((UploadDocumentsListScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.list.di.UploadDocumentsListScreenInjector");
                k1 k1Var = (k1) bVarQ22;
                return new l1(k1Var.f247369b, k1Var.f247370c, (UploadDocumentsListScreenContract$InputData) obj2);
            case 13:
                JuniorTransferFlowContract$InputData juniorTransferFlowContract$InputData = (JuniorTransferFlowContract$InputData) obj2;
                phm.a aVar9 = (phm.a) e.j(((JuniorTransferFlow) obj3).m2()).a().get(f.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new oq8.e(((f) aVar.b()).f227790l, juniorTransferFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", f.class, " is not found"));
            case 14:
                BlockedMerchantDetailsScreen blockedMerchantDetailsScreen = (BlockedMerchantDetailsScreen) obj3;
                KProperty[] kPropertyArr10 = BlockedMerchantDetailsScreen.f0;
                qji.b bVarQ23 = blockedMerchantDetailsScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.di.BlockedMerchantDetailsScreenInjector");
                tr2.i iVar = (tr2.i) bVarQ23;
                return new tr2.k(iVar.f273638b, iVar.f273639c, blockedMerchantDetailsScreen, (BlockedMerchantDetailsScreenContract$InputData) obj2);
            case 15:
                CreditCardInstalmentHubScreen creditCardInstalmentHubScreen = (CreditCardInstalmentHubScreen) obj3;
                CreditCardInstalmentHubScreenContract$InputData creditCardInstalmentHubScreenContract$InputData = (CreditCardInstalmentHubScreenContract$InputData) obj2;
                KProperty[] kPropertyArr11 = CreditCardInstalmentHubScreen.f69386a0;
                phm.a aVar10 = (phm.a) e.j(creditCardInstalmentHubScreen.m2()).a().get(a3.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new e1(((a3) aVar.b()).Y, creditCardInstalmentHubScreen, creditCardInstalmentHubScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 16:
                ReferralCampaignStateScreenContract$InputData referralCampaignStateScreenContract$InputData = (ReferralCampaignStateScreenContract$InputData) obj2;
                KProperty[] kPropertyArr12 = ReferralCampaignStateScreen.T;
                qji.b bVarU25 = ((ReferralCampaignStateScreen) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.di.ReferralCampaignStateScreenInjector");
                us2.h hVar = (us2.h) bVarU25;
                us2.j jVar2 = hVar.f282403b;
                us2.h hVar2 = hVar.f282404c;
                referralCampaignStateScreenContract$InputData.getClass();
                return new us2.f(jVar2, hVar2, referralCampaignStateScreenContract$InputData);
            case 17:
                KProperty[] kPropertyArr13 = InstalmentTermScreen.W;
                qji.b bVarU26 = ((InstalmentTermScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.term.di.InstalmentTermScreenInjector");
                k3 k3Var = (k3) bVarU26;
                return new l3(k3Var.f176172b, k3Var.f176173c, (InstalmentTermScreenContract$InputData) obj2);
            case 18:
                BiometricVerificationManualInputViewController biometricVerificationManualInputViewController = (BiometricVerificationManualInputViewController) obj3;
                BiometricVerificationManualInputContract$InputData biometricVerificationManualInputContract$InputData = (BiometricVerificationManualInputContract$InputData) obj2;
                KProperty[] kPropertyArr14 = BiometricVerificationManualInputViewController.P;
                qji.b bVarU27 = biometricVerificationManualInputViewController.U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.di.BiometricVerificationManualInputInjector");
                i0 i0Var = (i0) ((eu.a) bVarU27).b().mo3808a(biometricVerificationManualInputViewController);
                switch (i0Var.f238849a) {
                    case 0:
                        i0Var.d = biometricVerificationManualInputContract$InputData;
                        break;
                    default:
                        i0Var.d = biometricVerificationManualInputContract$InputData;
                        break;
                }
                return (j0) i0Var.mo3783build();
            case 19:
                com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.c cVar = (com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.c) obj3;
                BiometricVerificationManualInputContract$InputData biometricVerificationManualInputContract$InputData2 = cVar.o;
                return mra.d.b(cVar, new du.j(biometricVerificationManualInputContract$InputData2.f50641a, biometricVerificationManualInputContract$InputData2.f50642b, biometricVerificationManualInputContract$InputData2.f50643c, biometricVerificationManualInputContract$InputData2.d), (at.r) obj2, null, false, 12);
            case 20:
                AddToClickToPayScreen addToClickToPayScreen = (AddToClickToPayScreen) obj3;
                AddToClickToPayScreenContract$InputData addToClickToPayScreenContract$InputData = (AddToClickToPayScreenContract$InputData) obj2;
                KProperty[] kPropertyArr15 = AddToClickToPayScreen.Q;
                phm.a aVar11 = (phm.a) e.j(addToClickToPayScreen.m2()).a().get(t.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                }
                t tVar = ((t) aVar.b()).M;
                Activity activityM2 = addToClickToPayScreen.m2();
                activityM2.getClass();
                return new vtc.a(tVar, addToClickToPayScreen, addToClickToPayScreenContract$InputData, activityM2);
            case 21:
                CryptoCommodityBuyCollectionConfirmationScreen cryptoCommodityBuyCollectionConfirmationScreen = (CryptoCommodityBuyCollectionConfirmationScreen) obj3;
                KProperty[] kPropertyArr16 = CryptoCommodityBuyCollectionConfirmationScreen.f71545b0;
                qji.b bVarQ24 = cryptoCommodityBuyCollectionConfirmationScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.confirmation.di.CryptoCommodityBuyCollectionConfirmationScreenInjector");
                mw5.j jVar3 = (mw5.j) bVarQ24;
                return new mw5.i(jVar3.f209366b, jVar3.f209367c, cryptoCommodityBuyCollectionConfirmationScreen, (CryptoCommodityBuyCollectionConfirmationScreenContract$InputData) obj2);
            case 22:
                WidgetisedAnalyticsAllocationScreen widgetisedAnalyticsAllocationScreen = (WidgetisedAnalyticsAllocationScreen) obj3;
                WidgetisedAnalyticsAllocationScreenContract$InputData widgetisedAnalyticsAllocationScreenContract$InputData = (WidgetisedAnalyticsAllocationScreenContract$InputData) obj2;
                KProperty[] kPropertyArr17 = WidgetisedAnalyticsAllocationScreen.V;
                qji.b bVarU28 = widgetisedAnalyticsAllocationScreen.U2();
                Intrinsics.i(bVarU28, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.ui.widgetised.allocation.di.WidgetisedAnalyticsAllocationScreenInjector");
                ewg.k kVar = (ewg.k) bVarU28;
                return new ewg.i(kVar.d, kVar.e, widgetisedAnalyticsAllocationScreen, widgetisedAnalyticsAllocationScreenContract$InputData, widgetisedAnalyticsAllocationScreen);
            case 23:
                GiaOnboardingFailedFlowContract$InputData giaOnboardingFailedFlowContract$InputData = (GiaOnboardingFailedFlowContract$InputData) obj2;
                phm.a aVar12 = (phm.a) e.j(((GiaOnboardingFailedFlow) obj3).m2()).a().get(y.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                }
                kyk.v vVar = ((kyk.v) ((y) aVar.b())).A;
                giaOnboardingFailedFlowContract$InputData.getClass();
                return new kyk.c(vVar, giaOnboardingFailedFlowContract$InputData);
            case 24:
                com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.a aVar13 = (com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.a) obj2;
                if (!((Ref$BooleanRef) obj3).f186407a) {
                    oki.h.D2(aVar13.f104161r);
                }
                return Unit.f186387a;
            case 25:
                RevolutCardSettingsFlowContract$InputData revolutCardSettingsFlowContract$InputData = (RevolutCardSettingsFlowContract$InputData) obj2;
                phm.a aVar14 = (phm.a) e.j(((RevolutCardSettingsFlow) obj3).m2()).a().get(tz2.e.class);
                aVar = aVar14 != null ? (b60.a) aVar14.get() : null;
                if (aVar != null) {
                    return new tz2.o(((tz2.e) aVar.b()).f275770s, revolutCardSettingsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", tz2.e.class, " is not found"));
            case 26:
                CustomTipScreenContract$InputData customTipScreenContract$InputData = (CustomTipScreenContract$InputData) obj2;
                KProperty[] kPropertyArr18 = CustomTipScreen.R;
                phm.a aVar15 = (phm.a) e.j(((CustomTipScreen) obj3).m2()).a().get(c06.c.class);
                aVar = aVar15 != null ? (b60.a) aVar15.get() : null;
                if (aVar != null) {
                    return new c06.b(((c06.c) aVar.b()).f20175c, customTipScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", c06.c.class, " is not found"));
            case 27:
                return FocusableNode.retrievePinnableContainer$lambda$0((Ref$ObjectRef) obj3, (FocusableNode) obj2);
            case 28:
                KProperty[] kPropertyArr19 = TradeRevPointsAgentDetailsScreen.V;
                qji.b bVarU29 = ((TradeRevPointsAgentDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU29, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.di.TradeRevPointsAgentDetailsScreenInjector");
                t1f.e eVar = (t1f.e) bVarU29;
                return new t1f.f(eVar.f267288b, eVar.f267289c, (TradeRevPointsAgentDetailsScreenContract$InputData) obj2);
            default:
                BankTransferAmountScreen bankTransferAmountScreen = (BankTransferAmountScreen) obj3;
                BankTransferAmountScreenContract$InputData bankTransferAmountScreenContract$InputData = (BankTransferAmountScreenContract$InputData) obj2;
                KProperty[] kPropertyArr20 = BankTransferAmountScreen.f102060r0;
                qji.b bVarQ25 = bankTransferAmountScreen.Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.di.BankTransferAmountScreenInjector");
                p2k.i iVar2 = (p2k.i) bVarQ25;
                n nVar = iVar2.f232358c;
                p2k.i iVar3 = iVar2.d;
                bankTransferAmountScreenContract$InputData.getClass();
                return new p2k.g(nVar, iVar3, bankTransferAmountScreen, bankTransferAmountScreenContract$InputData);
        }
    }
}
