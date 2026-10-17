package nx2;

import android.os.Parcelable;
import android.text.method.DigitsKeyListener;
import aw0.n6;
import aw0.o9;
import ay2.r;
import c12.f0;
import c12.j;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.cards.shared.ui.screen.catalogue.SharedCardDesignCatalogueController;
import com.revolut.cards.shared.ui.screen.catalogue.SharedCardDesignCatalogueScreenContract$InputData;
import com.revolut.cards.shared.ui.screen.catalogue.models.CatalogueToolbarButton;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTerms$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.qr.details.QrDetailsFlowContract$Step;
import com.revolut.feature.apm.core.ui.impl.ui.qr.details.screen.QrDetailsScreen;
import com.revolut.feature.apm.core.ui.impl.ui.qr.details.screen.QrDetailsScreenContract$InputData;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowInputData;
import com.revolut.feature.apm.multibanco.impl.common.MultibancoArticles;
import com.revolut.feature.apm.multibanco.impl.ui.MultibancoFlowContract$Step;
import com.revolut.feature.apm.multibanco.impl.ui.apm_ext.MultibancoPendingPaymentExtension$Parcel;
import com.revolut.feature.apm.multibanco.impl.ui.home.MultibancoHomeFlow;
import com.revolut.feature.apm.multibanco.impl.ui.home.MultibancoHomeFlowContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.pending.MultibancoPendingPaymentFlow;
import com.revolut.feature.apm.multibanco.impl.ui.pending.MultibancoPendingPaymentFlowContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.registration.MultibancoRegistrationFlow;
import com.revolut.feature.apm.multibanco.impl.ui.registration.MultibancoRegistrationFlowContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.registration.MultibancoRegistrationFlowContract$Step;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.flow.ViaVerdeFlow;
import com.revolut.feature.card_design.api.model.SkipConfig;
import com.revolut.feature.card_design.api.model.SkipConfirmationDialogConfig;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$State;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$Step;
import com.revolut.feature.card_design.impl.card_design.card_video_preview.CardVideoPreviewController;
import com.revolut.feature.card_design.impl.card_design.card_video_preview.CardVideoPreviewScreenContract$InputData;
import com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselController;
import com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselScreenContract$InputData;
import com.revolut.feature.card_input.common.ui.CardInputActivity;
import com.revolut.feature.card_management.api.cardagreements.CardIssuanceAgreementControllerContract$InputData;
import com.revolut.feature.card_management.impl.cardlimit.screens.overview.CardLimitOverviewScreenContract$ModalStep;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormScreenContract$ModalStep;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.dialog.confirm_different_address.ConfirmDifferentAddressController;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.flow.CoBorrowerConsentPartnerFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.GiveConsentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.date.DatePickerScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.date.DatePickerScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.ScheduleScreenContract$ModalStep;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.LoanChangeRepaymentDayFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.LoanChangeRepaymentDayFlowContract$Step;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.confirmnewday.LoanConfirmNewRepaymentDayScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.confirmnewday.LoanConfirmNewRepaymentDayScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday.LoanSelectNewRepaymentDayScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday.LoanSelectNewRepaymentDayScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.LoanSelectNewRepaymentDayV2Screen;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.LoanSelectNewRepaymentDayV2ScreenContract$InputData;
import com.revolut.feature.defi.remittances.impl.ui.receive.flow.DeFiReceiveFlowContract$Step;
import com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.onboarding.business_category.FreelancerBusinessCategoryScreen;
import com.revolut.feature.freelancer.impl.ui.onboarding.business_description.FreelancerBusinessDescriptionScreen;
import com.revolut.feature.freelancer.impl.ui.onboarding.business_description.FreelancerBusinessDescriptionScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$Step$Restriction$AccountClosed;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$Step$Restriction$AccountPending;
import com.revolut.feature.freelancer.impl.ui.profile.terms.FreelancerTermsScreen;
import com.revolut.feature.freelancer.impl.ui.profile.terms.FreelancerTermsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.website.FreelancerWebsiteScreen;
import com.revolut.feature.freelancer.impl.ui.profile.website.FreelancerWebsiteScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.prompt.restrictions.AccountRestrictionsPromptFlow;
import com.revolut.feature.freelancer.impl.ui.prompt.restrictions.AccountRestrictionsPromptFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.FreelancerSaleDetailsScreenContract$ModalStep;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsActivity;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.pix.api.model.PixQrCodeAmount;
import com.revolut.feature.pix.api.model.PixQrCodeCreditor;
import com.revolut.feature.pix.api.model.PixQrCodeDataDetails;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.pix.api.model.PixQrCodeParty;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.confirm.PixAuthorisationConfirmScreen;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.reject.PixAuthorisationRejectReasonScreen;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.PixAuthorisationRequestScreenContract$ModalStep;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.PixAuthorisationTransactionLimitScreen;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.PixAuthorisationTransactionLimitScreenContract$InputData;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.referrals.common.data.api.domain.model.common.AdditionalInfo;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeControllerContract$ModalStep;
import com.revolut.feature.referrals.shared.ui.impl.ui.reward_details.RewardDetailsScreen;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.BuyNowPayLater;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.PaymentConfiguration;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.EarningRepresentation;
import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPointsEarningRuleApplied;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.impl.ui.bottom_sheet.cashback.CashbackExplainerScreen;
import com.revolut.feature.revolutpay.impl.ui.bottom_sheet.cashback.CashbackExplainerScreenContract$InputData;
import com.revolut.feature.revolutpay.impl.ui.bottom_sheet.ramp_fees.RampFeesExplainerScreen;
import com.revolut.feature.revolutpay.impl.ui.request_cvv.RequestCvvScreen;
import com.revolut.feature.revolutpay.impl.ui.request_cvv.RequestCvvScreenContract$InputData;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$ModalStep;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.extension.SummaryAccountPickerExtension$AccountPickerConfiguration;
import com.revolut.feature.revolutpay.shared.ui.account_picker.AccountPickerContract$InputData;
import com.revolut.feature.revolutpay.shared.ui.account_picker.AccountPickerScreen;
import com.revolut.feature.revolutpay.shared.ui.bottom_sheet.expandable_disclaimer.ExpandableDisclaimerBottomSheetController;
import com.revolut.feature.revolutpay.shared.ui.order_summary.OrderSummaryScreen;
import com.revolut.feature.revolutpay.shared.ui.order_summary.OrderSummaryScreenContract$InputData;
import com.revolut.feature.revolutpay.shared.ui.risk_screen.RiskScreen;
import com.revolut.feature.revolutpay.shared.ui.risk_screen.RiskScreenContract$InputData;
import com.revolut.feature.revolutpay.shared.ui.summary_screen.mapper.RevPointsEarningItemMapper;
import com.revolut.feature.revolutpay.shared.ui.terminal_payment.TerminalPaymentScreen;
import com.revolut.feature.revolutpay.shared.ui.terminal_payment.TerminalPaymentScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.statement_of_fees.flow.StatementOfFeesFlowContract$InputData;
import com.revolut.feature.statements.impl.ui.statement_of_fees.flow.StatementOfFeesFlowContract$Step;
import com.revolut.feature.statements.impl.ui.statement_of_fees.screen.StatementOfFeesScreen;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.InvestmentsControllerContract$ModalStep;
import com.revolut.feature.wealth.commodity_additional_services.impl.navigation.CommodityPhysicalDeliveryProductArticleKey;
import com.revolut.feature.wealth.commodity_additional_services.impl.ui.flows.physical_delivery.PhysicalDeliveryFlowContract$Step;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreenContract$InputModelSettings;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreenContract$ModalStep;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.tutorial.CommodityTutorialScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.tutorial.CommodityTutorialScreenContract$InputData;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import com.revolut.retail.feature.pending_payments.api.PendingPaymentsToggles$Multibanco;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$OutputData;
import com.revolut.retail.operation_status.step.OperationStatusFragment;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import ct6.v;
import ft3.a1;
import ft3.j1;
import ft3.r0;
import grl.k9;
import grl.q6;
import grl.r2;
import h93.j0;
import h93.l0;
import ip0.s7;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import m1c.e0;
import m1c.t0;
import neg.q;
import nvg.b0;
import nya.i0;
import nyb.h0;
import nyb.n0;
import o29.y;
import o29.z;
import o82.e;
import o82.f;
import oki.h;
import org.jmrtd.lds.LDSFile;
import q97.l1;
import vc.s;
import vkm.j2;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f220098b;

    public /* synthetic */ f(Object obj2, int i) {
        this.f220097a = i;
        this.f220098b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        o08.k kVar = (o08.k) this.f220098b;
        ((Boolean) obj2).getClass();
        kVar.o.getClass();
        IntRange intRangeO = kotlin.ranges.f.o(0, 3);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            it8.nextInt();
            arrayList.add(new s7("LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new Pair(null, arrayList);
    }

    private final Object b(Object obj2, Object obj3) {
        StatementOfFeesFlowContract$InputData statementOfFeesFlowContract$InputData = (StatementOfFeesFlowContract$InputData) this.f220098b;
        yki.l FlowCoordinator = (yki.l) obj2;
        StatementOfFeesFlowContract$Step step = (StatementOfFeesFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof StatementOfFeesFlowContract$Step.StatementOfFessScreen)) {
            throw new NoWhenBranchMatchedException();
        }
        return new StatementOfFeesScreen(new p0e.e(statementOfFeesFlowContract$InputData.f88389b, statementOfFeesFlowContract$InputData.f88388a, statementOfFeesFlowContract$InputData.f88390c));
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a aVar = (com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a) this.f220098b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        FreelancerSaleDetailsScreenContract$ModalStep step = (FreelancerSaleDetailsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof FreelancerSaleDetailsScreenContract$ModalStep.AccountRestriction) {
            return new AccountRestrictionsPromptFlow(new AccountRestrictionsPromptFlowContract$InputData(((FreelancerSaleDetailsScreenContract$ModalStep.AccountRestriction) step).f74120a));
        }
        if (!(step instanceof FreelancerSaleDetailsScreenContract$ModalStep.ManualRefund)) {
            throw new NoWhenBranchMatchedException();
        }
        FreelancerOrder freelancerOrder = ((FreelancerSaleDetailsScreenContract$ModalStep.ManualRefund) step).f74121a;
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.freelancer_refund_bank_transfer_manual_refund_prompt_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_refund_bank_transfer_manual_refund_prompt_subtitle, null, null, 14), null, null, false, 28);
        aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.freelancer_common_action_send_funds, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.freelancer_common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
        k9 k9Var = k9.Freelancer;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        b0 block = new b0(aVar, freelancerOrder, 17);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar = (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) this.f220098b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        AddressFormScreenContract$ModalStep step = (AddressFormScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof AddressFormScreenContract$ModalStep.ConfirmDifferentAddressDialog)) {
            throw new NoWhenBranchMatchedException();
        }
        ConfirmDifferentAddressController confirmDifferentAddressController = new ConfirmDifferentAddressController();
        b0 block = new b0(bVar, step, 23);
        Intrinsics.checkNotNullParameter(block, "block");
        confirmDifferentAddressController.H = block;
        return confirmDifferentAddressController;
    }

    private final Object e(Object obj2, Object obj3) {
        o29.d dVar = (o29.d) this.f220098b;
        String enabledFeatures = (String) obj2;
        w19.g onboardingInfo = (w19.g) obj3;
        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
        Intrinsics.checkNotNullParameter(onboardingInfo, "onboardingInfo");
        dVar.f221552b.f("CACHE_KEY_ONBOARDING_INFO" + enabledFeatures.hashCode(), onboardingInfo);
        return Unit.f186387a;
    }

    private final Object g(Object obj2, Object obj3) {
        z zVar = (z) this.f220098b;
        y params = (y) obj2;
        z19.n wrappedCards = (z19.n) obj3;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(wrappedCards, "wrappedCards");
        zVar.f221594b.f(((o29.w) zVar.d).a(params), wrappedCards);
        return Unit.f186387a;
    }

    private final Object h(Object obj2, Object obj3) {
        com.revolut.feature.apm.core.ui.impl.ui.qr.details.a aVar = (com.revolut.feature.apm.core.ui.impl.ui.qr.details.a) this.f220098b;
        yki.l FlowCoordinator = (yki.l) obj2;
        QrDetailsFlowContract$Step step = (QrDetailsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof QrDetailsFlowContract$Step.Details)) {
            throw new NoWhenBranchMatchedException();
        }
        QrDetailsScreen qrDetailsScreen = new QrDetailsScreen(new QrDetailsScreenContract$InputData(u.c(aVar.o.f62330b)));
        nya.b0 block = new nya.b0(aVar, 27);
        Intrinsics.checkNotNullParameter(block, "block");
        qrDetailsScreen.H = block;
        return qrDetailsScreen;
    }

    private final Object i(Object obj2, Object obj3) {
        OperationStatusFragment operationStatusFragment = (OperationStatusFragment) this.f220098b;
        String url2 = (String) obj2;
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter((String) obj3, "<unused var>");
        operationStatusFragment.f104421b0.onNext(new ty0.a("", url2, new TextClause(url2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 8));
        return Boolean.TRUE;
    }

    private final Object j(Object obj2, Object obj3) {
        com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.a aVar = (com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.a) this.f220098b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        InvestmentsControllerContract$ModalStep step = (InvestmentsControllerContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, InvestmentsControllerContract$ModalStep.InvestmentsAvgPriceStep.f95415a)) {
            return aVar.e1(j3h.d.f171191a);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object k(Object obj2, Object obj3) {
        com.revolut.feature.defi.remittances.impl.ui.receive.flow.a aVar = (com.revolut.feature.defi.remittances.impl.ui.receive.flow.a) this.f220098b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        DeFiReceiveFlowContract$Step step = (DeFiReceiveFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof DeFiReceiveFlowContract$Step.SelectAsset)) {
            if (step instanceof DeFiReceiveFlowContract$Step.Deposit) {
                return aVar.e1(new hbj.a(new CryptoDepositInput.DeFi(aVar.o.f71808a, ((DeFiReceiveFlowContract$Step.Deposit) step).f71810a)));
            }
            throw new NoWhenBranchMatchedException();
        }
        ViewController viewControllerE1 = aVar.e1(new r66.b(null, null, null, new TextLocalisedClause(com.revolut.feature.defi.remittances.impl.R$string.crypto_defi_receive_balance_picker_title, null, null, 14), 6));
        o3k.a block = new o3k.a(aVar, 5);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    private final Object l(Object obj2, Object obj3) {
        com.revolut.feature.wealth.commodity_additional_services.impl.ui.flows.physical_delivery.a aVar = (com.revolut.feature.wealth.commodity_additional_services.impl.ui.flows.physical_delivery.a) this.f220098b;
        yki.l FlowCoordinator = (yki.l) obj2;
        PhysicalDeliveryFlowContract$Step step = (PhysicalDeliveryFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, PhysicalDeliveryFlowContract$Step.ProductArticle.f95445a)) {
            throw new NoWhenBranchMatchedException();
        }
        ViewController viewControllerE1 = aVar.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(CommodityPhysicalDeliveryProductArticleKey.f95443a)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
        o3k.a block = new o3k.a(aVar, 6);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    private final Object m(Object obj2, Object obj3) {
        com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.flow.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.flow.a) this.f220098b;
        yki.l FlowCoordinator = (yki.l) obj2;
        CoBorrowerConsentPartnerFlowContract$Step step = (CoBorrowerConsentPartnerFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof CoBorrowerConsentPartnerFlowContract$Step.GiveConsent)) {
            throw new NoWhenBranchMatchedException();
        }
        GiveConsentScreen giveConsentScreen = new GiveConsentScreen();
        o3k.a block = new o3k.a(aVar, 8);
        Intrinsics.checkNotNullParameter(block, "block");
        giveConsentScreen.H = block;
        return giveConsentScreen;
    }

    private final Object n(Object obj2, Object obj3) {
        com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.b bVar = (com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.b) this.f220098b;
        LoanChangeRepaymentDayFlowContract$InputData loanChangeRepaymentDayFlowContract$InputData = bVar.o;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        LoanChangeRepaymentDayFlowContract$Step step = (LoanChangeRepaymentDayFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof LoanChangeRepaymentDayFlowContract$Step.SelectNewRepaymentDay) {
            LoanSelectNewRepaymentDayScreen loanSelectNewRepaymentDayScreen = new LoanSelectNewRepaymentDayScreen(new LoanSelectNewRepaymentDayScreenContract$InputData(loanChangeRepaymentDayFlowContract$InputData.f70388a, ((LoanChangeRepaymentDayFlowContract$Step.SelectNewRepaymentDay) step).f70392a));
            q qVar = new q(bVar, 21, LazyFlowCoordinator, step);
            Intrinsics.checkNotNullParameter(qVar, "<set-?>");
            loanSelectNewRepaymentDayScreen.H = qVar;
            return loanSelectNewRepaymentDayScreen;
        }
        if (step instanceof LoanChangeRepaymentDayFlowContract$Step.SelectNewRepaymentDayV2) {
            LoanSelectNewRepaymentDayV2Screen loanSelectNewRepaymentDayV2Screen = new LoanSelectNewRepaymentDayV2Screen(new LoanSelectNewRepaymentDayV2ScreenContract$InputData(loanChangeRepaymentDayFlowContract$InputData.f70388a, ((LoanChangeRepaymentDayFlowContract$Step.SelectNewRepaymentDayV2) step).f70393a));
            dph.c block = new dph.c(bVar, LazyFlowCoordinator, 20);
            Intrinsics.checkNotNullParameter(block, "block");
            loanSelectNewRepaymentDayV2Screen.H = block;
            return loanSelectNewRepaymentDayV2Screen;
        }
        if (!(step instanceof LoanChangeRepaymentDayFlowContract$Step.ConfirmNewRepaymentDay)) {
            throw new NoWhenBranchMatchedException();
        }
        LoanChangeRepaymentDayFlowContract$Step.ConfirmNewRepaymentDay confirmNewRepaymentDay = (LoanChangeRepaymentDayFlowContract$Step.ConfirmNewRepaymentDay) step;
        LoanConfirmNewRepaymentDayScreen loanConfirmNewRepaymentDayScreen = new LoanConfirmNewRepaymentDayScreen(new LoanConfirmNewRepaymentDayScreenContract$InputData(confirmNewRepaymentDay.f70390a, loanChangeRepaymentDayFlowContract$InputData.f70388a, confirmNewRepaymentDay.f70391b));
        dph.c cVar = new dph.c(bVar, LazyFlowCoordinator, 21);
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        loanConfirmNewRepaymentDayScreen.H = cVar;
        return loanConfirmNewRepaymentDayScreen;
    }

    private final Object o(Object obj2, Object obj3) {
        final com.revolut.feature.apm.multibanco.impl.ui.a aVar = (com.revolut.feature.apm.multibanco.impl.ui.a) this.f220098b;
        yki.l FlowCoordinator = (yki.l) obj2;
        MultibancoFlowContract$Step step = (MultibancoFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof MultibancoFlowContract$Step.Intro) {
            ViewController viewControllerE1 = aVar.e1(new d12.a(new d12.c(new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_entry, null, null, 14)), aVar.u));
            final int i = 2;
            Function1 block = new Function1() { // from class: o72.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    FlowStep pendingPayment;
                    switch (i) {
                        case 0:
                            j it8 = (j) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            h.D2(aVar.v);
                            return Unit.f186387a;
                        case 1:
                            f outputData = (f) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, o82.c.f222905a);
                            com.revolut.feature.apm.multibanco.impl.ui.a aVar2 = aVar;
                            if (zF || Intrinsics.f(outputData, o82.d.f222906a)) {
                                aVar2.I2(null);
                            } else {
                                if (!(outputData instanceof e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar2, aVar2.v, MultibancoFlowContract$Step.Intro.f62562a, false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            d12.d outputData2 = (d12.d) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            p72.a aVar3 = (p72.a) outputData2;
                            MultibancoRegistrationStatus multibancoRegistrationStatus = aVar3.f233511a;
                            boolean z = multibancoRegistrationStatus instanceof MultibancoRegistrationStatus.Pending;
                            com.revolut.feature.apm.multibanco.impl.ui.a aVar4 = aVar;
                            if (z) {
                                aVar4.I2(multibancoRegistrationStatus);
                            } else if (multibancoRegistrationStatus instanceof MultibancoRegistrationStatus.Registered) {
                                MultibancoRegistrationStatus.Registered registered = (MultibancoRegistrationStatus.Registered) multibancoRegistrationStatus;
                                String str = aVar3.f233512b;
                                if (str != null) {
                                    pendingPayment = new MultibancoFlowContract$Step.PendingPayment(registered, str);
                                } else {
                                    MultibancoFlowInputData.StartType startType = aVar4.o.f62546a;
                                    if (startType instanceof MultibancoFlowInputData.StartType.Area) {
                                        pendingPayment = new MultibancoFlowContract$Step.Area(registered);
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.NewContact) {
                                        pendingPayment = MultibancoFlowContract$Step.NewContact.f62563a;
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.RecipientList) {
                                        pendingPayment = MultibancoFlowContract$Step.RecipientList.f62566a;
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.PendingPayment) {
                                        pendingPayment = new MultibancoFlowContract$Step.PendingPayment(registered, ((MultibancoFlowInputData.StartType.PendingPayment) startType).f62550a);
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.ViaVerde) {
                                        pendingPayment = MultibancoFlowContract$Step.ViaVerde.f62568a;
                                    } else {
                                        if (!(startType instanceof MultibancoFlowInputData.StartType.CheckRegistration)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        pendingPayment = null;
                                    }
                                }
                                FlowStep flowStep = pendingPayment;
                                if (flowStep != null) {
                                    h.t2(aVar4, aVar4.v, flowStep, false, TransitionAnimation.FADE.f98392a, false, 8);
                                } else {
                                    aVar4.I2(multibancoRegistrationStatus);
                                }
                            } else {
                                if (!(multibancoRegistrationStatus instanceof MultibancoRegistrationStatus.NotRegistered)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar4, aVar4.v, new MultibancoFlowContract$Step.Registration((MultibancoRegistrationStatus.NotRegistered) multibancoRegistrationStatus), false, TransitionAnimation.FADE.f98392a, false, 8);
                            }
                            return Unit.f186387a;
                        default:
                            aii.q it9 = (aii.q) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            h.D2(aVar.v);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (step instanceof MultibancoFlowContract$Step.Registration) {
            MultibancoRegistrationFlow multibancoRegistrationFlow = new MultibancoRegistrationFlow(new MultibancoRegistrationFlowContract$InputData(((MultibancoFlowContract$Step.Registration) step).f62567a, null));
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: o72.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    FlowStep pendingPayment;
                    switch (i2) {
                        case 0:
                            j it8 = (j) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            h.D2(aVar.v);
                            return Unit.f186387a;
                        case 1:
                            f outputData = (f) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, o82.c.f222905a);
                            com.revolut.feature.apm.multibanco.impl.ui.a aVar2 = aVar;
                            if (zF || Intrinsics.f(outputData, o82.d.f222906a)) {
                                aVar2.I2(null);
                            } else {
                                if (!(outputData instanceof e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar2, aVar2.v, MultibancoFlowContract$Step.Intro.f62562a, false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            d12.d outputData2 = (d12.d) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            p72.a aVar3 = (p72.a) outputData2;
                            MultibancoRegistrationStatus multibancoRegistrationStatus = aVar3.f233511a;
                            boolean z = multibancoRegistrationStatus instanceof MultibancoRegistrationStatus.Pending;
                            com.revolut.feature.apm.multibanco.impl.ui.a aVar4 = aVar;
                            if (z) {
                                aVar4.I2(multibancoRegistrationStatus);
                            } else if (multibancoRegistrationStatus instanceof MultibancoRegistrationStatus.Registered) {
                                MultibancoRegistrationStatus.Registered registered = (MultibancoRegistrationStatus.Registered) multibancoRegistrationStatus;
                                String str = aVar3.f233512b;
                                if (str != null) {
                                    pendingPayment = new MultibancoFlowContract$Step.PendingPayment(registered, str);
                                } else {
                                    MultibancoFlowInputData.StartType startType = aVar4.o.f62546a;
                                    if (startType instanceof MultibancoFlowInputData.StartType.Area) {
                                        pendingPayment = new MultibancoFlowContract$Step.Area(registered);
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.NewContact) {
                                        pendingPayment = MultibancoFlowContract$Step.NewContact.f62563a;
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.RecipientList) {
                                        pendingPayment = MultibancoFlowContract$Step.RecipientList.f62566a;
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.PendingPayment) {
                                        pendingPayment = new MultibancoFlowContract$Step.PendingPayment(registered, ((MultibancoFlowInputData.StartType.PendingPayment) startType).f62550a);
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.ViaVerde) {
                                        pendingPayment = MultibancoFlowContract$Step.ViaVerde.f62568a;
                                    } else {
                                        if (!(startType instanceof MultibancoFlowInputData.StartType.CheckRegistration)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        pendingPayment = null;
                                    }
                                }
                                FlowStep flowStep = pendingPayment;
                                if (flowStep != null) {
                                    h.t2(aVar4, aVar4.v, flowStep, false, TransitionAnimation.FADE.f98392a, false, 8);
                                } else {
                                    aVar4.I2(multibancoRegistrationStatus);
                                }
                            } else {
                                if (!(multibancoRegistrationStatus instanceof MultibancoRegistrationStatus.NotRegistered)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar4, aVar4.v, new MultibancoFlowContract$Step.Registration((MultibancoRegistrationStatus.NotRegistered) multibancoRegistrationStatus), false, TransitionAnimation.FADE.f98392a, false, 8);
                            }
                            return Unit.f186387a;
                        default:
                            aii.q it9 = (aii.q) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            h.D2(aVar.v);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            multibancoRegistrationFlow.H = block2;
            return multibancoRegistrationFlow;
        }
        if (step instanceof MultibancoFlowContract$Step.Area) {
            return new MultibancoHomeFlow(new MultibancoHomeFlowContract$InputData(((MultibancoFlowContract$Step.Area) step).f62561a));
        }
        if (step instanceof MultibancoFlowContract$Step.NewContact) {
            ViewController viewControllerE12 = aVar.e1(aVar.f62570q.c(hrf.f.OUTGOING, null));
            final int i3 = 0;
            Function1 block3 = new Function1() { // from class: o72.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    FlowStep pendingPayment;
                    switch (i3) {
                        case 0:
                            j it8 = (j) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            h.D2(aVar.v);
                            return Unit.f186387a;
                        case 1:
                            f outputData = (f) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, o82.c.f222905a);
                            com.revolut.feature.apm.multibanco.impl.ui.a aVar2 = aVar;
                            if (zF || Intrinsics.f(outputData, o82.d.f222906a)) {
                                aVar2.I2(null);
                            } else {
                                if (!(outputData instanceof e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar2, aVar2.v, MultibancoFlowContract$Step.Intro.f62562a, false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            d12.d outputData2 = (d12.d) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            p72.a aVar3 = (p72.a) outputData2;
                            MultibancoRegistrationStatus multibancoRegistrationStatus = aVar3.f233511a;
                            boolean z = multibancoRegistrationStatus instanceof MultibancoRegistrationStatus.Pending;
                            com.revolut.feature.apm.multibanco.impl.ui.a aVar4 = aVar;
                            if (z) {
                                aVar4.I2(multibancoRegistrationStatus);
                            } else if (multibancoRegistrationStatus instanceof MultibancoRegistrationStatus.Registered) {
                                MultibancoRegistrationStatus.Registered registered = (MultibancoRegistrationStatus.Registered) multibancoRegistrationStatus;
                                String str = aVar3.f233512b;
                                if (str != null) {
                                    pendingPayment = new MultibancoFlowContract$Step.PendingPayment(registered, str);
                                } else {
                                    MultibancoFlowInputData.StartType startType = aVar4.o.f62546a;
                                    if (startType instanceof MultibancoFlowInputData.StartType.Area) {
                                        pendingPayment = new MultibancoFlowContract$Step.Area(registered);
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.NewContact) {
                                        pendingPayment = MultibancoFlowContract$Step.NewContact.f62563a;
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.RecipientList) {
                                        pendingPayment = MultibancoFlowContract$Step.RecipientList.f62566a;
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.PendingPayment) {
                                        pendingPayment = new MultibancoFlowContract$Step.PendingPayment(registered, ((MultibancoFlowInputData.StartType.PendingPayment) startType).f62550a);
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.ViaVerde) {
                                        pendingPayment = MultibancoFlowContract$Step.ViaVerde.f62568a;
                                    } else {
                                        if (!(startType instanceof MultibancoFlowInputData.StartType.CheckRegistration)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        pendingPayment = null;
                                    }
                                }
                                FlowStep flowStep = pendingPayment;
                                if (flowStep != null) {
                                    h.t2(aVar4, aVar4.v, flowStep, false, TransitionAnimation.FADE.f98392a, false, 8);
                                } else {
                                    aVar4.I2(multibancoRegistrationStatus);
                                }
                            } else {
                                if (!(multibancoRegistrationStatus instanceof MultibancoRegistrationStatus.NotRegistered)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar4, aVar4.v, new MultibancoFlowContract$Step.Registration((MultibancoRegistrationStatus.NotRegistered) multibancoRegistrationStatus), false, TransitionAnimation.FADE.f98392a, false, 8);
                            }
                            return Unit.f186387a;
                        default:
                            aii.q it9 = (aii.q) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            h.D2(aVar.v);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            viewControllerE12.H = block3;
            return viewControllerE12;
        }
        if (step instanceof MultibancoFlowContract$Step.RecipientList) {
            ViewController viewControllerE13 = aVar.e1(aVar.f62571r.a(hrf.f.OUTGOING));
            final int i5 = 3;
            Function1 block4 = new Function1() { // from class: o72.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    FlowStep pendingPayment;
                    switch (i5) {
                        case 0:
                            j it8 = (j) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            h.D2(aVar.v);
                            return Unit.f186387a;
                        case 1:
                            f outputData = (f) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, o82.c.f222905a);
                            com.revolut.feature.apm.multibanco.impl.ui.a aVar2 = aVar;
                            if (zF || Intrinsics.f(outputData, o82.d.f222906a)) {
                                aVar2.I2(null);
                            } else {
                                if (!(outputData instanceof e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar2, aVar2.v, MultibancoFlowContract$Step.Intro.f62562a, false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            d12.d outputData2 = (d12.d) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            p72.a aVar3 = (p72.a) outputData2;
                            MultibancoRegistrationStatus multibancoRegistrationStatus = aVar3.f233511a;
                            boolean z = multibancoRegistrationStatus instanceof MultibancoRegistrationStatus.Pending;
                            com.revolut.feature.apm.multibanco.impl.ui.a aVar4 = aVar;
                            if (z) {
                                aVar4.I2(multibancoRegistrationStatus);
                            } else if (multibancoRegistrationStatus instanceof MultibancoRegistrationStatus.Registered) {
                                MultibancoRegistrationStatus.Registered registered = (MultibancoRegistrationStatus.Registered) multibancoRegistrationStatus;
                                String str = aVar3.f233512b;
                                if (str != null) {
                                    pendingPayment = new MultibancoFlowContract$Step.PendingPayment(registered, str);
                                } else {
                                    MultibancoFlowInputData.StartType startType = aVar4.o.f62546a;
                                    if (startType instanceof MultibancoFlowInputData.StartType.Area) {
                                        pendingPayment = new MultibancoFlowContract$Step.Area(registered);
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.NewContact) {
                                        pendingPayment = MultibancoFlowContract$Step.NewContact.f62563a;
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.RecipientList) {
                                        pendingPayment = MultibancoFlowContract$Step.RecipientList.f62566a;
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.PendingPayment) {
                                        pendingPayment = new MultibancoFlowContract$Step.PendingPayment(registered, ((MultibancoFlowInputData.StartType.PendingPayment) startType).f62550a);
                                    } else if (startType instanceof MultibancoFlowInputData.StartType.ViaVerde) {
                                        pendingPayment = MultibancoFlowContract$Step.ViaVerde.f62568a;
                                    } else {
                                        if (!(startType instanceof MultibancoFlowInputData.StartType.CheckRegistration)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        pendingPayment = null;
                                    }
                                }
                                FlowStep flowStep = pendingPayment;
                                if (flowStep != null) {
                                    h.t2(aVar4, aVar4.v, flowStep, false, TransitionAnimation.FADE.f98392a, false, 8);
                                } else {
                                    aVar4.I2(multibancoRegistrationStatus);
                                }
                            } else {
                                if (!(multibancoRegistrationStatus instanceof MultibancoRegistrationStatus.NotRegistered)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar4, aVar4.v, new MultibancoFlowContract$Step.Registration((MultibancoRegistrationStatus.NotRegistered) multibancoRegistrationStatus), false, TransitionAnimation.FADE.f98392a, false, 8);
                            }
                            return Unit.f186387a;
                        default:
                            aii.q it9 = (aii.q) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            h.D2(aVar.v);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            viewControllerE13.H = block4;
            return viewControllerE13;
        }
        if (!(step instanceof MultibancoFlowContract$Step.PendingPayment)) {
            if (step instanceof MultibancoFlowContract$Step.ViaVerde) {
                return new ViaVerdeFlow();
            }
            throw new NoWhenBranchMatchedException();
        }
        final MultibancoFlowContract$Step.PendingPayment pendingPayment = (MultibancoFlowContract$Step.PendingPayment) step;
        String str = pendingPayment.f62565b;
        if (((jte.d) aVar.f62573t).c(PendingPaymentsToggles$Multibanco.f102395c)) {
            ViewController viewControllerE14 = aVar.e1(new tak.a(new PendingPaymentContract$InputData.Apm(new MultibancoPendingPaymentExtension$Parcel(str), true, null, true), aVar.f62572s));
            final int i6 = 0;
            Function1 block5 = new Function1() { // from class: o72.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i6) {
                        case 0:
                            PendingPaymentContract$OutputData it8 = (PendingPaymentContract$OutputData) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.apm.multibanco.impl.ui.a aVar2 = aVar;
                            h.t2(aVar2, aVar2.v, new MultibancoFlowContract$Step.Area(pendingPayment.f62564a), false, null, false, 12);
                            break;
                        default:
                            aii.q it9 = (aii.q) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            com.revolut.feature.apm.multibanco.impl.ui.a aVar3 = aVar;
                            h.t2(aVar3, aVar3.v, new MultibancoFlowContract$Step.Area(pendingPayment.f62564a), false, null, false, 12);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block5, "block");
            viewControllerE14.H = block5;
            return viewControllerE14;
        }
        MultibancoPendingPaymentFlow multibancoPendingPaymentFlow = new MultibancoPendingPaymentFlow(new MultibancoPendingPaymentFlowContract$InputData(str));
        final int i21 = 1;
        Function1 block6 = new Function1() { // from class: o72.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i21) {
                    case 0:
                        PendingPaymentContract$OutputData it8 = (PendingPaymentContract$OutputData) obj4;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        com.revolut.feature.apm.multibanco.impl.ui.a aVar2 = aVar;
                        h.t2(aVar2, aVar2.v, new MultibancoFlowContract$Step.Area(pendingPayment.f62564a), false, null, false, 12);
                        break;
                    default:
                        aii.q it9 = (aii.q) obj4;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        com.revolut.feature.apm.multibanco.impl.ui.a aVar3 = aVar;
                        h.t2(aVar3, aVar3.v, new MultibancoFlowContract$Step.Area(pendingPayment.f62564a), false, null, false, 12);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Intrinsics.checkNotNullParameter(block6, "block");
        multibancoPendingPaymentFlow.H = block6;
        return multibancoPendingPaymentFlow;
    }

    private final Object p(Object obj2, Object obj3) {
        com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.a) this.f220098b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        ScheduleScreenContract$ModalStep step = (ScheduleScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof ScheduleScreenContract$ModalStep.Calendar)) {
            throw new NoWhenBranchMatchedException();
        }
        DatePickerScreen datePickerScreen = new DatePickerScreen(new DatePickerScreenContract$InputData(aVar.o.f67324a.e, ((o74.f) ((j2) aVar.f67326p.f22677a).getValue()).f222706a));
        o3k.a block = new o3k.a(aVar, 12);
        Intrinsics.checkNotNullParameter(block, "block");
        datePickerScreen.H = block;
        return datePickerScreen;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    private final Object q(Object obj2, Object obj3) {
        CommodityTargetPriceScreen commodityTargetPriceScreen = (CommodityTargetPriceScreen) this.f220098b;
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
        CenteredAmountView field = (CenteredAmountView) obj3;
        KProperty[] kPropertyArr = CommodityTargetPriceScreen.U;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(field, "field");
        Object obj4 = model.f51981p;
        CommodityTargetPriceScreenContract$InputModelSettings commodityTargetPriceScreenContract$InputModelSettings = obj4 instanceof CommodityTargetPriceScreenContract$InputModelSettings ? (CommodityTargetPriceScreenContract$InputModelSettings) obj4 : null;
        if (commodityTargetPriceScreenContract$InputModelSettings != null) {
            return new zp0.d(field.getEditText(), commodityTargetPriceScreenContract$InputModelSettings.f99915a, (u80.d) commodityTargetPriceScreen.P.getValue(), null, new o7j.e(commodityTargetPriceScreen, model), false, false, 0, false, null, 1928);
        }
        return null;
    }

    private final Object r(Object obj2, Object obj3) {
        com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b bVar = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b) this.f220098b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CommodityTargetPriceScreenContract$ModalStep step = (CommodityTargetPriceScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof CommodityTargetPriceScreenContract$ModalStep.Tutorial)) {
            throw new NoWhenBranchMatchedException();
        }
        CommodityTargetPriceScreenContract$ModalStep.Tutorial tutorial = (CommodityTargetPriceScreenContract$ModalStep.Tutorial) step;
        bVar.getClass();
        return new CommodityTutorialScreen(new CommodityTutorialScreenContract$InputData(tutorial.f99917a, tutorial.f99918b, tutorial.f99919c));
    }

    private final Object s(Object obj2, Object obj3) {
        com.revolut.feature.apm.multibanco.impl.ui.registration.a aVar = (com.revolut.feature.apm.multibanco.impl.ui.registration.a) this.f220098b;
        yki.l FlowCoordinator = (yki.l) obj2;
        MultibancoRegistrationFlowContract$Step step = (MultibancoRegistrationFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof MultibancoRegistrationFlowContract$Step.Intro) {
            ViewController viewControllerE1 = aVar.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(MultibancoArticles.ONBOARDING)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
            o54.a block = new o54.a(aVar, (MultibancoRegistrationFlowContract$Step.Intro) step, 8);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (!(step instanceof MultibancoRegistrationFlowContract$Step.Confirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        MultibancoRegistrationFlowContract$Step.Confirmation confirmation = (MultibancoRegistrationFlowContract$Step.Confirmation) step;
        ViewController viewControllerE12 = aVar.e1(new f0(new ApmRegistrationTerms$InputData(confirmation.f62624a.getTermsUrl(), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_registration_terms_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_registration_terms_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_registration_terms_action, null, null, 14))));
        o54.a block2 = new o54.a(aVar, confirmation, 7);
        Intrinsics.checkNotNullParameter(block2, "block");
        viewControllerE12.H = block2;
        return viewControllerE12;
    }

    private final Object t(Object obj2, Object obj3) {
        final com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar = (com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) this.f220098b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        PixAuthorisationRequestScreenContract$ModalStep step = (PixAuthorisationRequestScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof PixAuthorisationRequestScreenContract$ModalStep.NotifyBeforePaymentInfo) {
            return o9a.a.a();
        }
        if (step instanceof PixAuthorisationRequestScreenContract$ModalStep.AuthorisationRequestedForDownPayment) {
            PixAuthorisationConfirmScreen pixAuthorisationConfirmScreen = new PixAuthorisationConfirmScreen();
            final int i = 0;
            Function1 block = new Function1() { // from class: o9a.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    s sVar;
                    PixQrCodeDataDetails pixQrCodeDataDetails;
                    PixQrCodeAmount pixQrCodeAmount;
                    dj0.d dVar;
                    String str;
                    LocalDate localDate;
                    PixQrCodeCreditor pixQrCodeCreditor;
                    PixQrCodeParty pixQrCodeParty;
                    switch (i) {
                        case 0:
                            i9a.e it8 = (i9a.e) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (!Intrinsics.f(it8, i9a.e.f159616a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar2 = aVar;
                            j jVar = (j) ((j2) aVar2.f80599t.f22677a).getValue();
                            String str2 = jVar.f223154a;
                            PixQrCodeDecodeData pixQrCodeDecodeData = jVar.f223156c;
                            Long lValueOf = null;
                            if (pixQrCodeDecodeData == null || (pixQrCodeDataDetails = pixQrCodeDecodeData.f80457s) == null || (pixQrCodeAmount = pixQrCodeDataDetails.f80436c) == null || (dVar = pixQrCodeAmount.f80424a) == null) {
                                sVar = null;
                            } else {
                                PixQrCodeDataDetails pixQrCodeDataDetails2 = pixQrCodeDecodeData.f80458t;
                                String str3 = (pixQrCodeDataDetails2 == null || (pixQrCodeCreditor = pixQrCodeDataDetails2.d) == null || (pixQrCodeParty = pixQrCodeCreditor.f80432a) == null) ? null : pixQrCodeParty.f80468a;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                if (pixQrCodeDataDetails2 != null && (str = pixQrCodeDataDetails2.f80437g) != null && (localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"))) != null) {
                                    lValueOf = Long.valueOf(oc.c.N(localDate));
                                }
                                sVar = new s(str2, dVar, str3, lValueOf, jVar.f223157g, jVar.f, jVar.e);
                            }
                            if (sVar != null) {
                                s sVar2 = sVar;
                                aVar2.l2(new akl.i(aVar2, sVar2.f223168b, sVar2.f223169c, sVar2.d, sVar2.e, sVar.f223167a, sVar2.f223170g, sVar2.f, (Continuation) null), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        default:
                            m9a.e it9 = (m9a.e) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            g8a.a aVar3 = it9.f203675a;
                            com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar4 = aVar;
                            aVar4.l2(new i0(aVar4, aVar3, null, 15), new yi5.b(26));
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            pixAuthorisationConfirmScreen.H = block;
            return pixAuthorisationConfirmScreen;
        }
        if (step instanceof PixAuthorisationRequestScreenContract$ModalStep.RejectionReason) {
            PixAuthorisationRejectReasonScreen pixAuthorisationRejectReasonScreen = new PixAuthorisationRejectReasonScreen();
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: o9a.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    s sVar;
                    PixQrCodeDataDetails pixQrCodeDataDetails;
                    PixQrCodeAmount pixQrCodeAmount;
                    dj0.d dVar;
                    String str;
                    LocalDate localDate;
                    PixQrCodeCreditor pixQrCodeCreditor;
                    PixQrCodeParty pixQrCodeParty;
                    switch (i2) {
                        case 0:
                            i9a.e it8 = (i9a.e) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (!Intrinsics.f(it8, i9a.e.f159616a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar2 = aVar;
                            j jVar = (j) ((j2) aVar2.f80599t.f22677a).getValue();
                            String str2 = jVar.f223154a;
                            PixQrCodeDecodeData pixQrCodeDecodeData = jVar.f223156c;
                            Long lValueOf = null;
                            if (pixQrCodeDecodeData == null || (pixQrCodeDataDetails = pixQrCodeDecodeData.f80457s) == null || (pixQrCodeAmount = pixQrCodeDataDetails.f80436c) == null || (dVar = pixQrCodeAmount.f80424a) == null) {
                                sVar = null;
                            } else {
                                PixQrCodeDataDetails pixQrCodeDataDetails2 = pixQrCodeDecodeData.f80458t;
                                String str3 = (pixQrCodeDataDetails2 == null || (pixQrCodeCreditor = pixQrCodeDataDetails2.d) == null || (pixQrCodeParty = pixQrCodeCreditor.f80432a) == null) ? null : pixQrCodeParty.f80468a;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                if (pixQrCodeDataDetails2 != null && (str = pixQrCodeDataDetails2.f80437g) != null && (localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"))) != null) {
                                    lValueOf = Long.valueOf(oc.c.N(localDate));
                                }
                                sVar = new s(str2, dVar, str3, lValueOf, jVar.f223157g, jVar.f, jVar.e);
                            }
                            if (sVar != null) {
                                s sVar2 = sVar;
                                aVar2.l2(new akl.i(aVar2, sVar2.f223168b, sVar2.f223169c, sVar2.d, sVar2.e, sVar.f223167a, sVar2.f223170g, sVar2.f, (Continuation) null), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        default:
                            m9a.e it9 = (m9a.e) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            g8a.a aVar3 = it9.f203675a;
                            com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar4 = aVar;
                            aVar4.l2(new i0(aVar4, aVar3, null, 15), new yi5.b(26));
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            pixAuthorisationRejectReasonScreen.H = block2;
            return pixAuthorisationRejectReasonScreen;
        }
        if (!(step instanceof PixAuthorisationRequestScreenContract$ModalStep.TransactionLimitChange)) {
            throw new NoWhenBranchMatchedException();
        }
        PixAuthorisationRequestScreenContract$ModalStep.TransactionLimitChange transactionLimitChange = (PixAuthorisationRequestScreenContract$ModalStep.TransactionLimitChange) step;
        PixAuthorisationTransactionLimitScreen pixAuthorisationTransactionLimitScreen = new PixAuthorisationTransactionLimitScreen(new PixAuthorisationTransactionLimitScreenContract$InputData(transactionLimitChange.f80593a, transactionLimitChange.f80594b, ((o9a.j) ((j2) aVar.f80599t.f22677a).getValue()).f223154a));
        nzj.n block3 = new nzj.n(1, aVar, com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a.class, "handleLimitResult", "handleLimitResult(Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/transaction_limit/PixAuthorisationTransactionLimitScreenContract$Output;)V", 0, 14);
        Intrinsics.checkNotNullParameter(block3, "block");
        pixAuthorisationTransactionLimitScreen.H = block3;
        return pixAuthorisationTransactionLimitScreen;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        CatalogueToolbarButton catalogueToolbarButton;
        CatalogueToolbarButton goVirtual;
        String strA;
        Object rowActionsBottomSheetController;
        int i = this.f220097a;
        int i2 = 6;
        int i3 = 2;
        int i5 = 10;
        LinkedHashSet linkedHashSet = null;
        final int i6 = 1;
        final int i21 = 0;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z29 = false;
        boolean z31 = false;
        boolean z41 = false;
        boolean z49 = false;
        boolean z54 = false;
        boolean z74 = false;
        Object obj4 = this.f220098b;
        switch (i) {
            case 0:
                final com.revolut.feature.card_design.impl.card_design.d dVar = (com.revolut.feature.card_design.impl.card_design.d) obj4;
                CardDesignFlowContract$InputData cardDesignFlowContract$InputData = dVar.o;
                final yki.l FlowCoordinator = (yki.l) obj2;
                final CardDesignFlowContract$Step step = (CardDesignFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof CardDesignFlowContract$Step.Catalogue) {
                    nsh.e eVar = new nsh.e(dVar, step, 9);
                    CardDesignFlowContract$Step.Catalogue catalogue = (CardDesignFlowContract$Step.Catalogue) step;
                    n10.b bVarC = r.c(catalogue.f64655b);
                    q89.e eVar2 = dVar.v;
                    gte.a aVar = dVar.f64728w;
                    boolean zC = ((db9.d) eVar2).c();
                    jte.d dVar2 = (jte.d) aVar;
                    boolean zC2 = dVar2.c(CardsCoreApi$Toggles.CardPricingIncludingTaxes.f65560c);
                    boolean zC3 = dVar2.c(CardsCoreApi$Toggles.CardOrderDiscountsWithRevPoints.f65558c);
                    hx2.m mVar = catalogue.f64660l;
                    if (mVar != null) {
                        Intrinsics.checkNotNullParameter(mVar, "<this>");
                        int i22 = ay2.q.f11054c[mVar.ordinal()];
                        if (i22 == 1) {
                            goVirtual = new CatalogueToolbarButton.GoVirtual(new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_design_catalogue_go_virtual, null, null, 14));
                        } else {
                            if (i22 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            goVirtual = new CatalogueToolbarButton.GoPhysical(new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_design_catalogue_go_physical, null, null, 14));
                        }
                        catalogueToolbarButton = goVirtual;
                    } else {
                        catalogueToolbarButton = null;
                    }
                    Set set = catalogue.f64661m;
                    if (set != null) {
                        linkedHashSet = new LinkedHashSet();
                        Iterator it8 = set.iterator();
                        while (it8.hasNext()) {
                            linkedHashSet.add(r.c((c93.e) it8.next()));
                        }
                    }
                    boolean z83 = catalogue.f64663p;
                    nmm.h hVar = new nmm.h(dVar, 23);
                    k9 k9Var = k9.Cards;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    SharedCardDesignCatalogueController sharedCardDesignCatalogueController = new SharedCardDesignCatalogueController(new SharedCardDesignCatalogueScreenContract$InputData(eVar, bVarC, zC, zC2, zC3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), catalogueToolbarButton, linkedHashSet, z83, hVar));
                    final int i32 = 0;
                    Function1 block = new Function1() { // from class: nx2.g
                        /* JADX WARN: Removed duplicated region for block: B:113:0x02be  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r31) {
                            /*
                                Method dump skipped, instruction units count: 1334
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: nx2.g.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    sharedCardDesignCatalogueController.H = block;
                    return sharedCardDesignCatalogueController;
                }
                if (!(step instanceof CardDesignFlowContract$Step.Carousel)) {
                    if (step instanceof CardDesignFlowContract$Step.RevPointsAccountDialog) {
                        return dVar.e1(new hub.c(e0.CARD_CHECKOUT));
                    }
                    if (step instanceof CardDesignFlowContract$Step.CardVideoPreview) {
                        return new CardVideoPreviewController(new CardVideoPreviewScreenContract$InputData(((CardDesignFlowContract$Step.CardVideoPreview) step).f64640a, cardDesignFlowContract$InputData.getK()));
                    }
                    if (step instanceof CardDesignFlowContract$Step.UserLegalAgreement) {
                        CardDesignFlowContract$Step.UserLegalAgreement userLegalAgreement = (CardDesignFlowContract$Step.UserLegalAgreement) step;
                        ViewController viewControllerE1 = dVar.e1(new xy2.b(new CardIssuanceAgreementControllerContract$InputData(userLegalAgreement.f64667a, userLegalAgreement.f64669c)));
                        b0 block2 = new b0(dVar, step, 6);
                        Intrinsics.checkNotNullParameter(block2, "block");
                        viewControllerE1.H = block2;
                        return viewControllerE1;
                    }
                    if (!(step instanceof CardDesignFlowContract$Step.SkipConfirmationDialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SkipConfirmationDialogConfig skipConfirmationDialogConfig = ((CardDesignFlowContract$Step.SkipConfirmationDialog) step).f64666a.f64594c;
                    lw0.a aVar2 = new lw0.a(skipConfirmationDialogConfig.f64595a, null, null, null, false, 30);
                    aw0.h hVar2 = new aw0.h(false, new n6(skipConfirmationDialogConfig.f64597c, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(skipConfirmationDialogConfig.d, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                    dii.i iVar = new dii.i(skipConfirmationDialogConfig.f64596b);
                    q6 value = q6.Junior;
                    Parcelable.Creator<AnalyticsProduct.Junior> creator2 = AnalyticsProduct.Junior.CREATOR;
                    Intrinsics.checkNotNullParameter(value, "value");
                    ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, hVar2, new AnalyticsProduct.Junior(value), null, iVar, 8));
                    h block3 = new h(dVar, 0);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    actionsBottomSheetController.H = block3;
                    return actionsBottomSheetController;
                }
                CardDesignFlowContract$Step.Carousel carousel = (CardDesignFlowContract$Step.Carousel) step;
                pi3.h hVar3 = carousel.f64641a;
                c93.e eVar3 = carousel.f64642b;
                j0 j0VarT = cardDesignFlowContract$InputData.getF64617c();
                l0 l0VarK0 = cardDesignFlowContract$InputData.getD();
                String str = carousel.e;
                String str2 = carousel.f;
                String str3 = carousel.f64644g;
                AccountId accountId = ((CardDesignFlowContract$State) ((j2) dVar.D.f22677a).getValue()).d;
                String str4 = carousel.i;
                String str5 = carousel.f64645h;
                e93.b bVar = carousel.f64646j;
                e93.b bVar2 = carousel.f64653s;
                j0 j0Var = carousel.k;
                l0 l0Var = carousel.f64647l;
                String str6 = carousel.f64648m;
                SkipConfig skipConfigC0 = cardDesignFlowContract$InputData.getF64620j();
                boolean z89 = carousel.f64649n;
                boolean z96 = carousel.o;
                boolean z100 = carousel.f64650p;
                k9 k9Var2 = k9.Cards;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                CardDesignCarouselController cardDesignCarouselController = new CardDesignCarouselController(new CardDesignCarouselScreenContract$InputData(hVar3, eVar3, j0VarT, l0VarK0, str, str2, str3, accountId, str4, str5, false, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), bVar, j0Var, l0Var, str6, skipConfigC0, z89, z96, z100, bVar2));
                final int i33 = 1;
                Function1 block4 = new Function1() { // from class: nx2.g
                    /* JADX WARN: Removed duplicated region for block: B:113:0x02be  */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r31) {
                        /*
                            Method dump skipped, instruction units count: 1334
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: nx2.g.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                Intrinsics.checkNotNullParameter(block4, "block");
                cardDesignCarouselController.H = block4;
                return cardDesignCarouselController;
            case 1:
                String transactionId = (String) obj2;
                t0 contentData = (t0) obj3;
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                ((nxb.e) obj4).f220550c.f("TRANSACTION_BANNER_MEM_KEY_" + transactionId, contentData);
                return Unit.f186387a;
            case 2:
                InputTextDelegate.Model input = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                int i43 = CardInputActivity.B0;
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(field, "field");
                return new zp0.y(field.getInnerEditText(), null, "[0000] [0000] [0000] [0000]", new nx7.i((CardInputActivity) obj4, i5), input.f52580a, DigitsKeyListener.getInstance("1234567890 "), false, 66);
            case 3:
                PetEditDetailsActivity petEditDetailsActivity = (PetEditDetailsActivity) obj4;
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText field2 = (InputText) obj3;
                int i59 = PetEditDetailsActivity.C0;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                String str7 = model.f52580a;
                if (Intrinsics.f(str7, "DAY_OF_BIRTH_INPUT_TEXT_LIST_ID")) {
                    qy7.b bVar3 = petEditDetailsActivity.f76282s0;
                    if (bVar3 == null) {
                        Intrinsics.r("activityComponent");
                        throw null;
                    }
                    qd0.b languageProvider = bVar3.f250172c.f250188b.n();
                    s.j(languageProvider);
                    Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                    ihm.f dateOfBirthSubject = petEditDetailsActivity.u0;
                    Intrinsics.checkNotNullParameter(field2, "field");
                    Intrinsics.checkNotNullParameter(dateOfBirthSubject, "dateOfBirthSubject");
                    return new zp0.p(((s80.b) languageProvider).a(), field2.getInnerEditText(), new b3.a(dateOfBirthSubject, 5), "MM/yyyy", true, true, null, false, CaptureActivity.RESULT_EXIT_USER_FLOW);
                }
                if (!Intrinsics.f(str7, "AMOUNT_INPUT_TEXT_LIST_ID")) {
                    return null;
                }
                qy7.b bVar4 = petEditDetailsActivity.f76282s0;
                if (bVar4 == null) {
                    Intrinsics.r("activityComponent");
                    throw null;
                }
                qd0.b languageProvider2 = bVar4.f250172c.f250188b.n();
                s.j(languageProvider2);
                Intrinsics.checkNotNullParameter(languageProvider2, "languageProvider");
                ihm.f amountInputSubject = petEditDetailsActivity.f76284v0;
                Intrinsics.checkNotNullParameter(field2, "field");
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(amountInputSubject, "amountInputSubject");
                MaskedTextInputEditText innerEditText = field2.getInnerEditText();
                Object obj5 = model.P;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(innerEditText, (xi0.b) obj5, new u80.d(((s80.b) languageProvider2).b()), null, new sz7.c(amountInputSubject, model), false, true, 0, false, null, 1960);
            case 4:
                com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar3 = (com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InviteCampaignHomeControllerContract$ModalStep step2 = (InviteCampaignHomeControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof InviteCampaignHomeControllerContract$ModalStep.IneligibilityDialog) {
                    cya.g gVar = dVar3.v;
                    String str8 = ((InviteCampaignHomeControllerContract$ModalStep.IneligibilityDialog) step2).f81845a;
                    nb6.p pVar = new nb6.p(1, dVar3.z, cya.f.class, "handleDeeplink", "handleDeeplink(Ljava/lang/String;)V", 0, 22);
                    gVar.getClass();
                    return cya.g.a(str8, pVar);
                }
                if (step2 instanceof InviteCampaignHomeControllerContract$ModalStep.RewardDetails) {
                    return new RewardDetailsScreen(((InviteCampaignHomeControllerContract$ModalStep.RewardDetails) step2).f81848a);
                }
                if (step2 instanceof InviteCampaignHomeControllerContract$ModalStep.LearnMore) {
                    cya.h hVar4 = dVar3.f81861w;
                    AdditionalInfo additionalInfo = ((InviteCampaignHomeControllerContract$ModalStep.LearnMore) step2).f81847a;
                    hVar4.getClass();
                    return cya.h.a(additionalInfo);
                }
                if (!(step2 instanceof InviteCampaignHomeControllerContract$ModalStep.InviteBottomSheetActions)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar3.C.getClass();
                Intrinsics.checkNotNullParameter("RetailInviteBottomSheetActionsProvider isn't used in Retail and must be not called", "message");
                hx7.e.n(new NotImplementedError("RetailInviteBottomSheetActionsProvider isn't used in Retail and must be not called"));
                k9 value2 = k9.Referrals;
                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value2, "value");
                return new ActionsBottomSheetController(new dii.a(new lw0.a(new TextClause("NotImplementedTitle", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30), null, new AnalyticsProduct.Retail(value2), null, null, 24));
            case 5:
                RevPointsTransactionPageParams params = (RevPointsTransactionPageParams) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                return ((n0) obj4).f220817a.c(params).map(new h0(3, new ldi.j(params, 1)));
            case 6:
                com.revolut.feature.card_management.impl.cardlimit.screens.overview.a aVar3 = (com.revolut.feature.card_management.impl.cardlimit.screens.overview.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CardLimitOverviewScreenContract$ModalStep step3 = (CardLimitOverviewScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof CardLimitOverviewScreenContract$ModalStep.RemoveLimit)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar4 = new lw0.a(new TextLocalisedClause(R.string.card_limit_alert_disable_title, null, null, 14), new TextLocalisedClause(R.string.card_limit_alert_disable_message, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, null, false, 28);
                aw0.h hVar5 = new aw0.h(false, new n6(new TextLocalisedClause(R.string.card_limit_alert_disable_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                k9 k9Var3 = k9.Cards;
                Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar4, hVar5, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                nya.b0 block5 = new nya.b0(aVar3, 9);
                Intrinsics.checkNotNullParameter(block5, "block");
                actionsBottomSheetController2.H = block5;
                return actionsBottomSheetController2;
            case 7:
                com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar5 = (com.revolut.feature.freelancer.impl.ui.onboarding.flow.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                FreelancerOnboardingFlowContract$Step step4 = (FreelancerOnboardingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (Intrinsics.f(step4, FreelancerOnboardingFlowContract$Step.BusinessInfo.Category.f73981a)) {
                    FreelancerBusinessCategoryScreen freelancerBusinessCategoryScreen = new FreelancerBusinessCategoryScreen();
                    nb6.p block6 = new nb6.p(1, bVar5, com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.class, "handleBusinessCategoryResult", "handleBusinessCategoryResult(Lcom/revolut/feature/freelancer/impl/ui/onboarding/business_category/FreelancerBusinessCategoryScreenContract$OutputData;)V", 0, 24);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    freelancerBusinessCategoryScreen.H = block6;
                    return freelancerBusinessCategoryScreen;
                }
                if (step4 instanceof FreelancerOnboardingFlowContract$Step.BusinessInfo.Description) {
                    FreelancerBusinessDescriptionScreen freelancerBusinessDescriptionScreen = new FreelancerBusinessDescriptionScreen(new FreelancerBusinessDescriptionScreenContract$InputData(((FreelancerOnboardingFlowContract$Step.BusinessInfo.Description) step4).f73982a));
                    nb6.p block7 = new nb6.p(1, bVar5, com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.class, "handleBusinessDescriptionResult", "handleBusinessDescriptionResult(Lcom/revolut/feature/freelancer/impl/ui/onboarding/business_description/FreelancerBusinessDescriptionScreenContract$OutputData;)V", 0, 25);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    freelancerBusinessDescriptionScreen.H = block7;
                    return freelancerBusinessDescriptionScreen;
                }
                if (step4 instanceof FreelancerOnboardingFlowContract$Step.BusinessInfo.ProofOfActivity) {
                    String str9 = ((FreelancerOnboardingFlowContract$Step.BusinessInfo.ProofOfActivity) step4).f73983a;
                    BackendFlowInput.Companion companion = BackendFlowInput.INSTANCE;
                    k9 k9Var4 = k9.Freelancer;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                    ViewController viewControllerE12 = bVar5.e1(new n90.a(BackendFlowInput.Companion.a(companion, str9, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), 2)));
                    nz6.d block8 = new nz6.d(bVar5, i3);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    viewControllerE12.H = block8;
                    return viewControllerE12;
                }
                if (step4 instanceof FreelancerOnboardingFlowContract$Step.BusinessInfo.Website) {
                    FreelancerOnboardingFlowContract$Step.BusinessInfo.Website website = (FreelancerOnboardingFlowContract$Step.BusinessInfo.Website) step4;
                    FreelancerWebsiteScreen freelancerWebsiteScreen = new FreelancerWebsiteScreen(new FreelancerWebsiteScreenContract$InputData(website.f73984a, null, website.f73985b, 2));
                    nb6.p block9 = new nb6.p(1, bVar5, com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.class, "handleBusinessWebsiteResult", "handleBusinessWebsiteResult(Lcom/revolut/feature/freelancer/impl/ui/profile/website/FreelancerWebsiteScreenContract$OutputData;)V", 0, 26);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    freelancerWebsiteScreen.H = block9;
                    return freelancerWebsiteScreen;
                }
                if (step4 instanceof FreelancerOnboardingFlowContract$Step$Restriction$AccountClosed) {
                    return new AccountRestrictionsPromptFlow(new AccountRestrictionsPromptFlowContract$InputData(((FreelancerOnboardingFlowContract$Step$Restriction$AccountClosed) step4).f73986a));
                }
                if (step4 instanceof FreelancerOnboardingFlowContract$Step$Restriction$AccountPending) {
                    PromptMarketingScreen promptMarketingScreenB = ((v) bVar5.f73995r).b(R$drawable.uikit_icn_24_cross, ((FreelancerOnboardingFlowContract$Step$Restriction$AccountPending) step4).f73987a);
                    nb6.p block10 = new nb6.p(1, bVar5, com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.class, "handlePendingAccountPromptResult", "handlePendingAccountPromptResult(Lcom/revolut/feature/full_screen_prompt/PromptMarketingScreenContract$Output;)V", 0, 27);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    promptMarketingScreenB.H = block10;
                    return promptMarketingScreenB;
                }
                if (step4 instanceof FreelancerOnboardingFlowContract$Step.StoryProductArticle) {
                    FreelancerOnboardingFlowContract$Step.StoryProductArticle storyProductArticle = (FreelancerOnboardingFlowContract$Step.StoryProductArticle) step4;
                    FreelancerOnboardingFlowContract$InputData freelancerOnboardingFlowContract$InputData = bVar5.f73997t;
                    FreelancerOnboardingArticleConfig freelancerOnboardingArticleConfig = freelancerOnboardingFlowContract$InputData.f73978a;
                    if (Intrinsics.f(freelancerOnboardingArticleConfig, FreelancerOnboardingArticleConfig.DoNotShowArticle.f73172a)) {
                        strA = null;
                    } else {
                        if (!(freelancerOnboardingArticleConfig instanceof FreelancerOnboardingArticleConfig.ShowArticle)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        strA = ((FreelancerOnboardingArticleConfig.ShowArticle) freelancerOnboardingFlowContract$InputData.f73978a).f73173a.a();
                    }
                    ProductArticleParams productArticleParams = storyProductArticle.f73988a;
                    k9 k9Var5 = k9.Freelancer;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                    ViewController viewControllerE13 = bVar5.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), strA != null ? new AnalyticsContext(v0.a.b(strA, AnalyticsContext.INSTANCE)) : null, false, 32));
                    nz6.d block11 = new nz6.d(bVar5, i6);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    viewControllerE13.H = block11;
                    return viewControllerE13;
                }
                if (Intrinsics.f(step4, FreelancerOnboardingFlowContract$Step.TermsAndConditions.f73989a)) {
                    FreelancerTermsScreen freelancerTermsScreen = new FreelancerTermsScreen(new FreelancerTermsScreenContract$InputData(w07.j.CONFIRMATION));
                    nb6.p block12 = new nb6.p(1, bVar5, com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.class, "handleTermsResult", "handleTermsResult(Lcom/revolut/feature/freelancer/impl/ui/profile/terms/FreelancerTermsScreenContract$OutputData;)V", 0, 28);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    freelancerTermsScreen.H = block12;
                    return freelancerTermsScreen;
                }
                if (!(step4 instanceof FreelancerOnboardingFlowContract$Step.WorkflowOnboarding)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str10 = ((FreelancerOnboardingFlowContract$Step.WorkflowOnboarding) step4).f73990a;
                til.m mVar2 = bVar5.v;
                k9 k9Var6 = k9.Freelancer;
                Parcelable.Creator<AnalyticsProduct.Retail> creator8 = AnalyticsProduct.Retail.CREATOR;
                WorkflowFlow workflowFlowB = til.m.b(mVar2, new WorkflowConfiguration.Workflow(str10, (wi0.b) null, (NaviCommand) null, (String) null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG), WorkflowFlowType.Inner.f105817a, null, 56);
                nz6.d block13 = new nz6.d(bVar5, 0);
                Intrinsics.checkNotNullParameter(block13, "block");
                workflowFlowB.H = block13;
                return workflowFlowB;
            case 8:
                return a(obj2, obj3);
            case 9:
                o0b.a params2 = (o0b.a) obj2;
                c1b.g history = (c1b.g) obj3;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(history, "history");
                ((o0b.e) obj4).f221194b.f(params2.f221190h, history);
                return Unit.f186387a;
            case 10:
                return b(obj2, obj3);
            case 11:
                return c(obj2, obj3);
            case 12:
                return d(obj2, obj3);
            case 13:
                o24.a configuration = (o24.a) obj2;
                vu3.p content = (vu3.p) obj3;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(content, "content");
                ((o24.e) obj4).f221484b.f(o24.e.a(configuration), content);
                return Unit.f186387a;
            case 14:
                return e(obj2, obj3);
            case 15:
                return g(obj2, obj3);
            case 16:
                return h(obj2, obj3);
            case 17:
                return i(obj2, obj3);
            case 18:
                return j(obj2, obj3);
            case 19:
                return k(obj2, obj3);
            case 20:
                return l(obj2, obj3);
            case 21:
                return m(obj2, obj3);
            case 22:
                return n(obj2, obj3);
            case 23:
                return o(obj2, obj3);
            case 24:
                return p(obj2, obj3);
            case 25:
                return q(obj2, obj3);
            case 26:
                return r(obj2, obj3);
            case 27:
                return s(obj2, obj3);
            case 28:
                return t(obj2, obj3);
            default:
                final com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) obj4;
                ndc.a aVar5 = fVar.E;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                final RevolutPaySummaryScreenContract$ModalStep step5 = (RevolutPaySummaryScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof RevolutPaySummaryScreenContract$ModalStep.RequestCvv) {
                    RevolutPaySummaryScreenContract$ModalStep.RequestCvv requestCvv = (RevolutPaySummaryScreenContract$ModalStep.RequestCvv) step5;
                    RequestCvvScreen requestCvvScreen = new RequestCvvScreen(new RequestCvvScreenContract$InputData(requestCvv.f84547a, requestCvv.d));
                    Function1 function1 = new Function1() { // from class: o9c.k0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i66 = i21;
                            RevolutPaySummaryScreenContract$ModalStep revolutPaySummaryScreenContract$ModalStep = step5;
                            com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar2 = fVar;
                            switch (i66) {
                                case 0:
                                    l9c.e outputData = (l9c.e) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    RevolutPaySummaryScreenContract$ModalStep.RequestCvv requestCvv2 = (RevolutPaySummaryScreenContract$ModalStep.RequestCvv) revolutPaySummaryScreenContract$ModalStep;
                                    String str11 = requestCvv2.f84548b;
                                    String str12 = requestCvv2.f84549c;
                                    PaymentMethod.Card paymentMethod = outputData.f193125a;
                                    tdc.r rVar = (tdc.r) fVar2.z;
                                    rVar.getClass();
                                    Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                                    rVar.X2(rVar.f269966p, new t8e.c(rVar, paymentMethod, 12));
                                    fVar2.N2(paymentMethod, str11, str12, null);
                                    break;
                                default:
                                    yp3.k result = (yp3.k) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    RevolutPaySummaryScreenContract$ModalStep.PayLaterApplication payLaterApplication = (RevolutPaySummaryScreenContract$ModalStep.PayLaterApplication) revolutPaySummaryScreenContract$ModalStep;
                                    q9c.t tVar = fVar2.C;
                                    if (result instanceof yp3.i) {
                                        String payLaterFacilityId = ((yp3.i) result).f315775b;
                                        if (payLaterFacilityId == null) {
                                            IllegalStateException illegalStateException = new IllegalStateException("Pay Later application finished without a facility");
                                            zhm.h0 h0Var = zhm.h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                        } else {
                                            q9c.b0 b0Var = (q9c.b0) tVar;
                                            b0Var.getClass();
                                            Intrinsics.checkNotNullParameter(payLaterFacilityId, "payLaterFacilityId");
                                            b0Var.X2(b0Var.o, new pig.y(payLaterFacilityId, 25));
                                            fVar2.N2(payLaterApplication.f84540a, payLaterApplication.f84541b, payLaterApplication.f84542c, new BuyNowPayLater(payLaterFacilityId, payLaterApplication.d));
                                        }
                                    } else if ((result instanceof yp3.j) || (result instanceof yp3.g)) {
                                        q9c.b0 b0Var2 = (q9c.b0) tVar;
                                        b0Var2.X2(b0Var2.o, new l1(19));
                                    } else {
                                        int i74 = jli.h.f175850a;
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(function1, "<set-?>");
                    requestCvvScreen.H = function1;
                    return requestCvvScreen;
                }
                if (step5 instanceof RevolutPaySummaryScreenContract$ModalStep.RiskScreen) {
                    RiskScreen riskScreen = new RiskScreen(new RiskScreenContract$InputData(((RevolutPaySummaryScreenContract$ModalStep.RiskScreen) step5).f84551a));
                    nzj.n block14 = new nzj.n(1, fVar, com.revolut.feature.revolutpay.impl.ui.summary_screen.f.class, "handleRiskScreenResult", "handleRiskScreenResult(Lcom/revolut/feature/revolutpay/shared/ui/risk_screen/RiskScreenContract$OutputData;)V", 0, 16);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    riskScreen.H = block14;
                    return riskScreen;
                }
                if (step5 instanceof RevolutPaySummaryScreenContract$ModalStep.PaymentBreakdown) {
                    RevolutPaySummaryScreenContract$ModalStep.PaymentBreakdown paymentBreakdown = (RevolutPaySummaryScreenContract$ModalStep.PaymentBreakdown) step5;
                    return fVar.e1(new w6c.k(new PaymentBreakdownControllerDescriptor$InputData(paymentBreakdown.f84543a, paymentBreakdown.f84544b, w6c.j.PAYMENT, paymentBreakdown.f84545c)));
                }
                if (step5 instanceof RevolutPaySummaryScreenContract$ModalStep.ExpandableDisclaimer) {
                    return new ExpandableDisclaimerBottomSheetController(new kdc.a(((RevolutPaySummaryScreenContract$ModalStep.ExpandableDisclaimer) step5).f84533a));
                }
                if (step5 instanceof RevolutPaySummaryScreenContract$ModalStep.RampFeesExplainer) {
                    return new RampFeesExplainerScreen();
                }
                if (step5 instanceof RevolutPaySummaryScreenContract$ModalStep.GenericRevPointsInfo) {
                    k9 value3 = k9.RevolutPay;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator9 = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value3, "value");
                    AnalyticsProduct.Retail analyticsProduct = new AnalyticsProduct.Retail(value3);
                    aVar5.getClass();
                    Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                    Object obj6 = null;
                    RowDelegate.Model.c cVar = null;
                    rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(new lw0.a(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_info_screen_title, null, null, 14), null, null, null, false, 30), new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), zhm.v.k(new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_info_screen_cells_earn_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_info_screen_cells_earn_description, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rev_points, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z74 ? 1 : 0, z54 ? 1 : 0, i2), false, false, cVar, obj6, 488), new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_info_screen_cells_redeem_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_info_screen_cells_redeem_description, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_price_tag, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z49 ? 1 : 0, z41 ? 1 : 0, i2), false, false, cVar, obj6, 488)), analyticsProduct, null));
                } else if (step5 instanceof RevolutPaySummaryScreenContract$ModalStep.NonBoostedRevPointsInfo) {
                    EarningRepresentation.CardRule cardRuleRepresentation = ((RevolutPaySummaryScreenContract$ModalStep.NonBoostedRevPointsInfo) step5).f84538a;
                    k9 value4 = k9.RevolutPay;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator10 = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value4, "value");
                    AnalyticsProduct.Retail analyticsProduct2 = new AnalyticsProduct.Retail(value4);
                    aVar5.getClass();
                    Intrinsics.checkNotNullParameter(cardRuleRepresentation, "cardRuleRepresentation");
                    Intrinsics.checkNotNullParameter(analyticsProduct2, "analyticsProduct");
                    Object obj7 = null;
                    RowDelegate.Model.c cVar2 = null;
                    rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(new lw0.a(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_earn_rate_screen_title_earn_rule, u.c(cardRuleRepresentation.f84422a.f84429b), null, 12), null, null, null, false, 30), new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), zhm.v.k(new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_earn_rate_screen_cells_points_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_earn_rate_screen_cells_points_description_earn_rule, u.c(cardRuleRepresentation.f84422a.f84429b), null, 12), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rocket, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z31 ? 1 : 0, z29 ? 1 : 0, i2), false, false, cVar2, obj7, 488), new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_earn_rate_screen_cells_redeem_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_earn_rate_screen_cells_redeem_description, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rev_points, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z12 ? 1 : 0, z11 ? 1 : 0, i2), false, false, cVar2, obj7, 488)), analyticsProduct2, null));
                } else if (step5 instanceof RevolutPaySummaryScreenContract$ModalStep.BoostedRevPointsInfo) {
                    EarningRepresentation.BoostedRule boostedRuleRepresentation = ((RevolutPaySummaryScreenContract$ModalStep.BoostedRevPointsInfo) step5).f84531a;
                    k9 value5 = k9.RevolutPay;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator11 = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value5, "value");
                    AnalyticsProduct.Retail analyticsProduct3 = new AnalyticsProduct.Retail(value5);
                    aVar5.getClass();
                    Intrinsics.checkNotNullParameter(boostedRuleRepresentation, "boostedRuleRepresentation");
                    Intrinsics.checkNotNullParameter(analyticsProduct3, "analyticsProduct");
                    Object obj8 = null;
                    RowDelegate.Model.c cVar3 = null;
                    rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(new lw0.a(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_earn_rate_screen_title_earn_rule, u.c(boostedRuleRepresentation.f84419b.f84429b), null, 12), null, null, null, false, 30), new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), zhm.v.k(new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_earn_rate_screen_cells_boosted_points_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_earn_rate_screen_cells_boosted_points_description_earn_rule, zhm.v.k(boostedRuleRepresentation.f84420c, boostedRuleRepresentation.f84418a.f84429b), null, 12), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rocket, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z6 ? 1 : 0, z4 ? 1 : 0, i2), false, false, cVar3, obj8, 488), new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_earn_rate_screen_cells_redeem_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_earn_rate_screen_cells_redeem_description, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rev_points, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z3 ? 1 : 0, z ? 1 : 0, i2), false, false, cVar3, obj8, 488)), analyticsProduct3, null));
                } else {
                    if (step5 instanceof RevolutPaySummaryScreenContract$ModalStep.OrderSummary) {
                        String str11 = ((RevolutPaySummaryScreenContract$ModalStep.OrderSummary) step5).f84539a;
                        PaymentConfiguration f84526g = fVar.o.getF84526g();
                        return new OrderSummaryScreen(new OrderSummaryScreenContract$InputData(str11, f84526g != null ? f84526g.f84343b : null));
                    }
                    if (step5 instanceof RevolutPaySummaryScreenContract$ModalStep.RevPointsEarningInfo) {
                        RevPointsEarningItemMapper.RevPointsEarningParcel revPointsEarningParcel = ((RevolutPaySummaryScreenContract$ModalStep.RevPointsEarningInfo) step5).f84550a;
                        k9 value6 = k9.RevolutPay;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator12 = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value6, "value");
                        AnalyticsProduct.Retail analyticsProduct4 = new AnalyticsProduct.Retail(value6);
                        aVar5.getClass();
                        Intrinsics.checkNotNullParameter(revPointsEarningParcel, "revPointsEarningParcel");
                        Intrinsics.checkNotNullParameter(analyticsProduct4, "analyticsProduct");
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_checkout_rev_points_earning_bottom_sheet_title, null, null, 14);
                        aim.e eVarB = u.b();
                        eVarB.add(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_checkout_rev_points_earning_bottom_sheet_subtitle, null, null, 14));
                        EarningRepresentation earningRepresentation = revPointsEarningParcel.f84732b;
                        boolean z101 = earningRepresentation instanceof RevPointsEarningRuleApplied;
                        if (z101) {
                            eVarB.add(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_checkout_rev_points_earning_bottom_sheet_subtitle_learn_more, null, new Click(28, (Integer) null, (Object) earningRepresentation, "id_rev_points_learn_more", false), 10));
                        }
                        lw0.a aVar6 = new lw0.a(textLocalisedClause, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.a(eVarB)), null, null, false, 28);
                        aw0.e eVar4 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                        aim.e eVarB2 = u.b();
                        if (z101) {
                            eVarB2.add(new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_checkout_rev_points_earning_bottom_sheet_earn_rate, null, null, 14), (Clause) null, (RowDelegate.Model.MainImage) null, false, false, (RowDelegate.Model.c) new RowDelegate.Model.c.a(TagViewData.Companion.e(TagViewData.INSTANCE, new TextClause(((RevPointsEarningRuleApplied) earningRepresentation).getF84422a().f84428a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 6), null, false, 6), (Object) null, 424));
                        }
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_checkout_rev_points_earning_bottom_sheet_points_earn, null, null, 14);
                        long j2 = revPointsEarningParcel.f84731a;
                        NumberClause.Format.FixedDigitsAfterDot format = new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null);
                        Intrinsics.checkNotNullParameter(format, "format");
                        aim.e eVarB3 = u.b();
                        int i66 = R$drawable.uikit_icn_24_rev_points_default;
                        Float fValueOf = Float.valueOf(16.0f);
                        eVarB3.add(new ImageClause(i66, (Integer) null, fValueOf, fValueOf, 18));
                        m70.a.t(kotlin.jvm.internal.t0.f186434a);
                        eVarB3.add(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        eVarB3.add(udc.a.b(j2, format));
                        Clause clause = null;
                        eVarB2.add(new eii.l((Clause) textLocalisedClause2, clause, (RowDelegate.Model.MainImage) (false ? 1 : 0), false ? 1 : 0, false, (RowDelegate.Model.c) new RowDelegate.Model.c.b(new CompositeClause(u.a(eVarB3), null, null, null, 14), clause, null, false, 126), (Object) null, 424));
                        Unit unit = Unit.f186387a;
                        RowActionsBottomSheetController rowActionsBottomSheetController2 = new RowActionsBottomSheetController(new eii.c(aVar6, eVar4, u.a(eVarB2), analyticsProduct4, null));
                        nzj.n block15 = new nzj.n(1, fVar, com.revolut.feature.revolutpay.impl.ui.summary_screen.f.class, "handleRevPointsBottomSheetResult", "handleRevPointsBottomSheetResult(Lcom/revolut/kompot/common/bottom_sheet/row_actions/RowActionsBottomSheetContract$OutputData;)V", false ? 1 : 0, 17);
                        Intrinsics.checkNotNullParameter(block15, "block");
                        rowActionsBottomSheetController2.H = block15;
                        rowActionsBottomSheetController = rowActionsBottomSheetController2;
                    } else {
                        if (step5 instanceof RevolutPaySummaryScreenContract$ModalStep.MoveMoney) {
                            r8c.a aVar7 = fVar.B;
                            RevolutPaySummaryScreenContract$ModalStep.MoveMoney moveMoney = (RevolutPaySummaryScreenContract$ModalStep.MoveMoney) step5;
                            u6c.l lVar = moveMoney.f84535a;
                            String str12 = moveMoney.f84536b;
                            long j3 = moveMoney.f84537c;
                            aVar7.getClass();
                            ViewController viewControllerE14 = fVar.e1(new y5i.a(r8c.a.a(lVar, str12, j3), null, 14));
                            o9c.l0 block16 = new o9c.l0(fVar, 0);
                            Intrinsics.checkNotNullParameter(block16, "block");
                            viewControllerE14.H = block16;
                            return viewControllerE14;
                        }
                        if (step5 instanceof RevolutPaySummaryScreenContract$ModalStep.CashbackExplainer) {
                            return new CashbackExplainerScreen(new CashbackExplainerScreenContract$InputData(((RevolutPaySummaryScreenContract$ModalStep.CashbackExplainer) step5).f84532a));
                        }
                        if (step5 instanceof RevolutPaySummaryScreenContract$ModalStep.AccountPicker) {
                            SummaryAccountPickerExtension$AccountPickerConfiguration summaryAccountPickerExtension$AccountPickerConfiguration = ((RevolutPaySummaryScreenContract$ModalStep.AccountPicker) step5).f84530a;
                            AccountPickerScreen accountPickerScreen = new AccountPickerScreen(new AccountPickerContract$InputData(summaryAccountPickerExtension$AccountPickerConfiguration.f84569a, summaryAccountPickerExtension$AccountPickerConfiguration.f84570b.f84701a));
                            nzj.n block17 = new nzj.n(1, fVar, com.revolut.feature.revolutpay.impl.ui.summary_screen.f.class, "handleAccountPickerResult", "handleAccountPickerResult(Lcom/revolut/feature/revolutpay/shared/ui/account_picker/AccountPickerContract$OutputData;)V", 0, 18);
                            Intrinsics.checkNotNullParameter(block17, "block");
                            accountPickerScreen.H = block17;
                            return accountPickerScreen;
                        }
                        if (!(step5 instanceof RevolutPaySummaryScreenContract$ModalStep.RunWorkflow)) {
                            if (step5 instanceof RevolutPaySummaryScreenContract$ModalStep.TerminalPayment) {
                                TerminalPaymentScreen terminalPaymentScreen = new TerminalPaymentScreen(new TerminalPaymentScreenContract$InputData(((RevolutPaySummaryScreenContract$ModalStep.TerminalPayment) step5).f84554a));
                                nzj.n block18 = new nzj.n(1, fVar, com.revolut.feature.revolutpay.impl.ui.summary_screen.f.class, "handleTerminalPaymentResult", "handleTerminalPaymentResult(Lcom/revolut/feature/revolutpay/shared/ui/terminal_payment/TerminalPaymentScreenContract$OutputData;)V", 0, 19);
                                Intrinsics.checkNotNullParameter(block18, "block");
                                terminalPaymentScreen.H = block18;
                                return terminalPaymentScreen;
                            }
                            if (!(step5 instanceof RevolutPaySummaryScreenContract$ModalStep.PayLaterApplication)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ViewController viewControllerE15 = fVar.e1(new yp3.a(j1.BUY_NOW_PAY_LATER, new a1(r2.REVOLUT_PAY, null, null, r0.f137867a, null, 22), wp3.a.OPEN_EXISTING_APPLICATION, yp3.d.FORCE_SKIP));
                            Function1 block19 = new Function1() { // from class: o9c.k0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj62) {
                                    int i662 = i6;
                                    RevolutPaySummaryScreenContract$ModalStep revolutPaySummaryScreenContract$ModalStep = step5;
                                    com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar2 = fVar;
                                    switch (i662) {
                                        case 0:
                                            l9c.e outputData = (l9c.e) obj62;
                                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                                            RevolutPaySummaryScreenContract$ModalStep.RequestCvv requestCvv2 = (RevolutPaySummaryScreenContract$ModalStep.RequestCvv) revolutPaySummaryScreenContract$ModalStep;
                                            String str112 = requestCvv2.f84548b;
                                            String str122 = requestCvv2.f84549c;
                                            PaymentMethod.Card paymentMethod = outputData.f193125a;
                                            tdc.r rVar = (tdc.r) fVar2.z;
                                            rVar.getClass();
                                            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                                            rVar.X2(rVar.f269966p, new t8e.c(rVar, paymentMethod, 12));
                                            fVar2.N2(paymentMethod, str112, str122, null);
                                            break;
                                        default:
                                            yp3.k result = (yp3.k) obj62;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            RevolutPaySummaryScreenContract$ModalStep.PayLaterApplication payLaterApplication = (RevolutPaySummaryScreenContract$ModalStep.PayLaterApplication) revolutPaySummaryScreenContract$ModalStep;
                                            q9c.t tVar = fVar2.C;
                                            if (result instanceof yp3.i) {
                                                String payLaterFacilityId = ((yp3.i) result).f315775b;
                                                if (payLaterFacilityId == null) {
                                                    IllegalStateException illegalStateException = new IllegalStateException("Pay Later application finished without a facility");
                                                    zhm.h0 h0Var = zhm.h0.f322473a;
                                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                                } else {
                                                    q9c.b0 b0Var = (q9c.b0) tVar;
                                                    b0Var.getClass();
                                                    Intrinsics.checkNotNullParameter(payLaterFacilityId, "payLaterFacilityId");
                                                    b0Var.X2(b0Var.o, new pig.y(payLaterFacilityId, 25));
                                                    fVar2.N2(payLaterApplication.f84540a, payLaterApplication.f84541b, payLaterApplication.f84542c, new BuyNowPayLater(payLaterFacilityId, payLaterApplication.d));
                                                }
                                            } else if ((result instanceof yp3.j) || (result instanceof yp3.g)) {
                                                q9c.b0 b0Var2 = (q9c.b0) tVar;
                                                b0Var2.X2(b0Var2.o, new l1(19));
                                            } else {
                                                int i74 = jli.h.f175850a;
                                            }
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block19, "block");
                            viewControllerE15.H = block19;
                            return viewControllerE15;
                        }
                        RevolutPaySummaryScreenContract$ModalStep.RunWorkflow runWorkflow = (RevolutPaySummaryScreenContract$ModalStep.RunWorkflow) step5;
                        String paymentToken = runWorkflow.f84552a;
                        String workflowId = runWorkflow.f84553b;
                        hec.a aVar8 = fVar.I;
                        o9c.j0 onAbandoned = new o9c.j0(fVar, i6);
                        nzj.n onPaymentResult = new nzj.n(1, fVar, com.revolut.feature.revolutpay.impl.ui.summary_screen.f.class, "handlePaymentState", "handlePaymentState(Lcom/revolut/feature/revolutpay/api/shared/domain/models/PaymentInitiationResult;)V", 0, 20);
                        nt.e onError = new nt.e(2, fVar, com.revolut.feature.revolutpay.impl.ui.summary_screen.f.class, "handlePaymentError", "handlePaymentError(Ljava/lang/Throwable;)Z", 4, 12);
                        aVar8.getClass();
                        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
                        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                        Intrinsics.checkNotNullParameter(onAbandoned, "onAbandoned");
                        Intrinsics.checkNotNullParameter(onPaymentResult, "onPaymentResult");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        iec.a aVar9 = aVar8.f151679l;
                        aVar9.getClass();
                        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                        WorkflowFlow workflowFlowB2 = til.m.b(aVar9.f160702a, new WorkflowConfiguration.Workflow(workflowId, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 122), new WorkflowFlowType.Regular(0), til.i.DEFAULT, 48);
                        a5b.a block20 = new a5b.a((Object) ref$BooleanRef, (Object) aVar8, (Serializable) paymentToken, (Object) onError, (Object) onPaymentResult, 22);
                        Intrinsics.checkNotNullParameter(block20, "block");
                        workflowFlowB2.H = block20;
                        workflowFlowB2.k2(new h1k.a(ref$BooleanRef, onAbandoned, 20));
                        rowActionsBottomSheetController = workflowFlowB2;
                    }
                }
                return rowActionsBottomSheetController;
        }
    }
}
