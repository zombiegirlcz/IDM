package fb6;

import android.content.Context;
import android.webkit.WebView;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PendingPurchasesParams;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.feature.apm.wero.impl.ui.p2m.registration.WeroP2MRegistrationFlow;
import com.revolut.feature.apm.wero.impl.ui.p2m.registration.WeroP2MRegistrationFlowContract$InputData;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlow;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlowContract$Input;
import com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.ReferralInviteeDetailsScreen;
import com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.ReferralInviteeDetailsScreenContract$InputData;
import com.revolut.feature.corporate_events.impl.ui.flow.home.CorporateEventsHomeFlow;
import com.revolut.feature.corporate_events.impl.ui.flow.home.CorporateEventsHomeFlowContract$Input;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.CreditCardStatementDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.statement.details.CreditCardStatementDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.down_payment.CreditCardDownPaymentScreen;
import com.revolut.feature.credit.card.impl.ui.statement_financing.down_payment.CreditCardDownPaymentScreenContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.DonateWithPointsContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.DonateWithPointsScreen;
import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreen;
import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.claims.ClaimsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.claims.ClaimsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.preview.DocumentsPreviewScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.preview.DocumentsPreviewScreenContract$InputData;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreen;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreenContract$InputData;
import com.revolut.feature.pay_later.impl.ui.planprogress.PlanProgressController;
import com.revolut.feature.payment.counterparty.impl.screen.profile.CounterPartyDetailsScreen;
import com.revolut.feature.payment.counterparty.impl.screen.profile.CounterPartyDetailsScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreen;
import com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.challenge.presentation.pause_challenge.PauseChallengeScreen;
import com.revolut.feature.retail.savings.impl.challenge.presentation.pause_challenge.PauseChallengeScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsRevampScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsScreenContract$InputData;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreen;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreenContract$InputData;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.InboundTransactionListScreen;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.InboundTransactionListScreenContract$InputData;
import com.revolut.feature.transactions.impl.ui.pending.PendingTransactionFlow;
import com.revolut.feature.transactions.impl.ui.pending.PendingTransactionFlowContract$InputData;
import com.revolut.feature.transport.impl.ui.hub.tickets.TransportHubTicketsScreen;
import com.revolut.feature.transport.impl.ui.hub.tickets.TransportHubTicketsScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.checkin_instructions.TravelHotelsCheckInInstructionsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.checkin_instructions.TravelHotelsCheckInInstructionsScreenContract$InputData;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.UnsettledDialogInputData;
import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingSelectorInputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.UnsettledDialogController;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.cash_selector.CashHoldingsSelectorScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.recommendation_history_screen.RecommendationHistoryScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.recommendation_history_screen.RecommendationHistoryScreenContract$InputData;
import com.revolut.sso.impl.ui.consent.common.unexpected_location.UnexpectedLocationScreen;
import com.revolut.sso.impl.ui.consent.common.unexpected_location.UnexpectedLocationScreenContract$InputData;
import com.revolut.sso.impl.ui.passkeys_management.passkeys_list.bottom_dialog.DeletePasskeyConfirmationBottomSheet;
import com.revolut.sso.impl.ui.passkeys_management.passkeys_list.bottom_dialog.DeletePasskeyConfirmationBottomSheetContract$InputData;
import dw3.m5;
import dw3.n5;
import g9g.t;
import jm4.l4;
import jm4.r2;
import jm4.x0;
import jm4.z0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ljl.f1;
import ljl.g0;
import ljl.g1;
import nh2.u;
import prk.a0;
import prk.x;
import ql7.b0;
import ql7.i0;
import ql7.k1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f133452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f133453c;

    public /* synthetic */ j(Object obj2, Object obj3, int i) {
        this.f133451a = i;
        this.f133452b = obj2;
        this.f133453c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b60.a aVar;
        int i = this.f133451a;
        Object obj2 = this.f133453c;
        Object obj3 = this.f133452b;
        switch (i) {
            case 0:
                int i2 = DonateWithPointsScreen.V;
                qji.b bVarU2 = ((DonateWithPointsScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.di.DonateWithPointsScreenComponent.Injector");
                pa6.n nVar = (pa6.n) bVarU2;
                return new pa6.j(nVar.f234406b, nVar.f234407c, (DonateWithPointsContract$InputData) obj2);
            case 1:
                HiddenAccountsListScreen hiddenAccountsListScreen = (HiddenAccountsListScreen) obj3;
                HiddenAccountsListScreenContract$InputData hiddenAccountsListScreenContract$InputData = (HiddenAccountsListScreenContract$InputData) obj2;
                KProperty[] kPropertyArr = HiddenAccountsListScreen.W;
                qji.b bVarU22 = hiddenAccountsListScreen.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.di.HiddenAccountsListScreenInjector");
                ta7.i iVar = (ta7.i) ((gb7.a) bVarU22).c().mo3808a(hiddenAccountsListScreen);
                switch (iVar.f269133a) {
                    case 0:
                        iVar.d = hiddenAccountsListScreenContract$InputData;
                        break;
                    default:
                        iVar.d = hiddenAccountsListScreenContract$InputData;
                        break;
                }
                return (ta7.j) iVar.mo3783build();
            case 2:
                KProperty[] kPropertyArr2 = TravelHotelsCheckInInstructionsScreen.R;
                qji.b bVarU23 = ((TravelHotelsCheckInInstructionsScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.checkin_instructions.di.TravelHotelsCheckInInstructionsScreenInjector");
                t tVar = (t) bVarU23;
                return new g9g.m(tVar.f141813b, tVar.f141814c, (TravelHotelsCheckInInstructionsScreenContract$InputData) obj2);
            case 3:
                com.revolut.feature.onboarding.impl.playbilling.e eVar = (com.revolut.feature.onboarding.impl.playbilling.e) obj2;
                Context applicationContext = eVar.f78525a;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                dug.e purchasesUpdatedListener = eVar.d;
                ((fc9.a) ((fc9.b) obj3)).getClass();
                Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                Intrinsics.checkNotNullParameter(purchasesUpdatedListener, "purchasesUpdatedListener");
                PendingPurchasesParams pendingPurchasesParamsBuild = PendingPurchasesParams.newBuilder().enableOneTimeProducts().build();
                Intrinsics.checkNotNullExpressionValue(pendingPurchasesParamsBuild, "build(...)");
                BillingClient billingClientBuild = BillingClient.newBuilder(applicationContext).setListener(purchasesUpdatedListener).enablePendingPurchases(pendingPurchasesParamsBuild).enableAutoServiceReconnection().build();
                Intrinsics.checkNotNullExpressionValue(billingClientBuild, "build(...)");
                return billingClientBuild;
            case 4:
                InboundTransactionListScreen inboundTransactionListScreen = (InboundTransactionListScreen) obj3;
                InboundTransactionListScreenContract$InputData inboundTransactionListScreenContract$InputData = (InboundTransactionListScreenContract$InputData) obj2;
                KProperty[] kPropertyArr3 = InboundTransactionListScreen.R;
                phm.a aVar2 = (phm.a) ue0.e.j(inboundTransactionListScreen.m2()).a().get(tce.a.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                }
                rde.h hVar = ((rde.h) aVar.b()).k;
                inboundTransactionListScreen.m2().getClass();
                return new rde.d(hVar, inboundTransactionListScreenContract$InputData);
            case 5:
                RefinancingAccountDetailsInputScreen refinancingAccountDetailsInputScreen = (RefinancingAccountDetailsInputScreen) obj3;
                KProperty[] kPropertyArr4 = RefinancingAccountDetailsInputScreen.S;
                qji.b bVarU24 = refinancingAccountDetailsInputScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.di.RefinancingAccountDetailsInputScreenInjector");
                m5 m5Var = (m5) bVarU24;
                return new n5(m5Var.f119280c, m5Var.d, refinancingAccountDetailsInputScreen, (RefinancingAccountDetailsInputScreenContract$InputData) obj2);
            case 6:
                WeroP2MRegistrationFlowContract$InputData weroP2MRegistrationFlowContract$InputData = (WeroP2MRegistrationFlowContract$InputData) obj2;
                phm.a aVar3 = (phm.a) ue0.e.j(((WeroP2MRegistrationFlow) obj3).m2()).a().get(nh2.h.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new u(((nh2.o) ((nh2.h) aVar.b())).f215326t, weroP2MRegistrationFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", nh2.h.class, " is not found"));
            case 7:
                ShopsCombinedHomeScreen shopsCombinedHomeScreen = (ShopsCombinedHomeScreen) obj3;
                ShopsCombinedHomeScreenContract$InputData shopsCombinedHomeScreenContract$InputData = (ShopsCombinedHomeScreenContract$InputData) obj2;
                KProperty[] kPropertyArr5 = ShopsCombinedHomeScreen.f87179h0;
                phm.a aVar4 = (phm.a) ue0.e.j(shopsCombinedHomeScreen.m2()).a().get(did.d.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new did.i(((did.d) aVar.b()).f115008y, shopsCombinedHomeScreen, shopsCombinedHomeScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
            case 8:
                String str = (String) obj2;
                KProperty[] kPropertyArr6 = PlanProgressController.S;
                oi9.f fVar = kotlin.jvm.internal.s.n(((PlanProgressController) obj3).m2()).v;
                str.getClass();
                return new oi9.t(fVar, str);
            case 9:
                PauseChallengeScreenContract$InputData pauseChallengeScreenContract$InputData = (PauseChallengeScreenContract$InputData) obj2;
                int i3 = PauseChallengeScreen.Q;
                phm.a aVar5 = (phm.a) ue0.e.j(((PauseChallengeScreen) obj3).m2()).a().get(vjb.g.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new vjb.e(((vjb.g) aVar.b()).f, pauseChallengeScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vjb.g.class, " is not found"));
            case 10:
                UnsettledDialogController unsettledDialogController = (UnsettledDialogController) obj3;
                UnsettledDialogInputData unsettledDialogInputData = (UnsettledDialogInputData) obj2;
                int i5 = UnsettledDialogController.X;
                phm.a aVar6 = (phm.a) ue0.e.j(unsettledDialogController.m2()).a().get(vhh.a.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                }
                mkh.s sVar = ((mkh.s) ((mkh.u) aVar.b())).l0;
                unsettledDialogInputData.getClass();
                return new mkh.p(sVar, unsettledDialogInputData, unsettledDialogController, unsettledDialogController);
            case 11:
                String str2 = (String) obj2;
                WebView webView = (WebView) ((fl1.d) ((fl1.c) obj3).d).invoke();
                if (webView != null) {
                    webView.loadUrl(str2);
                }
                return Unit.f186387a;
            case 12:
                CashHoldingSelectorInputData cashHoldingSelectorInputData = (CashHoldingSelectorInputData) obj2;
                int i6 = CashHoldingsSelectorScreen.U;
                phm.a aVar7 = (phm.a) ue0.e.j(((CashHoldingsSelectorScreen) obj3).m2()).a().get(vhh.a.class);
                aVar = aVar7 != null ? (b60.a) aVar7.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                }
                mkh.s sVar2 = ((mkh.s) ((mkh.u) aVar.b())).l0;
                cashHoldingSelectorInputData.getClass();
                return new mkh.e(sVar2, cashHoldingSelectorInputData);
            case 13:
                ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen = (ReviewProductDetailsRevampScreen) obj3;
                KProperty[] kPropertyArr7 = ReviewProductDetailsRevampScreen.c0;
                qji.b bVarU25 = reviewProductDetailsRevampScreen.U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.di.ReviewProductDetailsScreenInjector");
                rlb.g gVar = (rlb.g) bVarU25;
                return new rlb.c(gVar.f254990b, gVar.f254991c, reviewProductDetailsRevampScreen, (ReviewProductDetailsScreenContract$InputData) obj2);
            case 14:
                ReviewProductDetailsScreen reviewProductDetailsScreen = (ReviewProductDetailsScreen) obj3;
                KProperty[] kPropertyArr8 = ReviewProductDetailsScreen.f83283b0;
                qji.b bVarU26 = reviewProductDetailsScreen.U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.di.ReviewProductDetailsScreenInjector");
                rlb.g gVar2 = (rlb.g) bVarU26;
                return new rlb.c(gVar2.f254990b, gVar2.f254991c, reviewProductDetailsScreen, (ReviewProductDetailsScreenContract$InputData) obj2);
            case 15:
                UnexpectedLocationScreen unexpectedLocationScreen = (UnexpectedLocationScreen) obj3;
                UnexpectedLocationScreenContract$InputData unexpectedLocationScreenContract$InputData = (UnexpectedLocationScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = UnexpectedLocationScreen.P;
                qji.b bVarU27 = unexpectedLocationScreen.U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.sso.impl.ui.consent.common.unexpected_location.di.UnexpectedLocationScreenInjector");
                f1 f1Var = (f1) ((gml.a) bVarU27).c().mo3808a(unexpectedLocationScreen);
                switch (f1Var.f195941a) {
                    case 0:
                        f1Var.d = unexpectedLocationScreenContract$InputData;
                        break;
                    default:
                        f1Var.d = unexpectedLocationScreenContract$InputData;
                        break;
                }
                return (g1) f1Var.mo3783build();
            case 16:
                PendingTransactionFlowContract$InputData pendingTransactionFlowContract$InputData = (PendingTransactionFlowContract$InputData) obj2;
                phm.a aVar8 = (phm.a) ue0.e.j(((PendingTransactionFlow) obj3).m2()).a().get(gnf.a.class);
                aVar = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar != null) {
                    return new gnf.b(((gnf.a) aVar.b()).f, pendingTransactionFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", gnf.a.class, " is not found"));
            case 17:
                CounterPartyDetailsScreenContract$InputData counterPartyDetailsScreenContract$InputData = (CounterPartyDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = CounterPartyDetailsScreen.V;
                phm.a aVar9 = (phm.a) ue0.e.j(((CounterPartyDetailsScreen) obj3).m2()).a().get(bo9.c.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new bo9.b(((bo9.c) aVar.b()).f17348g, counterPartyDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", bo9.c.class, " is not found"));
            case 18:
                int i21 = DeletePasskeyConfirmationBottomSheet.T;
                qji.b bVarU28 = ((DeletePasskeyConfirmationBottomSheet) obj3).U2();
                Intrinsics.i(bVarU28, "null cannot be cast to non-null type com.revolut.sso.impl.ui.passkeys_management.passkeys_list.bottom_dialog.di.DeletePasskeyConfirmationBottomSheetInjector");
                g0 g0Var = (g0) bVarU28;
                return new ljl.s(g0Var.f195948a, g0Var.f195949b, (DeletePasskeyConfirmationBottomSheetContract$InputData) obj2);
            case 19:
                CorporateEventsHomeFlowContract$Input corporateEventsHomeFlowContract$Input = (CorporateEventsHomeFlowContract$Input) obj2;
                phm.a aVar10 = (phm.a) ue0.e.j(((CorporateEventsHomeFlow) obj3).m2()).a().get(wo3.a.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", wo3.a.class, " is not found"));
                }
                ap3.h hVar2 = ((ap3.h) ((ap3.a) aVar.b())).f8091h;
                corporateEventsHomeFlowContract$Input.getClass();
                return new ap3.e(hVar2, corporateEventsHomeFlowContract$Input);
            case 20:
                KProperty[] kPropertyArr11 = ClaimsScreen.f75650b0;
                qji.b bVarQ2 = ((ClaimsScreen) obj3).Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.policy.claims.di.GetHelpScreenInjector");
                ql7.o oVar = (ql7.o) bVarQ2;
                return new i0(oVar.f247408b, oVar.f247409c, (ClaimsScreenContract$InputData) obj2);
            case 21:
                KProperty[] kPropertyArr12 = DocumentsPreviewScreen.Q;
                qji.b bVarU29 = ((DocumentsPreviewScreen) obj3).U2();
                Intrinsics.i(bVarU29, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.preview.di.DocumentsPreviewScreenInjector");
                k1 k1Var = (k1) bVarU29;
                return new b0(k1Var.f247369b, k1Var.f247370c, (DocumentsPreviewScreenContract$InputData) obj2);
            case 22:
                JuniorTransferAmountScreen juniorTransferAmountScreen = (JuniorTransferAmountScreen) obj3;
                JuniorTransferAmountScreenContract$InputData juniorTransferAmountScreenContract$InputData = (JuniorTransferAmountScreenContract$InputData) obj2;
                KProperty[] kPropertyArr13 = JuniorTransferAmountScreen.i0;
                qji.b bVarQ22 = juniorTransferAmountScreen.Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.junior_transfer.impl.ui.screen.di.JuniorTransferAmountScreenInjector");
                oq8.e eVar2 = (oq8.e) bVarQ22;
                oq8.f fVar2 = eVar2.f227782b;
                oq8.e eVar3 = eVar2.f227783c;
                ReactionsKeyboardView juniorTransferAmountReactionsKeyboard = juniorTransferAmountScreen.h3().d;
                Intrinsics.checkNotNullExpressionValue(juniorTransferAmountReactionsKeyboard, "juniorTransferAmountReactionsKeyboard");
                return new oq8.d(fVar2, eVar3, new o9i.a(), new o9i.b(), new o9i.c(), juniorTransferAmountScreen, juniorTransferAmountScreenContract$InputData, juniorTransferAmountReactionsKeyboard);
            case 23:
                BlockedPaymentsListFlowContract$Input blockedPaymentsListFlowContract$Input = (BlockedPaymentsListFlowContract$Input) obj2;
                KProperty[] kPropertyArr14 = BlockedPaymentsListFlow.Q;
                phm.a aVar11 = (phm.a) ue0.e.j(((BlockedPaymentsListFlow) obj3).m2()).a().get(tr2.m.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new tr2.n(((tr2.m) aVar.b()).f273668w, blockedPaymentsListFlowContract$Input);
                }
                throw new IllegalStateException(a0.d.q("Api ", tr2.m.class, " is not found"));
            case 24:
                ReferralInviteeDetailsScreen referralInviteeDetailsScreen = (ReferralInviteeDetailsScreen) obj3;
                KProperty[] kPropertyArr15 = ReferralInviteeDetailsScreen.U;
                qji.b bVarU210 = referralInviteeDetailsScreen.U2();
                Intrinsics.i(bVarU210, "null cannot be cast to non-null type com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.di.ReferralInviteeDetailsScreenInjector");
                us2.h hVar3 = (us2.h) bVarU210;
                return new us2.g(hVar3.f282403b, hVar3.f282404c, referralInviteeDetailsScreen, (ReferralInviteeDetailsScreenContract$InputData) obj2);
            case 25:
                GroupDetailsSettlementScreen groupDetailsSettlementScreen = (GroupDetailsSettlementScreen) obj3;
                GroupDetailsSettlementScreenContract$InputData groupDetailsSettlementScreenContract$InputData = (GroupDetailsSettlementScreenContract$InputData) obj2;
                KProperty[] kPropertyArr16 = GroupDetailsSettlementScreen.f0;
                qji.b bVarQ23 = groupDetailsSettlementScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.payments.groups.impl.ui_new.details_settlement.di.GroupDetailsSettlementScreenInjector");
                kr9.q qVar = (kr9.q) ((gt9.a) bVarQ23).c().S(groupDetailsSettlementScreen);
                switch (qVar.f188788a) {
                    case 0:
                        qVar.d = groupDetailsSettlementScreenContract$InputData;
                        break;
                    default:
                        qVar.d = groupDetailsSettlementScreenContract$InputData;
                        break;
                }
                return (kr9.r) qVar.mo3800build();
            case 26:
                KProperty[] kPropertyArr17 = CreditCardStatementDetailsScreen.Q;
                qji.b bVarU211 = ((CreditCardStatementDetailsScreen) obj3).U2();
                Intrinsics.i(bVarU211, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.statement.details.di.CreditCardStatementDetailsScreenInjector");
                z0 z0Var = (z0) bVarU211;
                return new l4(z0Var.f176463b, z0Var.f176464c, (CreditCardStatementDetailsScreenContract$InputData) obj2);
            case 27:
                KProperty[] kPropertyArr18 = CreditCardDownPaymentScreen.R;
                qji.b bVarU212 = ((CreditCardDownPaymentScreen) obj3).U2();
                Intrinsics.i(bVarU212, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.statement_financing.down_payment.di.CreditCardDownPaymentScreenInjector");
                r2 r2Var = (r2) bVarU212;
                return new x0(r2Var.f176313b, r2Var.f176314c, (CreditCardDownPaymentScreenContract$InputData) obj2);
            case 28:
                TransportHubTicketsScreen transportHubTicketsScreen = (TransportHubTicketsScreen) obj3;
                KProperty[] kPropertyArr19 = TransportHubTicketsScreen.f0;
                qji.b bVarQ24 = transportHubTicketsScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.feature.transport.impl.ui.hub.tickets.di.TransportHubTicketsScreenInjector");
                hvf.r rVar = (hvf.r) bVarQ24;
                return new hvf.s(rVar.f155951b, rVar.f155952c, transportHubTicketsScreen, (TransportHubTicketsScreenContract$InputData) obj2);
            default:
                KProperty[] kPropertyArr20 = RecommendationHistoryScreen.P;
                qji.b bVarU213 = ((RecommendationHistoryScreen) obj3).U2();
                Intrinsics.i(bVarU213, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.recommendation_history_screen.di.RecommendationHistoryScreenInjector");
                x xVar = (x) bVarU213;
                return new a0(xVar.f239310b, xVar.f239311c, (RecommendationHistoryScreenContract$InputData) obj2);
        }
    }
}
