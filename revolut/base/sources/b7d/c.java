package b7d;

import aii.q;
import android.os.Parcelable;
import aw0.g;
import aw0.n6;
import aw0.o9;
import b4b.z;
import bai.r;
import bfh.k;
import bg4.h;
import bg4.j;
import bg4.w;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.impl.ui.card_photo.BackendFlowCardPhotoFlowContract$Step;
import com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreen;
import com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreenContract$InputData;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.apm.payid.impl.screen.settings.SettingsScreenContract$ModalStep;
import com.revolut.feature.apm.payid.impl.screen.settings.actions.AliasActionsScreen;
import com.revolut.feature.apm.payid.impl.screen.settings.confirmaction.ConfirmAliasActionScreen;
import com.revolut.feature.apm.upi.impl.flow.screen.amount.UpiTransferAmountScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsControllerContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.UploadScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.CheckoutControllerContract$ModalStep;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController;
import com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.BiometricAuthenticationFlowContract$Step;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.onboarding.impl.onboarding.workflow.OnboardingWorkflowFlowContract$Step;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.feature.passcode.PasscodeScreenContract$VerificationMode;
import com.revolut.feature.passcode.ui.biometric_passcode_verification.BiometricPasscodeVerificationFlow;
import com.revolut.feature.passcode.ui.biometric_passcode_verification.BiometricPasscodeVerificationFlowContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.PayBillsAndTaxesScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search.BillsSearchScreen;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.pix.impl.flow.common.PixCommonModalsContract$Step;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.PixQrCodeAdditionalInformationScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.PixQrCodeAdditionalInformationScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.address.PixQrCodeAddressScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.address.PixQrCodeAddressScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown.PixQrCodeMoneyBreakdownScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown.PixQrCodeMoneyBreakdownScreenContract$InputData;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlowContract$Step;
import com.revolut.feature.retail.salary_account.impl.flow.ui.salary_move_bottom_sheet.SalaryMoveBottomSheetController;
import com.revolut.feature.retail.salary_account.impl.salary_hub.SalaryHubController;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3Controller;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.income_insurance_claim_bottom_sheet.IncomeInsuranceClaimBottomSheetController;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.SwitchAssistantFlow;
import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import com.revolut.feature.rev_points.impl.ui.terms_review.flow.RevPointsTermsReviewFlow;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PayWithAnyFundingOptions;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$BreakdownDisclaimer;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.impl.ui.instore.paymentscreen.InStorePaymentScreen;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.shared.ui.card_options.CardOptionsScreen;
import com.revolut.feature.revolutpay.shared.ui.insufficient_funds_options.InsufficientFundsOptionsContract$InputData;
import com.revolut.feature.revolutpay.shared.ui.insufficient_funds_options.InsufficientFundsOptionsScreen;
import com.revolut.feature.revolutpay.shared.ui.pay_with_any.PayWithAnyContract$ModalStep;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow.ConsentPromptFlowContract$InputData;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow.ConsentPromptFlowContract$Step;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.screen.ConsentPromptScreen;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.screen.ConsentPromptScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntroScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.PortfolioInsightsFlow;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.PortfolioInsightsFlowContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealFlowContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealFlowContract$Step;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealLoadingScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealLoadingScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro.PortfolioRevealIntroScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro.PortfolioRevealIntroScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro.PortfolioRevealIntroScreenContract$TemplateIntroPage;
import com.revolut.feature.trading.managed_portfolios.impl.ui.strategy_overview.StrategyOverviewScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.strategy_overview.StrategyOverviewScreenContract$InputData;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.AccountInformationScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.model.checkout.RevolutCardWithBalanceCheck;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.bed_options_selection.TravelHotelsBedOptionsSelectionScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.bed_options_selection.TravelHotelsBedOptionsSelectionScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.card_selection_screen.TravelHotelsCardSelectionScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.card_selection_screen.TravelHotelsCardSelectionScreenContract$InputData;
import com.revolut.feature.wealth.private_companies.api.ui.details.PrivateCompanyDetailsContract$InputData;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.PrivateCompanyDetailsFlowContract$Page;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.feed.PrivateCompanyDetailsFeedController;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.feed.PrivateCompanyDetailsFeedControllerContract$InputData;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.financials.PrivateCompanyDetailsFinancialsController;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.financials.PrivateCompanyDetailsFinancialsControllerContract$InputData;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.overview.PrivateCompanyDetailsOverviewController;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.overview.PrivateCompanyDetailsOverviewControllerContract$InputData;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.transition.MainElementMoveFromCenterTransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$EsimSubscriptionsToRefund;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.EsimMobilePlanCancellationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.EsimMobilePlanCancellationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.a;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowControllerDescriptor$InputData;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import dej.c4;
import e54.a0;
import efm.d0;
import grl.k9;
import h8f.h;
import hgb.m;
import hgb.n;
import hgb.o;
import hgb.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import n8f.i;
import nnj.l;
import s7a.x;
import skm.p0;
import u6c.t;
import vkm.j2;
import w6c.f;
import w6c.i;
import wpc.e;
import zhm.h0;
import zhm.u;
import zhm.v;
import zp0.d;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12997b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f12996a = i;
        this.f12997b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        PrivateCompanyDetailsContract$InputData privateCompanyDetailsContract$InputData = (PrivateCompanyDetailsContract$InputData) this.f12997b;
        ali.b PagerCoordinator = (ali.b) obj2;
        PrivateCompanyDetailsFlowContract$Page page = (PrivateCompanyDetailsFlowContract$Page) obj3;
        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
        Intrinsics.checkNotNullParameter(page, "page");
        int i = k.f14996a[page.ordinal()];
        if (i == 1) {
            return new PrivateCompanyDetailsOverviewController(new PrivateCompanyDetailsOverviewControllerContract$InputData(privateCompanyDetailsContract$InputData.f95721a.f95722a));
        }
        if (i == 2) {
            return new PrivateCompanyDetailsFinancialsController(new PrivateCompanyDetailsFinancialsControllerContract$InputData(privateCompanyDetailsContract$InputData.f95721a.f95722a));
        }
        if (i == 3) {
            return new PrivateCompanyDetailsFeedController(new PrivateCompanyDetailsFeedControllerContract$InputData(privateCompanyDetailsContract$InputData.f95721a.f95722a));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlin.Lazy] */
    private final Object b(Object obj2, Object obj3) {
        UpiTransferAmountScreen upiTransferAmountScreen = (UpiTransferAmountScreen) this.f12997b;
        CenteredAmountView field = (CenteredAmountView) obj3;
        KProperty[] kPropertyArr = UpiTransferAmountScreen.X;
        Intrinsics.checkNotNullParameter((CenteredAmountDelegate.Model) obj2, "<unused var>");
        Intrinsics.checkNotNullParameter(field, "field");
        MaskedTextInputEditText editText = field.getEditText();
        xi0.b.Companion.getClass();
        return new d(editText, xi0.b.E, (u80.d) upiTransferAmountScreen.R.getValue(), null, null, false, false, 0, false, null, 1944);
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a) this.f12997b;
        y yVar = aVar.f68175s;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CheckoutControllerContract$ModalStep step = (CheckoutControllerContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CheckoutControllerContract$ModalStep.PaymentBreakdown) {
            Quote quote = ((CheckoutControllerContract$ModalStep.PaymentBreakdown) step).f68170a;
            h hVar = (h) zi0.c.I(((j) ((j2) yVar.f22677a).getValue()).f15104a);
            return aVar.e1(new w6c.k(new PaymentBreakdownControllerDescriptor$InputData(quote, hVar.f15102a.f11386g, w6c.j.PAYMENT, PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Empty.f84440a)));
        }
        if (!(step instanceof CheckoutControllerContract$ModalStep.PaymentMethodPicker)) {
            throw new NoWhenBranchMatchedException();
        }
        h hVar2 = (h) zi0.c.I(((j) ((j2) yVar.f22677a).getValue()).f15104a);
        PaymentMethod.Pocket pocket = hVar2.f15103b;
        ViewController viewControllerE1 = aVar.e1(new i(new PayWithAnyControllerDescriptor$InputData(t.CREDIT_ONBOARDING, hVar2.f15102a.f11386g, pocket, null, null, null, f.ONLY_POCKETS_FILTERED_BY_BALANCE, null, null, false, 1912)));
        w block = new w(aVar, 2);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    private final Object d(Object obj2, Object obj3) {
        PayBillsAndTaxesScreen payBillsAndTaxesScreen = (PayBillsAndTaxesScreen) this.f12997b;
        InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
        InputText field = (InputText) obj3;
        KProperty[] kPropertyArr = PayBillsAndTaxesScreen.T;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(field, "field");
        Object obj4 = model.P;
        String str = obj4 instanceof BillFormField ? ((BillFormField) obj4).e : null;
        if (str == null) {
            return null;
        }
        return new zp0.y(field.getInnerEditText(), null, str, new abf.c(payBillsAndTaxesScreen, model, 6), model.f52580a, of9.h.a(model, str), false, 66);
    }

    private final Object e(Object obj2, Object obj3) {
        final com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar = (com.revolut.feature.retail.salary_account.impl.flow.ui.d) this.f12997b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        SalaryAccountFlowContract$Step step = (SalaryAccountFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        final int i = 1;
        if (Intrinsics.f(step, SalaryAccountFlowContract$Step.SalaryHub.f82972a)) {
            SalaryHubController salaryHubController = new SalaryHubController();
            Function1 block = new Function1() { // from class: bgb.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            wpc.j output = (wpc.j) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (Intrinsics.f(output, wpc.g.f299221a)) {
                                yki.i iVar = dVar.u;
                                if (iVar.c()) {
                                    iVar.e(true);
                                } else {
                                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                                    iVar.n();
                                }
                            } else if (!Intrinsics.f(output, wpc.h.f299222a) && !Intrinsics.f(output, wpc.i.f299223a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            p output2 = (p) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean zF = Intrinsics.f(output2, m.f152148a);
                            com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar2 = dVar;
                            if (zF) {
                                oki.h.D2(dVar2.u);
                            } else {
                                Continuation continuation = null;
                                if (Intrinsics.f(output2, n.f152149a)) {
                                    dVar2.l2(new h(dVar2, c.SALARY_HUB, continuation, 1), new yi5.b(26));
                                } else {
                                    if (!Intrinsics.f(output2, o.f152150a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar2.l2(new j(dVar2, null, 0), new yi5.b(26));
                                }
                            }
                            return Unit.f186387a;
                        case 2:
                            q it8 = (q) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            oki.h.D2(dVar.u);
                            return Unit.f186387a;
                        default:
                            pgb.n output3 = (pgb.n) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean zF2 = Intrinsics.f(output3, pgb.k.f235844a);
                            com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar3 = dVar;
                            if (zF2) {
                                oki.h.D2(dVar3.u);
                            } else {
                                Continuation continuation2 = null;
                                if (Intrinsics.f(output3, pgb.l.f235845a)) {
                                    dVar3.l2(new h(dVar3, c.SALARY_HUB, continuation2, 1), new yi5.b(26));
                                } else {
                                    if (!Intrinsics.f(output3, pgb.m.f235846a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar3.l2(new j(dVar3, null, 1), new yi5.b(26));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            salaryHubController.H = block;
            return salaryHubController;
        }
        final int i2 = 3;
        if (Intrinsics.f(step, SalaryAccountFlowContract$Step.SalaryHubV3.f82973a)) {
            SalaryHubV3Controller salaryHubV3Controller = new SalaryHubV3Controller();
            Function1 block2 = new Function1() { // from class: bgb.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            wpc.j output = (wpc.j) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (Intrinsics.f(output, wpc.g.f299221a)) {
                                yki.i iVar = dVar.u;
                                if (iVar.c()) {
                                    iVar.e(true);
                                } else {
                                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                                    iVar.n();
                                }
                            } else if (!Intrinsics.f(output, wpc.h.f299222a) && !Intrinsics.f(output, wpc.i.f299223a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            p output2 = (p) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean zF = Intrinsics.f(output2, m.f152148a);
                            com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar2 = dVar;
                            if (zF) {
                                oki.h.D2(dVar2.u);
                            } else {
                                Continuation continuation = null;
                                if (Intrinsics.f(output2, n.f152149a)) {
                                    dVar2.l2(new h(dVar2, c.SALARY_HUB, continuation, 1), new yi5.b(26));
                                } else {
                                    if (!Intrinsics.f(output2, o.f152150a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar2.l2(new j(dVar2, null, 0), new yi5.b(26));
                                }
                            }
                            return Unit.f186387a;
                        case 2:
                            q it8 = (q) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            oki.h.D2(dVar.u);
                            return Unit.f186387a;
                        default:
                            pgb.n output3 = (pgb.n) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean zF2 = Intrinsics.f(output3, pgb.k.f235844a);
                            com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar3 = dVar;
                            if (zF2) {
                                oki.h.D2(dVar3.u);
                            } else {
                                Continuation continuation2 = null;
                                if (Intrinsics.f(output3, pgb.l.f235845a)) {
                                    dVar3.l2(new h(dVar3, c.SALARY_HUB, continuation2, 1), new yi5.b(26));
                                } else {
                                    if (!Intrinsics.f(output3, pgb.m.f235846a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar3.l2(new j(dVar3, null, 1), new yi5.b(26));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            salaryHubV3Controller.H = block2;
            return salaryHubV3Controller;
        }
        if (step instanceof SalaryAccountFlowContract$Step.SalaryAccountProductArticle) {
            agb.a productArticleId = ((SalaryAccountFlowContract$Step.SalaryAccountProductArticle) step).f82971a;
            ((zfb.c) dVar.f82979p).getClass();
            Intrinsics.checkNotNullParameter(productArticleId, "productArticleId");
            ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(productArticleId.a()));
            k9 k9Var = k9.Salary;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ViewController viewControllerE1 = dVar.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, false, 48));
            beg.k block3 = new beg.k(productArticleId, dVar, i2);
            Intrinsics.checkNotNullParameter(block3, "block");
            viewControllerE1.H = block3;
            return viewControllerE1;
        }
        final int i3 = 0;
        if (Intrinsics.f(step, SalaryAccountFlowContract$Step.SalaryAccountDetails.f82970a)) {
            ViewController viewControllerE12 = dVar.e1(new wpc.k(new wpc.d(null, e.POPUP)));
            Function1 block4 = new Function1() { // from class: bgb.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            wpc.j output = (wpc.j) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (Intrinsics.f(output, wpc.g.f299221a)) {
                                yki.i iVar = dVar.u;
                                if (iVar.c()) {
                                    iVar.e(true);
                                } else {
                                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                                    iVar.n();
                                }
                            } else if (!Intrinsics.f(output, wpc.h.f299222a) && !Intrinsics.f(output, wpc.i.f299223a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            p output2 = (p) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean zF = Intrinsics.f(output2, m.f152148a);
                            com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar2 = dVar;
                            if (zF) {
                                oki.h.D2(dVar2.u);
                            } else {
                                Continuation continuation = null;
                                if (Intrinsics.f(output2, n.f152149a)) {
                                    dVar2.l2(new h(dVar2, c.SALARY_HUB, continuation, 1), new yi5.b(26));
                                } else {
                                    if (!Intrinsics.f(output2, o.f152150a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar2.l2(new j(dVar2, null, 0), new yi5.b(26));
                                }
                            }
                            return Unit.f186387a;
                        case 2:
                            q it8 = (q) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            oki.h.D2(dVar.u);
                            return Unit.f186387a;
                        default:
                            pgb.n output3 = (pgb.n) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean zF2 = Intrinsics.f(output3, pgb.k.f235844a);
                            com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar3 = dVar;
                            if (zF2) {
                                oki.h.D2(dVar3.u);
                            } else {
                                Continuation continuation2 = null;
                                if (Intrinsics.f(output3, pgb.l.f235845a)) {
                                    dVar3.l2(new h(dVar3, c.SALARY_HUB, continuation2, 1), new yi5.b(26));
                                } else {
                                    if (!Intrinsics.f(output3, pgb.m.f235846a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar3.l2(new j(dVar3, null, 1), new yi5.b(26));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            viewControllerE12.H = block4;
            return viewControllerE12;
        }
        if (Intrinsics.f(step, SalaryAccountFlowContract$Step.SalarySwitchAssistant.f82976a)) {
            SwitchAssistantFlow switchAssistantFlow = new SwitchAssistantFlow(i3);
            final int i5 = 2;
            Function1 block5 = new Function1() { // from class: bgb.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i5) {
                        case 0:
                            wpc.j output = (wpc.j) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (Intrinsics.f(output, wpc.g.f299221a)) {
                                yki.i iVar = dVar.u;
                                if (iVar.c()) {
                                    iVar.e(true);
                                } else {
                                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                                    iVar.n();
                                }
                            } else if (!Intrinsics.f(output, wpc.h.f299222a) && !Intrinsics.f(output, wpc.i.f299223a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 1:
                            p output2 = (p) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean zF = Intrinsics.f(output2, m.f152148a);
                            com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar2 = dVar;
                            if (zF) {
                                oki.h.D2(dVar2.u);
                            } else {
                                Continuation continuation = null;
                                if (Intrinsics.f(output2, n.f152149a)) {
                                    dVar2.l2(new h(dVar2, c.SALARY_HUB, continuation, 1), new yi5.b(26));
                                } else {
                                    if (!Intrinsics.f(output2, o.f152150a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar2.l2(new j(dVar2, null, 0), new yi5.b(26));
                                }
                            }
                            return Unit.f186387a;
                        case 2:
                            q it8 = (q) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            oki.h.D2(dVar.u);
                            return Unit.f186387a;
                        default:
                            pgb.n output3 = (pgb.n) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean zF2 = Intrinsics.f(output3, pgb.k.f235844a);
                            com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar3 = dVar;
                            if (zF2) {
                                oki.h.D2(dVar3.u);
                            } else {
                                Continuation continuation2 = null;
                                if (Intrinsics.f(output3, pgb.l.f235845a)) {
                                    dVar3.l2(new h(dVar3, c.SALARY_HUB, continuation2, 1), new yi5.b(26));
                                } else {
                                    if (!Intrinsics.f(output3, pgb.m.f235846a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar3.l2(new j(dVar3, null, 1), new yi5.b(26));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block5, "block");
            switchAssistantFlow.H = block5;
            return switchAssistantFlow;
        }
        if (Intrinsics.f(step, SalaryAccountFlowContract$Step.IncomeInsuranceClaim.f82969a)) {
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            IncomeInsuranceClaimBottomSheetController incomeInsuranceClaimBottomSheetController = new IncomeInsuranceClaimBottomSheetController();
            incomeInsuranceClaimBottomSheetController.l2(new Function0() { // from class: bgb.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                            com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar2 = dVar;
                            dVar2.l2(new i(ref$BooleanRef2, dVar2, null, 1), new yi5.b(26));
                            break;
                        default:
                            Ref$BooleanRef ref$BooleanRef3 = ref$BooleanRef;
                            com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar3 = dVar;
                            dVar3.l2(new i(ref$BooleanRef3, dVar3, null, 0), new yi5.b(26));
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            beg.k block6 = new beg.k(ref$BooleanRef, dVar, 4);
            Intrinsics.checkNotNullParameter(block6, "block");
            incomeInsuranceClaimBottomSheetController.H = block6;
            return incomeInsuranceClaimBottomSheetController;
        }
        if (!(step instanceof SalaryAccountFlowContract$Step.SalaryMoveBottomSheet)) {
            throw new NoWhenBranchMatchedException();
        }
        SalaryAccountFlowContract$Step.SalaryMoveBottomSheet salaryMoveBottomSheet = (SalaryAccountFlowContract$Step.SalaryMoveBottomSheet) step;
        mn2.a aVar = salaryMoveBottomSheet.f82974a;
        bgb.c cVar = salaryMoveBottomSheet.f82975b;
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        SalaryMoveBottomSheetController salaryMoveBottomSheetController = new SalaryMoveBottomSheetController();
        if (cVar == bgb.c.DEEPLINK) {
            salaryMoveBottomSheetController.l2(new Function0() { // from class: bgb.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            Ref$BooleanRef ref$BooleanRef22 = ref$BooleanRef2;
                            com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar2 = dVar;
                            dVar2.l2(new i(ref$BooleanRef22, dVar2, null, 1), new yi5.b(26));
                            break;
                        default:
                            Ref$BooleanRef ref$BooleanRef3 = ref$BooleanRef2;
                            com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar3 = dVar;
                            dVar3.l2(new i(ref$BooleanRef3, dVar3, null, 0), new yi5.b(26));
                            break;
                    }
                    return Unit.f186387a;
                }
            });
        }
        a5b.b block7 = new a5b.b(ref$BooleanRef2, dVar, cVar, aVar, 7);
        Intrinsics.checkNotNullParameter(block7, "block");
        salaryMoveBottomSheetController.H = block7;
        return salaryMoveBottomSheetController;
    }

    private final Object g(Object obj2, Object obj3) {
        final com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a aVar = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a) this.f12997b;
        EsimMobilePlanCancellationFlowContract$InputData esimMobilePlanCancellationFlowContract$InputData = aVar.o;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        EsimMobilePlanCancellationFlowContract$Step step = (EsimMobilePlanCancellationFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof EsimMobilePlanCancellationFlowContract$Step.CancellationReasonForm) {
            EsimRefundReasonScreen esimRefundReasonScreen = new EsimRefundReasonScreen(new EsimRefundReasonScreenContract$InputData.CancelMobilePlan(esimMobilePlanCancellationFlowContract$InputData.f100699a));
            final int i = 3;
            Function1 block = new Function1() { // from class: bgj.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            pgj.d result = (pgj.d) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.C2(new c(((pgj.c) result).f235975a));
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.a result2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.a) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z = result2 instanceof a.b;
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a aVar2 = aVar;
                            if (z) {
                                oki.h.t2(aVar2, aVar2.f100708p, EsimMobilePlanCancellationFlowContract$Step.Help.f100707a, true, null, false, 12);
                            } else if (result2 instanceof a.C0616a) {
                                oki.h.D2(aVar2.f100708p);
                            } else {
                                if (!(result2 instanceof a.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.C2(new c(c4.EXPIRED));
                            }
                            return Unit.f186387a;
                        case 2:
                            wfj.c result3 = (wfj.c) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a aVar3 = aVar;
                            oki.h.t2(aVar3, aVar3.f100708p, EsimMobilePlanCancellationFlowContract$Step.EsimRefund.f100706a, true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a result4 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z3 = result4 instanceof l;
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a aVar4 = aVar;
                            if (z3) {
                                yki.i iVar = aVar4.f100708p;
                                l lVar = (l) result4;
                                String str = lVar.f217695a;
                                EsimMobilePlanCancellationFlowContract$InputData esimMobilePlanCancellationFlowContract$InputData2 = aVar4.o;
                                oki.h.t2(aVar4, iVar, new EsimMobilePlanCancellationFlowContract$Step.Cancellation(str, lVar.f217696b, lVar.f217697c, esimMobilePlanCancellationFlowContract$InputData2.f100700b, esimMobilePlanCancellationFlowContract$InputData2.f100701c, esimMobilePlanCancellationFlowContract$InputData2.d), true, null, false, 12);
                            } else if (result4 instanceof a.C0625a) {
                                aVar4.C2(new c(c4.ACTIVE));
                            } else {
                                if (!(result4 instanceof nnj.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                r6.b.D("Data Plan refund requested in Mobile Plan Cancellation flow. This output should not be reached.");
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            esimRefundReasonScreen.H = block;
            return esimRefundReasonScreen;
        }
        if (step instanceof EsimMobilePlanCancellationFlowContract$Step.Cancellation) {
            EsimMobilePlanCancellationFlowContract$Step.Cancellation cancellation = (EsimMobilePlanCancellationFlowContract$Step.Cancellation) step;
            EsimMobilePlanCancellationScreen esimMobilePlanCancellationScreen = new EsimMobilePlanCancellationScreen(new EsimMobilePlanCancellationScreenContract$InputData(cancellation.f100702a, cancellation.d, esimMobilePlanCancellationFlowContract$InputData.f100699a, cancellation.f100703b, cancellation.f100704c, cancellation.e, cancellation.f));
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: bgj.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            pgj.d result = (pgj.d) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.C2(new c(((pgj.c) result).f235975a));
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.a result2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.a) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z = result2 instanceof a.b;
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a aVar2 = aVar;
                            if (z) {
                                oki.h.t2(aVar2, aVar2.f100708p, EsimMobilePlanCancellationFlowContract$Step.Help.f100707a, true, null, false, 12);
                            } else if (result2 instanceof a.C0616a) {
                                oki.h.D2(aVar2.f100708p);
                            } else {
                                if (!(result2 instanceof a.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.C2(new c(c4.EXPIRED));
                            }
                            return Unit.f186387a;
                        case 2:
                            wfj.c result3 = (wfj.c) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a aVar3 = aVar;
                            oki.h.t2(aVar3, aVar3.f100708p, EsimMobilePlanCancellationFlowContract$Step.EsimRefund.f100706a, true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a result4 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z3 = result4 instanceof l;
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a aVar4 = aVar;
                            if (z3) {
                                yki.i iVar = aVar4.f100708p;
                                l lVar = (l) result4;
                                String str = lVar.f217695a;
                                EsimMobilePlanCancellationFlowContract$InputData esimMobilePlanCancellationFlowContract$InputData2 = aVar4.o;
                                oki.h.t2(aVar4, iVar, new EsimMobilePlanCancellationFlowContract$Step.Cancellation(str, lVar.f217696b, lVar.f217697c, esimMobilePlanCancellationFlowContract$InputData2.f100700b, esimMobilePlanCancellationFlowContract$InputData2.f100701c, esimMobilePlanCancellationFlowContract$InputData2.d), true, null, false, 12);
                            } else if (result4 instanceof a.C0625a) {
                                aVar4.C2(new c(c4.ACTIVE));
                            } else {
                                if (!(result4 instanceof nnj.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                r6.b.D("Data Plan refund requested in Mobile Plan Cancellation flow. This output should not be reached.");
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            esimMobilePlanCancellationScreen.H = block2;
            return esimMobilePlanCancellationScreen;
        }
        if (step instanceof EsimMobilePlanCancellationFlowContract$Step.EsimRefund) {
            EsimRefundFlow esimRefundFlow = new EsimRefundFlow(new EsimRefundFlowContract$InputData(EsimRefundFlowContract$EsimSubscriptionsToRefund.AllAvailable.f100866a));
            final int i3 = 0;
            Function1 block3 = new Function1() { // from class: bgj.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            pgj.d result = (pgj.d) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof pgj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.C2(new c(((pgj.c) result).f235975a));
                            return Unit.f186387a;
                        case 1:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.a result2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.a) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z = result2 instanceof a.b;
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a aVar2 = aVar;
                            if (z) {
                                oki.h.t2(aVar2, aVar2.f100708p, EsimMobilePlanCancellationFlowContract$Step.Help.f100707a, true, null, false, 12);
                            } else if (result2 instanceof a.C0616a) {
                                oki.h.D2(aVar2.f100708p);
                            } else {
                                if (!(result2 instanceof a.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.C2(new c(c4.EXPIRED));
                            }
                            return Unit.f186387a;
                        case 2:
                            wfj.c result3 = (wfj.c) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof wfj.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a aVar3 = aVar;
                            oki.h.t2(aVar3, aVar3.f100708p, EsimMobilePlanCancellationFlowContract$Step.EsimRefund.f100706a, true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a result4 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a) obj4;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z3 = result4 instanceof l;
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a aVar4 = aVar;
                            if (z3) {
                                yki.i iVar = aVar4.f100708p;
                                l lVar = (l) result4;
                                String str = lVar.f217695a;
                                EsimMobilePlanCancellationFlowContract$InputData esimMobilePlanCancellationFlowContract$InputData2 = aVar4.o;
                                oki.h.t2(aVar4, iVar, new EsimMobilePlanCancellationFlowContract$Step.Cancellation(str, lVar.f217696b, lVar.f217697c, esimMobilePlanCancellationFlowContract$InputData2.f100700b, esimMobilePlanCancellationFlowContract$InputData2.f100701c, esimMobilePlanCancellationFlowContract$InputData2.d), true, null, false, 12);
                            } else if (result4 instanceof a.C0625a) {
                                aVar4.C2(new c(c4.ACTIVE));
                            } else {
                                if (!(result4 instanceof nnj.m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                r6.b.D("Data Plan refund requested in Mobile Plan Cancellation flow. This output should not be reached.");
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            esimRefundFlow.H = block3;
            return esimRefundFlow;
        }
        if (!(step instanceof EsimMobilePlanCancellationFlowContract$Step.Help)) {
            throw new NoWhenBranchMatchedException();
        }
        EsimHelpFlow esimHelpFlow = new EsimHelpFlow(0);
        final int i5 = 2;
        Function1 block4 = new Function1() { // from class: bgj.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i5) {
                    case 0:
                        pgj.d result = (pgj.d) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (!(result instanceof pgj.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.C2(new c(((pgj.c) result).f235975a));
                        return Unit.f186387a;
                    case 1:
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.a result2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.a) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        boolean z = result2 instanceof a.b;
                        com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a aVar2 = aVar;
                        if (z) {
                            oki.h.t2(aVar2, aVar2.f100708p, EsimMobilePlanCancellationFlowContract$Step.Help.f100707a, true, null, false, 12);
                        } else if (result2 instanceof a.C0616a) {
                            oki.h.D2(aVar2.f100708p);
                        } else {
                            if (!(result2 instanceof a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.C2(new c(c4.EXPIRED));
                        }
                        return Unit.f186387a;
                    case 2:
                        wfj.c result3 = (wfj.c) obj4;
                        Intrinsics.checkNotNullParameter(result3, "result");
                        if (!(result3 instanceof wfj.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a aVar3 = aVar;
                        oki.h.t2(aVar3, aVar3.f100708p, EsimMobilePlanCancellationFlowContract$Step.EsimRefund.f100706a, true, null, false, 12);
                        return Unit.f186387a;
                    default:
                        com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a result4 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a) obj4;
                        Intrinsics.checkNotNullParameter(result4, "result");
                        boolean z3 = result4 instanceof l;
                        com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a aVar4 = aVar;
                        if (z3) {
                            yki.i iVar = aVar4.f100708p;
                            l lVar = (l) result4;
                            String str = lVar.f217695a;
                            EsimMobilePlanCancellationFlowContract$InputData esimMobilePlanCancellationFlowContract$InputData2 = aVar4.o;
                            oki.h.t2(aVar4, iVar, new EsimMobilePlanCancellationFlowContract$Step.Cancellation(str, lVar.f217696b, lVar.f217697c, esimMobilePlanCancellationFlowContract$InputData2.f100700b, esimMobilePlanCancellationFlowContract$InputData2.f100701c, esimMobilePlanCancellationFlowContract$InputData2.d), true, null, false, 12);
                        } else if (result4 instanceof a.C0625a) {
                            aVar4.C2(new c(c4.ACTIVE));
                        } else {
                            if (!(result4 instanceof nnj.m)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            r6.b.D("Data Plan refund requested in Mobile Plan Cancellation flow. This output should not be reached.");
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block4, "block");
        esimHelpFlow.H = block4;
        return esimHelpFlow;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        int i;
        String str;
        AliasType.TAX_NUMBER tax_number;
        AliasType.DOCUMENT_ID document_id;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        int i2;
        CircleIconBadge dangerCircleBadge;
        int i3;
        int i5;
        PasscodeScreenContract$VerificationMode passcodeScreenContract$VerificationMode;
        String str2;
        int i6 = this.f12996a;
        int i21 = 7;
        final int i22 = 2;
        Object obj4 = this.f12997b;
        switch (i6) {
            case 0:
                com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow.a aVar = (com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow.a) obj4;
                ConsentPromptFlowContract$Step step = (ConsentPromptFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!Intrinsics.f(step, ConsentPromptFlowContract$Step.ConsentPromptDialog.f86099a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ConsentPromptFlowContract$InputData consentPromptFlowContract$InputData = aVar.o;
                ConsentPromptScreen consentPromptScreen = new ConsentPromptScreen(new ConsentPromptScreenContract$InputData(consentPromptFlowContract$InputData.f86096a, consentPromptFlowContract$InputData.f86097b));
                z zVar = new z(aVar, 23);
                Intrinsics.checkNotNullParameter(zVar, "<set-?>");
                consentPromptScreen.H = zVar;
                return consentPromptScreen;
            case 1:
                final com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar2 = (com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a) obj4;
                PortfolioRevealFlowContract$InputData portfolioRevealFlowContract$InputData = aVar2.o;
                PortfolioRevealFlowContract$Step step2 = (PortfolioRevealFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (Intrinsics.f(step2, PortfolioRevealFlowContract$Step.Loading.f91422a)) {
                    PortfolioRevealLoadingScreen portfolioRevealLoadingScreen = new PortfolioRevealLoadingScreen(new PortfolioRevealLoadingScreenContract$InputData(portfolioRevealFlowContract$InputData.f91417a));
                    final int i32 = 0;
                    Function1 block = new Function1() { // from class: b8f.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i32) {
                                case 0:
                                    i output = (i) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar3 = aVar2;
                                    oki.h.t2(aVar3, aVar3.f91432r, new PortfolioRevealFlowContract$Step.Content(output.f13234a, output.f13235b), false, new MainElementMoveFromCenterTransitionAnimation("portfolio_reveal_card"), false, 8);
                                    return Unit.f186387a;
                                case 1:
                                    u output2 = (u) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ArrayList<TemplateIntroScreen> arrayList = output2.f13251a;
                                    com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar4 = aVar2;
                                    yki.i iVar = aVar4.f91432r;
                                    ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                    for (TemplateIntroScreen templateIntroScreen : arrayList) {
                                        arrayList2.add(new PortfolioRevealIntroScreenContract$TemplateIntroPage(templateIntroScreen.f91254a, templateIntroScreen.f91255b, templateIntroScreen.f91256c));
                                    }
                                    if (arrayList2.isEmpty()) {
                                        oki.h.u2(aVar4, iVar, PortfolioRevealFlowContract$Step.StrategyOverview.f91424a, null, 6);
                                    } else {
                                        oki.h.u2(aVar4, iVar, new PortfolioRevealFlowContract$Step.PortfolioRevealIntro(arrayList2), null, 6);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    h8f.h output3 = (h8f.h) obj5;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, h.a.f150037a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar5 = aVar2;
                                    oki.h.u2(aVar5, aVar5.f91432r, PortfolioRevealFlowContract$Step.StrategyOverview.f91424a, null, 6);
                                    return Unit.f186387a;
                                default:
                                    n8f.i result = (n8f.i) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, i.b.f213374a);
                                    com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar6 = aVar2;
                                    if (zF) {
                                        oki.h.t2(aVar6, aVar6.f91432r, PortfolioRevealFlowContract$Step.ExploreInsights.f91421a, true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(result, i.a.f213373a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar6.l2(new aza.g(aVar6, null, 4), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    portfolioRevealLoadingScreen.H = block;
                    return portfolioRevealLoadingScreen;
                }
                if (step2 instanceof PortfolioRevealFlowContract$Step.Content) {
                    PortfolioRevealFlowContract$Step.Content content = (PortfolioRevealFlowContract$Step.Content) step2;
                    PortfolioRevealScreen portfolioRevealScreen = new PortfolioRevealScreen(new PortfolioRevealScreenContract$InputData(portfolioRevealFlowContract$InputData.f91417a, content.f91419a, content.f91420b));
                    final int i33 = 1;
                    Function1 block2 = new Function1() { // from class: b8f.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i33) {
                                case 0:
                                    i output = (i) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar3 = aVar2;
                                    oki.h.t2(aVar3, aVar3.f91432r, new PortfolioRevealFlowContract$Step.Content(output.f13234a, output.f13235b), false, new MainElementMoveFromCenterTransitionAnimation("portfolio_reveal_card"), false, 8);
                                    return Unit.f186387a;
                                case 1:
                                    u output2 = (u) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ArrayList<TemplateIntroScreen> arrayList = output2.f13251a;
                                    com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar4 = aVar2;
                                    yki.i iVar = aVar4.f91432r;
                                    ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                    for (TemplateIntroScreen templateIntroScreen : arrayList) {
                                        arrayList2.add(new PortfolioRevealIntroScreenContract$TemplateIntroPage(templateIntroScreen.f91254a, templateIntroScreen.f91255b, templateIntroScreen.f91256c));
                                    }
                                    if (arrayList2.isEmpty()) {
                                        oki.h.u2(aVar4, iVar, PortfolioRevealFlowContract$Step.StrategyOverview.f91424a, null, 6);
                                    } else {
                                        oki.h.u2(aVar4, iVar, new PortfolioRevealFlowContract$Step.PortfolioRevealIntro(arrayList2), null, 6);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    h8f.h output3 = (h8f.h) obj5;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, h.a.f150037a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar5 = aVar2;
                                    oki.h.u2(aVar5, aVar5.f91432r, PortfolioRevealFlowContract$Step.StrategyOverview.f91424a, null, 6);
                                    return Unit.f186387a;
                                default:
                                    n8f.i result = (n8f.i) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, i.b.f213374a);
                                    com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar6 = aVar2;
                                    if (zF) {
                                        oki.h.t2(aVar6, aVar6.f91432r, PortfolioRevealFlowContract$Step.ExploreInsights.f91421a, true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(result, i.a.f213373a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar6.l2(new aza.g(aVar6, null, 4), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    portfolioRevealScreen.H = block2;
                    return portfolioRevealScreen;
                }
                if (step2 instanceof PortfolioRevealFlowContract$Step.PortfolioRevealIntro) {
                    PortfolioRevealIntroScreen portfolioRevealIntroScreen = new PortfolioRevealIntroScreen(new PortfolioRevealIntroScreenContract$InputData(((PortfolioRevealFlowContract$Step.PortfolioRevealIntro) step2).f91423a));
                    final int i43 = 2;
                    Function1 block3 = new Function1() { // from class: b8f.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i43) {
                                case 0:
                                    i output = (i) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar3 = aVar2;
                                    oki.h.t2(aVar3, aVar3.f91432r, new PortfolioRevealFlowContract$Step.Content(output.f13234a, output.f13235b), false, new MainElementMoveFromCenterTransitionAnimation("portfolio_reveal_card"), false, 8);
                                    return Unit.f186387a;
                                case 1:
                                    u output2 = (u) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ArrayList<TemplateIntroScreen> arrayList = output2.f13251a;
                                    com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar4 = aVar2;
                                    yki.i iVar = aVar4.f91432r;
                                    ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                    for (TemplateIntroScreen templateIntroScreen : arrayList) {
                                        arrayList2.add(new PortfolioRevealIntroScreenContract$TemplateIntroPage(templateIntroScreen.f91254a, templateIntroScreen.f91255b, templateIntroScreen.f91256c));
                                    }
                                    if (arrayList2.isEmpty()) {
                                        oki.h.u2(aVar4, iVar, PortfolioRevealFlowContract$Step.StrategyOverview.f91424a, null, 6);
                                    } else {
                                        oki.h.u2(aVar4, iVar, new PortfolioRevealFlowContract$Step.PortfolioRevealIntro(arrayList2), null, 6);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    h8f.h output3 = (h8f.h) obj5;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, h.a.f150037a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar5 = aVar2;
                                    oki.h.u2(aVar5, aVar5.f91432r, PortfolioRevealFlowContract$Step.StrategyOverview.f91424a, null, 6);
                                    return Unit.f186387a;
                                default:
                                    n8f.i result = (n8f.i) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, i.b.f213374a);
                                    com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar6 = aVar2;
                                    if (zF) {
                                        oki.h.t2(aVar6, aVar6.f91432r, PortfolioRevealFlowContract$Step.ExploreInsights.f91421a, true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(result, i.a.f213373a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar6.l2(new aza.g(aVar6, null, 4), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    portfolioRevealIntroScreen.H = block3;
                    return portfolioRevealIntroScreen;
                }
                if (!Intrinsics.f(step2, PortfolioRevealFlowContract$Step.StrategyOverview.f91424a)) {
                    if (Intrinsics.f(step2, PortfolioRevealFlowContract$Step.ExploreInsights.f91421a)) {
                        return new PortfolioInsightsFlow(new PortfolioInsightsFlowContract$InputData(portfolioRevealFlowContract$InputData.f91417a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                StrategyOverviewScreen strategyOverviewScreen = new StrategyOverviewScreen(new StrategyOverviewScreenContract$InputData(portfolioRevealFlowContract$InputData.f91417a));
                final int i59 = 3;
                Function1 block4 = new Function1() { // from class: b8f.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i59) {
                            case 0:
                                i output = (i) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar3 = aVar2;
                                oki.h.t2(aVar3, aVar3.f91432r, new PortfolioRevealFlowContract$Step.Content(output.f13234a, output.f13235b), false, new MainElementMoveFromCenterTransitionAnimation("portfolio_reveal_card"), false, 8);
                                return Unit.f186387a;
                            case 1:
                                u output2 = (u) obj5;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (output2 == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ArrayList<TemplateIntroScreen> arrayList = output2.f13251a;
                                com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar4 = aVar2;
                                yki.i iVar = aVar4.f91432r;
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                                for (TemplateIntroScreen templateIntroScreen : arrayList) {
                                    arrayList2.add(new PortfolioRevealIntroScreenContract$TemplateIntroPage(templateIntroScreen.f91254a, templateIntroScreen.f91255b, templateIntroScreen.f91256c));
                                }
                                if (arrayList2.isEmpty()) {
                                    oki.h.u2(aVar4, iVar, PortfolioRevealFlowContract$Step.StrategyOverview.f91424a, null, 6);
                                } else {
                                    oki.h.u2(aVar4, iVar, new PortfolioRevealFlowContract$Step.PortfolioRevealIntro(arrayList2), null, 6);
                                }
                                return Unit.f186387a;
                            case 2:
                                h8f.h output3 = (h8f.h) obj5;
                                Intrinsics.checkNotNullParameter(output3, "output");
                                if (!Intrinsics.f(output3, h.a.f150037a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar5 = aVar2;
                                oki.h.u2(aVar5, aVar5.f91432r, PortfolioRevealFlowContract$Step.StrategyOverview.f91424a, null, 6);
                                return Unit.f186387a;
                            default:
                                n8f.i result = (n8f.i) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean zF = Intrinsics.f(result, i.b.f213374a);
                                com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar6 = aVar2;
                                if (zF) {
                                    oki.h.t2(aVar6, aVar6.f91432r, PortfolioRevealFlowContract$Step.ExploreInsights.f91421a, true, null, false, 12);
                                } else {
                                    if (!Intrinsics.f(result, i.a.f213373a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar6.l2(new aza.g(aVar6, null, 4), new yi5.b(26));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block4, "block");
                strategyOverviewScreen.H = block4;
                return strategyOverviewScreen;
            case 2:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                b8l.b orderQuoteParams = (b8l.b) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
                return te0.w.o0(p0.f264003c, new b8l.c((b8l.f) obj4, orderQuoteParams, null, 0));
            case 3:
                DebtDetailsController debtDetailsController = (DebtDetailsController) obj4;
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                DebtDetailsController.Companion aVar3 = DebtDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = model.P;
                if (obj5 instanceof a0) {
                    return new d(field.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) debtDetailsController.Q.getValue(), null, null, false, false, 0, false, null, 1912);
                }
                return null;
            case 4:
                com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a aVar4 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DebtDetailsControllerContract$ModalStep step3 = (DebtDetailsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof DebtDetailsControllerContract$ModalStep.ValuePicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar5 = new lw0.a(new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_dialog_loan_type, null, null, 14), null, null, null, false, 30);
                a94.d dVar = aVar4.f67492r;
                int i66 = ((DebtDetailsControllerContract$ModalStep.ValuePicker) step3).f67473b;
                dVar.getClass();
                EnumEntries enumEntriesA = a94.c.a();
                ArrayList arrayList = new ArrayList(zhm.w.t(enumEntriesA, 10));
                Iterator it8 = enumEntriesA.iterator();
                int i74 = 0;
                while (it8.hasNext()) {
                    Object next = it8.next();
                    int i92 = i74 + 1;
                    if (i74 < 0) {
                        v.s();
                        throw null;
                    }
                    a94.c cVar = (a94.c) next;
                    Iterator it9 = it8;
                    boolean z = false;
                    arrayList.add(new RowDelegate.Model(cVar.toString(), new RowDelegate.Model.MainImage.Image24(new ResourceImage(cVar.b(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(cVar.c(), null, null, 14), null, 0, null, null, null, 0, i74 == i66 ? new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))) : null, true, null, i74 == i66, null, null, null, null, null, null, Integer.valueOf(i74), null, 0, 0, 0, 0, 532665336));
                    it8 = it9;
                    i74 = i92;
                }
                yp0.b.k(arrayList, 0, R$attr.uikit_dp16, 0, 0, 29);
                k9 k9Var = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                CreditBottomSheetListItemsController creditBottomSheetListItemsController = new CreditBottomSheetListItemsController(new cy4.a(aVar5, arrayList, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
                b58.f block5 = new b58.f(step3, aVar4, 16);
                Intrinsics.checkNotNullParameter(block5, "block");
                creditBottomSheetListItemsController.H = block5;
                return creditBottomSheetListItemsController;
            case 5:
                List records = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(records, "records");
                ((b97.l) obj4).f13694a.f("global_search_recent_queries_v1", records);
                return Unit.f186387a;
            case 6:
                AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                AmountEditView field2 = (AmountEditView) obj3;
                KProperty[] kPropertyArr = InStorePaymentScreen.f84499a0;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                Object obj6 = model2.f51629j;
                Intrinsics.i(obj6, "null cannot be cast to non-null type com.revolut.feature.revolutpay.impl.ui.instore.paymentscreen.InStorePaymentScreenContract.AmountParcel");
                b9c.d dVar2 = (b9c.d) obj6;
                return new d(field2.getEditText(), dVar2.f13701b, new u80.d(dVar2.f13700a), null, new zjh.j((InStorePaymentScreen) obj4), false, false, 0, false, null, 1960);
            case 7:
                com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a aVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                UploadScreenContract$ModalStep step4 = (UploadScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof UploadScreenContract$ModalStep.DocumentRemoveConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar7 = new lw0.a(new TextLocalisedClause(R$string.credit_application_documents_upload_document_remove_popup_title, u.c(((UploadScreenContract$ModalStep.DocumentRemoveConfirmation) step4).f67579a.f258207a.getName()), null, 12), new TextLocalisedClause(R$string.credit_application_documents_upload_document_remove_popup_description, null, null, 14), null, null, false, 28);
                g gVar = new g(new n6(new TextLocalisedClause(R$string.credit_application_documents_upload_document_remove_popup_primary_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.credit_application_documents_upload_document_remove_popup_secondary_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                k9 k9Var2 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar7, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                b58.f block6 = new b58.f(aVar6, step4, 20);
                Intrinsics.checkNotNullParameter(block6, "block");
                actionsBottomSheetController.H = block6;
                return actionsBottomSheetController;
            case 8:
                ba7.g gVar2 = (ba7.g) obj4;
                Throwable th10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                if (th10 == null) {
                    throw new IllegalStateException(p.a.p("Unable to fetch ", gVar2.f13973a.f306286a, " mid exchange rate"));
                }
                throw th10;
            case 9:
                com.revolut.feature.pix.impl.flow.common.a aVar8 = (com.revolut.feature.pix.impl.flow.common.a) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                PixCommonModalsContract$Step step5 = (PixCommonModalsContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof PixCommonModalsContract$Step.ShowAddress) {
                    PixQrCodeAddressScreen pixQrCodeAddressScreen = new PixQrCodeAddressScreen(new PixQrCodeAddressScreenContract$InputData(((PixCommonModalsContract$Step.ShowAddress) step5).f80627a));
                    baa.c block7 = new baa.c(aVar8, FlowCoordinator, 0);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    pixQrCodeAddressScreen.H = block7;
                    return pixQrCodeAddressScreen;
                }
                if (step5 instanceof PixCommonModalsContract$Step.ShowAdditionalInformation) {
                    PixQrCodeAdditionalInformationScreen pixQrCodeAdditionalInformationScreen = new PixQrCodeAdditionalInformationScreen(new PixQrCodeAdditionalInformationScreenContract$InputData(((PixCommonModalsContract$Step.ShowAdditionalInformation) step5).f80626a));
                    baa.c block8 = new baa.c(aVar8, FlowCoordinator, 1);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    pixQrCodeAdditionalInformationScreen.H = block8;
                    return pixQrCodeAdditionalInformationScreen;
                }
                if (!(step5 instanceof PixCommonModalsContract$Step.ShowMoneyBreakdown)) {
                    throw new NoWhenBranchMatchedException();
                }
                PixCommonModalsContract$Step.ShowMoneyBreakdown showMoneyBreakdown = (PixCommonModalsContract$Step.ShowMoneyBreakdown) step5;
                PixQrCodeMoneyBreakdownScreen pixQrCodeMoneyBreakdownScreen = new PixQrCodeMoneyBreakdownScreen(new PixQrCodeMoneyBreakdownScreenContract$InputData(showMoneyBreakdown.f80628a, showMoneyBreakdown.f80629b, showMoneyBreakdown.f80630c, showMoneyBreakdown.d));
                baa.c block9 = new baa.c(aVar8, FlowCoordinator, 2);
                Intrinsics.checkNotNullParameter(block9, "block");
                pixQrCodeMoneyBreakdownScreen.H = block9;
                return pixQrCodeMoneyBreakdownScreen;
            case 10:
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a aVar9 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AccountInformationScreenContract$ModalStep step6 = (AccountInformationScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof AccountInformationScreenContract$ModalStep.BrokerCountryChooser)) {
                    throw new NoWhenBranchMatchedException();
                }
                wi0.b bVar = ((baf.i) ((j2) aVar9.f91596p.f22677a).getValue()).f14054c;
                x xVar = new x(null, null, null, null, false, null, new TextLocalisedClause(R.string.search_country, null, null, 14), null, null, false, null, bVar != null ? bVar.f297794a : null, null, null, true, null, null, null, null, null, 2138963454);
                Object obj7 = aVar9.o.get();
                Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
                PickerController pickerController = new PickerController(xVar, (x7a.d) obj7);
                b9i.f block10 = new b9i.f(aVar9, 3);
                Intrinsics.checkNotNullParameter(block10, "block");
                pickerController.H = block10;
                return pickerController;
            case 11:
                com.revolut.feature_retail_user_declarations.bank_terms.a aVar10 = (com.revolut.feature_retail_user_declarations.bank_terms.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AcceptBankTermsScreenContract$ModalStep step7 = (AcceptBankTermsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!Intrinsics.f(step7, AcceptBankTermsScreenContract$ModalStep.BasicAccountDialog.f97487a)) {
                    throw new NoWhenBranchMatchedException();
                }
                r rVar = aVar10.f97490r;
                List listC = u.c(((o8b.g) rVar.f14112b).a(rVar.f14111a.f97486a.getF97483a().f297794a));
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R.string.account_terms_basic_account_dialog_title, listC, null, 12);
                List listK = v.k(new TextLocalisedClause(R.string.account_terms_basic_account_dialog_subtitle, listC, null, 12), new TextLocalisedClause(R.string.account_terms_basic_account_read_more, null, new Click(30, (Integer) null, (Object) null, "BASIC_ACCOUNT_READ_MORE_CLAUSE_ID", false), 10));
                m70.a.t(t0.f186434a);
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(new lw0.a(textLocalisedClause3, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, false, 28), new g(new n6(new TextLocalisedClause(R.string.account_terms_basic_account_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.account_terms_basic_account_declare, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25), AnalyticsProduct.Shared.Onboarding.f, null, null, 24));
                ax9.d block11 = new ax9.d(1, aVar10, com.revolut.feature_retail_user_declarations.bank_terms.a.class, "handleBasicAccountDialogResult", "handleBasicAccountDialogResult(Lcom/revolut/kompot/common/bottom_sheet/actions/ActionsBottomSheetController$OutputData;)V", 0, 8);
                Intrinsics.checkNotNullParameter(block11, "block");
                actionsBottomSheetController2.H = block11;
                return actionsBottomSheetController2;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((bai.q) obj4).d(bai.q.b(), false, false);
            case 13:
                ta.j details = (ta.j) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(details, "details");
                ((bb.b) obj4).d.f("USER_DETAILS_MEMORY_KEY", details);
                return Unit.f186387a;
            case 14:
                com.revolut.core.backend_flow.impl.ui.card_photo.a aVar11 = (com.revolut.core.backend_flow.impl.ui.card_photo.a) obj4;
                BackendFlowCardPhotoFlowContract$Step step8 = (BackendFlowCardPhotoFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof BackendFlowCardPhotoFlowContract$Step.CardPhoto)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str3 = aVar11.o.f51259a;
                m70.a.c(t0.f186434a);
                CardPhotoScreen cardPhotoScreen = new CardPhotoScreen(new CardPhotoScreenContract$InputData(str3, "", lc0.n.CARD));
                b9i.f block12 = new b9i.f(aVar11, i21);
                Intrinsics.checkNotNullParameter(block12, "block");
                cardPhotoScreen.H = block12;
                return cardPhotoScreen;
            case 15:
                com.revolut.feature.apm.payid.impl.screen.settings.a aVar12 = (com.revolut.feature.apm.payid.impl.screen.settings.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SettingsScreenContract$ModalStep step9 = (SettingsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof SettingsScreenContract$ModalStep.OpenActions) {
                    AliasActionsScreen aliasActionsScreen = new AliasActionsScreen(new cb2.d(((SettingsScreenContract$ModalStep.OpenActions) step9).f62733a));
                    bb2.x block13 = new bb2.x(aVar12, step9, 0);
                    Intrinsics.checkNotNullParameter(block13, "block");
                    aliasActionsScreen.H = block13;
                    return aliasActionsScreen;
                }
                boolean z3 = step9 instanceof SettingsScreenContract$ModalStep.AddAlias;
                AliasType.EMAIL email = AliasType.EMAIL.f61894b;
                AliasType.PHONE phone = AliasType.PHONE.f61895b;
                AliasType.REVTAG_EMAIL revtag_email = AliasType.REVTAG_EMAIL.f61896b;
                AliasType.TAX_NUMBER tax_number2 = AliasType.TAX_NUMBER.f61897b;
                AliasType.DOCUMENT_ID document_id2 = AliasType.DOCUMENT_ID.f61893b;
                AliasType.ALPHANUMERIC alphanumeric = AliasType.ALPHANUMERIC.f61892b;
                if (z3) {
                    eb2.a aVar13 = aVar12.u;
                    Alias alias = ((SettingsScreenContract$ModalStep.AddAlias) step9).f62730a;
                    aVar13.getClass();
                    Intrinsics.checkNotNullParameter(alias, "alias");
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.apm.payid.api.R$string.add_payid_confirmation_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.apm.payid.api.R$string.add_payid_confirmation_subtitle, null, null, 14);
                    TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.apm.payid.api.R$string.add_payid_confirmation_actions_add, null, null, 14);
                    String str4 = alias.f61879b;
                    AliasStatus aliasStatus = alias.f61880c;
                    AliasType aliasType = alias.f61878a;
                    if (Intrinsics.f(aliasType, email)) {
                        i3 = com.revolut.feature.apm.core.api.R$string.alias_alias_type_email;
                    } else if (Intrinsics.f(aliasType, phone)) {
                        i3 = com.revolut.feature.apm.core.api.R$string.alias_alias_type_mobile;
                    } else {
                        if (!Intrinsics.f(aliasType, revtag_email)) {
                            if (!Intrinsics.f(aliasType, tax_number2) && !Intrinsics.f(aliasType, document_id2) && !Intrinsics.f(aliasType, alphanumeric)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalArgumentException(aliasType + " unsupported");
                        }
                        i3 = com.revolut.feature.apm.core.api.R$string.alias_alias_type_revolut_address;
                    }
                    TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(i3, null, null, 14);
                    AliasStatus.AVAILABLE available = AliasStatus.AVAILABLE.f61886b;
                    if (!Intrinsics.f(aliasStatus, available)) {
                        throw new IllegalStateException("Unsupported alias status!");
                    }
                    TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_status_available, null, new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254), 10);
                    if (Intrinsics.f(aliasType, email)) {
                        i5 = R$drawable.uikit_icn_24_mail;
                    } else if (Intrinsics.f(aliasType, phone)) {
                        i5 = R$drawable.uikit_icn_24_smartphone;
                    } else if (Intrinsics.f(aliasType, revtag_email)) {
                        i5 = R$drawable.uikit_icn_24_revolut;
                    } else if (Intrinsics.f(aliasType, tax_number2) || Intrinsics.f(aliasType, document_id2)) {
                        i5 = R$drawable.uikit_icn_24_national_id;
                    } else {
                        if (!Intrinsics.f(aliasType, alphanumeric)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i5 = R$drawable.uikit_icn_24_passkey;
                    }
                    int i96 = i5;
                    if (!Intrinsics.f(aliasStatus, available)) {
                        throw new IllegalStateException("Unsupported alias status!");
                    }
                    ConfirmAliasActionScreen confirmAliasActionScreen = new ConfirmAliasActionScreen(new eb2.d(textLocalisedClause4, textLocalisedClause5, textLocalisedClause6, str4, textLocalisedClause7, textLocalisedClause8, i96, new WhiteCircleBadge(dw0.a.Checked)));
                    bb2.x block14 = new bb2.x(step9, aVar12);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    confirmAliasActionScreen.H = block14;
                    return confirmAliasActionScreen;
                }
                if (!(step9 instanceof SettingsScreenContract$ModalStep.DeleteAlias)) {
                    if (!(step9 instanceof SettingsScreenContract$ModalStep.DisabledAliasInfo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lw0.a aVar14 = new lw0.a(new TextLocalisedClause(com.revolut.feature.apm.payid.api.R$string.payid_alias_disabled_info_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.payid.api.R$string.payid_alias_disabled_info_description, null, null, 14), null, null, false, 28);
                    aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.apm.payid.api.R$string.payid_alias_disabled_info_confirm, null, null, 14), LargeActionButton.ButtonStyle.d, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var3 = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar14, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                }
                eb2.l lVar = aVar12.f62738t;
                Alias alias2 = ((SettingsScreenContract$ModalStep.DeleteAlias) step9).f62731a;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(alias2, "alias");
                TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(com.revolut.feature.apm.payid.api.R$string.delete_pay_id_title, null, null, 14);
                TextLocalisedClause textLocalisedClause10 = new TextLocalisedClause(com.revolut.feature.apm.payid.api.R$string.delete_pay_id_subtitle, null, null, 14);
                TextLocalisedClause textLocalisedClause11 = new TextLocalisedClause(com.revolut.feature.apm.payid.api.R$string.delete_pay_id_actions_delete, null, null, 14);
                String str5 = alias2.f61879b;
                AliasStatus aliasStatus2 = alias2.f61880c;
                AliasType aliasType2 = alias2.f61878a;
                if (Intrinsics.f(aliasType2, email)) {
                    i = com.revolut.feature.apm.core.api.R$string.alias_alias_type_email;
                } else if (Intrinsics.f(aliasType2, phone)) {
                    i = com.revolut.feature.apm.core.api.R$string.alias_alias_type_mobile;
                } else {
                    if (!Intrinsics.f(aliasType2, revtag_email)) {
                        if (!Intrinsics.f(aliasType2, tax_number2) && !Intrinsics.f(aliasType2, document_id2) && !Intrinsics.f(aliasType2, alphanumeric)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalArgumentException(aliasType2 + " unsupported");
                    }
                    i = com.revolut.feature.apm.core.api.R$string.alias_alias_type_revolut_address;
                }
                TextLocalisedClause textLocalisedClause12 = new TextLocalisedClause(i, null, null, 14);
                AliasStatus.ACTIVE active = AliasStatus.ACTIVE.f61885b;
                boolean zF = Intrinsics.f(aliasStatus2, active);
                AliasStatus.DISABLED disabled = AliasStatus.DISABLED.f61888b;
                if (zF) {
                    textLocalisedClause = textLocalisedClause12;
                    str = "Unsupported alias status!";
                    tax_number = tax_number2;
                    document_id = document_id2;
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_status_active, null, new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254), 10);
                } else {
                    str = "Unsupported alias status!";
                    tax_number = tax_number2;
                    document_id = document_id2;
                    textLocalisedClause = textLocalisedClause12;
                    if (!Intrinsics.f(aliasStatus2, disabled)) {
                        throw new IllegalStateException(str);
                    }
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_status_disabled, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10);
                }
                TextLocalisedClause textLocalisedClause13 = textLocalisedClause2;
                if (Intrinsics.f(aliasType2, email)) {
                    i2 = R$drawable.uikit_icn_24_mail;
                } else if (Intrinsics.f(aliasType2, phone)) {
                    i2 = R$drawable.uikit_icn_24_smartphone;
                } else {
                    if (!Intrinsics.f(aliasType2, revtag_email)) {
                        if (!Intrinsics.f(aliasType2, tax_number) && !Intrinsics.f(aliasType2, document_id) && !Intrinsics.f(aliasType2, alphanumeric)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalArgumentException(aliasType2 + " unsupported");
                    }
                    i2 = R$drawable.uikit_icn_24_revolut;
                }
                int i99 = i2;
                if (Intrinsics.f(aliasStatus2, active)) {
                    dangerCircleBadge = new WhiteCircleBadge(dw0.a.Checked);
                } else {
                    if (!Intrinsics.f(aliasStatus2, disabled)) {
                        throw new IllegalStateException(str);
                    }
                    dangerCircleBadge = new DangerCircleBadge(dw0.a.Frozen);
                }
                ConfirmAliasActionScreen confirmAliasActionScreen2 = new ConfirmAliasActionScreen(new eb2.d(textLocalisedClause9, textLocalisedClause10, textLocalisedClause11, str5, textLocalisedClause, textLocalisedClause13, i99, dangerCircleBadge));
                bb2.x block15 = new bb2.x(aVar12, step9, 2);
                Intrinsics.checkNotNullParameter(block15, "block");
                confirmAliasActionScreen2.H = block15;
                return confirmAliasActionScreen2;
            case 16:
                com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.b bVar2 = (com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                BiometricAuthenticationFlowContract$Step step10 = (BiometricAuthenticationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof BiometricAuthenticationFlowContract$Step.Authentication)) {
                    throw new NoWhenBranchMatchedException();
                }
                k9 k9Var4 = k9.SecurityHub;
                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                AnalyticsProduct.Retail retailH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4);
                PasscodeScreenContract$InputData.Companion companion = PasscodeScreenContract$InputData.INSTANCE;
                PinCodeView.Header.Title title = new PinCodeView.Header.Title(6, new TextLocalisedClause(com.revolut.feature.passcode.R$string.passcode_title_enter_passcode, null, null, 14), (TextLocalisedClause) null);
                BiometricAuthenticationFlowContract$Step.Authentication authentication = (BiometricAuthenticationFlowContract$Step.Authentication) step10;
                PinCodeView.Mode mode = authentication.f74653a;
                int i100 = bb7.c.f14177a[authentication.f74654b.ordinal()];
                if (i100 == 1) {
                    passcodeScreenContract$VerificationMode = new PasscodeScreenContract$VerificationMode.Default(true);
                } else {
                    if (i100 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    passcodeScreenContract$VerificationMode = PasscodeScreenContract$VerificationMode.BiometricsOnly.f78628a;
                }
                BiometricPasscodeVerificationFlow biometricPasscodeVerificationFlow = new BiometricPasscodeVerificationFlow(new BiometricPasscodeVerificationFlowContract$InputData(retailH, PasscodeScreenContract$InputData.Companion.d(companion, title, mode, passcodeScreenContract$VerificationMode, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, 376)));
                b58.f block16 = new b58.f(bVar2, LazyFlowCoordinator, 21);
                Intrinsics.checkNotNullParameter(block16, "block");
                biometricPasscodeVerificationFlow.H = block16;
                return biometricPasscodeVerificationFlow;
            case 17:
                final com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar15 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelHotelsAmendmentConfirmationScreenContract$ModalStep step11 = (TravelHotelsAmendmentConfirmationScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof TravelHotelsAmendmentConfirmationScreenContract$ModalStep.RevPayPocketSelection) {
                    dj0.d dVar3 = ((TravelHotelsAmendmentConfirmationScreenContract$ModalStep.RevPayPocketSelection) step11).f93824a;
                    t tVar = t.STAYS;
                    Object content2 = ((bbg.j) ((j2) aVar15.D.f22677a).getValue()).d.getContent();
                    ecg.g gVar3 = content2 instanceof ecg.g ? (ecg.g) content2 : null;
                    ViewController viewControllerE1 = aVar15.e1(new w6c.i(new PayWithAnyControllerDescriptor$InputData(tVar, dVar3, gVar3 != null ? gVar3.f124732a : null, null, null, null, f.ONLY_POCKETS_FILTERED_BY_BALANCE, null, null, false, 1912)));
                    final int i101 = 0;
                    Function1 block17 = new Function1() { // from class: bbg.u
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            dj0.d dVar4;
                            int i102 = i101;
                            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar16 = aVar15;
                            switch (i102) {
                                case 0:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar17 = aVar15;
                                    wbg.e eVar2 = aVar17.f93826p;
                                    w6c.e output = (w6c.e) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!(output instanceof w6c.b) && !(output instanceof w6c.a)) {
                                        if (output instanceof w6c.d) {
                                            Object content3 = ((j) ((j2) aVar17.D.f22677a).getValue()).e.getContent();
                                            ecg.b bVar3 = content3 instanceof ecg.b ? (ecg.b) content3 : null;
                                            if (bVar3 != null && (dVar4 = bVar3.f124728a) != null) {
                                                w6c.h hVar = ((w6c.d) output).f295414a;
                                                if (hVar != null) {
                                                    yji.l.a1(aVar17, ((wbg.s) eVar2).a(hVar, dVar4), null, null, null, 7);
                                                } else {
                                                    String strM = o0.f186429a.b(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a.class).m();
                                                    String str6 = strM != null ? strM : "Stays";
                                                    h0 h0Var = h0.f322473a;
                                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                    rd0.d.a(rd0.c.ERROR, str6, "Can not update topped-up balance: topUpTarget is null", null, h0Var);
                                                    Unit unit = Unit.f186387a;
                                                }
                                            }
                                        } else {
                                            if (!(output instanceof w6c.c)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            PaymentMethod paymentMethod = ((w6c.c) output).f295413a;
                                            PaymentMethod.Pocket pocket = paymentMethod instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) paymentMethod : null;
                                            if (pocket != null) {
                                                j2 j2Var = ((wbg.s) eVar2).i;
                                                od0.i.Companion.getClass();
                                                od0.i iVarA = od0.h.a(pocket);
                                                j2Var.getClass();
                                                j2Var.g(null, iVarA);
                                            } else {
                                                String strM2 = o0.f186429a.b(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a.class).m();
                                                foh.i.p(paymentMethod, strM2 != null ? strM2 : "Stays");
                                            }
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    iub.a it10 = (iub.a) obj8;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    aVar16.C.a();
                                    return Unit.f186387a;
                                default:
                                    zbg.c output2 = (zbg.c) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    wbg.e eVar3 = aVar16.f93826p;
                                    RevolutCardWithBalanceCheck revolutCardWithBalanceCheck = output2.f320885a;
                                    j2 j2Var2 = ((wbg.s) eVar3).f296201h;
                                    od0.i.Companion.getClass();
                                    od0.i iVarA2 = od0.h.a(revolutCardWithBalanceCheck);
                                    j2Var2.getClass();
                                    j2Var2.g(null, iVarA2);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    viewControllerE1.H = block17;
                    return viewControllerE1;
                }
                if (step11 instanceof TravelHotelsAmendmentConfirmationScreenContract$ModalStep.CardSelection) {
                    TravelHotelsCardSelectionScreen travelHotelsCardSelectionScreen = new TravelHotelsCardSelectionScreen(new TravelHotelsCardSelectionScreenContract$InputData(((TravelHotelsAmendmentConfirmationScreenContract$ModalStep.CardSelection) step11).f93823a));
                    Function1 block18 = new Function1() { // from class: bbg.u
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            dj0.d dVar4;
                            int i102 = i22;
                            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar16 = aVar15;
                            switch (i102) {
                                case 0:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar17 = aVar15;
                                    wbg.e eVar2 = aVar17.f93826p;
                                    w6c.e output = (w6c.e) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!(output instanceof w6c.b) && !(output instanceof w6c.a)) {
                                        if (output instanceof w6c.d) {
                                            Object content3 = ((j) ((j2) aVar17.D.f22677a).getValue()).e.getContent();
                                            ecg.b bVar3 = content3 instanceof ecg.b ? (ecg.b) content3 : null;
                                            if (bVar3 != null && (dVar4 = bVar3.f124728a) != null) {
                                                w6c.h hVar = ((w6c.d) output).f295414a;
                                                if (hVar != null) {
                                                    yji.l.a1(aVar17, ((wbg.s) eVar2).a(hVar, dVar4), null, null, null, 7);
                                                } else {
                                                    String strM = o0.f186429a.b(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a.class).m();
                                                    String str6 = strM != null ? strM : "Stays";
                                                    h0 h0Var = h0.f322473a;
                                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                    rd0.d.a(rd0.c.ERROR, str6, "Can not update topped-up balance: topUpTarget is null", null, h0Var);
                                                    Unit unit = Unit.f186387a;
                                                }
                                            }
                                        } else {
                                            if (!(output instanceof w6c.c)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            PaymentMethod paymentMethod = ((w6c.c) output).f295413a;
                                            PaymentMethod.Pocket pocket = paymentMethod instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) paymentMethod : null;
                                            if (pocket != null) {
                                                j2 j2Var = ((wbg.s) eVar2).i;
                                                od0.i.Companion.getClass();
                                                od0.i iVarA = od0.h.a(pocket);
                                                j2Var.getClass();
                                                j2Var.g(null, iVarA);
                                            } else {
                                                String strM2 = o0.f186429a.b(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a.class).m();
                                                foh.i.p(paymentMethod, strM2 != null ? strM2 : "Stays");
                                            }
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    iub.a it10 = (iub.a) obj8;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    aVar16.C.a();
                                    return Unit.f186387a;
                                default:
                                    zbg.c output2 = (zbg.c) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    wbg.e eVar3 = aVar16.f93826p;
                                    RevolutCardWithBalanceCheck revolutCardWithBalanceCheck = output2.f320885a;
                                    j2 j2Var2 = ((wbg.s) eVar3).f296201h;
                                    od0.i.Companion.getClass();
                                    od0.i iVarA2 = od0.h.a(revolutCardWithBalanceCheck);
                                    j2Var2.getClass();
                                    j2Var2.g(null, iVarA2);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    travelHotelsCardSelectionScreen.H = block18;
                    return travelHotelsCardSelectionScreen;
                }
                if (step11 instanceof TravelHotelsAmendmentConfirmationScreenContract$ModalStep.TermsReview) {
                    k0c.a aVar16 = aVar15.v;
                    RevPointsTermsReviewInputData revPointsTermsReviewInputData = ((TravelHotelsAmendmentConfirmationScreenContract$ModalStep.TermsReview) step11).f93825a;
                    aVar16.getClass();
                    RevPointsTermsReviewFlow revPointsTermsReviewFlowA = k0c.a.a(revPointsTermsReviewInputData);
                    final int i102 = 1;
                    Function1 block19 = new Function1() { // from class: bbg.u
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            dj0.d dVar4;
                            int i1022 = i102;
                            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar162 = aVar15;
                            switch (i1022) {
                                case 0:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar17 = aVar15;
                                    wbg.e eVar2 = aVar17.f93826p;
                                    w6c.e output = (w6c.e) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!(output instanceof w6c.b) && !(output instanceof w6c.a)) {
                                        if (output instanceof w6c.d) {
                                            Object content3 = ((j) ((j2) aVar17.D.f22677a).getValue()).e.getContent();
                                            ecg.b bVar3 = content3 instanceof ecg.b ? (ecg.b) content3 : null;
                                            if (bVar3 != null && (dVar4 = bVar3.f124728a) != null) {
                                                w6c.h hVar = ((w6c.d) output).f295414a;
                                                if (hVar != null) {
                                                    yji.l.a1(aVar17, ((wbg.s) eVar2).a(hVar, dVar4), null, null, null, 7);
                                                } else {
                                                    String strM = o0.f186429a.b(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a.class).m();
                                                    String str6 = strM != null ? strM : "Stays";
                                                    h0 h0Var = h0.f322473a;
                                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                    rd0.d.a(rd0.c.ERROR, str6, "Can not update topped-up balance: topUpTarget is null", null, h0Var);
                                                    Unit unit = Unit.f186387a;
                                                }
                                            }
                                        } else {
                                            if (!(output instanceof w6c.c)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            PaymentMethod paymentMethod = ((w6c.c) output).f295413a;
                                            PaymentMethod.Pocket pocket = paymentMethod instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) paymentMethod : null;
                                            if (pocket != null) {
                                                j2 j2Var = ((wbg.s) eVar2).i;
                                                od0.i.Companion.getClass();
                                                od0.i iVarA = od0.h.a(pocket);
                                                j2Var.getClass();
                                                j2Var.g(null, iVarA);
                                            } else {
                                                String strM2 = o0.f186429a.b(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a.class).m();
                                                foh.i.p(paymentMethod, strM2 != null ? strM2 : "Stays");
                                            }
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    iub.a it10 = (iub.a) obj8;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    aVar162.C.a();
                                    return Unit.f186387a;
                                default:
                                    zbg.c output2 = (zbg.c) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    wbg.e eVar3 = aVar162.f93826p;
                                    RevolutCardWithBalanceCheck revolutCardWithBalanceCheck = output2.f320885a;
                                    j2 j2Var2 = ((wbg.s) eVar3).f296201h;
                                    od0.i.Companion.getClass();
                                    od0.i iVarA2 = od0.h.a(revolutCardWithBalanceCheck);
                                    j2Var2.getClass();
                                    j2Var2.g(null, iVarA2);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    revPointsTermsReviewFlowA.H = block19;
                    return revPointsTermsReviewFlowA;
                }
                if (!(step11 instanceof TravelHotelsAmendmentConfirmationScreenContract$ModalStep.BedOptionsSelection)) {
                    if (!(step11 instanceof TravelHotelsAmendmentConfirmationScreenContract$ModalStep.BreakdownDisclaimer)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TravelHotelsAmendmentConfirmationScreenContract$ModalStep.BreakdownDisclaimer breakdownDisclaimer = (TravelHotelsAmendmentConfirmationScreenContract$ModalStep.BreakdownDisclaimer) step11;
                    return aVar15.e1(new w6c.k(new PaymentBreakdownControllerDescriptor$InputData(breakdownDisclaimer.f93820a, breakdownDisclaimer.f93822c, w6c.j.PAYMENT, new PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Default(breakdownDisclaimer.d, hb9.b.C(breakdownDisclaimer.f93821b)))));
                }
                TravelHotelsAmendmentConfirmationScreenContract$ModalStep.BedOptionsSelection bedOptionsSelection = (TravelHotelsAmendmentConfirmationScreenContract$ModalStep.BedOptionsSelection) step11;
                TravelHotelsBedOptionsSelectionScreen travelHotelsBedOptionsSelectionScreen = new TravelHotelsBedOptionsSelectionScreen(new TravelHotelsBedOptionsSelectionScreenContract$InputData(bedOptionsSelection.f93817a, bedOptionsSelection.f93818b));
                b58.f block20 = new b58.f(aVar15, bedOptionsSelection, 23);
                Intrinsics.checkNotNullParameter(block20, "block");
                travelHotelsBedOptionsSelectionScreen.H = block20;
                return travelHotelsBedOptionsSelectionScreen;
            case 18:
                bc9.j jVar = (bc9.j) obj4;
                OnboardingWorkflowFlowContract$Step step12 = (OnboardingWorkflowFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                wi0.b bVar3 = step12.f78518a;
                String str6 = step12.f78519b;
                String str7 = step12.f78520c;
                AnalyticsProduct.Companion companion2 = AnalyticsProduct.INSTANCE;
                k9 k9Var5 = k9.Onboarding;
                companion2.getClass();
                ViewController viewControllerE12 = jVar.e1(new til.c(new WorkflowControllerDescriptor$InputData(new WorkflowConfiguration.Workflow(str6, bVar3, (NaviCommand) null, str7, AnalyticsProduct.Companion.b(k9Var5), (WorkflowConfiguration.Extras) null, 36), WorkflowFlowType.Onboarding.f105818a, til.i.DEFAULT, 48)));
                b58.f block21 = new b58.f(jVar, step12, 26);
                Intrinsics.checkNotNullParameter(block21, "block");
                viewControllerE12.H = block21;
                return viewControllerE12;
            case 19:
                w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                Boolean bool = (Boolean) obj3;
                boolean zBooleanValue = bool.booleanValue();
                Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                d0<cd9.d> plannedUserMigration = ((bd9.c) obj4).f14541a.getPlannedUserMigration("planned", zBooleanValue ? bool : null);
                bd9.b bVar4 = bd9.b.f;
                a0.b bVar5 = new a0.b(27);
                plannedUserMigration.getClass();
                ufm.i iVar = new ufm.i(plannedUserMigration, bVar5, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 20:
                xck.b data = (xck.b) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(data, "data");
                ((bdk.c) obj4).f14609b.f("MILESTONE_REWARDS_KEY", data);
                return Unit.f186387a;
            case 21:
                xck.m data2 = (xck.m) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(data2, "data");
                ((bdk.f) obj4).f14613b.f("MONTHLY_DRAW_HUB_KEY", data2);
                return Unit.f186387a;
            case 22:
                final com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar17 = (com.revolut.feature.revolutpay.shared.ui.pay_with_any.a) obj4;
                PayWithAnyControllerDescriptor$InputData payWithAnyControllerDescriptor$InputData = aVar17.f84726r;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                final PayWithAnyContract$ModalStep step13 = (PayWithAnyContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof PayWithAnyContract$ModalStep.AddCard) {
                    PayWithAnyContract$ModalStep.AddCard addCard = (PayWithAnyContract$ModalStep.AddCard) step13;
                    ViewController viewControllerE13 = aVar17.e1(new gdc.c(new AddPaymentMethodControllerDescriptor$InputData(addCard.f84718a, addCard.f84719b, payWithAnyControllerDescriptor$InputData.f, payWithAnyControllerDescriptor$InputData.f84430a, payWithAnyControllerDescriptor$InputData.f84432c, payWithAnyControllerDescriptor$InputData.f84434h)));
                    bec.h0 block22 = new bec.h0(aVar17, i22);
                    Intrinsics.checkNotNullParameter(block22, "block");
                    viewControllerE13.H = block22;
                    return viewControllerE13;
                }
                if (step13 instanceof PayWithAnyContract$ModalStep.ConfirmDeleteCard) {
                    aVar17.f84725q.getClass();
                    lw0.a aVar18 = new lw0.a(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_payment_method_selector_card_management_delete_card_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_payment_method_selector_card_management_delete_card_subtitle, null, null, 14), null, null, false, 28);
                    g gVar4 = new g(new n6(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_payment_method_selector_card_management_delete_card_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_payment_method_selector_card_management_delete_card_delete, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                    k9 k9Var6 = k9.RevolutPay;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar18, gVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6), null, null, 24));
                    final int i103 = 0;
                    Function1 block23 = new Function1() { // from class: bec.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i103) {
                                case 0:
                                    dii.g it10 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar19 = aVar17;
                                    aVar19.n2(new b96.d(it10, aVar19, ((PayWithAnyContract$ModalStep.ConfirmDeleteCard) step13).f84721a, null, 10), new whi.b(6));
                                    return Unit.f186387a;
                                default:
                                    pdc.a it11 = (pdc.a) obj8;
                                    Intrinsics.checkNotNullParameter(it11, "it");
                                    String str8 = ((PayWithAnyContract$ModalStep.CardOptions) step13).f84720a;
                                    if (!(it11 instanceof pdc.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.v2(aVar17.f84729w, new PayWithAnyContract$ModalStep.ConfirmDeleteCard(str8), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block23, "block");
                    actionsBottomSheetController3.H = block23;
                    return actionsBottomSheetController3;
                }
                if (step13 instanceof PayWithAnyContract$ModalStep.InsufficientFundsOptions) {
                    InsufficientFundsOptionsScreen insufficientFundsOptionsScreen = new InsufficientFundsOptionsScreen(new InsufficientFundsOptionsContract$InputData(((PayWithAnyContract$ModalStep.InsufficientFundsOptions) step13).f84722a));
                    ax9.d block24 = new ax9.d(1, aVar17, com.revolut.feature.revolutpay.shared.ui.pay_with_any.a.class, "handleInsufficientFundsOptionsResult", "handleInsufficientFundsOptionsResult(Lcom/revolut/feature/revolutpay/shared/ui/insufficient_funds_options/InsufficientFundsOptionsContract$OutputData;)V", 0, 17);
                    Intrinsics.checkNotNullParameter(block24, "block");
                    insufficientFundsOptionsScreen.H = block24;
                    return insufficientFundsOptionsScreen;
                }
                if (step13 instanceof PayWithAnyContract$ModalStep.CardOptions) {
                    CardOptionsScreen cardOptionsScreen = new CardOptionsScreen();
                    final int i104 = 1;
                    Function1 block25 = new Function1() { // from class: bec.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i104) {
                                case 0:
                                    dii.g it10 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar19 = aVar17;
                                    aVar19.n2(new b96.d(it10, aVar19, ((PayWithAnyContract$ModalStep.ConfirmDeleteCard) step13).f84721a, null, 10), new whi.b(6));
                                    return Unit.f186387a;
                                default:
                                    pdc.a it11 = (pdc.a) obj8;
                                    Intrinsics.checkNotNullParameter(it11, "it");
                                    String str8 = ((PayWithAnyContract$ModalStep.CardOptions) step13).f84720a;
                                    if (!(it11 instanceof pdc.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.v2(aVar17.f84729w, new PayWithAnyContract$ModalStep.ConfirmDeleteCard(str8), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block25, "block");
                    cardOptionsScreen.H = block25;
                    return cardOptionsScreen;
                }
                if (!(step13 instanceof PayWithAnyContract$ModalStep.PayWithAnyFullList)) {
                    throw new NoWhenBranchMatchedException();
                }
                f payWithAnyListMode = f.FULL;
                t product = payWithAnyControllerDescriptor$InputData.f84430a;
                Long l2 = payWithAnyControllerDescriptor$InputData.f84431b;
                xi0.b bVar6 = payWithAnyControllerDescriptor$InputData.f84432c;
                PaymentMethod paymentMethod = payWithAnyControllerDescriptor$InputData.d;
                String str8 = payWithAnyControllerDescriptor$InputData.e;
                u6c.u uVar = payWithAnyControllerDescriptor$InputData.f;
                PayWithAnyFundingOptions fundingOptions = payWithAnyControllerDescriptor$InputData.f84433g;
                boolean z4 = payWithAnyControllerDescriptor$InputData.f84434h;
                String str9 = payWithAnyControllerDescriptor$InputData.f84435j;
                String str10 = payWithAnyControllerDescriptor$InputData.k;
                boolean z6 = payWithAnyControllerDescriptor$InputData.f84436l;
                Intrinsics.checkNotNullParameter(product, "product");
                Intrinsics.checkNotNullParameter(fundingOptions, "fundingOptions");
                Intrinsics.checkNotNullParameter(payWithAnyListMode, "payWithAnyListMode");
                ViewController viewControllerE14 = aVar17.e1(new w6c.i(new PayWithAnyControllerDescriptor$InputData(product, l2, bVar6, paymentMethod, str8, uVar, fundingOptions, z4, payWithAnyListMode, str9, str10, z6)));
                bec.h0 block26 = new bec.h0(aVar17, 0);
                Intrinsics.checkNotNullParameter(block26, "block");
                viewControllerE14.H = block26;
                return viewControllerE14;
            case 23:
                return a(obj2, obj3);
            case 24:
                return b(obj2, obj3);
            case 25:
                return c(obj2, obj3);
            case 26:
                return d(obj2, obj3);
            case 27:
                return e(obj2, obj3);
            case 28:
                return g(obj2, obj3);
            default:
                BillsSearchScreen billsSearchScreen = (BillsSearchScreen) obj4;
                InputTextDelegate.Model model3 = (InputTextDelegate.Model) obj2;
                InputText field3 = (InputText) obj3;
                BillsSearchScreen.Companion aVar19 = BillsSearchScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(model3, "model");
                Intrinsics.checkNotNullParameter(field3, "field");
                Object obj8 = model3.P;
                BillFormField billFormField = obj8 instanceof BillFormField ? (BillFormField) obj8 : null;
                if (billFormField == null || (str2 = billFormField.e) == null) {
                    return null;
                }
                return new zp0.y(field3.getInnerEditText(), null, str2, new abf.c(billsSearchScreen, model3, i21), model3.f52580a, of9.h.a(model3, str2), false, 66);
        }
    }
}
