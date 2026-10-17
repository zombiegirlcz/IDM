package j2c;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import c12.p0;
import c12.u0;
import c84.t;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.protobuf.w0;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$InputData;
import com.revolut.biometric_verification.impl.ui.flow.launcher.BiometricVerificationLauncherFlow;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrScannerInputData;
import com.revolut.feature.apm.iris.impl.ui.pay.IrisPayFlowContract$Step;
import com.revolut.feature.apm.payid.impl.flow.PayIdFlowContract$Step;
import com.revolut.feature.apm.payid.impl.screen.area.AreaScreen;
import com.revolut.feature.apm.payid.impl.screen.area.a;
import com.revolut.feature.apm.payid.impl.screen.createpayid.flow.CreatePayIdFlow;
import com.revolut.feature.apm.payid.impl.screen.createpayid.otp.OtpScreen;
import com.revolut.feature.apm.payid.impl.screen.send.flow.SendFlow;
import com.revolut.feature.apm.payid.impl.screen.send.flow.SendFlowContract$InputData;
import com.revolut.feature.apm.payid.impl.screen.settings.flow.SettingsFlow;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_holder_name.CardHolderNameController;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_holder_name.CardHolderNameControllerContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.guidelines.CardPersonalisationGuidelinesController;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.guidelines.CardPersonalisationGuidelinesControllerContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.CardExtraSecurityControllerContract$ModalStep;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.LinkCardDetailsReviewScreenContract$ModalStep;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.limits.CardLimitsInfoScreen;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationControllerContract$ModalStep;
import com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionInfoPopup;
import com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionIntroConfig;
import com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionIntroScreenContent;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsControllerContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.details.DownPaymentSourceDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.details.DownPaymentSourceDetailsControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.DownPaymentSourceFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.sources.DownPaymentSourcesController;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.sources.DownPaymentSourcesControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.IllionBankStatementFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.IllionBankStatementFlowContract$Step;
import com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController;
import com.revolut.feature.credit.loan.autopay.api.account_selector.AccountSelectorV2$InputData;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.details.AccountDetailsController;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.details.AccountDetailsControllerContract$InputData;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.AddExternalAccountController;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.AddExternalAccountControllerContract$InputData;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.SelectAccountV2ControllerContract$ModalStep;
import com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.LoanSetupSepaAccountFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.LoanSetupSepaAccountFlowController;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.LoanManageRepaymentsControllerContract$ModalStep;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.flow.DeFiRecoveryPhraseFlowContract$Step;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.DeFiRecoveryPhraseScreen;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.DeFiRecoveryPhraseScreenContract$InputData;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.setup.DirectDepositSetupScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.amount.RecurringDonationAmountScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.RevolutFeedFlowContract$Step;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed.RevolutFeedScreen;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.profile.ProfileScreen;
import com.revolut.feature.onboarding.impl.onboarding.biometric.OnboardingBiometricFlowContract$Step;
import com.revolut.feature.onboarding.impl.onboarding.selfie.OnboardingSelfieFlow;
import com.revolut.feature.onboarding.impl.onboarding.selfie.OnboardingSelfieFlowContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.Rev10ChatTransferScreen;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.TabPaymentsFlowContract$Step;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.PaymentsIntroScreen;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.PaymentsIntroScreenContract$InputData;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.AccountDetailsPaymentControllerContract$ModalStep;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.feature.pix.impl.flow.qr.PixQrCodeFlowContract$Step;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.PixQrCodeTransactionFlow;
import com.revolut.feature.pix.impl.flow.transfer.PixTransferFlow;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardSectionInfo;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub.CobrandedCardsPlanHubFlowContract$PagerItem;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.CobrandedCardsPlanHubRewardsScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.CobrandedCardsPlanHubRewardsScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.CobrandedCardsPlanHubRewardsScreenContract$ModalStep;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.CobrandedCardsPlanHubRewardInfoScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.CobrandedCardsPlanHubRewardInfoScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_selection.CobrandedCardsPlanHubRewardSelectionScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_selection.CobrandedCardsPlanHubRewardSelectionScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.CobrandedCardsPlanHubTransactionsScreen;
import com.revolut.feature.rev_points.models.SpareChangeCalculations;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeBreakdownControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.breakdown.RevPointsSpareChangeBreakdownController;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.RevPointsSpareChangeFullListControllerContract$ModalStep;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.flow.InvestorUpdateFlowContract$Step;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.StrategyReportScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.StrategyReportScreenContract$InputData;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerControllerContract$ModalStep;
import com.revolut.feature_retail_user_declarations.contact_selection.ContactSelectionWorkflowContract$Step;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$OutputData;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import czc.d0;
import dx4.a1;
import e54.a0;
import g12.m;
import g12.n;
import g12.o;
import g12.p;
import g12.q;
import grl.k9;
import ha4.i;
import ha4.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ka4.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import oki.h;
import oy3.g;
import sa2.f;
import vkm.j2;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f170819b;

    public /* synthetic */ n(j6a.n nVar, j6a.g gVar) {
        this.f170818a = 11;
        this.f170819b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v102, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v182, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str;
        int i;
        RowDelegate.Model.MainImage.Image24 image24;
        Object pixTransferFlow;
        int i2 = this.f170818a;
        int i3 = 12;
        String str2 = null;
        str2 = null;
        Object obj4 = this.f170819b;
        switch (i2) {
            case 0:
                boolean z = false;
                y yVar = ((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) obj4).v;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RevPointsSpareChangeFullListControllerContract$ModalStep modalStep = (RevPointsSpareChangeFullListControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(modalStep, "modalStep");
                if (!(modalStep instanceof RevPointsSpareChangeFullListControllerContract$ModalStep.Breakdown)) {
                    throw new NoWhenBranchMatchedException();
                }
                SpareChangeCalculations spareChangeCalculations = ((RevPointsSpareChangeFullListControllerContract$ModalStep.Breakdown) modalStep).f84161a;
                int iA = ((f) ((j2) yVar.f22677a).getValue()).f170807b.a();
                List list = (List) ((f) ((j2) yVar.f22677a).getValue()).f170808c.getContent();
                if (list != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it8 = list2.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                yvh.b bVar = (yvh.b) it8.next();
                                if (bVar.e == yvh.h.LOYALTY_PROFILE && bVar.f317177b) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return new RevPointsSpareChangeBreakdownController(new RevPointsSpareChangeBreakdownControllerApi$InputData(spareChangeCalculations, iA, z, 16));
            case 1:
                com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b bVar2 = (com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CardExtraSecurityControllerContract$ModalStep step = (CardExtraSecurityControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof CardExtraSecurityControllerContract$ModalStep.ChangeCardholderName)) {
                    throw new NoWhenBranchMatchedException();
                }
                CardExtraSecurityControllerContract$ModalStep.ChangeCardholderName changeCardholderName = (CardExtraSecurityControllerContract$ModalStep.ChangeCardholderName) step;
                CardHolderNameController cardHolderNameController = new CardHolderNameController(new CardHolderNameControllerContract$InputData(changeCardholderName.f65195a, changeCardholderName.f65196b));
                iyi.i block = new iyi.i(bVar2, 12);
                Intrinsics.checkNotNullParameter(block, "block");
                cardHolderNameController.H = block;
                return cardHolderNameController;
            case 2:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                ((j37.h) obj4).getClass();
                return (List) getDefaultErrorItems.invoke(new iii.d(true, true, "LIST_ID_TRANSACTIONS_ERROR", j37.g.f170983a));
            case 3:
                com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b bVar3 = (com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ChartLimitPickerControllerContract$ModalStep it9 = (ChartLimitPickerControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it9, "it");
                xi0.b bVar4 = ((j3i.k) ((j2) bVar3.v.f22677a).getValue()).e.f171196b;
                if (it9 instanceof ChartLimitPickerControllerContract$ModalStep.HighestAmountPicker) {
                    return bVar3.K2(((ChartLimitPickerControllerContract$ModalStep.HighestAmountPicker) it9).f96991a, bVar4, g3i.a.TAKE_PROFIT, hw0.q.HIGHEST);
                }
                if (it9 instanceof ChartLimitPickerControllerContract$ModalStep.LowestAmountPicker) {
                    return bVar3.K2(((ChartLimitPickerControllerContract$ModalStep.LowestAmountPicker) it9).f96992a, bVar4, g3i.a.STOP_LOSS, hw0.q.LOWEST);
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a aVar = (com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                LinkCardDetailsReviewScreenContract$ModalStep step2 = (LinkCardDetailsReviewScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!Intrinsics.f(step2, LinkCardDetailsReviewScreenContract$ModalStep.CardLimitDetails.f65276a)) {
                    throw new NoWhenBranchMatchedException();
                }
                CardLimitsInfoScreen cardLimitsInfoScreen = new CardLimitsInfoScreen(new l43.d(aVar.o.f65274b.f150110a));
                iyi.i block2 = new iyi.i(aVar, 15);
                Intrinsics.checkNotNullParameter(block2, "block");
                cardLimitsInfoScreen.H = block2;
                return cardLimitsInfoScreen;
            case 5:
                final com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b bVar5 = (com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b) obj4;
                AccountSelectorV2$InputData accountSelectorV2$InputData = bVar5.o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SelectAccountV2ControllerContract$ModalStep step3 = (SelectAccountV2ControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof SelectAccountV2ControllerContract$ModalStep.AddExternalAccount) {
                    AddExternalAccountController addExternalAccountController = new AddExternalAccountController(new AddExternalAccountControllerContract$InputData(((SelectAccountV2ControllerContract$ModalStep.AddExternalAccount) step3).f70298a, true, accountSelectorV2$InputData.f70288h, accountSelectorV2$InputData.d));
                    final int i5 = 0;
                    Function1 block3 = new Function1() { // from class: j45.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i6 = i5;
                            com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b bVar6 = bVar5;
                            switch (i6) {
                                case 0:
                                    h45.i result = (h45.i) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof h45.h)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar6.C2(new v35.b(((h45.h) result).f149317a));
                                    return Unit.f186387a;
                                default:
                                    yja.b result2 = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (i.f171302a[result2.ordinal()] == 1) {
                                        bVar6.n2(new k(bVar6, null, 0), new whi.b(6));
                                    } else {
                                        int i21 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    addExternalAccountController.H = block3;
                    return addExternalAccountController;
                }
                if (step3 instanceof SelectAccountV2ControllerContract$ModalStep.ExternalAccountDetails) {
                    return new AccountDetailsController(new AccountDetailsControllerContract$InputData(((SelectAccountV2ControllerContract$ModalStep.ExternalAccountDetails) step3).f70300a, accountSelectorV2$InputData.f, accountSelectorV2$InputData.f70287g, accountSelectorV2$InputData.f70288h, accountSelectorV2$InputData.d));
                }
                if (!(step3 instanceof SelectAccountV2ControllerContract$ModalStep.Article)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE1 = bVar5.e1(new ProductArticleDescriptor(((SelectAccountV2ControllerContract$ModalStep.Article) step3).f70299a, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, null, null, false, 60));
                final int i6 = 1;
                Function1 block4 = new Function1() { // from class: j45.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        int i66 = i6;
                        com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b bVar6 = bVar5;
                        switch (i66) {
                            case 0:
                                h45.i result = (h45.i) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (!(result instanceof h45.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar6.C2(new v35.b(((h45.h) result).f149317a));
                                return Unit.f186387a;
                            default:
                                yja.b result2 = (yja.b) obj5;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (i.f171302a[result2.ordinal()] == 1) {
                                    bVar6.n2(new k(bVar6, null, 0), new whi.b(6));
                                } else {
                                    int i21 = jli.h.f175850a;
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block4, "block");
                viewControllerE1.H = block4;
                return viewControllerE1;
            case 6:
                com.revolut.feature.card_personalisation.generation.impl.ui.generation.a aVar2 = (com.revolut.feature.card_personalisation.generation.impl.ui.generation.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CustomisationImageGenerationControllerContract$ModalStep step4 = (CustomisationImageGenerationControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof CustomisationImageGenerationControllerContract$ModalStep.Guidelines)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.v.getClass();
                return new CardPersonalisationGuidelinesController(new CardPersonalisationGuidelinesControllerContract$InputData(false));
            case 7:
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.a aVar3 = (com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.a) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                TabPaymentsFlowContract$Step step5 = (TabPaymentsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof TabPaymentsFlowContract$Step.Chats) {
                    return new Rev10ChatTransferScreen(((TabPaymentsFlowContract$Step.Chats) step5).f80182a);
                }
                if (step5 instanceof TabPaymentsFlowContract$Step.InitialScreen) {
                    PaymentsIntroScreen paymentsIntroScreen = new PaymentsIntroScreen(new PaymentsIntroScreenContract$InputData(((TabPaymentsFlowContract$Step.InitialScreen) step5).f80184a.f80152c));
                    j5a.c block5 = new j5a.c(aVar3, LazyFlowCoordinator, 0);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    paymentsIntroScreen.H = block5;
                    return paymentsIntroScreen;
                }
                if (!Intrinsics.f(step5, TabPaymentsFlowContract$Step.FindFriendsScreen.f80183a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar3.f80187r.getClass();
                ResourceImage resourceImage = null;
                String str3 = null;
                int i21 = 62;
                boolean z3 = false;
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("FIND_FRIENDS_ITEM_ID", new TextLocalisedClause(R$string.prompt_contact_access_denied_title, null, null, 14), new TextLocalisedClause(R$string.prompt_contact_access_denied_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D028", null, null, null, 30), null), 0 == true ? 1 : 0, null, new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button(new TextLocalisedClause(R$string.prompt_contact_access_denied_action_settings, null, null, 14), resourceImage, (LargeActionButton.ButtonStyle) null, z3, str3, i21), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.prompt_contact_access_denied_action_decline, null, null, 14), resourceImage, (LargeActionButton.ButtonStyle) (0 == true ? 1 : 0), z3, str3, i21), null, null, null, null, null, null, null, null, null, null, 2095536), null, false, false, null, 30));
                j5a.c block6 = new j5a.c(aVar3, LazyFlowCoordinator, 1);
                Intrinsics.checkNotNullParameter(block6, "block");
                promptMarketingScreen.H = block6;
                return promptMarketingScreen;
            case 8:
                final com.revolut.feature.apm.iris.impl.ui.pay.b bVar6 = (com.revolut.feature.apm.iris.impl.ui.pay.b) obj4;
                IrisPayFlowContract$Step step6 = (IrisPayFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof IrisPayFlowContract$Step.Scanner) {
                    ViewController viewControllerE12 = bVar6.e1(new g12.k(new QrScannerInputData(), bVar6.f62517p));
                    final int i22 = 0;
                    Function1 block7 = new Function1() { // from class: j62.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i22) {
                                case 0:
                                    q outputData = (q) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z4 = outputData instanceof n;
                                    com.revolut.feature.apm.iris.impl.ui.pay.b bVar7 = bVar6;
                                    c cVar = c.f171663a;
                                    if (z4 || (outputData instanceof o)) {
                                        bVar7.C2(cVar);
                                    } else {
                                        if (!(outputData instanceof p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        p pVar = (p) outputData;
                                        Intrinsics.checkNotNullParameter(pVar, "<this>");
                                        m mVar = pVar.f139527a;
                                        d62.d dVar = mVar instanceof d62.d ? (d62.d) mVar : null;
                                        bVar7.l2(new iz1.p(bVar7, dVar != null ? dVar.f111439a : null, null, 16), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    u0 it10 = (u0) obj5;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    oki.h.D2(bVar6.f62521t);
                                    return Unit.f186387a;
                                default:
                                    PendingPaymentContract$OutputData it11 = (PendingPaymentContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(it11, "it");
                                    oki.h.D2(bVar6.f62521t);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    viewControllerE12.H = block7;
                    return viewControllerE12;
                }
                if (step6 instanceof IrisPayFlowContract$Step.Transfer) {
                    ViewController viewControllerE13 = bVar6.e1(new p0(((IrisPayFlowContract$Step.Transfer) step6).f62516a));
                    final int i32 = 1;
                    Function1 block8 = new Function1() { // from class: j62.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i32) {
                                case 0:
                                    q outputData = (q) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z4 = outputData instanceof n;
                                    com.revolut.feature.apm.iris.impl.ui.pay.b bVar7 = bVar6;
                                    c cVar = c.f171663a;
                                    if (z4 || (outputData instanceof o)) {
                                        bVar7.C2(cVar);
                                    } else {
                                        if (!(outputData instanceof p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        p pVar = (p) outputData;
                                        Intrinsics.checkNotNullParameter(pVar, "<this>");
                                        m mVar = pVar.f139527a;
                                        d62.d dVar = mVar instanceof d62.d ? (d62.d) mVar : null;
                                        bVar7.l2(new iz1.p(bVar7, dVar != null ? dVar.f111439a : null, null, 16), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    u0 it10 = (u0) obj5;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    oki.h.D2(bVar6.f62521t);
                                    return Unit.f186387a;
                                default:
                                    PendingPaymentContract$OutputData it11 = (PendingPaymentContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(it11, "it");
                                    oki.h.D2(bVar6.f62521t);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    viewControllerE13.H = block8;
                    return viewControllerE13;
                }
                if (!(step6 instanceof IrisPayFlowContract$Step.PendingPayment)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE14 = bVar6.e1(new tak.a(((IrisPayFlowContract$Step.PendingPayment) step6).f62514a, bVar6.f62519r));
                final int i33 = 2;
                Function1 block9 = new Function1() { // from class: j62.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i33) {
                            case 0:
                                q outputData = (q) obj5;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean z4 = outputData instanceof n;
                                com.revolut.feature.apm.iris.impl.ui.pay.b bVar7 = bVar6;
                                c cVar = c.f171663a;
                                if (z4 || (outputData instanceof o)) {
                                    bVar7.C2(cVar);
                                } else {
                                    if (!(outputData instanceof p)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    p pVar = (p) outputData;
                                    Intrinsics.checkNotNullParameter(pVar, "<this>");
                                    m mVar = pVar.f139527a;
                                    d62.d dVar = mVar instanceof d62.d ? (d62.d) mVar : null;
                                    bVar7.l2(new iz1.p(bVar7, dVar != null ? dVar.f111439a : null, null, 16), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            case 1:
                                u0 it10 = (u0) obj5;
                                Intrinsics.checkNotNullParameter(it10, "it");
                                oki.h.D2(bVar6.f62521t);
                                return Unit.f186387a;
                            default:
                                PendingPaymentContract$OutputData it11 = (PendingPaymentContract$OutputData) obj5;
                                Intrinsics.checkNotNullParameter(it11, "it");
                                oki.h.D2(bVar6.f62521t);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block9, "block");
                viewControllerE14.H = block9;
                return viewControllerE14;
            case 9:
                com.revolut.feature.defi.settings.impl.ui.recovery_phrase.flow.a aVar4 = (com.revolut.feature.defi.settings.impl.ui.recovery_phrase.flow.a) obj4;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                DeFiRecoveryPhraseFlowContract$Step step7 = (DeFiRecoveryPhraseFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!Intrinsics.f(step7, DeFiRecoveryPhraseFlowContract$Step.Warning.f71869a)) {
                    if (Intrinsics.f(step7, DeFiRecoveryPhraseFlowContract$Step.Phrase.f71868a)) {
                        return new DeFiRecoveryPhraseScreen(new DeFiRecoveryPhraseScreenContract$InputData(aVar4.o.f71867a, wk5.k.EVM));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                aVar4.f71870p.getClass();
                lw0.a aVar5 = new lw0.a(new TextLocalisedClause(com.revolut.feature.defi.settings.impl.R$string.crypto_defi_recovery_phrase_warning_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.defi.settings.impl.R$string.crypto_defi_recovery_phrase_warning_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, GlyphImageTint.WARNING.f59933a, null, 4)), null, false, 24);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.defi.settings.impl.R$string.crypto_defi_recovery_phrase_warning_button_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var = k9.Crypto;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar5, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                j4h.m block10 = new j4h.m(aVar4, LazyFlowCoordinator2, 8);
                Intrinsics.checkNotNullParameter(block10, "block");
                actionsBottomSheetController.H = block10;
                actionsBottomSheetController.k2(new iv0.p(aVar4, 15));
                return actionsBottomSheetController;
            case 10:
                com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a aVar6 = (com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AccountDetailsPaymentControllerContract$ModalStep step8 = (AccountDetailsPaymentControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!Intrinsics.f(step8, AccountDetailsPaymentControllerContract$ModalStep.CountrySelection.f80273a)) {
                    throw new NoWhenBranchMatchedException();
                }
                y yVar2 = aVar6.f80279w;
                ViewController viewControllerE15 = aVar6.e1(new hda.d(((j6a.g) ((j2) yVar2.f22677a).getValue()).f171702c, ((j6a.g) ((j2) yVar2.f22677a).getValue()).d));
                kotlin.jvm.internal.s.S(viewControllerE15, new fi7.s(2, aVar6, com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 28), new d0(12), new iyi.i(aVar6, 21));
                return viewControllerE15;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.d0.E0(l6a.a.c(com.revolut.feature.payments_migration.impl.R$string.payments_migration_move_payment_instructions_first_step_account_details_description, R$attr.uikit_dp24, ((j6a.g) obj4).f171703g), l6a.a.b((Throwable) obj2));
            case 12:
                j6b.j jVar = (j6b.j) obj4;
                ali.b PagerCoordinator = (ali.b) obj2;
                CobrandedCardsPlanHubFlowContract$PagerItem pagerItem = (CobrandedCardsPlanHubFlowContract$PagerItem) obj3;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
                int i43 = j6b.i.f171729a[pagerItem.ordinal()];
                if (i43 == 1) {
                    return new CobrandedCardsPlanHubScreen();
                }
                if (i43 != 2) {
                    if (i43 == 3) {
                        return new CobrandedCardsPlanHubTransactionsScreen();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                y yVar3 = jVar.f171732r;
                j6b.c cVar = (j6b.c) ((j2) yVar3.f22677a).getValue();
                if (Intrinsics.f(cVar.f171719b, CobrandedCardsPlanHubFlowContract$PagerItem.REWARDS.getF94249a()) && (str = cVar.e) != null) {
                    jVar.H2(yVar3, new j3f.d(20));
                    str2 = str;
                }
                return new CobrandedCardsPlanHubRewardsScreen(new CobrandedCardsPlanHubRewardsScreenContract$InputData(str2));
            case 13:
                com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.a aVar7 = (com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator8 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                LoanManageRepaymentsControllerContract$ModalStep step9 = (LoanManageRepaymentsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator8, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof LoanManageRepaymentsControllerContract$ModalStep.SelectAccount)) {
                    throw new NoWhenBranchMatchedException();
                }
                LoanManageRepaymentsControllerContract$ModalStep.SelectAccount selectAccount = (LoanManageRepaymentsControllerContract$ModalStep.SelectAccount) step9;
                LoanSetupSepaAccountFlowController loanSetupSepaAccountFlowController = new LoanSetupSepaAccountFlowController(new LoanSetupSepaAccountFlowContract$InputData(selectAccount.f70474a, selectAccount.f70475b));
                iyi.i block11 = new iyi.i(aVar7, 26);
                Intrinsics.checkNotNullParameter(block11, "block");
                loanSetupSepaAccountFlowController.H = block11;
                return loanSetupSepaAccountFlowController;
            case 14:
                com.revolut.feature.notification_centre.impl.ui.revolut_feed.a aVar8 = (com.revolut.feature.notification_centre.impl.ui.revolut_feed.a) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                RevolutFeedFlowContract$Step step10 = (RevolutFeedFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof RevolutFeedFlowContract$Step.Feed)) {
                    if (step10 instanceof RevolutFeedFlowContract$Step.Profile) {
                        return new ProfileScreen();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                RevolutFeedScreen revolutFeedScreen = new RevolutFeedScreen();
                j4h.m block12 = new j4h.m(aVar8, FlowCoordinator, 16);
                Intrinsics.checkNotNullParameter(block12, "block");
                revolutFeedScreen.H = block12;
                return revolutFeedScreen;
            case 15:
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a aVar9 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator9 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CobrandedCardsPlanHubRewardsScreenContract$ModalStep step11 = (CobrandedCardsPlanHubRewardsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator9, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof CobrandedCardsPlanHubRewardsScreenContract$ModalStep.SectionInfo) {
                    CobrandedCardsPlanHubInfoRewardSectionInfo cobrandedCardsPlanHubInfoRewardSectionInfo = ((CobrandedCardsPlanHubRewardsScreenContract$ModalStep.SectionInfo) step11).f82595a;
                    lw0.a aVar10 = new lw0.a(new TextClause(cobrandedCardsPlanHubInfoRewardSectionInfo.f82402a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(cobrandedCardsPlanHubInfoRewardSectionInfo.f82403b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28);
                    f0 f0Var = f0.f322471a;
                    aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextClause(cobrandedCardsPlanHubInfoRewardSectionInfo.f82404c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 value = k9.Cobrands;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value, "value");
                    return new RowActionsBottomSheetController(new eii.c(aVar10, eVar2, f0Var, new AnalyticsProduct.Retail(value), null));
                }
                if (step11 instanceof CobrandedCardsPlanHubRewardsScreenContract$ModalStep.RewardInfo) {
                    return new CobrandedCardsPlanHubRewardInfoScreen(new CobrandedCardsPlanHubRewardInfoScreenContract$InputData(((CobrandedCardsPlanHubRewardsScreenContract$ModalStep.RewardInfo) step11).f82593a));
                }
                if (!(step11 instanceof CobrandedCardsPlanHubRewardsScreenContract$ModalStep.RewardSelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                CobrandedCardsPlanHubRewardSelectionScreen cobrandedCardsPlanHubRewardSelectionScreen = new CobrandedCardsPlanHubRewardSelectionScreen(new CobrandedCardsPlanHubRewardSelectionScreenContract$InputData(((CobrandedCardsPlanHubRewardsScreenContract$ModalStep.RewardSelection) step11).f82594a));
                iyi.i block13 = new iyi.i(aVar9, 27);
                Intrinsics.checkNotNullParameter(block13, "block");
                cobrandedCardsPlanHubRewardSelectionScreen.H = block13;
                return cobrandedCardsPlanHubRewardSelectionScreen;
            case 16:
                com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.flow.a aVar11 = (com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.flow.a) obj4;
                InvestorUpdateFlowContract$Step step12 = (InvestorUpdateFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof InvestorUpdateFlowContract$Step.StrategyReport) {
                    return new StrategyReportScreen(new StrategyReportScreenContract$InputData(aVar11.o.f91351a));
                }
                throw new NoWhenBranchMatchedException();
            case 17:
                DebtDetailsController debtDetailsController = (DebtDetailsController) obj4;
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                KProperty[] kPropertyArr = DebtDetailsController.T;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = model.P;
                if (obj5 instanceof a0) {
                    return new zp0.d(field.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) debtDetailsController.O.getValue(), null, null, false, false, 0, false, null, 1912);
                }
                if (!(obj5 instanceof e54.w)) {
                    return null;
                }
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                return new zp0.p(locale, field.getInnerEditText(), new dr0.w(2), "dd/MM/yyyy", false, false, null, false, DefaultFrameSampler.DESIRED_FRAME_WIDTH);
            case 18:
                com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a aVar12 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator10 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DebtDetailsControllerContract$ModalStep step13 = (DebtDetailsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator10, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof DebtDetailsControllerContract$ModalStep.DropdownPicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                l94.b bVar7 = aVar12.f67508s;
                my3.n field2 = ((DebtDetailsControllerContract$ModalStep.DropdownPicker) step13).f67504a;
                bVar7.getClass();
                Intrinsics.checkNotNullParameter(field2, "field");
                lw0.a aVar13 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_v3_debt_details_dropdown_field_picker_dialog_title, zhm.u.c(field2.f210337g.f210332a), null, 12), null, null, null, false, 30);
                ArrayList<my3.l> arrayList = field2.f210337g.f210333b;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (my3.l lVar : arrayList) {
                    String str4 = field2.e;
                    String str5 = lVar.f210329a;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_v3_debt_details_dropdown_field_picker_dialog_option_title, zhm.u.c(lVar.f210330b), null, i3);
                    a1 a1Var = lVar.f210331c;
                    if (a1Var != null) {
                        i = 6;
                        GlyphImage glyphImage = new GlyphImage(a1Var.c(), null, null, 6);
                        boolean z4 = false;
                        image24 = new RowDelegate.Model.MainImage.Image24(glyphImage, z4, z4, i);
                    } else {
                        i = 6;
                        image24 = null;
                    }
                    arrayList2.add(new RowDelegate.Model(str5, image24, textLocalisedClause, null, 0, null, null, null, 0, !Intrinsics.f(str4, str5) ? null : new tf(nz8.d.L(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), false, null, Intrinsics.f(str4, str5), null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536861688));
                    i3 = 12;
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                k9 k9Var2 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                CreditBottomSheetListItemsController creditBottomSheetListItemsController = new CreditBottomSheetListItemsController(new cy4.a(aVar13, arrayList2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2)));
                j4h.m block14 = new j4h.m(aVar12, step13, 17);
                Intrinsics.checkNotNullParameter(block14, "block");
                creditBottomSheetListItemsController.H = block14;
                return creditBottomSheetListItemsController;
            case 19:
                DirectDepositSetupScreen directDepositSetupScreen = (DirectDepositSetupScreen) obj4;
                InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                InputText field3 = (InputText) obj3;
                KProperty[] kPropertyArr2 = DirectDepositSetupScreen.T;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field3, "field");
                if (!Intrinsics.f(model2.f52580a, "FIXED_AMOUNT_FIELD_INPUT_ID")) {
                    return null;
                }
                MaskedTextInputEditText innerEditText = field3.getInnerEditText();
                xi0.b.Companion.getClass();
                return new zp0.d(innerEditText, xi0.b.i, (u80.d) directDepositSetupScreen.N.getValue(), null, new j96.f(directDepositSetupScreen, model2), false, false, 0, false, null, 2024);
            case 20:
                String id10 = (String) obj2;
                fa.j navigationHubContent = (fa.j) obj3;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(navigationHubContent, "navigationHubContent");
                ((ja.b) obj4).d.f("NAVIGATION_HUB_MEMORY_KEY" + id10, navigationHubContent);
                return Unit.f186387a;
            case 21:
                final com.revolut.feature.apm.payid.impl.flow.a aVar14 = (com.revolut.feature.apm.payid.impl.flow.a) obj4;
                PayIdFlowContract$Step step14 = (PayIdFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof PayIdFlowContract$Step.Area) {
                    AreaScreen areaScreen = new AreaScreen();
                    final int i59 = 1;
                    Function1 block15 = new Function1() { // from class: ja2.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i59) {
                                case 0:
                                    f output = (f) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!(output instanceof f.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.apm.payid.impl.flow.a aVar15 = aVar14;
                                    h.t2(aVar15, aVar15.f62708r, PayIdFlowContract$Step.Area.f62700a, false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.apm.payid.impl.screen.area.a output2 = (com.revolut.feature.apm.payid.impl.screen.area.a) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z6 = output2 instanceof a.C0456a;
                                    com.revolut.feature.apm.payid.impl.flow.a aVar16 = aVar14;
                                    if (z6) {
                                        h.t2(aVar16, aVar16.f62708r, PayIdFlowContract$Step.CreatePayID.f62701a, true, null, false, 12);
                                    } else if (output2 instanceof a.d) {
                                        h.t2(aVar16, aVar16.f62708r, PayIdFlowContract$Step.Send.f62704a, true, null, false, 12);
                                    } else if (output2 instanceof a.b) {
                                        h.t2(aVar16, aVar16.f62708r, PayIdFlowContract$Step.AddContact.f62699a, true, null, false, 12);
                                    } else {
                                        if (!(output2 instanceof a.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar16, aVar16.f62708r, PayIdFlowContract$Step.Settings.f62705a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block15, "block");
                    areaScreen.H = block15;
                    return areaScreen;
                }
                if (step14 instanceof PayIdFlowContract$Step.CreatePayID) {
                    return new CreatePayIdFlow();
                }
                if (step14 instanceof PayIdFlowContract$Step.Send) {
                    return new SendFlow(0);
                }
                if (step14 instanceof PayIdFlowContract$Step.AddContact) {
                    return new SendFlow(new SendFlowContract$InputData(true));
                }
                if (step14 instanceof PayIdFlowContract$Step.Settings) {
                    return new SettingsFlow();
                }
                if (!(step14 instanceof PayIdFlowContract$Step.Otp)) {
                    throw new NoWhenBranchMatchedException();
                }
                PayIdFlowContract$Step.Otp otp = (PayIdFlowContract$Step.Otp) step14;
                OtpScreen otpScreen = new OtpScreen(new sa2.e(otp.f62702a, otp.f62703b));
                final int i66 = 0;
                Function1 block16 = new Function1() { // from class: ja2.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i66) {
                            case 0:
                                f output = (f) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (!(output instanceof f.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.apm.payid.impl.flow.a aVar15 = aVar14;
                                h.t2(aVar15, aVar15.f62708r, PayIdFlowContract$Step.Area.f62700a, false, null, false, 12);
                                return Unit.f186387a;
                            default:
                                com.revolut.feature.apm.payid.impl.screen.area.a output2 = (com.revolut.feature.apm.payid.impl.screen.area.a) obj6;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                boolean z6 = output2 instanceof a.C0456a;
                                com.revolut.feature.apm.payid.impl.flow.a aVar16 = aVar14;
                                if (z6) {
                                    h.t2(aVar16, aVar16.f62708r, PayIdFlowContract$Step.CreatePayID.f62701a, true, null, false, 12);
                                } else if (output2 instanceof a.d) {
                                    h.t2(aVar16, aVar16.f62708r, PayIdFlowContract$Step.Send.f62704a, true, null, false, 12);
                                } else if (output2 instanceof a.b) {
                                    h.t2(aVar16, aVar16.f62708r, PayIdFlowContract$Step.AddContact.f62699a, true, null, false, 12);
                                } else {
                                    if (!(output2 instanceof a.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar16, aVar16.f62708r, PayIdFlowContract$Step.Settings.f62705a, true, null, false, 12);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block16, "block");
                otpScreen.H = block16;
                return otpScreen;
            case 22:
                final com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.a aVar15 = (com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.a) obj4;
                DownPaymentSourceFlowContract$Step step15 = (DownPaymentSourceFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof DownPaymentSourceFlowContract$Step.Sources) {
                    DownPaymentSourcesController downPaymentSourcesController = new DownPaymentSourcesController(new DownPaymentSourcesControllerContract$InputData(aVar15.f67613p.f67609a));
                    final int i74 = 0;
                    Function1 block17 = new Function1() { // from class: ja4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i74) {
                                case 0:
                                    ka4.n result = (ka4.n) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z6 = result instanceof ka4.m;
                                    com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.a aVar16 = aVar15;
                                    if (z6) {
                                        ka4.m mVar = (ka4.m) result;
                                        ArrayList arrayList3 = mVar.f182424a;
                                        oy3.a aVar17 = mVar.f182425b;
                                        if (aVar17 != null) {
                                            h.t2(aVar16, aVar16.f67615r, new DownPaymentSourceFlowContract$Step.Details(arrayList3, aVar17), true, null, false, 12);
                                        } else {
                                            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                                            Iterator it10 = arrayList3.iterator();
                                            while (it10.hasNext()) {
                                                arrayList4.add(new oy3.f(null, (String) it10.next()));
                                            }
                                            aVar16.l2(new iz1.p(aVar16, new g(arrayList4), null, 20), new yi5.b(26));
                                        }
                                    } else {
                                        if (!(result instanceof l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        t.J2(aVar16, false, null, null, 7);
                                    }
                                    return Unit.f186387a;
                                default:
                                    i result2 = (i) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    List<j> list3 = result2.f150443a;
                                    ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
                                    for (j jVar2 : list3) {
                                        arrayList5.add(new oy3.f(jVar2.f150445b, jVar2.f150444a));
                                    }
                                    g gVar = new g(arrayList5);
                                    com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.a aVar18 = aVar15;
                                    aVar18.l2(new iz1.p(aVar18, gVar, null, 20), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    downPaymentSourcesController.H = block17;
                    return downPaymentSourcesController;
                }
                if (!(step15 instanceof DownPaymentSourceFlowContract$Step.Details)) {
                    throw new NoWhenBranchMatchedException();
                }
                DownPaymentSourceFlowContract$Step.Details details = (DownPaymentSourceFlowContract$Step.Details) step15;
                DownPaymentSourceDetailsController downPaymentSourceDetailsController = new DownPaymentSourceDetailsController(new DownPaymentSourceDetailsControllerContract$InputData(details.f67610a, details.f67611b));
                final int i92 = 1;
                Function1 block18 = new Function1() { // from class: ja4.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i92) {
                            case 0:
                                ka4.n result = (ka4.n) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z6 = result instanceof ka4.m;
                                com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.a aVar16 = aVar15;
                                if (z6) {
                                    ka4.m mVar = (ka4.m) result;
                                    ArrayList arrayList3 = mVar.f182424a;
                                    oy3.a aVar17 = mVar.f182425b;
                                    if (aVar17 != null) {
                                        h.t2(aVar16, aVar16.f67615r, new DownPaymentSourceFlowContract$Step.Details(arrayList3, aVar17), true, null, false, 12);
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                                        Iterator it10 = arrayList3.iterator();
                                        while (it10.hasNext()) {
                                            arrayList4.add(new oy3.f(null, (String) it10.next()));
                                        }
                                        aVar16.l2(new iz1.p(aVar16, new g(arrayList4), null, 20), new yi5.b(26));
                                    }
                                } else {
                                    if (!(result instanceof l)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    t.J2(aVar16, false, null, null, 7);
                                }
                                return Unit.f186387a;
                            default:
                                i result2 = (i) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                List<j> list3 = result2.f150443a;
                                ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
                                for (j jVar2 : list3) {
                                    arrayList5.add(new oy3.f(jVar2.f150445b, jVar2.f150444a));
                                }
                                g gVar = new g(arrayList5);
                                com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.a aVar18 = aVar15;
                                aVar18.l2(new iz1.p(aVar18, gVar, null, 20), new yi5.b(26));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block18, "block");
                downPaymentSourceDetailsController.H = block18;
                return downPaymentSourceDetailsController;
            case 23:
                final com.revolut.feature.onboarding.impl.onboarding.biometric.d dVar = (com.revolut.feature.onboarding.impl.onboarding.biometric.d) obj4;
                final OnboardingBiometricFlowContract$Step step16 = (OnboardingBiometricFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (step16 instanceof OnboardingBiometricFlowContract$Step.Selfie) {
                    OnboardingSelfieFlow onboardingSelfieFlow = new OnboardingSelfieFlow(new OnboardingSelfieFlowContract$InputData(((OnboardingBiometricFlowContract$Step.Selfie) step16).f78391a));
                    final int i96 = 0;
                    Function1 block19 = new Function1() { // from class: ja9.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i96) {
                                case 0:
                                    tb9.e output = (tb9.e) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    com.revolut.feature.onboarding.impl.onboarding.biometric.d dVar2 = dVar;
                                    dVar2.l2(new com.revolut.feature.onboarding.impl.onboarding.biometric.a(output, dVar2, step16, null), new yi5.b(26));
                                    break;
                                default:
                                    oq.e result = (oq.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.onboarding.impl.onboarding.biometric.d dVar3 = dVar;
                                    dVar3.l2(new com.revolut.feature.onboarding.impl.onboarding.biometric.b(result, dVar3, step16, null), new yi5.b(26));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    onboardingSelfieFlow.H = block19;
                    return onboardingSelfieFlow;
                }
                if (!(step16 instanceof OnboardingBiometricFlowContract$Step.BiometricAuth)) {
                    throw new NoWhenBranchMatchedException();
                }
                bs.a aVar16 = dVar.f78395q;
                OnboardingBiometricFlowContract$Step.BiometricAuth biometricAuth = (OnboardingBiometricFlowContract$Step.BiometricAuth) step16;
                Set set = biometricAuth.f78390b;
                BiometricVerificationFlowProvider$InputData inputData = new BiometricVerificationFlowProvider$InputData(biometricAuth.f78389a, nq.x.ONBOARDING_SELFIE, set.isEmpty() ? null : new sd9.a(set), null, false, 112);
                aVar16.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                BiometricVerificationLauncherFlow biometricVerificationLauncherFlow = new BiometricVerificationLauncherFlow(inputData);
                final int i99 = 1;
                Function1 block20 = new Function1() { // from class: ja9.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i99) {
                            case 0:
                                tb9.e output = (tb9.e) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                com.revolut.feature.onboarding.impl.onboarding.biometric.d dVar2 = dVar;
                                dVar2.l2(new com.revolut.feature.onboarding.impl.onboarding.biometric.a(output, dVar2, step16, null), new yi5.b(26));
                                break;
                            default:
                                oq.e result = (oq.e) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                com.revolut.feature.onboarding.impl.onboarding.biometric.d dVar3 = dVar;
                                dVar3.l2(new com.revolut.feature.onboarding.impl.onboarding.biometric.b(result, dVar3, step16, null), new yi5.b(26));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block20, "block");
                biometricVerificationLauncherFlow.H = block20;
                return biometricVerificationLauncherFlow;
            case 24:
                com.revolut.feature_retail_user_declarations.contact_selection.b bVar8 = (com.revolut.feature_retail_user_declarations.contact_selection.b) obj4;
                ContactSelectionWorkflowContract$Step step17 = (ContactSelectionWorkflowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (!(step17 instanceof ContactSelectionWorkflowContract$Step.Chooser)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE16 = bVar8.e1(new cn3.a(((ContactSelectionWorkflowContract$Step.Chooser) step17).f97530b));
                j4h.m block21 = new j4h.m(bVar8, step17, 22);
                Intrinsics.checkNotNullParameter(block21, "block");
                viewControllerE16.H = block21;
                return viewControllerE16;
            case 25:
                jb3.k location = (jb3.k) obj2;
                List model3 = (List) obj3;
                Intrinsics.checkNotNullParameter(location, "location");
                Intrinsics.checkNotNullParameter(model3, "model");
                ((jb3.j) obj4).f172590c.d(location, model3);
                return Unit.f186387a;
            case 26:
                List applications = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(applications, "applications");
                ((jb5.a) obj4).f172596b.f("credit-onboarding-statuses-tiles-key", applications);
                return Unit.f186387a;
            case 27:
                com.revolut.feature.pix.impl.flow.qr.a aVar17 = (com.revolut.feature.pix.impl.flow.qr.a) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                PixQrCodeFlowContract$Step step18 = (PixQrCodeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step18, "step");
                if (step18 instanceof PixQrCodeFlowContract$Step.OpenQrScanner) {
                    ViewController viewControllerE17 = aVar17.e1(new g12.k(new QrScannerInputData(), aVar17.o));
                    j4h.m block22 = new j4h.m(aVar17, FlowCoordinator2, 23);
                    Intrinsics.checkNotNullParameter(block22, "block");
                    viewControllerE17.H = block22;
                    return viewControllerE17;
                }
                if (step18 instanceof PixQrCodeFlowContract$Step.QrTransaction) {
                    PixQrCodeFlowContract$Step.QrTransaction qrTransaction = (PixQrCodeFlowContract$Step.QrTransaction) step18;
                    pixTransferFlow = new PixQrCodeTransactionFlow(new kba.c(qrTransaction.f80681a, qrTransaction.f80682b));
                } else {
                    if (!(step18 instanceof PixQrCodeFlowContract$Step.Transfer)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pixTransferFlow = new PixTransferFlow(new PixTransferNavigation$InputData.ApmTransfer(((PixQrCodeFlowContract$Step.Transfer) step18).f80683a, (hrf.f) null, 6));
                }
                return pixTransferFlow;
            case 28:
                com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b bVar9 = (com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b) obj4;
                IllionBankStatementFlowContract$InputData illionBankStatementFlowContract$InputData = bVar9.f67793p;
                IllionBankStatementFlowContract$Step step19 = (IllionBankStatementFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step19, "step");
                if (!(step19 instanceof IllionBankStatementFlowContract$Step.Intro)) {
                    if (!(step19 instanceof IllionBankStatementFlowContract$Step.Modal.LearnMore)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllionInfoPopup config = ((IllionBankStatementFlowContract$Step.Modal.LearnMore) step19).f67792a;
                    AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                    CreditApplicationCommonContext creditApplicationCommonContextN = t1.N(illionBankStatementFlowContract$InputData.f67790a);
                    companion.getClass();
                    w0 w0VarA = AnalyticsContext.Companion.a(creditApplicationCommonContextN);
                    Intrinsics.checkNotNullParameter(config, "config");
                    lw0.a aVar18 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_illion_bank_statements_intro_info_popup_title, zhm.u.c(config.f66457b), null, 12), new HtmlLocalisedClause(com.revolut.feature.credit.core.R$string.credit_illion_bank_statements_intro_info_popup_description, zhm.u.c(config.f66458c), (Integer) null, (Object) null, 28), null, null, false, 28);
                    String str6 = config.d;
                    aw0.e eVar3 = str6 != null ? new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_illion_bank_statements_intro_info_popup_button_title, zhm.u.c(str6), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55) : null;
                    k9 k9Var3 = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar18, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), new AnalyticsContext(w0VarA), null, 16));
                }
                IllionIntroConfig illionIntroConfig = ((IllionBankStatementFlowContract$Step.Intro) step19).f67791a;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_illion_bank_statements_intro_title, zhm.u.c(illionIntroConfig.f66459a.f66461a), null, 12);
                int i100 = com.revolut.feature.credit.core.R$string.credit_illion_bank_statements_intro_description;
                IllionIntroScreenContent illionIntroScreenContent = illionIntroConfig.f66459a;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i100, zhm.u.c(illionIntroScreenContent.f66462b), null, 12);
                CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D243", null, null, null, 30);
                PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_illion_bank_statements_intro_button_title, zhm.u.c(illionIntroScreenContent.f66463c), null, 12), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "PROMPT_BUTTON_TAG_PRIMARY", 30);
                String str7 = illionIntroScreenContent.e;
                PromptMarketingContentDelegate.Model.Button button2 = str7 != null ? new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_illion_bank_statements_intro_button_secondary_title, zhm.u.c(str7), null, 12), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.o, false, "PROMPT_BUTTON_TAG_SECONDARY", 22) : null;
                ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                IllionInfoPopup illionInfoPopup = illionIntroScreenContent.f66464g;
                PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(ug4.a.a(textLocalisedClause2, textLocalisedClause3, cdnImageC, illionBankStatementFlowContract$InputData.f67790a, resourceImage2, null, button, button2, illionInfoPopup != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_illion_bank_statements_intro_info_popup_label, zhm.u.c(illionInfoPopup.f66456a), null, 12) : null, 3296));
                j4h.m block23 = new j4h.m(bVar9, illionIntroConfig, 24);
                Intrinsics.checkNotNullParameter(block23, "block");
                promptMarketingScreen2.H = block23;
                return promptMarketingScreen2;
            default:
                RecurringDonationAmountScreen recurringDonationAmountScreen = (RecurringDonationAmountScreen) obj4;
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field4 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr3 = RecurringDonationAmountScreen.f72100e0;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field4, "field");
                MaskedTextInputEditText editText = field4.getEditText();
                Object obj6 = data.f51981p;
                Intrinsics.i(obj6, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(editText, (xi0.b) obj6, (u80.d) recurringDonationAmountScreen.Z.getValue(), null, new jc6.f(recurringDonationAmountScreen), false, false, 0, false, null, 1928);
        }
    }

    public /* synthetic */ n(Object obj2, int i) {
        this.f170818a = i;
        this.f170819b = obj2;
    }
}
