package fgj;

import android.os.Parcelable;
import aw0.h;
import aw0.n6;
import aw0.o9;
import c12.j0;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.alipay.impl.ui.webcontainer.AlipayPlusWebContainerContract$Step;
import com.revolut.feature.alipay.impl.ui.webcontainer.AlipayPlusWebContainerScreen;
import com.revolut.feature.apm.bills.bpay.impl.screen.amount.AmountScreen;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTermsScope$InputData;
import com.revolut.feature.apm.wero.impl.ui.p2m.registration.WeroP2MRegistrationFlowContract$Step;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlowContract$PagerItem;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreenContract$Input;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.documents.RefinancingAccountDocumentsController;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.documents.RefinancingAccountDocumentsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputFlowContract$State;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails.SingleSelectorInputDetailsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails.SingleSelectorInputDetailsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitInputScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreenContract$OutputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.OpenBankingBrPaymentsFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreenContract$OutputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.manual_return.BrPaymentManualReturnScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.payment.OpenBankingBrPaymentScreen;
import com.revolut.feature.freelancer.common.models.payments.FreelancerOrderPaymentReceipt;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.payment_selector.FreelancerAcquiringOrderPaymentSelectorScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.payment_selector.FreelancerAcquiringOrderPaymentSelectorScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.FreelancerAcquiringPaymentFeesScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.FreelancerAcquiringPaymentFeesScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.prompt.restrictions.AccountRestrictionsPromptFlow;
import com.revolut.feature.freelancer.impl.ui.prompt.restrictions.AccountRestrictionsPromptFlowContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.instruments.trend.collections.impl.ui.collection.InstrumentsTrendCollectionControllerContract$ModalStep;
import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreen;
import com.revolut.feature.payment.counterparty.impl.screen.profile.CounterPartyDetailsScreenContract$ModalStep;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingDetailsContract$Steps;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallenge;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsScreenContract$ModalStep;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.salary_switch.api.navigation.SalarySwitchDestination;
import com.revolut.feature.salary_switch.impl.ui.mexico.flow.SalarySwitchMxFlowContract$Step;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.account_details.AccountDetailsController;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.ReviewAccountDetailsContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.ReviewAccountDetailsController;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.status.SalarySwitchStatusContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.status.SalarySwitchStatusController;
import com.revolut.feature.shops.api.model.ShopsAuction;
import com.revolut.feature.shops.api.model.ShopsPurchase;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlow;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$InputData;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreenContract$ModalStep;
import com.revolut.feature.shops.impl.ui.items_details.ShopsItemsDetailsScreen;
import com.revolut.feature.shops.impl.ui.items_details.ShopsItemsDetailsScreenContract$InputData;
import com.revolut.feature.terminated_users.impl.R$string;
import com.revolut.feature.terminated_users.impl.ui.flow.TerminatedAccountFlowContract$Step;
import com.revolut.feature.terminated_users.impl.ui.logout_confirmation.LogoutConfirmationFlow;
import com.revolut.feature.terminated_users.impl.ui.logout_confirmation.LogoutConfirmationFlowContract$InputData;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Descriptor;
import com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.UnsettledDialogControllerContract$ModalStep;
import com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection.ScreenerViewCollectionFlowContract$CollectionConfig;
import com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection.ScreenerViewCollectionFlowContract$Input;
import com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection.ScreenerViewCollectionFlowContract$Step;
import com.revolut.feature.wealth_discovery.impl.screener.screens.collection.ScreenerCollectionScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.collection.ScreenerCollectionScreenContract$CollectionConfig;
import com.revolut.feature.wealth_discovery.impl.screener.screens.collection.ScreenerCollectionScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.EditScreenerScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.EditScreenerScreenContract$Input;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection.EsimMobilePlanNumberSelectionFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection.EsimMobilePlanNumberSelectionFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.screens.country_picker.EsimCountryPickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.country_picker.EsimCountryPickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$DomainState;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.duration.EsimPlanDurationPickerBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.duration.EsimPlanDurationPickerBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.info.EsimInfoBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.info.EsimInfoBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number.EsimMobilePlanChooseNumberScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number.EsimMobilePlanChooseNumberScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.EsimMobilePlanFeaturedNumberSelectionScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_rev_points_info.EsimMobilePlanRevPointsInfoScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import do3.v;
import dp4.y0;
import dx4.e1;
import dx4.h3;
import dx4.k3;
import dx4.n4;
import dx4.p4;
import fg8.y;
import fh4.n;
import fij.c0;
import fjd.w;
import fmb.q0;
import fs2.k;
import fs2.o;
import grl.k9;
import hha.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import lk6.j;
import m1c.e0;
import tph.g;
import u6c.t;
import vkm.j2;
import w6c.i;
import wph.p;
import wph.q;
import yki.l;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f135090b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f135089a = i;
        this.f135090b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        PromptMarketingContentDelegate.Model.Button button;
        com.revolut.feature.terminated_users.impl.ui.flow.a aVar = (com.revolut.feature.terminated_users.impl.ui.flow.a) this.f135090b;
        l FlowCoordinator = (l) obj2;
        TerminatedAccountFlowContract$Step step = (TerminatedAccountFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, TerminatedAccountFlowContract$Step.TerminatedAccountPrompt.f90345a)) {
            if (Intrinsics.f(step, TerminatedAccountFlowContract$Step.LogoutBottomSheet.f90343a)) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.terminated_accounts_exit_popup_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.terminated_accounts_exit_popup_description, null, null, 14);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.terminated_accounts_exit_popup_cancel, null, null, 14);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.terminated_accounts_exit_popup_confirm, null, null, 14);
                k9 k9Var = k9.Onboarding;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new LogoutConfirmationFlow(new LogoutConfirmationFlowContract$InputData(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, textLocalisedClause4, UserOnboardingNavigationProvider$UseCase.Default.f99363a, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
            }
            if (!Intrinsics.f(step, TerminatedAccountFlowContract$Step.ReopenAccountBottomSheet.f90344a)) {
                throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.terminated_accounts_reopen_popup_title, null, null, 14);
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.terminated_accounts_reopen_popup_description, null, null, 14);
            TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.terminated_accounts_reopen_popup_cancel, null, null, 14);
            TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.terminated_accounts_reopen_popup_confirm, null, null, 14);
            k9 k9Var2 = k9.Onboarding;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            return new LogoutConfirmationFlow(new LogoutConfirmationFlowContract$InputData(textLocalisedClause5, textLocalisedClause6, textLocalisedClause7, textLocalisedClause8, UserOnboardingNavigationProvider$UseCase.SignUp.f99365a, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2)));
        }
        TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(R$string.terminated_accounts_intro_title, null, null, 14);
        m70.a.c(t0.f186434a);
        TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_24_broken_heart, null, null, 6);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        v vVar = aVar.o.f90342a;
        int i = vVar == null ? -1 : fre.c.f137476a[vVar.ordinal()];
        if (i == -1) {
            button = null;
        } else if (i == 1 || i == 2) {
            button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.terminated_accounts_intro_action_reopen, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            button = null;
        }
        PromptMarketingContentDelegate.Model.Button button2 = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.terminated_accounts_intro_action_documents, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        k9 k9Var3 = k9.Onboarding;
        Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause9, textClause, glyphImage, null, null, resourceImage, null, button, button2, null, null, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, 61016));
        w block = new w(aVar, 27);
        Intrinsics.checkNotNullParameter(block, "block");
        promptMarketingScreen.H = block;
        return promptMarketingScreen;
    }

    private final Object b(Object obj2, Object obj3) {
        o oVar = (o) this.f135090b;
        ali.b PagerCoordinator = (ali.b) obj2;
        BlockedPaymentsListFlowContract$PagerItem pagerItem = (BlockedPaymentsListFlowContract$PagerItem) obj3;
        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
        Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
        BlockedPaymentsListScreen blockedPaymentsListScreen = new BlockedPaymentsListScreen(new BlockedPaymentsListScreenContract$Input(pagerItem.f64252a));
        k kVar = new k(oVar, 1);
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        blockedPaymentsListScreen.H = kVar;
        return blockedPaymentsListScreen;
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a aVar = (com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a) this.f135090b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        FreelancerAcquiringOrderDetailsScreenContract$ModalStep step = (FreelancerAcquiringOrderDetailsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof FreelancerAcquiringOrderDetailsScreenContract$ModalStep.AccountRestriction) {
            return new AccountRestrictionsPromptFlow(new AccountRestrictionsPromptFlowContract$InputData(((FreelancerAcquiringOrderDetailsScreenContract$ModalStep.AccountRestriction) step).f73669a));
        }
        if (step instanceof FreelancerAcquiringOrderDetailsScreenContract$ModalStep.FeeBreakdown) {
            return new FreelancerAcquiringPaymentFeesScreen(new FreelancerAcquiringPaymentFeesScreenContract$InputData(((FreelancerAcquiringOrderDetailsScreenContract$ModalStep.FeeBreakdown) step).f73670a));
        }
        if (!(step instanceof FreelancerAcquiringOrderDetailsScreenContract$ModalStep.ReceiptPaymentSelection)) {
            if (!(step instanceof FreelancerAcquiringOrderDetailsScreenContract$ModalStep.RefundPaymentSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            FreelancerAcquiringOrderDetailsScreenContract$ModalStep.RefundPaymentSelection refundPaymentSelection = (FreelancerAcquiringOrderDetailsScreenContract$ModalStep.RefundPaymentSelection) step;
            FreelancerAcquiringOrderPaymentSelectorScreen freelancerAcquiringOrderPaymentSelectorScreen = new FreelancerAcquiringOrderPaymentSelectorScreen(new FreelancerAcquiringOrderPaymentSelectorScreenContract$InputData(refundPaymentSelection.f73672a));
            fpk.b block = new fpk.b(refundPaymentSelection, aVar, 8);
            Intrinsics.checkNotNullParameter(block, "block");
            freelancerAcquiringOrderPaymentSelectorScreen.H = block;
            return freelancerAcquiringOrderPaymentSelectorScreen;
        }
        FreelancerAcquiringOrderDetailsScreenContract$ModalStep.ReceiptPaymentSelection receiptPaymentSelection = (FreelancerAcquiringOrderDetailsScreenContract$ModalStep.ReceiptPaymentSelection) step;
        ArrayList arrayList = receiptPaymentSelection.f73671a;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((FreelancerOrderPaymentReceipt) it8.next()).f73459a);
        }
        FreelancerAcquiringOrderPaymentSelectorScreen freelancerAcquiringOrderPaymentSelectorScreen2 = new FreelancerAcquiringOrderPaymentSelectorScreen(new FreelancerAcquiringOrderPaymentSelectorScreenContract$InputData(arrayList2));
        fpk.b block2 = new fpk.b(receiptPaymentSelection, aVar, 9);
        Intrinsics.checkNotNullParameter(block2, "block");
        freelancerAcquiringOrderPaymentSelectorScreen2.H = block2;
        return freelancerAcquiringOrderPaymentSelectorScreen2;
    }

    /* JADX WARN: Type inference failed for: r1v181, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v226, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Object obj4;
        int i;
        TextLocalisedClause textLocalisedClause;
        List f100208a;
        Object shopsBidFlow;
        Object obj5;
        k9 value;
        String str;
        Object obj6;
        ScreenerCollectionScreenContract$CollectionConfig fromCollection;
        Object obj7;
        int i2 = this.f135089a;
        final int i3 = 2;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        final int i5 = 1;
        Object obj8 = this.f135090b;
        switch (i2) {
            case 0:
                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection.a aVar = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection.a) obj8;
                EsimMobilePlanNumberSelectionFlowContract$InputData esimMobilePlanNumberSelectionFlowContract$InputData = aVar.o;
                l FlowCoordinator = (l) obj2;
                EsimMobilePlanNumberSelectionFlowContract$Step step = (EsimMobilePlanNumberSelectionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, EsimMobilePlanNumberSelectionFlowContract$Step.PhoneNumberSelections.f100726a)) {
                    EsimMobilePlanChooseNumberScreen esimMobilePlanChooseNumberScreen = new EsimMobilePlanChooseNumberScreen(new EsimMobilePlanChooseNumberScreenContract$InputData(esimMobilePlanNumberSelectionFlowContract$InputData.f100723c, esimMobilePlanNumberSelectionFlowContract$InputData.f100722b));
                    y block = new y(aVar, esimMobilePlanChooseNumberScreen, 3);
                    Intrinsics.checkNotNullParameter(block, "block");
                    esimMobilePlanChooseNumberScreen.H = block;
                    return esimMobilePlanChooseNumberScreen;
                }
                if (Intrinsics.f(step, EsimMobilePlanNumberSelectionFlowContract$Step.TransferNumberToRevolut.f100727a)) {
                    EsimMobilePlanNumberTransferScreen esimMobilePlanNumberTransferScreen = new EsimMobilePlanNumberTransferScreen(new EsimMobilePlanNumberTransferScreenContract$InputData(esimMobilePlanNumberSelectionFlowContract$InputData.f100723c, esimMobilePlanNumberSelectionFlowContract$InputData.f100722b));
                    fca.d block2 = new fca.d(aVar, 18);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    esimMobilePlanNumberTransferScreen.H = block2;
                    return esimMobilePlanNumberTransferScreen;
                }
                if (!(step instanceof EsimMobilePlanNumberSelectionFlowContract$Step.FeaturedNumberSelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                EsimMobilePlanFeaturedNumberSelectionScreen esimMobilePlanFeaturedNumberSelectionScreen = new EsimMobilePlanFeaturedNumberSelectionScreen(new EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData(esimMobilePlanNumberSelectionFlowContract$InputData.f100721a, esimMobilePlanNumberSelectionFlowContract$InputData.f100722b, ((EsimMobilePlanNumberSelectionFlowContract$Step.FeaturedNumberSelection) step).f100725b));
                y block3 = new y(aVar, esimMobilePlanFeaturedNumberSelectionScreen, i3);
                Intrinsics.checkNotNullParameter(block3, "block");
                esimMobilePlanFeaturedNumberSelectionScreen.H = block3;
                return esimMobilePlanFeaturedNumberSelectionScreen;
            case 1:
                final com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.b) obj8;
                RefinancingAccountDetailsInputFlowContract$InputData refinancingAccountDetailsInputFlowContract$InputData = bVar.f68274p;
                qki.d dVar = bVar.f68277s;
                l FlowCoordinator2 = (l) obj2;
                RefinancingAccountDetailsInputFlowContract$Step step2 = (RefinancingAccountDetailsInputFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof RefinancingAccountDetailsInputFlowContract$Step.InputStep)) {
                    if (!(step2 instanceof RefinancingAccountDetailsInputFlowContract$Step.OpenDocumentsUpload)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RefinancingAccountDetailsInputFlowContract$Step.OpenDocumentsUpload openDocumentsUpload = (RefinancingAccountDetailsInputFlowContract$Step.OpenDocumentsUpload) step2;
                    int i6 = openDocumentsUpload.f68265a;
                    String str2 = openDocumentsUpload.f68266b;
                    p4 p4Var = (p4) ((RefinancingAccountDetailsInputFlowContract$State) ((j2) dVar.f22677a).getValue()).f68263a.get(i6);
                    for (n4 n4Var : p4Var.f) {
                        if (Intrinsics.f(n4Var.f120689a, str2)) {
                            RefinancingAccountDocumentsController refinancingAccountDocumentsController = new RefinancingAccountDocumentsController(new RefinancingAccountDocumentsScreenContract$InputData(refinancingAccountDetailsInputFlowContract$InputData.f68260a, str2, (p4) d0.K0(n4Var.f120690b), refinancingAccountDetailsInputFlowContract$InputData.f68262c));
                            a94.e block4 = new a94.e(bVar, i6, p4Var, 3);
                            Intrinsics.checkNotNullParameter(block4, "block");
                            refinancingAccountDocumentsController.H = block4;
                            return refinancingAccountDocumentsController;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                j2 j2Var = (j2) dVar.f22677a;
                j2 j2Var2 = (j2) dVar.f22677a;
                List list = ((RefinancingAccountDetailsInputFlowContract$State) j2Var.getValue()).f68263a;
                final int i21 = ((RefinancingAccountDetailsInputFlowContract$Step.InputStep) step2).f68264a;
                p4 p4Var2 = (p4) list.get(i21);
                fh4.o.Companion.getClass();
                if (n.a(p4Var2) != fh4.o.BANK_NAME) {
                    RefinancingAccountDetailsInputScreen refinancingAccountDetailsInputScreen = new RefinancingAccountDetailsInputScreen(new RefinancingAccountDetailsInputScreenContract$InputData(refinancingAccountDetailsInputFlowContract$InputData.f68260a, (p4) ((RefinancingAccountDetailsInputFlowContract$State) j2Var2.getValue()).f68263a.get(i21), i21 == 0 ? R$drawable.uikit_icn_24_cross : R$drawable.uikit_icn_24_back_button_arrow, refinancingAccountDetailsInputFlowContract$InputData.f68262c));
                    final boolean z11 = z ? 1 : 0;
                    Function1 block5 = new Function1() { // from class: fh4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (z11) {
                                case 0:
                                    com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.b bVar2 = bVar;
                                    qki.d dVar2 = bVar2.f68277s;
                                    m outputData = (m) obj9;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z12 = outputData instanceof l;
                                    int i22 = i21;
                                    aii.q qVar = aii.q.f5292a;
                                    if (z12) {
                                        bVar2.H2(dVar2, new fca.d(outputData, 19));
                                        int i32 = i22 + 1;
                                        if (((RefinancingAccountDetailsInputFlowContract$State) ((j2) dVar2.f22677a).getValue()).f68263a.size() > i32) {
                                            oki.h.t2(bVar2, bVar2.f68278t, new RefinancingAccountDetailsInputFlowContract$Step.InputStep(i32), true, null, false, 12);
                                        } else {
                                            bVar2.C2(qVar);
                                        }
                                    } else if (outputData instanceof j) {
                                        if (i22 == 0) {
                                            bVar2.C2(qVar);
                                        } else {
                                            oki.h.t2(bVar2, bVar2.f68278t, new RefinancingAccountDetailsInputFlowContract$Step.InputStep(i22 - 1), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                        }
                                    } else {
                                        if (!(outputData instanceof k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar2, bVar2.f68278t, new RefinancingAccountDetailsInputFlowContract$Step.OpenDocumentsUpload(i22, ((k) outputData).f135139a), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    ai4.h outputData2 = (ai4.h) obj9;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z29 = outputData2 instanceof ai4.g;
                                    com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.b bVar3 = bVar;
                                    int i33 = i21;
                                    if (z29) {
                                        bVar3.n2(new y0(bVar3, outputData2, i33, (Continuation) null, 3), new whi.b(6));
                                    } else {
                                        if (!(outputData2 instanceof ai4.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (i33 == 0) {
                                            bVar3.C2(aii.q.f5292a);
                                        } else {
                                            oki.h.t2(bVar3, bVar3.f68278t, new RefinancingAccountDetailsInputFlowContract$Step.InputStep(i33 - 1), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    refinancingAccountDetailsInputScreen.H = block5;
                    return refinancingAccountDetailsInputScreen;
                }
                ArrayList<e1> arrayListG = d9.e1.g(((p4) ((RefinancingAccountDetailsInputFlowContract$State) j2Var2.getValue()).f68263a.get(i21)).e, fh4.d.f135132a);
                ArrayList arrayList = new ArrayList(zhm.w.t(arrayListG, 10));
                for (e1 e1Var : arrayListG) {
                    if (e1Var == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.core.constructor.api.items.InputItem");
                    }
                    arrayList.add((k3) e1Var);
                }
                SingleSelectorInputDetailsScreen singleSelectorInputDetailsScreen = new SingleSelectorInputDetailsScreen(new SingleSelectorInputDetailsScreenContract$InputData((h3) ((k3) d0.b0(arrayList)).d, refinancingAccountDetailsInputFlowContract$InputData.f68262c));
                Function1 block6 = new Function1() { // from class: fh4.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        switch (i5) {
                            case 0:
                                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.b bVar2 = bVar;
                                qki.d dVar2 = bVar2.f68277s;
                                m outputData = (m) obj9;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean z12 = outputData instanceof l;
                                int i22 = i21;
                                aii.q qVar = aii.q.f5292a;
                                if (z12) {
                                    bVar2.H2(dVar2, new fca.d(outputData, 19));
                                    int i32 = i22 + 1;
                                    if (((RefinancingAccountDetailsInputFlowContract$State) ((j2) dVar2.f22677a).getValue()).f68263a.size() > i32) {
                                        oki.h.t2(bVar2, bVar2.f68278t, new RefinancingAccountDetailsInputFlowContract$Step.InputStep(i32), true, null, false, 12);
                                    } else {
                                        bVar2.C2(qVar);
                                    }
                                } else if (outputData instanceof j) {
                                    if (i22 == 0) {
                                        bVar2.C2(qVar);
                                    } else {
                                        oki.h.t2(bVar2, bVar2.f68278t, new RefinancingAccountDetailsInputFlowContract$Step.InputStep(i22 - 1), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    }
                                } else {
                                    if (!(outputData instanceof k)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(bVar2, bVar2.f68278t, new RefinancingAccountDetailsInputFlowContract$Step.OpenDocumentsUpload(i22, ((k) outputData).f135139a), false, null, false, 12);
                                }
                                return Unit.f186387a;
                            default:
                                ai4.h outputData2 = (ai4.h) obj9;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                boolean z29 = outputData2 instanceof ai4.g;
                                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.b bVar3 = bVar;
                                int i33 = i21;
                                if (z29) {
                                    bVar3.n2(new y0(bVar3, outputData2, i33, (Continuation) null, 3), new whi.b(6));
                                } else {
                                    if (!(outputData2 instanceof ai4.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (i33 == 0) {
                                        bVar3.C2(aii.q.f5292a);
                                    } else {
                                        oki.h.t2(bVar3, bVar3.f68278t, new RefinancingAccountDetailsInputFlowContract$Step.InputStep(i33 - 1), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    }
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block6, "block");
                singleSelectorInputDetailsScreen.H = block6;
                return singleSelectorInputDetailsScreen;
            case 2:
                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c cVar = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c) obj8;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RefinancingAccountDetailsInputScreenContract$ModalStep step3 = (RefinancingAccountDetailsInputScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof RefinancingAccountDetailsInputScreenContract$ModalStep.SingleBankSelector)) {
                    throw new NoWhenBranchMatchedException();
                }
                SingleSelectorInputDetailsScreen singleSelectorInputDetailsScreen2 = new SingleSelectorInputDetailsScreen(new SingleSelectorInputDetailsScreenContract$InputData(((RefinancingAccountDetailsInputScreenContract$ModalStep.SingleBankSelector) step3).f68270a, cVar.f68279p.d));
                y block7 = new y(cVar, step3, 5);
                Intrinsics.checkNotNullParameter(block7, "block");
                singleSelectorInputDetailsScreen2.H = block7;
                return singleSelectorInputDetailsScreen2;
            case 3:
                MandateLimitInputScreen mandateLimitInputScreen = (MandateLimitInputScreen) obj8;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = MandateLimitInputScreen.T;
                Intrinsics.checkNotNullParameter((CenteredAmountDelegate.Model) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(field, "field");
                return new zp0.d(field.getEditText(), mandateLimitInputScreen.R, (u80.d) mandateLimitInputScreen.Q.getValue(), null, new f61.a(mandateLimitInputScreen, i5), false, false, 0, false, null, 1928);
            case 4:
                com.revolut.feature.apm.wero.impl.ui.p2m.registration.a aVar2 = (com.revolut.feature.apm.wero.impl.ui.p2m.registration.a) obj8;
                l FlowCoordinator3 = (l) obj2;
                WeroP2MRegistrationFlowContract$Step step4 = (WeroP2MRegistrationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof WeroP2MRegistrationFlowContract$Step.Terms)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE1 = aVar2.e1(new j0(new ApmRegistrationTermsScope$InputData(aVar2.o.f63079a.getTerms())));
                fca.d block8 = new fca.d(aVar2, 20);
                Intrinsics.checkNotNullParameter(block8, "block");
                viewControllerE1.H = block8;
                return viewControllerE1;
            case 5:
                com.revolut.feature.instruments.trend.collections.impl.ui.collection.a aVar3 = (com.revolut.feature.instruments.trend.collections.impl.ui.collection.a) obj8;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InstrumentsTrendCollectionControllerContract$ModalStep step5 = (InstrumentsTrendCollectionControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (Intrinsics.f(step5, InstrumentsTrendCollectionControllerContract$ModalStep.HighRiskWarningStep.f74908a)) {
                    return aVar3.e1(new j3h.b(j3h.c.CRYPTO_ETN));
                }
                if (Intrinsics.f(step5, InstrumentsTrendCollectionControllerContract$ModalStep.RecommendedBuysLearnMore.f74909a)) {
                    return aVar3.e1(vqk.b.f291428a);
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f fVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) obj8;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimGetPlanScreenContract$ModalStep step6 = (EsimGetPlanScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof EsimGetPlanScreenContract$ModalStep.IncludedCountries) {
                    hij.f fVar2 = fVar.f101014x;
                    EsimGetPlanScreenContract$ModalStep.IncludedCountries includedCountries = (EsimGetPlanScreenContract$ModalStep.IncludedCountries) step6;
                    EsimCoverage coverage = includedCountries.f100999a;
                    boolean z12 = includedCountries.f101000b;
                    fVar2.getClass();
                    Intrinsics.checkNotNullParameter(coverage, "coverage");
                    Clause clauseB = z12 ? ynj.e.b(coverage, null) : new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plan_details_included_countries_title, null, null, 14);
                    if ((coverage instanceof EsimCoverage.Regional) || (coverage instanceof EsimCoverage.Global)) {
                        f100208a = coverage.getF100208a();
                    } else {
                        if (!(coverage instanceof EsimCoverage.Country) && !(coverage instanceof EsimCoverage.Undefined)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "EsimGetPlanIncludedCountriesControllerMapper", a0.d.s("Can not display countries list for coverage type ", ofj.b.a(coverage), ". Coverage code: ", coverage.getF100209b().f100235a), null, h0Var);
                        f100208a = f0.f322471a;
                    }
                    return new EsimCountryPickerScreen(new EsimCountryPickerScreenContract$InputData.DisplayCountries(clauseB, null, f100208a));
                }
                if (step6 instanceof EsimGetPlanScreenContract$ModalStep.RevPointsBottomSheet) {
                    return fVar.e1(new hub.c(e0.ESIM_CHECKOUT));
                }
                if (step6 instanceof EsimGetPlanScreenContract$ModalStep.PlanFeatureInfoBottomSheet) {
                    EsimGetPlanScreenContract$ModalStep.PlanFeatureInfoBottomSheet planFeatureInfoBottomSheet = (EsimGetPlanScreenContract$ModalStep.PlanFeatureInfoBottomSheet) step6;
                    return new EsimInfoBottomSheetScreen(new EsimInfoBottomSheetScreenContract$InputData(planFeatureInfoBottomSheet.f101006b, planFeatureInfoBottomSheet.f101005a));
                }
                if (step6 instanceof EsimGetPlanScreenContract$ModalStep.MobilePlanSummary) {
                    EsimGetPlanScreenContract$ModalStep.MobilePlanSummary mobilePlanSummary = (EsimGetPlanScreenContract$ModalStep.MobilePlanSummary) step6;
                    return new EsimMobilePlanSummaryScreen(new EsimMobilePlanSummaryScreenContract$InputData(mobilePlanSummary.f101001a, mobilePlanSummary.f101002b, null));
                }
                if (step6 instanceof EsimGetPlanScreenContract$ModalStep.AbroadWarning) {
                    hij.d dVar2 = fVar.f101015y;
                    wi0.b abroadWarningCountry = ((EsimGetPlanScreenContract$ModalStep.AbroadWarning) step6).f100997b;
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(abroadWarningCountry, "abroadWarningCountry");
                    wi0.b.Companion.getClass();
                    if (Intrinsics.f(abroadWarningCountry, wi0.b.p0)) {
                        i = 14;
                        textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_abroad_warning_dialog_title_uk, null, null, 14);
                    } else {
                        i = 14;
                        textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_abroad_warning_dialog_title_generic, null, null, 14);
                    }
                    lw0.a aVar4 = new lw0.a(textLocalisedClause, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_abroad_warning_dialog_description, null, null, i), null, null, false, 28);
                    h hVar = new h(false, new n6(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_abroad_warning_dialog_action_continue_anyway, null, null, i), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_abroad_warning_dialog_action_wait_until_im_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                    k9 k9Var = k9.ESim;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar4, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                    y block9 = new y(fVar, step6, 12);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    actionsBottomSheetController.H = block9;
                    obj4 = actionsBottomSheetController;
                } else {
                    if (!(step6 instanceof EsimGetPlanScreenContract$ModalStep.ChooseCoverage)) {
                        if (!(step6 instanceof EsimGetPlanScreenContract$ModalStep.PlanDurationPicker)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        EsimGetPlanScreenContract$ModalStep.PlanDurationPicker planDurationPicker = (EsimGetPlanScreenContract$ModalStep.PlanDurationPicker) step6;
                        EsimPlanDurationPickerBottomSheetScreen esimPlanDurationPickerBottomSheetScreen = new EsimPlanDurationPickerBottomSheetScreen(new EsimPlanDurationPickerBottomSheetScreenContract$InputData(planDurationPicker.f101004b, planDurationPicker.f101003a));
                        c0 block10 = new c0(fVar, esimPlanDurationPickerBottomSheetScreen);
                        Intrinsics.checkNotNullParameter(block10, "block");
                        esimPlanDurationPickerBottomSheetScreen.H = block10;
                        return esimPlanDurationPickerBottomSheetScreen;
                    }
                    EsimGetPlanScreenContract$DomainState.CoverageOptions coverageOptions = ((EsimGetPlanScreenContract$ModalStep.ChooseCoverage) step6).f100998a;
                    List list2 = coverageOptions.f100990a;
                    List list3 = coverageOptions.f100992c;
                    List list4 = coverageOptions.f100991b;
                    EsimCountryPickerScreen esimCountryPickerScreen = new EsimCountryPickerScreen((!list2.isEmpty() && list4.isEmpty() && list3.isEmpty()) ? new EsimCountryPickerScreenContract$InputData.SelectCountry(list2) : (!list4.isEmpty() && list2.isEmpty() && list3.isEmpty()) ? new EsimCountryPickerScreenContract$InputData.SelectRegion(list4) : new EsimCountryPickerScreenContract$InputData.SelectDestination(list2, list4, list3));
                    c0 c0Var = new c0(fVar);
                    Intrinsics.checkNotNullParameter(c0Var, "<set-?>");
                    esimCountryPickerScreen.H = c0Var;
                    obj4 = esimCountryPickerScreen;
                }
                return obj4;
            case 7:
                com.revolut.feature.shops.impl.ui.home.a aVar5 = (com.revolut.feature.shops.impl.ui.home.a) obj8;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ShopsCombinedHomeScreenContract$ModalStep step7 = (ShopsCombinedHomeScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof ShopsCombinedHomeScreenContract$ModalStep.RevPointsBottomSheet) {
                    return aVar5.e1(new hub.c(e0.SHOPS));
                }
                if (step7 instanceof ShopsCombinedHomeScreenContract$ModalStep.SoldOutDialog) {
                    return com.revolut.feature.shops.impl.ui.home.a.I2(new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_screens_home_tile_sold_out_bottom_sheet_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_screens_home_tile_sold_out_bottom_sheet_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_screens_home_tile_sold_out_bottom_sheet_action, null, null, 14));
                }
                if (step7 instanceof ShopsCombinedHomeScreenContract$ModalStep.ComingSoonDialog) {
                    return com.revolut.feature.shops.impl.ui.home.a.I2(new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_screens_home_tile_coming_soon_bottom_sheet_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_screens_home_tile_coming_soon_bottom_sheet_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_screens_home_tile_coming_soon_bottom_sheet_action, null, null, 14));
                }
                if (step7 instanceof ShopsCombinedHomeScreenContract$ModalStep.LockedDialog) {
                    w0 w0Var = ((ShopsCombinedHomeScreenContract$ModalStep.LockedDialog) step7).f87188a;
                    ActionsBottomSheetController actionsBottomSheetControllerI2 = com.revolut.feature.shops.impl.ui.home.a.I2(new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_screens_home_tile_locked_product_bottom_sheet_title, null, null, 14), new TextLocalisedClause(w0Var == w0.ULTRA ? com.revolut.feature.shops.impl.R$string.shops_screens_home_tile_locked_product_bottom_sheet_subtitle_ultra : com.revolut.feature.shops.impl.R$string.shops_screens_home_tile_locked_product_bottom_sheet_subtitle_generic, u.c(egk.e.b(aVar5.f87201x, w0Var)), null, 12), new TextLocalisedClause(com.revolut.feature.shops.impl.R$string.shops_screens_home_tile_locked_product_bottom_sheet_action, null, null, 14));
                    y block11 = new y(aVar5, w0Var, 15);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    actionsBottomSheetControllerI2.H = block11;
                    shopsBidFlow = actionsBottomSheetControllerI2;
                } else if (step7 instanceof ShopsCombinedHomeScreenContract$ModalStep.PurchaseItemDialog) {
                    ShopsPurchase shopsPurchase = ((ShopsCombinedHomeScreenContract$ModalStep.PurchaseItemDialog) step7).f87189a;
                    shopsBidFlow = new ShopsItemsDetailsScreen(new ShopsItemsDetailsScreenContract$InputData(shopsPurchase.f87067c, shopsPurchase.d, shopsPurchase.e, shopsPurchase.f87068g, shopsPurchase.k, shopsPurchase.i, shopsPurchase.f87069h));
                } else if (step7 instanceof ShopsCombinedHomeScreenContract$ModalStep.LocationPermissions) {
                    PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(zhm.v.k(new PermissionsControllerContract$Permission("android.permission.ACCESS_FINE_LOCATION", null, null, true, 6), new PermissionsControllerContract$Permission("android.permission.ACCESS_COARSE_LOCATION", null, null, true, 6))));
                    w block12 = new w(aVar5, i5);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    permissionsController.H = block12;
                    shopsBidFlow = permissionsController;
                } else {
                    if (!(step7 instanceof ShopsCombinedHomeScreenContract$ModalStep.BidAuction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ShopsAuction.Offer offer = ((ShopsCombinedHomeScreenContract$ModalStep.BidAuction) step7).f87185a;
                    shopsBidFlow = new ShopsBidFlow(new ShopsBidFlowContract$InputData(offer.f87015a, offer.d));
                }
                return shopsBidFlow;
            case 8:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar6 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a) obj8;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimMobilePlanBillingScreenContract$ModalStep step8 = (EsimMobilePlanBillingScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof EsimMobilePlanBillingScreenContract$ModalStep.RevPayPocketSelection) {
                    ViewController viewControllerE12 = aVar6.e1(new i(new PayWithAnyControllerDescriptor$InputData(t.ESIM, ((EsimMobilePlanBillingScreenContract$ModalStep.RevPayPocketSelection) step8).f101096a, (PaymentMethod.Pocket) ((fjj.k) ((j2) aVar6.A.f22677a).getValue()).f135657a.getContent(), null, null, null, w6c.f.ONLY_POCKETS_FILTERED_BY_BALANCE, null, null, false, 1912)));
                    w block13 = new w(aVar6, 3);
                    Intrinsics.checkNotNullParameter(block13, "block");
                    viewControllerE12.H = block13;
                    return viewControllerE12;
                }
                if (Intrinsics.f(step8, EsimMobilePlanBillingScreenContract$ModalStep.RevPointsInfo.f101097a)) {
                    return new EsimMobilePlanRevPointsInfoScreen();
                }
                if (!(step8 instanceof EsimMobilePlanBillingScreenContract$ModalStep.CancellationConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActionsBottomSheetController actionsBottomSheetControllerA = aVar6.f101103w.a(((EsimMobilePlanBillingScreenContract$ModalStep.CancellationConfirmation) step8).f101095b);
                y block14 = new y(aVar6, step8, 17);
                Intrinsics.checkNotNullParameter(block14, "block");
                actionsBottomSheetControllerA.H = block14;
                return actionsBottomSheetControllerA;
            case 9:
                final com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d dVar3 = (com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d) obj8;
                l FlowCoordinator4 = (l) obj2;
                final OpenBankingBrPaymentsFlowContract$Step step9 = (OpenBankingBrPaymentsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (Intrinsics.f(step9, OpenBankingBrPaymentsFlowContract$Step.PaymentAuthorization.f72699a)) {
                    OpenBankingBrPaymentScreen openBankingBrPaymentScreen = new OpenBankingBrPaymentScreen(new j(dVar3.f72709q.f72692a));
                    y block15 = new y(dVar3, FlowCoordinator4, 18);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    openBankingBrPaymentScreen.H = block15;
                    return openBankingBrPaymentScreen;
                }
                if (step9 instanceof OpenBankingBrPaymentsFlowContract$Step.LimitUpdate) {
                    OpenBankingBrPaymentsFlowContract$Step.LimitUpdate limitUpdate = (OpenBankingBrPaymentsFlowContract$Step.LimitUpdate) step9;
                    BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen = new BrPaymentLimitsUpdateScreen(new BrPaymentLimitsUpdateScreenContract$InputData(limitUpdate.f72696b, limitUpdate.f72697c, false));
                    final boolean z29 = z3 ? 1 : 0;
                    Function1 block16 = new Function1() { // from class: fk6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (z29) {
                                case 0:
                                    BrPaymentLimitsUpdateScreenContract$OutputData result = (BrPaymentLimitsUpdateScreenContract$OutputData) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d dVar4 = dVar3;
                                    dVar4.l2(new com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.b(result, dVar4, step9, null), new yi5.b(26));
                                    break;
                                default:
                                    BrPaymentExpiryDateUpdateScreenContract$OutputData result2 = (BrPaymentExpiryDateUpdateScreenContract$OutputData) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d dVar5 = dVar3;
                                    dVar5.l2(new com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.c(result2, dVar5, step9, null), new yi5.b(26));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block16, "block");
                    brPaymentLimitsUpdateScreen.H = block16;
                    obj5 = brPaymentLimitsUpdateScreen;
                } else {
                    if (!(step9 instanceof OpenBankingBrPaymentsFlowContract$Step.ExpiryDateUpdate)) {
                        if (Intrinsics.f(step9, OpenBankingBrPaymentsFlowContract$Step.PaymentNotificationsInfo.f72700a)) {
                            dVar3.f72708p.getClass();
                            lw0.a aVar7 = new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_payment_authorization_notify_before_payment, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_payment_authorization_notify_before_payment_modal_description, null, null, 14), null, null, false, 28);
                            aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                            k9 k9Var2 = k9.OpenBanking;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                            return new ActionsBottomSheetController(new dii.a(aVar7, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                        }
                        if (!(step9 instanceof OpenBankingBrPaymentsFlowContract$Step.ManualReturnToClient)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BrPaymentManualReturnScreen brPaymentManualReturnScreen = new BrPaymentManualReturnScreen(new jk6.d(((OpenBankingBrPaymentsFlowContract$Step.ManualReturnToClient) step9).f72698a));
                        baa.c block17 = new baa.c(dVar3, FlowCoordinator4, 9);
                        Intrinsics.checkNotNullParameter(block17, "block");
                        brPaymentManualReturnScreen.H = block17;
                        return brPaymentManualReturnScreen;
                    }
                    BrPaymentExpiryDateUpdateScreen brPaymentExpiryDateUpdateScreen = new BrPaymentExpiryDateUpdateScreen(new BrPaymentExpiryDateUpdateScreenContract$InputData(((OpenBankingBrPaymentsFlowContract$Step.ExpiryDateUpdate) step9).f72694b, null));
                    Function1 block18 = new Function1() { // from class: fk6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i5) {
                                case 0:
                                    BrPaymentLimitsUpdateScreenContract$OutputData result = (BrPaymentLimitsUpdateScreenContract$OutputData) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d dVar4 = dVar3;
                                    dVar4.l2(new com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.b(result, dVar4, step9, null), new yi5.b(26));
                                    break;
                                default:
                                    BrPaymentExpiryDateUpdateScreenContract$OutputData result2 = (BrPaymentExpiryDateUpdateScreenContract$OutputData) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d dVar5 = dVar3;
                                    dVar5.l2(new com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.c(result2, dVar5, step9, null), new yi5.b(26));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    brPaymentExpiryDateUpdateScreen.H = block18;
                    obj5 = brPaymentExpiryDateUpdateScreen;
                }
                return obj5;
            case 10:
                com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a aVar8 = (com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a) obj8;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                UnsettledDialogControllerContract$ModalStep step10 = (UnsettledDialogControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof UnsettledDialogControllerContract$ModalStep.OrdersList) {
                    return aVar8.e1(new mdf.a(((UnsettledDialogControllerContract$ModalStep.OrdersList) step10).f95977a));
                }
                if (step10 instanceof UnsettledDialogControllerContract$ModalStep.TransactionsList) {
                    return aVar8.e1(new InvestTransactionsListContract$Descriptor(((UnsettledDialogControllerContract$ModalStep.TransactionsList) step10).f95978a));
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new cii.b(null, (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), fkh.l.b(((fkh.l) obj8).f135841c));
            case 12:
                com.revolut.feature.alipay.impl.ui.webcontainer.a aVar9 = (com.revolut.feature.alipay.impl.ui.webcontainer.a) obj8;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                AlipayPlusWebContainerContract$Step step11 = (AlipayPlusWebContainerContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof AlipayPlusWebContainerContract$Step.WebContainer)) {
                    throw new NoWhenBranchMatchedException();
                }
                AlipayPlusWebContainerScreen alipayPlusWebContainerScreen = new AlipayPlusWebContainerScreen(((AlipayPlusWebContainerContract$Step.WebContainer) step11).f61097a);
                w block19 = new w(aVar9, 4);
                Intrinsics.checkNotNullParameter(block19, "block");
                alipayPlusWebContainerScreen.H = block19;
                return alipayPlusWebContainerScreen;
            case 13:
                String juniorId = (String) obj2;
                RemoteLoginInvitation invitation = (RemoteLoginInvitation) obj3;
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                Intrinsics.checkNotNullParameter(invitation, "invitation");
                ((fl8.d) obj8).f135906b.f(fl8.d.a(juniorId), invitation);
                return Unit.f186387a;
            case 14:
                jla.f catalogue = (jla.f) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(catalogue, "catalogue");
                ((fla.g) obj8).f135927c.f("PRODUCT_CATALOGUE_CACHE_KEY", catalogue);
                return Unit.f186387a;
            case 15:
                cm1.c params = (cm1.c) obj2;
                List data = (List) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(data, "data");
                ((fm1.c) obj8).f136020b.f(hx7.l.d(params), data);
                return Unit.f186387a;
            case 16:
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar2 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) obj8;
                yjb.c cVar2 = bVar2.H;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ReviewProductDetailsScreenContract$ModalStep step12 = (ReviewProductDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof ReviewProductDetailsScreenContract$ModalStep.Disclaimer) {
                    ReviewProductDetailsScreenContract$ModalStep.Disclaimer disclaimer = (ReviewProductDetailsScreenContract$ModalStep.Disclaimer) step12;
                    lw0.a aVar10 = new lw0.a(new TextClause(disclaimer.f83292a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(disclaimer.f83293b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28);
                    aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.e, null, null, false, null, null, 1016), null, null, 55);
                    if (q0.f136295a[bVar2.v.f83287a.f86683a.f86628r.ordinal()] == 1) {
                        value = k9.Accounts;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value, "value");
                    } else {
                        value = k9.Savings;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value, "value");
                    }
                    return new ActionsBottomSheetController(new dii.a(aVar10, eVar2, new AnalyticsProduct.Retail(value), null, null, 24));
                }
                if (!(step12 instanceof ReviewProductDetailsScreenContract$ModalStep.ChallengeDuration)) {
                    if (!(step12 instanceof ReviewProductDetailsScreenContract$ModalStep.ChallengeInitialDeposit)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar2.getClass();
                    lw0.a aVar11 = new lw0.a(new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_onboarding_sheet_initial_deposit_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_onboarding_sheet_initial_deposit_description, null, null, 14), null, null, false, 28);
                    aw0.e eVar3 = new aw0.e(false, null, null, yjb.c.a(), null, null, 55);
                    k9 k9Var3 = k9.Savings;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar11, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                }
                SavingsChallenge challenge = ((ReviewProductDetailsScreenContract$ModalStep.ChallengeDuration) step12).f83290a;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(challenge, "challenge");
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_onboarding_sheet_duration_title, null, null, 14);
                int i22 = com.revolut.feature.retail.savings.api.R$string.savings_challenge_onboarding_sheet_duration_v2_description;
                long jR = oi0.d.R(challenge.d);
                TimeClause.Format.DateLong dateLong = TimeClause.Format.DateLong.f57962b;
                lw0.a aVar12 = new lw0.a(textLocalisedClause2, new TextLocalisedClause(i22, zhm.v.k(new TimeClause(jR, dateLong, null, null, 12), new TimeClause(oi0.d.R(challenge.e), dateLong, null, null, 12), new TimeClause(oi0.d.R(challenge.f), dateLong, null, null, 12)), null, 12), null, null, false, 28);
                aw0.e eVar4 = new aw0.e(false, null, null, yjb.c.a(), null, null, 55);
                k9 k9Var4 = k9.Savings;
                Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar12, eVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
            case 17:
                CenteredAmountDelegate.Model data2 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = AmountScreen.V;
                Intrinsics.checkNotNullParameter(data2, "data");
                Intrinsics.checkNotNullParameter(field2, "field");
                MaskedTextInputEditText editText = field2.getEditText();
                Object obj9 = data2.f51981p;
                Intrinsics.i(obj9, "null cannot be cast to non-null type com.revolut.feature.transfer.core.api.mapper.TransferAmountInputPayload");
                return new zp0.d(editText, ((yof.b) obj9).f315672a, (u80.d) ((AmountScreen) obj8).P.getValue(), null, null, false, false, 0, false, null, 1944);
            case 18:
                com.revolut.feature.payment.counterparty.impl.screen.profile.a aVar13 = (com.revolut.feature.payment.counterparty.impl.screen.profile.a) obj8;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator8 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CounterPartyDetailsScreenContract$ModalStep step13 = (CounterPartyDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator8, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!Intrinsics.f(step13, CounterPartyDetailsScreenContract$ModalStep.DeleteRecipient.f79051a)) {
                    if (Intrinsics.f(step13, CounterPartyDetailsScreenContract$ModalStep.ChangeBackgroundDialog.f79050a)) {
                        return aVar13.u.Z2(aVar13.o.f79049a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                int i32 = com.revolut.feature.payment.counterparty.api.R$string.profile_biller_delete_alert_title_format;
                PaymentCounterpartyInfo paymentCounterpartyInfo = (PaymentCounterpartyInfo) ((fo9.h) ((j2) aVar13.v.f22677a).getValue()).f136843a.getContent();
                String str3 = paymentCounterpartyInfo != null ? paymentCounterpartyInfo.e : null;
                if (str3 == null) {
                    str3 = "";
                }
                lw0.a aVar14 = new lw0.a(new TextLocalisedClause(i32, u.c(str3), null, 12), null, null, null, false, 30);
                aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.common_action_delete, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                k9 k9Var5 = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar14, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
                w block20 = new w(aVar13, 20);
                Intrinsics.checkNotNullParameter(block20, "block");
                actionsBottomSheetController2.H = block20;
                return actionsBottomSheetController2;
            case 19:
                com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a aVar15 = (com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a) obj8;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator9 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                NotificationSettingDetailsContract$Steps step14 = (NotificationSettingDetailsContract$Steps) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator9, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof NotificationSettingDetailsContract$Steps.InsightMarketAlertModeInfo) {
                    return aVar15.e1(new w08.b(((NotificationSettingDetailsContract$Steps.InsightMarketAlertModeInfo) step14).f81461a == a59.a.ADVANCED));
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                final com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection.a aVar16 = (com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection.a) obj8;
                ScreenerViewCollectionFlowContract$Input screenerViewCollectionFlowContract$Input = aVar16.o;
                final l FlowCoordinator5 = (l) obj2;
                ScreenerViewCollectionFlowContract$Step step15 = (ScreenerViewCollectionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof ScreenerViewCollectionFlowContract$Step.Collection) {
                    ScreenerViewCollectionFlowContract$CollectionConfig screenerViewCollectionFlowContract$CollectionConfig = screenerViewCollectionFlowContract$Input.f96191a;
                    if (screenerViewCollectionFlowContract$CollectionConfig instanceof ScreenerViewCollectionFlowContract$CollectionConfig.FromId) {
                        fromCollection = new ScreenerCollectionScreenContract$CollectionConfig.FromId(((ScreenerViewCollectionFlowContract$CollectionConfig.FromId) screenerViewCollectionFlowContract$CollectionConfig).f96190a);
                    } else {
                        if (!(screenerViewCollectionFlowContract$CollectionConfig instanceof ScreenerViewCollectionFlowContract$CollectionConfig.FromCollection)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fromCollection = new ScreenerCollectionScreenContract$CollectionConfig.FromCollection(((ScreenerViewCollectionFlowContract$CollectionConfig.FromCollection) screenerViewCollectionFlowContract$CollectionConfig).f96189a);
                    }
                    ScreenerCollectionScreen screenerCollectionScreen = new ScreenerCollectionScreen(new ScreenerCollectionScreenContract$InputData(fromCollection));
                    final boolean z31 = z4 ? 1 : 0;
                    Function1 block21 = new Function1() { // from class: fph.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj10) {
                            switch (z31) {
                                case 0:
                                    tph.i output = (tph.i) obj10;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean zF = Intrinsics.f(output, tph.h.f273382a);
                                    l lVar = FlowCoordinator5;
                                    if (zF) {
                                        oki.h.t2(aVar16, lVar, ScreenerViewCollectionFlowContract$Step.Edit.f96193a, true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(output, g.f273381a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(lVar);
                                    }
                                    return Unit.f186387a;
                                default:
                                    q output2 = (q) obj10;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof wph.o) {
                                        aVar16.B2();
                                    } else {
                                        if (!Intrinsics.f(output2, p.f299336a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(FlowCoordinator5);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    screenerCollectionScreen.H = block21;
                    obj6 = screenerCollectionScreen;
                } else {
                    if (!(step15 instanceof ScreenerViewCollectionFlowContract$Step.Edit)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ScreenerViewCollectionFlowContract$CollectionConfig screenerViewCollectionFlowContract$CollectionConfig2 = screenerViewCollectionFlowContract$Input.f96191a;
                    if (screenerViewCollectionFlowContract$CollectionConfig2 instanceof ScreenerViewCollectionFlowContract$CollectionConfig.FromId) {
                        str = ((ScreenerViewCollectionFlowContract$CollectionConfig.FromId) screenerViewCollectionFlowContract$CollectionConfig2).f96190a;
                    } else {
                        if (!(screenerViewCollectionFlowContract$CollectionConfig2 instanceof ScreenerViewCollectionFlowContract$CollectionConfig.FromCollection)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((ScreenerViewCollectionFlowContract$CollectionConfig.FromCollection) screenerViewCollectionFlowContract$CollectionConfig2).f96189a.f105154a;
                    }
                    EditScreenerScreen editScreenerScreen = new EditScreenerScreen(new EditScreenerScreenContract$Input(str));
                    Function1 block22 = new Function1() { // from class: fph.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj10) {
                            switch (i5) {
                                case 0:
                                    tph.i output = (tph.i) obj10;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean zF = Intrinsics.f(output, tph.h.f273382a);
                                    l lVar = FlowCoordinator5;
                                    if (zF) {
                                        oki.h.t2(aVar16, lVar, ScreenerViewCollectionFlowContract$Step.Edit.f96193a, true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(output, g.f273381a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(lVar);
                                    }
                                    return Unit.f186387a;
                                default:
                                    q output2 = (q) obj10;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof wph.o) {
                                        aVar16.B2();
                                    } else {
                                        if (!Intrinsics.f(output2, p.f299336a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(FlowCoordinator5);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block22, "block");
                    editScreenerScreen.H = block22;
                    obj6 = editScreenerScreen;
                }
                return obj6;
            case 21:
                fr7.l lVar = (fr7.l) obj8;
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new fr7.h(lVar.a(), new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_documents_preview_title, u.c(lVar.f137406a.f75692a.d), null, 12), (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null)));
            case 22:
                CenteredAmountDelegate.Model data3 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field3 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr3 = JuniorTransferAmountScreen.i0;
                Intrinsics.checkNotNullParameter(data3, "data");
                Intrinsics.checkNotNullParameter(field3, "field");
                MaskedTextInputEditText editText2 = field3.getEditText();
                Object obj10 = data3.f51981p;
                Intrinsics.i(obj10, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(editText2, (xi0.b) obj10, (u80.d) ((JuniorTransferAmountScreen) obj8).c0.getValue(), null, null, false, false, 0, false, null, 1944);
            case 23:
                final com.revolut.feature.salary_switch.impl.ui.mexico.flow.a aVar17 = (com.revolut.feature.salary_switch.impl.ui.mexico.flow.a) obj8;
                final l FlowCoordinator6 = (l) obj2;
                SalarySwitchMxFlowContract$Step it8 = (SalarySwitchMxFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (Intrinsics.f(it8, SalarySwitchMxFlowContract$Step.EnterAccountDetails.f85320a)) {
                    AccountDetailsController accountDetailsController = new AccountDetailsController();
                    final boolean z41 = z6 ? 1 : 0;
                    Function1 block23 = new Function1() { // from class: frc.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            switch (z41) {
                                case 0:
                                    grc.b output = (grc.b) obj11;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    oki.h.t2(aVar17, FlowCoordinator6, new SalarySwitchMxFlowContract$Step.ReviewAccountDetails(output.f145965a, output.f145966b), true, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    krc.c output2 = (krc.c) obj11;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    l lVar2 = FlowCoordinator6;
                                    oki.h.r2(lVar2);
                                    oki.h.t2(aVar17, lVar2, new SalarySwitchMxFlowContract$Step.ShowSalaryStatus(output2.f188847a), false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    mrc.c output3 = (mrc.c) obj11;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, mrc.c.f208101a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar17.C1(u0.b(u0.f(new SalarySwitchDestination(null, null))));
                                    oki.h.D2(FlowCoordinator6);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block23, "block");
                    accountDetailsController.H = block23;
                    return accountDetailsController;
                }
                if (it8 instanceof SalarySwitchMxFlowContract$Step.ReviewAccountDetails) {
                    SalarySwitchMxFlowContract$Step.ReviewAccountDetails reviewAccountDetails = (SalarySwitchMxFlowContract$Step.ReviewAccountDetails) it8;
                    ReviewAccountDetailsController reviewAccountDetailsController = new ReviewAccountDetailsController(new ReviewAccountDetailsContract$InputData(reviewAccountDetails.f85321a, reviewAccountDetails.f85322b));
                    Function1 block24 = new Function1() { // from class: frc.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            switch (i5) {
                                case 0:
                                    grc.b output = (grc.b) obj11;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    oki.h.t2(aVar17, FlowCoordinator6, new SalarySwitchMxFlowContract$Step.ReviewAccountDetails(output.f145965a, output.f145966b), true, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    krc.c output2 = (krc.c) obj11;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    l lVar2 = FlowCoordinator6;
                                    oki.h.r2(lVar2);
                                    oki.h.t2(aVar17, lVar2, new SalarySwitchMxFlowContract$Step.ShowSalaryStatus(output2.f188847a), false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    mrc.c output3 = (mrc.c) obj11;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, mrc.c.f208101a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar17.C1(u0.b(u0.f(new SalarySwitchDestination(null, null))));
                                    oki.h.D2(FlowCoordinator6);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    reviewAccountDetailsController.H = block24;
                    obj7 = reviewAccountDetailsController;
                } else {
                    if (!(it8 instanceof SalarySwitchMxFlowContract$Step.ShowSalaryStatus)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SalarySwitchStatusController salarySwitchStatusController = new SalarySwitchStatusController(new SalarySwitchStatusContract$InputData(((SalarySwitchMxFlowContract$Step.ShowSalaryStatus) it8).f85323a));
                    Function1 block25 = new Function1() { // from class: frc.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            switch (i3) {
                                case 0:
                                    grc.b output = (grc.b) obj11;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    oki.h.t2(aVar17, FlowCoordinator6, new SalarySwitchMxFlowContract$Step.ReviewAccountDetails(output.f145965a, output.f145966b), true, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    krc.c output2 = (krc.c) obj11;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    l lVar2 = FlowCoordinator6;
                                    oki.h.r2(lVar2);
                                    oki.h.t2(aVar17, lVar2, new SalarySwitchMxFlowContract$Step.ShowSalaryStatus(output2.f188847a), false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    mrc.c output3 = (mrc.c) obj11;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, mrc.c.f208101a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar17.C1(u0.b(u0.f(new SalarySwitchDestination(null, null))));
                                    oki.h.D2(FlowCoordinator6);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block25, "block");
                    salarySwitchStatusController.H = block25;
                    obj7 = salarySwitchStatusController;
                }
                return obj7;
            case 24:
                return a(obj2, obj3);
            case 25:
                String ref2 = (String) obj2;
                mel.f analystRatingsInsight = (mel.f) obj3;
                Intrinsics.checkNotNullParameter(ref2, "ref");
                Intrinsics.checkNotNullParameter(analystRatingsInsight, "analystRatingsInsight");
                ((frk.b) obj8).e.f(frk.b.b(ref2), analystRatingsInsight);
                return Unit.f186387a;
            case 26:
                cel.b request = (cel.b) obj2;
                Map data4 = (Map) obj3;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(data4, "data");
                ((frk.d) obj8).f137492b.f(frk.d.a(request), data4);
                return Unit.f186387a;
            case 27:
                return b(obj2, obj3);
            case 28:
                return c(obj2, obj3);
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ful.j.a(((cul.v) obj8).f109175a);
        }
    }

    public /* synthetic */ g(twg.c cVar, cul.v vVar) {
        this.f135089a = 29;
        this.f135090b = vVar;
    }
}
