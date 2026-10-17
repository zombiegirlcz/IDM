package zba;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import bci.d;
import cci.g;
import ce9.o;
import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.api.AddressFlowApi$AddressLocationSearch;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$State;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$Step;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreen;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreenContract$InputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.aani.impl.ui.settings.AaniSettingsContract$ModalStep;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.apm.spin.impl.ui.transfer.SpinTransferFlowContract$Step;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.flow.MortgageValuationFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.summary.MortgageValuationSummaryController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.summary.MortgageValuationSummaryControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.RefinancingAccountDetailsFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.RefinancingAccountDetailsHomeController;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.RefinancingAccountDetailsHomeScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetContract$ModalStep;
import com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitInputScreen;
import com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitInputScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.ReviewAccountLinkingDetailsScreenContract$ModalStep;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.expiration_selection.ExpirationSelectionBottomSheetContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.expiration_selection.ExpirationSelectionBottomSheetScreen;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.RedeemRewardFlowContract$Step;
import com.revolut.feature.junior_graduation.impl.ui.flow.identification.IdentificationFlowContract$InputData;
import com.revolut.feature.junior_graduation.impl.ui.flow.identification.IdentificationFlowContract$Step;
import com.revolut.feature.junior_graduation.impl.ui.screen.identification.JuniorIdentificationScreen;
import com.revolut.feature.junior_graduation.impl.ui.screen.identification.JuniorIdentificationScreenContract$InputData;
import com.revolut.feature.junior_payment_links.api.navigation.JuniorPaymentLinksConsentInput;
import com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.JuniorAccountDetailsFlowContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.JuniorAccountDetailsFlowContract$Step;
import com.revolut.feature.junior_settings.impl.ui_kompot.account_details.screen.JuniorAccountDetailsController;
import com.revolut.feature.passcode.PasscodeScreen;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.FormFlowContract$Step;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreenContract$InputData;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.options.PaymentOptionsControllerContract$ModalStep;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.preferred_schedule.PreferredScheduleController;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.preferred_schedule.PreferredScheduleControllerContract$InputData;
import com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.CreatePasscodeFlowContract$InputData;
import com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.CreatePasscodeFlowContract$Step;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount.PixQrRequestAddAmountScreen;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$BreakdownDisclaimer;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$InputData;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.AddAssetRev10Screen;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.AddAssetRev10ScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.feature_retail_user_declarations.UserDeclarationsApi$Toggles;
import com.revolut.feature_retail_user_declarations.purpose.PurposeOfAccountFlowInputData;
import com.revolut.feature_retail_user_declarations.purpose.flow.PurposeOfAccountFlowContract$Step;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountScreen;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountTilesScreen;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountTilesScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$InputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$ModalStep;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import com.revolut.retail.feature.esim.api.model.EsimProfileInstallationConfirmation;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefundIneligibilityDetails;
import com.revolut.retail.feature.esim.api.model.EsimUserPocket;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$InputData;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$Start;
import com.revolut.retail.feature.esim.impl.ui.flows.installation.EsimInstallationFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.screens.auto_renewal_info.EsimAutoRenewalInfoScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.auto_renewal_info.EsimAutoRenewalInfoScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$ExchangeBreakdownData;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$PlanChangeRefundInfo;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.EsimMobilePlanEsimMigrationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.EsimMobilePlanEsimMigrationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.refund_summary.EsimDataPlanRefundSummaryBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.refund_summary.EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_install.EsimInstallBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_install.EsimInstallBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.non_refundable.EsimNonRefundableBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.non_refundable.EsimNonRefundableBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.BankTransferNavigatingEntryFlow;
import com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.PlanGiftingReceiverFlowContract$Step;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.PlanGiftingReceiverIntroScreen;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.PlanGiftingReceiverIntroScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanDocumentsBottomSheet$InputData;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanGiftBenefits$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.FamilyPlanInvitationFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.PlanChangeFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.PlanKeepFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.decline_invitation.DeclineFamilyPlanInvitationScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.decline_invitation.DeclineFamilyPlanInvitationScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.invitation.FamilyPlanInvitationScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.invitation.FamilyPlanInvitationScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$PlanReference;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$UIConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.PlanBenefitsToLoseScreen;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$State;
import com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$Step;
import de9.j;
import de9.k;
import dej.g3;
import dej.t1;
import dii.f;
import fci.h;
import fci.i;
import fci.u0;
import fci.v0;
import fej.d;
import grl.k9;
import hha.b0;
import hnj.e;
import igk.m;
import ix0.d0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import m1c.e0;
import nii.y0;
import nii.z;
import oki.h;
import p8a.m0;
import qua.p;
import r10.r;
import u6c.t;
import vc.s;
import vkm.j2;
import vkm.v1;
import yki.l;
import zf5.n;
import zh9.u0;
import zhm.u;
import zhm.v;
import zhm.w;
import zmj.h0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f320852b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f320851a = i;
        this.f320852b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        TextLocalisedClause textLocalisedClause;
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.e eVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.e) this.f320852b;
        l FlowCoordinator = (l) obj2;
        FamilyPlanInvitationFlowContract$Step step = (FamilyPlanInvitationFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, FamilyPlanInvitationFlowContract$Step.Invitation.f103025a)) {
            zgk.d dVar = eVar.o;
            FamilyPlanInvitationScreen familyPlanInvitationScreen = new FamilyPlanInvitationScreen(new FamilyPlanInvitationScreenContract$InputData(dVar.f322194b, dVar.f322193a));
            n block = new n(eVar, FlowCoordinator, 7);
            Intrinsics.checkNotNullParameter(block, "block");
            familyPlanInvitationScreen.H = block;
            return familyPlanInvitationScreen;
        }
        if (step instanceof FamilyPlanInvitationFlowContract$Step.DeclineInvitation) {
            FamilyPlanInvitationFlowContract$Step.DeclineInvitation declineInvitation = (FamilyPlanInvitationFlowContract$Step.DeclineInvitation) step;
            DeclineFamilyPlanInvitationScreen declineFamilyPlanInvitationScreen = new DeclineFamilyPlanInvitationScreen(new DeclineFamilyPlanInvitationScreenContract$InputData(declineInvitation.f103019a, declineInvitation.f103021c));
            za9.c block2 = new za9.c(eVar, 25);
            Intrinsics.checkNotNullParameter(block2, "block");
            declineFamilyPlanInvitationScreen.H = block2;
            return declineFamilyPlanInvitationScreen;
        }
        if (step instanceof FamilyPlanInvitationFlowContract$Step.PlanBenefits) {
            return new PlanBenefitsScreen(new PlanBenefitsScreenContract$InputData(new PlanBenefitsScreenContract$PlanReference.Id(((FamilyPlanInvitationFlowContract$Step.PlanBenefits) step).f103026a.f152287a), (PlanBenefitsScreenContract$UIConfig) null, eVar.f103034r.a(PricingPlansUiApi$Toggles.RevampedPlanBackgrounds.f102640c), 10));
        }
        if (!(step instanceof FamilyPlanInvitationFlowContract$Step.GiftedPlanConfirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        FamilyPlanInvitationFlowContract$Step.GiftedPlanConfirmation giftedPlanConfirmation = (FamilyPlanInvitationFlowContract$Step.GiftedPlanConfirmation) step;
        b0 b0Var = giftedPlanConfirmation.d;
        lha.k kVar = giftedPlanConfirmation.e;
        hha.d dVar2 = giftedPlanConfirmation.f103022a;
        hha.d dVar3 = giftedPlanConfirmation.f103023b;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(b0Var.f152283b != null ? R$string.family_plans_join_family_plan_gift_confirmation_scheduled_title : R$string.family_plans_join_family_plan_gift_confirmation_title, u.c(dok.g.d(dVar3, null)), null, 12);
        Instant instant = b0Var.f152283b;
        if (instant != null) {
            int i = R$string.family_plans_join_family_plan_gift_confirmation_scheduled_subtitle;
            Clause clauseD = dok.g.d(dVar2, null);
            long epochMilli = instant.toEpochMilli();
            TimeClause.Format.INSTANCE.getClass();
            TimeClause timeClause = new TimeClause(epochMilli, TimeClause.Format.f57959a, null, null, 12);
            String str = kVar.e;
            textLocalisedClause = new TextLocalisedClause(i, v.k(clauseD, timeClause, new TextClause(str == null ? "" : str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), dok.g.d(dVar3, null)), null, 12);
        } else {
            int i2 = R$string.family_plans_join_family_plan_gift_confirmation_subtitle;
            Clause clauseD2 = dok.g.d(dVar2, null);
            Instant instant2 = b0Var.f152284c;
            long epochMilli2 = instant2 != null ? instant2.toEpochMilli() : 0L;
            TimeClause.Format.INSTANCE.getClass();
            TimeClause timeClause2 = new TimeClause(epochMilli2, TimeClause.Format.f57959a, null, null, 12);
            String str2 = kVar.e;
            textLocalisedClause = new TextLocalisedClause(i2, v.k(clauseD2, timeClause2, new TextClause(str2 == null ? "" : str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), dok.g.d(dVar3, null)), null, 12);
        }
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause2, textLocalisedClause, new GlyphImage(R$drawable.uikit_icn_24_present, null, null, 6), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.family_plans_join_family_plan_gift_confirmation_cta_accept, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(instant != null ? R$string.family_plans_join_family_plan_gift_confirmation_scheduled_cta_cancel : R$string.family_plans_join_family_plan_gift_confirmation_cta_cancel, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f, false, (String) null, 54), null, null, null, null, null, 65112));
        yrk.e block3 = new yrk.e(eVar, 16, step, FlowCoordinator);
        Intrinsics.checkNotNullParameter(block3, "block");
        promptMarketingScreen.H = block3;
        return promptMarketingScreen;
    }

    private final Object b(Object obj2, Object obj3) {
        int i;
        int i2;
        int i3;
        int i5;
        final com.revolut.feature.apm.aani.impl.ui.settings.a aVar = (com.revolut.feature.apm.aani.impl.ui.settings.a) this.f320852b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        AaniSettingsContract$ModalStep step = (AaniSettingsContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof AaniSettingsContract$ModalStep.AliasDetails)) {
            if (!Intrinsics.f(step, AaniSettingsContract$ModalStep.UnlinkAccount.f61140a)) {
                throw new NoWhenBranchMatchedException();
            }
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.feature.apm.aani.api.R$string.aani_settings_unlink_sheet_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.aani.api.R$string.aani_settings_unlink_sheet_subtitle, null, null, 14), null, null, false, 28);
            aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.apm.aani.api.R$string.aani_settings_unlink_sheet_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.apm.aani.api.R$string.aani_settings_unlink_sheet_action_dismiss, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
            k9 k9Var = k9.Payments;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            final int i6 = 0;
            Function1 block = new Function1() { // from class: zl1.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    dii.g result = (dii.g) obj4;
                    switch (i6) {
                        case 0:
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof dii.e) {
                                com.revolut.feature.apm.aani.impl.ui.settings.a aVar3 = aVar;
                                aVar3.l2(new yzb.c(aVar3, null, 24), new yi5.b(26));
                            }
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof dii.e) {
                                aVar.C1(u0.b(u0.f(UserDetailsDestination.f26226a)));
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
        Alias alias = ((AaniSettingsContract$ModalStep.AliasDetails) step).f61139a;
        AliasType aliasType = alias.f61878a;
        if (Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
            i = com.revolut.feature.apm.aani.api.R$string.aani_settings_details_sheet_phone_title;
            i2 = com.revolut.feature.apm.aani.api.R$string.aani_settings_details_sheet_phone_subtitle;
            i3 = com.revolut.feature.apm.aani.api.R$string.aani_settings_details_sheet_phone_action_go_to_profile;
            i5 = com.revolut.feature.apm.aani.api.R$string.aani_settings_details_sheet_phone_action_dismiss;
        } else {
            if (!Intrinsics.f(aliasType, AliasType.EMAIL.f61894b)) {
                throw new IllegalStateException(("Unsupported alias type for details: " + alias.f61878a).toString());
            }
            i = com.revolut.feature.apm.aani.api.R$string.aani_settings_details_sheet_email_title;
            i2 = com.revolut.feature.apm.aani.api.R$string.aani_settings_details_sheet_email_subtitle;
            i3 = com.revolut.feature.apm.aani.api.R$string.aani_settings_details_sheet_email_action_go_to_profile;
            i5 = com.revolut.feature.apm.aani.api.R$string.aani_settings_details_sheet_email_action_dismiss;
        }
        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, null, null, 14), null, null, false, 28);
        aw0.h hVar2 = new aw0.h(false, new n6(new TextLocalisedClause(i3, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(i5, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
        k9 k9Var2 = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar3, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
        final int i21 = 1;
        Function1 block2 = new Function1() { // from class: zl1.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                dii.g result = (dii.g) obj4;
                switch (i21) {
                    case 0:
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result instanceof dii.e) {
                            com.revolut.feature.apm.aani.impl.ui.settings.a aVar32 = aVar;
                            aVar32.l2(new yzb.c(aVar32, null, 24), new yi5.b(26));
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result instanceof dii.e) {
                            aVar.C1(u0.b(u0.f(UserDetailsDestination.f26226a)));
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

    private final Object c(Object obj2, Object obj3) {
        PinCodeView.Header.Title title;
        PinCodeView.Header.Title title2;
        com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.c cVar = (com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.c) this.f320852b;
        CreatePasscodeFlowContract$InputData createPasscodeFlowContract$InputData = cVar.o;
        l FlowCoordinator = (l) obj2;
        CreatePasscodeFlowContract$Step it8 = (CreatePasscodeFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(it8, "it");
        CreatePasscodeFlowContract$Step createPasscodeFlowContract$Step = (CreatePasscodeFlowContract$Step) FlowCoordinator.d();
        int i = 6;
        TextLocalisedClause textLocalisedClause = null;
        if (createPasscodeFlowContract$Step instanceof CreatePasscodeFlowContract$Step.Create) {
            PasscodeScreenContract$InputData.Companion companion = PasscodeScreenContract$InputData.INSTANCE;
            int i2 = zl9.e.f323200a[createPasscodeFlowContract$InputData.f78959a.ordinal()];
            int i3 = 4;
            if (i2 == 1) {
                title2 = new PinCodeView.Header.Title(i, new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_pay_with_smile_create_passcode_title, null, null, 14), textLocalisedClause);
            } else if (i2 == 2) {
                title2 = new PinCodeView.Header.Title(i3, new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_pay_with_smile_change_passcode_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_pay_with_smile_change_passcode_subtitle, null, null, 14));
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                title2 = new PinCodeView.Header.Title(i3, new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_pay_with_smile_set_passcode_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_pay_with_smile_set_passcode_subtitle, null, null, 14));
            }
            PinCodeView.Mode.Placeholder placeholder = new PinCodeView.Mode.Placeholder(4);
            k9 value = k9.RevolutPay;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            AnalyticsProduct.Retail retail = new AnalyticsProduct.Retail(value);
            companion.getClass();
            PasscodeScreen passcodeScreen = new PasscodeScreen(PasscodeScreenContract$InputData.Companion.c(title2, placeholder, retail));
            zhf.f fVar = new zhf.f(cVar, 20);
            Intrinsics.checkNotNullParameter(fVar, "<set-?>");
            passcodeScreen.H = fVar;
            return passcodeScreen;
        }
        if (!(createPasscodeFlowContract$Step instanceof CreatePasscodeFlowContract$Step.Confirm)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((CreatePasscodeFlowContract$Step.Confirm) createPasscodeFlowContract$Step).f78961a;
        PasscodeScreenContract$InputData.Companion companion2 = PasscodeScreenContract$InputData.INSTANCE;
        int i5 = zl9.e.f323200a[createPasscodeFlowContract$InputData.f78959a.ordinal()];
        if (i5 == 1) {
            title = new PinCodeView.Header.Title(i, new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_pay_with_smile_confirm_passcode_title, null, null, 14), textLocalisedClause);
        } else if (i5 == 2) {
            title = new PinCodeView.Header.Title(i, new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_pay_with_smile_confirm_change_passcode_title, null, null, 14), textLocalisedClause);
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            title = new PinCodeView.Header.Title(i, new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_pay_with_smile_confirm_set_passcode_title, null, null, 14), textLocalisedClause);
        }
        int length = str.length();
        k9 value2 = k9.RevolutPay;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value2, "value");
        AnalyticsProduct.Retail retail2 = new AnalyticsProduct.Retail(value2);
        companion2.getClass();
        PasscodeScreen passcodeScreen2 = new PasscodeScreen(PasscodeScreenContract$InputData.Companion.b(title, length, retail2));
        n nVar = new n(cVar, str, 17);
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        passcodeScreen2.H = nVar;
        return passcodeScreen2;
    }

    private final Object d(Object obj2, Object obj3) {
        g3 g3Var;
        com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) this.f320852b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        EsimSubscriptionDetailsScreenContract$ModalStep step = (EsimSubscriptionDetailsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        EsimSubscriptionRefundIneligibilityDetails esimSubscriptionRefundIneligibilityDetails = null;
        if (step instanceof EsimSubscriptionDetailsScreenContract$ModalStep.NonRefundableSubscription) {
            t1 t1Var = (t1) ((zmj.n) ((j2) aVar.J.f22677a).getValue()).f323568a.getContent();
            if (t1Var != null && (g3Var = t1Var.f113663t) != null) {
                esimSubscriptionRefundIneligibilityDetails = g3Var.d;
            }
            EsimNonRefundableBottomSheetScreen esimNonRefundableBottomSheetScreen = new EsimNonRefundableBottomSheetScreen(new EsimNonRefundableBottomSheetScreenContract$InputData(esimSubscriptionRefundIneligibilityDetails));
            h0 block = new h0(aVar, 2);
            Intrinsics.checkNotNullParameter(block, "block");
            esimNonRefundableBottomSheetScreen.H = block;
            return esimNonRefundableBottomSheetScreen;
        }
        if (step instanceof EsimSubscriptionDetailsScreenContract$ModalStep.AutoRenewalInfo) {
            return new EsimAutoRenewalInfoScreen(new EsimAutoRenewalInfoScreenContract$InputData(((EsimSubscriptionDetailsScreenContract$ModalStep.AutoRenewalInfo) step).f101419a));
        }
        if (step instanceof EsimSubscriptionDetailsScreenContract$ModalStep.EsimMigration) {
            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a aVar2 = aVar.E;
            boolean z = ((EsimSubscriptionDetailsScreenContract$ModalStep.EsimMigration) step).f101423a;
            aVar2.getClass();
            EsimMobilePlanEsimMigrationScreen esimMobilePlanEsimMigrationScreen = new EsimMobilePlanEsimMigrationScreen(z ? EsimMobilePlanEsimMigrationScreenContract$InputData.ActiveDataPlanExists.f101215a : EsimMobilePlanEsimMigrationScreenContract$InputData.NoActiveDataPlan.f101216a);
            n block2 = new n(aVar, step, 23);
            Intrinsics.checkNotNullParameter(block2, "block");
            esimMobilePlanEsimMigrationScreen.H = block2;
            return esimMobilePlanEsimMigrationScreen;
        }
        if (!(step instanceof EsimSubscriptionDetailsScreenContract$ModalStep.DataPlanAssignedToVoiceAndData)) {
            if (!(step instanceof EsimSubscriptionDetailsScreenContract$ModalStep.EsimInstallation)) {
                if (step instanceof EsimSubscriptionDetailsScreenContract$ModalStep.ShareEsim) {
                    return new EsimShareQrCodeScreen(new EsimShareQrCodeScreenContract$InputData(((EsimSubscriptionDetailsScreenContract$ModalStep.ShareEsim) step).f101426a));
                }
                throw new NoWhenBranchMatchedException();
            }
            ViewController viewControllerE1 = aVar.e1(new fej.c(new EsimInstallationFlowDescriptor$InputData(((EsimSubscriptionDetailsScreenContract$ModalStep.EsimInstallation) step).f101422a, EsimInstallationFlowDescriptor$Start.DirectInstallation, false)));
            h0 block3 = new h0(aVar, 0);
            Intrinsics.checkNotNullParameter(block3, "block");
            viewControllerE1.H = block3;
            return viewControllerE1;
        }
        cnj.a aVar3 = aVar.F;
        EsimSubscriptionDetailsScreenContract$ModalStep.DataPlanAssignedToVoiceAndData dataPlanAssignedToVoiceAndData = (EsimSubscriptionDetailsScreenContract$ModalStep.DataPlanAssignedToVoiceAndData) step;
        String phoneNumber = dataPlanAssignedToVoiceAndData.f101420a;
        String str = dataPlanAssignedToVoiceAndData.f101421b;
        aVar3.getClass();
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_subscription_details_header_plan_uses_voice_and_data_bottom_sheet_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_subscription_details_header_plan_uses_voice_and_data_bottom_sheet_subtitle, null, null, 14), null, null, false, 28);
        eii.l[] elements = {str != null ? new eii.l((Clause) new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_subscription_details_header_plan_uses_voice_and_data_bottom_sheet_network_provider, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (Clause) null, (RowDelegate.Model.MainImage) null, false, false, (RowDelegate.Model.c) new RowDelegate.Model.c.b(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126), (Object) null, 424) : null, new eii.l((Clause) new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_subscription_details_header_plan_uses_voice_and_data_bottom_sheet_number, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (Clause) null, (RowDelegate.Model.MainImage) null, false, false, (RowDelegate.Model.c) new RowDelegate.Model.c.b(new TextClause(z80.b.b(aVar3.f25451a, phoneNumber, null, null, 6), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126), (Object) null, 424)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        k9 value = k9.ESim;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return new RowActionsBottomSheetController(new eii.c(aVar4, null, listL, new AnalyticsProduct.Retail(value), null));
    }

    private final Object e(Object obj2, Object obj3) {
        com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.a aVar = (com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.a) this.f320852b;
        JuniorAccountDetailsFlowContract$InputData juniorAccountDetailsFlowContract$InputData = aVar.o;
        l FlowCoordinator = (l) obj2;
        JuniorAccountDetailsFlowContract$Step step = (JuniorAccountDetailsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, JuniorAccountDetailsFlowContract$Step.AccountDetails.f77268a)) {
            JuniorAccountDetailsController juniorAccountDetailsController = new JuniorAccountDetailsController(new bo8.c(juniorAccountDetailsFlowContract$InputData.f77267a));
            zg8.d block = new zg8.d(1, aVar, com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.a.class, "handleAccountDetailsResult", "handleAccountDetailsResult(Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_details/screen/JuniorAccountDetailsContract$Output;)V", 0, 6);
            Intrinsics.checkNotNullParameter(block, "block");
            juniorAccountDetailsController.H = block;
            return juniorAccountDetailsController;
        }
        if (!(step instanceof JuniorAccountDetailsFlowContract$Step.ReviewPaymentLinkConsent)) {
            if (!(step instanceof JuniorAccountDetailsFlowContract$Step.CustomAmount)) {
                if (step instanceof JuniorAccountDetailsFlowContract$Step.ParentAccountDetails) {
                    return aVar.e1(new hda.a(new PocketDetailsFlowContract$InputData(((JuniorAccountDetailsFlowContract$Step.ParentAccountDetails) step).f77270a, (AccountId) AccountId.Personal.f51414a, true, true, (wi0.b) null, false, true, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, false, 4016)));
                }
                throw new NoWhenBranchMatchedException();
            }
            ViewController viewControllerE1 = aVar.e1(new ti8.a(((JuniorAccountDetailsFlowContract$Step.CustomAmount) step).f77269a));
            n block2 = new n(aVar, step, 27);
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerE1.H = block2;
            return viewControllerE1;
        }
        JuniorAccountDetailsFlowContract$Step.ReviewPaymentLinkConsent reviewPaymentLinkConsent = (JuniorAccountDetailsFlowContract$Step.ReviewPaymentLinkConsent) step;
        ViewController viewControllerE12 = aVar.e1(new ti8.c(new JuniorPaymentLinksConsentInput(juniorAccountDetailsFlowContract$InputData.f77267a, reviewPaymentLinkConsent.f77271a, reviewPaymentLinkConsent.f77272b, reviewPaymentLinkConsent.f77273c)));
        zg8.d block3 = new zg8.d(1, aVar, com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.a.class, "handleJuniorPaymentLinksConsent", "handleJuniorPaymentLinksConsent(Lcom/revolut/feature/junior_payment_links/api/navigation/JuniorPaymentLinksConsentOutput;)V", 0, 7);
        Intrinsics.checkNotNullParameter(block3, "block");
        viewControllerE12.H = block3;
        return viewControllerE12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ActionsBottomSheetController actionsBottomSheetController;
        int i;
        Flow flowB;
        boolean z;
        int i2 = this.f320851a;
        int i3 = 6;
        final int i5 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        final int i6 = 1;
        final int i21 = 0;
        Object obj4 = this.f320852b;
        switch (i2) {
            case 0:
                PixQrRequestAddAmountScreen pixQrRequestAddAmountScreen = (PixQrRequestAddAmountScreen) obj4;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = PixQrRequestAddAmountScreen.T;
                Intrinsics.checkNotNullParameter((CenteredAmountDelegate.Model) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                xi0.b.Companion.getClass();
                xi0.b bVar = xi0.b.D;
                qd0.b bVarN = ((m0) pixQrRequestAddAmountScreen.S.getValue()).f234025b.f233933h.n();
                s.j(bVarN);
                return new zp0.d(editText, bVar, new u80.d(((s80.b) bVarN).b()), null, new z70.c(pixQrRequestAddAmountScreen), false, false, 0, false, null, 1960);
            case 1:
                final com.revolut.feature_retail_user_declarations.purpose.flow.a aVar = (com.revolut.feature_retail_user_declarations.purpose.flow.a) obj4;
                l FlowCoordinator = (l) obj2;
                PurposeOfAccountFlowContract$Step step = (PurposeOfAccountFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof PurposeOfAccountFlowContract$Step.SelectPurposes)) {
                    throw new NoWhenBranchMatchedException();
                }
                gte.a aVar2 = aVar.f97712p;
                PurposeOfAccountFlowInputData purposeOfAccountFlowInputData = aVar.o;
                if (!((jte.d) aVar2).c(UserDeclarationsApi$Toggles.PurposeOfAccountTilesUi.f97479c)) {
                    PurposeOfAccountScreen purposeOfAccountScreen = new PurposeOfAccountScreen(new PurposeOfAccountScreenContract$InputData(purposeOfAccountFlowInputData.f97708a, purposeOfAccountFlowInputData.f97709b, purposeOfAccountFlowInputData.f97710c, purposeOfAccountFlowInputData.d, purposeOfAccountFlowInputData.e, purposeOfAccountFlowInputData.f));
                    final int i22 = 1;
                    Function1 block = new Function1() { // from class: zbi.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i22) {
                                case 0:
                                    fci.u0 screenOutput = (fci.u0) obj5;
                                    Intrinsics.checkNotNullParameter(screenOutput, "screenOutput");
                                    boolean z3 = screenOutput instanceof v0;
                                    com.revolut.feature_retail_user_declarations.purpose.flow.a aVar3 = aVar;
                                    if (z3) {
                                        aVar3.C2(new ybi.b(((v0) screenOutput).f133819a));
                                    } else {
                                        if (!(screenOutput instanceof u0.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(aVar3.f97715s);
                                    }
                                    return Unit.f186387a;
                                default:
                                    fci.h screenOutput2 = (fci.h) obj5;
                                    Intrinsics.checkNotNullParameter(screenOutput2, "screenOutput");
                                    boolean z4 = screenOutput2 instanceof i;
                                    com.revolut.feature_retail_user_declarations.purpose.flow.a aVar4 = aVar;
                                    if (z4) {
                                        List list = ((i) screenOutput2).f133782a;
                                        d dVar = aVar4.f97713q;
                                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                                        Iterator it8 = list.iterator();
                                        while (it8.hasNext()) {
                                            arrayList.add(dVar.b((g) it8.next()));
                                        }
                                        aVar4.C2(new ybi.b(arrayList));
                                    } else {
                                        if (!(screenOutput2 instanceof h.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(aVar4.f97715s);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    purposeOfAccountScreen.H = block;
                    return purposeOfAccountScreen;
                }
                rbl.a aVar3 = purposeOfAccountFlowInputData.d;
                List list = purposeOfAccountFlowInputData.f97710c;
                bci.d dVar = aVar.f97713q;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(dVar.b((cci.g) it8.next()));
                }
                PurposeOfAccountTilesScreen purposeOfAccountTilesScreen = new PurposeOfAccountTilesScreen(new PurposeOfAccountTilesScreenContract$InputData(aVar3, arrayList));
                aVar.f97714r = purposeOfAccountTilesScreen;
                final int i32 = 0;
                Function1 block2 = new Function1() { // from class: zbi.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i32) {
                            case 0:
                                fci.u0 screenOutput = (fci.u0) obj5;
                                Intrinsics.checkNotNullParameter(screenOutput, "screenOutput");
                                boolean z3 = screenOutput instanceof v0;
                                com.revolut.feature_retail_user_declarations.purpose.flow.a aVar32 = aVar;
                                if (z3) {
                                    aVar32.C2(new ybi.b(((v0) screenOutput).f133819a));
                                } else {
                                    if (!(screenOutput instanceof u0.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.D2(aVar32.f97715s);
                                }
                                return Unit.f186387a;
                            default:
                                fci.h screenOutput2 = (fci.h) obj5;
                                Intrinsics.checkNotNullParameter(screenOutput2, "screenOutput");
                                boolean z4 = screenOutput2 instanceof i;
                                com.revolut.feature_retail_user_declarations.purpose.flow.a aVar4 = aVar;
                                if (z4) {
                                    List list2 = ((i) screenOutput2).f133782a;
                                    d dVar2 = aVar4.f97713q;
                                    ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                                    Iterator it82 = list2.iterator();
                                    while (it82.hasNext()) {
                                        arrayList2.add(dVar2.b((g) it82.next()));
                                    }
                                    aVar4.C2(new ybi.b(arrayList2));
                                } else {
                                    if (!(screenOutput2 instanceof h.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.D2(aVar4.f97715s);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block2, "block");
                purposeOfAccountTilesScreen.H = block2;
                return purposeOfAccountTilesScreen;
            case 2:
                final com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar = (com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c) obj4;
                CryptoDepositsOverviewControllerContract$InputData cryptoDepositsOverviewControllerContract$InputData = cVar.f100090r;
                r rVar = cVar.f100088p;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CryptoDepositsOverviewControllerContract$ModalStep step2 = (CryptoDepositsOverviewControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof CryptoDepositsOverviewControllerContract$ModalStep.SelectNetwork) {
                    CryptoDepositsOverviewControllerContract$ModalStep.SelectNetwork selectNetwork = (CryptoDepositsOverviewControllerContract$ModalStep.SelectNetwork) step2;
                    wk5.a selectedBlockchain = selectNetwork.f100081b;
                    List blockchains = selectNetwork.f100080a;
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(selectedBlockchain, "selectedBlockchain");
                    Intrinsics.checkNotNullParameter(blockchains, "blockchains");
                    RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(((fcj.f) rVar.f250851a).a(blockchains, selectedBlockchain));
                    final int i33 = 0;
                    Function1 block3 = new Function1() { // from class: zbj.h0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i33) {
                                case 0:
                                    eii.k outputData = (eii.k) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z3 = outputData instanceof eii.i;
                                    com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar2 = cVar;
                                    if (z3) {
                                        Object obj6 = ((eii.i) outputData).f126655a;
                                        cli.y yVar = cVar2.F;
                                        wk5.a aVar4 = obj6 instanceof wk5.a ? (wk5.a) obj6 : null;
                                        if (aVar4 != null) {
                                            if (((q) ((j2) yVar.f22677a).getValue()).f320928g.g() == aVar4) {
                                                cVar2.J2();
                                            } else {
                                                cVar2.n2(new com.revolut.retail.feature.crypto_deposits.impl.ui.overview.b(cVar2, aVar4, null), new whi.b(6));
                                                cVar2.H2(yVar, new bcj.i(aVar4, 12));
                                                j2 j2Var = cVar2.E;
                                                j2Var.getClass();
                                                j2Var.g(null, aVar4);
                                            }
                                        }
                                    } else if (outputData instanceof eii.e) {
                                        cVar2.m0("question.what-is-the-cryptocurrency-network");
                                    } else {
                                        cVar2.J2();
                                    }
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter((dii.g) obj5, "outputData");
                                    cVar.m0("question.why-is-my-crypto-deposit-pending");
                                    break;
                                default:
                                    dii.g outputData2 = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 instanceof dii.f) {
                                        com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar3 = cVar;
                                        cVar3.n2(new m0(cVar3, null, 0), new whi.b(6));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    rowActionsBottomSheetController.H = block3;
                    return rowActionsBottomSheetController;
                }
                if (step2 instanceof CryptoDepositsOverviewControllerContract$ModalStep.MinimumDeposit) {
                    dj0.d minimumDepositValue = ((CryptoDepositsOverviewControllerContract$ModalStep.MinimumDeposit) step2).f100079a;
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(minimumDepositValue, "minimumDepositValue");
                    Intrinsics.checkNotNullParameter(minimumDepositValue, "minimumDepositValue");
                    lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.crypto_receive_deposit_minimum_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.crypto_receive_deposit_minimum_subtitle, v.k(new CurrencyClause(minimumDepositValue.f115083b, CurrencyClause.Format.Ticker.f57756a, null, 4), new MoneyClause(minimumDepositValue, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12), null, null, false, 28);
                    aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_learn_more, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var = k9.Crypto;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar4, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                    final int i43 = 1;
                    Function1 block4 = new Function1() { // from class: zbj.h0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i43) {
                                case 0:
                                    eii.k outputData = (eii.k) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z3 = outputData instanceof eii.i;
                                    com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar2 = cVar;
                                    if (z3) {
                                        Object obj6 = ((eii.i) outputData).f126655a;
                                        cli.y yVar = cVar2.F;
                                        wk5.a aVar42 = obj6 instanceof wk5.a ? (wk5.a) obj6 : null;
                                        if (aVar42 != null) {
                                            if (((q) ((j2) yVar.f22677a).getValue()).f320928g.g() == aVar42) {
                                                cVar2.J2();
                                            } else {
                                                cVar2.n2(new com.revolut.retail.feature.crypto_deposits.impl.ui.overview.b(cVar2, aVar42, null), new whi.b(6));
                                                cVar2.H2(yVar, new bcj.i(aVar42, 12));
                                                j2 j2Var = cVar2.E;
                                                j2Var.getClass();
                                                j2Var.g(null, aVar42);
                                            }
                                        }
                                    } else if (outputData instanceof eii.e) {
                                        cVar2.m0("question.what-is-the-cryptocurrency-network");
                                    } else {
                                        cVar2.J2();
                                    }
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter((dii.g) obj5, "outputData");
                                    cVar.m0("question.why-is-my-crypto-deposit-pending");
                                    break;
                                default:
                                    dii.g outputData2 = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 instanceof dii.f) {
                                        com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar3 = cVar;
                                        cVar3.n2(new m0(cVar3, null, 0), new whi.b(6));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block4, "block");
                    actionsBottomSheetController2.H = block4;
                    final int i59 = 0;
                    actionsBottomSheetController2.l2(new Function0() { // from class: zbj.i0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i59) {
                                case 0:
                                    cVar.J2();
                                    break;
                                default:
                                    cVar.J2();
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return actionsBottomSheetController2;
                }
                if (step2 instanceof CryptoDepositsOverviewControllerContract$ModalStep.MindfulOfNetwork) {
                    xi0.b currency = cryptoDepositsOverviewControllerContract$InputData.f100075a;
                    wk5.a blockchain = ((CryptoDepositsOverviewControllerContract$ModalStep.MindfulOfNetwork) step2).f100078a;
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    Intrinsics.checkNotNullParameter(blockchain, "selectedBlockchain");
                    fcj.e eVar2 = (fcj.e) rVar.f250852b;
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    Intrinsics.checkNotNullParameter(blockchain, "blockchain");
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.crypto_receive_screen_network_warning_title, null, null, 14);
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    Intrinsics.checkNotNullParameter(blockchain, "blockchain");
                    lw0.a aVar5 = new lw0.a(textLocalisedClause, new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.crypto_receive_screen_network_warning_subtitle, v.k(d0.a(currency, null), ((ik5.a) eVar2.f133833a).b(blockchain, true, Integer.valueOf(R$attr.uikit_colorGreyTone50))), null, 12), null, null, false, 28);
                    aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.crypto_receive_screen_dont_show_again_text, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                    k9 k9Var2 = k9.Crypto;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar5, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                    Function1 block5 = new Function1() { // from class: zbj.h0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    eii.k outputData = (eii.k) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z3 = outputData instanceof eii.i;
                                    com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar2 = cVar;
                                    if (z3) {
                                        Object obj6 = ((eii.i) outputData).f126655a;
                                        cli.y yVar = cVar2.F;
                                        wk5.a aVar42 = obj6 instanceof wk5.a ? (wk5.a) obj6 : null;
                                        if (aVar42 != null) {
                                            if (((q) ((j2) yVar.f22677a).getValue()).f320928g.g() == aVar42) {
                                                cVar2.J2();
                                            } else {
                                                cVar2.n2(new com.revolut.retail.feature.crypto_deposits.impl.ui.overview.b(cVar2, aVar42, null), new whi.b(6));
                                                cVar2.H2(yVar, new bcj.i(aVar42, 12));
                                                j2 j2Var = cVar2.E;
                                                j2Var.getClass();
                                                j2Var.g(null, aVar42);
                                            }
                                        }
                                    } else if (outputData instanceof eii.e) {
                                        cVar2.m0("question.what-is-the-cryptocurrency-network");
                                    } else {
                                        cVar2.J2();
                                    }
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter((dii.g) obj5, "outputData");
                                    cVar.m0("question.why-is-my-crypto-deposit-pending");
                                    break;
                                default:
                                    dii.g outputData2 = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 instanceof dii.f) {
                                        com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar3 = cVar;
                                        cVar3.n2(new m0(cVar3, null, 0), new whi.b(6));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    actionsBottomSheetController.H = block5;
                    final int i66 = 1;
                    actionsBottomSheetController.l2(new Function0() { // from class: zbj.i0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i66) {
                                case 0:
                                    cVar.J2();
                                    break;
                                default:
                                    cVar.J2();
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                } else {
                    if (!Intrinsics.f(step2, CryptoDepositsOverviewControllerContract$ModalStep.Tag.f100082a)) {
                        if (!(step2 instanceof CryptoDepositsOverviewControllerContract$ModalStep.ViewAddress)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CryptoDepositAddress address = ((CryptoDepositsOverviewControllerContract$ModalStep.ViewAddress) step2).f100083a;
                        rVar.getClass();
                        Intrinsics.checkNotNullParameter(address, "address");
                        fcj.i iVar = (fcj.i) rVar.f250853c;
                        Intrinsics.checkNotNullParameter(address, "address");
                        boolean z3 = false;
                        RowDelegate.Model.MainImage mainImage = null;
                        lw0.a aVar6 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.crypto_receive_screen_receive_view_address_title, null, null, 14), null, null, null, false, 30);
                        Intrinsics.checkNotNullParameter(address, "address");
                        Object obj5 = null;
                        RowDelegate.Model.c cVar2 = null;
                        int i74 = 488;
                        boolean z4 = false;
                        eii.l lVar = new eii.l(new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.crypto_receive_screen_receive_address_title, null, null, 14), new TextClause(address.f100038b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), mainImage, z4, z3, cVar2, obj5, i74);
                        Intrinsics.checkNotNullParameter(address, "address");
                        List listK = v.k(lVar, new eii.l(new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.crypto_receive_screen_receive_address_network_label, null, null, 14), ((ik5.a) iVar.f133835a).b(address.d, true, Integer.valueOf(R$attr.uikit_colorGreyTone50)), mainImage, z4, z3, cVar2, obj5, i74));
                        k9 value = k9.Crypto;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value, "value");
                        return new RowActionsBottomSheetController(new eii.c(aVar6, null, listK, new AnalyticsProduct.Retail(value), null));
                    }
                    xi0.b currency2 = cryptoDepositsOverviewControllerContract$InputData.f100075a;
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(currency2, "currency");
                    Intrinsics.checkNotNullParameter(currency2, "currency");
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.crypto_receive_what_is_destination_tag_dialog_title, null, null, 14);
                    Intrinsics.checkNotNullParameter(currency2, "currency");
                    lw0.a aVar7 = new lw0.a(textLocalisedClause2, new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.crypto_receive_what_is_destination_tag_dialog_subtitle, u.c(d0.a(currency2, null)), null, 12), null, null, false, 28);
                    aw0.e eVar3 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var3 = k9.Crypto;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar7, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                }
                return actionsBottomSheetController;
            case 3:
                final com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d dVar2 = (com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d) obj4;
                l FlowCoordinator2 = (l) obj2;
                PlanGiftingReceiverFlowContract$Step step3 = (PlanGiftingReceiverFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof PlanGiftingReceiverFlowContract$Step.Intro) {
                    PlanGiftingReceiverFlowContract$Step.Intro intro = (PlanGiftingReceiverFlowContract$Step.Intro) step3;
                    PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen = new PlanGiftingReceiverIntroScreen(new PlanGiftingReceiverIntroScreenContract$InputData(intro.f102467a, intro.f102468b, intro.f102469c));
                    za9.c block6 = new za9.c(dVar2, 8);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    planGiftingReceiverIntroScreen.H = block6;
                    return planGiftingReceiverIntroScreen;
                }
                if (step3 instanceof PlanGiftingReceiverFlowContract$Step.FullBenefitsList) {
                    PlanGiftingReceiverFlowContract$Step.FullBenefitsList fullBenefitsList = (PlanGiftingReceiverFlowContract$Step.FullBenefitsList) step3;
                    String str = fullBenefitsList.f102464a;
                    final String str2 = fullBenefitsList.f102465b;
                    ViewController viewControllerE1 = dVar2.e1(new igk.l(new PricingPlanGiftBenefits$InputData(str, fullBenefitsList.f102466c)));
                    final int i92 = 0;
                    Function1 block7 = new Function1() { // from class: zbk.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i92) {
                                case 0:
                                    m output = (m) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!Intrinsics.f(output, m.a.f161259a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar2.K2(str2);
                                    return Unit.f186387a;
                                default:
                                    dii.g outputData = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.f) {
                                        com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d dVar3 = dVar2;
                                        dVar3.l2(new h(dVar3, str2, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    viewControllerE1.H = block7;
                    return viewControllerE1;
                }
                if (step3 instanceof PlanGiftingReceiverFlowContract$Step.DocumentsList) {
                    PlanGiftingReceiverFlowContract$Step.DocumentsList documentsList = (PlanGiftingReceiverFlowContract$Step.DocumentsList) step3;
                    return dVar2.e1(new igk.g(new PlanDocumentsBottomSheet$InputData(documentsList.f102462a, documentsList.f102463b)));
                }
                if (!(step3 instanceof PlanGiftingReceiverFlowContract$Step.DeclineGift)) {
                    throw new NoWhenBranchMatchedException();
                }
                PlanGiftingReceiverFlowContract$Step.DeclineGift declineGift = (PlanGiftingReceiverFlowContract$Step.DeclineGift) step3;
                final String str3 = declineGift.f102460a;
                Clause textClause = declineGift.f102461b;
                dVar2.f102473p.getClass();
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.plan_gifting.impl.R$string.plan_gifting_claiming_decline_title, null, null, 14);
                int i96 = com.revolut.retail.feature.plan_gifting.impl.R$string.plan_gifting_claiming_decline_subtitle;
                if (textClause == null) {
                    m70.a.c(t0.f186434a);
                    textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                lw0.a aVar8 = new lw0.a(textLocalisedClause3, new TextLocalisedClause(i96, u.c(textClause), null, 12), null, null, false, 28);
                aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(com.revolut.retail.feature.plan_gifting.impl.R$string.plan_gifting_claiming_decline_action_negative, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.feature.plan_gifting.impl.R$string.plan_gifting_claiming_decline_action_positive, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                k9 k9Var4 = k9.Premium;
                Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar8, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
                final int i99 = 1;
                Function1 block8 = new Function1() { // from class: zbk.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i99) {
                            case 0:
                                m output = (m) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (!Intrinsics.f(output, m.a.f161259a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2.K2(str3);
                                return Unit.f186387a;
                            default:
                                dii.g outputData = (dii.g) obj6;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                if (outputData instanceof dii.f) {
                                    com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d dVar3 = dVar2;
                                    dVar3.l2(new h(dVar3, str3, null, 1), new yi5.b(26));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block8, "block");
                actionsBottomSheetController3.H = block8;
                return actionsBottomSheetController3;
            case 4:
                com.revolut.feature.apm.spin.impl.ui.transfer.b bVar2 = (com.revolut.feature.apm.spin.impl.ui.transfer.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                SpinTransferFlowContract$Step step4 = (SpinTransferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof SpinTransferFlowContract$Step.Chat) {
                    ViewController viewControllerE12 = bVar2.e1(new kz9.b(new ChatTransferRecipient.ApmTransferRecipient(bVar2.o.f62887a)));
                    za9.c block9 = new za9.c(bVar2, 11);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    viewControllerE12.H = block9;
                    return viewControllerE12;
                }
                if (!(step4 instanceof SpinTransferFlowContract$Step.Transfer)) {
                    throw new NoWhenBranchMatchedException();
                }
                f5j.a aVar9 = ((SpinTransferFlowContract$Step.Transfer) step4).f62889a;
                x2k.a aVar10 = bVar2.f62892q;
                BankTransferInputData inputData = new BankTransferInputData(aVar9, (TransferFlowType) TransferFlowType.Default.f92257b, (BankTransferInputReference) null, new TransferMoneyPocket(null, null, 3), m1l.a.SCHEDULE_DISABLED, new TransferScheduleData(0L, (jli.c) null, 7), (p) null, (FlowExtras) null, (Map) null, (UltimateDebtor) null, (kq2.g) null, (Set) null, false, (ScannedBillDetails) null, (TransferAppSource.AIR_WIDGET) null, 65408);
                aVar10.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                return new BankTransferNavigatingEntryFlow(new BankTransferFlowInputData.NewTransfer(inputData, false));
            case 5:
                com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.flow.a aVar11 = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.flow.a) obj4;
                l FlowCoordinator3 = (l) obj2;
                MortgageValuationFlowContract$Step step5 = (MortgageValuationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof MortgageValuationFlowContract$Step.Summary)) {
                    throw new NoWhenBranchMatchedException();
                }
                MortgageValuationSummaryController mortgageValuationSummaryController = new MortgageValuationSummaryController(new MortgageValuationSummaryControllerContract$InputData(aVar11.f68057p.f68055a));
                za9.c block10 = new za9.c(aVar11, 12);
                Intrinsics.checkNotNullParameter(block10, "block");
                mortgageValuationSummaryController.H = block10;
                return mortgageValuationSummaryController;
            case 6:
                Map config = (Map) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(config, "config");
                ((zeb.g) obj4).f321654b.f("REVERYWHERE_CONFIG_MEMORY_KEY", config);
                return Unit.f186387a;
            case 7:
                com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.b bVar3 = (com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.b) obj4;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                FormFlowContract$Step step6 = (FormFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof FormFlowContract$Step.Form)) {
                    throw new NoWhenBranchMatchedException();
                }
                FormFlowContract$Step.Form form = (FormFlowContract$Step.Form) step6;
                FormScreen formScreen = new FormScreen(new FormScreenContract$InputData(form.f78698a, form.f78699b, form.f78700c));
                za9.c block11 = new za9.c(bVar3, 15);
                Intrinsics.checkNotNullParameter(block11, "block");
                formScreen.H = block11;
                return formScreen;
            case 8:
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                AddAssetRev10Screen.Companion aVar12 = AddAssetRev10Screen.INSTANCE;
                ((com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.a) ((AddAssetRev10Screen) obj4).T2()).y2(new zfd.m(iIntValue, iIntValue2));
                return Unit.f186387a;
            case 9:
                com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.a aVar13 = (com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.a) obj4;
                ce9.p pVar = (ce9.p) obj2;
                ce9.n action = (ce9.n) obj3;
                Intrinsics.checkNotNullParameter(action, "action");
                o oVar = pVar != null ? pVar.f : null;
                zfd.i iVar2 = oVar instanceof zfd.i ? (zfd.i) oVar : null;
                int i100 = iVar2 != null ? iVar2.f321932a : 0;
                int i101 = zfd.r.f321942a[action.ordinal()];
                if (i101 == 1 || i101 == 2) {
                    i = 0;
                } else if (i101 == 3) {
                    i = i100 + 1;
                } else {
                    if (i101 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = i100;
                }
                AddAssetRev10ScreenContract$InputData addAssetRev10ScreenContract$InputData = aVar13.f86825q;
                if (addAssetRev10ScreenContract$InputData instanceof AddAssetRev10ScreenContract$InputData.Loading) {
                    efm.r rVarEmpty = efm.r.empty();
                    Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
                    return rVarEmpty;
                }
                if (!(addAssetRev10ScreenContract$InputData instanceof AddAssetRev10ScreenContract$InputData.Content)) {
                    throw new NoWhenBranchMatchedException();
                }
                m3d.d dVar3 = aVar13.f86824p;
                FavouritesAssetTypeKey key = ((AddAssetRev10ScreenContract$InputData.Content) addAssetRev10ScreenContract$InputData).f86821a;
                String query = ((zfd.h) aVar13.t2()).d;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(query, "query");
                x3d.a aVar14 = (x3d.a) dVar3.f202368c.get(key);
                if (aVar14 == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Watchlist Rev10: Missing provider for following key ", key.f86866a));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    flowB = new v1(new lpl.c(illegalArgumentException, objArr == true ? 1 : 0, 15));
                } else {
                    flowB = aVar14.b(i, query);
                }
                return nim.a.w(rd0.e.c(flowB, kotlin.coroutines.g.f186406a), new wk4.k(i, 10));
            case 10:
                final com.revolut.retail.feature.esim.impl.ui.flows.installation.a aVar15 = (com.revolut.retail.feature.esim.impl.ui.flows.installation.a) obj4;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                EsimInstallationFlowContract$Step step7 = (EsimInstallationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof EsimInstallationFlowContract$Step.Installation) {
                    final int i102 = 0;
                    EsimInstallBottomSheetScreen esimInstallBottomSheetScreen = new EsimInstallBottomSheetScreen(new EsimInstallBottomSheetScreenContract$InputData(hnj.d.NO_BUTTON, aVar15.o.f100688a, false));
                    Function1 block12 = new Function1() { // from class: zfj.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i103 = i102;
                            d.a aVar16 = d.a.f134638a;
                            com.revolut.retail.feature.esim.impl.ui.flows.installation.a aVar17 = aVar15;
                            switch (i103) {
                                case 0:
                                    hnj.e output = (hnj.e) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (Intrinsics.f(output, e.b.f154125a)) {
                                        aVar17.I2();
                                    } else if (Intrinsics.f(output, e.c.f154126a)) {
                                        aVar17.C2(d.b.f134639a);
                                    } else {
                                        if (!Intrinsics.f(output, e.a.f154124a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar17.C2(aVar16);
                                    }
                                    return Unit.f186387a;
                                default:
                                    dii.g output2 = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (Intrinsics.f(output2, dii.e.f115068a)) {
                                        chj.d dVar4 = aVar17.f100693p;
                                        EsimProfile esimProfile = aVar17.o.f100688a;
                                        String str4 = esimProfile.f100423a;
                                        EsimProfileDetails esimProfileDetails = esimProfile.f100426g;
                                        dVar4.b3(str4, esimProfileDetails != null ? esimProfileDetails.a() : null);
                                    } else if (Intrinsics.f(output2, f.f115069a)) {
                                        aVar17.C2(aVar16);
                                    } else {
                                        int i104 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    esimInstallBottomSheetScreen.H = block12;
                    return esimInstallBottomSheetScreen;
                }
                if (!(step7 instanceof EsimInstallationFlowContract$Step.Confirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                ajj.a aVar16 = aVar15.f100694q;
                EsimProfileInstallationConfirmation installationConfirmation = ((EsimInstallationFlowContract$Step.Confirmation) step7).f100691a;
                aVar16.getClass();
                Intrinsics.checkNotNullParameter(installationConfirmation, "installationConfirmation");
                lw0.a aVar17 = new lw0.a(new TextClause(installationConfirmation.f100445a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(installationConfirmation.f100446b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28);
                m6 m6Var = n6.Companion;
                aw0.h hVar2 = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_flexible_start_installation_sheet_install_esim, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_flexible_start_installation_sheet_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                k9 k9Var5 = k9.ESim;
                Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController4 = new ActionsBottomSheetController(new dii.a(aVar17, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
                final int i103 = 1;
                Function1 block13 = new Function1() { // from class: zfj.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i1032 = i103;
                        d.a aVar162 = d.a.f134638a;
                        com.revolut.retail.feature.esim.impl.ui.flows.installation.a aVar172 = aVar15;
                        switch (i1032) {
                            case 0:
                                hnj.e output = (hnj.e) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (Intrinsics.f(output, e.b.f154125a)) {
                                    aVar172.I2();
                                } else if (Intrinsics.f(output, e.c.f154126a)) {
                                    aVar172.C2(d.b.f134639a);
                                } else {
                                    if (!Intrinsics.f(output, e.a.f154124a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar172.C2(aVar162);
                                }
                                return Unit.f186387a;
                            default:
                                dii.g output2 = (dii.g) obj6;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (Intrinsics.f(output2, dii.e.f115068a)) {
                                    chj.d dVar4 = aVar172.f100693p;
                                    EsimProfile esimProfile = aVar172.o.f100688a;
                                    String str4 = esimProfile.f100423a;
                                    EsimProfileDetails esimProfileDetails = esimProfile.f100426g;
                                    dVar4.b3(str4, esimProfileDetails != null ? esimProfileDetails.a() : null);
                                } else if (Intrinsics.f(output2, f.f115069a)) {
                                    aVar172.C2(aVar162);
                                } else {
                                    int i104 = jli.h.f175850a;
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block13, "block");
                actionsBottomSheetController4.H = block13;
                return actionsBottomSheetController4;
            case 11:
                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a aVar18 = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a) obj4;
                l FlowCoordinator4 = (l) obj2;
                RefinancingAccountDetailsFlowContract$Step step8 = (RefinancingAccountDetailsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof RefinancingAccountDetailsFlowContract$Step.ProductsList)) {
                    throw new NoWhenBranchMatchedException();
                }
                RefinancingAccountDetailsHomeController refinancingAccountDetailsHomeController = new RefinancingAccountDetailsHomeController(new RefinancingAccountDetailsHomeScreenContract$InputData(aVar18.f68247p.f68245a));
                za9.c block14 = new za9.c(aVar18, 18);
                Intrinsics.checkNotNullParameter(block14, "block");
                refinancingAccountDetailsHomeController.H = block14;
                return refinancingAccountDetailsHomeController;
            case 12:
                com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b bVar4 = (com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                MandateSetupBottomSheetContract$ModalStep step9 = (MandateSetupBottomSheetContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof MandateSetupBottomSheetContract$ModalStep.LimitInputStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                MandateLimitInputScreen mandateLimitInputScreen = new MandateLimitInputScreen(new MandateLimitInputScreenContract$InputData(((MandateSetupBottomSheetContract$ModalStep.LimitInputStep) step9).f72428b));
                n block15 = new n(bVar4, step9, 5);
                Intrinsics.checkNotNullParameter(block15, "block");
                mandateLimitInputScreen.H = block15;
                return mandateLimitInputScreen;
            case 13:
                com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b bVar5 = (com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b) obj4;
                yki.b LazyFlowCoordinator4 = (yki.b) obj2;
                RedeemRewardFlowContract$Step step10 = (RedeemRewardFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator4, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (Intrinsics.f(step10, RedeemRewardFlowContract$Step.OptInRevPoints.f74883a)) {
                    ViewController viewControllerE13 = bVar5.e1(new hub.a(new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) new RevPointsOptInSource.Deeplink(null), false, 6)));
                    zg7.c block16 = new zg7.c(bVar5, 1);
                    Intrinsics.checkNotNullParameter(block16, "block");
                    viewControllerE13.H = block16;
                    return viewControllerE13;
                }
                if (!Intrinsics.f(step10, RedeemRewardFlowContract$Step.RedeemRevPointHub.f74884a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE14 = bVar5.e1(new hub.f());
                viewControllerE14.j2(new yq0.e(bVar5, 27));
                return viewControllerE14;
            case 14:
                com.revolut.feature.junior_graduation.impl.ui.flow.identification.a aVar19 = (com.revolut.feature.junior_graduation.impl.ui.flow.identification.a) obj4;
                l FlowCoordinator5 = (l) obj2;
                IdentificationFlowContract$Step step11 = (IdentificationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof IdentificationFlowContract$Step.JuniorIdentificationScreen) {
                    IdentificationFlowContract$InputData identificationFlowContract$InputData = aVar19.o;
                    JuniorIdentificationScreen juniorIdentificationScreen = new JuniorIdentificationScreen(new JuniorIdentificationScreenContract$InputData(identificationFlowContract$InputData.f76924a, identificationFlowContract$InputData.f76925b, identificationFlowContract$InputData.f76926c));
                    zg8.d block17 = new zg8.d(1, aVar19, com.revolut.feature.junior_graduation.impl.ui.flow.identification.a.class, "handleIdentificationScreenResult", "handleIdentificationScreenResult(Lcom/revolut/feature/junior_graduation/impl/ui/screen/identification/JuniorIdentificationScreenContract$OutputData;)V", 0, 0);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    juniorIdentificationScreen.H = block17;
                    return juniorIdentificationScreen;
                }
                if (!(step11 instanceof IdentificationFlowContract$Step.GraduationNotAvailableYetScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_junior_user_identification_too_early_screen_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_junior_user_identification_too_early_screen_description_generic, u.c(String.valueOf(((IdentificationFlowContract$Step.GraduationNotAvailableYetScreen) step11).f76927a)), null, 12), null, new UrlVideo(aVar19.f76930q.d() ? "https://assets.revolut.com/published-assets/d1ae8135-fbd2-4ec9-aaf1-41b5d16a5966/ad3d38ec-e2d6-45c3-a1b3-a3f36f67035f/4/0958fd6c-bd8f-4206-94ff-eb42dfe5106e.mp4" : "https://assets.revolut.com/published-assets/d1ae8135-fbd2-4ec9-aaf1-41b5d16a5966/27bcab2e-4375-4ade-85b3-e8550342deff/2/f9098e47-362c-4761-bf35-4721d8ee2b25.mp4", (String) null, false, (oz0.b) null, false, (oz0.c) null, 126), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_junior_user_identification_too_early_screen_go_to_junior_button, null, null, 14), null, true, null, null, null, false, 16726988));
                za9.c block18 = new za9.c(aVar19, 19);
                Intrinsics.checkNotNullParameter(block18, "block");
                fullScreenPromptScreen.H = block18;
                return fullScreenPromptScreen;
            case 15:
                zga.c params = (zga.c) obj2;
                zga.f banner = (zga.f) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(banner, "banner");
                ((zga.g) obj4).f322100b.f(params.f322096h, banner);
                return Unit.f186387a;
            case 16:
                String currentPlanId = (String) obj2;
                zga.k status = (zga.k) obj3;
                Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                Intrinsics.checkNotNullParameter(status, "status");
                ((zga.m) obj4).f322105b.f("pricing_plan_contextual_nudge_" + currentPlanId, status);
                return Unit.f186387a;
            case 17:
                com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar20 = (com.revolut.retail.feature.esim.impl.ui.screens.checkout.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimCheckoutScreenContract$ModalStep step12 = (EsimCheckoutScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof EsimCheckoutScreenContract$ModalStep.AutoRenewalInfo) {
                    return new EsimAutoRenewalInfoScreen(new EsimAutoRenewalInfoScreenContract$InputData(((EsimCheckoutScreenContract$ModalStep.AutoRenewalInfo) step12).f100910a));
                }
                if (step12 instanceof EsimCheckoutScreenContract$ModalStep.RevPayPocketSelection) {
                    dj0.d dVar4 = ((EsimCheckoutScreenContract$ModalStep.RevPayPocketSelection) step12).f100915a;
                    EsimUserPocket esimUserPocket = (EsimUserPocket) ((zgj.r) ((j2) aVar20.H.f22677a).getValue()).f322175b.getContent();
                    ViewController viewControllerE15 = aVar20.e1(new w6c.i(new PayWithAnyControllerDescriptor$InputData(t.ESIM, dVar4, esimUserPocket != null ? esimUserPocket.f100532b : null, null, null, null, w6c.f.ONLY_POCKETS_FILTERED_BY_BALANCE, null, null, false, 1912)));
                    zgj.b0 block19 = new zgj.b0(aVar20, 1);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    viewControllerE15.H = block19;
                    return viewControllerE15;
                }
                if (step12 instanceof EsimCheckoutScreenContract$ModalStep.ExchangeBreakdown) {
                    EsimCheckoutScreenContract$ExchangeBreakdownData esimCheckoutScreenContract$ExchangeBreakdownData = ((EsimCheckoutScreenContract$ModalStep.ExchangeBreakdown) step12).f100913a;
                    Quote quote = esimCheckoutScreenContract$ExchangeBreakdownData.f100906b.f100196a;
                    if (quote == null) {
                        throw new IllegalStateException("EsimCheckoutScreenModel: quote is missing when the exchange breakdown dialog is requested to be opened");
                    }
                    com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e eVar4 = esimCheckoutScreenContract$ExchangeBreakdownData.f100905a;
                    return aVar20.e1(new w6c.k(new PaymentBreakdownControllerDescriptor$InputData(quote, esimCheckoutScreenContract$ExchangeBreakdownData.f100906b.f100198c, w6c.j.EXCHANGE, eVar4 != null ? new PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Default(eVar4, null) : PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Empty.f84440a)));
                }
                if (step12 instanceof EsimCheckoutScreenContract$ModalStep.RevPointsBottomSheet) {
                    return aVar20.e1(new hub.c(e0.ESIM_CHECKOUT));
                }
                if (!(step12 instanceof EsimCheckoutScreenContract$ModalStep.EsimInstallation)) {
                    if (!(step12 instanceof EsimCheckoutScreenContract$ModalStep.RefundBreakdown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EsimCheckoutScreenContract$PlanChangeRefundInfo esimCheckoutScreenContract$PlanChangeRefundInfo = ((EsimCheckoutScreenContract$ModalStep.RefundBreakdown) step12).f100914a;
                    return new EsimDataPlanRefundSummaryBottomSheetScreen(new EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData(esimCheckoutScreenContract$PlanChangeRefundInfo.f100917a, esimCheckoutScreenContract$PlanChangeRefundInfo.f100918b, esimCheckoutScreenContract$PlanChangeRefundInfo.f100919c));
                }
                EsimCheckoutScreenContract$ModalStep.EsimInstallation esimInstallation = (EsimCheckoutScreenContract$ModalStep.EsimInstallation) step12;
                ViewController viewControllerE16 = aVar20.e1(new fej.c(new EsimInstallationFlowDescriptor$InputData(esimInstallation.f100911a, EsimInstallationFlowDescriptor$Start.DirectInstallation, esimInstallation.f100912b)));
                zgj.b0 block20 = new zgj.b0(aVar20, 0);
                Intrinsics.checkNotNullParameter(block20, "block");
                viewControllerE16.H = block20;
                return viewControllerE16;
            case 18:
                return a(obj2, obj3);
            case 19:
                zh1.b bVar6 = (zh1.b) obj4;
                l FlowCoordinator6 = (l) obj2;
                AddressFlowContract$Step step13 = (AddressFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof AddressFlowContract$Step.AddAddress)) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z6 = ((AddressFlowContract$Step.AddAddress) step13).f60944a;
                Address address2 = ((AddressFlowContract$State) ((j2) bVar6.f322213q.f22677a).getValue()).f60943a;
                AddressFlowContract$InputData addressFlowContract$InputData = bVar6.o;
                Clause clause = addressFlowContract$InputData.f60927b;
                Clause clause2 = addressFlowContract$InputData.f60928c;
                Clause clause3 = addressFlowContract$InputData.d;
                boolean z11 = addressFlowContract$InputData.f;
                Clause clause4 = addressFlowContract$InputData.f60929g;
                Clause clause5 = addressFlowContract$InputData.i;
                Clause clause6 = addressFlowContract$InputData.f60931j;
                boolean z12 = addressFlowContract$InputData.k;
                qh1.b bVar7 = addressFlowContract$InputData.f60932l;
                boolean z29 = addressFlowContract$InputData.f60933m;
                boolean z31 = addressFlowContract$InputData.f60934n;
                boolean z41 = addressFlowContract$InputData.o;
                AnalyticsProduct analyticsProduct = addressFlowContract$InputData.f60935p;
                AnalyticsContext analyticsContext = addressFlowContract$InputData.f60936q;
                boolean z49 = addressFlowContract$InputData.f60937r;
                FieldMode fieldMode = addressFlowContract$InputData.f60930h;
                if (addressFlowContract$InputData.f60938s) {
                    z = z6;
                    boolean z54 = ((jte.d) bVar6.f322212p).c(AddressFlowApi$AddressLocationSearch.f60924c);
                    AddAddressScreen addAddressScreen = new AddAddressScreen(new AddAddressScreenContract$InputData(analyticsContext, analyticsProduct, clause, clause2, clause3, clause4, clause5, clause6, addressFlowContract$InputData.f60939t, addressFlowContract$InputData.u, fieldMode, address2, bVar7, z, z11, z12, z29, z31, z41, z49, z54));
                    za9.c block21 = new za9.c(bVar6, 26);
                    Intrinsics.checkNotNullParameter(block21, "block");
                    addAddressScreen.H = block21;
                    return addAddressScreen;
                }
                z = z6;
                AddAddressScreen addAddressScreen2 = new AddAddressScreen(new AddAddressScreenContract$InputData(analyticsContext, analyticsProduct, clause, clause2, clause3, clause4, clause5, clause6, addressFlowContract$InputData.f60939t, addressFlowContract$InputData.u, fieldMode, address2, bVar7, z, z11, z12, z29, z31, z41, z49, z54));
                za9.c block212 = new za9.c(bVar6, 26);
                Intrinsics.checkNotNullParameter(block212, "block");
                addAddressScreen2.H = block212;
                return addAddressScreen2;
            case 20:
                final com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.a aVar21 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.a) obj4;
                yki.b LazyFlowCoordinator5 = (yki.b) obj2;
                PlanKeepFlowContract$Step step14 = (PlanKeepFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator5, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof PlanKeepFlowContract$Step.BenefitsToLose) {
                    PlanBenefitsToLoseScreen planBenefitsToLoseScreen = new PlanBenefitsToLoseScreen();
                    Function1 block22 = new Function1() { // from class: zhk.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    rhk.d output = (rhk.d) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!(output instanceof rhk.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.D2(aVar21.f103189r);
                                    return Unit.f186387a;
                                default:
                                    xkk.i output2 = (xkk.i) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z74 = output2 instanceof xkk.h;
                                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.a aVar22 = aVar21;
                                    if (z74) {
                                        aVar22.l2(new zah.f(aVar22, ((xkk.h) output2).f306850a, null, 14), new yi5.b(26));
                                    } else {
                                        if (!(output2 instanceof xkk.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar22, aVar22.f103189r, PlanKeepFlowContract$Step.ChangePlan.f103186a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block22, "block");
                    planBenefitsToLoseScreen.H = block22;
                    return planBenefitsToLoseScreen;
                }
                if (!(step14 instanceof PlanKeepFlowContract$Step.ChangePlan)) {
                    throw new NoWhenBranchMatchedException();
                }
                PlanChangeFlow planChangeFlow = new PlanChangeFlow(new rhk.c(PlanFilter.NoFilter.f103390a, PlanSelection.Default.f103355a, new rhk.e(2), xfa.b.FREE_TRIAL_END_REMINDER, PlanChangeSuccessActionStrategy.PostResult.f102916a, false));
                Function1 block23 = new Function1() { // from class: zhk.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i21) {
                            case 0:
                                rhk.d output = (rhk.d) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (!(output instanceof rhk.d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.D2(aVar21.f103189r);
                                return Unit.f186387a;
                            default:
                                xkk.i output2 = (xkk.i) obj6;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                boolean z74 = output2 instanceof xkk.h;
                                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.a aVar22 = aVar21;
                                if (z74) {
                                    aVar22.l2(new zah.f(aVar22, ((xkk.h) output2).f306850a, null, 14), new yi5.b(26));
                                } else {
                                    if (!(output2 instanceof xkk.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar22, aVar22.f103189r, PlanKeepFlowContract$Step.ChangePlan.f103186a, true, null, false, 12);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block23, "block");
                planChangeFlow.H = block23;
                return planChangeFlow;
            case 21:
                com.revolut.feature.pay_later.impl.ui.paymentoptions.options.a aVar22 = (com.revolut.feature.pay_later.impl.ui.paymentoptions.options.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PaymentOptionsControllerContract$ModalStep step15 = (PaymentOptionsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof PaymentOptionsControllerContract$ModalStep.SelectSchedule) {
                    return new PreferredScheduleController(new PreferredScheduleControllerContract$InputData(((PaymentOptionsControllerContract$ModalStep.SelectSchedule) step15).f78887a, aVar22.o.f78886a));
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                zkk.u uVar = (zkk.u) obj4;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new AnalyticsContext(uVar.a(uVar.f323088a, null));
            case 23:
                return b(obj2, obj3);
            case 24:
                return c(obj2, obj3);
            case 25:
                return d(obj2, obj3);
            case 26:
                com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c cVar3 = (com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ReviewAccountLinkingDetailsScreenContract$ModalStep step16 = (ReviewAccountLinkingDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (!(step16 instanceof ReviewAccountLinkingDetailsScreenContract$ModalStep.ExpirationSelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                ReviewAccountLinkingDetailsScreenContract$ModalStep.ExpirationSelection expirationSelection = (ReviewAccountLinkingDetailsScreenContract$ModalStep.ExpirationSelection) step16;
                ExpirationSelectionBottomSheetScreen expirationSelectionBottomSheetScreen = new ExpirationSelectionBottomSheetScreen(new ExpirationSelectionBottomSheetContract$InputData(expirationSelection.f73057b, expirationSelection.f73056a));
                n block24 = new n(cVar3, step16, 24);
                Intrinsics.checkNotNullParameter(block24, "block");
                expirationSelectionBottomSheetScreen.H = block24;
                return expirationSelectionBottomSheetScreen;
            case 27:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new zn6.l(zn6.n.a(((zn6.h) obj4).f323675c, null), (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), false);
            case 28:
                return e(obj2, obj3);
            default:
                final com.revolut.sso.impl.ui.passcode.create_flow.c cVar4 = (com.revolut.sso.impl.ui.passcode.create_flow.c) obj4;
                com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$InputData createPasscodeFlowContract$InputData = cVar4.o;
                l FlowCoordinator7 = (l) obj2;
                com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$Step it9 = (com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator7, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it9, "it");
                com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$Step createPasscodeFlowContract$Step = (com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$Step) FlowCoordinator7.d();
                if (Intrinsics.f(createPasscodeFlowContract$Step, CreatePasscodeFlowContract$Step.Confirm.f106605a)) {
                    PasscodeScreenContract$InputData.Companion companion = PasscodeScreenContract$InputData.INSTANCE;
                    PinCodeView.Header.Title title = new PinCodeView.Header.Title(i3, createPasscodeFlowContract$InputData.f106603c, (TextLocalisedClause) (objArr3 == true ? 1 : 0));
                    AnalyticsProduct.Shared shared = mql.a.f208025a;
                    companion.getClass();
                    PasscodeScreen passcodeScreen = new PasscodeScreen(PasscodeScreenContract$InputData.Companion.b(title, 6, shared));
                    Function1 function1 = new Function1() { // from class: znl.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i21) {
                                case 0:
                                    com.revolut.sso.impl.ui.passcode.create_flow.c cVar5 = cVar4;
                                    yki.a aVar23 = cVar5.f106608q;
                                    de9.m result = (de9.m) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof de9.i) {
                                        throw new IllegalStateException(("Forgot passcode is not support in " + aVar23.d() + " step").toString());
                                    }
                                    if (result instanceof j) {
                                        String str4 = ((j) result).f113326a;
                                        if (Intrinsics.f(str4, ((CreatePasscodeFlowContract$State) ((j2) cVar5.f106609r.f22677a).getValue()).f106604a)) {
                                            cVar5.C2(new c(str4));
                                        } else {
                                            yji.l.a1(cVar5, cVar5.X1(new y0("DIALOG_ID_PASSCODES_MISMATCHED", new z(new TextLocalisedClause(com.revolut.feature.pincode.common.R$string.revolut_passcode_creation_alert_match_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.pincode.common.R$string.revolut_passcode_creation_alert_match_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.pincode.common.R$string.revolut_passcode_creation_alert_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new com.revolut.sso.impl.ui.passcode.create_flow.a(cVar5, null), 3);
                                        }
                                        return Unit.f186387a;
                                    }
                                    if (result instanceof k) {
                                        throw new IllegalStateException(("Biometric is not supported in " + aVar23.d() + " step").toString());
                                    }
                                    if (!(result instanceof de9.l)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw new IllegalStateException(("UsePassword is not support in " + aVar23.d() + " step").toString());
                                default:
                                    com.revolut.sso.impl.ui.passcode.create_flow.c cVar6 = cVar4;
                                    yki.a aVar24 = cVar6.f106608q;
                                    de9.m result2 = (de9.m) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof de9.i) {
                                        throw new IllegalStateException(("Forgot passcode is not support in " + aVar24.d() + " step").toString());
                                    }
                                    if (result2 instanceof j) {
                                        String str5 = ((j) result2).f113326a;
                                        hzl.m mVarB = cVar6.f106607p.b(str5, cVar6.o.f106601a);
                                        if (mVarB instanceof hzl.k) {
                                            hzl.k kVar = (hzl.k) mVarB;
                                            yji.l.a1(cVar6, cVar6.X1(new y0("DIALOG_ID_PASSCODE_INVALID", new z(kVar.f157265a, kVar.f157266b, new TextLocalisedClause(com.revolut.feature.pincode.common.R$string.revolut_passcode_creation_alert_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new com.revolut.sso.impl.ui.passcode.create_flow.b(cVar6, null), 3);
                                        } else {
                                            if (!(mVarB instanceof hzl.l)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cVar6.H2(cVar6.f106609r, new yui.v(str5, 22));
                                            oki.h.t2(cVar6, cVar6.f106608q, CreatePasscodeFlowContract$Step.Confirm.f106605a, false, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    }
                                    if (result2 instanceof k) {
                                        throw new IllegalStateException(("Biometric is not supported in " + aVar24.d() + " step").toString());
                                    }
                                    if (!(result2 instanceof de9.l)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw new IllegalStateException(("UsePassword is not support in " + aVar24.d() + " step").toString());
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function1, "<set-?>");
                    passcodeScreen.H = function1;
                    return passcodeScreen;
                }
                if (!Intrinsics.f(createPasscodeFlowContract$Step, CreatePasscodeFlowContract$Step.Create.f106606a)) {
                    throw new NoWhenBranchMatchedException();
                }
                PasscodeScreenContract$InputData.Companion companion2 = PasscodeScreenContract$InputData.INSTANCE;
                PinCodeView.Header.Title title2 = new PinCodeView.Header.Title(i3, createPasscodeFlowContract$InputData.f106602b, (TextLocalisedClause) (objArr2 == true ? 1 : 0));
                PinCodeView.Mode.Placeholder placeholder = new PinCodeView.Mode.Placeholder(6);
                AnalyticsProduct.Shared shared2 = mql.a.f208025a;
                companion2.getClass();
                PasscodeScreen passcodeScreen2 = new PasscodeScreen(PasscodeScreenContract$InputData.Companion.c(title2, placeholder, shared2));
                Function1 function12 = new Function1() { // from class: znl.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i6) {
                            case 0:
                                com.revolut.sso.impl.ui.passcode.create_flow.c cVar5 = cVar4;
                                yki.a aVar23 = cVar5.f106608q;
                                de9.m result = (de9.m) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof de9.i) {
                                    throw new IllegalStateException(("Forgot passcode is not support in " + aVar23.d() + " step").toString());
                                }
                                if (result instanceof j) {
                                    String str4 = ((j) result).f113326a;
                                    if (Intrinsics.f(str4, ((CreatePasscodeFlowContract$State) ((j2) cVar5.f106609r.f22677a).getValue()).f106604a)) {
                                        cVar5.C2(new c(str4));
                                    } else {
                                        yji.l.a1(cVar5, cVar5.X1(new y0("DIALOG_ID_PASSCODES_MISMATCHED", new z(new TextLocalisedClause(com.revolut.feature.pincode.common.R$string.revolut_passcode_creation_alert_match_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.pincode.common.R$string.revolut_passcode_creation_alert_match_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.pincode.common.R$string.revolut_passcode_creation_alert_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new com.revolut.sso.impl.ui.passcode.create_flow.a(cVar5, null), 3);
                                    }
                                    return Unit.f186387a;
                                }
                                if (result instanceof k) {
                                    throw new IllegalStateException(("Biometric is not supported in " + aVar23.d() + " step").toString());
                                }
                                if (!(result instanceof de9.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException(("UsePassword is not support in " + aVar23.d() + " step").toString());
                            default:
                                com.revolut.sso.impl.ui.passcode.create_flow.c cVar6 = cVar4;
                                yki.a aVar24 = cVar6.f106608q;
                                de9.m result2 = (de9.m) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof de9.i) {
                                    throw new IllegalStateException(("Forgot passcode is not support in " + aVar24.d() + " step").toString());
                                }
                                if (result2 instanceof j) {
                                    String str5 = ((j) result2).f113326a;
                                    hzl.m mVarB = cVar6.f106607p.b(str5, cVar6.o.f106601a);
                                    if (mVarB instanceof hzl.k) {
                                        hzl.k kVar = (hzl.k) mVarB;
                                        yji.l.a1(cVar6, cVar6.X1(new y0("DIALOG_ID_PASSCODE_INVALID", new z(kVar.f157265a, kVar.f157266b, new TextLocalisedClause(com.revolut.feature.pincode.common.R$string.revolut_passcode_creation_alert_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new com.revolut.sso.impl.ui.passcode.create_flow.b(cVar6, null), 3);
                                    } else {
                                        if (!(mVarB instanceof hzl.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar6.H2(cVar6.f106609r, new yui.v(str5, 22));
                                        oki.h.t2(cVar6, cVar6.f106608q, CreatePasscodeFlowContract$Step.Confirm.f106605a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                }
                                if (result2 instanceof k) {
                                    throw new IllegalStateException(("Biometric is not supported in " + aVar24.d() + " step").toString());
                                }
                                if (!(result2 instanceof de9.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException(("UsePassword is not support in " + aVar24.d() + " step").toString());
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(function12, "<set-?>");
                passcodeScreen2.H = function12;
                return passcodeScreen2;
        }
    }

    public /* synthetic */ a(zn6.n nVar, zn6.h hVar) {
        this.f320851a = 27;
        this.f320852b = hVar;
    }
}
