package umd;

import android.os.Parcelable;
import android.text.method.DigitsKeyListener;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimStatusNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.ApmAliasClaimFlowContract$Step;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.ApmAliasClaimFormFlow;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.status.ApmAliasClaimStatusScreen;
import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.QrScannerFlowContract$Step;
import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreen;
import com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.CooldownCheckerFlowContract$InputData;
import com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.CooldownCheckerFlowContract$Step;
import com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.cooldown_check_failed.CooldownCheckFailedScreen;
import com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.cooldown_check_failed.CooldownCheckFailedScreenContract$InputData;
import com.revolut.feature.credit.autopay.model.CreditCardAutoPayDataRequest;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountFlowContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountFlowContract$RepaymentInfo;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountRootFlow;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$PaymentUiStyle;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$ScreenConfig;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayScreen;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.SelectAutopayMethodV3Screen;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.SelectAutopayMethodV3ScreenContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.SelectAutopayMethodV3ScreenContract$SelectAutopayConfig;
import com.revolut.feature.credit.autopay.ui.screen.set_date.SetDateContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.set_date.SetDateScreen;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardFutureInstalmentQuote;
import com.revolut.feature.credit.card.impl.navigation.articles.CreditCardArticleKey;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$State;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.bottom_sheet.picket.PickerBottomSheetController;
import com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitFlow;
import com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.CreditCardChooseFutureInstalmentsScreenContract$ModalStep;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest;
import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import com.revolut.feature.credit_card.autopay.api.models_v3.BackupCardContent;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayContent;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType;
import com.revolut.feature.crypto.locked.balance.api.navigation.CryptoBalanceBreakdownInputData;
import com.revolut.feature.external_accounts.api.MandateApi$Toggles$VrpSetupBottomSheet;
import com.revolut.feature.external_accounts.api.navigation.BrazilInboundMandateConfirmationDescriptor$InputData;
import com.revolut.feature.external_accounts.api.navigation.BrazilInboundOpenbankingDescriptor$InputData;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.FreelancerAcquiringPaymentDetailsScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.FreelancerAcquiringPaymentFeesScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.FreelancerAcquiringPaymentFeesScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.customer.FreelancerAddCustomerScreen;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.customer.FreelancerAddCustomerScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.InvoiceCustomerListScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlow;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.subaccount.prompt.flow.FreelancerCreateSubaccountPromptFlowContract$Step;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.kyc.impl.fourthline.flow.FourthlineFlowContract$InputData;
import com.revolut.feature.kyc.impl.fourthline.flow.FourthlineFlowContract$Step;
import com.revolut.feature.kyc.impl.fourthline.screen.FourthlineControllerContract$InputData;
import com.revolut.feature.kyc.impl.fourthline.screen.FourthlineViewController;
import com.revolut.feature.kyc.impl.ondemand.OnDemandFeatureInstallFlow;
import com.revolut.feature.kyc.impl.ondemand.OnDemandFeatureInstallFlowContract$InputData;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlow;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection_custom.CustomBillScreen;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.AutoEarnRewardsControllerContract$Steps;
import com.revolut.feature.rev_points.impl.ui.advent.flow.RevPointsAdventRewardsFlowContract$InputData;
import com.revolut.feature.rev_points.impl.ui.advent.flow.RevPointsAdventRewardsFlowContract$Step;
import com.revolut.feature.rev_points.impl.ui.advent.screen.RevPointsAdventRewardsScreen;
import com.revolut.feature.rev_points.impl.ui.advent.screen.RevPointsAdventRewardsScreenContract$InputData;
import com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.PenContributionScreen;
import com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentRootFlow;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.standingordertopup.api.navigation.destination.AutoTopUpFlowDestination;
import com.revolut.feature.tax_residency.impl.v2.ui.list.TaxResidencyListScreenContract$ModalStep;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData;
import com.revolut.feature.topup_screen.api.descriptor.EditStoredMethodLabelDescriptor$InputData;
import com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee;
import com.revolut.feature.topup_screen.api.topup_limits.TopUpLimitUiModel;
import com.revolut.feature.topup_screen.api.topup_limits.TopUpV2LimitUiModel;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlow;
import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.BrazilStoredMethodDetailsFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.BrazilStoredMethodDetailsScreen;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.BrazilStoredMethodDetailsScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.BrazilStoredMethodDetailsScreenContract$OutputData;
import com.revolut.feature.topup_screen.impl.flows.topup.amount_new.AmountNewScreen;
import com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet.TopUpFeesBottomSheetScreen;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.topup.limits.TopUpLimitsBottomSheetController;
import com.revolut.feature.topup_screen.impl.flows.topup.limits.delay.UnverifiedCardTopUpDelayBottomSheetController;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.card_facade.FacadeCardTopupFlow;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.cash_deposit.CashDepositTopupFlow;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.IdealTopUpFlow;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.a;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlow;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.TopupWithNewCardFlow;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlow;
import com.revolut.feature.topup_screen.impl.google_pay.flow.GooglePayFlow;
import com.revolut.feature.topup_screen.impl.mcy.McyTopupFlow;
import com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreen;
import com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreenContract$ModalStep;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.feature_crypto_order_flow.api.CryptoExchangeFeatureApi$Toggles$BalancePickerCryptoSellFlow;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreen;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreenContract$ModalStep;
import com.revolut.feature_crypto_order_flow.impl.exchange.bottom_sheet.balance_breakdown.BalanceBreakdownBottomSheetController;
import com.revolut.feature_exchange.api.models.TakeProfitStopLossParams;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.TakeProfitStopLossController;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.TakeProfitStopLossControllerContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.airport.security_fast_track.api.AsftApi$Toggles$AsftTicketStylePass;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.AsftMainFlowContract$Step;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking.AsftPassBookingFlow;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.AsftHomeScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.AsftHomeScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.AsftPassDetailsScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.AsftPassDetailsScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.AsftPassDetailsLegacyScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.AsftPassDetailsLegacyScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingScreen;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$ExtraConfiguration;
import com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserInputData;
import com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow;
import com.revolut.retail.feature.balance.picker.legacy.api.navigation.BalancePickerFeatureConfig;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import com.revolut.trading.orders.ui.invest.placement.flow.InvestOrderFlow;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreen;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreenContract$InputData;
import com.revolut.trading.orders.ui.invest.placement.wrapper_flow.InvestOrderWrapperFlowContract$WrapperFlowStep;
import com.revolut.uicomponent.products.EditTextDelegate;
import d67.q;
import grl.k9;
import hui.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import kye.a4;
import kye.b4;
import kye.c4;
import kye.u;
import kye.y3;
import nii.y0;
import nze.l;
import oki.h;
import retrofit2.HttpException;
import ste.e;
import ste.r;
import til.s;
import tsk.t;
import tw8.d;
import tw8.e;
import tw8.f;
import ulm.r1;
import un8.j;
import up0.i0;
import ux0.a0;
import uyh.k0;
import vkm.j2;
import vs8.b;
import vv8.c;
import we6.l0;
import we6.o0;
import we6.p;
import we6.q0;
import we6.s0;
import y5i.b;
import yhm.m;
import yki.i;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;
import zhm.w;
import zp0.x;
import zp0.y;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f281302b;

    public /* synthetic */ n(Object obj2, int i) {
        this.f281301a = i;
        this.f281302b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        ArrayList arrayList;
        dj0.d dVar;
        CellDetailsDelegate.Model model;
        int i;
        int i2;
        aue.l iVar;
        dj0.d dVar2;
        dj0.d dVar3;
        r rVar;
        xi0.b bVar;
        final com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar2 = (com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f281302b;
        gte.a aVar = iVar2.f90947q;
        xye.d dVar4 = iVar2.U;
        uye.g gVar = iVar2.o;
        final yki.l FlowCoordinator = (yki.l) obj2;
        final TopupFlowContract$Step step = (TopupFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        final int i3 = 0;
        if (Intrinsics.f(step, TopupFlowContract$Step.Amount.f90829a)) {
            AmountNewScreen amountNewScreen = new AmountNewScreen(new kye.n(gVar.f284275a, gVar.f284276b, gVar.f284277c, gVar.d, gVar.e, gVar.f));
            Function1 block = new Function1() { // from class: uye.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar3 = iVar2;
                            yki.a aVar2 = iVar3.i0;
                            com.revolut.feature.topup_screen.api.topup_limits.a aVar3 = iVar3.Y;
                            g gVar2 = iVar3.o;
                            kye.u result = (kye.u) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof kye.o) {
                                kye.o oVar = (kye.o) result;
                                xi0.a aVar4 = xi0.b.Companion;
                                String str = oVar.f190802a;
                                aVar4.getClass();
                                iVar3.C1(new AutoTopUpFlowDestination(xi0.a.a(str), e1f.c.b(gVar2.f284275a), oVar.f190803b));
                            } else if (result instanceof kye.x) {
                                kye.x xVar = (kye.x) result;
                                if (((jte.d) iVar3.f90947q).c(TopupApi$Toggles.AmountCurrencyChooserMigration.f90459c)) {
                                    oki.h.w2(aVar2, new TopupFlowContract$Step.CurrencyPicker(xVar.f190868a, xVar.f190869b), ModalDestination.Style.POPUP.f98311a);
                                } else {
                                    String str2 = xVar.f190868a;
                                    TopUpTarget topUpTarget = gVar2.f284275a;
                                    iVar3.C1(u0.c(new BalancePickerFeatureConfig(4, str2, e1f.c.b(topUpTarget), true, topUpTarget instanceof TopUpTarget.RevXFiat ? BalancePickerFeatureConfig.Currencies.TopUpRevXFiat.f99561a : BalancePickerFeatureConfig.Currencies.TopUpAll.f99559a, false, true, true, true, true, null, null, BalancePickerFeatureConfig.ShowBalancesSetting.InItemCurrency.f99564a, false, null, null, null, null, false, e1f.c.a(gVar2.f284275a))));
                                }
                            } else if (result instanceof kye.y) {
                                kye.y yVar = (kye.y) result;
                                oki.h.t2(iVar3, iVar3.i0, new TopupFlowContract$Step.SelectTopupMethod(yVar.f190877b, yVar.f190876a, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            } else if (result instanceof kye.a0) {
                                iVar3.g3(new tw9.h(iVar3, result, null, 22));
                            } else if (result instanceof kye.z) {
                                iVar3.g3(new q(iVar3, result, null, 0));
                            } else if (result instanceof kye.p) {
                                iVar3.g3(new q(iVar3, result, null, 1));
                            } else {
                                boolean z = result instanceof u.b;
                                yki.l lVar = FlowCoordinator;
                                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                if (z) {
                                    oki.h.w2(lVar, TopupFlowContract$Step.JapaneseRestrictionsDialog.f90862a, bottom_dialog);
                                } else if (result instanceof u.a) {
                                    oki.h.w2(lVar, TopupFlowContract$Step.CashDepositWarningDialog.f90840a, bottom_dialog);
                                } else if (result instanceof u.c) {
                                    oki.h.w2(lVar, TopupFlowContract$Step.ZeroFeeWithInfoDialog.f90895a, bottom_dialog);
                                } else if (result instanceof kye.b0) {
                                    kye.b0 b0Var = (kye.b0) result;
                                    oki.h.w2(lVar, new TopupFlowContract$Step.TopUpLimitsDialog(b0Var.f190705a, b0Var.f190706b, b0Var.f190707c), bottom_dialog);
                                } else if (result instanceof kye.f0) {
                                    kye.f0 f0Var = (kye.f0) result;
                                    oki.h.w2(lVar, new TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog(f0Var.f190732a, f0Var.f190733b), bottom_dialog);
                                } else if (result instanceof kye.c0) {
                                    kye.c0 c0Var = (kye.c0) result;
                                    oki.h.w2(lVar, new TopupFlowContract$Step.TopUpLimitsVerificationDialog(c0Var.f190715a, c0Var.f190716b, c0Var.f190717c), bottom_dialog);
                                } else if (result instanceof kye.d0) {
                                    kye.d0 d0Var = (kye.d0) result;
                                    String str3 = d0Var.f190721a;
                                    List<aue.b> list = d0Var.f190722b;
                                    aue.d dVar5 = iVar3.X;
                                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                                    for (aue.b bVar2 : list) {
                                        dVar5.getClass();
                                        arrayList2.add(aue.d.b(bVar2));
                                    }
                                    oki.h.w2(lVar, new TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog(str3, arrayList2, d0Var.f190723c, d0Var.d), bottom_dialog);
                                } else if (result instanceof kye.t) {
                                    kye.t tVar = (kye.t) result;
                                    iVar3.n2(new sxe.g(iVar3, tVar.f190836b, tVar.f190837c, tVar.f190835a, (Continuation) null, 14), new whi.b(6));
                                } else if (result instanceof kye.s) {
                                    kye.s sVar = (kye.s) result;
                                    oki.h.w2(lVar, new TopupFlowContract$Step.CardVerificationRequiredDialog(sVar.f190824a, sVar.f190825b, sVar.f190826c), bottom_dialog);
                                } else if (result instanceof kye.v) {
                                    yji.l.j2(iVar3, new TopUpFeesBottomSheetScreen(((kye.v) result).f190853a), bottom_dialog, null, 2);
                                } else if (result instanceof kye.q) {
                                    oki.h.w2(aVar2, new TopupFlowContract$Step.BeDrivenFeesBottomSheet(((kye.q) result).f190816a), bottom_dialog);
                                } else if (result instanceof kye.e0) {
                                    aue.k kVar = ((kye.e0) result).f190730a;
                                    aVar3.getClass();
                                    oki.h.w2(lVar, new TopupFlowContract$Step.UaeCountryLimitsDialog(com.revolut.feature.topup_screen.api.topup_limits.a.a(kVar)), bottom_dialog);
                                } else if (result instanceof kye.r) {
                                    List<aue.l> list2 = ((kye.r) result).f190819a;
                                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                                    for (aue.l lVar2 : list2) {
                                        aVar3.getClass();
                                        arrayList3.add(com.revolut.feature.topup_screen.api.topup_limits.a.a(lVar2));
                                    }
                                    oki.h.w2(lVar, new TopupFlowContract$Step.BrazilCountryLimitDialog(arrayList3), bottom_dialog);
                                } else {
                                    if (!(result instanceof kye.w)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    kye.w wVar = (kye.w) result;
                                    List<aue.l> list3 = wVar.f190861a;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                                    for (aue.l lVar3 : list3) {
                                        aVar3.getClass();
                                        arrayList4.add(com.revolut.feature.topup_screen.api.topup_limits.a.a(lVar3));
                                    }
                                    oki.h.w2(lVar, new TopupFlowContract$Step.NzAkahuLimitDialog(wVar.f190862b, arrayList4), bottom_dialog);
                                }
                            }
                            return Unit.f186387a;
                        case 1:
                            y5i.b flowResult = (y5i.b) obj4;
                            Intrinsics.checkNotNullParameter(flowResult, "flowResult");
                            boolean z3 = flowResult instanceof b.a;
                            iVar2.f90948r.f276169a = z3;
                            if (!z3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.D2(FlowCoordinator);
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.a result2 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.a) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 instanceof a.C0561a) {
                                oki.h.D2(FlowCoordinator);
                            } else {
                                if (!(result2 instanceof lze.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar2.l1().M0(new aii.i(((lze.c) result2).f200968a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            amountNewScreen.H = block;
            return amountNewScreen;
        }
        String str = null;
        if (step instanceof TopupFlowContract$Step.SelectTopupMethod) {
            TopupFlowContract$Step.SelectTopupMethod selectTopupMethod = (TopupFlowContract$Step.SelectTopupMethod) step;
            String str2 = selectTopupMethod.f90876a;
            yte.n nVar = selectTopupMethod.f90877b;
            TopUpTarget topUpTarget = gVar.f284275a;
            dj0.d dVar5 = selectTopupMethod.f90878c;
            if (dVar5 != null && (bVar = dVar5.f115083b) != null) {
                str = bVar.f306286a;
            }
            TopupMethodsFlow topupMethodsFlow = new TopupMethodsFlow(new TopupMethodsFlowContract$InputData(str2, nVar, topUpTarget, null, null, str, 24));
            uye.j block2 = new uye.j(iVar2, step, FlowCoordinator, i3);
            Intrinsics.checkNotNullParameter(block2, "block");
            topupMethodsFlow.H = block2;
            return topupMethodsFlow;
        }
        int i5 = 4;
        final int i6 = 2;
        final int i21 = 10;
        if (step instanceof TopupFlowContract$Step.CurrencyPicker) {
            k1j.d dVar6 = Intrinsics.f(gVar.f284275a, TopUpTarget.Pro.f90574a) ? k1j.d.FREELANCER : k1j.d.RETAIL;
            AccountId accountIdA = e1f.c.a(gVar.f284275a);
            if (((jte.d) aVar).c(TopupApi$Toggles.TopUpCurrencyChooserImprovements.f90472c)) {
                xi0.a aVar2 = xi0.b.Companion;
                TopupFlowContract$Step.CurrencyPicker currencyPicker = (TopupFlowContract$Step.CurrencyPicker) step;
                String str3 = currencyPicker.f90846a;
                aVar2.getClass();
                ViewController viewControllerE1 = iVar2.e1(new l1j.c(new CurrencyChooserInputData(dVar6, accountIdA, xi0.a.a(str3), new SupportedTargetCurrencies.Ordered(currencyPicker.f90847b), null, false, null, 112)));
                uye.i block3 = new uye.i(iVar2, i6);
                Intrinsics.checkNotNullParameter(block3, "block");
                viewControllerE1.H = block3;
                return viewControllerE1;
            }
            l2j.a aVar3 = iVar2.c0;
            TopupFlowContract$Step.CurrencyPicker currencyPicker2 = (TopupFlowContract$Step.CurrencyPicker) step;
            List list = currencyPicker2.f90847b;
            xi0.a aVar4 = xi0.b.Companion;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                t61.a.A(aVar4, (String) it8.next(), arrayList2);
            }
            xi0.a aVar5 = xi0.b.Companion;
            String str4 = currencyPicker2.f90846a;
            aVar5.getClass();
            CurrencyChooserFlow currencyChooserFlowA = aVar3.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.CurrencyChooser(dVar6, accountIdA, xi0.a.a(str4), arrayList2, null, null, 48)));
            uye.i iVar3 = new uye.i(iVar2, i5);
            Intrinsics.checkNotNullParameter(iVar3, "<set-?>");
            currencyChooserFlowA.J = iVar3;
            return currencyChooserFlowA;
        }
        final int i22 = 8;
        if (step instanceof TopupFlowContract$Step.StoredMethodTopUp) {
            StoredMethodTopUpFlow storedMethodTopUpFlow = new StoredMethodTopUpFlow(((TopupFlowContract$Step.StoredMethodTopUp) step).f90879a);
            Function1 block4 = new Function1() { // from class: uye.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    rye.c cVar;
                    int i32 = i22;
                    y0 y0VarA = null;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = iVar2;
                    TopupFlowContract$Step topupFlowContract$Step = step;
                    switch (i32) {
                        case 0:
                            yye.c result = (yye.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof yye.a) {
                                TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) topupFlowContract$Step;
                                iVar4.V2(unverifiedCardTopUpDelayDialog.f90893a, unverifiedCardTopUpDelayDialog.f90894b);
                            } else if (!(result instanceof yye.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            ste.u result2 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof ste.s)) {
                                if (!(result2 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsDialog) topupFlowContract$Step).f90883c);
                            } else if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 2:
                            ste.u result3 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof ste.s)) {
                                if (!(result3 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsVerificationDialog) topupFlowContract$Step).f90886c);
                            } else if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 3:
                            ste.u result4 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z = result4 instanceof ste.s;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = iVar2;
                            if (!z) {
                                if (!(result4 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) topupFlowContract$Step;
                                iVar5.n2(new sxe.g(iVar5, topUpMultiLimitsVerificationDialog.f90889c, topUpMultiLimitsVerificationDialog.d, topUpMultiLimitsVerificationDialog.f90887a, (Continuation) null, 14), new whi.b(6));
                            } else if (Intrinsics.f(((ste.s) result4).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar5.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 4:
                            we6.k0 result5 = (we6.k0) obj4;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (result5 instanceof we6.i0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.c(iVar4, result5, topupFlowContract$Step, null));
                            } else {
                                if (!(result5 instanceof we6.j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.j0) result5).f296649a, null));
                            }
                            return Unit.f186387a;
                        case 5:
                            dii.g result6 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z3 = result6 instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = iVar2;
                            if (z3) {
                                TopupFlowContract$Step.CardVerificationRequiredDialog cardVerificationRequiredDialog = (TopupFlowContract$Step.CardVerificationRequiredDialog) topupFlowContract$Step;
                                iVar6.n2(new sxe.g(iVar6, cardVerificationRequiredDialog.f90834b, cardVerificationRequiredDialog.f90835c, cardVerificationRequiredDialog.f90833a, (Continuation) null, 14), new whi.b(6));
                            } else if ((result6 instanceof dii.c) && Intrinsics.f(((dii.c) result6).f115066a.f275445a, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar6.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 6:
                            til.r output = (til.r) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof til.q) {
                                iVar4.n2(new s(iVar4, topupFlowContract$Step, null, 0), new whi.b(6));
                            } else if (!(output instanceof til.n) && !(output instanceof til.o) && !(output instanceof til.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 7:
                            ExchangeGlobalAccessOutput result7 = (ExchangeGlobalAccessOutput) obj4;
                            Intrinsics.checkNotNullParameter(result7, "result");
                            if (result7 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                                iVar4.l2(new s(iVar4, topupFlowContract$Step, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 8:
                            c1f.c cVar2 = iVar4.K;
                            rze.i result8 = (rze.i) obj4;
                            Intrinsics.checkNotNullParameter(result8, "result");
                            if (!(result8 instanceof rze.e)) {
                                if (result8 instanceof rze.f) {
                                    iVar4.C1(((rze.f) result8).f258597a);
                                } else if (result8 instanceof rze.g) {
                                    iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.StoredMethodTopUp) topupFlowContract$Step).f90879a.f91020c.f115083b, null, 3), new yi5.b(26));
                                    Unit unit = Unit.f186387a;
                                } else if (result8 instanceof rze.d) {
                                    iVar4.X1(cVar2.a(((rze.d) result8).f258595a));
                                } else if (result8 instanceof rze.h) {
                                    rye.e eVar = iVar4.M;
                                    Throwable throwable = ((rze.h) result8).f258599a;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                                    HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                                    if (httpException != null) {
                                        r1 r1VarM = i26.l.m(httpException);
                                        String strString = r1VarM != null ? r1VarM.string() : null;
                                        if (strString != null) {
                                            try {
                                                cVar = (rye.c) eVar.f258366a.b(strString, rye.c.class);
                                            } catch (Exception e) {
                                                zhm.h0 h0Var = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                                cVar = null;
                                            }
                                            if (cVar == null && httpException.code() == 4042) {
                                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var2 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var2);
                                            }
                                        } else {
                                            cVar = null;
                                            if (cVar == null) {
                                                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var22 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList22 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var22);
                                            }
                                        }
                                    } else {
                                        cVar = null;
                                    }
                                    if (cVar != null && cVar.f258363a == 4042) {
                                        dj0.d dVarO = mo3.a.o(cVar.f258365c);
                                        y0VarA = new y0(null, new nii.z(new TextLocalisedClause(R$string.wallet_limit_exceeded_error_title, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wallet_limit_exceeded_error_description, zhm.u.c(new MoneyClause(pyd.c.H(dVarO, mo3.a.o(cVar.f258364b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                                    }
                                    if (y0VarA == null) {
                                        y0VarA = cVar2.a(throwable);
                                    }
                                    iVar4.X1(y0VarA);
                                } else {
                                    if (!Intrinsics.f(result8, rze.c.f258594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Unit unit2 = Unit.f186387a;
                                }
                                break;
                            } else {
                                iVar4.l1().M0(new aii.i(((rze.e) result8).f258596a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                        case 9:
                            ste.o result9 = (ste.o) obj4;
                            Intrinsics.checkNotNullParameter(result9, "result");
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar7 = iVar2;
                            boolean z4 = result9 instanceof ste.n;
                            iVar7.f90948r.f276169a = z4;
                            dj0.d dVar7 = ((TopupFlowContract$Step.GooglePayTopup) topupFlowContract$Step).f90851a.f90496a;
                            if (z4) {
                                GooglePayFee googlePayFee = ((ste.n) result9).f265568a;
                                if (googlePayFee instanceof GooglePayFee.FeeRequired) {
                                    yji.l.b1(iVar7, iVar7.X1(((c1f.a) iVar7.J).c(dVar7, ((GooglePayFee.FeeRequired) googlePayFee).f90520b)), null, new u(iVar7, dVar7, null), 3);
                                } else {
                                    iVar7.l2(new dp4.y0(iVar7, dVar7, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                                }
                            } else if (!(result9 instanceof ste.l)) {
                                if (!(result9 instanceof ste.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th10 = ((ste.m) result9).f265567a;
                                RuntimeException runtimeException = new RuntimeException("Google pay top-up error", th10);
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var3);
                                iVar7.R2(th10, dVar7.f115083b);
                            } else if (((ste.l) result9).f265566a) {
                                yki.a aVar6 = iVar7.i0;
                                String str5 = dVar7.f115083b.f306286a;
                                g gVar2 = iVar7.o;
                                oki.h.t2(iVar7, aVar6, new TopupFlowContract$Step.SelectTopupMethod(dVar7, str5, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 10:
                            ste.b result10 = (ste.b) obj4;
                            Intrinsics.checkNotNullParameter(result10, "result");
                            if (result10 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                b bVar2 = iVar4.u;
                                CardDetailsScreenDescriptor$OutputData$CardData cardData = CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result10, ((TopupFlowContract$Step.ExpiredCardDetails) topupFlowContract$Step).f90850a);
                                bVar2.getClass();
                                Intrinsics.checkNotNullParameter(cardData, "cardData");
                                bVar2.f284258a.k(cardData);
                            } else {
                                if (!(result10 instanceof ste.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Result not expected in this flow: " + result10);
                                zhm.h0 h0Var4 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var4);
                            }
                            return Unit.f186387a;
                        case 11:
                            nze.l result11 = (nze.l) obj4;
                            Intrinsics.checkNotNullParameter(result11, "result");
                            boolean z6 = result11 instanceof l.b;
                            iVar4.f90948r.f276169a = z6;
                            if (result11 instanceof l.a) {
                                Unit unit3 = Unit.f186387a;
                            } else if (result11 instanceof nze.m) {
                                iVar4.l1().M0(new aii.i(((nze.m) result11).f221037a, (aii.a) null, 6));
                            } else if (result11 instanceof nze.n) {
                                iVar4.C1(u0.b(((nze.n) result11).f221038a));
                            } else if (result11 instanceof nze.o) {
                                iVar4.C1(u0.b(((nze.o) result11).f221039a));
                            } else {
                                if (!z6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.MandateTopup) topupFlowContract$Step).f90863a.f91003a.f115083b, null, 3), new yi5.b(26));
                                Unit unit4 = Unit.f186387a;
                            }
                            return Unit.f186387a;
                        case 12:
                            o0 result12 = (o0) obj4;
                            Intrinsics.checkNotNullParameter(result12, "result");
                            if (result12 instanceof we6.m0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.b(iVar4, result12, topupFlowContract$Step, null));
                            } else {
                                if (!(result12 instanceof we6.n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.n0) result12).f296657a, null));
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar8 = iVar2;
                            yki.a aVar7 = iVar8.i0;
                            we6.p result13 = (we6.p) obj4;
                            Intrinsics.checkNotNullParameter(result13, "result");
                            if (result13 instanceof we6.q) {
                                iVar8.N2(((we6.q) result13).f296666a);
                            } else if (result13 instanceof p.a) {
                                xi0.b bVar3 = ((TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step).f90844a.f115083b;
                                aVar7.e(true);
                                iVar8.P2(bVar3);
                            } else if (result13 instanceof p.b) {
                                TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step;
                                if (oki.h.E2(aVar7, new uwi.v(26))) {
                                    aVar7.e(false);
                                } else {
                                    String str6 = crossBorderEasyBankTransfer.f90844a.f115083b.f306286a;
                                    g gVar3 = iVar8.o;
                                    oki.h.t2(iVar8, aVar7, new TopupFlowContract$Step.SelectTopupMethod(crossBorderEasyBankTransfer.f90844a, str6, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                                }
                            } else {
                                if (!(result13 instanceof we6.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar8.N2(((we6.o) result13).f296658a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            storedMethodTopUpFlow.H = block4;
            return storedMethodTopUpFlow;
        }
        if (step instanceof TopupFlowContract$Step.GooglePayTopup) {
            GooglePayFlow googlePayFlow = new GooglePayFlow(((TopupFlowContract$Step.GooglePayTopup) step).f90851a);
            final int i32 = 9;
            Function1 block5 = new Function1() { // from class: uye.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    rye.c cVar;
                    int i322 = i32;
                    y0 y0VarA = null;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = iVar2;
                    TopupFlowContract$Step topupFlowContract$Step = step;
                    switch (i322) {
                        case 0:
                            yye.c result = (yye.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof yye.a) {
                                TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) topupFlowContract$Step;
                                iVar4.V2(unverifiedCardTopUpDelayDialog.f90893a, unverifiedCardTopUpDelayDialog.f90894b);
                            } else if (!(result instanceof yye.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            ste.u result2 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof ste.s)) {
                                if (!(result2 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsDialog) topupFlowContract$Step).f90883c);
                            } else if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 2:
                            ste.u result3 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof ste.s)) {
                                if (!(result3 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsVerificationDialog) topupFlowContract$Step).f90886c);
                            } else if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 3:
                            ste.u result4 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z = result4 instanceof ste.s;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = iVar2;
                            if (!z) {
                                if (!(result4 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) topupFlowContract$Step;
                                iVar5.n2(new sxe.g(iVar5, topUpMultiLimitsVerificationDialog.f90889c, topUpMultiLimitsVerificationDialog.d, topUpMultiLimitsVerificationDialog.f90887a, (Continuation) null, 14), new whi.b(6));
                            } else if (Intrinsics.f(((ste.s) result4).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar5.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 4:
                            we6.k0 result5 = (we6.k0) obj4;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (result5 instanceof we6.i0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.c(iVar4, result5, topupFlowContract$Step, null));
                            } else {
                                if (!(result5 instanceof we6.j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.j0) result5).f296649a, null));
                            }
                            return Unit.f186387a;
                        case 5:
                            dii.g result6 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z3 = result6 instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = iVar2;
                            if (z3) {
                                TopupFlowContract$Step.CardVerificationRequiredDialog cardVerificationRequiredDialog = (TopupFlowContract$Step.CardVerificationRequiredDialog) topupFlowContract$Step;
                                iVar6.n2(new sxe.g(iVar6, cardVerificationRequiredDialog.f90834b, cardVerificationRequiredDialog.f90835c, cardVerificationRequiredDialog.f90833a, (Continuation) null, 14), new whi.b(6));
                            } else if ((result6 instanceof dii.c) && Intrinsics.f(((dii.c) result6).f115066a.f275445a, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar6.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 6:
                            til.r output = (til.r) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof til.q) {
                                iVar4.n2(new s(iVar4, topupFlowContract$Step, null, 0), new whi.b(6));
                            } else if (!(output instanceof til.n) && !(output instanceof til.o) && !(output instanceof til.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 7:
                            ExchangeGlobalAccessOutput result7 = (ExchangeGlobalAccessOutput) obj4;
                            Intrinsics.checkNotNullParameter(result7, "result");
                            if (result7 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                                iVar4.l2(new s(iVar4, topupFlowContract$Step, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 8:
                            c1f.c cVar2 = iVar4.K;
                            rze.i result8 = (rze.i) obj4;
                            Intrinsics.checkNotNullParameter(result8, "result");
                            if (!(result8 instanceof rze.e)) {
                                if (result8 instanceof rze.f) {
                                    iVar4.C1(((rze.f) result8).f258597a);
                                } else if (result8 instanceof rze.g) {
                                    iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.StoredMethodTopUp) topupFlowContract$Step).f90879a.f91020c.f115083b, null, 3), new yi5.b(26));
                                    Unit unit = Unit.f186387a;
                                } else if (result8 instanceof rze.d) {
                                    iVar4.X1(cVar2.a(((rze.d) result8).f258595a));
                                } else if (result8 instanceof rze.h) {
                                    rye.e eVar = iVar4.M;
                                    Throwable throwable = ((rze.h) result8).f258599a;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                                    HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                                    if (httpException != null) {
                                        r1 r1VarM = i26.l.m(httpException);
                                        String strString = r1VarM != null ? r1VarM.string() : null;
                                        if (strString != null) {
                                            try {
                                                cVar = (rye.c) eVar.f258366a.b(strString, rye.c.class);
                                            } catch (Exception e) {
                                                zhm.h0 h0Var = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                                cVar = null;
                                            }
                                            if (cVar == null && httpException.code() == 4042) {
                                                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var22 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList22 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var22);
                                            }
                                        } else {
                                            cVar = null;
                                            if (cVar == null) {
                                                IllegalArgumentException illegalArgumentException22 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException22, h0Var222);
                                            }
                                        }
                                    } else {
                                        cVar = null;
                                    }
                                    if (cVar != null && cVar.f258363a == 4042) {
                                        dj0.d dVarO = mo3.a.o(cVar.f258365c);
                                        y0VarA = new y0(null, new nii.z(new TextLocalisedClause(R$string.wallet_limit_exceeded_error_title, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wallet_limit_exceeded_error_description, zhm.u.c(new MoneyClause(pyd.c.H(dVarO, mo3.a.o(cVar.f258364b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                                    }
                                    if (y0VarA == null) {
                                        y0VarA = cVar2.a(throwable);
                                    }
                                    iVar4.X1(y0VarA);
                                } else {
                                    if (!Intrinsics.f(result8, rze.c.f258594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Unit unit2 = Unit.f186387a;
                                }
                                break;
                            } else {
                                iVar4.l1().M0(new aii.i(((rze.e) result8).f258596a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                        case 9:
                            ste.o result9 = (ste.o) obj4;
                            Intrinsics.checkNotNullParameter(result9, "result");
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar7 = iVar2;
                            boolean z4 = result9 instanceof ste.n;
                            iVar7.f90948r.f276169a = z4;
                            dj0.d dVar7 = ((TopupFlowContract$Step.GooglePayTopup) topupFlowContract$Step).f90851a.f90496a;
                            if (z4) {
                                GooglePayFee googlePayFee = ((ste.n) result9).f265568a;
                                if (googlePayFee instanceof GooglePayFee.FeeRequired) {
                                    yji.l.b1(iVar7, iVar7.X1(((c1f.a) iVar7.J).c(dVar7, ((GooglePayFee.FeeRequired) googlePayFee).f90520b)), null, new u(iVar7, dVar7, null), 3);
                                } else {
                                    iVar7.l2(new dp4.y0(iVar7, dVar7, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                                }
                            } else if (!(result9 instanceof ste.l)) {
                                if (!(result9 instanceof ste.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th10 = ((ste.m) result9).f265567a;
                                RuntimeException runtimeException = new RuntimeException("Google pay top-up error", th10);
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var3);
                                iVar7.R2(th10, dVar7.f115083b);
                            } else if (((ste.l) result9).f265566a) {
                                yki.a aVar6 = iVar7.i0;
                                String str5 = dVar7.f115083b.f306286a;
                                g gVar2 = iVar7.o;
                                oki.h.t2(iVar7, aVar6, new TopupFlowContract$Step.SelectTopupMethod(dVar7, str5, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 10:
                            ste.b result10 = (ste.b) obj4;
                            Intrinsics.checkNotNullParameter(result10, "result");
                            if (result10 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                b bVar2 = iVar4.u;
                                CardDetailsScreenDescriptor$OutputData$CardData cardData = CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result10, ((TopupFlowContract$Step.ExpiredCardDetails) topupFlowContract$Step).f90850a);
                                bVar2.getClass();
                                Intrinsics.checkNotNullParameter(cardData, "cardData");
                                bVar2.f284258a.k(cardData);
                            } else {
                                if (!(result10 instanceof ste.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Result not expected in this flow: " + result10);
                                zhm.h0 h0Var4 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var4);
                            }
                            return Unit.f186387a;
                        case 11:
                            nze.l result11 = (nze.l) obj4;
                            Intrinsics.checkNotNullParameter(result11, "result");
                            boolean z6 = result11 instanceof l.b;
                            iVar4.f90948r.f276169a = z6;
                            if (result11 instanceof l.a) {
                                Unit unit3 = Unit.f186387a;
                            } else if (result11 instanceof nze.m) {
                                iVar4.l1().M0(new aii.i(((nze.m) result11).f221037a, (aii.a) null, 6));
                            } else if (result11 instanceof nze.n) {
                                iVar4.C1(u0.b(((nze.n) result11).f221038a));
                            } else if (result11 instanceof nze.o) {
                                iVar4.C1(u0.b(((nze.o) result11).f221039a));
                            } else {
                                if (!z6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.MandateTopup) topupFlowContract$Step).f90863a.f91003a.f115083b, null, 3), new yi5.b(26));
                                Unit unit4 = Unit.f186387a;
                            }
                            return Unit.f186387a;
                        case 12:
                            o0 result12 = (o0) obj4;
                            Intrinsics.checkNotNullParameter(result12, "result");
                            if (result12 instanceof we6.m0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.b(iVar4, result12, topupFlowContract$Step, null));
                            } else {
                                if (!(result12 instanceof we6.n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.n0) result12).f296657a, null));
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar8 = iVar2;
                            yki.a aVar7 = iVar8.i0;
                            we6.p result13 = (we6.p) obj4;
                            Intrinsics.checkNotNullParameter(result13, "result");
                            if (result13 instanceof we6.q) {
                                iVar8.N2(((we6.q) result13).f296666a);
                            } else if (result13 instanceof p.a) {
                                xi0.b bVar3 = ((TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step).f90844a.f115083b;
                                aVar7.e(true);
                                iVar8.P2(bVar3);
                            } else if (result13 instanceof p.b) {
                                TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step;
                                if (oki.h.E2(aVar7, new uwi.v(26))) {
                                    aVar7.e(false);
                                } else {
                                    String str6 = crossBorderEasyBankTransfer.f90844a.f115083b.f306286a;
                                    g gVar3 = iVar8.o;
                                    oki.h.t2(iVar8, aVar7, new TopupFlowContract$Step.SelectTopupMethod(crossBorderEasyBankTransfer.f90844a, str6, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                                }
                            } else {
                                if (!(result13 instanceof we6.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar8.N2(((we6.o) result13).f296658a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block5, "block");
            googlePayFlow.H = block5;
            return googlePayFlow;
        }
        int i33 = 5;
        if (step instanceof TopupFlowContract$Step.CashDepositTopup) {
            CashDepositTopupFlow cashDepositTopupFlow = new CashDepositTopupFlow(((TopupFlowContract$Step.CashDepositTopup) step).f90839a);
            uye.i block6 = new uye.i(iVar2, i33);
            Intrinsics.checkNotNullParameter(block6, "block");
            cashDepositTopupFlow.H = block6;
            return cashDepositTopupFlow;
        }
        if (step instanceof TopupFlowContract$Step.MandateTopup) {
            MandateTopupFlow mandateTopupFlow = new MandateTopupFlow(((TopupFlowContract$Step.MandateTopup) step).f90863a);
            final int i43 = 11;
            Function1 block7 = new Function1() { // from class: uye.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    rye.c cVar;
                    int i322 = i43;
                    y0 y0VarA = null;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = iVar2;
                    TopupFlowContract$Step topupFlowContract$Step = step;
                    switch (i322) {
                        case 0:
                            yye.c result = (yye.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof yye.a) {
                                TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) topupFlowContract$Step;
                                iVar4.V2(unverifiedCardTopUpDelayDialog.f90893a, unverifiedCardTopUpDelayDialog.f90894b);
                            } else if (!(result instanceof yye.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            ste.u result2 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof ste.s)) {
                                if (!(result2 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsDialog) topupFlowContract$Step).f90883c);
                            } else if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 2:
                            ste.u result3 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof ste.s)) {
                                if (!(result3 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsVerificationDialog) topupFlowContract$Step).f90886c);
                            } else if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 3:
                            ste.u result4 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z = result4 instanceof ste.s;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = iVar2;
                            if (!z) {
                                if (!(result4 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) topupFlowContract$Step;
                                iVar5.n2(new sxe.g(iVar5, topUpMultiLimitsVerificationDialog.f90889c, topUpMultiLimitsVerificationDialog.d, topUpMultiLimitsVerificationDialog.f90887a, (Continuation) null, 14), new whi.b(6));
                            } else if (Intrinsics.f(((ste.s) result4).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar5.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 4:
                            we6.k0 result5 = (we6.k0) obj4;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (result5 instanceof we6.i0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.c(iVar4, result5, topupFlowContract$Step, null));
                            } else {
                                if (!(result5 instanceof we6.j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.j0) result5).f296649a, null));
                            }
                            return Unit.f186387a;
                        case 5:
                            dii.g result6 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z3 = result6 instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = iVar2;
                            if (z3) {
                                TopupFlowContract$Step.CardVerificationRequiredDialog cardVerificationRequiredDialog = (TopupFlowContract$Step.CardVerificationRequiredDialog) topupFlowContract$Step;
                                iVar6.n2(new sxe.g(iVar6, cardVerificationRequiredDialog.f90834b, cardVerificationRequiredDialog.f90835c, cardVerificationRequiredDialog.f90833a, (Continuation) null, 14), new whi.b(6));
                            } else if ((result6 instanceof dii.c) && Intrinsics.f(((dii.c) result6).f115066a.f275445a, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar6.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 6:
                            til.r output = (til.r) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof til.q) {
                                iVar4.n2(new s(iVar4, topupFlowContract$Step, null, 0), new whi.b(6));
                            } else if (!(output instanceof til.n) && !(output instanceof til.o) && !(output instanceof til.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 7:
                            ExchangeGlobalAccessOutput result7 = (ExchangeGlobalAccessOutput) obj4;
                            Intrinsics.checkNotNullParameter(result7, "result");
                            if (result7 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                                iVar4.l2(new s(iVar4, topupFlowContract$Step, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 8:
                            c1f.c cVar2 = iVar4.K;
                            rze.i result8 = (rze.i) obj4;
                            Intrinsics.checkNotNullParameter(result8, "result");
                            if (!(result8 instanceof rze.e)) {
                                if (result8 instanceof rze.f) {
                                    iVar4.C1(((rze.f) result8).f258597a);
                                } else if (result8 instanceof rze.g) {
                                    iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.StoredMethodTopUp) topupFlowContract$Step).f90879a.f91020c.f115083b, null, 3), new yi5.b(26));
                                    Unit unit = Unit.f186387a;
                                } else if (result8 instanceof rze.d) {
                                    iVar4.X1(cVar2.a(((rze.d) result8).f258595a));
                                } else if (result8 instanceof rze.h) {
                                    rye.e eVar = iVar4.M;
                                    Throwable throwable = ((rze.h) result8).f258599a;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                                    HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                                    if (httpException != null) {
                                        r1 r1VarM = i26.l.m(httpException);
                                        String strString = r1VarM != null ? r1VarM.string() : null;
                                        if (strString != null) {
                                            try {
                                                cVar = (rye.c) eVar.f258366a.b(strString, rye.c.class);
                                            } catch (Exception e) {
                                                zhm.h0 h0Var = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                                cVar = null;
                                            }
                                            if (cVar == null && httpException.code() == 4042) {
                                                IllegalArgumentException illegalArgumentException22 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException22, h0Var222);
                                            }
                                        } else {
                                            cVar = null;
                                            if (cVar == null) {
                                                IllegalArgumentException illegalArgumentException222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var2222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList2222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException222, h0Var2222);
                                            }
                                        }
                                    } else {
                                        cVar = null;
                                    }
                                    if (cVar != null && cVar.f258363a == 4042) {
                                        dj0.d dVarO = mo3.a.o(cVar.f258365c);
                                        y0VarA = new y0(null, new nii.z(new TextLocalisedClause(R$string.wallet_limit_exceeded_error_title, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wallet_limit_exceeded_error_description, zhm.u.c(new MoneyClause(pyd.c.H(dVarO, mo3.a.o(cVar.f258364b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                                    }
                                    if (y0VarA == null) {
                                        y0VarA = cVar2.a(throwable);
                                    }
                                    iVar4.X1(y0VarA);
                                } else {
                                    if (!Intrinsics.f(result8, rze.c.f258594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Unit unit2 = Unit.f186387a;
                                }
                                break;
                            } else {
                                iVar4.l1().M0(new aii.i(((rze.e) result8).f258596a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                        case 9:
                            ste.o result9 = (ste.o) obj4;
                            Intrinsics.checkNotNullParameter(result9, "result");
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar7 = iVar2;
                            boolean z4 = result9 instanceof ste.n;
                            iVar7.f90948r.f276169a = z4;
                            dj0.d dVar7 = ((TopupFlowContract$Step.GooglePayTopup) topupFlowContract$Step).f90851a.f90496a;
                            if (z4) {
                                GooglePayFee googlePayFee = ((ste.n) result9).f265568a;
                                if (googlePayFee instanceof GooglePayFee.FeeRequired) {
                                    yji.l.b1(iVar7, iVar7.X1(((c1f.a) iVar7.J).c(dVar7, ((GooglePayFee.FeeRequired) googlePayFee).f90520b)), null, new u(iVar7, dVar7, null), 3);
                                } else {
                                    iVar7.l2(new dp4.y0(iVar7, dVar7, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                                }
                            } else if (!(result9 instanceof ste.l)) {
                                if (!(result9 instanceof ste.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th10 = ((ste.m) result9).f265567a;
                                RuntimeException runtimeException = new RuntimeException("Google pay top-up error", th10);
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var3);
                                iVar7.R2(th10, dVar7.f115083b);
                            } else if (((ste.l) result9).f265566a) {
                                yki.a aVar6 = iVar7.i0;
                                String str5 = dVar7.f115083b.f306286a;
                                g gVar2 = iVar7.o;
                                oki.h.t2(iVar7, aVar6, new TopupFlowContract$Step.SelectTopupMethod(dVar7, str5, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 10:
                            ste.b result10 = (ste.b) obj4;
                            Intrinsics.checkNotNullParameter(result10, "result");
                            if (result10 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                b bVar2 = iVar4.u;
                                CardDetailsScreenDescriptor$OutputData$CardData cardData = CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result10, ((TopupFlowContract$Step.ExpiredCardDetails) topupFlowContract$Step).f90850a);
                                bVar2.getClass();
                                Intrinsics.checkNotNullParameter(cardData, "cardData");
                                bVar2.f284258a.k(cardData);
                            } else {
                                if (!(result10 instanceof ste.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Result not expected in this flow: " + result10);
                                zhm.h0 h0Var4 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var4);
                            }
                            return Unit.f186387a;
                        case 11:
                            nze.l result11 = (nze.l) obj4;
                            Intrinsics.checkNotNullParameter(result11, "result");
                            boolean z6 = result11 instanceof l.b;
                            iVar4.f90948r.f276169a = z6;
                            if (result11 instanceof l.a) {
                                Unit unit3 = Unit.f186387a;
                            } else if (result11 instanceof nze.m) {
                                iVar4.l1().M0(new aii.i(((nze.m) result11).f221037a, (aii.a) null, 6));
                            } else if (result11 instanceof nze.n) {
                                iVar4.C1(u0.b(((nze.n) result11).f221038a));
                            } else if (result11 instanceof nze.o) {
                                iVar4.C1(u0.b(((nze.o) result11).f221039a));
                            } else {
                                if (!z6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.MandateTopup) topupFlowContract$Step).f90863a.f91003a.f115083b, null, 3), new yi5.b(26));
                                Unit unit4 = Unit.f186387a;
                            }
                            return Unit.f186387a;
                        case 12:
                            o0 result12 = (o0) obj4;
                            Intrinsics.checkNotNullParameter(result12, "result");
                            if (result12 instanceof we6.m0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.b(iVar4, result12, topupFlowContract$Step, null));
                            } else {
                                if (!(result12 instanceof we6.n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.n0) result12).f296657a, null));
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar8 = iVar2;
                            yki.a aVar7 = iVar8.i0;
                            we6.p result13 = (we6.p) obj4;
                            Intrinsics.checkNotNullParameter(result13, "result");
                            if (result13 instanceof we6.q) {
                                iVar8.N2(((we6.q) result13).f296666a);
                            } else if (result13 instanceof p.a) {
                                xi0.b bVar3 = ((TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step).f90844a.f115083b;
                                aVar7.e(true);
                                iVar8.P2(bVar3);
                            } else if (result13 instanceof p.b) {
                                TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step;
                                if (oki.h.E2(aVar7, new uwi.v(26))) {
                                    aVar7.e(false);
                                } else {
                                    String str6 = crossBorderEasyBankTransfer.f90844a.f115083b.f306286a;
                                    g gVar3 = iVar8.o;
                                    oki.h.t2(iVar8, aVar7, new TopupFlowContract$Step.SelectTopupMethod(crossBorderEasyBankTransfer.f90844a, str6, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                                }
                            } else {
                                if (!(result13 instanceof we6.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar8.N2(((we6.o) result13).f296658a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block7, "block");
            mandateTopupFlow.H = block7;
            return mandateTopupFlow;
        }
        int i59 = 6;
        if (step instanceof TopupFlowContract$Step.CreateMandate) {
            if (!((jte.d) aVar).c(MandateApi$Toggles$VrpSetupBottomSheet.f72205c)) {
                ViewController viewControllerE12 = iVar2.e1(new we6.n(new we6.l(((TopupFlowContract$Step.CreateMandate) step).f90841a)));
                uye.j block8 = new uye.j(iVar2, FlowCoordinator, step, i59);
                Intrinsics.checkNotNullParameter(block8, "block");
                viewControllerE12.H = block8;
                return viewControllerE12;
            }
            TopupFlowContract$Step.CreateMandate createMandate = (TopupFlowContract$Step.CreateMandate) step;
            ViewController viewControllerE13 = iVar2.e1(new s0(new q0(createMandate.f90842b.f91020c, createMandate.f90841a)));
            uye.j block9 = new uye.j(iVar2, FlowCoordinator, step, i33);
            Intrinsics.checkNotNullParameter(block9, "block");
            viewControllerE13.H = block9;
            return viewControllerE13;
        }
        if (step instanceof TopupFlowContract$Step.CardTopup) {
            FacadeCardTopupFlow facadeCardTopupFlow = new FacadeCardTopupFlow(((TopupFlowContract$Step.CardTopup) step).f90832a);
            uye.j block10 = new uye.j(step, iVar2, FlowCoordinator);
            Intrinsics.checkNotNullParameter(block10, "block");
            facadeCardTopupFlow.H = block10;
            return facadeCardTopupFlow;
        }
        if (step instanceof TopupFlowContract$Step.ExpiredCardDetails) {
            CardDetailsScreen cardDetailsScreen = new CardDetailsScreen(new CardDetailsScreenDescriptor$InputData(false));
            Function1 block11 = new Function1() { // from class: uye.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    rye.c cVar;
                    int i322 = i21;
                    y0 y0VarA = null;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = iVar2;
                    TopupFlowContract$Step topupFlowContract$Step = step;
                    switch (i322) {
                        case 0:
                            yye.c result = (yye.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof yye.a) {
                                TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) topupFlowContract$Step;
                                iVar4.V2(unverifiedCardTopUpDelayDialog.f90893a, unverifiedCardTopUpDelayDialog.f90894b);
                            } else if (!(result instanceof yye.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            ste.u result2 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof ste.s)) {
                                if (!(result2 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsDialog) topupFlowContract$Step).f90883c);
                            } else if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 2:
                            ste.u result3 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof ste.s)) {
                                if (!(result3 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsVerificationDialog) topupFlowContract$Step).f90886c);
                            } else if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 3:
                            ste.u result4 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z = result4 instanceof ste.s;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = iVar2;
                            if (!z) {
                                if (!(result4 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) topupFlowContract$Step;
                                iVar5.n2(new sxe.g(iVar5, topUpMultiLimitsVerificationDialog.f90889c, topUpMultiLimitsVerificationDialog.d, topUpMultiLimitsVerificationDialog.f90887a, (Continuation) null, 14), new whi.b(6));
                            } else if (Intrinsics.f(((ste.s) result4).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar5.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 4:
                            we6.k0 result5 = (we6.k0) obj4;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (result5 instanceof we6.i0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.c(iVar4, result5, topupFlowContract$Step, null));
                            } else {
                                if (!(result5 instanceof we6.j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.j0) result5).f296649a, null));
                            }
                            return Unit.f186387a;
                        case 5:
                            dii.g result6 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z3 = result6 instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = iVar2;
                            if (z3) {
                                TopupFlowContract$Step.CardVerificationRequiredDialog cardVerificationRequiredDialog = (TopupFlowContract$Step.CardVerificationRequiredDialog) topupFlowContract$Step;
                                iVar6.n2(new sxe.g(iVar6, cardVerificationRequiredDialog.f90834b, cardVerificationRequiredDialog.f90835c, cardVerificationRequiredDialog.f90833a, (Continuation) null, 14), new whi.b(6));
                            } else if ((result6 instanceof dii.c) && Intrinsics.f(((dii.c) result6).f115066a.f275445a, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar6.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 6:
                            til.r output = (til.r) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof til.q) {
                                iVar4.n2(new s(iVar4, topupFlowContract$Step, null, 0), new whi.b(6));
                            } else if (!(output instanceof til.n) && !(output instanceof til.o) && !(output instanceof til.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 7:
                            ExchangeGlobalAccessOutput result7 = (ExchangeGlobalAccessOutput) obj4;
                            Intrinsics.checkNotNullParameter(result7, "result");
                            if (result7 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                                iVar4.l2(new s(iVar4, topupFlowContract$Step, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 8:
                            c1f.c cVar2 = iVar4.K;
                            rze.i result8 = (rze.i) obj4;
                            Intrinsics.checkNotNullParameter(result8, "result");
                            if (!(result8 instanceof rze.e)) {
                                if (result8 instanceof rze.f) {
                                    iVar4.C1(((rze.f) result8).f258597a);
                                } else if (result8 instanceof rze.g) {
                                    iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.StoredMethodTopUp) topupFlowContract$Step).f90879a.f91020c.f115083b, null, 3), new yi5.b(26));
                                    Unit unit = Unit.f186387a;
                                } else if (result8 instanceof rze.d) {
                                    iVar4.X1(cVar2.a(((rze.d) result8).f258595a));
                                } else if (result8 instanceof rze.h) {
                                    rye.e eVar = iVar4.M;
                                    Throwable throwable = ((rze.h) result8).f258599a;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                                    HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                                    if (httpException != null) {
                                        r1 r1VarM = i26.l.m(httpException);
                                        String strString = r1VarM != null ? r1VarM.string() : null;
                                        if (strString != null) {
                                            try {
                                                cVar = (rye.c) eVar.f258366a.b(strString, rye.c.class);
                                            } catch (Exception e) {
                                                zhm.h0 h0Var = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                                cVar = null;
                                            }
                                            if (cVar == null && httpException.code() == 4042) {
                                                IllegalArgumentException illegalArgumentException222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var2222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList2222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException222, h0Var2222);
                                            }
                                        } else {
                                            cVar = null;
                                            if (cVar == null) {
                                                IllegalArgumentException illegalArgumentException2222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var22222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList22222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2222, h0Var22222);
                                            }
                                        }
                                    } else {
                                        cVar = null;
                                    }
                                    if (cVar != null && cVar.f258363a == 4042) {
                                        dj0.d dVarO = mo3.a.o(cVar.f258365c);
                                        y0VarA = new y0(null, new nii.z(new TextLocalisedClause(R$string.wallet_limit_exceeded_error_title, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wallet_limit_exceeded_error_description, zhm.u.c(new MoneyClause(pyd.c.H(dVarO, mo3.a.o(cVar.f258364b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                                    }
                                    if (y0VarA == null) {
                                        y0VarA = cVar2.a(throwable);
                                    }
                                    iVar4.X1(y0VarA);
                                } else {
                                    if (!Intrinsics.f(result8, rze.c.f258594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Unit unit2 = Unit.f186387a;
                                }
                                break;
                            } else {
                                iVar4.l1().M0(new aii.i(((rze.e) result8).f258596a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                        case 9:
                            ste.o result9 = (ste.o) obj4;
                            Intrinsics.checkNotNullParameter(result9, "result");
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar7 = iVar2;
                            boolean z4 = result9 instanceof ste.n;
                            iVar7.f90948r.f276169a = z4;
                            dj0.d dVar7 = ((TopupFlowContract$Step.GooglePayTopup) topupFlowContract$Step).f90851a.f90496a;
                            if (z4) {
                                GooglePayFee googlePayFee = ((ste.n) result9).f265568a;
                                if (googlePayFee instanceof GooglePayFee.FeeRequired) {
                                    yji.l.b1(iVar7, iVar7.X1(((c1f.a) iVar7.J).c(dVar7, ((GooglePayFee.FeeRequired) googlePayFee).f90520b)), null, new u(iVar7, dVar7, null), 3);
                                } else {
                                    iVar7.l2(new dp4.y0(iVar7, dVar7, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                                }
                            } else if (!(result9 instanceof ste.l)) {
                                if (!(result9 instanceof ste.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th10 = ((ste.m) result9).f265567a;
                                RuntimeException runtimeException = new RuntimeException("Google pay top-up error", th10);
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var3);
                                iVar7.R2(th10, dVar7.f115083b);
                            } else if (((ste.l) result9).f265566a) {
                                yki.a aVar6 = iVar7.i0;
                                String str5 = dVar7.f115083b.f306286a;
                                g gVar2 = iVar7.o;
                                oki.h.t2(iVar7, aVar6, new TopupFlowContract$Step.SelectTopupMethod(dVar7, str5, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 10:
                            ste.b result10 = (ste.b) obj4;
                            Intrinsics.checkNotNullParameter(result10, "result");
                            if (result10 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                b bVar2 = iVar4.u;
                                CardDetailsScreenDescriptor$OutputData$CardData cardData = CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result10, ((TopupFlowContract$Step.ExpiredCardDetails) topupFlowContract$Step).f90850a);
                                bVar2.getClass();
                                Intrinsics.checkNotNullParameter(cardData, "cardData");
                                bVar2.f284258a.k(cardData);
                            } else {
                                if (!(result10 instanceof ste.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Result not expected in this flow: " + result10);
                                zhm.h0 h0Var4 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var4);
                            }
                            return Unit.f186387a;
                        case 11:
                            nze.l result11 = (nze.l) obj4;
                            Intrinsics.checkNotNullParameter(result11, "result");
                            boolean z6 = result11 instanceof l.b;
                            iVar4.f90948r.f276169a = z6;
                            if (result11 instanceof l.a) {
                                Unit unit3 = Unit.f186387a;
                            } else if (result11 instanceof nze.m) {
                                iVar4.l1().M0(new aii.i(((nze.m) result11).f221037a, (aii.a) null, 6));
                            } else if (result11 instanceof nze.n) {
                                iVar4.C1(u0.b(((nze.n) result11).f221038a));
                            } else if (result11 instanceof nze.o) {
                                iVar4.C1(u0.b(((nze.o) result11).f221039a));
                            } else {
                                if (!z6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.MandateTopup) topupFlowContract$Step).f90863a.f91003a.f115083b, null, 3), new yi5.b(26));
                                Unit unit4 = Unit.f186387a;
                            }
                            return Unit.f186387a;
                        case 12:
                            o0 result12 = (o0) obj4;
                            Intrinsics.checkNotNullParameter(result12, "result");
                            if (result12 instanceof we6.m0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.b(iVar4, result12, topupFlowContract$Step, null));
                            } else {
                                if (!(result12 instanceof we6.n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.n0) result12).f296657a, null));
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar8 = iVar2;
                            yki.a aVar7 = iVar8.i0;
                            we6.p result13 = (we6.p) obj4;
                            Intrinsics.checkNotNullParameter(result13, "result");
                            if (result13 instanceof we6.q) {
                                iVar8.N2(((we6.q) result13).f296666a);
                            } else if (result13 instanceof p.a) {
                                xi0.b bVar3 = ((TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step).f90844a.f115083b;
                                aVar7.e(true);
                                iVar8.P2(bVar3);
                            } else if (result13 instanceof p.b) {
                                TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step;
                                if (oki.h.E2(aVar7, new uwi.v(26))) {
                                    aVar7.e(false);
                                } else {
                                    String str6 = crossBorderEasyBankTransfer.f90844a.f115083b.f306286a;
                                    g gVar3 = iVar8.o;
                                    oki.h.t2(iVar8, aVar7, new TopupFlowContract$Step.SelectTopupMethod(crossBorderEasyBankTransfer.f90844a, str6, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                                }
                            } else {
                                if (!(result13 instanceof we6.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar8.N2(((we6.o) result13).f296658a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block11, "block");
            cardDetailsScreen.H = block11;
            return cardDetailsScreen;
        }
        int i66 = 7;
        if (step instanceof TopupFlowContract$Step.TopupWithNewCard) {
            TopupWithNewCardFlow topupWithNewCardFlow = new TopupWithNewCardFlow(((TopupFlowContract$Step.TopupWithNewCard) step).f90890a);
            uye.j block12 = new uye.j(iVar2, step, FlowCoordinator, i66);
            Intrinsics.checkNotNullParameter(block12, "block");
            topupWithNewCardFlow.H = block12;
            return topupWithNewCardFlow;
        }
        final int i74 = 1;
        if (step instanceof TopupFlowContract$Step.MoveMoney) {
            ViewController viewControllerE14 = iVar2.e1(new y5i.a(((TopupFlowContract$Step.MoveMoney) step).f90865a, null, 14));
            Function1 block13 = new Function1() { // from class: uye.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i74) {
                        case 0:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar32 = iVar2;
                            yki.a aVar22 = iVar32.i0;
                            com.revolut.feature.topup_screen.api.topup_limits.a aVar32 = iVar32.Y;
                            g gVar2 = iVar32.o;
                            kye.u result = (kye.u) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof kye.o) {
                                kye.o oVar = (kye.o) result;
                                xi0.a aVar42 = xi0.b.Companion;
                                String str5 = oVar.f190802a;
                                aVar42.getClass();
                                iVar32.C1(new AutoTopUpFlowDestination(xi0.a.a(str5), e1f.c.b(gVar2.f284275a), oVar.f190803b));
                            } else if (result instanceof kye.x) {
                                kye.x xVar = (kye.x) result;
                                if (((jte.d) iVar32.f90947q).c(TopupApi$Toggles.AmountCurrencyChooserMigration.f90459c)) {
                                    oki.h.w2(aVar22, new TopupFlowContract$Step.CurrencyPicker(xVar.f190868a, xVar.f190869b), ModalDestination.Style.POPUP.f98311a);
                                } else {
                                    String str22 = xVar.f190868a;
                                    TopUpTarget topUpTarget2 = gVar2.f284275a;
                                    iVar32.C1(u0.c(new BalancePickerFeatureConfig(4, str22, e1f.c.b(topUpTarget2), true, topUpTarget2 instanceof TopUpTarget.RevXFiat ? BalancePickerFeatureConfig.Currencies.TopUpRevXFiat.f99561a : BalancePickerFeatureConfig.Currencies.TopUpAll.f99559a, false, true, true, true, true, null, null, BalancePickerFeatureConfig.ShowBalancesSetting.InItemCurrency.f99564a, false, null, null, null, null, false, e1f.c.a(gVar2.f284275a))));
                                }
                            } else if (result instanceof kye.y) {
                                kye.y yVar = (kye.y) result;
                                oki.h.t2(iVar32, iVar32.i0, new TopupFlowContract$Step.SelectTopupMethod(yVar.f190877b, yVar.f190876a, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            } else if (result instanceof kye.a0) {
                                iVar32.g3(new tw9.h(iVar32, result, null, 22));
                            } else if (result instanceof kye.z) {
                                iVar32.g3(new q(iVar32, result, null, 0));
                            } else if (result instanceof kye.p) {
                                iVar32.g3(new q(iVar32, result, null, 1));
                            } else {
                                boolean z = result instanceof u.b;
                                yki.l lVar = FlowCoordinator;
                                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                if (z) {
                                    oki.h.w2(lVar, TopupFlowContract$Step.JapaneseRestrictionsDialog.f90862a, bottom_dialog);
                                } else if (result instanceof u.a) {
                                    oki.h.w2(lVar, TopupFlowContract$Step.CashDepositWarningDialog.f90840a, bottom_dialog);
                                } else if (result instanceof u.c) {
                                    oki.h.w2(lVar, TopupFlowContract$Step.ZeroFeeWithInfoDialog.f90895a, bottom_dialog);
                                } else if (result instanceof kye.b0) {
                                    kye.b0 b0Var = (kye.b0) result;
                                    oki.h.w2(lVar, new TopupFlowContract$Step.TopUpLimitsDialog(b0Var.f190705a, b0Var.f190706b, b0Var.f190707c), bottom_dialog);
                                } else if (result instanceof kye.f0) {
                                    kye.f0 f0Var = (kye.f0) result;
                                    oki.h.w2(lVar, new TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog(f0Var.f190732a, f0Var.f190733b), bottom_dialog);
                                } else if (result instanceof kye.c0) {
                                    kye.c0 c0Var = (kye.c0) result;
                                    oki.h.w2(lVar, new TopupFlowContract$Step.TopUpLimitsVerificationDialog(c0Var.f190715a, c0Var.f190716b, c0Var.f190717c), bottom_dialog);
                                } else if (result instanceof kye.d0) {
                                    kye.d0 d0Var = (kye.d0) result;
                                    String str32 = d0Var.f190721a;
                                    List<aue.b> list2 = d0Var.f190722b;
                                    aue.d dVar52 = iVar32.X;
                                    ArrayList arrayList22 = new ArrayList(zhm.w.t(list2, 10));
                                    for (aue.b bVar2 : list2) {
                                        dVar52.getClass();
                                        arrayList22.add(aue.d.b(bVar2));
                                    }
                                    oki.h.w2(lVar, new TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog(str32, arrayList22, d0Var.f190723c, d0Var.d), bottom_dialog);
                                } else if (result instanceof kye.t) {
                                    kye.t tVar = (kye.t) result;
                                    iVar32.n2(new sxe.g(iVar32, tVar.f190836b, tVar.f190837c, tVar.f190835a, (Continuation) null, 14), new whi.b(6));
                                } else if (result instanceof kye.s) {
                                    kye.s sVar = (kye.s) result;
                                    oki.h.w2(lVar, new TopupFlowContract$Step.CardVerificationRequiredDialog(sVar.f190824a, sVar.f190825b, sVar.f190826c), bottom_dialog);
                                } else if (result instanceof kye.v) {
                                    yji.l.j2(iVar32, new TopUpFeesBottomSheetScreen(((kye.v) result).f190853a), bottom_dialog, null, 2);
                                } else if (result instanceof kye.q) {
                                    oki.h.w2(aVar22, new TopupFlowContract$Step.BeDrivenFeesBottomSheet(((kye.q) result).f190816a), bottom_dialog);
                                } else if (result instanceof kye.e0) {
                                    aue.k kVar = ((kye.e0) result).f190730a;
                                    aVar32.getClass();
                                    oki.h.w2(lVar, new TopupFlowContract$Step.UaeCountryLimitsDialog(com.revolut.feature.topup_screen.api.topup_limits.a.a(kVar)), bottom_dialog);
                                } else if (result instanceof kye.r) {
                                    List<aue.l> list22 = ((kye.r) result).f190819a;
                                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list22, 10));
                                    for (aue.l lVar2 : list22) {
                                        aVar32.getClass();
                                        arrayList3.add(com.revolut.feature.topup_screen.api.topup_limits.a.a(lVar2));
                                    }
                                    oki.h.w2(lVar, new TopupFlowContract$Step.BrazilCountryLimitDialog(arrayList3), bottom_dialog);
                                } else {
                                    if (!(result instanceof kye.w)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    kye.w wVar = (kye.w) result;
                                    List<aue.l> list3 = wVar.f190861a;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                                    for (aue.l lVar3 : list3) {
                                        aVar32.getClass();
                                        arrayList4.add(com.revolut.feature.topup_screen.api.topup_limits.a.a(lVar3));
                                    }
                                    oki.h.w2(lVar, new TopupFlowContract$Step.NzAkahuLimitDialog(wVar.f190862b, arrayList4), bottom_dialog);
                                }
                            }
                            return Unit.f186387a;
                        case 1:
                            y5i.b flowResult = (y5i.b) obj4;
                            Intrinsics.checkNotNullParameter(flowResult, "flowResult");
                            boolean z3 = flowResult instanceof b.a;
                            iVar2.f90948r.f276169a = z3;
                            if (!z3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.D2(FlowCoordinator);
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.a result2 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.a) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 instanceof a.C0561a) {
                                oki.h.D2(FlowCoordinator);
                            } else {
                                if (!(result2 instanceof lze.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar2.l1().M0(new aii.i(((lze.c) result2).f200968a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block13, "block");
            viewControllerE14.H = block13;
            return viewControllerE14;
        }
        if (step instanceof TopupFlowContract$Step.IdealTopUp) {
            IdealTopUpFlow idealTopUpFlow = new IdealTopUpFlow(((TopupFlowContract$Step.IdealTopUp) step).f90852a);
            Function1 block14 = new Function1() { // from class: uye.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i6) {
                        case 0:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar32 = iVar2;
                            yki.a aVar22 = iVar32.i0;
                            com.revolut.feature.topup_screen.api.topup_limits.a aVar32 = iVar32.Y;
                            g gVar2 = iVar32.o;
                            kye.u result = (kye.u) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof kye.o) {
                                kye.o oVar = (kye.o) result;
                                xi0.a aVar42 = xi0.b.Companion;
                                String str5 = oVar.f190802a;
                                aVar42.getClass();
                                iVar32.C1(new AutoTopUpFlowDestination(xi0.a.a(str5), e1f.c.b(gVar2.f284275a), oVar.f190803b));
                            } else if (result instanceof kye.x) {
                                kye.x xVar = (kye.x) result;
                                if (((jte.d) iVar32.f90947q).c(TopupApi$Toggles.AmountCurrencyChooserMigration.f90459c)) {
                                    oki.h.w2(aVar22, new TopupFlowContract$Step.CurrencyPicker(xVar.f190868a, xVar.f190869b), ModalDestination.Style.POPUP.f98311a);
                                } else {
                                    String str22 = xVar.f190868a;
                                    TopUpTarget topUpTarget2 = gVar2.f284275a;
                                    iVar32.C1(u0.c(new BalancePickerFeatureConfig(4, str22, e1f.c.b(topUpTarget2), true, topUpTarget2 instanceof TopUpTarget.RevXFiat ? BalancePickerFeatureConfig.Currencies.TopUpRevXFiat.f99561a : BalancePickerFeatureConfig.Currencies.TopUpAll.f99559a, false, true, true, true, true, null, null, BalancePickerFeatureConfig.ShowBalancesSetting.InItemCurrency.f99564a, false, null, null, null, null, false, e1f.c.a(gVar2.f284275a))));
                                }
                            } else if (result instanceof kye.y) {
                                kye.y yVar = (kye.y) result;
                                oki.h.t2(iVar32, iVar32.i0, new TopupFlowContract$Step.SelectTopupMethod(yVar.f190877b, yVar.f190876a, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            } else if (result instanceof kye.a0) {
                                iVar32.g3(new tw9.h(iVar32, result, null, 22));
                            } else if (result instanceof kye.z) {
                                iVar32.g3(new q(iVar32, result, null, 0));
                            } else if (result instanceof kye.p) {
                                iVar32.g3(new q(iVar32, result, null, 1));
                            } else {
                                boolean z = result instanceof u.b;
                                yki.l lVar = FlowCoordinator;
                                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                if (z) {
                                    oki.h.w2(lVar, TopupFlowContract$Step.JapaneseRestrictionsDialog.f90862a, bottom_dialog);
                                } else if (result instanceof u.a) {
                                    oki.h.w2(lVar, TopupFlowContract$Step.CashDepositWarningDialog.f90840a, bottom_dialog);
                                } else if (result instanceof u.c) {
                                    oki.h.w2(lVar, TopupFlowContract$Step.ZeroFeeWithInfoDialog.f90895a, bottom_dialog);
                                } else if (result instanceof kye.b0) {
                                    kye.b0 b0Var = (kye.b0) result;
                                    oki.h.w2(lVar, new TopupFlowContract$Step.TopUpLimitsDialog(b0Var.f190705a, b0Var.f190706b, b0Var.f190707c), bottom_dialog);
                                } else if (result instanceof kye.f0) {
                                    kye.f0 f0Var = (kye.f0) result;
                                    oki.h.w2(lVar, new TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog(f0Var.f190732a, f0Var.f190733b), bottom_dialog);
                                } else if (result instanceof kye.c0) {
                                    kye.c0 c0Var = (kye.c0) result;
                                    oki.h.w2(lVar, new TopupFlowContract$Step.TopUpLimitsVerificationDialog(c0Var.f190715a, c0Var.f190716b, c0Var.f190717c), bottom_dialog);
                                } else if (result instanceof kye.d0) {
                                    kye.d0 d0Var = (kye.d0) result;
                                    String str32 = d0Var.f190721a;
                                    List<aue.b> list2 = d0Var.f190722b;
                                    aue.d dVar52 = iVar32.X;
                                    ArrayList arrayList22 = new ArrayList(zhm.w.t(list2, 10));
                                    for (aue.b bVar2 : list2) {
                                        dVar52.getClass();
                                        arrayList22.add(aue.d.b(bVar2));
                                    }
                                    oki.h.w2(lVar, new TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog(str32, arrayList22, d0Var.f190723c, d0Var.d), bottom_dialog);
                                } else if (result instanceof kye.t) {
                                    kye.t tVar = (kye.t) result;
                                    iVar32.n2(new sxe.g(iVar32, tVar.f190836b, tVar.f190837c, tVar.f190835a, (Continuation) null, 14), new whi.b(6));
                                } else if (result instanceof kye.s) {
                                    kye.s sVar = (kye.s) result;
                                    oki.h.w2(lVar, new TopupFlowContract$Step.CardVerificationRequiredDialog(sVar.f190824a, sVar.f190825b, sVar.f190826c), bottom_dialog);
                                } else if (result instanceof kye.v) {
                                    yji.l.j2(iVar32, new TopUpFeesBottomSheetScreen(((kye.v) result).f190853a), bottom_dialog, null, 2);
                                } else if (result instanceof kye.q) {
                                    oki.h.w2(aVar22, new TopupFlowContract$Step.BeDrivenFeesBottomSheet(((kye.q) result).f190816a), bottom_dialog);
                                } else if (result instanceof kye.e0) {
                                    aue.k kVar = ((kye.e0) result).f190730a;
                                    aVar32.getClass();
                                    oki.h.w2(lVar, new TopupFlowContract$Step.UaeCountryLimitsDialog(com.revolut.feature.topup_screen.api.topup_limits.a.a(kVar)), bottom_dialog);
                                } else if (result instanceof kye.r) {
                                    List<aue.l> list22 = ((kye.r) result).f190819a;
                                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list22, 10));
                                    for (aue.l lVar2 : list22) {
                                        aVar32.getClass();
                                        arrayList3.add(com.revolut.feature.topup_screen.api.topup_limits.a.a(lVar2));
                                    }
                                    oki.h.w2(lVar, new TopupFlowContract$Step.BrazilCountryLimitDialog(arrayList3), bottom_dialog);
                                } else {
                                    if (!(result instanceof kye.w)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    kye.w wVar = (kye.w) result;
                                    List<aue.l> list3 = wVar.f190861a;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                                    for (aue.l lVar3 : list3) {
                                        aVar32.getClass();
                                        arrayList4.add(com.revolut.feature.topup_screen.api.topup_limits.a.a(lVar3));
                                    }
                                    oki.h.w2(lVar, new TopupFlowContract$Step.NzAkahuLimitDialog(wVar.f190862b, arrayList4), bottom_dialog);
                                }
                            }
                            return Unit.f186387a;
                        case 1:
                            y5i.b flowResult = (y5i.b) obj4;
                            Intrinsics.checkNotNullParameter(flowResult, "flowResult");
                            boolean z3 = flowResult instanceof b.a;
                            iVar2.f90948r.f276169a = z3;
                            if (!z3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.D2(FlowCoordinator);
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.a result2 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.a) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 instanceof a.C0561a) {
                                oki.h.D2(FlowCoordinator);
                            } else {
                                if (!(result2 instanceof lze.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar2.l1().M0(new aii.i(((lze.c) result2).f200968a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block14, "block");
            idealTopUpFlow.H = block14;
            return idealTopUpFlow;
        }
        if (step instanceof TopupFlowContract$Step.PreselectedInstitutionEasyBankTransfer) {
            TopupFlowContract$Step.PreselectedInstitutionEasyBankTransfer preselectedInstitutionEasyBankTransfer = (TopupFlowContract$Step.PreselectedInstitutionEasyBankTransfer) step;
            ViewController viewControllerE15 = iVar2.e1(new we6.w(preselectedInstitutionEasyBankTransfer.f90873a, preselectedInstitutionEasyBankTransfer.f90874b, preselectedInstitutionEasyBankTransfer.f90875c));
            uye.i block15 = new uye.i(iVar2, step);
            Intrinsics.checkNotNullParameter(block15, "block");
            viewControllerE15.H = block15;
            return viewControllerE15;
        }
        final int i92 = 12;
        if (step instanceof TopupFlowContract$Step.JapanEasyBankTransfer) {
            ViewController viewControllerE16 = iVar2.e1(new com.revolut.feature.external_accounts.api.navigation.b(((TopupFlowContract$Step.JapanEasyBankTransfer) step).f90861c));
            Function1 block16 = new Function1() { // from class: uye.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    rye.c cVar;
                    int i322 = i92;
                    y0 y0VarA = null;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = iVar2;
                    TopupFlowContract$Step topupFlowContract$Step = step;
                    switch (i322) {
                        case 0:
                            yye.c result = (yye.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof yye.a) {
                                TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) topupFlowContract$Step;
                                iVar4.V2(unverifiedCardTopUpDelayDialog.f90893a, unverifiedCardTopUpDelayDialog.f90894b);
                            } else if (!(result instanceof yye.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            ste.u result2 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof ste.s)) {
                                if (!(result2 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsDialog) topupFlowContract$Step).f90883c);
                            } else if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 2:
                            ste.u result3 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof ste.s)) {
                                if (!(result3 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsVerificationDialog) topupFlowContract$Step).f90886c);
                            } else if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 3:
                            ste.u result4 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z = result4 instanceof ste.s;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = iVar2;
                            if (!z) {
                                if (!(result4 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) topupFlowContract$Step;
                                iVar5.n2(new sxe.g(iVar5, topUpMultiLimitsVerificationDialog.f90889c, topUpMultiLimitsVerificationDialog.d, topUpMultiLimitsVerificationDialog.f90887a, (Continuation) null, 14), new whi.b(6));
                            } else if (Intrinsics.f(((ste.s) result4).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar5.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 4:
                            we6.k0 result5 = (we6.k0) obj4;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (result5 instanceof we6.i0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.c(iVar4, result5, topupFlowContract$Step, null));
                            } else {
                                if (!(result5 instanceof we6.j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.j0) result5).f296649a, null));
                            }
                            return Unit.f186387a;
                        case 5:
                            dii.g result6 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z3 = result6 instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = iVar2;
                            if (z3) {
                                TopupFlowContract$Step.CardVerificationRequiredDialog cardVerificationRequiredDialog = (TopupFlowContract$Step.CardVerificationRequiredDialog) topupFlowContract$Step;
                                iVar6.n2(new sxe.g(iVar6, cardVerificationRequiredDialog.f90834b, cardVerificationRequiredDialog.f90835c, cardVerificationRequiredDialog.f90833a, (Continuation) null, 14), new whi.b(6));
                            } else if ((result6 instanceof dii.c) && Intrinsics.f(((dii.c) result6).f115066a.f275445a, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar6.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 6:
                            til.r output = (til.r) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof til.q) {
                                iVar4.n2(new s(iVar4, topupFlowContract$Step, null, 0), new whi.b(6));
                            } else if (!(output instanceof til.n) && !(output instanceof til.o) && !(output instanceof til.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 7:
                            ExchangeGlobalAccessOutput result7 = (ExchangeGlobalAccessOutput) obj4;
                            Intrinsics.checkNotNullParameter(result7, "result");
                            if (result7 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                                iVar4.l2(new s(iVar4, topupFlowContract$Step, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 8:
                            c1f.c cVar2 = iVar4.K;
                            rze.i result8 = (rze.i) obj4;
                            Intrinsics.checkNotNullParameter(result8, "result");
                            if (!(result8 instanceof rze.e)) {
                                if (result8 instanceof rze.f) {
                                    iVar4.C1(((rze.f) result8).f258597a);
                                } else if (result8 instanceof rze.g) {
                                    iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.StoredMethodTopUp) topupFlowContract$Step).f90879a.f91020c.f115083b, null, 3), new yi5.b(26));
                                    Unit unit = Unit.f186387a;
                                } else if (result8 instanceof rze.d) {
                                    iVar4.X1(cVar2.a(((rze.d) result8).f258595a));
                                } else if (result8 instanceof rze.h) {
                                    rye.e eVar = iVar4.M;
                                    Throwable throwable = ((rze.h) result8).f258599a;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                                    HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                                    if (httpException != null) {
                                        r1 r1VarM = i26.l.m(httpException);
                                        String strString = r1VarM != null ? r1VarM.string() : null;
                                        if (strString != null) {
                                            try {
                                                cVar = (rye.c) eVar.f258366a.b(strString, rye.c.class);
                                            } catch (Exception e) {
                                                zhm.h0 h0Var = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                                cVar = null;
                                            }
                                            if (cVar == null && httpException.code() == 4042) {
                                                IllegalArgumentException illegalArgumentException2222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var22222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList22222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2222, h0Var22222);
                                            }
                                        } else {
                                            cVar = null;
                                            if (cVar == null) {
                                                IllegalArgumentException illegalArgumentException22222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException22222, h0Var222222);
                                            }
                                        }
                                    } else {
                                        cVar = null;
                                    }
                                    if (cVar != null && cVar.f258363a == 4042) {
                                        dj0.d dVarO = mo3.a.o(cVar.f258365c);
                                        y0VarA = new y0(null, new nii.z(new TextLocalisedClause(R$string.wallet_limit_exceeded_error_title, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wallet_limit_exceeded_error_description, zhm.u.c(new MoneyClause(pyd.c.H(dVarO, mo3.a.o(cVar.f258364b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                                    }
                                    if (y0VarA == null) {
                                        y0VarA = cVar2.a(throwable);
                                    }
                                    iVar4.X1(y0VarA);
                                } else {
                                    if (!Intrinsics.f(result8, rze.c.f258594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Unit unit2 = Unit.f186387a;
                                }
                                break;
                            } else {
                                iVar4.l1().M0(new aii.i(((rze.e) result8).f258596a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                        case 9:
                            ste.o result9 = (ste.o) obj4;
                            Intrinsics.checkNotNullParameter(result9, "result");
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar7 = iVar2;
                            boolean z4 = result9 instanceof ste.n;
                            iVar7.f90948r.f276169a = z4;
                            dj0.d dVar7 = ((TopupFlowContract$Step.GooglePayTopup) topupFlowContract$Step).f90851a.f90496a;
                            if (z4) {
                                GooglePayFee googlePayFee = ((ste.n) result9).f265568a;
                                if (googlePayFee instanceof GooglePayFee.FeeRequired) {
                                    yji.l.b1(iVar7, iVar7.X1(((c1f.a) iVar7.J).c(dVar7, ((GooglePayFee.FeeRequired) googlePayFee).f90520b)), null, new u(iVar7, dVar7, null), 3);
                                } else {
                                    iVar7.l2(new dp4.y0(iVar7, dVar7, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                                }
                            } else if (!(result9 instanceof ste.l)) {
                                if (!(result9 instanceof ste.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th10 = ((ste.m) result9).f265567a;
                                RuntimeException runtimeException = new RuntimeException("Google pay top-up error", th10);
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var3);
                                iVar7.R2(th10, dVar7.f115083b);
                            } else if (((ste.l) result9).f265566a) {
                                yki.a aVar6 = iVar7.i0;
                                String str5 = dVar7.f115083b.f306286a;
                                g gVar2 = iVar7.o;
                                oki.h.t2(iVar7, aVar6, new TopupFlowContract$Step.SelectTopupMethod(dVar7, str5, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 10:
                            ste.b result10 = (ste.b) obj4;
                            Intrinsics.checkNotNullParameter(result10, "result");
                            if (result10 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                b bVar2 = iVar4.u;
                                CardDetailsScreenDescriptor$OutputData$CardData cardData = CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result10, ((TopupFlowContract$Step.ExpiredCardDetails) topupFlowContract$Step).f90850a);
                                bVar2.getClass();
                                Intrinsics.checkNotNullParameter(cardData, "cardData");
                                bVar2.f284258a.k(cardData);
                            } else {
                                if (!(result10 instanceof ste.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Result not expected in this flow: " + result10);
                                zhm.h0 h0Var4 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var4);
                            }
                            return Unit.f186387a;
                        case 11:
                            nze.l result11 = (nze.l) obj4;
                            Intrinsics.checkNotNullParameter(result11, "result");
                            boolean z6 = result11 instanceof l.b;
                            iVar4.f90948r.f276169a = z6;
                            if (result11 instanceof l.a) {
                                Unit unit3 = Unit.f186387a;
                            } else if (result11 instanceof nze.m) {
                                iVar4.l1().M0(new aii.i(((nze.m) result11).f221037a, (aii.a) null, 6));
                            } else if (result11 instanceof nze.n) {
                                iVar4.C1(u0.b(((nze.n) result11).f221038a));
                            } else if (result11 instanceof nze.o) {
                                iVar4.C1(u0.b(((nze.o) result11).f221039a));
                            } else {
                                if (!z6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.MandateTopup) topupFlowContract$Step).f90863a.f91003a.f115083b, null, 3), new yi5.b(26));
                                Unit unit4 = Unit.f186387a;
                            }
                            return Unit.f186387a;
                        case 12:
                            o0 result12 = (o0) obj4;
                            Intrinsics.checkNotNullParameter(result12, "result");
                            if (result12 instanceof we6.m0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.b(iVar4, result12, topupFlowContract$Step, null));
                            } else {
                                if (!(result12 instanceof we6.n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.n0) result12).f296657a, null));
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar8 = iVar2;
                            yki.a aVar7 = iVar8.i0;
                            we6.p result13 = (we6.p) obj4;
                            Intrinsics.checkNotNullParameter(result13, "result");
                            if (result13 instanceof we6.q) {
                                iVar8.N2(((we6.q) result13).f296666a);
                            } else if (result13 instanceof p.a) {
                                xi0.b bVar3 = ((TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step).f90844a.f115083b;
                                aVar7.e(true);
                                iVar8.P2(bVar3);
                            } else if (result13 instanceof p.b) {
                                TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step;
                                if (oki.h.E2(aVar7, new uwi.v(26))) {
                                    aVar7.e(false);
                                } else {
                                    String str6 = crossBorderEasyBankTransfer.f90844a.f115083b.f306286a;
                                    g gVar3 = iVar8.o;
                                    oki.h.t2(iVar8, aVar7, new TopupFlowContract$Step.SelectTopupMethod(crossBorderEasyBankTransfer.f90844a, str6, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                                }
                            } else {
                                if (!(result13 instanceof we6.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar8.N2(((we6.o) result13).f296658a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block16, "block");
            viewControllerE16.H = block16;
            return viewControllerE16;
        }
        if (step instanceof TopupFlowContract$Step.CrossBorderEasyBankTransfer) {
            TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) step;
            ViewController viewControllerE17 = iVar2.e1(new we6.r(crossBorderEasyBankTransfer.f90844a, e1f.c.d(gVar.f284275a), crossBorderEasyBankTransfer.f90845b));
            final int i96 = 13;
            Function1 block17 = new Function1() { // from class: uye.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    rye.c cVar;
                    int i322 = i96;
                    y0 y0VarA = null;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = iVar2;
                    TopupFlowContract$Step topupFlowContract$Step = step;
                    switch (i322) {
                        case 0:
                            yye.c result = (yye.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof yye.a) {
                                TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) topupFlowContract$Step;
                                iVar4.V2(unverifiedCardTopUpDelayDialog.f90893a, unverifiedCardTopUpDelayDialog.f90894b);
                            } else if (!(result instanceof yye.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            ste.u result2 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof ste.s)) {
                                if (!(result2 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsDialog) topupFlowContract$Step).f90883c);
                            } else if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 2:
                            ste.u result3 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof ste.s)) {
                                if (!(result3 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsVerificationDialog) topupFlowContract$Step).f90886c);
                            } else if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 3:
                            ste.u result4 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z = result4 instanceof ste.s;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = iVar2;
                            if (!z) {
                                if (!(result4 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) topupFlowContract$Step;
                                iVar5.n2(new sxe.g(iVar5, topUpMultiLimitsVerificationDialog.f90889c, topUpMultiLimitsVerificationDialog.d, topUpMultiLimitsVerificationDialog.f90887a, (Continuation) null, 14), new whi.b(6));
                            } else if (Intrinsics.f(((ste.s) result4).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar5.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 4:
                            we6.k0 result5 = (we6.k0) obj4;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (result5 instanceof we6.i0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.c(iVar4, result5, topupFlowContract$Step, null));
                            } else {
                                if (!(result5 instanceof we6.j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.j0) result5).f296649a, null));
                            }
                            return Unit.f186387a;
                        case 5:
                            dii.g result6 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z3 = result6 instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = iVar2;
                            if (z3) {
                                TopupFlowContract$Step.CardVerificationRequiredDialog cardVerificationRequiredDialog = (TopupFlowContract$Step.CardVerificationRequiredDialog) topupFlowContract$Step;
                                iVar6.n2(new sxe.g(iVar6, cardVerificationRequiredDialog.f90834b, cardVerificationRequiredDialog.f90835c, cardVerificationRequiredDialog.f90833a, (Continuation) null, 14), new whi.b(6));
                            } else if ((result6 instanceof dii.c) && Intrinsics.f(((dii.c) result6).f115066a.f275445a, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar6.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 6:
                            til.r output = (til.r) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof til.q) {
                                iVar4.n2(new s(iVar4, topupFlowContract$Step, null, 0), new whi.b(6));
                            } else if (!(output instanceof til.n) && !(output instanceof til.o) && !(output instanceof til.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 7:
                            ExchangeGlobalAccessOutput result7 = (ExchangeGlobalAccessOutput) obj4;
                            Intrinsics.checkNotNullParameter(result7, "result");
                            if (result7 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                                iVar4.l2(new s(iVar4, topupFlowContract$Step, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 8:
                            c1f.c cVar2 = iVar4.K;
                            rze.i result8 = (rze.i) obj4;
                            Intrinsics.checkNotNullParameter(result8, "result");
                            if (!(result8 instanceof rze.e)) {
                                if (result8 instanceof rze.f) {
                                    iVar4.C1(((rze.f) result8).f258597a);
                                } else if (result8 instanceof rze.g) {
                                    iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.StoredMethodTopUp) topupFlowContract$Step).f90879a.f91020c.f115083b, null, 3), new yi5.b(26));
                                    Unit unit = Unit.f186387a;
                                } else if (result8 instanceof rze.d) {
                                    iVar4.X1(cVar2.a(((rze.d) result8).f258595a));
                                } else if (result8 instanceof rze.h) {
                                    rye.e eVar = iVar4.M;
                                    Throwable throwable = ((rze.h) result8).f258599a;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                                    HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                                    if (httpException != null) {
                                        r1 r1VarM = i26.l.m(httpException);
                                        String strString = r1VarM != null ? r1VarM.string() : null;
                                        if (strString != null) {
                                            try {
                                                cVar = (rye.c) eVar.f258366a.b(strString, rye.c.class);
                                            } catch (Exception e) {
                                                zhm.h0 h0Var = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                                cVar = null;
                                            }
                                            if (cVar == null && httpException.code() == 4042) {
                                                IllegalArgumentException illegalArgumentException22222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException22222, h0Var222222);
                                            }
                                        } else {
                                            cVar = null;
                                            if (cVar == null) {
                                                IllegalArgumentException illegalArgumentException222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var2222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList2222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException222222, h0Var2222222);
                                            }
                                        }
                                    } else {
                                        cVar = null;
                                    }
                                    if (cVar != null && cVar.f258363a == 4042) {
                                        dj0.d dVarO = mo3.a.o(cVar.f258365c);
                                        y0VarA = new y0(null, new nii.z(new TextLocalisedClause(R$string.wallet_limit_exceeded_error_title, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wallet_limit_exceeded_error_description, zhm.u.c(new MoneyClause(pyd.c.H(dVarO, mo3.a.o(cVar.f258364b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                                    }
                                    if (y0VarA == null) {
                                        y0VarA = cVar2.a(throwable);
                                    }
                                    iVar4.X1(y0VarA);
                                } else {
                                    if (!Intrinsics.f(result8, rze.c.f258594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Unit unit2 = Unit.f186387a;
                                }
                                break;
                            } else {
                                iVar4.l1().M0(new aii.i(((rze.e) result8).f258596a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                        case 9:
                            ste.o result9 = (ste.o) obj4;
                            Intrinsics.checkNotNullParameter(result9, "result");
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar7 = iVar2;
                            boolean z4 = result9 instanceof ste.n;
                            iVar7.f90948r.f276169a = z4;
                            dj0.d dVar7 = ((TopupFlowContract$Step.GooglePayTopup) topupFlowContract$Step).f90851a.f90496a;
                            if (z4) {
                                GooglePayFee googlePayFee = ((ste.n) result9).f265568a;
                                if (googlePayFee instanceof GooglePayFee.FeeRequired) {
                                    yji.l.b1(iVar7, iVar7.X1(((c1f.a) iVar7.J).c(dVar7, ((GooglePayFee.FeeRequired) googlePayFee).f90520b)), null, new u(iVar7, dVar7, null), 3);
                                } else {
                                    iVar7.l2(new dp4.y0(iVar7, dVar7, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                                }
                            } else if (!(result9 instanceof ste.l)) {
                                if (!(result9 instanceof ste.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th10 = ((ste.m) result9).f265567a;
                                RuntimeException runtimeException = new RuntimeException("Google pay top-up error", th10);
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var3);
                                iVar7.R2(th10, dVar7.f115083b);
                            } else if (((ste.l) result9).f265566a) {
                                yki.a aVar6 = iVar7.i0;
                                String str5 = dVar7.f115083b.f306286a;
                                g gVar2 = iVar7.o;
                                oki.h.t2(iVar7, aVar6, new TopupFlowContract$Step.SelectTopupMethod(dVar7, str5, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 10:
                            ste.b result10 = (ste.b) obj4;
                            Intrinsics.checkNotNullParameter(result10, "result");
                            if (result10 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                b bVar2 = iVar4.u;
                                CardDetailsScreenDescriptor$OutputData$CardData cardData = CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result10, ((TopupFlowContract$Step.ExpiredCardDetails) topupFlowContract$Step).f90850a);
                                bVar2.getClass();
                                Intrinsics.checkNotNullParameter(cardData, "cardData");
                                bVar2.f284258a.k(cardData);
                            } else {
                                if (!(result10 instanceof ste.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Result not expected in this flow: " + result10);
                                zhm.h0 h0Var4 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var4);
                            }
                            return Unit.f186387a;
                        case 11:
                            nze.l result11 = (nze.l) obj4;
                            Intrinsics.checkNotNullParameter(result11, "result");
                            boolean z6 = result11 instanceof l.b;
                            iVar4.f90948r.f276169a = z6;
                            if (result11 instanceof l.a) {
                                Unit unit3 = Unit.f186387a;
                            } else if (result11 instanceof nze.m) {
                                iVar4.l1().M0(new aii.i(((nze.m) result11).f221037a, (aii.a) null, 6));
                            } else if (result11 instanceof nze.n) {
                                iVar4.C1(u0.b(((nze.n) result11).f221038a));
                            } else if (result11 instanceof nze.o) {
                                iVar4.C1(u0.b(((nze.o) result11).f221039a));
                            } else {
                                if (!z6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.MandateTopup) topupFlowContract$Step).f90863a.f91003a.f115083b, null, 3), new yi5.b(26));
                                Unit unit4 = Unit.f186387a;
                            }
                            return Unit.f186387a;
                        case 12:
                            o0 result12 = (o0) obj4;
                            Intrinsics.checkNotNullParameter(result12, "result");
                            if (result12 instanceof we6.m0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.b(iVar4, result12, topupFlowContract$Step, null));
                            } else {
                                if (!(result12 instanceof we6.n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.n0) result12).f296657a, null));
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar8 = iVar2;
                            yki.a aVar7 = iVar8.i0;
                            we6.p result13 = (we6.p) obj4;
                            Intrinsics.checkNotNullParameter(result13, "result");
                            if (result13 instanceof we6.q) {
                                iVar8.N2(((we6.q) result13).f296666a);
                            } else if (result13 instanceof p.a) {
                                xi0.b bVar3 = ((TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step).f90844a.f115083b;
                                aVar7.e(true);
                                iVar8.P2(bVar3);
                            } else if (result13 instanceof p.b) {
                                TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer2 = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step;
                                if (oki.h.E2(aVar7, new uwi.v(26))) {
                                    aVar7.e(false);
                                } else {
                                    String str6 = crossBorderEasyBankTransfer2.f90844a.f115083b.f306286a;
                                    g gVar3 = iVar8.o;
                                    oki.h.t2(iVar8, aVar7, new TopupFlowContract$Step.SelectTopupMethod(crossBorderEasyBankTransfer2.f90844a, str6, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                                }
                            } else {
                                if (!(result13 instanceof we6.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar8.N2(((we6.o) result13).f296658a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block17, "block");
            viewControllerE17.H = block17;
            return viewControllerE17;
        }
        if (step instanceof TopupFlowContract$Step.JapaneseRestrictionsDialog) {
            iVar2.O.getClass();
            lw0.a aVar6 = new lw0.a(new TextLocalisedClause(R$string.topup_card_restrictions_prompt_title, null, null, 14), new TextLocalisedClause(R$string.topup_card_restrictions_prompt_subtitle, null, null, 14), null, null, false, 28);
            aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
            k9 k9Var = k9.Topup;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar6, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            actionsBottomSheetController.k2(new Function0() { // from class: uye.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            iVar2.N.a(a4.f190702a);
                            break;
                        case 1:
                            iVar2.N.a(c4.f190720a);
                            break;
                        case 2:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 3:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 4:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 5:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 6:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 7:
                            iVar2.N.a(b4.f190713a);
                            break;
                        default:
                            iVar2.N.a(y3.f190882a);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            return actionsBottomSheetController;
        }
        if (step instanceof TopupFlowContract$Step.CashDepositWarningDialog) {
            iVar2.Q.getClass();
            lw0.a aVar7 = new lw0.a(new TextLocalisedClause(R$string.topup_cash_deposit_warning_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.topup_cash_deposit_warning_bottom_sheet_description, null, null, 14), null, null, false, 28);
            aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.topup_cash_deposit_warning_bottom_sheet_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.common_action_learn_more, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
            k9 k9Var2 = k9.Topup;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar7, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
            uye.i block18 = new uye.i(iVar2, i3);
            Intrinsics.checkNotNullParameter(block18, "block");
            actionsBottomSheetController2.H = block18;
            return actionsBottomSheetController2;
        }
        if (step instanceof TopupFlowContract$Step.ZeroFeeWithInfoDialog) {
            iVar2.R.getClass();
            lw0.a aVar8 = new lw0.a(new TextLocalisedClause(R$string.topup_card_topup_fee_prompt_no_fee_title, null, null, 14), new TextLocalisedClause(R$string.topup_card_topup_fee_prompt_no_fee_subtitle, null, null, 14), null, null, false, 28);
            aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
            k9 k9Var3 = k9.Topup;
            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar8, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
            actionsBottomSheetController3.k2(new Function0() { // from class: uye.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i74) {
                        case 0:
                            iVar2.N.a(a4.f190702a);
                            break;
                        case 1:
                            iVar2.N.a(c4.f190720a);
                            break;
                        case 2:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 3:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 4:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 5:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 6:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 7:
                            iVar2.N.a(b4.f190713a);
                            break;
                        default:
                            iVar2.N.a(y3.f190882a);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            return actionsBottomSheetController3;
        }
        if (step instanceof TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) {
            UnverifiedCardTopUpDelayBottomSheetController unverifiedCardTopUpDelayBottomSheetController = new UnverifiedCardTopUpDelayBottomSheetController();
            Function1 block19 = new Function1() { // from class: uye.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    rye.c cVar;
                    int i322 = i3;
                    y0 y0VarA = null;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = iVar2;
                    TopupFlowContract$Step topupFlowContract$Step = step;
                    switch (i322) {
                        case 0:
                            yye.c result = (yye.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof yye.a) {
                                TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) topupFlowContract$Step;
                                iVar4.V2(unverifiedCardTopUpDelayDialog.f90893a, unverifiedCardTopUpDelayDialog.f90894b);
                            } else if (!(result instanceof yye.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            ste.u result2 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof ste.s)) {
                                if (!(result2 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsDialog) topupFlowContract$Step).f90883c);
                            } else if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 2:
                            ste.u result3 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof ste.s)) {
                                if (!(result3 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsVerificationDialog) topupFlowContract$Step).f90886c);
                            } else if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 3:
                            ste.u result4 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z = result4 instanceof ste.s;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = iVar2;
                            if (!z) {
                                if (!(result4 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) topupFlowContract$Step;
                                iVar5.n2(new sxe.g(iVar5, topUpMultiLimitsVerificationDialog.f90889c, topUpMultiLimitsVerificationDialog.d, topUpMultiLimitsVerificationDialog.f90887a, (Continuation) null, 14), new whi.b(6));
                            } else if (Intrinsics.f(((ste.s) result4).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar5.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 4:
                            we6.k0 result5 = (we6.k0) obj4;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (result5 instanceof we6.i0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.c(iVar4, result5, topupFlowContract$Step, null));
                            } else {
                                if (!(result5 instanceof we6.j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.j0) result5).f296649a, null));
                            }
                            return Unit.f186387a;
                        case 5:
                            dii.g result6 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z3 = result6 instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = iVar2;
                            if (z3) {
                                TopupFlowContract$Step.CardVerificationRequiredDialog cardVerificationRequiredDialog = (TopupFlowContract$Step.CardVerificationRequiredDialog) topupFlowContract$Step;
                                iVar6.n2(new sxe.g(iVar6, cardVerificationRequiredDialog.f90834b, cardVerificationRequiredDialog.f90835c, cardVerificationRequiredDialog.f90833a, (Continuation) null, 14), new whi.b(6));
                            } else if ((result6 instanceof dii.c) && Intrinsics.f(((dii.c) result6).f115066a.f275445a, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar6.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 6:
                            til.r output = (til.r) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof til.q) {
                                iVar4.n2(new s(iVar4, topupFlowContract$Step, null, 0), new whi.b(6));
                            } else if (!(output instanceof til.n) && !(output instanceof til.o) && !(output instanceof til.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 7:
                            ExchangeGlobalAccessOutput result7 = (ExchangeGlobalAccessOutput) obj4;
                            Intrinsics.checkNotNullParameter(result7, "result");
                            if (result7 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                                iVar4.l2(new s(iVar4, topupFlowContract$Step, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 8:
                            c1f.c cVar2 = iVar4.K;
                            rze.i result8 = (rze.i) obj4;
                            Intrinsics.checkNotNullParameter(result8, "result");
                            if (!(result8 instanceof rze.e)) {
                                if (result8 instanceof rze.f) {
                                    iVar4.C1(((rze.f) result8).f258597a);
                                } else if (result8 instanceof rze.g) {
                                    iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.StoredMethodTopUp) topupFlowContract$Step).f90879a.f91020c.f115083b, null, 3), new yi5.b(26));
                                    Unit unit = Unit.f186387a;
                                } else if (result8 instanceof rze.d) {
                                    iVar4.X1(cVar2.a(((rze.d) result8).f258595a));
                                } else if (result8 instanceof rze.h) {
                                    rye.e eVar3 = iVar4.M;
                                    Throwable throwable = ((rze.h) result8).f258599a;
                                    eVar3.getClass();
                                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                                    HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                                    if (httpException != null) {
                                        r1 r1VarM = i26.l.m(httpException);
                                        String strString = r1VarM != null ? r1VarM.string() : null;
                                        if (strString != null) {
                                            try {
                                                cVar = (rye.c) eVar3.f258366a.b(strString, rye.c.class);
                                            } catch (Exception e) {
                                                zhm.h0 h0Var = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                                cVar = null;
                                            }
                                            if (cVar == null && httpException.code() == 4042) {
                                                IllegalArgumentException illegalArgumentException222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var2222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList2222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException222222, h0Var2222222);
                                            }
                                        } else {
                                            cVar = null;
                                            if (cVar == null) {
                                                IllegalArgumentException illegalArgumentException2222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var22222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList22222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2222222, h0Var22222222);
                                            }
                                        }
                                    } else {
                                        cVar = null;
                                    }
                                    if (cVar != null && cVar.f258363a == 4042) {
                                        dj0.d dVarO = mo3.a.o(cVar.f258365c);
                                        y0VarA = new y0(null, new nii.z(new TextLocalisedClause(R$string.wallet_limit_exceeded_error_title, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wallet_limit_exceeded_error_description, zhm.u.c(new MoneyClause(pyd.c.H(dVarO, mo3.a.o(cVar.f258364b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                                    }
                                    if (y0VarA == null) {
                                        y0VarA = cVar2.a(throwable);
                                    }
                                    iVar4.X1(y0VarA);
                                } else {
                                    if (!Intrinsics.f(result8, rze.c.f258594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Unit unit2 = Unit.f186387a;
                                }
                                break;
                            } else {
                                iVar4.l1().M0(new aii.i(((rze.e) result8).f258596a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                        case 9:
                            ste.o result9 = (ste.o) obj4;
                            Intrinsics.checkNotNullParameter(result9, "result");
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar7 = iVar2;
                            boolean z4 = result9 instanceof ste.n;
                            iVar7.f90948r.f276169a = z4;
                            dj0.d dVar7 = ((TopupFlowContract$Step.GooglePayTopup) topupFlowContract$Step).f90851a.f90496a;
                            if (z4) {
                                GooglePayFee googlePayFee = ((ste.n) result9).f265568a;
                                if (googlePayFee instanceof GooglePayFee.FeeRequired) {
                                    yji.l.b1(iVar7, iVar7.X1(((c1f.a) iVar7.J).c(dVar7, ((GooglePayFee.FeeRequired) googlePayFee).f90520b)), null, new u(iVar7, dVar7, null), 3);
                                } else {
                                    iVar7.l2(new dp4.y0(iVar7, dVar7, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                                }
                            } else if (!(result9 instanceof ste.l)) {
                                if (!(result9 instanceof ste.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th10 = ((ste.m) result9).f265567a;
                                RuntimeException runtimeException = new RuntimeException("Google pay top-up error", th10);
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var3);
                                iVar7.R2(th10, dVar7.f115083b);
                            } else if (((ste.l) result9).f265566a) {
                                yki.a aVar62 = iVar7.i0;
                                String str5 = dVar7.f115083b.f306286a;
                                g gVar2 = iVar7.o;
                                oki.h.t2(iVar7, aVar62, new TopupFlowContract$Step.SelectTopupMethod(dVar7, str5, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 10:
                            ste.b result10 = (ste.b) obj4;
                            Intrinsics.checkNotNullParameter(result10, "result");
                            if (result10 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                b bVar2 = iVar4.u;
                                CardDetailsScreenDescriptor$OutputData$CardData cardData = CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result10, ((TopupFlowContract$Step.ExpiredCardDetails) topupFlowContract$Step).f90850a);
                                bVar2.getClass();
                                Intrinsics.checkNotNullParameter(cardData, "cardData");
                                bVar2.f284258a.k(cardData);
                            } else {
                                if (!(result10 instanceof ste.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Result not expected in this flow: " + result10);
                                zhm.h0 h0Var4 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var4);
                            }
                            return Unit.f186387a;
                        case 11:
                            nze.l result11 = (nze.l) obj4;
                            Intrinsics.checkNotNullParameter(result11, "result");
                            boolean z6 = result11 instanceof l.b;
                            iVar4.f90948r.f276169a = z6;
                            if (result11 instanceof l.a) {
                                Unit unit3 = Unit.f186387a;
                            } else if (result11 instanceof nze.m) {
                                iVar4.l1().M0(new aii.i(((nze.m) result11).f221037a, (aii.a) null, 6));
                            } else if (result11 instanceof nze.n) {
                                iVar4.C1(u0.b(((nze.n) result11).f221038a));
                            } else if (result11 instanceof nze.o) {
                                iVar4.C1(u0.b(((nze.o) result11).f221039a));
                            } else {
                                if (!z6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.MandateTopup) topupFlowContract$Step).f90863a.f91003a.f115083b, null, 3), new yi5.b(26));
                                Unit unit4 = Unit.f186387a;
                            }
                            return Unit.f186387a;
                        case 12:
                            o0 result12 = (o0) obj4;
                            Intrinsics.checkNotNullParameter(result12, "result");
                            if (result12 instanceof we6.m0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.b(iVar4, result12, topupFlowContract$Step, null));
                            } else {
                                if (!(result12 instanceof we6.n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.n0) result12).f296657a, null));
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar8 = iVar2;
                            yki.a aVar72 = iVar8.i0;
                            we6.p result13 = (we6.p) obj4;
                            Intrinsics.checkNotNullParameter(result13, "result");
                            if (result13 instanceof we6.q) {
                                iVar8.N2(((we6.q) result13).f296666a);
                            } else if (result13 instanceof p.a) {
                                xi0.b bVar3 = ((TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step).f90844a.f115083b;
                                aVar72.e(true);
                                iVar8.P2(bVar3);
                            } else if (result13 instanceof p.b) {
                                TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer2 = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step;
                                if (oki.h.E2(aVar72, new uwi.v(26))) {
                                    aVar72.e(false);
                                } else {
                                    String str6 = crossBorderEasyBankTransfer2.f90844a.f115083b.f306286a;
                                    g gVar3 = iVar8.o;
                                    oki.h.t2(iVar8, aVar72, new TopupFlowContract$Step.SelectTopupMethod(crossBorderEasyBankTransfer2.f90844a, str6, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                                }
                            } else {
                                if (!(result13 instanceof we6.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar8.N2(((we6.o) result13).f296658a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block19, "block");
            unverifiedCardTopUpDelayBottomSheetController.H = block19;
            return unverifiedCardTopUpDelayBottomSheetController;
        }
        if (step instanceof TopupFlowContract$Step.TopUpLimitsDialog) {
            TopupFlowContract$Step.TopUpLimitsDialog topUpLimitsDialog = (TopupFlowContract$Step.TopUpLimitsDialog) step;
            TopUpLimitsBottomSheetController topUpLimitsBottomSheetController = new TopUpLimitsBottomSheetController(dVar4.a(topUpLimitsDialog.f90881a, topUpLimitsDialog.f90882b));
            topUpLimitsBottomSheetController.k2(new Function0() { // from class: uye.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i6) {
                        case 0:
                            iVar2.N.a(a4.f190702a);
                            break;
                        case 1:
                            iVar2.N.a(c4.f190720a);
                            break;
                        case 2:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 3:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 4:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 5:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 6:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 7:
                            iVar2.N.a(b4.f190713a);
                            break;
                        default:
                            iVar2.N.a(y3.f190882a);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            Function1 block20 = new Function1() { // from class: uye.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    rye.c cVar;
                    int i322 = i74;
                    y0 y0VarA = null;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = iVar2;
                    TopupFlowContract$Step topupFlowContract$Step = step;
                    switch (i322) {
                        case 0:
                            yye.c result = (yye.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof yye.a) {
                                TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) topupFlowContract$Step;
                                iVar4.V2(unverifiedCardTopUpDelayDialog.f90893a, unverifiedCardTopUpDelayDialog.f90894b);
                            } else if (!(result instanceof yye.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            ste.u result2 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof ste.s)) {
                                if (!(result2 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsDialog) topupFlowContract$Step).f90883c);
                            } else if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 2:
                            ste.u result3 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof ste.s)) {
                                if (!(result3 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsVerificationDialog) topupFlowContract$Step).f90886c);
                            } else if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 3:
                            ste.u result4 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z = result4 instanceof ste.s;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = iVar2;
                            if (!z) {
                                if (!(result4 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) topupFlowContract$Step;
                                iVar5.n2(new sxe.g(iVar5, topUpMultiLimitsVerificationDialog.f90889c, topUpMultiLimitsVerificationDialog.d, topUpMultiLimitsVerificationDialog.f90887a, (Continuation) null, 14), new whi.b(6));
                            } else if (Intrinsics.f(((ste.s) result4).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar5.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 4:
                            we6.k0 result5 = (we6.k0) obj4;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (result5 instanceof we6.i0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.c(iVar4, result5, topupFlowContract$Step, null));
                            } else {
                                if (!(result5 instanceof we6.j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.j0) result5).f296649a, null));
                            }
                            return Unit.f186387a;
                        case 5:
                            dii.g result6 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z3 = result6 instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = iVar2;
                            if (z3) {
                                TopupFlowContract$Step.CardVerificationRequiredDialog cardVerificationRequiredDialog = (TopupFlowContract$Step.CardVerificationRequiredDialog) topupFlowContract$Step;
                                iVar6.n2(new sxe.g(iVar6, cardVerificationRequiredDialog.f90834b, cardVerificationRequiredDialog.f90835c, cardVerificationRequiredDialog.f90833a, (Continuation) null, 14), new whi.b(6));
                            } else if ((result6 instanceof dii.c) && Intrinsics.f(((dii.c) result6).f115066a.f275445a, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar6.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 6:
                            til.r output = (til.r) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof til.q) {
                                iVar4.n2(new s(iVar4, topupFlowContract$Step, null, 0), new whi.b(6));
                            } else if (!(output instanceof til.n) && !(output instanceof til.o) && !(output instanceof til.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 7:
                            ExchangeGlobalAccessOutput result7 = (ExchangeGlobalAccessOutput) obj4;
                            Intrinsics.checkNotNullParameter(result7, "result");
                            if (result7 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                                iVar4.l2(new s(iVar4, topupFlowContract$Step, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 8:
                            c1f.c cVar2 = iVar4.K;
                            rze.i result8 = (rze.i) obj4;
                            Intrinsics.checkNotNullParameter(result8, "result");
                            if (!(result8 instanceof rze.e)) {
                                if (result8 instanceof rze.f) {
                                    iVar4.C1(((rze.f) result8).f258597a);
                                } else if (result8 instanceof rze.g) {
                                    iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.StoredMethodTopUp) topupFlowContract$Step).f90879a.f91020c.f115083b, null, 3), new yi5.b(26));
                                    Unit unit = Unit.f186387a;
                                } else if (result8 instanceof rze.d) {
                                    iVar4.X1(cVar2.a(((rze.d) result8).f258595a));
                                } else if (result8 instanceof rze.h) {
                                    rye.e eVar3 = iVar4.M;
                                    Throwable throwable = ((rze.h) result8).f258599a;
                                    eVar3.getClass();
                                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                                    HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                                    if (httpException != null) {
                                        r1 r1VarM = i26.l.m(httpException);
                                        String strString = r1VarM != null ? r1VarM.string() : null;
                                        if (strString != null) {
                                            try {
                                                cVar = (rye.c) eVar3.f258366a.b(strString, rye.c.class);
                                            } catch (Exception e) {
                                                zhm.h0 h0Var = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                                cVar = null;
                                            }
                                            if (cVar == null && httpException.code() == 4042) {
                                                IllegalArgumentException illegalArgumentException2222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var22222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList22222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2222222, h0Var22222222);
                                            }
                                        } else {
                                            cVar = null;
                                            if (cVar == null) {
                                                IllegalArgumentException illegalArgumentException22222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var222222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList222222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException22222222, h0Var222222222);
                                            }
                                        }
                                    } else {
                                        cVar = null;
                                    }
                                    if (cVar != null && cVar.f258363a == 4042) {
                                        dj0.d dVarO = mo3.a.o(cVar.f258365c);
                                        y0VarA = new y0(null, new nii.z(new TextLocalisedClause(R$string.wallet_limit_exceeded_error_title, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wallet_limit_exceeded_error_description, zhm.u.c(new MoneyClause(pyd.c.H(dVarO, mo3.a.o(cVar.f258364b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                                    }
                                    if (y0VarA == null) {
                                        y0VarA = cVar2.a(throwable);
                                    }
                                    iVar4.X1(y0VarA);
                                } else {
                                    if (!Intrinsics.f(result8, rze.c.f258594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Unit unit2 = Unit.f186387a;
                                }
                                break;
                            } else {
                                iVar4.l1().M0(new aii.i(((rze.e) result8).f258596a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                        case 9:
                            ste.o result9 = (ste.o) obj4;
                            Intrinsics.checkNotNullParameter(result9, "result");
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar7 = iVar2;
                            boolean z4 = result9 instanceof ste.n;
                            iVar7.f90948r.f276169a = z4;
                            dj0.d dVar7 = ((TopupFlowContract$Step.GooglePayTopup) topupFlowContract$Step).f90851a.f90496a;
                            if (z4) {
                                GooglePayFee googlePayFee = ((ste.n) result9).f265568a;
                                if (googlePayFee instanceof GooglePayFee.FeeRequired) {
                                    yji.l.b1(iVar7, iVar7.X1(((c1f.a) iVar7.J).c(dVar7, ((GooglePayFee.FeeRequired) googlePayFee).f90520b)), null, new u(iVar7, dVar7, null), 3);
                                } else {
                                    iVar7.l2(new dp4.y0(iVar7, dVar7, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                                }
                            } else if (!(result9 instanceof ste.l)) {
                                if (!(result9 instanceof ste.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th10 = ((ste.m) result9).f265567a;
                                RuntimeException runtimeException = new RuntimeException("Google pay top-up error", th10);
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var3);
                                iVar7.R2(th10, dVar7.f115083b);
                            } else if (((ste.l) result9).f265566a) {
                                yki.a aVar62 = iVar7.i0;
                                String str5 = dVar7.f115083b.f306286a;
                                g gVar2 = iVar7.o;
                                oki.h.t2(iVar7, aVar62, new TopupFlowContract$Step.SelectTopupMethod(dVar7, str5, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 10:
                            ste.b result10 = (ste.b) obj4;
                            Intrinsics.checkNotNullParameter(result10, "result");
                            if (result10 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                b bVar2 = iVar4.u;
                                CardDetailsScreenDescriptor$OutputData$CardData cardData = CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result10, ((TopupFlowContract$Step.ExpiredCardDetails) topupFlowContract$Step).f90850a);
                                bVar2.getClass();
                                Intrinsics.checkNotNullParameter(cardData, "cardData");
                                bVar2.f284258a.k(cardData);
                            } else {
                                if (!(result10 instanceof ste.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Result not expected in this flow: " + result10);
                                zhm.h0 h0Var4 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var4);
                            }
                            return Unit.f186387a;
                        case 11:
                            nze.l result11 = (nze.l) obj4;
                            Intrinsics.checkNotNullParameter(result11, "result");
                            boolean z6 = result11 instanceof l.b;
                            iVar4.f90948r.f276169a = z6;
                            if (result11 instanceof l.a) {
                                Unit unit3 = Unit.f186387a;
                            } else if (result11 instanceof nze.m) {
                                iVar4.l1().M0(new aii.i(((nze.m) result11).f221037a, (aii.a) null, 6));
                            } else if (result11 instanceof nze.n) {
                                iVar4.C1(u0.b(((nze.n) result11).f221038a));
                            } else if (result11 instanceof nze.o) {
                                iVar4.C1(u0.b(((nze.o) result11).f221039a));
                            } else {
                                if (!z6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.MandateTopup) topupFlowContract$Step).f90863a.f91003a.f115083b, null, 3), new yi5.b(26));
                                Unit unit4 = Unit.f186387a;
                            }
                            return Unit.f186387a;
                        case 12:
                            o0 result12 = (o0) obj4;
                            Intrinsics.checkNotNullParameter(result12, "result");
                            if (result12 instanceof we6.m0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.b(iVar4, result12, topupFlowContract$Step, null));
                            } else {
                                if (!(result12 instanceof we6.n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.n0) result12).f296657a, null));
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar8 = iVar2;
                            yki.a aVar72 = iVar8.i0;
                            we6.p result13 = (we6.p) obj4;
                            Intrinsics.checkNotNullParameter(result13, "result");
                            if (result13 instanceof we6.q) {
                                iVar8.N2(((we6.q) result13).f296666a);
                            } else if (result13 instanceof p.a) {
                                xi0.b bVar3 = ((TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step).f90844a.f115083b;
                                aVar72.e(true);
                                iVar8.P2(bVar3);
                            } else if (result13 instanceof p.b) {
                                TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer2 = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step;
                                if (oki.h.E2(aVar72, new uwi.v(26))) {
                                    aVar72.e(false);
                                } else {
                                    String str6 = crossBorderEasyBankTransfer2.f90844a.f115083b.f306286a;
                                    g gVar3 = iVar8.o;
                                    oki.h.t2(iVar8, aVar72, new TopupFlowContract$Step.SelectTopupMethod(crossBorderEasyBankTransfer2.f90844a, str6, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                                }
                            } else {
                                if (!(result13 instanceof we6.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar8.N2(((we6.o) result13).f296658a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block20, "block");
            topUpLimitsBottomSheetController.H = block20;
            return topUpLimitsBottomSheetController;
        }
        final int i99 = 3;
        if (step instanceof TopupFlowContract$Step.TopUpLimitsVerificationDialog) {
            TopupFlowContract$Step.TopUpLimitsVerificationDialog topUpLimitsVerificationDialog = (TopupFlowContract$Step.TopUpLimitsVerificationDialog) step;
            TopUpLimitsBottomSheetController topUpLimitsBottomSheetController2 = new TopUpLimitsBottomSheetController(dVar4.a(topUpLimitsVerificationDialog.f90884a, topUpLimitsVerificationDialog.f90885b));
            topUpLimitsBottomSheetController2.k2(new Function0() { // from class: uye.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i99) {
                        case 0:
                            iVar2.N.a(a4.f190702a);
                            break;
                        case 1:
                            iVar2.N.a(c4.f190720a);
                            break;
                        case 2:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 3:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 4:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 5:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 6:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 7:
                            iVar2.N.a(b4.f190713a);
                            break;
                        default:
                            iVar2.N.a(y3.f190882a);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            Function1 block21 = new Function1() { // from class: uye.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    rye.c cVar;
                    int i322 = i6;
                    y0 y0VarA = null;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = iVar2;
                    TopupFlowContract$Step topupFlowContract$Step = step;
                    switch (i322) {
                        case 0:
                            yye.c result = (yye.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof yye.a) {
                                TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) topupFlowContract$Step;
                                iVar4.V2(unverifiedCardTopUpDelayDialog.f90893a, unverifiedCardTopUpDelayDialog.f90894b);
                            } else if (!(result instanceof yye.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            ste.u result2 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof ste.s)) {
                                if (!(result2 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsDialog) topupFlowContract$Step).f90883c);
                            } else if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 2:
                            ste.u result3 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof ste.s)) {
                                if (!(result3 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsVerificationDialog) topupFlowContract$Step).f90886c);
                            } else if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 3:
                            ste.u result4 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z = result4 instanceof ste.s;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = iVar2;
                            if (!z) {
                                if (!(result4 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) topupFlowContract$Step;
                                iVar5.n2(new sxe.g(iVar5, topUpMultiLimitsVerificationDialog.f90889c, topUpMultiLimitsVerificationDialog.d, topUpMultiLimitsVerificationDialog.f90887a, (Continuation) null, 14), new whi.b(6));
                            } else if (Intrinsics.f(((ste.s) result4).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar5.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 4:
                            we6.k0 result5 = (we6.k0) obj4;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (result5 instanceof we6.i0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.c(iVar4, result5, topupFlowContract$Step, null));
                            } else {
                                if (!(result5 instanceof we6.j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.j0) result5).f296649a, null));
                            }
                            return Unit.f186387a;
                        case 5:
                            dii.g result6 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z3 = result6 instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = iVar2;
                            if (z3) {
                                TopupFlowContract$Step.CardVerificationRequiredDialog cardVerificationRequiredDialog = (TopupFlowContract$Step.CardVerificationRequiredDialog) topupFlowContract$Step;
                                iVar6.n2(new sxe.g(iVar6, cardVerificationRequiredDialog.f90834b, cardVerificationRequiredDialog.f90835c, cardVerificationRequiredDialog.f90833a, (Continuation) null, 14), new whi.b(6));
                            } else if ((result6 instanceof dii.c) && Intrinsics.f(((dii.c) result6).f115066a.f275445a, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar6.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 6:
                            til.r output = (til.r) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof til.q) {
                                iVar4.n2(new s(iVar4, topupFlowContract$Step, null, 0), new whi.b(6));
                            } else if (!(output instanceof til.n) && !(output instanceof til.o) && !(output instanceof til.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 7:
                            ExchangeGlobalAccessOutput result7 = (ExchangeGlobalAccessOutput) obj4;
                            Intrinsics.checkNotNullParameter(result7, "result");
                            if (result7 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                                iVar4.l2(new s(iVar4, topupFlowContract$Step, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 8:
                            c1f.c cVar2 = iVar4.K;
                            rze.i result8 = (rze.i) obj4;
                            Intrinsics.checkNotNullParameter(result8, "result");
                            if (!(result8 instanceof rze.e)) {
                                if (result8 instanceof rze.f) {
                                    iVar4.C1(((rze.f) result8).f258597a);
                                } else if (result8 instanceof rze.g) {
                                    iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.StoredMethodTopUp) topupFlowContract$Step).f90879a.f91020c.f115083b, null, 3), new yi5.b(26));
                                    Unit unit = Unit.f186387a;
                                } else if (result8 instanceof rze.d) {
                                    iVar4.X1(cVar2.a(((rze.d) result8).f258595a));
                                } else if (result8 instanceof rze.h) {
                                    rye.e eVar3 = iVar4.M;
                                    Throwable throwable = ((rze.h) result8).f258599a;
                                    eVar3.getClass();
                                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                                    HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                                    if (httpException != null) {
                                        r1 r1VarM = i26.l.m(httpException);
                                        String strString = r1VarM != null ? r1VarM.string() : null;
                                        if (strString != null) {
                                            try {
                                                cVar = (rye.c) eVar3.f258366a.b(strString, rye.c.class);
                                            } catch (Exception e) {
                                                zhm.h0 h0Var = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                                cVar = null;
                                            }
                                            if (cVar == null && httpException.code() == 4042) {
                                                IllegalArgumentException illegalArgumentException22222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var222222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList222222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException22222222, h0Var222222222);
                                            }
                                        } else {
                                            cVar = null;
                                            if (cVar == null) {
                                                IllegalArgumentException illegalArgumentException222222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var2222222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList2222222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException222222222, h0Var2222222222);
                                            }
                                        }
                                    } else {
                                        cVar = null;
                                    }
                                    if (cVar != null && cVar.f258363a == 4042) {
                                        dj0.d dVarO = mo3.a.o(cVar.f258365c);
                                        y0VarA = new y0(null, new nii.z(new TextLocalisedClause(R$string.wallet_limit_exceeded_error_title, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wallet_limit_exceeded_error_description, zhm.u.c(new MoneyClause(pyd.c.H(dVarO, mo3.a.o(cVar.f258364b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                                    }
                                    if (y0VarA == null) {
                                        y0VarA = cVar2.a(throwable);
                                    }
                                    iVar4.X1(y0VarA);
                                } else {
                                    if (!Intrinsics.f(result8, rze.c.f258594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Unit unit2 = Unit.f186387a;
                                }
                                break;
                            } else {
                                iVar4.l1().M0(new aii.i(((rze.e) result8).f258596a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                        case 9:
                            ste.o result9 = (ste.o) obj4;
                            Intrinsics.checkNotNullParameter(result9, "result");
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar7 = iVar2;
                            boolean z4 = result9 instanceof ste.n;
                            iVar7.f90948r.f276169a = z4;
                            dj0.d dVar7 = ((TopupFlowContract$Step.GooglePayTopup) topupFlowContract$Step).f90851a.f90496a;
                            if (z4) {
                                GooglePayFee googlePayFee = ((ste.n) result9).f265568a;
                                if (googlePayFee instanceof GooglePayFee.FeeRequired) {
                                    yji.l.b1(iVar7, iVar7.X1(((c1f.a) iVar7.J).c(dVar7, ((GooglePayFee.FeeRequired) googlePayFee).f90520b)), null, new u(iVar7, dVar7, null), 3);
                                } else {
                                    iVar7.l2(new dp4.y0(iVar7, dVar7, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                                }
                            } else if (!(result9 instanceof ste.l)) {
                                if (!(result9 instanceof ste.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th10 = ((ste.m) result9).f265567a;
                                RuntimeException runtimeException = new RuntimeException("Google pay top-up error", th10);
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var3);
                                iVar7.R2(th10, dVar7.f115083b);
                            } else if (((ste.l) result9).f265566a) {
                                yki.a aVar62 = iVar7.i0;
                                String str5 = dVar7.f115083b.f306286a;
                                g gVar2 = iVar7.o;
                                oki.h.t2(iVar7, aVar62, new TopupFlowContract$Step.SelectTopupMethod(dVar7, str5, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 10:
                            ste.b result10 = (ste.b) obj4;
                            Intrinsics.checkNotNullParameter(result10, "result");
                            if (result10 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                b bVar2 = iVar4.u;
                                CardDetailsScreenDescriptor$OutputData$CardData cardData = CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result10, ((TopupFlowContract$Step.ExpiredCardDetails) topupFlowContract$Step).f90850a);
                                bVar2.getClass();
                                Intrinsics.checkNotNullParameter(cardData, "cardData");
                                bVar2.f284258a.k(cardData);
                            } else {
                                if (!(result10 instanceof ste.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Result not expected in this flow: " + result10);
                                zhm.h0 h0Var4 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var4);
                            }
                            return Unit.f186387a;
                        case 11:
                            nze.l result11 = (nze.l) obj4;
                            Intrinsics.checkNotNullParameter(result11, "result");
                            boolean z6 = result11 instanceof l.b;
                            iVar4.f90948r.f276169a = z6;
                            if (result11 instanceof l.a) {
                                Unit unit3 = Unit.f186387a;
                            } else if (result11 instanceof nze.m) {
                                iVar4.l1().M0(new aii.i(((nze.m) result11).f221037a, (aii.a) null, 6));
                            } else if (result11 instanceof nze.n) {
                                iVar4.C1(u0.b(((nze.n) result11).f221038a));
                            } else if (result11 instanceof nze.o) {
                                iVar4.C1(u0.b(((nze.o) result11).f221039a));
                            } else {
                                if (!z6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.MandateTopup) topupFlowContract$Step).f90863a.f91003a.f115083b, null, 3), new yi5.b(26));
                                Unit unit4 = Unit.f186387a;
                            }
                            return Unit.f186387a;
                        case 12:
                            o0 result12 = (o0) obj4;
                            Intrinsics.checkNotNullParameter(result12, "result");
                            if (result12 instanceof we6.m0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.b(iVar4, result12, topupFlowContract$Step, null));
                            } else {
                                if (!(result12 instanceof we6.n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.n0) result12).f296657a, null));
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar8 = iVar2;
                            yki.a aVar72 = iVar8.i0;
                            we6.p result13 = (we6.p) obj4;
                            Intrinsics.checkNotNullParameter(result13, "result");
                            if (result13 instanceof we6.q) {
                                iVar8.N2(((we6.q) result13).f296666a);
                            } else if (result13 instanceof p.a) {
                                xi0.b bVar3 = ((TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step).f90844a.f115083b;
                                aVar72.e(true);
                                iVar8.P2(bVar3);
                            } else if (result13 instanceof p.b) {
                                TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer2 = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step;
                                if (oki.h.E2(aVar72, new uwi.v(26))) {
                                    aVar72.e(false);
                                } else {
                                    String str6 = crossBorderEasyBankTransfer2.f90844a.f115083b.f306286a;
                                    g gVar3 = iVar8.o;
                                    oki.h.t2(iVar8, aVar72, new TopupFlowContract$Step.SelectTopupMethod(crossBorderEasyBankTransfer2.f90844a, str6, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                                }
                            } else {
                                if (!(result13 instanceof we6.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar8.N2(((we6.o) result13).f296658a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block21, "block");
            topUpLimitsBottomSheetController2.H = block21;
            return topUpLimitsBottomSheetController2;
        }
        if (step instanceof TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) {
            ArrayList<TopUpLimitUiModel> arrayList3 = ((TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) step).f90888b;
            aue.d dVar7 = iVar2.X;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            for (TopUpLimitUiModel topUpLimitUiModel : arrayList3) {
                dVar7.getClass();
                arrayList4.add(aue.d.a(topUpLimitUiModel));
            }
            TopUpLimitsBottomSheetController topUpLimitsBottomSheetController3 = new TopUpLimitsBottomSheetController(dVar4.b(arrayList4, true));
            final int i100 = 4;
            topUpLimitsBottomSheetController3.k2(new Function0() { // from class: uye.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i100) {
                        case 0:
                            iVar2.N.a(a4.f190702a);
                            break;
                        case 1:
                            iVar2.N.a(c4.f190720a);
                            break;
                        case 2:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 3:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 4:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 5:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 6:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 7:
                            iVar2.N.a(b4.f190713a);
                            break;
                        default:
                            iVar2.N.a(y3.f190882a);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            Function1 block22 = new Function1() { // from class: uye.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    rye.c cVar;
                    int i322 = i99;
                    y0 y0VarA = null;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = iVar2;
                    TopupFlowContract$Step topupFlowContract$Step = step;
                    switch (i322) {
                        case 0:
                            yye.c result = (yye.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof yye.a) {
                                TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) topupFlowContract$Step;
                                iVar4.V2(unverifiedCardTopUpDelayDialog.f90893a, unverifiedCardTopUpDelayDialog.f90894b);
                            } else if (!(result instanceof yye.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            ste.u result2 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof ste.s)) {
                                if (!(result2 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsDialog) topupFlowContract$Step).f90883c);
                            } else if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 2:
                            ste.u result3 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof ste.s)) {
                                if (!(result3 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsVerificationDialog) topupFlowContract$Step).f90886c);
                            } else if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 3:
                            ste.u result4 = (ste.u) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z = result4 instanceof ste.s;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = iVar2;
                            if (!z) {
                                if (!(result4 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) topupFlowContract$Step;
                                iVar5.n2(new sxe.g(iVar5, topUpMultiLimitsVerificationDialog.f90889c, topUpMultiLimitsVerificationDialog.d, topUpMultiLimitsVerificationDialog.f90887a, (Continuation) null, 14), new whi.b(6));
                            } else if (Intrinsics.f(((ste.s) result4).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar5.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 4:
                            we6.k0 result5 = (we6.k0) obj4;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (result5 instanceof we6.i0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.c(iVar4, result5, topupFlowContract$Step, null));
                            } else {
                                if (!(result5 instanceof we6.j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.j0) result5).f296649a, null));
                            }
                            return Unit.f186387a;
                        case 5:
                            dii.g result6 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z3 = result6 instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = iVar2;
                            if (z3) {
                                TopupFlowContract$Step.CardVerificationRequiredDialog cardVerificationRequiredDialog = (TopupFlowContract$Step.CardVerificationRequiredDialog) topupFlowContract$Step;
                                iVar6.n2(new sxe.g(iVar6, cardVerificationRequiredDialog.f90834b, cardVerificationRequiredDialog.f90835c, cardVerificationRequiredDialog.f90833a, (Continuation) null, 14), new whi.b(6));
                            } else if ((result6 instanceof dii.c) && Intrinsics.f(((dii.c) result6).f115066a.f275445a, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar6.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 6:
                            til.r output = (til.r) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof til.q) {
                                iVar4.n2(new s(iVar4, topupFlowContract$Step, null, 0), new whi.b(6));
                            } else if (!(output instanceof til.n) && !(output instanceof til.o) && !(output instanceof til.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 7:
                            ExchangeGlobalAccessOutput result7 = (ExchangeGlobalAccessOutput) obj4;
                            Intrinsics.checkNotNullParameter(result7, "result");
                            if (result7 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                                iVar4.l2(new s(iVar4, topupFlowContract$Step, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 8:
                            c1f.c cVar2 = iVar4.K;
                            rze.i result8 = (rze.i) obj4;
                            Intrinsics.checkNotNullParameter(result8, "result");
                            if (!(result8 instanceof rze.e)) {
                                if (result8 instanceof rze.f) {
                                    iVar4.C1(((rze.f) result8).f258597a);
                                } else if (result8 instanceof rze.g) {
                                    iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.StoredMethodTopUp) topupFlowContract$Step).f90879a.f91020c.f115083b, null, 3), new yi5.b(26));
                                    Unit unit = Unit.f186387a;
                                } else if (result8 instanceof rze.d) {
                                    iVar4.X1(cVar2.a(((rze.d) result8).f258595a));
                                } else if (result8 instanceof rze.h) {
                                    rye.e eVar3 = iVar4.M;
                                    Throwable throwable = ((rze.h) result8).f258599a;
                                    eVar3.getClass();
                                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                                    HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                                    if (httpException != null) {
                                        r1 r1VarM = i26.l.m(httpException);
                                        String strString = r1VarM != null ? r1VarM.string() : null;
                                        if (strString != null) {
                                            try {
                                                cVar = (rye.c) eVar3.f258366a.b(strString, rye.c.class);
                                            } catch (Exception e) {
                                                zhm.h0 h0Var = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                                cVar = null;
                                            }
                                            if (cVar == null && httpException.code() == 4042) {
                                                IllegalArgumentException illegalArgumentException222222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var2222222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList2222222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException222222222, h0Var2222222222);
                                            }
                                        } else {
                                            cVar = null;
                                            if (cVar == null) {
                                                IllegalArgumentException illegalArgumentException2222222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var22222222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList22222222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2222222222, h0Var22222222222);
                                            }
                                        }
                                    } else {
                                        cVar = null;
                                    }
                                    if (cVar != null && cVar.f258363a == 4042) {
                                        dj0.d dVarO = mo3.a.o(cVar.f258365c);
                                        y0VarA = new y0(null, new nii.z(new TextLocalisedClause(R$string.wallet_limit_exceeded_error_title, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wallet_limit_exceeded_error_description, zhm.u.c(new MoneyClause(pyd.c.H(dVarO, mo3.a.o(cVar.f258364b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                                    }
                                    if (y0VarA == null) {
                                        y0VarA = cVar2.a(throwable);
                                    }
                                    iVar4.X1(y0VarA);
                                } else {
                                    if (!Intrinsics.f(result8, rze.c.f258594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Unit unit2 = Unit.f186387a;
                                }
                                break;
                            } else {
                                iVar4.l1().M0(new aii.i(((rze.e) result8).f258596a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                        case 9:
                            ste.o result9 = (ste.o) obj4;
                            Intrinsics.checkNotNullParameter(result9, "result");
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar7 = iVar2;
                            boolean z4 = result9 instanceof ste.n;
                            iVar7.f90948r.f276169a = z4;
                            dj0.d dVar72 = ((TopupFlowContract$Step.GooglePayTopup) topupFlowContract$Step).f90851a.f90496a;
                            if (z4) {
                                GooglePayFee googlePayFee = ((ste.n) result9).f265568a;
                                if (googlePayFee instanceof GooglePayFee.FeeRequired) {
                                    yji.l.b1(iVar7, iVar7.X1(((c1f.a) iVar7.J).c(dVar72, ((GooglePayFee.FeeRequired) googlePayFee).f90520b)), null, new u(iVar7, dVar72, null), 3);
                                } else {
                                    iVar7.l2(new dp4.y0(iVar7, dVar72, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                                }
                            } else if (!(result9 instanceof ste.l)) {
                                if (!(result9 instanceof ste.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th10 = ((ste.m) result9).f265567a;
                                RuntimeException runtimeException = new RuntimeException("Google pay top-up error", th10);
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var3);
                                iVar7.R2(th10, dVar72.f115083b);
                            } else if (((ste.l) result9).f265566a) {
                                yki.a aVar62 = iVar7.i0;
                                String str5 = dVar72.f115083b.f306286a;
                                g gVar2 = iVar7.o;
                                oki.h.t2(iVar7, aVar62, new TopupFlowContract$Step.SelectTopupMethod(dVar72, str5, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 10:
                            ste.b result10 = (ste.b) obj4;
                            Intrinsics.checkNotNullParameter(result10, "result");
                            if (result10 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                b bVar2 = iVar4.u;
                                CardDetailsScreenDescriptor$OutputData$CardData cardData = CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result10, ((TopupFlowContract$Step.ExpiredCardDetails) topupFlowContract$Step).f90850a);
                                bVar2.getClass();
                                Intrinsics.checkNotNullParameter(cardData, "cardData");
                                bVar2.f284258a.k(cardData);
                            } else {
                                if (!(result10 instanceof ste.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Result not expected in this flow: " + result10);
                                zhm.h0 h0Var4 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var4);
                            }
                            return Unit.f186387a;
                        case 11:
                            nze.l result11 = (nze.l) obj4;
                            Intrinsics.checkNotNullParameter(result11, "result");
                            boolean z6 = result11 instanceof l.b;
                            iVar4.f90948r.f276169a = z6;
                            if (result11 instanceof l.a) {
                                Unit unit3 = Unit.f186387a;
                            } else if (result11 instanceof nze.m) {
                                iVar4.l1().M0(new aii.i(((nze.m) result11).f221037a, (aii.a) null, 6));
                            } else if (result11 instanceof nze.n) {
                                iVar4.C1(u0.b(((nze.n) result11).f221038a));
                            } else if (result11 instanceof nze.o) {
                                iVar4.C1(u0.b(((nze.o) result11).f221039a));
                            } else {
                                if (!z6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.MandateTopup) topupFlowContract$Step).f90863a.f91003a.f115083b, null, 3), new yi5.b(26));
                                Unit unit4 = Unit.f186387a;
                            }
                            return Unit.f186387a;
                        case 12:
                            o0 result12 = (o0) obj4;
                            Intrinsics.checkNotNullParameter(result12, "result");
                            if (result12 instanceof we6.m0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.b(iVar4, result12, topupFlowContract$Step, null));
                            } else {
                                if (!(result12 instanceof we6.n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.n0) result12).f296657a, null));
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar8 = iVar2;
                            yki.a aVar72 = iVar8.i0;
                            we6.p result13 = (we6.p) obj4;
                            Intrinsics.checkNotNullParameter(result13, "result");
                            if (result13 instanceof we6.q) {
                                iVar8.N2(((we6.q) result13).f296666a);
                            } else if (result13 instanceof p.a) {
                                xi0.b bVar3 = ((TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step).f90844a.f115083b;
                                aVar72.e(true);
                                iVar8.P2(bVar3);
                            } else if (result13 instanceof p.b) {
                                TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer2 = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step;
                                if (oki.h.E2(aVar72, new uwi.v(26))) {
                                    aVar72.e(false);
                                } else {
                                    String str6 = crossBorderEasyBankTransfer2.f90844a.f115083b.f306286a;
                                    g gVar3 = iVar8.o;
                                    oki.h.t2(iVar8, aVar72, new TopupFlowContract$Step.SelectTopupMethod(crossBorderEasyBankTransfer2.f90844a, str6, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                                }
                            } else {
                                if (!(result13 instanceof we6.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar8.N2(((we6.o) result13).f296658a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block22, "block");
            topUpLimitsBottomSheetController3.H = block22;
            return topUpLimitsBottomSheetController3;
        }
        if (step instanceof TopupFlowContract$Step.UaeCountryLimitsDialog) {
            com.revolut.feature.topup_screen.api.topup_limits.a aVar9 = iVar2.Y;
            TopUpV2LimitUiModel uiModel = ((TopupFlowContract$Step.UaeCountryLimitsDialog) step).f90892a;
            aVar9.getClass();
            Intrinsics.checkNotNullParameter(uiModel, "uiModel");
            if (uiModel instanceof TopUpV2LimitUiModel.UpperBoundLimitUiModel) {
                TopUpV2LimitUiModel.UpperBoundLimitUiModel upperBoundLimitUiModel = (TopUpV2LimitUiModel.UpperBoundLimitUiModel) uiModel;
                aue.c cVar = upperBoundLimitUiModel.f90560a;
                dj0.d dVar8 = upperBoundLimitUiModel.f90561b;
                dj0.d dVar9 = upperBoundLimitUiModel.f90562c;
                dj0.d dVar10 = upperBoundLimitUiModel.d;
                TopUpV2LimitUiModel.UpperBoundLimitUiModel.LimitInTopUpCurrency limitInTopUpCurrency = upperBoundLimitUiModel.e;
                iVar = new aue.k(cVar, dVar8, dVar9, dVar10, limitInTopUpCurrency != null ? new aue.j(limitInTopUpCurrency.f90563a, limitInTopUpCurrency.f90564b, limitInTopUpCurrency.f90565c) : null);
            } else {
                if (!(uiModel instanceof TopUpV2LimitUiModel.SingleValueLimitUiModel)) {
                    throw new NoWhenBranchMatchedException();
                }
                TopUpV2LimitUiModel.SingleValueLimitUiModel singleValueLimitUiModel = (TopUpV2LimitUiModel.SingleValueLimitUiModel) uiModel;
                iVar = new aue.i(singleValueLimitUiModel.f90557a, singleValueLimitUiModel.f90558b, singleValueLimitUiModel.f90559c);
            }
            aue.k limit = (aue.k) iVar;
            if (uye.n.f284306a[uiModel.getF90560a().ordinal()] == 1) {
                rVar = dVar4.e(limit);
            } else {
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(limit, "limit");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_card_limits_prompt_subtitle_learn_more, null, new Click(30, (Integer) null, (Object) null, "UAE_COUNTRY_LIMIT_DESCRIPTION_LEARN_MORE_ID", false), 10);
                aue.j jVar = limit.e;
                if (jVar == null || (dVar2 = jVar.f9813b) == null) {
                    dVar2 = limit.f9817c;
                }
                dj0.d dVar11 = dVar2;
                if (jVar == null || (dVar3 = jVar.f9812a) == null) {
                    dVar3 = limit.f9816b;
                }
                dj0.d dVar12 = dVar3;
                lw0.a aVar10 = new lw0.a(new TextLocalisedClause(R$string.topup_card_limits_uae_prompt_title, null, null, 14), new TextLocalisedClause(R$string.topup_card_limits_uae_daily_limit_prompt_subtitle, zhm.u.c(textLocalisedClause), null, 12), null, null, false, 28);
                CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("UAE_COUNTRY_LIMIT_INDICATOR_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.topup_card_limits_uae_daily_limit_prompt_daily_limit, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.topup_card_limits_prompt_limit_remainder, v.k(new MoneyClause(dVar11, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(dVar12, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
                yp0.b.l(model2, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, null, false, 60);
                rVar = new r(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), zhm.u.c(model2), aVar10);
            }
            TopUpLimitsBottomSheetController topUpLimitsBottomSheetController4 = new TopUpLimitsBottomSheetController(rVar);
            final int i101 = 5;
            topUpLimitsBottomSheetController4.k2(new Function0() { // from class: uye.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i101) {
                        case 0:
                            iVar2.N.a(a4.f190702a);
                            break;
                        case 1:
                            iVar2.N.a(c4.f190720a);
                            break;
                        case 2:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 3:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 4:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 5:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 6:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 7:
                            iVar2.N.a(b4.f190713a);
                            break;
                        default:
                            iVar2.N.a(y3.f190882a);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            uye.i block23 = new uye.i(iVar2, i74);
            Intrinsics.checkNotNullParameter(block23, "block");
            topUpLimitsBottomSheetController4.H = block23;
            return topUpLimitsBottomSheetController4;
        }
        if (step instanceof TopupFlowContract$Step.BrazilCountryLimitDialog) {
            xye.a aVar11 = iVar2.V;
            ArrayList<TopUpV2LimitUiModel> limits = ((TopupFlowContract$Step.BrazilCountryLimitDialog) step).f90831a;
            aVar11.getClass();
            Intrinsics.checkNotNullParameter(limits, "limits");
            lw0.a aVar12 = new lw0.a(new TextLocalisedClause(R$string.topup_pix_smart_transfer_limits_sheet_title, null, null, 14), new TextLocalisedClause(R$string.topup_pix_smart_transfer_limits_sheet_subtitle, null, null, 14), null, null, false, 28);
            ArrayList arrayList5 = new ArrayList(w.t(limits, 10));
            for (TopUpV2LimitUiModel topUpV2LimitUiModel : limits) {
                if (topUpV2LimitUiModel instanceof TopUpV2LimitUiModel.UpperBoundLimitUiModel) {
                    TopUpV2LimitUiModel.UpperBoundLimitUiModel upperBoundLimitUiModel2 = (TopUpV2LimitUiModel.UpperBoundLimitUiModel) topUpV2LimitUiModel;
                    aue.c cVar2 = upperBoundLimitUiModel2.f90560a;
                    String strQ = j6.a.q("PIX_SMART_TRANSFER_LIMIT_", cVar2.name());
                    switch (xye.b.f309722a[cVar2.ordinal()]) {
                        case 1:
                            i2 = R$string.topup_pix_smart_transfer_limits_sheet_daily_limit;
                            break;
                        case 2:
                            i2 = R$string.topup_pix_smart_transfer_limits_sheet_weekly_limit;
                            break;
                        case 3:
                            i2 = R$string.topup_pix_smart_transfer_limits_sheet_monthly_limit;
                            break;
                        case 4:
                            i2 = R$string.topup_pix_smart_transfer_limits_sheet_yearly_limit;
                            break;
                        case 5:
                            i2 = R$string.topup_pix_smart_transfer_limits_sheet_single_transaction_limit;
                            break;
                        case 6:
                            i2 = R$string.topup_pix_smart_transfer_limits_sheet_all_transactions_limit;
                            break;
                        default:
                            i2 = R$string.topup_pix_smart_transfer_limits_sheet_all_transactions_limit;
                            break;
                    }
                    model = new CellDetailsDelegate.Model(strQ, new t0((Clause) new TextLocalisedClause(i2, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.topup_pix_smart_transfer_limits_sheet_limit_format, v.k(new MoneyClause(upperBoundLimitUiModel2.f90562c, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8), new MoneyClause(upperBoundLimitUiModel2.f90561b, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), null, null, null, null, 0, null, false, false, null, null, 32760);
                } else {
                    if (!(topUpV2LimitUiModel instanceof TopUpV2LimitUiModel.SingleValueLimitUiModel)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TopUpV2LimitUiModel.SingleValueLimitUiModel singleValueLimitUiModel2 = (TopUpV2LimitUiModel.SingleValueLimitUiModel) topUpV2LimitUiModel;
                    aue.c cVar3 = singleValueLimitUiModel2.f90557a;
                    String strQ2 = j6.a.q("PIX_SMART_TRANSFER_LIMIT_", cVar3.name());
                    switch (xye.b.f309722a[cVar3.ordinal()]) {
                        case 1:
                            i = R$string.topup_pix_smart_transfer_limits_sheet_daily_limit;
                            break;
                        case 2:
                            i = R$string.topup_pix_smart_transfer_limits_sheet_weekly_limit;
                            break;
                        case 3:
                            i = R$string.topup_pix_smart_transfer_limits_sheet_monthly_limit;
                            break;
                        case 4:
                            i = R$string.topup_pix_smart_transfer_limits_sheet_yearly_limit;
                            break;
                        case 5:
                            i = R$string.topup_pix_smart_transfer_limits_sheet_single_transaction_limit;
                            break;
                        case 6:
                            i = R$string.topup_pix_smart_transfer_limits_sheet_all_transactions_limit;
                            break;
                        default:
                            i = R$string.topup_pix_smart_transfer_limits_sheet_all_transactions_limit;
                            break;
                    }
                    model = new CellDetailsDelegate.Model(strQ2, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(singleValueLimitUiModel2.f90558b, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8), null, null, null, null, 0, null, false, false, null, null, 32760);
                }
                arrayList5.add(model);
            }
            yp0.b.k(arrayList5, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, 28);
            TopUpLimitsBottomSheetController topUpLimitsBottomSheetController5 = new TopUpLimitsBottomSheetController(new r(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), arrayList5, aVar12));
            final int i102 = 6;
            topUpLimitsBottomSheetController5.k2(new Function0() { // from class: uye.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i102) {
                        case 0:
                            iVar2.N.a(a4.f190702a);
                            break;
                        case 1:
                            iVar2.N.a(c4.f190720a);
                            break;
                        case 2:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 3:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 4:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 5:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 6:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 7:
                            iVar2.N.a(b4.f190713a);
                            break;
                        default:
                            iVar2.N.a(y3.f190882a);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            uwi.v block24 = new uwi.v(23);
            Intrinsics.checkNotNullParameter(block24, "block");
            topUpLimitsBottomSheetController5.H = block24;
            return topUpLimitsBottomSheetController5;
        }
        if (step instanceof TopupFlowContract$Step.NzAkahuLimitDialog) {
            xye.c cVar4 = iVar2.W;
            TopupFlowContract$Step.NzAkahuLimitDialog nzAkahuLimitDialog = (TopupFlowContract$Step.NzAkahuLimitDialog) step;
            ArrayList limits2 = nzAkahuLimitDialog.f90866a;
            String methodName = nzAkahuLimitDialog.f90867b;
            cVar4.getClass();
            Intrinsics.checkNotNullParameter(limits2, "limits");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            ArrayList<TopUpV2LimitUiModel.SingleValueLimitUiModel> arrayList6 = new ArrayList();
            for (Object obj4 : limits2) {
                if (obj4 instanceof TopUpV2LimitUiModel.SingleValueLimitUiModel) {
                    arrayList6.add(obj4);
                }
            }
            ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
            for (TopUpV2LimitUiModel.SingleValueLimitUiModel singleValueLimitUiModel3 : arrayList6) {
                arrayList7.add(new CellDetailsDelegate.Model(j6.a.q("AKAHU_LIMIT_LIST_ID_PREFIX", singleValueLimitUiModel3.f90557a.name()), new t0((Clause) new TextLocalisedClause(R$string.topup_akahu_limits_single_transaction_limit_title, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(singleValueLimitUiModel3.f90558b, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8), null, null, null, null, 0, null, false, false, null, null, 32760));
            }
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.topup_akahu_limits_title, null, null, 14);
            int i103 = R$string.topup_akahu_limits_single_transaction_limit_description;
            TopUpV2LimitUiModel.SingleValueLimitUiModel singleValueLimitUiModel4 = (TopUpV2LimitUiModel.SingleValueLimitUiModel) d0.d0(arrayList6);
            Object[] elements = {(singleValueLimitUiModel4 == null || (dVar = singleValueLimitUiModel4.f90558b) == null) ? null : new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), methodName};
            Intrinsics.checkNotNullParameter(elements, "elements");
            lw0.a aVar13 = new lw0.a(textLocalisedClause2, new TextLocalisedClause(i103, kotlin.collections.d.L(elements), null, 12), null, null, false, 28);
            if (arrayList7.isEmpty()) {
                arrayList = arrayList7;
            } else {
                yp0.b.k(arrayList7, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, 28);
                arrayList = arrayList7;
            }
            TopUpLimitsBottomSheetController topUpLimitsBottomSheetController6 = new TopUpLimitsBottomSheetController(new r(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), arrayList, aVar13));
            final int i104 = 7;
            topUpLimitsBottomSheetController6.k2(new Function0() { // from class: uye.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i104) {
                        case 0:
                            iVar2.N.a(a4.f190702a);
                            break;
                        case 1:
                            iVar2.N.a(c4.f190720a);
                            break;
                        case 2:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 3:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 4:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 5:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 6:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 7:
                            iVar2.N.a(b4.f190713a);
                            break;
                        default:
                            iVar2.N.a(y3.f190882a);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            uwi.v block25 = new uwi.v(24);
            Intrinsics.checkNotNullParameter(block25, "block");
            topUpLimitsBottomSheetController6.H = block25;
            return topUpLimitsBottomSheetController6;
        }
        if (step instanceof TopupFlowContract$Step.JapanEasyBankRelinkDialog) {
            iVar2.P.getClass();
            lw0.a aVar14 = new lw0.a(new TextLocalisedClause(R$string.gmo_pg_device_mismatch_dialogue_title, null, null, 14), new TextLocalisedClause(R$string.gmo_pg_device_mismatch_dialogue_subtitle, null, null, 14), null, null, false, 28);
            aw0.h hVar2 = new aw0.h(false, new n6(new TextLocalisedClause(R$string.gmo_pg_device_mismatch_dialogue_relink_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.gmo_pg_device_mismatch_dialogue_go_back_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
            k9 k9Var4 = k9.Topup;
            Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController4 = new ActionsBottomSheetController(new dii.a(aVar14, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
            uye.j block26 = new uye.j(iVar2, FlowCoordinator, step, i74);
            Intrinsics.checkNotNullParameter(block26, "block");
            actionsBottomSheetController4.H = block26;
            return actionsBottomSheetController4;
        }
        if (step instanceof TopupFlowContract$Step.JapanEasyBankAuthorization) {
            TopupFlowContract$Step.JapanEasyBankAuthorization japanEasyBankAuthorization = (TopupFlowContract$Step.JapanEasyBankAuthorization) step;
            ViewController viewControllerE18 = iVar2.e1(new l0(japanEasyBankAuthorization.f90853a, japanEasyBankAuthorization.f90854b, japanEasyBankAuthorization.f90855c));
            final int i105 = 4;
            Function1 block27 = new Function1() { // from class: uye.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj42) {
                    rye.c cVar5;
                    int i322 = i105;
                    y0 y0VarA = null;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = iVar2;
                    TopupFlowContract$Step topupFlowContract$Step = step;
                    switch (i322) {
                        case 0:
                            yye.c result = (yye.c) obj42;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof yye.a) {
                                TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) topupFlowContract$Step;
                                iVar4.V2(unverifiedCardTopUpDelayDialog.f90893a, unverifiedCardTopUpDelayDialog.f90894b);
                            } else if (!(result instanceof yye.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            ste.u result2 = (ste.u) obj42;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof ste.s)) {
                                if (!(result2 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsDialog) topupFlowContract$Step).f90883c);
                            } else if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 2:
                            ste.u result3 = (ste.u) obj42;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof ste.s)) {
                                if (!(result3 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsVerificationDialog) topupFlowContract$Step).f90886c);
                            } else if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 3:
                            ste.u result4 = (ste.u) obj42;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z = result4 instanceof ste.s;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = iVar2;
                            if (!z) {
                                if (!(result4 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) topupFlowContract$Step;
                                iVar5.n2(new sxe.g(iVar5, topUpMultiLimitsVerificationDialog.f90889c, topUpMultiLimitsVerificationDialog.d, topUpMultiLimitsVerificationDialog.f90887a, (Continuation) null, 14), new whi.b(6));
                            } else if (Intrinsics.f(((ste.s) result4).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar5.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 4:
                            we6.k0 result5 = (we6.k0) obj42;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (result5 instanceof we6.i0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.c(iVar4, result5, topupFlowContract$Step, null));
                            } else {
                                if (!(result5 instanceof we6.j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.j0) result5).f296649a, null));
                            }
                            return Unit.f186387a;
                        case 5:
                            dii.g result6 = (dii.g) obj42;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z3 = result6 instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = iVar2;
                            if (z3) {
                                TopupFlowContract$Step.CardVerificationRequiredDialog cardVerificationRequiredDialog = (TopupFlowContract$Step.CardVerificationRequiredDialog) topupFlowContract$Step;
                                iVar6.n2(new sxe.g(iVar6, cardVerificationRequiredDialog.f90834b, cardVerificationRequiredDialog.f90835c, cardVerificationRequiredDialog.f90833a, (Continuation) null, 14), new whi.b(6));
                            } else if ((result6 instanceof dii.c) && Intrinsics.f(((dii.c) result6).f115066a.f275445a, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar6.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 6:
                            til.r output = (til.r) obj42;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof til.q) {
                                iVar4.n2(new s(iVar4, topupFlowContract$Step, null, 0), new whi.b(6));
                            } else if (!(output instanceof til.n) && !(output instanceof til.o) && !(output instanceof til.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 7:
                            ExchangeGlobalAccessOutput result7 = (ExchangeGlobalAccessOutput) obj42;
                            Intrinsics.checkNotNullParameter(result7, "result");
                            if (result7 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                                iVar4.l2(new s(iVar4, topupFlowContract$Step, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 8:
                            c1f.c cVar22 = iVar4.K;
                            rze.i result8 = (rze.i) obj42;
                            Intrinsics.checkNotNullParameter(result8, "result");
                            if (!(result8 instanceof rze.e)) {
                                if (result8 instanceof rze.f) {
                                    iVar4.C1(((rze.f) result8).f258597a);
                                } else if (result8 instanceof rze.g) {
                                    iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.StoredMethodTopUp) topupFlowContract$Step).f90879a.f91020c.f115083b, null, 3), new yi5.b(26));
                                    Unit unit = Unit.f186387a;
                                } else if (result8 instanceof rze.d) {
                                    iVar4.X1(cVar22.a(((rze.d) result8).f258595a));
                                } else if (result8 instanceof rze.h) {
                                    rye.e eVar3 = iVar4.M;
                                    Throwable throwable = ((rze.h) result8).f258599a;
                                    eVar3.getClass();
                                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                                    HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                                    if (httpException != null) {
                                        r1 r1VarM = i26.l.m(httpException);
                                        String strString = r1VarM != null ? r1VarM.string() : null;
                                        if (strString != null) {
                                            try {
                                                cVar5 = (rye.c) eVar3.f258366a.b(strString, rye.c.class);
                                            } catch (Exception e) {
                                                zhm.h0 h0Var = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                                cVar5 = null;
                                            }
                                            if (cVar5 == null && httpException.code() == 4042) {
                                                IllegalArgumentException illegalArgumentException2222222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var22222222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList22222222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2222222222, h0Var22222222222);
                                            }
                                        } else {
                                            cVar5 = null;
                                            if (cVar5 == null) {
                                                IllegalArgumentException illegalArgumentException22222222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var222222222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList222222222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException22222222222, h0Var222222222222);
                                            }
                                        }
                                    } else {
                                        cVar5 = null;
                                    }
                                    if (cVar5 != null && cVar5.f258363a == 4042) {
                                        dj0.d dVarO = mo3.a.o(cVar5.f258365c);
                                        y0VarA = new y0(null, new nii.z(new TextLocalisedClause(R$string.wallet_limit_exceeded_error_title, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wallet_limit_exceeded_error_description, zhm.u.c(new MoneyClause(pyd.c.H(dVarO, mo3.a.o(cVar5.f258364b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                                    }
                                    if (y0VarA == null) {
                                        y0VarA = cVar22.a(throwable);
                                    }
                                    iVar4.X1(y0VarA);
                                } else {
                                    if (!Intrinsics.f(result8, rze.c.f258594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Unit unit2 = Unit.f186387a;
                                }
                                break;
                            } else {
                                iVar4.l1().M0(new aii.i(((rze.e) result8).f258596a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                        case 9:
                            ste.o result9 = (ste.o) obj42;
                            Intrinsics.checkNotNullParameter(result9, "result");
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar7 = iVar2;
                            boolean z4 = result9 instanceof ste.n;
                            iVar7.f90948r.f276169a = z4;
                            dj0.d dVar72 = ((TopupFlowContract$Step.GooglePayTopup) topupFlowContract$Step).f90851a.f90496a;
                            if (z4) {
                                GooglePayFee googlePayFee = ((ste.n) result9).f265568a;
                                if (googlePayFee instanceof GooglePayFee.FeeRequired) {
                                    yji.l.b1(iVar7, iVar7.X1(((c1f.a) iVar7.J).c(dVar72, ((GooglePayFee.FeeRequired) googlePayFee).f90520b)), null, new u(iVar7, dVar72, null), 3);
                                } else {
                                    iVar7.l2(new dp4.y0(iVar7, dVar72, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                                }
                            } else if (!(result9 instanceof ste.l)) {
                                if (!(result9 instanceof ste.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th10 = ((ste.m) result9).f265567a;
                                RuntimeException runtimeException = new RuntimeException("Google pay top-up error", th10);
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var3);
                                iVar7.R2(th10, dVar72.f115083b);
                            } else if (((ste.l) result9).f265566a) {
                                yki.a aVar62 = iVar7.i0;
                                String str5 = dVar72.f115083b.f306286a;
                                g gVar2 = iVar7.o;
                                oki.h.t2(iVar7, aVar62, new TopupFlowContract$Step.SelectTopupMethod(dVar72, str5, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 10:
                            ste.b result10 = (ste.b) obj42;
                            Intrinsics.checkNotNullParameter(result10, "result");
                            if (result10 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                b bVar2 = iVar4.u;
                                CardDetailsScreenDescriptor$OutputData$CardData cardData = CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result10, ((TopupFlowContract$Step.ExpiredCardDetails) topupFlowContract$Step).f90850a);
                                bVar2.getClass();
                                Intrinsics.checkNotNullParameter(cardData, "cardData");
                                bVar2.f284258a.k(cardData);
                            } else {
                                if (!(result10 instanceof ste.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Result not expected in this flow: " + result10);
                                zhm.h0 h0Var4 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var4);
                            }
                            return Unit.f186387a;
                        case 11:
                            nze.l result11 = (nze.l) obj42;
                            Intrinsics.checkNotNullParameter(result11, "result");
                            boolean z6 = result11 instanceof l.b;
                            iVar4.f90948r.f276169a = z6;
                            if (result11 instanceof l.a) {
                                Unit unit3 = Unit.f186387a;
                            } else if (result11 instanceof nze.m) {
                                iVar4.l1().M0(new aii.i(((nze.m) result11).f221037a, (aii.a) null, 6));
                            } else if (result11 instanceof nze.n) {
                                iVar4.C1(u0.b(((nze.n) result11).f221038a));
                            } else if (result11 instanceof nze.o) {
                                iVar4.C1(u0.b(((nze.o) result11).f221039a));
                            } else {
                                if (!z6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.MandateTopup) topupFlowContract$Step).f90863a.f91003a.f115083b, null, 3), new yi5.b(26));
                                Unit unit4 = Unit.f186387a;
                            }
                            return Unit.f186387a;
                        case 12:
                            o0 result12 = (o0) obj42;
                            Intrinsics.checkNotNullParameter(result12, "result");
                            if (result12 instanceof we6.m0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.b(iVar4, result12, topupFlowContract$Step, null));
                            } else {
                                if (!(result12 instanceof we6.n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.n0) result12).f296657a, null));
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar8 = iVar2;
                            yki.a aVar72 = iVar8.i0;
                            we6.p result13 = (we6.p) obj42;
                            Intrinsics.checkNotNullParameter(result13, "result");
                            if (result13 instanceof we6.q) {
                                iVar8.N2(((we6.q) result13).f296666a);
                            } else if (result13 instanceof p.a) {
                                xi0.b bVar3 = ((TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step).f90844a.f115083b;
                                aVar72.e(true);
                                iVar8.P2(bVar3);
                            } else if (result13 instanceof p.b) {
                                TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer2 = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step;
                                if (oki.h.E2(aVar72, new uwi.v(26))) {
                                    aVar72.e(false);
                                } else {
                                    String str6 = crossBorderEasyBankTransfer2.f90844a.f115083b.f306286a;
                                    g gVar3 = iVar8.o;
                                    oki.h.t2(iVar8, aVar72, new TopupFlowContract$Step.SelectTopupMethod(crossBorderEasyBankTransfer2.f90844a, str6, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                                }
                            } else {
                                if (!(result13 instanceof we6.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar8.N2(((we6.o) result13).f296658a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block27, "block");
            viewControllerE18.H = block27;
            return viewControllerE18;
        }
        if (step instanceof TopupFlowContract$Step.CardVerificationRequiredDialog) {
            dVar4.getClass();
            lw0.a aVar15 = new lw0.a(new TextLocalisedClause(R$string.topup_card_limits_verification_required_prompt_title, null, null, 14), new TextLocalisedClause(R$string.topup_card_limits_verification_required_prompt_subtitle, zhm.u.c(new TextLocalisedClause(R$string.topup_card_limits_prompt_subtitle_learn_more, null, new Click(30, (Integer) null, (Object) null, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID", false), 10)), null, 12), null, null, false, 28);
            aw0.e eVar3 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.topup_card_limits_verify_card_prompt_limit_cta_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
            k9 k9Var5 = k9.Topup;
            Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController5 = new ActionsBottomSheetController(new dii.a(aVar15, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
            final int i106 = 8;
            actionsBottomSheetController5.k2(new Function0() { // from class: uye.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i106) {
                        case 0:
                            iVar2.N.a(a4.f190702a);
                            break;
                        case 1:
                            iVar2.N.a(c4.f190720a);
                            break;
                        case 2:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 3:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 4:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 5:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 6:
                            iVar2.N.a(b4.f190713a);
                            break;
                        case 7:
                            iVar2.N.a(b4.f190713a);
                            break;
                        default:
                            iVar2.N.a(y3.f190882a);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            final int i107 = 5;
            Function1 block28 = new Function1() { // from class: uye.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj42) {
                    rye.c cVar5;
                    int i322 = i107;
                    y0 y0VarA = null;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = iVar2;
                    TopupFlowContract$Step topupFlowContract$Step = step;
                    switch (i322) {
                        case 0:
                            yye.c result = (yye.c) obj42;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof yye.a) {
                                TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) topupFlowContract$Step;
                                iVar4.V2(unverifiedCardTopUpDelayDialog.f90893a, unverifiedCardTopUpDelayDialog.f90894b);
                            } else if (!(result instanceof yye.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            ste.u result2 = (ste.u) obj42;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof ste.s)) {
                                if (!(result2 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsDialog) topupFlowContract$Step).f90883c);
                            } else if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 2:
                            ste.u result3 = (ste.u) obj42;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof ste.s)) {
                                if (!(result3 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsVerificationDialog) topupFlowContract$Step).f90886c);
                            } else if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 3:
                            ste.u result4 = (ste.u) obj42;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z = result4 instanceof ste.s;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = iVar2;
                            if (!z) {
                                if (!(result4 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) topupFlowContract$Step;
                                iVar5.n2(new sxe.g(iVar5, topUpMultiLimitsVerificationDialog.f90889c, topUpMultiLimitsVerificationDialog.d, topUpMultiLimitsVerificationDialog.f90887a, (Continuation) null, 14), new whi.b(6));
                            } else if (Intrinsics.f(((ste.s) result4).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar5.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 4:
                            we6.k0 result5 = (we6.k0) obj42;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (result5 instanceof we6.i0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.c(iVar4, result5, topupFlowContract$Step, null));
                            } else {
                                if (!(result5 instanceof we6.j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.j0) result5).f296649a, null));
                            }
                            return Unit.f186387a;
                        case 5:
                            dii.g result6 = (dii.g) obj42;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z3 = result6 instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = iVar2;
                            if (z3) {
                                TopupFlowContract$Step.CardVerificationRequiredDialog cardVerificationRequiredDialog = (TopupFlowContract$Step.CardVerificationRequiredDialog) topupFlowContract$Step;
                                iVar6.n2(new sxe.g(iVar6, cardVerificationRequiredDialog.f90834b, cardVerificationRequiredDialog.f90835c, cardVerificationRequiredDialog.f90833a, (Continuation) null, 14), new whi.b(6));
                            } else if ((result6 instanceof dii.c) && Intrinsics.f(((dii.c) result6).f115066a.f275445a, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar6.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 6:
                            til.r output = (til.r) obj42;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof til.q) {
                                iVar4.n2(new s(iVar4, topupFlowContract$Step, null, 0), new whi.b(6));
                            } else if (!(output instanceof til.n) && !(output instanceof til.o) && !(output instanceof til.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 7:
                            ExchangeGlobalAccessOutput result7 = (ExchangeGlobalAccessOutput) obj42;
                            Intrinsics.checkNotNullParameter(result7, "result");
                            if (result7 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                                iVar4.l2(new s(iVar4, topupFlowContract$Step, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 8:
                            c1f.c cVar22 = iVar4.K;
                            rze.i result8 = (rze.i) obj42;
                            Intrinsics.checkNotNullParameter(result8, "result");
                            if (!(result8 instanceof rze.e)) {
                                if (result8 instanceof rze.f) {
                                    iVar4.C1(((rze.f) result8).f258597a);
                                } else if (result8 instanceof rze.g) {
                                    iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.StoredMethodTopUp) topupFlowContract$Step).f90879a.f91020c.f115083b, null, 3), new yi5.b(26));
                                    Unit unit = Unit.f186387a;
                                } else if (result8 instanceof rze.d) {
                                    iVar4.X1(cVar22.a(((rze.d) result8).f258595a));
                                } else if (result8 instanceof rze.h) {
                                    rye.e eVar32 = iVar4.M;
                                    Throwable throwable = ((rze.h) result8).f258599a;
                                    eVar32.getClass();
                                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                                    HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                                    if (httpException != null) {
                                        r1 r1VarM = i26.l.m(httpException);
                                        String strString = r1VarM != null ? r1VarM.string() : null;
                                        if (strString != null) {
                                            try {
                                                cVar5 = (rye.c) eVar32.f258366a.b(strString, rye.c.class);
                                            } catch (Exception e) {
                                                zhm.h0 h0Var = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                                cVar5 = null;
                                            }
                                            if (cVar5 == null && httpException.code() == 4042) {
                                                IllegalArgumentException illegalArgumentException22222222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var222222222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList222222222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException22222222222, h0Var222222222222);
                                            }
                                        } else {
                                            cVar5 = null;
                                            if (cVar5 == null) {
                                                IllegalArgumentException illegalArgumentException222222222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var2222222222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList2222222222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException222222222222, h0Var2222222222222);
                                            }
                                        }
                                    } else {
                                        cVar5 = null;
                                    }
                                    if (cVar5 != null && cVar5.f258363a == 4042) {
                                        dj0.d dVarO = mo3.a.o(cVar5.f258365c);
                                        y0VarA = new y0(null, new nii.z(new TextLocalisedClause(R$string.wallet_limit_exceeded_error_title, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wallet_limit_exceeded_error_description, zhm.u.c(new MoneyClause(pyd.c.H(dVarO, mo3.a.o(cVar5.f258364b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                                    }
                                    if (y0VarA == null) {
                                        y0VarA = cVar22.a(throwable);
                                    }
                                    iVar4.X1(y0VarA);
                                } else {
                                    if (!Intrinsics.f(result8, rze.c.f258594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Unit unit2 = Unit.f186387a;
                                }
                                break;
                            } else {
                                iVar4.l1().M0(new aii.i(((rze.e) result8).f258596a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                        case 9:
                            ste.o result9 = (ste.o) obj42;
                            Intrinsics.checkNotNullParameter(result9, "result");
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar7 = iVar2;
                            boolean z4 = result9 instanceof ste.n;
                            iVar7.f90948r.f276169a = z4;
                            dj0.d dVar72 = ((TopupFlowContract$Step.GooglePayTopup) topupFlowContract$Step).f90851a.f90496a;
                            if (z4) {
                                GooglePayFee googlePayFee = ((ste.n) result9).f265568a;
                                if (googlePayFee instanceof GooglePayFee.FeeRequired) {
                                    yji.l.b1(iVar7, iVar7.X1(((c1f.a) iVar7.J).c(dVar72, ((GooglePayFee.FeeRequired) googlePayFee).f90520b)), null, new u(iVar7, dVar72, null), 3);
                                } else {
                                    iVar7.l2(new dp4.y0(iVar7, dVar72, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                                }
                            } else if (!(result9 instanceof ste.l)) {
                                if (!(result9 instanceof ste.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th10 = ((ste.m) result9).f265567a;
                                RuntimeException runtimeException = new RuntimeException("Google pay top-up error", th10);
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var3);
                                iVar7.R2(th10, dVar72.f115083b);
                            } else if (((ste.l) result9).f265566a) {
                                yki.a aVar62 = iVar7.i0;
                                String str5 = dVar72.f115083b.f306286a;
                                g gVar2 = iVar7.o;
                                oki.h.t2(iVar7, aVar62, new TopupFlowContract$Step.SelectTopupMethod(dVar72, str5, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 10:
                            ste.b result10 = (ste.b) obj42;
                            Intrinsics.checkNotNullParameter(result10, "result");
                            if (result10 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                b bVar2 = iVar4.u;
                                CardDetailsScreenDescriptor$OutputData$CardData cardData = CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result10, ((TopupFlowContract$Step.ExpiredCardDetails) topupFlowContract$Step).f90850a);
                                bVar2.getClass();
                                Intrinsics.checkNotNullParameter(cardData, "cardData");
                                bVar2.f284258a.k(cardData);
                            } else {
                                if (!(result10 instanceof ste.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Result not expected in this flow: " + result10);
                                zhm.h0 h0Var4 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var4);
                            }
                            return Unit.f186387a;
                        case 11:
                            nze.l result11 = (nze.l) obj42;
                            Intrinsics.checkNotNullParameter(result11, "result");
                            boolean z6 = result11 instanceof l.b;
                            iVar4.f90948r.f276169a = z6;
                            if (result11 instanceof l.a) {
                                Unit unit3 = Unit.f186387a;
                            } else if (result11 instanceof nze.m) {
                                iVar4.l1().M0(new aii.i(((nze.m) result11).f221037a, (aii.a) null, 6));
                            } else if (result11 instanceof nze.n) {
                                iVar4.C1(u0.b(((nze.n) result11).f221038a));
                            } else if (result11 instanceof nze.o) {
                                iVar4.C1(u0.b(((nze.o) result11).f221039a));
                            } else {
                                if (!z6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.MandateTopup) topupFlowContract$Step).f90863a.f91003a.f115083b, null, 3), new yi5.b(26));
                                Unit unit4 = Unit.f186387a;
                            }
                            return Unit.f186387a;
                        case 12:
                            o0 result12 = (o0) obj42;
                            Intrinsics.checkNotNullParameter(result12, "result");
                            if (result12 instanceof we6.m0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.b(iVar4, result12, topupFlowContract$Step, null));
                            } else {
                                if (!(result12 instanceof we6.n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.n0) result12).f296657a, null));
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar8 = iVar2;
                            yki.a aVar72 = iVar8.i0;
                            we6.p result13 = (we6.p) obj42;
                            Intrinsics.checkNotNullParameter(result13, "result");
                            if (result13 instanceof we6.q) {
                                iVar8.N2(((we6.q) result13).f296666a);
                            } else if (result13 instanceof p.a) {
                                xi0.b bVar3 = ((TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step).f90844a.f115083b;
                                aVar72.e(true);
                                iVar8.P2(bVar3);
                            } else if (result13 instanceof p.b) {
                                TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer2 = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step;
                                if (oki.h.E2(aVar72, new uwi.v(26))) {
                                    aVar72.e(false);
                                } else {
                                    String str6 = crossBorderEasyBankTransfer2.f90844a.f115083b.f306286a;
                                    g gVar3 = iVar8.o;
                                    oki.h.t2(iVar8, aVar72, new TopupFlowContract$Step.SelectTopupMethod(crossBorderEasyBankTransfer2.f90844a, str6, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                                }
                            } else {
                                if (!(result13 instanceof we6.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar8.N2(((we6.o) result13).f296658a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block28, "block");
            actionsBottomSheetController5.H = block28;
            return actionsBottomSheetController5;
        }
        if (step instanceof TopupFlowContract$Step.McyFlow) {
            McyTopupFlow mcyTopupFlow = new McyTopupFlow(((TopupFlowContract$Step.McyFlow) step).f90864a);
            uye.i block29 = new uye.i(iVar2, i99);
            Intrinsics.checkNotNullParameter(block29, "block");
            mcyTopupFlow.H = block29;
            return mcyTopupFlow;
        }
        if (step instanceof TopupFlowContract$Step.CardVerificationWorkflow) {
            WorkflowFlow workflowFlowB = til.m.b(iVar2.f90941a0, new WorkflowConfiguration.Workflow(((TopupFlowContract$Step.CardVerificationWorkflow) step).f90836a, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 122), new WorkflowFlowType.Regular(s.BACK_ARROW), null, 60);
            final int i108 = 6;
            Function1 block30 = new Function1() { // from class: uye.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj42) {
                    rye.c cVar5;
                    int i322 = i108;
                    y0 y0VarA = null;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = iVar2;
                    TopupFlowContract$Step topupFlowContract$Step = step;
                    switch (i322) {
                        case 0:
                            yye.c result = (yye.c) obj42;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof yye.a) {
                                TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) topupFlowContract$Step;
                                iVar4.V2(unverifiedCardTopUpDelayDialog.f90893a, unverifiedCardTopUpDelayDialog.f90894b);
                            } else if (!(result instanceof yye.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            ste.u result2 = (ste.u) obj42;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof ste.s)) {
                                if (!(result2 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsDialog) topupFlowContract$Step).f90883c);
                            } else if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 2:
                            ste.u result3 = (ste.u) obj42;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof ste.s)) {
                                if (!(result3 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsVerificationDialog) topupFlowContract$Step).f90886c);
                            } else if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 3:
                            ste.u result4 = (ste.u) obj42;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z = result4 instanceof ste.s;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = iVar2;
                            if (!z) {
                                if (!(result4 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) topupFlowContract$Step;
                                iVar5.n2(new sxe.g(iVar5, topUpMultiLimitsVerificationDialog.f90889c, topUpMultiLimitsVerificationDialog.d, topUpMultiLimitsVerificationDialog.f90887a, (Continuation) null, 14), new whi.b(6));
                            } else if (Intrinsics.f(((ste.s) result4).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar5.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 4:
                            we6.k0 result5 = (we6.k0) obj42;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (result5 instanceof we6.i0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.c(iVar4, result5, topupFlowContract$Step, null));
                            } else {
                                if (!(result5 instanceof we6.j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.j0) result5).f296649a, null));
                            }
                            return Unit.f186387a;
                        case 5:
                            dii.g result6 = (dii.g) obj42;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z3 = result6 instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = iVar2;
                            if (z3) {
                                TopupFlowContract$Step.CardVerificationRequiredDialog cardVerificationRequiredDialog = (TopupFlowContract$Step.CardVerificationRequiredDialog) topupFlowContract$Step;
                                iVar6.n2(new sxe.g(iVar6, cardVerificationRequiredDialog.f90834b, cardVerificationRequiredDialog.f90835c, cardVerificationRequiredDialog.f90833a, (Continuation) null, 14), new whi.b(6));
                            } else if ((result6 instanceof dii.c) && Intrinsics.f(((dii.c) result6).f115066a.f275445a, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar6.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 6:
                            til.r output = (til.r) obj42;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof til.q) {
                                iVar4.n2(new s(iVar4, topupFlowContract$Step, null, 0), new whi.b(6));
                            } else if (!(output instanceof til.n) && !(output instanceof til.o) && !(output instanceof til.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 7:
                            ExchangeGlobalAccessOutput result7 = (ExchangeGlobalAccessOutput) obj42;
                            Intrinsics.checkNotNullParameter(result7, "result");
                            if (result7 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                                iVar4.l2(new s(iVar4, topupFlowContract$Step, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 8:
                            c1f.c cVar22 = iVar4.K;
                            rze.i result8 = (rze.i) obj42;
                            Intrinsics.checkNotNullParameter(result8, "result");
                            if (!(result8 instanceof rze.e)) {
                                if (result8 instanceof rze.f) {
                                    iVar4.C1(((rze.f) result8).f258597a);
                                } else if (result8 instanceof rze.g) {
                                    iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.StoredMethodTopUp) topupFlowContract$Step).f90879a.f91020c.f115083b, null, 3), new yi5.b(26));
                                    Unit unit = Unit.f186387a;
                                } else if (result8 instanceof rze.d) {
                                    iVar4.X1(cVar22.a(((rze.d) result8).f258595a));
                                } else if (result8 instanceof rze.h) {
                                    rye.e eVar32 = iVar4.M;
                                    Throwable throwable = ((rze.h) result8).f258599a;
                                    eVar32.getClass();
                                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                                    HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                                    if (httpException != null) {
                                        r1 r1VarM = i26.l.m(httpException);
                                        String strString = r1VarM != null ? r1VarM.string() : null;
                                        if (strString != null) {
                                            try {
                                                cVar5 = (rye.c) eVar32.f258366a.b(strString, rye.c.class);
                                            } catch (Exception e) {
                                                zhm.h0 h0Var = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                                cVar5 = null;
                                            }
                                            if (cVar5 == null && httpException.code() == 4042) {
                                                IllegalArgumentException illegalArgumentException222222222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var2222222222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList2222222222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException222222222222, h0Var2222222222222);
                                            }
                                        } else {
                                            cVar5 = null;
                                            if (cVar5 == null) {
                                                IllegalArgumentException illegalArgumentException2222222222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var22222222222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList22222222222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2222222222222, h0Var22222222222222);
                                            }
                                        }
                                    } else {
                                        cVar5 = null;
                                    }
                                    if (cVar5 != null && cVar5.f258363a == 4042) {
                                        dj0.d dVarO = mo3.a.o(cVar5.f258365c);
                                        y0VarA = new y0(null, new nii.z(new TextLocalisedClause(R$string.wallet_limit_exceeded_error_title, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wallet_limit_exceeded_error_description, zhm.u.c(new MoneyClause(pyd.c.H(dVarO, mo3.a.o(cVar5.f258364b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                                    }
                                    if (y0VarA == null) {
                                        y0VarA = cVar22.a(throwable);
                                    }
                                    iVar4.X1(y0VarA);
                                } else {
                                    if (!Intrinsics.f(result8, rze.c.f258594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Unit unit2 = Unit.f186387a;
                                }
                                break;
                            } else {
                                iVar4.l1().M0(new aii.i(((rze.e) result8).f258596a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                        case 9:
                            ste.o result9 = (ste.o) obj42;
                            Intrinsics.checkNotNullParameter(result9, "result");
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar7 = iVar2;
                            boolean z4 = result9 instanceof ste.n;
                            iVar7.f90948r.f276169a = z4;
                            dj0.d dVar72 = ((TopupFlowContract$Step.GooglePayTopup) topupFlowContract$Step).f90851a.f90496a;
                            if (z4) {
                                GooglePayFee googlePayFee = ((ste.n) result9).f265568a;
                                if (googlePayFee instanceof GooglePayFee.FeeRequired) {
                                    yji.l.b1(iVar7, iVar7.X1(((c1f.a) iVar7.J).c(dVar72, ((GooglePayFee.FeeRequired) googlePayFee).f90520b)), null, new u(iVar7, dVar72, null), 3);
                                } else {
                                    iVar7.l2(new dp4.y0(iVar7, dVar72, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                                }
                            } else if (!(result9 instanceof ste.l)) {
                                if (!(result9 instanceof ste.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th10 = ((ste.m) result9).f265567a;
                                RuntimeException runtimeException = new RuntimeException("Google pay top-up error", th10);
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var3);
                                iVar7.R2(th10, dVar72.f115083b);
                            } else if (((ste.l) result9).f265566a) {
                                yki.a aVar62 = iVar7.i0;
                                String str5 = dVar72.f115083b.f306286a;
                                g gVar2 = iVar7.o;
                                oki.h.t2(iVar7, aVar62, new TopupFlowContract$Step.SelectTopupMethod(dVar72, str5, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 10:
                            ste.b result10 = (ste.b) obj42;
                            Intrinsics.checkNotNullParameter(result10, "result");
                            if (result10 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                b bVar2 = iVar4.u;
                                CardDetailsScreenDescriptor$OutputData$CardData cardData = CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result10, ((TopupFlowContract$Step.ExpiredCardDetails) topupFlowContract$Step).f90850a);
                                bVar2.getClass();
                                Intrinsics.checkNotNullParameter(cardData, "cardData");
                                bVar2.f284258a.k(cardData);
                            } else {
                                if (!(result10 instanceof ste.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Result not expected in this flow: " + result10);
                                zhm.h0 h0Var4 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var4);
                            }
                            return Unit.f186387a;
                        case 11:
                            nze.l result11 = (nze.l) obj42;
                            Intrinsics.checkNotNullParameter(result11, "result");
                            boolean z6 = result11 instanceof l.b;
                            iVar4.f90948r.f276169a = z6;
                            if (result11 instanceof l.a) {
                                Unit unit3 = Unit.f186387a;
                            } else if (result11 instanceof nze.m) {
                                iVar4.l1().M0(new aii.i(((nze.m) result11).f221037a, (aii.a) null, 6));
                            } else if (result11 instanceof nze.n) {
                                iVar4.C1(u0.b(((nze.n) result11).f221038a));
                            } else if (result11 instanceof nze.o) {
                                iVar4.C1(u0.b(((nze.o) result11).f221039a));
                            } else {
                                if (!z6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.MandateTopup) topupFlowContract$Step).f90863a.f91003a.f115083b, null, 3), new yi5.b(26));
                                Unit unit4 = Unit.f186387a;
                            }
                            return Unit.f186387a;
                        case 12:
                            o0 result12 = (o0) obj42;
                            Intrinsics.checkNotNullParameter(result12, "result");
                            if (result12 instanceof we6.m0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.b(iVar4, result12, topupFlowContract$Step, null));
                            } else {
                                if (!(result12 instanceof we6.n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.n0) result12).f296657a, null));
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar8 = iVar2;
                            yki.a aVar72 = iVar8.i0;
                            we6.p result13 = (we6.p) obj42;
                            Intrinsics.checkNotNullParameter(result13, "result");
                            if (result13 instanceof we6.q) {
                                iVar8.N2(((we6.q) result13).f296666a);
                            } else if (result13 instanceof p.a) {
                                xi0.b bVar3 = ((TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step).f90844a.f115083b;
                                aVar72.e(true);
                                iVar8.P2(bVar3);
                            } else if (result13 instanceof p.b) {
                                TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer2 = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step;
                                if (oki.h.E2(aVar72, new uwi.v(26))) {
                                    aVar72.e(false);
                                } else {
                                    String str6 = crossBorderEasyBankTransfer2.f90844a.f115083b.f306286a;
                                    g gVar3 = iVar8.o;
                                    oki.h.t2(iVar8, aVar72, new TopupFlowContract$Step.SelectTopupMethod(crossBorderEasyBankTransfer2.f90844a, str6, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                                }
                            } else {
                                if (!(result13 instanceof we6.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar8.N2(((we6.o) result13).f296658a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block30, "block");
            workflowFlowB.H = block30;
            return workflowFlowB;
        }
        if (step instanceof TopupFlowContract$Step.PayNowTopUp) {
            return iVar2.e1(new g7a.a(2, ((TopupFlowContract$Step.PayNowTopUp) step).f90868a));
        }
        if (step instanceof TopupFlowContract$Step.PixSmartTransfer) {
            ViewController viewControllerE19 = iVar2.e1(new we6.j(new BrazilInboundOpenbankingDescriptor$InputData(false)));
            uye.j block31 = new uye.j(iVar2, step, FlowCoordinator, i99);
            Intrinsics.checkNotNullParameter(block31, "block");
            viewControllerE19.H = block31;
            return viewControllerE19;
        }
        if (step instanceof TopupFlowContract$Step.PixSmartTransferMandateConfirmation) {
            TopupFlowContract$Step.PixSmartTransferMandateConfirmation pixSmartTransferMandateConfirmation = (TopupFlowContract$Step.PixSmartTransferMandateConfirmation) step;
            ViewController viewControllerE110 = iVar2.e1(new we6.e(new BrazilInboundMandateConfirmationDescriptor$InputData(pixSmartTransferMandateConfirmation.f90872c, pixSmartTransferMandateConfirmation.d, pixSmartTransferMandateConfirmation.f90870a, pixSmartTransferMandateConfirmation.e, pixSmartTransferMandateConfirmation.f90871b, pw5.a.K(gVar.f284276b, gVar.f284275a))));
            uye.j block32 = new uye.j(iVar2, FlowCoordinator, step, 4);
            Intrinsics.checkNotNullParameter(block32, "block");
            viewControllerE110.H = block32;
            return viewControllerE110;
        }
        if (step instanceof TopupFlowContract$Step.ExchangeGlobalAccess) {
            k9 k9Var6 = k9.Accounts;
            Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
            ViewController viewControllerE111 = iVar2.e1(new l89.c(((TopupFlowContract$Step.ExchangeGlobalAccess) step).f90849b, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6)));
            final int i109 = 7;
            Function1 block33 = new Function1() { // from class: uye.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj42) {
                    rye.c cVar5;
                    int i322 = i109;
                    y0 y0VarA = null;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = iVar2;
                    TopupFlowContract$Step topupFlowContract$Step = step;
                    switch (i322) {
                        case 0:
                            yye.c result = (yye.c) obj42;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof yye.a) {
                                TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (TopupFlowContract$Step.UnverifiedCardTopUpDelayDialog) topupFlowContract$Step;
                                iVar4.V2(unverifiedCardTopUpDelayDialog.f90893a, unverifiedCardTopUpDelayDialog.f90894b);
                            } else if (!(result instanceof yye.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            ste.u result2 = (ste.u) obj42;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof ste.s)) {
                                if (!(result2 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsDialog) topupFlowContract$Step).f90883c);
                            } else if (Intrinsics.f(((ste.s) result2).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 2:
                            ste.u result3 = (ste.u) obj42;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof ste.s)) {
                                if (!(result3 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.P2(((TopupFlowContract$Step.TopUpLimitsVerificationDialog) topupFlowContract$Step).f90886c);
                            } else if (Intrinsics.f(((ste.s) result3).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar4.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 3:
                            ste.u result4 = (ste.u) obj42;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z = result4 instanceof ste.s;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = iVar2;
                            if (!z) {
                                if (!(result4 instanceof ste.t)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopupFlowContract$Step.TopUpMultiLimitsVerificationDialog) topupFlowContract$Step;
                                iVar5.n2(new sxe.g(iVar5, topUpMultiLimitsVerificationDialog.f90889c, topUpMultiLimitsVerificationDialog.d, topUpMultiLimitsVerificationDialog.f90887a, (Continuation) null, 14), new whi.b(6));
                            } else if (Intrinsics.f(((ste.s) result4).f265574a.f275445a, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar5.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 4:
                            we6.k0 result5 = (we6.k0) obj42;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            if (result5 instanceof we6.i0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.c(iVar4, result5, topupFlowContract$Step, null));
                            } else {
                                if (!(result5 instanceof we6.j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.j0) result5).f296649a, null));
                            }
                            return Unit.f186387a;
                        case 5:
                            dii.g result6 = (dii.g) obj42;
                            Intrinsics.checkNotNullParameter(result6, "result");
                            boolean z3 = result6 instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = iVar2;
                            if (z3) {
                                TopupFlowContract$Step.CardVerificationRequiredDialog cardVerificationRequiredDialog = (TopupFlowContract$Step.CardVerificationRequiredDialog) topupFlowContract$Step;
                                iVar6.n2(new sxe.g(iVar6, cardVerificationRequiredDialog.f90834b, cardVerificationRequiredDialog.f90835c, cardVerificationRequiredDialog.f90833a, (Continuation) null, 14), new whi.b(6));
                            } else if ((result6 instanceof dii.c) && Intrinsics.f(((dii.c) result6).f115066a.f275445a, "CARD_VERIFICATION_REQUIRED_DESCRIPTION_LEARN_MORE_ID")) {
                                iVar6.T2("question.card-deposit-limits-and-fees");
                            }
                            return Unit.f186387a;
                        case 6:
                            til.r output = (til.r) obj42;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof til.q) {
                                iVar4.n2(new s(iVar4, topupFlowContract$Step, null, 0), new whi.b(6));
                            } else if (!(output instanceof til.n) && !(output instanceof til.o) && !(output instanceof til.p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 7:
                            ExchangeGlobalAccessOutput result7 = (ExchangeGlobalAccessOutput) obj42;
                            Intrinsics.checkNotNullParameter(result7, "result");
                            if (result7 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                                iVar4.l2(new s(iVar4, topupFlowContract$Step, null, 1), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        case 8:
                            c1f.c cVar22 = iVar4.K;
                            rze.i result8 = (rze.i) obj42;
                            Intrinsics.checkNotNullParameter(result8, "result");
                            if (!(result8 instanceof rze.e)) {
                                if (result8 instanceof rze.f) {
                                    iVar4.C1(((rze.f) result8).f258597a);
                                } else if (result8 instanceof rze.g) {
                                    iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.StoredMethodTopUp) topupFlowContract$Step).f90879a.f91020c.f115083b, null, 3), new yi5.b(26));
                                    Unit unit = Unit.f186387a;
                                } else if (result8 instanceof rze.d) {
                                    iVar4.X1(cVar22.a(((rze.d) result8).f258595a));
                                } else if (result8 instanceof rze.h) {
                                    rye.e eVar32 = iVar4.M;
                                    Throwable throwable = ((rze.h) result8).f258599a;
                                    eVar32.getClass();
                                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                                    HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
                                    if (httpException != null) {
                                        r1 r1VarM = i26.l.m(httpException);
                                        String strString = r1VarM != null ? r1VarM.string() : null;
                                        if (strString != null) {
                                            try {
                                                cVar5 = (rye.c) eVar32.f258366a.b(strString, rye.c.class);
                                            } catch (Exception e) {
                                                zhm.h0 h0Var = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                                                cVar5 = null;
                                            }
                                            if (cVar5 == null && httpException.code() == 4042) {
                                                IllegalArgumentException illegalArgumentException2222222222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var22222222222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList22222222222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2222222222222, h0Var22222222222222);
                                            }
                                        } else {
                                            cVar5 = null;
                                            if (cVar5 == null) {
                                                IllegalArgumentException illegalArgumentException22222222222222 = new IllegalArgumentException(j6.a.q("Can't parse from ", strString));
                                                zhm.h0 h0Var222222222222222 = zhm.h0.f322473a;
                                                CopyOnWriteArrayList copyOnWriteArrayList222222222222222 = rd0.d.f253311a;
                                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException22222222222222, h0Var222222222222222);
                                            }
                                        }
                                    } else {
                                        cVar5 = null;
                                    }
                                    if (cVar5 != null && cVar5.f258363a == 4042) {
                                        dj0.d dVarO = mo3.a.o(cVar5.f258365c);
                                        y0VarA = new y0(null, new nii.z(new TextLocalisedClause(R$string.wallet_limit_exceeded_error_title, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wallet_limit_exceeded_error_description, zhm.u.c(new MoneyClause(pyd.c.H(dVarO, mo3.a.o(cVar5.f258364b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
                                    }
                                    if (y0VarA == null) {
                                        y0VarA = cVar22.a(throwable);
                                    }
                                    iVar4.X1(y0VarA);
                                } else {
                                    if (!Intrinsics.f(result8, rze.c.f258594a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Unit unit2 = Unit.f186387a;
                                }
                                break;
                            } else {
                                iVar4.l1().M0(new aii.i(((rze.e) result8).f258596a, (aii.a) null, 6));
                            }
                            return Unit.f186387a;
                        case 9:
                            ste.o result9 = (ste.o) obj42;
                            Intrinsics.checkNotNullParameter(result9, "result");
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar7 = iVar2;
                            boolean z4 = result9 instanceof ste.n;
                            iVar7.f90948r.f276169a = z4;
                            dj0.d dVar72 = ((TopupFlowContract$Step.GooglePayTopup) topupFlowContract$Step).f90851a.f90496a;
                            if (z4) {
                                GooglePayFee googlePayFee = ((ste.n) result9).f265568a;
                                if (googlePayFee instanceof GooglePayFee.FeeRequired) {
                                    yji.l.b1(iVar7, iVar7.X1(((c1f.a) iVar7.J).c(dVar72, ((GooglePayFee.FeeRequired) googlePayFee).f90520b)), null, new u(iVar7, dVar72, null), 3);
                                } else {
                                    iVar7.l2(new dp4.y0(iVar7, dVar72, R$string.topup_completed_title, (Continuation) null, 16), new yi5.b(26));
                                }
                            } else if (!(result9 instanceof ste.l)) {
                                if (!(result9 instanceof ste.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Throwable th10 = ((ste.m) result9).f265567a;
                                RuntimeException runtimeException = new RuntimeException("Google pay top-up error", th10);
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var3);
                                iVar7.R2(th10, dVar72.f115083b);
                            } else if (((ste.l) result9).f265566a) {
                                yki.a aVar62 = iVar7.i0;
                                String str5 = dVar72.f115083b.f306286a;
                                g gVar2 = iVar7.o;
                                oki.h.t2(iVar7, aVar62, new TopupFlowContract$Step.SelectTopupMethod(dVar72, str5, pw5.a.K(gVar2.f284276b, gVar2.f284275a)), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 10:
                            ste.b result10 = (ste.b) obj42;
                            Intrinsics.checkNotNullParameter(result10, "result");
                            if (result10 instanceof CardDetailsScreenDescriptor$OutputData$CardData) {
                                b bVar2 = iVar4.u;
                                CardDetailsScreenDescriptor$OutputData$CardData cardData = CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result10, ((TopupFlowContract$Step.ExpiredCardDetails) topupFlowContract$Step).f90850a);
                                bVar2.getClass();
                                Intrinsics.checkNotNullParameter(cardData, "cardData");
                                bVar2.f284258a.k(cardData);
                            } else {
                                if (!(result10 instanceof ste.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Result not expected in this flow: " + result10);
                                zhm.h0 h0Var4 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var4);
                            }
                            return Unit.f186387a;
                        case 11:
                            nze.l result11 = (nze.l) obj42;
                            Intrinsics.checkNotNullParameter(result11, "result");
                            boolean z6 = result11 instanceof l.b;
                            iVar4.f90948r.f276169a = z6;
                            if (result11 instanceof l.a) {
                                Unit unit3 = Unit.f186387a;
                            } else if (result11 instanceof nze.m) {
                                iVar4.l1().M0(new aii.i(((nze.m) result11).f221037a, (aii.a) null, 6));
                            } else if (result11 instanceof nze.n) {
                                iVar4.C1(u0.b(((nze.n) result11).f221038a));
                            } else if (result11 instanceof nze.o) {
                                iVar4.C1(u0.b(((nze.o) result11).f221039a));
                            } else {
                                if (!z6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.l2(new w(iVar4, ((TopupFlowContract$Step.MandateTopup) topupFlowContract$Step).f90863a.f91003a.f115083b, null, 3), new yi5.b(26));
                                Unit unit4 = Unit.f186387a;
                            }
                            return Unit.f186387a;
                        case 12:
                            o0 result12 = (o0) obj42;
                            Intrinsics.checkNotNullParameter(result12, "result");
                            if (result12 instanceof we6.m0) {
                                iVar4.g3(new com.revolut.feature.topup_screen.impl.flows.topup.flow.b(iVar4, result12, topupFlowContract$Step, null));
                            } else {
                                if (!(result12 instanceof we6.n0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar4.C1(new ExternalDestination.Browser(((we6.n0) result12).f296657a, null));
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar8 = iVar2;
                            yki.a aVar72 = iVar8.i0;
                            we6.p result13 = (we6.p) obj42;
                            Intrinsics.checkNotNullParameter(result13, "result");
                            if (result13 instanceof we6.q) {
                                iVar8.N2(((we6.q) result13).f296666a);
                            } else if (result13 instanceof p.a) {
                                xi0.b bVar3 = ((TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step).f90844a.f115083b;
                                aVar72.e(true);
                                iVar8.P2(bVar3);
                            } else if (result13 instanceof p.b) {
                                TopupFlowContract$Step.CrossBorderEasyBankTransfer crossBorderEasyBankTransfer2 = (TopupFlowContract$Step.CrossBorderEasyBankTransfer) topupFlowContract$Step;
                                if (oki.h.E2(aVar72, new uwi.v(26))) {
                                    aVar72.e(false);
                                } else {
                                    String str6 = crossBorderEasyBankTransfer2.f90844a.f115083b.f306286a;
                                    g gVar3 = iVar8.o;
                                    oki.h.t2(iVar8, aVar72, new TopupFlowContract$Step.SelectTopupMethod(crossBorderEasyBankTransfer2.f90844a, str6, pw5.a.K(gVar3.f284276b, gVar3.f284275a)), false, null, false, 12);
                                }
                            } else {
                                if (!(result13 instanceof we6.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iVar8.N2(((we6.o) result13).f296658a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block33, "block");
            viewControllerE111.H = block33;
            return viewControllerE111;
        }
        if (!(step instanceof TopupFlowContract$Step.BeDrivenFeesBottomSheet)) {
            throw new NoWhenBranchMatchedException();
        }
        sye.a aVar16 = iVar2.g0;
        qte.c fee2 = ((TopupFlowContract$Step.BeDrivenFeesBottomSheet) step).f90830a;
        aVar16.getClass();
        Intrinsics.checkNotNullParameter(fee2, "fee");
        lw0.a aVar17 = new lw0.a(new TextClause(fee2.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30);
        aim.e eVarB = zhm.u.b();
        Iterator it9 = fee2.e.f249099b.iterator();
        while (it9.hasNext()) {
            eVarB.add(sye.a.a((qte.a) it9.next()));
        }
        Iterator it10 = fee2.f.f249099b.iterator();
        while (it10.hasNext()) {
            eVarB.add(sye.a.a((qte.a) it10.next()));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        int i110 = R$attr.uikit_dp16;
        yp0.b.k(eVarA, i110, i110, 0, 0, 28);
        return new TopUpFeesBottomSheetScreen(new sye.e(aVar17, eVarA));
    }

    private final Object b(Object obj2, Object obj3) {
        CurrencyChooserFlowDestination.StartType currencyChooser;
        com.revolut.feature_crypto_order_flow.impl.exchange.d dVar = (com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f281302b;
        l2j.a aVar = dVar.f96751x;
        b1i.a aVar2 = dVar.z;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CryptoExchangeScreenContract$ModalStep step = (CryptoExchangeScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        int i = 1;
        if (step instanceof CryptoExchangeScreenContract$ModalStep.RecurringSettings) {
            CryptoExchangeScreenContract$ModalStep.RecurringSettings recurringSettings = (CryptoExchangeScreenContract$ModalStep.RecurringSettings) step;
            ViewController viewControllerE1 = dVar.e1(new iua.c(new iua.a(recurringSettings.f96735a, recurringSettings.f96736b)));
            uyh.q block = new uyh.q(dVar, i);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (step instanceof CryptoExchangeScreenContract$ModalStep.LimitSettings) {
            TakeProfitStopLossParams params = ((CryptoExchangeScreenContract$ModalStep.LimitSettings) step).f96733a;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(params, "params");
            TakeProfitStopLossController takeProfitStopLossController = new TakeProfitStopLossController(new TakeProfitStopLossControllerContract$InputData(params));
            uif.d block2 = new uif.d(dVar, step, 27);
            Intrinsics.checkNotNullParameter(block2, "block");
            takeProfitStopLossController.H = block2;
            return takeProfitStopLossController;
        }
        int i2 = 2;
        if (step instanceof CryptoExchangeScreenContract$ModalStep.TpslSettings) {
            TakeProfitStopLossParams params2 = ((CryptoExchangeScreenContract$ModalStep.TpslSettings) step).f96737a;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(params2, "params");
            TakeProfitStopLossController takeProfitStopLossController2 = new TakeProfitStopLossController(new TakeProfitStopLossControllerContract$InputData(params2));
            uyh.q block3 = new uyh.q(dVar, i2);
            Intrinsics.checkNotNullParameter(block3, "block");
            takeProfitStopLossController2.H = block3;
            return takeProfitStopLossController2;
        }
        if (!(step instanceof CryptoExchangeScreenContract$ModalStep.CurrencyPicker)) {
            if (step instanceof CryptoExchangeScreenContract$ModalStep.BalanceBreakdown) {
                CryptoExchangeScreenContract$ModalStep.BalanceBreakdown balanceBreakdown = (CryptoExchangeScreenContract$ModalStep.BalanceBreakdown) step;
                dj0.d dVar2 = balanceBreakdown.f96724a;
                StakingPocket stakingPocket = balanceBreakdown.f96725b;
                dj0.d dVar3 = balanceBreakdown.f96726c;
                k9 k9Var = k9.Crypto;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new BalanceBreakdownBottomSheetController(new vyh.a(dVar2, stakingPocket, dVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
            }
            if (!(step instanceof CryptoExchangeScreenContract$ModalStep.CryptoBalanceBreakdown)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewController viewControllerE12 = dVar.e1(new fh5.a(new CryptoBalanceBreakdownInputData(((CryptoExchangeScreenContract$ModalStep.CryptoBalanceBreakdown) step).f96727a.f306286a, true)));
            uif.d block4 = new uif.d(viewControllerE12, dVar, 28);
            Intrinsics.checkNotNullParameter(block4, "block");
            viewControllerE12.H = block4;
            return viewControllerE12;
        }
        CryptoExchangeScreenContract$ModalStep.CurrencyPicker currencyPicker = (CryptoExchangeScreenContract$ModalStep.CurrencyPicker) step;
        if (currencyPicker instanceof CryptoExchangeScreenContract$ModalStep.CurrencyPicker.Buy) {
            CryptoExchangeScreenContract$ModalStep.CurrencyPicker.Buy buy = (CryptoExchangeScreenContract$ModalStep.CurrencyPicker.Buy) step;
            CryptoOrderDraft cryptoOrderDraft = buy.f96728a;
            String strA = oyh.b.a(cryptoOrderDraft.f96690b.e);
            xi0.b bVar = cryptoOrderDraft.f96690b.f96683a;
            io3.l lVar = io3.l.CURRENT;
            Set setB = zhm.y0.b(cryptoOrderDraft.f96689a.f96683a.f306286a);
            aim.o oVar = new aim.o();
            oVar.add(k1j.a.POCKETS);
            oVar.add(k1j.a.CRYPTO);
            oVar.add(k1j.a.REVOLUT_X_FIAT);
            if (buy.f96729b) {
                oVar.add(k1j.a.VAULTS);
            }
            if (buy.f96730c) {
                oVar.add(k1j.a.SAVINGS);
            }
            if (buy.d) {
                oVar.add(k1j.a.JOINT_ACCOUNT);
            }
            if (cryptoOrderDraft.f == wd6.h.MARKET && dVar.N2()) {
                oVar.add(k1j.a.REV_POINTS);
            }
            Unit unit = Unit.f186387a;
            CurrencyChooserFlow currencyChooserFlowA = aVar.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.BalancePicker(strA, bVar, lVar, (Set) null, setB, (Set) zhm.y0.a(oVar), new TextLocalisedClause(com.revolut.feature_crypto_order_flow.api.R$string.cryptobuysell_balance_picker_buy_title, null, null, 14), true, (Integer) null, zhm.y0.b(BalanceSelector$ExtraConfiguration.ShowDisclaimerForCryptoAndCommodity.f99375a), 536)));
            uyh.q qVar = new uyh.q(dVar, 3);
            Intrinsics.checkNotNullParameter(qVar, "<set-?>");
            currencyChooserFlowA.J = qVar;
            return currencyChooserFlowA;
        }
        if (!(currencyPicker instanceof CryptoExchangeScreenContract$ModalStep.CurrencyPicker.Sell)) {
            throw new NoWhenBranchMatchedException();
        }
        CryptoExchangeScreenContract$ModalStep.CurrencyPicker.Sell sell = (CryptoExchangeScreenContract$ModalStep.CurrencyPicker.Sell) step;
        Set set = sell.f96732b;
        CryptoOrderDraft cryptoOrderDraft2 = sell.f96731a;
        if (((jte.d) dVar.f96750w).c(CryptoExchangeFeatureApi$Toggles$BalancePickerCryptoSellFlow.f96676c)) {
            Set set2 = set;
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : set2) {
                if (cp5.d.A((xi0.b) obj4)) {
                    arrayList.add(obj4);
                }
            }
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((xi0.b) it8.next()).f306286a);
            }
            Set setI1 = d0.i1(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj5 : set2) {
                if (cp5.d.z((xi0.b) obj5)) {
                    arrayList3.add(obj5);
                }
            }
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            Iterator it9 = arrayList3.iterator();
            while (it9.hasNext()) {
                arrayList4.add(((xi0.b) it9.next()).f306286a);
            }
            Set setI12 = d0.i1(arrayList4);
            String strA2 = oyh.b.a(cryptoOrderDraft2.f96690b.e);
            xi0.b bVar2 = cryptoOrderDraft2.f96690b.f96683a;
            io3.l lVar2 = io3.l.CURRENT;
            aim.o oVar2 = new aim.o();
            oVar2.add(k1j.a.POCKETS);
            oVar2.add(k1j.a.CRYPTO);
            aim.o oVarA = zhm.y0.a(oVar2);
            Set setB2 = zhm.y0.b(cryptoOrderDraft2.f96689a.f96683a.f306286a);
            h0 h0Var = h0.f322473a;
            BalanceSelector$ExtraConfiguration[] elements = {BalanceSelector$ExtraConfiguration.SearchEnabled.f99374a, new BalanceSelector$ExtraConfiguration.AdditionalCurrenciesButton(setI1, setI12, h0Var, h0Var, h0Var)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            currencyChooser = new CurrencyChooserFlowDestination.StartType.BalancePicker(strA2, bVar2, lVar2, (Set) null, setB2, (Set) oVarA, (TextLocalisedClause) null, true, (Integer) null, kotlin.collections.d.y0(elements), 664);
        } else {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj6 : set) {
                if (!Intrinsics.f((xi0.b) obj6, cryptoOrderDraft2.f96689a.f96683a)) {
                    arrayList5.add(obj6);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj7 : arrayList5) {
                if (!cp5.d.y((xi0.b) obj7)) {
                    arrayList6.add(obj7);
                }
            }
            currencyChooser = new CurrencyChooserFlowDestination.StartType.CurrencyChooser(null, null, cryptoOrderDraft2.f96690b.f96683a, arrayList6, null, null, 51);
        }
        CurrencyChooserFlow currencyChooserFlowA2 = aVar.a(new CurrencyChooserFlowDestination.InputData(currencyChooser));
        uyh.q qVar2 = new uyh.q(dVar, 4);
        Intrinsics.checkNotNullParameter(qVar2, "<set-?>");
        currencyChooserFlowA2.J = qVar2;
        return currencyChooserFlowA2;
    }

    private final Object c(Object obj2, Object obj3) {
        final com.revolut.feature.topup_screen.impl.screens.card_details.b bVar = (com.revolut.feature.topup_screen.impl.screens.card_details.b) this.f281302b;
        owe.a aVar = bVar.C;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CardDetailsScreenContract$ModalStep step = (CardDetailsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, CardDetailsScreenContract$ModalStep.IndiaAddCardConsent.f91089a)) {
            aVar.getClass();
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.topup_add_new_card_store_card_details_consent_title, null, null, 14), new HtmlLocalisedClause(R$string.topup_add_new_card_store_card_details_consent_subtitle_with_terms_and_conditions, (List) null, (Integer) null, (Object) null, 30), null, null, false, 28);
            aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.topup_add_new_card_store_card_details_consent_primary_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.topup_add_new_card_store_card_details_consent_secondary_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
            k9 k9Var = k9.Topup;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            final int i = 0;
            Function1 block = new Function1() { // from class: v0f.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    dii.g result = (dii.g) obj4;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.screens.card_details.b bVar2 = bVar;
                            if (z) {
                                bVar2.J2(Boolean.TRUE);
                            } else if (result instanceof dii.f) {
                                bVar2.J2(Boolean.FALSE);
                            } else if (result instanceof dii.c) {
                                bVar2.C1(new ExternalDestination.Browser("https://www.revolut.com/en-IN/legal/terms/", null));
                            }
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z3 = result instanceof dii.e;
                            com.revolut.feature.topup_screen.impl.screens.card_details.b bVar3 = bVar;
                            if (z3) {
                                bVar3.J2(Boolean.TRUE);
                            } else if (result instanceof dii.f) {
                                bVar3.J2(Boolean.FALSE);
                            } else if (result instanceof dii.c) {
                                bVar3.C1(new ExternalDestination.Browser(((dii.c) result).f115066a.f275445a, null));
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            actionsBottomSheetController.H = block;
            return actionsBottomSheetController;
        }
        if (!Intrinsics.f(step, CardDetailsScreenContract$ModalStep.IsraelAddCardConsent.f91090a)) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.getClass();
        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.topup_add_new_card_store_card_details_consent_title, null, null, 14), new TextLocalisedClause(R$string.topup_add_new_card_store_card_details_consent_subtitle4, zhm.u.c(new TextLocalisedClause(R$string.topup_add_new_card_store_card_details_consent_t_and_c, null, new Click(30, (Integer) null, (Object) null, "https://www.revolut.com/en-IL/legal/terms/", false), 10)), null, 12), null, null, false, 28);
        aw0.h hVar2 = new aw0.h(false, new n6(new TextLocalisedClause(R$string.topup_add_new_card_store_card_details_consent_primary_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.topup_add_new_card_store_card_details_consent_secondary_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
        k9 k9Var2 = k9.Topup;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar3, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
        final int i2 = 1;
        Function1 block2 = new Function1() { // from class: v0f.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                dii.g result = (dii.g) obj4;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z = result instanceof dii.e;
                        com.revolut.feature.topup_screen.impl.screens.card_details.b bVar2 = bVar;
                        if (z) {
                            bVar2.J2(Boolean.TRUE);
                        } else if (result instanceof dii.f) {
                            bVar2.J2(Boolean.FALSE);
                        } else if (result instanceof dii.c) {
                            bVar2.C1(new ExternalDestination.Browser("https://www.revolut.com/en-IN/legal/terms/", null));
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z3 = result instanceof dii.e;
                        com.revolut.feature.topup_screen.impl.screens.card_details.b bVar3 = bVar;
                        if (z3) {
                            bVar3.J2(Boolean.TRUE);
                        } else if (result instanceof dii.f) {
                            bVar3.J2(Boolean.FALSE);
                        } else if (result instanceof dii.c) {
                            bVar3.C1(new ExternalDestination.Browser(((dii.c) result).f115066a.f275445a, null));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        actionsBottomSheetController2.H = block2;
        return actionsBottomSheetController2;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.feature.freelancer.impl.ui.subaccount.prompt.flow.a aVar = (com.revolut.feature.freelancer.impl.ui.subaccount.prompt.flow.a) this.f281302b;
        yki.l FlowCoordinator = (yki.l) obj2;
        FreelancerCreateSubaccountPromptFlowContract$Step step = (FreelancerCreateSubaccountPromptFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, FreelancerCreateSubaccountPromptFlowContract$Step.Onboarding.f74229a)) {
            return new FreelancerOnboardingFlow(new FreelancerOnboardingFlowContract$InputData((FreelancerOnboardingArticleConfig) null, FreelancerOnboardingNavStrategy.NavigateToMain.f73261a, 3));
        }
        if (!Intrinsics.f(step, FreelancerCreateSubaccountPromptFlowContract$Step.Prompt.f74230a)) {
            throw new NoWhenBranchMatchedException();
        }
        w27.b bVar = aVar.o;
        v27.c promptType = aVar.f74231p.f74228a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(promptType, "promptType");
        int[] iArr = w27.a.f293968a;
        if (iArr[promptType.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_popup_pro_pocket_title, null, null, 14);
        if (iArr[promptType.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_popup_pro_pocket_description, null, null, 14);
        if (iArr[promptType.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        if (iArr[promptType.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D259", null, null, null, 30);
        if (iArr[promptType.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause, textLocalisedClause2, cdnImageC, null, null, resourceImage, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_popup_pro_pocket_action_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368));
        k0 block = new k0(aVar, FlowCoordinator, 13);
        Intrinsics.checkNotNullParameter(block, "block");
        promptMarketingScreen.H = block;
        return promptMarketingScreen;
    }

    /* JADX WARN: Type inference failed for: r0v162, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) throws Throwable {
        ViewController creditCardDirectDebitFlow;
        Object objA;
        BackupCardContent backupCardContent;
        int i;
        TextLocalisedClause textLocalisedClause;
        int i2 = this.f281301a;
        final int i3 = 3;
        final int i5 = 1;
        Object obj3 = this.f281302b;
        switch (i2) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new d((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), AnimatedBackgroundType.Base.PERFORMANCE_STATIC, ((q) obj3).a(), f0.f322471a);
            case 1:
                com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.a aVar = (com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.a) obj3;
                yki.l FlowCoordinator = (yki.l) obj2;
                CooldownCheckerFlowContract$Step step = (CooldownCheckerFlowContract$Step) data;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!Intrinsics.f(step, CooldownCheckerFlowContract$Step.DeviceCooldownActive.f66102a)) {
                    throw new NoWhenBranchMatchedException();
                }
                CooldownCheckerFlowContract$InputData cooldownCheckerFlowContract$InputData = aVar.o;
                CooldownCheckFailedScreen cooldownCheckFailedScreen = new CooldownCheckFailedScreen(new CooldownCheckFailedScreenContract$InputData(cooldownCheckerFlowContract$InputData.f66100a, cooldownCheckerFlowContract$InputData.f66101b));
                um7.d block = new um7.d(aVar, 4);
                Intrinsics.checkNotNullParameter(block, "block");
                cooldownCheckFailedScreen.H = block;
                return cooldownCheckFailedScreen;
            case 2:
                String juniorId = (String) obj2;
                List devices = (List) data;
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                Intrinsics.checkNotNullParameter(devices, "devices");
                ((un8.b) obj3).f281356b.f(un8.b.a(juniorId), devices);
                return Unit.f186387a;
            case 3:
                String juniorUserId = (String) obj2;
                jn8.b config = (jn8.b) data;
                Intrinsics.checkNotNullParameter(juniorUserId, "juniorUserId");
                Intrinsics.checkNotNullParameter(config, "config");
                ((un8.k) obj3).f281374b.f("JUNIOR_SIGN_IN_CONFIG_KEY" + juniorUserId, config);
                return Unit.f186387a;
            case 4:
                final com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.a aVar2 = (com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.a) obj3;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AutoEarnRewardsControllerContract$Steps step2 = (AutoEarnRewardsControllerContract$Steps) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (Intrinsics.f(step2, AutoEarnRewardsControllerContract$Steps.FlexibleConsentDialogStep.f81442a)) {
                    ViewController viewControllerE1 = aVar2.e1(new aq6.f(new aq6.b(true)));
                    final int i6 = 0;
                    Function1 block2 = new Function1() { // from class: una.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i6) {
                                case 0:
                                    aq6.e result = (aq6.e) obj4;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof aq6.c) {
                                        com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.a aVar3 = aVar2;
                                        aVar3.X1(aVar3.f81443p.a(true));
                                    }
                                    break;
                                default:
                                    dii.g result2 = (dii.g) obj4;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof dii.e) {
                                        com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.a aVar4 = aVar2;
                                        aVar4.A1(new u83.f(aVar4, null, 15), new yi5.b(25));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    viewControllerE1.H = block2;
                    return viewControllerE1;
                }
                if (!Intrinsics.f(step2, AutoEarnRewardsControllerContract$Steps.DisableConsentStep.f81441a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActionsBottomSheetController actionsBottomSheetControllerA = aVar2.f81444q.a();
                Function1 block3 = new Function1() { // from class: una.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        switch (i5) {
                            case 0:
                                aq6.e result = (aq6.e) obj4;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof aq6.c) {
                                    com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.a aVar3 = aVar2;
                                    aVar3.X1(aVar3.f81443p.a(true));
                                }
                                break;
                            default:
                                dii.g result2 = (dii.g) obj4;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof dii.e) {
                                    com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.a aVar4 = aVar2;
                                    aVar4.A1(new u83.f(aVar4, null, 15), new yi5.b(25));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block3, "block");
                actionsBottomSheetControllerA.H = block3;
                return actionsBottomSheetControllerA;
            case 5:
                PenContributionScreen penContributionScreen = (PenContributionScreen) obj3;
                AmountEditDelegate.Model model = (AmountEditDelegate.Model) obj2;
                AmountEditView view = (AmountEditView) data;
                KProperty[] kPropertyArr = PenContributionScreen.Z;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(view, "view");
                Object obj4 = model.f51629j;
                if (!(obj4 instanceof uoc.b)) {
                    return null;
                }
                MaskedTextInputEditText editText = view.getEditText();
                xi0.b bVar = ((uoc.b) obj4).f281603a;
                qd0.b bVarN = ((dmc.j) penContributionScreen.W.getValue()).f115972b.f116031h.n();
                vc.s.j(bVarN);
                return new zp0.d(editText, bVar, new u80.d(((s80.b) bVarN).b()), null, new t(penContributionScreen, 4), false, false, 0, false, null, 2024);
            case 6:
                up0.l0 l0Var = (up0.l0) obj3;
                i0 failedThread = (i0) obj2;
                Exception exception = (Exception) data;
                int i21 = up0.l0.u;
                Intrinsics.checkNotNullParameter(failedThread, "failedThread");
                Intrinsics.checkNotNullParameter(exception, "exception");
                if (l0Var.f281736h == failedThread) {
                    l0Var.f281736h = null;
                    l0Var.i = false;
                    l0Var.a();
                    l0Var.e();
                    hx7.e.n(exception);
                }
                return Unit.f186387a;
            case 7:
                com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c cVar = (com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c) obj3;
                CreditCardSetupAutopayFlowContract$InputData creditCardSetupAutopayFlowContract$InputData = cVar.o;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                CreditCardSetupAutopayFlowContract$Step step3 = (CreditCardSetupAutopayFlowContract$Step) data;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof CreditCardSetupAutopayFlowContract$Step.ProductArticle) {
                    wi0.b bVar2 = cVar.N2().f69079j;
                    wi0.b.Companion.getClass();
                    ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(new CreditCardArticleKey.Autopay(Intrinsics.f(bVar2, wi0.b.p0) ? bVar2 : null)));
                    k9 k9Var = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    ViewController viewControllerE12 = cVar.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, false, 52));
                    up4.d block4 = new up4.d(cVar, 5);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    viewControllerE12.H = block4;
                    return viewControllerE12;
                }
                if (step3 instanceof CreditCardSetupAutopayFlowContract$Step.SetDate) {
                    f0 f0Var = f0.f322471a;
                    CreditCardAutopayPayment.PaymentDay paymentDay = cVar.N2().f;
                    SetDateScreen setDateScreen = new SetDateScreen(new SetDateContract$InputData(f0Var, paymentDay != null ? Integer.valueOf(paymentDay.f70717b) : null, false, cVar.N2().f69076c, com.revolut.feature.credit_card.autopay.api.models_v3.d.b(cVar.N2().b().f70734a), null));
                    up4.d dVar = new up4.d(cVar, i5);
                    Intrinsics.checkNotNullParameter(dVar, "<set-?>");
                    setDateScreen.H = dVar;
                    return setDateScreen;
                }
                boolean z = step3 instanceof CreditCardSetupAutopayFlowContract$Step.SetAmount;
                RepaymentSource.RevolutWallet revolutWallet = RepaymentSource.RevolutWallet.f68559a;
                if (z) {
                    xi0.b bVar3 = cVar.N2().f69075b;
                    CreditCardAutopayPayment.PaymentAmount paymentAmount = cVar.N2().e;
                    CreditScheduledAmountType creditScheduledAmountTypeA = paymentAmount != null ? com.revolut.feature.credit_card.autopay.api.models_v3.d.a(paymentAmount) : null;
                    SetAmountFlowContract$RepaymentInfo setAmountFlowContract$RepaymentInfo = new SetAmountFlowContract$RepaymentInfo(revolutWallet, cVar.N2().f69077g.size() > 1);
                    vj4.a aVar3 = cVar.f69096y;
                    wi0.b bVar4 = cVar.N2().f69079j;
                    CreditCardAutopayContent creditCardAutopayContent = cVar.N2().f69074a.f70694b;
                    SetAmountRootFlow setAmountRootFlow = new SetAmountRootFlow(new SetAmountFlowContract$InputData(bVar3, creditScheduledAmountTypeA, true, setAmountFlowContract$RepaymentInfo, ((dk4.a) aVar3).a(bVar4, creditCardAutopayContent != null ? creditCardAutopayContent.f70702a : null), null, 32));
                    up4.d dVar2 = new up4.d(cVar, setAmountRootFlow);
                    Intrinsics.checkNotNullParameter(dVar2, "<set-?>");
                    setAmountRootFlow.J = dVar2;
                    return setAmountRootFlow;
                }
                if (!(step3 instanceof CreditCardSetupAutopayFlowContract$Step.ConfirmAutoPay)) {
                    if (step3 instanceof CreditCardSetupAutopayFlowContract$Step.SelectPaymentMethod) {
                        SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.ToolbarConfig toolbarConfig = new SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.ToolbarConfig(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_autopay_select_repayment_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_autopay_select_payment_description, null, null, 14));
                        SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.ItemConfig.ChevronItem chevronItem = cVar.N2().f69074a.b() != null ? new SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.ItemConfig.ChevronItem(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_autopay_select_payment_revolut_account_title, zhm.u.c(new CurrencyClause(cVar.N2().f69075b, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_autopay_select_payment_revolut_account_description, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D202", null, null, null, 30)) : null;
                        CreditCardAutopayType.DirectDebit directDebitA = cVar.N2().f69074a.a();
                        creditCardDirectDebitFlow = new SelectAutopayMethodV3Screen(new SelectAutopayMethodV3ScreenContract$InputData(new SelectAutopayMethodV3ScreenContract$SelectAutopayConfig(toolbarConfig, chevronItem, directDebitA != null ? new SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.ItemConfig.ChevronItem(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_autopay_select_payment_external_account_title, null, null, 14), new TextLocalisedQuantityClause(R$plurals.credit_card_autopay_select_payment_external_account_description_dynamic, Integer.valueOf(directDebitA.f), (List) null, (Style) null, 28), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D205", null, null, null, 30)) : null), null));
                        up4.d block5 = new up4.d(cVar, 9);
                        Intrinsics.checkNotNullParameter(block5, "block");
                        creditCardDirectDebitFlow.H = block5;
                    } else {
                        if (!(step3 instanceof CreditCardSetupAutopayFlowContract$Step.DirectDebit)) {
                            if (step3 instanceof CreditCardSetupAutopayFlowContract$Step.Picker) {
                                ViewController viewControllerE13 = cVar.e1(new g1j.a(pw5.a.u(cVar.N2().i, cVar.N2().f69078h.getF68556a()), cVar.f69092s));
                                up4.d block6 = new up4.d(cVar, i3);
                                Intrinsics.checkNotNullParameter(block6, "block");
                                viewControllerE13.H = block6;
                                return viewControllerE13;
                            }
                            if (!(step3 instanceof CreditCardSetupAutopayFlowContract$Step.SetupBackupCard)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            SelectPaymentRootFlow selectPaymentRootFlowA = zwc.a.a(cVar.f69094w, null, null, null, 31);
                            up4.d block7 = new up4.d(cVar, 7);
                            Intrinsics.checkNotNullParameter(block7, "block");
                            selectPaymentRootFlowA.H = block7;
                            return selectPaymentRootFlowA;
                        }
                        CreditCardAutopayType creditCardAutopayType = cVar.N2().d;
                        Intrinsics.i(creditCardAutopayType, "null cannot be cast to non-null type com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType.DirectDebit");
                        creditCardDirectDebitFlow = new CreditCardDirectDebitFlow(new CreditCardDirectDebitV3FlowContract$InputData(creditCardSetupAutopayFlowContract$InputData.getF69072a(), (CreditCardAutopayType.DirectDebit) creditCardAutopayType));
                        up4.d block8 = new up4.d(cVar, 6);
                        Intrinsics.checkNotNullParameter(block8, "block");
                        creditCardDirectDebitFlow.H = block8;
                    }
                    return creditCardDirectDebitFlow;
                }
                bp4.a aVar4 = cVar.v;
                CreditCardSetupAutopayFlowContract$State.Content contentN2 = cVar.N2();
                RepaymentSource repaymentSource = contentN2.f69078h;
                CreditCardAutopayType creditCardAutopayType2 = contentN2.d;
                wi0.b bVar5 = contentN2.f69079j;
                if (!(creditCardAutopayType2 instanceof CreditCardAutopayType.RevolutPocket)) {
                    if (creditCardAutopayType2 == null) {
                        throw new IllegalArgumentException("Payment type is null");
                    }
                    throw new IllegalArgumentException(j6.a.q("Unsupported payment type: ", kotlin.jvm.internal.o0.f186429a.b(creditCardAutopayType2.getClass()).m()));
                }
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (repaymentSource == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                objA = repaymentSource;
                Throwable thA = yhm.m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                if (objA instanceof yhm.n) {
                    objA = null;
                }
                RepaymentSource repaymentSource2 = (RepaymentSource) objA;
                RepaymentSource repaymentSource3 = repaymentSource2 == null ? revolutWallet : repaymentSource2;
                String f69072a = creditCardSetupAutopayFlowContract$InputData.getF69072a();
                CreditCardAutopayPayment.PaymentDay paymentDay2 = contentN2.f;
                if (paymentDay2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                CreditCardAutopayPayment.PaymentAmount paymentAmount2 = contentN2.e;
                if (paymentAmount2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                nb5.e eVar = contentN2.b().f70734a;
                String f68556a = repaymentSource.getF68556a();
                Integer num = contentN2.b().f70737g;
                Intrinsics.checkNotNullParameter(new com.revolut.feature.credit_card.autopay.api.models_v3.b(eVar, paymentDay2, paymentAmount2, f68556a, num), "<this>");
                CreditCardAutoPayDataRequest creditCardAutoPayDataRequest = new CreditCardAutoPayDataRequest(repaymentSource3, f69072a, new AutoPayRequest.Setup(paymentDay2.f70716a == nb5.b.FIXED ? paymentDay2.f70717b : 0, com.revolut.feature.credit_card.autopay.api.models_v3.d.a(paymentAmount2), com.revolut.feature.credit_card.autopay.api.models_v3.d.b(eVar), paymentDay2.f70716a, num), contentN2.f69075b, contentN2.k, cVar.L2());
                ConfirmAutopayContract$PaymentUiStyle.Custom custom = new ConfirmAutopayContract$PaymentUiStyle.Custom(true);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_direct_debit_confirmation_title, null, null, 14);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_direct_debit_confirmation_subtitle, null, null, 14);
                aVar4.getClass();
                TextLocalisedClause textLocalisedClauseB = bp4.a.b(bVar5);
                CreditCardAutopayContent creditCardAutopayContent2 = contentN2.f69074a.f70694b;
                ConfirmAutopayScreen confirmAutopayScreen = new ConfirmAutopayScreen(new ConfirmAutopayContract$InputData.CreditCard(creditCardAutoPayDataRequest, null, custom, new ConfirmAutopayContract$ScreenConfig(textLocalisedClause2, textLocalisedClause3, null, new ConfirmAutopayContract$ScreenConfig.BackUpCardInfoDialogConfig(textLocalisedClauseB, bp4.a.a((creditCardAutopayContent2 == null || (backupCardContent = creditCardAutopayContent2.f70703b) == null) ? null : backupCardContent.f70692b, bVar5)), 4), 2));
                up4.d block9 = new up4.d(cVar, 8);
                Intrinsics.checkNotNullParameter(block9, "block");
                confirmAutopayScreen.H = block9;
                return confirmAutopayScreen;
            case 8:
                CenteredAmountDelegate.Model model2 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) data;
                KProperty[] kPropertyArr2 = CustomBillScreen.f79238d0;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = model2.f51981p;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection_custom.CustomBillContract.AmountParcel");
                up9.a aVar5 = (up9.a) obj5;
                return new zp0.d(field.getEditText(), aVar5.f281919b, new u80.d(aVar5.f281918a), null, new tul.b((CustomBillScreen) obj3, 5), false, false, 0, false, null, 1960);
            case 9:
                com.revolut.feature.tax_residency.impl.v2.ui.list.a aVar6 = (com.revolut.feature.tax_residency.impl.v2.ui.list.a) obj3;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TaxResidencyListScreenContract$ModalStep step4 = (TaxResidencyListScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof TaxResidencyListScreenContract$ModalStep.WhatIsTaxResidency)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar6.f90272s.getClass();
                return new ActionsBottomSheetController(lpe.e.a());
            case 10:
                com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.a aVar7 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.a) obj3;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditCardChooseFutureInstalmentsScreenContract$ModalStep step5 = (CreditCardChooseFutureInstalmentsScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof CreditCardChooseFutureInstalmentsScreenContract$ModalStep.SelectInstalment)) {
                    if (!(step5 instanceof CreditCardChooseFutureInstalmentsScreenContract$ModalStep.InterestSaved)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_repay_choose_future_instalments_dialog_interest_saved_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_repay_choose_future_instalments_dialog_interest_saved_description, null, null, 14);
                    BottomSheet.ActionItem actionItem = new BottomSheet.ActionItem(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_got_it, null, null, 14), null);
                    k9 k9Var2 = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    return BottomSheet.b(textLocalisedClause4, textLocalisedClause5, null, null, actionItem, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), 172);
                }
                lw0.a aVar8 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_anticipation_select_instalment_select_instalment, null, null, 14), null, null, null, false, 30);
                yp4.a aVar9 = new yp4.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_select, null, null, 14));
                List<CreditCardFutureInstalmentQuote> list = aVar7.I2().f282424c.f68773a;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (CreditCardFutureInstalmentQuote creditCardFutureInstalmentQuote : list) {
                    int i22 = R$plurals.credit_card_statement_financing_setup_dialog_select_instalments_item;
                    int i32 = creditCardFutureInstalmentQuote.f68769b;
                    arrayList.add(new yp4.b(new TextLocalisedQuantityClause(i22, Integer.valueOf(i32), v.k(Integer.valueOf(i32), sx4.f.b(3, null, null, creditCardFutureInstalmentQuote.d)), (Style) null, 24), Integer.valueOf(i32)));
                }
                PickerBottomSheetController pickerBottomSheetController = new PickerBottomSheetController(new yp4.c(aVar8, aVar9, arrayList, aVar7.I2().f282424c.f68773a.indexOf(aVar7.I2().b())));
                um7.d block10 = new um7.d(aVar7, 25);
                Intrinsics.checkNotNullParameter(block10, "block");
                pickerBottomSheetController.H = block10;
                return pickerBottomSheetController;
            case 11:
                final com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar6 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b) obj3;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                AsftMainFlowContract$Step step6 = (AsftMainFlowContract$Step) data;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof AsftMainFlowContract$Step.Home) {
                    AsftHomeScreen asftHomeScreen = new AsftHomeScreen(new AsftHomeScreenContract$InputData(((AsftMainFlowContract$Step.Home) step6).f98763a));
                    final int i33 = 2;
                    Function1 block11 = new Function1() { // from class: uti.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i33) {
                                case 0:
                                    qui.e result = (qui.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, qui.c.f249457a);
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar7 = bVar6;
                                    if (zF) {
                                        bVar7.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("36f20c89-a61c-4ee1-99b5-6c7b492297b9", 2))));
                                    } else if (result instanceof qui.d) {
                                        bVar7.C1(new ExternalDestination.Browser(((qui.d) result).f249458a, null));
                                    } else {
                                        if (!(result instanceof qui.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        qui.b bVar8 = (qui.b) result;
                                        h.w2(bVar7.u, new AsftMainFlowContract$Step.CancelBooking(bVar8.f249454a, bVar8.f249455b, bVar8.f249456c, bVar8.d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    vti.d result2 = (vti.d) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof vti.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar9 = bVar6;
                                    bVar9.l2(new j(bVar9, result2, null, 9), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    n result3 = (n) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z3 = result3 instanceof hui.l;
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar10 = bVar6;
                                    if (z3) {
                                        h.t2(bVar10, bVar10.u, AsftMainFlowContract$Step.Booking.f98759a, true, null, false, 12);
                                    } else {
                                        if (!(result3 instanceof hui.m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String str = ((hui.m) result3).f155685a;
                                        ZoomTarget.ListId listId = new ZoomTarget.ListId(str);
                                        i iVar = bVar10.u;
                                        AsftMainFlowContract$Step.PassDetails passDetails = new AsftMainFlowContract$Step.PassDetails(str, null);
                                        TransitionAnimation.Companion companion3 = TransitionAnimation.INSTANCE;
                                        HomeOverlayConfig.INSTANCE.getClass();
                                        h.t2(bVar10, iVar, passDetails, true, com.revolut.kompot.common.transition.a.d(companion3, listId, HomeOverlayConfig.f59654b), false, 8);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    lui.g result4 = (lui.g) obj6;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!(result4 instanceof lui.f)) {
                                        if (!(result4 instanceof lui.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar11 = bVar6;
                                        bVar11.l2(new j(bVar11, (lui.e) result4, null, 8), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a result5 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a) obj6;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (!Intrinsics.f(result5, a.C0601a.f98859a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar12 = bVar6;
                                    h.r2(bVar12.u);
                                    h.t2(bVar12, bVar12.u, new AsftMainFlowContract$Step.Home(null), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    return Unit.f186387a;
                                default:
                                    kui.f result6 = (kui.f) obj6;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    if (!(result6 instanceof kui.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.w2(bVar6.u, new AsftMainFlowContract$Step.ManageBooking(result6.f189822a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    asftHomeScreen.H = block11;
                    return asftHomeScreen;
                }
                if (step6 instanceof AsftMainFlowContract$Step.PassDetails) {
                    if (!((jte.d) bVar6.o).c(AsftApi$Toggles$AsftTicketStylePass.f98707c)) {
                        AsftPassDetailsLegacyScreen asftPassDetailsLegacyScreen = new AsftPassDetailsLegacyScreen(new AsftPassDetailsLegacyScreenContract$InputData(((AsftMainFlowContract$Step.PassDetails) step6).f98765a, true));
                        final int i43 = 4;
                        Function1 block12 = new Function1() { // from class: uti.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                switch (i43) {
                                    case 0:
                                        qui.e result = (qui.e) obj6;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        boolean zF = Intrinsics.f(result, qui.c.f249457a);
                                        com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar7 = bVar6;
                                        if (zF) {
                                            bVar7.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("36f20c89-a61c-4ee1-99b5-6c7b492297b9", 2))));
                                        } else if (result instanceof qui.d) {
                                            bVar7.C1(new ExternalDestination.Browser(((qui.d) result).f249458a, null));
                                        } else {
                                            if (!(result instanceof qui.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            qui.b bVar8 = (qui.b) result;
                                            h.w2(bVar7.u, new AsftMainFlowContract$Step.CancelBooking(bVar8.f249454a, bVar8.f249455b, bVar8.f249456c, bVar8.d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        vti.d result2 = (vti.d) obj6;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (!(result2 instanceof vti.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar9 = bVar6;
                                        bVar9.l2(new j(bVar9, result2, null, 9), new yi5.b(26));
                                        return Unit.f186387a;
                                    case 2:
                                        n result3 = (n) obj6;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        boolean z3 = result3 instanceof hui.l;
                                        com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar10 = bVar6;
                                        if (z3) {
                                            h.t2(bVar10, bVar10.u, AsftMainFlowContract$Step.Booking.f98759a, true, null, false, 12);
                                        } else {
                                            if (!(result3 instanceof hui.m)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            String str = ((hui.m) result3).f155685a;
                                            ZoomTarget.ListId listId = new ZoomTarget.ListId(str);
                                            i iVar = bVar10.u;
                                            AsftMainFlowContract$Step.PassDetails passDetails = new AsftMainFlowContract$Step.PassDetails(str, null);
                                            TransitionAnimation.Companion companion3 = TransitionAnimation.INSTANCE;
                                            HomeOverlayConfig.INSTANCE.getClass();
                                            h.t2(bVar10, iVar, passDetails, true, com.revolut.kompot.common.transition.a.d(companion3, listId, HomeOverlayConfig.f59654b), false, 8);
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        lui.g result4 = (lui.g) obj6;
                                        Intrinsics.checkNotNullParameter(result4, "result");
                                        if (!(result4 instanceof lui.f)) {
                                            if (!(result4 instanceof lui.e)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar11 = bVar6;
                                            bVar11.l2(new j(bVar11, (lui.e) result4, null, 8), new yi5.b(26));
                                        }
                                        return Unit.f186387a;
                                    case 4:
                                        com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a result5 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a) obj6;
                                        Intrinsics.checkNotNullParameter(result5, "result");
                                        if (!Intrinsics.f(result5, a.C0601a.f98859a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar12 = bVar6;
                                        h.r2(bVar12.u);
                                        h.t2(bVar12, bVar12.u, new AsftMainFlowContract$Step.Home(null), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                        return Unit.f186387a;
                                    default:
                                        kui.f result6 = (kui.f) obj6;
                                        Intrinsics.checkNotNullParameter(result6, "result");
                                        if (!(result6 instanceof kui.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.w2(bVar6.u, new AsftMainFlowContract$Step.ManageBooking(result6.f189822a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block12, "block");
                        asftPassDetailsLegacyScreen.H = block12;
                        return asftPassDetailsLegacyScreen;
                    }
                    AsftMainFlowContract$Step.PassDetails passDetails = (AsftMainFlowContract$Step.PassDetails) step6;
                    AsftPassDetailsScreen asftPassDetailsScreen = new AsftPassDetailsScreen(new AsftPassDetailsScreenContract$InputData(passDetails.f98765a, passDetails.f98766b));
                    final int i59 = 5;
                    Function1 block13 = new Function1() { // from class: uti.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i59) {
                                case 0:
                                    qui.e result = (qui.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, qui.c.f249457a);
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar7 = bVar6;
                                    if (zF) {
                                        bVar7.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("36f20c89-a61c-4ee1-99b5-6c7b492297b9", 2))));
                                    } else if (result instanceof qui.d) {
                                        bVar7.C1(new ExternalDestination.Browser(((qui.d) result).f249458a, null));
                                    } else {
                                        if (!(result instanceof qui.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        qui.b bVar8 = (qui.b) result;
                                        h.w2(bVar7.u, new AsftMainFlowContract$Step.CancelBooking(bVar8.f249454a, bVar8.f249455b, bVar8.f249456c, bVar8.d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    vti.d result2 = (vti.d) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof vti.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar9 = bVar6;
                                    bVar9.l2(new j(bVar9, result2, null, 9), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    n result3 = (n) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z3 = result3 instanceof hui.l;
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar10 = bVar6;
                                    if (z3) {
                                        h.t2(bVar10, bVar10.u, AsftMainFlowContract$Step.Booking.f98759a, true, null, false, 12);
                                    } else {
                                        if (!(result3 instanceof hui.m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String str = ((hui.m) result3).f155685a;
                                        ZoomTarget.ListId listId = new ZoomTarget.ListId(str);
                                        i iVar = bVar10.u;
                                        AsftMainFlowContract$Step.PassDetails passDetails2 = new AsftMainFlowContract$Step.PassDetails(str, null);
                                        TransitionAnimation.Companion companion3 = TransitionAnimation.INSTANCE;
                                        HomeOverlayConfig.INSTANCE.getClass();
                                        h.t2(bVar10, iVar, passDetails2, true, com.revolut.kompot.common.transition.a.d(companion3, listId, HomeOverlayConfig.f59654b), false, 8);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    lui.g result4 = (lui.g) obj6;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!(result4 instanceof lui.f)) {
                                        if (!(result4 instanceof lui.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar11 = bVar6;
                                        bVar11.l2(new j(bVar11, (lui.e) result4, null, 8), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a result5 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a) obj6;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (!Intrinsics.f(result5, a.C0601a.f98859a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar12 = bVar6;
                                    h.r2(bVar12.u);
                                    h.t2(bVar12, bVar12.u, new AsftMainFlowContract$Step.Home(null), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    return Unit.f186387a;
                                default:
                                    kui.f result6 = (kui.f) obj6;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    if (!(result6 instanceof kui.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.w2(bVar6.u, new AsftMainFlowContract$Step.ManageBooking(result6.f189822a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    asftPassDetailsScreen.H = block13;
                    return asftPassDetailsScreen;
                }
                if (Intrinsics.f(step6, AsftMainFlowContract$Step.Booking.f98759a)) {
                    AsftPassBookingFlow asftPassBookingFlow = new AsftPassBookingFlow();
                    Function1 block14 = new Function1() { // from class: uti.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    qui.e result = (qui.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, qui.c.f249457a);
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar7 = bVar6;
                                    if (zF) {
                                        bVar7.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("36f20c89-a61c-4ee1-99b5-6c7b492297b9", 2))));
                                    } else if (result instanceof qui.d) {
                                        bVar7.C1(new ExternalDestination.Browser(((qui.d) result).f249458a, null));
                                    } else {
                                        if (!(result instanceof qui.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        qui.b bVar8 = (qui.b) result;
                                        h.w2(bVar7.u, new AsftMainFlowContract$Step.CancelBooking(bVar8.f249454a, bVar8.f249455b, bVar8.f249456c, bVar8.d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    vti.d result2 = (vti.d) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof vti.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar9 = bVar6;
                                    bVar9.l2(new j(bVar9, result2, null, 9), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    n result3 = (n) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z3 = result3 instanceof hui.l;
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar10 = bVar6;
                                    if (z3) {
                                        h.t2(bVar10, bVar10.u, AsftMainFlowContract$Step.Booking.f98759a, true, null, false, 12);
                                    } else {
                                        if (!(result3 instanceof hui.m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String str = ((hui.m) result3).f155685a;
                                        ZoomTarget.ListId listId = new ZoomTarget.ListId(str);
                                        i iVar = bVar10.u;
                                        AsftMainFlowContract$Step.PassDetails passDetails2 = new AsftMainFlowContract$Step.PassDetails(str, null);
                                        TransitionAnimation.Companion companion3 = TransitionAnimation.INSTANCE;
                                        HomeOverlayConfig.INSTANCE.getClass();
                                        h.t2(bVar10, iVar, passDetails2, true, com.revolut.kompot.common.transition.a.d(companion3, listId, HomeOverlayConfig.f59654b), false, 8);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    lui.g result4 = (lui.g) obj6;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!(result4 instanceof lui.f)) {
                                        if (!(result4 instanceof lui.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar11 = bVar6;
                                        bVar11.l2(new j(bVar11, (lui.e) result4, null, 8), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a result5 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a) obj6;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (!Intrinsics.f(result5, a.C0601a.f98859a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar12 = bVar6;
                                    h.r2(bVar12.u);
                                    h.t2(bVar12, bVar12.u, new AsftMainFlowContract$Step.Home(null), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    return Unit.f186387a;
                                default:
                                    kui.f result6 = (kui.f) obj6;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    if (!(result6 instanceof kui.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.w2(bVar6.u, new AsftMainFlowContract$Step.ManageBooking(result6.f189822a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block14, "block");
                    asftPassBookingFlow.H = block14;
                    return asftPassBookingFlow;
                }
                if (step6 instanceof AsftMainFlowContract$Step.ManageBooking) {
                    AsftManageBookingScreen asftManageBookingScreen = new AsftManageBookingScreen(((AsftMainFlowContract$Step.ManageBooking) step6).f98764a);
                    final int i66 = 0;
                    Function1 block15 = new Function1() { // from class: uti.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i66) {
                                case 0:
                                    qui.e result = (qui.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, qui.c.f249457a);
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar7 = bVar6;
                                    if (zF) {
                                        bVar7.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("36f20c89-a61c-4ee1-99b5-6c7b492297b9", 2))));
                                    } else if (result instanceof qui.d) {
                                        bVar7.C1(new ExternalDestination.Browser(((qui.d) result).f249458a, null));
                                    } else {
                                        if (!(result instanceof qui.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        qui.b bVar8 = (qui.b) result;
                                        h.w2(bVar7.u, new AsftMainFlowContract$Step.CancelBooking(bVar8.f249454a, bVar8.f249455b, bVar8.f249456c, bVar8.d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    vti.d result2 = (vti.d) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof vti.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar9 = bVar6;
                                    bVar9.l2(new j(bVar9, result2, null, 9), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    n result3 = (n) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z3 = result3 instanceof hui.l;
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar10 = bVar6;
                                    if (z3) {
                                        h.t2(bVar10, bVar10.u, AsftMainFlowContract$Step.Booking.f98759a, true, null, false, 12);
                                    } else {
                                        if (!(result3 instanceof hui.m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String str = ((hui.m) result3).f155685a;
                                        ZoomTarget.ListId listId = new ZoomTarget.ListId(str);
                                        i iVar = bVar10.u;
                                        AsftMainFlowContract$Step.PassDetails passDetails2 = new AsftMainFlowContract$Step.PassDetails(str, null);
                                        TransitionAnimation.Companion companion3 = TransitionAnimation.INSTANCE;
                                        HomeOverlayConfig.INSTANCE.getClass();
                                        h.t2(bVar10, iVar, passDetails2, true, com.revolut.kompot.common.transition.a.d(companion3, listId, HomeOverlayConfig.f59654b), false, 8);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    lui.g result4 = (lui.g) obj6;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!(result4 instanceof lui.f)) {
                                        if (!(result4 instanceof lui.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar11 = bVar6;
                                        bVar11.l2(new j(bVar11, (lui.e) result4, null, 8), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a result5 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a) obj6;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (!Intrinsics.f(result5, a.C0601a.f98859a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar12 = bVar6;
                                    h.r2(bVar12.u);
                                    h.t2(bVar12, bVar12.u, new AsftMainFlowContract$Step.Home(null), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    return Unit.f186387a;
                                default:
                                    kui.f result6 = (kui.f) obj6;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    if (!(result6 instanceof kui.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.w2(bVar6.u, new AsftMainFlowContract$Step.ManageBooking(result6.f189822a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block15, "block");
                    asftManageBookingScreen.H = block15;
                    return asftManageBookingScreen;
                }
                if (!(step6 instanceof AsftMainFlowContract$Step.CancelBooking)) {
                    throw new NoWhenBranchMatchedException();
                }
                AsftMainFlowContract$Step.CancelBooking cancelBooking = (AsftMainFlowContract$Step.CancelBooking) step6;
                AsftCancelBookingScreen asftCancelBookingScreen = new AsftCancelBookingScreen(new AsftCancelBookingScreenContract$InputData(cancelBooking.f98760a, cancelBooking.f98761b, cancelBooking.f98762c, cancelBooking.d));
                Function1 block16 = new Function1() { // from class: uti.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i3) {
                            case 0:
                                qui.e result = (qui.e) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean zF = Intrinsics.f(result, qui.c.f249457a);
                                com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar7 = bVar6;
                                if (zF) {
                                    bVar7.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("36f20c89-a61c-4ee1-99b5-6c7b492297b9", 2))));
                                } else if (result instanceof qui.d) {
                                    bVar7.C1(new ExternalDestination.Browser(((qui.d) result).f249458a, null));
                                } else {
                                    if (!(result instanceof qui.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    qui.b bVar8 = (qui.b) result;
                                    h.w2(bVar7.u, new AsftMainFlowContract$Step.CancelBooking(bVar8.f249454a, bVar8.f249455b, bVar8.f249456c, bVar8.d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                }
                                return Unit.f186387a;
                            case 1:
                                vti.d result2 = (vti.d) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (!(result2 instanceof vti.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar9 = bVar6;
                                bVar9.l2(new j(bVar9, result2, null, 9), new yi5.b(26));
                                return Unit.f186387a;
                            case 2:
                                n result3 = (n) obj6;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                boolean z3 = result3 instanceof hui.l;
                                com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar10 = bVar6;
                                if (z3) {
                                    h.t2(bVar10, bVar10.u, AsftMainFlowContract$Step.Booking.f98759a, true, null, false, 12);
                                } else {
                                    if (!(result3 instanceof hui.m)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    String str = ((hui.m) result3).f155685a;
                                    ZoomTarget.ListId listId = new ZoomTarget.ListId(str);
                                    i iVar = bVar10.u;
                                    AsftMainFlowContract$Step.PassDetails passDetails2 = new AsftMainFlowContract$Step.PassDetails(str, null);
                                    TransitionAnimation.Companion companion3 = TransitionAnimation.INSTANCE;
                                    HomeOverlayConfig.INSTANCE.getClass();
                                    h.t2(bVar10, iVar, passDetails2, true, com.revolut.kompot.common.transition.a.d(companion3, listId, HomeOverlayConfig.f59654b), false, 8);
                                }
                                return Unit.f186387a;
                            case 3:
                                lui.g result4 = (lui.g) obj6;
                                Intrinsics.checkNotNullParameter(result4, "result");
                                if (!(result4 instanceof lui.f)) {
                                    if (!(result4 instanceof lui.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar11 = bVar6;
                                    bVar11.l2(new j(bVar11, (lui.e) result4, null, 8), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            case 4:
                                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a result5 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a) obj6;
                                Intrinsics.checkNotNullParameter(result5, "result");
                                if (!Intrinsics.f(result5, a.C0601a.f98859a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b bVar12 = bVar6;
                                h.r2(bVar12.u);
                                h.t2(bVar12, bVar12.u, new AsftMainFlowContract$Step.Home(null), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                return Unit.f186387a;
                            default:
                                kui.f result6 = (kui.f) obj6;
                                Intrinsics.checkNotNullParameter(result6, "result");
                                if (!(result6 instanceof kui.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.w2(bVar6.u, new AsftMainFlowContract$Step.ManageBooking(result6.f189822a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block16, "block");
                asftCancelBookingScreen.H = block16;
                return asftCancelBookingScreen;
            case 12:
                com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.a aVar10 = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.a) obj3;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FreelancerAcquiringPaymentDetailsScreenContract$ModalStep step7 = (FreelancerAcquiringPaymentDetailsScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!(step7 instanceof FreelancerAcquiringPaymentDetailsScreenContract$ModalStep.FeeBreakdown)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar10.getClass();
                return new FreelancerAcquiringPaymentFeesScreen(new FreelancerAcquiringPaymentFeesScreenContract$InputData(((FreelancerAcquiringPaymentDetailsScreenContract$ModalStep.FeeBreakdown) step7).f73706a));
            case 13:
                com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b bVar7 = (com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b) obj3;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                InvestOrderWrapperFlowContract$WrapperFlowStep step8 = (InvestOrderWrapperFlowContract$WrapperFlowStep) data;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof InvestOrderWrapperFlowContract$WrapperFlowStep.Order) {
                    InvestOrderFlow investOrderFlow = new InvestOrderFlow(((InvestOrderWrapperFlowContract$WrapperFlowStep.Order) step8).f107019a);
                    uu9.b block17 = new uu9.b(bVar7, i3);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    investOrderFlow.H = block17;
                    return investOrderFlow;
                }
                if (step8 instanceof InvestOrderWrapperFlowContract$WrapperFlowStep.TargetPrice) {
                    InvestOrderContract$InputData investOrderContract$InputData = ((InvestOrderWrapperFlowContract$WrapperFlowStep.TargetPrice) step8).f107020a;
                    TargetPriceScreen targetPriceScreen = new TargetPriceScreen(new TargetPriceScreenContract$InputData(investOrderContract$InputData.getF91696a().f214596b, investOrderContract$InputData.getD(), investOrderContract$InputData.getF91698c(), null), new oul.j(true));
                    uif.d block18 = new uif.d(bVar7, investOrderContract$InputData, 19);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    targetPriceScreen.H = block18;
                    return targetPriceScreen;
                }
                if (!(step8 instanceof InvestOrderWrapperFlowContract$WrapperFlowStep.McyActivation)) {
                    throw new NoWhenBranchMatchedException();
                }
                InvestOrderWrapperFlowContract$WrapperFlowStep.McyActivation mcyActivation = (InvestOrderWrapperFlowContract$WrapperFlowStep.McyActivation) step8;
                t99.k kVar = bVar7.f107023r;
                bla.c cVar2 = mcyActivation.f107018b;
                k9 k9Var3 = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                ExchangeGlobalAccessFlow exchangeGlobalAccessFlowB = t99.k.b(kVar, cVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), 1);
                uif.d block19 = new uif.d(bVar7, mcyActivation, 20);
                Intrinsics.checkNotNullParameter(block19, "block");
                exchangeGlobalAccessFlowB.H = block19;
                exchangeGlobalAccessFlowB.k2(new ur2.a(bVar7, 5));
                return exchangeGlobalAccessFlowB;
            case 14:
                final com.revolut.feature.kyc.impl.fourthline.flow.a aVar11 = (com.revolut.feature.kyc.impl.fourthline.flow.a) obj3;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                FourthlineFlowContract$Step step9 = (FourthlineFlowContract$Step) data;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (Intrinsics.f(step9, FourthlineFlowContract$Step.InstallFeature.f77763a)) {
                    OnDemandFeatureInstallFlow onDemandFeatureInstallFlow = new OnDemandFeatureInstallFlow(new OnDemandFeatureInstallFlowContract$InputData(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.common_action_close, null, null, 14), "feature_fourthline_impl"));
                    Function1 block20 = new Function1() { // from class: uv8.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            aii.r rVar;
                            switch (i5) {
                                case 0:
                                    vv8.c result = (vv8.c) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (Intrinsics.f(result, c.b.f292475a)) {
                                        rVar = b.C1619b.f291747a;
                                    } else {
                                        if (!Intrinsics.f(result, c.a.f292474a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        rVar = b.a.f291746a;
                                    }
                                    aVar11.C2(rVar);
                                    return Unit.f186387a;
                                default:
                                    f result2 = (f) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF = Intrinsics.f(result2, e.f274950a);
                                    com.revolut.feature.kyc.impl.fourthline.flow.a aVar12 = aVar11;
                                    if (zF) {
                                        h.t2(aVar12, aVar12.f77764p, FourthlineFlowContract$Step.FourthlineScreen.f77762a, false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(result2, d.f274949a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar12.C2(b.a.f291746a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block20, "block");
                    onDemandFeatureInstallFlow.H = block20;
                    return onDemandFeatureInstallFlow;
                }
                if (!Intrinsics.f(step9, FourthlineFlowContract$Step.FourthlineScreen.f77762a)) {
                    throw new NoWhenBranchMatchedException();
                }
                FourthlineFlowContract$InputData fourthlineFlowContract$InputData = aVar11.o;
                FourthlineViewController fourthlineViewController = new FourthlineViewController(new FourthlineControllerContract$InputData(fourthlineFlowContract$InputData.f77759a, fourthlineFlowContract$InputData.f77760b, fourthlineFlowContract$InputData.f77761c, fourthlineFlowContract$InputData.d, fourthlineFlowContract$InputData.e));
                final int i74 = 0;
                Function1 block21 = new Function1() { // from class: uv8.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        aii.r rVar;
                        switch (i74) {
                            case 0:
                                vv8.c result = (vv8.c) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (Intrinsics.f(result, c.b.f292475a)) {
                                    rVar = b.C1619b.f291747a;
                                } else {
                                    if (!Intrinsics.f(result, c.a.f292474a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    rVar = b.a.f291746a;
                                }
                                aVar11.C2(rVar);
                                return Unit.f186387a;
                            default:
                                f result2 = (f) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                boolean zF = Intrinsics.f(result2, e.f274950a);
                                com.revolut.feature.kyc.impl.fourthline.flow.a aVar12 = aVar11;
                                if (zF) {
                                    h.t2(aVar12, aVar12.f77764p, FourthlineFlowContract$Step.FourthlineScreen.f77762a, false, null, false, 12);
                                } else {
                                    if (!Intrinsics.f(result2, d.f274949a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar12.C2(b.a.f291746a);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block21, "block");
                fourthlineViewController.H = block21;
                return fourthlineViewController;
            case 15:
                AccountsNavBarContentView accountsNavBarContentView = (AccountsNavBarContentView) obj3;
                String pageId = (String) obj2;
                int iIntValue = ((Integer) data).intValue();
                Intrinsics.checkNotNullParameter(pageId, "pageId");
                accountsNavBarContentView.i(accountsNavBarContentView.i.c(new a0(pageId, iIntValue)));
                up0.d0 d0Var = accountsNavBarContentView.u;
                boolean z3 = iIntValue != 0;
                if (d0Var.f) {
                    d0Var.f281694j = z3;
                    if (d0Var.d.c()) {
                        d0Var.h();
                    }
                }
                return Unit.f186387a;
            case 16:
                com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a aVar12 = (com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a) obj3;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InvoiceCustomerListScreenContract$ModalStep step10 = (InvoiceCustomerListScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof InvoiceCustomerListScreenContract$ModalStep.AddCustomer)) {
                    throw new NoWhenBranchMatchedException();
                }
                InvoiceCustomerListScreenContract$ModalStep.AddCustomer addCustomer = (InvoiceCustomerListScreenContract$ModalStep.AddCustomer) step10;
                FreelancerAddCustomerScreen freelancerAddCustomerScreen = new FreelancerAddCustomerScreen(new FreelancerAddCustomerScreenContract$InputData(addCustomer.f73881a, addCustomer.f73882b, 57));
                ux6.m mVar = new ux6.m(aVar12, 2);
                Intrinsics.checkNotNullParameter(mVar, "<set-?>");
                freelancerAddCustomerScreen.H = mVar;
                return freelancerAddCustomerScreen;
            case 17:
                final com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.a aVar13 = (com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.a) obj3;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                BrazilStoredMethodDetailsFlowContract$Step step11 = (BrazilStoredMethodDetailsFlowContract$Step) data;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof BrazilStoredMethodDetailsFlowContract$Step.StoredMethodDetails) {
                    BrazilStoredMethodDetailsScreen brazilStoredMethodDetailsScreen = new BrazilStoredMethodDetailsScreen(new BrazilStoredMethodDetailsScreenContract$InputData(((BrazilStoredMethodDetailsFlowContract$Step.StoredMethodDetails) step11).f90805a));
                    final int i92 = 0;
                    Function1 block22 = new Function1() { // from class: uxe.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i92) {
                                case 0:
                                    com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.a aVar14 = aVar13;
                                    yki.a aVar15 = aVar14.f90815s;
                                    BrazilStoredMethodDetailsScreenContract$OutputData result = (BrazilStoredMethodDetailsScreenContract$OutputData) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof BrazilStoredMethodDetailsScreenContract$OutputData.Back) {
                                        aVar14.B2();
                                    } else if (result instanceof BrazilStoredMethodDetailsScreenContract$OutputData.Revoke) {
                                        BrazilStoredMethodDetailsScreenContract$OutputData.Revoke revoke = (BrazilStoredMethodDetailsScreenContract$OutputData.Revoke) result;
                                        oki.h.w2(aVar15, new BrazilStoredMethodDetailsFlowContract$Step.RevokeConfirmation(revoke.f90811b, revoke.f90810a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        if (!(result instanceof BrazilStoredMethodDetailsScreenContract$OutputData.EditAlias)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        BrazilStoredMethodDetailsScreenContract$OutputData.EditAlias editAlias = (BrazilStoredMethodDetailsScreenContract$OutputData.EditAlias) result;
                                        oki.h.w2(aVar15, new BrazilStoredMethodDetailsFlowContract$Step.EditAlias(editAlias.f90808a, editAlias.f90809b), ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    ste.e result2 = (ste.e) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (Intrinsics.f(result2, e.b.f265560a)) {
                                        aVar13.X1(new mii.k("SHOT_DIALOG_SUCCESS_ALIAS_SAVED_BRAZIL_STORED_METHOD_ID", new TextLocalisedClause(R$string.open_banking_mandate_details_update_message_toast_title, null, null, 14), null, null, null, 28));
                                    } else if (!Intrinsics.f(result2, e.a.f265559a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block22, "block");
                    brazilStoredMethodDetailsScreen.H = block22;
                    return brazilStoredMethodDetailsScreen;
                }
                if (step11 instanceof BrazilStoredMethodDetailsFlowContract$Step.EditAlias) {
                    BrazilStoredMethodDetailsFlowContract$Step.EditAlias editAlias = (BrazilStoredMethodDetailsFlowContract$Step.EditAlias) step11;
                    ViewController viewControllerE14 = aVar13.e1(new ste.f(new EditStoredMethodLabelDescriptor$InputData(editAlias.f90801a, "", editAlias.f90802b, aVar13.o.f90482b, ste.d.Brazil)));
                    Function1 block23 = new Function1() { // from class: uxe.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.a aVar14 = aVar13;
                                    yki.a aVar15 = aVar14.f90815s;
                                    BrazilStoredMethodDetailsScreenContract$OutputData result = (BrazilStoredMethodDetailsScreenContract$OutputData) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof BrazilStoredMethodDetailsScreenContract$OutputData.Back) {
                                        aVar14.B2();
                                    } else if (result instanceof BrazilStoredMethodDetailsScreenContract$OutputData.Revoke) {
                                        BrazilStoredMethodDetailsScreenContract$OutputData.Revoke revoke = (BrazilStoredMethodDetailsScreenContract$OutputData.Revoke) result;
                                        oki.h.w2(aVar15, new BrazilStoredMethodDetailsFlowContract$Step.RevokeConfirmation(revoke.f90811b, revoke.f90810a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        if (!(result instanceof BrazilStoredMethodDetailsScreenContract$OutputData.EditAlias)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        BrazilStoredMethodDetailsScreenContract$OutputData.EditAlias editAlias2 = (BrazilStoredMethodDetailsScreenContract$OutputData.EditAlias) result;
                                        oki.h.w2(aVar15, new BrazilStoredMethodDetailsFlowContract$Step.EditAlias(editAlias2.f90808a, editAlias2.f90809b), ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    ste.e result2 = (ste.e) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (Intrinsics.f(result2, e.b.f265560a)) {
                                        aVar13.X1(new mii.k("SHOT_DIALOG_SUCCESS_ALIAS_SAVED_BRAZIL_STORED_METHOD_ID", new TextLocalisedClause(R$string.open_banking_mandate_details_update_message_toast_title, null, null, 14), null, null, null, 28));
                                    } else if (!Intrinsics.f(result2, e.a.f265559a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block23, "block");
                    viewControllerE14.H = block23;
                    return viewControllerE14;
                }
                if (!(step11 instanceof BrazilStoredMethodDetailsFlowContract$Step.RevokeConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                uxe.a aVar14 = aVar13.f90813q;
                String thirdPartyTitle = ((BrazilStoredMethodDetailsFlowContract$Step.RevokeConfirmation) step11).f90803a;
                k9 value = k9.Topup;
                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                AnalyticsProduct.Retail analyticsProduct = new AnalyticsProduct.Retail(value);
                aVar14.getClass();
                Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
                Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.topup_pix_smart_transfer_revoke_sheet_title, zhm.u.c(thirdPartyTitle), null, 12), new TextLocalisedClause(R$string.topup_pix_smart_transfer_revoke_sheet_subtitle, zhm.u.c(thirdPartyTitle), null, 12), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(R$string.topup_pix_smart_transfer_revoke_sheet_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.topup_pix_smart_transfer_revoke_sheet_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), analyticsProduct, null, null, 24));
                uif.d block24 = new uif.d(aVar13, step11, 24);
                Intrinsics.checkNotNullParameter(block24, "block");
                actionsBottomSheetController.H = block24;
                return actionsBottomSheetController;
            case 18:
                String listId = (String) obj2;
                so6.f item = (so6.f) data;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(item, "item");
                ne6.b bVar8 = ((uxe.q) obj3).f284000a;
                so6.d dVar3 = item.f264799c;
                String str = item.f264797a;
                if (dVar3 instanceof so6.c) {
                    return ((hj6.a) bVar8).f(((so6.c) dVar3).f264793b, listId, str);
                }
                if (dVar3 instanceof so6.b) {
                    return ((hj6.a) bVar8).e(listId, str, ((so6.b) dVar3).f264791b);
                }
                if (dVar3 == null) {
                    return ((hj6.a) bVar8).g(listId, str, item.f264798b);
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                uy1.j jVar = (uy1.j) obj3;
                List aliases = (List) data;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(aliases, "aliases");
                jVar.f284045c.f(jVar.f, aliases);
                return Unit.f186387a;
            case 20:
                com.revolut.feature.rev_points.impl.ui.advent.flow.b bVar9 = (com.revolut.feature.rev_points.impl.ui.advent.flow.b) obj3;
                RevPointsAdventRewardsFlowContract$InputData revPointsAdventRewardsFlowContract$InputData = bVar9.o;
                yki.l FlowCoordinator4 = (yki.l) obj2;
                RevPointsAdventRewardsFlowContract$Step step12 = (RevPointsAdventRewardsFlowContract$Step) data;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                boolean z4 = step12 instanceof RevPointsAdventRewardsFlowContract$Step.UnwrappedArticle;
                SkipShownArticleBehaviour.AlwaysShow alwaysShow = SkipShownArticleBehaviour.AlwaysShow.f81285a;
                if (z4) {
                    return bVar9.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(revPointsAdventRewardsFlowContract$InputData.f83766c)), alwaysShow, false, null, null, false, 28));
                }
                if (step12 instanceof RevPointsAdventRewardsFlowContract$Step.WrappedArticle) {
                    return bVar9.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(revPointsAdventRewardsFlowContract$InputData.f83765b)), alwaysShow, false, null, null, false, 24));
                }
                if (!Intrinsics.f(step12, RevPointsAdventRewardsFlowContract$Step.ConfettiDialog.f83767a)) {
                    throw new NoWhenBranchMatchedException();
                }
                RevPointsAdventRewardsScreen revPointsAdventRewardsScreen = new RevPointsAdventRewardsScreen(new RevPointsAdventRewardsScreenContract$InputData(revPointsAdventRewardsFlowContract$InputData.f83764a));
                uif.d block25 = new uif.d(bVar9, FlowCoordinator4, 25);
                Intrinsics.checkNotNullParameter(block25, "block");
                revPointsAdventRewardsScreen.H = block25;
                return revPointsAdventRewardsScreen;
            case 21:
                return a(obj2, data);
            case 22:
                CryptoExchangeScreen cryptoExchangeScreen = (CryptoExchangeScreen) obj3;
                CenteredAmountDelegate.Model data2 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field2 = (CenteredAmountView) data;
                KProperty[] kPropertyArr3 = CryptoExchangeScreen.X;
                Intrinsics.checkNotNullParameter(data2, "data");
                Intrinsics.checkNotNullParameter(field2, "field");
                Object obj6 = data2.f51981p;
                if (!(obj6 instanceof xi0.b)) {
                    return null;
                }
                nqi.a aVar15 = cryptoExchangeScreen.S;
                if (aVar15 != null) {
                    Object obj7 = ((CenteredAmountDelegate.Model) aVar15.f218467a).f51981p;
                    Intrinsics.i(obj7, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                    if (!((xi0.b) obj6).equals((xi0.b) obj7)) {
                        cryptoExchangeScreen.R.k(aVar15);
                    }
                }
                MaskedTextInputEditText editText2 = field2.getEditText();
                Object obj8 = data2.f51981p;
                Intrinsics.i(obj8, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(editText2, (xi0.b) obj8, new u80.d(((s80.b) ((qd0.b) cryptoExchangeScreen.L.getValue())).b()), null, new uyh.c(cryptoExchangeScreen, data2), false, false, 0, false, null, 1928);
            case 23:
                return b(obj2, data);
            case 24:
                uyl.g gVar = (uyl.g) obj3;
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf((data instanceof EditTextDelegate.b) && ((EditTextDelegate.b) data).i == gVar);
            case 25:
                final CardDetailsScreen cardDetailsScreen = (CardDetailsScreen) obj3;
                InputTextDelegate.Model input = (InputTextDelegate.Model) obj2;
                InputText field3 = (InputText) data;
                CardDetailsScreen.Companion aVar16 = CardDetailsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(field3, "field");
                String str2 = input.f52580a;
                if (Intrinsics.f(str2, "LIST_ITEM_EXPIRY")) {
                    final int i96 = 0;
                    return new y(field3.getInnerEditText(), null, "[00]/[00]", new x() { // from class: v0f.c
                        @Override // zp0.x
                        public final void e(String str3, final String expiry, String str4, boolean z6) {
                            Regex regexD;
                            int i99 = i96;
                            CardDetailsScreen cardDetailsScreen2 = cardDetailsScreen;
                            switch (i99) {
                                case 0:
                                    CardDetailsScreen.Companion companion3 = CardDetailsScreen.INSTANCE;
                                    Intrinsics.checkNotNullParameter(str3, "<unused var>");
                                    Intrinsics.checkNotNullParameter(expiry, "extractedValue");
                                    Intrinsics.checkNotNullParameter(str4, "<unused var>");
                                    com.revolut.feature.topup_screen.impl.screens.card_details.b bVar10 = (com.revolut.feature.topup_screen.impl.screens.card_details.b) cardDetailsScreen2.d();
                                    bVar10.getClass();
                                    Intrinsics.checkNotNullParameter(expiry, "expiry");
                                    cli.y yVar = bVar10.G;
                                    u uVar = (u) ((j2) yVar.f22677a).getValue();
                                    boolean z11 = uVar.f284831m;
                                    final yte.a aVar17 = uVar.f284828h;
                                    if (!z11) {
                                        aVar17 = yte.a.MANUAL;
                                    }
                                    if (expiry.length() == 4) {
                                        n0.Companion.getClass();
                                        if (m0.a(expiry) && !z11) {
                                            final int i100 = 0;
                                            bVar10.H2(yVar, new Function1() { // from class: v0f.x
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj9) {
                                                    u update = (u) obj9;
                                                    switch (i100) {
                                                        case 0:
                                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                                            return u.a(update, null, expiry, null, null, null, t.CVV, null, aVar17, false, false, false, false, false, false, 12125);
                                                        case 1:
                                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                                            return u.a(update, null, expiry, null, null, null, null, null, aVar17, false, false, false, false, false, false, 12157);
                                                        case 2:
                                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                                            return u.a(update, expiry, null, null, null, null, t.EXPIRE_DATE, null, aVar17, false, false, false, false, false, false, 14174);
                                                        default:
                                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                                            return u.a(update, expiry, null, null, null, null, null, null, aVar17, false, false, false, false, false, false, 14206);
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    final int i101 = 1;
                                    bVar10.H2(yVar, new Function1() { // from class: v0f.x
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj9) {
                                            u update = (u) obj9;
                                            switch (i101) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, null, expiry, null, null, null, t.CVV, null, aVar17, false, false, false, false, false, false, 12125);
                                                case 1:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, null, expiry, null, null, null, null, null, aVar17, false, false, false, false, false, false, 12157);
                                                case 2:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, expiry, null, null, null, null, t.EXPIRE_DATE, null, aVar17, false, false, false, false, false, false, 14174);
                                                default:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, expiry, null, null, null, null, null, null, aVar17, false, false, false, false, false, false, 14206);
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    CardDetailsScreen.Companion companion4 = CardDetailsScreen.INSTANCE;
                                    Intrinsics.checkNotNullParameter(str3, "<unused var>");
                                    Intrinsics.checkNotNullParameter(expiry, "extractedValue");
                                    Intrinsics.checkNotNullParameter(str4, "<unused var>");
                                    com.revolut.feature.topup_screen.impl.screens.card_details.b bVar11 = (com.revolut.feature.topup_screen.impl.screens.card_details.b) cardDetailsScreen2.d();
                                    bVar11.getClass();
                                    Intrinsics.checkNotNullParameter(expiry, "pan");
                                    cli.y yVar2 = bVar11.G;
                                    u uVar2 = (u) ((j2) yVar2.f22677a).getValue();
                                    t61.j jVar2 = uVar2.e;
                                    boolean z12 = uVar2.f284830l;
                                    final yte.a aVar18 = uVar2.f284828h;
                                    if (!z12) {
                                        aVar18 = yte.a.MANUAL;
                                    }
                                    if (expiry.length() >= 16 && jVar2 != null) {
                                        m5l.b bVar12 = jVar2.f268161g;
                                        Boolean boolValueOf = null;
                                        List listA = bVar12 != null ? bVar12.a() : null;
                                        if (listA == null) {
                                            listA = zhm.f0.f322471a;
                                        }
                                        if (listA.contains(Integer.valueOf(expiry.length()))) {
                                            if (bVar12 != null && (regexD = bVar12.d()) != null) {
                                                boolValueOf = Boolean.valueOf(regexD.f(expiry));
                                            }
                                            if (pd.b.j(boolValueOf) && iy2.a.a(expiry)) {
                                                final int i102 = 2;
                                                bVar11.H2(yVar2, new Function1() { // from class: v0f.x
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj9) {
                                                        u update = (u) obj9;
                                                        switch (i102) {
                                                            case 0:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                return u.a(update, null, expiry, null, null, null, t.CVV, null, aVar18, false, false, false, false, false, false, 12125);
                                                            case 1:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                return u.a(update, null, expiry, null, null, null, null, null, aVar18, false, false, false, false, false, false, 12157);
                                                            case 2:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                return u.a(update, expiry, null, null, null, null, t.EXPIRE_DATE, null, aVar18, false, false, false, false, false, false, 14174);
                                                            default:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                return u.a(update, expiry, null, null, null, null, null, null, aVar18, false, false, false, false, false, false, 14206);
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    }
                                    final int i103 = 3;
                                    bVar11.H2(yVar2, new Function1() { // from class: v0f.x
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj9) {
                                            u update = (u) obj9;
                                            switch (i103) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, null, expiry, null, null, null, t.CVV, null, aVar18, false, false, false, false, false, false, 12125);
                                                case 1:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, null, expiry, null, null, null, null, null, aVar18, false, false, false, false, false, false, 12157);
                                                case 2:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, expiry, null, null, null, null, t.EXPIRE_DATE, null, aVar18, false, false, false, false, false, false, 14174);
                                                default:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, expiry, null, null, null, null, null, null, aVar18, false, false, false, false, false, false, 14206);
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    }, input.f52580a, DigitsKeyListener.getInstance("1234567890/"), false, 66);
                }
                if (Intrinsics.f(str2, "LIST_ITEM_PAN")) {
                    return new y(field3.getInnerEditText(), null, "[0000] [0000] [0000] [0999] [999]", new x() { // from class: v0f.c
                        @Override // zp0.x
                        public final void e(String str3, final String expiry, String str4, boolean z6) {
                            Regex regexD;
                            int i99 = i5;
                            CardDetailsScreen cardDetailsScreen2 = cardDetailsScreen;
                            switch (i99) {
                                case 0:
                                    CardDetailsScreen.Companion companion3 = CardDetailsScreen.INSTANCE;
                                    Intrinsics.checkNotNullParameter(str3, "<unused var>");
                                    Intrinsics.checkNotNullParameter(expiry, "extractedValue");
                                    Intrinsics.checkNotNullParameter(str4, "<unused var>");
                                    com.revolut.feature.topup_screen.impl.screens.card_details.b bVar10 = (com.revolut.feature.topup_screen.impl.screens.card_details.b) cardDetailsScreen2.d();
                                    bVar10.getClass();
                                    Intrinsics.checkNotNullParameter(expiry, "expiry");
                                    cli.y yVar = bVar10.G;
                                    u uVar = (u) ((j2) yVar.f22677a).getValue();
                                    boolean z11 = uVar.f284831m;
                                    final yte.a aVar17 = uVar.f284828h;
                                    if (!z11) {
                                        aVar17 = yte.a.MANUAL;
                                    }
                                    if (expiry.length() == 4) {
                                        n0.Companion.getClass();
                                        if (m0.a(expiry) && !z11) {
                                            final int i100 = 0;
                                            bVar10.H2(yVar, new Function1() { // from class: v0f.x
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj9) {
                                                    u update = (u) obj9;
                                                    switch (i100) {
                                                        case 0:
                                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                                            return u.a(update, null, expiry, null, null, null, t.CVV, null, aVar17, false, false, false, false, false, false, 12125);
                                                        case 1:
                                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                                            return u.a(update, null, expiry, null, null, null, null, null, aVar17, false, false, false, false, false, false, 12157);
                                                        case 2:
                                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                                            return u.a(update, expiry, null, null, null, null, t.EXPIRE_DATE, null, aVar17, false, false, false, false, false, false, 14174);
                                                        default:
                                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                                            return u.a(update, expiry, null, null, null, null, null, null, aVar17, false, false, false, false, false, false, 14206);
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    final int i101 = 1;
                                    bVar10.H2(yVar, new Function1() { // from class: v0f.x
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj9) {
                                            u update = (u) obj9;
                                            switch (i101) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, null, expiry, null, null, null, t.CVV, null, aVar17, false, false, false, false, false, false, 12125);
                                                case 1:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, null, expiry, null, null, null, null, null, aVar17, false, false, false, false, false, false, 12157);
                                                case 2:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, expiry, null, null, null, null, t.EXPIRE_DATE, null, aVar17, false, false, false, false, false, false, 14174);
                                                default:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, expiry, null, null, null, null, null, null, aVar17, false, false, false, false, false, false, 14206);
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    CardDetailsScreen.Companion companion4 = CardDetailsScreen.INSTANCE;
                                    Intrinsics.checkNotNullParameter(str3, "<unused var>");
                                    Intrinsics.checkNotNullParameter(expiry, "extractedValue");
                                    Intrinsics.checkNotNullParameter(str4, "<unused var>");
                                    com.revolut.feature.topup_screen.impl.screens.card_details.b bVar11 = (com.revolut.feature.topup_screen.impl.screens.card_details.b) cardDetailsScreen2.d();
                                    bVar11.getClass();
                                    Intrinsics.checkNotNullParameter(expiry, "pan");
                                    cli.y yVar2 = bVar11.G;
                                    u uVar2 = (u) ((j2) yVar2.f22677a).getValue();
                                    t61.j jVar2 = uVar2.e;
                                    boolean z12 = uVar2.f284830l;
                                    final yte.a aVar18 = uVar2.f284828h;
                                    if (!z12) {
                                        aVar18 = yte.a.MANUAL;
                                    }
                                    if (expiry.length() >= 16 && jVar2 != null) {
                                        m5l.b bVar12 = jVar2.f268161g;
                                        Boolean boolValueOf = null;
                                        List listA = bVar12 != null ? bVar12.a() : null;
                                        if (listA == null) {
                                            listA = zhm.f0.f322471a;
                                        }
                                        if (listA.contains(Integer.valueOf(expiry.length()))) {
                                            if (bVar12 != null && (regexD = bVar12.d()) != null) {
                                                boolValueOf = Boolean.valueOf(regexD.f(expiry));
                                            }
                                            if (pd.b.j(boolValueOf) && iy2.a.a(expiry)) {
                                                final int i102 = 2;
                                                bVar11.H2(yVar2, new Function1() { // from class: v0f.x
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj9) {
                                                        u update = (u) obj9;
                                                        switch (i102) {
                                                            case 0:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                return u.a(update, null, expiry, null, null, null, t.CVV, null, aVar18, false, false, false, false, false, false, 12125);
                                                            case 1:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                return u.a(update, null, expiry, null, null, null, null, null, aVar18, false, false, false, false, false, false, 12157);
                                                            case 2:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                return u.a(update, expiry, null, null, null, null, t.EXPIRE_DATE, null, aVar18, false, false, false, false, false, false, 14174);
                                                            default:
                                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                                return u.a(update, expiry, null, null, null, null, null, null, aVar18, false, false, false, false, false, false, 14206);
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    }
                                    final int i103 = 3;
                                    bVar11.H2(yVar2, new Function1() { // from class: v0f.x
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj9) {
                                            u update = (u) obj9;
                                            switch (i103) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, null, expiry, null, null, null, t.CVV, null, aVar18, false, false, false, false, false, false, 12125);
                                                case 1:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, null, expiry, null, null, null, null, null, aVar18, false, false, false, false, false, false, 12157);
                                                case 2:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, expiry, null, null, null, null, t.EXPIRE_DATE, null, aVar18, false, false, false, false, false, false, 14174);
                                                default:
                                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                                    return u.a(update, expiry, null, null, null, null, null, null, aVar18, false, false, false, false, false, false, 14206);
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    }, input.f52580a, DigitsKeyListener.getInstance("1234567890 "), false, 66);
                }
                return null;
            case 26:
                return c(obj2, data);
            case 27:
                final com.revolut.feature.apm.core.ui.impl.ui.alias_claim.a aVar17 = (com.revolut.feature.apm.core.ui.impl.ui.alias_claim.a) obj3;
                yki.l FlowCoordinator5 = (yki.l) obj2;
                ApmAliasClaimFlowContract$Step step13 = (ApmAliasClaimFlowContract$Step) data;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof ApmAliasClaimFlowContract$Step.Intro)) {
                    if (!(step13 instanceof ApmAliasClaimFlowContract$Step.Form)) {
                        if (step13 instanceof ApmAliasClaimFlowContract$Step.Status) {
                            return new ApmAliasClaimStatusScreen(new ApmAliasClaimStatusNavigation$InputData(((ApmAliasClaimFlowContract$Step.Status) step13).f62338a));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    ApmAliasClaimFormFlow apmAliasClaimFormFlow = new ApmAliasClaimFormFlow();
                    Function1 block26 = new Function1() { // from class: v12.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i5) {
                                case 0:
                                    d67.u result = (d67.u) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z6 = result instanceof q;
                                    com.revolut.feature.apm.core.ui.impl.ui.alias_claim.a aVar18 = aVar17;
                                    if (z6) {
                                        h.D2(aVar18.f62339p);
                                    } else {
                                        h.t2(aVar18, aVar18.f62339p, ApmAliasClaimFlowContract$Step.Form.f62336a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.apm.core.ui.impl.ui.alias_claim.a aVar19 = aVar17;
                                    yki.a aVar20 = aVar19.f62339p;
                                    x12.e result2 = (x12.e) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof x12.c) {
                                        h.D2(aVar20);
                                    } else {
                                        if (!(result2 instanceof x12.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.r2(aVar20);
                                        h.t2(aVar19, aVar20, new ApmAliasClaimFlowContract$Step.Status("requestId"), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block26, "block");
                    apmAliasClaimFormFlow.H = block26;
                    return apmAliasClaimFormFlow;
                }
                ApmAliasClaimNavigation$InputData apmAliasClaimNavigation$InputData = aVar17.o;
                c12.a aVar18 = apmAliasClaimNavigation$InputData.f62236b;
                int[] iArr = v12.e.f285209a;
                int i99 = iArr[aVar18.ordinal()];
                if (i99 == 1) {
                    i = com.revolut.feature.apm.core.api.R$string.apm_alias_ownership_claim_title;
                } else {
                    if (i99 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = com.revolut.feature.apm.core.api.R$string.apm_alias_ownership_claim_unlink_title;
                }
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(i, zhm.u.c(apmAliasClaimNavigation$InputData.f62235a.e()), null, 12);
                int i100 = iArr[apmAliasClaimNavigation$InputData.f62236b.ordinal()];
                if (i100 == 1) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_ownership_claim_subtitle, null, null, 14);
                } else {
                    if (i100 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_ownership_claim_unlink_subtitle, null, null, 14);
                }
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("ID_INTRO_CONTROLLER", textLocalisedClause6, textLocalisedClause, new PromptMarketingContentDelegate.Model.Content.MediaContent(new GlyphImage(R$drawable.uikit_icn_24_link, null, null, 6), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.e, false, (String) null, 54), null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30));
                final int i101 = 0;
                Function1 block27 = new Function1() { // from class: v12.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        switch (i101) {
                            case 0:
                                d67.u result = (d67.u) obj9;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z6 = result instanceof q;
                                com.revolut.feature.apm.core.ui.impl.ui.alias_claim.a aVar182 = aVar17;
                                if (z6) {
                                    h.D2(aVar182.f62339p);
                                } else {
                                    h.t2(aVar182, aVar182.f62339p, ApmAliasClaimFlowContract$Step.Form.f62336a, true, null, false, 12);
                                }
                                return Unit.f186387a;
                            default:
                                com.revolut.feature.apm.core.ui.impl.ui.alias_claim.a aVar19 = aVar17;
                                yki.a aVar20 = aVar19.f62339p;
                                x12.e result2 = (x12.e) obj9;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof x12.c) {
                                    h.D2(aVar20);
                                } else {
                                    if (!(result2 instanceof x12.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.r2(aVar20);
                                    h.t2(aVar19, aVar20, new ApmAliasClaimFlowContract$Step.Status("requestId"), false, null, false, 12);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block27, "block");
                promptMarketingScreen.H = block27;
                return promptMarketingScreen;
            case 28:
                return d(obj2, data);
            default:
                com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.a aVar19 = (com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.a) obj3;
                yki.l FlowCoordinator6 = (yki.l) obj2;
                QrScannerFlowContract$Step it8 = (QrScannerFlowContract$Step) data;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                QrScanningScreen qrScanningScreen = new QrScanningScreen(aVar19.o);
                v25.k block28 = new v25.k(aVar19, i3);
                Intrinsics.checkNotNullParameter(block28, "block");
                qrScanningScreen.H = block28;
                return qrScanningScreen;
        }
    }
}
