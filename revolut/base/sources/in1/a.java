package in1;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import ch.qos.logback.core.net.SyslogConstants;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.camerakit.revolut.ui.previewless_selfie.PreviewlessSelfieFlowContract$Step;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.DraggableDelegate;
import com.revolut.core.ui_kit.delegates.HomeScreenPreviewDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RateNPSDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.apm.bills.boleto.impl.screen.amount.BoletoAmountScreen;
import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardInstalmentDetailsRedesign;
import com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$State;
import com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.details.flow.CreditCardPostPurchaseDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.details.flow.CreditCardPostPurchaseDetailsFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.CreditCardEditPostPurchaseInstalmentTermScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.CreditCardEditPostPurchaseInstalmentTermScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.down_payment.CreditCardDownPaymentScreen;
import com.revolut.feature.credit.card.impl.ui.statement_financing.down_payment.CreditCardDownPaymentScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.setup.CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel;
import com.revolut.feature.credit.card.impl.ui.statement_financing.setup.CreditCardStatementFinancingSetupScreenContract$ModalStep;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.credit.direct.debit.account_confirm_v2.DirectDebitConfirmScreen;
import com.revolut.feature.credit.direct.debit.account_confirm_v2.DirectDebitConfirmScreenContract$AmountType;
import com.revolut.feature.credit.direct.debit.account_confirm_v2.DirectDebitConfirmScreenContract$InputData;
import com.revolut.feature.credit.direct.debit.account_confirm_v2.DirectDebitConfirmScreenContract$RepaymentDay;
import com.revolut.feature.credit.direct.debit.set_account.DirectDebitSetAccountScreen;
import com.revolut.feature.credit.direct.debit.set_account.DirectDebitSetAccountScreenContract$InputData;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceItemPayload;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTax;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTaxRate;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreen;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$MenuItem;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$SingleChoiceItem;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.override.InvoiceTemplateOverrideScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.override.InvoiceTemplateOverrideScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.FreelancerProfileFlow;
import com.revolut.feature.freelancer.impl.ui.profile.FreelancerProfileFlowContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.kyc.impl.idnow.video_ident.screen.IdnowVideoIdentScreenContract$ModalStep;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.referrals.code.impl.referral_code.flow.ReferralCodeFlowContract$Step;
import com.revolut.feature.referrals.code.impl.referral_code.screen.ReferralCodeContract$InputData;
import com.revolut.feature.referrals.code.impl.referral_code.screen.ReferralCodeController;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.PortfolioStrategyInformationScreenContract$ModalStep;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics.RiskMetricsScreen;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics.RiskMetricsScreenContract$InputData;
import com.revolut.feature.sca_prompt.impl.flow.ScaPromptFlowContract$Step;
import com.revolut.feature.sca_prompt.impl.learn_more.ScaLearnMoreScreen;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.three_ds_verification.impl.ui.add_money.AddMoneyMethodSelectionController;
import com.revolut.feature.three_ds_verification.impl.ui.add_money.AddMoneyMethodSelectionScreenContract$InputData;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationScreenContract$ModalStep;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.CardTopUpType;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.GooglePayFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.topup_limits.TopUpLimitUiModel;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreenContract$ModalStep;
import com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchAttraction;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchLocationType;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.impl.ui.flow.checkout.TravelExperiencesCheckoutFlow;
import com.revolut.feature.travel.experiences.impl.ui.flow.checkout.TravelExperiencesCheckoutFlowContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.flow.checkout.TravelExperiencesCheckoutFlowContract$Step;
import com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$Step;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlow;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlowContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlowContract$PagerItem;
import com.revolut.feature.travel.experiences.impl.ui.screen.booking_details.TravelExperiencesBookingDetailsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.booking_details.TravelExperiencesBookingDetailsScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.bookings.TravelExperiencesBookingsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.bookings.TravelExperiencesBookingsScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.past_and_cancelled.TravelExperiencesPastAndCancelledScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.past_and_cancelled.TravelExperiencesPastAndCancelledScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreenContract$InputData;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.document_type_selector.DocumentTypeSelectorController;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.document_type_selector.DocumentTypeSelectorControllerContract$InputData;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.PepFormScreenContract$ModalStep;
import com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.SpareChangeScreenContract$ModalStep;
import com.revolut.feature.wealth.analytics.insights.model.PortfolioInsightsUsageDimension;
import com.revolut.feature.wealth.analytics.insights.model.PortfolioInsightsUsageRequirements;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.WidgetisedAnalyticsDashboardContract$ModalStep;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.account_picker.AccountPickerContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.account_picker.AccountPickerScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.timeframe_picker.TimeframePickerContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.timeframe_picker.TimeframePickerScreen;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.feature_crypto_picker.impl.ui.picker.CryptoPickerContract$ModalStep;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.limits.impl.ui.limits.flow.SettingsLimitsFlowContract$Step;
import com.revolut.retail.feature.limits.impl.ui.limits.screen.SettingsLimitController;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BeneficiaryDetailsDescriptor;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BeneficiaryDetailsInputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.StockDetailsFeedControllerContract$ModalStep;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import com.revolut.sso.api.login.RevolutSsoApi$SignUpInputData;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import com.revolut.sso.impl.ui.auth_rejected.AuthenticationRejectedFlow;
import com.revolut.sso.impl.ui.auth_rejected.AuthenticationRejectedFlowContract$InputData;
import com.revolut.sso.impl.ui.consolidation.ContinueWithIdentityFlow;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreen;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$InputData;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$Mode;
import com.revolut.sso.impl.ui.signup.SignUpFlowContract$Step;
import com.revolut.sso.impl.ui.signup.SignUpFlowContract$Step$Authentication$SignInMode;
import com.revolut.sso.impl.ui.signup.SignUpFlowContract$Step$Authentication$SignUpMode$ClaimRequired;
import com.revolut.sso.impl.ui.signup.SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired;
import com.revolut.sso.impl.ui.signup.SignUpFlowContract$Step$Authentication$SignUpMode$ExistingAccount;
import com.revolut.sso.impl.ui.signup.SignUpFlowContract$Step$Authentication$SignUpMode$Social;
import grl.k9;
import h93.f0;
import imk.p0;
import ip0.jc0;
import ip0.wk;
import ip0.x80;
import ip0.xn;
import ip0.y80;
import is6.t;
import ix6.g0;
import iz1.p;
import j2g.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k1g.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ly4.j;
import ly4.k;
import ly4.l;
import oki.h;
import p1g.g;
import s7a.a0;
import s7a.c0;
import s7a.x;
import vkm.j2;
import zhm.d0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f162579b;

    public /* synthetic */ a(com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.c cVar, is2.f fVar) {
        this.f162578a = 10;
        this.f162579b = fVar;
    }

    private final Object a(Object obj2, Object obj3) {
        List listF0;
        FreelancerInvoiceTax freelancerInvoiceTax;
        Object next;
        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) this.f162579b;
        kx6.g gVar2 = gVar.f73851s;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        InvoiceCreateScreenContract$ModalStep step = (InvoiceCreateScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof InvoiceCreateScreenContract$ModalStep.ItemTaxRate)) {
            if (!(step instanceof InvoiceCreateScreenContract$ModalStep.ItemUnit)) {
                if (step instanceof InvoiceCreateScreenContract$ModalStep.Preview) {
                    return gVar.e1(new t9d.b(((InvoiceCreateScreenContract$ModalStep.Preview) step).f73833a));
                }
                if (!(step instanceof InvoiceCreateScreenContract$ModalStep.TemplateOverride)) {
                    if (Intrinsics.f(step, InvoiceCreateScreenContract$ModalStep.VatPrompt.f73836a)) {
                        return new FreelancerProfileFlow(new FreelancerProfileFlowContract$InputData(new FreelancerBizFeatureConfig.FreelancerProfileDestination.LaunchMode.Vat(true)));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                InvoiceCreateScreenContract$ModalStep.TemplateOverride templateOverride = (InvoiceCreateScreenContract$ModalStep.TemplateOverride) step;
                InvoiceTemplateOverrideScreen invoiceTemplateOverrideScreen = new InvoiceTemplateOverrideScreen(new InvoiceTemplateOverrideScreenContract$InputData(templateOverride.f73834a, templateOverride.f73835b));
                g0 block = new g0(gVar, 0);
                Intrinsics.checkNotNullParameter(block, "block");
                invoiceTemplateOverrideScreen.H = block;
                return invoiceTemplateOverrideScreen;
            }
            InvoiceCreateScreenContract$ModalStep.ItemUnit itemUnit = (InvoiceCreateScreenContract$ModalStep.ItemUnit) step;
            FreelancerInvoiceItemPayload item = itemUnit.f73832a;
            gVar2.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_invoice_setup_item_unit_title, null, null, 14);
            EnumEntries<sr6.h> enumEntriesA = sr6.h.a();
            ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
            for (sr6.h hVar : enumEntriesA) {
                arrayList.add(new FreelancerSingleChoiceScreenContract$SingleChoiceItem(kx6.b.a(hVar), hVar.name()));
            }
            FreelancerSingleChoiceScreen freelancerSingleChoiceScreen = new FreelancerSingleChoiceScreen(new FreelancerSingleChoiceScreenContract$InputData(textLocalisedClause, null, arrayList, item.f73395c.name()));
            t block2 = new t(gVar, itemUnit, 18);
            Intrinsics.checkNotNullParameter(block2, "block");
            freelancerSingleChoiceScreen.H = block2;
            return freelancerSingleChoiceScreen;
        }
        InvoiceCreateScreenContract$ModalStep.ItemTaxRate itemTaxRate = (InvoiceCreateScreenContract$ModalStep.ItemTaxRate) step;
        FreelancerInvoiceItemPayload item2 = itemTaxRate.f73830a;
        List taxRates = itemTaxRate.f73831b;
        tx6.f fVar = gVar2.f190444a;
        Intrinsics.checkNotNullParameter(item2, "item");
        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_sale_invoice_add_tax_picker_title, null, null, 14);
        String str = "LIST_ID_TAX_RATE_NO_TAX";
        if (taxRates.isEmpty()) {
            listF0 = u.c(new FreelancerSingleChoiceScreenContract$SingleChoiceItem(fVar.a(), "LIST_ID_TAX_RATE_NO_TAX"));
        } else {
            List<FreelancerInvoiceTaxRate> list = taxRates;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (FreelancerInvoiceTaxRate freelancerInvoiceTaxRate : list) {
                arrayList2.add(new FreelancerSingleChoiceScreenContract$SingleChoiceItem(fVar.c(freelancerInvoiceTaxRate), freelancerInvoiceTaxRate.f73418a));
            }
            listF0 = d0.F0(new FreelancerSingleChoiceScreenContract$SingleChoiceItem(fVar.a(), "LIST_ID_TAX_RATE_NO_TAX"), arrayList2);
        }
        if (!taxRates.isEmpty() && (freelancerInvoiceTax = (FreelancerInvoiceTax) d0.d0(item2.i)) != null) {
            Iterator it8 = taxRates.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((FreelancerInvoiceTaxRate) next).f73418a, freelancerInvoiceTax.f73416a.f73418a)) {
                    break;
                }
            }
            FreelancerInvoiceTaxRate freelancerInvoiceTaxRate2 = (FreelancerInvoiceTaxRate) next;
            String str2 = freelancerInvoiceTaxRate2 != null ? freelancerInvoiceTaxRate2.f73418a : null;
            if (str2 != null) {
                str = str2;
            }
        }
        FreelancerSingleChoiceScreen freelancerSingleChoiceScreen2 = new FreelancerSingleChoiceScreen(new FreelancerSingleChoiceScreenContract$InputData(textLocalisedClause2, FreelancerSingleChoiceScreenContract$MenuItem.AddNew.f73776a, listF0, str));
        t block3 = new t(itemTaxRate, gVar, 19);
        Intrinsics.checkNotNullParameter(block3, "block");
        freelancerSingleChoiceScreen2.H = block3;
        return freelancerSingleChoiceScreen2;
    }

    private final Object b(Object obj2, Object obj3) {
        final com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar = (com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a) this.f162579b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        WidgetisedAnalyticsDashboardContract$ModalStep step = (WidgetisedAnalyticsDashboardContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof WidgetisedAnalyticsDashboardContract$ModalStep.SelectTimeframe) {
            TimeframePickerScreen timeframePickerScreen = new TimeframePickerScreen(new TimeframePickerContract$InputData(((WidgetisedAnalyticsDashboardContract$ModalStep.SelectTimeframe) step).f95061a));
            final int i = 1;
            Function1 block = new Function1() { // from class: iyg.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            jyg.e outputData = (jyg.e) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            WidgetisedAnalyticsType widgetisedAnalyticsType = outputData.f179432a;
                            com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar2 = aVar;
                            aVar2.H2(aVar2.P, new is6.t(widgetisedAnalyticsType, aVar2, 20));
                            break;
                        default:
                            nyg.b outputData2 = (nyg.b) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            tyg.m mVar = aVar.f95067s;
                            vyg.c analyticsTimeframe = outputData2.f220870a;
                            mVar.getClass();
                            Intrinsics.checkNotNullParameter(analyticsTimeframe, "analyticsTimeframe");
                            mVar.f275583a.G(analyticsTimeframe, "WIDGETISED_TIMESTAMP_KEY", wim.z.d(o0.b(vyg.c.class)));
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            timeframePickerScreen.H = block;
            return timeframePickerScreen;
        }
        if (step instanceof WidgetisedAnalyticsDashboardContract$ModalStep.SelectAccount) {
            WidgetisedAnalyticsDashboardContract$ModalStep.SelectAccount selectAccount = (WidgetisedAnalyticsDashboardContract$ModalStep.SelectAccount) step;
            WidgetisedAnalyticsType widgetisedAnalyticsType = selectAccount.f95059a;
            AccountPickerScreen accountPickerScreen = new AccountPickerScreen(new AccountPickerContract$InputData(widgetisedAnalyticsType, widgetisedAnalyticsType, selectAccount.f95060b));
            final int i2 = 0;
            Function1 block2 = new Function1() { // from class: iyg.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            jyg.e outputData = (jyg.e) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            WidgetisedAnalyticsType widgetisedAnalyticsType2 = outputData.f179432a;
                            com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar2 = aVar;
                            aVar2.H2(aVar2.P, new is6.t(widgetisedAnalyticsType2, aVar2, 20));
                            break;
                        default:
                            nyg.b outputData2 = (nyg.b) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            tyg.m mVar = aVar.f95067s;
                            vyg.c analyticsTimeframe = outputData2.f220870a;
                            mVar.getClass();
                            Intrinsics.checkNotNullParameter(analyticsTimeframe, "analyticsTimeframe");
                            mVar.f275583a.G(analyticsTimeframe, "WIDGETISED_TIMESTAMP_KEY", wim.z.d(o0.b(vyg.c.class)));
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            accountPickerScreen.H = block2;
            return accountPickerScreen;
        }
        if (!(step instanceof WidgetisedAnalyticsDashboardContract$ModalStep.PortfolioInsightsUsageInfo)) {
            throw new NoWhenBranchMatchedException();
        }
        xwg.a aVar2 = aVar.C;
        PortfolioInsightsUsageRequirements usageRequirements = ((WidgetisedAnalyticsDashboardContract$ModalStep.PortfolioInsightsUsageInfo) step).f95058a;
        AnalyticsProduct analyticsProduct = aVar.B;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(usageRequirements, "usageRequirements");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_portfolio_insights_empty_title, null, null, 14), new TextClause(usageRequirements.f95016a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28);
        ArrayList arrayList = usageRequirements.f95017b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i3 = 0;
        for (Object obj4 : arrayList) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            PortfolioInsightsUsageDimension portfolioInsightsUsageDimension = (PortfolioInsightsUsageDimension) obj4;
            arrayList2.add(new eii.b(new CellDetailsDelegate.Model(a0.d.n("REQUIREMENT_CELL_DETAILS_LIST_ID_", i3), new t0((Clause) new TextClause(portfolioInsightsUsageDimension.f95013a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30), new TextClause(portfolioInsightsUsageDimension.f95014b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, portfolioInsightsUsageDimension.f95015c ? new ResourceImage(R$drawable.uikit_icn_16_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, false, false, null, null, 27640)));
            i3 = i5;
        }
        return new RowActionsBottomSheetController(new eii.c(aVar3, new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), arrayList2, analyticsProduct, null));
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.camerakit.revolut.ui.previewless_selfie.a aVar = (com.revolut.camerakit.revolut.ui.previewless_selfie.a) this.f162579b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        PreviewlessSelfieFlowContract$Step step = (PreviewlessSelfieFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof PreviewlessSelfieFlowContract$Step.Permissions)) {
            throw new NoWhenBranchMatchedException();
        }
        PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(((PreviewlessSelfieFlowContract$Step.Permissions) step).f50816a));
        iyi.i block = new iyi.i(aVar, 1);
        Intrinsics.checkNotNullParameter(block, "block");
        permissionsController.H = block;
        return permissionsController;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.retail.feature.limits.impl.ui.limits.flow.a aVar = (com.revolut.retail.feature.limits.impl.ui.limits.flow.a) this.f162579b;
        yki.l FlowCoordinator = (yki.l) obj2;
        SettingsLimitsFlowContract$Step step = (SettingsLimitsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, SettingsLimitsFlowContract$Step.Limits.f101783a)) {
            return new SettingsLimitController(aVar.o);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object e(Object obj2, Object obj3) {
        com.revolut.feature_crypto_picker.impl.ui.picker.a aVar = (com.revolut.feature_crypto_picker.impl.ui.picker.a) this.f162579b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CryptoPickerContract$ModalStep step = (CryptoPickerContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CryptoPickerContract$ModalStep.FcaLearnMoreStep) {
            return aVar.e1(new zh5.a(((CryptoPickerContract$ModalStep.FcaLearnMoreStep) step).f96809a));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object g(Object obj2, Object obj3) {
        j1e.b bVar = (j1e.b) this.f162579b;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        bVar.getClass();
        return j1e.b.b();
    }

    private final Object h(Object obj2, Object obj3) {
        j1e.c cVar = (j1e.c) this.f162579b;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        cVar.getClass();
        return j1e.c.a();
    }

    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.revolut.core.ui_kit.delegates.nd, com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable$Shimmering$Companion, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        Set setB;
        RevolutSsoApi$DefaultIdentifier.Preferred preferred;
        RevolutSsoApi$DefaultIdentifier email;
        char c2;
        ?? r102;
        Clause textLocalisedClause;
        int i;
        PromptMarketingContentDelegate.Model.Button buttonA;
        PromptMarketingContentDelegate.Model.Button buttonB;
        Object obj3;
        TextLocalisedClause textLocalisedClause2;
        Object travelExperiencesBookingDetailsScreen;
        int i2 = this.f162578a;
        final int i3 = 4;
        final int i5 = 3;
        final int i6 = 0;
        Object obj4 = this.f162579b;
        switch (i2) {
            case 0:
                CenteredAmountView field = (CenteredAmountView) data;
                KProperty[] kPropertyArr = BoletoAmountScreen.W;
                Intrinsics.checkNotNullParameter((CenteredAmountDelegate.Model) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                xi0.b.Companion.getClass();
                return new zp0.d(editText, xi0.b.D, (u80.d) ((BoletoAmountScreen) obj4).R.getValue(), null, null, false, false, 0, false, null, 1944);
            case 1:
                com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.a aVar = (com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PortfolioStrategyInformationScreenContract$ModalStep step = (PortfolioStrategyInformationScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof PortfolioStrategyInformationScreenContract$ModalStep.RiskMetricsStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                Template template = ((PortfolioStrategyInformationScreenContract$ModalStep.RiskMetricsStep) step).f85172a;
                aVar.getClass();
                return new RiskMetricsScreen(new RiskMetricsScreenContract$InputData(template));
            case 2:
                final com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.b bVar = (com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.b) obj4;
                y yVar = bVar.f94657p;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PepFormScreenContract$ModalStep step2 = (PepFormScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (Intrinsics.f(step2, PepFormScreenContract$ModalStep.Help.f94654a)) {
                    return new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.pep_close_connection_id_passport_number_help_title, null, null, 14), new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.pep_close_connection_id_passport_number_help_subtitle, null, null, 14), null, null, false, 28), new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.pep_close_connection_id_passport_number_help_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), AnalyticsProduct.Shared.Onboarding.f, null, null, 24));
                }
                if (!Intrinsics.f(step2, PepFormScreenContract$ModalStep.Relationship.f94655a)) {
                    if (!Intrinsics.f(step2, PepFormScreenContract$ModalStep.DocumentType.f94653a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    DocumentTypeSelectorController documentTypeSelectorController = new DocumentTypeSelectorController(new DocumentTypeSelectorControllerContract$InputData(new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.pep_close_connection_id_type_header, null, null, 14), ((iog.f) ((j2) yVar.f22677a).getValue()).f163318a.f));
                    final int i21 = 1;
                    Function1 block = new Function1() { // from class: iog.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            gog.b bVar2;
                            switch (i21) {
                                case 0:
                                    a0 result = (a0) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    c0 c0Var = result.f260599a;
                                    eog.b bVar3 = c0Var instanceof eog.b ? (eog.b) c0Var : null;
                                    if (bVar3 != null && (bVar2 = bVar3.f127907a) != null) {
                                        com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.b bVar4 = bVar;
                                        bVar4.H2(bVar4.f94657p, new ii4.b(bVar2, 21));
                                    }
                                    return Unit.f186387a;
                                default:
                                    hog.c result2 = (hog.c) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.b bVar5 = bVar;
                                    bVar5.H2(bVar5.f94657p, new ii4.b(result2, 20));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    documentTypeSelectorController.H = block;
                    return documentTypeSelectorController;
                }
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.pep_close_connection_relationship_selector_search_placeholder, null, null, 14);
                gog.b bVar2 = ((iog.f) ((j2) yVar.f22677a).getValue()).f163318a.f94643b;
                if (bVar2 == null || (setB = y0.b(bVar2.name())) == null) {
                    setB = h0.f322473a;
                }
                PickerController pickerController = new PickerController(new x(null, null, null, null, false, null, textLocalisedClause3, null, null, false, null, null, setB, null, false, null, null, null, null, null, 2147220990), bVar.o);
                final int i22 = 0;
                Function1 block2 = new Function1() { // from class: iog.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        gog.b bVar22;
                        switch (i22) {
                            case 0:
                                a0 result = (a0) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                c0 c0Var = result.f260599a;
                                eog.b bVar3 = c0Var instanceof eog.b ? (eog.b) c0Var : null;
                                if (bVar3 != null && (bVar22 = bVar3.f127907a) != null) {
                                    com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.b bVar4 = bVar;
                                    bVar4.H2(bVar4.f94657p, new ii4.b(bVar22, 21));
                                }
                                return Unit.f186387a;
                            default:
                                hog.c result2 = (hog.c) obj5;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.b bVar5 = bVar;
                                bVar5.H2(bVar5.f94657p, new ii4.b(result2, 20));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block2, "block");
                pickerController.H = block2;
                return pickerController;
            case 3:
                RowDelegate rowDelegate = (RowDelegate) obj4;
                int iIntValue = ((Integer) obj2).intValue();
                DraggableDelegate.Companion companion = DraggableDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf((data instanceof DraggableDelegate.Model) && rowDelegate.f(iIntValue, ((DraggableDelegate.Model) data).f52196a));
            case 4:
                BaseRecyclerViewDelegate baseRecyclerViewDelegate = (BaseRecyclerViewDelegate) obj4;
                int iIntValue2 = ((Integer) obj2).intValue();
                HomeScreenPreviewDelegate.Companion aVar2 = HomeScreenPreviewDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf((data instanceof xn) && baseRecyclerViewDelegate.f(iIntValue2, ((xn) data).f167200c));
            case 5:
                int iIntValue3 = ((Integer) obj2).intValue();
                y80 item = (y80) data;
                Intrinsics.checkNotNullParameter(item, "item");
                ((RateNPSDelegate) obj4).f53144c.onNext(new x80(item.f167278a, iIntValue3));
                return Unit.f186387a;
            case 6:
                koi.j listItem = (koi.j) obj2;
                int iIntValue4 = ((Integer) data).intValue();
                Intrinsics.checkNotNullParameter(listItem, "listItem");
                ((ScrollerDelegate) obj4).f.onNext(new jc0(listItem, iIntValue4 == 0));
                return Unit.f186387a;
            case 7:
                com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar3 = (com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SpareChangeScreenContract$ModalStep step3 = (SpareChangeScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof SpareChangeScreenContract$ModalStep.SpareChangeAlreadyActive)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE1 = bVar3.e1(new bwh.a(((SpareChangeScreenContract$ModalStep.SpareChangeAlreadyActive) step3).f94746a, yvh.h.VAULT));
                iqg.l block3 = new iqg.l(bVar3, 1);
                Intrinsics.checkNotNullParameter(block3, "block");
                viewControllerE1.H = block3;
                return viewControllerE1;
            case 8:
                com.revolut.sso.impl.ui.signup.b bVar4 = (com.revolut.sso.impl.ui.signup.b) obj4;
                RevolutSsoApi$SignUpInputData revolutSsoApi$SignUpInputData = bVar4.f106774x;
                SignUpFlowContract$Step step4 = (SignUpFlowContract$Step) data;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof SignUpFlowContract$Step.ContinueWithExistingAccount) {
                    ContinueWithIdentityFlow continueWithIdentityFlow = new ContinueWithIdentityFlow();
                    iql.d block4 = new iql.d(bVar4, 0);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    continueWithIdentityFlow.H = block4;
                    return continueWithIdentityFlow;
                }
                if (step4 instanceof SignUpFlowContract$Step$Authentication$SignUpMode$ClaimRequired) {
                    return bVar4.L2(new AuthenticationFlowContract$InputData.SignIn(null, revolutSsoApi$SignUpInputData.f105871a, new AuthenticationFlowContract$InputData.SignIn.Origin.SignUp.ClaimRequired(revolutSsoApi$SignUpInputData.f105872b, ((SignUpFlowContract$Step$Authentication$SignUpMode$ClaimRequired) step4).f106760a)));
                }
                if (!(step4 instanceof SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired)) {
                    if (step4 instanceof SignUpFlowContract$Step$Authentication$SignUpMode$ExistingAccount) {
                        return bVar4.L2(new AuthenticationFlowContract$InputData.SignIn(((SignUpFlowContract$Step$Authentication$SignUpMode$ExistingAccount) step4).f106764a, revolutSsoApi$SignUpInputData.f105871a, new AuthenticationFlowContract$InputData.SignIn.Origin.Default(true, true)));
                    }
                    if (step4 instanceof SignUpFlowContract$Step$Authentication$SignUpMode$Social) {
                        return bVar4.L2(new AuthenticationFlowContract$InputData.SignIn(null, revolutSsoApi$SignUpInputData.f105871a, new AuthenticationFlowContract$InputData.SignIn.Origin.SignUp.Social(revolutSsoApi$SignUpInputData.f105872b)));
                    }
                    if (step4 instanceof SignUpFlowContract$Step$Authentication$SignInMode) {
                        return bVar4.L2(new AuthenticationFlowContract$InputData.SignIn(null, revolutSsoApi$SignUpInputData.f105871a, new AuthenticationFlowContract$InputData.SignIn.Origin.Default(false, 3)));
                    }
                    if (step4 instanceof SignUpFlowContract$Step.StartAccountCreation) {
                        IdentifierInputScreen identifierInputScreen = new IdentifierInputScreen(new IdentifierInputScreenContract$InputData(revolutSsoApi$SignUpInputData.f105871a, new IdentifierInputScreenContract$Mode.SignUp(false)));
                        iql.d dVar = new iql.d(bVar4, 1);
                        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
                        identifierInputScreen.H = dVar;
                        return identifierInputScreen;
                    }
                    if (!(step4 instanceof SignUpFlowContract$Step.AuthRejected)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SignUpFlowContract$Step.AuthRejected authRejected = (SignUpFlowContract$Step.AuthRejected) step4;
                    Claim claim = authRejected.f106756a;
                    AuthenticationRejectedFlow authenticationRejectedFlow = new AuthenticationRejectedFlow(new AuthenticationRejectedFlowContract$InputData(authRejected.f106757b, authRejected.f106758c));
                    wk block5 = new wk(bVar4, claim, 19);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    authenticationRejectedFlow.H = block5;
                    return authenticationRejectedFlow;
                }
                SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired signUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired = (SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired) step4;
                Claim claim2 = signUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired.f106761a;
                Challenge challenge = signUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired.f106762b;
                ArrayList arrayList = signUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired.f106763c;
                if (claim2 instanceof Claim.Phone) {
                    String value = ((Claim.Phone) claim2).f106131a;
                    Intrinsics.checkNotNullParameter(value, "value");
                    email = new RevolutSsoApi$DefaultIdentifier.Predefined.Phone(value);
                } else if (claim2 instanceof Claim.Email) {
                    String value2 = ((Claim.Email) claim2).f106127a;
                    Intrinsics.checkNotNullParameter(value2, "value");
                    email = new RevolutSsoApi$DefaultIdentifier.Predefined.Email(value2);
                } else {
                    if ((claim2 instanceof Claim.BioPublicKey) || (claim2 instanceof Claim.Google) || (claim2 instanceof Claim.IdentityId) || (claim2 instanceof Claim.Password) || (claim2 instanceof Claim.Pin) || (claim2 instanceof Claim.PublicKey) || (claim2 instanceof Claim.WebAuthn)) {
                        throw new IllegalStateException(("Claim " + o0.f186429a.b(claim2.getClass()) + " is not supported as identifier").toString());
                    }
                    if (claim2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i32 = iql.f.f167897a[((cjl.q) d0.a0(((rqk.k) bVar4.u).b())).ordinal()];
                    if (i32 == 1) {
                        preferred = RevolutSsoApi$DefaultIdentifier.Preferred.Phone;
                    } else {
                        if (i32 != 2 && i32 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        preferred = RevolutSsoApi$DefaultIdentifier.Preferred.Email;
                    }
                    email = preferred;
                }
                return bVar4.L2(new AuthenticationFlowContract$InputData.SignIn(null, email, new AuthenticationFlowContract$InputData.SignIn.Origin.SignUp.EvidenceRequired(revolutSsoApi$SignUpInputData.f105872b, challenge, arrayList)));
            case 9:
                final com.revolut.feature.credit.card.impl.ui.direct_debit.b bVar5 = (com.revolut.feature.credit.card.impl.ui.direct_debit.b) obj4;
                qki.d dVar2 = bVar5.f69273r;
                yki.l FlowCoordinator = (yki.l) obj2;
                CreditCardDirectDebitV3FlowContract$Step step5 = (CreditCardDirectDebitV3FlowContract$Step) data;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof CreditCardDirectDebitV3FlowContract$Step.SetAccount) {
                    DirectDebitSetAccountScreen directDebitSetAccountScreen = new DirectDebitSetAccountScreen(new DirectDebitSetAccountScreenContract$InputData(((CreditCardDirectDebitV3FlowContract$State) ((j2) dVar2.f22677a).getValue()).f69266c, null));
                    Function1 block6 = new Function1() { // from class: ir4.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    hz4.i result = (hz4.i) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof hz4.h;
                                    com.revolut.feature.credit.card.impl.ui.direct_debit.b bVar6 = bVar5;
                                    if (z) {
                                        bVar6.n2(new ikf.g(bVar6, ((hz4.h) result).f157024a, null, 11), new whi.b(6));
                                    } else {
                                        if (!(result instanceof hz4.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar6.C2(g.f168004a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    l result2 = (l) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z3 = result2 instanceof k;
                                    com.revolut.feature.credit.card.impl.ui.direct_debit.b bVar7 = bVar5;
                                    if (z3) {
                                        lb5.b bVar8 = bVar7.o;
                                        String facilityId = ((CreditCardDirectDebitV3FlowContract$State) ((j2) bVar7.f69273r.f22677a).getValue()).f69264a;
                                        yb5.e eVar = (yb5.e) bVar8;
                                        eVar.getClass();
                                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                                        bVar7.C1(new BridgeDestination(new FeatureCommand(new PdfViewFeatureConfiguration(j6.a.r(eVar.f312202b.getBaseUrl(), "/credit/", facilityId, "/mandate/terms-and-conditions"), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_direct_debit_confirmation_disclaimer_terms, null, null, 14), false, false, 60))));
                                    } else if (result2 instanceof j) {
                                        bVar7.l2(new p0(bVar7, null, 2), new yi5.b(26));
                                    } else {
                                        if (!(result2 instanceof ly4.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar7.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    directDebitSetAccountScreen.H = block6;
                    return directDebitSetAccountScreen;
                }
                if (!(step5 instanceof CreditCardDirectDebitV3FlowContract$Step.Confirm)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardDirectDebitV3FlowContract$Step.Confirm confirm = (CreditCardDirectDebitV3FlowContract$Step.Confirm) step5;
                DirectDebitConfirmScreen directDebitConfirmScreen = new DirectDebitConfirmScreen(new DirectDebitConfirmScreenContract$InputData(DirectDebitConfirmScreenContract$AmountType.Minimum.f69855a, new DirectDebitConfirmScreenContract$RepaymentDay.DueDate(((CreditCardDirectDebitV3FlowContract$State) ((j2) dVar2.f22677a).getValue()).f69265b.f), new TextClause(confirm.f69268b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), confirm.f69267a));
                final int i33 = 1;
                Function1 block7 = new Function1() { // from class: ir4.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i33) {
                            case 0:
                                hz4.i result = (hz4.i) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z = result instanceof hz4.h;
                                com.revolut.feature.credit.card.impl.ui.direct_debit.b bVar6 = bVar5;
                                if (z) {
                                    bVar6.n2(new ikf.g(bVar6, ((hz4.h) result).f157024a, null, 11), new whi.b(6));
                                } else {
                                    if (!(result instanceof hz4.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar6.C2(g.f168004a);
                                }
                                return Unit.f186387a;
                            default:
                                l result2 = (l) obj5;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                boolean z3 = result2 instanceof k;
                                com.revolut.feature.credit.card.impl.ui.direct_debit.b bVar7 = bVar5;
                                if (z3) {
                                    lb5.b bVar8 = bVar7.o;
                                    String facilityId = ((CreditCardDirectDebitV3FlowContract$State) ((j2) bVar7.f69273r.f22677a).getValue()).f69264a;
                                    yb5.e eVar = (yb5.e) bVar8;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                                    bVar7.C1(new BridgeDestination(new FeatureCommand(new PdfViewFeatureConfiguration(j6.a.r(eVar.f312202b.getBaseUrl(), "/credit/", facilityId, "/mandate/terms-and-conditions"), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_direct_debit_confirmation_disclaimer_terms, null, null, 14), false, false, 60))));
                                } else if (result2 instanceof j) {
                                    bVar7.l2(new p0(bVar7, null, 2), new yi5.b(26));
                                } else {
                                    if (!(result2 instanceof ly4.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar7.B2();
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block7, "block");
                directDebitConfirmScreen.H = block7;
                return directDebitConfirmScreen;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.c.b(((is2.f) obj4).f168081a);
            case 11:
                com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.details.flow.a aVar3 = (com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.details.flow.a) obj4;
                CreditCardPostPurchaseDetailsFlowContract$InputData creditCardPostPurchaseDetailsFlowContract$InputData = aVar3.o;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                CreditCardPostPurchaseDetailsFlowContract$Step step6 = (CreditCardPostPurchaseDetailsFlowContract$Step) data;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof CreditCardPostPurchaseDetailsFlowContract$Step.Details) {
                    InstalmentDetailsScreen instalmentDetailsScreen = new InstalmentDetailsScreen(new InstalmentDetailsScreenContract$InputData(creditCardPostPurchaseDetailsFlowContract$InputData.f69412a, creditCardPostPurchaseDetailsFlowContract$InputData.f69413b, ((jte.d) aVar3.f69417p).c(CreditCardApi$Toggles$CreditCardInstalmentDetailsRedesign.f68684c)));
                    is2.t block8 = new is2.t(aVar3, 2);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    instalmentDetailsScreen.H = block8;
                    return instalmentDetailsScreen;
                }
                if (step6 instanceof CreditCardPostPurchaseDetailsFlowContract$Step.Edit) {
                    return new CreditCardEditPostPurchaseInstalmentTermScreen(new CreditCardEditPostPurchaseInstalmentTermScreenContract$InputData(creditCardPostPurchaseDetailsFlowContract$InputData.f69412a, creditCardPostPurchaseDetailsFlowContract$InputData.f69413b));
                }
                if (step6 instanceof CreditCardPostPurchaseDetailsFlowContract$Step.Repay) {
                    return new CreditCardInstalmentRepayFlow(new CreditCardInstalmentRepayFlowContract$InputData(creditCardPostPurchaseDetailsFlowContract$InputData.f69412a, creditCardPostPurchaseDetailsFlowContract$InputData.f69413b, ql4.v.POST_PURCHASE, ((CreditCardPostPurchaseDetailsFlowContract$Step.Repay) step6).f69416a));
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                com.revolut.feature.sca_prompt.impl.flow.b bVar6 = (com.revolut.feature.sca_prompt.impl.flow.b) obj4;
                isc.c cVar = bVar6.f85345q;
                isc.f fVar = bVar6.o;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                ScaPromptFlowContract$Step step7 = (ScaPromptFlowContract$Step) data;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!(step7 instanceof ScaPromptFlowContract$Step.ScaPrompt)) {
                    if (step7 instanceof ScaPromptFlowContract$Step.AreYouSureDialog) {
                        String legalEntityId = fVar.f168177a;
                        AnalyticsProduct analyticsProduct = fVar.d;
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
                        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_prompt_are_you_sure_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_prompt_are_you_sure_dialog_subtitle, u.c(cVar.f168174a.j(legalEntityId)), null, 12), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_prompt_are_you_sure_dialog_go_back_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 956), new n6(new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_prompt_are_you_sure_dialog_do_it_later_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 956), null, null, null, 121), analyticsProduct, null, null, 24));
                        dph.c block9 = new dph.c(bVar6, LazyFlowCoordinator, 16);
                        Intrinsics.checkNotNullParameter(block9, "block");
                        actionsBottomSheetController.H = block9;
                        return actionsBottomSheetController;
                    }
                    if (!(step7 instanceof ScaPromptFlowContract$Step.WarningDialog)) {
                        if (step7 instanceof ScaPromptFlowContract$Step.LearnMore) {
                            return new ScaLearnMoreScreen(new ksc.d(fVar.f168177a, fVar.f168179c, fVar.d));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    AnalyticsProduct analyticsProduct2 = fVar.d;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(analyticsProduct2, "analyticsProduct");
                    ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_prompt_trade_with_warning_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_prompt_trade_with_warning_dialog_description, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_16_warning, GlyphImageTint.WARNING.f59933a, null, 4)), null, false, 24), new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_prompt_action_skip, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_prompt_action_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), analyticsProduct2, null, null, 24));
                    is2.t block10 = new is2.t(bVar6, 6);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    actionsBottomSheetController2.H = block10;
                    return actionsBottomSheetController2;
                }
                Clause clause = ((ScaPromptFlowContract$Step.ScaPrompt) step7).f85342a;
                String legalEntityId2 = fVar.f168177a;
                vrc.k purpose = fVar.f168179c;
                AnalyticsProduct analyticsProduct3 = fVar.d;
                Clause textLocalisedClause4 = fVar.e;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(legalEntityId2, "legalEntityId");
                Intrinsics.checkNotNullParameter(purpose, "purpose");
                Intrinsics.checkNotNullParameter(analyticsProduct3, "analyticsProduct");
                id idVar = clause == null ? id.VERTICAL : id.HORIZONTAL;
                if (textLocalisedClause4 == null) {
                    c2 = 0;
                    textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_prompt_title, null, null, 14);
                } else {
                    c2 = 0;
                }
                Clause clause2 = textLocalisedClause4;
                nd.k kVar = cVar.f168174a;
                int i43 = isc.b.f168173c[msc.a.a(legalEntityId2).ordinal()];
                if (i43 != 1) {
                    if (i43 == 2) {
                        obj3 = null;
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.stocks_sca_prompt_subtitle_rseuab, null, null, 14);
                    } else if (i43 == 3) {
                        obj3 = null;
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.wealth_sca_prompt_subtitle_revolut_ltd, null, null, 14);
                    } else if (i43 == 4) {
                        obj3 = null;
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.wealth_sca_prompt_subtitle_revolut_trading_ltd, null, null, 14);
                    } else {
                        if (i43 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m70.a.c(kotlin.jvm.internal.t0.f186434a);
                        textLocalisedClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        r102 = 0;
                    }
                    textLocalisedClause = textLocalisedClause2;
                    r102 = obj3;
                } else {
                    int i59 = isc.b.f168172b[purpose.ordinal()];
                    if (i59 == 1) {
                        r102 = 0;
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_prompt_subtitle, null, null, 14);
                    } else {
                        if (i59 != 2 && i59 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i66 = com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_prompt_mandatory_to_trade_subtitle;
                        Clause clauseI = kVar.i(legalEntityId2);
                        Clause clauseJ = kVar.j(legalEntityId2);
                        r102 = 0;
                        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_app_name_retail, null, null, 14);
                        Clause[] clauseArr = new Clause[3];
                        clauseArr[c2] = clauseI;
                        clauseArr[1] = clauseJ;
                        clauseArr[2] = textLocalisedClause5;
                        textLocalisedClause = new TextLocalisedClause(i66, v.k(clauseArr), null, 12);
                    }
                }
                PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D174", r102, r102, r102, 30), r102);
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_prompt_learn_more, null, null, 14);
                int[] iArr = isc.b.f168171a;
                int i74 = iArr[idVar.ordinal()];
                if (i74 != 1) {
                    i = 2;
                    if (i74 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    buttonA = isc.c.b();
                } else {
                    i = 2;
                    buttonA = isc.c.a();
                }
                PromptMarketingContentDelegate.Model.Button button = buttonA;
                int i92 = iArr[idVar.ordinal()];
                if (i92 == 1) {
                    buttonB = isc.c.b();
                } else {
                    if (i92 != i) {
                        throw new NoWhenBranchMatchedException();
                    }
                    buttonB = isc.c.a();
                }
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("SCA_PROMPT_LIST_ID", clause2, textLocalisedClause, mediaContent, null, null, resourceImage, null, null, button, buttonB, idVar, clause != null ? new PromptMarketingContentDelegate.Model.Footer(new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_prompt_footer_legal_entity_description, u.c(clause), null, 12)) : null, null, null, null, null, textLocalisedClause6, null, null, null, 1958320), analyticsProduct3, true, false, null, 24));
                t block11 = new t(bVar6, LazyFlowCoordinator, 5);
                Intrinsics.checkNotNullParameter(block11, "block");
                promptMarketingScreen.H = block11;
                return promptMarketingScreen;
            case 13:
                final com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar3 = (com.revolut.feature.three_ds_verification.impl.ui.sceen.d) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                final ThreeDsVerificationScreenContract$ModalStep step8 = (ThreeDsVerificationScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof ThreeDsVerificationScreenContract$ModalStep.SelectAddMoneyMethod) {
                    ThreeDsVerificationScreenContract$ModalStep.SelectAddMoneyMethod selectAddMoneyMethod = (ThreeDsVerificationScreenContract$ModalStep.SelectAddMoneyMethod) step8;
                    dj0.d dVar4 = selectAddMoneyMethod.f90411a;
                    f0 f0Var = selectAddMoneyMethod.f90412b;
                    AddMoneyMethod addMoneyMethod = selectAddMoneyMethod.d;
                    AccountWrapper accountWrapper = selectAddMoneyMethod.f90413c;
                    Set set = ase.a.f8926a;
                    Intrinsics.checkNotNullParameter(accountWrapper, "<this>");
                    AddMoneyMethodSelectionController addMoneyMethodSelectionController = new AddMoneyMethodSelectionController(new AddMoneyMethodSelectionScreenContract$InputData(dVar4, f0Var, accountWrapper, ase.a.f8926a.contains(accountWrapper.f97224a), addMoneyMethod));
                    Function1 block12 = new Function1() { // from class: ise.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    bse.i result = (bse.i) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof bse.h)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    AddMoneyMethod addMoneyMethod2 = ((bse.h) result).f18184a;
                                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar5 = dVar3;
                                    dVar5.H2(dVar5.M, new is2.t(addMoneyMethod2, dVar5));
                                    dVar5.l2(new ikf.g(dVar5, addMoneyMethod2, null, 16), new yi5.b(26));
                                    return Unit.f186387a;
                                default:
                                    ste.u result2 = (ste.u) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof ste.s) {
                                        dVar3.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.card-deposit-limits-and-fees", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                    } else if (!Intrinsics.f(result2, ste.t.f265575a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    addMoneyMethodSelectionController.H = block12;
                    return addMoneyMethodSelectionController;
                }
                if (step8 instanceof ThreeDsVerificationScreenContract$ModalStep.TopUpWithExistingCard) {
                    ThreeDsVerificationScreenContract$ModalStep.TopUpWithExistingCard topUpWithExistingCard = (ThreeDsVerificationScreenContract$ModalStep.TopUpWithExistingCard) step8;
                    ViewController viewControllerE12 = dVar3.e1(new ste.k(new FacadeCardTopupFlowDescriptor$InputData(new CardTopUpType.RegularTopUp(topUpWithExistingCard.f90414a), topUpWithExistingCard.f90415b, topUpWithExistingCard.f90416c, new TopUpContext.ThreeDs(topUpWithExistingCard.d))));
                    Function1 block13 = new Function1() { // from class: ise.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    ste.j result = (ste.j) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof ste.h;
                                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar5 = dVar3;
                                    ThreeDsVerificationScreenContract$ModalStep threeDsVerificationScreenContract$ModalStep = step8;
                                    if (z) {
                                        com.revolut.feature.three_ds_verification.impl.ui.sceen.d.Q2(dVar5, ((ThreeDsVerificationScreenContract$ModalStep.TopUpWithExistingCard) threeDsVerificationScreenContract$ModalStep).f90414a.f115083b, null, 6);
                                    } else if (result instanceof ste.g) {
                                        ThreeDsVerificationScreenContract$ModalStep.TopUpWithExistingCard topUpWithExistingCard2 = (ThreeDsVerificationScreenContract$ModalStep.TopUpWithExistingCard) threeDsVerificationScreenContract$ModalStep;
                                        xi0.b bVar7 = topUpWithExistingCard2.f90414a.f115083b;
                                        dVar5.P2(topUpWithExistingCard2.f90415b, ((ste.g) result).f265562a, bVar7);
                                    } else {
                                        if (!(result instanceof ste.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        yji.l.a1(dVar5, dVar5.X1(((c1f.a) dVar5.C).e()), null, null, new v(0, dVar5, null), 3);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ste.o result2 = (ste.o) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z3 = result2 instanceof ste.n;
                                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar6 = dVar3;
                                    ThreeDsVerificationScreenContract$ModalStep threeDsVerificationScreenContract$ModalStep2 = step8;
                                    if (z3) {
                                        com.revolut.feature.three_ds_verification.impl.ui.sceen.d.Q2(dVar6, ((ThreeDsVerificationScreenContract$ModalStep.TopUpWithGooglePay) threeDsVerificationScreenContract$ModalStep2).f90417a.f115083b, null, 6);
                                    } else if (result2 instanceof ste.m) {
                                        com.revolut.feature.three_ds_verification.impl.ui.sceen.d.Q2(dVar6, ((ThreeDsVerificationScreenContract$ModalStep.TopUpWithGooglePay) threeDsVerificationScreenContract$ModalStep2).f90417a.f115083b, ((ste.m) result2).f265567a, 4);
                                    } else if (!(result2 instanceof ste.l)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                default:
                                    ste.z result3 = (ste.z) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof ste.x;
                                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar7 = dVar3;
                                    ThreeDsVerificationScreenContract$ModalStep threeDsVerificationScreenContract$ModalStep3 = step8;
                                    if (z4) {
                                        com.revolut.feature.three_ds_verification.impl.ui.sceen.d.Q2(dVar7, ((ThreeDsVerificationScreenContract$ModalStep.TopUpWithNewCard) threeDsVerificationScreenContract$ModalStep3).f90420a.f115083b, null, 6);
                                    } else if (result3 instanceof ste.w) {
                                        ThreeDsVerificationScreenContract$ModalStep.TopUpWithNewCard topUpWithNewCard = (ThreeDsVerificationScreenContract$ModalStep.TopUpWithNewCard) threeDsVerificationScreenContract$ModalStep3;
                                        xi0.b bVar8 = topUpWithNewCard.f90420a.f115083b;
                                        dVar7.P2(topUpWithNewCard.e, ((ste.w) result3).f265577a, bVar8);
                                    } else {
                                        if (!(result3 instanceof ste.y)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        yji.l.a1(dVar7, dVar7.X1(((c1f.a) dVar7.C).e()), null, null, new v(1, dVar7, null), 3);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    viewControllerE12.H = block13;
                    return viewControllerE12;
                }
                if (step8 instanceof ThreeDsVerificationScreenContract$ModalStep.TopUpWithGooglePay) {
                    ThreeDsVerificationScreenContract$ModalStep.TopUpWithGooglePay topUpWithGooglePay = (ThreeDsVerificationScreenContract$ModalStep.TopUpWithGooglePay) step8;
                    ViewController viewControllerE13 = dVar3.e1(new ste.p(new GooglePayFlowDescriptor$InputData(topUpWithGooglePay.f90417a, topUpWithGooglePay.f90418b, new TopUpContext.ThreeDs(topUpWithGooglePay.f90419c))));
                    final int i96 = 1;
                    Function1 block14 = new Function1() { // from class: ise.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i96) {
                                case 0:
                                    ste.j result = (ste.j) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof ste.h;
                                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar5 = dVar3;
                                    ThreeDsVerificationScreenContract$ModalStep threeDsVerificationScreenContract$ModalStep = step8;
                                    if (z) {
                                        com.revolut.feature.three_ds_verification.impl.ui.sceen.d.Q2(dVar5, ((ThreeDsVerificationScreenContract$ModalStep.TopUpWithExistingCard) threeDsVerificationScreenContract$ModalStep).f90414a.f115083b, null, 6);
                                    } else if (result instanceof ste.g) {
                                        ThreeDsVerificationScreenContract$ModalStep.TopUpWithExistingCard topUpWithExistingCard2 = (ThreeDsVerificationScreenContract$ModalStep.TopUpWithExistingCard) threeDsVerificationScreenContract$ModalStep;
                                        xi0.b bVar7 = topUpWithExistingCard2.f90414a.f115083b;
                                        dVar5.P2(topUpWithExistingCard2.f90415b, ((ste.g) result).f265562a, bVar7);
                                    } else {
                                        if (!(result instanceof ste.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        yji.l.a1(dVar5, dVar5.X1(((c1f.a) dVar5.C).e()), null, null, new v(0, dVar5, null), 3);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ste.o result2 = (ste.o) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z3 = result2 instanceof ste.n;
                                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar6 = dVar3;
                                    ThreeDsVerificationScreenContract$ModalStep threeDsVerificationScreenContract$ModalStep2 = step8;
                                    if (z3) {
                                        com.revolut.feature.three_ds_verification.impl.ui.sceen.d.Q2(dVar6, ((ThreeDsVerificationScreenContract$ModalStep.TopUpWithGooglePay) threeDsVerificationScreenContract$ModalStep2).f90417a.f115083b, null, 6);
                                    } else if (result2 instanceof ste.m) {
                                        com.revolut.feature.three_ds_verification.impl.ui.sceen.d.Q2(dVar6, ((ThreeDsVerificationScreenContract$ModalStep.TopUpWithGooglePay) threeDsVerificationScreenContract$ModalStep2).f90417a.f115083b, ((ste.m) result2).f265567a, 4);
                                    } else if (!(result2 instanceof ste.l)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                default:
                                    ste.z result3 = (ste.z) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof ste.x;
                                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar7 = dVar3;
                                    ThreeDsVerificationScreenContract$ModalStep threeDsVerificationScreenContract$ModalStep3 = step8;
                                    if (z4) {
                                        com.revolut.feature.three_ds_verification.impl.ui.sceen.d.Q2(dVar7, ((ThreeDsVerificationScreenContract$ModalStep.TopUpWithNewCard) threeDsVerificationScreenContract$ModalStep3).f90420a.f115083b, null, 6);
                                    } else if (result3 instanceof ste.w) {
                                        ThreeDsVerificationScreenContract$ModalStep.TopUpWithNewCard topUpWithNewCard = (ThreeDsVerificationScreenContract$ModalStep.TopUpWithNewCard) threeDsVerificationScreenContract$ModalStep3;
                                        xi0.b bVar8 = topUpWithNewCard.f90420a.f115083b;
                                        dVar7.P2(topUpWithNewCard.e, ((ste.w) result3).f265577a, bVar8);
                                    } else {
                                        if (!(result3 instanceof ste.y)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        yji.l.a1(dVar7, dVar7.X1(((c1f.a) dVar7.C).e()), null, null, new v(1, dVar7, null), 3);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block14, "block");
                    viewControllerE13.H = block14;
                    return viewControllerE13;
                }
                if (step8 instanceof ThreeDsVerificationScreenContract$ModalStep.AddNewTopUpCard) {
                    ViewController viewControllerE14 = dVar3.e1(new ste.c(new CardDetailsScreenDescriptor$InputData(false)));
                    t block15 = new t(dVar3, ModalCoordinator4, step8);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    viewControllerE14.H = block15;
                    return viewControllerE14;
                }
                if (step8 instanceof ThreeDsVerificationScreenContract$ModalStep.TopUpWithNewCard) {
                    ThreeDsVerificationScreenContract$ModalStep.TopUpWithNewCard topUpWithNewCard = (ThreeDsVerificationScreenContract$ModalStep.TopUpWithNewCard) step8;
                    ViewController viewControllerE15 = dVar3.e1(new ste.a0(new TopupWithNewCardFlowDescriptor$InputData(topUpWithNewCard.f90421b, topUpWithNewCard.f90422c, topUpWithNewCard.d, topUpWithNewCard.f90420a, topUpWithNewCard.f90424h, new TopUpContext.ThreeDs(topUpWithNewCard.i), topUpWithNewCard.e, topUpWithNewCard.f, topUpWithNewCard.f90423g)));
                    final int i99 = 2;
                    Function1 block16 = new Function1() { // from class: ise.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i99) {
                                case 0:
                                    ste.j result = (ste.j) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof ste.h;
                                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar5 = dVar3;
                                    ThreeDsVerificationScreenContract$ModalStep threeDsVerificationScreenContract$ModalStep = step8;
                                    if (z) {
                                        com.revolut.feature.three_ds_verification.impl.ui.sceen.d.Q2(dVar5, ((ThreeDsVerificationScreenContract$ModalStep.TopUpWithExistingCard) threeDsVerificationScreenContract$ModalStep).f90414a.f115083b, null, 6);
                                    } else if (result instanceof ste.g) {
                                        ThreeDsVerificationScreenContract$ModalStep.TopUpWithExistingCard topUpWithExistingCard2 = (ThreeDsVerificationScreenContract$ModalStep.TopUpWithExistingCard) threeDsVerificationScreenContract$ModalStep;
                                        xi0.b bVar7 = topUpWithExistingCard2.f90414a.f115083b;
                                        dVar5.P2(topUpWithExistingCard2.f90415b, ((ste.g) result).f265562a, bVar7);
                                    } else {
                                        if (!(result instanceof ste.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        yji.l.a1(dVar5, dVar5.X1(((c1f.a) dVar5.C).e()), null, null, new v(0, dVar5, null), 3);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ste.o result2 = (ste.o) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z3 = result2 instanceof ste.n;
                                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar6 = dVar3;
                                    ThreeDsVerificationScreenContract$ModalStep threeDsVerificationScreenContract$ModalStep2 = step8;
                                    if (z3) {
                                        com.revolut.feature.three_ds_verification.impl.ui.sceen.d.Q2(dVar6, ((ThreeDsVerificationScreenContract$ModalStep.TopUpWithGooglePay) threeDsVerificationScreenContract$ModalStep2).f90417a.f115083b, null, 6);
                                    } else if (result2 instanceof ste.m) {
                                        com.revolut.feature.three_ds_verification.impl.ui.sceen.d.Q2(dVar6, ((ThreeDsVerificationScreenContract$ModalStep.TopUpWithGooglePay) threeDsVerificationScreenContract$ModalStep2).f90417a.f115083b, ((ste.m) result2).f265567a, 4);
                                    } else if (!(result2 instanceof ste.l)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                default:
                                    ste.z result3 = (ste.z) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof ste.x;
                                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar7 = dVar3;
                                    ThreeDsVerificationScreenContract$ModalStep threeDsVerificationScreenContract$ModalStep3 = step8;
                                    if (z4) {
                                        com.revolut.feature.three_ds_verification.impl.ui.sceen.d.Q2(dVar7, ((ThreeDsVerificationScreenContract$ModalStep.TopUpWithNewCard) threeDsVerificationScreenContract$ModalStep3).f90420a.f115083b, null, 6);
                                    } else if (result3 instanceof ste.w) {
                                        ThreeDsVerificationScreenContract$ModalStep.TopUpWithNewCard topUpWithNewCard2 = (ThreeDsVerificationScreenContract$ModalStep.TopUpWithNewCard) threeDsVerificationScreenContract$ModalStep3;
                                        xi0.b bVar8 = topUpWithNewCard2.f90420a.f115083b;
                                        dVar7.P2(topUpWithNewCard2.e, ((ste.w) result3).f265577a, bVar8);
                                    } else {
                                        if (!(result3 instanceof ste.y)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        yji.l.a1(dVar7, dVar7.X1(((c1f.a) dVar7.C).e()), null, null, new v(1, dVar7, null), 3);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block16, "block");
                    viewControllerE15.H = block16;
                    return viewControllerE15;
                }
                if (!(step8 instanceof ThreeDsVerificationScreenContract$ModalStep.UnverifiedOwnerLimitValueDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                xye.d dVar5 = dVar3.E;
                aue.d dVar6 = dVar3.D;
                TopUpLimitUiModel topUpLimitUiModel = ((ThreeDsVerificationScreenContract$ModalStep.UnverifiedOwnerLimitValueDialog) step8).f90425a;
                dVar6.getClass();
                ViewController viewControllerE16 = dVar3.e1(new ste.v(dVar5.b(u.c(aue.d.a(topUpLimitUiModel)), false)));
                final int i100 = 1;
                Function1 block17 = new Function1() { // from class: ise.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i100) {
                            case 0:
                                bse.i result = (bse.i) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (!(result instanceof bse.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                AddMoneyMethod addMoneyMethod2 = ((bse.h) result).f18184a;
                                com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar52 = dVar3;
                                dVar52.H2(dVar52.M, new is2.t(addMoneyMethod2, dVar52));
                                dVar52.l2(new ikf.g(dVar52, addMoneyMethod2, null, 16), new yi5.b(26));
                                return Unit.f186387a;
                            default:
                                ste.u result2 = (ste.u) obj5;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof ste.s) {
                                    dVar3.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.card-deposit-limits-and-fees", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                } else if (!Intrinsics.f(result2, ste.t.f265575a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block17, "block");
                viewControllerE16.H = block17;
                return viewControllerE16;
            case 14:
                Function1 defaultFactory = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return ((com.revolut.feature.three_ds_verification.impl.ui.sceen.g) obj4).a() ? u.c(new PromptMarketingContentDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(com.revolut.feature.cards_core.R$string.three_ds_verification_screen_load_error_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.cards_core.R$string.three_ds_verification_screen_load_error_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6), null), null, null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.cards_core.R$string.three_ds_verification_screen_load_error_button_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560)) : (List) defaultFactory.invoke(new iii.d(12, null, true, false, null));
            case 15:
                com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar4 = (com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ManualTransferReviewScreenContract$ModalStep step9 = (ManualTransferReviewScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof ManualTransferReviewScreenContract$ModalStep.BeneficiaryDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                ManualTransferReviewScreenContract$ModalStep.BeneficiaryDetails beneficiaryDetails = (ManualTransferReviewScreenContract$ModalStep.BeneficiaryDetails) step9;
                return aVar4.e1(new BeneficiaryDetailsDescriptor(new BeneficiaryDetailsInputData(null, beneficiaryDetails.f92486a, beneficiaryDetails.f92487b)));
            case 16:
                List benchmarks = (List) data;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(benchmarks, "benchmarks");
                ((ivg.b) obj4).f168861b.f("PERFORMANCE_BENCHMARKS_MEMORY_KEY", benchmarks);
                return Unit.f186387a;
            case 17:
                com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a aVar5 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                StockDetailsFeedControllerContract$ModalStep step10 = (StockDetailsFeedControllerContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof StockDetailsFeedControllerContract$ModalStep.ShowInsight)) {
                    throw new NoWhenBranchMatchedException();
                }
                StockDetailsFeedControllerContract$ModalStep.ShowInsight showInsight = (StockDetailsFeedControllerContract$ModalStep.ShowInsight) step10;
                return aVar5.e1(new w08.a(showInsight.f103950a, showInsight.f103951b, showInsight.f103952c));
            case 18:
                com.revolut.feature.credit.card.impl.ui.statement_financing.setup.b bVar7 = (com.revolut.feature.credit.card.impl.ui.statement_financing.setup.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditCardStatementFinancingSetupScreenContract$ModalStep step11 = (CreditCardStatementFinancingSetupScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof CreditCardStatementFinancingSetupScreenContract$ModalStep.EditDownPayment) {
                    CreditCardStatementFinancingSetupScreenContract$ModalStep.EditDownPayment editDownPayment = (CreditCardStatementFinancingSetupScreenContract$ModalStep.EditDownPayment) step11;
                    CreditCardDownPaymentScreen creditCardDownPaymentScreen = new CreditCardDownPaymentScreen(new CreditCardDownPaymentScreenContract$InputData(editDownPayment.f69771a, editDownPayment.f69772b, editDownPayment.f69773c));
                    iw4.q block18 = new iw4.q(bVar7, 1);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    creditCardDownPaymentScreen.H = block18;
                    return creditCardDownPaymentScreen;
                }
                if (!(step11 instanceof CreditCardStatementFinancingSetupScreenContract$ModalStep.Explainer)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.credit.card.impl.ui.statement_financing.setup.a aVar6 = bVar7.f69778s;
                CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel parcel = ((CreditCardStatementFinancingSetupScreenContract$ModalStep.Explainer) step11).f69774a;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel instanceof CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel.AmountToFinance;
                BottomSheet.ActionStyle.Accent accent = BottomSheet.ActionStyle.Accent.f69824a;
                if (z) {
                    TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_item_amount_to_finance, null, null, 14);
                    TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_item_amount_to_finance_info_description, null, null, 14);
                    BottomSheet.ActionBlock.SingleAction singleAction = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_got_it, null, null, 14), accent), null);
                    k9 k9Var = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    return BottomSheet.a(textLocalisedClause7, textLocalisedClause8, null, null, singleAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 76);
                }
                if (!(parcel instanceof CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel.DownPayment)) {
                    throw new NoWhenBranchMatchedException();
                }
                dj0.d dVar7 = ((CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel.DownPayment) parcel).f69770a;
                TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_item_down_payment, null, null, 14);
                TextLocalisedClause textLocalisedClause10 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_item_pay_now_info_description, u.c(sx4.f.b(3, null, null, new dj0.d(0L, dVar7.f115083b))), null, 12);
                BottomSheet.ActionBlock.SingleAction singleAction2 = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_got_it, null, null, 14), accent), null);
                List listC = u.c(new BottomSheet.ItemSection(u.c(new BottomSheet.Item.CellItem("id_pay_now_explainer_min_down_payment_item", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_item_pay_now_info_amount_title, null, null, 14), sx4.f.b(3, null, null, dVar7), null, false, null, 0, SyslogConstants.LOG_CLOCK))));
                k9 k9Var2 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                return BottomSheet.a(textLocalisedClause9, textLocalisedClause10, null, listC, singleAction2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, 68);
            case 19:
                com.revolut.feature.kyc.impl.idnow.video_ident.screen.a aVar7 = (com.revolut.feature.kyc.impl.idnow.video_ident.screen.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator8 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                IdnowVideoIdentScreenContract$ModalStep step12 = (IdnowVideoIdentScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator8, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof IdnowVideoIdentScreenContract$ModalStep.CloseVideoCall)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar7.f77797p.getClass();
                ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(nx8.a.a(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.video_conference_close_confirmation_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.video_conference_interrupted_action_exit_call, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_action_cancel, null, null, 14)));
                is2.t block19 = new is2.t(aVar7, 21);
                Intrinsics.checkNotNullParameter(block19, "block");
                actionsBottomSheetController3.H = block19;
                return actionsBottomSheetController3;
            case 20:
                com.revolut.feature.referrals.code.impl.referral_code.flow.a aVar8 = (com.revolut.feature.referrals.code.impl.referral_code.flow.a) obj4;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                ReferralCodeFlowContract$Step step13 = (ReferralCodeFlowContract$Step) data;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof ReferralCodeFlowContract$Step.EnterReferralCode)) {
                    throw new NoWhenBranchMatchedException();
                }
                ReferralCodeController referralCodeController = new ReferralCodeController(new ReferralCodeContract$InputData(aVar8.o.f81673a));
                is2.t block20 = new is2.t(aVar8, 22);
                Intrinsics.checkNotNullParameter(block20, "block");
                referralCodeController.H = block20;
                return referralCodeController;
            case 21:
                return a(obj2, data);
            case 22:
                return b(obj2, data);
            case 23:
                String error = (String) obj2;
                String context = (String) data;
                int i101 = iyl.c.f169785s;
                Intrinsics.checkNotNullParameter(error, "error");
                Intrinsics.checkNotNullParameter(context, "context");
                ((iyl.c) obj4).f169786h.onNext(new iyl.f(error, context));
                return Unit.f186387a;
            case 24:
                return c(obj2, data);
            case 25:
                return d(obj2, data);
            case 26:
                return e(obj2, data);
            case 27:
                return g(obj2, data);
            case 28:
                return h(obj2, data);
            default:
                final com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar8 = (com.revolut.feature.travel.experiences.impl.ui.flow.home.b) obj4;
                y yVar2 = bVar8.f93001t;
                TravelExperiencesHomeFlowContract$Step step14 = (TravelExperiencesHomeFlowContract$Step) data;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof TravelExperiencesHomeFlowContract$Step.Onboarding) {
                    ViewController viewControllerE17 = bVar8.e1(new ProductArticleDescriptor(((TravelExperiencesHomeFlowContract$Step.Onboarding) step14).f92992a, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, null, null, false, 56));
                    Function1 block21 = new Function1() { // from class: j1g.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            TravelExperiencesCheckoutFlowContract$Step attraction;
                            switch (i5) {
                                case 0:
                                    com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar9 = bVar8;
                                    y yVar3 = bVar9.f93001t;
                                    i outputData = (i) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof k1g.f) {
                                        bVar9.K2(((k1g.f) outputData).f180247a);
                                    } else if (outputData instanceof k1g.g) {
                                        yki.i iVar = bVar9.u;
                                        j2g.k kVar2 = ((k1g.g) outputData).f180248a;
                                        if (kVar2 instanceof k.a) {
                                            k.a aVar9 = (k.a) kVar2;
                                            TravelExperienceDatesSelection travelExperienceDatesSelection = aVar9.f170875a;
                                            TravelExperiencesSelectedLocation travelExperiencesSelectedLocation = aVar9.f170876b;
                                            if (travelExperiencesSelectedLocation != null) {
                                                String str = travelExperiencesSelectedLocation.f92776b;
                                                String value3 = travelExperiencesSelectedLocation.f92775a;
                                                TravelSearchLocationType travelSearchLocationType = travelExperiencesSelectedLocation.f92777c;
                                                if (travelSearchLocationType instanceof TravelSearchLocationType.Destination) {
                                                    if (aVar9.f170877c) {
                                                        Intrinsics.checkNotNullParameter(value3, "value");
                                                        attraction = new TravelExperiencesCheckoutFlowContract$Step.DestinationDiscovery(value3, travelExperienceDatesSelection);
                                                    } else {
                                                        Intrinsics.checkNotNullParameter(value3, "value");
                                                        attraction = new TravelExperiencesCheckoutFlowContract$Step.SearchResults.Destination(value3, str, travelExperienceDatesSelection);
                                                    }
                                                } else {
                                                    if (!Intrinsics.f(travelSearchLocationType, TravelSearchLocationType.Attraction.f92896a)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    Intrinsics.checkNotNullParameter(value3, "value");
                                                    attraction = new TravelExperiencesCheckoutFlowContract$Step.SearchResults.Attraction(value3, str, travelExperienceDatesSelection);
                                                }
                                                h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(attraction, null), true, null, false, 12);
                                            } else {
                                                h.t2(bVar9, iVar, TravelExperiencesHomeFlowContract$Step.Search.f92995a, true, null, false, 12);
                                            }
                                        } else if (kVar2 instanceof j2g.j) {
                                            j2g.j jVar = (j2g.j) kVar2;
                                            TravelExperienceDatesSelection travelExperienceDatesSelection2 = jVar.f170873b;
                                            if (travelExperienceDatesSelection2 == null) {
                                                travelExperienceDatesSelection2 = ((c) ((j2) yVar3.f22677a).getValue()).f170454a;
                                            }
                                            h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(null, travelExperienceDatesSelection2, jVar.f170872a), travelExperienceDatesSelection2), true, null, false, 12);
                                        } else if (kVar2 instanceof j2g.i) {
                                            TravelExperienceDatesSelection travelExperienceDatesSelection3 = ((j2g.i) kVar2).f170871a;
                                            bVar9.l2(new p(bVar9, travelExperienceDatesSelection3, null, 4), new yi5.b(26));
                                            bVar9.H2(yVar3, new e(travelExperienceDatesSelection3, 0));
                                        } else {
                                            if (!(kVar2 instanceof k.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.Home(TravelExperiencesTabsFlowContract$PagerItem.Bookings.f93003a), false, null, false, 12);
                                        }
                                    } else {
                                        if (!(outputData instanceof k1g.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        k1g.h hVar = (k1g.h) outputData;
                                        TravelExperienceDatesSelection travelExperienceDatesSelection4 = hVar.f180250b;
                                        if (travelExperienceDatesSelection4 == null) {
                                            travelExperienceDatesSelection4 = ((c) ((j2) yVar3.f22677a).getValue()).f170454a;
                                        }
                                        TravelExperienceDatesSelection travelExperienceDatesSelection5 = travelExperienceDatesSelection4;
                                        h.t2(bVar9, bVar9.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(hVar.f180251c, travelExperienceDatesSelection5, hVar.f180249a), travelExperienceDatesSelection5), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    v2g.e outputData2 = (v2g.e) obj5;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar10 = bVar8;
                                    h.t2(bVar10, bVar10.u, new TravelExperiencesHomeFlowContract$Step.BookingDetails(outputData2.f285735a, false), true, null, false, 12);
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar11 = bVar8;
                                    y yVar4 = bVar11.f93001t;
                                    k3g.k outputData3 = (k3g.k) obj5;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    if (outputData3 instanceof k3g.g) {
                                        h.t2(bVar11, bVar11.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(null, ((c) ((j2) yVar4.f22677a).getValue()).f170454a, ((k3g.g) outputData3).f180717a), null), true, null, false, 12);
                                    } else if (outputData3 instanceof k3g.f) {
                                        TravelSearchDestination travelSearchDestination = ((k3g.f) outputData3).f180716a;
                                        bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(travelSearchDestination.f92888a, travelSearchDestination.f92889b, new TravelSearchLocationType.Destination(travelSearchDestination.f92890c)), null, 5), new yi5.b(26));
                                    } else if (outputData3 instanceof k3g.j) {
                                        k3g.j jVar2 = (k3g.j) outputData3;
                                        bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(jVar2.f180722a, jVar2.f180724c, new TravelSearchLocationType.Destination(jVar2.f180723b)), null, 5), new yi5.b(26));
                                    } else {
                                        boolean z3 = outputData3 instanceof k3g.i;
                                        TravelSearchLocationType.Attraction attraction2 = TravelSearchLocationType.Attraction.f92896a;
                                        if (z3) {
                                            k3g.i iVar2 = (k3g.i) outputData3;
                                            bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(iVar2.f180719a, iVar2.f180720b, attraction2), null, 5), new yi5.b(26));
                                        } else if (outputData3 instanceof k3g.h) {
                                            h.t2(bVar11, bVar11.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.SearchResults.PreciseLocation(((k3g.h) outputData3).f180718a, ((c) ((j2) yVar4.f22677a).getValue()).f170454a, new TravelExperienceFiltersSelection(31, null)), null), true, null, false, 12);
                                        } else {
                                            if (!(outputData3 instanceof k3g.e)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            TravelSearchAttraction travelSearchAttraction = ((k3g.e) outputData3).f180715a;
                                            bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(travelSearchAttraction.f92885a, travelSearchAttraction.f92886b, attraction2), null, 5), new yi5.b(26));
                                        }
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    yja.b output = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    int i102 = f.f170459a[output.ordinal()];
                                    com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar12 = bVar8;
                                    if (i102 == 1 || i102 == 2) {
                                        bVar12.B2();
                                    } else {
                                        if (i102 != 3 && i102 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(bVar12, bVar12.u, bVar12.J2(bVar12.o), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    h1g.c outputData4 = (h1g.c) obj5;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar13 = bVar8;
                                    h.t2(bVar13, bVar13.u, new TravelExperiencesHomeFlowContract$Step.BookingDetails(outputData4.f148555a, true), false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    p1g.g outputData5 = (p1g.g) obj5;
                                    Intrinsics.checkNotNullParameter(outputData5, "outputData");
                                    if (outputData5 instanceof p1g.f) {
                                        bVar8.K2(outputData5);
                                    } else if (!(outputData5 instanceof g.b) && !(outputData5 instanceof g.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    viewControllerE17.H = block21;
                    return viewControllerE17;
                }
                if (step14 instanceof TravelExperiencesHomeFlowContract$Step.Home) {
                    TravelExperiencesTabsFlow travelExperiencesTabsFlow = new TravelExperiencesTabsFlow(new TravelExperiencesTabsFlowContract$InputData(((TravelExperiencesHomeFlowContract$Step.Home) step14).f92991a));
                    Function1 block22 = new Function1() { // from class: j1g.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            TravelExperiencesCheckoutFlowContract$Step attraction;
                            switch (i6) {
                                case 0:
                                    com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar9 = bVar8;
                                    y yVar3 = bVar9.f93001t;
                                    i outputData = (i) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof k1g.f) {
                                        bVar9.K2(((k1g.f) outputData).f180247a);
                                    } else if (outputData instanceof k1g.g) {
                                        yki.i iVar = bVar9.u;
                                        j2g.k kVar2 = ((k1g.g) outputData).f180248a;
                                        if (kVar2 instanceof k.a) {
                                            k.a aVar9 = (k.a) kVar2;
                                            TravelExperienceDatesSelection travelExperienceDatesSelection = aVar9.f170875a;
                                            TravelExperiencesSelectedLocation travelExperiencesSelectedLocation = aVar9.f170876b;
                                            if (travelExperiencesSelectedLocation != null) {
                                                String str = travelExperiencesSelectedLocation.f92776b;
                                                String value3 = travelExperiencesSelectedLocation.f92775a;
                                                TravelSearchLocationType travelSearchLocationType = travelExperiencesSelectedLocation.f92777c;
                                                if (travelSearchLocationType instanceof TravelSearchLocationType.Destination) {
                                                    if (aVar9.f170877c) {
                                                        Intrinsics.checkNotNullParameter(value3, "value");
                                                        attraction = new TravelExperiencesCheckoutFlowContract$Step.DestinationDiscovery(value3, travelExperienceDatesSelection);
                                                    } else {
                                                        Intrinsics.checkNotNullParameter(value3, "value");
                                                        attraction = new TravelExperiencesCheckoutFlowContract$Step.SearchResults.Destination(value3, str, travelExperienceDatesSelection);
                                                    }
                                                } else {
                                                    if (!Intrinsics.f(travelSearchLocationType, TravelSearchLocationType.Attraction.f92896a)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    Intrinsics.checkNotNullParameter(value3, "value");
                                                    attraction = new TravelExperiencesCheckoutFlowContract$Step.SearchResults.Attraction(value3, str, travelExperienceDatesSelection);
                                                }
                                                h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(attraction, null), true, null, false, 12);
                                            } else {
                                                h.t2(bVar9, iVar, TravelExperiencesHomeFlowContract$Step.Search.f92995a, true, null, false, 12);
                                            }
                                        } else if (kVar2 instanceof j2g.j) {
                                            j2g.j jVar = (j2g.j) kVar2;
                                            TravelExperienceDatesSelection travelExperienceDatesSelection2 = jVar.f170873b;
                                            if (travelExperienceDatesSelection2 == null) {
                                                travelExperienceDatesSelection2 = ((c) ((j2) yVar3.f22677a).getValue()).f170454a;
                                            }
                                            h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(null, travelExperienceDatesSelection2, jVar.f170872a), travelExperienceDatesSelection2), true, null, false, 12);
                                        } else if (kVar2 instanceof j2g.i) {
                                            TravelExperienceDatesSelection travelExperienceDatesSelection3 = ((j2g.i) kVar2).f170871a;
                                            bVar9.l2(new p(bVar9, travelExperienceDatesSelection3, null, 4), new yi5.b(26));
                                            bVar9.H2(yVar3, new e(travelExperienceDatesSelection3, 0));
                                        } else {
                                            if (!(kVar2 instanceof k.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.Home(TravelExperiencesTabsFlowContract$PagerItem.Bookings.f93003a), false, null, false, 12);
                                        }
                                    } else {
                                        if (!(outputData instanceof k1g.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        k1g.h hVar = (k1g.h) outputData;
                                        TravelExperienceDatesSelection travelExperienceDatesSelection4 = hVar.f180250b;
                                        if (travelExperienceDatesSelection4 == null) {
                                            travelExperienceDatesSelection4 = ((c) ((j2) yVar3.f22677a).getValue()).f170454a;
                                        }
                                        TravelExperienceDatesSelection travelExperienceDatesSelection5 = travelExperienceDatesSelection4;
                                        h.t2(bVar9, bVar9.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(hVar.f180251c, travelExperienceDatesSelection5, hVar.f180249a), travelExperienceDatesSelection5), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    v2g.e outputData2 = (v2g.e) obj5;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar10 = bVar8;
                                    h.t2(bVar10, bVar10.u, new TravelExperiencesHomeFlowContract$Step.BookingDetails(outputData2.f285735a, false), true, null, false, 12);
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar11 = bVar8;
                                    y yVar4 = bVar11.f93001t;
                                    k3g.k outputData3 = (k3g.k) obj5;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    if (outputData3 instanceof k3g.g) {
                                        h.t2(bVar11, bVar11.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(null, ((c) ((j2) yVar4.f22677a).getValue()).f170454a, ((k3g.g) outputData3).f180717a), null), true, null, false, 12);
                                    } else if (outputData3 instanceof k3g.f) {
                                        TravelSearchDestination travelSearchDestination = ((k3g.f) outputData3).f180716a;
                                        bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(travelSearchDestination.f92888a, travelSearchDestination.f92889b, new TravelSearchLocationType.Destination(travelSearchDestination.f92890c)), null, 5), new yi5.b(26));
                                    } else if (outputData3 instanceof k3g.j) {
                                        k3g.j jVar2 = (k3g.j) outputData3;
                                        bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(jVar2.f180722a, jVar2.f180724c, new TravelSearchLocationType.Destination(jVar2.f180723b)), null, 5), new yi5.b(26));
                                    } else {
                                        boolean z3 = outputData3 instanceof k3g.i;
                                        TravelSearchLocationType.Attraction attraction2 = TravelSearchLocationType.Attraction.f92896a;
                                        if (z3) {
                                            k3g.i iVar2 = (k3g.i) outputData3;
                                            bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(iVar2.f180719a, iVar2.f180720b, attraction2), null, 5), new yi5.b(26));
                                        } else if (outputData3 instanceof k3g.h) {
                                            h.t2(bVar11, bVar11.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.SearchResults.PreciseLocation(((k3g.h) outputData3).f180718a, ((c) ((j2) yVar4.f22677a).getValue()).f170454a, new TravelExperienceFiltersSelection(31, null)), null), true, null, false, 12);
                                        } else {
                                            if (!(outputData3 instanceof k3g.e)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            TravelSearchAttraction travelSearchAttraction = ((k3g.e) outputData3).f180715a;
                                            bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(travelSearchAttraction.f92885a, travelSearchAttraction.f92886b, attraction2), null, 5), new yi5.b(26));
                                        }
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    yja.b output = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    int i102 = f.f170459a[output.ordinal()];
                                    com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar12 = bVar8;
                                    if (i102 == 1 || i102 == 2) {
                                        bVar12.B2();
                                    } else {
                                        if (i102 != 3 && i102 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(bVar12, bVar12.u, bVar12.J2(bVar12.o), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    h1g.c outputData4 = (h1g.c) obj5;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar13 = bVar8;
                                    h.t2(bVar13, bVar13.u, new TravelExperiencesHomeFlowContract$Step.BookingDetails(outputData4.f148555a, true), false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    p1g.g outputData5 = (p1g.g) obj5;
                                    Intrinsics.checkNotNullParameter(outputData5, "outputData");
                                    if (outputData5 instanceof p1g.f) {
                                        bVar8.K2(outputData5);
                                    } else if (!(outputData5 instanceof g.b) && !(outputData5 instanceof g.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block22, "block");
                    travelExperiencesTabsFlow.H = block22;
                    travelExperiencesBookingDetailsScreen = travelExperiencesTabsFlow;
                } else if (step14 instanceof TravelExperiencesHomeFlowContract$Step.BookingDetails) {
                    TravelExperiencesHomeFlowContract$Step.BookingDetails bookingDetails = (TravelExperiencesHomeFlowContract$Step.BookingDetails) step14;
                    travelExperiencesBookingDetailsScreen = new TravelExperiencesBookingDetailsScreen(new TravelExperiencesBookingDetailsScreenContract$InputData(bookingDetails.f92987a, bookingDetails.f92988b));
                } else {
                    if (step14 instanceof TravelExperiencesHomeFlowContract$Step.CheckoutFlow) {
                        TravelExperiencesHomeFlowContract$Step.CheckoutFlow checkoutFlow = (TravelExperiencesHomeFlowContract$Step.CheckoutFlow) step14;
                        TravelExperiencesCheckoutFlowContract$Step travelExperiencesCheckoutFlowContract$Step = checkoutFlow.f92989a;
                        TravelExperienceDatesSelection travelExperienceDatesSelection = checkoutFlow.f92990b;
                        if (travelExperienceDatesSelection == null) {
                            travelExperienceDatesSelection = ((j1g.c) ((j2) yVar2.f22677a).getValue()).f170454a;
                        }
                        TravelExperiencesCheckoutFlow travelExperiencesCheckoutFlow = new TravelExperiencesCheckoutFlow(new TravelExperiencesCheckoutFlowContract$InputData(travelExperiencesCheckoutFlowContract$Step, travelExperienceDatesSelection));
                        Function1 function1 = new Function1() { // from class: j1g.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                TravelExperiencesCheckoutFlowContract$Step attraction;
                                switch (i3) {
                                    case 0:
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar9 = bVar8;
                                        y yVar3 = bVar9.f93001t;
                                        i outputData = (i) obj5;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        if (outputData instanceof k1g.f) {
                                            bVar9.K2(((k1g.f) outputData).f180247a);
                                        } else if (outputData instanceof k1g.g) {
                                            yki.i iVar = bVar9.u;
                                            j2g.k kVar2 = ((k1g.g) outputData).f180248a;
                                            if (kVar2 instanceof k.a) {
                                                k.a aVar9 = (k.a) kVar2;
                                                TravelExperienceDatesSelection travelExperienceDatesSelection2 = aVar9.f170875a;
                                                TravelExperiencesSelectedLocation travelExperiencesSelectedLocation = aVar9.f170876b;
                                                if (travelExperiencesSelectedLocation != null) {
                                                    String str = travelExperiencesSelectedLocation.f92776b;
                                                    String value3 = travelExperiencesSelectedLocation.f92775a;
                                                    TravelSearchLocationType travelSearchLocationType = travelExperiencesSelectedLocation.f92777c;
                                                    if (travelSearchLocationType instanceof TravelSearchLocationType.Destination) {
                                                        if (aVar9.f170877c) {
                                                            Intrinsics.checkNotNullParameter(value3, "value");
                                                            attraction = new TravelExperiencesCheckoutFlowContract$Step.DestinationDiscovery(value3, travelExperienceDatesSelection2);
                                                        } else {
                                                            Intrinsics.checkNotNullParameter(value3, "value");
                                                            attraction = new TravelExperiencesCheckoutFlowContract$Step.SearchResults.Destination(value3, str, travelExperienceDatesSelection2);
                                                        }
                                                    } else {
                                                        if (!Intrinsics.f(travelSearchLocationType, TravelSearchLocationType.Attraction.f92896a)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        Intrinsics.checkNotNullParameter(value3, "value");
                                                        attraction = new TravelExperiencesCheckoutFlowContract$Step.SearchResults.Attraction(value3, str, travelExperienceDatesSelection2);
                                                    }
                                                    h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(attraction, null), true, null, false, 12);
                                                } else {
                                                    h.t2(bVar9, iVar, TravelExperiencesHomeFlowContract$Step.Search.f92995a, true, null, false, 12);
                                                }
                                            } else if (kVar2 instanceof j2g.j) {
                                                j2g.j jVar = (j2g.j) kVar2;
                                                TravelExperienceDatesSelection travelExperienceDatesSelection22 = jVar.f170873b;
                                                if (travelExperienceDatesSelection22 == null) {
                                                    travelExperienceDatesSelection22 = ((c) ((j2) yVar3.f22677a).getValue()).f170454a;
                                                }
                                                h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(null, travelExperienceDatesSelection22, jVar.f170872a), travelExperienceDatesSelection22), true, null, false, 12);
                                            } else if (kVar2 instanceof j2g.i) {
                                                TravelExperienceDatesSelection travelExperienceDatesSelection3 = ((j2g.i) kVar2).f170871a;
                                                bVar9.l2(new p(bVar9, travelExperienceDatesSelection3, null, 4), new yi5.b(26));
                                                bVar9.H2(yVar3, new e(travelExperienceDatesSelection3, 0));
                                            } else {
                                                if (!(kVar2 instanceof k.b)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.Home(TravelExperiencesTabsFlowContract$PagerItem.Bookings.f93003a), false, null, false, 12);
                                            }
                                        } else {
                                            if (!(outputData instanceof k1g.h)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            k1g.h hVar = (k1g.h) outputData;
                                            TravelExperienceDatesSelection travelExperienceDatesSelection4 = hVar.f180250b;
                                            if (travelExperienceDatesSelection4 == null) {
                                                travelExperienceDatesSelection4 = ((c) ((j2) yVar3.f22677a).getValue()).f170454a;
                                            }
                                            TravelExperienceDatesSelection travelExperienceDatesSelection5 = travelExperienceDatesSelection4;
                                            h.t2(bVar9, bVar9.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(hVar.f180251c, travelExperienceDatesSelection5, hVar.f180249a), travelExperienceDatesSelection5), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        v2g.e outputData2 = (v2g.e) obj5;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar10 = bVar8;
                                        h.t2(bVar10, bVar10.u, new TravelExperiencesHomeFlowContract$Step.BookingDetails(outputData2.f285735a, false), true, null, false, 12);
                                        return Unit.f186387a;
                                    case 2:
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar11 = bVar8;
                                        y yVar4 = bVar11.f93001t;
                                        k3g.k outputData3 = (k3g.k) obj5;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        if (outputData3 instanceof k3g.g) {
                                            h.t2(bVar11, bVar11.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(null, ((c) ((j2) yVar4.f22677a).getValue()).f170454a, ((k3g.g) outputData3).f180717a), null), true, null, false, 12);
                                        } else if (outputData3 instanceof k3g.f) {
                                            TravelSearchDestination travelSearchDestination = ((k3g.f) outputData3).f180716a;
                                            bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(travelSearchDestination.f92888a, travelSearchDestination.f92889b, new TravelSearchLocationType.Destination(travelSearchDestination.f92890c)), null, 5), new yi5.b(26));
                                        } else if (outputData3 instanceof k3g.j) {
                                            k3g.j jVar2 = (k3g.j) outputData3;
                                            bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(jVar2.f180722a, jVar2.f180724c, new TravelSearchLocationType.Destination(jVar2.f180723b)), null, 5), new yi5.b(26));
                                        } else {
                                            boolean z3 = outputData3 instanceof k3g.i;
                                            TravelSearchLocationType.Attraction attraction2 = TravelSearchLocationType.Attraction.f92896a;
                                            if (z3) {
                                                k3g.i iVar2 = (k3g.i) outputData3;
                                                bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(iVar2.f180719a, iVar2.f180720b, attraction2), null, 5), new yi5.b(26));
                                            } else if (outputData3 instanceof k3g.h) {
                                                h.t2(bVar11, bVar11.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.SearchResults.PreciseLocation(((k3g.h) outputData3).f180718a, ((c) ((j2) yVar4.f22677a).getValue()).f170454a, new TravelExperienceFiltersSelection(31, null)), null), true, null, false, 12);
                                            } else {
                                                if (!(outputData3 instanceof k3g.e)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                TravelSearchAttraction travelSearchAttraction = ((k3g.e) outputData3).f180715a;
                                                bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(travelSearchAttraction.f92885a, travelSearchAttraction.f92886b, attraction2), null, 5), new yi5.b(26));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        yja.b output = (yja.b) obj5;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        int i102 = f.f170459a[output.ordinal()];
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar12 = bVar8;
                                        if (i102 == 1 || i102 == 2) {
                                            bVar12.B2();
                                        } else {
                                            if (i102 != 3 && i102 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(bVar12, bVar12.u, bVar12.J2(bVar12.o), false, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    case 4:
                                        h1g.c outputData4 = (h1g.c) obj5;
                                        Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar13 = bVar8;
                                        h.t2(bVar13, bVar13.u, new TravelExperiencesHomeFlowContract$Step.BookingDetails(outputData4.f148555a, true), false, null, false, 12);
                                        return Unit.f186387a;
                                    default:
                                        p1g.g outputData5 = (p1g.g) obj5;
                                        Intrinsics.checkNotNullParameter(outputData5, "outputData");
                                        if (outputData5 instanceof p1g.f) {
                                            bVar8.K2(outputData5);
                                        } else if (!(outputData5 instanceof g.b) && !(outputData5 instanceof g.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(function1, "<set-?>");
                        travelExperiencesCheckoutFlow.J = function1;
                        return travelExperiencesCheckoutFlow;
                    }
                    if (step14 instanceof TravelExperiencesHomeFlowContract$Step.Search) {
                        TravelExperiencesSearchScreen travelExperiencesSearchScreen = new TravelExperiencesSearchScreen(new TravelExperiencesSearchScreenContract$InputData(((j1g.c) ((j2) yVar2.f22677a).getValue()).f170454a));
                        final int i102 = 2;
                        Function1 function12 = new Function1() { // from class: j1g.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                TravelExperiencesCheckoutFlowContract$Step attraction;
                                switch (i102) {
                                    case 0:
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar9 = bVar8;
                                        y yVar3 = bVar9.f93001t;
                                        i outputData = (i) obj5;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        if (outputData instanceof k1g.f) {
                                            bVar9.K2(((k1g.f) outputData).f180247a);
                                        } else if (outputData instanceof k1g.g) {
                                            yki.i iVar = bVar9.u;
                                            j2g.k kVar2 = ((k1g.g) outputData).f180248a;
                                            if (kVar2 instanceof k.a) {
                                                k.a aVar9 = (k.a) kVar2;
                                                TravelExperienceDatesSelection travelExperienceDatesSelection2 = aVar9.f170875a;
                                                TravelExperiencesSelectedLocation travelExperiencesSelectedLocation = aVar9.f170876b;
                                                if (travelExperiencesSelectedLocation != null) {
                                                    String str = travelExperiencesSelectedLocation.f92776b;
                                                    String value3 = travelExperiencesSelectedLocation.f92775a;
                                                    TravelSearchLocationType travelSearchLocationType = travelExperiencesSelectedLocation.f92777c;
                                                    if (travelSearchLocationType instanceof TravelSearchLocationType.Destination) {
                                                        if (aVar9.f170877c) {
                                                            Intrinsics.checkNotNullParameter(value3, "value");
                                                            attraction = new TravelExperiencesCheckoutFlowContract$Step.DestinationDiscovery(value3, travelExperienceDatesSelection2);
                                                        } else {
                                                            Intrinsics.checkNotNullParameter(value3, "value");
                                                            attraction = new TravelExperiencesCheckoutFlowContract$Step.SearchResults.Destination(value3, str, travelExperienceDatesSelection2);
                                                        }
                                                    } else {
                                                        if (!Intrinsics.f(travelSearchLocationType, TravelSearchLocationType.Attraction.f92896a)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        Intrinsics.checkNotNullParameter(value3, "value");
                                                        attraction = new TravelExperiencesCheckoutFlowContract$Step.SearchResults.Attraction(value3, str, travelExperienceDatesSelection2);
                                                    }
                                                    h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(attraction, null), true, null, false, 12);
                                                } else {
                                                    h.t2(bVar9, iVar, TravelExperiencesHomeFlowContract$Step.Search.f92995a, true, null, false, 12);
                                                }
                                            } else if (kVar2 instanceof j2g.j) {
                                                j2g.j jVar = (j2g.j) kVar2;
                                                TravelExperienceDatesSelection travelExperienceDatesSelection22 = jVar.f170873b;
                                                if (travelExperienceDatesSelection22 == null) {
                                                    travelExperienceDatesSelection22 = ((c) ((j2) yVar3.f22677a).getValue()).f170454a;
                                                }
                                                h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(null, travelExperienceDatesSelection22, jVar.f170872a), travelExperienceDatesSelection22), true, null, false, 12);
                                            } else if (kVar2 instanceof j2g.i) {
                                                TravelExperienceDatesSelection travelExperienceDatesSelection3 = ((j2g.i) kVar2).f170871a;
                                                bVar9.l2(new p(bVar9, travelExperienceDatesSelection3, null, 4), new yi5.b(26));
                                                bVar9.H2(yVar3, new e(travelExperienceDatesSelection3, 0));
                                            } else {
                                                if (!(kVar2 instanceof k.b)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.Home(TravelExperiencesTabsFlowContract$PagerItem.Bookings.f93003a), false, null, false, 12);
                                            }
                                        } else {
                                            if (!(outputData instanceof k1g.h)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            k1g.h hVar = (k1g.h) outputData;
                                            TravelExperienceDatesSelection travelExperienceDatesSelection4 = hVar.f180250b;
                                            if (travelExperienceDatesSelection4 == null) {
                                                travelExperienceDatesSelection4 = ((c) ((j2) yVar3.f22677a).getValue()).f170454a;
                                            }
                                            TravelExperienceDatesSelection travelExperienceDatesSelection5 = travelExperienceDatesSelection4;
                                            h.t2(bVar9, bVar9.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(hVar.f180251c, travelExperienceDatesSelection5, hVar.f180249a), travelExperienceDatesSelection5), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        v2g.e outputData2 = (v2g.e) obj5;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar10 = bVar8;
                                        h.t2(bVar10, bVar10.u, new TravelExperiencesHomeFlowContract$Step.BookingDetails(outputData2.f285735a, false), true, null, false, 12);
                                        return Unit.f186387a;
                                    case 2:
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar11 = bVar8;
                                        y yVar4 = bVar11.f93001t;
                                        k3g.k outputData3 = (k3g.k) obj5;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        if (outputData3 instanceof k3g.g) {
                                            h.t2(bVar11, bVar11.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(null, ((c) ((j2) yVar4.f22677a).getValue()).f170454a, ((k3g.g) outputData3).f180717a), null), true, null, false, 12);
                                        } else if (outputData3 instanceof k3g.f) {
                                            TravelSearchDestination travelSearchDestination = ((k3g.f) outputData3).f180716a;
                                            bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(travelSearchDestination.f92888a, travelSearchDestination.f92889b, new TravelSearchLocationType.Destination(travelSearchDestination.f92890c)), null, 5), new yi5.b(26));
                                        } else if (outputData3 instanceof k3g.j) {
                                            k3g.j jVar2 = (k3g.j) outputData3;
                                            bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(jVar2.f180722a, jVar2.f180724c, new TravelSearchLocationType.Destination(jVar2.f180723b)), null, 5), new yi5.b(26));
                                        } else {
                                            boolean z3 = outputData3 instanceof k3g.i;
                                            TravelSearchLocationType.Attraction attraction2 = TravelSearchLocationType.Attraction.f92896a;
                                            if (z3) {
                                                k3g.i iVar2 = (k3g.i) outputData3;
                                                bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(iVar2.f180719a, iVar2.f180720b, attraction2), null, 5), new yi5.b(26));
                                            } else if (outputData3 instanceof k3g.h) {
                                                h.t2(bVar11, bVar11.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.SearchResults.PreciseLocation(((k3g.h) outputData3).f180718a, ((c) ((j2) yVar4.f22677a).getValue()).f170454a, new TravelExperienceFiltersSelection(31, null)), null), true, null, false, 12);
                                            } else {
                                                if (!(outputData3 instanceof k3g.e)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                TravelSearchAttraction travelSearchAttraction = ((k3g.e) outputData3).f180715a;
                                                bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(travelSearchAttraction.f92885a, travelSearchAttraction.f92886b, attraction2), null, 5), new yi5.b(26));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        yja.b output = (yja.b) obj5;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        int i1022 = f.f170459a[output.ordinal()];
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar12 = bVar8;
                                        if (i1022 == 1 || i1022 == 2) {
                                            bVar12.B2();
                                        } else {
                                            if (i1022 != 3 && i1022 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(bVar12, bVar12.u, bVar12.J2(bVar12.o), false, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    case 4:
                                        h1g.c outputData4 = (h1g.c) obj5;
                                        Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar13 = bVar8;
                                        h.t2(bVar13, bVar13.u, new TravelExperiencesHomeFlowContract$Step.BookingDetails(outputData4.f148555a, true), false, null, false, 12);
                                        return Unit.f186387a;
                                    default:
                                        p1g.g outputData5 = (p1g.g) obj5;
                                        Intrinsics.checkNotNullParameter(outputData5, "outputData");
                                        if (outputData5 instanceof p1g.f) {
                                            bVar8.K2(outputData5);
                                        } else if (!(outputData5 instanceof g.b) && !(outputData5 instanceof g.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(function12, "<set-?>");
                        travelExperiencesSearchScreen.H = function12;
                        return travelExperiencesSearchScreen;
                    }
                    if (step14 instanceof TravelExperiencesHomeFlowContract$Step.PastAndCancelledBookings) {
                        TravelExperiencesPastAndCancelledScreen travelExperiencesPastAndCancelledScreen = new TravelExperiencesPastAndCancelledScreen(new TravelExperiencesPastAndCancelledScreenContract$InputData(u.c(hxf.e.EXPERIENCE)));
                        final int i103 = 1;
                        Function1 block23 = new Function1() { // from class: j1g.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                TravelExperiencesCheckoutFlowContract$Step attraction;
                                switch (i103) {
                                    case 0:
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar9 = bVar8;
                                        y yVar3 = bVar9.f93001t;
                                        i outputData = (i) obj5;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        if (outputData instanceof k1g.f) {
                                            bVar9.K2(((k1g.f) outputData).f180247a);
                                        } else if (outputData instanceof k1g.g) {
                                            yki.i iVar = bVar9.u;
                                            j2g.k kVar2 = ((k1g.g) outputData).f180248a;
                                            if (kVar2 instanceof k.a) {
                                                k.a aVar9 = (k.a) kVar2;
                                                TravelExperienceDatesSelection travelExperienceDatesSelection2 = aVar9.f170875a;
                                                TravelExperiencesSelectedLocation travelExperiencesSelectedLocation = aVar9.f170876b;
                                                if (travelExperiencesSelectedLocation != null) {
                                                    String str = travelExperiencesSelectedLocation.f92776b;
                                                    String value3 = travelExperiencesSelectedLocation.f92775a;
                                                    TravelSearchLocationType travelSearchLocationType = travelExperiencesSelectedLocation.f92777c;
                                                    if (travelSearchLocationType instanceof TravelSearchLocationType.Destination) {
                                                        if (aVar9.f170877c) {
                                                            Intrinsics.checkNotNullParameter(value3, "value");
                                                            attraction = new TravelExperiencesCheckoutFlowContract$Step.DestinationDiscovery(value3, travelExperienceDatesSelection2);
                                                        } else {
                                                            Intrinsics.checkNotNullParameter(value3, "value");
                                                            attraction = new TravelExperiencesCheckoutFlowContract$Step.SearchResults.Destination(value3, str, travelExperienceDatesSelection2);
                                                        }
                                                    } else {
                                                        if (!Intrinsics.f(travelSearchLocationType, TravelSearchLocationType.Attraction.f92896a)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        Intrinsics.checkNotNullParameter(value3, "value");
                                                        attraction = new TravelExperiencesCheckoutFlowContract$Step.SearchResults.Attraction(value3, str, travelExperienceDatesSelection2);
                                                    }
                                                    h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(attraction, null), true, null, false, 12);
                                                } else {
                                                    h.t2(bVar9, iVar, TravelExperiencesHomeFlowContract$Step.Search.f92995a, true, null, false, 12);
                                                }
                                            } else if (kVar2 instanceof j2g.j) {
                                                j2g.j jVar = (j2g.j) kVar2;
                                                TravelExperienceDatesSelection travelExperienceDatesSelection22 = jVar.f170873b;
                                                if (travelExperienceDatesSelection22 == null) {
                                                    travelExperienceDatesSelection22 = ((c) ((j2) yVar3.f22677a).getValue()).f170454a;
                                                }
                                                h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(null, travelExperienceDatesSelection22, jVar.f170872a), travelExperienceDatesSelection22), true, null, false, 12);
                                            } else if (kVar2 instanceof j2g.i) {
                                                TravelExperienceDatesSelection travelExperienceDatesSelection3 = ((j2g.i) kVar2).f170871a;
                                                bVar9.l2(new p(bVar9, travelExperienceDatesSelection3, null, 4), new yi5.b(26));
                                                bVar9.H2(yVar3, new e(travelExperienceDatesSelection3, 0));
                                            } else {
                                                if (!(kVar2 instanceof k.b)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.Home(TravelExperiencesTabsFlowContract$PagerItem.Bookings.f93003a), false, null, false, 12);
                                            }
                                        } else {
                                            if (!(outputData instanceof k1g.h)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            k1g.h hVar = (k1g.h) outputData;
                                            TravelExperienceDatesSelection travelExperienceDatesSelection4 = hVar.f180250b;
                                            if (travelExperienceDatesSelection4 == null) {
                                                travelExperienceDatesSelection4 = ((c) ((j2) yVar3.f22677a).getValue()).f170454a;
                                            }
                                            TravelExperienceDatesSelection travelExperienceDatesSelection5 = travelExperienceDatesSelection4;
                                            h.t2(bVar9, bVar9.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(hVar.f180251c, travelExperienceDatesSelection5, hVar.f180249a), travelExperienceDatesSelection5), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        v2g.e outputData2 = (v2g.e) obj5;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar10 = bVar8;
                                        h.t2(bVar10, bVar10.u, new TravelExperiencesHomeFlowContract$Step.BookingDetails(outputData2.f285735a, false), true, null, false, 12);
                                        return Unit.f186387a;
                                    case 2:
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar11 = bVar8;
                                        y yVar4 = bVar11.f93001t;
                                        k3g.k outputData3 = (k3g.k) obj5;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        if (outputData3 instanceof k3g.g) {
                                            h.t2(bVar11, bVar11.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(null, ((c) ((j2) yVar4.f22677a).getValue()).f170454a, ((k3g.g) outputData3).f180717a), null), true, null, false, 12);
                                        } else if (outputData3 instanceof k3g.f) {
                                            TravelSearchDestination travelSearchDestination = ((k3g.f) outputData3).f180716a;
                                            bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(travelSearchDestination.f92888a, travelSearchDestination.f92889b, new TravelSearchLocationType.Destination(travelSearchDestination.f92890c)), null, 5), new yi5.b(26));
                                        } else if (outputData3 instanceof k3g.j) {
                                            k3g.j jVar2 = (k3g.j) outputData3;
                                            bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(jVar2.f180722a, jVar2.f180724c, new TravelSearchLocationType.Destination(jVar2.f180723b)), null, 5), new yi5.b(26));
                                        } else {
                                            boolean z3 = outputData3 instanceof k3g.i;
                                            TravelSearchLocationType.Attraction attraction2 = TravelSearchLocationType.Attraction.f92896a;
                                            if (z3) {
                                                k3g.i iVar2 = (k3g.i) outputData3;
                                                bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(iVar2.f180719a, iVar2.f180720b, attraction2), null, 5), new yi5.b(26));
                                            } else if (outputData3 instanceof k3g.h) {
                                                h.t2(bVar11, bVar11.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.SearchResults.PreciseLocation(((k3g.h) outputData3).f180718a, ((c) ((j2) yVar4.f22677a).getValue()).f170454a, new TravelExperienceFiltersSelection(31, null)), null), true, null, false, 12);
                                            } else {
                                                if (!(outputData3 instanceof k3g.e)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                TravelSearchAttraction travelSearchAttraction = ((k3g.e) outputData3).f180715a;
                                                bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(travelSearchAttraction.f92885a, travelSearchAttraction.f92886b, attraction2), null, 5), new yi5.b(26));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        yja.b output = (yja.b) obj5;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        int i1022 = f.f170459a[output.ordinal()];
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar12 = bVar8;
                                        if (i1022 == 1 || i1022 == 2) {
                                            bVar12.B2();
                                        } else {
                                            if (i1022 != 3 && i1022 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(bVar12, bVar12.u, bVar12.J2(bVar12.o), false, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    case 4:
                                        h1g.c outputData4 = (h1g.c) obj5;
                                        Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar13 = bVar8;
                                        h.t2(bVar13, bVar13.u, new TravelExperiencesHomeFlowContract$Step.BookingDetails(outputData4.f148555a, true), false, null, false, 12);
                                        return Unit.f186387a;
                                    default:
                                        p1g.g outputData5 = (p1g.g) obj5;
                                        Intrinsics.checkNotNullParameter(outputData5, "outputData");
                                        if (outputData5 instanceof p1g.f) {
                                            bVar8.K2(outputData5);
                                        } else if (!(outputData5 instanceof g.b) && !(outputData5 instanceof g.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block23, "block");
                        travelExperiencesPastAndCancelledScreen.H = block23;
                        return travelExperiencesPastAndCancelledScreen;
                    }
                    if (step14 instanceof TravelExperiencesHomeFlowContract$Step.ActiveBookings) {
                        TravelExperiencesBookingsScreen travelExperiencesBookingsScreen = new TravelExperiencesBookingsScreen(new TravelExperiencesBookingsScreenContract$InputData(true));
                        final int i104 = 5;
                        Function1 block24 = new Function1() { // from class: j1g.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                TravelExperiencesCheckoutFlowContract$Step attraction;
                                switch (i104) {
                                    case 0:
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar9 = bVar8;
                                        y yVar3 = bVar9.f93001t;
                                        i outputData = (i) obj5;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        if (outputData instanceof k1g.f) {
                                            bVar9.K2(((k1g.f) outputData).f180247a);
                                        } else if (outputData instanceof k1g.g) {
                                            yki.i iVar = bVar9.u;
                                            j2g.k kVar2 = ((k1g.g) outputData).f180248a;
                                            if (kVar2 instanceof k.a) {
                                                k.a aVar9 = (k.a) kVar2;
                                                TravelExperienceDatesSelection travelExperienceDatesSelection2 = aVar9.f170875a;
                                                TravelExperiencesSelectedLocation travelExperiencesSelectedLocation = aVar9.f170876b;
                                                if (travelExperiencesSelectedLocation != null) {
                                                    String str = travelExperiencesSelectedLocation.f92776b;
                                                    String value3 = travelExperiencesSelectedLocation.f92775a;
                                                    TravelSearchLocationType travelSearchLocationType = travelExperiencesSelectedLocation.f92777c;
                                                    if (travelSearchLocationType instanceof TravelSearchLocationType.Destination) {
                                                        if (aVar9.f170877c) {
                                                            Intrinsics.checkNotNullParameter(value3, "value");
                                                            attraction = new TravelExperiencesCheckoutFlowContract$Step.DestinationDiscovery(value3, travelExperienceDatesSelection2);
                                                        } else {
                                                            Intrinsics.checkNotNullParameter(value3, "value");
                                                            attraction = new TravelExperiencesCheckoutFlowContract$Step.SearchResults.Destination(value3, str, travelExperienceDatesSelection2);
                                                        }
                                                    } else {
                                                        if (!Intrinsics.f(travelSearchLocationType, TravelSearchLocationType.Attraction.f92896a)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        Intrinsics.checkNotNullParameter(value3, "value");
                                                        attraction = new TravelExperiencesCheckoutFlowContract$Step.SearchResults.Attraction(value3, str, travelExperienceDatesSelection2);
                                                    }
                                                    h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(attraction, null), true, null, false, 12);
                                                } else {
                                                    h.t2(bVar9, iVar, TravelExperiencesHomeFlowContract$Step.Search.f92995a, true, null, false, 12);
                                                }
                                            } else if (kVar2 instanceof j2g.j) {
                                                j2g.j jVar = (j2g.j) kVar2;
                                                TravelExperienceDatesSelection travelExperienceDatesSelection22 = jVar.f170873b;
                                                if (travelExperienceDatesSelection22 == null) {
                                                    travelExperienceDatesSelection22 = ((c) ((j2) yVar3.f22677a).getValue()).f170454a;
                                                }
                                                h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(null, travelExperienceDatesSelection22, jVar.f170872a), travelExperienceDatesSelection22), true, null, false, 12);
                                            } else if (kVar2 instanceof j2g.i) {
                                                TravelExperienceDatesSelection travelExperienceDatesSelection3 = ((j2g.i) kVar2).f170871a;
                                                bVar9.l2(new p(bVar9, travelExperienceDatesSelection3, null, 4), new yi5.b(26));
                                                bVar9.H2(yVar3, new e(travelExperienceDatesSelection3, 0));
                                            } else {
                                                if (!(kVar2 instanceof k.b)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                h.t2(bVar9, iVar, new TravelExperiencesHomeFlowContract$Step.Home(TravelExperiencesTabsFlowContract$PagerItem.Bookings.f93003a), false, null, false, 12);
                                            }
                                        } else {
                                            if (!(outputData instanceof k1g.h)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            k1g.h hVar = (k1g.h) outputData;
                                            TravelExperienceDatesSelection travelExperienceDatesSelection4 = hVar.f180250b;
                                            if (travelExperienceDatesSelection4 == null) {
                                                travelExperienceDatesSelection4 = ((c) ((j2) yVar3.f22677a).getValue()).f170454a;
                                            }
                                            TravelExperienceDatesSelection travelExperienceDatesSelection5 = travelExperienceDatesSelection4;
                                            h.t2(bVar9, bVar9.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(hVar.f180251c, travelExperienceDatesSelection5, hVar.f180249a), travelExperienceDatesSelection5), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        v2g.e outputData2 = (v2g.e) obj5;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar10 = bVar8;
                                        h.t2(bVar10, bVar10.u, new TravelExperiencesHomeFlowContract$Step.BookingDetails(outputData2.f285735a, false), true, null, false, 12);
                                        return Unit.f186387a;
                                    case 2:
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar11 = bVar8;
                                        y yVar4 = bVar11.f93001t;
                                        k3g.k outputData3 = (k3g.k) obj5;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        if (outputData3 instanceof k3g.g) {
                                            h.t2(bVar11, bVar11.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(null, ((c) ((j2) yVar4.f22677a).getValue()).f170454a, ((k3g.g) outputData3).f180717a), null), true, null, false, 12);
                                        } else if (outputData3 instanceof k3g.f) {
                                            TravelSearchDestination travelSearchDestination = ((k3g.f) outputData3).f180716a;
                                            bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(travelSearchDestination.f92888a, travelSearchDestination.f92889b, new TravelSearchLocationType.Destination(travelSearchDestination.f92890c)), null, 5), new yi5.b(26));
                                        } else if (outputData3 instanceof k3g.j) {
                                            k3g.j jVar2 = (k3g.j) outputData3;
                                            bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(jVar2.f180722a, jVar2.f180724c, new TravelSearchLocationType.Destination(jVar2.f180723b)), null, 5), new yi5.b(26));
                                        } else {
                                            boolean z3 = outputData3 instanceof k3g.i;
                                            TravelSearchLocationType.Attraction attraction2 = TravelSearchLocationType.Attraction.f92896a;
                                            if (z3) {
                                                k3g.i iVar2 = (k3g.i) outputData3;
                                                bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(iVar2.f180719a, iVar2.f180720b, attraction2), null, 5), new yi5.b(26));
                                            } else if (outputData3 instanceof k3g.h) {
                                                h.t2(bVar11, bVar11.u, new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.SearchResults.PreciseLocation(((k3g.h) outputData3).f180718a, ((c) ((j2) yVar4.f22677a).getValue()).f170454a, new TravelExperienceFiltersSelection(31, null)), null), true, null, false, 12);
                                            } else {
                                                if (!(outputData3 instanceof k3g.e)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                TravelSearchAttraction travelSearchAttraction = ((k3g.e) outputData3).f180715a;
                                                bVar11.l2(new p(bVar11, new TravelExperiencesSelectedLocation(travelSearchAttraction.f92885a, travelSearchAttraction.f92886b, attraction2), null, 5), new yi5.b(26));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        yja.b output = (yja.b) obj5;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        int i1022 = f.f170459a[output.ordinal()];
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar12 = bVar8;
                                        if (i1022 == 1 || i1022 == 2) {
                                            bVar12.B2();
                                        } else {
                                            if (i1022 != 3 && i1022 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(bVar12, bVar12.u, bVar12.J2(bVar12.o), false, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    case 4:
                                        h1g.c outputData4 = (h1g.c) obj5;
                                        Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                        com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar13 = bVar8;
                                        h.t2(bVar13, bVar13.u, new TravelExperiencesHomeFlowContract$Step.BookingDetails(outputData4.f148555a, true), false, null, false, 12);
                                        return Unit.f186387a;
                                    default:
                                        p1g.g outputData5 = (p1g.g) obj5;
                                        Intrinsics.checkNotNullParameter(outputData5, "outputData");
                                        if (outputData5 instanceof p1g.f) {
                                            bVar8.K2(outputData5);
                                        } else if (!(outputData5 instanceof g.b) && !(outputData5 instanceof g.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block24, "block");
                        travelExperiencesBookingsScreen.H = block24;
                        return travelExperiencesBookingsScreen;
                    }
                    if (!(step14 instanceof TravelExperiencesHomeFlowContract$Step.OptIn)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ViewController viewControllerE18 = bVar8.e1(new hub.a(new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.Stays.f84006a, false, 6)));
                    t block25 = new t(bVar8, (TravelExperiencesHomeFlowContract$Step.OptIn) step14, 23);
                    Intrinsics.checkNotNullParameter(block25, "block");
                    viewControllerE18.H = block25;
                    travelExperiencesBookingDetailsScreen = viewControllerE18;
                }
                return travelExperiencesBookingDetailsScreen;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f162578a = i;
        this.f162579b = obj2;
    }
}
