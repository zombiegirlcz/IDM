package vh9;

import akj.c;
import android.os.Parcelable;
import aw0.c7;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import b3j.p;
import baa.c;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.xc;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressValidationMode;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressVerificationUseCase;
import com.revolut.feature.alipay.impl.ui.qr.AlipayPlusQrFlowContract$Page;
import com.revolut.feature.alipay.impl.ui.qr.scanner.AlipayPlusQrScannerFlow;
import com.revolut.feature.alipay.impl.ui.qr.showcode.AlipayPlusShowCodeScreen;
import com.revolut.feature.apm.bills.boleto.impl.finder.deactivate.BoletoFinderDeactivateScreen;
import com.revolut.feature.apm.bills.boleto.impl.finder.flow.BoletoFinderFlowContract$Step;
import com.revolut.feature.apm.bills.boleto.impl.finder.hidden.HiddenBoletosScreen;
import com.revolut.feature.apm.bills.boleto.impl.finder.info.BoletosInfoScreen;
import com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.ReferralWithIncentiveFlowContract$Step;
import com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.ReferralCampaignStateScreen;
import com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.ReferralInviteeDetailsScreen;
import com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.ReferralInviteeDetailsScreenContract$InputData;
import com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.BaseReferralWithIncentiveOverviewScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.sso.SelfieIntroScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.SelfieIntroFlowContract$Step;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentDocument;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount.CreditCardLimitDecreaseAmountScreen;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount.CreditCardLimitDecreaseAmountScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.CreditCardLimitDecreaseFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.instalment.agreement.CreditCardInstalmentAgreementScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.agreement.CreditCardInstalmentAgreementScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.confirmation.InstalmentConfirmationScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.confirmation.InstalmentConfirmationScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$IneligibilityDialogType;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$State;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.term.InstalmentTermScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.term.InstalmentTermScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.transactions.InstalmentTransactionsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.transactions.InstalmentTransactionsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlow;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.CreditCardStatementTransactionsScreen;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.CreditCardStatementTransactionsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.flow.CreditCardTransactionsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.flow.CreditCardTransactionsFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoFeeBreakdownDialogInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.CryptoFeeBreakdownDialogController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationControllerContract$Step;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.remaining_limit.CryptoSendRemainingLimitController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.remaining_limit.CryptoSendRemainingLimitControllerContract$Input;
import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreen;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.InsuranceDetailsFlowContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.InsuranceDetailsFlowContract$Step;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.text.SimpleTextDocumentScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.text.SimpleTextDocumentScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.cfac_coverage_selection.CfacCoverageSelectionScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.cfac_coverage_selection.CfacCoverageSelectionScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.CoverageDetailsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.CoverageDetailsScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.a;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.InsuranceDetailsLayoutScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.InsuranceDetailsLayoutScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.documents.InsuranceDocumentsLayoutScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.documents.InsuranceDocumentsLayoutScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.get_help.GetHelpScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.get_help.GetHelpScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.MakeClaimScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.MakeClaimScreenContract$InputData;
import com.revolut.feature.junior_payment_links.api.navigation.JuniorPaymentLinksConsentInput;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.LogoutConfirmationController;
import com.revolut.feature.junior_settings.impl.ui_kompot.payments_settings_explanatory.JuniorPaymentsSettingsExplanatoryController;
import com.revolut.feature.junior_settings.impl.ui_kompot.payments_settings_explanatory.JuniorPaymentsSettingsExplanatoryControllerContract$Input;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyControllerContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyControllerContract$ModalStep;
import com.revolut.feature.kyc.impl.dap.DapFlowContract$Step;
import com.revolut.feature.kyc.impl.external.app.flow.ExternalAppKycProviderFlow;
import com.revolut.feature.kyc.impl.external.app.flow.ExternalAppKycProviderFlowContract$InputData;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesNavigation$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.flow.PayBillsAndTaxesFlow;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.BillsCatalogueFlow;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.BillsCatalogueFlowContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow.BillsRoutingFlowContract$Step;
import com.revolut.feature.product.onboarding.domain.models.DateOfBirthValue;
import com.revolut.feature.product.onboarding.domain.models.ScreenConfiguration;
import com.revolut.feature.product.onboarding.flow.ProductOnboardingFlowContract$Step;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreen;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreenContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.EmployerDetailsScreenContract$ModalStep;
import com.revolut.feature.shops.impl.ui.bid_custom_input.BidCustomInputContract$InputData;
import com.revolut.feature.shops.impl.ui.bid_custom_input.BidCustomInputScreen;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$FlowState;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$Step;
import com.revolut.feature.shops.impl.ui.bid_screen.ShopsItemsBidScreen;
import com.revolut.feature.shops.impl.ui.bid_screen.ShopsItemsBidScreenContract$InputData;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$SectionInfoParcel;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.disclaimer.IncomeSorterDisclaimerBottomSheetController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.flow.RevIQFlowContract$Step;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.home.RevIQHomeFlow;
import com.revolut.feature.staking.impl.confirmation.StakingConfirmationController;
import com.revolut.feature.staking.impl.flow.stake.v2.StakingControllerContract$InputData;
import com.revolut.feature.staking.impl.flow.stake.v2.StakingControllerContract$Step;
import com.revolut.feature.staking.impl.stake.v2.StakeController;
import com.revolut.feature.staking.impl.stakingdetails.v2.StakingDetailsController;
import com.revolut.feature.tickets.api.models.TicketDetails;
import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import com.revolut.feature.user_declarations.shared.flows.income.IncomeFlowContract$Step;
import com.revolut.feature.user_declarations.shared.flows.income.screen.IncomeScreen;
import com.revolut.feature.user_declarations.shared.flows.income.screen.IncomeScreenContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.WithdrawMoneyFlowContract$Step;
import com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.feature_crypto_picker.api.CryptoPickerDestination;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.oauth.api.consent.OAuthAuthorizeParams;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking.AsftPassBookingFlowContract$Step;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking.AsftPassBookingFlowContract$UserBookingDetails;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_search.AsftAirportSearchScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_selection.AsftAirportSelectionScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.AsftTerminalSelectionScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.AsftTerminalSelectionScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreenContract$InputData;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$InputData;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$Start;
import com.revolut.retail.feature.esim.impl.ui.screens.country_picker.EsimCountryPickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.country_picker.EsimCountryPickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.info.EsimInfoBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.info.EsimInfoBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.EsimMobilePlanEsimMigrationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.EsimMobilePlanEsimMigrationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_transfer_info.EsimMobilePlanEsimTransferInfoScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_transfer_info.EsimMobilePlanEsimTransferInfoScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.EsimMobilePlanGetPortOutCredentialsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.EsimMobilePlanGetPortOutCredentialsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreenContract$InputData;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.user_declarations.api.flows.income.IncomeFlowInputData;
import com.revolut.shared.feature.user_declarations.api.models.DateOfBirthScreenConfig;
import com.revolut.shared.feature.user_declarations.api.models.NamePrefill;
import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$InputData;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$InputData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import com.revolut.sso.impl.ui.protection_check.ProtectionCheckScreen;
import com.revolut.sso.impl.ui.protection_check.flow.ProtectionCheckFlowContract$Step;
import com.revolut.trading.orders.ui.details_pager.InvestOrderDetailsPagerFlowContract$DetailsPagerItem;
import grl.k9;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import om4.r1;
import ov7.k;
import pcd.s;
import ql4.g;
import rv7.h;
import til.m;
import vge.z1;
import vkm.j2;
import vpd.a0;
import vpd.c0;
import vq5.x;
import vq5.z;
import vqg.f;
import vti.e;
import vu0.o;
import wqd.d;
import xf6.x0;
import yki.i;
import yki.l;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.z0;
import zp0.y;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f289348b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f289347a = i;
        this.f289348b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.flow.a aVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.flow.a) this.f289348b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        RevIQFlowContract$Step step = (RevIQFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof RevIQFlowContract$Step.Intro) {
            Intrinsics.checkNotNullParameter("An operation is not implemented: DRMH-3231 Show the product article", "message");
            throw new NotImplementedError("An operation is not implemented: DRMH-3231 Show the product article");
        }
        if (step instanceof RevIQFlowContract$Step.Home) {
            return new RevIQHomeFlow(new d(aVar.o.f291388a));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object b(Object obj2, Object obj3) {
        f fVar = (f) this.f289348b;
        l FlowCoordinator = (l) obj2;
        WithdrawMoneyFlowContract$Step it8 = (WithdrawMoneyFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(it8, "it");
        MoneyBoxAmountInputScreenContract$InputData.Companion companion = MoneyBoxAmountInputScreenContract$InputData.INSTANCE;
        s sVar = fVar.o.f94788a;
        String str = sVar.f234881a;
        String currency = sVar.getCurrency();
        k9 value = k9.Savings;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        AnalyticsProduct.Retail retail = new AnalyticsProduct.Retail(value);
        companion.getClass();
        MoneyBoxAmountInputScreen moneyBoxAmountInputScreen = new MoneyBoxAmountInputScreen(MoneyBoxAmountInputScreenContract$InputData.Companion.b(str, currency, retail));
        c cVar = new c(fVar, FlowCoordinator, 21);
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        moneyBoxAmountInputScreen.H = cVar;
        return moneyBoxAmountInputScreen;
    }

    private final Object c(Object obj2, Object obj3) {
        ActionsBottomSheetController actionsBottomSheetControllerA;
        InstalmentTermScreenContract$InputData debit;
        final com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar = (com.revolut.feature.credit.card.impl.ui.instalment.create.b) this.f289348b;
        qki.d dVar = bVar.f69347w;
        final yki.b LazyFlowCoordinator = (yki.b) obj2;
        InstalmentFlowContract$Step step = (InstalmentFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof InstalmentFlowContract$Step.Intro) {
            InstalmentFlowContract$Step.Intro intro = (InstalmentFlowContract$Step.Intro) step;
            ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(intro.f69336a), intro.f69337b);
            k9 k9Var = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ViewController viewControllerE1 = bVar.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, false, 52));
            final int i = 0;
            Function1 block = new Function1() { // from class: vr4.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    Pair pair;
                    switch (i) {
                        case 0:
                            yja.b outputData = (yja.b) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            int i2 = n.f291494a[outputData.ordinal()];
                            yki.b bVar2 = LazyFlowCoordinator;
                            if (i2 == 1 || i2 == 2 || i2 == 3) {
                                com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar3 = bVar;
                                oki.h.t2(bVar3, bVar2, com.revolut.feature.credit.card.impl.ui.instalment.create.b.I2(bVar3.o), false, null, false, 12);
                            } else {
                                if (i2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.D2(bVar2);
                            }
                            return Unit.f186387a;
                        case 1:
                            ft4.p result = (ft4.p) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof ft4.n) {
                                pair = new Pair(InstalmentFlowContract$Step.Term.Credit.f69339a, io3.l.CREDIT);
                            } else {
                                if (!(result instanceof ft4.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pair = new Pair(InstalmentFlowContract$Step.Term.Debit.f69340a, io3.l.CURRENT);
                            }
                            InstalmentFlowContract$Step.Term term = (InstalmentFlowContract$Step.Term) pair.f186385a;
                            io3.l lVar = (io3.l) pair.f186386b;
                            com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar4 = bVar;
                            bVar4.H2(bVar4.f69347w, new vgk.f(result, lVar, 26));
                            oki.h.t2(bVar4, LazyFlowCoordinator, term, true, null, false, 12);
                            return Unit.f186387a;
                        case 2:
                            dt4.g outputData2 = (dt4.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar5 = bVar;
                            bVar5.H2(bVar5.f69347w, new x(outputData2, 2));
                            oki.h.t2(bVar5, LazyFlowCoordinator, new InstalmentFlowContract$Step.Confirmation(outputData2.f117368a), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            tr4.j result2 = (tr4.j) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z = result2 instanceof tr4.h;
                            com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar6 = bVar;
                            if (z) {
                                bVar6.l2(new vmf.k(bVar6, null, 4), new yi5.b(26));
                            } else {
                                if (!(result2 instanceof tr4.i)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tr4.i iVar = (tr4.i) result2;
                                oki.h.t2(bVar6, LazyFlowCoordinator, new InstalmentFlowContract$Step.Agreement(iVar.f273736b, iVar.f273735a), true, null, false, 12);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        final int i2 = 1;
        if (step instanceof InstalmentFlowContract$Step.TransactionsList) {
            InstalmentTransactionsScreen instalmentTransactionsScreen = new InstalmentTransactionsScreen(new InstalmentTransactionsScreenContract$InputData(((InstalmentFlowContract$State) ((j2) dVar.f22677a).getValue()).f69329a));
            Function1 block2 = new Function1() { // from class: vr4.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    Pair pair;
                    switch (i2) {
                        case 0:
                            yja.b outputData = (yja.b) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            int i22 = n.f291494a[outputData.ordinal()];
                            yki.b bVar2 = LazyFlowCoordinator;
                            if (i22 == 1 || i22 == 2 || i22 == 3) {
                                com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar3 = bVar;
                                oki.h.t2(bVar3, bVar2, com.revolut.feature.credit.card.impl.ui.instalment.create.b.I2(bVar3.o), false, null, false, 12);
                            } else {
                                if (i22 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.D2(bVar2);
                            }
                            return Unit.f186387a;
                        case 1:
                            ft4.p result = (ft4.p) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof ft4.n) {
                                pair = new Pair(InstalmentFlowContract$Step.Term.Credit.f69339a, io3.l.CREDIT);
                            } else {
                                if (!(result instanceof ft4.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pair = new Pair(InstalmentFlowContract$Step.Term.Debit.f69340a, io3.l.CURRENT);
                            }
                            InstalmentFlowContract$Step.Term term = (InstalmentFlowContract$Step.Term) pair.f186385a;
                            io3.l lVar = (io3.l) pair.f186386b;
                            com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar4 = bVar;
                            bVar4.H2(bVar4.f69347w, new vgk.f(result, lVar, 26));
                            oki.h.t2(bVar4, LazyFlowCoordinator, term, true, null, false, 12);
                            return Unit.f186387a;
                        case 2:
                            dt4.g outputData2 = (dt4.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar5 = bVar;
                            bVar5.H2(bVar5.f69347w, new x(outputData2, 2));
                            oki.h.t2(bVar5, LazyFlowCoordinator, new InstalmentFlowContract$Step.Confirmation(outputData2.f117368a), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            tr4.j result2 = (tr4.j) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z = result2 instanceof tr4.h;
                            com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar6 = bVar;
                            if (z) {
                                bVar6.l2(new vmf.k(bVar6, null, 4), new yi5.b(26));
                            } else {
                                if (!(result2 instanceof tr4.i)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tr4.i iVar = (tr4.i) result2;
                                oki.h.t2(bVar6, LazyFlowCoordinator, new InstalmentFlowContract$Step.Agreement(iVar.f273736b, iVar.f273735a), true, null, false, 12);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            instalmentTransactionsScreen.H = block2;
            return instalmentTransactionsScreen;
        }
        final int i3 = 2;
        if (step instanceof InstalmentFlowContract$Step.Term) {
            InstalmentFlowContract$Step.Term term = (InstalmentFlowContract$Step.Term) step;
            if (term instanceof InstalmentFlowContract$Step.Term.Credit) {
                debit = new InstalmentTermScreenContract$InputData.Credit(io3.l.CREDIT, ((InstalmentFlowContract$State) ((j2) dVar.f22677a).getValue()).f69329a, ((InstalmentFlowContract$State) ((j2) dVar.f22677a).getValue()).f69330b);
            } else {
                if (!(term instanceof InstalmentFlowContract$Step.Term.Debit)) {
                    throw new NoWhenBranchMatchedException();
                }
                debit = new InstalmentTermScreenContract$InputData.Debit(((InstalmentFlowContract$State) ((j2) dVar.f22677a).getValue()).f69330b, io3.l.CURRENT);
            }
            InstalmentTermScreen instalmentTermScreen = new InstalmentTermScreen(debit);
            Function1 block3 = new Function1() { // from class: vr4.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    Pair pair;
                    switch (i3) {
                        case 0:
                            yja.b outputData = (yja.b) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            int i22 = n.f291494a[outputData.ordinal()];
                            yki.b bVar2 = LazyFlowCoordinator;
                            if (i22 == 1 || i22 == 2 || i22 == 3) {
                                com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar3 = bVar;
                                oki.h.t2(bVar3, bVar2, com.revolut.feature.credit.card.impl.ui.instalment.create.b.I2(bVar3.o), false, null, false, 12);
                            } else {
                                if (i22 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.D2(bVar2);
                            }
                            return Unit.f186387a;
                        case 1:
                            ft4.p result = (ft4.p) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof ft4.n) {
                                pair = new Pair(InstalmentFlowContract$Step.Term.Credit.f69339a, io3.l.CREDIT);
                            } else {
                                if (!(result instanceof ft4.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pair = new Pair(InstalmentFlowContract$Step.Term.Debit.f69340a, io3.l.CURRENT);
                            }
                            InstalmentFlowContract$Step.Term term2 = (InstalmentFlowContract$Step.Term) pair.f186385a;
                            io3.l lVar = (io3.l) pair.f186386b;
                            com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar4 = bVar;
                            bVar4.H2(bVar4.f69347w, new vgk.f(result, lVar, 26));
                            oki.h.t2(bVar4, LazyFlowCoordinator, term2, true, null, false, 12);
                            return Unit.f186387a;
                        case 2:
                            dt4.g outputData2 = (dt4.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar5 = bVar;
                            bVar5.H2(bVar5.f69347w, new x(outputData2, 2));
                            oki.h.t2(bVar5, LazyFlowCoordinator, new InstalmentFlowContract$Step.Confirmation(outputData2.f117368a), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            tr4.j result2 = (tr4.j) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z = result2 instanceof tr4.h;
                            com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar6 = bVar;
                            if (z) {
                                bVar6.l2(new vmf.k(bVar6, null, 4), new yi5.b(26));
                            } else {
                                if (!(result2 instanceof tr4.i)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tr4.i iVar = (tr4.i) result2;
                                oki.h.t2(bVar6, LazyFlowCoordinator, new InstalmentFlowContract$Step.Agreement(iVar.f273736b, iVar.f273735a), true, null, false, 12);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            instalmentTermScreen.H = block3;
            return instalmentTermScreen;
        }
        final int i5 = 3;
        if (step instanceof InstalmentFlowContract$Step.Confirmation) {
            j2 j2Var = (j2) dVar.f22677a;
            j2 j2Var2 = (j2) dVar.f22677a;
            InstalmentConfirmationScreen instalmentConfirmationScreen = new InstalmentConfirmationScreen(new InstalmentConfirmationScreenContract$InputData(((InstalmentFlowContract$State) j2Var.getValue()).f69329a, ((InstalmentFlowContract$State) j2Var2.getValue()).f69330b, ((InstalmentFlowContract$Step.Confirmation) step).f69334a, ((InstalmentFlowContract$State) j2Var2.getValue()).d));
            Function1 block4 = new Function1() { // from class: vr4.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    Pair pair;
                    switch (i5) {
                        case 0:
                            yja.b outputData = (yja.b) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            int i22 = n.f291494a[outputData.ordinal()];
                            yki.b bVar2 = LazyFlowCoordinator;
                            if (i22 == 1 || i22 == 2 || i22 == 3) {
                                com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar3 = bVar;
                                oki.h.t2(bVar3, bVar2, com.revolut.feature.credit.card.impl.ui.instalment.create.b.I2(bVar3.o), false, null, false, 12);
                            } else {
                                if (i22 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.D2(bVar2);
                            }
                            return Unit.f186387a;
                        case 1:
                            ft4.p result = (ft4.p) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof ft4.n) {
                                pair = new Pair(InstalmentFlowContract$Step.Term.Credit.f69339a, io3.l.CREDIT);
                            } else {
                                if (!(result instanceof ft4.o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pair = new Pair(InstalmentFlowContract$Step.Term.Debit.f69340a, io3.l.CURRENT);
                            }
                            InstalmentFlowContract$Step.Term term2 = (InstalmentFlowContract$Step.Term) pair.f186385a;
                            io3.l lVar = (io3.l) pair.f186386b;
                            com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar4 = bVar;
                            bVar4.H2(bVar4.f69347w, new vgk.f(result, lVar, 26));
                            oki.h.t2(bVar4, LazyFlowCoordinator, term2, true, null, false, 12);
                            return Unit.f186387a;
                        case 2:
                            dt4.g outputData2 = (dt4.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar5 = bVar;
                            bVar5.H2(bVar5.f69347w, new x(outputData2, 2));
                            oki.h.t2(bVar5, LazyFlowCoordinator, new InstalmentFlowContract$Step.Confirmation(outputData2.f117368a), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            tr4.j result2 = (tr4.j) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z = result2 instanceof tr4.h;
                            com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar6 = bVar;
                            if (z) {
                                bVar6.l2(new vmf.k(bVar6, null, 4), new yi5.b(26));
                            } else {
                                if (!(result2 instanceof tr4.i)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tr4.i iVar = (tr4.i) result2;
                                oki.h.t2(bVar6, LazyFlowCoordinator, new InstalmentFlowContract$Step.Agreement(iVar.f273736b, iVar.f273735a), true, null, false, 12);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            instalmentConfirmationScreen.H = block4;
            return instalmentConfirmationScreen;
        }
        if (step instanceof InstalmentFlowContract$Step.Agreement) {
            InstalmentFlowContract$Step.Agreement agreement = (InstalmentFlowContract$Step.Agreement) step;
            ArrayList arrayList = agreement.f69332a;
            Set set = agreement.f69333b;
            ql4.s sVar = ((InstalmentFlowContract$State) ((j2) dVar.f22677a).getValue()).f69331c;
            if (sVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                g gVar = ((CreditCardInstalmentDocument) it8.next()).f68799a;
                arrayList2.add(new CreditCardInstalmentAgreementScreenContract$InputData.Document(gVar, ((r1) bVar.f69343q).h(((InstalmentFlowContract$State) ((j2) dVar.f22677a).getValue()).f69329a, sVar.f247179a, pyd.c.H(sVar.e, sVar.d), sVar.f247183h, gVar, set, null)));
            }
            CreditCardInstalmentAgreementScreen creditCardInstalmentAgreementScreen = new CreditCardInstalmentAgreementScreen(new CreditCardInstalmentAgreementScreenContract$InputData(arrayList2));
            vr4.l block5 = new vr4.l(bVar, 1);
            Intrinsics.checkNotNullParameter(block5, "block");
            creditCardInstalmentAgreementScreen.H = block5;
            return creditCardInstalmentAgreementScreen;
        }
        if (!(step instanceof InstalmentFlowContract$Step.IneligibilityExplainer)) {
            if (!(step instanceof InstalmentFlowContract$Step.Repay)) {
                throw new NoWhenBranchMatchedException();
            }
            CreditCardRepayFlow creditCardRepayFlow = new CreditCardRepayFlow(new CreditCardRepayFlowContract$InputData(((InstalmentFlowContract$Step.Repay) step).f69338a, bVar.o.getF69322a()));
            vr4.l block6 = new vr4.l(bVar, i3);
            Intrinsics.checkNotNullParameter(block6, "block");
            creditCardRepayFlow.H = block6;
            return creditCardRepayFlow;
        }
        wr4.a aVar = bVar.u;
        InstalmentFlowContract$IneligibilityDialogType dialogType = ((InstalmentFlowContract$Step.IneligibilityExplainer) step).f69335a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(dialogType, "dialogType");
        boolean z = dialogType instanceof InstalmentFlowContract$IneligibilityDialogType.OverduePlans;
        BottomSheet.ActionStyle.Accent accent = BottomSheet.ActionStyle.Accent.f69824a;
        if (z) {
            InstalmentFlowContract$IneligibilityDialogType.OverduePlans overduePlans = (InstalmentFlowContract$IneligibilityDialogType.OverduePlans) dialogType;
            wi0.b countryCode = overduePlans.f69316b;
            dj0.d minimumDue = overduePlans.f69315a;
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            wi0.b.Companion.getClass();
            wi0.b bVar2 = wi0.b.f297756l;
            TextLocalisedClause textLocalisedClause = Intrinsics.f(countryCode, bVar2) ? new TextLocalisedClause(R$string.credit_card_instalment_hub_dialog_overdue_title_au, null, null, 14) : new TextLocalisedClause(R$string.credit_card_instalment_hub_dialog_overdue_title, null, null, 14);
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(minimumDue, "minimumDue");
            TextLocalisedClause textLocalisedClause2 = Intrinsics.f(countryCode, bVar2) ? new TextLocalisedClause(R$string.credit_card_instalment_hub_dialog_overdue_description_au, null, null, 14) : new TextLocalisedClause(R$string.credit_card_instalment_hub_dialog_overdue_description, u.c(sx4.f.b(3, null, null, minimumDue)), null, 12);
            GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_24_warning, null, null, 6);
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(minimumDue, "minimumDue");
            List listC = Intrinsics.f(countryCode, bVar2) ? u.c(new BottomSheet.ItemSection(u.c(new BottomSheet.Item.CellItem("id_credit_card_instalment_hub_dialog_overdue_item_repay", new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_amount, null, null, 14), sx4.f.b(3, null, null, minimumDue), null, false, null, 0, SyslogConstants.LOG_CLOCK)))) : f0.f322471a;
            BottomSheet.ActionBlock.SingleAction singleAction = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_card_instalment_hub_dialog_overdue_action, null, null, 14), accent), null);
            k9 k9Var2 = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            actionsBottomSheetControllerA = BottomSheet.a(textLocalisedClause, textLocalisedClause2, glyphImage, listC, singleAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, 64);
        } else if (dialogType instanceof InstalmentFlowContract$IneligibilityDialogType.ActiveForbearance) {
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_card_instalment_hub_dialog_forbearance_title, null, null, 14);
            int i6 = R$string.credit_card_instalment_hub_dialog_forbearance_description;
            j jVar = c7.Companion;
            LocalDate localDate = ((InstalmentFlowContract$IneligibilityDialogType.ActiveForbearance) dialogType).f69314a;
            LocalDateClause$DateFormat.INSTANCE.getClass();
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(i6, u.c(j.b(jVar, localDate, LocalDateClause$DateFormat.Companion.f57815b)), null, 12);
            GlyphImage glyphImage2 = new GlyphImage(R$drawable.uikit_icn_24_warning, null, null, 6);
            BottomSheet.ActionBlock.SingleAction singleAction2 = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), accent), null);
            k9 k9Var3 = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
            actionsBottomSheetControllerA = BottomSheet.a(textLocalisedClause3, textLocalisedClause4, glyphImage2, null, singleAction2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, 72);
        } else if (dialogType instanceof InstalmentFlowContract$IneligibilityDialogType.RestrictedInstalmentPlans) {
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.credit_card_instalment_hub_dialog_restricted_title, null, null, 14);
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.credit_card_instalment_hub_dialog_restricted_description, u.c(sx4.f.b(3, null, null, ((InstalmentFlowContract$IneligibilityDialogType.RestrictedInstalmentPlans) dialogType).f69317a)), null, 12);
            GlyphImage glyphImage3 = new GlyphImage(R$drawable.uikit_icn_24_warning, null, null, 6);
            BottomSheet.ActionBlock.SingleAction singleAction3 = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_card_instalment_hub_dialog_restricted_action, null, null, 14), accent), null);
            k9 k9Var4 = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
            actionsBottomSheetControllerA = BottomSheet.a(textLocalisedClause5, textLocalisedClause6, glyphImage3, null, singleAction3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, 72);
        } else {
            if (!(dialogType instanceof InstalmentFlowContract$IneligibilityDialogType.UtilizationLimit)) {
                throw new NoWhenBranchMatchedException();
            }
            InstalmentFlowContract$IneligibilityDialogType.UtilizationLimit utilizationLimit = (InstalmentFlowContract$IneligibilityDialogType.UtilizationLimit) dialogType;
            TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.credit_card_instalment_create_dialog_error_utilization_limit_title, null, null, 14);
            TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.credit_card_instalment_create_dialog_error_utilization_limit_description, v.k(utilizationLimit.f69318a, sx4.f.b(3, null, null, utilizationLimit.f69319b)), null, 12);
            GlyphImage glyphImage4 = new GlyphImage(R$drawable.uikit_icn_24_warning, null, null, 6);
            BottomSheet.ActionBlock.SingleAction singleAction4 = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_card_instalment_create_dialog_error_utilization_limit_action, null, null, 14), accent), null);
            k9 k9Var5 = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
            actionsBottomSheetControllerA = BottomSheet.a(textLocalisedClause7, textLocalisedClause8, glyphImage4, null, singleAction4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, 72);
        }
        vgk.f block7 = new vgk.f(step, bVar, 27);
        Intrinsics.checkNotNullParameter(block7, "block");
        actionsBottomSheetControllerA.H = block7;
        actionsBottomSheetControllerA.k2(new vch.a(bVar, 22));
        return actionsBottomSheetControllerA;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.a aVar = (com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.a) this.f289348b;
        l FlowCoordinator = (l) obj2;
        ReferralWithIncentiveFlowContract$Step step = (ReferralWithIncentiveFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ReferralWithIncentiveFlowContract$Step.Overview) {
            return aVar.I2();
        }
        if (step instanceof ReferralWithIncentiveFlowContract$Step.OverviewWithInviteContacts) {
            BaseReferralWithIncentiveOverviewScreen baseReferralWithIncentiveOverviewScreenI2 = aVar.I2();
            String str = aVar.f64338p.f64333b;
            if (str != null) {
                aVar.J2(str, null, null);
            }
            return baseReferralWithIncentiveOverviewScreenI2;
        }
        if (!(step instanceof ReferralWithIncentiveFlowContract$Step.CampaignState)) {
            if (step instanceof ReferralWithIncentiveFlowContract$Step.InviteeDetails) {
                return new ReferralInviteeDetailsScreen(new ReferralInviteeDetailsScreenContract$InputData(((ReferralWithIncentiveFlowContract$Step.InviteeDetails) step).f64335a));
            }
            throw new NoWhenBranchMatchedException();
        }
        ReferralCampaignStateScreen referralCampaignStateScreen = new ReferralCampaignStateScreen(((ReferralWithIncentiveFlowContract$Step.CampaignState) step).f64334a);
        vs2.c block = new vs2.c(aVar, 0);
        Intrinsics.checkNotNullParameter(block, "block");
        referralCampaignStateScreen.H = block;
        return referralCampaignStateScreen;
    }

    private final Object e(Object obj2, Object obj3) {
        vsl.g gVar = (vsl.g) this.f289348b;
        ali.b PagerCoordinator = (ali.b) obj2;
        InvestOrderDetailsPagerFlowContract$DetailsPagerItem item = (InvestOrderDetailsPagerFlowContract$DetailsPagerItem) obj3;
        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
        Intrinsics.checkNotNullParameter(item, "item");
        htl.l lVar = gVar.f291851q;
        InvestOrder investOrder = item.f106817a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        ViewController viewControllerE1 = gVar.e1(new ldf.a(new InvestOrderDetailsContract$InputData(investOrder.getF104631b())));
        vsl.f block = new vsl.f(1, gVar, vsl.g.class, "handleInvestOrderDetailsOutput", "handleInvestOrderDetailsOutput(Lcom/revolut/feature/trading_orders/api/ui/details/InvestOrderDetailsContract$Output;)V", 0, 0);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking.b bVar = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking.b) this.f289348b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        AsftPassBookingFlowContract$Step step = (AsftPassBookingFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof AsftPassBookingFlowContract$Step.AirportSelection) {
            AsftAirportSelectionScreen asftAirportSelectionScreen = new AsftAirportSelectionScreen();
            e block = new e(bVar, 6);
            Intrinsics.checkNotNullParameter(block, "block");
            asftAirportSelectionScreen.H = block;
            return asftAirportSelectionScreen;
        }
        if (step instanceof AsftPassBookingFlowContract$Step.AirportSearch) {
            AsftAirportSearchScreen asftAirportSearchScreen = new AsftAirportSearchScreen();
            e block2 = new e(bVar, 1);
            Intrinsics.checkNotNullParameter(block2, "block");
            asftAirportSearchScreen.H = block2;
            return asftAirportSearchScreen;
        }
        if (step instanceof AsftPassBookingFlowContract$Step.TerminalSelection) {
            AsftTerminalSelectionScreen asftTerminalSelectionScreen = new AsftTerminalSelectionScreen(new AsftTerminalSelectionScreenContract$InputData(((AsftPassBookingFlowContract$Step.TerminalSelection) step).f98781a));
            e block3 = new e(bVar, 2);
            Intrinsics.checkNotNullParameter(block3, "block");
            asftTerminalSelectionScreen.H = block3;
            return asftTerminalSelectionScreen;
        }
        if (step instanceof AsftPassBookingFlowContract$Step.TimeSlotBooking) {
            AsftPassBookingFlowContract$Step.TimeSlotBooking timeSlotBooking = (AsftPassBookingFlowContract$Step.TimeSlotBooking) step;
            AsftTimeSlotBookingScreen asftTimeSlotBookingScreen = new AsftTimeSlotBookingScreen(new AsftTimeSlotBookingScreenContract$InputData(timeSlotBooking.f98782a, timeSlotBooking.f98783b));
            e block4 = new e(bVar, 5);
            Intrinsics.checkNotNullParameter(block4, "block");
            asftTimeSlotBookingScreen.H = block4;
            return asftTimeSlotBookingScreen;
        }
        if (step instanceof AsftPassBookingFlowContract$Step.TravellerDetails) {
            AsftPassBookingFlowContract$Step.TravellerDetails travellerDetails = (AsftPassBookingFlowContract$Step.TravellerDetails) step;
            AsftTravellerDetailsScreen asftTravellerDetailsScreen = new AsftTravellerDetailsScreen(new AsftTravellerDetailsScreenContract$InputData(travellerDetails.f98784a, travellerDetails.f98785b, travellerDetails.f98786c, travellerDetails.d, travellerDetails.e));
            e block5 = new e(bVar, 4);
            Intrinsics.checkNotNullParameter(block5, "block");
            asftTravellerDetailsScreen.H = block5;
            return asftTravellerDetailsScreen;
        }
        if (!(step instanceof AsftPassBookingFlowContract$Step.Checkout)) {
            throw new NoWhenBranchMatchedException();
        }
        AsftPassBookingFlowContract$Step.Checkout checkout = (AsftPassBookingFlowContract$Step.Checkout) step;
        String str = checkout.f98778a;
        String str2 = checkout.f98779b;
        AsftPassBookingFlowContract$UserBookingDetails asftPassBookingFlowContract$UserBookingDetails = checkout.f98780c;
        AsftCheckoutScreen asftCheckoutScreen = new AsftCheckoutScreen(new AsftCheckoutScreenContract$InputData(str, str2, asftPassBookingFlowContract$UserBookingDetails.f98787a, asftPassBookingFlowContract$UserBookingDetails.f98788b, asftPassBookingFlowContract$UserBookingDetails.f98789c, checkout.d, asftPassBookingFlowContract$UserBookingDetails.d, asftPassBookingFlowContract$UserBookingDetails.e));
        e block6 = new e(bVar, 3);
        Intrinsics.checkNotNullParameter(block6, "block");
        asftCheckoutScreen.H = block6;
        return asftCheckoutScreen;
    }

    private final Object h(Object obj2, Object obj3) {
        SwipeToActionLayout swipeToActionLayout = (SwipeToActionLayout) this.f289348b;
        o item = (o) obj2;
        SwipeToActionDelegate.SwipeAction action = (SwipeToActionDelegate.SwipeAction) obj3;
        SwipeToActionLayout.Companion companion = SwipeToActionLayout.INSTANCE;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(action, "action");
        swipeToActionLayout.b(item, action, swipeToActionLayout.onActionClickListener);
        return Unit.f186387a;
    }

    private final Object i(Object obj2, Object obj3) {
        final com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.a aVar = (com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.a) this.f289348b;
        InsuranceDetailsFlowContract$InputData insuranceDetailsFlowContract$InputData = aVar.o;
        final l FlowCoordinator = (l) obj2;
        InsuranceDetailsFlowContract$Step step = (InsuranceDetailsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof InsuranceDetailsFlowContract$Step.InsuranceDetails) {
            InsuranceDetailsLayoutScreen insuranceDetailsLayoutScreen = new InsuranceDetailsLayoutScreen(new InsuranceDetailsLayoutScreenContract$InputData(insuranceDetailsFlowContract$InputData.f76068a, insuranceDetailsFlowContract$InputData.f76069b));
            x block = new x(aVar, 18);
            Intrinsics.checkNotNullParameter(block, "block");
            insuranceDetailsLayoutScreen.H = block;
            return insuranceDetailsLayoutScreen;
        }
        if (step instanceof InsuranceDetailsFlowContract$Step.Documents) {
            InsuranceDocumentsLayoutScreen insuranceDocumentsLayoutScreen = new InsuranceDocumentsLayoutScreen(new InsuranceDocumentsLayoutScreenContract$InputData(insuranceDetailsFlowContract$InputData.f76068a));
            final int i = 0;
            Function1 block2 = new Function1() { // from class: vu7.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            h output = (h) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (!(output instanceof rv7.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            rv7.g gVar = (rv7.g) output;
                            oki.h.t2(aVar, FlowCoordinator, new InsuranceDetailsFlowContract$Step.SimpleTextDocument(gVar.f257724a, gVar.f257725b), false, null, false, 14);
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.a output2 = (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.a) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z = output2 instanceof k;
                            com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.a aVar2 = aVar;
                            if (z) {
                                k kVar = (k) output2;
                                aVar2.l2(new vq5.w(aVar2, kVar.f229975a, kVar.f229976b, null, 8), new yi5.b(26));
                            } else {
                                if (!(output2 instanceof a.C0507a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(aVar2, FlowCoordinator, InsuranceDetailsFlowContract$Step.MakeClaim.f76076a, false, null, false, 14);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            insuranceDocumentsLayoutScreen.H = block2;
            return insuranceDocumentsLayoutScreen;
        }
        if (step instanceof InsuranceDetailsFlowContract$Step.SimpleTextDocument) {
            InsuranceDetailsFlowContract$Step.SimpleTextDocument simpleTextDocument = (InsuranceDetailsFlowContract$Step.SimpleTextDocument) step;
            return new SimpleTextDocumentScreen(new SimpleTextDocumentScreenContract$InputData(simpleTextDocument.f76077a, simpleTextDocument.f76078b));
        }
        if (step instanceof InsuranceDetailsFlowContract$Step.GetHelp) {
            return new GetHelpScreen(new GetHelpScreenContract$InputData(insuranceDetailsFlowContract$InputData.f76068a));
        }
        if (step instanceof InsuranceDetailsFlowContract$Step.MakeClaim) {
            return new MakeClaimScreen(new MakeClaimScreenContract$InputData(insuranceDetailsFlowContract$InputData.f76068a));
        }
        if (step instanceof InsuranceDetailsFlowContract$Step.MakeCfacClaim) {
            return new CfacCoverageSelectionScreen(new CfacCoverageSelectionScreenContract$InputData(insuranceDetailsFlowContract$InputData.f76068a));
        }
        if (!(step instanceof InsuranceDetailsFlowContract$Step.Coverage)) {
            throw new NoWhenBranchMatchedException();
        }
        CoverageDetailsScreen coverageDetailsScreen = new CoverageDetailsScreen(new CoverageDetailsScreenContract$InputData(insuranceDetailsFlowContract$InputData.f76068a, ((InsuranceDetailsFlowContract$Step.Coverage) step).f76071a));
        final int i2 = 1;
        Function1 block3 = new Function1() { // from class: vu7.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        h output = (h) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        if (!(output instanceof rv7.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rv7.g gVar = (rv7.g) output;
                        oki.h.t2(aVar, FlowCoordinator, new InsuranceDetailsFlowContract$Step.SimpleTextDocument(gVar.f257724a, gVar.f257725b), false, null, false, 14);
                        return Unit.f186387a;
                    default:
                        com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.a output2 = (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.a) obj4;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        boolean z = output2 instanceof k;
                        com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.a aVar2 = aVar;
                        if (z) {
                            k kVar = (k) output2;
                            aVar2.l2(new vq5.w(aVar2, kVar.f229975a, kVar.f229976b, null, 8), new yi5.b(26));
                        } else {
                            if (!(output2 instanceof a.C0507a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.t2(aVar2, FlowCoordinator, InsuranceDetailsFlowContract$Step.MakeClaim.f76076a, false, null, false, 14);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        coverageDetailsScreen.H = block3;
        return coverageDetailsScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object j(Object obj2, Object obj3) {
        final com.revolut.feature.kyc.impl.dap.b bVar = (com.revolut.feature.kyc.impl.dap.b) this.f289348b;
        l FlowCoordinator = (l) obj2;
        DapFlowContract$Step step = (DapFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, DapFlowContract$Step.Intro.f77614a)) {
            if (!Intrinsics.f(step, DapFlowContract$Step.Sdk.f77615a)) {
                throw new NoWhenBranchMatchedException();
            }
            jv8.a aVar = jv8.a.DAP;
            ExternalAppKycProviderFlow externalAppKycProviderFlow = new ExternalAppKycProviderFlow(new ExternalAppKycProviderFlowContract$InputData(aVar.b(), aVar.a(), bVar.o.f77613a, bVar.f77616p.a(aVar), null, true));
            final int i = 0;
            Function1 block = new Function1() { // from class: vu8.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            ts8.e outputData = (ts8.e) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            com.revolut.feature.kyc.impl.dap.b bVar2 = bVar;
                            bVar2.l2(new vrl.d(outputData, bVar2, null, 3), new yi5.b(26));
                            break;
                        default:
                            d67.u outputData2 = (d67.u) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            com.revolut.feature.kyc.impl.dap.b bVar3 = bVar;
                            bVar3.l2(new com.revolut.feature.kyc.impl.dap.a(outputData2, bVar3, null), new yi5.b(26));
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            externalAppKycProviderFlow.H = block;
            return externalAppKycProviderFlow;
        }
        Object[] objArr = 0 == true ? 1 : 0;
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_vendors_dap_intro_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_vendors_dap_intro_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D177", null, null, null, 30), null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_vendors_dap_intro_action_manual_entry, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_vendors_dap_intro_action_dap, null, null, 14), (ResourceImage) objArr, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, 65112));
        final int i2 = 1;
        Function1 block2 = new Function1() { // from class: vu8.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        ts8.e outputData = (ts8.e) obj4;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        com.revolut.feature.kyc.impl.dap.b bVar2 = bVar;
                        bVar2.l2(new vrl.d(outputData, bVar2, null, 3), new yi5.b(26));
                        break;
                    default:
                        d67.u outputData2 = (d67.u) obj4;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        com.revolut.feature.kyc.impl.dap.b bVar3 = bVar;
                        bVar3.l2(new com.revolut.feature.kyc.impl.dap.a(outputData2, bVar3, null), new yi5.b(26));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        promptMarketingScreen.H = block2;
        return promptMarketingScreen;
    }

    private final Object k(Object obj2, Object obj3) {
        final com.revolut.feature.staking.impl.flow.stake.v2.a aVar = (com.revolut.feature.staking.impl.flow.stake.v2.a) this.f289348b;
        StakingControllerContract$InputData stakingControllerContract$InputData = aVar.o;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        StakingControllerContract$Step step = (StakingControllerContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, StakingControllerContract$Step.Blocked.f88128a)) {
            FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_stake_blocked_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_stake_blocked_dialog_description, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), xc.VERTICAL, null, null, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, true, null, null, null, false, 16743296));
            final int i = 3;
            Function1 block = new Function1() { // from class: vud.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter((com.revolut.feature.full_screen_prompt.c) obj4, "it");
                            oki.h.D2(aVar.f88137r);
                            return Unit.f186387a;
                        case 1:
                            ytd.c result = (ytd.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof ytd.b;
                            com.revolut.feature.staking.impl.flow.stake.v2.a aVar2 = aVar;
                            if (z) {
                                oki.h.D2(aVar2.f88137r);
                                aVar2.C2(result);
                            } else {
                                if (!(result instanceof ytd.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ytd.f fVar = (ytd.f) result;
                                oki.h.t2(aVar2, aVar2.f88137r, new StakingControllerContract$Step.Confirmation(fVar.f316702a, fVar.f316703b, fVar.f316704c, fVar.d), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            ytd.b it8 = (ytd.b) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.staking.impl.flow.stake.v2.a aVar3 = aVar;
                            oki.h.D2(aVar3.f88137r);
                            aVar3.C2(it8);
                            return Unit.f186387a;
                        default:
                            Intrinsics.checkNotNullParameter((com.revolut.feature.full_screen_prompt.c) obj4, "it");
                            oki.h.D2(aVar.f88137r);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            fullScreenPromptScreen.H = block;
            return fullScreenPromptScreen;
        }
        if (Intrinsics.f(step, StakingControllerContract$Step.Stake.f88133a)) {
            StakeController stakeController = new StakeController(stakingControllerContract$InputData.f88126b, stakingControllerContract$InputData.f88127c);
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: vud.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter((com.revolut.feature.full_screen_prompt.c) obj4, "it");
                            oki.h.D2(aVar.f88137r);
                            return Unit.f186387a;
                        case 1:
                            ytd.c result = (ytd.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof ytd.b;
                            com.revolut.feature.staking.impl.flow.stake.v2.a aVar2 = aVar;
                            if (z) {
                                oki.h.D2(aVar2.f88137r);
                                aVar2.C2(result);
                            } else {
                                if (!(result instanceof ytd.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ytd.f fVar = (ytd.f) result;
                                oki.h.t2(aVar2, aVar2.f88137r, new StakingControllerContract$Step.Confirmation(fVar.f316702a, fVar.f316703b, fVar.f316704c, fVar.d), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            ytd.b it8 = (ytd.b) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.staking.impl.flow.stake.v2.a aVar3 = aVar;
                            oki.h.D2(aVar3.f88137r);
                            aVar3.C2(it8);
                            return Unit.f186387a;
                        default:
                            Intrinsics.checkNotNullParameter((com.revolut.feature.full_screen_prompt.c) obj4, "it");
                            oki.h.D2(aVar.f88137r);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            stakeController.H = block2;
            return stakeController;
        }
        if (step instanceof StakingControllerContract$Step.StakingDetails) {
            StakingDetailsController stakingDetailsController = new StakingDetailsController(stakingControllerContract$InputData.f88126b);
            vsl.f block3 = new vsl.f(1, aVar, com.revolut.feature.staking.impl.flow.stake.v2.a.class, "handleStakingDetailsResult", "handleStakingDetailsResult(Lcom/revolut/kompot/common/IOData$Output;)V", 0, 2);
            Intrinsics.checkNotNullParameter(block3, "block");
            stakingDetailsController.H = block3;
            return stakingDetailsController;
        }
        if (Intrinsics.f(step, StakingControllerContract$Step.MaticBlocked.f88132a)) {
            FullScreenPromptScreen fullScreenPromptScreen2 = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_stake_matic_blocked_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_stake_matic_blocked_dialog_description, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), xc.VERTICAL, null, null, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, true, null, null, null, false, 16743296));
            final int i3 = 0;
            Function1 block4 = new Function1() { // from class: vud.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            Intrinsics.checkNotNullParameter((com.revolut.feature.full_screen_prompt.c) obj4, "it");
                            oki.h.D2(aVar.f88137r);
                            return Unit.f186387a;
                        case 1:
                            ytd.c result = (ytd.c) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof ytd.b;
                            com.revolut.feature.staking.impl.flow.stake.v2.a aVar2 = aVar;
                            if (z) {
                                oki.h.D2(aVar2.f88137r);
                                aVar2.C2(result);
                            } else {
                                if (!(result instanceof ytd.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ytd.f fVar = (ytd.f) result;
                                oki.h.t2(aVar2, aVar2.f88137r, new StakingControllerContract$Step.Confirmation(fVar.f316702a, fVar.f316703b, fVar.f316704c, fVar.d), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 2:
                            ytd.b it8 = (ytd.b) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.staking.impl.flow.stake.v2.a aVar3 = aVar;
                            oki.h.D2(aVar3.f88137r);
                            aVar3.C2(it8);
                            return Unit.f186387a;
                        default:
                            Intrinsics.checkNotNullParameter((com.revolut.feature.full_screen_prompt.c) obj4, "it");
                            oki.h.D2(aVar.f88137r);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            fullScreenPromptScreen2.H = block4;
            return fullScreenPromptScreen2;
        }
        if (!(step instanceof StakingControllerContract$Step.Confirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        StakingControllerContract$Step.Confirmation confirmation = (StakingControllerContract$Step.Confirmation) step;
        StakingConfirmationController stakingConfirmationController = new StakingConfirmationController(confirmation.f88129a, confirmation.f88130b, confirmation.f88131c, confirmation.d);
        final int i5 = 2;
        Function1 block5 = new Function1() { // from class: vud.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter((com.revolut.feature.full_screen_prompt.c) obj4, "it");
                        oki.h.D2(aVar.f88137r);
                        return Unit.f186387a;
                    case 1:
                        ytd.c result = (ytd.c) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z = result instanceof ytd.b;
                        com.revolut.feature.staking.impl.flow.stake.v2.a aVar2 = aVar;
                        if (z) {
                            oki.h.D2(aVar2.f88137r);
                            aVar2.C2(result);
                        } else {
                            if (!(result instanceof ytd.f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ytd.f fVar = (ytd.f) result;
                            oki.h.t2(aVar2, aVar2.f88137r, new StakingControllerContract$Step.Confirmation(fVar.f316702a, fVar.f316703b, fVar.f316704c, fVar.d), true, null, false, 12);
                        }
                        return Unit.f186387a;
                    case 2:
                        ytd.b it8 = (ytd.b) obj4;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        com.revolut.feature.staking.impl.flow.stake.v2.a aVar3 = aVar;
                        oki.h.D2(aVar3.f88137r);
                        aVar3.C2(it8);
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter((com.revolut.feature.full_screen_prompt.c) obj4, "it");
                        oki.h.D2(aVar.f88137r);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block5, "block");
        stakingConfirmationController.H = block5;
        return stakingConfirmationController;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v144 */
    /* JADX WARN: Type inference failed for: r0v145 */
    /* JADX WARN: Type inference failed for: r0v146 */
    /* JADX WARN: Type inference failed for: r0v150, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v151, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v17, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LocalDate localDate;
        String str;
        Object obj4;
        TradingAccountType tradingAccountType;
        boolean z;
        ?? arrayList;
        ?? arrayList2;
        Set set;
        String str2;
        Set set2;
        String str3;
        com.revolut.kompot.navigable.a aVarA;
        int i = this.f289347a;
        int i2 = 19;
        final int i3 = 2;
        Object obj5 = null;
        boolean z3 = false;
        int i5 = 14;
        final int i6 = 0;
        final int i21 = 1;
        Object obj6 = this.f289348b;
        switch (i) {
            case 0:
                PayBillsAndTaxesNavigation$InputData payBillsAndTaxesNavigation$InputData = ((com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow.b) obj6).o;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                BillsRoutingFlowContract$Step step = (BillsRoutingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof BillsRoutingFlowContract$Step.PayBillsAndTaxes) {
                    return new PayBillsAndTaxesFlow(payBillsAndTaxesNavigation$InputData);
                }
                if (step instanceof BillsRoutingFlowContract$Step.BillsCatalogue) {
                    return new BillsCatalogueFlow(new BillsCatalogueFlowContract$InputData(((BillsRoutingFlowContract$Step.BillsCatalogue) step).f78799a, xo1.b.BILL, payBillsAndTaxesNavigation$InputData.f78681a));
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.a) obj6;
                l FlowCoordinator = (l) obj2;
                SelfieIntroFlowContract$Step step2 = (SelfieIntroFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!Intrinsics.f(step2, SelfieIntroFlowContract$Step.SelfieIntro.f68481a)) {
                    if (!(step2 instanceof SelfieIntroFlowContract$Step.ModalStep.Cancellation)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SelfieIntroFlowContract$Step.ModalStep.Cancellation cancellation = (SelfieIntroFlowContract$Step.ModalStep.Cancellation) step2;
                    return ((com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c) aVar.f68484r).d3(cancellation.f68478a, cancellation.f68479b, cancellation.f68480c);
                }
                SelfieIntroScreen selfieIntroScreen = new SelfieIntroScreen();
                selfieIntroScreen.j2(new vch.a(aVar, 11));
                vh2.j block = new vh2.j(aVar, 6);
                Intrinsics.checkNotNullParameter(block, "block");
                selfieIntroScreen.H = block;
                return selfieIntroScreen;
            case 2:
                final com.revolut.feature.shops.impl.ui.bid_flow.c cVar = (com.revolut.feature.shops.impl.ui.bid_flow.c) obj6;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                ShopsBidFlowContract$Step step3 = (ShopsBidFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof ShopsBidFlowContract$Step.ProductArticleAuction) {
                    String str4 = ((ShopsBidFlowContract$Step.ProductArticleAuction) step3).f87139a;
                    cVar.H2(cVar.f87143r, new vgk.g(17));
                    return cVar.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(str4)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 24));
                }
                if (step3 instanceof ShopsBidFlowContract$Step.PlaceBid) {
                    ShopsBidFlowContract$Step.PlaceBid placeBid = (ShopsBidFlowContract$Step.PlaceBid) step3;
                    String str5 = placeBid.f87137a;
                    ShopsItemsBidScreen shopsItemsBidScreen = new ShopsItemsBidScreen(new ShopsItemsBidScreenContract$InputData(str5, placeBid.f87138b));
                    vgk.f block2 = new vgk.f(cVar, str5, 4);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    shopsItemsBidScreen.H = block2;
                    shopsItemsBidScreen.k2(new Function0() { // from class: vid.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i21) {
                                case 0:
                                    com.revolut.feature.shops.impl.ui.bid_flow.c cVar2 = cVar;
                                    if (!((ShopsBidFlowContract$FlowState) ((j2) cVar2.f87143r.f22677a).getValue()).f87130a) {
                                        cVar2.I2();
                                    }
                                    break;
                                default:
                                    com.revolut.feature.shops.impl.ui.bid_flow.c cVar3 = cVar;
                                    if (!((ShopsBidFlowContract$FlowState) ((j2) cVar3.f87143r.f22677a).getValue()).f87130a) {
                                        cVar3.I2();
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return shopsItemsBidScreen;
                }
                if (!(step3 instanceof ShopsBidFlowContract$Step.CustomBidInput)) {
                    throw new NoWhenBranchMatchedException();
                }
                ShopsBidFlowContract$Step.CustomBidInput customBidInput = (ShopsBidFlowContract$Step.CustomBidInput) step3;
                BidCustomInputScreen bidCustomInputScreen = new BidCustomInputScreen(new BidCustomInputContract$InputData(customBidInput.d, customBidInput.e, customBidInput.f87135b, customBidInput.f87134a, customBidInput.f87136c));
                vid.c block3 = new vid.c(cVar, i21);
                Intrinsics.checkNotNullParameter(block3, "block");
                bidCustomInputScreen.H = block3;
                bidCustomInputScreen.k2(new Function0() { // from class: vid.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                com.revolut.feature.shops.impl.ui.bid_flow.c cVar2 = cVar;
                                if (!((ShopsBidFlowContract$FlowState) ((j2) cVar2.f87143r.f22677a).getValue()).f87130a) {
                                    cVar2.I2();
                                }
                                break;
                            default:
                                com.revolut.feature.shops.impl.ui.bid_flow.c cVar3 = cVar;
                                if (!((ShopsBidFlowContract$FlowState) ((j2) cVar3.f87143r.f22677a).getValue()).f87130a) {
                                    cVar3.I2();
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
                return bidCustomInputScreen;
            case 3:
                List domain = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((vj1.b) obj6).f289630b.f("ADVISED_COMPONENTS_KEY", domain);
                return Unit.f186387a;
            case 4:
                com.revolut.feature.product.onboarding.flow.a aVar2 = (com.revolut.feature.product.onboarding.flow.a) obj6;
                i iVar = aVar2.u;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                ProductOnboardingFlowContract$Step step4 = (ProductOnboardingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof ProductOnboardingFlowContract$Step.Workflow) {
                    WorkflowFlow workflowFlowB = m.b(aVar2.f81258r, new WorkflowConfiguration.Workflow(((ProductOnboardingFlowContract$Step.Workflow) step4).f81255a, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), new WorkflowFlowType.Regular(0), null, 56);
                    vja.g block4 = new vja.g(aVar2, i3);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    workflowFlowB.H = block4;
                    return workflowFlowB;
                }
                if (step4 instanceof ProductOnboardingFlowContract$Step.DeclarationName) {
                    ProductOnboardingFlowContract$Step.DeclarationName declarationName = (ProductOnboardingFlowContract$Step.DeclarationName) step4;
                    pbl.a aVarValueOf = pbl.a.valueOf(declarationName.f81249a);
                    wi0.b bVar = declarationName.f81251c;
                    rbl.a aVar3 = iVar.c() ? rbl.a.BACK : rbl.a.NONE;
                    NamePrefill namePrefill = declarationName.f81250b;
                    ScreenConfiguration screenConfiguration = declarationName.d;
                    ViewController viewControllerE1 = aVar2.e1(new qbl.f(new NameControllerDescriptor$InputData(bVar, false, false, null, aVar3, aVarValueOf, namePrefill, new WorkflowScreenConfiguration(screenConfiguration.f81239a, screenConfiguration.f81240b, screenConfiguration.f81241c, null), null, 264)));
                    vja.g block5 = new vja.g(aVar2, 3);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    viewControllerE1.H = block5;
                    return viewControllerE1;
                }
                if (!(step4 instanceof ProductOnboardingFlowContract$Step.DeclarationDob)) {
                    if (!(step4 instanceof ProductOnboardingFlowContract$Step.DeclarationAddress)) {
                        if (!Intrinsics.f(step4, ProductOnboardingFlowContract$Step.Terminal.f81254a) && !(step4 instanceof ProductOnboardingFlowContract$Step.DeclarationCitizenship) && !(step4 instanceof ProductOnboardingFlowContract$Step.Form)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        yji.l.a1(aVar2, aVar2.X1(new y0("FINISH_DIALOG_ID", new j0((Clause) new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.product_eligibility_status_reviewing_information_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.product_eligibility_status_reviewing_information_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4060), false, 4)), null, null, new z1(aVar2, z3 ? 1 : 0, 3), 3);
                        return new LayoutViewerScreen(R$layout.screen_transparent);
                    }
                    ProductOnboardingFlowContract$Step.DeclarationAddress declarationAddress = (ProductOnboardingFlowContract$Step.DeclarationAddress) step4;
                    Address address = new Address(null, null, null, null, null, declarationAddress.f81244b.f297794a, null, null, null, null, null, null, null, null, null, 32735, null);
                    String str6 = declarationAddress.f81245c.f81239a;
                    if (str6 == null) {
                        str6 = "";
                    }
                    ViewController viewControllerE12 = aVar2.e1(new th1.a(new AddressFlowContract$InputData(address, new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, iVar.c() ? qh1.b.BACK : qh1.b.NONE, null, false, new AddressValidationMode.Verification(AddressVerificationUseCase.RESIDENTIAL), 784380), null, null, 6));
                    vja.g block6 = new vja.g(aVar2, i21);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    viewControllerE12.H = block6;
                    return viewControllerE12;
                }
                ProductOnboardingFlowContract$Step.DeclarationDob declarationDob = (ProductOnboardingFlowContract$Step.DeclarationDob) step4;
                DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateOfBirthValue dateOfBirthValue = declarationDob.f81247a;
                if (dateOfBirthValue != null && (str = dateOfBirthValue.f81215a) != null) {
                    try {
                        localDate = LocalDate.parse(str, dateTimeFormatterOfPattern);
                    } catch (Exception e) {
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                        localDate = null;
                    }
                    break;
                } else {
                    localDate = null;
                }
                ScreenConfiguration screenConfiguration2 = declarationDob.f81248b;
                ViewController viewControllerE13 = aVar2.e1(new qbl.e(new DateOfBirthControllerDescriptor$InputData(localDate, new DateOfBirthScreenConfig(null, new WorkflowScreenConfiguration(screenConfiguration2.f81239a, screenConfiguration2.f81240b, screenConfiguration2.f81241c, null), 11), iVar.c() ? rbl.a.BACK : rbl.a.NONE)));
                vgk.f block7 = new vgk.f(dateTimeFormatterOfPattern, aVar2, 5);
                Intrinsics.checkNotNullParameter(block7, "block");
                viewControllerE13.H = block7;
                return viewControllerE13;
            case 5:
                final com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                final EsimMobilePlanDetailsScreenContract$ModalStep step5 = (EsimMobilePlanDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof EsimMobilePlanDetailsScreenContract$ModalStep.CoverageCountries) {
                    return new EsimCountryPickerScreen(new EsimCountryPickerScreenContract$InputData.DisplayCountries(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plan_details_included_countries_title, null, null, 14), null, ((EsimMobilePlanDetailsScreenContract$ModalStep.CoverageCountries) step5).f101194a));
                }
                if (step5 instanceof EsimMobilePlanDetailsScreenContract$ModalStep.EsimMigration) {
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a aVar4 = cVar2.f101210s;
                    boolean z4 = ((EsimMobilePlanDetailsScreenContract$ModalStep.EsimMigration) step5).f101196a;
                    aVar4.getClass();
                    EsimMobilePlanEsimMigrationScreen esimMobilePlanEsimMigrationScreen = new EsimMobilePlanEsimMigrationScreen(z4 ? EsimMobilePlanEsimMigrationScreenContract$InputData.ActiveDataPlanExists.f101215a : EsimMobilePlanEsimMigrationScreenContract$InputData.NoActiveDataPlan.f101216a);
                    Function1 block8 = new Function1() { // from class: vjj.x
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i6) {
                                case 0:
                                    akj.c result = (akj.c) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!Intrinsics.f(result, c.a.f5968a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar2.O2(((EsimMobilePlanDetailsScreenContract$ModalStep.EsimMigration) step5).f101197b);
                                    return Unit.f186387a;
                                case 1:
                                    dii.g output = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (Intrinsics.f(output, dii.e.f115068a)) {
                                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar3 = cVar2;
                                        bjj.f fVar = cVar3.C;
                                        String str7 = ((EsimMobilePlanDetailsScreenContract$ModalStep.SubscriptionActivationConfirmation) step5).f101204a;
                                        String string = cVar3.F.a().toString();
                                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                        fVar.Z2(str7, string);
                                    }
                                    return Unit.f186387a;
                                default:
                                    dii.g output2 = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (Intrinsics.f(output2, dii.e.f115068a)) {
                                        cVar2.M2(((EsimMobilePlanDetailsScreenContract$ModalStep.CancellationConfirmation) step5).f101192a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    esimMobilePlanEsimMigrationScreen.H = block8;
                    return esimMobilePlanEsimMigrationScreen;
                }
                if (step5 instanceof EsimMobilePlanDetailsScreenContract$ModalStep.PerkInfoBottomSheet) {
                    EsimMobilePlanDetailsScreenContract$ModalStep.PerkInfoBottomSheet perkInfoBottomSheet = (EsimMobilePlanDetailsScreenContract$ModalStep.PerkInfoBottomSheet) step5;
                    return new EsimInfoBottomSheetScreen(new EsimInfoBottomSheetScreenContract$InputData(perkInfoBottomSheet.f101200a, perkInfoBottomSheet.f101201b));
                }
                if (step5 instanceof EsimMobilePlanDetailsScreenContract$ModalStep.EsimTransferConfirmation) {
                    EsimMobilePlanDetailsScreenContract$ModalStep.EsimTransferConfirmation esimTransferConfirmation = (EsimMobilePlanDetailsScreenContract$ModalStep.EsimTransferConfirmation) step5;
                    EsimMobilePlanEsimTransferInfoScreen esimMobilePlanEsimTransferInfoScreen = new EsimMobilePlanEsimTransferInfoScreen(new EsimMobilePlanEsimTransferInfoScreenContract$InputData(esimTransferConfirmation.f101198a));
                    vgk.f block9 = new vgk.f(cVar2, esimTransferConfirmation.f101199b, 7);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    esimMobilePlanEsimTransferInfoScreen.H = block9;
                    return esimMobilePlanEsimTransferInfoScreen;
                }
                if (step5 instanceof EsimMobilePlanDetailsScreenContract$ModalStep.RequestPacCode) {
                    return new EsimMobilePlanGetPortOutCredentialsScreen(new EsimMobilePlanGetPortOutCredentialsScreenContract$InputData(((EsimMobilePlanDetailsScreenContract$ModalStep.RequestPacCode) step5).f101202a, pfj.c.PAC));
                }
                if (step5 instanceof EsimMobilePlanDetailsScreenContract$ModalStep.EsimInstallation) {
                    ViewController viewControllerE14 = cVar2.e1(new fej.c(new EsimInstallationFlowDescriptor$InputData(((EsimMobilePlanDetailsScreenContract$ModalStep.EsimInstallation) step5).f101195a, EsimInstallationFlowDescriptor$Start.DirectInstallation, false)));
                    vh2.j block10 = new vh2.j(cVar2, 11);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    viewControllerE14.H = block10;
                    return viewControllerE14;
                }
                if (step5 instanceof EsimMobilePlanDetailsScreenContract$ModalStep.SubscriptionActivationConfirmation) {
                    cVar2.D.getClass();
                    com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetControllerA = bjj.a.a();
                    Function1 block11 = new Function1() { // from class: vjj.x
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i21) {
                                case 0:
                                    akj.c result = (akj.c) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!Intrinsics.f(result, c.a.f5968a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar2.O2(((EsimMobilePlanDetailsScreenContract$ModalStep.EsimMigration) step5).f101197b);
                                    return Unit.f186387a;
                                case 1:
                                    dii.g output = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (Intrinsics.f(output, dii.e.f115068a)) {
                                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar3 = cVar2;
                                        bjj.f fVar = cVar3.C;
                                        String str7 = ((EsimMobilePlanDetailsScreenContract$ModalStep.SubscriptionActivationConfirmation) step5).f101204a;
                                        String string = cVar3.F.a().toString();
                                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                        fVar.Z2(str7, string);
                                    }
                                    return Unit.f186387a;
                                default:
                                    dii.g output2 = (dii.g) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (Intrinsics.f(output2, dii.e.f115068a)) {
                                        cVar2.M2(((EsimMobilePlanDetailsScreenContract$ModalStep.CancellationConfirmation) step5).f101192a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    actionsBottomSheetControllerA.H = block11;
                    return actionsBottomSheetControllerA;
                }
                if (!(step5 instanceof EsimMobilePlanDetailsScreenContract$ModalStep.CancellationConfirmation)) {
                    if (step5 instanceof EsimMobilePlanDetailsScreenContract$ModalStep.ShareEsim) {
                        return new EsimShareQrCodeScreen(new EsimShareQrCodeScreenContract$InputData(((EsimMobilePlanDetailsScreenContract$ModalStep.ShareEsim) step5).f101203a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetControllerA2 = cVar2.E.a(((EsimMobilePlanDetailsScreenContract$ModalStep.CancellationConfirmation) step5).f101193b);
                Function1 block12 = new Function1() { // from class: vjj.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i3) {
                            case 0:
                                akj.c result = (akj.c) obj7;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (!Intrinsics.f(result, c.a.f5968a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar2.O2(((EsimMobilePlanDetailsScreenContract$ModalStep.EsimMigration) step5).f101197b);
                                return Unit.f186387a;
                            case 1:
                                dii.g output = (dii.g) obj7;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (Intrinsics.f(output, dii.e.f115068a)) {
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar3 = cVar2;
                                    bjj.f fVar = cVar3.C;
                                    String str7 = ((EsimMobilePlanDetailsScreenContract$ModalStep.SubscriptionActivationConfirmation) step5).f101204a;
                                    String string = cVar3.F.a().toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                    fVar.Z2(str7, string);
                                }
                                return Unit.f186387a;
                            default:
                                dii.g output2 = (dii.g) obj7;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (Intrinsics.f(output2, dii.e.f115068a)) {
                                    cVar2.M2(((EsimMobilePlanDetailsScreenContract$ModalStep.CancellationConfirmation) step5).f101192a);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block12, "block");
                actionsBottomSheetControllerA2.H = block12;
                return actionsBottomSheetControllerA2;
            case 6:
                com.revolut.feature.alipay.impl.ui.qr.a aVar5 = (com.revolut.feature.alipay.impl.ui.qr.a) obj6;
                ali.b PagerCoordinator = (ali.b) obj2;
                AlipayPlusQrFlowContract$Page item = (AlipayPlusQrFlowContract$Page) obj3;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(item, "item");
                if (!Intrinsics.f(item, AlipayPlusQrFlowContract$Page.Scanner.f61071a)) {
                    if (Intrinsics.f(item, AlipayPlusQrFlowContract$Page.ShowCode.f61072a)) {
                        return new AlipayPlusShowCodeScreen();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                AlipayPlusQrScannerFlow alipayPlusQrScannerFlow = new AlipayPlusQrScannerFlow();
                vh2.j block13 = new vh2.j(aVar5, 12);
                Intrinsics.checkNotNullParameter(block13, "block");
                alipayPlusQrScannerFlow.H = block13;
                return alipayPlusQrScannerFlow;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return (List) ((com.revolut.feature.wealth.ui.impl.documents.details.b) obj6).e.getValue();
            case 8:
                com.revolut.feature.apm.bills.boleto.impl.finder.flow.a aVar6 = (com.revolut.feature.apm.bills.boleto.impl.finder.flow.a) obj6;
                yki.b LazyFlowCoordinator4 = (yki.b) obj2;
                BoletoFinderFlowContract$Step step6 = (BoletoFinderFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator4, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (Intrinsics.f(step6, BoletoFinderFlowContract$Step.HiddenBoletos.f61170a)) {
                    return new HiddenBoletosScreen();
                }
                if (step6 instanceof BoletoFinderFlowContract$Step.BoletosInfo) {
                    BoletosInfoScreen boletosInfoScreen = new BoletosInfoScreen();
                    vgk.f block14 = new vgk.f(aVar6, LazyFlowCoordinator4, i5);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    boletosInfoScreen.H = block14;
                    boletosInfoScreen.k2(new vch.a(aVar6, i5));
                    obj4 = boletosInfoScreen;
                } else {
                    if (!(step6 instanceof BoletoFinderFlowContract$Step.DeactivateBoletoFinder)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BoletoFinderDeactivateScreen boletoFinderDeactivateScreen = new BoletoFinderDeactivateScreen();
                    dph.c block15 = new dph.c(aVar6, LazyFlowCoordinator4, 24);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    boletoFinderDeactivateScreen.H = block15;
                    boletoFinderDeactivateScreen.k2(new vch.a(aVar6, i5));
                    obj4 = boletoFinderDeactivateScreen;
                }
                return obj4;
            case 9:
                OAuthAuthorizeParams params = (OAuthAuthorizeParams) obj2;
                ymi.i result = (ymi.i) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(result, "result");
                ((vmi.d) obj6).f290600b.f(vmi.d.c(params), result);
                return Unit.f186387a;
            case 10:
                IbanScreen ibanScreen = (IbanScreen) obj6;
                InputTextDelegate.Model input = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                IbanScreen.Companion aVar7 = IbanScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(field, "field");
                String str7 = input.f52580a;
                MaskedTextInputEditText innerEditText = field.getInnerEditText();
                x0 x0Var = (x0) ibanScreen.N.getValue();
                switch (x0Var.f305155a) {
                    case 0:
                        ((p) x0Var.f305157c.v).getClass();
                        b3j.f.a();
                        break;
                    case 1:
                        ((p) x0Var.f305157c.v).getClass();
                        b3j.f.a();
                        break;
                    default:
                        ((p) x0Var.f305157c.v).getClass();
                        b3j.f.a();
                        break;
                }
                BankFieldDefinition definition = ibanScreen.K.d;
                Intrinsics.checkNotNullParameter(definition, "definition");
                return new y(innerEditText, null, z2j.e.b(definition), new vif.c(ibanScreen, 27), str7, null, false, 98);
            case 11:
                com.revolut.feature.user_declarations.shared.flows.income.a aVar8 = (com.revolut.feature.user_declarations.shared.flows.income.a) obj6;
                l FlowCoordinator2 = (l) obj2;
                IncomeFlowContract$Step step7 = (IncomeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!(step7 instanceof IncomeFlowContract$Step.Income)) {
                    throw new NoWhenBranchMatchedException();
                }
                IncomeFlowInputData incomeFlowInputData = aVar8.o;
                IncomeScreen incomeScreen = new IncomeScreen(new IncomeScreenContract$InputData(incomeFlowInputData.f105018a, incomeFlowInputData.f105019b, incomeFlowInputData.f105020c, incomeFlowInputData.d, incomeFlowInputData.e, incomeFlowInputData.f, incomeFlowInputData.f105021g, incomeFlowInputData.f105022h));
                vh2.j block16 = new vh2.j(aVar8, 22);
                Intrinsics.checkNotNullParameter(block16, "block");
                incomeScreen.H = block16;
                return incomeScreen;
            case 12:
                final com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar2 = (com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) obj6;
                JuniorSecurityAndPrivacyControllerContract$InputData juniorSecurityAndPrivacyControllerContract$InputData = bVar2.o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                JuniorSecurityAndPrivacyControllerContract$ModalStep step8 = (JuniorSecurityAndPrivacyControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof JuniorSecurityAndPrivacyControllerContract$ModalStep.LogoutConfirmation) {
                    LogoutConfirmationController logoutConfirmationController = new LogoutConfirmationController(new no8.g(((JuniorSecurityAndPrivacyControllerContract$ModalStep.LogoutConfirmation) step8).f77326a));
                    Function1 block17 = new Function1() { // from class: vo8.s
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i21) {
                                case 0:
                                    ti8.f it8 = (ti8.f) obj7;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (Intrinsics.f(it8, ti8.d.f271447a)) {
                                        bVar2.X1(new mii.k("DIALOG_ID_SETTING_CHANGED", new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.youth_settings_enable_payment_links_sheet_toast_enabled, null, null, 14), null, null, null, 28));
                                    } else if (!Intrinsics.f(it8, ti8.e.f271448a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar3 = bVar2;
                                    cli.y yVar = bVar3.C;
                                    no8.k output = (no8.k) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (Intrinsics.f(output, no8.i.f217953a)) {
                                        Object content = ((p) ((j2) yVar.f22677a).getValue()).f290900a.getContent();
                                        if (content == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        bVar3.X1(new y0(null, new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_logout_confirmation_success_title, zhm.u.c(((JuniorBankingProfile) content).f77099b), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 5));
                                    } else if (!Intrinsics.f(output, no8.h.f217952a)) {
                                        if (!(output instanceof no8.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String str8 = ((no8.j) output).f217954a;
                                        Object content2 = ((p) ((j2) yVar.f22677a).getValue()).f290900a.getContent();
                                        if (content2 == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        yji.l.a1(bVar3, bVar3.X1(new y0(null, new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_logout_confirmation_success_title, zhm.u.c(((JuniorBankingProfile) content2).f77099b), null, 12), (Clause) new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_logout_confirmation_success_subtitle, zhm.u.c(z80.b.b(bVar3.f77339y, str8, null, null, 6)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 5)), null, null, new tk9.i(2, 19, null), 3);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    logoutConfirmationController.H = block17;
                    return logoutConfirmationController;
                }
                if (step8 instanceof JuniorSecurityAndPrivacyControllerContract$ModalStep.PaymentsSettingsExplanatory) {
                    JuniorSecurityAndPrivacyControllerContract$ModalStep.PaymentsSettingsExplanatory paymentsSettingsExplanatory = (JuniorSecurityAndPrivacyControllerContract$ModalStep.PaymentsSettingsExplanatory) step8;
                    JuniorPaymentsSettingsExplanatoryController juniorPaymentsSettingsExplanatoryController = new JuniorPaymentsSettingsExplanatoryController(new JuniorPaymentsSettingsExplanatoryControllerContract$Input(juniorSecurityAndPrivacyControllerContract$InputData.f77325a, paymentsSettingsExplanatory.f77329a, paymentsSettingsExplanatory.f77330b, paymentsSettingsExplanatory.f77331c));
                    vgk.f block18 = new vgk.f(bVar2, step8, i2);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    juniorPaymentsSettingsExplanatoryController.H = block18;
                    return juniorPaymentsSettingsExplanatoryController;
                }
                if (!(step8 instanceof JuniorSecurityAndPrivacyControllerContract$ModalStep.PaymentLinksConsent)) {
                    throw new NoWhenBranchMatchedException();
                }
                JuniorSecurityAndPrivacyControllerContract$ModalStep.PaymentLinksConsent paymentLinksConsent = (JuniorSecurityAndPrivacyControllerContract$ModalStep.PaymentLinksConsent) step8;
                ViewController viewControllerE15 = bVar2.e1(new ti8.c(new JuniorPaymentLinksConsentInput(juniorSecurityAndPrivacyControllerContract$InputData.f77325a, paymentLinksConsent.f77327a, paymentLinksConsent.f77328b, false)));
                Function1 block19 = new Function1() { // from class: vo8.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i6) {
                            case 0:
                                ti8.f it8 = (ti8.f) obj7;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                if (Intrinsics.f(it8, ti8.d.f271447a)) {
                                    bVar2.X1(new mii.k("DIALOG_ID_SETTING_CHANGED", new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.youth_settings_enable_payment_links_sheet_toast_enabled, null, null, 14), null, null, null, 28));
                                } else if (!Intrinsics.f(it8, ti8.e.f271448a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                            default:
                                com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar3 = bVar2;
                                cli.y yVar = bVar3.C;
                                no8.k output = (no8.k) obj7;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (Intrinsics.f(output, no8.i.f217953a)) {
                                    Object content = ((p) ((j2) yVar.f22677a).getValue()).f290900a.getContent();
                                    if (content == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    bVar3.X1(new y0(null, new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_logout_confirmation_success_title, zhm.u.c(((JuniorBankingProfile) content).f77099b), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 5));
                                } else if (!Intrinsics.f(output, no8.h.f217952a)) {
                                    if (!(output instanceof no8.j)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    String str8 = ((no8.j) output).f217954a;
                                    Object content2 = ((p) ((j2) yVar.f22677a).getValue()).f290900a.getContent();
                                    if (content2 == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    yji.l.a1(bVar3, bVar3.X1(new y0(null, new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_logout_confirmation_success_title, zhm.u.c(((JuniorBankingProfile) content2).f77099b), null, 12), (Clause) new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_logout_confirmation_success_subtitle, zhm.u.c(z80.b.b(bVar3.f77339y, str8, null, null, 6)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 5)), null, null, new tk9.i(2, 19, null), 3);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block19, "block");
                viewControllerE15.H = block19;
                return viewControllerE15;
            case 13:
                com.revolut.sso.impl.ui.protection_check.flow.a aVar9 = (com.revolut.sso.impl.ui.protection_check.flow.a) obj6;
                l FlowCoordinator3 = (l) obj2;
                ProtectionCheckFlowContract$Step it8 = (ProtectionCheckFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f((ProtectionCheckFlowContract$Step) FlowCoordinator3.d(), ProtectionCheckFlowContract$Step.ShowProtectionCheckScreen.f106686a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProtectionCheckScreen protectionCheckScreen = new ProtectionCheckScreen();
                vgk.f fVar = new vgk.f(aVar9, FlowCoordinator3, 20);
                Intrinsics.checkNotNullParameter(fVar, "<set-?>");
                protectionCheckScreen.H = fVar;
                return protectionCheckScreen;
            case 14:
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar10 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                IncomeSorterDestinationsContract$ModalStep step9 = (IncomeSorterDestinationsContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof IncomeSorterDestinationsContract$ModalStep.WealthAssetSelection)) {
                    if (!(step9 instanceof IncomeSorterDestinationsContract$ModalStep.CryptoSeeAllStep)) {
                        if (!(step9 instanceof IncomeSorterDestinationsContract$ModalStep.WealthDisclaimerStep)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        IncomeSorterDestinationsContract$SectionInfoParcel incomeSorterDestinationsContract$SectionInfoParcel = ((IncomeSorterDestinationsContract$ModalStep.WealthDisclaimerStep) step9).f87729a;
                        return new IncomeSorterDisclaimerBottomSheetController(new eqd.c(null, incomeSorterDestinationsContract$SectionInfoParcel.f87730a, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), incomeSorterDestinationsContract$SectionInfoParcel.f87731b));
                    }
                    IncomeSorterDestinationsContract$ModalStep.CryptoSeeAllStep cryptoSeeAllStep = (IncomeSorterDestinationsContract$ModalStep.CryptoSeeAllStep) step9;
                    ViewController viewControllerE16 = aVar10.e1(new com.revolut.feature_crypto_picker.api.a(new CryptoPickerDestination.CryptoPickerInputData(cryptoSeeAllStep.f87725b, cryptoSeeAllStep.f87724a, (CryptoPickerDestination.CryptoPickerConfig) null, 8)));
                    a0 block20 = new a0(aVar10, i21);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    viewControllerE16.H = block20;
                    return viewControllerE16;
                }
                IncomeSorterDestinationsContract$ModalStep.WealthAssetSelection wealthAssetSelection = (IncomeSorterDestinationsContract$ModalStep.WealthAssetSelection) step9;
                com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar11 = wealthAssetSelection.f87726a;
                ArrayList arrayList3 = wealthAssetSelection.f87727b;
                String str8 = wealthAssetSelection.f87728c;
                int i22 = c0.f291155a[aVar11.ordinal()];
                if (i22 == 1) {
                    tradingAccountType = TradingAccountType.Gia.f105270a;
                } else {
                    if (i22 != 2 && i22 != 3 && i22 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tradingAccountType = TradingAccountType.Taa.f105275a;
                }
                ArrayList<IncomeSorterDestinationInfo.Investment.CashHolding> arrayList4 = new ArrayList();
                for (Object obj7 : arrayList3) {
                    if (obj7 instanceof IncomeSorterDestinationInfo.Investment.CashHolding) {
                        arrayList4.add(obj7);
                    }
                }
                if (arrayList4.isEmpty()) {
                    z = false;
                } else {
                    for (IncomeSorterDestinationInfo.Investment.CashHolding cashHolding : arrayList4) {
                        if (cashHolding.f == aVar11 && Intrinsics.f(cashHolding.e, str8)) {
                            z = true;
                        }
                    }
                    z = false;
                }
                y1h.f fVar2 = y1h.f.CAN_BUY_AND_NOT_HALTED;
                Set setI = z0.i(z ? new AssetSelectionCategory.Cash(tradingAccountType, str8) : null, new AssetSelectionCategory.Stock(str8, fVar2), new AssetSelectionCategory.Etp(str8, false, fVar2));
                aVar10.f87736t.getClass();
                TextLocalisedClause textLocalisedClauseC = end.f.c(aVar11, arrayList3, str8);
                y1h.e eVar = y1h.e.MULTI;
                vpd.l lVar = ((vpd.d) ((j2) aVar10.v.f22677a).getValue()).f291157b;
                vpd.j jVar = lVar instanceof vpd.j ? (vpd.j) lVar : null;
                if (jVar == null || (set2 = jVar.f291169a) == null) {
                    arrayList = 0;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj8 : set2) {
                        if (obj8 instanceof IncomeSorterDestinationInfo.Investment) {
                            arrayList5.add(obj8);
                        }
                    }
                    ArrayList<IncomeSorterDestinationInfo.Investment> arrayList6 = new ArrayList();
                    for (Object obj9 : arrayList5) {
                        IncomeSorterDestinationInfo.Investment investment = (IncomeSorterDestinationInfo.Investment) obj9;
                        if (investment.getK() == aVar11 && Intrinsics.f(investment.getF87475j(), str8)) {
                            arrayList6.add(obj9);
                        }
                    }
                    arrayList = new ArrayList(w.t(arrayList6, 10));
                    for (IncomeSorterDestinationInfo.Investment investment2 : arrayList6) {
                        if (investment2 instanceof IncomeSorterDestinationInfo.Investment.CashHolding) {
                            str3 = ((IncomeSorterDestinationInfo.Investment.CashHolding) investment2).f87465a.f306286a;
                        } else {
                            if (!(investment2 instanceof IncomeSorterDestinationInfo.Investment.Instrument)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str3 = ((IncomeSorterDestinationInfo.Investment.Instrument) investment2).f87470a;
                        }
                        arrayList.add(str3);
                    }
                }
                if (arrayList == 0) {
                    arrayList = f0.f322471a;
                }
                Set setI1 = d0.i1((Iterable) arrayList);
                IncomeSorterDestinationsContract$InputData.SelectionMode selectionMode = aVar10.o.f87718a;
                IncomeSorterDestinationsContract$InputData.SelectionMode.DestinationsSelection destinationsSelection = selectionMode instanceof IncomeSorterDestinationsContract$InputData.SelectionMode.DestinationsSelection ? (IncomeSorterDestinationsContract$InputData.SelectionMode.DestinationsSelection) selectionMode : null;
                if (destinationsSelection == null || (set = destinationsSelection.f87720a) == null) {
                    arrayList2 = 0;
                } else {
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj10 : set) {
                        if (obj10 instanceof IncomeSorterDestinationInfo.Investment) {
                            arrayList7.add(obj10);
                        }
                    }
                    ArrayList<IncomeSorterDestinationInfo.Investment> arrayList8 = new ArrayList();
                    for (Object obj11 : arrayList7) {
                        IncomeSorterDestinationInfo.Investment investment3 = (IncomeSorterDestinationInfo.Investment) obj11;
                        if (investment3.getK() == aVar11 && Intrinsics.f(investment3.getF87475j(), str8)) {
                            arrayList8.add(obj11);
                        }
                    }
                    arrayList2 = new ArrayList(w.t(arrayList8, 10));
                    for (IncomeSorterDestinationInfo.Investment investment4 : arrayList8) {
                        if (investment4 instanceof IncomeSorterDestinationInfo.Investment.CashHolding) {
                            str2 = ((IncomeSorterDestinationInfo.Investment.CashHolding) investment4).f87465a.f306286a;
                        } else {
                            if (!(investment4 instanceof IncomeSorterDestinationInfo.Investment.Instrument)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str2 = ((IncomeSorterDestinationInfo.Investment.Instrument) investment4).f87470a;
                        }
                        arrayList2.add(str2);
                    }
                }
                if (arrayList2 == 0) {
                    arrayList2 = f0.f322471a;
                }
                Set setI12 = d0.i1((Iterable) arrayList2);
                Iterator it9 = setI.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next = it9.next();
                        if (((AssetSelectionCategory) next) instanceof AssetSelectionCategory.Stock) {
                            obj5 = next;
                        }
                    }
                }
                ViewController viewControllerE17 = aVar10.e1(new z1h.a(textLocalisedClauseC, eVar, setI, setI1, setI12, (AssetSelectionCategory) obj5));
                vgk.f block21 = new vgk.f(aVar10, wealthAssetSelection, 21);
                Intrinsics.checkNotNullParameter(block21, "block");
                viewControllerE17.H = block21;
                return viewControllerE17;
            case 15:
                com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.b bVar3 = (com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.b) obj6;
                yki.b LazyFlowCoordinator5 = (yki.b) obj2;
                CreditCardLimitDecreaseFlowContract$Step step10 = (CreditCardLimitDecreaseFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator5, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof CreditCardLimitDecreaseFlowContract$Step.Amount) {
                    CreditCardLimitDecreaseFlowContract$Step.Amount amount = (CreditCardLimitDecreaseFlowContract$Step.Amount) step10;
                    CreditCardLimitDecreaseAmountScreen creditCardLimitDecreaseAmountScreen = new CreditCardLimitDecreaseAmountScreen(new CreditCardLimitDecreaseAmountScreenContract$InputData(bVar3.o.f69195a, amount.f69196a, amount.f69197b, amount.f69198c));
                    vq4.c block22 = new vq4.c(bVar3, i21);
                    Intrinsics.checkNotNullParameter(block22, "block");
                    creditCardLimitDecreaseAmountScreen.H = block22;
                    aVarA = creditCardLimitDecreaseAmountScreen;
                } else if (step10 instanceof CreditCardLimitDecreaseFlowContract$Step.Ineligible) {
                    vq4.f fVar3 = bVar3.f69203r;
                    kl4.a aVar12 = ((CreditCardLimitDecreaseFlowContract$Step.Ineligible) step10).f69200a;
                    fVar3.getClass();
                    int i32 = aVar12 == null ? -1 : vq4.e.f291311a[aVar12.ordinal()];
                    if (i32 == -1) {
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_limit_decrease_dialog_unavailable_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_limit_decrease_dialog_unavailable_description, null, null, 14);
                        BottomSheet.ActionItem actionItem = new BottomSheet.ActionItem(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), null);
                        k9 k9Var = k9.Credit;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        aVarA = BottomSheet.b(textLocalisedClause, textLocalisedClause2, null, null, actionItem, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 172);
                    } else if (i32 == 1) {
                        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_card_limit_decrease_dialog_unavailable_facility_recently_opened_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_card_limit_decrease_dialog_unavailable_facility_recently_opened_description, null, null, 14);
                        BottomSheet.ActionItem actionItem2 = new BottomSheet.ActionItem(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), null);
                        k9 k9Var2 = k9.Credit;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                        aVarA = BottomSheet.b(textLocalisedClause3, textLocalisedClause4, null, null, actionItem2, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), 172);
                    } else if (i32 == 2) {
                        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.credit_card_limit_decrease_dialog_unavailable_recent_credit_limit_change_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.credit_card_limit_decrease_dialog_unavailable_recent_credit_limit_change_description, null, null, 14);
                        BottomSheet.ActionItem actionItem3 = new BottomSheet.ActionItem(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), null);
                        k9 k9Var3 = k9.Credit;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                        aVarA = BottomSheet.b(textLocalisedClause5, textLocalisedClause6, null, null, actionItem3, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), 172);
                    } else if (i32 == 3) {
                        TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.credit_card_limit_decrease_dialog_unavailable_facility_is_late_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.credit_card_limit_decrease_dialog_unavailable_facility_is_late_description, null, null, 14);
                        BottomSheet.ActionItem actionItem4 = new BottomSheet.ActionItem(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), null);
                        k9 k9Var4 = k9.Credit;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                        aVarA = BottomSheet.b(textLocalisedClause7, textLocalisedClause8, null, null, actionItem4, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), 172);
                    } else {
                        if (i32 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(R$string.credit_card_limit_decrease_dialog_unavailable_offer_not_affordable_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause10 = new TextLocalisedClause(R$string.credit_card_limit_decrease_dialog_unavailable_offer_not_affordable_description, null, null, 14);
                        BottomSheet.ActionItem actionItem5 = new BottomSheet.ActionItem(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), null);
                        k9 k9Var5 = k9.Credit;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                        aVarA = BottomSheet.b(textLocalisedClause9, textLocalisedClause10, null, null, actionItem5, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), 172);
                    }
                } else {
                    if (!(step10 instanceof CreditCardLimitDecreaseFlowContract$Step.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar3.f69202q.getClass();
                    aVarA = vt4.a.a();
                }
                aVarA.l2(new vch.a(bVar3, 20));
                return aVarA;
            case 16:
                final com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar13 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) obj6;
                z zVar = aVar13.f71325r;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CryptoSendConfirmationControllerContract$Step step11 = (CryptoSendConfirmationControllerContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof CryptoSendConfirmationControllerContract$Step.Fees) {
                    tp5.b bVar4 = zVar.f291348a;
                    com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_review_withdrawal_details_fees_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_review_withdrawal_details_fees_subtitle, null, null, 14), null, null, false, 28), new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_learn_more, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), AnalyticsProduct.Shared.Crypto.f, null, null, 24));
                    Function1 block23 = new Function1() { // from class: vq5.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj12) {
                            dii.g result2 = (dii.g) obj12;
                            switch (i21) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof dii.c) {
                                        com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar14 = aVar13;
                                        do3.n nVar = (do3.n) ((g) ((j2) aVar14.D.f22677a).getValue()).i.getContent();
                                        if (nVar != null) {
                                            aVar14.n2(new vnl.o(aVar14, do3.q.y(nVar), null, 1), new whi.b(6));
                                        }
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (Intrinsics.f(result2, dii.e.f115068a)) {
                                        aVar13.C1(u0.b(new FeatureCommand(new FaqFeatureConfig.Starter("question.how-much-does-it-cost-to-withdraw-crypto", 2))));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block23, "block");
                    actionsBottomSheetController.H = block23;
                    return actionsBottomSheetController;
                }
                if (step11 instanceof CryptoSendConfirmationControllerContract$Step.RemainingLimit) {
                    return new CryptoSendRemainingLimitController(new CryptoSendRemainingLimitControllerContract$Input(((CryptoSendConfirmationControllerContract$Step.RemainingLimit) step11).f71322a));
                }
                if (!(step11 instanceof CryptoSendConfirmationControllerContract$Step.CrossCurrencyPrice)) {
                    if (!(step11 instanceof CryptoSendConfirmationControllerContract$Step.FeeBreakdown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CryptoSendConfirmationControllerContract$Step.FeeBreakdown feeBreakdown = (CryptoSendConfirmationControllerContract$Step.FeeBreakdown) step11;
                    return new CryptoFeeBreakdownDialogController(new CryptoFeeBreakdownDialogInput.WithBreakdown(feeBreakdown.f71319a, feeBreakdown.f71320b));
                }
                com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController2 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_review_withdrawal_details_price_title, null, null, 14), zVar.f291348a.a(), null, null, false, 28), new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), AnalyticsProduct.Shared.Crypto.f, null, null, 24));
                Function1 block24 = new Function1() { // from class: vq5.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj12) {
                        dii.g result2 = (dii.g) obj12;
                        switch (i6) {
                            case 0:
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof dii.c) {
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar14 = aVar13;
                                    do3.n nVar = (do3.n) ((g) ((j2) aVar14.D.f22677a).getValue()).i.getContent();
                                    if (nVar != null) {
                                        aVar14.n2(new vnl.o(aVar14, do3.q.y(nVar), null, 1), new whi.b(6));
                                    }
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (Intrinsics.f(result2, dii.e.f115068a)) {
                                    aVar13.C1(u0.b(new FeatureCommand(new FaqFeatureConfig.Starter("question.how-much-does-it-cost-to-withdraw-crypto", 2))));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block24, "block");
                actionsBottomSheetController2.H = block24;
                return actionsBottomSheetController2;
            case 17:
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.a aVar14 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EmployerDetailsScreenContract$ModalStep step12 = (EmployerDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof EmployerDetailsScreenContract$ModalStep.Help)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar14.o.getClass();
                lw0.a aVar15 = new lw0.a(new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_cnpj_help_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_cnpj_help_description, null, null, 14), null, null, false, 28);
                aw0.e eVar2 = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_cnpj_help_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                k9 k9Var6 = k9.Retail;
                Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                return new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(aVar15, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6), null, null, 24));
            case 18:
                return a(obj2, obj3);
            case 19:
                return b(obj2, obj3);
            case 20:
                return c(obj2, obj3);
            case 21:
                return d(obj2, obj3);
            case 22:
                TicketDetails ticketDetails = (TicketDetails) obj6;
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                aim.e eVarB = u.b();
                eVarB.add(CellDetailsDelegate.Model.e(vse.e.e(ticketDetails, false), null, null, false, 67104767));
                zhm.a0.x(vse.a.a(ticketDetails, getDefaultErrorItems), eVarB);
                return u.a(eVarB);
            case 23:
                return e(obj2, obj3);
            case 24:
                return g(obj2, obj3);
            case 25:
                return h(obj2, obj3);
            case 26:
                return i(obj2, obj3);
            case 27:
                return j(obj2, obj3);
            case 28:
                return k(obj2, obj3);
            default:
                com.revolut.feature.credit.card.impl.ui.statement.transactions.flow.a aVar16 = (com.revolut.feature.credit.card.impl.ui.statement.transactions.flow.a) obj6;
                l FlowCoordinator4 = (l) obj2;
                CreditCardTransactionsFlowContract$Step step13 = (CreditCardTransactionsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof CreditCardTransactionsFlowContract$Step.Transactions) {
                    CreditCardTransactionsFlowContract$InputData creditCardTransactionsFlowContract$InputData = aVar16.o;
                    CreditCardStatementTransactionsScreen creditCardStatementTransactionsScreen = new CreditCardStatementTransactionsScreen(new CreditCardStatementTransactionsScreenContract$InputData(creditCardTransactionsFlowContract$InputData.f69711a, creditCardTransactionsFlowContract$InputData.f69712b));
                    x block25 = new x(aVar16, i2);
                    Intrinsics.checkNotNullParameter(block25, "block");
                    creditCardStatementTransactionsScreen.H = block25;
                    return creditCardStatementTransactionsScreen;
                }
                if (step13 instanceof CreditCardTransactionsFlowContract$Step.StatementFinancing) {
                    CreditCardTransactionsFlowContract$Step.StatementFinancing statementFinancing = (CreditCardTransactionsFlowContract$Step.StatementFinancing) step13;
                    return new CreditCardInstalmentDetailsFlow(new CreditCardInstalmentDetailsFlowContract$InputData.StatementFinancing(statementFinancing.f69717a, statementFinancing.f69718b));
                }
                if (step13 instanceof CreditCardTransactionsFlowContract$Step.PrePurchase) {
                    CreditCardTransactionsFlowContract$Step.PrePurchase prePurchase = (CreditCardTransactionsFlowContract$Step.PrePurchase) step13;
                    return new CreditCardInstalmentDetailsFlow(new CreditCardInstalmentDetailsFlowContract$InputData.PrePurchase(prePurchase.f69715a, prePurchase.f69716b));
                }
                if (!(step13 instanceof CreditCardTransactionsFlowContract$Step.PostPurchase)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardTransactionsFlowContract$Step.PostPurchase postPurchase = (CreditCardTransactionsFlowContract$Step.PostPurchase) step13;
                return new CreditCardInstalmentDetailsFlow(new CreditCardInstalmentDetailsFlowContract$InputData.PostPurchase(postPurchase.f69713a, postPurchase.f69714b));
        }
    }

    public /* synthetic */ b(vse.e eVar, TicketDetails ticketDetails) {
        this.f289347a = 22;
        this.f289348b = ticketDetails;
    }
}
