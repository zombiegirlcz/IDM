package pu4;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import b4c.l;
import cli.y;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$InputData;
import com.revolut.biometric_verification.impl.ui.flow.launcher.BiometricVerificationLauncherFlow;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TrackableClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.ui.api.navigation.CardReaderFlowDestination;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressValidationMode;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.common.api.navigation.FindAddressControllerDescriptor$InputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressVerificationUseCase;
import com.revolut.feature.apm.breb.api.navigation.BrebTransferNavigation$InputData;
import com.revolut.feature.apm.breb.impl.flow.area.BrebAreaFlowContract$Step;
import com.revolut.feature.apm.breb.impl.ui.area.BrebAreaScreen;
import com.revolut.feature.apm.breb.impl.ui.key_replace.BrebKeyReplaceScreen;
import com.revolut.feature.apm.breb.impl.ui.keys.BrebKeysScreen;
import com.revolut.feature.apm.breb.impl.ui.keys.occupied_dialog.BrebOccupiedDialogController;
import com.revolut.feature.apm.breb.impl.ui.more.BrebMoreScreen;
import com.revolut.feature.apm.breb.impl.ui.qr_request.BrebQrRequestFlow;
import com.revolut.feature.apm.breb.impl.ui.qr_request.BrebQrRequestFlowContract$InputData;
import com.revolut.feature.apm.breb.impl.ui.transfer.BrebTransferFlow;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.feature.apm.core.ui.api.mapper.ApmFooterContent;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewAliasNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrScannerInputData;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.ApmNewContactContract$ModalStep;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.select_account.ApmSelectAccountContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.select_account.ApmSelectAccountController;
import com.revolut.feature.card_management.impl.cardlimit.screens.setlimit.CardSetLimitScreen;
import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsScreenContract$ModalStep;
import com.revolut.feature.card_order_new.api.GetCardFeatureConfig;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationScreenContract$ModalStep;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.dialog.confirm_different_address.ConfirmDifferentAddressController;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_to_form.DeliveryToFormController;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_to_form.DeliveryToFormScreenContract$InputData;
import com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.CardOrderExperimentFlowContract$InputData;
import com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.CardOrderExperimentFlowContract$Step;
import com.revolut.feature.cards.models.delivery.CardDeliveryRecipient;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Config;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$State;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.input.CreditAddressInputScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.input.CreditAddressInputScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.selection.CreditAddressSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.selection.CreditAddressSelectionScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.flow.CreditCardRepayWithReviewFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.flow.CreditCardRepayWithReviewFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreen;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreen;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.flow.CreditCardStatementDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.statement.details.flow.CreditCardStatementDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.flow.CreditCardStatementFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.flow.CreditCardStatementFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.statement.hub.CreditCardStatementHubScreen;
import com.revolut.feature.credit.card.impl.ui.statement.hub.CreditCardStatementHubScreenContract$InputData;
import com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.DeFiSendAddBeneficiaryScreenContract$Modal;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.profile.tax.flow.FreelancerTaxSettingsFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.profile.tax.screen.dates.FreelancerTaxDatesScreen;
import com.revolut.feature.freelancer.impl.ui.profile.tax.screen.settings.FreelancerTaxSettingsScreen;
import com.revolut.feature.freelancer.impl.ui.profile.vat.FreelancerVatScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.settings.flow.TaxHubSettingsFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.settings.flow.TaxHubSettingsFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.tax_reminder.TaxHubReminderScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.tax_reminder.TaxHubReminderScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.insurance_pet.impl.ui.add.step.age.PetAgeFragment;
import com.revolut.feature.kyc.impl.cmd.flow.CmdFlowContract$Step;
import com.revolut.feature.kyc.impl.cmd.screen.CmdController;
import com.revolut.feature.kyc.impl.cmd.screen.CmdControllerContract$InputData;
import com.revolut.feature.kyc.impl.document_collection.flow.DocumentCollectionFlow;
import com.revolut.feature.kyc.impl.flow.kyc.KycFlowContract$InputData;
import com.revolut.feature.kyc.impl.flow.kyc.KycFlowContract$Step;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreen;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreenContract$InputData;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreenItem;
import com.revolut.feature.kyc.impl.screens.incode_consent.IncodeDocumentProcessingConsentContract$InputData;
import com.revolut.feature.kyc.impl.screens.incode_consent.IncodeDocumentProcessingConsentScreen;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.add_recipient.AddRecipientContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.add_recipient.AddRecipientController;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.search.PaymentsSearchScreenContract$ModalStep;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.referrals.common.data.api.domain.model.common.AdditionalInfo;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$ModalStep;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.impl.ui.opt_in.flow.LifestyleRevPointsFlowContract$Step;
import com.revolut.feature.rev_points.impl.ui.opt_in.screen.RevPointsOptInScreen;
import com.revolut.feature.rev_points.impl.ui.opt_in.screen.RevPointsOptInScreenContract$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Mode;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$CompletionMode;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$InputData;
import com.revolut.feature.revolut_shop.api.R$plurals;
import com.revolut.feature.revolut_shop.ui.flow.ipp_shop.IppShopFlowContract$Step;
import com.revolut.feature.revolut_shop.ui.flow.order_history.OrderHistoryFlow;
import com.revolut.feature.revolut_shop.ui.screen.cart.IppShopCartScreen;
import com.revolut.feature.revolut_shop.ui.screen.checkout.CheckoutScreen;
import com.revolut.feature.revolut_shop.ui.screen.dashboard.IppShopDashboardScreen;
import com.revolut.feature.revolut_shop.ui.screen.orderconfirmation.OrderConfirmationScreen;
import com.revolut.feature.revolut_shop.ui.screen.orderconfirmation.OrderConfirmationScreenContract$InputData;
import com.revolut.feature.revolut_shop.ui.screen.product.IppShopProductScreen;
import com.revolut.feature.revolut_shop.ui.screen.product.IppShopProductScreenContract$InputData;
import com.revolut.feature.security_hub.api.models.StreetModeDelayDuration;
import com.revolut.feature.security_hub.api.models.StreetModeDelayDurationDisclaimer;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation;
import com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlowContract$Step;
import com.revolut.feature.security_hub.impl.ui.street_mode.name_location.NameLocationScreen;
import com.revolut.feature.security_hub.impl.ui.street_mode.name_location.NameLocationScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreen;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.TrustedLocationsListScreen;
import com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.TrustedWifisListScreen;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreen;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreenContract$Step;
import com.revolut.feature.semi_independent_activation.impl.ui.activation.SemiIndependentActivationFlowContract$Step;
import com.revolut.feature.semi_independent_activation.impl.ui.details.SemiIndependentActivationDetailsScreen;
import com.revolut.feature.semi_independent_activation.impl.ui.details.SemiIndependentActivationDetailsScreenContract$InputData;
import com.revolut.feature.statements.api.models.CustomisationState;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.ConsolidatedStatementCustomisationScreen;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.ConsolidatedStatementCustomisationScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.consolidated.screen.ConsolidatedStatementScreenContract$ModalStep;
import com.revolut.feature.statements.impl.ui.consolidated.screen.model.SelectableProductType;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.ThreeDsScreen;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.TopupWithNewCardFlowContract$Step;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowControllerContract$Page;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.StockDetailsFeedController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.StockDetailsFeedControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials.StockFinancialsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials.StockFinancialsControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.StockOrderBookController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.StockOrderBookControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewControllerContract$InputData;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import d67.p;
import d67.s;
import d67.t;
import d67.u;
import do3.n;
import grl.k9;
import grl.q6;
import h93.j0;
import h93.l0;
import hx2.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mii.k;
import oki.h;
import org.jmrtd.lds.LDSFile;
import p4c.o;
import p4c.p;
import pth.m;
import q03.i0;
import q23.q;
import qu4.j;
import r07.e;
import rp0.g1;
import rp0.k1;
import rv1.x;
import s0d.h;
import su4.j;
import til.r;
import u07.f;
import u07.g;
import u07.i;
import u3c.f;
import uv1.v;
import vkm.j2;
import vtc.f0;
import yki.l;
import zh9.u0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f239821b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f239820a = i;
        this.f239821b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        final com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar = (com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a) this.f239821b;
        l FlowCoordinator = (l) obj2;
        FreelancerTaxSettingsFlowContract$Step step = (FreelancerTaxSettingsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof FreelancerTaxSettingsFlowContract$Step.TaxDates) {
            FreelancerTaxDatesScreen freelancerTaxDatesScreen = new FreelancerTaxDatesScreen();
            final int i = 3;
            Function1 block = new Function1() { // from class: q07.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            i outputData = (i) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z = outputData instanceof f;
                            com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar2 = aVar;
                            if (z) {
                                h.t2(aVar2, aVar2.o, FreelancerTaxSettingsFlowContract$Step.TaxDates.f74056a, true, null, false, 12);
                            } else if (outputData instanceof u07.h) {
                                h.t2(aVar2, aVar2.o, FreelancerTaxSettingsFlowContract$Step.Vat.f74061a, true, null, false, 12);
                            } else {
                                if (!(outputData instanceof g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.w2(aVar2.o, new FreelancerTaxSettingsFlowContract$Step.VatReminder(((g) outputData).f276080a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                            return Unit.f186387a;
                        case 1:
                            hr6.h outputData2 = (hr6.h) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            if (outputData2 instanceof hr6.f) {
                                com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar3 = aVar;
                                hr6.f fVar = (hr6.f) outputData2;
                                h.t2(aVar3, aVar3.o, new FreelancerTaxSettingsFlowContract$Step.TaxHubSettings(fVar.f154778a, fVar.f154779b, false), true, null, false, 12);
                            } else if (!Intrinsics.f(outputData2, hr6.g.f154780a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 2:
                            y07.h outputData3 = (y07.h) obj4;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            boolean z3 = outputData3.f310159a;
                            com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar4 = aVar;
                            if (z3) {
                                aVar4.X1(new k("DIALOG_ID_VAT_UPDATE", new TextLocalisedClause(R$string.freelancer_vat_editing_confirmation_title, null, null, 14), null, null, null, 28));
                            }
                            h.D2(aVar4.o);
                            return Unit.f186387a;
                        default:
                            e outputData4 = (e) obj4;
                            Intrinsics.checkNotNullParameter(outputData4, "outputData");
                            if (outputData4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar5 = aVar;
                            h.t2(aVar5, aVar5.o, new FreelancerTaxSettingsFlowContract$Step.TaxHubSettings(outputData4.f250709a, outputData4.f250710b, true), true, null, false, 12);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            freelancerTaxDatesScreen.H = block;
            return freelancerTaxDatesScreen;
        }
        if (step instanceof FreelancerTaxSettingsFlowContract$Step.TaxHubSettings) {
            FreelancerTaxSettingsFlowContract$Step.TaxHubSettings taxHubSettings = (FreelancerTaxSettingsFlowContract$Step.TaxHubSettings) step;
            return new TaxHubSettingsFlow(new TaxHubSettingsFlowContract$InputData(taxHubSettings.f74057a, taxHubSettings.f74058b, taxHubSettings.f74059c));
        }
        if (step instanceof FreelancerTaxSettingsFlowContract$Step.TaxSettings) {
            FreelancerTaxSettingsScreen freelancerTaxSettingsScreen = new FreelancerTaxSettingsScreen();
            final int i2 = 0;
            Function1 block2 = new Function1() { // from class: q07.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            i outputData = (i) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z = outputData instanceof f;
                            com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar2 = aVar;
                            if (z) {
                                h.t2(aVar2, aVar2.o, FreelancerTaxSettingsFlowContract$Step.TaxDates.f74056a, true, null, false, 12);
                            } else if (outputData instanceof u07.h) {
                                h.t2(aVar2, aVar2.o, FreelancerTaxSettingsFlowContract$Step.Vat.f74061a, true, null, false, 12);
                            } else {
                                if (!(outputData instanceof g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.w2(aVar2.o, new FreelancerTaxSettingsFlowContract$Step.VatReminder(((g) outputData).f276080a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                            return Unit.f186387a;
                        case 1:
                            hr6.h outputData2 = (hr6.h) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            if (outputData2 instanceof hr6.f) {
                                com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar3 = aVar;
                                hr6.f fVar = (hr6.f) outputData2;
                                h.t2(aVar3, aVar3.o, new FreelancerTaxSettingsFlowContract$Step.TaxHubSettings(fVar.f154778a, fVar.f154779b, false), true, null, false, 12);
                            } else if (!Intrinsics.f(outputData2, hr6.g.f154780a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 2:
                            y07.h outputData3 = (y07.h) obj4;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            boolean z3 = outputData3.f310159a;
                            com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar4 = aVar;
                            if (z3) {
                                aVar4.X1(new k("DIALOG_ID_VAT_UPDATE", new TextLocalisedClause(R$string.freelancer_vat_editing_confirmation_title, null, null, 14), null, null, null, 28));
                            }
                            h.D2(aVar4.o);
                            return Unit.f186387a;
                        default:
                            e outputData4 = (e) obj4;
                            Intrinsics.checkNotNullParameter(outputData4, "outputData");
                            if (outputData4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar5 = aVar;
                            h.t2(aVar5, aVar5.o, new FreelancerTaxSettingsFlowContract$Step.TaxHubSettings(outputData4.f250709a, outputData4.f250710b, true), true, null, false, 12);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            freelancerTaxSettingsScreen.H = block2;
            return freelancerTaxSettingsScreen;
        }
        if (step instanceof FreelancerTaxSettingsFlowContract$Step.Vat) {
            FreelancerVatScreen freelancerVatScreen = new FreelancerVatScreen();
            final int i3 = 2;
            Function1 function1 = new Function1() { // from class: q07.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            i outputData = (i) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z = outputData instanceof f;
                            com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar2 = aVar;
                            if (z) {
                                h.t2(aVar2, aVar2.o, FreelancerTaxSettingsFlowContract$Step.TaxDates.f74056a, true, null, false, 12);
                            } else if (outputData instanceof u07.h) {
                                h.t2(aVar2, aVar2.o, FreelancerTaxSettingsFlowContract$Step.Vat.f74061a, true, null, false, 12);
                            } else {
                                if (!(outputData instanceof g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.w2(aVar2.o, new FreelancerTaxSettingsFlowContract$Step.VatReminder(((g) outputData).f276080a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                            return Unit.f186387a;
                        case 1:
                            hr6.h outputData2 = (hr6.h) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            if (outputData2 instanceof hr6.f) {
                                com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar3 = aVar;
                                hr6.f fVar = (hr6.f) outputData2;
                                h.t2(aVar3, aVar3.o, new FreelancerTaxSettingsFlowContract$Step.TaxHubSettings(fVar.f154778a, fVar.f154779b, false), true, null, false, 12);
                            } else if (!Intrinsics.f(outputData2, hr6.g.f154780a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 2:
                            y07.h outputData3 = (y07.h) obj4;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            boolean z3 = outputData3.f310159a;
                            com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar4 = aVar;
                            if (z3) {
                                aVar4.X1(new k("DIALOG_ID_VAT_UPDATE", new TextLocalisedClause(R$string.freelancer_vat_editing_confirmation_title, null, null, 14), null, null, null, 28));
                            }
                            h.D2(aVar4.o);
                            return Unit.f186387a;
                        default:
                            e outputData4 = (e) obj4;
                            Intrinsics.checkNotNullParameter(outputData4, "outputData");
                            if (outputData4 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar5 = aVar;
                            h.t2(aVar5, aVar5.o, new FreelancerTaxSettingsFlowContract$Step.TaxHubSettings(outputData4.f250709a, outputData4.f250710b, true), true, null, false, 12);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            freelancerVatScreen.H = function1;
            return freelancerVatScreen;
        }
        if (!(step instanceof FreelancerTaxSettingsFlowContract$Step.VatReminder)) {
            throw new NoWhenBranchMatchedException();
        }
        TaxHubReminderScreen taxHubReminderScreen = new TaxHubReminderScreen(new TaxHubReminderScreenContract$InputData(((FreelancerTaxSettingsFlowContract$Step.VatReminder) step).f74062a, true));
        final int i5 = 1;
        Function1 block3 = new Function1() { // from class: q07.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i5) {
                    case 0:
                        i outputData = (i) obj4;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        boolean z = outputData instanceof f;
                        com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar2 = aVar;
                        if (z) {
                            h.t2(aVar2, aVar2.o, FreelancerTaxSettingsFlowContract$Step.TaxDates.f74056a, true, null, false, 12);
                        } else if (outputData instanceof u07.h) {
                            h.t2(aVar2, aVar2.o, FreelancerTaxSettingsFlowContract$Step.Vat.f74061a, true, null, false, 12);
                        } else {
                            if (!(outputData instanceof g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            h.w2(aVar2.o, new FreelancerTaxSettingsFlowContract$Step.VatReminder(((g) outputData).f276080a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        }
                        return Unit.f186387a;
                    case 1:
                        hr6.h outputData2 = (hr6.h) obj4;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        if (outputData2 instanceof hr6.f) {
                            com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar3 = aVar;
                            hr6.f fVar = (hr6.f) outputData2;
                            h.t2(aVar3, aVar3.o, new FreelancerTaxSettingsFlowContract$Step.TaxHubSettings(fVar.f154778a, fVar.f154779b, false), true, null, false, 12);
                        } else if (!Intrinsics.f(outputData2, hr6.g.f154780a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                    case 2:
                        y07.h outputData3 = (y07.h) obj4;
                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                        boolean z3 = outputData3.f310159a;
                        com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar4 = aVar;
                        if (z3) {
                            aVar4.X1(new k("DIALOG_ID_VAT_UPDATE", new TextLocalisedClause(R$string.freelancer_vat_editing_confirmation_title, null, null, 14), null, null, null, 28));
                        }
                        h.D2(aVar4.o);
                        return Unit.f186387a;
                    default:
                        e outputData4 = (e) obj4;
                        Intrinsics.checkNotNullParameter(outputData4, "outputData");
                        if (outputData4 == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a aVar5 = aVar;
                        h.t2(aVar5, aVar5.o, new FreelancerTaxSettingsFlowContract$Step.TaxHubSettings(outputData4.f250709a, outputData4.f250710b, true), true, null, false, 12);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        taxHubReminderScreen.H = block3;
        return taxHubReminderScreen;
    }

    private final Object b(Object obj2, Object obj3) {
        final com.revolut.feature.semi_independent_activation.impl.ui.activation.b bVar = (com.revolut.feature.semi_independent_activation.impl.ui.activation.b) this.f239821b;
        l FlowCoordinator = (l) obj2;
        SemiIndependentActivationFlowContract$Step step = (SemiIndependentActivationFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof SemiIndependentActivationFlowContract$Step.Details) {
            SemiIndependentActivationDetailsScreen semiIndependentActivationDetailsScreen = new SemiIndependentActivationDetailsScreen(new SemiIndependentActivationDetailsScreenContract$InputData(bVar.o.f85970a));
            final int i = 0;
            Function1 block = new Function1() { // from class: q0d.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            s0d.h result = (s0d.h) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            com.revolut.feature.semi_independent_activation.impl.ui.activation.b bVar2 = bVar;
                            yki.a aVar = bVar2.f85977r;
                            if (result instanceof h.a) {
                                oki.h.D2(aVar);
                            } else if (result instanceof s0d.i) {
                                oki.h.w2(aVar, new SemiIndependentActivationFlowContract$Step.DeclineConfirmation(((s0d.i) result).f258945a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            } else {
                                if (!(result instanceof s0d.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.l2(new d(bVar2, ((s0d.g) result).f258943a, null, 0), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        default:
                            r output = (r) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            bVar.I2(output);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            semiIndependentActivationDetailsScreen.H = block;
            return semiIndependentActivationDetailsScreen;
        }
        if (step instanceof SemiIndependentActivationFlowContract$Step.DeclineConfirmation) {
            k9 value = k9.Junior;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.semi_independent_activation.impl.R$string.guardian_invitation_decline_invitation_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.semi_independent_activation.impl.R$string.guardian_invitation_decline_invitation_subtitle, null, null, 14), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.semi_independent_activation.impl.R$string.guardian_invitation_decline_invitation_action_decline, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.semi_independent_activation.impl.R$string.guardian_invitation_decline_invitation_action_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), new AnalyticsProduct.Retail(value), null, null, 24));
            m block2 = new m(bVar, (SemiIndependentActivationFlowContract$Step.DeclineConfirmation) step, 22);
            Intrinsics.checkNotNullParameter(block2, "block");
            actionsBottomSheetController.H = block2;
            return actionsBottomSheetController;
        }
        if (!(step instanceof SemiIndependentActivationFlowContract$Step.Workflow)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((SemiIndependentActivationFlowContract$Step.Workflow) step).f85973a;
        til.m mVar = bVar.f85976q;
        q6 value2 = q6.Junior;
        Parcelable.Creator<AnalyticsProduct.Junior> creator2 = AnalyticsProduct.Junior.CREATOR;
        Intrinsics.checkNotNullParameter(value2, "value");
        WorkflowFlow workflowFlowB = til.m.b(mVar, new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, (String) null, new AnalyticsProduct.Junior(value2), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG), WorkflowFlowType.Inner.f105817a, null, 60);
        final int i2 = 1;
        Function1 block3 = new Function1() { // from class: q0d.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        s0d.h result = (s0d.h) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        com.revolut.feature.semi_independent_activation.impl.ui.activation.b bVar2 = bVar;
                        yki.a aVar = bVar2.f85977r;
                        if (result instanceof h.a) {
                            oki.h.D2(aVar);
                        } else if (result instanceof s0d.i) {
                            oki.h.w2(aVar, new SemiIndependentActivationFlowContract$Step.DeclineConfirmation(((s0d.i) result).f258945a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        } else {
                            if (!(result instanceof s0d.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar2.l2(new d(bVar2, ((s0d.g) result).f258943a, null, 0), new yi5.b(26));
                        }
                        return Unit.f186387a;
                    default:
                        r output = (r) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        bVar.I2(output);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        workflowFlowB.H = block3;
        workflowFlowB.l2(new pyc.a(bVar, 6));
        return workflowFlowB;
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.feature.apm.core.ui.impl.ui.new_contact.a aVar = (com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) this.f239821b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        ApmNewContactContract$ModalStep step = (ApmNewContactContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof ApmNewContactContract$ModalStep.SelectAccount)) {
            throw new NoWhenBranchMatchedException();
        }
        ApmSelectAccountController apmSelectAccountController = new ApmSelectAccountController(new ApmSelectAccountContract$InputData(((ApmNewContactContract$ModalStep.SelectAccount) step).f62350a));
        q22.l block = new q22.l(aVar, 2);
        Intrinsics.checkNotNullParameter(block, "block");
        apmSelectAccountController.H = block;
        return apmSelectAccountController;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar = (com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b) this.f239821b;
        y yVar = bVar.B;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CardDeliveryAddressVerificationScreenContract$ModalStep step = (CardDeliveryAddressVerificationScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CardDeliveryAddressVerificationScreenContract$ModalStep.ConfirmDifferentAddressDialog) {
            ConfirmDifferentAddressController confirmDifferentAddressController = new ConfirmDifferentAddressController();
            m block = new m(bVar, step, 24);
            Intrinsics.checkNotNullParameter(block, "block");
            confirmDifferentAddressController.H = block;
            return confirmDifferentAddressController;
        }
        if (!(step instanceof CardDeliveryAddressVerificationScreenContract$ModalStep.ShowDeliveryToForm)) {
            throw new NoWhenBranchMatchedException();
        }
        CardDeliveryRecipient cardDeliveryRecipient = ((q) ((j2) yVar.f22677a).getValue()).f241517l;
        n nVar = (n) ((q) ((j2) yVar.f22677a).getValue()).i.getContent();
        String str = cardDeliveryRecipient != null ? cardDeliveryRecipient.f65526a : null;
        if (str == null) {
            str = "";
        }
        String str2 = cardDeliveryRecipient != null ? cardDeliveryRecipient.f65527b : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = cardDeliveryRecipient != null ? cardDeliveryRecipient.f65528c : null;
        DeliveryToFormController deliveryToFormController = new DeliveryToFormController(new DeliveryToFormScreenContract$InputData(new CardDeliveryRecipient(str, str2, str3 != null ? str3 : "")));
        m block2 = new m(nVar, bVar, 25);
        Intrinsics.checkNotNullParameter(block2, "block");
        deliveryToFormController.H = block2;
        return deliveryToFormController;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [hx2.m] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.revolut.core.ui_kit.delegates.jd, com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v6 */
    private final Object e(Object obj2, Object obj3) {
        final com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b bVar = (com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b) this.f239821b;
        q33.f fVar = bVar.f65223q;
        CardOrderExperimentFlowContract$InputData cardOrderExperimentFlowContract$InputData = bVar.o;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        CardOrderExperimentFlowContract$Step step = (CardOrderExperimentFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, CardOrderExperimentFlowContract$Step.MarketingPrompt.f65218a)) {
            GetCardFeatureConfig getCardFeatureConfig = cardOrderExperimentFlowContract$InputData.f65217a;
            boolean z = getCardFeatureConfig.e;
            AnalyticsProduct automaticEventProduct = getCardFeatureConfig.f;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.card_order_new.impl.R$string.pick_your_first_card_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.card_order_new.impl.R$string.pick_your_first_card_subtitle, null, null, 14);
            PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent fullScreenMediaContent = new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(new UrlVideo("https://assets.revolut.com/mobile/cards/post_activation_pick_your_first_card.mp4", (String) null, false, oz0.b.CENTER_CROP, false, (oz0.c) null, 114), , , 6);
            ResourceImage resourceImage = z ? new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null;
            String str = null;
            PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("OnboardingCardsExperimentPrompt", textLocalisedClause, textLocalisedClause2, fullScreenMediaContent, null, null, resourceImage, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.card_order_new.impl.R$string.pick_your_first_card_cta, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.card_order_new.impl.R$string.pick_your_first_card_secondary_action, null, null, 14), (ResourceImage) (false ? 1 : 0), (LargeActionButton.ButtonStyle) null, false, str, 62), false ? 1 : 0, null, str, null, null, null, null, null, null, null, 2095536), automaticEventProduct, false, false, null, 28));
            final int i = 0;
            Function1 block = new Function1() { // from class: q33.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) throws Throwable {
                    switch (i) {
                        case 0:
                            u output = (u) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF = Intrinsics.f(output, s.f111464a);
                            com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b bVar2 = bVar;
                            if (zF) {
                                bVar2.J2();
                            } else if (Intrinsics.f(output, t.f111465a)) {
                                bVar2.K2(CardOrderExperimentFlowContract$Step.PushbackSheet.f65220a, true);
                            } else if (Intrinsics.f(output, d67.q.f111462a)) {
                                bVar2.B2();
                            } else {
                                if (!(output instanceof p) && !Intrinsics.f(output, d67.r.f111463a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                hx7.e.n(new IllegalStateException("Unexpected PromptMarketingScreen output: " + output));
                            }
                            return Unit.f186387a;
                        case 1:
                            dii.g output2 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean zF2 = Intrinsics.f(output2, dii.e.f115068a);
                            com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b bVar3 = bVar;
                            if (zF2) {
                                bVar3.J2();
                            } else if (Intrinsics.f(output2, dii.f.f115069a)) {
                                bVar3.K2(CardOrderExperimentFlowContract$Step.VirtualCatalogue.f65221a, true);
                            }
                            return Unit.f186387a;
                        case 2:
                            hx2.b output3 = (hx2.b) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (Intrinsics.f(output3, b.C0895b.f156359a)) {
                                bVar.K2(CardOrderExperimentFlowContract$Step.PushbackSheet.f65220a, true);
                            } else if (!Intrinsics.f(output3, b.a.f156358a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        default:
                            hx2.b output4 = (hx2.b) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (!Intrinsics.f(output4, b.C0895b.f156359a)) {
                                if (!Intrinsics.f(output4, b.a.f156358a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b bVar4 = bVar;
                                if (oki.h.E2(bVar4.v, new q2a.a(23))) {
                                    bVar4.B2();
                                } else {
                                    bVar4.K2(CardOrderExperimentFlowContract$Step.PhysicalCatalogue.f65219a, false);
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            promptMarketingScreen.H = block;
            return promptMarketingScreen;
        }
        if (Intrinsics.f(step, CardOrderExperimentFlowContract$Step.PushbackSheet.f65220a)) {
            AnalyticsProduct automaticEventProduct2 = cardOrderExperimentFlowContract$InputData.f65217a.f;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(automaticEventProduct2, "automaticEventProduct");
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.card_order_new.impl.R$string.card_choice_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.card_order_new.impl.R$string.card_choice_subtitle, null, null, 14), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.card_order_new.impl.R$string.card_choice_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.card_order_new.impl.R$string.card_choice_secondary_action, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), automaticEventProduct2, null, null, 16));
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: q33.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) throws Throwable {
                    switch (i2) {
                        case 0:
                            u output = (u) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF = Intrinsics.f(output, s.f111464a);
                            com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b bVar2 = bVar;
                            if (zF) {
                                bVar2.J2();
                            } else if (Intrinsics.f(output, t.f111465a)) {
                                bVar2.K2(CardOrderExperimentFlowContract$Step.PushbackSheet.f65220a, true);
                            } else if (Intrinsics.f(output, d67.q.f111462a)) {
                                bVar2.B2();
                            } else {
                                if (!(output instanceof p) && !Intrinsics.f(output, d67.r.f111463a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                hx7.e.n(new IllegalStateException("Unexpected PromptMarketingScreen output: " + output));
                            }
                            return Unit.f186387a;
                        case 1:
                            dii.g output2 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean zF2 = Intrinsics.f(output2, dii.e.f115068a);
                            com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b bVar3 = bVar;
                            if (zF2) {
                                bVar3.J2();
                            } else if (Intrinsics.f(output2, dii.f.f115069a)) {
                                bVar3.K2(CardOrderExperimentFlowContract$Step.VirtualCatalogue.f65221a, true);
                            }
                            return Unit.f186387a;
                        case 2:
                            hx2.b output3 = (hx2.b) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (Intrinsics.f(output3, b.C0895b.f156359a)) {
                                bVar.K2(CardOrderExperimentFlowContract$Step.PushbackSheet.f65220a, true);
                            } else if (!Intrinsics.f(output3, b.a.f156358a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        default:
                            hx2.b output4 = (hx2.b) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (!Intrinsics.f(output4, b.C0895b.f156359a)) {
                                if (!Intrinsics.f(output4, b.a.f156358a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b bVar4 = bVar;
                                if (oki.h.E2(bVar4.v, new q2a.a(23))) {
                                    bVar4.B2();
                                } else {
                                    bVar4.K2(CardOrderExperimentFlowContract$Step.PhysicalCatalogue.f65219a, false);
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            actionsBottomSheetController.H = block2;
            return actionsBottomSheetController;
        }
        if (Intrinsics.f(step, CardOrderExperimentFlowContract$Step.PhysicalCatalogue.f65219a)) {
            GetCardFeatureConfig getCardFeatureConfig2 = cardOrderExperimentFlowContract$InputData.f65217a;
            ViewController viewControllerE1 = bVar.e1(new hx2.a(getCardFeatureConfig2.f64967c, c93.e.PHYSICAL, j0.RETAIL, l0.DEBIT, getCardFeatureConfig2.d, getCardFeatureConfig2.f, bVar.u == q33.g.VARIANT_3 ? hx2.m.GO_VIRTUAL : null, 258016));
            final int i3 = 2;
            Function1 block3 = new Function1() { // from class: q33.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) throws Throwable {
                    switch (i3) {
                        case 0:
                            u output = (u) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF = Intrinsics.f(output, s.f111464a);
                            com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b bVar2 = bVar;
                            if (zF) {
                                bVar2.J2();
                            } else if (Intrinsics.f(output, t.f111465a)) {
                                bVar2.K2(CardOrderExperimentFlowContract$Step.PushbackSheet.f65220a, true);
                            } else if (Intrinsics.f(output, d67.q.f111462a)) {
                                bVar2.B2();
                            } else {
                                if (!(output instanceof p) && !Intrinsics.f(output, d67.r.f111463a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                hx7.e.n(new IllegalStateException("Unexpected PromptMarketingScreen output: " + output));
                            }
                            return Unit.f186387a;
                        case 1:
                            dii.g output2 = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean zF2 = Intrinsics.f(output2, dii.e.f115068a);
                            com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b bVar3 = bVar;
                            if (zF2) {
                                bVar3.J2();
                            } else if (Intrinsics.f(output2, dii.f.f115069a)) {
                                bVar3.K2(CardOrderExperimentFlowContract$Step.VirtualCatalogue.f65221a, true);
                            }
                            return Unit.f186387a;
                        case 2:
                            hx2.b output3 = (hx2.b) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (Intrinsics.f(output3, b.C0895b.f156359a)) {
                                bVar.K2(CardOrderExperimentFlowContract$Step.PushbackSheet.f65220a, true);
                            } else if (!Intrinsics.f(output3, b.a.f156358a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        default:
                            hx2.b output4 = (hx2.b) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (!Intrinsics.f(output4, b.C0895b.f156359a)) {
                                if (!Intrinsics.f(output4, b.a.f156358a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b bVar4 = bVar;
                                if (oki.h.E2(bVar4.v, new q2a.a(23))) {
                                    bVar4.B2();
                                } else {
                                    bVar4.K2(CardOrderExperimentFlowContract$Step.PhysicalCatalogue.f65219a, false);
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            viewControllerE1.H = block3;
            return viewControllerE1;
        }
        if (!Intrinsics.f(step, CardOrderExperimentFlowContract$Step.VirtualCatalogue.f65221a)) {
            throw new NoWhenBranchMatchedException();
        }
        GetCardFeatureConfig getCardFeatureConfig3 = cardOrderExperimentFlowContract$InputData.f65217a;
        ViewController viewControllerE12 = bVar.e1(new hx2.a(getCardFeatureConfig3.f64967c, c93.e.VIRTUAL, j0.RETAIL, l0.DEBIT, getCardFeatureConfig3.d, getCardFeatureConfig3.f, bVar.u == q33.g.VARIANT_3 ? hx2.m.GO_PHYSICAL : 0, 258016));
        final int i5 = 3;
        Function1 block4 = new Function1() { // from class: q33.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) throws Throwable {
                switch (i5) {
                    case 0:
                        u output = (u) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean zF = Intrinsics.f(output, s.f111464a);
                        com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b bVar2 = bVar;
                        if (zF) {
                            bVar2.J2();
                        } else if (Intrinsics.f(output, t.f111465a)) {
                            bVar2.K2(CardOrderExperimentFlowContract$Step.PushbackSheet.f65220a, true);
                        } else if (Intrinsics.f(output, d67.q.f111462a)) {
                            bVar2.B2();
                        } else {
                            if (!(output instanceof p) && !Intrinsics.f(output, d67.r.f111463a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            hx7.e.n(new IllegalStateException("Unexpected PromptMarketingScreen output: " + output));
                        }
                        return Unit.f186387a;
                    case 1:
                        dii.g output2 = (dii.g) obj4;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        boolean zF2 = Intrinsics.f(output2, dii.e.f115068a);
                        com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b bVar3 = bVar;
                        if (zF2) {
                            bVar3.J2();
                        } else if (Intrinsics.f(output2, dii.f.f115069a)) {
                            bVar3.K2(CardOrderExperimentFlowContract$Step.VirtualCatalogue.f65221a, true);
                        }
                        return Unit.f186387a;
                    case 2:
                        hx2.b output3 = (hx2.b) obj4;
                        Intrinsics.checkNotNullParameter(output3, "output");
                        if (Intrinsics.f(output3, b.C0895b.f156359a)) {
                            bVar.K2(CardOrderExperimentFlowContract$Step.PushbackSheet.f65220a, true);
                        } else if (!Intrinsics.f(output3, b.a.f156358a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                    default:
                        hx2.b output4 = (hx2.b) obj4;
                        Intrinsics.checkNotNullParameter(output4, "output");
                        if (!Intrinsics.f(output4, b.C0895b.f156359a)) {
                            if (!Intrinsics.f(output4, b.a.f156358a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b bVar4 = bVar;
                            if (oki.h.E2(bVar4.v, new q2a.a(23))) {
                                bVar4.B2();
                            } else {
                                bVar4.K2(CardOrderExperimentFlowContract$Step.PhysicalCatalogue.f65219a, false);
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

    private final Object g(Object obj2, Object obj3) {
        final com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar = (com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b) this.f239821b;
        final l FlowCoordinator = (l) obj2;
        IppShopFlowContract$Step step = (IppShopFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, IppShopFlowContract$Step.Dashboard.f84211a)) {
            IppShopDashboardScreen ippShopDashboardScreen = new IppShopDashboardScreen();
            final int i = 0;
            Function1 block = new Function1() { // from class: q3c.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            b4c.l it8 = (b4c.l) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean zF = Intrinsics.f(it8, l.b.f12269a);
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar2 = bVar;
                            yki.l lVar = FlowCoordinator;
                            if (zF) {
                                oki.h.t2(bVar2, lVar, IppShopFlowContract$Step.Cart.f84209a, true, null, false, 12);
                            } else if (it8 instanceof b4c.m) {
                                oki.h.t2(bVar2, lVar, new IppShopFlowContract$Step.Product(((b4c.m) it8).f12271a.f111052a), true, null, false, 12);
                            } else if (Intrinsics.f(it8, l.c.f12270a)) {
                                oki.h.t2(bVar2, lVar, IppShopFlowContract$Step.OrderHistory.f84214a, true, null, false, 12);
                            } else {
                                if (!Intrinsics.f(it8, l.a.f12268a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.C1(CardReaderFlowDestination.CardReaderSettingsBridge.f60611b);
                            }
                            return Unit.f186387a;
                        case 1:
                            p4c.p it9 = (p4c.p) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            boolean z = it9 instanceof p4c.q;
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar3 = bVar;
                            yki.l lVar2 = FlowCoordinator;
                            if (z) {
                                oki.h.t2(bVar3, lVar2, new IppShopFlowContract$Step.Product(((p4c.q) it9).f232890a), true, null, false, 12);
                            } else if (it9 instanceof p.a) {
                                oki.h.t2(bVar3, lVar2, IppShopFlowContract$Step.Cart.f84209a, true, null, false, 12);
                            } else if (it9 instanceof p4c.n) {
                                g1 g1Var = bVar3.o;
                                ShotDialogDisplayer$Configuration.Companion companion = ShotDialogDisplayer$Configuration.INSTANCE;
                                int i2 = R$plurals.revolut_shop_flow_home_screen_product_banner_item_in_cart_title;
                                long j2 = ((p4c.n) it9).f232887a;
                                ((k1) g1Var).d(ShotDialogDisplayer$Configuration.Companion.f(companion, "add_to_cart_success", new TextLocalisedQuantityClause(i2, Long.valueOf(j2), zhm.u.c(Long.valueOf(j2)), (Style) null, 24), null, new TextLocalisedClause(com.revolut.feature.revolut_shop.api.R$string.revolut_shop_flow_home_screen_product_banner_item_in_cart_button_title, null, null, 14), null, 52));
                            } else {
                                if (!(it9 instanceof o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(bVar3, lVar2, IppShopFlowContract$Step.Checkout.f84210a, true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            u3c.f it10 = (u3c.f) obj4;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            boolean zF2 = Intrinsics.f(it10, f.a.f276898a);
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar4 = bVar;
                            yki.l lVar3 = FlowCoordinator;
                            if (zF2) {
                                oki.h.t2(bVar4, lVar3, IppShopFlowContract$Step.Checkout.f84210a, true, null, false, 12);
                            } else {
                                if (!Intrinsics.f(it10, f.b.f276899a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.r2(lVar3);
                                oki.h.t2(bVar4, lVar3, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                            }
                            return Unit.f186387a;
                        case 3:
                            w3c.h it11 = (w3c.h) obj4;
                            Intrinsics.checkNotNullParameter(it11, "it");
                            boolean z3 = it11 instanceof w3c.f;
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar5 = bVar;
                            yki.l lVar4 = FlowCoordinator;
                            if (z3) {
                                oki.h.r2(lVar4);
                                w3c.f fVar = (w3c.f) it11;
                                oki.h.t2(bVar5, lVar4, new IppShopFlowContract$Step.OrderConfirmation(fVar.f294273a, false), false, fVar.f294274b ? TransitionAnimation.NONE.f98393a : TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                            } else {
                                if (!Intrinsics.f(it11, w3c.g.f294275a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.r2(lVar4);
                                oki.h.t2(bVar5, lVar4, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                            }
                            return Unit.f186387a;
                        default:
                            j4c.k it12 = (j4c.k) obj4;
                            Intrinsics.checkNotNullParameter(it12, "it");
                            if (!Intrinsics.f(it12, j4c.k.f171344a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.t2(bVar, FlowCoordinator, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            ippShopDashboardScreen.H = block;
            return ippShopDashboardScreen;
        }
        if (step instanceof IppShopFlowContract$Step.Product) {
            IppShopProductScreen ippShopProductScreen = new IppShopProductScreen(new IppShopProductScreenContract$InputData(((IppShopFlowContract$Step.Product) step).f84215a));
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: q3c.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            b4c.l it8 = (b4c.l) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean zF = Intrinsics.f(it8, l.b.f12269a);
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar2 = bVar;
                            yki.l lVar = FlowCoordinator;
                            if (zF) {
                                oki.h.t2(bVar2, lVar, IppShopFlowContract$Step.Cart.f84209a, true, null, false, 12);
                            } else if (it8 instanceof b4c.m) {
                                oki.h.t2(bVar2, lVar, new IppShopFlowContract$Step.Product(((b4c.m) it8).f12271a.f111052a), true, null, false, 12);
                            } else if (Intrinsics.f(it8, l.c.f12270a)) {
                                oki.h.t2(bVar2, lVar, IppShopFlowContract$Step.OrderHistory.f84214a, true, null, false, 12);
                            } else {
                                if (!Intrinsics.f(it8, l.a.f12268a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.C1(CardReaderFlowDestination.CardReaderSettingsBridge.f60611b);
                            }
                            return Unit.f186387a;
                        case 1:
                            p4c.p it9 = (p4c.p) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            boolean z = it9 instanceof p4c.q;
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar3 = bVar;
                            yki.l lVar2 = FlowCoordinator;
                            if (z) {
                                oki.h.t2(bVar3, lVar2, new IppShopFlowContract$Step.Product(((p4c.q) it9).f232890a), true, null, false, 12);
                            } else if (it9 instanceof p.a) {
                                oki.h.t2(bVar3, lVar2, IppShopFlowContract$Step.Cart.f84209a, true, null, false, 12);
                            } else if (it9 instanceof p4c.n) {
                                g1 g1Var = bVar3.o;
                                ShotDialogDisplayer$Configuration.Companion companion = ShotDialogDisplayer$Configuration.INSTANCE;
                                int i22 = R$plurals.revolut_shop_flow_home_screen_product_banner_item_in_cart_title;
                                long j2 = ((p4c.n) it9).f232887a;
                                ((k1) g1Var).d(ShotDialogDisplayer$Configuration.Companion.f(companion, "add_to_cart_success", new TextLocalisedQuantityClause(i22, Long.valueOf(j2), zhm.u.c(Long.valueOf(j2)), (Style) null, 24), null, new TextLocalisedClause(com.revolut.feature.revolut_shop.api.R$string.revolut_shop_flow_home_screen_product_banner_item_in_cart_button_title, null, null, 14), null, 52));
                            } else {
                                if (!(it9 instanceof o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(bVar3, lVar2, IppShopFlowContract$Step.Checkout.f84210a, true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            u3c.f it10 = (u3c.f) obj4;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            boolean zF2 = Intrinsics.f(it10, f.a.f276898a);
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar4 = bVar;
                            yki.l lVar3 = FlowCoordinator;
                            if (zF2) {
                                oki.h.t2(bVar4, lVar3, IppShopFlowContract$Step.Checkout.f84210a, true, null, false, 12);
                            } else {
                                if (!Intrinsics.f(it10, f.b.f276899a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.r2(lVar3);
                                oki.h.t2(bVar4, lVar3, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                            }
                            return Unit.f186387a;
                        case 3:
                            w3c.h it11 = (w3c.h) obj4;
                            Intrinsics.checkNotNullParameter(it11, "it");
                            boolean z3 = it11 instanceof w3c.f;
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar5 = bVar;
                            yki.l lVar4 = FlowCoordinator;
                            if (z3) {
                                oki.h.r2(lVar4);
                                w3c.f fVar = (w3c.f) it11;
                                oki.h.t2(bVar5, lVar4, new IppShopFlowContract$Step.OrderConfirmation(fVar.f294273a, false), false, fVar.f294274b ? TransitionAnimation.NONE.f98393a : TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                            } else {
                                if (!Intrinsics.f(it11, w3c.g.f294275a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.r2(lVar4);
                                oki.h.t2(bVar5, lVar4, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                            }
                            return Unit.f186387a;
                        default:
                            j4c.k it12 = (j4c.k) obj4;
                            Intrinsics.checkNotNullParameter(it12, "it");
                            if (!Intrinsics.f(it12, j4c.k.f171344a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.t2(bVar, FlowCoordinator, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            ippShopProductScreen.H = block2;
            return ippShopProductScreen;
        }
        if (step instanceof IppShopFlowContract$Step.Cart) {
            IppShopCartScreen ippShopCartScreen = new IppShopCartScreen();
            final int i3 = 2;
            Function1 block3 = new Function1() { // from class: q3c.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            b4c.l it8 = (b4c.l) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean zF = Intrinsics.f(it8, l.b.f12269a);
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar2 = bVar;
                            yki.l lVar = FlowCoordinator;
                            if (zF) {
                                oki.h.t2(bVar2, lVar, IppShopFlowContract$Step.Cart.f84209a, true, null, false, 12);
                            } else if (it8 instanceof b4c.m) {
                                oki.h.t2(bVar2, lVar, new IppShopFlowContract$Step.Product(((b4c.m) it8).f12271a.f111052a), true, null, false, 12);
                            } else if (Intrinsics.f(it8, l.c.f12270a)) {
                                oki.h.t2(bVar2, lVar, IppShopFlowContract$Step.OrderHistory.f84214a, true, null, false, 12);
                            } else {
                                if (!Intrinsics.f(it8, l.a.f12268a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.C1(CardReaderFlowDestination.CardReaderSettingsBridge.f60611b);
                            }
                            return Unit.f186387a;
                        case 1:
                            p4c.p it9 = (p4c.p) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            boolean z = it9 instanceof p4c.q;
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar3 = bVar;
                            yki.l lVar2 = FlowCoordinator;
                            if (z) {
                                oki.h.t2(bVar3, lVar2, new IppShopFlowContract$Step.Product(((p4c.q) it9).f232890a), true, null, false, 12);
                            } else if (it9 instanceof p.a) {
                                oki.h.t2(bVar3, lVar2, IppShopFlowContract$Step.Cart.f84209a, true, null, false, 12);
                            } else if (it9 instanceof p4c.n) {
                                g1 g1Var = bVar3.o;
                                ShotDialogDisplayer$Configuration.Companion companion = ShotDialogDisplayer$Configuration.INSTANCE;
                                int i22 = R$plurals.revolut_shop_flow_home_screen_product_banner_item_in_cart_title;
                                long j2 = ((p4c.n) it9).f232887a;
                                ((k1) g1Var).d(ShotDialogDisplayer$Configuration.Companion.f(companion, "add_to_cart_success", new TextLocalisedQuantityClause(i22, Long.valueOf(j2), zhm.u.c(Long.valueOf(j2)), (Style) null, 24), null, new TextLocalisedClause(com.revolut.feature.revolut_shop.api.R$string.revolut_shop_flow_home_screen_product_banner_item_in_cart_button_title, null, null, 14), null, 52));
                            } else {
                                if (!(it9 instanceof o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(bVar3, lVar2, IppShopFlowContract$Step.Checkout.f84210a, true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            u3c.f it10 = (u3c.f) obj4;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            boolean zF2 = Intrinsics.f(it10, f.a.f276898a);
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar4 = bVar;
                            yki.l lVar3 = FlowCoordinator;
                            if (zF2) {
                                oki.h.t2(bVar4, lVar3, IppShopFlowContract$Step.Checkout.f84210a, true, null, false, 12);
                            } else {
                                if (!Intrinsics.f(it10, f.b.f276899a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.r2(lVar3);
                                oki.h.t2(bVar4, lVar3, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                            }
                            return Unit.f186387a;
                        case 3:
                            w3c.h it11 = (w3c.h) obj4;
                            Intrinsics.checkNotNullParameter(it11, "it");
                            boolean z3 = it11 instanceof w3c.f;
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar5 = bVar;
                            yki.l lVar4 = FlowCoordinator;
                            if (z3) {
                                oki.h.r2(lVar4);
                                w3c.f fVar = (w3c.f) it11;
                                oki.h.t2(bVar5, lVar4, new IppShopFlowContract$Step.OrderConfirmation(fVar.f294273a, false), false, fVar.f294274b ? TransitionAnimation.NONE.f98393a : TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                            } else {
                                if (!Intrinsics.f(it11, w3c.g.f294275a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.r2(lVar4);
                                oki.h.t2(bVar5, lVar4, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                            }
                            return Unit.f186387a;
                        default:
                            j4c.k it12 = (j4c.k) obj4;
                            Intrinsics.checkNotNullParameter(it12, "it");
                            if (!Intrinsics.f(it12, j4c.k.f171344a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.t2(bVar, FlowCoordinator, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            ippShopCartScreen.H = block3;
            return ippShopCartScreen;
        }
        if (Intrinsics.f(step, IppShopFlowContract$Step.Checkout.f84210a)) {
            CheckoutScreen checkoutScreen = new CheckoutScreen();
            final int i5 = 3;
            Function1 block4 = new Function1() { // from class: q3c.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i5) {
                        case 0:
                            b4c.l it8 = (b4c.l) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            boolean zF = Intrinsics.f(it8, l.b.f12269a);
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar2 = bVar;
                            yki.l lVar = FlowCoordinator;
                            if (zF) {
                                oki.h.t2(bVar2, lVar, IppShopFlowContract$Step.Cart.f84209a, true, null, false, 12);
                            } else if (it8 instanceof b4c.m) {
                                oki.h.t2(bVar2, lVar, new IppShopFlowContract$Step.Product(((b4c.m) it8).f12271a.f111052a), true, null, false, 12);
                            } else if (Intrinsics.f(it8, l.c.f12270a)) {
                                oki.h.t2(bVar2, lVar, IppShopFlowContract$Step.OrderHistory.f84214a, true, null, false, 12);
                            } else {
                                if (!Intrinsics.f(it8, l.a.f12268a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.C1(CardReaderFlowDestination.CardReaderSettingsBridge.f60611b);
                            }
                            return Unit.f186387a;
                        case 1:
                            p4c.p it9 = (p4c.p) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            boolean z = it9 instanceof p4c.q;
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar3 = bVar;
                            yki.l lVar2 = FlowCoordinator;
                            if (z) {
                                oki.h.t2(bVar3, lVar2, new IppShopFlowContract$Step.Product(((p4c.q) it9).f232890a), true, null, false, 12);
                            } else if (it9 instanceof p.a) {
                                oki.h.t2(bVar3, lVar2, IppShopFlowContract$Step.Cart.f84209a, true, null, false, 12);
                            } else if (it9 instanceof p4c.n) {
                                g1 g1Var = bVar3.o;
                                ShotDialogDisplayer$Configuration.Companion companion = ShotDialogDisplayer$Configuration.INSTANCE;
                                int i22 = R$plurals.revolut_shop_flow_home_screen_product_banner_item_in_cart_title;
                                long j2 = ((p4c.n) it9).f232887a;
                                ((k1) g1Var).d(ShotDialogDisplayer$Configuration.Companion.f(companion, "add_to_cart_success", new TextLocalisedQuantityClause(i22, Long.valueOf(j2), zhm.u.c(Long.valueOf(j2)), (Style) null, 24), null, new TextLocalisedClause(com.revolut.feature.revolut_shop.api.R$string.revolut_shop_flow_home_screen_product_banner_item_in_cart_button_title, null, null, 14), null, 52));
                            } else {
                                if (!(it9 instanceof o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(bVar3, lVar2, IppShopFlowContract$Step.Checkout.f84210a, true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            u3c.f it10 = (u3c.f) obj4;
                            Intrinsics.checkNotNullParameter(it10, "it");
                            boolean zF2 = Intrinsics.f(it10, f.a.f276898a);
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar4 = bVar;
                            yki.l lVar3 = FlowCoordinator;
                            if (zF2) {
                                oki.h.t2(bVar4, lVar3, IppShopFlowContract$Step.Checkout.f84210a, true, null, false, 12);
                            } else {
                                if (!Intrinsics.f(it10, f.b.f276899a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.r2(lVar3);
                                oki.h.t2(bVar4, lVar3, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                            }
                            return Unit.f186387a;
                        case 3:
                            w3c.h it11 = (w3c.h) obj4;
                            Intrinsics.checkNotNullParameter(it11, "it");
                            boolean z3 = it11 instanceof w3c.f;
                            com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar5 = bVar;
                            yki.l lVar4 = FlowCoordinator;
                            if (z3) {
                                oki.h.r2(lVar4);
                                w3c.f fVar = (w3c.f) it11;
                                oki.h.t2(bVar5, lVar4, new IppShopFlowContract$Step.OrderConfirmation(fVar.f294273a, false), false, fVar.f294274b ? TransitionAnimation.NONE.f98393a : TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                            } else {
                                if (!Intrinsics.f(it11, w3c.g.f294275a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.r2(lVar4);
                                oki.h.t2(bVar5, lVar4, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                            }
                            return Unit.f186387a;
                        default:
                            j4c.k it12 = (j4c.k) obj4;
                            Intrinsics.checkNotNullParameter(it12, "it");
                            if (!Intrinsics.f(it12, j4c.k.f171344a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.t2(bVar, FlowCoordinator, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            checkoutScreen.H = block4;
            return checkoutScreen;
        }
        if (!(step instanceof IppShopFlowContract$Step.OrderConfirmation)) {
            if (step instanceof IppShopFlowContract$Step.OrderHistory) {
                return new OrderHistoryFlow(0);
            }
            throw new NoWhenBranchMatchedException();
        }
        IppShopFlowContract$Step.OrderConfirmation orderConfirmation = (IppShopFlowContract$Step.OrderConfirmation) step;
        OrderConfirmationScreen orderConfirmationScreen = new OrderConfirmationScreen(new OrderConfirmationScreenContract$InputData(orderConfirmation.f84212a, orderConfirmation.f84213b));
        final int i6 = 4;
        Function1 block5 = new Function1() { // from class: q3c.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i6) {
                    case 0:
                        b4c.l it8 = (b4c.l) obj4;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        boolean zF = Intrinsics.f(it8, l.b.f12269a);
                        com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar2 = bVar;
                        yki.l lVar = FlowCoordinator;
                        if (zF) {
                            oki.h.t2(bVar2, lVar, IppShopFlowContract$Step.Cart.f84209a, true, null, false, 12);
                        } else if (it8 instanceof b4c.m) {
                            oki.h.t2(bVar2, lVar, new IppShopFlowContract$Step.Product(((b4c.m) it8).f12271a.f111052a), true, null, false, 12);
                        } else if (Intrinsics.f(it8, l.c.f12270a)) {
                            oki.h.t2(bVar2, lVar, IppShopFlowContract$Step.OrderHistory.f84214a, true, null, false, 12);
                        } else {
                            if (!Intrinsics.f(it8, l.a.f12268a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar2.C1(CardReaderFlowDestination.CardReaderSettingsBridge.f60611b);
                        }
                        return Unit.f186387a;
                    case 1:
                        p4c.p it9 = (p4c.p) obj4;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        boolean z = it9 instanceof p4c.q;
                        com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar3 = bVar;
                        yki.l lVar2 = FlowCoordinator;
                        if (z) {
                            oki.h.t2(bVar3, lVar2, new IppShopFlowContract$Step.Product(((p4c.q) it9).f232890a), true, null, false, 12);
                        } else if (it9 instanceof p.a) {
                            oki.h.t2(bVar3, lVar2, IppShopFlowContract$Step.Cart.f84209a, true, null, false, 12);
                        } else if (it9 instanceof p4c.n) {
                            g1 g1Var = bVar3.o;
                            ShotDialogDisplayer$Configuration.Companion companion = ShotDialogDisplayer$Configuration.INSTANCE;
                            int i22 = R$plurals.revolut_shop_flow_home_screen_product_banner_item_in_cart_title;
                            long j2 = ((p4c.n) it9).f232887a;
                            ((k1) g1Var).d(ShotDialogDisplayer$Configuration.Companion.f(companion, "add_to_cart_success", new TextLocalisedQuantityClause(i22, Long.valueOf(j2), zhm.u.c(Long.valueOf(j2)), (Style) null, 24), null, new TextLocalisedClause(com.revolut.feature.revolut_shop.api.R$string.revolut_shop_flow_home_screen_product_banner_item_in_cart_button_title, null, null, 14), null, 52));
                        } else {
                            if (!(it9 instanceof o)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.t2(bVar3, lVar2, IppShopFlowContract$Step.Checkout.f84210a, true, null, false, 12);
                        }
                        return Unit.f186387a;
                    case 2:
                        u3c.f it10 = (u3c.f) obj4;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        boolean zF2 = Intrinsics.f(it10, f.a.f276898a);
                        com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar4 = bVar;
                        yki.l lVar3 = FlowCoordinator;
                        if (zF2) {
                            oki.h.t2(bVar4, lVar3, IppShopFlowContract$Step.Checkout.f84210a, true, null, false, 12);
                        } else {
                            if (!Intrinsics.f(it10, f.b.f276899a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.r2(lVar3);
                            oki.h.t2(bVar4, lVar3, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                        }
                        return Unit.f186387a;
                    case 3:
                        w3c.h it11 = (w3c.h) obj4;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        boolean z3 = it11 instanceof w3c.f;
                        com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b bVar5 = bVar;
                        yki.l lVar4 = FlowCoordinator;
                        if (z3) {
                            oki.h.r2(lVar4);
                            w3c.f fVar = (w3c.f) it11;
                            oki.h.t2(bVar5, lVar4, new IppShopFlowContract$Step.OrderConfirmation(fVar.f294273a, false), false, fVar.f294274b ? TransitionAnimation.NONE.f98393a : TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                        } else {
                            if (!Intrinsics.f(it11, w3c.g.f294275a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.r2(lVar4);
                            oki.h.t2(bVar5, lVar4, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                        }
                        return Unit.f186387a;
                    default:
                        j4c.k it12 = (j4c.k) obj4;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        if (!Intrinsics.f(it12, j4c.k.f171344a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.t2(bVar, FlowCoordinator, IppShopFlowContract$Step.Dashboard.f84211a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block5, "block");
        orderConfirmationScreen.H = block5;
        return orderConfirmationScreen;
    }

    private final Object h(Object obj2, Object obj3) {
        com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b) this.f239821b;
        CreditAddressV2FlowContract$InputData creditAddressV2FlowContract$InputData = bVar.f66977p;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        CreditAddressV2FlowContract$Step step = (CreditAddressV2FlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, CreditAddressV2FlowContract$Step.Address.f66974a)) {
            String f66968a = creditAddressV2FlowContract$InputData.f66971a.getF66968a();
            CreditAddressV2FlowContract$Config creditAddressV2FlowContract$Config = creditAddressV2FlowContract$InputData.f66971a;
            CreditAddressInputScreen creditAddressInputScreen = new CreditAddressInputScreen(new CreditAddressInputScreenContract$InputData(f66968a, creditAddressV2FlowContract$Config.getF66969b(), creditAddressV2FlowContract$Config.getF66970c(), creditAddressV2FlowContract$Config.getD(), ((CreditAddressV2FlowContract$State) ((j2) bVar.f66979r.f22677a).getValue()).f66973a, creditAddressV2FlowContract$InputData.f66972b.f66892b));
            q44.c block = new q44.c(bVar, 1);
            Intrinsics.checkNotNullParameter(block, "block");
            creditAddressInputScreen.H = block;
            return creditAddressInputScreen;
        }
        if (!Intrinsics.f(step, CreditAddressV2FlowContract$Step.AddressSearch.f66975a)) {
            if (!Intrinsics.f(step, CreditAddressV2FlowContract$Step.Selection.f66976a)) {
                throw new NoWhenBranchMatchedException();
            }
            CreditAddressV2FlowContract$Config creditAddressV2FlowContract$Config2 = creditAddressV2FlowContract$InputData.f66971a;
            CreditAddressSelectionScreen creditAddressSelectionScreen = new CreditAddressSelectionScreen(new CreditAddressSelectionScreenContract$InputData(creditAddressV2FlowContract$Config2.getF66968a(), creditAddressV2FlowContract$Config2.getF66969b(), creditAddressV2FlowContract$Config2.getF66970c(), creditAddressV2FlowContract$InputData.f66972b.f66892b));
            q44.c block2 = new q44.c(bVar, 3);
            Intrinsics.checkNotNullParameter(block2, "block");
            creditAddressSelectionScreen.H = block2;
            return creditAddressSelectionScreen;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_v2_add_address_title, null, null, 14);
        ViewController viewControllerE1 = bVar.e1(new th1.a(new AddressFlowContract$InputData(new Address(null, null, null, null, null, creditAddressV2FlowContract$InputData.f66972b.f.f297794a, null, null, null, null, null, null, null, null, null, 32735, null), textLocalisedClause, null, false, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_v2_add_address_button, null, null, 14), FieldMode.NotEditable.f60955a, qh1.b.CLOSE, null, true, new AddressValidationMode.Verification(AddressVerificationUseCase.RESIDENTIAL), 907068), null, null, 6));
        q44.c block3 = new q44.c(bVar, 2);
        Intrinsics.checkNotNullParameter(block3, "block");
        viewControllerE1.H = block3;
        return viewControllerE1;
    }

    private final Object i(Object obj2, Object obj3) {
        com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar = (com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) this.f239821b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        PaymentsSearchScreenContract$ModalStep step = (PaymentsSearchScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof PaymentsSearchScreenContract$ModalStep.AddRecipient)) {
            throw new NoWhenBranchMatchedException();
        }
        AddRecipientController addRecipientController = new AddRecipientController(new AddRecipientContract$InputData(((PaymentsSearchScreenContract$ModalStep.AddRecipient) step).f80128a));
        q4a.l block = new q4a.l(aVar, 3);
        Intrinsics.checkNotNullParameter(block, "block");
        addRecipientController.H = block;
        return addRecipientController;
    }

    private final Object j(Object obj2, Object obj3) {
        q4b.e eVar = (q4b.e) this.f239821b;
        Function1 getDefaultErrorItems = (Function1) obj3;
        Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
        return new cii.b(null, (List) getDefaultErrorItems.invoke(new iii.d(6, q4b.f.f242122a, true, false, null)), q4b.h.a(eVar.f242121b));
    }

    private final Object k(Object obj2, Object obj3) {
        q53.c cVar = (q53.c) this.f239821b;
        wz5.a domain = (wz5.a) obj3;
        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
        Intrinsics.checkNotNullParameter(domain, "domain");
        cVar.f242290b.f("KEY_SALES_TIPS_SETTINGS", domain);
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r1v120, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v99, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ViewController trustedWifisListScreen;
        int i = this.f239820a;
        int i2 = 0;
        Object obj4 = this.f239821b;
        switch (i) {
            case 0:
                final com.revolut.feature.credit.card.impl.ui.repay_with_review.flow.a aVar = (com.revolut.feature.credit.card.impl.ui.repay_with_review.flow.a) obj4;
                CreditCardRepayWithReviewFlowContract$InputData creditCardRepayWithReviewFlowContract$InputData = aVar.o;
                yki.l FlowCoordinator = (yki.l) obj2;
                CreditCardRepayWithReviewFlowContract$Step step = (CreditCardRepayWithReviewFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof CreditCardRepayWithReviewFlowContract$Step.PaymentAmount) {
                    CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen = new CreditCardRepayPaymentAmountScreen(new CreditCardRepayPaymentAmountScreenContract$InputData(creditCardRepayWithReviewFlowContract$InputData.f69602a, creditCardRepayWithReviewFlowContract$InputData.f69603b, creditCardRepayWithReviewFlowContract$InputData.f69604c));
                    final int i3 = 0;
                    Function1 block = new Function1() { // from class: pu4.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i3) {
                                case 0:
                                    qu4.l output = (qu4.l) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z = output instanceof qu4.k;
                                    com.revolut.feature.credit.card.impl.ui.repay_with_review.flow.a aVar2 = aVar;
                                    if (z) {
                                        oki.h.t2(aVar2, aVar2.f69607p, new CreditCardRepayWithReviewFlowContract$Step.PaymentReview(((qu4.k) output).f249230a), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(output, j.f249229a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar2.B2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    su4.j result = (su4.j) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof j.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar.C2(c.f239819a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    creditCardRepayPaymentAmountScreen.H = block;
                    return creditCardRepayPaymentAmountScreen;
                }
                if (!(step instanceof CreditCardRepayWithReviewFlowContract$Step.PaymentReview)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardRepayPaymentReviewScreen creditCardRepayPaymentReviewScreen = new CreditCardRepayPaymentReviewScreen(new CreditCardRepayPaymentReviewScreenContract$InputData(((CreditCardRepayWithReviewFlowContract$Step.PaymentReview) step).f69606a, creditCardRepayWithReviewFlowContract$InputData.f69602a));
                final int i5 = 1;
                Function1 block2 = new Function1() { // from class: pu4.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i5) {
                            case 0:
                                qu4.l output = (qu4.l) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                boolean z = output instanceof qu4.k;
                                com.revolut.feature.credit.card.impl.ui.repay_with_review.flow.a aVar2 = aVar;
                                if (z) {
                                    oki.h.t2(aVar2, aVar2.f69607p, new CreditCardRepayWithReviewFlowContract$Step.PaymentReview(((qu4.k) output).f249230a), true, null, false, 12);
                                } else {
                                    if (!Intrinsics.f(output, qu4.j.f249229a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar2.B2();
                                }
                                return Unit.f186387a;
                            default:
                                su4.j result = (su4.j) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (!(result instanceof j.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.C2(c.f239819a);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block2, "block");
                creditCardRepayPaymentReviewScreen.H = block2;
                return creditCardRepayPaymentReviewScreen;
            case 1:
                com.revolut.feature.kyc.impl.cmd.flow.b bVar = (com.revolut.feature.kyc.impl.cmd.flow.b) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                CmdFlowContract$Step step2 = (CmdFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!Intrinsics.f(step2, CmdFlowContract$Step.Portal.f77606a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = bVar.o.f77604a;
                CmdController cmdController = new CmdController(new CmdControllerContract$InputData(str, ((f80.b) bVar.f77608q).f(str).getQueryParameter("redirect_uri")));
                pth.l block3 = new pth.l(bVar, 3);
                Intrinsics.checkNotNullParameter(block3, "block");
                cmdController.H = block3;
                return cmdController;
            case 2:
                puk.s sVar = (puk.s) obj4;
                StockDetailsFlowControllerContract$InputData stockDetailsFlowControllerContract$InputData = sVar.o;
                ali.b PagerCoordinator = (ali.b) obj2;
                StockDetailsFlowControllerContract$Page tab2 = (StockDetailsFlowControllerContract$Page) obj3;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(tab2, "tab");
                switch (puk.m.f239945b[tab2.ordinal()]) {
                    case 1:
                        return new StockDetailsOverviewController(new StockDetailsOverviewControllerContract$InputData(stockDetailsFlowControllerContract$InputData.f103875a, stockDetailsFlowControllerContract$InputData.e, stockDetailsFlowControllerContract$InputData.f));
                    case 2:
                        return sVar.e1(new leh.a(stockDetailsFlowControllerContract$InputData.f103875a));
                    case 3:
                        return new StockFinancialsController(new StockFinancialsControllerContract$InputData(stockDetailsFlowControllerContract$InputData.f103875a));
                    case 4:
                        return sVar.e1(new szj.a(WealthNewsCategory.Stocks.f101808b, stockDetailsFlowControllerContract$InputData.f103875a));
                    case 5:
                        return new StockOrderBookController(new StockOrderBookControllerContract$InputData(stockDetailsFlowControllerContract$InputData.f103875a, ((puk.f) ((j2) sVar.z.f22677a).getValue()).f239931g));
                    case 6:
                        return new StockDetailsFeedController(new StockDetailsFeedControllerContract$InputData(stockDetailsFlowControllerContract$InputData.f103875a));
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 3:
                final com.revolut.feature.apm.breb.impl.flow.area.a aVar2 = (com.revolut.feature.apm.breb.impl.flow.area.a) obj4;
                final yki.b LazyFlowCoordinator = (yki.b) obj2;
                BrebAreaFlowContract$Step step3 = (BrebAreaFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof BrebAreaFlowContract$Step.Area) {
                    BrebAreaScreen brebAreaScreen = new BrebAreaScreen(((BrebAreaFlowContract$Step.Area) step3).f61725a);
                    final int i6 = 0;
                    Function1 block4 = new Function1() { // from class: pv1.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i21 = i6;
                            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                            switch (i21) {
                                case 0:
                                    v result = (v) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof uv1.o;
                                    com.revolut.feature.apm.breb.impl.flow.area.a aVar3 = aVar2;
                                    yki.b bVar2 = LazyFlowCoordinator;
                                    if (z) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.About.f61724a, true, null, false, 12);
                                    } else if (result instanceof uv1.n) {
                                        oki.h.w2(bVar2, BrebAreaFlowContract$Step.Keys.f61726a, bottom_dialog);
                                    } else if (result instanceof uv1.q) {
                                        oki.h.w2(bVar2, new BrebAreaFlowContract$Step.More(((uv1.q) result).f283285a), bottom_dialog);
                                    } else if (Intrinsics.f(result, uv1.s.f283287a)) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.Send.f61739a, true, null, false, 12);
                                    } else if (result instanceof uv1.r) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.NewContact.f61730a, true, null, false, 12);
                                    } else if (result instanceof uv1.t) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.QrScanner.f61736a, true, null, false, 12);
                                    } else if (result instanceof uv1.u) {
                                        uv1.u uVar = (uv1.u) result;
                                        oki.h.t2(aVar3, bVar2, new BrebAreaFlowContract$Step.QrRequest(uVar.f283289a, null, uVar.f283290b), true, null, false, 12);
                                    } else {
                                        if (!(result instanceof uv1.p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar3.C1(u0.b(new FeatureCommand(new FaqFeatureConfig.Starter("902e0ed8-80d6-46e0-b248-9fe06d7a90b4", 2))));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    aw1.l result2 = (aw1.l) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z3 = result2 instanceof aw1.j;
                                    yki.b bVar3 = LazyFlowCoordinator;
                                    if (z3) {
                                        oki.h.w2(bVar3, new BrebAreaFlowContract$Step.More(((aw1.j) result2).f10655a), bottom_dialog);
                                    } else if (result2 instanceof aw1.h) {
                                        oki.h.t2(aVar2, bVar3, new BrebAreaFlowContract$Step.NewAlias(ApmAliasRegistrationMode.Add.f62240b, null), true, null, false, 12);
                                    } else if (result2 instanceof aw1.k) {
                                        aw1.k kVar = (aw1.k) result2;
                                        oki.h.w2(bVar3, new BrebAreaFlowContract$Step.OccupiedKeyInfo(kVar.f10656a, kVar.f10657b), bottom_dialog);
                                    } else {
                                        if (!(result2 instanceof aw1.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i22 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    ew1.i result3 = (ew1.i) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof ew1.g;
                                    yki.b bVar4 = LazyFlowCoordinator;
                                    if (z4) {
                                        ew1.g gVar = (ew1.g) result3;
                                        oki.h.w2(bVar4, new BrebAreaFlowContract$Step.Replace(gVar.f129989a, gVar.f129990b), bottom_dialog);
                                    } else if (result3 instanceof ew1.h) {
                                        oki.h.t2(aVar2, bVar4, new BrebAreaFlowContract$Step.NewAlias(new ApmAliasRegistrationMode.AddAndReplace(((ew1.h) result3).f129991a, com.revolut.feature.apm.breb.api.R$string.bre_b_area_more_replace_key_add_button_title), null), true, null, false, 12);
                                    } else {
                                        if (!(result3 instanceof ew1.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i32 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    yv1.h result4 = (yv1.h) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof yv1.g) {
                                        oki.h.t2(aVar2, LazyFlowCoordinator, new BrebAreaFlowContract$Step.NewAlias(new ApmAliasRegistrationMode.AddAndReplace(((yv1.g) result4).f317089a, com.revolut.feature.apm.breb.api.R$string.bre_b_area_more_replace_key_add_button_title), null), true, null, false, 12);
                                    } else {
                                        if (!(result4 instanceof yv1.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i33 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block4, "block");
                    brebAreaScreen.H = block4;
                    return brebAreaScreen;
                }
                if (Intrinsics.f(step3, BrebAreaFlowContract$Step.About.f61724a)) {
                    ViewController viewControllerE1 = aVar2.e1(new ProductArticleDescriptor(xv1.a.ABOUT.a(), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                    final int i21 = 0;
                    Function1 block5 = new Function1() { // from class: pv1.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i21) {
                                case 0:
                                    yja.b it8 = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    aVar2.B2();
                                    break;
                                default:
                                    g12.q result = (g12.q) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    x xVarJ = ofm.q.j(result);
                                    if (xVarJ != null) {
                                        com.revolut.feature.apm.breb.impl.flow.area.a aVar3 = aVar2;
                                        aVar3.C1(((com.revolut.feature.apm.breb.impl.a) aVar3.f61743s).m(xVarJ.f257683a, hrf.f.OUTGOING, xVarJ.f257684b));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    viewControllerE1.H = block5;
                    return viewControllerE1;
                }
                if (Intrinsics.f(step3, BrebAreaFlowContract$Step.Keys.f61726a)) {
                    BrebKeysScreen brebKeysScreen = new BrebKeysScreen();
                    final int i22 = 1;
                    Function1 block6 = new Function1() { // from class: pv1.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i212 = i22;
                            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                            switch (i212) {
                                case 0:
                                    v result = (v) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof uv1.o;
                                    com.revolut.feature.apm.breb.impl.flow.area.a aVar3 = aVar2;
                                    yki.b bVar2 = LazyFlowCoordinator;
                                    if (z) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.About.f61724a, true, null, false, 12);
                                    } else if (result instanceof uv1.n) {
                                        oki.h.w2(bVar2, BrebAreaFlowContract$Step.Keys.f61726a, bottom_dialog);
                                    } else if (result instanceof uv1.q) {
                                        oki.h.w2(bVar2, new BrebAreaFlowContract$Step.More(((uv1.q) result).f283285a), bottom_dialog);
                                    } else if (Intrinsics.f(result, uv1.s.f283287a)) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.Send.f61739a, true, null, false, 12);
                                    } else if (result instanceof uv1.r) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.NewContact.f61730a, true, null, false, 12);
                                    } else if (result instanceof uv1.t) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.QrScanner.f61736a, true, null, false, 12);
                                    } else if (result instanceof uv1.u) {
                                        uv1.u uVar = (uv1.u) result;
                                        oki.h.t2(aVar3, bVar2, new BrebAreaFlowContract$Step.QrRequest(uVar.f283289a, null, uVar.f283290b), true, null, false, 12);
                                    } else {
                                        if (!(result instanceof uv1.p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar3.C1(u0.b(new FeatureCommand(new FaqFeatureConfig.Starter("902e0ed8-80d6-46e0-b248-9fe06d7a90b4", 2))));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    aw1.l result2 = (aw1.l) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z3 = result2 instanceof aw1.j;
                                    yki.b bVar3 = LazyFlowCoordinator;
                                    if (z3) {
                                        oki.h.w2(bVar3, new BrebAreaFlowContract$Step.More(((aw1.j) result2).f10655a), bottom_dialog);
                                    } else if (result2 instanceof aw1.h) {
                                        oki.h.t2(aVar2, bVar3, new BrebAreaFlowContract$Step.NewAlias(ApmAliasRegistrationMode.Add.f62240b, null), true, null, false, 12);
                                    } else if (result2 instanceof aw1.k) {
                                        aw1.k kVar = (aw1.k) result2;
                                        oki.h.w2(bVar3, new BrebAreaFlowContract$Step.OccupiedKeyInfo(kVar.f10656a, kVar.f10657b), bottom_dialog);
                                    } else {
                                        if (!(result2 instanceof aw1.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i222 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    ew1.i result3 = (ew1.i) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof ew1.g;
                                    yki.b bVar4 = LazyFlowCoordinator;
                                    if (z4) {
                                        ew1.g gVar = (ew1.g) result3;
                                        oki.h.w2(bVar4, new BrebAreaFlowContract$Step.Replace(gVar.f129989a, gVar.f129990b), bottom_dialog);
                                    } else if (result3 instanceof ew1.h) {
                                        oki.h.t2(aVar2, bVar4, new BrebAreaFlowContract$Step.NewAlias(new ApmAliasRegistrationMode.AddAndReplace(((ew1.h) result3).f129991a, com.revolut.feature.apm.breb.api.R$string.bre_b_area_more_replace_key_add_button_title), null), true, null, false, 12);
                                    } else {
                                        if (!(result3 instanceof ew1.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i32 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    yv1.h result4 = (yv1.h) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof yv1.g) {
                                        oki.h.t2(aVar2, LazyFlowCoordinator, new BrebAreaFlowContract$Step.NewAlias(new ApmAliasRegistrationMode.AddAndReplace(((yv1.g) result4).f317089a, com.revolut.feature.apm.breb.api.R$string.bre_b_area_more_replace_key_add_button_title), null), true, null, false, 12);
                                    } else {
                                        if (!(result4 instanceof yv1.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i33 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    brebKeysScreen.H = block6;
                    return brebKeysScreen;
                }
                if (step3 instanceof BrebAreaFlowContract$Step.More) {
                    BrebMoreScreen brebMoreScreen = new BrebMoreScreen(((BrebAreaFlowContract$Step.More) step3).f61727a);
                    final int i32 = 2;
                    Function1 block7 = new Function1() { // from class: pv1.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i212 = i32;
                            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                            switch (i212) {
                                case 0:
                                    v result = (v) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof uv1.o;
                                    com.revolut.feature.apm.breb.impl.flow.area.a aVar3 = aVar2;
                                    yki.b bVar2 = LazyFlowCoordinator;
                                    if (z) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.About.f61724a, true, null, false, 12);
                                    } else if (result instanceof uv1.n) {
                                        oki.h.w2(bVar2, BrebAreaFlowContract$Step.Keys.f61726a, bottom_dialog);
                                    } else if (result instanceof uv1.q) {
                                        oki.h.w2(bVar2, new BrebAreaFlowContract$Step.More(((uv1.q) result).f283285a), bottom_dialog);
                                    } else if (Intrinsics.f(result, uv1.s.f283287a)) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.Send.f61739a, true, null, false, 12);
                                    } else if (result instanceof uv1.r) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.NewContact.f61730a, true, null, false, 12);
                                    } else if (result instanceof uv1.t) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.QrScanner.f61736a, true, null, false, 12);
                                    } else if (result instanceof uv1.u) {
                                        uv1.u uVar = (uv1.u) result;
                                        oki.h.t2(aVar3, bVar2, new BrebAreaFlowContract$Step.QrRequest(uVar.f283289a, null, uVar.f283290b), true, null, false, 12);
                                    } else {
                                        if (!(result instanceof uv1.p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar3.C1(u0.b(new FeatureCommand(new FaqFeatureConfig.Starter("902e0ed8-80d6-46e0-b248-9fe06d7a90b4", 2))));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    aw1.l result2 = (aw1.l) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z3 = result2 instanceof aw1.j;
                                    yki.b bVar3 = LazyFlowCoordinator;
                                    if (z3) {
                                        oki.h.w2(bVar3, new BrebAreaFlowContract$Step.More(((aw1.j) result2).f10655a), bottom_dialog);
                                    } else if (result2 instanceof aw1.h) {
                                        oki.h.t2(aVar2, bVar3, new BrebAreaFlowContract$Step.NewAlias(ApmAliasRegistrationMode.Add.f62240b, null), true, null, false, 12);
                                    } else if (result2 instanceof aw1.k) {
                                        aw1.k kVar = (aw1.k) result2;
                                        oki.h.w2(bVar3, new BrebAreaFlowContract$Step.OccupiedKeyInfo(kVar.f10656a, kVar.f10657b), bottom_dialog);
                                    } else {
                                        if (!(result2 instanceof aw1.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i222 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    ew1.i result3 = (ew1.i) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof ew1.g;
                                    yki.b bVar4 = LazyFlowCoordinator;
                                    if (z4) {
                                        ew1.g gVar = (ew1.g) result3;
                                        oki.h.w2(bVar4, new BrebAreaFlowContract$Step.Replace(gVar.f129989a, gVar.f129990b), bottom_dialog);
                                    } else if (result3 instanceof ew1.h) {
                                        oki.h.t2(aVar2, bVar4, new BrebAreaFlowContract$Step.NewAlias(new ApmAliasRegistrationMode.AddAndReplace(((ew1.h) result3).f129991a, com.revolut.feature.apm.breb.api.R$string.bre_b_area_more_replace_key_add_button_title), null), true, null, false, 12);
                                    } else {
                                        if (!(result3 instanceof ew1.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i322 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    yv1.h result4 = (yv1.h) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof yv1.g) {
                                        oki.h.t2(aVar2, LazyFlowCoordinator, new BrebAreaFlowContract$Step.NewAlias(new ApmAliasRegistrationMode.AddAndReplace(((yv1.g) result4).f317089a, com.revolut.feature.apm.breb.api.R$string.bre_b_area_more_replace_key_add_button_title), null), true, null, false, 12);
                                    } else {
                                        if (!(result4 instanceof yv1.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i33 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    brebMoreScreen.H = block7;
                    return brebMoreScreen;
                }
                if (step3 instanceof BrebAreaFlowContract$Step.Send) {
                    return new BrebTransferFlow(BrebTransferNavigation$InputData.Send.f61707a);
                }
                if (step3 instanceof BrebAreaFlowContract$Step.Replace) {
                    BrebAreaFlowContract$Step.Replace replace = (BrebAreaFlowContract$Step.Replace) step3;
                    BrebKeyReplaceScreen brebKeyReplaceScreen = new BrebKeyReplaceScreen(new yv1.e(replace.f61737a, replace.f61738b));
                    final int i33 = 3;
                    Function1 block8 = new Function1() { // from class: pv1.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i212 = i33;
                            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                            switch (i212) {
                                case 0:
                                    v result = (v) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof uv1.o;
                                    com.revolut.feature.apm.breb.impl.flow.area.a aVar3 = aVar2;
                                    yki.b bVar2 = LazyFlowCoordinator;
                                    if (z) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.About.f61724a, true, null, false, 12);
                                    } else if (result instanceof uv1.n) {
                                        oki.h.w2(bVar2, BrebAreaFlowContract$Step.Keys.f61726a, bottom_dialog);
                                    } else if (result instanceof uv1.q) {
                                        oki.h.w2(bVar2, new BrebAreaFlowContract$Step.More(((uv1.q) result).f283285a), bottom_dialog);
                                    } else if (Intrinsics.f(result, uv1.s.f283287a)) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.Send.f61739a, true, null, false, 12);
                                    } else if (result instanceof uv1.r) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.NewContact.f61730a, true, null, false, 12);
                                    } else if (result instanceof uv1.t) {
                                        oki.h.t2(aVar3, bVar2, BrebAreaFlowContract$Step.QrScanner.f61736a, true, null, false, 12);
                                    } else if (result instanceof uv1.u) {
                                        uv1.u uVar = (uv1.u) result;
                                        oki.h.t2(aVar3, bVar2, new BrebAreaFlowContract$Step.QrRequest(uVar.f283289a, null, uVar.f283290b), true, null, false, 12);
                                    } else {
                                        if (!(result instanceof uv1.p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar3.C1(u0.b(new FeatureCommand(new FaqFeatureConfig.Starter("902e0ed8-80d6-46e0-b248-9fe06d7a90b4", 2))));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    aw1.l result2 = (aw1.l) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z3 = result2 instanceof aw1.j;
                                    yki.b bVar3 = LazyFlowCoordinator;
                                    if (z3) {
                                        oki.h.w2(bVar3, new BrebAreaFlowContract$Step.More(((aw1.j) result2).f10655a), bottom_dialog);
                                    } else if (result2 instanceof aw1.h) {
                                        oki.h.t2(aVar2, bVar3, new BrebAreaFlowContract$Step.NewAlias(ApmAliasRegistrationMode.Add.f62240b, null), true, null, false, 12);
                                    } else if (result2 instanceof aw1.k) {
                                        aw1.k kVar = (aw1.k) result2;
                                        oki.h.w2(bVar3, new BrebAreaFlowContract$Step.OccupiedKeyInfo(kVar.f10656a, kVar.f10657b), bottom_dialog);
                                    } else {
                                        if (!(result2 instanceof aw1.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i222 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    ew1.i result3 = (ew1.i) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof ew1.g;
                                    yki.b bVar4 = LazyFlowCoordinator;
                                    if (z4) {
                                        ew1.g gVar = (ew1.g) result3;
                                        oki.h.w2(bVar4, new BrebAreaFlowContract$Step.Replace(gVar.f129989a, gVar.f129990b), bottom_dialog);
                                    } else if (result3 instanceof ew1.h) {
                                        oki.h.t2(aVar2, bVar4, new BrebAreaFlowContract$Step.NewAlias(new ApmAliasRegistrationMode.AddAndReplace(((ew1.h) result3).f129991a, com.revolut.feature.apm.breb.api.R$string.bre_b_area_more_replace_key_add_button_title), null), true, null, false, 12);
                                    } else {
                                        if (!(result3 instanceof ew1.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i322 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    yv1.h result4 = (yv1.h) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof yv1.g) {
                                        oki.h.t2(aVar2, LazyFlowCoordinator, new BrebAreaFlowContract$Step.NewAlias(new ApmAliasRegistrationMode.AddAndReplace(((yv1.g) result4).f317089a, com.revolut.feature.apm.breb.api.R$string.bre_b_area_more_replace_key_add_button_title), null), true, null, false, 12);
                                    } else {
                                        if (!(result4 instanceof yv1.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i332 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    brebKeyReplaceScreen.H = block8;
                    return brebKeyReplaceScreen;
                }
                if (step3 instanceof BrebAreaFlowContract$Step.NewContact) {
                    return new BrebTransferFlow(new BrebTransferNavigation$InputData.NewContact(0));
                }
                if (step3 instanceof BrebAreaFlowContract$Step.NewAlias) {
                    ViewController viewControllerE12 = aVar2.e1(new c12.b(new ApmNewAliasNavigation$InputData(new TextLocalisedClause(com.revolut.feature.apm.breb.api.R$string.bre_b_key_management_sheet_cta_add_key, null, null, 14), ApmBreb.f61810c, ((BrebAreaFlowContract$Step.NewAlias) step3).f61728a, (ApmFooterContent.TextOnly) null, 16), aVar2.f61741q));
                    om4.l0 block9 = new om4.l0(step3, 28, aVar2, LazyFlowCoordinator);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    viewControllerE12.H = block9;
                    return viewControllerE12;
                }
                if (step3 instanceof BrebAreaFlowContract$Step.QrRequest) {
                    BrebAreaFlowContract$Step.QrRequest qrRequest = (BrebAreaFlowContract$Step.QrRequest) step3;
                    return new BrebQrRequestFlow(new BrebQrRequestFlowContract$InputData(qrRequest.f61733a, qrRequest.f61735c, qrRequest.f61734b));
                }
                if (!Intrinsics.f(step3, BrebAreaFlowContract$Step.QrScanner.f61736a)) {
                    if (!(step3 instanceof BrebAreaFlowContract$Step.OccupiedKeyInfo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BrebAreaFlowContract$Step.OccupiedKeyInfo occupiedKeyInfo = (BrebAreaFlowContract$Step.OccupiedKeyInfo) step3;
                    return new BrebOccupiedDialogController(new cw1.c(occupiedKeyInfo.f61731a, occupiedKeyInfo.f61732b));
                }
                ViewController viewControllerE13 = aVar2.e1(new g12.k(new QrScannerInputData(), aVar2.f61742r));
                final int i43 = 1;
                Function1 block10 = new Function1() { // from class: pv1.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i43) {
                            case 0:
                                yja.b it8 = (yja.b) obj5;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                aVar2.B2();
                                break;
                            default:
                                g12.q result = (g12.q) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                x xVarJ = ofm.q.j(result);
                                if (xVarJ != null) {
                                    com.revolut.feature.apm.breb.impl.flow.area.a aVar3 = aVar2;
                                    aVar3.C1(((com.revolut.feature.apm.breb.impl.a) aVar3.f61743s).m(xVarJ.f257683a, hrf.f.OUTGOING, xVarJ.f257684b));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block10, "block");
                viewControllerE13.H = block10;
                return viewControllerE13;
            case 4:
                com.revolut.feature.credit.card.impl.ui.statement.flow.a aVar3 = (com.revolut.feature.credit.card.impl.ui.statement.flow.a) obj4;
                CreditCardStatementFlowContract$InputData creditCardStatementFlowContract$InputData = aVar3.o;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                CreditCardStatementFlowContract$Step step4 = (CreditCardStatementFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof CreditCardStatementFlowContract$Step.Hub)) {
                    if (step4 instanceof CreditCardStatementFlowContract$Step.Details) {
                        return new CreditCardStatementDetailsFlow(new CreditCardStatementDetailsFlowContract$InputData(creditCardStatementFlowContract$InputData.f69704a, ((CreditCardStatementFlowContract$Step.Details) step4).f69705a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardStatementHubScreen creditCardStatementHubScreen = new CreditCardStatementHubScreen(new CreditCardStatementHubScreenContract$InputData(creditCardStatementFlowContract$InputData.f69704a));
                pth.l block11 = new pth.l(aVar3, 5);
                Intrinsics.checkNotNullParameter(block11, "block");
                creditCardStatementHubScreen.H = block11;
                return creditCardStatementHubScreen;
            case 5:
                final com.revolut.feature.kyc.impl.flow.kyc.a aVar4 = (com.revolut.feature.kyc.impl.flow.kyc.a) obj4;
                pv8.b bVar2 = aVar4.f77711p;
                KycFlowContract$InputData kycFlowContract$InputData = aVar4.o;
                yki.l FlowCoordinator4 = (yki.l) obj2;
                KycFlowContract$Step step5 = (KycFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof KycFlowContract$Step.AdditionalVerificationPrompt) {
                    PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(((com.revolut.feature.kyc.impl.flow.kyc.provider.a) bVar2).a(((KycFlowContract$Step.AdditionalVerificationPrompt) step5).f77696a, kycFlowContract$InputData.f77695b));
                    final int i59 = 0;
                    Function1 block12 = new Function1() { // from class: pv8.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i59) {
                                case 0:
                                    u output = (u) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    com.revolut.feature.kyc.impl.flow.kyc.a aVar5 = aVar4;
                                    aVar5.l2(new pnf.f(output, aVar5, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                                default:
                                    ht8.a result = (ht8.a) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.kyc.impl.flow.kyc.a aVar6 = aVar4;
                                    aVar6.l2(new pnf.f(aVar6, result, null, 21), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    promptMarketingScreen.H = block12;
                    return promptMarketingScreen;
                }
                if (step5 instanceof KycFlowContract$Step.USVisaDisclosure) {
                    final wi0.b bVar3 = ((KycFlowContract$Step.USVisaDisclosure) step5).f77700a;
                    AnalyticsProduct analyticsProduct = kycFlowContract$InputData.f77695b;
                    ((com.revolut.feature.kyc.impl.flow.kyc.provider.a) bVar2).getClass();
                    Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                    List listK = zhm.v.k(new IntroductionScreenItem.ImageItem("3D003", "US_VISA_DISCLOSURE_IMAGE_LIST_ID"), new IntroductionScreenItem.ListCellItem(R$drawable.uikit_icn_24_national_id, new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_select_document_instruction_us_visa_hint1, null, null, 14), null, "US_VISA_DISCLOSURE_ITEM_1_LIST_ID"), new IntroductionScreenItem.ListCellItem(R$drawable.uikit_icn_24_decline, new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_select_document_instruction_us_visa_hint2, null, null, 14), null, "US_VISA_DISCLOSURE_ITEM_2_LIST_ID"), new IntroductionScreenItem.ListCellItem(R$drawable.uikit_icn_24_passport, new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_select_document_instruction_us_visa_hint3, null, null, 14), null, "US_VISA_DISCLOSURE_ITEM_3_LIST_ID"));
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_select_document_instruction_us_visa_title, null, null, 14);
                    int i66 = com.revolut.feature.kyc.api.R$string.kyc_select_document_instruction_us_visa_subtitle;
                    TermsScope.INSTANCE.getClass();
                    IntroductionScreen introductionScreen = new IntroductionScreen(new IntroductionScreenContract$InputData(listK, textLocalisedClause, new TextLocalisedClause(i66, null, new Click(28, (Integer) null, (Object) TermsScope.g0, "US_VISA_DISCLOSURE_SUBTITLE_LIST_ID", false), 10), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), analyticsProduct, lx8.a.BACK, 128));
                    final int i74 = 0;
                    Function1 block13 = new Function1() { // from class: pv8.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i74) {
                                case 0:
                                    pw8.i output = (pw8.i) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    com.revolut.feature.kyc.impl.flow.kyc.a aVar5 = aVar4;
                                    aVar5.n2(new g(output, aVar5, bVar3, null), new whi.b(6));
                                    break;
                                default:
                                    dx8.e output2 = (dx8.e) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    com.revolut.feature.kyc.impl.flow.kyc.a aVar6 = aVar4;
                                    aVar6.n2(new prl.k(output2, aVar6, bVar3, (Continuation) null, 7), new whi.b(6));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    introductionScreen.H = block13;
                    return introductionScreen;
                }
                if (step5 instanceof KycFlowContract$Step.RevolutVision) {
                    String verificationToken = ((KycFlowContract$Step.RevolutVision) step5).f77699a;
                    vy8.d dVar = aVar4.f77714s;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
                    BiometricVerificationFlowProvider$InputData inputData = new BiometricVerificationFlowProvider$InputData(verificationToken, nq.x.ONBOARDING_KYC, null, null, false, 124);
                    Intrinsics.checkNotNullParameter(inputData, "inputData");
                    BiometricVerificationLauncherFlow biometricVerificationLauncherFlow = new BiometricVerificationLauncherFlow(inputData);
                    vsl.f block14 = new vsl.f(1, dVar.f293261a, vy8.a.class, "handleResult", "handleResult(Lcom/revolut/biometric_verification/api/navigation/BiometricVerificationFlowProvider$BiometricVerificationOutput;)V", 0, 7);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    biometricVerificationLauncherFlow.H = block14;
                    return biometricVerificationLauncherFlow;
                }
                if (step5 instanceof KycFlowContract$Step.IncodeDocumentProcessingConsent) {
                    final wi0.b bVar4 = ((KycFlowContract$Step.IncodeDocumentProcessingConsent) step5).f77698a;
                    IncodeDocumentProcessingConsentScreen incodeDocumentProcessingConsentScreen = new IncodeDocumentProcessingConsentScreen(new IncodeDocumentProcessingConsentContract$InputData(kycFlowContract$InputData.f77695b));
                    final int i92 = 1;
                    Function1 block15 = new Function1() { // from class: pv8.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i92) {
                                case 0:
                                    pw8.i output = (pw8.i) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    com.revolut.feature.kyc.impl.flow.kyc.a aVar5 = aVar4;
                                    aVar5.n2(new g(output, aVar5, bVar4, null), new whi.b(6));
                                    break;
                                default:
                                    dx8.e output2 = (dx8.e) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    com.revolut.feature.kyc.impl.flow.kyc.a aVar6 = aVar4;
                                    aVar6.n2(new prl.k(output2, aVar6, bVar4, (Continuation) null, 7), new whi.b(6));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block15, "block");
                    incodeDocumentProcessingConsentScreen.H = block15;
                    return incodeDocumentProcessingConsentScreen;
                }
                final int i96 = 1;
                if (!(step5 instanceof KycFlowContract$Step.DocumentCollection)) {
                    throw new NoWhenBranchMatchedException();
                }
                DocumentCollectionFlow documentCollectionFlow = new DocumentCollectionFlow(((KycFlowContract$Step.DocumentCollection) step5).f77697a);
                Function1 block16 = new Function1() { // from class: pv8.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i96) {
                            case 0:
                                u output = (u) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                com.revolut.feature.kyc.impl.flow.kyc.a aVar5 = aVar4;
                                aVar5.l2(new pnf.f(output, aVar5, null, 20), new yi5.b(26));
                                return Unit.f186387a;
                            default:
                                ht8.a result = (ht8.a) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.kyc.impl.flow.kyc.a aVar6 = aVar4;
                                aVar6.l2(new pnf.f(aVar6, result, null, 21), new yi5.b(26));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block16, "block");
                documentCollectionFlow.H = block16;
                return documentCollectionFlow;
            case 6:
                final com.revolut.feature.security_hub.impl.ui.street_mode.flow.b bVar5 = (com.revolut.feature.security_hub.impl.ui.street_mode.flow.b) obj4;
                final yki.l FlowCoordinator5 = (yki.l) obj2;
                StreetModeFlowContract$Step step6 = (StreetModeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof StreetModeFlowContract$Step.SetTrustedLocation) {
                    SetTrustedLocationScreen setTrustedLocationScreen = new SetTrustedLocationScreen(SetTrustedLocationScreenContract$InputData.SetTrustedLocation.f85682a);
                    plc.i block17 = new plc.i(1, bVar5, com.revolut.feature.security_hub.impl.ui.street_mode.flow.b.class, "handleSetTrustedLocationOutputData", "handleSetTrustedLocationOutputData(Lcom/revolut/feature/security_hub/impl/ui/street_mode/set_trusted_location/SetTrustedLocationScreenContract$OutputData;)V", 0, 26);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    setTrustedLocationScreen.H = block17;
                    return setTrustedLocationScreen;
                }
                if (step6 instanceof StreetModeFlowContract$Step.SetTrustedWifiLocation) {
                    SetTrustedLocationScreen setTrustedLocationScreen2 = new SetTrustedLocationScreen(new SetTrustedLocationScreenContract$InputData.SetTrustedWifiLocation(((StreetModeFlowContract$Step.SetTrustedWifiLocation) step6).f85662a));
                    plc.i block18 = new plc.i(1, bVar5, com.revolut.feature.security_hub.impl.ui.street_mode.flow.b.class, "handleSetTrustedLocationOutputData", "handleSetTrustedLocationOutputData(Lcom/revolut/feature/security_hub/impl/ui/street_mode/set_trusted_location/SetTrustedLocationScreenContract$OutputData;)V", 0, 27);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    setTrustedLocationScreen2.H = block18;
                    return setTrustedLocationScreen2;
                }
                if (step6 instanceof StreetModeFlowContract$Step.SearchLocationScreen) {
                    String str2 = ((StreetModeFlowContract$Step.SearchLocationScreen) step6).f85660a;
                    k9 k9Var = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    ViewController viewControllerE14 = bVar5.e1(new th1.e(new FindAddressControllerDescriptor$InputData(str2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), (AnalyticsContext) null, 12)));
                    plc.i block19 = new plc.i(1, bVar5, com.revolut.feature.security_hub.impl.ui.street_mode.flow.b.class, "handleFindAddressOutputData", "handleFindAddressOutputData(Lcom/revolut/feature/address/common/api/navigation/FindAddressControllerDescriptor$OutputData;)V", 0, 28);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    viewControllerE14.H = block19;
                    return viewControllerE14;
                }
                if (step6 instanceof StreetModeFlowContract$Step.NameLocation) {
                    StreetModeFlowContract$Step.NameLocation nameLocation = (StreetModeFlowContract$Step.NameLocation) step6;
                    NameLocationScreen nameLocationScreen = new NameLocationScreen(new NameLocationScreenContract$InputData(nameLocation.f85657a, nameLocation.f85658b, nameLocation.f85659c));
                    plc.i block20 = new plc.i(1, bVar5, com.revolut.feature.security_hub.impl.ui.street_mode.flow.b.class, "handleNameLocationOutputData", "handleNameLocationOutputData(Lcom/revolut/feature/security_hub/impl/ui/street_mode/name_location/NameLocationScreenContract$OutputData;)V", 0, 29);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    nameLocationScreen.H = block20;
                    return nameLocationScreen;
                }
                if (step6 instanceof StreetModeFlowContract$Step.TrustedLocationsList) {
                    trustedWifisListScreen = new TrustedLocationsListScreen();
                    final int i99 = 0;
                    Function1 block21 = new Function1() { // from class: pvc.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i99) {
                                case 0:
                                    xvc.j result = (xvc.j) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, xvc.g.f309233a);
                                    com.revolut.feature.security_hub.impl.ui.street_mode.flow.b bVar6 = bVar5;
                                    yki.l lVar = FlowCoordinator5;
                                    if (zF) {
                                        oki.h.t2(bVar6, lVar, StreetModeFlowContract$Step.SetTrustedLocation.f85661a, true, null, false, 12);
                                    } else if (result instanceof xvc.h) {
                                        oki.h.t2(bVar6, lVar, new StreetModeFlowContract$Step.EditTrustedLocation(((xvc.h) result).f309234a), true, null, false, 12);
                                    } else {
                                        if (!(result instanceof xvc.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        StreetModeTrustedLocation streetModeTrustedLocation = ((xvc.i) result).f309235a;
                                        oki.h.t2(bVar6, lVar, new StreetModeFlowContract$Step.NameLocation(streetModeTrustedLocation.f85428a, streetModeTrustedLocation.f85430c, streetModeTrustedLocation.d), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    zvc.e result2 = (zvc.e) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(bVar5, FlowCoordinator5, new StreetModeFlowContract$Step.SetTrustedWifiLocation(result2.f325646a), true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    trustedWifisListScreen.H = block21;
                } else {
                    if (!(step6 instanceof StreetModeFlowContract$Step.TrustedWifisList)) {
                        if (step6 instanceof StreetModeFlowContract$Step.EditTrustedLocation) {
                            SetTrustedLocationScreen setTrustedLocationScreen3 = new SetTrustedLocationScreen(new SetTrustedLocationScreenContract$InputData.EditTrustedLocation(((StreetModeFlowContract$Step.EditTrustedLocation) step6).f85656a));
                            pvc.e block22 = new pvc.e(1, bVar5, com.revolut.feature.security_hub.impl.ui.street_mode.flow.b.class, "handleSetTrustedLocationOutputData", "handleSetTrustedLocationOutputData(Lcom/revolut/feature/security_hub/impl/ui/street_mode/set_trusted_location/SetTrustedLocationScreenContract$OutputData;)V", 0, 0);
                            Intrinsics.checkNotNullParameter(block22, "block");
                            setTrustedLocationScreen3.H = block22;
                            return setTrustedLocationScreen3;
                        }
                        if (!(step6 instanceof StreetModeFlowContract$Step.StreetModeProductArticle)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ProductArticleParams productArticleParams = ((StreetModeFlowContract$Step.StreetModeProductArticle) step6).f85663a;
                        k9 k9Var2 = k9.SecurityHub;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                        ViewController viewControllerE15 = bVar5.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, false, 48));
                        pth.l block23 = new pth.l(bVar5, 8);
                        Intrinsics.checkNotNullParameter(block23, "block");
                        viewControllerE15.H = block23;
                        return viewControllerE15;
                    }
                    trustedWifisListScreen = new TrustedWifisListScreen();
                    final int i100 = 1;
                    Function1 block24 = new Function1() { // from class: pvc.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i100) {
                                case 0:
                                    xvc.j result = (xvc.j) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, xvc.g.f309233a);
                                    com.revolut.feature.security_hub.impl.ui.street_mode.flow.b bVar6 = bVar5;
                                    yki.l lVar = FlowCoordinator5;
                                    if (zF) {
                                        oki.h.t2(bVar6, lVar, StreetModeFlowContract$Step.SetTrustedLocation.f85661a, true, null, false, 12);
                                    } else if (result instanceof xvc.h) {
                                        oki.h.t2(bVar6, lVar, new StreetModeFlowContract$Step.EditTrustedLocation(((xvc.h) result).f309234a), true, null, false, 12);
                                    } else {
                                        if (!(result instanceof xvc.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        StreetModeTrustedLocation streetModeTrustedLocation = ((xvc.i) result).f309235a;
                                        oki.h.t2(bVar6, lVar, new StreetModeFlowContract$Step.NameLocation(streetModeTrustedLocation.f85428a, streetModeTrustedLocation.f85430c, streetModeTrustedLocation.d), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    zvc.e result2 = (zvc.e) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(bVar5, FlowCoordinator5, new StreetModeFlowContract$Step.SetTrustedWifiLocation(result2.f325646a), true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    trustedWifisListScreen.H = block24;
                }
                return trustedWifisListScreen;
            case 7:
                aw0.e eVar = (aw0.e) obj4;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return eVar;
            case 8:
                WealthProtectionLimitChangeScreen wealthProtectionLimitChangeScreen = (WealthProtectionLimitChangeScreen) obj4;
                CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = WealthProtectionLimitChangeScreen.T;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                Object obj5 = model.f51981p;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.money.Money");
                xi0.b bVar6 = ((dj0.d) obj5).f115083b;
                qd0.b bVarN = ((f0) wealthProtectionLimitChangeScreen.M.getValue()).f291973b.f292075r.n();
                vc.s.j(bVarN);
                return new zp0.d(editText, bVar6, new u80.d(((s80.b) bVarN).b()), null, new ogm.i(wealthProtectionLimitChangeScreen, 6), false, false, 0, false, null, 1960);
            case 9:
                final com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar5 = (com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a) obj4;
                WealthProtectionLimitChangeScreenContract$InputData wealthProtectionLimitChangeScreenContract$InputData = aVar5.o;
                qwc.e eVar2 = aVar5.f85785r;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                WealthProtectionLimitChangeScreenContract$Step step7 = (WealthProtectionLimitChangeScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof WealthProtectionLimitChangeScreenContract$Step.LimitExceedingAmount) {
                    WealthProtectionLimitChangeScreenContract$Step.LimitExceedingAmount limitExceedingAmount = (WealthProtectionLimitChangeScreenContract$Step.LimitExceedingAmount) step7;
                    dj0.d oldMoney = limitExceedingAmount.f85777a;
                    dj0.d newMoney = limitExceedingAmount.f85778b;
                    qtc.k feature = wealthProtectionLimitChangeScreenContract$InputData.f85775a;
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(oldMoney, "oldMoney");
                    Intrinsics.checkNotNullParameter(newMoney, "newMoney");
                    Intrinsics.checkNotNullParameter(feature, "feature");
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_details_amount_dialog_daily_limit_reached_title, null, null, 14);
                    Intrinsics.checkNotNullParameter(feature, "feature");
                    Intrinsics.checkNotNullParameter(oldMoney, "oldMoney");
                    Intrinsics.checkNotNullParameter(newMoney, "newMoney");
                    lw0.a aVar6 = new lw0.a(textLocalisedClause2, new TextLocalisedClause(feature == qtc.k.TRANSFERS ? com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_details_amount_dialog_daily_limit_reached_transfer_subtitle : feature == qtc.k.CARD_PAYMENTS ? com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_details_amount_dialog_daily_limit_reached_card_payments_subtitle : com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_details_amount_dialog_daily_limit_reached_withdraw_subtitle, zhm.v.k(qwc.d.a(oldMoney.f115082a, oldMoney.f115083b), qwc.d.a(newMoney.f115082a, newMoney.f115083b)), null, 12), null, null, false, 28);
                    aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_details_amount_dialog_limit_reached_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_details_amount_dialog_limit_reached_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), null, null, null, 121);
                    k9 k9Var3 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar6, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                    final int i101 = 0;
                    Function1 block25 = new Function1() { // from class: pwc.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i101) {
                                case 0:
                                    dii.g result = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof dii.e) {
                                        com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar7 = aVar5;
                                        if (aVar7.I2()) {
                                            aVar7.l2(new pwb.p(aVar7, null, 1), new yi5.b(26));
                                        } else {
                                            aVar7.C2(i.f240407a);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    eii.k result2 = (eii.k) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof eii.i) {
                                        Object obj7 = ((eii.i) result2).f126655a;
                                        Intrinsics.i(obj7, "null cannot be cast to non-null type com.revolut.feature.security_hub.api.models.StreetModeDelayDuration");
                                        StreetModeDelayDuration streetModeDelayDuration = (StreetModeDelayDuration) obj7;
                                        String str3 = streetModeDelayDuration.f85418a;
                                        com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar8 = aVar5;
                                        Data data = ((g) ((j2) aVar8.D.f22677a).getValue()).f240404h;
                                        StreetModeInfo streetModeInfo = data != null ? (StreetModeInfo) zi0.c.I(data) : null;
                                        if (streetModeInfo == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        StreetModeDelayDuration streetModeDelayDurationB = streetModeInfo.b();
                                        if (Intrinsics.f(str3, streetModeDelayDurationB != null ? streetModeDelayDurationB.f85418a : null)) {
                                            return Unit.f186387a;
                                        }
                                        StreetModeDelayDurationDisclaimer streetModeDelayDurationDisclaimer = streetModeDelayDuration.e;
                                        if (streetModeDelayDurationDisclaimer != null) {
                                            oki.h.v2(aVar8.E, new WealthProtectionLimitChangeScreenContract$Step.SecurityDelayDurationDisclaimer(str3, streetModeDelayDurationDisclaimer), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            aVar8.K2(str3);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block25, "block");
                    actionsBottomSheetController.H = block25;
                    return actionsBottomSheetController;
                }
                if (step7 instanceof WealthProtectionLimitChangeScreenContract$Step.LimitSetToZero) {
                    xi0.b currency = ((WealthProtectionLimitChangeScreenContract$Step.LimitSetToZero) step7).f85779a;
                    qtc.k feature2 = wealthProtectionLimitChangeScreenContract$InputData.f85775a;
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    Intrinsics.checkNotNullParameter(feature2, "feature");
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_details_amount_dialog_limit_set_to_zero_title, zhm.u.c(qwc.d.a(0L, currency)), null, 12);
                    Intrinsics.checkNotNullParameter(feature2, "feature");
                    lw0.a aVar7 = new lw0.a(textLocalisedClause3, feature2 == qtc.k.TRANSFERS ? new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_details_amount_dialog_limit_set_to_zero_transfer_subtitle, null, null, 14) : feature2 == qtc.k.CARD_PAYMENTS ? new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_details_amount_dialog_limit_set_to_zero_card_payments_subtitle, null, null, 14) : new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_details_amount_dialog_limit_set_to_zero_withdrawal_subtitle, null, null, 14), null, null, false, 28);
                    aw0.h hVar2 = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_details_amount_dialog_limit_reached_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_details_amount_dialog_limit_reached_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), null, null, null, 121);
                    k9 k9Var4 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar7, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
                    final int i102 = 0;
                    Function1 block26 = new Function1() { // from class: pwc.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i102) {
                                case 0:
                                    dii.g result = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof dii.e) {
                                        com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar72 = aVar5;
                                        if (aVar72.I2()) {
                                            aVar72.l2(new pwb.p(aVar72, null, 1), new yi5.b(26));
                                        } else {
                                            aVar72.C2(i.f240407a);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    eii.k result2 = (eii.k) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof eii.i) {
                                        Object obj7 = ((eii.i) result2).f126655a;
                                        Intrinsics.i(obj7, "null cannot be cast to non-null type com.revolut.feature.security_hub.api.models.StreetModeDelayDuration");
                                        StreetModeDelayDuration streetModeDelayDuration = (StreetModeDelayDuration) obj7;
                                        String str3 = streetModeDelayDuration.f85418a;
                                        com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar8 = aVar5;
                                        Data data = ((g) ((j2) aVar8.D.f22677a).getValue()).f240404h;
                                        StreetModeInfo streetModeInfo = data != null ? (StreetModeInfo) zi0.c.I(data) : null;
                                        if (streetModeInfo == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        StreetModeDelayDuration streetModeDelayDurationB = streetModeInfo.b();
                                        if (Intrinsics.f(str3, streetModeDelayDurationB != null ? streetModeDelayDurationB.f85418a : null)) {
                                            return Unit.f186387a;
                                        }
                                        StreetModeDelayDurationDisclaimer streetModeDelayDurationDisclaimer = streetModeDelayDuration.e;
                                        if (streetModeDelayDurationDisclaimer != null) {
                                            oki.h.v2(aVar8.E, new WealthProtectionLimitChangeScreenContract$Step.SecurityDelayDurationDisclaimer(str3, streetModeDelayDurationDisclaimer), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            aVar8.K2(str3);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block26, "block");
                    actionsBottomSheetController2.H = block26;
                    return actionsBottomSheetController2;
                }
                if (!(step7 instanceof WealthProtectionLimitChangeScreenContract$Step.SecurityDelayDurations)) {
                    if (!(step7 instanceof WealthProtectionLimitChangeScreenContract$Step.SecurityDelayDurationDisclaimer)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    WealthProtectionLimitChangeScreenContract$Step.SecurityDelayDurationDisclaimer securityDelayDurationDisclaimer = (WealthProtectionLimitChangeScreenContract$Step.SecurityDelayDurationDisclaimer) step7;
                    String str3 = securityDelayDurationDisclaimer.f85780a;
                    StreetModeDelayDurationDisclaimer disclaimer = securityDelayDurationDisclaimer.f85781b;
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
                    lw0.a aVar8 = new lw0.a(new TextClause(disclaimer.f85421a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(disclaimer.f85422b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28);
                    aw0.h hVar3 = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_details_amount_dialog_delay_disclaimer_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_details_amount_dialog_delay_disclaimer_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), null, null, null, 121);
                    k9 k9Var5 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar8, hVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
                    m block27 = new m(aVar5, str3, 5);
                    Intrinsics.checkNotNullParameter(block27, "block");
                    actionsBottomSheetController3.H = block27;
                    return actionsBottomSheetController3;
                }
                List delayDurations = ((WealthProtectionLimitChangeScreenContract$Step.SecurityDelayDurations) step7).f85782a;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(delayDurations, "delayDurations");
                lw0.a aVar9 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_security_limits_amount_street_mode_security_delay_title, null, null, 14), null, null, null, false, 30);
                List<StreetModeDelayDuration> list = delayDurations;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (StreetModeDelayDuration streetModeDelayDuration : list) {
                    arrayList.add(new eii.l((Clause) new TextClause(streetModeDelayDuration.f85419b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) new TextClause(streetModeDelayDuration.f85420c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(streetModeDelayDuration.f ? R$drawable.uikit_icn_24_radiobutton_on : R$drawable.uikit_icn_24_radiobutton_off, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, false, 4), true, streetModeDelayDuration.f, (RowDelegate.Model.c) null, (Object) streetModeDelayDuration, 200));
                }
                k9 value = k9.SecurityHub;
                Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar9, null, arrayList, new AnalyticsProduct.Retail(value), null));
                final int i103 = 1;
                Function1 block28 = new Function1() { // from class: pwc.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i103) {
                            case 0:
                                dii.g result = (dii.g) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof dii.e) {
                                    com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar72 = aVar5;
                                    if (aVar72.I2()) {
                                        aVar72.l2(new pwb.p(aVar72, null, 1), new yi5.b(26));
                                    } else {
                                        aVar72.C2(i.f240407a);
                                    }
                                }
                                return Unit.f186387a;
                            default:
                                eii.k result2 = (eii.k) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof eii.i) {
                                    Object obj7 = ((eii.i) result2).f126655a;
                                    Intrinsics.i(obj7, "null cannot be cast to non-null type com.revolut.feature.security_hub.api.models.StreetModeDelayDuration");
                                    StreetModeDelayDuration streetModeDelayDuration2 = (StreetModeDelayDuration) obj7;
                                    String str32 = streetModeDelayDuration2.f85418a;
                                    com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar82 = aVar5;
                                    Data data = ((g) ((j2) aVar82.D.f22677a).getValue()).f240404h;
                                    StreetModeInfo streetModeInfo = data != null ? (StreetModeInfo) zi0.c.I(data) : null;
                                    if (streetModeInfo == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    StreetModeDelayDuration streetModeDelayDurationB = streetModeInfo.b();
                                    if (Intrinsics.f(str32, streetModeDelayDurationB != null ? streetModeDelayDurationB.f85418a : null)) {
                                        return Unit.f186387a;
                                    }
                                    StreetModeDelayDurationDisclaimer streetModeDelayDurationDisclaimer = streetModeDelayDuration2.e;
                                    if (streetModeDelayDurationDisclaimer != null) {
                                        oki.h.v2(aVar82.E, new WealthProtectionLimitChangeScreenContract$Step.SecurityDelayDurationDisclaimer(str32, streetModeDelayDurationDisclaimer), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        aVar82.K2(str32);
                                    }
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block28, "block");
                rowActionsBottomSheetController.H = block28;
                return rowActionsBottomSheetController;
            case 10:
                PetAgeFragment petAgeFragment = (PetAgeFragment) obj4;
                InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                InputText field2 = (InputText) obj3;
                int i104 = PetAgeFragment.f76230k0;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                if (!Intrinsics.f(model2.f52580a, "DAY_OF_BIRTH_INPUT_TEXT_LIST_ID")) {
                    return null;
                }
                qd0.b languageProvider = ((ox7.c) petAgeFragment.f0.getValue()).f230677a.f230661b.n();
                vc.s.j(languageProvider);
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                ihm.f dateOfBirthSubject = petAgeFragment.g0;
                Intrinsics.checkNotNullParameter(field2, "field");
                Intrinsics.checkNotNullParameter(dateOfBirthSubject, "dateOfBirthSubject");
                return new zp0.p(((s80.b) languageProvider).a(), field2.getInnerEditText(), new b3.a(dateOfBirthSubject, 5), "MM/yyyy", true, true, null, false, CaptureActivity.RESULT_EXIT_USER_FLOW);
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((pxg.b) obj4).f240618a.c("complex-analytics-performance-chart");
            case 12:
                com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar10 = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InvitesDetailsContract$ModalStep step8 = (InvitesDetailsContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof InvitesDetailsContract$ModalStep.FaqDialog) {
                    InvitesDetailsContract$ModalStep.FaqDialog faqDialog = (InvitesDetailsContract$ModalStep.FaqDialog) step8;
                    String str4 = faqDialog.f81874a;
                    lw0.a aVar11 = new lw0.a(new TrackableClause(new TextClause(faqDialog.f81875b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), faqDialog.d), new TextClause(faqDialog.f81876c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28);
                    aw0.h hVar4 = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.shared.referrals.ui.impl.R$string.referrals_invite_details_faq_need_more_help, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, str4, 508), null, null, null, 121);
                    k9 k9Var6 = k9.Referrals;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController4 = new ActionsBottomSheetController(new dii.a(aVar11, hVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6), null, null, 24));
                    m block29 = new m(aVar10, str4, 9);
                    Intrinsics.checkNotNullParameter(block29, "block");
                    actionsBottomSheetController4.H = block29;
                    return actionsBottomSheetController4;
                }
                if (step8 instanceof InvitesDetailsContract$ModalStep.LearnMore) {
                    cya.h hVar5 = aVar10.z;
                    AdditionalInfo additionalInfo = ((InvitesDetailsContract$ModalStep.LearnMore) step8).f81878a;
                    hVar5.getClass();
                    return cya.h.a(additionalInfo);
                }
                if (!(step8 instanceof InvitesDetailsContract$ModalStep.IneligibilityDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                cya.g gVar = aVar10.A;
                String str5 = ((InvitesDetailsContract$ModalStep.IneligibilityDialog) step8).f81877a;
                pth.l lVar = new pth.l(aVar10, 15);
                gVar.getClass();
                ActionsBottomSheetController actionsBottomSheetControllerA = cya.g.a(str5, lVar);
                actionsBottomSheetControllerA.k2(new pgk.f(aVar10, 29));
                return actionsBottomSheetControllerA;
            case 13:
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field3 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = CardSetLimitScreen.R;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field3, "field");
                MaskedTextInputEditText editText2 = field3.getEditText();
                Object obj6 = data.f51981p;
                Intrinsics.i(obj6, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                qd0.b bVarN2 = ((lz2.d) ((CardSetLimitScreen) obj4).L.getValue()).f200909b.d.n();
                vc.s.j(bVarN2);
                return new zp0.d(editText2, (xi0.b) obj6, new u80.d(((s80.b) bVarN2).b()), null, null, false, false, 0, false, null, 1944);
            case 14:
                com.revolut.feature.rev_points.impl.ui.opt_in.flow.a aVar12 = (com.revolut.feature.rev_points.impl.ui.opt_in.flow.a) obj4;
                yki.l FlowCoordinator6 = (yki.l) obj2;
                LifestyleRevPointsFlowContract$Step step9 = (LifestyleRevPointsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (Intrinsics.f(step9, LifestyleRevPointsFlowContract$Step.OptIn.f83808a)) {
                    LifestyleRevPointsOptInController$InputData lifestyleRevPointsOptInController$InputData = aVar12.f83813p;
                    RevPointsOptInScreen revPointsOptInScreen = new RevPointsOptInScreen(new RevPointsOptInScreenContract$InputData(lifestyleRevPointsOptInController$InputData.f83542a, lifestyleRevPointsOptInController$InputData.f83544c));
                    pth.l block30 = new pth.l(aVar12, 24);
                    Intrinsics.checkNotNullParameter(block30, "block");
                    revPointsOptInScreen.H = block30;
                    return revPointsOptInScreen;
                }
                boolean zF = Intrinsics.f(step9, LifestyleRevPointsFlowContract$Step.SpareChangeFullMultiplier.f83812a);
                RevPointsSpareChangeControllerApi$Mode.OnBoarding onBoarding = RevPointsSpareChangeControllerApi$Mode.OnBoarding.f84129a;
                if (zF) {
                    ViewController viewControllerE16 = aVar12.e1(new p1c.g(new RevPointsSpareChangeControllerApi$InputData(onBoarding)));
                    aVar12.J2(viewControllerE16);
                    return viewControllerE16;
                }
                if (Intrinsics.f(step9, LifestyleRevPointsFlowContract$Step.SpareChangeFullGrid.f83811a)) {
                    ViewController viewControllerE17 = aVar12.e1(new p1c.e(new RevPointsSpareChangeControllerApi$InputData(onBoarding)));
                    aVar12.J2(viewControllerE17);
                    return viewControllerE17;
                }
                if (Intrinsics.f(step9, LifestyleRevPointsFlowContract$Step.SpareChangeFullBannerGrid.f83810a)) {
                    ViewController viewControllerE18 = aVar12.e1(new p1c.d(new RevPointsSpareChangeFullBannerGridControllerApi$InputData(new RevPointsSpareChangeControllerApi$InputData(onBoarding), RevPointsSpareChangeFullBannerGridControllerApi$CompletionMode.RETURN_OPT_IN_RESULT)));
                    aVar12.J2(viewControllerE18);
                    return viewControllerE18;
                }
                if (!Intrinsics.f(step9, LifestyleRevPointsFlowContract$Step.SpareChangeBottomSheet.f83809a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE19 = aVar12.e1(new p1c.a(new RevPointsSpareChangeControllerApi$InputData(onBoarding)));
                aVar12.J2(viewControllerE19);
                return viewControllerE19;
            case 15:
                com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar13 = (com.revolut.feature.statements.impl.ui.consolidated.screen.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ConsolidatedStatementScreenContract$ModalStep step10 = (ConsolidatedStatementScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof ConsolidatedStatementScreenContract$ModalStep.ChooseProduct)) {
                    if (!(step10 instanceof ConsolidatedStatementScreenContract$ModalStep.ChooseFilters)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CustomisationState customisationState = ((ConsolidatedStatementScreenContract$ModalStep.ChooseFilters) step10).f88314a;
                    ConsolidatedStatementCustomisationScreen consolidatedStatementCustomisationScreen = new ConsolidatedStatementCustomisationScreen(new ConsolidatedStatementCustomisationScreenContract$InputData(customisationState.getParameters(), customisationState.getSelection()));
                    pzd.s block31 = new pzd.s(aVar13, 2);
                    Intrinsics.checkNotNullParameter(block31, "block");
                    consolidatedStatementCustomisationScreen.H = block31;
                    return consolidatedStatementCustomisationScreen;
                }
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_product_picker_title, null, null, 14);
                y7a.s sVar2 = y7a.s.CROSS;
                Set set = ((pzd.p) ((j2) aVar13.f88322x.f22677a).getValue()).f240969a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj7 : set) {
                    if (((SelectableProductType) obj7).f88325b) {
                        arrayList2.add(obj7);
                    }
                }
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(((SelectableProductType) it8.next()).f88324a.name());
                }
                PickerScreen pickerScreen = new PickerScreen(new PickerScreenContract$InputData(null, textLocalisedClause4, null, sVar2, false, null, "StatementsConsolidatedProductPickerInteractor", null, null, d0.i1(arrayList3), null, false, null, null, null, 134081337));
                pzd.s sVar3 = new pzd.s(aVar13, 3);
                Intrinsics.checkNotNullParameter(sVar3, "<set-?>");
                pickerScreen.H = sVar3;
                return pickerScreen;
            case 16:
                com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b bVar7 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b) obj4;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                TopupWithNewCardFlowContract$Step step11 = (TopupWithNewCardFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof TopupWithNewCardFlowContract$Step.ThreeDs)) {
                    throw new NoWhenBranchMatchedException();
                }
                TopupWithNewCardFlowContract$Step.ThreeDs threeDs = (TopupWithNewCardFlowContract$Step.ThreeDs) step11;
                ThreeDsScreen threeDsScreen = new ThreeDsScreen(new dze.d(threeDs.f91007a, threeDs.f91008b, false));
                m block32 = new m(bVar7, LazyFlowCoordinator2, 18);
                Intrinsics.checkNotNullParameter(block32, "block");
                threeDsScreen.H = block32;
                return threeDsScreen;
            case 17:
                com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar8 = (com.revolut.feature.card_management.impl.ui.kompot.settings.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RevolutCardSettingsScreenContract$ModalStep step12 = (RevolutCardSettingsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof RevolutCardSettingsScreenContract$ModalStep.CobrandedValueReminder)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE110 = bVar8.e1(new s5b.b(((i0) ((j2) bVar8.E.f22677a).getValue()).f241080a));
                m block33 = new m(bVar8, step12, 20);
                Intrinsics.checkNotNullParameter(block33, "block");
                viewControllerE110.H = block33;
                return viewControllerE110;
            case 18:
                return a(obj2, obj3);
            case 19:
                return b(obj2, obj3);
            case 20:
                return c(obj2, obj3);
            case 21:
                return d(obj2, obj3);
            case 22:
                return e(obj2, obj3);
            case 23:
                return g(obj2, obj3);
            case 24:
                return h(obj2, obj3);
            case 25:
                return i(obj2, obj3);
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new q4a.k(zhm.f0.f322471a, (q4a.i) obj4);
            case 27:
                return j(obj2, obj3);
            case 28:
                return k(obj2, obj3);
            default:
                com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a aVar14 = (com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DeFiSendAddBeneficiaryScreenContract$Modal modal = (DeFiSendAddBeneficiaryScreenContract$Modal) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(modal, "modal");
                if (Intrinsics.f(modal, DeFiSendAddBeneficiaryScreenContract$Modal.AddressTypeInfo.f71814a)) {
                    return aVar14.e1(new rj5.b(rj5.c.ADDRESS_TYPE));
                }
                if (!Intrinsics.f(modal, DeFiSendAddBeneficiaryScreenContract$Modal.QrScanner.f71815a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE111 = aVar14.e1(zi5.c.f322502a);
                q56.o block34 = new q56.o(aVar14, i2);
                Intrinsics.checkNotNullParameter(block34, "block");
                viewControllerE111.H = block34;
                return viewControllerE111;
        }
    }

    public /* synthetic */ d(q4b.h hVar, q4b.e eVar) {
        this.f239820a = 27;
        this.f239821b = eVar;
    }
}
