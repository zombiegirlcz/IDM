package cwj;

import a09.z;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import cli.y;
import com.feature.user.details.impl.ui.details.UserDetailsControllerContract$ModalStep;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.slider.RangeSliderTitledView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.LitePosRootFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.LitePosRootFlowContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.LitePosRootFlowContract$Step;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.LitePosShoppingCartScreenContract$ModalStep;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.check_topup.impl.ui_kompot.flow.CheckTopUpFlowContract$Step;
import com.revolut.feature.check_topup.impl.ui_kompot.screen.review.CheckTopUpReviewScreen;
import com.revolut.feature.check_topup.impl.ui_kompot.screen.scan.CheckTopUpScanScreen;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.UploadScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.UploadScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.flow.DocumentsUploadFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.flow.DocumentsUploadFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.flow.DocumentsUploadFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.summary.SummaryScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.summary.SummaryScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.HomeInsuranceFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.HomeInsuranceFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.CheckoutController;
import com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.CheckoutControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.PaymentFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.LoanApi$Toggles;
import com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.LoanSetupSepaAccountFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.LoanSetupSepaAccountFlowController;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.LoanPaymentSettingsFlowContract$Step;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub.LoanPaymentSettingsHubController;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub.LoanPaymentSettingsHubControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.LoanRepaymentFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.LoanRepaymentFlowContract$State;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.LoanRepaymentFlowContract$Step;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.ReviewPaymentController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.ReviewPaymentControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment_v2.ReviewPaymentV2Controller;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment_v2.ReviewPaymentV2ControllerContract$InputData;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.customer_present.tips.api.navigation.CustomerPresentTipsFlowDescriptor$InputData;
import com.revolut.feature.customer_present.tips.impl.flow.tips.CustomerPresentTipsFlowContract$Step;
import com.revolut.feature.customer_present.tips.impl.screen.custom_tip.CustomTipScreen;
import com.revolut.feature.customer_present.tips.impl.screen.custom_tip.CustomTipScreenContract$InputData;
import com.revolut.feature.customer_present.tips.impl.screen.select_tip.SelectTipScreen;
import com.revolut.feature.customer_present.tips.impl.screen.select_tip.SelectTipScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.dialog.date_picker.FreelancerDatePickerScreen;
import com.revolut.feature.freelancer.impl.ui.dialog.date_picker.FreelancerDatePickerScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreenContract$Step;
import com.revolut.feature.hidden_accounts.impl.ui.flow.HiddenAccountsFlowContract$InputData;
import com.revolut.feature.hidden_accounts.impl.ui.flow.HiddenAccountsFlowContract$Step;
import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreen;
import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.JuniorAccountDetailsConfirmationScreenContract$ModalStep;
import com.revolut.feature.junior.isa.impl.ui.update_name_screen.UpdateNameScreen;
import com.revolut.feature.junior.isa.impl.ui.update_name_screen.UpdateNameScreenContract$InputData;
import com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager.JuniorAllowancePagerScreenContract$AllowancePage;
import com.revolut.feature.junior_graduation.api.model.PersonalisedGraduationData;
import com.revolut.feature.onboarding.api.onboarding.OnboardingStepsFlowDescriptor;
import com.revolut.feature.paynow.impl.screens.amount.PayNowAmountScreen;
import com.revolut.feature.paynow.impl.screens.qr.PayNowQrScreenContract$ModalStep;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.post_activation.api.navigation.PostActivationFlowDescriptor;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreenContract$ModalStep;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.DeliveryAddressScreenContract$ModalStep;
import com.revolut.feature.revolutpay.management.impl.ui.management.flow.RevolutPayManagementFlowContract$Step;
import com.revolut.feature.revolutpay.management.impl.ui.management.home.RevolutPayManagementHomeController;
import com.revolut.feature.shared.branding.api.destination.PaymentLinkAutoPreviewDescriptor$InputData;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.SubscriptionDetailsControllerContract$ModalStep;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.SubscriptionDetailsDialogController;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.SubscriptionDetailsDialogControllerContract$InputData;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$ModalStep;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperienceQuestionsScreen;
import com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlowContract$Step;
import com.revolut.feature.travel.miles.impl.ui.flow.airline_details.TravelMilesAirlineDetailsFlow;
import com.revolut.feature.travel.miles.impl.ui.flow.airline_details.TravelMilesAirlineDetailsFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.flow.flight_search_results.TravelMilesFlightSearchResultsFlow;
import com.revolut.feature.travel.miles.impl.ui.flow.flight_search_results.TravelMilesFlightSearchResultsFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.flow.main.TravelMilesMainFlow;
import com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.TravelMilesFlightSearchDashboardPagerFlow;
import com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.TravelMilesFlightSearchDashboardPagerFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.search.TravelMilesAirlinesSearchScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.home.search.TravelMilesAirlinesHomeSearchScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.transaction.TravelMilesTransactionsListScreen;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.limits.HintDialogMapper$HintDialogReason;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.order_type_selection.CommodityOrderTypeSelectionScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.order_type_selection.CommodityOrderTypeSelectionScreenContract$InputData;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreenContract$InputData;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.tutorial.CommodityTutorialScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.tutorial.CommodityTutorialScreenContract$InputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewController;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$InputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.CryptoDepositsOverviewFlowContract$InputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.CryptoDepositsOverviewFlowContract$Step;
import com.revolut.retail.feature.freelancer.revolut_shop.impl.ui.flow.RevolutShopAddressFlow;
import com.revolut.retail.feature.freelancer.revolut_shop.impl.ui.flow.RevolutShopAddressFlowContract$InputData;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$State;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$Step;
import com.revolut.retail.feature.impl.userauth.screen.notifications.NotificationsPermissionScreen;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.RetailRevolutSsoFlow;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.RetailRevolutSsoFlowContract$InputData;
import com.revolut.retail.feature.impl.userauth.shared.UserAuthUseCase;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import cul.n0;
import d27.c0;
import d27.g0;
import d27.p0;
import d27.u;
import d27.v;
import d7j.q0;
import db.i0;
import dce.l0;
import dce.m0;
import fb7.p;
import fb7.q;
import fb7.r;
import fb7.t;
import grl.k9;
import ip0.xo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import m1c.e0;
import m1c.x0;
import mii.k;
import mx0.f3;
import mx0.h3;
import oki.h;
import qa7.e;
import r7a.f;
import r7a.g;
import r7a.i;
import s7a.x;
import vc.s;
import vkm.j2;
import yhm.m;
import yhm.o;
import zbj.u0;
import zhm.d0;
import zhm.f0;
import zhm.y0;
import zp0.u;
import zp0.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f109838b;

    public /* synthetic */ h(p0 p0Var, u uVar) {
        this.f109837a = 5;
        this.f109838b = uVar;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar = (com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e) this.f109838b;
        HomeInsuranceFlowContract$InputData homeInsuranceFlowContract$InputData = eVar.f67783q;
        yki.l FlowCoordinator = (yki.l) obj2;
        HomeInsuranceFlowContract$Step step = (HomeInsuranceFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof HomeInsuranceFlowContract$Step.Initial) {
            return com.revolut.feature.credit.application.plugins.impl.ui.loading.a.b();
        }
        if (step instanceof HomeInsuranceFlowContract$Step.Intro) {
            CreditPromptFlow creditPromptFlow = new CreditPromptFlow(new CreditPromptFlowContract$InputData(((HomeInsuranceFlowContract$Step.Intro) step).f67777a.f284056a, new CreditPromptAnalyticsConfiguration(R$string.home_insurance_intro_title, 0, 0, 0, 14), homeInsuranceFlowContract$InputData.f67770a));
            dc4.f block = new dc4.f(eVar, FlowCoordinator, step);
            Intrinsics.checkNotNullParameter(block, "block");
            creditPromptFlow.H = block;
            return creditPromptFlow;
        }
        if (step instanceof HomeInsuranceFlowContract$Step.Requirements) {
            CreditPromptFlow creditPromptFlow2 = new CreditPromptFlow(new CreditPromptFlowContract$InputData(zv3.a.BACK, ((HomeInsuranceFlowContract$Step.Requirements) step).f67778a, new CreditPromptAnalyticsConfiguration(R$string.home_insurance_requirements_title, 0, 0, 0, 14), homeInsuranceFlowContract$InputData.f67770a));
            dc4.f block2 = new dc4.f(FlowCoordinator, eVar, step, 1);
            Intrinsics.checkNotNullParameter(block2, "block");
            creditPromptFlow2.H = block2;
            return creditPromptFlow2;
        }
        if (step instanceof HomeInsuranceFlowContract$Step.DocumentsUpload) {
            CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = homeInsuranceFlowContract$InputData.f67770a;
            DocumentsUploadFlowController documentsUploadFlowController = new DocumentsUploadFlowController(new DocumentsUploadFlowContract$InputData(creditApplicationPluginFlowContract$Configuration.f66892b + "-" + creditApplicationPluginFlowContract$Configuration.f66894g, ((HomeInsuranceFlowContract$Step.DocumentsUpload) step).f67775a, zv3.a.BACK, homeInsuranceFlowContract$InputData.f67770a));
            dc4.f block3 = new dc4.f(FlowCoordinator, eVar, step, 2);
            Intrinsics.checkNotNullParameter(block3, "block");
            documentsUploadFlowController.H = block3;
            return documentsUploadFlowController;
        }
        if (step instanceof HomeInsuranceFlowContract$Step.Disclaimer) {
            return new CreditPromptFlow(new CreditPromptFlowContract$InputData(((HomeInsuranceFlowContract$Step.Disclaimer) step).f67774a, new CreditPromptAnalyticsConfiguration(R$string.home_insurance_disclaimer_title, 0, 0, 0, 14), homeInsuranceFlowContract$InputData.f67770a));
        }
        if (!(step instanceof HomeInsuranceFlowContract$Step.ContinueWebViewPopup)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = R$string.home_insurance_partner_continue_title;
        uy3.d dVar = ((HomeInsuranceFlowContract$Step.ContinueWebViewPopup) step).f67772a;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(i, zhm.u.c(dVar.f284059a), null, 12), new TextLocalisedClause(R$string.home_insurance_partner_continue_description, zhm.u.c(new HtmlClause(0, 30, (Integer) null, (Object) null, dVar.f284060b)), null, 12), null, null, false, 28);
        aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.home_insurance_partner_continue_primary_button, zhm.u.c(dVar.f284061c), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.home_insurance_partner_continue_secondary_button, zhm.u.c(dVar.d), null, 12), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        dc4.g block4 = new dc4.g(eVar, step, 0);
        Intrinsics.checkNotNullParameter(block4, "block");
        actionsBottomSheetController.H = block4;
        return actionsBottomSheetController;
    }

    private final Object b(Object obj2, Object obj3) {
        dc8.f fVar = (dc8.f) this.f109838b;
        ali.b PagerCoordinator = (ali.b) obj2;
        JuniorAllowancePagerScreenContract$AllowancePage page = (JuniorAllowancePagerScreenContract$AllowancePage) obj3;
        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
        Intrinsics.checkNotNullParameter(page, "page");
        String str = page.f76837a;
        do3.n nVar = (do3.n) ((dc8.b) ((j2) fVar.f112818r.f22677a).getValue()).f112815c.getContent();
        return fVar.e1(new c9e.d(str, Intrinsics.f(page.f76838b, nVar != null ? nVar.f116408a : null) ? f9e.b.REGULAR : f9e.b.JUNIOR_ALLOWANCE_EXTERNAL));
    }

    private final Object c(Object obj2, Object obj3) {
        final com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) this.f109838b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        SubscriptionDetailsControllerContract$ModalStep step = (SubscriptionDetailsControllerContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        final qua.p pVar = (qua.p) ((dce.p) ((j2) cVar.N.f22677a).getValue()).f.getContent();
        if (pVar == null) {
            throw new IllegalStateException(("Subscription not loaded when opening dialog: " + step).toString());
        }
        ibd.e eVar = pVar.f249314a;
        if (step instanceof SubscriptionDetailsControllerContract$ModalStep.CancelSubscription) {
            SubscriptionDetailsDialogController subscriptionDetailsDialogController = new SubscriptionDetailsDialogController(new SubscriptionDetailsDialogControllerContract$InputData.CancelSubscription(pVar));
            final int i = 3;
            Function1 block = new Function1() { // from class: dce.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (Intrinsics.f(output, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar2 = cVar;
                                cVar2.A1(new com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.b(cVar2, null, pVar), new yi5.b(25));
                            } else if (!Intrinsics.f(output, a.C0554a.f89298a) && !(output instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output2 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (Intrinsics.f(output2, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar3 = cVar;
                                cVar3.A1(new r0(cVar3, pVar, null, 7), new yi5.b(25));
                            } else if (!Intrinsics.f(output2, a.C0554a.f89298a) && !(output2 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output3 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 instanceof fce.z) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar4 = cVar;
                                cVar4.A1(new s0(cVar4, pVar, output3, null, 0), new yi5.b(25));
                            } else if (!Intrinsics.f(output3, a.b.f89299a) && !Intrinsics.f(output3, a.C0554a.f89298a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 3:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output4 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (Intrinsics.f(output4, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar5 = cVar;
                                cVar5.A1(new r0(cVar5, pVar, null, 2), new yi5.b(25));
                            } else if (!Intrinsics.f(output4, a.C0554a.f89298a) && !(output4 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 4:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output5 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            if (Intrinsics.f(output5, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar6 = cVar;
                                cVar6.A1(new r0(cVar6, pVar, null, 3), new yi5.b(25));
                            } else if (!Intrinsics.f(output5, a.C0554a.f89298a) && !(output5 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 5:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output6 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output6, "output");
                            if (Intrinsics.f(output6, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar7 = cVar;
                                cVar7.A1(new r0(cVar7, pVar, null, 4), new yi5.b(25));
                            } else if (!Intrinsics.f(output6, a.C0554a.f89298a) && !(output6 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 6:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output7 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output7, "output");
                            if (Intrinsics.f(output7, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar8 = cVar;
                                cVar8.A1(new r0(cVar8, pVar, null, 5), new yi5.b(25));
                            } else if (!Intrinsics.f(output7, a.C0554a.f89298a) && !(output7 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output8 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output8, "output");
                            if (Intrinsics.f(output8, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar9 = cVar;
                                cVar9.A1(new r0(cVar9, pVar, null, 6), new yi5.b(25));
                            } else if (!Intrinsics.f(output8, a.C0554a.f89298a) && !(output8 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            subscriptionDetailsDialogController.H = block;
            return subscriptionDetailsDialogController;
        }
        if (step instanceof SubscriptionDetailsControllerContract$ModalStep.CancelNzDirectDebit) {
            SubscriptionDetailsDialogController subscriptionDetailsDialogController2 = new SubscriptionDetailsDialogController(new SubscriptionDetailsDialogControllerContract$InputData.CancelNzDirectDebit(pVar, false));
            final int i2 = 4;
            Function1 block2 = new Function1() { // from class: dce.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (Intrinsics.f(output, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar2 = cVar;
                                cVar2.A1(new com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.b(cVar2, null, pVar), new yi5.b(25));
                            } else if (!Intrinsics.f(output, a.C0554a.f89298a) && !(output instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output2 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (Intrinsics.f(output2, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar3 = cVar;
                                cVar3.A1(new r0(cVar3, pVar, null, 7), new yi5.b(25));
                            } else if (!Intrinsics.f(output2, a.C0554a.f89298a) && !(output2 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output3 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 instanceof fce.z) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar4 = cVar;
                                cVar4.A1(new s0(cVar4, pVar, output3, null, 0), new yi5.b(25));
                            } else if (!Intrinsics.f(output3, a.b.f89299a) && !Intrinsics.f(output3, a.C0554a.f89298a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 3:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output4 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (Intrinsics.f(output4, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar5 = cVar;
                                cVar5.A1(new r0(cVar5, pVar, null, 2), new yi5.b(25));
                            } else if (!Intrinsics.f(output4, a.C0554a.f89298a) && !(output4 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 4:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output5 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            if (Intrinsics.f(output5, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar6 = cVar;
                                cVar6.A1(new r0(cVar6, pVar, null, 3), new yi5.b(25));
                            } else if (!Intrinsics.f(output5, a.C0554a.f89298a) && !(output5 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 5:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output6 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output6, "output");
                            if (Intrinsics.f(output6, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar7 = cVar;
                                cVar7.A1(new r0(cVar7, pVar, null, 4), new yi5.b(25));
                            } else if (!Intrinsics.f(output6, a.C0554a.f89298a) && !(output6 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 6:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output7 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output7, "output");
                            if (Intrinsics.f(output7, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar8 = cVar;
                                cVar8.A1(new r0(cVar8, pVar, null, 5), new yi5.b(25));
                            } else if (!Intrinsics.f(output7, a.C0554a.f89298a) && !(output7 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output8 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output8, "output");
                            if (Intrinsics.f(output8, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar9 = cVar;
                                cVar9.A1(new r0(cVar9, pVar, null, 6), new yi5.b(25));
                            } else if (!Intrinsics.f(output8, a.C0554a.f89298a) && !(output8 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            subscriptionDetailsDialogController2.H = block2;
            return subscriptionDetailsDialogController2;
        }
        if (step instanceof SubscriptionDetailsControllerContract$ModalStep.UnblockNzDirectDebit) {
            SubscriptionDetailsDialogController subscriptionDetailsDialogController3 = new SubscriptionDetailsDialogController(new SubscriptionDetailsDialogControllerContract$InputData.UnblockNzDirectDebit(pVar, false));
            final int i3 = 5;
            Function1 block3 = new Function1() { // from class: dce.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (Intrinsics.f(output, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar2 = cVar;
                                cVar2.A1(new com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.b(cVar2, null, pVar), new yi5.b(25));
                            } else if (!Intrinsics.f(output, a.C0554a.f89298a) && !(output instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output2 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (Intrinsics.f(output2, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar3 = cVar;
                                cVar3.A1(new r0(cVar3, pVar, null, 7), new yi5.b(25));
                            } else if (!Intrinsics.f(output2, a.C0554a.f89298a) && !(output2 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output3 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 instanceof fce.z) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar4 = cVar;
                                cVar4.A1(new s0(cVar4, pVar, output3, null, 0), new yi5.b(25));
                            } else if (!Intrinsics.f(output3, a.b.f89299a) && !Intrinsics.f(output3, a.C0554a.f89298a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 3:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output4 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (Intrinsics.f(output4, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar5 = cVar;
                                cVar5.A1(new r0(cVar5, pVar, null, 2), new yi5.b(25));
                            } else if (!Intrinsics.f(output4, a.C0554a.f89298a) && !(output4 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 4:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output5 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            if (Intrinsics.f(output5, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar6 = cVar;
                                cVar6.A1(new r0(cVar6, pVar, null, 3), new yi5.b(25));
                            } else if (!Intrinsics.f(output5, a.C0554a.f89298a) && !(output5 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 5:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output6 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output6, "output");
                            if (Intrinsics.f(output6, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar7 = cVar;
                                cVar7.A1(new r0(cVar7, pVar, null, 4), new yi5.b(25));
                            } else if (!Intrinsics.f(output6, a.C0554a.f89298a) && !(output6 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 6:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output7 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output7, "output");
                            if (Intrinsics.f(output7, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar8 = cVar;
                                cVar8.A1(new r0(cVar8, pVar, null, 5), new yi5.b(25));
                            } else if (!Intrinsics.f(output7, a.C0554a.f89298a) && !(output7 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output8 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output8, "output");
                            if (Intrinsics.f(output8, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar9 = cVar;
                                cVar9.A1(new r0(cVar9, pVar, null, 6), new yi5.b(25));
                            } else if (!Intrinsics.f(output8, a.C0554a.f89298a) && !(output8 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            subscriptionDetailsDialogController3.H = block3;
            return subscriptionDetailsDialogController3;
        }
        if (step instanceof SubscriptionDetailsControllerContract$ModalStep.DeactivateSubscription) {
            boolean z = eVar.f160152c.b() || qua.u.x(pVar);
            SubscriptionDetailsDialogController subscriptionDetailsDialogController4 = new SubscriptionDetailsDialogController(z ? new SubscriptionDetailsDialogControllerContract$InputData.ApmMandateCancelSubscription(pVar) : new SubscriptionDetailsDialogControllerContract$InputData.DeactivateSubscription(pVar));
            z block4 = new z(cVar, z, pVar, 17);
            Intrinsics.checkNotNullParameter(block4, "block");
            subscriptionDetailsDialogController4.H = block4;
            return subscriptionDetailsDialogController4;
        }
        if (step instanceof SubscriptionDetailsControllerContract$ModalStep.DeleteSubscription) {
            SubscriptionDetailsDialogController subscriptionDetailsDialogController5 = new SubscriptionDetailsDialogController((eVar.f160152c.b() || qua.u.x(pVar)) ? new SubscriptionDetailsDialogControllerContract$InputData.ApmMandateCancelSubscription(pVar) : eVar.f160152c.e() ? new SubscriptionDetailsDialogControllerContract$InputData.CancelSubscription(pVar) : ofm.q.w(pVar) ? new SubscriptionDetailsDialogControllerContract$InputData.DeleteJuniorAllowance(pVar) : ofm.q.H(pVar) ? new SubscriptionDetailsDialogControllerContract$InputData.DeleteScheduledPayment(pVar) : new SubscriptionDetailsDialogControllerContract$InputData.DeleteRecurringPayment(pVar));
            final int i5 = 6;
            Function1 block5 = new Function1() { // from class: dce.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i5) {
                        case 0:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (Intrinsics.f(output, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar2 = cVar;
                                cVar2.A1(new com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.b(cVar2, null, pVar), new yi5.b(25));
                            } else if (!Intrinsics.f(output, a.C0554a.f89298a) && !(output instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output2 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (Intrinsics.f(output2, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar3 = cVar;
                                cVar3.A1(new r0(cVar3, pVar, null, 7), new yi5.b(25));
                            } else if (!Intrinsics.f(output2, a.C0554a.f89298a) && !(output2 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output3 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 instanceof fce.z) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar4 = cVar;
                                cVar4.A1(new s0(cVar4, pVar, output3, null, 0), new yi5.b(25));
                            } else if (!Intrinsics.f(output3, a.b.f89299a) && !Intrinsics.f(output3, a.C0554a.f89298a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 3:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output4 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (Intrinsics.f(output4, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar5 = cVar;
                                cVar5.A1(new r0(cVar5, pVar, null, 2), new yi5.b(25));
                            } else if (!Intrinsics.f(output4, a.C0554a.f89298a) && !(output4 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 4:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output5 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            if (Intrinsics.f(output5, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar6 = cVar;
                                cVar6.A1(new r0(cVar6, pVar, null, 3), new yi5.b(25));
                            } else if (!Intrinsics.f(output5, a.C0554a.f89298a) && !(output5 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 5:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output6 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output6, "output");
                            if (Intrinsics.f(output6, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar7 = cVar;
                                cVar7.A1(new r0(cVar7, pVar, null, 4), new yi5.b(25));
                            } else if (!Intrinsics.f(output6, a.C0554a.f89298a) && !(output6 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 6:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output7 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output7, "output");
                            if (Intrinsics.f(output7, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar8 = cVar;
                                cVar8.A1(new r0(cVar8, pVar, null, 5), new yi5.b(25));
                            } else if (!Intrinsics.f(output7, a.C0554a.f89298a) && !(output7 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output8 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output8, "output");
                            if (Intrinsics.f(output8, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar9 = cVar;
                                cVar9.A1(new r0(cVar9, pVar, null, 6), new yi5.b(25));
                            } else if (!Intrinsics.f(output8, a.C0554a.f89298a) && !(output8 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block5, "block");
            subscriptionDetailsDialogController5.H = block5;
            return subscriptionDetailsDialogController5;
        }
        if (step instanceof SubscriptionDetailsControllerContract$ModalStep.DisableSubscription) {
            SubscriptionDetailsDialogController subscriptionDetailsDialogController6 = new SubscriptionDetailsDialogController(new SubscriptionDetailsDialogControllerContract$InputData.DisableSubscription(pVar, ((SubscriptionDetailsControllerContract$ModalStep.DisableSubscription) step).f89256a));
            final int i6 = 7;
            Function1 block6 = new Function1() { // from class: dce.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i6) {
                        case 0:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (Intrinsics.f(output, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar2 = cVar;
                                cVar2.A1(new com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.b(cVar2, null, pVar), new yi5.b(25));
                            } else if (!Intrinsics.f(output, a.C0554a.f89298a) && !(output instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output2 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (Intrinsics.f(output2, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar3 = cVar;
                                cVar3.A1(new r0(cVar3, pVar, null, 7), new yi5.b(25));
                            } else if (!Intrinsics.f(output2, a.C0554a.f89298a) && !(output2 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output3 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 instanceof fce.z) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar4 = cVar;
                                cVar4.A1(new s0(cVar4, pVar, output3, null, 0), new yi5.b(25));
                            } else if (!Intrinsics.f(output3, a.b.f89299a) && !Intrinsics.f(output3, a.C0554a.f89298a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 3:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output4 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (Intrinsics.f(output4, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar5 = cVar;
                                cVar5.A1(new r0(cVar5, pVar, null, 2), new yi5.b(25));
                            } else if (!Intrinsics.f(output4, a.C0554a.f89298a) && !(output4 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 4:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output5 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            if (Intrinsics.f(output5, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar6 = cVar;
                                cVar6.A1(new r0(cVar6, pVar, null, 3), new yi5.b(25));
                            } else if (!Intrinsics.f(output5, a.C0554a.f89298a) && !(output5 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 5:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output6 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output6, "output");
                            if (Intrinsics.f(output6, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar7 = cVar;
                                cVar7.A1(new r0(cVar7, pVar, null, 4), new yi5.b(25));
                            } else if (!Intrinsics.f(output6, a.C0554a.f89298a) && !(output6 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 6:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output7 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output7, "output");
                            if (Intrinsics.f(output7, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar8 = cVar;
                                cVar8.A1(new r0(cVar8, pVar, null, 5), new yi5.b(25));
                            } else if (!Intrinsics.f(output7, a.C0554a.f89298a) && !(output7 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output8 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output8, "output");
                            if (Intrinsics.f(output8, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar9 = cVar;
                                cVar9.A1(new r0(cVar9, pVar, null, 6), new yi5.b(25));
                            } else if (!Intrinsics.f(output8, a.C0554a.f89298a) && !(output8 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block6, "block");
            subscriptionDetailsDialogController6.H = block6;
            return subscriptionDetailsDialogController6;
        }
        if (step instanceof SubscriptionDetailsControllerContract$ModalStep.UnblockSubscription) {
            SubscriptionDetailsDialogController subscriptionDetailsDialogController7 = new SubscriptionDetailsDialogController(new SubscriptionDetailsDialogControllerContract$InputData.UnblockSubscription(pVar));
            final int i21 = 0;
            Function1 block7 = new Function1() { // from class: dce.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i21) {
                        case 0:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (Intrinsics.f(output, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar2 = cVar;
                                cVar2.A1(new com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.b(cVar2, null, pVar), new yi5.b(25));
                            } else if (!Intrinsics.f(output, a.C0554a.f89298a) && !(output instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output2 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (Intrinsics.f(output2, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar3 = cVar;
                                cVar3.A1(new r0(cVar3, pVar, null, 7), new yi5.b(25));
                            } else if (!Intrinsics.f(output2, a.C0554a.f89298a) && !(output2 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output3 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 instanceof fce.z) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar4 = cVar;
                                cVar4.A1(new s0(cVar4, pVar, output3, null, 0), new yi5.b(25));
                            } else if (!Intrinsics.f(output3, a.b.f89299a) && !Intrinsics.f(output3, a.C0554a.f89298a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 3:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output4 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (Intrinsics.f(output4, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar5 = cVar;
                                cVar5.A1(new r0(cVar5, pVar, null, 2), new yi5.b(25));
                            } else if (!Intrinsics.f(output4, a.C0554a.f89298a) && !(output4 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 4:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output5 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            if (Intrinsics.f(output5, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar6 = cVar;
                                cVar6.A1(new r0(cVar6, pVar, null, 3), new yi5.b(25));
                            } else if (!Intrinsics.f(output5, a.C0554a.f89298a) && !(output5 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 5:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output6 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output6, "output");
                            if (Intrinsics.f(output6, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar7 = cVar;
                                cVar7.A1(new r0(cVar7, pVar, null, 4), new yi5.b(25));
                            } else if (!Intrinsics.f(output6, a.C0554a.f89298a) && !(output6 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 6:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output7 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output7, "output");
                            if (Intrinsics.f(output7, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar8 = cVar;
                                cVar8.A1(new r0(cVar8, pVar, null, 5), new yi5.b(25));
                            } else if (!Intrinsics.f(output7, a.C0554a.f89298a) && !(output7 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output8 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output8, "output");
                            if (Intrinsics.f(output8, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar9 = cVar;
                                cVar9.A1(new r0(cVar9, pVar, null, 6), new yi5.b(25));
                            } else if (!Intrinsics.f(output8, a.C0554a.f89298a) && !(output8 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block7, "block");
            subscriptionDetailsDialogController7.H = block7;
            return subscriptionDetailsDialogController7;
        }
        if (step instanceof SubscriptionDetailsControllerContract$ModalStep.ConfirmSubaccountSource) {
            return new SubscriptionDetailsDialogController(new SubscriptionDetailsDialogControllerContract$InputData.ConfirmSubaccountSource(((SubscriptionDetailsControllerContract$ModalStep.ConfirmSubaccountSource) step).f89253a));
        }
        if (step instanceof SubscriptionDetailsControllerContract$ModalStep.UnblockFuturePayments) {
            SubscriptionDetailsDialogController subscriptionDetailsDialogController8 = new SubscriptionDetailsDialogController(new SubscriptionDetailsDialogControllerContract$InputData.UnblockFuturePayments(pVar));
            final int i22 = 1;
            Function1 block8 = new Function1() { // from class: dce.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i22) {
                        case 0:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (Intrinsics.f(output, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar2 = cVar;
                                cVar2.A1(new com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.b(cVar2, null, pVar), new yi5.b(25));
                            } else if (!Intrinsics.f(output, a.C0554a.f89298a) && !(output instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output2 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (Intrinsics.f(output2, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar3 = cVar;
                                cVar3.A1(new r0(cVar3, pVar, null, 7), new yi5.b(25));
                            } else if (!Intrinsics.f(output2, a.C0554a.f89298a) && !(output2 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output3 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3 instanceof fce.z) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar4 = cVar;
                                cVar4.A1(new s0(cVar4, pVar, output3, null, 0), new yi5.b(25));
                            } else if (!Intrinsics.f(output3, a.b.f89299a) && !Intrinsics.f(output3, a.C0554a.f89298a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 3:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output4 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (Intrinsics.f(output4, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar5 = cVar;
                                cVar5.A1(new r0(cVar5, pVar, null, 2), new yi5.b(25));
                            } else if (!Intrinsics.f(output4, a.C0554a.f89298a) && !(output4 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 4:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output5 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            if (Intrinsics.f(output5, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar6 = cVar;
                                cVar6.A1(new r0(cVar6, pVar, null, 3), new yi5.b(25));
                            } else if (!Intrinsics.f(output5, a.C0554a.f89298a) && !(output5 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 5:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output6 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output6, "output");
                            if (Intrinsics.f(output6, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar7 = cVar;
                                cVar7.A1(new r0(cVar7, pVar, null, 4), new yi5.b(25));
                            } else if (!Intrinsics.f(output6, a.C0554a.f89298a) && !(output6 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 6:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output7 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output7, "output");
                            if (Intrinsics.f(output7, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar8 = cVar;
                                cVar8.A1(new r0(cVar8, pVar, null, 5), new yi5.b(25));
                            } else if (!Intrinsics.f(output7, a.C0554a.f89298a) && !(output7 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output8 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj4;
                            Intrinsics.checkNotNullParameter(output8, "output");
                            if (Intrinsics.f(output8, a.b.f89299a)) {
                                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar9 = cVar;
                                cVar9.A1(new r0(cVar9, pVar, null, 6), new yi5.b(25));
                            } else if (!Intrinsics.f(output8, a.C0554a.f89298a) && !(output8 instanceof fce.z)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block8, "block");
            subscriptionDetailsDialogController8.H = block8;
            return subscriptionDetailsDialogController8;
        }
        if (!(step instanceof SubscriptionDetailsControllerContract$ModalStep.EditFrequency)) {
            if (step instanceof SubscriptionDetailsControllerContract$ModalStep.NextPayment) {
                return new SubscriptionDetailsDialogController(new SubscriptionDetailsDialogControllerContract$InputData.NextPayment(pVar));
            }
            if (!(step instanceof SubscriptionDetailsControllerContract$ModalStep.CancelSplit)) {
                throw new NoWhenBranchMatchedException();
            }
            SubscriptionDetailsDialogController subscriptionDetailsDialogController9 = new SubscriptionDetailsDialogController(new SubscriptionDetailsDialogControllerContract$InputData.CancelSplit(((SubscriptionDetailsControllerContract$ModalStep.CancelSplit) step).f89251a));
            dc4.g block9 = new dc4.g(cVar, step, 1);
            Intrinsics.checkNotNullParameter(block9, "block");
            subscriptionDetailsDialogController9.H = block9;
            return subscriptionDetailsDialogController9;
        }
        fva.e eVar2 = pVar.K;
        EnumEntries enumEntriesA = fva.e.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : enumEntriesA) {
            switch (m0.f112877c[((fva.e) obj4).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    arrayList.add(obj4);
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        SubscriptionDetailsDialogController subscriptionDetailsDialogController10 = new SubscriptionDetailsDialogController(new SubscriptionDetailsDialogControllerContract$InputData.EditFrequency(eVar2, arrayList, pVar));
        final int i32 = 2;
        Function1 block10 = new Function1() { // from class: dce.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj42) {
                switch (i32) {
                    case 0:
                        com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj42;
                        Intrinsics.checkNotNullParameter(output, "output");
                        if (Intrinsics.f(output, a.b.f89299a)) {
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar2 = cVar;
                            cVar2.A1(new com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.b(cVar2, null, pVar), new yi5.b(25));
                        } else if (!Intrinsics.f(output, a.C0554a.f89298a) && !(output instanceof fce.z)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                    case 1:
                        com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output2 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj42;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        if (Intrinsics.f(output2, a.b.f89299a)) {
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar3 = cVar;
                            cVar3.A1(new r0(cVar3, pVar, null, 7), new yi5.b(25));
                        } else if (!Intrinsics.f(output2, a.C0554a.f89298a) && !(output2 instanceof fce.z)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                    case 2:
                        com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output3 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj42;
                        Intrinsics.checkNotNullParameter(output3, "output");
                        if (output3 instanceof fce.z) {
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar4 = cVar;
                            cVar4.A1(new s0(cVar4, pVar, output3, null, 0), new yi5.b(25));
                        } else if (!Intrinsics.f(output3, a.b.f89299a) && !Intrinsics.f(output3, a.C0554a.f89298a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                    case 3:
                        com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output4 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj42;
                        Intrinsics.checkNotNullParameter(output4, "output");
                        if (Intrinsics.f(output4, a.b.f89299a)) {
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar5 = cVar;
                            cVar5.A1(new r0(cVar5, pVar, null, 2), new yi5.b(25));
                        } else if (!Intrinsics.f(output4, a.C0554a.f89298a) && !(output4 instanceof fce.z)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                    case 4:
                        com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output5 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj42;
                        Intrinsics.checkNotNullParameter(output5, "output");
                        if (Intrinsics.f(output5, a.b.f89299a)) {
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar6 = cVar;
                            cVar6.A1(new r0(cVar6, pVar, null, 3), new yi5.b(25));
                        } else if (!Intrinsics.f(output5, a.C0554a.f89298a) && !(output5 instanceof fce.z)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                    case 5:
                        com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output6 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj42;
                        Intrinsics.checkNotNullParameter(output6, "output");
                        if (Intrinsics.f(output6, a.b.f89299a)) {
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar7 = cVar;
                            cVar7.A1(new r0(cVar7, pVar, null, 4), new yi5.b(25));
                        } else if (!Intrinsics.f(output6, a.C0554a.f89298a) && !(output6 instanceof fce.z)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                    case 6:
                        com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output7 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj42;
                        Intrinsics.checkNotNullParameter(output7, "output");
                        if (Intrinsics.f(output7, a.b.f89299a)) {
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar8 = cVar;
                            cVar8.A1(new r0(cVar8, pVar, null, 5), new yi5.b(25));
                        } else if (!Intrinsics.f(output7, a.C0554a.f89298a) && !(output7 instanceof fce.z)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                    default:
                        com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a output8 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a) obj42;
                        Intrinsics.checkNotNullParameter(output8, "output");
                        if (Intrinsics.f(output8, a.b.f89299a)) {
                            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar9 = cVar;
                            cVar9.A1(new r0(cVar9, pVar, null, 6), new yi5.b(25));
                        } else if (!Intrinsics.f(output8, a.C0554a.f89298a) && !(output8 instanceof fce.z)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block10, "block");
        subscriptionDetailsDialogController10.H = block10;
        return subscriptionDetailsDialogController10;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.b bVar = (com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.b) this.f109838b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        CryptoDepositsOverviewFlowContract$Step step = (CryptoDepositsOverviewFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CryptoDepositsOverviewFlowContract$Step.SelectCurrency) {
            CryptoDepositsOverviewFlowContract$Step.SelectCurrency selectCurrency = (CryptoDepositsOverviewFlowContract$Step.SelectCurrency) step;
            ViewController viewControllerE1 = bVar.e1(new com.revolut.feature.crypto.remittance.api.navigation.b(new CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData(selectCurrency.f100105a, new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.crypto_receive_screen_select_asset_title, null, null, 14), CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.Deposit.f70938a, (pj5.a) null, (TextLocalisedClause) null, selectCurrency.f100106b, selectCurrency.f100107c, 52)));
            l0 block = new l0(bVar, 1);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (!(step instanceof CryptoDepositsOverviewFlowContract$Step.Overview)) {
            throw new NoWhenBranchMatchedException();
        }
        CryptoDepositsOverviewFlowContract$Step.Overview overview = (CryptoDepositsOverviewFlowContract$Step.Overview) step;
        xi0.b bVar2 = overview.f100102a;
        boolean z = overview.f100103b;
        CryptoDepositsOverviewFlowContract$InputData cryptoDepositsOverviewFlowContract$InputData = bVar.o;
        u0 u0Var = cryptoDepositsOverviewFlowContract$InputData.f100097b;
        return new CryptoDepositsOverviewController(new CryptoDepositsOverviewControllerContract$InputData(overview.f100104c, cryptoDepositsOverviewFlowContract$InputData.d, cryptoDepositsOverviewFlowContract$InputData.e, bVar2, u0Var, z), bVar.f100110q);
    }

    private final Object e(Object obj2, Object obj3) {
        com.revolut.feature.retail.restaurants.impl.ui.customerdetails.a aVar = (com.revolut.feature.retail.restaurants.impl.ui.customerdetails.a) this.f109838b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CustomerDetailsScreenContract$ModalStep step = (CustomerDetailsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, CustomerDetailsScreenContract$ModalStep.PhoneNumberCountry.f82843a)) {
            throw new NoWhenBranchMatchedException();
        }
        x xVar = new x(null, null, null, null, false, null, new TextLocalisedClause(com.revolut.feature.picker.R$string.picker_country_picker_search_hint, null, null, 14), null, null, false, null, null, y0.b(((deb.h) ((j2) aVar.f82846r.f22677a).getValue()).f113354c.f113358b.f297794a), null, true, null, null, null, null, null, 2138832382);
        Object obj4 = aVar.f82845q.get();
        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
        PickerController pickerController = new PickerController(xVar, (x7a.d) obj4);
        l0 block = new l0(aVar, 5);
        Intrinsics.checkNotNullParameter(block, "block");
        pickerController.H = block;
        return pickerController;
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c cVar = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c) this.f109838b;
        rd1.a aVar = cVar.f60837p;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        LitePosShoppingCartScreenContract$ModalStep step = (LitePosShoppingCartScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, LitePosShoppingCartScreenContract$ModalStep.ClearCartConfirmation.f60834a)) {
            if (step instanceof LitePosShoppingCartScreenContract$ModalStep.AmountExceedsLimit) {
                return aVar.a(((LitePosShoppingCartScreenContract$ModalStep.AmountExceedsLimit) step).f60833a);
            }
            throw new NoWhenBranchMatchedException();
        }
        aVar.getClass();
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_shopping_cart_shopping_cart_clear_cart_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_shopping_cart_shopping_cart_clear_cart_subtitle, null, null, 14), null, null, false, 28), new aw0.g(new n6(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_shopping_cart_shopping_cart_clear_cart_confirm_action_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25), aVar.f253314b, null, null, 24));
        df1.m block = new df1.m(cVar, 0);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }

    private final Object h(Object obj2, Object obj3) {
        dfg.e eVar = (dfg.e) this.f109838b;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return new dfg.h(f0.f322471a, new dfg.f(new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_common_action_done, null, null, 14), Intrinsics.f(eVar.d, Boolean.TRUE)));
    }

    private final Object i(Object obj2, Object obj3) {
        final com.revolut.feature.check_topup.impl.ui_kompot.flow.a aVar = (com.revolut.feature.check_topup.impl.ui_kompot.flow.a) this.f109838b;
        dg3.c cVar = aVar.o;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        CheckTopUpFlowContract$Step step = (CheckTopUpFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, CheckTopUpFlowContract$Step.Permissions.f65768a)) {
            PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(zhm.u.c(new PermissionsControllerContract$Permission("android.permission.CAMERA", null, PermissionsControllerContract$Explanation.None.f80324a, true, 2))));
            final int i = 1;
            Function1 block = new Function1() { // from class: dg3.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) throws Throwable {
                    switch (i) {
                        case 0:
                            fg3.c result = (fg3.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            com.revolut.feature.check_topup.impl.ui_kompot.flow.a aVar2 = aVar;
                            h.D2(aVar2.f65772q);
                            aVar2.C1(zh9.u0.c(new TransactionsFeatureConfig.Details(new k71.c(result.f134888a), null, null, null, 126)));
                            return Unit.f186387a;
                        default:
                            i permissionFlowOutput = (i) obj4;
                            Intrinsics.checkNotNullParameter(permissionFlowOutput, "permissionFlowOutput");
                            boolean z = permissionFlowOutput instanceof r7a.e;
                            com.revolut.feature.check_topup.impl.ui_kompot.flow.a aVar3 = aVar;
                            if (z || (permissionFlowOutput instanceof f)) {
                                h.D2(aVar3.f65772q);
                            } else if (permissionFlowOutput instanceof r7a.h) {
                                h.t2(aVar3, aVar3.f65772q, CheckTopUpFlowContract$Step.Scan.f65770a, false, null, false, 12);
                            } else {
                                if (!(permissionFlowOutput instanceof g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                try {
                                    m.Companion companion = m.INSTANCE;
                                    throw new IllegalStateException("Unhandled secondary click");
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Throwable th10) {
                                    m.Companion companion2 = m.INSTANCE;
                                    Throwable thA = m.a(o.a(th10));
                                    if (thA != null) {
                                        hx7.e.n(thA);
                                    }
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            permissionsController.H = block;
            return permissionsController;
        }
        if (Intrinsics.f(step, CheckTopUpFlowContract$Step.Scan.f65770a)) {
            CheckTopUpScanScreen checkTopUpScanScreen = new CheckTopUpScanScreen(new hg3.b(cVar.f114573a));
            dg3.d block2 = new dg3.d(aVar, LazyFlowCoordinator);
            Intrinsics.checkNotNullParameter(block2, "block");
            checkTopUpScanScreen.H = block2;
            return checkTopUpScanScreen;
        }
        if (!(step instanceof CheckTopUpFlowContract$Step.Review)) {
            throw new NoWhenBranchMatchedException();
        }
        CheckTopUpReviewScreen checkTopUpReviewScreen = new CheckTopUpReviewScreen(new fg3.b(cVar.f114573a, ((CheckTopUpFlowContract$Step.Review) step).f65769a));
        final int i2 = 0;
        Function1 block3 = new Function1() { // from class: dg3.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) throws Throwable {
                switch (i2) {
                    case 0:
                        fg3.c result = (fg3.c) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        com.revolut.feature.check_topup.impl.ui_kompot.flow.a aVar2 = aVar;
                        h.D2(aVar2.f65772q);
                        aVar2.C1(zh9.u0.c(new TransactionsFeatureConfig.Details(new k71.c(result.f134888a), null, null, null, 126)));
                        return Unit.f186387a;
                    default:
                        i permissionFlowOutput = (i) obj4;
                        Intrinsics.checkNotNullParameter(permissionFlowOutput, "permissionFlowOutput");
                        boolean z = permissionFlowOutput instanceof r7a.e;
                        com.revolut.feature.check_topup.impl.ui_kompot.flow.a aVar3 = aVar;
                        if (z || (permissionFlowOutput instanceof f)) {
                            h.D2(aVar3.f65772q);
                        } else if (permissionFlowOutput instanceof r7a.h) {
                            h.t2(aVar3, aVar3.f65772q, CheckTopUpFlowContract$Step.Scan.f65770a, false, null, false, 12);
                        } else {
                            if (!(permissionFlowOutput instanceof g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            try {
                                m.Companion companion = m.INSTANCE;
                                throw new IllegalStateException("Unhandled secondary click");
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Throwable th10) {
                                m.Companion companion2 = m.INSTANCE;
                                Throwable thA = m.a(o.a(th10));
                                if (thA != null) {
                                    hx7.e.n(thA);
                                }
                            }
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        checkTopUpReviewScreen.H = block3;
        return checkTopUpReviewScreen;
    }

    private final Object j(Object obj2, Object obj3) {
        com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.a) this.f109838b;
        yki.l FlowCoordinator = (yki.l) obj2;
        PaymentFlowContract$Step step = (PaymentFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof PaymentFlowContract$Step.Checkout)) {
            throw new NoWhenBranchMatchedException();
        }
        CheckoutController checkoutController = new CheckoutController(new CheckoutControllerContract$InputData(aVar.f68179p.f68177a));
        l0 block = new l0(aVar, 12);
        Intrinsics.checkNotNullParameter(block, "block");
        checkoutController.H = block;
        return checkoutController;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RetailRevolutSsoFlowContract$InputData signUp;
        dii.a aVarA;
        dii.a aVarA2;
        Object[] objArr;
        int i = this.f109837a;
        final int i2 = 3;
        final int i3 = 2;
        char c2 = 1;
        char c3 = 1;
        char c5 = 1;
        char c6 = 1;
        boolean zC = false;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object obj4 = this.f109838b;
        switch (i) {
            case 0:
                com.revolut.retail.feature.impl.userauth.flow.f fVar = (com.revolut.retail.feature.impl.userauth.flow.f) obj4;
                UserOnboardingFlowContract$Step step = (UserOnboardingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof UserOnboardingFlowContract$Step.Authentication)) {
                    if (step instanceof UserOnboardingFlowContract$Step.NotificationsPermission) {
                        NotificationsPermissionScreen notificationsPermissionScreen = new NotificationsPermissionScreen();
                        g block = new g(fVar, c2 == true ? 1 : 0);
                        Intrinsics.checkNotNullParameter(block, "block");
                        notificationsPermissionScreen.H = block;
                        return notificationsPermissionScreen;
                    }
                    if (!(step instanceof UserOnboardingFlowContract$Step.OnboardingSteps)) {
                        if (step instanceof UserOnboardingFlowContract$Step.PostActivation) {
                            return fVar.e1(new PostActivationFlowDescriptor(new PostActivationFlowDescriptor.Configuration.Onboarding(nz8.d.p(((UserOnboardingFlowContract$State) ((j2) fVar.L.f22677a).getValue()).f101655c), ((UserOnboardingFlowContract$Step.PostActivation) step).f101664a)));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    UserOnboardingFlowContract$Step.OnboardingSteps onboardingSteps = (UserOnboardingFlowContract$Step.OnboardingSteps) step;
                    ViewController viewControllerE1 = fVar.e1(new OnboardingStepsFlowDescriptor(onboardingSteps.f101661a, onboardingSteps.f101662b, onboardingSteps.d, onboardingSteps.f101663c));
                    g block2 = new g(fVar, i2);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    viewControllerE1.H = block2;
                    return viewControllerE1;
                }
                UserAuthUseCase userAuthUseCase = ((UserOnboardingFlowContract$Step.Authentication) step).f101659a;
                if (userAuthUseCase instanceof UserAuthUseCase.CombinedAuthentication) {
                    UserAuthUseCase.CombinedAuthentication combinedAuthentication = (UserAuthUseCase.CombinedAuthentication) userAuthUseCase;
                    signUp = new RetailRevolutSsoFlowContract$InputData.CombinedAuthentication(combinedAuthentication.f101732a, combinedAuthentication.f101733b, combinedAuthentication.f101734c, combinedAuthentication.d, combinedAuthentication.e);
                } else if (userAuthUseCase instanceof UserAuthUseCase.PersonalisedGraduationSignUp) {
                    UserAuthUseCase.PersonalisedGraduationSignUp personalisedGraduationSignUp = (UserAuthUseCase.PersonalisedGraduationSignUp) userAuthUseCase;
                    PersonalisedGraduationData personalisedGraduationData = personalisedGraduationSignUp.f101736a;
                    UserAuthUseCase.CombinedAuthentication combinedAuthentication2 = personalisedGraduationSignUp.f101737b;
                    signUp = new RetailRevolutSsoFlowContract$InputData.PersonalisedGraduationSignUp(personalisedGraduationData, new RetailRevolutSsoFlowContract$InputData.CombinedAuthentication(combinedAuthentication2.f101732a, combinedAuthentication2.f101733b, combinedAuthentication2.f101734c, combinedAuthentication2.d, combinedAuthentication2.e));
                } else if (userAuthUseCase instanceof UserAuthUseCase.SignIn) {
                    signUp = new RetailRevolutSsoFlowContract$InputData.SignIn(((UserAuthUseCase.SignIn) userAuthUseCase).f101738a);
                } else if (Intrinsics.f(userAuthUseCase, UserAuthUseCase.ForgotPasscode.f101735a)) {
                    signUp = RetailRevolutSsoFlowContract$InputData.ForgotPasscode.f101691a;
                } else {
                    if (!(userAuthUseCase instanceof UserAuthUseCase.SignUp)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    signUp = new RetailRevolutSsoFlowContract$InputData.SignUp(RevolutSsoApi$DefaultIdentifier.Preferred.Phone);
                }
                RetailRevolutSsoFlow retailRevolutSsoFlow = new RetailRevolutSsoFlow(signUp);
                g block3 = new g(fVar, i3);
                Intrinsics.checkNotNullParameter(block3, "block");
                retailRevolutSsoFlow.H = block3;
                return retailRevolutSsoFlow;
            case 1:
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CheckoutScreenContract$ModalStep step2 = (CheckoutScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof CheckoutScreenContract$ModalStep.ShowDialog)) {
                    if (step2 instanceof CheckoutScreenContract$ModalStep.RevPointsBottomSheet) {
                        return cVar.e1(new hub.c(e0.CARD_CHECKOUT));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                CheckoutBottomSheetScreen checkoutBottomSheetScreen = new CheckoutBottomSheetScreen(new CheckoutBottomSheetContract$InputData(((CheckoutScreenContract$ModalStep.ShowDialog) step2).f90726a));
                n0 block4 = new n0(cVar, 19);
                Intrinsics.checkNotNullParameter(block4, "block");
                checkoutBottomSheetScreen.H = block4;
                return checkoutBottomSheetScreen;
            case 2:
                Integer num = (Integer) obj2;
                num.intValue();
                Integer num2 = (Integer) obj3;
                num2.intValue();
                Function2 function2 = ((RangeSliderTitledView) obj4).onRangeSelectionChangeListener;
                if (function2 != null) {
                    function2.invoke(num, num2);
                }
                return Unit.f186387a;
            case 3:
                com.revolut.feature.customer_present.tips.impl.flow.tips.a aVar = (com.revolut.feature.customer_present.tips.impl.flow.tips.a) obj4;
                CustomerPresentTipsFlowDescriptor$InputData customerPresentTipsFlowDescriptor$InputData = aVar.o;
                yki.l FlowCoordinator = (yki.l) obj2;
                CustomerPresentTipsFlowContract$Step step3 = (CustomerPresentTipsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof CustomerPresentTipsFlowContract$Step.SelectTip) {
                    SelectTipScreen selectTipScreen = new SelectTipScreen(new SelectTipScreenContract$InputData(customerPresentTipsFlowDescriptor$InputData.f71615a, customerPresentTipsFlowDescriptor$InputData.f71616b));
                    cn7.c block5 = new cn7.c(1, aVar, com.revolut.feature.customer_present.tips.impl.flow.tips.a.class, "handleSelectTipResult", "handleSelectTipResult(Lcom/revolut/feature/customer_present/tips/impl/screen/select_tip/SelectTipScreenContract$Output;)V", 0, 15);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    selectTipScreen.H = block5;
                    return selectTipScreen;
                }
                if (!(step3 instanceof CustomerPresentTipsFlowContract$Step.CustomTip)) {
                    throw new NoWhenBranchMatchedException();
                }
                CustomTipScreen customTipScreen = new CustomTipScreen(new CustomTipScreenContract$InputData(customerPresentTipsFlowDescriptor$InputData.f71615a));
                cn7.c block6 = new cn7.c(1, aVar, com.revolut.feature.customer_present.tips.impl.flow.tips.a.class, "handleCustomTipResult", "handleCustomTipResult(Lcom/revolut/feature/customer_present/tips/impl/screen/custom_tip/CustomTipScreenContract$Output;)V", 0, 16);
                Intrinsics.checkNotNullParameter(block6, "block");
                customTipScreen.H = block6;
                return customTipScreen;
            case 4:
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar2 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                OrderInitPageCreateScreenContract$Step step4 = (OrderInitPageCreateScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (Intrinsics.f(step4, OrderInitPageCreateScreenContract$Step.Catalogue.f74171a)) {
                    ((com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.a) aVar2.f74184w).getClass();
                    LitePosRootFlow litePosRootFlow = new LitePosRootFlow(new LitePosRootFlowContract$InputData(LitePosRootFlowContract$Step.CatalogueSinglePick.f60756a));
                    cn7.c cVar2 = new cn7.c(1, aVar2, com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a.class, "handleCatalogueResult", "handleCatalogueResult(Lcom/revolut/feature/acquiring/lite_pos/api/ui/flow/root/LitePosRootFlowOutputData;)V", 0, 17);
                    Intrinsics.checkNotNullParameter(cVar2, "<set-?>");
                    litePosRootFlow.J = cVar2;
                    return litePosRootFlow;
                }
                if (!(step4 instanceof OrderInitPageCreateScreenContract$Step.CustomisationInfo)) {
                    if (!(step4 instanceof OrderInitPageCreateScreenContract$Step.DatePicker)) {
                        if (!(step4 instanceof OrderInitPageCreateScreenContract$Step.Preview)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        OrderInitPageCreateScreenContract$Step.Preview preview = (OrderInitPageCreateScreenContract$Step.Preview) step4;
                        return aVar2.e1(new j6d.b(new PaymentLinkAutoPreviewDescriptor$InputData(xo0.WRAP_CONTENT, preview.f74176a, preview.f74177b, preview.f74178c)));
                    }
                    OrderInitPageCreateScreenContract$Step.DatePicker datePicker = (OrderInitPageCreateScreenContract$Step.DatePicker) step4;
                    FreelancerDatePickerScreen freelancerDatePickerScreen = new FreelancerDatePickerScreen(new FreelancerDatePickerScreenContract$InputData(datePicker.f74173a, datePicker.f74174b, datePicker.f74175c, datePicker.d, datePicker.e));
                    cn7.c block7 = new cn7.c(1, aVar2, com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a.class, "handleDatePickerResult", "handleDatePickerResult(Lcom/revolut/feature/freelancer/impl/ui/dialog/date_picker/FreelancerDatePickerScreenContract$OutputData;)V", 0, 18);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    freelancerDatePickerScreen.H = block7;
                    return freelancerDatePickerScreen;
                }
                f27.c cVar3 = aVar2.f74185x;
                v infoType = ((OrderInitPageCreateScreenContract$Step.CustomisationInfo) step4).f74172a;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(infoType, "infoType");
                int i5 = f27.b.f131442a[infoType.ordinal()];
                if (i5 == 1) {
                    aVarA = f27.c.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_setup_info_customer_amount_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_setup_info_customer_amount_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_setup_info_customer_amount_action_got_it, null, null, 14));
                } else if (i5 == 2) {
                    aVarA = f27.c.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_setup_info_expiry_date_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_setup_info_expiry_date_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_setup_info_expiry_date__action_got_it, null, null, 14));
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVarA = f27.c.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_setup_info_limit_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_setup_info_limit_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_setup_info_limit_action_got_it, null, null, 14));
                }
                return new ActionsBottomSheetController(aVarA);
            case 5:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new c0(p0.b((u) obj4), (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)), p0.d(false));
            case 6:
                d34.e eVar = (d34.e) obj4;
                d34.a key = (d34.a) obj2;
                qu3.g debts = (qu3.g) obj3;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(debts, "debts");
                if ((!debts.f249207a.isEmpty() ? debts : null) != null) {
                    eVar.e.b(key, debts);
                }
                return Unit.f186387a;
            case 7:
                TravelExperienceQuestionsScreen travelExperienceQuestionsScreen = (TravelExperienceQuestionsScreen) obj4;
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                KProperty[] kPropertyArr = TravelExperienceQuestionsScreen.i0;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = model.P;
                zp0.v vVar = obj5 instanceof zp0.v ? (zp0.v) obj5 : null;
                if (vVar != null) {
                    return new w(vVar, field.getInnerEditText(), u.b.f324147a, new cui.v(travelExperienceQuestionsScreen, model, 25), DefaultFrameSampler.DESIRED_FRAME_WIDTH);
                }
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                ((d4b.k) obj4).getClass();
                return new f3(null, null, null, false, h3.LOADING, false);
            case 9:
                com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.a aVar3 = (com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DeliveryAddressScreenContract$ModalStep step5 = (DeliveryAddressScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof DeliveryAddressScreenContract$ModalStep.AddNewAddress)) {
                    throw new NoWhenBranchMatchedException();
                }
                mpj.b bVar = aVar3.f84236p;
                Address address = ((d4c.e) ((j2) aVar3.f84238r.f22677a).getValue()).f111273b;
                o3c.c addressValidator = aVar3.f84237q;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(addressValidator, "addressValidator");
                RevolutShopAddressFlow revolutShopAddressFlow = new RevolutShopAddressFlow(new RevolutShopAddressFlowContract$InputData(address), addressValidator);
                d34.b block8 = new d34.b(aVar3, 6);
                Intrinsics.checkNotNullParameter(block8, "block");
                revolutShopAddressFlow.H = block8;
                return revolutShopAddressFlow;
            case 10:
                com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.a aVar4 = (com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.a) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                LoanPaymentSettingsFlowContract$Step step6 = (LoanPaymentSettingsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof LoanPaymentSettingsFlowContract$Step.Hub) {
                    LoanPaymentSettingsHubController loanPaymentSettingsHubController = new LoanPaymentSettingsHubController(new LoanPaymentSettingsHubControllerContract$InputData(((LoanPaymentSettingsFlowContract$Step.Hub) step6).f70450a));
                    cn7.c block9 = new cn7.c(1, aVar4, com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.a.class, "handleHubOutput", "handleHubOutput(Lcom/revolut/feature/credit/loan/impl/ui/rev10/payment_settings/hub/LoanPaymentSettingsHubControllerContract$OutputData;)V", 0, 20);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    loanPaymentSettingsHubController.H = block9;
                    return loanPaymentSettingsHubController;
                }
                if (step6 instanceof LoanPaymentSettingsFlowContract$Step.ChangeAutoPayAccount) {
                    LoanPaymentSettingsFlowContract$Step.ChangeAutoPayAccount changeAutoPayAccount = (LoanPaymentSettingsFlowContract$Step.ChangeAutoPayAccount) step6;
                    LoanSetupSepaAccountFlowController loanSetupSepaAccountFlowController = new LoanSetupSepaAccountFlowController(new LoanSetupSepaAccountFlowContract$InputData(changeAutoPayAccount.f70448a, changeAutoPayAccount.f70449b));
                    cn7.c block10 = new cn7.c(1, aVar4, com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.a.class, "handleAccountSelectionOutput", "handleAccountSelectionOutput(Lcom/revolut/feature/credit/loan/impl/ui/rev10/change_repayment_account/setup_sepa_direct_debit/LoanSetupSepaAccountFlowContract$OutputData;)V", 0, 21);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    loanSetupSepaAccountFlowController.H = block10;
                    return loanSetupSepaAccountFlowController;
                }
                if (!(step6 instanceof LoanPaymentSettingsFlowContract$Step.PayWithInfo)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar5 = new lw0.a(new TextLocalisedClause(R$string.loan_management_payment_settings_pay_with_info_title, null, null, 14), null, null, null, false, 30);
                aw0.e eVar2 = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.loan_management_payment_settings_pay_with_info_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                k9 k9Var = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar5, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, new dii.i(new TextLocalisedClause(R$string.loan_management_payment_settings_pay_with_info_description, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 10)), 8));
            case 11:
                com.revolut.feature.paynow.impl.screens.qr.a aVar6 = (com.revolut.feature.paynow.impl.screens.qr.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PayNowQrScreenContract$ModalStep step7 = (PayNowQrScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!(step7 instanceof PayNowQrScreenContract$ModalStep.SetAmount)) {
                    throw new NoWhenBranchMatchedException();
                }
                PayNowAmountScreen payNowAmountScreen = new PayNowAmountScreen(new b7a.e(((PayNowQrScreenContract$ModalStep.SetAmount) step7).f80301a));
                d34.b block11 = new d34.b(aVar6, 14);
                Intrinsics.checkNotNullParameter(block11, "block");
                payNowAmountScreen.H = block11;
                return payNowAmountScreen;
            case 12:
                CommodityOrderEditScreen commodityOrderEditScreen = (CommodityOrderEditScreen) obj4;
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = CommodityOrderEditScreen.W;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field2, "field");
                Object obj6 = data.f51981p;
                ExchangeOrderDraft exchangeOrderDraft = obj6 instanceof ExchangeOrderDraft ? (ExchangeOrderDraft) obj6 : null;
                if (exchangeOrderDraft == null) {
                    return null;
                }
                MaskedTextInputEditText editText = field2.getEditText();
                xi0.b bVar2 = i7j.e.d(exchangeOrderDraft).f99903a;
                qd0.b bVarN = ((r6j.b) commodityOrderEditScreen.R.getValue()).f251869b.d.n();
                s.j(bVarN);
                return new zp0.d(editText, bVar2, new u80.d(((s80.b) bVarN).b()), null, new d7j.m(commodityOrderEditScreen, data), false, false, 0, false, null, 1928);
            case 13:
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) obj4;
                l2j.a aVar7 = gVar.v;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CommodityOrderEditScreenContract$ModalStep step8 = (CommodityOrderEditScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof CommodityOrderEditScreenContract$ModalStep.SelectOrderType) {
                    CommodityOrderEditScreenContract$ModalStep.SelectOrderType selectOrderType = (CommodityOrderEditScreenContract$ModalStep.SelectOrderType) step8;
                    CommodityOrderTypeSelectionScreen commodityOrderTypeSelectionScreen = new CommodityOrderTypeSelectionScreen(new CommodityOrderTypeSelectionScreenContract$InputData(selectOrderType.f99836a, selectOrderType.f99837b, selectOrderType.f99838c, selectOrderType.d, selectOrderType.e));
                    d3i.k block12 = new d3i.k(gVar, selectOrderType, 14);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    commodityOrderTypeSelectionScreen.H = block12;
                    return commodityOrderTypeSelectionScreen;
                }
                if (step8 instanceof CommodityOrderEditScreenContract$ModalStep.Tutorial) {
                    CommodityOrderEditScreenContract$ModalStep.Tutorial tutorial = (CommodityOrderEditScreenContract$ModalStep.Tutorial) step8;
                    CommodityTutorialScreen commodityTutorialScreen = new CommodityTutorialScreen(new CommodityTutorialScreenContract$InputData(tutorial.f99846b, tutorial.f99845a, tutorial.f99847c));
                    d3i.k block13 = new d3i.k(gVar, tutorial, 13);
                    Intrinsics.checkNotNullParameter(block13, "block");
                    commodityTutorialScreen.H = block13;
                    return commodityTutorialScreen;
                }
                if (step8 instanceof CommodityOrderEditScreenContract$ModalStep.TargetPrice) {
                    CommodityOrderEditScreenContract$ModalStep.TargetPrice targetPrice = (CommodityOrderEditScreenContract$ModalStep.TargetPrice) step8;
                    CommodityTargetPriceScreen commodityTargetPriceScreen = new CommodityTargetPriceScreen(new CommodityTargetPriceScreenContract$InputData(targetPrice.f99839a, targetPrice.f99840b, targetPrice.f99841c, targetPrice.d, targetPrice.e));
                    q0 block14 = new q0(gVar, i2);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    commodityTargetPriceScreen.H = block14;
                    return commodityTargetPriceScreen;
                }
                if (step8 instanceof CommodityOrderEditScreenContract$ModalStep.TradingAccountPicker) {
                    CommodityOrderEditScreenContract$ModalStep.TradingAccountPicker tradingAccountPicker = (CommodityOrderEditScreenContract$ModalStep.TradingAccountPicker) step8;
                    ViewController viewControllerE12 = gVar.e1(new fdf.a(tradingAccountPicker.f99844c, tradingAccountPicker.f99842a, tradingAccountPicker.f99843b));
                    q0 block15 = new q0(gVar, objArr2 == true ? 1 : 0);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    viewControllerE12.H = block15;
                    return viewControllerE12;
                }
                if (step8 instanceof CommodityOrderEditScreenContract$ModalStep.CurrencyPicker) {
                    CommodityOrderEditScreenContract$ModalStep.CurrencyPicker currencyPicker = (CommodityOrderEditScreenContract$ModalStep.CurrencyPicker) step8;
                    CurrencyChooserFlow currencyChooserFlowA = aVar7.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.CurrencyChooser(null, null, currencyPicker.f99829a, currencyPicker.f99830b, null, null, 51)));
                    q0 q0Var = new q0(gVar, 4);
                    Intrinsics.checkNotNullParameter(q0Var, "<set-?>");
                    currencyChooserFlowA.J = q0Var;
                    return currencyChooserFlowA;
                }
                if (step8 instanceof CommodityOrderEditScreenContract$ModalStep.BalancePicker) {
                    CommodityOrderEditScreenContract$ModalStep.BalancePicker balancePicker = (CommodityOrderEditScreenContract$ModalStep.BalancePicker) step8;
                    String str = balancePicker.f99827b;
                    xi0.b bVar3 = balancePicker.f99826a;
                    io3.l lVar = io3.l.CURRENT;
                    ArrayList arrayList = balancePicker.f99828c;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(((xi0.b) it8.next()).f306286a);
                    }
                    CurrencyChooserFlow currencyChooserFlowA2 = aVar7.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.BalancePicker(str, bVar3, lVar, d0.i1(arrayList2), (Set) null, balancePicker.d, new TextLocalisedClause(com.revolut.retail.feature.commodity.order_flow.impl.R$string.fx_orders_balance_picker_buy_title, null, null, 14), true, (Integer) null, (Set) null, 1576)));
                    q0 q0Var2 = new q0(gVar, i3);
                    Intrinsics.checkNotNullParameter(q0Var2, "<set-?>");
                    currencyChooserFlowA2.J = q0Var2;
                    return currencyChooserFlowA2;
                }
                if (!(step8 instanceof CommodityOrderEditScreenContract$ModalStep.HintDialog)) {
                    if (!(step8 instanceof CommodityOrderEditScreenContract$ModalStep.ScheduleSettings)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CommodityOrderEditScreenContract$ModalStep.ScheduleSettings scheduleSettings = (CommodityOrderEditScreenContract$ModalStep.ScheduleSettings) step8;
                    ViewController viewControllerE13 = gVar.e1(new pdf.a(new pdf.b(scheduleSettings.f99832a, scheduleSettings.f99833b, scheduleSettings.f99834c, scheduleSettings.d, scheduleSettings.e, scheduleSettings.f, scheduleSettings.f99835g)));
                    com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.a block16 = new com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.a(1, 8, com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.class, gVar, "handleScheduleSettingsResult", "handleScheduleSettingsResult(Lcom/revolut/feature/trading_orders/api/ui/schedule/ScheduleSettingsContract$OutputData;)Lkotlinx/coroutines/Job;");
                    Intrinsics.checkNotNullParameter(block16, "block");
                    viewControllerE13.H = block16;
                    return viewControllerE13;
                }
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.limits.a aVar8 = gVar.u;
                HintDialogMapper$HintDialogReason dialogReason = ((CommodityOrderEditScreenContract$ModalStep.HintDialog) step8).f99831a;
                l4i.a aVar9 = aVar8.f99870a;
                Intrinsics.checkNotNullParameter(dialogReason, "dialogReason");
                if (dialogReason instanceof HintDialogMapper$HintDialogReason.UpperLimitError) {
                    aVarA2 = com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.limits.a.a(com.revolut.retail.feature.commodity.order_flow.impl.R$string.cryptobuysell_marketorder_crypto_limit_higher_dialog_title, com.revolut.retail.feature.commodity.order_flow.impl.R$string.cryptobuysell_marketorder_crypto_limit_higher_dialog_message, l4i.a.b(((HintDialogMapper$HintDialogReason.UpperLimitError) dialogReason).f99869a));
                } else {
                    if (!(dialogReason instanceof HintDialogMapper$HintDialogReason.LowerLimitError)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVarA2 = com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.limits.a.a(com.revolut.retail.feature.commodity.order_flow.impl.R$string.cryptobuysell_marketorder_crypto_limit_lower_dialog_title, com.revolut.retail.feature.commodity.order_flow.impl.R$string.fx_orders_marketorder_crypto_limit_lower_dialog_message, l4i.a.b(((HintDialogMapper$HintDialogReason.LowerLimitError) dialogReason).f99868a));
                }
                return new ActionsBottomSheetController(aVarA2);
            case 14:
                com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.a aVar10 = (com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.a) obj4;
                LoanRepaymentFlowContract$InputData loanRepaymentFlowContract$InputData = aVar10.o;
                qki.d dVar = aVar10.f70544q;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                LoanRepaymentFlowContract$Step step9 = (LoanRepaymentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (Intrinsics.f(step9, LoanRepaymentFlowContract$Step.ChooseAmount.f70539a)) {
                    AmountInputController amountInputController = new AmountInputController(new AmountInputControllerContract$InputData(loanRepaymentFlowContract$InputData.f70537c, ((LoanRepaymentFlowContract$State) ((j2) dVar.f22677a).getValue()).f70538a));
                    d34.b block17 = new d34.b(aVar10, 17);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    amountInputController.H = block17;
                    return amountInputController;
                }
                if (!(step9 instanceof LoanRepaymentFlowContract$Step.ConfirmPayment)) {
                    throw new NoWhenBranchMatchedException();
                }
                l35.h hVar = aVar10.f70543p;
                b95.a product = loanRepaymentFlowContract$InputData.f70536b;
                y45.q qVar = (y45.q) hVar;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(product, "product");
                int i6 = y45.p.f310814a[product.ordinal()];
                if (i6 == 1 || i6 == 2) {
                    zC = ((jte.d) qVar.f310815a).c(LoanApi$Toggles.NewLoanRepaymentReviewFlow.f70070c);
                } else if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (zC) {
                    LoanRepaymentFlowContract$Step.ConfirmPayment confirmPayment = (LoanRepaymentFlowContract$Step.ConfirmPayment) step9;
                    return new ReviewPaymentV2Controller(new ReviewPaymentV2ControllerContract$InputData(((LoanRepaymentFlowContract$State) ((j2) dVar.f22677a).getValue()).f70538a, confirmPayment.f70540a, confirmPayment.f70541b, confirmPayment.f70542c));
                }
                LoanRepaymentFlowContract$Step.ConfirmPayment confirmPayment2 = (LoanRepaymentFlowContract$Step.ConfirmPayment) step9;
                return new ReviewPaymentController(new ReviewPaymentControllerContract$InputData(((LoanRepaymentFlowContract$State) ((j2) dVar.f22677a).getValue()).f70538a, confirmPayment2.f70540a, confirmPayment2.f70541b, confirmPayment2.f70542c));
            case 15:
                com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.flow.a aVar11 = (com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.flow.a) obj4;
                DocumentsUploadFlowContract$InputData documentsUploadFlowContract$InputData = aVar11.f67594p;
                yki.l FlowCoordinator4 = (yki.l) obj2;
                DocumentsUploadFlowContract$Step step10 = (DocumentsUploadFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof DocumentsUploadFlowContract$Step.Summary) {
                    String str2 = documentsUploadFlowContract$InputData.f67585a;
                    ny3.h hVar2 = ((DocumentsUploadFlowContract$Step.Summary) step10).f67592a;
                    ny3.o oVar = hVar2.f220637a;
                    ArrayList arrayList3 = hVar2.f220638b;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj7 : arrayList3) {
                        if (((ny3.f) obj7).f220633h) {
                            arrayList4.add(obj7);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                    Iterator it9 = arrayList4.iterator();
                    while (it9.hasNext()) {
                        arrayList5.add(((ny3.f) it9.next()).f220629a);
                    }
                    SummaryScreen summaryScreen = new SummaryScreen(new SummaryScreenContract$InputData(str2, oVar, arrayList5, documentsUploadFlowContract$InputData.f67587c));
                    g0 block18 = new g0(aVar11, 8, FlowCoordinator4, step10);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    summaryScreen.H = block18;
                    return summaryScreen;
                }
                if (step10 instanceof DocumentsUploadFlowContract$Step.UploadDocument) {
                    ny3.p pVar = documentsUploadFlowContract$InputData.f67586b;
                    if (pVar instanceof ny3.h) {
                        objArr = false;
                    } else {
                        if (!(pVar instanceof ny3.i)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objArr = true;
                    }
                    zv3.a aVar12 = objArr != false ? documentsUploadFlowContract$InputData.f67587c : zv3.a.BACK;
                    String str3 = documentsUploadFlowContract$InputData.f67585a;
                    ny3.f fVar2 = ((DocumentsUploadFlowContract$Step.UploadDocument) step10).f67593a;
                    UploadScreen uploadScreen = new UploadScreen(new UploadScreenContract$InputData(str3, fVar2, (pVar instanceof ny3.i) && !fVar2.f220633h, aVar12));
                    g0 block19 = new g0(pVar, 9, FlowCoordinator4, aVar11);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    uploadScreen.H = block19;
                    return uploadScreen;
                }
                if (step10 instanceof DocumentsUploadFlowContract$Step.Info) {
                    DocumentsUploadFlowContract$Step.Info info = (DocumentsUploadFlowContract$Step.Info) step10;
                    return new CreditPromptFlow(new CreditPromptFlowContract$InputData(info.f67588a, info.f67589b, documentsUploadFlowContract$InputData.d));
                }
                if (!(step10 instanceof DocumentsUploadFlowContract$Step.MissingOptionalDocumentConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i21 = R$string.credit_application_documents_upload_missing_optional_document_confirmation_title;
                ny3.g gVar2 = ((DocumentsUploadFlowContract$Step.MissingOptionalDocumentConfirmation) step10).f67590a;
                lw0.a aVar13 = new lw0.a(new TextLocalisedClause(i21, zhm.u.c(gVar2.f220634a), null, 12), new TextLocalisedClause(R$string.credit_application_documents_upload_missing_optional_document_confirmation_description, zhm.u.c(gVar2.f220635b), null, 12), null, null, false, 28);
                aw0.h hVar3 = new aw0.h(false, new n6(new TextLocalisedClause(R$string.credit_application_documents_upload_missing_optional_document_confirmation_primary_button, zhm.u.c(gVar2.f220636c), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.credit_application_documents_upload_missing_optional_document_confirmation_secondary_button, zhm.u.c(gVar2.d), null, 12), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                k9 k9Var2 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar13, hVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                d3i.k block20 = new d3i.k(aVar11, step10, 27);
                Intrinsics.checkNotNullParameter(block20, "block");
                actionsBottomSheetController.H = block20;
                return actionsBottomSheetController;
            case 16:
                com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a aVar14 = (com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a) obj4;
                y yVar = aVar14.v;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                JuniorAccountDetailsConfirmationScreenContract$ModalStep it10 = (JuniorAccountDetailsConfirmationScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it10, "it");
                if (Intrinsics.f(it10, JuniorAccountDetailsConfirmationScreenContract$ModalStep.UpdateAddress.f76750a)) {
                    ViewController viewControllerE14 = aVar14.e1(new th1.a(new AddressFlowContract$InputData(((da8.g) ((j2) yVar.f22677a).getValue()).e, new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_renaming_address_header_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_renaming_address_header_subtitle, null, null, 14), false, new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_renaming_address_action_title, null, null, 14), FieldMode.Hidden.f60954a, qh1.b.CLOSE, null, false, null, 2094900), null, null, 6));
                    da8.k block21 = new da8.k(aVar14, c3 == true ? 1 : 0);
                    Intrinsics.checkNotNullParameter(block21, "block");
                    viewControllerE14.H = block21;
                    return viewControllerE14;
                }
                if (!Intrinsics.f(it10, JuniorAccountDetailsConfirmationScreenContract$ModalStep.UpdateName.f76751a)) {
                    throw new NoWhenBranchMatchedException();
                }
                UpdateNameScreen updateNameScreen = new UpdateNameScreen(new UpdateNameScreenContract$InputData(((da8.g) ((j2) yVar.f22677a).getValue()).f112477c, ((da8.g) ((j2) yVar.f22677a).getValue()).d));
                da8.k block22 = new da8.k(aVar14, i3);
                Intrinsics.checkNotNullParameter(block22, "block");
                updateNameScreen.H = block22;
                return updateNameScreen;
            case 17:
                com.revolut.feature.revolutpay.management.impl.ui.management.flow.b bVar4 = (com.revolut.feature.revolutpay.management.impl.ui.management.flow.b) obj4;
                yki.l FlowCoordinator5 = (yki.l) obj2;
                RevolutPayManagementFlowContract$Step step11 = (RevolutPayManagementFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof RevolutPayManagementFlowContract$Step.HomeManagement) {
                    return new RevolutPayManagementHomeController();
                }
                if (!(step11 instanceof RevolutPayManagementFlowContract$Step.ProductArticle)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE15 = bVar4.e1(new ProductArticleDescriptor(((RevolutPayManagementFlowContract$Step.ProductArticle) step11).f84582a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                d7j.p0 block23 = new d7j.p0(28);
                Intrinsics.checkNotNullParameter(block23, "block");
                viewControllerE15.H = block23;
                return viewControllerE15;
            case 18:
                i0 i0Var = (i0) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                UserDetailsControllerContract$ModalStep it11 = (UserDetailsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it11, "it");
                if (!(it11 instanceof UserDetailsControllerContract$ModalStep.ChatDialogStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((db.v) i0Var.z).getClass();
                lw0.a aVar15 = new lw0.a(new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.change_country_dialog_chat_required_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.change_country_dialog_chat_required_subtitle, null, null, 14), null, null, false, 28);
                aw0.e eVar3 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.change_country_dialog_chat_required_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                k9 k9Var3 = k9.FinCrime;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar15, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                d34.b block24 = new d34.b(i0Var, 25);
                Intrinsics.checkNotNullParameter(block24, "block");
                actionsBottomSheetController2.H = block24;
                return actionsBottomSheetController2;
            case 19:
                final com.revolut.feature.hidden_accounts.impl.ui.flow.a aVar16 = (com.revolut.feature.hidden_accounts.impl.ui.flow.a) obj4;
                final yki.l FlowCoordinator6 = (yki.l) obj2;
                HiddenAccountsFlowContract$Step step12 = (HiddenAccountsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof HiddenAccountsFlowContract$Step.Authentication) {
                    ViewController viewControllerE16 = aVar16.e1(qa7.a.f243970a);
                    final Object[] objArr5 = objArr3 == true ? 1 : 0;
                    Function1 block25 = new Function1() { // from class: db7.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (objArr5) {
                                case 0:
                                    qa7.b it12 = (qa7.b) obj8;
                                    Intrinsics.checkNotNullParameter(it12, "it");
                                    if (!(it12 instanceof qa7.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.hidden_accounts.impl.ui.flow.a aVar17 = aVar16;
                                    HiddenAccountsFlowContract$InputData hiddenAccountsFlowContract$InputData = aVar17.o;
                                    h.t2(aVar17, FlowCoordinator6, new HiddenAccountsFlowContract$Step.HiddenAccountsList(hiddenAccountsFlowContract$InputData.f74661a, hiddenAccountsFlowContract$InputData.f74662b), false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    t result = (t) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof fb7.o;
                                    com.revolut.feature.hidden_accounts.impl.ui.flow.a aVar18 = aVar16;
                                    if (z) {
                                        aVar18.C1(new MainContainerScreenDestination.JustShow(ibb.c.f160140a, new TabAccountsLaunchConfig(((fb7.o) result).f133491a, null), (AccountCreationTransitionAnimation) null, 12));
                                        aVar18.B2();
                                    } else if (Intrinsics.f(result, p.f133492a)) {
                                        aVar18.f74667p.getClass();
                                        aVar18.X1(new k("UNHIDE_ACCOUNT_SUCCESS_DIALOG_ID", new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.hidden_accounts_toast_account_unhidden, null, null, 14), null, null, null, 28));
                                    } else if (result instanceof q) {
                                        aVar18.C2(new e(((q) result).f133493a));
                                    } else if (result instanceof fb7.s) {
                                        h.t2(aVar18, FlowCoordinator6, new HiddenAccountsFlowContract$Step.ProductArticle(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(((fb7.s) result).f133495a))), true, null, false, 12);
                                    } else {
                                        if (!(result instanceof r)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i22 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block25, "block");
                    viewControllerE16.H = block25;
                    return viewControllerE16;
                }
                if (step12 instanceof HiddenAccountsFlowContract$Step.HiddenAccountsList) {
                    HiddenAccountsFlowContract$Step.HiddenAccountsList hiddenAccountsList = (HiddenAccountsFlowContract$Step.HiddenAccountsList) step12;
                    HiddenAccountsListScreen hiddenAccountsListScreen = new HiddenAccountsListScreen(new HiddenAccountsListScreenContract$InputData(hiddenAccountsList.f74664a, hiddenAccountsList.f74665b, false));
                    final char c7 = c5 == true ? 1 : 0;
                    Function1 block26 = new Function1() { // from class: db7.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (c7) {
                                case 0:
                                    qa7.b it12 = (qa7.b) obj8;
                                    Intrinsics.checkNotNullParameter(it12, "it");
                                    if (!(it12 instanceof qa7.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.hidden_accounts.impl.ui.flow.a aVar17 = aVar16;
                                    HiddenAccountsFlowContract$InputData hiddenAccountsFlowContract$InputData = aVar17.o;
                                    h.t2(aVar17, FlowCoordinator6, new HiddenAccountsFlowContract$Step.HiddenAccountsList(hiddenAccountsFlowContract$InputData.f74661a, hiddenAccountsFlowContract$InputData.f74662b), false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    t result = (t) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof fb7.o;
                                    com.revolut.feature.hidden_accounts.impl.ui.flow.a aVar18 = aVar16;
                                    if (z) {
                                        aVar18.C1(new MainContainerScreenDestination.JustShow(ibb.c.f160140a, new TabAccountsLaunchConfig(((fb7.o) result).f133491a, null), (AccountCreationTransitionAnimation) null, 12));
                                        aVar18.B2();
                                    } else if (Intrinsics.f(result, p.f133492a)) {
                                        aVar18.f74667p.getClass();
                                        aVar18.X1(new k("UNHIDE_ACCOUNT_SUCCESS_DIALOG_ID", new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.hidden_accounts_toast_account_unhidden, null, null, 14), null, null, null, 28));
                                    } else if (result instanceof q) {
                                        aVar18.C2(new e(((q) result).f133493a));
                                    } else if (result instanceof fb7.s) {
                                        h.t2(aVar18, FlowCoordinator6, new HiddenAccountsFlowContract$Step.ProductArticle(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(((fb7.s) result).f133495a))), true, null, false, 12);
                                    } else {
                                        if (!(result instanceof r)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i22 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block26, "block");
                    hiddenAccountsListScreen.H = block26;
                    return hiddenAccountsListScreen;
                }
                if (!(step12 instanceof HiddenAccountsFlowContract$Step.ProductArticle)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProductArticleParams productArticleParams = ((HiddenAccountsFlowContract$Step.ProductArticle) step12).f74666a;
                k9 k9Var4 = k9.SecurityHub;
                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                ViewController viewControllerE17 = aVar16.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, false, 52));
                d34.b block27 = new d34.b(aVar16, 26);
                Intrinsics.checkNotNullParameter(block27, "block");
                viewControllerE17.H = block27;
                return viewControllerE17;
            case 20:
                return a(obj2, obj3);
            case 21:
                return b(obj2, obj3);
            case 22:
                return c(obj2, obj3);
            case 23:
                return d(obj2, obj3);
            case 24:
                return e(obj2, obj3);
            case 25:
                return g(obj2, obj3);
            case 26:
                return h(obj2, obj3);
            case 27:
                return i(obj2, obj3);
            case 28:
                return j(obj2, obj3);
            default:
                final com.revolut.feature.travel.miles.impl.ui.flow.b bVar5 = (com.revolut.feature.travel.miles.impl.ui.flow.b) obj4;
                final yki.b LazyFlowCoordinator = (yki.b) obj2;
                TravelMilesFlowContract$Step step13 = (TravelMilesFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof TravelMilesFlowContract$Step.Onboarding) {
                    ViewController viewControllerE18 = bVar5.e1(new ProductArticleDescriptor(bVar5.f94211w, ((TravelMilesFlowContract$Step.Onboarding) step13).f94185a == x0.OPTED_IN ? SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a : SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                    g0 block28 = new g0(bVar5, 18, LazyFlowCoordinator, step13);
                    Intrinsics.checkNotNullParameter(block28, "block");
                    viewControllerE18.H = block28;
                    return viewControllerE18;
                }
                if (step13 instanceof TravelMilesFlowContract$Step.MainScreen) {
                    TravelMilesMainFlow travelMilesMainFlow = new TravelMilesMainFlow();
                    final Object[] objArr6 = objArr4 == true ? 1 : 0;
                    Function1 block29 = new Function1() { // from class: dgg.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (objArr6) {
                                case 0:
                                    jgg.f output = (jgg.f) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z = output instanceof jgg.e;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar6 = bVar5;
                                    yki.b bVar7 = LazyFlowCoordinator;
                                    if (z) {
                                        bVar6.L2(bVar7, ((jgg.e) output).f174042a);
                                    } else {
                                        if (!(output instanceof jgg.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar6.K2(bVar7, ((jgg.d) output).f174041a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ngg.h output2 = (ngg.h) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z3 = output2 instanceof ngg.e;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar8 = bVar5;
                                    yki.b bVar9 = LazyFlowCoordinator;
                                    if (z3) {
                                        ngg.e eVar4 = (ngg.e) output2;
                                        h.t2(bVar8, bVar9, new TravelMilesFlowContract$Step.FlightSearchResults(eVar4.f215151a, eVar4.f215152b, eVar4.f215153c), true, null, false, 12);
                                    } else if (output2 instanceof ngg.g) {
                                        bVar8.L2(bVar9, ((ngg.g) output2).f215155a);
                                    } else {
                                        if (!(output2 instanceof ngg.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar8.K2(bVar9, ((ngg.f) output2).f215154a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    chg.f output3 = (chg.f) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    String str4 = output3.f24226a.f94088a;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar10 = bVar5;
                                    h.t2(bVar10, LazyFlowCoordinator, bVar10.I2(str4), true, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    cig.f output4 = (cig.f) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    String str5 = output4.f24548a.f276617a;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar11 = bVar5;
                                    h.t2(bVar11, LazyFlowCoordinator, bVar11.I2(str5), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    hub.b result = (hub.b) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z4 = result.f155599b;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar12 = bVar5;
                                    if (z4) {
                                        h.t2(bVar12, LazyFlowCoordinator, bVar12.J2(), false, null, false, 12);
                                    } else {
                                        bVar12.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block29, "block");
                    travelMilesMainFlow.H = block29;
                    return travelMilesMainFlow;
                }
                if (step13 instanceof TravelMilesFlowContract$Step.FlightSearch) {
                    TravelMilesFlowContract$Step.FlightSearch flightSearch = (TravelMilesFlowContract$Step.FlightSearch) step13;
                    TravelMilesFlightSearchDashboardPagerFlow travelMilesFlightSearchDashboardPagerFlow = new TravelMilesFlightSearchDashboardPagerFlow(new TravelMilesFlightSearchDashboardPagerFlowContract$InputData(flightSearch.f94178a, flightSearch.f94179b, flightSearch.f94180c));
                    final char c16 = c6 == true ? 1 : 0;
                    Function1 block30 = new Function1() { // from class: dgg.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (c16) {
                                case 0:
                                    jgg.f output = (jgg.f) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z = output instanceof jgg.e;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar6 = bVar5;
                                    yki.b bVar7 = LazyFlowCoordinator;
                                    if (z) {
                                        bVar6.L2(bVar7, ((jgg.e) output).f174042a);
                                    } else {
                                        if (!(output instanceof jgg.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar6.K2(bVar7, ((jgg.d) output).f174041a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ngg.h output2 = (ngg.h) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z3 = output2 instanceof ngg.e;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar8 = bVar5;
                                    yki.b bVar9 = LazyFlowCoordinator;
                                    if (z3) {
                                        ngg.e eVar4 = (ngg.e) output2;
                                        h.t2(bVar8, bVar9, new TravelMilesFlowContract$Step.FlightSearchResults(eVar4.f215151a, eVar4.f215152b, eVar4.f215153c), true, null, false, 12);
                                    } else if (output2 instanceof ngg.g) {
                                        bVar8.L2(bVar9, ((ngg.g) output2).f215155a);
                                    } else {
                                        if (!(output2 instanceof ngg.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar8.K2(bVar9, ((ngg.f) output2).f215154a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    chg.f output3 = (chg.f) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    String str4 = output3.f24226a.f94088a;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar10 = bVar5;
                                    h.t2(bVar10, LazyFlowCoordinator, bVar10.I2(str4), true, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    cig.f output4 = (cig.f) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    String str5 = output4.f24548a.f276617a;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar11 = bVar5;
                                    h.t2(bVar11, LazyFlowCoordinator, bVar11.I2(str5), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    hub.b result = (hub.b) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z4 = result.f155599b;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar12 = bVar5;
                                    if (z4) {
                                        h.t2(bVar12, LazyFlowCoordinator, bVar12.J2(), false, null, false, 12);
                                    } else {
                                        bVar12.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block30, "block");
                    travelMilesFlightSearchDashboardPagerFlow.H = block30;
                    return travelMilesFlightSearchDashboardPagerFlow;
                }
                if (step13 instanceof TravelMilesFlowContract$Step.AirlineDetails) {
                    return new TravelMilesAirlineDetailsFlow(new TravelMilesAirlineDetailsFlowContract$InputData(((TravelMilesFlowContract$Step.AirlineDetails) step13).f94177a));
                }
                if (step13 instanceof TravelMilesFlowContract$Step.AgentDetails) {
                    return bVar5.e1(new g1f.b(((TravelMilesFlowContract$Step.AgentDetails) step13).f94174a, u2f.j.MILES, e0.MILES));
                }
                if (step13 instanceof TravelMilesFlowContract$Step.SearchAirline) {
                    TravelMilesAirlinesSearchScreen travelMilesAirlinesSearchScreen = new TravelMilesAirlinesSearchScreen();
                    Function1 block31 = new Function1() { // from class: dgg.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i3) {
                                case 0:
                                    jgg.f output = (jgg.f) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z = output instanceof jgg.e;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar6 = bVar5;
                                    yki.b bVar7 = LazyFlowCoordinator;
                                    if (z) {
                                        bVar6.L2(bVar7, ((jgg.e) output).f174042a);
                                    } else {
                                        if (!(output instanceof jgg.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar6.K2(bVar7, ((jgg.d) output).f174041a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ngg.h output2 = (ngg.h) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z3 = output2 instanceof ngg.e;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar8 = bVar5;
                                    yki.b bVar9 = LazyFlowCoordinator;
                                    if (z3) {
                                        ngg.e eVar4 = (ngg.e) output2;
                                        h.t2(bVar8, bVar9, new TravelMilesFlowContract$Step.FlightSearchResults(eVar4.f215151a, eVar4.f215152b, eVar4.f215153c), true, null, false, 12);
                                    } else if (output2 instanceof ngg.g) {
                                        bVar8.L2(bVar9, ((ngg.g) output2).f215155a);
                                    } else {
                                        if (!(output2 instanceof ngg.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar8.K2(bVar9, ((ngg.f) output2).f215154a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    chg.f output3 = (chg.f) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    String str4 = output3.f24226a.f94088a;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar10 = bVar5;
                                    h.t2(bVar10, LazyFlowCoordinator, bVar10.I2(str4), true, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    cig.f output4 = (cig.f) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    String str5 = output4.f24548a.f276617a;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar11 = bVar5;
                                    h.t2(bVar11, LazyFlowCoordinator, bVar11.I2(str5), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    hub.b result = (hub.b) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z4 = result.f155599b;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar12 = bVar5;
                                    if (z4) {
                                        h.t2(bVar12, LazyFlowCoordinator, bVar12.J2(), false, null, false, 12);
                                    } else {
                                        bVar12.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block31, "block");
                    travelMilesAirlinesSearchScreen.H = block31;
                    return travelMilesAirlinesSearchScreen;
                }
                if (step13 instanceof TravelMilesFlowContract$Step.SearchAirlineHome) {
                    TravelMilesAirlinesHomeSearchScreen travelMilesAirlinesHomeSearchScreen = new TravelMilesAirlinesHomeSearchScreen();
                    Function1 block32 = new Function1() { // from class: dgg.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i2) {
                                case 0:
                                    jgg.f output = (jgg.f) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z = output instanceof jgg.e;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar6 = bVar5;
                                    yki.b bVar7 = LazyFlowCoordinator;
                                    if (z) {
                                        bVar6.L2(bVar7, ((jgg.e) output).f174042a);
                                    } else {
                                        if (!(output instanceof jgg.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar6.K2(bVar7, ((jgg.d) output).f174041a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ngg.h output2 = (ngg.h) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z3 = output2 instanceof ngg.e;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar8 = bVar5;
                                    yki.b bVar9 = LazyFlowCoordinator;
                                    if (z3) {
                                        ngg.e eVar4 = (ngg.e) output2;
                                        h.t2(bVar8, bVar9, new TravelMilesFlowContract$Step.FlightSearchResults(eVar4.f215151a, eVar4.f215152b, eVar4.f215153c), true, null, false, 12);
                                    } else if (output2 instanceof ngg.g) {
                                        bVar8.L2(bVar9, ((ngg.g) output2).f215155a);
                                    } else {
                                        if (!(output2 instanceof ngg.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar8.K2(bVar9, ((ngg.f) output2).f215154a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    chg.f output3 = (chg.f) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    String str4 = output3.f24226a.f94088a;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar10 = bVar5;
                                    h.t2(bVar10, LazyFlowCoordinator, bVar10.I2(str4), true, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    cig.f output4 = (cig.f) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    String str5 = output4.f24548a.f276617a;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar11 = bVar5;
                                    h.t2(bVar11, LazyFlowCoordinator, bVar11.I2(str5), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    hub.b result = (hub.b) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z4 = result.f155599b;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar12 = bVar5;
                                    if (z4) {
                                        h.t2(bVar12, LazyFlowCoordinator, bVar12.J2(), false, null, false, 12);
                                    } else {
                                        bVar12.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block32, "block");
                    travelMilesAirlinesHomeSearchScreen.H = block32;
                    return travelMilesAirlinesHomeSearchScreen;
                }
                if (step13 instanceof TravelMilesFlowContract$Step.Transactions) {
                    return new TravelMilesTransactionsListScreen();
                }
                if (step13 instanceof TravelMilesFlowContract$Step.OpenRevPointsTransactionPager) {
                    TravelMilesFlowContract$Step.OpenRevPointsTransactionPager openRevPointsTransactionPager = (TravelMilesFlowContract$Step.OpenRevPointsTransactionPager) step13;
                    return bVar5.e1(new hub.g(openRevPointsTransactionPager.f94186a, openRevPointsTransactionPager.f94187b, bVar5.v));
                }
                if (step13 instanceof TravelMilesFlowContract$Step.RevPointsOptIn) {
                    ViewController viewControllerE19 = bVar5.e1(new hub.a(new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.Miles.f83996a, false, 6)));
                    final int i22 = 4;
                    Function1 block33 = new Function1() { // from class: dgg.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i22) {
                                case 0:
                                    jgg.f output = (jgg.f) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z = output instanceof jgg.e;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar6 = bVar5;
                                    yki.b bVar7 = LazyFlowCoordinator;
                                    if (z) {
                                        bVar6.L2(bVar7, ((jgg.e) output).f174042a);
                                    } else {
                                        if (!(output instanceof jgg.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar6.K2(bVar7, ((jgg.d) output).f174041a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ngg.h output2 = (ngg.h) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z3 = output2 instanceof ngg.e;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar8 = bVar5;
                                    yki.b bVar9 = LazyFlowCoordinator;
                                    if (z3) {
                                        ngg.e eVar4 = (ngg.e) output2;
                                        h.t2(bVar8, bVar9, new TravelMilesFlowContract$Step.FlightSearchResults(eVar4.f215151a, eVar4.f215152b, eVar4.f215153c), true, null, false, 12);
                                    } else if (output2 instanceof ngg.g) {
                                        bVar8.L2(bVar9, ((ngg.g) output2).f215155a);
                                    } else {
                                        if (!(output2 instanceof ngg.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar8.K2(bVar9, ((ngg.f) output2).f215154a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    chg.f output3 = (chg.f) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    String str4 = output3.f24226a.f94088a;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar10 = bVar5;
                                    h.t2(bVar10, LazyFlowCoordinator, bVar10.I2(str4), true, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    cig.f output4 = (cig.f) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    String str5 = output4.f24548a.f276617a;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar11 = bVar5;
                                    h.t2(bVar11, LazyFlowCoordinator, bVar11.I2(str5), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    hub.b result = (hub.b) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z4 = result.f155599b;
                                    com.revolut.feature.travel.miles.impl.ui.flow.b bVar12 = bVar5;
                                    if (z4) {
                                        h.t2(bVar12, LazyFlowCoordinator, bVar12.J2(), false, null, false, 12);
                                    } else {
                                        bVar12.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block33, "block");
                    viewControllerE19.H = block33;
                    return viewControllerE19;
                }
                if (step13 instanceof TravelMilesFlowContract$Step.FlightSearchResults) {
                    TravelMilesFlowContract$Step.FlightSearchResults flightSearchResults = (TravelMilesFlowContract$Step.FlightSearchResults) step13;
                    return new TravelMilesFlightSearchResultsFlow(new TravelMilesFlightSearchResultsFlowContract$InputData(flightSearchResults.f94181a, flightSearchResults.f94182b, flightSearchResults.f94183c));
                }
                if (step13 instanceof TravelMilesFlowContract$Step.Transfer) {
                    return new TravelMilesAirlineDetailsFlow(new TravelMilesAirlineDetailsFlowContract$InputData(((TravelMilesFlowContract$Step.Transfer) step13).f94192a));
                }
                if (!(step13 instanceof TravelMilesFlowContract$Step.AgentTransfer)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelMilesFlowContract$Step.AgentTransfer agentTransfer = (TravelMilesFlowContract$Step.AgentTransfer) step13;
                return bVar5.e1(new g1f.c(agentTransfer.f94175a, u2f.j.MILES, e0.MILES, agentTransfer.f94176b));
        }
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f109837a = i;
        this.f109838b = obj2;
    }
}
