package dt4;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.BiometricVerificationManualInputContract$ModalStep;
import com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent;
import com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.BiometricVerificationManualInputViewController;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.RawCutoutImageBadge;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ShimmerImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.network.models.topup.McyTransferReviewDto;
import com.revolut.data.network.models.topup.MultiCurrencyTransferReviewRequest;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.ApmRecipientSettingsFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.CreditCardInstalmentHubFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.CreditCardInstalmentHubFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlow;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.settings.due_date.CreditCardSelectDueDateScreen;
import com.revolut.feature.credit.card.impl.ui.settings.due_date.CreditCardSelectDueDateScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.CreditCardSelectDueDateFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.CreditCardSelectDueDateFlowContract$Step;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.customer_present.tips.impl.screen.custom_tip.CustomTipScreen;
import com.revolut.feature.freelancer.impl.ui.profile.tax.flow.FreelancerTaxSettingsFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.TaxHubAssessmentFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.TaxHubAssessmentFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.TaxHubFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.TaxHubScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow.TaxHubPaymentFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow.TaxHubPaymentFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow.TaxHubProfileFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow.TaxHubProfileFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlowContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.insurance_credit.impl.data.model.action.Button;
import com.revolut.feature.insurance_credit.impl.data.model.action.Image;
import com.revolut.feature.insurance_credit.impl.data.model.action.LinkAction;
import com.revolut.feature.insurance_credit.impl.data.model.action.Prompt;
import com.revolut.feature.insurance_credit.impl.data.model.action.ScreenContent;
import com.revolut.feature.insurance_credit.impl.data.model.action.ShowConfirmationAction;
import com.revolut.feature.insurance_credit.impl.data.model.action.ShowCoverageDetailsAction;
import com.revolut.feature.insurance_credit.impl.ui.flow.InsuranceCreditFlowContract$InputData;
import com.revolut.feature.insurance_credit.impl.ui.flow.InsuranceCreditFlowContract$Step;
import com.revolut.feature.insurance_credit.impl.ui.screen.cancellation_confirmation.CancellationConfirmationScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.cancellation_confirmation.CancellationConfirmationScreenContract$InputData;
import com.revolut.feature.insurance_credit.impl.ui.screen.contact.ContactScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.contact.ContactScreenContract$InputData;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_bottom_sheet.CoverageBottomSheetController;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_bottom_sheet.CoverageBottomSheetControllerContract$InputData;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.CoverageDetailsScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.CoverageDetailsScreenContract$InputData;
import com.revolut.feature.insurance_credit.impl.ui.screen.details.InsuranceDetailsScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.details.InsuranceDetailsScreenContract$InputData;
import com.revolut.feature.insurance_credit.impl.ui.screen.documents.DocumentsScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.documents.DocumentsScreenContract$InputData;
import com.revolut.feature.kyc.impl.idnow.eid.flow.IdnowEidFlowContract$Step;
import com.revolut.feature.kyc.impl.idnow.eid.screen.IdnowEidScreen;
import com.revolut.feature.kyc.impl.idnow.eid.screen.IdnowEidScreenContract$InputData;
import com.revolut.feature.kyc.impl.ondemand.OnDemandFeatureInstallFlow;
import com.revolut.feature.kyc.impl.ondemand.OnDemandFeatureInstallFlowContract$InputData;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.TransactionsDayNightLimitsScreenContract$ModalStep;
import com.revolut.feature.semi_independent_onboarding.api.navigation.SemiIndependentInvitationContract$InputData;
import com.revolut.feature.semi_independent_onboarding.impl.ui.details.SemiIndependentOnboardingDetailsScreenContract$ModalStep;
import com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.SemiIndependentOnboardingInvitationFlow;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.ThreeDsScreenContract$ModalStep;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration_tax_id.TradeRevPointsAccountRegistrationTaxIdScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration_tax_id.TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreenContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreenContract$ModalStep;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.redeem_options.TradeRevPointsRedeemOptionsScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.redeem_options.TradeRevPointsRedeemOptionsScreenContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.unlinking.TradeRevPointsAccountUnlinkingScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.unlinking.TradeRevPointsAccountUnlinkingScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.TransferReasonsAmountAllocationScreen;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreenContract$ModalStep;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.feature.wealth.analytics.ui.widgetised.allocation.WidgetisedAnalyticsAllocationScreenContract$ModalStep;
import com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountController;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.time.date_picker.DatePickerBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.delegates.stats.kompot.CustomisedStatsDialogProvider;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.DetailedStatsControllerContract$ModalStep;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary.GlossaryScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.national_identifier_document_screen.NationalIdentifierDocumentFragment;
import dcf.v0;
import dmj.e0;
import e2f.z;
import grl.k9;
import ip0.og;
import ip0.pb0;
import ip0.zj;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import nii.y0;
import oki.h;
import pd7.g;
import pd7.i;
import pd7.j;
import pd7.k;
import pd7.l;
import pd7.m;
import tw8.f;
import v30.e1;
import vc.s;
import vkm.j2;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f117381b;

    public /* synthetic */ p(int i, cli.j jVar, cli.n nVar) {
        this.f117380a = i;
        this.f117381b = jVar;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar = (com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b) this.f117381b;
        TradeRevPointsAgentDetailsScreenContract$InputData tradeRevPointsAgentDetailsScreenContract$InputData = bVar.o;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        TradeRevPointsAgentDetailsScreenContract$ModalStep step = (TradeRevPointsAgentDetailsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof TradeRevPointsAgentDetailsScreenContract$ModalStep.BrandInfo) {
            TradeRevPointsAgentDetailsScreenContract$ModalStep.BrandInfo brandInfo = (TradeRevPointsAgentDetailsScreenContract$ModalStep.BrandInfo) step;
            lw0.a aVar = new lw0.a(new TextClause(brandInfo.f91144b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(brandInfo.f91145c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new lw0.b(new UrlImage(brandInfo.f91143a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null), null, false, 24);
            aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.trade_rev_points_home_section_learn_more_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
            k9 k9Var = k9.Hotels;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            e1.b block = new e1.b(bVar, step, 7);
            Intrinsics.checkNotNullParameter(block, "block");
            actionsBottomSheetController.H = block;
            return actionsBottomSheetController;
        }
        if (step instanceof TradeRevPointsAgentDetailsScreenContract$ModalStep.RevPointsGiftCardsPurchase) {
            ViewController viewControllerE1 = bVar.e1(new uvb.i(((TradeRevPointsAgentDetailsScreenContract$ModalStep.RevPointsGiftCardsPurchase) step).f91147a));
            z block2 = new z(bVar, 1);
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerE1.H = block2;
            return viewControllerE1;
        }
        if (step instanceof TradeRevPointsAgentDetailsScreenContract$ModalStep.AccountRegistrationByTaxId) {
            TradeRevPointsAccountRegistrationTaxIdScreen tradeRevPointsAccountRegistrationTaxIdScreen = new TradeRevPointsAccountRegistrationTaxIdScreen(new TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData(((TradeRevPointsAgentDetailsScreenContract$ModalStep.AccountRegistrationByTaxId) step).f91140a, tradeRevPointsAgentDetailsScreenContract$InputData.f91137a, tradeRevPointsAgentDetailsScreenContract$InputData.f91138b));
            z block3 = new z(bVar, 2);
            Intrinsics.checkNotNullParameter(block3, "block");
            tradeRevPointsAccountRegistrationTaxIdScreen.H = block3;
            return tradeRevPointsAccountRegistrationTaxIdScreen;
        }
        if (step instanceof TradeRevPointsAgentDetailsScreenContract$ModalStep.AccountUnlinking) {
            return new TradeRevPointsAccountUnlinkingScreen(new TradeRevPointsAccountUnlinkingScreenContract$InputData(tradeRevPointsAgentDetailsScreenContract$InputData.f91137a, ((TradeRevPointsAgentDetailsScreenContract$ModalStep.AccountUnlinking) step).f91142a, tradeRevPointsAgentDetailsScreenContract$InputData.f91138b));
        }
        if (!(step instanceof TradeRevPointsAgentDetailsScreenContract$ModalStep.RedeemOptions)) {
            throw new NoWhenBranchMatchedException();
        }
        TradeRevPointsRedeemOptionsScreen tradeRevPointsRedeemOptionsScreen = new TradeRevPointsRedeemOptionsScreen(new TradeRevPointsRedeemOptionsScreenContract$InputData(((TradeRevPointsAgentDetailsScreenContract$ModalStep.RedeemOptions) step).f91146a));
        z block4 = new z(bVar, 3);
        Intrinsics.checkNotNullParameter(block4, "block");
        tradeRevPointsRedeemOptionsScreen.H = block4;
        return tradeRevPointsRedeemOptionsScreen;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    private final Object b(Object obj2, Object obj3) {
        int i;
        TPSLAmountController tPSLAmountController = (TPSLAmountController) this.f117381b;
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
        CenteredAmountView field = (CenteredAmountView) obj3;
        TPSLAmountController.Companion aVar = TPSLAmountController.INSTANCE;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(field, "field");
        Object obj4 = model.f51981p;
        String str = obj4 instanceof String ? (String) obj4 : null;
        if (str == null) {
            return null;
        }
        MaskedTextInputEditText editText = field.getEditText();
        xi0.b bVar = new xi0.b(6, str, null);
        qd0.b bVarN = ((v0i.d) tPSLAmountController.V.getValue()).f284876b.i.n();
        s.j(bVarN);
        u80.d dVar = new u80.d(((s80.b) bVarN).b());
        e3i.s sVar = (e3i.s) tPSLAmountController.k3();
        int i2 = e3i.r.f122311a[((e3i.j) ((j2) sVar.f122321x.f22677a).getValue()).f122301g.ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = sVar.o.e;
        }
        return new zp0.d(editText, bVar, dVar, null, new zjh.i(tPSLAmountController, 24), false, false, i, ((e3i.j) ((j2) ((e3i.s) tPSLAmountController.k3()).f122321x.f22677a).getValue()).f122301g == e3i.l.PERCENT, null, 1192);
    }

    private final Object c(Object obj2, Object obj3) {
        eii.c cVar;
        com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b bVar = (com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b) this.f117381b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        ApmRecipientSettingsFlowContract$Step step = (ApmRecipientSettingsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof ApmRecipientSettingsFlowContract$Step.Dialog)) {
            throw new NoWhenBranchMatchedException();
        }
        ApmRecipient recipient = ((ApmRecipientSettingsFlowContract$Step.Dialog) step).f62404a;
        ApmRecipientSettingsValue f62271b = bVar.o.getF62271b();
        if (!(f62271b instanceof ApmRecipientSettingsValue.BlockIncomingMoneyRequests)) {
            throw new NoWhenBranchMatchedException();
        }
        ApmRecipientSettingsValue.BlockIncomingMoneyRequests settings = (ApmRecipientSettingsValue.BlockIncomingMoneyRequests) f62271b;
        lx1.i iVar = bVar.f62406p.f122372a;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(settings, "settings");
        boolean z = false;
        int i = 6;
        if (settings.f62115a) {
            fy1.q qVar = (fy1.q) iVar;
            boolean z3 = false;
            lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_contact_unblock_title, u.c(new TextClause(recipient.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_contact_unblock_subtitle, null, null, 14), new lw0.b(qVar.c(recipient), new RawCutoutImageBadge(qVar.a(recipient))), null, false, 24);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_contact_block_cell_request, null, null, 14);
            RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new GlyphImage(R$drawable.uikit_icn_24_request, null, null, 6), z, z, i);
            Clause clause = null;
            boolean z4 = false;
            List listC = u.c(new eii.l(textLocalisedClause, clause, image24, z3, z4, (RowDelegate.Model.c) null, (Object) null, 488));
            m6 m6Var = n6.Companion;
            aw0.g gVar = new aw0.g(m6.c(m6Var, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_contact_unblock_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_contact_unblock_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), (Clause) null, (aw0.f) null, 25);
            k9 value = k9.Payments;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            cVar = new eii.c(aVar, gVar, listC, new AnalyticsProduct.Retail(value), null);
        } else {
            fy1.q qVar2 = (fy1.q) iVar;
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_contact_block_title, u.c(new TextClause(recipient.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_contact_block_subtitle, null, null, 14), new lw0.b(qVar2.c(recipient), new RawCutoutImageBadge(qVar2.a(recipient))), null, false, 24);
            List listC2 = u.c(new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_contact_block_cell_request, null, null, 14), (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new GlyphImage(R$drawable.uikit_icn_24_request, null, null, 6), z, z, i), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
            m6 m6Var2 = n6.Companion;
            aw0.g gVar2 = new aw0.g(m6.c(m6Var2, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_contact_block_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var2, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_contact_block_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), (Clause) null, (aw0.f) null, 25);
            k9 value2 = k9.Payments;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value2, "value");
            cVar = new eii.c(aVar2, gVar2, listC2, new AnalyticsProduct.Retail(value2), null);
        }
        RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(cVar);
        e1.b block = new e1.b(bVar, recipient, 16);
        Intrinsics.checkNotNullParameter(block, "block");
        rowActionsBottomSheetController.H = block;
        return rowActionsBottomSheetController;
    }

    /* JADX WARN: Type inference failed for: r1v145, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ViewController coverageBottomSheetController;
        Image imageC;
        String str;
        TextLocalisedClause textLocalisedClause;
        ViewController viewControllerA;
        ViewController creditCardRepayFlow;
        int i;
        TextLocalisedClause textLocalisedClause2;
        List listC;
        int i2 = this.f117380a;
        int i3 = 5;
        Object obj4 = this.f117381b;
        switch (i2) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new m(((r) obj4).f117384c, (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)), j.f117371a);
            case 1:
                com.revolut.feature.insurance_credit.impl.ui.flow.a aVar = (com.revolut.feature.insurance_credit.impl.ui.flow.a) obj4;
                InsuranceCreditFlowContract$InputData insuranceCreditFlowContract$InputData = aVar.o;
                yki.l FlowCoordinator = (yki.l) obj2;
                InsuranceCreditFlowContract$Step step = (InsuranceCreditFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof InsuranceCreditFlowContract$Step.Details) {
                    InsuranceDetailsScreen insuranceDetailsScreen = new InsuranceDetailsScreen(new InsuranceDetailsScreenContract$InputData(insuranceCreditFlowContract$InputData.f75804b));
                    e0 block = new e0(aVar, 28);
                    Intrinsics.checkNotNullParameter(block, "block");
                    insuranceDetailsScreen.H = block;
                    return insuranceDetailsScreen;
                }
                if (!(step instanceof InsuranceCreditFlowContract$Step.CancellationPrompt)) {
                    if (step instanceof InsuranceCreditFlowContract$Step.CancellationConfirmation) {
                        ShowConfirmationAction showConfirmationAction = ((InsuranceCreditFlowContract$Step.CancellationConfirmation) step).f75806a;
                        CancellationConfirmationScreen cancellationConfirmationScreen = new CancellationConfirmationScreen(new CancellationConfirmationScreenContract$InputData(showConfirmationAction.f75771a));
                        doe.c block2 = new doe.c(aVar, showConfirmationAction, i3);
                        Intrinsics.checkNotNullParameter(block2, "block");
                        cancellationConfirmationScreen.H = block2;
                        return cancellationConfirmationScreen;
                    }
                    if (step instanceof InsuranceCreditFlowContract$Step.Documents) {
                        return new DocumentsScreen(new DocumentsScreenContract$InputData(insuranceCreditFlowContract$InputData.f75804b));
                    }
                    if (step instanceof InsuranceCreditFlowContract$Step.CoverageDetails) {
                        InsuranceCreditFlowContract$Step.CoverageDetails coverageDetails = (InsuranceCreditFlowContract$Step.CoverageDetails) step;
                        coverageBottomSheetController = new CoverageDetailsScreen(new CoverageDetailsScreenContract$InputData(insuranceCreditFlowContract$InputData.f75804b, coverageDetails.f75809a, coverageDetails.f75810b));
                    } else {
                        if (step instanceof InsuranceCreditFlowContract$Step.Claim) {
                            return new ContactScreen(new ContactScreenContract$InputData(insuranceCreditFlowContract$InputData.f75804b, lt7.h.CLAIM));
                        }
                        if (step instanceof InsuranceCreditFlowContract$Step.GetHelp) {
                            return new ContactScreen(new ContactScreenContract$InputData(insuranceCreditFlowContract$InputData.f75804b, lt7.h.GET_HELP));
                        }
                        if (!(step instanceof InsuranceCreditFlowContract$Step.CoverageDetailsModal)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ShowCoverageDetailsAction showCoverageDetailsAction = ((InsuranceCreditFlowContract$Step.CoverageDetailsModal) step).f75811a;
                        coverageBottomSheetController = new CoverageBottomSheetController(new CoverageBottomSheetControllerContract$InputData(insuranceCreditFlowContract$InputData.f75804b, showCoverageDetailsAction.f75784b));
                        doe.c block3 = new doe.c(showCoverageDetailsAction, aVar, 6);
                        Intrinsics.checkNotNullParameter(block3, "block");
                        coverageBottomSheetController.H = block3;
                    }
                    return coverageBottomSheetController;
                }
                Prompt prompt = ((InsuranceCreditFlowContract$Step.CancellationPrompt) step).f75807a;
                ScreenContent content = prompt.f75764a;
                Intrinsics.checkNotNullParameter(content, "content");
                TextLocalisedClause textLocalisedClauseS = l9.l.s(com.revolut.feature.credit.core.R$string.credit_loan_insurance_prompt_title, content.f75767a);
                TextLocalisedClause textLocalisedClauseS2 = l9.l.s(com.revolut.feature.credit.core.R$string.credit_loan_insurance_prompt_subtitle, content.f75768b);
                com.revolut.feature.insurance_credit.impl.data.model.action.Image image = content.f75769c;
                if (image instanceof Image.Icon) {
                    imageC = new GlyphImage(((Image.Icon) image).f75756a.c(), null, null, 6);
                } else if (image instanceof Image.Illustration) {
                    imageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c(((Image.Illustration) image).f75757a, null, null, null, 30);
                } else {
                    if (image != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "CancelPromptScreenInputData", "Icon was null in Image.asPromptImage", null, h0Var);
                    imageC = ShimmerImage.f60002a;
                }
                com.revolut.core.ui_kit_core.displayers.image.Image image2 = imageC;
                Button button = content.e;
                PromptMarketingContentDelegate.Model.Button buttonA = button != null ? it7.b.a(button, com.revolut.feature.credit.core.R$string.credit_loan_insurance_prompt_primary_button) : null;
                Button button2 = content.f;
                PromptMarketingContentDelegate.Model.Button buttonA2 = button2 != null ? it7.b.a(button2, com.revolut.feature.credit.core.R$string.credit_loan_insurance_prompt_secondary_button) : null;
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                LinkAction linkAction = content.d;
                TextLocalisedClause textLocalisedClauseS3 = (linkAction == null || (str = linkAction.f75762a) == null) ? null : l9.l.s(com.revolut.feature.credit.core.R$string.credit_loan_insurance_prompt_link_action, str);
                String str2 = content.f75770g;
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(iy4.a.d(textLocalisedClauseS, textLocalisedClauseS2, image2, resourceImage, null, null, buttonA, buttonA2, str2 != null ? l9.l.s(com.revolut.feature.credit.core.R$string.credit_loan_insurance_prompt_disclaimer, str2) : null, textLocalisedClauseS3, 1248));
                doe.c block4 = new doe.c(prompt, aVar, 7);
                Intrinsics.checkNotNullParameter(block4, "block");
                promptMarketingScreen.H = block4;
                return promptMarketingScreen;
            case 2:
                TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen = (TransferReasonsAmountAllocationScreen) obj4;
                RowDelegate.Model data = (RowDelegate.Model) obj2;
                MaskedTextInputEditText field = (MaskedTextInputEditText) obj3;
                KProperty[] kPropertyArr = TransferReasonsAmountAllocationScreen.S;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                return new zp0.d(field, transferReasonsAmountAllocationScreen.K.f92387a.f115083b, (u80.d) transferReasonsAmountAllocationScreen.Q.getValue(), null, new dtf.d(transferReasonsAmountAllocationScreen, data), false, false, 0, false, null, 2024);
            case 3:
                BiometricVerificationManualInputViewController biometricVerificationManualInputViewController = (BiometricVerificationManualInputViewController) obj4;
                InputTextDelegate.Model input = (InputTextDelegate.Model) obj2;
                InputText field2 = (InputText) obj3;
                KProperty[] kPropertyArr2 = BiometricVerificationManualInputViewController.P;
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(field2, "field");
                String[] elements = {"INPUT_DATES_BIRTH_ID", "INPUT_DATES_EXPIRY_ID"};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (!kotlin.collections.d.y0(elements).contains(input.f52580a)) {
                    return null;
                }
                Locale UK = Locale.UK;
                Intrinsics.checkNotNullExpressionValue(UK, "UK");
                return new zp0.p(UK, field2.getInnerEditText(), new du.l(input, biometricVerificationManualInputViewController), null, true, true, null, false, 456);
            case 4:
                com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.c cVar = (com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.c) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                BiometricVerificationManualInputContract$ModalStep step2 = (BiometricVerificationManualInputContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof BiometricVerificationManualInputContract$ModalStep.PickDateStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                fu.a aVar2 = cVar.f50648p;
                BiometricVerificationManualInputContract$ModalStep.PickDateStep pickDateStep = (BiometricVerificationManualInputContract$ModalStep.PickDateStep) step2;
                BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent event = pickDateStep.f50645b;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                if (Intrinsics.f(event, BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent.SelectDob.f50646a)) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_nfc_document_information_date_of_birth, null, null, 14);
                } else {
                    if (!Intrinsics.f(event, BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent.SelectExpiryDate.f50647a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_nfc_document_information_date_of_expiry, null, null, 14);
                }
                DatePickerBottomSheetController datePickerBottomSheetController = new DatePickerBottomSheetController(new DatePickerBottomSheetController.InputData(textLocalisedClause, pickDateStep.f50644a, (LocalDate) null, (LocalDate) null, 28));
                doe.c block5 = new doe.c(cVar, step2, 10);
                Intrinsics.checkNotNullParameter(block5, "block");
                datePickerBottomSheetController.H = block5;
                return datePickerBottomSheetController;
            case 5:
                com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.b bVar = (com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.b) obj4;
                CreditCardSelectDueDateFlowContract$InputData creditCardSelectDueDateFlowContract$InputData = bVar.o;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                CreditCardSelectDueDateFlowContract$Step step3 = (CreditCardSelectDueDateFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof CreditCardSelectDueDateFlowContract$Step.SelectDueDate) {
                    CreditCardSelectDueDateFlowContract$Step.SelectDueDate selectDueDate = (CreditCardSelectDueDateFlowContract$Step.SelectDueDate) step3;
                    viewControllerA = new CreditCardSelectDueDateScreen(new CreditCardSelectDueDateScreenContract$InputData(selectDueDate.f69645a, selectDueDate.f69646b, selectDueDate.f69647c, selectDueDate.d));
                } else if (step3 instanceof CreditCardSelectDueDateFlowContract$Step.IneligibilityError) {
                    CreditCardSelectDueDateFlowContract$Step.IneligibilityError ineligibilityError = (CreditCardSelectDueDateFlowContract$Step.IneligibilityError) step3;
                    TextClause textClause = new TextClause(ineligibilityError.f69640a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    TextClause textClause2 = new TextClause(ineligibilityError.f69641b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_16_warning, GlyphImageTint.STANDARD.f59931a, null, 4);
                    BottomSheet.ActionItem actionItem = new BottomSheet.ActionItem(new TextClause(ineligibilityError.f69642c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
                    k9 k9Var = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    viewControllerA = BottomSheet.b(textClause, textClause2, glyphImage, null, actionItem, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 168);
                    doe.c block6 = new doe.c(ineligibilityError, bVar, 14);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    viewControllerA.H = block6;
                } else {
                    if (step3 instanceof CreditCardSelectDueDateFlowContract$Step.Instalments) {
                        creditCardRepayFlow = new CreditCardInstalmentHubFlow(new CreditCardInstalmentHubFlowContract$InputData(creditCardSelectDueDateFlowContract$InputData.f69638a));
                    } else if (step3 instanceof CreditCardSelectDueDateFlowContract$Step.Repay) {
                        creditCardRepayFlow = new CreditCardRepayFlow(new CreditCardRepayFlowContract$InputData(null, creditCardSelectDueDateFlowContract$InputData.f69638a));
                        dv4.c block7 = new dv4.c(bVar, 1);
                        Intrinsics.checkNotNullParameter(block7, "block");
                        creditCardRepayFlow.H = block7;
                    } else {
                        if (!(step3 instanceof CreditCardSelectDueDateFlowContract$Step.Error)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar.f69649q.getClass();
                        viewControllerA = vt4.a.a();
                    }
                    viewControllerA = creditCardRepayFlow;
                }
                viewControllerA.l2(new d8e.a(bVar, 17));
                return viewControllerA;
            case 6:
                com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.a aVar3 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DetailedStatsControllerContract$ModalStep modalStep = (DetailedStatsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(modalStep, "modalStep");
                if (modalStep instanceof DetailedStatsControllerContract$ModalStep.SectionGlossary) {
                    return new GlossaryScreen(((DetailedStatsControllerContract$ModalStep.SectionGlossary) modalStep).f103918a);
                }
                if (!(modalStep instanceof DetailedStatsControllerContract$ModalStep.StatInfo)) {
                    throw new NoWhenBranchMatchedException();
                }
                CustomisedStatsDialogProvider customisedStatsDialogProvider = aVar3.f103927s;
                CustomisedStatsDialogProvider.DialogContent dialogContent = ((DetailedStatsControllerContract$ModalStep.StatInfo) modalStep).f103919a;
                customisedStatsDialogProvider.getClass();
                return CustomisedStatsDialogProvider.b(dialogContent);
            case 7:
                final com.revolut.feature.kyc.impl.idnow.eid.flow.a aVar4 = (com.revolut.feature.kyc.impl.idnow.eid.flow.a) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                IdnowEidFlowContract$Step step4 = (IdnowEidFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (Intrinsics.f(step4, IdnowEidFlowContract$Step.InstallFeature.f77778a)) {
                    OnDemandFeatureInstallFlow onDemandFeatureInstallFlow = new OnDemandFeatureInstallFlow(new OnDemandFeatureInstallFlowContract$InputData(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_vendors_idnow_eid_error_skip, null, null, 14), "feature_idnow_eid_sdk"));
                    final int i5 = 0;
                    Function1 block8 = new Function1() { // from class: dw8.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    f result = (f) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, tw8.e.f274950a);
                                    com.revolut.feature.kyc.impl.idnow.eid.flow.a aVar5 = aVar4;
                                    if (zF) {
                                        h.t2(aVar5, aVar5.f77781q, new IdnowEidFlowContract$Step.Sdk(aVar5.o.f77777a), false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(result, tw8.d.f274949a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar5.I2(d.SDK_INIT_ERROR);
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.kyc.impl.idnow.eid.flow.a aVar6 = aVar4;
                                    cw8.a aVar7 = aVar6.f77780p;
                                    ew8.d output = (ew8.d) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof ew8.c) {
                                        m mVar = ((ew8.c) output).f130109a;
                                        if (Intrinsics.f(mVar, k.f235123a)) {
                                            aVar6.C2(at8.d.f9019a);
                                        } else if (mVar instanceof pd7.b) {
                                            aVar6.I2(d.SDK_USER_ABORTED);
                                        } else if (Intrinsics.f(mVar, pd7.c.f235115a)) {
                                            aVar6.J2(d.SDK_USER_BLOCKED);
                                        } else if (Intrinsics.f(mVar, pd7.d.f235116a)) {
                                            aVar6.J2(d.SDK_USER_DEACTIVATED);
                                        } else if (Intrinsics.f(mVar, pd7.f.f235118a)) {
                                            aVar6.J2(d.SDK_USER_INVALID);
                                        } else if (Intrinsics.f(mVar, pd7.e.f235117a)) {
                                            aVar6.K2(d.SDK_INTERNAL_ERROR);
                                        } else if (Intrinsics.f(mVar, g.f235119a)) {
                                            aVar6.K2(d.SDK_INVALID_CONFIGURATION);
                                        } else if (Intrinsics.f(mVar, j.f235122a)) {
                                            aVar6.K2(d.SDK_TIMEOUT);
                                        } else if (Intrinsics.f(mVar, l.f235124a)) {
                                            aVar6.K2(d.SDK_ALREADY_COMPLETED);
                                        } else if (Intrinsics.f(mVar, pd7.h.f235120a)) {
                                            d dVar = d.SDK_NETWORK_ERROR;
                                            aVar7.getClass();
                                            yji.l.a1(aVar6, aVar6.X1(cw8.a.a()), null, null, new e(aVar6, dVar, null, 0), 3);
                                        } else {
                                            if (!Intrinsics.f(mVar, i.f235121a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar7.getClass();
                                            yji.l.a1(aVar6, aVar6.X1(new y0("IDNOW_EID_STATUS_DIALOG_ID", new nii.z(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_vendors_idnow_eid_error_nfc_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_vendors_idnow_eid_error_nfc_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_vendors_idnow_eid_error_skip, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new v0(aVar6, null, 21), 3);
                                        }
                                    } else {
                                        if (!Intrinsics.f(output, ew8.b.f130108a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        d dVar2 = d.SDK_INIT_ERROR;
                                        aVar7.getClass();
                                        yji.l.a1(aVar6, aVar6.X1(cw8.a.a()), null, null, new e(aVar6, dVar2, null, 0), 3);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    onDemandFeatureInstallFlow.H = block8;
                    return onDemandFeatureInstallFlow;
                }
                if (!(step4 instanceof IdnowEidFlowContract$Step.Sdk)) {
                    throw new NoWhenBranchMatchedException();
                }
                IdnowEidScreen idnowEidScreen = new IdnowEidScreen(new IdnowEidScreenContract$InputData(((IdnowEidFlowContract$Step.Sdk) step4).f77779a));
                final int i6 = 1;
                Function1 block9 = new Function1() { // from class: dw8.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i6) {
                            case 0:
                                f result = (f) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean zF = Intrinsics.f(result, tw8.e.f274950a);
                                com.revolut.feature.kyc.impl.idnow.eid.flow.a aVar5 = aVar4;
                                if (zF) {
                                    h.t2(aVar5, aVar5.f77781q, new IdnowEidFlowContract$Step.Sdk(aVar5.o.f77777a), false, null, false, 12);
                                } else {
                                    if (!Intrinsics.f(result, tw8.d.f274949a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar5.I2(d.SDK_INIT_ERROR);
                                }
                                return Unit.f186387a;
                            default:
                                com.revolut.feature.kyc.impl.idnow.eid.flow.a aVar6 = aVar4;
                                cw8.a aVar7 = aVar6.f77780p;
                                ew8.d output = (ew8.d) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output instanceof ew8.c) {
                                    m mVar = ((ew8.c) output).f130109a;
                                    if (Intrinsics.f(mVar, k.f235123a)) {
                                        aVar6.C2(at8.d.f9019a);
                                    } else if (mVar instanceof pd7.b) {
                                        aVar6.I2(d.SDK_USER_ABORTED);
                                    } else if (Intrinsics.f(mVar, pd7.c.f235115a)) {
                                        aVar6.J2(d.SDK_USER_BLOCKED);
                                    } else if (Intrinsics.f(mVar, pd7.d.f235116a)) {
                                        aVar6.J2(d.SDK_USER_DEACTIVATED);
                                    } else if (Intrinsics.f(mVar, pd7.f.f235118a)) {
                                        aVar6.J2(d.SDK_USER_INVALID);
                                    } else if (Intrinsics.f(mVar, pd7.e.f235117a)) {
                                        aVar6.K2(d.SDK_INTERNAL_ERROR);
                                    } else if (Intrinsics.f(mVar, g.f235119a)) {
                                        aVar6.K2(d.SDK_INVALID_CONFIGURATION);
                                    } else if (Intrinsics.f(mVar, j.f235122a)) {
                                        aVar6.K2(d.SDK_TIMEOUT);
                                    } else if (Intrinsics.f(mVar, l.f235124a)) {
                                        aVar6.K2(d.SDK_ALREADY_COMPLETED);
                                    } else if (Intrinsics.f(mVar, pd7.h.f235120a)) {
                                        d dVar = d.SDK_NETWORK_ERROR;
                                        aVar7.getClass();
                                        yji.l.a1(aVar6, aVar6.X1(cw8.a.a()), null, null, new e(aVar6, dVar, null, 0), 3);
                                    } else {
                                        if (!Intrinsics.f(mVar, i.f235121a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar7.getClass();
                                        yji.l.a1(aVar6, aVar6.X1(new y0("IDNOW_EID_STATUS_DIALOG_ID", new nii.z(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_vendors_idnow_eid_error_nfc_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_vendors_idnow_eid_error_nfc_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_vendors_idnow_eid_error_skip, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new v0(aVar6, null, 21), 3);
                                    }
                                } else {
                                    if (!Intrinsics.f(output, ew8.b.f130108a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    d dVar2 = d.SDK_INIT_ERROR;
                                    aVar7.getClass();
                                    yji.l.a1(aVar6, aVar6.X1(cw8.a.a()), null, null, new e(aVar6, dVar2, null, 0), 3);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block9, "block");
                idnowEidScreen.H = block9;
                return idnowEidScreen;
            case 8:
                com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a aVar5 = (com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a) obj4;
                fwc.a aVar6 = aVar5.f85728q;
                y yVar = aVar5.f85732w;
                ewc.e eVar = aVar5.f85731t;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TransactionsDayNightLimitsScreenContract$ModalStep step5 = (TransactionsDayNightLimitsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof TransactionsDayNightLimitsScreenContract$ModalStep.OtherPaymentsAndTransfers) {
                    bwc.d flowType = ((dwc.e) ((j2) yVar.f22677a).getValue()).d;
                    if (flowType == null) {
                        throw new IllegalArgumentException("Flow type can't be null, because it is loaded before the limits");
                    }
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(flowType, "flowType");
                    int[] iArr = ewc.d.f130159a;
                    if (iArr[flowType.ordinal()] == 1) {
                        i = 14;
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_india_section_other_dialog_title, null, null, 14);
                    } else {
                        i = 14;
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_section_other_dialog_title, null, null, 14);
                    }
                    lw0.a aVar7 = new lw0.a(textLocalisedClause2, iArr[flowType.ordinal()] == 1 ? new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_india_section_other_dialog_description, null, null, i) : new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_section_other_dialog_description, null, null, i), null, null, false, 28);
                    aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_section_other_dialog_action, null, null, i), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var2 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar7, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                }
                if (step5 instanceof TransactionsDayNightLimitsScreenContract$ModalStep.ChangeRequest) {
                    aVar6.getClass();
                    lw0.a aVar8 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_dialog_new_request_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_dialog_new_request_subtitle, null, null, 14), null, null, false, 28);
                    aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_dialog_new_request_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_dialog_new_request_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), (Clause) null, (aw0.f) null, 25);
                    k9 k9Var3 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar8, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                    dwc.k block10 = new dwc.k(aVar5, step5);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    actionsBottomSheetController.H = block10;
                    return actionsBottomSheetController;
                }
                if (Intrinsics.f(step5, TransactionsDayNightLimitsScreenContract$ModalStep.TransfersToIndividuals.f85726a)) {
                    eVar.getClass();
                    lw0.a aVar9 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_india_section_individuals_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_india_section_individuals_dialog_description, null, null, 14), null, null, false, 28);
                    aw0.e eVar3 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_section_other_dialog_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var4 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar9, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
                }
                if (Intrinsics.f(step5, TransactionsDayNightLimitsScreenContract$ModalStep.ForeignCurrencyExchange.f85723a)) {
                    boolean z = ((dwc.e) ((j2) yVar.f22677a).getValue()).f120358c;
                    eVar.getClass();
                    lw0.a aVar10 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_brazil_fx_title, null, null, 14), z ? new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_brazil_fx_dialog_verified_address_subtitle, null, null, 14) : new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_brazil_fx_dialog_unverified_address_subtitle, null, null, 14), null, null, false, 28);
                    aw0.e eVar4 = new aw0.e(false, null, null, new n6(z ? new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_section_other_dialog_action, null, null, 14) : new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_brazil_fx_dialog_action_verify_address, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var5 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar10, eVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
                    a6j.a block11 = new a6j.a(z, aVar5, 16);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    actionsBottomSheetController2.H = block11;
                    return actionsBottomSheetController2;
                }
                if (!(step5 instanceof TransactionsDayNightLimitsScreenContract$ModalStep.AnnualInbound)) {
                    if (!(step5 instanceof TransactionsDayNightLimitsScreenContract$ModalStep.ReadOnlyLimitDialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RowActionsBottomSheetController rowActionsBottomSheetControllerA = aVar6.a(((TransactionsDayNightLimitsScreenContract$ModalStep.ReadOnlyLimitDialog) step5).f85725a);
                    dwc.k block12 = new dwc.k(step5, aVar5);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    rowActionsBottomSheetControllerA.H = block12;
                    return rowActionsBottomSheetControllerA;
                }
                WalletLimit.CounterLimit counterLimit = ((TransactionsDayNightLimitsScreenContract$ModalStep.AnnualInbound) step5).f85721a;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(counterLimit, "counterLimit");
                lw0.a aVar11 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_brazil_annual_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_brazil_annual_dialog_subtitle, u.c(rwc.b.a(counterLimit.e)), null, 12), null, null, false, 28);
                aw0.e eVar5 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_brazil_fx_dialog_action_verify_address, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var6 = k9.SecurityHub;
                Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar11, eVar5, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6), null, null, 24));
                dug.a block13 = new dug.a(aVar5, i3);
                Intrinsics.checkNotNullParameter(block13, "block");
                actionsBottomSheetController3.H = block13;
                return actionsBottomSheetController3;
            case 9:
                String transactionId = (String) obj2;
                ewd.a facade = (ewd.a) obj3;
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                Intrinsics.checkNotNullParameter(facade, "facade");
                ((dwd.a) obj4).f120367a.f("UNSTAKING_CACHE_KEY_" + transactionId, facade);
                return Unit.f186387a;
            case 10:
                String id10 = (String) obj2;
                List dto = (List) obj3;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(dto, "dto");
                ehe.n.z("UNSTAKING_LOCKED_TRANSACTIONS_KEY_", id10, ((dwd.c) obj4).f120371b, dto);
                return Unit.f186387a;
            case 11:
                com.revolut.feature.transport.impl.ui.hub.ticket_details.b bVar2 = (com.revolut.feature.transport.impl.ui.hub.ticket_details.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TicketDetailsScreenContract$ModalStep step6 = (TicketDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!Intrinsics.f(step6, TicketDetailsScreenContract$ModalStep.NoTicketsToExtend.f92530a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar12 = new lw0.a(new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_ticket_extend_no_eligible_ticket_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_ticket_extend_no_eligible_ticket_dialog_subtitle, null, null, 14), null, null, false, 28);
                aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_ticket_extend_buy_new_ticket_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                k9 k9Var7 = k9.ProductUnspecified;
                Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController4 = new ActionsBottomSheetController(new dii.a(aVar12, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var7, "value", k9Var7), null, null, 24));
                dwf.j block14 = new dwf.j(bVar2, 0);
                Intrinsics.checkNotNullParameter(block14, "block");
                actionsBottomSheetController4.H = block14;
                return actionsBottomSheetController4;
            case 12:
                com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a aVar13 = (com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                WidgetisedAnalyticsAllocationScreenContract$ModalStep step7 = (WidgetisedAnalyticsAllocationScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!Intrinsics.f(step7, WidgetisedAnalyticsAllocationScreenContract$ModalStep.CfdAllocationBreakdown.f95047a)) {
                    throw new NoWhenBranchMatchedException();
                }
                RowDelegate.Model.c cVar2 = null;
                boolean z3 = false;
                return new RowActionsBottomSheetController(new eii.c(new lw0.a(new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_cfd_allocation_breakdown_title, null, null, 14), null, null, null, false, 30), new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.e, null, null, false, null, null, 1020), null, null, 55), v.k(new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_cfd_available_margin_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_cfd_available_margin_description, null, null, 14), (RowDelegate.Model.MainImage) null, false, z3, (RowDelegate.Model.c) null, (Object) cVar2, 488), new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_cfd_invested_assets_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_cfd_invested_assets_description, null, null, 14), (RowDelegate.Model.MainImage) null, z3, false, cVar2, (Object) null, 488)), aVar13.u, null));
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new dyg.i(new MoneyClause(new dj0.d(0L, ((dyg.h) obj4).f), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_allocation_title, null, null, 14), false, false);
            case 14:
                zw7.u uVar = (zw7.u) obj4;
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                return new dz7.d(null, uVar.f325854b);
            case 15:
                dz7.q qVar = (dz7.q) obj4;
                if (!((Boolean) obj2).booleanValue()) {
                    return null;
                }
                qVar.o.getClass();
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it8 = intRange.iterator();
                while (it8.f289625c) {
                    arrayList.add(new pb0(String.valueOf(it8.nextInt())));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new Pair(null, arrayList);
            case 16:
                com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c cVar3 = (com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ThreeDsScreenContract$ModalStep step8 = (ThreeDsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof ThreeDsScreenContract$ModalStep.DiscardTopUpDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar14 = new lw0.a(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_confirmation_3ds_discard_topup_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_confirmation_3ds_discard_topup_subtitle, null, null, 14), null, null, false, 28);
                m6 m6Var = n6.Companion;
                aw0.h hVar2 = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_confirmation_3ds_discard_topup_action_discard_top_up, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_confirmation_3ds_discard_topup_action_continue_top_up, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                k9 k9Var8 = k9.Topup;
                Parcelable.Creator<AnalyticsProduct.Retail> creator8 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController5 = new ActionsBottomSheetController(new dii.a(aVar14, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var8, "value", k9Var8), null, null, 24));
                dze.i block15 = new dze.i(cVar3, 1);
                Intrinsics.checkNotNullParameter(block15, "block");
                actionsBottomSheetController5.H = block15;
                actionsBottomSheetController5.k2(new d8e.a(cVar3, 23));
                return actionsBottomSheetController5;
            case 17:
                CustomTipScreen customTipScreen = (CustomTipScreen) obj4;
                AmountEditDelegate.Model data2 = (AmountEditDelegate.Model) obj2;
                AmountEditView field3 = (AmountEditView) obj3;
                KProperty[] kPropertyArr3 = CustomTipScreen.R;
                Intrinsics.checkNotNullParameter(data2, "data");
                Intrinsics.checkNotNullParameter(field3, "field");
                MaskedTextInputEditText editText = field3.getEditText();
                Object obj5 = data2.f51629j;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(editText, (xi0.b) obj5, (u80.d) customTipScreen.P.getValue(), null, new o7.d(customTipScreen, 25), false, false, 0, false, null, 1928);
            case 18:
                NationalIdentifierDocumentFragment nationalIdentifierDocumentFragment = (NationalIdentifierDocumentFragment) obj4;
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText field4 = (InputText) obj3;
                int i21 = NationalIdentifierDocumentFragment.j0;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field4, "field");
                e0l.c cVar4 = (e0l.c) nationalIdentifierDocumentFragment.C();
                if (cVar4 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(model, "model");
                String str3 = (String) ((e0l.l) cVar4).f121740q.get(model.f52580a);
                if (str3 == null) {
                    str3 = "[_…]";
                }
                return new zp0.y(field4.getInnerEditText(), u.c(zp0.m.a()), str3, new e0f.k(nationalIdentifierDocumentFragment, 16), model.f52580a, null, false, 96);
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                ((e0l.f) ((e0l.l) obj4).f121735j).getClass();
                return u.c(new og("NATIONAL_IDENTIFIER_DOCUMENT_LOADING_ID"));
            case 20:
                com.revolut.feature.semi_independent_onboarding.impl.ui.details.b bVar3 = (com.revolut.feature.semi_independent_onboarding.impl.ui.details.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SemiIndependentOnboardingDetailsScreenContract$ModalStep it9 = (SemiIndependentOnboardingDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it9, "it");
                if (Intrinsics.f(it9, SemiIndependentOnboardingDetailsScreenContract$ModalStep.UpdateParent.f85988a)) {
                    SemiIndependentOnboardingInvitationFlow semiIndependentOnboardingInvitationFlow = new SemiIndependentOnboardingInvitationFlow(new SemiIndependentInvitationContract$InputData(v0d.d.START_WITH_CONTACT_CHOOSER, v0d.a.INLINE_MODE));
                    dkm.a block16 = new dkm.a(1, bVar3, com.revolut.feature.semi_independent_onboarding.impl.ui.details.b.class, "handleInvitationResult", "handleInvitationResult(Lcom/revolut/feature/semi_independent_onboarding/api/navigation/SemiIndependentInvitationContract$OutputData;)V", 0, 13);
                    Intrinsics.checkNotNullParameter(block16, "block");
                    semiIndependentOnboardingInvitationFlow.H = block16;
                    return semiIndependentOnboardingInvitationFlow;
                }
                if (!(it9 instanceof SemiIndependentOnboardingDetailsScreenContract$ModalStep.GuardianNeedsCreateAccountPrompt)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str4 = ((SemiIndependentOnboardingDetailsScreenContract$ModalStep.GuardianNeedsCreateAccountPrompt) it9).f85987a;
                bVar3.f85992r.getClass();
                PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(i1d.a.a());
                e1.b block17 = new e1.b(bVar3, str4, 4);
                Intrinsics.checkNotNullParameter(block17, "block");
                promptMarketingScreen2.H = block17;
                return promptMarketingScreen2;
            case 21:
                e1d.j jVar = (e1d.j) obj4;
                Throwable th10 = (Throwable) obj2;
                Function1 defaultErrorProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorProvider, "defaultErrorProvider");
                e1d.f fVarA = e1d.j.a();
                if (th10 != null) {
                    listC = u.c(new FullScreenStateDelegate.Model("LIST_ID_ERROR_RETRY", hf8.b.a(jVar.f121972a, th10), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684));
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                } else {
                    listC = (List) defaultErrorProvider.invoke(new iii.d(10, null, true, false, "LIST_ID_ERROR_RETRY"));
                }
                return new e1d.g(fVarA, null, listC);
            case 22:
                return a(obj2, obj3);
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new e2j.h(new TextLocalisedClause(com.revolut.retail.feature.balance.picker.api.R$string.currency_picker_accessibility_label, u.c(((e2j.f) obj4).f122122c), null, 12), f0.f322471a, false);
            case 24:
                e1 config = (e1) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(config, "config");
                ((e30.e) obj4).f122166b.f("chat_ws_config", config);
                return Unit.f186387a;
            case 25:
                MultiCurrencyTransferReviewRequest params = (MultiCurrencyTransferReviewRequest) obj2;
                McyTransferReviewDto mcyTransferReview = (McyTransferReviewDto) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(mcyTransferReview, "mcyTransferReview");
                ((e31.j) obj4).f122183g.put(params, mcyTransferReview);
                return Unit.f186387a;
            case 26:
                com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.c cVar5 = (com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.c) obj4;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                TaxHubFlowContract$Step step9 = (TaxHubFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (Intrinsics.f(step9, TaxHubFlowContract$Step.Hub.f74266a)) {
                    TaxHubScreen taxHubScreen = new TaxHubScreen();
                    e2j.j block18 = new e2j.j(cVar5, i3);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    taxHubScreen.H = block18;
                    return taxHubScreen;
                }
                if (step9 instanceof TaxHubFlowContract$Step.TaxAssessment) {
                    TaxHubFlowContract$Step.TaxAssessment taxAssessment = (TaxHubFlowContract$Step.TaxAssessment) step9;
                    return new TaxHubAssessmentFlow(new TaxHubAssessmentFlowContract$InputData(taxAssessment.f74270b, taxAssessment.f74269a));
                }
                if (step9 instanceof TaxHubFlowContract$Step.TaxPayment) {
                    return new TaxHubPaymentFlow(new TaxHubPaymentFlowContract$InputData(((TaxHubFlowContract$Step.TaxPayment) step9).f74271a, null, null));
                }
                if (step9 instanceof TaxHubFlowContract$Step.TaxProfile) {
                    TaxHubFlowContract$Step.TaxProfile taxProfile = (TaxHubFlowContract$Step.TaxProfile) step9;
                    TaxHubProfileFlow taxHubProfileFlow = new TaxHubProfileFlow(new TaxHubProfileFlowContract$InputData(taxProfile.f74272a));
                    e1.b block19 = new e1.b(taxProfile, cVar5, 14);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    taxHubProfileFlow.H = block19;
                    return taxHubProfileFlow;
                }
                if (step9 instanceof TaxHubFlowContract$Step.TransactionExport) {
                    return new TaxHubTransactionExportFlow(new TaxHubTransactionExportFlowContract$InputData(null, null, null));
                }
                if (!(step9 instanceof TaxHubFlowContract$Step.ProductArticle)) {
                    if (step9 instanceof TaxHubFlowContract$Step.TaxSettings) {
                        return new FreelancerTaxSettingsFlow();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                TaxHubFlowContract$Step.ProductArticle productArticle = (TaxHubFlowContract$Step.ProductArticle) step9;
                ViewController viewControllerE1 = cVar5.e1(new ProductArticleDescriptor(productArticle.f74267a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                e1.b block20 = new e1.b(cVar5, productArticle, 13);
                Intrinsics.checkNotNullParameter(block20, "block");
                viewControllerE1.H = block20;
                return viewControllerE1;
            case 27:
                return b(obj2, obj3);
            case 28:
                return c(obj2, obj3);
            default:
                e44.a params2 = (e44.a) obj2;
                lv3.a content2 = (lv3.a) obj3;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(content2, "content");
                ((e44.b) obj4).f122384c.f(params2.f122381a.f137835a, content2);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ p(Object obj2, int i) {
        this.f117380a = i;
        this.f117381b = obj2;
    }
}
