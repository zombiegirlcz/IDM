package p5f;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.CardSecurityFlowContract$Step;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.screen.CardSecurityPromptController;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.screen.CardSecurityPromptScreenContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.iris.impl.ui.settings.IrisSettingsScreenContract$ModalStep;
import com.revolut.feature.apm.iris.impl.ui.settings.deregister.DeregisterDialogContract$InputData;
import com.revolut.feature.apm.iris.impl.ui.settings.deregister.DeregisterDialogController;
import com.revolut.feature.apm.qvik.impl.ui.home.QvikHomeFlowContract$Step;
import com.revolut.feature.apm.qvik.impl.ui.home.area.QvikHomeAreaScreen;
import com.revolut.feature.apm.swish.impl.ui.home.area.SwishHomeAreaScreenContract$ModalStep;
import com.revolut.feature.apm.swish.impl.ui.home.transaction_limit.SwishTransactionLimitScreen;
import com.revolut.feature.apm.swish.impl.ui.home.transaction_limit.SwishTransactionLimitScreenContract$InputData;
import com.revolut.feature.atm.impl.ui.redesign.limits_exception.AtmLimitsExceptionFlowContract$Step;
import com.revolut.feature.atm.impl.ui.redesign.limits_exception.screen.AtmLimitsExceptionController;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.check_email.CheckEmailInboxScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.check_email.CheckEmailInboxScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.enter_email.VerifyEmailScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.loading.LoadingItems;
import com.revolut.feature.credit.application.plugins.impl.ui.loading.LoadingScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.loading.LoadingScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.UploadDocumentsScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.password_input.PasswordInputScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.password_input.PasswordInputScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.picker.PickerBottomSheetController;
import com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreen;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OutboundPaymentExtras;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.breakdown.PaymentBreakdownBottomSheet;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.flow.LotteryDrawFlowContract$Step;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.result.LotteryResultController;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.result.LotteryResultControllerContract$InputData;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.share.LotteryShareController;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.share.LotteryShareControllerContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.gender.JuniorGenderUpdateScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.JuniorIsaAddPhoneNumberScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.JuniorIsaAddPhoneNumberScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.JuniorIsaDetailsScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.JuniorIsaDetailsScreenContract$ModalStep;
import com.revolut.feature.junior.isa.impl.ui.jisa_national_number.JuniorIsaNationalNumberScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_national_number.JuniorIsaNationalNumberScreenContract$InputData;
import com.revolut.feature.onboarding.countries.restriction.api.disclaimer.CountryOfResidenceRevolutXDisclaimerFactory$InputData;
import com.revolut.feature.onboarding.countries.restriction.impl.disclaimer.CountryOfResidenceRevolutXDisclaimerScreen;
import com.revolut.feature.onboarding.countries.restriction.impl.disclaimer.CountryOfResidenceRevolutXDisclaimerScreenContract$CountryResidenceDisclaimerInput;
import com.revolut.feature.onboarding.impl.onboarding.country.flow.CountryOfResidenceFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.country.flow.CountryOfResidenceFlowContract$Step;
import com.revolut.feature.onboarding.impl.onboarding.country.screen.CountryResidenceScreen;
import com.revolut.feature.onboarding.impl.onboarding.country.screen.CountryResidenceScreenContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.IndiaAppRedirectionFlowController;
import com.revolut.feature.onboarding.impl.onboarding.product_lifecycle.OnboardingProductLifecycleFlowContract$Step;
import com.revolut.feature.onboarding.models.OnboardingCompany;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.feature.payments_migration.impl.ui.screen.no_cards.NoCardsController;
import com.revolut.feature.payments_migration.impl.ui.screen.payment_selection.PaymentSelectionContract$InputData;
import com.revolut.feature.payments_migration.impl.ui.screen.payment_selection.PaymentSelectionController;
import com.revolut.feature.payments_migration.impl.ui.screen.search.SearchInBlockControllerContract$ModalStep;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsTerminationFlowContract$Step;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$InputData;
import com.revolut.feature.retail.salary_account.impl.salary_hub.reward_bottom_sheet.SalaryRewardBottomSheetController;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3ControllerContract$ModalStep;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3ControllerContract$RewardInfo;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.shared.branding.api.destination.BrandingSharedDestination;
import com.revolut.feature.shared.branding.impl.ui.BrandingSettingsFlowContract$Step;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.TransferInFlow;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.TransferInvestmentsFlowContract$Step;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.screens.new_transfer_account_selector.NewTransferAccountSelectorScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.screens.new_transfer_type.NewTransferInvestmentsTypeScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.TransferOutFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.a;
import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreenContract$ModalStep;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$InputData;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$Start;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.screens.device_picker.EsimDevicePickerControllerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.device_picker.EsimDevicePickerControllerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.EsimRefundScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.EsimRefundScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.a;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a;
import com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesFlowUseCase;
import com.revolut.retail.feature.pod_nominees.impl.details.PodNomineeDetailsScreen;
import com.revolut.retail.feature.pod_nominees.impl.details.PodNomineeDetailsScreenContract$InputData;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreen;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreenContract$InputData;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreenContract$LaunchType;
import com.revolut.retail.feature.pod_nominees.impl.flow.PodNomineesFlowContract$InputData;
import com.revolut.retail.feature.pod_nominees.impl.flow.PodNomineesFlowContract$Step;
import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_list.PodNomineesListScreen;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_list.PodNomineesListScreenContract$InputData;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_percentage.PodNomineesPercentageScreen;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_percentage.PodNomineesPercentageScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.sso.api.phone.change.RevolutSsoChangePhoneFlowDestination;
import dej.c4;
import grl.k9;
import hha.e0;
import hha.w0;
import iel.i;
import j2c.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k50.b2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import om4.l0;
import ot1.p;
import oxd.m;
import p5e.h;
import pa9.g;
import pb2.z;
import pb9.k;
import pd4.n;
import pfk.g0;
import pig.j;
import pig.s;
import pij.i0;
import vkm.j2;
import yki.l;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f233116b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f233115a = i;
        this.f233116b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        TravelMilesTransferBreakdownScreenContract$InputData points;
        com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar = (com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) this.f233116b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        TravelMilesTransferScreenContract$ModalStep step = (TravelMilesTransferScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof TravelMilesTransferScreenContract$ModalStep.BreakdownBottomSheet)) {
            throw new NoWhenBranchMatchedException();
        }
        y yVar = aVar.z;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        int i = s.f236495a[((j) j2Var.getValue()).k.ordinal()];
        if (i == 1 || i == 2) {
            RevPoints revPoints = ((j) j2Var2.getValue()).f;
            Object content = ((j) j2Var2.getValue()).e.getContent();
            if (content == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            points = new TravelMilesTransferBreakdownScreenContract$InputData.Points(revPoints, (TravelMilesRate) content, aVar.K2());
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            double d = ((j) j2Var2.getValue()).f236485h;
            Object content2 = ((j) j2Var2.getValue()).e.getContent();
            if (content2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            points = new TravelMilesTransferBreakdownScreenContract$InputData.Miles(d, (TravelMilesRate) content2, aVar.K2());
        }
        return new TravelMilesTransferBreakdownScreen(points);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    private final Object b(Object obj2, Object obj3) {
        com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) this.f233116b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        EsimSubscriptionsScreenContract$ModalStep step = (EsimSubscriptionsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof EsimSubscriptionsScreenContract$ModalStep.ViewSelection) {
            EsimSubscriptionsScreenContract$ModalStep.ViewSelection viewSelection = (EsimSubscriptionsScreenContract$ModalStep.ViewSelection) step;
            EsimDevicePickerControllerScreen esimDevicePickerControllerScreen = new EsimDevicePickerControllerScreen(new EsimDevicePickerControllerScreenContract$InputData(viewSelection.f101041c, viewSelection.f101039a, viewSelection.f101040b));
            i0 block = new i0(bVar, 5);
            Intrinsics.checkNotNullParameter(block, "block");
            esimDevicePickerControllerScreen.H = block;
            return esimDevicePickerControllerScreen;
        }
        if (step instanceof EsimSubscriptionsScreenContract$ModalStep.EsimInstallation) {
            EsimSubscriptionsScreenContract$ModalStep.EsimInstallation esimInstallation = (EsimSubscriptionsScreenContract$ModalStep.EsimInstallation) step;
            ViewController viewControllerE1 = bVar.e1(new fej.c(new EsimInstallationFlowDescriptor$InputData(esimInstallation.f101036a, EsimInstallationFlowDescriptor$Start.DirectInstallation, esimInstallation.f101037b)));
            i0 block2 = new i0(bVar, 3);
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerE1.H = block2;
            return viewControllerE1;
        }
        if (!(step instanceof EsimSubscriptionsScreenContract$ModalStep.SubscriptionActivationConfirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        bVar.I.getClass();
        ActionsBottomSheetController actionsBottomSheetControllerA = bjj.a.a();
        h block3 = new h(bVar, step, 28);
        Intrinsics.checkNotNullParameter(block3, "block");
        actionsBottomSheetControllerA.H = block3;
        return actionsBottomSheetControllerA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v49 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Object juniorIsaAddPhoneNumberScreen;
        PromptMarketingScreen promptMarketingScreen;
        Object next;
        Object textLocalisedClause;
        ?? r102;
        ?? r112;
        boolean zU;
        boolean zU2;
        SalaryRewardBottomSheetController salaryRewardBottomSheetControllerB;
        ?? r72;
        List listB;
        int i = this.f233115a;
        final int i2 = 3;
        int i3 = 7;
        char c2 = 1;
        char c3 = 1;
        char c5 = 1;
        char c6 = 1;
        char c7 = 1;
        char c16 = 1;
        char c26 = 1;
        char c28 = 1;
        char c29 = 1;
        Object obj4 = this.f233116b;
        switch (i) {
            case 0:
                f params = (f) obj2;
                List investorUpdates = (List) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(investorUpdates, "investorUpdates");
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(investorUpdates, "investorUpdates");
                ((e) obj4).f233120c.f(ebm.a.C(params), investorUpdates);
                return Unit.f186387a;
            case 1:
                com.revolut.feature.apm.iris.impl.ui.settings.a aVar = (com.revolut.feature.apm.iris.impl.ui.settings.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                IrisSettingsScreenContract$ModalStep step = (IrisSettingsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof IrisSettingsScreenContract$ModalStep.DeregisterAlias)) {
                    throw new NoWhenBranchMatchedException();
                }
                DeregisterDialogController deregisterDialogController = new DeregisterDialogController(new DeregisterDialogContract$InputData(((IrisSettingsScreenContract$ModalStep.DeregisterAlias) step).f62532a));
                p62.j block = new p62.j(aVar, c2 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(block, "block");
                deregisterDialogController.H = block;
                return deregisterDialogController;
            case 2:
                com.revolut.feature.payments_migration.impl.ui.screen.search.b bVar = (com.revolut.feature.payments_migration.impl.ui.screen.search.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SearchInBlockControllerContract$ModalStep step2 = (SearchInBlockControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof SearchInBlockControllerContract$ModalStep.NoCards) {
                    NoCardsController noCardsController = new NoCardsController();
                    m block2 = new m(bVar, 23);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    noCardsController.H = block2;
                    return noCardsController;
                }
                if (!(step2 instanceof SearchInBlockControllerContract$ModalStep.PaymentSelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                Provider provider = ((SearchInBlockControllerContract$ModalStep.PaymentSelection) step2).f80288a;
                PaymentSelectionController paymentSelectionController = new PaymentSelectionController(new PaymentSelectionContract$InputData(provider == null));
                h block3 = new h(bVar, provider, i2);
                Intrinsics.checkNotNullParameter(block3, "block");
                paymentSelectionController.H = block3;
                return paymentSelectionController;
            case 3:
                p6b.b bVar2 = (p6b.b) obj4;
                l FlowCoordinator = (l) obj2;
                CobrandedCardsTerminationFlowContract$Step step3 = (CobrandedCardsTerminationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!Intrinsics.f(step3, CobrandedCardsTerminationFlowContract$Step.ValueReminder.f82507a)) {
                    throw new NoWhenBranchMatchedException();
                }
                CobrandedCardsValueReminderScreen cobrandedCardsValueReminderScreen = new CobrandedCardsValueReminderScreen(new CobrandedCardsValueReminderScreenContract$InputData.Terminate(bVar2.o.f82506a));
                m block4 = new m(bVar2, 24);
                Intrinsics.checkNotNullParameter(block4, "block");
                cobrandedCardsValueReminderScreen.H = block4;
                return cobrandedCardsValueReminderScreen;
            case 4:
                com.revolut.feature.shared.branding.impl.ui.a aVar2 = (com.revolut.feature.shared.branding.impl.ui.a) obj4;
                l FlowCoordinator2 = (l) obj2;
                BrandingSettingsFlowContract$Step step4 = (BrandingSettingsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!Intrinsics.f(step4, BrandingSettingsFlowContract$Step.Branding.f86070a)) {
                    throw new NoWhenBranchMatchedException();
                }
                BrandingSettingsScreen brandingSettingsScreen = new BrandingSettingsScreen(new BrandingSharedDestination.InputData(aVar2.o.f86069a));
                m block5 = new m(aVar2, 25);
                Intrinsics.checkNotNullParameter(block5, "block");
                brandingSettingsScreen.H = block5;
                return brandingSettingsScreen;
            case 5:
                final com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c cVar = (com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c) obj4;
                EmailVerificationFlowContract$InputData emailVerificationFlowContract$InputData = cVar.f67630p;
                l FlowCoordinator3 = (l) obj2;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter((EmailVerificationFlowContract$Step) obj3, "<unused var>");
                EmailVerificationFlowContract$Step emailVerificationFlowContract$Step = (EmailVerificationFlowContract$Step) FlowCoordinator3.d();
                if (emailVerificationFlowContract$Step instanceof EmailVerificationFlowContract$Step.VerifyEmail) {
                    VerifyEmailScreen verifyEmailScreen = new VerifyEmailScreen();
                    verifyEmailScreen.j2(new os2.a(cVar, 20));
                    final char c33 = c3 == true ? 1 : 0;
                    Function1 block6 = new Function1() { // from class: pa4.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (c33) {
                                case 0:
                                    qa4.f output = (qa4.f) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!Intrinsics.f(output, qa4.f.f243953a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar.B2();
                                    return Unit.f186387a;
                                default:
                                    ta4.h output2 = (ta4.h) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z = output2 instanceof ta4.g;
                                    com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c cVar2 = cVar;
                                    if (z) {
                                        cVar2.l2(new osk.m(cVar2, ((ta4.g) output2).f269092a, null, 25), new yi5.b(26));
                                    } else {
                                        if (!(output2 instanceof ta4.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar2.l2(new d(cVar2, null, 0), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    verifyEmailScreen.H = block6;
                    return verifyEmailScreen;
                }
                if (!(emailVerificationFlowContract$Step instanceof EmailVerificationFlowContract$Step.CheckEmailInbox)) {
                    if (emailVerificationFlowContract$Step instanceof EmailVerificationFlowContract$Step.Initial) {
                        return new LoadingScreen(new LoadingScreenContract$InputData(false, (LoadingItems) null, 7));
                    }
                    if (emailVerificationFlowContract$Step instanceof EmailVerificationFlowContract$Step.VerifyInProgress) {
                        return new SpinnerScreen(new SpinnerScreenContract$InputData(new SpinnerConfiguration.FullScreen(new SpinnerConfiguration.Content.Static(new SpinnerConfiguration.Content.SpinnerContent(new TextLocalisedClause(R$string.email_verification_status_verifying_title, null, null, 14), new TextLocalisedClause(R$string.email_verification_status_verifying_subtitle, null, null, 14))), SpinnerConfiguration.Mode.Infinite.f66380a), emailVerificationFlowContract$InputData.f67623b));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                CheckEmailInboxScreen checkEmailInboxScreen = new CheckEmailInboxScreen(new CheckEmailInboxScreenContract$InputData(emailVerificationFlowContract$InputData.f67623b, cVar.z.f67624a, ((EmailVerificationFlowContract$Step.CheckEmailInbox) emailVerificationFlowContract$Step).f67625a));
                final int i5 = 0;
                Function1 block7 = new Function1() { // from class: pa4.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i5) {
                            case 0:
                                qa4.f output = (qa4.f) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (!Intrinsics.f(output, qa4.f.f243953a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.B2();
                                return Unit.f186387a;
                            default:
                                ta4.h output2 = (ta4.h) obj5;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                boolean z = output2 instanceof ta4.g;
                                com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c cVar2 = cVar;
                                if (z) {
                                    cVar2.l2(new osk.m(cVar2, ((ta4.g) output2).f269092a, null, 25), new yi5.b(26));
                                } else {
                                    if (!(output2 instanceof ta4.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar2.l2(new d(cVar2, null, 0), new yi5.b(26));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block7, "block");
                checkEmailInboxScreen.H = block7;
                return checkEmailInboxScreen;
            case 6:
                final com.revolut.feature.junior.isa.impl.ui.jisa_details.a aVar3 = (com.revolut.feature.junior.isa.impl.ui.jisa_details.a) obj4;
                JuniorIsaDetailsScreenContract$InputData juniorIsaDetailsScreenContract$InputData = aVar3.o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                JuniorIsaDetailsScreenContract$ModalStep step5 = (JuniorIsaDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof JuniorIsaDetailsScreenContract$ModalStep.UpdateAddress) {
                    ViewController viewControllerE1 = aVar3.e1(new th1.a(new AddressFlowContract$InputData(((JuniorIsaDetailsScreenContract$ModalStep.UpdateAddress) step5).f76788a, new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_home_address_header_title, null, null, 14), null, false, new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_home_address_action_done, null, null, 14), FieldMode.Hidden.f60954a, qh1.b.CLOSE, null, false, null, 2094908), null, null, 6));
                    final int i6 = 0;
                    Function1 block8 = new Function1() { // from class: pa8.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    AddressFlowContract$OutputData output = (AddressFlowContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    String str = output.d;
                                    if (str == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    Address address = output.f60940a;
                                    com.revolut.feature.junior.isa.impl.ui.jisa_details.a aVar4 = aVar3;
                                    aVar4.l2(new oqk.i(aVar4, str, address, null, 13), new yi5.b(26));
                                    return Unit.f186387a;
                                default:
                                    ja8.e output2 = (ja8.e) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bj0.b bVar3 = output2.f172461a;
                                    com.revolut.feature.junior.isa.impl.ui.jisa_details.a aVar5 = aVar3;
                                    aVar5.l2(new osk.m(aVar5, bVar3, null, 26), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    viewControllerE1.H = block8;
                    return viewControllerE1;
                }
                if (step5 instanceof JuniorIsaDetailsScreenContract$ModalStep.UpdateGender) {
                    JuniorGenderUpdateScreen juniorGenderUpdateScreen = new JuniorGenderUpdateScreen(new ja8.d(((JuniorIsaDetailsScreenContract$ModalStep.UpdateGender) step5).f76789a));
                    final char c39 = c5 == true ? 1 : 0;
                    Function1 block9 = new Function1() { // from class: pa8.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (c39) {
                                case 0:
                                    AddressFlowContract$OutputData output = (AddressFlowContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    String str = output.d;
                                    if (str == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    Address address = output.f60940a;
                                    com.revolut.feature.junior.isa.impl.ui.jisa_details.a aVar4 = aVar3;
                                    aVar4.l2(new oqk.i(aVar4, str, address, null, 13), new yi5.b(26));
                                    return Unit.f186387a;
                                default:
                                    ja8.e output2 = (ja8.e) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bj0.b bVar3 = output2.f172461a;
                                    com.revolut.feature.junior.isa.impl.ui.jisa_details.a aVar5 = aVar3;
                                    aVar5.l2(new osk.m(aVar5, bVar3, null, 26), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block9, "block");
                    juniorGenderUpdateScreen.H = block9;
                    return juniorGenderUpdateScreen;
                }
                if (step5 instanceof JuniorIsaDetailsScreenContract$ModalStep.UpdateNationalNumber) {
                    String value = juniorIsaDetailsScreenContract$InputData.f76787a;
                    Intrinsics.checkNotNullParameter(value, "value");
                    juniorIsaAddPhoneNumberScreen = new JuniorIsaNationalNumberScreen(new JuniorIsaNationalNumberScreenContract$InputData(value, ((JuniorIsaDetailsScreenContract$ModalStep.UpdateNationalNumber) step5).f76790a, null, s98.a.PROFILE_EDIT));
                } else {
                    if (!(step5 instanceof JuniorIsaDetailsScreenContract$ModalStep.UpdatePhone)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String value2 = juniorIsaDetailsScreenContract$InputData.f76787a;
                    Intrinsics.checkNotNullParameter(value2, "value");
                    JuniorIsaDetailsScreenContract$ModalStep.UpdatePhone updatePhone = (JuniorIsaDetailsScreenContract$ModalStep.UpdatePhone) step5;
                    juniorIsaAddPhoneNumberScreen = new JuniorIsaAddPhoneNumberScreen(new JuniorIsaAddPhoneNumberScreenContract$InputData(value2, updatePhone.f76792b, updatePhone.f76791a, updatePhone.f76793c));
                }
                return juniorIsaAddPhoneNumberScreen;
            case 7:
                com.revolut.feature.onboarding.impl.onboarding.country.flow.c cVar2 = (com.revolut.feature.onboarding.impl.onboarding.country.flow.c) obj4;
                jt0.b bVar3 = cVar2.f78420q;
                CountryOfResidenceFlowContract$Step step6 = (CountryOfResidenceFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof CountryOfResidenceFlowContract$Step.Country) {
                    List list = ((CountryOfResidenceFlowContract$Step.Country) step6).f78404a;
                    CountryOfResidenceFlowContract$InputData countryOfResidenceFlowContract$InputData = cVar2.o;
                    CountryResidenceScreen countryResidenceScreen = new CountryResidenceScreen(new CountryResidenceScreenContract$InputData(countryOfResidenceFlowContract$InputData.f78401a, countryOfResidenceFlowContract$InputData.f78402b, list, countryOfResidenceFlowContract$InputData.f78403c));
                    h block10 = new h(cVar2, list, 6);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    countryResidenceScreen.H = block10;
                    return countryResidenceScreen;
                }
                if (step6 instanceof CountryOfResidenceFlowContract$Step.JuniorGraduationCountryChange) {
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_registration_country_change_prompt_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_registration_country_change_prompt_description, null, null, 14);
                    CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D263", null, null, null, 30);
                    ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.uicomponent.R$string.common_action_continue, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
                    PromptMarketingContentDelegate.Model.Button button2 = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_registration_country_change_prompt_button_secondary, null, null, 14), (ResourceImage) (0 == true ? 1 : 0), (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
                    k9 k9Var = k9.Junior;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause2, textLocalisedClause3, cdnImageC, null, null, resourceImage, null, button, button2, null, null, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 61016));
                    h block11 = new h(cVar2, (CountryOfResidenceFlowContract$Step.JuniorGraduationCountryChange) step6, 5);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    promptMarketingScreen2.H = block11;
                    return promptMarketingScreen2;
                }
                int i21 = 22;
                if (!(step6 instanceof CountryOfResidenceFlowContract$Step.Disclaimer)) {
                    if (Intrinsics.f(step6, CountryOfResidenceFlowContract$Step.NavigateToRetailApp.f78412a)) {
                        m onNavigationResult = new m(cVar2, 28);
                        bVar3.getClass();
                        Intrinsics.checkNotNullParameter(onNavigationResult, "onNavigationResult");
                        promptMarketingScreen = new PromptMarketingScreen(l99.a.a(new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.onboarding_revolut_x_continue_in_retail_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.onboarding_revolut_x_continue_in_retail_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.onboarding_revolut_x_continue_in_retail_action, null, null, 14), "NAVIGATE_TO_RETAIL_APP"));
                        khg.s block12 = new khg.s(bVar3, 23, promptMarketingScreen, onNavigationResult);
                        Intrinsics.checkNotNullParameter(block12, "block");
                        promptMarketingScreen.H = block12;
                    } else {
                        if (!Intrinsics.f(step6, CountryOfResidenceFlowContract$Step.OnboardingNotAvailableForCountry.f78413a)) {
                            if (Intrinsics.f(step6, CountryOfResidenceFlowContract$Step.IndiaAppRedirection.f78408a)) {
                                return new IndiaAppRedirectionFlowController();
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        g onLogoutResult = new g(cVar2, 0);
                        bVar3.getClass();
                        Intrinsics.checkNotNullParameter(onLogoutResult, "onLogoutResult");
                        promptMarketingScreen = new PromptMarketingScreen(l99.a.a(new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.onboarding_revolut_x_country_unsupported_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.onboarding_revolut_x_country_unsupported_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.onboarding_revolut_x_country_unsupported_action, null, null, 14), "NOT_AVAILABLE_FOR_COUNTRY"));
                        khg.s block13 = new khg.s(bVar3, i21, promptMarketingScreen, onLogoutResult);
                        Intrinsics.checkNotNullParameter(block13, "block");
                        promptMarketingScreen.H = block13;
                    }
                    return promptMarketingScreen;
                }
                CountryOfResidenceFlowContract$Step.Disclaimer disclaimer = (CountryOfResidenceFlowContract$Step.Disclaimer) step6;
                r39.a aVar4 = cVar2.f78421r;
                wi0.b bVar4 = disclaimer.f78405a;
                List list2 = disclaimer.f78407c;
                CountryOfResidenceRevolutXDisclaimerFactory$InputData inputData = new CountryOfResidenceRevolutXDisclaimerFactory$InputData(list2, bVar4);
                p onContinue = new p(cVar2, disclaimer, i21);
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(onContinue, "onContinue");
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Iterator it8 = list2.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        OnboardingCompany onboardingCompany = (OnboardingCompany) next;
                        if (!onboardingCompany.d.contains(bVar4) || !Intrinsics.f(onboardingCompany.f78600c, "BANKING")) {
                        }
                    } else {
                        next = null;
                    }
                }
                OnboardingCompany onboardingCompany2 = (OnboardingCompany) next;
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.onboarding_revolut_x_disclaimer_title, null, null, 14);
                if (onboardingCompany2 != null) {
                    textLocalisedClause = new TextClause(onboardingCompany2.f78599b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    r102 = 0;
                } else {
                    r102 = 0;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.onboarding_revolut_x_disclaimer_revolut_bank_uab, null, null, 14);
                }
                List listK = v.k(textLocalisedClause, new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.onboarding_revolut_x_disclaimer_eea_insurance_scheme, r102, r102, 14));
                wi0.b.Companion.getClass();
                if (((Set) wi0.b.H3.getValue()).contains(bVar4)) {
                    r112 = 0;
                } else if (com.bumptech.glide.d.q(bVar4)) {
                    r112 = 0;
                    listK = v.k(textLocalisedClause, new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.onboarding_revolut_x_disclaimer_uk_insurance_scheme, null, null, 14));
                } else {
                    r112 = 0;
                    r6.b.D("Only EEA and GB onboarding should be supported");
                }
                CountryOfResidenceRevolutXDisclaimerScreen countryOfResidenceRevolutXDisclaimerScreen = new CountryOfResidenceRevolutXDisclaimerScreen(new CountryOfResidenceRevolutXDisclaimerScreenContract$CountryResidenceDisclaimerInput(textLocalisedClause4, new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.onboarding_revolut_x_disclaimer_content_v3, listK, r112, 12), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.onboarding_revolut_x_disclaimer_action, r112, r112, 14), com.bumptech.glide.d.q(bVar4) ? new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.onboarding_revolut_x_disclaimer_uk_button_disclaimer, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10) : null));
                o block14 = new o(aVar4, 26, countryOfResidenceRevolutXDisclaimerScreen, onContinue);
                Intrinsics.checkNotNullParameter(block14, "block");
                countryOfResidenceRevolutXDisclaimerScreen.H = block14;
                return countryOfResidenceRevolutXDisclaimerScreen;
            case 8:
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.d dVar = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.d) obj4;
                l FlowCoordinator4 = (l) obj2;
                TransferInvestmentsFlowContract$Step step7 = (TransferInvestmentsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof TransferInvestmentsFlowContract$Step.NewTransferAccountSelector) {
                    NewTransferAccountSelectorScreen newTransferAccountSelectorScreen = new NewTransferAccountSelectorScreen();
                    paf.d block15 = new paf.d(dVar, c6 == true ? 1 : 0);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    newTransferAccountSelectorScreen.H = block15;
                    return newTransferAccountSelectorScreen;
                }
                if (step7 instanceof TransferInvestmentsFlowContract$Step.NewTransferInvestmentsTypeSelection) {
                    TransferInvestmentsFlowContract$Step.NewTransferInvestmentsTypeSelection newTransferInvestmentsTypeSelection = (TransferInvestmentsFlowContract$Step.NewTransferInvestmentsTypeSelection) step7;
                    NewTransferInvestmentsTypeScreen newTransferInvestmentsTypeScreen = new NewTransferInvestmentsTypeScreen(new taf.g(newTransferInvestmentsTypeSelection.f91615a));
                    h block16 = new h(dVar, newTransferInvestmentsTypeSelection, i3);
                    Intrinsics.checkNotNullParameter(block16, "block");
                    newTransferInvestmentsTypeScreen.H = block16;
                    return newTransferInvestmentsTypeScreen;
                }
                if (step7 instanceof TransferInvestmentsFlowContract$Step.NewIsaTransferOut) {
                    return dVar.J2(com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfers_out_isa_title, com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfers_out_isa_description);
                }
                if (step7 instanceof TransferInvestmentsFlowContract$Step.NewCustodianJisaTransferOut) {
                    return dVar.J2(com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfers_out_jisa_title, com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfers_out_jisa_description);
                }
                if (step7 instanceof TransferInvestmentsFlowContract$Step.NewPersonalJisaTransferOut) {
                    return dVar.J2(com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfers_out_personal_jisa_title, com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfers_out_personal_jisa_description);
                }
                if (!(step7 instanceof TransferInvestmentsFlowContract$Step.ProductArticle)) {
                    if (step7 instanceof TransferInvestmentsFlowContract$Step.TransferInFlow) {
                        return new TransferInFlow(new z9f.c(((TransferInvestmentsFlowContract$Step.TransferInFlow) step7).f91618a));
                    }
                    if (step7 instanceof TransferInvestmentsFlowContract$Step.TransferOutFlow) {
                        return new TransferOutFlow(new zaf.c(((TransferInvestmentsFlowContract$Step.TransferOutFlow) step7).f91619a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                TransferInvestmentsFlowContract$Step.ProductArticle productArticle = (TransferInvestmentsFlowContract$Step.ProductArticle) step7;
                ViewController viewControllerE12 = dVar.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(productArticle.f91617b)), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, null, null, false, 60));
                h block17 = new h(dVar, productArticle, 8);
                Intrinsics.checkNotNullParameter(block17, "block");
                viewControllerE12.H = block17;
                return viewControllerE12;
            case 9:
                Function1 defaultErrorMapper = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorMapper, "defaultErrorMapper");
                return new pb2.p((List) defaultErrorMapper.invoke(new iii.d(14, null, false, false, null)), pb2.c.b(((z) obj4).f234624a, null, null, 6));
            case 10:
                k kVar = (k) obj4;
                l FlowCoordinator5 = (l) obj2;
                OnboardingProductLifecycleFlowContract$Step step8 = (OnboardingProductLifecycleFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                k9 k9Var2 = k9.Onboarding;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                ViewController viewControllerE13 = kVar.e1(new kja.a(com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), step8.f78483b, step8.f78482a));
                h block18 = new h(kVar, step8, 9);
                Intrinsics.checkNotNullParameter(block18, "block");
                viewControllerE13.H = block18;
                return viewControllerE13;
            case 11:
                com.revolut.feature.apm.qvik.impl.ui.home.a aVar5 = (com.revolut.feature.apm.qvik.impl.ui.home.a) obj4;
                l FlowCoordinator6 = (l) obj2;
                QvikHomeFlowContract$Step step9 = (QvikHomeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!Intrinsics.f(step9, QvikHomeFlowContract$Step.Area.f62809a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar5.getClass();
                return new QvikHomeAreaScreen();
            case 12:
                com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d dVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                UploadDocumentsScreenContract$ModalStep step10 = (UploadDocumentsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof UploadDocumentsScreenContract$ModalStep.PasswordInput)) {
                    throw new NoWhenBranchMatchedException();
                }
                UploadDocumentsScreenContract$ModalStep.PasswordInput passwordInput = (UploadDocumentsScreenContract$ModalStep.PasswordInput) step10;
                PasswordInputScreen passwordInputScreen = new PasswordInputScreen(new PasswordInputScreenContract$InputData(passwordInput.f67923a, passwordInput.f67924b, passwordInput.f67925c));
                md6.s.G(passwordInputScreen, new b2(2, dVar2, com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 19), new a27.d(c7 == true ? 1 : 0, 9, null), new n(dVar2, c16 == true ? 1 : 0));
                return passwordInputScreen;
            case 13:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.b) obj4).getClass();
                f0 f0Var = f0.f322471a;
                return new pdg.z(f0Var, new pdg.n(f0Var), a.C0570a.f93984a, f0Var);
            case 14:
                final com.revolut.feature.apm.swish.impl.ui.home.area.a aVar6 = (com.revolut.feature.apm.swish.impl.ui.home.area.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SwishHomeAreaScreenContract$ModalStep step11 = (SwishHomeAreaScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof SwishHomeAreaScreenContract$ModalStep.TransactionLimit) {
                    SwishHomeAreaScreenContract$ModalStep.TransactionLimit transactionLimit = (SwishHomeAreaScreenContract$ModalStep.TransactionLimit) step11;
                    SwishTransactionLimitScreen swishTransactionLimitScreen = new SwishTransactionLimitScreen(new SwishTransactionLimitScreenContract$InputData(transactionLimit.f62923a, transactionLimit.f62924b));
                    final int i22 = 0;
                    Function1 block19 = new Function1() { // from class: pe2.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i22) {
                                case 0:
                                    re2.e it9 = (re2.e) obj5;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    dj0.d dVar3 = it9.f253492a;
                                    com.revolut.feature.apm.swish.impl.ui.home.area.a aVar7 = aVar6;
                                    aVar7.H2(aVar7.f62926q, new ar3.a(22, dVar3));
                                    yji.l.a1(aVar7, aVar7.X1(new mii.k("ID_UPDATE_LIMITS_DIALOG", new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_update_limits_success, null, null, 14), null, null, null, 28)), null, null, null, 7);
                                    break;
                                default:
                                    dii.g result = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof dii.e) {
                                        aVar6.C1(new RevolutSsoChangePhoneFlowDestination(0));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    swishTransactionLimitScreen.H = block19;
                    return swishTransactionLimitScreen;
                }
                if (!(step11 instanceof SwishHomeAreaScreenContract$ModalStep.LinkedPhoneNumber)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar6.f62925p.getClass();
                lw0.a aVar7 = new lw0.a(new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_details_linked_phone_number_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_details_linked_phone_number_description, null, null, 14), null, null, false, 28);
                aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_details_linked_phone_number_action_profile, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                k9 k9Var3 = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar7, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                final char c47 = c26 == true ? 1 : 0;
                Function1 block20 = new Function1() { // from class: pe2.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (c47) {
                            case 0:
                                re2.e it9 = (re2.e) obj5;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                dj0.d dVar3 = it9.f253492a;
                                com.revolut.feature.apm.swish.impl.ui.home.area.a aVar72 = aVar6;
                                aVar72.H2(aVar72.f62926q, new ar3.a(22, dVar3));
                                yji.l.a1(aVar72, aVar72.X1(new mii.k("ID_UPDATE_LIMITS_DIALOG", new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_update_limits_success, null, null, 14), null, null, null, 28)), null, null, null, 7);
                                break;
                            default:
                                dii.g result = (dii.g) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof dii.e) {
                                    aVar6.C1(new RevolutSsoChangePhoneFlowDestination(0));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block20, "block");
                actionsBottomSheetController.H = block20;
                return actionsBottomSheetController;
            case 15:
                com.revolut.retail.feature.pod_nominees.impl.flow.b bVar5 = (com.revolut.retail.feature.pod_nominees.impl.flow.b) obj4;
                PodNomineesFlowContract$InputData podNomineesFlowContract$InputData = bVar5.o;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                PodNomineesFlowContract$Step step12 = (PodNomineesFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof PodNomineesFlowContract$Step.PodNomineesList) {
                    PodNomineesListScreen podNomineesListScreen = new PodNomineesListScreen(new PodNomineesListScreenContract$InputData(podNomineesFlowContract$InputData.f102606a, podNomineesFlowContract$InputData.f102607b, ((PodNomineesFlowContract$Step.PodNomineesList) step12).f102612a));
                    l0 block21 = new l0(bVar5, 19, LazyFlowCoordinator, podNomineesListScreen);
                    Intrinsics.checkNotNullParameter(block21, "block");
                    podNomineesListScreen.H = block21;
                    return podNomineesListScreen;
                }
                if (step12 instanceof PodNomineesFlowContract$Step.AddPodNominee) {
                    PodNomineesFlowUseCase podNomineesFlowUseCase = podNomineesFlowContract$InputData.f102606a;
                    if (podNomineesFlowUseCase instanceof PodNomineesFlowUseCase.Onboarding) {
                        zU2 = com.bumptech.glide.d.u(((PodNomineesFlowUseCase.Onboarding) podNomineesFlowUseCase).getF102581b());
                    } else {
                        if (!(podNomineesFlowUseCase instanceof PodNomineesFlowUseCase.Profile)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zU2 = false;
                    }
                    PodNomineeEditScreen podNomineeEditScreen = new PodNomineeEditScreen(new PodNomineeEditScreenContract$InputData(new PodNomineeEditScreenContract$LaunchType.Create(zU2), ((PodNomineesFlowContract$Step.AddPodNominee) step12).f102608a, podNomineesFlowContract$InputData.f102606a instanceof aek.b));
                    pb2.v block22 = new pb2.v(bVar5, 10);
                    Intrinsics.checkNotNullParameter(block22, "block");
                    podNomineeEditScreen.H = block22;
                    return podNomineeEditScreen;
                }
                if (!(step12 instanceof PodNomineesFlowContract$Step.EditPodNominee)) {
                    if (!(step12 instanceof PodNomineesFlowContract$Step.PodNomineeDetails)) {
                        if (Intrinsics.f(step12, PodNomineesFlowContract$Step.EditPercentage.f102609a)) {
                            return new PodNomineesPercentageScreen(new PodNomineesPercentageScreenContract$InputData(podNomineesFlowContract$InputData.f102606a instanceof aek.b));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    PodNomineeDetailsScreen podNomineeDetailsScreen = new PodNomineeDetailsScreen(new PodNomineeDetailsScreenContract$InputData(((PodNomineesFlowContract$Step.PodNomineeDetails) step12).f102611a, podNomineesFlowContract$InputData.f102606a instanceof aek.b));
                    h block23 = new h(bVar5, LazyFlowCoordinator, 13);
                    Intrinsics.checkNotNullParameter(block23, "block");
                    podNomineeDetailsScreen.H = block23;
                    return podNomineeDetailsScreen;
                }
                PodNominee podNominee = ((PodNomineesFlowContract$Step.EditPodNominee) step12).f102610a;
                PodNomineesFlowUseCase podNomineesFlowUseCase2 = podNomineesFlowContract$InputData.f102606a;
                if (podNomineesFlowUseCase2 instanceof PodNomineesFlowUseCase.Onboarding) {
                    zU = com.bumptech.glide.d.u(((PodNomineesFlowUseCase.Onboarding) podNomineesFlowUseCase2).getF102581b());
                } else {
                    if (!(podNomineesFlowUseCase2 instanceof PodNomineesFlowUseCase.Profile)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zU = false;
                }
                PodNomineeEditScreen podNomineeEditScreen2 = new PodNomineeEditScreen(new PodNomineeEditScreenContract$InputData(new PodNomineeEditScreenContract$LaunchType.Edit(podNominee, zU), false, podNomineesFlowContract$InputData.f102606a instanceof aek.b));
                pb2.v block24 = new pb2.v(bVar5, 10);
                Intrinsics.checkNotNullParameter(block24, "block");
                podNomineeEditScreen2.H = block24;
                return podNomineeEditScreen2;
            case 16:
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b bVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                OfferContentScreenContract$ModalStep step13 = (OfferContentScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof OfferContentScreenContract$ModalStep.VariantSelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                PickerBottomSheetController pickerBottomSheetControllerE = ksj.b.e(((OfferContentScreenContract$ModalStep.VariantSelection) step13).f68137a);
                h block25 = new h(bVar6, step13, 15);
                Intrinsics.checkNotNullParameter(block25, "block");
                pickerBottomSheetControllerE.H = block25;
                return pickerBottomSheetControllerE;
            case 17:
                pfk.b params2 = (pfk.b) obj2;
                kha.d domainModel = (kha.d) obj3;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(domainModel, "domainModel");
                ((pfk.e) obj4).f235628b.f(pfk.e.a(params2), domainModel);
                return Unit.f186387a;
            case 18:
                String planId = (String) obj2;
                e0 domain = (e0) obj3;
                Intrinsics.checkNotNullParameter(planId, "planId");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((pfk.e0) obj4).f235632c.f("key_partner_subscriptions_" + planId, domain);
                return Unit.f186387a;
            case 19:
                rha.b configs = (rha.b) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(configs, "configs");
                ((g0) obj4).f235638b.f("pricing_plan_workflow", configs);
                return Unit.f186387a;
            case 20:
                com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.a aVar8 = (com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.a) obj4;
                l FlowCoordinator7 = (l) obj2;
                CardSecurityFlowContract$Step step14 = (CardSecurityFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator7, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (!(step14 instanceof CardSecurityFlowContract$Step.CardSecurityPrompt)) {
                    throw new NoWhenBranchMatchedException();
                }
                CardSecurityFlowContract$Step.CardSecurityPrompt cardSecurityPrompt = (CardSecurityFlowContract$Step.CardSecurityPrompt) step14;
                CardSecurityPromptController cardSecurityPromptController = new CardSecurityPromptController(new CardSecurityPromptScreenContract$InputData(cardSecurityPrompt.f60869a, cardSecurityPrompt.f60870b, cardSecurityPrompt.f60871c));
                baa.c block26 = new baa.c(aVar8, FlowCoordinator7, 17);
                Intrinsics.checkNotNullParameter(block26, "block");
                cardSecurityPromptController.H = block26;
                return cardSecurityPromptController;
            case 21:
                com.revolut.feature.incentive_reward.impl.ui.lottery.draw.flow.a aVar9 = (com.revolut.feature.incentive_reward.impl.ui.lottery.draw.flow.a) obj4;
                l FlowCoordinator8 = (l) obj2;
                LotteryDrawFlowContract$Step step15 = (LotteryDrawFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator8, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (!(step15 instanceof LotteryDrawFlowContract$Step.Result)) {
                    if (!(step15 instanceof LotteryDrawFlowContract$Step.Share)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LotteryDrawFlowContract$Step.Share share = (LotteryDrawFlowContract$Step.Share) step15;
                    return new LotteryShareController(new LotteryShareControllerContract$InputData(share.f74874a, share.f74875b));
                }
                LotteryResultController lotteryResultController = new LotteryResultController(new LotteryResultControllerContract$InputData(aVar9.o.f74872a));
                pb2.v block27 = new pb2.v(aVar9, 15);
                Intrinsics.checkNotNullParameter(block27, "block");
                lotteryResultController.H = block27;
                return lotteryResultController;
            case 22:
                com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a aVar10 = (com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SalaryHubV3ControllerContract$ModalStep step16 = (SalaryHubV3ControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (!(step16 instanceof SalaryHubV3ControllerContract$ModalStep.RewardStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                ngb.f fVar = aVar10.f83009p;
                SalaryHubV3ControllerContract$RewardInfo rewardInfo = ((SalaryHubV3ControllerContract$ModalStep.RewardStep) step16).f82996a;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(rewardInfo, "rewardInfo");
                if (rewardInfo instanceof SalaryHubV3ControllerContract$RewardInfo.RewardSalaryDraw) {
                    SalaryHubV3ControllerContract$RewardInfo.RewardSalaryDraw rewardSalaryDraw = (SalaryHubV3ControllerContract$RewardInfo.RewardSalaryDraw) rewardInfo;
                    dj0.d dVar3 = rewardSalaryDraw.f83003c;
                    SalaryHubV3ControllerContract$RewardInfo.RewardStatus rewardStatus = rewardSalaryDraw.f83002b;
                    MoneyClause moneyClause = new MoneyClause(dVar3, new MoneyClause.Format.Shorts(false, 63), null, null, 12);
                    salaryRewardBottomSheetControllerB = ngb.f.b(fVar, com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_cash_draw_title, u.c(moneyClause), com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_cash_draw_subtitle, u.c(moneyClause), fVar.a(rewardStatus), com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_cash_draw_action, null, 64);
                } else if (rewardInfo instanceof SalaryHubV3ControllerContract$RewardInfo.FreePremium) {
                    SalaryHubV3ControllerContract$RewardInfo.RewardStatus rewardStatus2 = ((SalaryHubV3ControllerContract$RewardInfo.FreePremium) rewardInfo).f82998b;
                    w0 pricingPlanTier = w0.PREMIUM;
                    Intrinsics.checkNotNullParameter(pricingPlanTier, "pricingPlanTier");
                    TextLocalisedClause textLocalisedClauseE = dok.g.e(pricingPlanTier, null);
                    if (textLocalisedClauseE == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    salaryRewardBottomSheetControllerB = ngb.f.b(fVar, com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_free_plan_title, u.c(textLocalisedClauseE), com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_free_plan_subtitle, null, fVar.a(rewardStatus2), com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_free_plan_action, u.c(textLocalisedClauseE), 8);
                } else if (rewardInfo instanceof SalaryHubV3ControllerContract$RewardInfo.SavingsBoost) {
                    salaryRewardBottomSheetControllerB = ngb.f.b(fVar, com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_savings_title, null, com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_savings_subtitle, null, fVar.a(((SalaryHubV3ControllerContract$RewardInfo.SavingsBoost) rewardInfo).f83008b), com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_cash_draw_action, null, 74);
                } else {
                    if (!(rewardInfo instanceof SalaryHubV3ControllerContract$RewardInfo.IncomeInsurance)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    salaryRewardBottomSheetControllerB = ngb.f.b(fVar, com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_insurance_title, null, com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_insurance_subtitle, null, fVar.a(((SalaryHubV3ControllerContract$RewardInfo.IncomeInsurance) rewardInfo).f83000b), com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_insurance_action, null, 74);
                }
                h block28 = new h(aVar10, step16, 18);
                Intrinsics.checkNotNullParameter(block28, "block");
                salaryRewardBottomSheetControllerB.H = block28;
                return salaryRewardBottomSheetControllerB;
            case 23:
                final com.revolut.retail.feature.esim.impl.ui.flows.refund.c cVar3 = (com.revolut.retail.feature.esim.impl.ui.flows.refund.c) obj4;
                EsimRefundFlowContract$InputData esimRefundFlowContract$InputData = cVar3.f100874r;
                EsimRefundFlowContract$Step step17 = (EsimRefundFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (step17 instanceof EsimRefundFlowContract$Step.Refund) {
                    EsimRefundFlowContract$Step.Refund refund = (EsimRefundFlowContract$Step.Refund) step17;
                    EsimRefundScreen esimRefundScreen = new EsimRefundScreen(new EsimRefundScreenContract$InputData(esimRefundFlowContract$InputData.f100868a, refund.f100870a, refund.f100871b));
                    final int i32 = 2;
                    Function1 block29 = new Function1() { // from class: pgj.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i33 = i32;
                            com.revolut.retail.feature.esim.impl.ui.flows.refund.c cVar4 = cVar3;
                            switch (i33) {
                                case 0:
                                    d67.u it9 = (d67.u) obj5;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(cVar4.f100876t);
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a result = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof nnj.m;
                                    com.revolut.retail.feature.esim.impl.ui.flows.refund.c cVar5 = cVar3;
                                    if (z) {
                                        nnj.m mVar = (nnj.m) result;
                                        oki.h.t2(cVar5, cVar5.f100876t, new EsimRefundFlowContract$Step.Refund(mVar.f217698a, mVar.f217699b), true, null, false, 12);
                                    } else if (result instanceof nnj.l) {
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "EsimRefundFlowModel", "Wrong output data: Mobile Plan cancellation attempt in the Data Plan Refund flow", null, h0Var);
                                    } else {
                                        if (!(result instanceof a.C0625a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar5.C2(new c(c4.ACTIVE));
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.a result2 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.a) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z3 = result2 instanceof a.b;
                                    com.revolut.retail.feature.esim.impl.ui.flows.refund.c cVar6 = cVar3;
                                    if (z3) {
                                        cVar6.C2(new c(c4.EXPIRED));
                                    } else {
                                        if (!(result2 instanceof a.C0624a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(cVar6, cVar6.f100876t, EsimRefundFlowContract$Step.Help.f100869a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    wfj.c output = (wfj.c) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!Intrinsics.f(output, wfj.c.f297153a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar4.B2();
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block29, "block");
                    esimRefundScreen.H = block29;
                    return esimRefundScreen;
                }
                if (step17 instanceof EsimRefundFlowContract$Step.Help) {
                    EsimHelpFlow esimHelpFlow = new EsimHelpFlow(0);
                    Function1 block30 = new Function1() { // from class: pgj.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i33 = i2;
                            com.revolut.retail.feature.esim.impl.ui.flows.refund.c cVar4 = cVar3;
                            switch (i33) {
                                case 0:
                                    d67.u it9 = (d67.u) obj5;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(cVar4.f100876t);
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a result = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof nnj.m;
                                    com.revolut.retail.feature.esim.impl.ui.flows.refund.c cVar5 = cVar3;
                                    if (z) {
                                        nnj.m mVar = (nnj.m) result;
                                        oki.h.t2(cVar5, cVar5.f100876t, new EsimRefundFlowContract$Step.Refund(mVar.f217698a, mVar.f217699b), true, null, false, 12);
                                    } else if (result instanceof nnj.l) {
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "EsimRefundFlowModel", "Wrong output data: Mobile Plan cancellation attempt in the Data Plan Refund flow", null, h0Var);
                                    } else {
                                        if (!(result instanceof a.C0625a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar5.C2(new c(c4.ACTIVE));
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.a result2 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.a) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z3 = result2 instanceof a.b;
                                    com.revolut.retail.feature.esim.impl.ui.flows.refund.c cVar6 = cVar3;
                                    if (z3) {
                                        cVar6.C2(new c(c4.EXPIRED));
                                    } else {
                                        if (!(result2 instanceof a.C0624a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(cVar6, cVar6.f100876t, EsimRefundFlowContract$Step.Help.f100869a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    wfj.c output = (wfj.c) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!Intrinsics.f(output, wfj.c.f297153a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar4.B2();
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block30, "block");
                    esimHelpFlow.H = block30;
                    return esimHelpFlow;
                }
                if (step17 instanceof EsimRefundFlowContract$Step.RefundReasonForm) {
                    EsimRefundReasonScreen esimRefundReasonScreen = new EsimRefundReasonScreen(new EsimRefundReasonScreenContract$InputData.RefundDataPlanSubscription(esimRefundFlowContract$InputData.f100868a));
                    final char c56 = c28 == true ? 1 : 0;
                    Function1 block31 = new Function1() { // from class: pgj.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i33 = c56;
                            com.revolut.retail.feature.esim.impl.ui.flows.refund.c cVar4 = cVar3;
                            switch (i33) {
                                case 0:
                                    d67.u it9 = (d67.u) obj5;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(cVar4.f100876t);
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a result = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof nnj.m;
                                    com.revolut.retail.feature.esim.impl.ui.flows.refund.c cVar5 = cVar3;
                                    if (z) {
                                        nnj.m mVar = (nnj.m) result;
                                        oki.h.t2(cVar5, cVar5.f100876t, new EsimRefundFlowContract$Step.Refund(mVar.f217698a, mVar.f217699b), true, null, false, 12);
                                    } else if (result instanceof nnj.l) {
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "EsimRefundFlowModel", "Wrong output data: Mobile Plan cancellation attempt in the Data Plan Refund flow", null, h0Var);
                                    } else {
                                        if (!(result instanceof a.C0625a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar5.C2(new c(c4.ACTIVE));
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.a result2 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.a) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z3 = result2 instanceof a.b;
                                    com.revolut.retail.feature.esim.impl.ui.flows.refund.c cVar6 = cVar3;
                                    if (z3) {
                                        cVar6.C2(new c(c4.EXPIRED));
                                    } else {
                                        if (!(result2 instanceof a.C0624a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(cVar6, cVar6.f100876t, EsimRefundFlowContract$Step.Help.f100869a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    wfj.c output = (wfj.c) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!Intrinsics.f(output, wfj.c.f297153a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar4.B2();
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block31, "block");
                    esimRefundReasonScreen.H = block31;
                    return esimRefundReasonScreen;
                }
                if (!(step17 instanceof EsimRefundFlowContract$Step.Restricted)) {
                    throw new NoWhenBranchMatchedException();
                }
                PromptMarketingScreen promptMarketingScreen3 = new PromptMarketingScreen(((EsimRefundFlowContract$Step.Restricted) step17).f100873a);
                final int i33 = 0;
                Function1 block32 = new Function1() { // from class: pgj.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        int i332 = i33;
                        com.revolut.retail.feature.esim.impl.ui.flows.refund.c cVar4 = cVar3;
                        switch (i332) {
                            case 0:
                                d67.u it9 = (d67.u) obj5;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                oki.h.D2(cVar4.f100876t);
                                return Unit.f186387a;
                            case 1:
                                com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a result = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z = result instanceof nnj.m;
                                com.revolut.retail.feature.esim.impl.ui.flows.refund.c cVar5 = cVar3;
                                if (z) {
                                    nnj.m mVar = (nnj.m) result;
                                    oki.h.t2(cVar5, cVar5.f100876t, new EsimRefundFlowContract$Step.Refund(mVar.f217698a, mVar.f217699b), true, null, false, 12);
                                } else if (result instanceof nnj.l) {
                                    h0 h0Var = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, "EsimRefundFlowModel", "Wrong output data: Mobile Plan cancellation attempt in the Data Plan Refund flow", null, h0Var);
                                } else {
                                    if (!(result instanceof a.C0625a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar5.C2(new c(c4.ACTIVE));
                                }
                                return Unit.f186387a;
                            case 2:
                                com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.a result2 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.a) obj5;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                boolean z3 = result2 instanceof a.b;
                                com.revolut.retail.feature.esim.impl.ui.flows.refund.c cVar6 = cVar3;
                                if (z3) {
                                    cVar6.C2(new c(c4.EXPIRED));
                                } else {
                                    if (!(result2 instanceof a.C0624a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(cVar6, cVar6.f100876t, EsimRefundFlowContract$Step.Help.f100869a, true, null, false, 12);
                                }
                                return Unit.f186387a;
                            default:
                                wfj.c output = (wfj.c) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (!Intrinsics.f(output, wfj.c.f297153a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar4.B2();
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block32, "block");
                promptMarketingScreen3.H = block32;
                return promptMarketingScreen3;
            case 24:
                bhl.f fVar2 = (bhl.f) obj4;
                List domain2 = (List) obj3;
                Intrinsics.checkNotNullParameter((phl.l) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain2, "domain");
                List list3 = domain2;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList.add(ihl.c.b((i) it9.next()));
                }
                fVar2.d(arrayList);
                return Unit.f186387a;
            case 25:
                bhl.a aVar11 = (bhl.a) obj4;
                phl.a params3 = (phl.a) obj2;
                List domain3 = (List) obj3;
                Intrinsics.checkNotNullParameter(params3, "params");
                Intrinsics.checkNotNullParameter(domain3, "domain");
                if (params3.e != null) {
                    return Unit.f186387a;
                }
                List list4 = domain3;
                ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                Iterator it10 = list4.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(ihl.c.a((i) it10.next(), params3.d));
                }
                aVar11.b(arrayList2);
                return Unit.f186387a;
            case 26:
                com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d dVar4 = (com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d) obj4;
                fj6.f fVar3 = dVar4.u;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                OpenBankingAuthPaymentFlowContract$Step step18 = (OpenBankingAuthPaymentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step18, "step");
                if (step18 instanceof OpenBankingAuthPaymentFlowContract$Step.PaymentScreen) {
                    OpenBankingAuthPaymentScreen openBankingAuthPaymentScreen = new OpenBankingAuthPaymentScreen(((OpenBankingAuthPaymentFlowContract$Step.PaymentScreen) step18).f72512a);
                    l0 block33 = new l0(dVar4, 21, LazyFlowCoordinator2, step18);
                    Intrinsics.checkNotNullParameter(block33, "block");
                    openBankingAuthPaymentScreen.H = block33;
                    return openBankingAuthPaymentScreen;
                }
                if (step18 instanceof OpenBankingAuthPaymentFlowContract$Step.BalancePicker) {
                    OpenBankingAuthPaymentFlowContract$Step.BalancePicker balancePicker = (OpenBankingAuthPaymentFlowContract$Step.BalancePicker) step18;
                    ViewController viewControllerE14 = dVar4.e1(new g1j.a(balancePicker.f72508a, new pi6.h(balancePicker.f72510c, balancePicker.f72509b, balancePicker.d, dVar4.o.f236447g)));
                    pi6.o block34 = new pi6.o(dVar4, c29 == true ? 1 : 0);
                    Intrinsics.checkNotNullParameter(block34, "block");
                    viewControllerE14.H = block34;
                    return viewControllerE14;
                }
                if (step18 instanceof OpenBankingAuthPaymentFlowContract$Step.TotalMayChangeDialog) {
                    lw0.a aVar12 = new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_banking_consent_flow_transfer_exchange_warning_prompt_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_banking_consent_flow_transfer_exchange_warning_prompt_subtitle, null, null, 14), null, null, false, 28);
                    k9 k9Var4 = k9.OpenBanking;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar12, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
                }
                if (!(step18 instanceof OpenBankingAuthPaymentFlowContract$Step.PaymentBreakdown)) {
                    throw new NoWhenBranchMatchedException();
                }
                OutboundPaymentExtras outboundPaymentExtras = ((OpenBankingAuthPaymentFlowContract$Step.PaymentBreakdown) step18).f72511a;
                if (outboundPaymentExtras instanceof OutboundPaymentExtras.LegacyQuote) {
                    OrderQuote orderQuote = ((OutboundPaymentExtras.LegacyQuote) outboundPaymentExtras).f72531a;
                    fVar3.getClass();
                    listB = fj6.f.c(orderQuote);
                } else {
                    if (!(outboundPaymentExtras instanceof OutboundPaymentExtras.PaymentBreakdown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    OutboundPaymentBreakdown outboundPaymentBreakdown = ((OutboundPaymentExtras.PaymentBreakdown) outboundPaymentExtras).f72532a;
                    if (!(outboundPaymentBreakdown instanceof OutboundPaymentBreakdown.CrossCurrency)) {
                        if (!(outboundPaymentBreakdown instanceof OutboundPaymentBreakdown.SameCurrency)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        IllegalStateException illegalStateException = new IllegalStateException("Same-currency breakdown should not reach Step.PaymentBreakdown");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        r72 = 0;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        listB = f0.f322471a;
                        PaymentBreakdownBottomSheet paymentBreakdownBottomSheet = new PaymentBreakdownBottomSheet(new fj6.b(listB, new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_banking_consent_flow_payment_initiation_payment_breakdown_title, r72, r72, 14), null, null, null, false, 30)));
                        h block35 = new h(dVar4, step18, 27);
                        Intrinsics.checkNotNullParameter(block35, "block");
                        paymentBreakdownBottomSheet.H = block35;
                        return paymentBreakdownBottomSheet;
                    }
                    fVar3.getClass();
                    listB = fj6.f.b((OutboundPaymentBreakdown.CrossCurrency) outboundPaymentBreakdown);
                }
                r72 = 0;
                PaymentBreakdownBottomSheet paymentBreakdownBottomSheet2 = new PaymentBreakdownBottomSheet(new fj6.b(listB, new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_banking_consent_flow_payment_initiation_payment_breakdown_title, r72, r72, 14), null, null, null, false, 30)));
                h block352 = new h(dVar4, step18, 27);
                Intrinsics.checkNotNullParameter(block352, "block");
                paymentBreakdownBottomSheet2.H = block352;
                return paymentBreakdownBottomSheet2;
            case 27:
                return a(obj2, obj3);
            case 28:
                return b(obj2, obj3);
            default:
                com.revolut.feature.atm.impl.ui.redesign.limits_exception.a aVar13 = (com.revolut.feature.atm.impl.ui.redesign.limits_exception.a) obj4;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                AtmLimitsExceptionFlowContract$Step step19 = (AtmLimitsExceptionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step19, "step");
                if (!(step19 instanceof AtmLimitsExceptionFlowContract$Step.LimitsException)) {
                    throw new NoWhenBranchMatchedException();
                }
                AtmLimitsExceptionController atmLimitsExceptionController = new AtmLimitsExceptionController();
                atmLimitsExceptionController.l2(new dld.c(aVar13, LazyFlowCoordinator3, i3));
                pj3.b block36 = new pj3.b(aVar13, LazyFlowCoordinator3, i2);
                Intrinsics.checkNotNullParameter(block36, "block");
                atmLimitsExceptionController.H = block36;
                return atmLimitsExceptionController;
        }
    }
}
