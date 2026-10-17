package mnl;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.api.models.BiometricVerificationFeatures;
import com.revolut.biometric_verification.impl.ui.step.selfie_search.flow.BiometricVerificationSelfieSearchFlowContract$Step;
import com.revolut.camerakit.client.api.models.AnimationType;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.CameraKitUiSettings;
import com.revolut.camerakit.client.api.models.CaptureMode;
import com.revolut.camerakit.client.api.models.HintMessage;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlow;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlowContract$FlowType;
import com.revolut.camerakit.ui.models.Mask;
import com.revolut.camerakit.validators.config.FaceInFrameValidatorConfig;
import com.revolut.camerakit.validators.config.FaceQualityValidatorConfig;
import com.revolut.camerakit.validators.config.ValidatorConfig;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_management.impl.cardlimit.flow.CardLimitFlowContract$Step;
import com.revolut.feature.card_management.impl.cardlimit.screens.overview.CardLimitOverviewScreen;
import com.revolut.feature.card_management.impl.cardlimit.screens.overview.CardLimitOverviewScreenContract$InputData;
import com.revolut.feature.card_management.impl.cardlimit.screens.setlimit.CardSetLimitScreen;
import com.revolut.feature.card_management.impl.cardlimit.screens.setlimit.CardSetLimitScreenContract$InputData;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.credit.card.api.navigation.CreditCardDecreaseLimitDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardLimitCapDestination;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow.AdditionalCardsCardholderDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow.AdditionalCardsCardholderDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.additional_cards.flow.AdditionalCardsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.additional_cards.flow.AdditionalCardsFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.additional_cards.management.AdditionalCardsManagementScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.management.AdditionalCardsManagementScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreen;
import com.revolut.feature.credit.card.impl.ui.limit_hub.flow.CreditCardLimitHubFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.limit_hub.flow.CreditCardLimitHubFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_history.CreditCardLimitHistoryController;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_history.CreditCardLimitHistoryControllerContract$InputData;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_increase_preference.CreditCardLimitIncreasePreferenceContract$InputData;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_increase_preference.CreditCardLimitIncreasePreferenceController;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_settings.CreditCardLimitSettingsController;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_settings.CreditCardLimitSettingsControllerContract$InputData;
import com.revolut.feature.credit.card.impl.ui.limit_hub.manage.CreditCardLimitHubManageScreen;
import com.revolut.feature.credit.card.impl.ui.limit_hub.manage.CreditCardLimitHubManageScreenContract$InputData;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.CryptoFeeBreakdownDialogControllerContract$Step;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlowContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.RetailCryptoTradeFlowContract$Step;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoTradeScreen;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.feature.freelancer.impl.ui.invoice.create.flow.InvoiceCreateFlow;
import com.revolut.feature.freelancer.impl.ui.invoice.create.flow.InvoiceCreateFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.details.flow.InvoiceDetailsFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message.InvoiceEmailMessageScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.general_settings.InvoiceGeneralSettingsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.InvoicePaymentMethodsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.InvoicePaymentMethodsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.reminders.InvoiceRemindersScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.flow.InvoiceSettingsFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.InvoiceRecurringSettingsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.InvoiceScheduleSettingsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.screen.InvoiceSettingsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.flow.InvoiceTemplatesFlow;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.flow.InvoiceTemplatesFlowContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.DriverNumberInputScreenContract$ModalStep;
import com.revolut.feature.kyc.impl.external.ExternalKycPromptConfiguration;
import com.revolut.feature.kyc.impl.external.web.flow.ExternalWebKycProviderFlowContract$InputData;
import com.revolut.feature.kyc.impl.external.web.flow.ExternalWebKycProviderFlowContract$Step;
import com.revolut.feature.kyc.impl.screens.chrome_portal.ChromePortalScreen;
import com.revolut.feature.kyc.impl.screens.chrome_portal.ChromePortalScreenContract$InputData;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_chat.flow.GroupChatFlow;
import com.revolut.feature.payments.groups.impl.ui_chat.flow.GroupChatFlowContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.trusted.GroupChatTrustedScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.trusted.GroupChatTrustedScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreen;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlowContract$Step;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData;
import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreen;
import com.revolut.feature.push_to_card.impl.ui.flow.PushToCardTransferFlowContract$Step;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreen;
import com.revolut.feature.retail.savings.impl.documents.presentation.documents.ProductDocumentsContract$InputData;
import com.revolut.feature.retail.savings.impl.documents.presentation.documents.ProductDocumentsScreen;
import com.revolut.feature.retail.savings.impl.ui.add_money.SavingsAddMoneyFlowContract$Step;
import com.revolut.feature.retail.savings.impl.ui.product_migration.ProductMigrationScreen;
import com.revolut.feature.retail.savings.impl.ui.product_migration.ProductMigrationScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.product_migration.flow.ProductMigrationFlowContract$Step;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.EditTrustedLocationControllerContract$Step;
import com.revolut.feature.shared.branding.api.destination.BrandingParams;
import com.revolut.feature.shared.branding.api.destination.BrandingSharedDescriptor$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.country_picker.TripsCountryPickerContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.country_picker.TripsCountryPickerController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.date_picker.TripsDatePickerContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.date_picker.TripsDatePickerController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.edit_options.TripsEditOptionsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.edit_options.TripsEditOptionsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.TripsFlowContract$Step;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.remove_confirmation.TripsRemoveConfirmationContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.remove_confirmation.TripsRemoveConfirmationController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.share.TripsShareContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.share.TripsShareController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListContract$Mode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.date_picker.DatePickerController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$DateRange;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$SelectionMode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionController;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.models.UserSpecificRule;
import com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.AddDeclarationFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.AddDeclarationFlowContract$Step;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlow;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$UseCase;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.AccountClosureFeatureRatingScreenContract$Step;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating_feedback.AccountClosureFeatureRatingFeedbackScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating_feedback.AccountClosureFeatureRatingFeedbackScreenContract$InputData;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionConfiguration;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents.AlternativeDocumentsController;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents.AlternativeDocumentsControllerContract$InputData;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionControllerContract$InputData;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionControllerContract$ModalStep;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.AddKeyStatsItemFlowContract$Step;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.TechnicalInsightsControllerContract$ModalStep;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups.AddKeyStatsViewGroupsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups.AddKeyStatsViewGroupsScreenContract$Input;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_items.AddKeyStatsViewItemsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_items.AddKeyStatsViewItemsScreenContract$Input;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.CitizenshipGroup;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import com.revolut.sso.impl.domain.models.AuthResult;
import com.revolut.sso.impl.ui.auth_cancellation.AuthCancellationScreen;
import com.revolut.sso.impl.ui.auth_rejected.AuthenticationRejectedFlow;
import com.revolut.sso.impl.ui.auth_rejected.AuthenticationRejectedFlowContract$InputData;
import com.revolut.sso.impl.ui.manual_review.ManualReviewFlowContract$Step;
import com.revolut.tracking.v3.CameraCaptureContext;
import cqa.e;
import grl.f1;
import grl.j1;
import grl.k9;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kl.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import li8.n;
import mhd.p0;
import mk5.s;
import ml3.y;
import mll.c0;
import mx0.a7;
import mx0.v9;
import nn3.z;
import oki.h;
import op0.q;
import ox6.k;
import rt4.f;
import rt4.g;
import s7a.a0;
import s7a.x;
import til.m;
import tt4.i;
import tt4.j;
import vkm.j2;
import yki.l;
import zhm.a1;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f207521b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f207520a = i;
        this.f207521b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.a aVar = (com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.a) this.f207521b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        EditTrustedLocationControllerContract$Step step = (EditTrustedLocationControllerContract$Step) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, EditTrustedLocationControllerContract$Step.RemoveLastTrustedLocation.f85651a)) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.f85652p.getClass();
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.security_hub_street_mode_trusted_locations_list_action_deletion_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.security_hub_street_mode_trusted_locations_list_action_deletion_confirmation_subtitle, null, null, 14), null, null, false, 28);
        aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.security_hub_street_mode_trusted_locations_list_action_deletion_confirmation_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.security_hub_street_mode_trusted_locations_list_action_deletion_confirmation_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
        k9 k9Var = k9.SecurityHub;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        mqi.a block = new mqi.a(aVar, 14);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }

    private final Object b(Object obj2, Object obj3) {
        mw7.c cVar = (mw7.c) this.f207521b;
        mw7.b params = (mw7.b) obj2;
        com.revolut.feature.insurance_home.impl.data.model.f tiles = (com.revolut.feature.insurance_home.impl.data.model.f) obj3;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        cVar.f209403a.f(params.a(), tiles);
        return Unit.f186387a;
    }

    private final Object c(Object obj2, Object obj3) {
        return DraggableTabsView.d((DraggableTabsView) this.f207521b, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.a aVar = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.a) this.f207521b;
        l FlowCoordinator = (l) obj2;
        RetailCryptoTradeFlowContract$Step it8 = (RetailCryptoTradeFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(it8, "it");
        ox5.j jVar = aVar.f71556p;
        iw5.j headerMediator = aVar.f71557q;
        BuyFundingCurrencyPrefill buyFundingCurrencyPrefill = aVar.o.f71552a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(headerMediator, "headerMediator");
        CryptoTradeScreen cryptoTradeScreen = new CryptoTradeScreen(new CryptoTradeFlowContract$InputData(buyFundingCurrencyPrefill), headerMediator);
        v9 block = new v9(1, aVar, com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.a.class, "postResult", "postResult(Lcom/revolut/kompot/common/IOData$Output;)V", 0, 5);
        Intrinsics.checkNotNullParameter(block, "block");
        cryptoTradeScreen.H = block;
        return cryptoTradeScreen;
    }

    private final Object e(Object obj2, Object obj3) {
        final com.revolut.feature.freelancer.impl.ui.invoice.details.flow.a aVar = (com.revolut.feature.freelancer.impl.ui.invoice.details.flow.a) this.f207521b;
        l FlowCoordinator = (l) obj2;
        InvoiceDetailsFlowContract$Step step = (InvoiceDetailsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof InvoiceDetailsFlowContract$Step.EditInvoice) {
            InvoiceCreateFlow invoiceCreateFlow = new InvoiceCreateFlow(new InvoiceCreateFlowContract$InputData(aVar.o.f73859a));
            final int i = 1;
            Function1 block = new Function1() { // from class: mx6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            k result = (k) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.freelancer.impl.ui.invoice.details.flow.a aVar2 = aVar;
                            h.t2(aVar2, aVar2.f73863p, new InvoiceDetailsFlowContract$Step.EditInvoice(result.f230629b, result.f230628a), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            gx6.c result2 = (gx6.c) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!Intrinsics.f(result2, gx6.c.f147640a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            h.D2(aVar.f73863p);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            invoiceCreateFlow.H = block;
            return invoiceCreateFlow;
        }
        if (!(step instanceof InvoiceDetailsFlowContract$Step.InvoiceDetails)) {
            throw new NoWhenBranchMatchedException();
        }
        InvoiceDetailsScreen invoiceDetailsScreen = new InvoiceDetailsScreen(new InvoiceDetailsScreenContract$InputData(((InvoiceDetailsFlowContract$Step.InvoiceDetails) step).f73862a));
        final int i2 = 0;
        Function1 block2 = new Function1() { // from class: mx6.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        k result = (k) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.feature.freelancer.impl.ui.invoice.details.flow.a aVar2 = aVar;
                        h.t2(aVar2, aVar2.f73863p, new InvoiceDetailsFlowContract$Step.EditInvoice(result.f230629b, result.f230628a), true, null, false, 12);
                        return Unit.f186387a;
                    default:
                        gx6.c result2 = (gx6.c) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (!Intrinsics.f(result2, gx6.c.f147640a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h.D2(aVar.f73863p);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        invoiceDetailsScreen.H = block2;
        return invoiceDetailsScreen;
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.feature.freelancer.impl.ui.invoice.settings.flow.a aVar = (com.revolut.feature.freelancer.impl.ui.invoice.settings.flow.a) this.f207521b;
        l FlowCoordinator = (l) obj2;
        InvoiceSettingsFlowContract$Step step = (InvoiceSettingsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, InvoiceSettingsFlowContract$Step.Branding.f73923a)) {
            return aVar.e1(new j6d.a(new BrandingSharedDescriptor$InputData(BrandingParams.RetailBrandingParams.f86062a)));
        }
        if (Intrinsics.f(step, InvoiceSettingsFlowContract$Step.EmailMessage.f73924a)) {
            return new InvoiceEmailMessageScreen();
        }
        if (Intrinsics.f(step, InvoiceSettingsFlowContract$Step.General.f73925a)) {
            return new InvoiceGeneralSettingsScreen();
        }
        if (Intrinsics.f(step, InvoiceSettingsFlowContract$Step.PaymentMethods.f73926a)) {
            return new InvoicePaymentMethodsScreen(InvoicePaymentMethodsScreenContract$InputData.DefaultInvoicePaymentMethods.f73891a);
        }
        if (Intrinsics.f(step, InvoiceSettingsFlowContract$Step.PaymentSchedule.f73927a)) {
            return new InvoiceScheduleSettingsScreen();
        }
        if (Intrinsics.f(step, InvoiceSettingsFlowContract$Step.RecurringPaymentSchedule.f73928a)) {
            return new InvoiceRecurringSettingsScreen();
        }
        if (Intrinsics.f(step, InvoiceSettingsFlowContract$Step.Reminders.f73929a)) {
            return new InvoiceRemindersScreen();
        }
        if (!Intrinsics.f(step, InvoiceSettingsFlowContract$Step.Settings.f73930a)) {
            if (Intrinsics.f(step, InvoiceSettingsFlowContract$Step.Templates.f73931a)) {
                return new InvoiceTemplatesFlow(new InvoiceTemplatesFlowContract$InputData(null, bz6.d.MANAGEMENT));
            }
            throw new NoWhenBranchMatchedException();
        }
        InvoiceSettingsScreen invoiceSettingsScreen = new InvoiceSettingsScreen();
        a7 block = new a7(aVar, 12);
        Intrinsics.checkNotNullParameter(block, "block");
        invoiceSettingsScreen.H = block;
        return invoiceSettingsScreen;
    }

    private final Object h(Object obj2, Object obj3) {
        myg.c cVar = (myg.c) this.f207521b;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        if (((jte.d) cVar.f210498b).c(WealthAnalyticsApi$Toggles.AnalyticsUiImprovements.f94964c)) {
            Intrinsics.checkNotNullParameter("ALLOCATIONS_WIDGET_LIST_ID", "listId");
            return uyg.a.a("ALLOCATIONS_WIDGET_LIST_ID", q.SMALL);
        }
        Intrinsics.checkNotNullParameter("ALLOCATIONS_WIDGET_LIST_ID", "listId");
        return uyg.a.a("ALLOCATIONS_WIDGET_LIST_ID", q.MEDIUM);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.revolut.camerakit.client.api.models.AnimationType, com.revolut.camerakit.client.api.models.HintMessage, com.revolut.core.ui_kit.models.TextLocalisedClause] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r1v106, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i;
        TextLocalisedClause textLocalisedClause;
        Object obj4;
        Object categoryManagementListController;
        UserSpecificRule userSpecificRule;
        boolean z;
        int i2;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        Object obj5;
        dii.a aVarA;
        int i3 = this.f207520a;
        int i5 = 10;
        int i6 = 12;
        int i21 = 19;
        final int i22 = 2;
        final int i32 = 0;
        Object obj6 = this.f207521b;
        switch (i3) {
            case 0:
                com.revolut.sso.impl.ui.manual_review.b bVar = (com.revolut.sso.impl.ui.manual_review.b) obj6;
                l FlowCoordinator = (l) obj2;
                ManualReviewFlowContract$Step step = (ManualReviewFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof ManualReviewFlowContract$Step.ReviewAwaiting) {
                    if (bVar.v) {
                        textLocalisedClause = null;
                        i = 14;
                    } else {
                        i = 14;
                        textLocalisedClause = new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_access_recovery_manual_review_polling_screen_enable_push_notifications_action, null, null, 14);
                    }
                    PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_access_recovery_manual_review_polling_screen_title, null, null, i), new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_access_recovery_manual_review_polling_screen_description, null, null, i), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D007", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, textLocalisedClause != null ? new PromptMarketingContentDelegate.Model.Button((Clause) textLocalisedClause, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62) : null, null, null, null, null, null, null, 65368));
                    h block = new h(bVar, 0);
                    Intrinsics.checkNotNullParameter(block, "block");
                    promptMarketingScreen.H = block;
                    return promptMarketingScreen;
                }
                if (step instanceof ManualReviewFlowContract$Step.ReviewPassed) {
                    AuthResult authResult = ((ManualReviewFlowContract$Step.ReviewPassed) step).f106576a;
                    PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_access_recovery_manual_review_passed_screen_title, null, null, 14), new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_access_recovery_manual_review_passed_screen_description, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D151A", null, null, null, 30), null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_access_recovery_manual_review_passed_screen_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368));
                    s block2 = new s(bVar, authResult, 17);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    promptMarketingScreen2.H = block2;
                    return promptMarketingScreen2;
                }
                if (step instanceof ManualReviewFlowContract$Step.ReviewRejected) {
                    ManualReviewFlowContract$Step.ReviewRejected reviewRejected = (ManualReviewFlowContract$Step.ReviewRejected) step;
                    AuthenticationRejectedFlow authenticationRejectedFlow = new AuthenticationRejectedFlow(new AuthenticationRejectedFlowContract$InputData(reviewRejected.f106577a, reviewRejected.f106578b));
                    h block3 = new h(bVar, 1);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    authenticationRejectedFlow.H = block3;
                    return authenticationRejectedFlow;
                }
                if (!(step instanceof ManualReviewFlowContract$Step.AuthCancellation)) {
                    throw new NoWhenBranchMatchedException();
                }
                AuthCancellationScreen authCancellationScreen = new AuthCancellationScreen();
                h block4 = new h(bVar, i22);
                Intrinsics.checkNotNullParameter(block4, "block");
                authCancellationScreen.H = block4;
                return authCancellationScreen;
            case 1:
                com.revolut.feature.retail.savings.impl.ui.add_money.b bVar2 = (com.revolut.feature.retail.savings.impl.ui.add_money.b) obj6;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                SavingsAddMoneyFlowContract$Step step2 = (SavingsAddMoneyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof SavingsAddMoneyFlowContract$Step.MoveMoney) {
                    ViewController viewControllerE1 = bVar2.e1(new y5i.a(((SavingsAddMoneyFlowContract$Step.MoveMoney) step2).f83347a, null, 14));
                    dph.c block5 = new dph.c(bVar2, LazyFlowCoordinator, 18);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    viewControllerE1.H = block5;
                    return viewControllerE1;
                }
                if (!(step2 instanceof SavingsAddMoneyFlowContract$Step.VaultAddMoney)) {
                    if (step2 instanceof SavingsAddMoneyFlowContract$Step.RetailTopUp) {
                        return bVar2.e1(new ste.q(((SavingsAddMoneyFlowContract$Step.RetailTopUp) step2).f83350a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                SavingsAddMoneyFlowContract$Step.VaultAddMoney vaultAddMoney = (SavingsAddMoneyFlowContract$Step.VaultAddMoney) step2;
                VaultsKompotFeatureConfig.AddMoney.Destination destination = vaultAddMoney.f83351a;
                if (vaultAddMoney.f83352b) {
                    VaultsKompotFeatureConfig.AddMoney.Config config = VaultsKompotFeatureConfig.AddMoney.Config.a(destination.f94716a);
                    Intrinsics.checkNotNullParameter(config, "config");
                    destination = new VaultsKompotFeatureConfig.AddMoney.Destination(config);
                }
                ViewController viewControllerE12 = bVar2.e1(new com.revolut.feature.vaults.api.navigation.a(destination));
                n block6 = new n(step2, 29, bVar2, LazyFlowCoordinator);
                Intrinsics.checkNotNullParameter(block6, "block");
                viewControllerE12.H = block6;
                return viewControllerE12;
            case 2:
                final com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a aVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) obj6;
                l FlowCoordinator2 = (l) obj2;
                TripsFlowContract$Step step3 = (TripsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof TripsFlowContract$Step.List) {
                    return new TripsListController(new TripsListContract$InputData(((TripsFlowContract$Step.List) step3).f87619a));
                }
                if (step3 instanceof TripsFlowContract$Step.CountryPicker) {
                    TripsCountryPickerController tripsCountryPickerController = new TripsCountryPickerController(new TripsCountryPickerContract$InputData(((TripsFlowContract$Step.CountryPicker) step3).f87612a));
                    y block7 = new y(aVar, 16);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    tripsCountryPickerController.H = block7;
                    return tripsCountryPickerController;
                }
                if (step3 instanceof TripsFlowContract$Step.DatePicker) {
                    TripsFlowContract$Step.DatePicker datePicker = (TripsFlowContract$Step.DatePicker) step3;
                    final Trip trip = datePicker.f87613a;
                    Set set = datePicker.f87614b;
                    ZonedDateTime zonedDateTime = trip.f99264b;
                    LocalDate localDate = zonedDateTime != null ? zonedDateTime.toLocalDate() : null;
                    ZonedDateTime zonedDateTime2 = trip.f99265c;
                    TripsDatePickerController tripsDatePickerController = new TripsDatePickerController(new TripsDatePickerContract$InputData(localDate, zonedDateTime2 != null ? zonedDateTime2.toLocalDate() : 0, trip.a(), set));
                    Function1 block8 = new Function1() { // from class: mod.w
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i22) {
                                case 0:
                                    sod.b result = (sod.b) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z3 = result.f264819a;
                                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a aVar2 = aVar;
                                    if (z3) {
                                        aVar2.l2(new p0(aVar2, trip, null, 26), new yi5.b(26));
                                    } else {
                                        aVar2.f87630r.e(true);
                                    }
                                    break;
                                case 1:
                                    ard.h result2 = (ard.h) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a aVar3 = aVar;
                                    aVar3.l2(new c0(aVar3, trip, result2, null, 4), new yi5.b(26));
                                    break;
                                default:
                                    iod.b result3 = (iod.b) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a aVar4 = aVar;
                                    aVar4.l2(new c0(aVar4, trip, result3, null, 3), new yi5.b(26));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    tripsDatePickerController.H = block8;
                    categoryManagementListController = tripsDatePickerController;
                } else {
                    if (!(step3 instanceof TripsFlowContract$Step.EditOptions)) {
                        if (step3 instanceof TripsFlowContract$Step.RemoveConfirmation) {
                            final Trip trip2 = ((TripsFlowContract$Step.RemoveConfirmation) step3).f87621a;
                            TripsRemoveConfirmationController tripsRemoveConfirmationController = new TripsRemoveConfirmationController(new TripsRemoveConfirmationContract$InputData(trip2.d));
                            final int i33 = 0;
                            Function1 block9 = new Function1() { // from class: mod.w
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    switch (i33) {
                                        case 0:
                                            sod.b result = (sod.b) obj7;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            boolean z3 = result.f264819a;
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a aVar2 = aVar;
                                            if (z3) {
                                                aVar2.l2(new p0(aVar2, trip2, null, 26), new yi5.b(26));
                                            } else {
                                                aVar2.f87630r.e(true);
                                            }
                                            break;
                                        case 1:
                                            ard.h result2 = (ard.h) obj7;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a aVar3 = aVar;
                                            aVar3.l2(new c0(aVar3, trip2, result2, null, 4), new yi5.b(26));
                                            break;
                                        default:
                                            iod.b result3 = (iod.b) obj7;
                                            Intrinsics.checkNotNullParameter(result3, "result");
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a aVar4 = aVar;
                                            aVar4.l2(new c0(aVar4, trip2, result3, null, 3), new yi5.b(26));
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block9, "block");
                            tripsRemoveConfirmationController.H = block9;
                            obj4 = tripsRemoveConfirmationController;
                        } else if (step3 instanceof TripsFlowContract$Step.SelectTransactions) {
                            TripsFlowContract$Step.SelectTransactions selectTransactions = (TripsFlowContract$Step.SelectTransactions) step3;
                            final Trip trip3 = selectTransactions.f87622a;
                            CategorisationFilter categorisationFilter = selectTransactions.f87623b;
                            List actuallyIncludedTransactions = selectTransactions.f87624c;
                            CategorisationFilter categorisationFilterA = CategorisationFilter.a(categorisationFilter, null, null, null, null, null, 1007);
                            mod.l lVar = aVar.o;
                            lVar.getClass();
                            Intrinsics.checkNotNullParameter(trip3, "trip");
                            Intrinsics.checkNotNullParameter(actuallyIncludedTransactions, "actuallyIncludedTransactions");
                            ZonedDateTime zonedDateTime3 = trip3.f99264b;
                            if (zonedDateTime3 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            ZonedDateTime zonedDateTimeK = trip3.f99265c;
                            if (zonedDateTimeK == null) {
                                zonedDateTimeK = ((l80.f) lVar.f207624c).k();
                            }
                            SelectTransactionController selectTransactionController = new SelectTransactionController(new SelectTransactionContract$InputData(categorisationFilterA, u.c(AnalyticsAccount.Personal.All.f99192a), new SelectTransactionContract$SelectionMode.Multiple.SpecificTransactions(d0.i1(actuallyIncludedTransactions), new SelectTransactionContract$DateRange(zonedDateTime3, zonedDateTimeK)), (TextLocalisedClause) null, (TextLocalisedClause) null, 56));
                            final int i43 = 1;
                            Function1 block10 = new Function1() { // from class: mod.w
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    switch (i43) {
                                        case 0:
                                            sod.b result = (sod.b) obj7;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            boolean z3 = result.f264819a;
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a aVar2 = aVar;
                                            if (z3) {
                                                aVar2.l2(new p0(aVar2, trip3, null, 26), new yi5.b(26));
                                            } else {
                                                aVar2.f87630r.e(true);
                                            }
                                            break;
                                        case 1:
                                            ard.h result2 = (ard.h) obj7;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a aVar3 = aVar;
                                            aVar3.l2(new c0(aVar3, trip3, result2, null, 4), new yi5.b(26));
                                            break;
                                        default:
                                            iod.b result3 = (iod.b) obj7;
                                            Intrinsics.checkNotNullParameter(result3, "result");
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a aVar4 = aVar;
                                            aVar4.l2(new c0(aVar4, trip3, result3, null, 3), new yi5.b(26));
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block10, "block");
                            selectTransactionController.H = block10;
                            obj4 = selectTransactionController;
                        } else {
                            if (step3 instanceof TripsFlowContract$Step.Share) {
                                TripsFlowContract$Step.Share share = (TripsFlowContract$Step.Share) step3;
                                return new TripsShareController(new TripsShareContract$InputData(share.f87625a, share.f87626b, share.f87627c, share.d, share.e, share.f));
                            }
                            if (step3 instanceof TripsFlowContract$Step.GroupDetails) {
                                return new GroupDetailsScreen(((TripsFlowContract$Step.GroupDetails) step3).f87618a);
                            }
                            if (!(step3 instanceof TripsFlowContract$Step.ManageCategories)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            categoryManagementListController = new CategoryManagementListController(new CategoryManagementListContract$InputData(((TripsFlowContract$Step.ManageCategories) step3).f87620a, CategoryManagementListContract$Mode.Manage.f87657a));
                        }
                        return obj4;
                    }
                    TripsFlowContract$Step.EditOptions editOptions = (TripsFlowContract$Step.EditOptions) step3;
                    Trip trip4 = editOptions.f87615a;
                    Set set2 = editOptions.f87616b;
                    CategorisationFilter categorisationFilter2 = editOptions.f87617c;
                    List list = editOptions.d;
                    TripsEditOptionsController tripsEditOptionsController = new TripsEditOptionsController(new TripsEditOptionsContract$InputData(trip4.a() ? v.k(kod.b.EDIT_START_DATE, kod.b.ADD_TRANSACTIONS) : (trip4.f99264b == null || trip4.f99265c == null) ? v.k(kod.b.EDIT_DATES, kod.b.REMOVE_TRIP) : v.k(kod.b.EDIT_DATES, kod.b.ADD_TRANSACTIONS, kod.b.REMOVE_TRIP)));
                    kwg.e block11 = new kwg.e(aVar, trip4, set2, categorisationFilter2, list, 4);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    tripsEditOptionsController.H = block11;
                    categoryManagementListController = tripsEditOptionsController;
                }
                return categoryManagementListController;
            case 3:
                com.revolut.feature.credit.card.impl.ui.additional_cards.flow.a aVar2 = (com.revolut.feature.credit.card.impl.ui.additional_cards.flow.a) obj6;
                AdditionalCardsFlowContract$InputData additionalCardsFlowContract$InputData = aVar2.o;
                l FlowCoordinator3 = (l) obj2;
                AdditionalCardsFlowContract$Step step4 = (AdditionalCardsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof AdditionalCardsFlowContract$Step.AdditionalCards)) {
                    if (!(step4 instanceof AdditionalCardsFlowContract$Step.CardholderDetails)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AdditionalCardsFlowContract$Step.CardholderDetails cardholderDetails = (AdditionalCardsFlowContract$Step.CardholderDetails) step4;
                    return new AdditionalCardsCardholderDetailsFlow(new AdditionalCardsCardholderDetailsFlowContract$InputData(additionalCardsFlowContract$InputData.f69020a, cardholderDetails.f69022a, cardholderDetails.f69023b));
                }
                AdditionalCardsManagementScreen additionalCardsManagementScreen = new AdditionalCardsManagementScreen(new AdditionalCardsManagementScreenContract$InputData(additionalCardsFlowContract$InputData.f69020a));
                y block12 = new y(aVar2, 17);
                Intrinsics.checkNotNullParameter(block12, "block");
                additionalCardsManagementScreen.H = block12;
                return additionalCardsManagementScreen;
            case 4:
                com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.a aVar3 = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DriverNumberInputScreenContract$ModalStep step5 = (DriverNumberInputScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof DriverNumberInputScreenContract$ModalStep.CountryPickerStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((DriverNumberInputScreenContract$ModalStep.CountryPickerStep) step5).f75620a;
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_imid_country_picker_title, null, null, 14);
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_imid_country_picker_search_placeholder, null, null, 14);
                aVar3.o.getClass();
                wi0.b.Companion.getClass();
                Set set3 = (Set) wi0.b.H3.getValue();
                wi0.b[] elements = {wi0.b.f297772r0, wi0.b.f297787x0, wi0.b.L1, wi0.b.T1, wi0.b.C2, wi0.b.L0};
                Intrinsics.checkNotNullParameter(elements, "elements");
                to7.i iVar = new to7.i(d0.P0(d0.d1(a1.k(set3, kotlin.collections.d.y0(elements))), new ll7.j()));
                wi0.b bVar3 = (wi0.b) ((mp7.h) ((j2) aVar3.f75622q.f22677a).getValue()).d.get(str);
                PickerScreen pickerScreen = new PickerScreen(new PickerScreenContract$InputData(iVar, textLocalisedClause4, null, y7a.s.CROSS, true, textLocalisedClause5, "CarInsuranceOnboardingCountryPickerInteractor", null, bVar3 != null ? bVar3.f297794a : null, null, null, false, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, 123664956));
                s sVar = new s(aVar3, str, i21);
                Intrinsics.checkNotNullParameter(sVar, "<set-?>");
                pickerScreen.H = sVar;
                return pickerScreen;
            case 5:
                com.revolut.feature.retail.savings.impl.ui.product_migration.flow.a aVar4 = (com.revolut.feature.retail.savings.impl.ui.product_migration.flow.a) obj6;
                l FlowCoordinator4 = (l) obj2;
                ProductMigrationFlowContract$Step step6 = (ProductMigrationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof ProductMigrationFlowContract$Step.EligibilityWorkflow) {
                    Map map = ((ProductMigrationFlowContract$Step.EligibilityWorkflow) step6).f83383a;
                    m mVar = aVar4.f83385p;
                    AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                    k9 k9Var = k9.Savings;
                    companion.getClass();
                    return m.b(mVar, new WorkflowConfiguration.CreateWorkflow(map, AnalyticsProduct.Companion.b(k9Var), 46), new WorkflowFlowType.Regular(0), null, 60);
                }
                if (!(step6 instanceof ProductMigrationFlowContract$Step.Migration)) {
                    if (step6 instanceof ProductMigrationFlowContract$Step.Documents) {
                        return new ProductDocumentsScreen(new ProductDocumentsContract$InputData(((ProductMigrationFlowContract$Step.Documents) step6).f83382a, (String) null, 6));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ProductMigrationScreen productMigrationScreen = new ProductMigrationScreen(new ProductMigrationScreenContract$InputData(aVar4.o.f83381a));
                y block13 = new y(aVar4, 21);
                Intrinsics.checkNotNullParameter(block13, "block");
                productMigrationScreen.H = block13;
                return productMigrationScreen;
            case 6:
                com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a aVar5 = (com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CustomPeriodSelectContract$ModalStep step7 = (CustomPeriodSelectContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!(step7 instanceof CustomPeriodSelectContract$ModalStep.DatePicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                DatePickerController datePickerController = new DatePickerController(((CustomPeriodSelectContract$ModalStep.DatePicker) step7).f87680a);
                s block14 = new s(step7, aVar5, 22);
                Intrinsics.checkNotNullParameter(block14, "block");
                datePickerController.H = block14;
                return datePickerController;
            case 7:
                com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.a aVar6 = (com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.a) obj6;
                AddDeclarationFlowContract$InputData addDeclarationFlowContract$InputData = aVar6.o;
                l FlowCoordinator5 = (l) obj2;
                AddDeclarationFlowContract$Step step8 = (AddDeclarationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                int i59 = 23;
                if (!Intrinsics.f(step8, AddDeclarationFlowContract$Step.CountrySelection.f90197a)) {
                    if (!(step8 instanceof AddDeclarationFlowContract$Step.TaxResidencyDeclaration)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AddDeclarationFlowContract$Step.TaxResidencyDeclaration taxResidencyDeclaration = (AddDeclarationFlowContract$Step.TaxResidencyDeclaration) step8;
                    Map map2 = addDeclarationFlowContract$InputData.e;
                    mpe.g gVar = addDeclarationFlowContract$InputData.f90192a;
                    UserSpecificRule userSpecificRuleA = com.revolut.feature.tax_residency.impl.v2.models.a.a(map2, taxResidencyDeclaration.f90198a);
                    wi0.b bVar4 = taxResidencyDeclaration.f90198a;
                    CountryRule countryRule = taxResidencyDeclaration.f90199b;
                    int[] iArr = mpe.f.f207813a;
                    int i66 = iArr[gVar.ordinal()];
                    if (i66 == 1) {
                        userSpecificRule = userSpecificRuleA;
                    } else {
                        if (i66 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Intrinsics.checkNotNullParameter(userSpecificRuleA, "<this>");
                        userSpecificRule = new UserSpecificRule(userSpecificRuleA.f90186a, null, null, userSpecificRuleA.d, userSpecificRuleA.e, userSpecificRuleA.f);
                    }
                    TaxResidencyDeclarationFlowContract$UseCase taxResidencyDeclarationFlowContract$UseCase = taxResidencyDeclaration.f90200c;
                    AnalyticsProduct analyticsProduct = addDeclarationFlowContract$InputData.f;
                    String str2 = addDeclarationFlowContract$InputData.f90195g;
                    String str3 = addDeclarationFlowContract$InputData.f90196h;
                    BackNavigationType backNavigationType = BackNavigationType.BACK;
                    int i74 = iArr[gVar.ordinal()];
                    if (i74 == 1) {
                        z = true;
                    } else {
                        if (i74 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = false;
                    }
                    TaxResidencyDeclarationFlow taxResidencyDeclarationFlow = new TaxResidencyDeclarationFlow(new TaxResidencyDeclarationFlowContract$InputData(bVar4, countryRule, userSpecificRule, taxResidencyDeclarationFlowContract$UseCase, analyticsProduct, str2, str3, backNavigationType, z));
                    s block15 = new s(aVar6, taxResidencyDeclaration, i59);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    taxResidencyDeclarationFlow.H = block15;
                    return taxResidencyDeclarationFlow;
                }
                b0 b0Var = aVar6.f90201p;
                ArrayList suggestedCountries = addDeclarationFlowContract$InputData.f90193b;
                Map countryRules = addDeclarationFlowContract$InputData.d;
                AnalyticsProduct analyticsProduct2 = addDeclarationFlowContract$InputData.f;
                mpe.g useCase = addDeclarationFlowContract$InputData.f90192a;
                y onResult = new y(aVar6, i59);
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(suggestedCountries, "suggestedCountries");
                Intrinsics.checkNotNullParameter(countryRules, "countryRules");
                Intrinsics.checkNotNullParameter(analyticsProduct2, "analyticsProduct");
                Intrinsics.checkNotNullParameter(useCase, "useCase");
                Intrinsics.checkNotNullParameter(onResult, "onResult");
                npe.b bVar5 = new npe.b(suggestedCountries, countryRules);
                int[] iArr2 = npe.e.f218199a;
                int i92 = iArr2[useCase.ordinal()];
                if (i92 == 1) {
                    i2 = 14;
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.tax_residency.impl.R$string.tin_flow_tax_country_selection_title, null, null, 14);
                } else {
                    if (i92 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 14;
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.tax_residency.impl.R$string.tin_flow_tax_country_selection_title_primary_residency, null, null, 14);
                }
                TextLocalisedClause textLocalisedClause6 = textLocalisedClause2;
                int i96 = iArr2[useCase.ordinal()];
                if (i96 == 1) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.tax_residency.impl.R$string.tin_flow_tax_country_selection_description, null, null, i2);
                } else {
                    if (i96 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.tax_residency.impl.R$string.tin_flow_tax_country_selection_description_primary_residency, null, null, i2);
                }
                PickerController pickerController = new PickerController(new x(textLocalisedClause6, bVar5, null, textLocalisedClause3, false, null, new TextLocalisedClause(com.revolut.feature.tax_residency.impl.R$string.tax_residency_list_search_country_hint, null, null, i2), null, null, false, null, null, null, null, false, analyticsProduct2, null, null, null, null, 2105540060), (npe.d) b0Var.f185144b);
                z block16 = new z(onResult, 29);
                Intrinsics.checkNotNullParameter(block16, "block");
                pickerController.H = block16;
                return pickerController;
            case 8:
                CollateralMoveMoneyScreen collateralMoveMoneyScreen = (CollateralMoveMoneyScreen) obj6;
                CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = CollateralMoveMoneyScreen.X;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj7 = model.f51981p;
                xi0.b bVar6 = obj7 instanceof xi0.b ? (xi0.b) obj7 : null;
                if (bVar6 != null) {
                    return new zp0.d(field.getEditText(), bVar6, (u80.d) collateralMoveMoneyScreen.Q.getValue(), null, new kpj.f(collateralMoveMoneyScreen, 15), false, false, 0, false, null, 1928);
                }
                return null;
            case 9:
                mq5.i iVar2 = ((com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.a) obj6).f71305r;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CryptoFeeBreakdownDialogControllerContract$Step step9 = (CryptoFeeBreakdownDialogControllerContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof CryptoFeeBreakdownDialogControllerContract$Step.BreakdownDetail) {
                    mq5.d dVar = new mq5.d(((CryptoFeeBreakdownDialogControllerContract$Step.BreakdownDetail) step9).f71300a);
                    iVar2.getClass();
                    return new ActionsBottomSheetController(mq5.i.a(dVar));
                }
                if (Intrinsics.f(step9, CryptoFeeBreakdownDialogControllerContract$Step.NetworkFee.f71301a)) {
                    iVar2.getClass();
                    return new ActionsBottomSheetController(mq5.i.a(mq5.e.f207889a));
                }
                if (!Intrinsics.f(step9, CryptoFeeBreakdownDialogControllerContract$Step.ServiceFee.f71302a)) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar2.getClass();
                return new ActionsBottomSheetController(mq5.i.a(mq5.f.f207890a));
            case 10:
                String submissionId = (String) obj2;
                bqc.j domain = (bqc.j) obj3;
                Intrinsics.checkNotNullParameter(submissionId, "submissionId");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((mqc.k) obj6).f207963c.f(submissionId, domain);
                return Unit.f186387a;
            case 11:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new cii.b(null, (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), ((mr4.h) obj6).f208058a);
            case 12:
                final com.revolut.feature.push_to_card.impl.ui.flow.b bVar7 = (com.revolut.feature.push_to_card.impl.ui.flow.b) obj6;
                l FlowCoordinator6 = (l) obj2;
                PushToCardTransferFlowContract$Step step10 = (PushToCardTransferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof PushToCardTransferFlowContract$Step.Amount)) {
                    if (!(step10 instanceof PushToCardTransferFlowContract$Step.Review)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PushToCardTransferReviewScreen pushToCardTransferReviewScreen = new PushToCardTransferReviewScreen(((PushToCardTransferFlowContract$Step.Review) step10).f81612a);
                    Function1 block17 = new Function1() { // from class: msa.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i32) {
                                case 0:
                                    e output = (e) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    bVar7.C2(output);
                                    return Unit.f186387a;
                                default:
                                    yra.n output2 = (yra.n) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z3 = output2 instanceof yra.m;
                                    com.revolut.feature.push_to_card.impl.ui.flow.b bVar8 = bVar7;
                                    if (z3) {
                                        h.D2(bVar8.f81614p);
                                    } else {
                                        if (!(output2 instanceof yra.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        PushToCardTransferData pushToCardTransferData = ((yra.l) output2).f316181a;
                                        PushToCardTransferInputData pushToCardTransferInputData = bVar8.o;
                                        PushToCardTransferInputData.NewTransfer newTransfer = pushToCardTransferInputData instanceof PushToCardTransferInputData.NewTransfer ? (PushToCardTransferInputData.NewTransfer) pushToCardTransferInputData : null;
                                        if (newTransfer == null) {
                                            throw new IllegalStateException(h30.l.r("Expected NewTransfer input data, got ", o0.f186429a.b(pushToCardTransferInputData.getClass()).m()));
                                        }
                                        bVar8.l2(new com.revolut.feature.push_to_card.impl.ui.flow.a(bVar8, pushToCardTransferData, newTransfer.e, null), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    pushToCardTransferReviewScreen.H = block17;
                    return pushToCardTransferReviewScreen;
                }
                PushToCardTransferFlowContract$Step.Amount step11 = (PushToCardTransferFlowContract$Step.Amount) step10;
                Intrinsics.checkNotNullParameter(step11, "step");
                PushToCardTransferAmountScreen pushToCardTransferAmountScreen = new PushToCardTransferAmountScreen(step11.f81611a);
                final int i99 = 1;
                Function1 function1 = new Function1() { // from class: msa.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        switch (i99) {
                            case 0:
                                e output = (e) obj8;
                                Intrinsics.checkNotNullParameter(output, "output");
                                bVar7.C2(output);
                                return Unit.f186387a;
                            default:
                                yra.n output2 = (yra.n) obj8;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                boolean z3 = output2 instanceof yra.m;
                                com.revolut.feature.push_to_card.impl.ui.flow.b bVar8 = bVar7;
                                if (z3) {
                                    h.D2(bVar8.f81614p);
                                } else {
                                    if (!(output2 instanceof yra.l)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    PushToCardTransferData pushToCardTransferData = ((yra.l) output2).f316181a;
                                    PushToCardTransferInputData pushToCardTransferInputData = bVar8.o;
                                    PushToCardTransferInputData.NewTransfer newTransfer = pushToCardTransferInputData instanceof PushToCardTransferInputData.NewTransfer ? (PushToCardTransferInputData.NewTransfer) pushToCardTransferInputData : null;
                                    if (newTransfer == null) {
                                        throw new IllegalStateException(h30.l.r("Expected NewTransfer input data, got ", o0.f186429a.b(pushToCardTransferInputData.getClass()).m()));
                                    }
                                    bVar8.l2(new com.revolut.feature.push_to_card.impl.ui.flow.a(bVar8, pushToCardTransferData, newTransfer.e, null), new yi5.b(26));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(function1, "<set-?>");
                pushToCardTransferAmountScreen.H = function1;
                return pushToCardTransferAmountScreen;
            case 13:
                final com.revolut.feature.credit.card.impl.ui.limit_hub.flow.a aVar7 = (com.revolut.feature.credit.card.impl.ui.limit_hub.flow.a) obj6;
                CreditCardLimitHubFlowContract$InputData creditCardLimitHubFlowContract$InputData = aVar7.o;
                final l FlowCoordinator7 = (l) obj2;
                CreditCardLimitHubFlowContract$Step step12 = (CreditCardLimitHubFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator7, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof CreditCardLimitHubFlowContract$Step.Manage) {
                    CreditCardLimitHubManageScreen creditCardLimitHubManageScreen = new CreditCardLimitHubManageScreen(new CreditCardLimitHubManageScreenContract$InputData(creditCardLimitHubFlowContract$InputData.f69529a));
                    Function1 block18 = new Function1() { // from class: mt4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            CreditCardDescriptionDestination.DescriptionConfig totalLimit;
                            switch (i32) {
                                case 0:
                                    com.revolut.feature.credit.card.impl.ui.limit_hub.flow.a aVar8 = aVar7;
                                    CreditCardLimitHubFlowContract$InputData creditCardLimitHubFlowContract$InputData2 = aVar8.o;
                                    tt4.n output = (tt4.n) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof tt4.k) {
                                        h.t2(aVar8, FlowCoordinator7, new CreditCardLimitHubFlowContract$Step.Settings(((tt4.k) output).f274221a), false, null, false, 14);
                                    } else if (output instanceof tt4.l) {
                                        j jVar = ((tt4.l) output).f274222a;
                                        if (jVar instanceof tt4.h) {
                                            tt4.h hVar = (tt4.h) jVar;
                                            totalLimit = new CreditCardDescriptionDestination.DescriptionConfig.Local.SecuredTotalLimit(hVar.f274218b, hVar.f274219c, hVar.f274217a);
                                        } else {
                                            if (!(jVar instanceof i)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            totalLimit = new CreditCardDescriptionDestination.DescriptionConfig.Local.TotalLimit(((i) jVar).f274220a, creditCardLimitHubFlowContract$InputData2.f69529a);
                                        }
                                        aVar8.C1(new CreditCardDescriptionDestination(totalLimit));
                                    } else {
                                        if (!(output instanceof tt4.m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.C1(new CreditCardLimitCapDestination(null, creditCardLimitHubFlowContract$InputData2.f69529a, true));
                                    }
                                    return Unit.f186387a;
                                default:
                                    rt4.i output2 = (rt4.i) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z3 = output2 instanceof rt4.h;
                                    com.revolut.feature.credit.card.impl.ui.limit_hub.flow.a aVar9 = aVar7;
                                    l lVar2 = FlowCoordinator7;
                                    if (z3) {
                                        h.t2(aVar9, lVar2, CreditCardLimitHubFlowContract$Step.LimitHistory.f69530a, false, null, false, 14);
                                    } else if (output2 instanceof g) {
                                        aVar9.C1(new CreditCardDecreaseLimitDestination(aVar9.o.f69529a));
                                    } else {
                                        if (!(output2 instanceof f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        f fVar = (f) output2;
                                        h.t2(aVar9, lVar2, new CreditCardLimitHubFlowContract$Step.LimitIncreasePreference(fVar.f257172a, fVar.f257173b), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    creditCardLimitHubManageScreen.H = block18;
                    return creditCardLimitHubManageScreen;
                }
                if (step12 instanceof CreditCardLimitHubFlowContract$Step.Settings) {
                    CreditCardLimitSettingsController creditCardLimitSettingsController = new CreditCardLimitSettingsController(new CreditCardLimitSettingsControllerContract$InputData(((CreditCardLimitHubFlowContract$Step.Settings) step12).f69534a, creditCardLimitHubFlowContract$InputData.f69529a));
                    final int i100 = 1;
                    Function1 block19 = new Function1() { // from class: mt4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            CreditCardDescriptionDestination.DescriptionConfig totalLimit;
                            switch (i100) {
                                case 0:
                                    com.revolut.feature.credit.card.impl.ui.limit_hub.flow.a aVar8 = aVar7;
                                    CreditCardLimitHubFlowContract$InputData creditCardLimitHubFlowContract$InputData2 = aVar8.o;
                                    tt4.n output = (tt4.n) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof tt4.k) {
                                        h.t2(aVar8, FlowCoordinator7, new CreditCardLimitHubFlowContract$Step.Settings(((tt4.k) output).f274221a), false, null, false, 14);
                                    } else if (output instanceof tt4.l) {
                                        j jVar = ((tt4.l) output).f274222a;
                                        if (jVar instanceof tt4.h) {
                                            tt4.h hVar = (tt4.h) jVar;
                                            totalLimit = new CreditCardDescriptionDestination.DescriptionConfig.Local.SecuredTotalLimit(hVar.f274218b, hVar.f274219c, hVar.f274217a);
                                        } else {
                                            if (!(jVar instanceof i)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            totalLimit = new CreditCardDescriptionDestination.DescriptionConfig.Local.TotalLimit(((i) jVar).f274220a, creditCardLimitHubFlowContract$InputData2.f69529a);
                                        }
                                        aVar8.C1(new CreditCardDescriptionDestination(totalLimit));
                                    } else {
                                        if (!(output instanceof tt4.m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.C1(new CreditCardLimitCapDestination(null, creditCardLimitHubFlowContract$InputData2.f69529a, true));
                                    }
                                    return Unit.f186387a;
                                default:
                                    rt4.i output2 = (rt4.i) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z3 = output2 instanceof rt4.h;
                                    com.revolut.feature.credit.card.impl.ui.limit_hub.flow.a aVar9 = aVar7;
                                    l lVar2 = FlowCoordinator7;
                                    if (z3) {
                                        h.t2(aVar9, lVar2, CreditCardLimitHubFlowContract$Step.LimitHistory.f69530a, false, null, false, 14);
                                    } else if (output2 instanceof g) {
                                        aVar9.C1(new CreditCardDecreaseLimitDestination(aVar9.o.f69529a));
                                    } else {
                                        if (!(output2 instanceof f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        f fVar = (f) output2;
                                        h.t2(aVar9, lVar2, new CreditCardLimitHubFlowContract$Step.LimitIncreasePreference(fVar.f257172a, fVar.f257173b), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    creditCardLimitSettingsController.H = block19;
                    return creditCardLimitSettingsController;
                }
                if (step12 instanceof CreditCardLimitHubFlowContract$Step.LimitHistory) {
                    return new CreditCardLimitHistoryController(new CreditCardLimitHistoryControllerContract$InputData(creditCardLimitHubFlowContract$InputData.f69529a));
                }
                if (!(step12 instanceof CreditCardLimitHubFlowContract$Step.LimitIncreasePreference)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardLimitHubFlowContract$Step.LimitIncreasePreference limitIncreasePreference = (CreditCardLimitHubFlowContract$Step.LimitIncreasePreference) step12;
                return new CreditCardLimitIncreasePreferenceController(new CreditCardLimitIncreasePreferenceContract$InputData(creditCardLimitHubFlowContract$InputData.f69529a, limitIncreasePreference.f69531a, limitIncreasePreference.f69532b));
            case 14:
                com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e eVar = (com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e) obj6;
                GroupDetailsFlowContract$Step step13 = (GroupDetailsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof GroupDetailsFlowContract$Step.Overview) {
                    GroupDetailsFlowContract$Step.Overview overview = (GroupDetailsFlowContract$Step.Overview) step13;
                    PaymentGroup paymentGroup = overview.f79466a;
                    if (paymentGroup.f79288g) {
                        return new GroupChatFlow(new GroupChatFlowContract$InputData(paymentGroup, overview.f79467b));
                    }
                    GroupChatTrustedScreen groupChatTrustedScreen = new GroupChatTrustedScreen(new GroupChatTrustedScreenContract$InputData(paymentGroup));
                    mt9.c cVar = new mt9.c(eVar, overview, 1);
                    Intrinsics.checkNotNullParameter(cVar, "<set-?>");
                    groupChatTrustedScreen.H = cVar;
                    return groupChatTrustedScreen;
                }
                if (step13 instanceof GroupDetailsFlowContract$Step.Chat) {
                    return new GroupChatFlow(new GroupChatFlowContract$InputData(((GroupDetailsFlowContract$Step.Chat) step13).f79465a, false));
                }
                if (step13 instanceof GroupDetailsFlowContract$Step.BillDetails) {
                    GroupDetailsFlowContract$Step.BillDetails billDetails = (GroupDetailsFlowContract$Step.BillDetails) step13;
                    GroupDetailsBillScreen groupDetailsBillScreen = new GroupDetailsBillScreen(new GroupDetailsBillScreenContract$InputData.WithId(billDetails.f79463a, billDetails.f79464b));
                    mt9.c cVar2 = new mt9.c(eVar, billDetails, i32);
                    Intrinsics.checkNotNullParameter(cVar2, "<set-?>");
                    groupDetailsBillScreen.H = cVar2;
                    obj5 = groupDetailsBillScreen;
                } else {
                    if (!(step13 instanceof GroupDetailsFlowContract$Step.UntrustedGroupPrompt)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    GroupDetailsFlowContract$Step.UntrustedGroupPrompt untrustedGroupPrompt = (GroupDetailsFlowContract$Step.UntrustedGroupPrompt) step13;
                    zr9.d dVar2 = eVar.f79472p;
                    String groupName = untrustedGroupPrompt.f79468a;
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(groupName, "groupName");
                    boolean z3 = false;
                    PromptMarketingScreen promptMarketingScreen3 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("JOIN_UNTRUSTED_GROUP_ITEM_ID", new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_details_disclaimer_untrusted_group_dialog_title_name, u.c(groupName), null, 12), new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_details_disclaimer_untrusted_group_description, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D211", null, null, null, 30), null), false ? 1 : 0, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_details_disclaimer_untrusted_group_action_join, null, null, 14), (ResourceImage) (false ? 1 : 0), (LargeActionButton.ButtonStyle) (false ? 1 : 0), z3, "PRIMARY_BUTTON_LOADING_TAG", 30), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_details_disclaimer_untrusted_group_action_leave, null, null, 14), (ResourceImage) (false ? 1 : 0), (LargeActionButton.ButtonStyle) (false ? 1 : 0), z3, (String) null, 62), null, null, null, null, null, null, null, null, null, null, 2095536), null, false, false, null, 30));
                    s block20 = new s(eVar, untrustedGroupPrompt, 29);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    promptMarketingScreen3.H = block20;
                    obj5 = promptMarketingScreen3;
                }
                return obj5;
            case 15:
                final com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a aVar8 = (com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a) obj6;
                WorkflowDocumentSelectionConfiguration.CitizenshipPicker citizenshipPicker = aVar8.f96433s;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DocumentSelectionControllerContract$ModalStep step14 = (DocumentSelectionControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (!Intrinsics.f(step14, DocumentSelectionControllerContract$ModalStep.CitizenshipPicker.f96429a)) {
                    if (!(step14 instanceof DocumentSelectionControllerContract$ModalStep.AlternativeDocuments)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    DocumentSelectionControllerContract$ModalStep.AlternativeDocuments alternativeDocuments = (DocumentSelectionControllerContract$ModalStep.AlternativeDocuments) step14;
                    AlternativeDocumentsController alternativeDocumentsController = new AlternativeDocumentsController(new AlternativeDocumentsControllerContract$InputData(alternativeDocuments.f96426a, alternativeDocuments.f96427b, alternativeDocuments.f96428c));
                    final int i101 = 1;
                    Function1 block21 = new Function1() { // from class: mth.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i101) {
                                case 0:
                                    a0 outputData = (a0) obj8;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    s7a.c0 c0Var = outputData.f260599a;
                                    if (c0Var instanceof s7a.q) {
                                        String str4 = ((s7a.q) c0Var).f260624a;
                                        com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a aVar9 = aVar8;
                                        aVar9.H2(aVar9.f96434t, new mll.h(str4, 2));
                                        aVar9.l2(new p(aVar9, null), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                default:
                                    ith.g outputData2 = (ith.g) obj8;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    DocumentGroup documentGroup = outputData2.f168387a;
                                    com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a aVar10 = aVar8;
                                    aVar10.C2(new j(((i) ((j2) aVar10.f96434t.f22677a).getValue()).f208830a, documentGroup));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    alternativeDocumentsController.H = block21;
                    return alternativeDocumentsController;
                }
                DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = aVar8.o;
                TextClause textClause = new TextClause(citizenshipPicker.f96398b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str4 = citizenshipPicker.f96399c;
                x xVar = new x(textClause, null, str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, true, null, new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.workflow_document_selection_nationality_search_placeholder, null, null, 14), null, null, false, null, ((mth.i) ((j2) aVar8.f96434t.f22677a).getValue()).f208830a.f297794a, null, null, false, documentSelectionControllerContract$InputData.e, null, new s7a.v(13, localDate, Integer.valueOf(com.revolut.feature.workflow.engine.R$string.workflow_document_selection_citizenship_picker_no_result_subtitle)), null, null, 1979579762);
                oth.a aVar9 = aVar8.f96430p;
                List citizenshipGroups = documentSelectionControllerContract$InputData.f96424g;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(citizenshipGroups, "citizenshipGroups");
                tog.a aVar10 = aVar9.f229591a;
                oth.b citizenshipPickerCountryInteractor = new oth.b((CitizenshipGroup) d0.b0(citizenshipGroups), (CitizenshipGroup) d0.m0(citizenshipGroups));
                Intrinsics.checkNotNullParameter(citizenshipPickerCountryInteractor, "citizenshipPickerCountryInteractor");
                PickerController pickerController2 = new PickerController(xVar, new sog.e(aVar10.f273209a, citizenshipPickerCountryInteractor, aVar10.f273210b));
                Function1 block22 = new Function1() { // from class: mth.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        switch (i32) {
                            case 0:
                                a0 outputData = (a0) obj8;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                s7a.c0 c0Var = outputData.f260599a;
                                if (c0Var instanceof s7a.q) {
                                    String str42 = ((s7a.q) c0Var).f260624a;
                                    com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a aVar92 = aVar8;
                                    aVar92.H2(aVar92.f96434t, new mll.h(str42, 2));
                                    aVar92.l2(new p(aVar92, null), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            default:
                                ith.g outputData2 = (ith.g) obj8;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                if (outputData2 == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                DocumentGroup documentGroup = outputData2.f168387a;
                                com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a aVar102 = aVar8;
                                aVar102.C2(new j(((i) ((j2) aVar102.f96434t.f22677a).getValue()).f208830a, documentGroup));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block22, "block");
                pickerController2.H = block22;
                return pickerController2;
            case 16:
                TextClause textClause2 = (TextClause) obj6;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return textClause2;
            case 17:
                com.revolut.retail.feature.stockdetails.impl.ui.flows.a aVar11 = (com.revolut.retail.feature.stockdetails.impl.ui.flows.a) obj6;
                mtk.b bVar8 = aVar11.o;
                l FlowCoordinator8 = (l) obj2;
                AddKeyStatsItemFlowContract$Step step15 = (AddKeyStatsItemFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator8, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof AddKeyStatsItemFlowContract$Step.ViewGroupList) {
                    AddKeyStatsViewGroupsScreen addKeyStatsViewGroupsScreen = new AddKeyStatsViewGroupsScreen(new AddKeyStatsViewGroupsScreenContract$Input(bVar8.f208904a, ((AddKeyStatsItemFlowContract$Step.ViewGroupList) step15).f103821a, bVar8.f208906c));
                    mtk.f block23 = new mtk.f(aVar11, FlowCoordinator8, step15);
                    Intrinsics.checkNotNullParameter(block23, "block");
                    addKeyStatsViewGroupsScreen.H = block23;
                    return addKeyStatsViewGroupsScreen;
                }
                if (!(step15 instanceof AddKeyStatsItemFlowContract$Step.ViewGroupItems)) {
                    throw new NoWhenBranchMatchedException();
                }
                AddKeyStatsItemFlowContract$Step.ViewGroupItems viewGroupItems = (AddKeyStatsItemFlowContract$Step.ViewGroupItems) step15;
                AddKeyStatsViewItemsScreen addKeyStatsViewItemsScreen = new AddKeyStatsViewItemsScreen(new AddKeyStatsViewItemsScreenContract$Input(bVar8.f208904a, viewGroupItems.f103819a, viewGroupItems.f103820b, bVar8.f208906c));
                mtk.f block24 = new mtk.f(aVar11, step15, FlowCoordinator8);
                Intrinsics.checkNotNullParameter(block24, "block");
                addKeyStatsViewItemsScreen.H = block24;
                return addKeyStatsViewItemsScreen;
            case 18:
                com.revolut.biometric_verification.impl.ui.step.selfie_search.flow.a aVar12 = (com.revolut.biometric_verification.impl.ui.step.selfie_search.flow.a) obj6;
                l FlowCoordinator9 = (l) obj2;
                BiometricVerificationSelfieSearchFlowContract$Step step16 = (BiometricVerificationSelfieSearchFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator9, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (!(step16 instanceof BiometricVerificationSelfieSearchFlowContract$Step.CaptureSelfie)) {
                    throw new NoWhenBranchMatchedException();
                }
                CameraKitFlowContract$FlowType.Selfie selfie = new CameraKitFlowContract$FlowType.Selfie(com.revolut.camerakit.revolut.ui.flow.a.TERMINAL);
                CameraKitUiSettings cameraKitUiSettings = new CameraKitUiSettings(new Mask.Empty(false), (HintMessage) localDate, (AnimationType) localDate, i5);
                CaptureMode.AutoCapture autoCapture = new CaptureMode.AutoCapture(i22);
                CameraCaptureSettings.CompactSelfie cameraCaptureSettings = CameraCaptureSettings.CompactSelfie.f50693a;
                CameraKitClientSettings cameraKitClientSettings = new CameraKitClientSettings(cameraCaptureSettings, autoCapture, true);
                ry.a aVar13 = new ry.a(new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.autocapture_selfie_title, null, null, 14), null, null, false, false, false, false, 122);
                AnalyticsProduct.Shared.Vision vision = AnalyticsProduct.Shared.Vision.f;
                String verificationToken = aVar12.o.f208941a;
                Intrinsics.checkNotNullParameter(cameraCaptureSettings, "cameraCaptureSettings");
                Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
                CameraCaptureContext.a aVarNewBuilder = CameraCaptureContext.newBuilder();
                aVarNewBuilder.h(f1.AUTOCAPTURE);
                Intrinsics.checkNotNullExpressionValue(aVarNewBuilder, "setFlowType(...)");
                cs.b.a(aVarNewBuilder, cameraCaptureSettings);
                aVarNewBuilder.i(j1.SELFIE);
                aVarNewBuilder.c();
                ((CameraCaptureContext) aVarNewBuilder.f49761b).setVerificationToken(verificationToken);
                CameraCaptureContext cameraCaptureContext = (CameraCaptureContext) aVarNewBuilder.a();
                AnalyticsContext.INSTANCE.getClass();
                w0 w0VarA = AnalyticsContext.Companion.a(cameraCaptureContext);
                ValidatorConfig[] elements2 = {new FaceInFrameValidatorConfig(0.01f, 0.01f, 0.01f, 0.01f, 12.0f, 2.0f), new FaceQualityValidatorConfig.RevolutVisionFaceQualityValidatorConfig(true, true, true)};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                CameraKitFlow cameraKitFlow = new CameraKitFlow(new ly.c((CameraKitFlowContract$FlowType) selfie, cameraKitUiSettings, cameraKitClientSettings, aVar13, kotlin.collections.d.y0(elements2), (AnalyticsProduct) vision, w0VarA, false, BiometricVerificationFeatures.Companion.a(BiometricVerificationFeatures.INSTANCE), false, 1536), null, 6);
                mm7.h block25 = new mm7.h(1, aVar12, com.revolut.biometric_verification.impl.ui.step.selfie_search.flow.a.class, "handleCameraFlowOutput", "handleCameraFlowOutput(Lcom/revolut/camerakit/revolut/ui/flow/CameraKitFlowContract$OutputData;)V", 0, 19);
                Intrinsics.checkNotNullParameter(block25, "block");
                cameraKitFlow.H = block25;
                return cameraKitFlow;
            case 19:
                com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.a aVar14 = (com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AccountClosureFeatureRatingScreenContract$Step step17 = (AccountClosureFeatureRatingScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (!(step17 instanceof AccountClosureFeatureRatingScreenContract$Step.FeatureRatingFeedback)) {
                    throw new NoWhenBranchMatchedException();
                }
                AccountClosureFeatureRatingScreenContract$Step.FeatureRatingFeedback featureRatingFeedback = (AccountClosureFeatureRatingScreenContract$Step.FeatureRatingFeedback) step17;
                AccountClosureFeatureRatingFeedbackScreen accountClosureFeatureRatingFeedbackScreen = new AccountClosureFeatureRatingFeedbackScreen(new AccountClosureFeatureRatingFeedbackScreenContract$InputData(featureRatingFeedback.f94947a, featureRatingFeedback.f94948b));
                mqi.a block26 = new mqi.a(aVar14, i5);
                Intrinsics.checkNotNullParameter(block26, "block");
                accountClosureFeatureRatingFeedbackScreen.H = block26;
                return accountClosureFeatureRatingFeedbackScreen;
            case 20:
                ouk.a aVar15 = ((com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.a) obj6).f103871q;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TechnicalInsightsControllerContract$ModalStep modalStep = (TechnicalInsightsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(modalStep, "modalStep");
                if (modalStep instanceof TechnicalInsightsControllerContract$ModalStep.MovingAveragesDetails) {
                    int i102 = com.revolut.retail.wealth.resources.R$string.instrument_insights_technicals_moving_averages;
                    int i103 = com.revolut.retail.wealth.resources.R$string.instrument_insights_technicals_moving_averages_description;
                    aVar15.getClass();
                    aVarA = ouk.a.a(i102, i103);
                } else {
                    if (!(modalStep instanceof TechnicalInsightsControllerContract$ModalStep.OscillatorsDetails)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i104 = com.revolut.retail.wealth.resources.R$string.instrument_insights_technicals_oscillators;
                    int i105 = com.revolut.retail.wealth.resources.R$string.instrument_insights_technicals_oscillators_description;
                    aVar15.getClass();
                    aVarA = ouk.a.a(i104, i105);
                }
                return new ActionsBottomSheetController(aVarA);
            case 21:
                com.revolut.feature.kyc.impl.external.web.flow.a aVar16 = (com.revolut.feature.kyc.impl.external.web.flow.a) obj6;
                ExternalWebKycProviderFlowContract$InputData externalWebKycProviderFlowContract$InputData = aVar16.o;
                l FlowCoordinator10 = (l) obj2;
                ExternalWebKycProviderFlowContract$Step step18 = (ExternalWebKycProviderFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator10, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step18, "step");
                if (Intrinsics.f(step18, ExternalWebKycProviderFlowContract$Step.Portal.f77662a)) {
                    return new ChromePortalScreen(new ChromePortalScreenContract$InputData(externalWebKycProviderFlowContract$InputData.f77661b));
                }
                if (!Intrinsics.f(step18, ExternalWebKycProviderFlowContract$Step.Prompt.f77663a)) {
                    throw new NoWhenBranchMatchedException();
                }
                iv8.a aVar17 = aVar16.f77664p;
                lv8.a externalKycProviderPortal = externalWebKycProviderFlowContract$InputData.f77660a;
                aVar17.getClass();
                Intrinsics.checkNotNullParameter(externalKycProviderPortal, "externalKycProviderPortal");
                ExternalKycPromptConfiguration externalKycPromptConfigurationC = iv8.a.c(externalKycProviderPortal.a(), com.revolut.feature.kyc.api.R$string.kyc_external_prompt_subtitle);
                aVar16.f77665q.getClass();
                PromptMarketingScreen promptMarketingScreen4 = new PromptMarketingScreen(iv8.c.a(externalKycPromptConfigurationC));
                mqi.a block27 = new mqi.a(aVar16, i6);
                Intrinsics.checkNotNullParameter(block27, "block");
                promptMarketingScreen4.H = block27;
                return promptMarketingScreen4;
            case 22:
                return a(obj2, obj3);
            case 23:
                return b(obj2, obj3);
            case 24:
                return c(obj2, obj3);
            case 25:
                return d(obj2, obj3);
            case 26:
                return e(obj2, obj3);
            case 27:
                return g(obj2, obj3);
            case 28:
                return h(obj2, obj3);
            default:
                com.revolut.feature.card_management.impl.cardlimit.flow.a aVar18 = (com.revolut.feature.card_management.impl.cardlimit.flow.a) obj6;
                l FlowCoordinator11 = (l) obj2;
                CardLimitFlowContract$Step step19 = (CardLimitFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator11, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step19, "step");
                if (!(step19 instanceof CardLimitFlowContract$Step.CardLimitOverview)) {
                    if (step19 instanceof CardLimitFlowContract$Step.CardSetLimit) {
                        return new CardSetLimitScreen(new CardSetLimitScreenContract$InputData(((CardLimitFlowContract$Step.CardSetLimit) step19).f64826a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                CardLimitOverviewScreen cardLimitOverviewScreen = new CardLimitOverviewScreen(new CardLimitOverviewScreenContract$InputData(aVar18.o.f210574a));
                mt9.c block28 = new mt9.c(aVar18, FlowCoordinator11, i21);
                Intrinsics.checkNotNullParameter(block28, "block");
                cardLimitOverviewScreen.H = block28;
                return cardLimitOverviewScreen;
        }
    }
}
