package ghl;

import android.os.Parcelable;
import android.text.method.DigitsKeyListener;
import aw0.n6;
import c12.p0;
import c12.u0;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.a0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.api.navigation.SelectAddressControllerDescriptor$InputData;
import com.revolut.feature.address.common.impl.flow.field_search.flow.AddressFieldSearchFlow;
import com.revolut.feature.address.common.impl.flow.field_search.flow.AddressFieldSearchFlowContract$InputData;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreenContract$InputData;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreenContract$ModalStep;
import com.revolut.feature.address.common.impl.flow.screen.add.address_type.AddressTypeBottomSheetScreen;
import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreen;
import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreenContract$InputData;
import com.revolut.feature.address.common.impl.flow.screen.select.SelectAddressScreen;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step;
import com.revolut.feature.apm.wero.impl.ui.pay.create.CreateRequestLinkScreen;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsRootFlow;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayRootFlow;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.CreditCardRepayBoletoFlow;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.CreditCardRepayBoletoFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.choose_payments.CreditCardChoosePaymentsScreen;
import com.revolut.feature.credit.card.impl.ui.repay.choose_payments.CreditCardChoosePaymentsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$FlowState;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.repay.pse.flow.CreditCardPseRepayFlow;
import com.revolut.feature.credit.card.impl.ui.repay.pse.flow.CreditCardPseRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.spei_details.CreditCardRepaySpeiDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.repay.spei_details.CreditCardRepaySpeiDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.AutoPayAction;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.flow.CreditCardRepayWithReviewFlow;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.flow.CreditCardRepayWithReviewFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.CreditCardAccruedInterestsScreenContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.dialog.CreditCardAccruedInterestsBottomSheetController;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.dialog.CreditCardAccruedInterestsBottomSheetControllerContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.flow.CreditCardStatementFinancingFlow;
import com.revolut.feature.credit.card.impl.ui.statement_financing.flow.CreditCardStatementFinancingFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreen;
import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.CryptoBeneficiaryDetailsScreenInternalContract$ModalStep;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.ClientsListScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.ClientsListScreenContract$Input;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.ConsentDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.ConsentDetailsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.ConsentsListScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.ConsentsListScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.InactiveConsentsListScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.InactiveConsentsListScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.revoke.revoke_consent_bottom_sheet_screen.RevokeConsentBottomSheetScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.revoke.revoke_consent_bottom_sheet_screen.RevokeConsentBottomSheetScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.model.CrossBorderCountryDepartmentUiModel;
import com.revolut.feature.external_accounts.impl.ui.link.screens.consent.ConsentScreen;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.branches.CrossBorderBranchesScreen;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.countries.CrossBorderCountryDepartmentsScreen;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.CrossBorderInstitutionsScreen;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.a;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.impl.ui.customer.details.FreelancerCustomerDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.customer.details.FreelancerCustomerDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.create.flow.InvoiceCreateFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.details.flow.InvoiceDetailsFlow;
import com.revolut.feature.freelancer.impl.ui.invoice.details.flow.InvoiceDetailsFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.InvoiceCustomerListScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.InvoiceCustomerListScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.InvoicePaymentMethodsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.InvoicePaymentMethodsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreenContract$ScheduleTab;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.flow.InvoiceTemplatesFlow;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.flow.InvoiceTemplatesFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.FreelancerPromotionIneligibilityFlowContract$Step;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.kyc.impl.ondemand.OnDemandFeatureInstallFlow;
import com.revolut.feature.kyc.impl.ondemand.OnDemandFeatureInstallFlowContract$InputData;
import com.revolut.feature.kyc.impl.trustdock.icchip.TrustdockSdkFlowContract$InputData;
import com.revolut.feature.kyc.impl.trustdock.icchip.TrustdockSdkFlowContract$Step;
import com.revolut.feature.kyc.impl.trustdock.icchip.screen.TrustdockIcChipScreen;
import com.revolut.feature.kyc.impl.trustdock.icchip.screen.TrustdockIcChipScreenContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.raffle.impl.flow.RaffleFlowContract$Step;
import com.revolut.feature.raffle.impl.screen.not_available.RaffleNotAvailableScreen;
import com.revolut.feature.raffle.impl.screen.raffle.RaffleScreen;
import com.revolut.feature.raffle.impl.screen.raffle.RaffleScreenContract$InputData;
import com.revolut.feature.raffle.impl.screen.share_raffle.ShareRaffleScreen;
import com.revolut.feature.raffle.impl.screen.share_raffle.ShareRaffleScreenContract$InputData;
import com.revolut.feature.retail.salary_account.impl.promotion_inactive.PromotionInactivePromptController;
import com.revolut.feature.retail.salary_account.impl.promotion_inactive.PromotionInactivePromptControllerContract$InputData;
import com.revolut.feature.retail.salary_account.impl.work_email.flow.VerifyEmploymentFlowContract$Step;
import com.revolut.feature.retail.salary_account.impl.work_email.input.WorkEmailInputController;
import com.revolut.feature.retail.salary_account.impl.work_email.input.WorkEmailInputControllerContract$InputData;
import com.revolut.feature.retail.salary_account.impl.work_email.verification.screen.WorkEmailVerificationController;
import com.revolut.feature.retail.salary_account.impl.work_email.verification.screen.WorkEmailVerificationControllerContract$InputData;
import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow.InfoSheetFlowContract$InputData;
import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow.InfoSheetFlowContract$Step;
import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.bottom_sheet.BottomInfoSheetScreen;
import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.modal_sheet.ModalInfoSheetScreen;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.account_details.AccountDetailsController;
import com.revolut.feature.security_hub.impl.ui.secure_account.SecureAccountControllerContract$ModalStep;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreen;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$FlowState;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$PagerItem;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.picker.date_picker.DatePickerBottomSheetController;
import com.revolut.feature.topup_screen.impl.flow.init_top_up.InitTopUpFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlow;
import com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.AccountClosureFlowContract$FlowState;
import com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.AccountClosureFlowContract$Step;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent.AccountClosureConsentScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent.AccountClosureConsentScreenContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.ConsentPromptPreconditionScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.ConsentPromptPreconditionScreenContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.AccountClosureFeatureRatingScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.AccountClosureFeatureRatingScreenContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback.AccountClosureFeedbackScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback.AccountClosureFeedbackScreenContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback_competitor.AccountClosureFeedbackCompetitorScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback_competitor.AccountClosureFeedbackCompetitorScreenContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.negative_balance.NegativeBalancePromptScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.negative_balance.NegativeBalancePromptScreenContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.upcoming_dividends.UpcomingDividendsController;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinition;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$OutputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import gi1.q;
import gig.t;
import gq2.o;
import gqd.s;
import grl.k9;
import grl.x0;
import gsh.w;
import gz7.v;
import ip0.pb0;
import ip0.s7;
import ip0.yl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jt8.b;
import jx8.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kug.j;
import kug.k;
import kug.l;
import kug.m;
import kug.n;
import mib.d;
import mib.e;
import nii.y0;
import nii.z;
import nxa.t0;
import oki.h;
import r7a.g;
import r7a.i;
import s7a.c0;
import s7a.x;
import tw8.f;
import vkm.j2;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f144001b;

    public /* synthetic */ c(o oVar, gq2.h hVar) {
        this.f144000a = 12;
        this.f144001b = hVar;
    }

    private final Object a(Object obj2, Object obj3) {
        final com.revolut.feature.credit.card.impl.ui.repay.flow.b bVar = (com.revolut.feature.credit.card.impl.ui.repay.flow.b) this.f144001b;
        CreditCardRepayFlowContract$InputData creditCardRepayFlowContract$InputData = bVar.o;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        CreditCardRepayFlowContract$Step step = (CreditCardRepayFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CreditCardRepayFlowContract$Step.PaymentOptions) {
            CreditCardChoosePaymentsScreen creditCardChoosePaymentsScreen = new CreditCardChoosePaymentsScreen(new CreditCardChoosePaymentsScreenContract$InputData(creditCardRepayFlowContract$InputData.f69571a));
            s block = new s(bVar, LazyFlowCoordinator, 8);
            Intrinsics.checkNotNullParameter(block, "block");
            creditCardChoosePaymentsScreen.H = block;
            return creditCardChoosePaymentsScreen;
        }
        if (step instanceof CreditCardRepayFlowContract$Step.Spei) {
            return new CreditCardRepaySpeiDetailsScreen(new CreditCardRepaySpeiDetailsScreenContract$InputData(creditCardRepayFlowContract$InputData.f69571a));
        }
        if (step instanceof CreditCardRepayFlowContract$Step.Boleto) {
            CreditCardRepayBoletoFlow creditCardRepayBoletoFlow = new CreditCardRepayBoletoFlow(new CreditCardRepayBoletoFlowContract$InputData.Create(creditCardRepayFlowContract$InputData.f69571a));
            dph.c block2 = new dph.c(bVar, LazyFlowCoordinator, 11);
            Intrinsics.checkNotNullParameter(block2, "block");
            creditCardRepayBoletoFlow.H = block2;
            return creditCardRepayBoletoFlow;
        }
        if (step instanceof CreditCardRepayFlowContract$Step.Pse) {
            return new CreditCardPseRepayFlow(new CreditCardPseRepayFlowContract$InputData(creditCardRepayFlowContract$InputData.f69571a));
        }
        if (step instanceof CreditCardRepayFlowContract$Step.RevolutAccount) {
            CreditCardRepayFlowContract$Step.RevolutAccount revolutAccount = (CreditCardRepayFlowContract$Step.RevolutAccount) step;
            if (!revolutAccount.f69582b) {
                CreditCardTopupScreen creditCardTopupScreen = new CreditCardTopupScreen(new CreditCardTopupScreenContract$InputData(creditCardRepayFlowContract$InputData.f69572b, creditCardRepayFlowContract$InputData.f69571a));
                gu4.e block3 = new gu4.e(bVar, 3);
                Intrinsics.checkNotNullParameter(block3, "block");
                creditCardTopupScreen.H = block3;
                return creditCardTopupScreen;
            }
            StartUpPocket.CreditCardAccount creditCardAccount = new StartUpPocket.CreditCardAccount(revolutAccount.f69581a);
            dj0.d dVar = creditCardRepayFlowContract$InputData.f69572b;
            k9 k9Var = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ViewController viewControllerE1 = bVar.e1(new y5i.a(new MoveMoneyInputData(new Action.Topup(creditCardAccount, dVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), true, false), (Set) null, 6), null, 14));
            gu4.e block4 = new gu4.e(bVar, 2);
            Intrinsics.checkNotNullParameter(block4, "block");
            viewControllerE1.H = block4;
            return viewControllerE1;
        }
        if (step instanceof CreditCardRepayFlowContract$Step.StatementFinancing) {
            CreditCardStatementFinancingFlow creditCardStatementFinancingFlow = new CreditCardStatementFinancingFlow(new CreditCardStatementFinancingFlowContract$InputData(creditCardRepayFlowContract$InputData.f69571a));
            dph.c block5 = new dph.c(bVar, LazyFlowCoordinator, 12);
            Intrinsics.checkNotNullParameter(block5, "block");
            creditCardStatementFinancingFlow.H = block5;
            return creditCardStatementFinancingFlow;
        }
        final int i = 0;
        if (step instanceof CreditCardRepayFlowContract$Step.NothingToRepay) {
            ActionsBottomSheetController actionsBottomSheetControllerA = bVar.f69591t.a();
            actionsBottomSheetControllerA.l2(new Function0() { // from class: gu4.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            oki.h.D2(bVar.f69593x);
                            break;
                        default:
                            oki.h.D2(bVar.f69593x);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            return actionsBottomSheetControllerA;
        }
        if (step instanceof CreditCardRepayFlowContract$Step.Error) {
            bVar.f69588q.getClass();
            ActionsBottomSheetController actionsBottomSheetControllerA2 = vt4.a.a();
            final int i2 = 1;
            actionsBottomSheetControllerA2.l2(new Function0() { // from class: gu4.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            oki.h.D2(bVar.f69593x);
                            break;
                        default:
                            oki.h.D2(bVar.f69593x);
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            return actionsBottomSheetControllerA2;
        }
        if (step instanceof CreditCardRepayFlowContract$Step.RevolutAccountWithRevPointsRedeem) {
            String str = creditCardRepayFlowContract$InputData.f69571a;
            xi0.b bVar2 = ((CreditCardRepayFlowContract$Step.RevolutAccountWithRevPointsRedeem) step).f69583a;
            CreditCardAutopayPayments creditCardAutopayPayments = ((CreditCardRepayFlowContract$FlowState) ((j2) bVar.f69592w.f22677a).getValue()).f;
            CreditCardRepayWithReviewFlow creditCardRepayWithReviewFlow = new CreditCardRepayWithReviewFlow(new CreditCardRepayWithReviewFlowContract$InputData(str, bVar2, creditCardAutopayPayments == null ? AutoPayAction.NOT_AVAILABLE : creditCardAutopayPayments.d.isEmpty() ? AutoPayAction.SETUP : AutoPayAction.MANAGE));
            gu4.e block6 = new gu4.e(bVar, 4);
            Intrinsics.checkNotNullParameter(block6, "block");
            creditCardRepayWithReviewFlow.H = block6;
            return creditCardRepayWithReviewFlow;
        }
        if (!(step instanceof CreditCardRepayFlowContract$Step.AutopayPrompt)) {
            if (step instanceof CreditCardRepayFlowContract$Step.AutopaySettings) {
                return new CreditCardAutopaySettingsRootFlow(new CreditCardAutopaySettingsFlowContract$InputData(creditCardRepayFlowContract$InputData.f69571a, tp4.a.Quit));
            }
            if (step instanceof CreditCardRepayFlowContract$Step.CreateAutopay) {
                return new CreditCardSetupAutopayRootFlow(new CreditCardSetupAutopayFlowContract$InputData.Create(creditCardRepayFlowContract$InputData.f69571a));
            }
            throw new NoWhenBranchMatchedException();
        }
        bVar.v.getClass();
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.credit_card_auto_pay_prompt_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_auto_pay_prompt_description, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_cash_income, null, null, 6), null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.credit_card_auto_pay_prompt_primary_button_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.credit_common_not_now, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, (String) null, 54), null, null, null, null, null, 65112));
        gu4.e block7 = new gu4.e(bVar, i);
        Intrinsics.checkNotNullParameter(block7, "block");
        promptMarketingScreen.H = block7;
        return promptMarketingScreen;
    }

    private final Object b(Object obj2, Object obj3) {
        final com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar = (com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b) this.f144001b;
        qki.d dVar = bVar.v;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        AccountClosureFlowContract$Step step = (AccountClosureFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof AccountClosureFlowContract$Step.ConsentPromptAndPreconditionsCheck) {
            ConsentPromptPreconditionScreen consentPromptPreconditionScreen = new ConsentPromptPreconditionScreen(new ConsentPromptPreconditionScreenContract$InputData.CloseAccountInputData(((AccountClosureFlowContract$Step.ConsentPromptAndPreconditionsCheck) step).f94904a));
            final int i = 0;
            Function1 block = new Function1() { // from class: gug.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            kug.o output = (kug.o) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof j;
                            com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar2 = bVar;
                            if (z || (output instanceof k)) {
                                oki.h.D2(bVar2.f94924w);
                            } else if (output instanceof n) {
                                n nVar = (n) output;
                                bVar2.l2(new w(bVar2, nVar.f189802a, nVar.f189803b, null, 4), new yi5.b(26));
                            } else if (output instanceof kug.i) {
                                bVar2.H2(bVar2.v, new gmk.j(output, 20));
                                bVar2.J2(new AccountClosureFlowContract$Step.TradingAccountConsent(((kug.i) output).f189798c));
                            } else if (output instanceof l) {
                                bVar2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("topic.closing-your-trading-account", 6), (SharedFaqDestination.PassthroughData) null, false, 6));
                            } else {
                                if (!(output instanceof m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.J2(new AccountClosureFlowContract$Step.UpcomingDividends(((m) output).f189801a));
                            }
                            return Unit.f186387a;
                        default:
                            uug.g outputData = (uug.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (!(outputData instanceof uug.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.D2(bVar.f94924w);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            consentPromptPreconditionScreen.H = block;
            return consentPromptPreconditionScreen;
        }
        if (step instanceof AccountClosureFlowContract$Step.TradingProductConsentPromptAndPreconditionsCheck) {
            AccountClosureFlowContract$Step.TradingProductConsentPromptAndPreconditionsCheck tradingProductConsentPromptAndPreconditionsCheck = (AccountClosureFlowContract$Step.TradingProductConsentPromptAndPreconditionsCheck) step;
            ConsentPromptPreconditionScreen consentPromptPreconditionScreen2 = new ConsentPromptPreconditionScreen(new ConsentPromptPreconditionScreenContract$InputData.CloseTradingProductInputData(tradingProductConsentPromptAndPreconditionsCheck.f94914a, tradingProductConsentPromptAndPreconditionsCheck.f94915b, tradingProductConsentPromptAndPreconditionsCheck.f94916c));
            final int i2 = 0;
            Function1 block2 = new Function1() { // from class: gug.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            kug.o output = (kug.o) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof j;
                            com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar2 = bVar;
                            if (z || (output instanceof k)) {
                                oki.h.D2(bVar2.f94924w);
                            } else if (output instanceof n) {
                                n nVar = (n) output;
                                bVar2.l2(new w(bVar2, nVar.f189802a, nVar.f189803b, null, 4), new yi5.b(26));
                            } else if (output instanceof kug.i) {
                                bVar2.H2(bVar2.v, new gmk.j(output, 20));
                                bVar2.J2(new AccountClosureFlowContract$Step.TradingAccountConsent(((kug.i) output).f189798c));
                            } else if (output instanceof l) {
                                bVar2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("topic.closing-your-trading-account", 6), (SharedFaqDestination.PassthroughData) null, false, 6));
                            } else {
                                if (!(output instanceof m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.J2(new AccountClosureFlowContract$Step.UpcomingDividends(((m) output).f189801a));
                            }
                            return Unit.f186387a;
                        default:
                            uug.g outputData = (uug.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (!(outputData instanceof uug.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.D2(bVar.f94924w);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            consentPromptPreconditionScreen2.H = block2;
            return consentPromptPreconditionScreen2;
        }
        if (step instanceof AccountClosureFlowContract$Step.NegativeBalance) {
            NegativeBalancePromptScreen negativeBalancePromptScreen = new NegativeBalancePromptScreen(new NegativeBalancePromptScreenContract$InputData(((AccountClosureFlowContract$Step.NegativeBalance) step).f94911a));
            final int i3 = 1;
            Function1 block3 = new Function1() { // from class: gug.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            kug.o output = (kug.o) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof j;
                            com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar2 = bVar;
                            if (z || (output instanceof k)) {
                                oki.h.D2(bVar2.f94924w);
                            } else if (output instanceof n) {
                                n nVar = (n) output;
                                bVar2.l2(new w(bVar2, nVar.f189802a, nVar.f189803b, null, 4), new yi5.b(26));
                            } else if (output instanceof kug.i) {
                                bVar2.H2(bVar2.v, new gmk.j(output, 20));
                                bVar2.J2(new AccountClosureFlowContract$Step.TradingAccountConsent(((kug.i) output).f189798c));
                            } else if (output instanceof l) {
                                bVar2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("topic.closing-your-trading-account", 6), (SharedFaqDestination.PassthroughData) null, false, 6));
                            } else {
                                if (!(output instanceof m)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.J2(new AccountClosureFlowContract$Step.UpcomingDividends(((m) output).f189801a));
                            }
                            return Unit.f186387a;
                        default:
                            uug.g outputData = (uug.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (!(outputData instanceof uug.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.D2(bVar.f94924w);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            negativeBalancePromptScreen.H = block3;
            return negativeBalancePromptScreen;
        }
        if (step instanceof AccountClosureFlowContract$Step.TradingAccountConsent) {
            AccountClosureFlowContract$Step.TradingAccountConsent tradingAccountConsent = (AccountClosureFlowContract$Step.TradingAccountConsent) step;
            TradingAccount tradingAccount = ((AccountClosureFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).f94897b;
            if (tradingAccount == null) {
                throw new IllegalArgumentException("Trading account can't be null when launching TradingAccountConsent step.");
            }
            AccountClosureConsentScreen accountClosureConsentScreen = new AccountClosureConsentScreen(new AccountClosureConsentScreenContract$InputData(tradingAccount, iug.f.TRADING_ACCOUNT));
            s block4 = new s(bVar, tradingAccountConsent, 18);
            Intrinsics.checkNotNullParameter(block4, "block");
            accountClosureConsentScreen.H = block4;
            return accountClosureConsentScreen;
        }
        if (step instanceof AccountClosureFlowContract$Step.PrivateMarketsConsent) {
            AccountClosureFlowContract$Step.PrivateMarketsConsent privateMarketsConsent = (AccountClosureFlowContract$Step.PrivateMarketsConsent) step;
            TradingAccount tradingAccount2 = ((AccountClosureFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).f94897b;
            if (tradingAccount2 == null) {
                throw new IllegalArgumentException("Trading account can't be null when launching PrivateMarketsConsent step.");
            }
            AccountClosureConsentScreen accountClosureConsentScreen2 = new AccountClosureConsentScreen(new AccountClosureConsentScreenContract$InputData(tradingAccount2, iug.f.PRIVATE_MARKETS));
            s block5 = new s(bVar, privateMarketsConsent, 17);
            Intrinsics.checkNotNullParameter(block5, "block");
            accountClosureConsentScreen2.H = block5;
            return accountClosureConsentScreen2;
        }
        if (step instanceof AccountClosureFlowContract$Step.Feedback) {
            AccountClosureFlowContract$Step.Feedback feedback = (AccountClosureFlowContract$Step.Feedback) step;
            TradingAccount tradingAccount3 = ((AccountClosureFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).f94897b;
            if (tradingAccount3 == null) {
                throw new IllegalArgumentException("Trading account can't be null when launching Feedback step.");
            }
            AccountClosureFeedbackScreen accountClosureFeedbackScreen = new AccountClosureFeedbackScreen(new AccountClosureFeedbackScreenContract$InputData(tradingAccount3, feedback.f94907a, feedback.f94908b));
            s block6 = new s(bVar, feedback, 14);
            Intrinsics.checkNotNullParameter(block6, "block");
            accountClosureFeedbackScreen.H = block6;
            return accountClosureFeedbackScreen;
        }
        if (step instanceof AccountClosureFlowContract$Step.FeedbackCompetitor) {
            AccountClosureFlowContract$Step.FeedbackCompetitor feedbackCompetitor = (AccountClosureFlowContract$Step.FeedbackCompetitor) step;
            AccountClosureFeedbackCompetitorScreen accountClosureFeedbackCompetitorScreen = new AccountClosureFeedbackCompetitorScreen(new AccountClosureFeedbackCompetitorScreenContract$InputData(feedbackCompetitor.f94910b));
            s block7 = new s(bVar, feedbackCompetitor, 15);
            Intrinsics.checkNotNullParameter(block7, "block");
            accountClosureFeedbackCompetitorScreen.H = block7;
            return accountClosureFeedbackCompetitorScreen;
        }
        if (!(step instanceof AccountClosureFlowContract$Step.FeatureRating)) {
            if (step instanceof AccountClosureFlowContract$Step.UpcomingDividends) {
                return new UpcomingDividendsController(new zug.b(((AccountClosureFlowContract$Step.UpcomingDividends) step).f94917a));
            }
            throw new NoWhenBranchMatchedException();
        }
        AccountClosureFlowContract$Step.FeatureRating featureRating = (AccountClosureFlowContract$Step.FeatureRating) step;
        AccountClosureFeatureRatingScreen accountClosureFeatureRatingScreen = new AccountClosureFeatureRatingScreen(new AccountClosureFeatureRatingScreenContract$InputData(featureRating.f94906b));
        s block8 = new s(bVar, featureRating, 16);
        Intrinsics.checkNotNullParameter(block8, "block");
        accountClosureFeatureRatingScreen.H = block8;
        return accountClosureFeatureRatingScreen;
    }

    private final Object c(Object obj2, Object obj3) {
        gwc.i iVar = (gwc.i) this.f144001b;
        cli.h hVar = iVar.f147315r;
        ali.b PagerCoordinator = (ali.b) obj2;
        TransactionsLimitsFlowContract$PagerItem item = (TransactionsLimitsFlowContract$PagerItem) obj3;
        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof TransactionsLimitsFlowContract$PagerItem.Personal) {
            j2 j2Var = (j2) hVar.f22677a;
            j2 j2Var2 = (j2) hVar.f22677a;
            TransactionsLimitsScreenContract$LimitFlowType transactionsLimitsScreenContract$LimitFlowType = ((TransactionsLimitsFlowContract$FlowState) j2Var.getValue()).f85755c;
            if (transactionsLimitsScreenContract$LimitFlowType == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            TransactionsLimitsScreen transactionsLimitsScreen = new TransactionsLimitsScreen(new TransactionsLimitsScreenContract$InputData(transactionsLimitsScreenContract$LimitFlowType, (((TransactionsLimitsFlowContract$FlowState) j2Var2.getValue()).d && (((TransactionsLimitsFlowContract$FlowState) j2Var2.getValue()).f85755c instanceof TransactionsLimitsScreenContract$LimitFlowType.SepaExtended)) ? fwc.n.PERSONAL : fwc.n.ALL));
            gwc.h block = new gwc.h(1, iVar, gwc.i.class, "handleResult", "handleResult(Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$OutputData;)V", 0, 0);
            Intrinsics.checkNotNullParameter(block, "block");
            transactionsLimitsScreen.H = block;
            return transactionsLimitsScreen;
        }
        if (!(item instanceof TransactionsLimitsFlowContract$PagerItem.Joint)) {
            throw new NoWhenBranchMatchedException();
        }
        TransactionsLimitsScreenContract$LimitFlowType transactionsLimitsScreenContract$LimitFlowType2 = ((TransactionsLimitsFlowContract$FlowState) ((j2) hVar.f22677a).getValue()).f85755c;
        if (transactionsLimitsScreenContract$LimitFlowType2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        TransactionsLimitsScreen transactionsLimitsScreen2 = new TransactionsLimitsScreen(new TransactionsLimitsScreenContract$InputData(transactionsLimitsScreenContract$LimitFlowType2, fwc.n.JOINT));
        gwc.h block2 = new gwc.h(1, iVar, gwc.i.class, "handleResult", "handleResult(Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$OutputData;)V", 0, 1);
        Intrinsics.checkNotNullParameter(block2, "block");
        transactionsLimitsScreen2.H = block2;
        return transactionsLimitsScreen2;
    }

    private final Object d(Object obj2, Object obj3) {
        final com.revolut.feature.topup_screen.impl.flow.init_top_up.a aVar = (com.revolut.feature.topup_screen.impl.flow.init_top_up.a) this.f144001b;
        final yki.b LazyFlowCoordinator = (yki.b) obj2;
        InitTopUpFlowContract$Step step = (InitTopUpFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof InitTopUpFlowContract$Step.BgnRestrictionArticle) {
            ViewController viewControllerE1 = aVar.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("bgn-currency-deprecation-retail-standalone")), SkipShownArticleBehaviour.AlwaysShow.f81285a, true, null, null, false, 56));
            dph.c block = new dph.c(aVar, LazyFlowCoordinator, 13);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        int i = 1;
        if (step instanceof InitTopUpFlowContract$Step.BgnRestrictionsDialog) {
            aVar.f90628q.getClass();
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_currency_not_supported_bgn_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_currency_not_supported_bgn_message, null, null, 14), null, null, false, 28);
            aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_currency_not_supported_bgn_action_read_more, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
            k9 k9Var = k9.Topup;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(aVar2, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            gvi.s block2 = new gvi.s(aVar, LazyFlowCoordinator, i);
            Intrinsics.checkNotNullParameter(block2, "block");
            actionsBottomSheetController.H = block2;
            final int i2 = 0;
            actionsBottomSheetController.k2(new Function0() { // from class: gwe.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            yki.b bVar = LazyFlowCoordinator;
                            if (bVar.d() == null) {
                                aVar.getClass();
                                Intrinsics.checkNotNullParameter(bVar, "<this>");
                                bVar.n();
                            }
                            break;
                        default:
                            yki.b bVar2 = LazyFlowCoordinator;
                            if (bVar2.d() == null) {
                                aVar.getClass();
                                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                                bVar2.n();
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            return actionsBottomSheetController;
        }
        if (!(step instanceof InitTopUpFlowContract$Step.UnsupportedCurrencyDialog)) {
            if (!(step instanceof InitTopUpFlowContract$Step.TopupFlow)) {
                throw new NoWhenBranchMatchedException();
            }
            InitTopUpFlowContract$Step.TopupFlow topupFlow = (InitTopUpFlowContract$Step.TopupFlow) step;
            TopupFlow topupFlow2 = new TopupFlow(new uye.g(topupFlow.f90621a, topupFlow.f90622b, topupFlow.f90623c, topupFlow.d, topupFlow.e, topupFlow.f));
            topupFlow2.k2(new dld.c(aVar, LazyFlowCoordinator, 3));
            return topupFlow2;
        }
        owe.e eVar = aVar.f90629r;
        InitTopUpFlowContract$Step.UnsupportedCurrencyDialog unsupportedCurrencyDialog = (InitTopUpFlowContract$Step.UnsupportedCurrencyDialog) step;
        xi0.b currency = unsupportedCurrencyDialog.f90624a;
        xi0.b baseCurrency = unsupportedCurrencyDialog.f90625b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_currency_notsupported_title, u.c(currency.f306286a), null, 12), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_currency_not_supported_message_add_funds, u.c(currency.f306286a), null, 12), null, null, false, 28);
        aw0.h hVar2 = new aw0.h(false, new n6(new TextLocalisedClause(R.string.topup_currency_notsupported_addtodefault, u.c(baseCurrency.f306286a), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
        k9 k9Var2 = k9.Topup;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController2 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(aVar3, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
        g31.e block3 = new g31.e(aVar, 14, LazyFlowCoordinator, step);
        Intrinsics.checkNotNullParameter(block3, "block");
        actionsBottomSheetController2.H = block3;
        final int i3 = 1;
        actionsBottomSheetController2.k2(new Function0() { // from class: gwe.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        yki.b bVar = LazyFlowCoordinator;
                        if (bVar.d() == null) {
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            bVar.n();
                        }
                        break;
                    default:
                        yki.b bVar2 = LazyFlowCoordinator;
                        if (bVar2.d() == null) {
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(bVar2, "<this>");
                            bVar2.n();
                        }
                        break;
                }
                return Unit.f186387a;
            }
        });
        return actionsBottomSheetController2;
    }

    private final Object e(Object obj2, Object obj3) {
        com.revolut.feature.freelancer.impl.ui.invoice.create.flow.a aVar = (com.revolut.feature.freelancer.impl.ui.invoice.create.flow.a) this.f144001b;
        yki.l FlowCoordinator = (yki.l) obj2;
        InvoiceCreateFlowContract$Step step = (InvoiceCreateFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof InvoiceCreateFlowContract$Step.CustomerDetails) {
            return new FreelancerCustomerDetailsScreen(new FreelancerCustomerDetailsScreenContract$InputData(((InvoiceCreateFlowContract$Step.CustomerDetails) step).f73818a));
        }
        if (step instanceof InvoiceCreateFlowContract$Step.CustomerList) {
            return new InvoiceCustomerListScreen(new InvoiceCustomerListScreenContract$InputData(((InvoiceCreateFlowContract$Step.CustomerList) step).f73819a));
        }
        if (Intrinsics.f(step, InvoiceCreateFlowContract$Step.InvoiceCreation.f73820a)) {
            InvoiceCreateScreen invoiceCreateScreen = new InvoiceCreateScreen(new InvoiceCreateScreenContract$InputData(aVar.o.f73817a));
            gwe.d block = new gwe.d(aVar, 3);
            Intrinsics.checkNotNullParameter(block, "block");
            invoiceCreateScreen.H = block;
            return invoiceCreateScreen;
        }
        if (step instanceof InvoiceCreateFlowContract$Step.InvoiceDetails) {
            return new InvoiceDetailsFlow(new InvoiceDetailsFlowContract$InputData(((InvoiceCreateFlowContract$Step.InvoiceDetails) step).f73821a));
        }
        if (step instanceof InvoiceCreateFlowContract$Step.PaymentMethods) {
            return new InvoicePaymentMethodsScreen(new InvoicePaymentMethodsScreenContract$InputData.SingleInvoicePaymentMethods(((InvoiceCreateFlowContract$Step.PaymentMethods) step).f73822a));
        }
        if (step instanceof InvoiceCreateFlowContract$Step.PaymentSchedule) {
            FreelancerInvoice freelancerInvoice = ((InvoiceCreateFlowContract$Step.PaymentSchedule) step).f73823a;
            return new InvoicePaymentScheduleScreen(new InvoicePaymentScheduleScreenContract$InputData(freelancerInvoice.f73374a, com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.a.b(freelancerInvoice), freelancerInvoice.d() ? InvoicePaymentScheduleScreenContract$ScheduleTab.Recurring.f73904a : InvoicePaymentScheduleScreenContract$ScheduleTab.OneTime.f73903a));
        }
        if (step instanceof InvoiceCreateFlowContract$Step.Templates) {
            return new InvoiceTemplatesFlow(new InvoiceTemplatesFlowContract$InputData(((InvoiceCreateFlowContract$Step.Templates) step).f73824a, bz6.d.SELECTION));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object g(Object obj2, Object obj3) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        final com.revolut.feature.kyc.impl.trustdock.icchip.a aVar = (com.revolut.feature.kyc.impl.trustdock.icchip.a) this.f144001b;
        ix8.a aVar2 = aVar.f77881q;
        yki.l FlowCoordinator = (yki.l) obj2;
        TrustdockSdkFlowContract$Step step = (TrustdockSdkFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof TrustdockSdkFlowContract$Step.InstallFeature) {
            OnDemandFeatureInstallFlow onDemandFeatureInstallFlow = new OnDemandFeatureInstallFlow(new OnDemandFeatureInstallFlowContract$InputData(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_feature_install_error_action_secondary, null, null, 14), "feature_trustdock_ic_chip"));
            final int i = 0;
            Function1 block = new Function1() { // from class: gx8.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            f result = (f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF = Intrinsics.f(result, tw8.e.f274950a);
                            com.revolut.feature.kyc.impl.trustdock.icchip.a aVar3 = aVar;
                            if (zF) {
                                h.t2(aVar3, aVar3.f77882r, aVar3.f77880p.c("android.permission.CAMERA") ? TrustdockSdkFlowContract$Step.LaunchSdk.f77878a : TrustdockSdkFlowContract$Step.RequestPermission.f77879a, false, null, false, 12);
                            } else {
                                if (!Intrinsics.f(result, tw8.d.f274949a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar3, aVar3.f77882r, new TrustdockSdkFlowContract$Step.Error(hx8.a.UNKNOWN_ERROR), false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 1:
                            i result2 = (i) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 instanceof r7a.h) {
                                com.revolut.feature.kyc.impl.trustdock.icchip.a aVar4 = aVar;
                                h.t2(aVar4, aVar4.f77882r, TrustdockSdkFlowContract$Step.LaunchSdk.f77878a, false, null, false, 12);
                            } else if (!(result2 instanceof r7a.e) && !(result2 instanceof r7a.f)) {
                                if (!(result2 instanceof g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalStateException illegalStateException = new IllegalStateException(result2 + " not expected for Camera permission");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            }
                            return Unit.f186387a;
                        default:
                            jx8.b result3 = (jx8.b) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean z = result3 instanceof jx8.c;
                            com.revolut.feature.kyc.impl.trustdock.icchip.a aVar5 = aVar;
                            if (z) {
                                aVar5.C2(new jt8.c(((jx8.c) result3).f179091a));
                            } else if (result3 instanceof jx8.d) {
                                h.t2(aVar5, aVar5.f77882r, new TrustdockSdkFlowContract$Step.Error(((jx8.d) result3).f179092a), false, null, false, 12);
                            } else if (Intrinsics.f(result3, b.C1022b.f179089a)) {
                                aVar5.C2(b.a.f178429a);
                            } else if (Intrinsics.f(result3, b.c.f179090a)) {
                                ((ix8.b) aVar5.f77881q).getClass();
                                yji.l.b1(aVar5, aVar5.X1(new y0("VERIFICATION_FAILED_DIALOG_ID", new z(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_verification_failed_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_verification_failed_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, new e(aVar5, null), 3);
                            } else {
                                if (!Intrinsics.f(result3, b.a.f179088a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar5, aVar5.f77882r, TrustdockSdkFlowContract$Step.RequestPermission.f77879a, false, null, false, 12);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            onDemandFeatureInstallFlow.H = block;
            return onDemandFeatureInstallFlow;
        }
        if (step instanceof TrustdockSdkFlowContract$Step.RequestPermission) {
            ((ix8.b) aVar2).getClass();
            PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(u.c(new PermissionsControllerContract$Permission("android.permission.CAMERA", new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_camera_permission_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_camera_permission_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D019", null, null, null, 30), null), new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_camera_permission_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_camera_permission_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_camera_permission_open_settings, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D019", null, null, null, 30), null), true))));
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: gx8.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            f result = (f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF = Intrinsics.f(result, tw8.e.f274950a);
                            com.revolut.feature.kyc.impl.trustdock.icchip.a aVar3 = aVar;
                            if (zF) {
                                h.t2(aVar3, aVar3.f77882r, aVar3.f77880p.c("android.permission.CAMERA") ? TrustdockSdkFlowContract$Step.LaunchSdk.f77878a : TrustdockSdkFlowContract$Step.RequestPermission.f77879a, false, null, false, 12);
                            } else {
                                if (!Intrinsics.f(result, tw8.d.f274949a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar3, aVar3.f77882r, new TrustdockSdkFlowContract$Step.Error(hx8.a.UNKNOWN_ERROR), false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 1:
                            i result2 = (i) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 instanceof r7a.h) {
                                com.revolut.feature.kyc.impl.trustdock.icchip.a aVar4 = aVar;
                                h.t2(aVar4, aVar4.f77882r, TrustdockSdkFlowContract$Step.LaunchSdk.f77878a, false, null, false, 12);
                            } else if (!(result2 instanceof r7a.e) && !(result2 instanceof r7a.f)) {
                                if (!(result2 instanceof g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalStateException illegalStateException = new IllegalStateException(result2 + " not expected for Camera permission");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            }
                            return Unit.f186387a;
                        default:
                            jx8.b result3 = (jx8.b) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean z = result3 instanceof jx8.c;
                            com.revolut.feature.kyc.impl.trustdock.icchip.a aVar5 = aVar;
                            if (z) {
                                aVar5.C2(new jt8.c(((jx8.c) result3).f179091a));
                            } else if (result3 instanceof jx8.d) {
                                h.t2(aVar5, aVar5.f77882r, new TrustdockSdkFlowContract$Step.Error(((jx8.d) result3).f179092a), false, null, false, 12);
                            } else if (Intrinsics.f(result3, b.C1022b.f179089a)) {
                                aVar5.C2(b.a.f178429a);
                            } else if (Intrinsics.f(result3, b.c.f179090a)) {
                                ((ix8.b) aVar5.f77881q).getClass();
                                yji.l.b1(aVar5, aVar5.X1(new y0("VERIFICATION_FAILED_DIALOG_ID", new z(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_verification_failed_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_verification_failed_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, new e(aVar5, null), 3);
                            } else {
                                if (!Intrinsics.f(result3, b.a.f179088a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar5, aVar5.f77882r, TrustdockSdkFlowContract$Step.RequestPermission.f77879a, false, null, false, 12);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            permissionsController.H = block2;
            return permissionsController;
        }
        if (step instanceof TrustdockSdkFlowContract$Step.LaunchSdk) {
            TrustdockSdkFlowContract$InputData trustdockSdkFlowContract$InputData = aVar.o;
            TrustdockIcChipScreen trustdockIcChipScreen = new TrustdockIcChipScreen(new TrustdockIcChipScreenContract$InputData(trustdockSdkFlowContract$InputData.f77875b, trustdockSdkFlowContract$InputData.f77874a));
            final int i3 = 2;
            Function1 block3 = new Function1() { // from class: gx8.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            f result = (f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF = Intrinsics.f(result, tw8.e.f274950a);
                            com.revolut.feature.kyc.impl.trustdock.icchip.a aVar3 = aVar;
                            if (zF) {
                                h.t2(aVar3, aVar3.f77882r, aVar3.f77880p.c("android.permission.CAMERA") ? TrustdockSdkFlowContract$Step.LaunchSdk.f77878a : TrustdockSdkFlowContract$Step.RequestPermission.f77879a, false, null, false, 12);
                            } else {
                                if (!Intrinsics.f(result, tw8.d.f274949a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar3, aVar3.f77882r, new TrustdockSdkFlowContract$Step.Error(hx8.a.UNKNOWN_ERROR), false, null, false, 12);
                            }
                            return Unit.f186387a;
                        case 1:
                            i result2 = (i) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 instanceof r7a.h) {
                                com.revolut.feature.kyc.impl.trustdock.icchip.a aVar4 = aVar;
                                h.t2(aVar4, aVar4.f77882r, TrustdockSdkFlowContract$Step.LaunchSdk.f77878a, false, null, false, 12);
                            } else if (!(result2 instanceof r7a.e) && !(result2 instanceof r7a.f)) {
                                if (!(result2 instanceof g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalStateException illegalStateException = new IllegalStateException(result2 + " not expected for Camera permission");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            }
                            return Unit.f186387a;
                        default:
                            jx8.b result3 = (jx8.b) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean z = result3 instanceof jx8.c;
                            com.revolut.feature.kyc.impl.trustdock.icchip.a aVar5 = aVar;
                            if (z) {
                                aVar5.C2(new jt8.c(((jx8.c) result3).f179091a));
                            } else if (result3 instanceof jx8.d) {
                                h.t2(aVar5, aVar5.f77882r, new TrustdockSdkFlowContract$Step.Error(((jx8.d) result3).f179092a), false, null, false, 12);
                            } else if (Intrinsics.f(result3, b.C1022b.f179089a)) {
                                aVar5.C2(b.a.f178429a);
                            } else if (Intrinsics.f(result3, b.c.f179090a)) {
                                ((ix8.b) aVar5.f77881q).getClass();
                                yji.l.b1(aVar5, aVar5.X1(new y0("VERIFICATION_FAILED_DIALOG_ID", new z(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_verification_failed_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_verification_failed_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, new e(aVar5, null), 3);
                            } else {
                                if (!Intrinsics.f(result3, b.a.f179088a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar5, aVar5.f77882r, TrustdockSdkFlowContract$Step.RequestPermission.f77879a, false, null, false, 12);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            trustdockIcChipScreen.H = block3;
            return trustdockIcChipScreen;
        }
        if (!(step instanceof TrustdockSdkFlowContract$Step.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        hx8.a errorType = ((TrustdockSdkFlowContract$Step.Error) step).f77876a;
        ((ix8.b) aVar2).getClass();
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        int[] iArr = ix8.c.f169521a;
        int i5 = iArr[errorType.ordinal()];
        if (i5 == 1) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_device_not_supported_title, null, null, 14);
        } else if (i5 == 2) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_network_issue_title, null, null, 14);
        } else if (i5 == 3) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_service_unavailable_title, null, null, 14);
        } else {
            if (i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause4 = textLocalisedClause;
        int i6 = iArr[errorType.ordinal()];
        if (i6 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_device_not_supported_subtitle, null, null, 14);
        } else if (i6 == 2) {
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_network_issue_subtitle, null, null, 14);
        } else if (i6 == 3) {
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_service_unavailable_subtitle, null, null, 14);
        } else {
            if (i6 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause5 = textLocalisedClause2;
        CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D231", null, null, null, 30);
        int i21 = iArr[errorType.ordinal()];
        if (i21 == 1) {
            textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.trustdock_action_verify_with_document_upload, null, null, 14);
        } else {
            if (i21 != 2 && i21 != 3 && i21 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.common_action_try_again, null, null, 14);
        }
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause4, textLocalisedClause5, cdnImageC, null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) textLocalisedClause3, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368));
        gvi.s block4 = new gvi.s(aVar, errorType, 3);
        Intrinsics.checkNotNullParameter(block4, "block");
        promptMarketingScreen.H = block4;
        return promptMarketingScreen;
    }

    private final Object h(Object obj2, Object obj3) {
        gxa.c cVar = (gxa.c) this.f144001b;
        String inviteId = (String) obj2;
        t0 details = (t0) obj3;
        Intrinsics.checkNotNullParameter(inviteId, "inviteId");
        Intrinsics.checkNotNullParameter(details, "details");
        cVar.d.f(gxa.c.a(inviteId), details);
        return Unit.f186387a;
    }

    private final Object i(Object obj2, Object obj3) {
        gyi.n nVar = (gyi.n) this.f144001b;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        List listC = u.c("error");
        nVar.getClass();
        return new gyi.i(listC, u.c(new ProfileCardModel.Error(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_common_state_error_subtitle, null, null, 14), new a0(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), null, null, 14))));
    }

    private final Object j(Object obj2, Object obj3) {
        v vVar = (v) this.f144001b;
        if (!((Boolean) obj2).booleanValue()) {
            return null;
        }
        vVar.f147966p.getClass();
        s0 s0Var = new s0(3);
        s0Var.a(new yl("LOADING_LIST_ID", 0, 30));
        pb0 pb0Var = new pb0("LOADING_LIST_ID");
        yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
        s0Var.a(pb0Var);
        IntRange intRange = new IntRange(0, 2, 1);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            it8.nextInt();
            arrayList.add(new s7("LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        s0Var.b(arrayList.toArray(new s7[0]));
        ArrayList arrayList2 = s0Var.f186433a;
        return new Pair(null, zhm.v.k(arrayList2.toArray(new koi.j[arrayList2.size()])));
    }

    private final Object k(Object obj2, Object obj3) {
        gzj.d dVar = (gzj.d) this.f144001b;
        if (!((Boolean) obj2).booleanValue()) {
            return f0.f322471a;
        }
        dVar.f148145n.getClass();
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(String.valueOf(it8.nextInt())));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        boolean z;
        com.revolut.kompot.navigable.a modalInfoSheetScreen;
        ConsentScreen consentScreen;
        jrd.c cVar;
        int i = this.f144000a;
        int i2 = 10;
        final int i3 = 5;
        final int i5 = 1;
        final int i6 = 0;
        Object obj4 = this.f144001b;
        switch (i) {
            case 0:
                List collections = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(collections, "collections");
                ((e) obj4).f144003b.f("ALL_SCREENER_COLLECTIONS", collections);
                return Unit.f186387a;
            case 1:
                List instrumentTypes = (List) obj2;
                zel.e config = (zel.e) obj3;
                Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
                Intrinsics.checkNotNullParameter(config, "config");
                ((g) obj4).f144006b.f(g.a(instrumentTypes), config);
                return Unit.f186387a;
            case 2:
                j jVar = (j) obj4;
                shl.a params = (shl.a) obj2;
                zel.h result = (zel.h) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(result, "result");
                jVar.f144009b.f(jVar.d.a(params), result);
                return Unit.f186387a;
            case 3:
                return m.b((m) obj4, (String) obj2, (ScreenerCollection) obj3);
            case 4:
                com.revolut.feature.address.common.impl.flow.screen.add.a aVar = (com.revolut.feature.address.common.impl.flow.screen.add.a) obj4;
                AddAddressScreenContract$InputData addAddressScreenContract$InputData = aVar.f61003r;
                y yVar = aVar.C;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AddAddressScreenContract$ModalStep step = (AddAddressScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, AddAddressScreenContract$ModalStep.CountryPicker.f60994a)) {
                    x xVar = new x(((gi1.k) ((j2) yVar.f22677a).getValue()).f144036n.f263376a.f263354a, null, null, null, false, null, new TextLocalisedClause(com.revolut.feature.address.common.api.R$string.shared_address_flow_address_search_hint, null, null, 14), null, null, false, null, aVar.K2(), null, null, false, addAddressScreenContract$InputData.f60987p, addAddressScreenContract$InputData.f60988q, null, null, null, 2046688766);
                    Object obj5 = aVar.f61004s.get();
                    Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                    PickerController pickerController = new PickerController(xVar, (x7a.d) obj5);
                    gi1.o block = new gi1.o(aVar, 6);
                    Intrinsics.checkNotNullParameter(block, "block");
                    pickerController.H = block;
                    return pickerController;
                }
                if (Intrinsics.f(step, AddAddressScreenContract$ModalStep.RegionPicker.f60999a)) {
                    String strK2 = aVar.K2();
                    Clause clause = ((gi1.k) ((j2) yVar.f22677a).getValue()).f144036n.f263376a.z;
                    s7a.w wVar = s7a.w.SHOWN;
                    AnalyticsProduct analyticsProduct = addAddressScreenContract$InputData.f60987p;
                    AnalyticsContext analyticsContext = addAddressScreenContract$InputData.f60988q;
                    rh1.b bVar = aVar.o;
                    wi0.b countryCode = com.bumptech.glide.d.c(aVar.K2());
                    ((lj1.a) bVar).getClass();
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    Iterable iterable = (Set) o8b.c.k.get(countryCode);
                    if (iterable == null) {
                        iterable = h0.f322473a;
                    }
                    x xVar2 = new x(clause, strK2, null, null, false, wVar, null, null, d0.d1(iterable), false, null, null, null, null, false, analyticsProduct, analyticsContext, null, null, null, 2046818044);
                    Object obj6 = aVar.f61005t.get();
                    Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                    PickerController pickerController2 = new PickerController(xVar2, (x7a.d) obj6);
                    gi1.o block2 = new gi1.o(aVar, 9);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    pickerController2.H = block2;
                    return pickerController2;
                }
                if (Intrinsics.f(step, AddAddressScreenContract$ModalStep.MunicipalitiesPicker.f60997a)) {
                    x xVar3 = new x(null, com.bumptech.glide.d.c(aVar.K2()), null, null, false, s7a.w.SHOWN, new TextLocalisedClause(com.revolut.feature.address.common.api.R$string.shared_address_flow_address_search_hint, null, null, 14), null, null, false, null, ((gi1.k) ((j2) yVar.f22677a).getValue()).f144028a.f263348c.f263344a, null, null, false, addAddressScreenContract$InputData.f60987p, addAddressScreenContract$InputData.f60988q, null, null, null, 2046672124);
                    Object obj7 = aVar.u.get();
                    Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
                    PickerController pickerController3 = new PickerController(xVar3, (x7a.d) obj7);
                    gi1.o block3 = new gi1.o(aVar, 11);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    pickerController3.H = block3;
                    return pickerController3;
                }
                if (step instanceof AddAddressScreenContract$ModalStep.FieldSearch) {
                    AddAddressScreenContract$ModalStep.FieldSearch fieldSearch = (AddAddressScreenContract$ModalStep.FieldSearch) step;
                    int i21 = q.f144048a[fieldSearch.f60995a.ordinal()];
                    if (i21 == 1) {
                        z = false;
                    } else {
                        if (i21 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = true;
                    }
                    AddressFieldSearchFlow addressFieldSearchFlow = new AddressFieldSearchFlow(new AddressFieldSearchFlowContract$InputData(com.bumptech.glide.d.c(aVar.K2()), ((gi1.k) ((j2) yVar.f22677a).getValue()).f144036n.f263376a.f263369x, fieldSearch.f60995a, z, ((gi1.k) ((j2) yVar.f22677a).getValue()).f144028a.f263348c.f263344a, addAddressScreenContract$InputData.f60987p, addAddressScreenContract$InputData.f60988q));
                    gi1.o block4 = new gi1.o(aVar, 4);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    addressFieldSearchFlow.H = block4;
                    return addressFieldSearchFlow;
                }
                if (Intrinsics.f(step, AddAddressScreenContract$ModalStep.StreetTypePicker.f61000a)) {
                    x xVar4 = new x(null, null, null, null, false, s7a.w.HIDDEN, null, null, null, false, null, ((gi1.k) ((j2) yVar.f22677a).getValue()).f144028a.f.f263344a, null, null, false, addAddressScreenContract$InputData.f60987p, addAddressScreenContract$InputData.f60988q, null, null, null, 2046688894);
                    Object obj8 = aVar.v.get();
                    Intrinsics.checkNotNullExpressionValue(obj8, "get(...)");
                    PickerController pickerController4 = new PickerController(xVar4, (x7a.d) obj8);
                    gi1.o block5 = new gi1.o(aVar, 8);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    pickerController4.H = block5;
                    return pickerController4;
                }
                if (Intrinsics.f(step, AddAddressScreenContract$ModalStep.AddressTypePicker.f60993a)) {
                    AddressTypeBottomSheetScreen addressTypeBottomSheetScreen = new AddressTypeBottomSheetScreen(new hi1.c(((gi1.k) ((j2) yVar.f22677a).getValue()).f144030c), aVar.f61001p);
                    gi1.o block6 = new gi1.o(aVar, i3);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    addressTypeBottomSheetScreen.H = block6;
                    return addressTypeBottomSheetScreen;
                }
                if (Intrinsics.f(step, AddAddressScreenContract$ModalStep.PostCodeSearch.f60998a)) {
                    SelectAddressScreen selectAddressScreen = new SelectAddressScreen(new SelectAddressControllerDescriptor$InputData(aVar.K2(), ((gi1.k) ((j2) yVar.f22677a).getValue()).f144028a.f263347b.f263344a, addAddressScreenContract$InputData.f60987p, addAddressScreenContract$InputData.f60988q), ((gi1.k) ((j2) yVar.f22677a).getValue()).f144036n);
                    gi1.o block7 = new gi1.o(aVar, 12);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    selectAddressScreen.H = block7;
                    return selectAddressScreen;
                }
                if (!(step instanceof AddAddressScreenContract$ModalStep.AddressSearch)) {
                    if (Intrinsics.f(step, AddAddressScreenContract$ModalStep.LocationPermission.f60996a)) {
                        return mi1.d.Z2(aVar.f61008y, new g8i.h(aVar, 6));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                AddressSearchScreen addressSearchScreen = new AddressSearchScreen(new AddressSearchScreenContract$InputData(aVar.K2(), addAddressScreenContract$InputData.f60987p, addAddressScreenContract$InputData.f60988q, ((gi1.k) ((j2) yVar.f22677a).getValue()).f144029b, ((AddAddressScreenContract$ModalStep.AddressSearch) step).f60992a), ((gi1.k) ((j2) yVar.f22677a).getValue()).f144036n);
                gi1.o block8 = new gi1.o(aVar, i2);
                Intrinsics.checkNotNullParameter(block8, "block");
                addressSearchScreen.H = block8;
                return addressSearchScreen;
            case 5:
                final com.revolut.feature.apm.wero.impl.ui.pay.b bVar2 = (com.revolut.feature.apm.wero.impl.ui.pay.b) obj4;
                WeroPayFlowContract$Step step2 = (WeroPayFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof WeroPayFlowContract$Step.Scanner) {
                    ViewController viewControllerE1 = bVar2.e1(new g12.f(((WeroPayFlowContract$Step.Scanner) step2).f63089a));
                    final int i22 = 2;
                    Function1 block9 = new Function1() { // from class: gi2.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i22) {
                                case 0:
                                    PendingPaymentContract$OutputData it8 = (PendingPaymentContract$OutputData) obj9;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                case 1:
                                    hi2.i outputData = (hi2.i) obj9;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof hi2.h) {
                                        jh2.a aVar2 = ((hi2.h) outputData).f152457a;
                                        com.revolut.feature.apm.wero.impl.ui.pay.b bVar3 = bVar2;
                                        bVar3.l2(new g0a.e(bVar3, aVar2, null, 9), new yi5.b(26));
                                    } else if (!(outputData instanceof hi2.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    g12.j outputData2 = (g12.j) obj9;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof g12.i;
                                    com.revolut.feature.apm.wero.impl.ui.pay.b bVar4 = bVar2;
                                    if (z3) {
                                        bVar4.l2(new ga9.v(bVar4, ((g12.i) outputData2).f139523a, (Continuation) null, 24), new yi5.b(26));
                                    } else {
                                        boolean z4 = outputData2 instanceof g12.h;
                                        c cVar2 = c.f144060a;
                                        if (!z4 && !(outputData2 instanceof g12.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar4.C2(cVar2);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    g12.e outputData3 = (g12.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean zF = Intrinsics.f(outputData3, g12.c.f139518a);
                                    com.revolut.feature.apm.wero.impl.ui.pay.b bVar5 = bVar2;
                                    if (zF) {
                                        oki.h.u2(bVar5, bVar5.f63098x, WeroPayFlowContract$Step.CreateRequestLink.f63086a, null, 6);
                                    } else {
                                        if (!Intrinsics.f(outputData3, g12.d.f139519a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar5.C2(c.f144060a);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    u0 it9 = (u0) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                case 5:
                                    f12.f it10 = (f12.f) obj9;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                default:
                                    g12.e outputData4 = (g12.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    if (!Intrinsics.f(outputData4, g12.c.f139518a)) {
                                        if (!Intrinsics.f(outputData4, g12.d.f139519a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(bVar2.f63098x);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block9, "block");
                    viewControllerE1.H = block9;
                    return viewControllerE1;
                }
                if (step2 instanceof WeroPayFlowContract$Step.Transfer) {
                    ViewController viewControllerE12 = bVar2.e1(new p0(((WeroPayFlowContract$Step.Transfer) step2).f63091a));
                    final int i32 = 4;
                    Function1 block10 = new Function1() { // from class: gi2.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i32) {
                                case 0:
                                    PendingPaymentContract$OutputData it8 = (PendingPaymentContract$OutputData) obj9;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                case 1:
                                    hi2.i outputData = (hi2.i) obj9;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof hi2.h) {
                                        jh2.a aVar2 = ((hi2.h) outputData).f152457a;
                                        com.revolut.feature.apm.wero.impl.ui.pay.b bVar3 = bVar2;
                                        bVar3.l2(new g0a.e(bVar3, aVar2, null, 9), new yi5.b(26));
                                    } else if (!(outputData instanceof hi2.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    g12.j outputData2 = (g12.j) obj9;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof g12.i;
                                    com.revolut.feature.apm.wero.impl.ui.pay.b bVar4 = bVar2;
                                    if (z3) {
                                        bVar4.l2(new ga9.v(bVar4, ((g12.i) outputData2).f139523a, (Continuation) null, 24), new yi5.b(26));
                                    } else {
                                        boolean z4 = outputData2 instanceof g12.h;
                                        c cVar2 = c.f144060a;
                                        if (!z4 && !(outputData2 instanceof g12.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar4.C2(cVar2);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    g12.e outputData3 = (g12.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean zF = Intrinsics.f(outputData3, g12.c.f139518a);
                                    com.revolut.feature.apm.wero.impl.ui.pay.b bVar5 = bVar2;
                                    if (zF) {
                                        oki.h.u2(bVar5, bVar5.f63098x, WeroPayFlowContract$Step.CreateRequestLink.f63086a, null, 6);
                                    } else {
                                        if (!Intrinsics.f(outputData3, g12.d.f139519a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar5.C2(c.f144060a);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    u0 it9 = (u0) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                case 5:
                                    f12.f it10 = (f12.f) obj9;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                default:
                                    g12.e outputData4 = (g12.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    if (!Intrinsics.f(outputData4, g12.c.f139518a)) {
                                        if (!Intrinsics.f(outputData4, g12.d.f139519a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(bVar2.f63098x);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    viewControllerE12.H = block10;
                    return viewControllerE12;
                }
                if (step2 instanceof WeroPayFlowContract$Step.ConfirmPayment) {
                    ViewController viewControllerE13 = bVar2.e1(new f12.b(((WeroPayFlowContract$Step.ConfirmPayment) step2).f63085a, bVar2.u));
                    Function1 block11 = new Function1() { // from class: gi2.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i3) {
                                case 0:
                                    PendingPaymentContract$OutputData it8 = (PendingPaymentContract$OutputData) obj9;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                case 1:
                                    hi2.i outputData = (hi2.i) obj9;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof hi2.h) {
                                        jh2.a aVar2 = ((hi2.h) outputData).f152457a;
                                        com.revolut.feature.apm.wero.impl.ui.pay.b bVar3 = bVar2;
                                        bVar3.l2(new g0a.e(bVar3, aVar2, null, 9), new yi5.b(26));
                                    } else if (!(outputData instanceof hi2.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    g12.j outputData2 = (g12.j) obj9;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof g12.i;
                                    com.revolut.feature.apm.wero.impl.ui.pay.b bVar4 = bVar2;
                                    if (z3) {
                                        bVar4.l2(new ga9.v(bVar4, ((g12.i) outputData2).f139523a, (Continuation) null, 24), new yi5.b(26));
                                    } else {
                                        boolean z4 = outputData2 instanceof g12.h;
                                        c cVar2 = c.f144060a;
                                        if (!z4 && !(outputData2 instanceof g12.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar4.C2(cVar2);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    g12.e outputData3 = (g12.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean zF = Intrinsics.f(outputData3, g12.c.f139518a);
                                    com.revolut.feature.apm.wero.impl.ui.pay.b bVar5 = bVar2;
                                    if (zF) {
                                        oki.h.u2(bVar5, bVar5.f63098x, WeroPayFlowContract$Step.CreateRequestLink.f63086a, null, 6);
                                    } else {
                                        if (!Intrinsics.f(outputData3, g12.d.f139519a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar5.C2(c.f144060a);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    u0 it9 = (u0) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                case 5:
                                    f12.f it10 = (f12.f) obj9;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                default:
                                    g12.e outputData4 = (g12.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    if (!Intrinsics.f(outputData4, g12.c.f139518a)) {
                                        if (!Intrinsics.f(outputData4, g12.d.f139519a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(bVar2.f63098x);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    viewControllerE13.H = block11;
                    return viewControllerE13;
                }
                if (step2 instanceof WeroPayFlowContract$Step.PendingPayment) {
                    ViewController viewControllerE14 = bVar2.e1(new tak.a(((WeroPayFlowContract$Step.PendingPayment) step2).f63087a, bVar2.v));
                    Function1 block12 = new Function1() { // from class: gi2.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i6) {
                                case 0:
                                    PendingPaymentContract$OutputData it8 = (PendingPaymentContract$OutputData) obj9;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                case 1:
                                    hi2.i outputData = (hi2.i) obj9;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof hi2.h) {
                                        jh2.a aVar2 = ((hi2.h) outputData).f152457a;
                                        com.revolut.feature.apm.wero.impl.ui.pay.b bVar3 = bVar2;
                                        bVar3.l2(new g0a.e(bVar3, aVar2, null, 9), new yi5.b(26));
                                    } else if (!(outputData instanceof hi2.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    g12.j outputData2 = (g12.j) obj9;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof g12.i;
                                    com.revolut.feature.apm.wero.impl.ui.pay.b bVar4 = bVar2;
                                    if (z3) {
                                        bVar4.l2(new ga9.v(bVar4, ((g12.i) outputData2).f139523a, (Continuation) null, 24), new yi5.b(26));
                                    } else {
                                        boolean z4 = outputData2 instanceof g12.h;
                                        c cVar2 = c.f144060a;
                                        if (!z4 && !(outputData2 instanceof g12.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar4.C2(cVar2);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    g12.e outputData3 = (g12.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean zF = Intrinsics.f(outputData3, g12.c.f139518a);
                                    com.revolut.feature.apm.wero.impl.ui.pay.b bVar5 = bVar2;
                                    if (zF) {
                                        oki.h.u2(bVar5, bVar5.f63098x, WeroPayFlowContract$Step.CreateRequestLink.f63086a, null, 6);
                                    } else {
                                        if (!Intrinsics.f(outputData3, g12.d.f139519a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar5.C2(c.f144060a);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    u0 it9 = (u0) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                case 5:
                                    f12.f it10 = (f12.f) obj9;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                default:
                                    g12.e outputData4 = (g12.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    if (!Intrinsics.f(outputData4, g12.c.f139518a)) {
                                        if (!Intrinsics.f(outputData4, g12.d.f139519a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(bVar2.f63098x);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    viewControllerE14.H = block12;
                    return viewControllerE14;
                }
                if (step2 instanceof WeroPayFlowContract$Step.ShowUserCode) {
                    ViewController viewControllerE15 = bVar2.e1(new g12.b(((WeroPayFlowContract$Step.ShowUserCode) step2).f63090a));
                    final int i33 = 3;
                    Function1 block13 = new Function1() { // from class: gi2.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i33) {
                                case 0:
                                    PendingPaymentContract$OutputData it8 = (PendingPaymentContract$OutputData) obj9;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                case 1:
                                    hi2.i outputData = (hi2.i) obj9;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof hi2.h) {
                                        jh2.a aVar2 = ((hi2.h) outputData).f152457a;
                                        com.revolut.feature.apm.wero.impl.ui.pay.b bVar3 = bVar2;
                                        bVar3.l2(new g0a.e(bVar3, aVar2, null, 9), new yi5.b(26));
                                    } else if (!(outputData instanceof hi2.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    g12.j outputData2 = (g12.j) obj9;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof g12.i;
                                    com.revolut.feature.apm.wero.impl.ui.pay.b bVar4 = bVar2;
                                    if (z3) {
                                        bVar4.l2(new ga9.v(bVar4, ((g12.i) outputData2).f139523a, (Continuation) null, 24), new yi5.b(26));
                                    } else {
                                        boolean z4 = outputData2 instanceof g12.h;
                                        c cVar2 = c.f144060a;
                                        if (!z4 && !(outputData2 instanceof g12.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar4.C2(cVar2);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    g12.e outputData3 = (g12.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean zF = Intrinsics.f(outputData3, g12.c.f139518a);
                                    com.revolut.feature.apm.wero.impl.ui.pay.b bVar5 = bVar2;
                                    if (zF) {
                                        oki.h.u2(bVar5, bVar5.f63098x, WeroPayFlowContract$Step.CreateRequestLink.f63086a, null, 6);
                                    } else {
                                        if (!Intrinsics.f(outputData3, g12.d.f139519a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar5.C2(c.f144060a);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    u0 it9 = (u0) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                case 5:
                                    f12.f it10 = (f12.f) obj9;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                default:
                                    g12.e outputData4 = (g12.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    if (!Intrinsics.f(outputData4, g12.c.f139518a)) {
                                        if (!Intrinsics.f(outputData4, g12.d.f139519a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(bVar2.f63098x);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    viewControllerE15.H = block13;
                    return viewControllerE15;
                }
                if (step2 instanceof WeroPayFlowContract$Step.RequestLinkDetails) {
                    ViewController viewControllerE16 = bVar2.e1(new g12.b(((WeroPayFlowContract$Step.RequestLinkDetails) step2).f63088a));
                    final int i43 = 6;
                    Function1 block14 = new Function1() { // from class: gi2.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i43) {
                                case 0:
                                    PendingPaymentContract$OutputData it8 = (PendingPaymentContract$OutputData) obj9;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                case 1:
                                    hi2.i outputData = (hi2.i) obj9;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof hi2.h) {
                                        jh2.a aVar2 = ((hi2.h) outputData).f152457a;
                                        com.revolut.feature.apm.wero.impl.ui.pay.b bVar3 = bVar2;
                                        bVar3.l2(new g0a.e(bVar3, aVar2, null, 9), new yi5.b(26));
                                    } else if (!(outputData instanceof hi2.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    g12.j outputData2 = (g12.j) obj9;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof g12.i;
                                    com.revolut.feature.apm.wero.impl.ui.pay.b bVar4 = bVar2;
                                    if (z3) {
                                        bVar4.l2(new ga9.v(bVar4, ((g12.i) outputData2).f139523a, (Continuation) null, 24), new yi5.b(26));
                                    } else {
                                        boolean z4 = outputData2 instanceof g12.h;
                                        c cVar2 = c.f144060a;
                                        if (!z4 && !(outputData2 instanceof g12.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar4.C2(cVar2);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    g12.e outputData3 = (g12.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean zF = Intrinsics.f(outputData3, g12.c.f139518a);
                                    com.revolut.feature.apm.wero.impl.ui.pay.b bVar5 = bVar2;
                                    if (zF) {
                                        oki.h.u2(bVar5, bVar5.f63098x, WeroPayFlowContract$Step.CreateRequestLink.f63086a, null, 6);
                                    } else {
                                        if (!Intrinsics.f(outputData3, g12.d.f139519a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar5.C2(c.f144060a);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    u0 it9 = (u0) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                case 5:
                                    f12.f it10 = (f12.f) obj9;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    oki.h.D2(bVar2.f63098x);
                                    return Unit.f186387a;
                                default:
                                    g12.e outputData4 = (g12.e) obj9;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    if (!Intrinsics.f(outputData4, g12.c.f139518a)) {
                                        if (!Intrinsics.f(outputData4, g12.d.f139519a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(bVar2.f63098x);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block14, "block");
                    viewControllerE16.H = block14;
                    return viewControllerE16;
                }
                if (!(step2 instanceof WeroPayFlowContract$Step.CreateRequestLink)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreateRequestLinkScreen createRequestLinkScreen = new CreateRequestLinkScreen();
                Function1 block15 = new Function1() { // from class: gi2.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        switch (i5) {
                            case 0:
                                PendingPaymentContract$OutputData it8 = (PendingPaymentContract$OutputData) obj9;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                oki.h.D2(bVar2.f63098x);
                                return Unit.f186387a;
                            case 1:
                                hi2.i outputData = (hi2.i) obj9;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                if (outputData instanceof hi2.h) {
                                    jh2.a aVar2 = ((hi2.h) outputData).f152457a;
                                    com.revolut.feature.apm.wero.impl.ui.pay.b bVar3 = bVar2;
                                    bVar3.l2(new g0a.e(bVar3, aVar2, null, 9), new yi5.b(26));
                                } else if (!(outputData instanceof hi2.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                            case 2:
                                g12.j outputData2 = (g12.j) obj9;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                boolean z3 = outputData2 instanceof g12.i;
                                com.revolut.feature.apm.wero.impl.ui.pay.b bVar4 = bVar2;
                                if (z3) {
                                    bVar4.l2(new ga9.v(bVar4, ((g12.i) outputData2).f139523a, (Continuation) null, 24), new yi5.b(26));
                                } else {
                                    boolean z4 = outputData2 instanceof g12.h;
                                    c cVar2 = c.f144060a;
                                    if (!z4 && !(outputData2 instanceof g12.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar4.C2(cVar2);
                                }
                                return Unit.f186387a;
                            case 3:
                                g12.e outputData3 = (g12.e) obj9;
                                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                boolean zF = Intrinsics.f(outputData3, g12.c.f139518a);
                                com.revolut.feature.apm.wero.impl.ui.pay.b bVar5 = bVar2;
                                if (zF) {
                                    oki.h.u2(bVar5, bVar5.f63098x, WeroPayFlowContract$Step.CreateRequestLink.f63086a, null, 6);
                                } else {
                                    if (!Intrinsics.f(outputData3, g12.d.f139519a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar5.C2(c.f144060a);
                                }
                                return Unit.f186387a;
                            case 4:
                                u0 it9 = (u0) obj9;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                oki.h.D2(bVar2.f63098x);
                                return Unit.f186387a;
                            case 5:
                                f12.f it10 = (f12.f) obj9;
                                Intrinsics.checkNotNullParameter(it10, "it");
                                oki.h.D2(bVar2.f63098x);
                                return Unit.f186387a;
                            default:
                                g12.e outputData4 = (g12.e) obj9;
                                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                if (!Intrinsics.f(outputData4, g12.c.f139518a)) {
                                    if (!Intrinsics.f(outputData4, g12.d.f139519a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.D2(bVar2.f63098x);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block15, "block");
                createRequestLinkScreen.H = block15;
                return createRequestLinkScreen;
            case 6:
                final com.revolut.feature.retail.salary_account.impl.work_email.flow.a aVar2 = (com.revolut.feature.retail.salary_account.impl.work_email.flow.a) obj4;
                VerifyEmploymentFlowContract$Step step3 = (VerifyEmploymentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof VerifyEmploymentFlowContract$Step.VerifyEmployment) {
                    VerifyEmploymentFlowContract$Step.VerifyEmployment verifyEmployment = (VerifyEmploymentFlowContract$Step.VerifyEmployment) step3;
                    WorkEmailInputController workEmailInputController = new WorkEmailInputController(new WorkEmailInputControllerContract$InputData(verifyEmployment.f83068b, verifyEmployment.f83067a));
                    Function1 block16 = new Function1() { // from class: gib.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i5) {
                                case 0:
                                    wpc.j outputData = (wpc.j) obj9;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof wpc.g) {
                                        h.D2(aVar2.o);
                                    } else if (!Intrinsics.f(outputData, wpc.h.f299222a) && !Intrinsics.f(outputData, wpc.i.f299223a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    hib.j outputData2 = (hib.j) obj9;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof hib.h;
                                    com.revolut.feature.retail.salary_account.impl.work_email.flow.a aVar3 = aVar2;
                                    if (z3) {
                                        h.t2(aVar3, aVar3.o, new VerifyEmploymentFlowContract$Step.VerificationInProgress(((hib.h) outputData2).f152579a, null), false, null, false, 12);
                                    } else if (outputData2 instanceof hib.i) {
                                        h.t2(aVar3, aVar3.o, VerifyEmploymentFlowContract$Step.SalaryDetails.f83064a, false, null, false, 12);
                                    } else {
                                        if (!(outputData2 instanceof hib.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.w2(aVar3.o, VerifyEmploymentFlowContract$Step.PromotionInactive.f83063a, ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    mib.f outputData3 = (mib.f) obj9;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z4 = outputData3 instanceof e;
                                    com.revolut.feature.retail.salary_account.impl.work_email.flow.a aVar4 = aVar2;
                                    if (z4) {
                                        h.t2(aVar4, aVar4.o, VerifyEmploymentFlowContract$Step.SalaryDetails.f83064a, false, null, false, 12);
                                    } else {
                                        if (!(outputData3 instanceof d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar4, aVar4.o, new VerifyEmploymentFlowContract$Step.VerifyEmployment(true, ((d) outputData3).f205638a), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block16, "block");
                    workEmailInputController.H = block16;
                    return workEmailInputController;
                }
                if (step3 instanceof VerifyEmploymentFlowContract$Step.VerificationInProgress) {
                    VerifyEmploymentFlowContract$Step.VerificationInProgress verificationInProgress = (VerifyEmploymentFlowContract$Step.VerificationInProgress) step3;
                    WorkEmailVerificationController workEmailVerificationController = new WorkEmailVerificationController(new WorkEmailVerificationControllerContract$InputData(verificationInProgress.f83065a, verificationInProgress.f83066b));
                    final int i59 = 2;
                    Function1 block17 = new Function1() { // from class: gib.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i59) {
                                case 0:
                                    wpc.j outputData = (wpc.j) obj9;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof wpc.g) {
                                        h.D2(aVar2.o);
                                    } else if (!Intrinsics.f(outputData, wpc.h.f299222a) && !Intrinsics.f(outputData, wpc.i.f299223a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    hib.j outputData2 = (hib.j) obj9;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof hib.h;
                                    com.revolut.feature.retail.salary_account.impl.work_email.flow.a aVar3 = aVar2;
                                    if (z3) {
                                        h.t2(aVar3, aVar3.o, new VerifyEmploymentFlowContract$Step.VerificationInProgress(((hib.h) outputData2).f152579a, null), false, null, false, 12);
                                    } else if (outputData2 instanceof hib.i) {
                                        h.t2(aVar3, aVar3.o, VerifyEmploymentFlowContract$Step.SalaryDetails.f83064a, false, null, false, 12);
                                    } else {
                                        if (!(outputData2 instanceof hib.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.w2(aVar3.o, VerifyEmploymentFlowContract$Step.PromotionInactive.f83063a, ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    mib.f outputData3 = (mib.f) obj9;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z4 = outputData3 instanceof e;
                                    com.revolut.feature.retail.salary_account.impl.work_email.flow.a aVar4 = aVar2;
                                    if (z4) {
                                        h.t2(aVar4, aVar4.o, VerifyEmploymentFlowContract$Step.SalaryDetails.f83064a, false, null, false, 12);
                                    } else {
                                        if (!(outputData3 instanceof d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar4, aVar4.o, new VerifyEmploymentFlowContract$Step.VerifyEmployment(true, ((d) outputData3).f205638a), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    workEmailVerificationController.H = block17;
                    return workEmailVerificationController;
                }
                if (step3 instanceof VerifyEmploymentFlowContract$Step.SalaryDetails) {
                    ViewController viewControllerE17 = aVar2.e1(new wpc.k(new wpc.d(null, wpc.e.FULL_SCREEN)));
                    Function1 block18 = new Function1() { // from class: gib.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i6) {
                                case 0:
                                    wpc.j outputData = (wpc.j) obj9;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof wpc.g) {
                                        h.D2(aVar2.o);
                                    } else if (!Intrinsics.f(outputData, wpc.h.f299222a) && !Intrinsics.f(outputData, wpc.i.f299223a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    hib.j outputData2 = (hib.j) obj9;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof hib.h;
                                    com.revolut.feature.retail.salary_account.impl.work_email.flow.a aVar3 = aVar2;
                                    if (z3) {
                                        h.t2(aVar3, aVar3.o, new VerifyEmploymentFlowContract$Step.VerificationInProgress(((hib.h) outputData2).f152579a, null), false, null, false, 12);
                                    } else if (outputData2 instanceof hib.i) {
                                        h.t2(aVar3, aVar3.o, VerifyEmploymentFlowContract$Step.SalaryDetails.f83064a, false, null, false, 12);
                                    } else {
                                        if (!(outputData2 instanceof hib.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.w2(aVar3.o, VerifyEmploymentFlowContract$Step.PromotionInactive.f83063a, ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    mib.f outputData3 = (mib.f) obj9;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z4 = outputData3 instanceof e;
                                    com.revolut.feature.retail.salary_account.impl.work_email.flow.a aVar4 = aVar2;
                                    if (z4) {
                                        h.t2(aVar4, aVar4.o, VerifyEmploymentFlowContract$Step.SalaryDetails.f83064a, false, null, false, 12);
                                    } else {
                                        if (!(outputData3 instanceof d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar4, aVar4.o, new VerifyEmploymentFlowContract$Step.VerifyEmployment(true, ((d) outputData3).f205638a), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    viewControllerE17.H = block18;
                    return viewControllerE17;
                }
                if (!(step3 instanceof VerifyEmploymentFlowContract$Step.PromotionInactive)) {
                    throw new NoWhenBranchMatchedException();
                }
                PromotionInactivePromptController promotionInactivePromptController = new PromotionInactivePromptController(new PromotionInactivePromptControllerContract$InputData(new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salaried_growth_work_email_verification_ended_prompt_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salaried_growth_work_email_verification_ended_prompt_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salaried_growth_work_email_verification_ended_prompt_got_it, null, null, 14)));
                promotionInactivePromptController.l2(new g8i.h(aVar2, 9));
                return promotionInactivePromptController;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((t) obj4).a();
            case 8:
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.c cVar2 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.c) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                OpenBankingConsentsFlowContract$Step step4 = (OpenBankingConsentsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof OpenBankingConsentsFlowContract$Step.ConsentsList) {
                    OpenBankingConsentsFlowContract$Step.ConsentsList consentsList = (OpenBankingConsentsFlowContract$Step.ConsentsList) step4;
                    ConsentsListScreen consentsListScreen = new ConsentsListScreen(new ConsentsListScreenContract$InputData(consentsList.f72747a, consentsList.f72748b));
                    gl6.d block19 = new gl6.d(cVar2, LazyFlowCoordinator, step4, i6);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    consentsListScreen.H = block19;
                    return consentsListScreen;
                }
                if (step4 instanceof OpenBankingConsentsFlowContract$Step.ConsentDetails) {
                    OpenBankingConsentsFlowContract$Step.ConsentDetails consentDetails = (OpenBankingConsentsFlowContract$Step.ConsentDetails) step4;
                    ConsentDetailsScreen consentDetailsScreen = new ConsentDetailsScreen(new ConsentDetailsScreenContract$InputData(consentDetails.f72744a, consentDetails.f72745b, consentDetails.e));
                    gbi.c block20 = new gbi.c(cVar2, LazyFlowCoordinator, step4, 23);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    consentDetailsScreen.H = block20;
                    return consentDetailsScreen;
                }
                if (step4 instanceof OpenBankingConsentsFlowContract$Step.ClientsList) {
                    ClientsListScreen clientsListScreen = new ClientsListScreen(new ClientsListScreenContract$Input(((OpenBankingConsentsFlowContract$Step.ClientsList) step4).f72743a));
                    gl6.d block21 = new gl6.d(step4, cVar2, LazyFlowCoordinator);
                    Intrinsics.checkNotNullParameter(block21, "block");
                    clientsListScreen.H = block21;
                    return clientsListScreen;
                }
                if (step4 instanceof OpenBankingConsentsFlowContract$Step.InactiveConsentsList) {
                    InactiveConsentsListScreen inactiveConsentsListScreen = new InactiveConsentsListScreen(new InactiveConsentsListScreenContract$InputData(((OpenBankingConsentsFlowContract$Step.InactiveConsentsList) step4).f72749a));
                    gl6.d block22 = new gl6.d(cVar2, LazyFlowCoordinator, step4, 2);
                    Intrinsics.checkNotNullParameter(block22, "block");
                    inactiveConsentsListScreen.H = block22;
                    return inactiveConsentsListScreen;
                }
                if (!(step4 instanceof OpenBankingConsentsFlowContract$Step.RevokeDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                RevokeConsentBottomSheetScreen revokeConsentBottomSheetScreen = new RevokeConsentBottomSheetScreen(new RevokeConsentBottomSheetScreenContract$InputData(((OpenBankingConsentsFlowContract$Step.RevokeDialog) step4).f72750a));
                gbi.c block23 = new gbi.c(cVar2, step4, 24);
                Intrinsics.checkNotNullParameter(block23, "block");
                revokeConsentBottomSheetScreen.H = block23;
                return revokeConsentBottomSheetScreen;
            case 9:
                com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow.a aVar3 = (com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow.a) obj4;
                InfoSheetFlowContract$InputData infoSheetFlowContract$InputData = aVar3.o;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                InfoSheetFlowContract$Step step5 = (InfoSheetFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof InfoSheetFlowContract$Step.BottomSheet) {
                    modalInfoSheetScreen = new BottomInfoSheetScreen(infoSheetFlowContract$InputData.f83212a.f86508a);
                } else {
                    if (!(step5 instanceof InfoSheetFlowContract$Step.ModalSheet)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    modalInfoSheetScreen = new ModalInfoSheetScreen(infoSheetFlowContract$InputData.f83212a.f86508a);
                }
                modalInfoSheetScreen.l2(new dld.c(aVar3, LazyFlowCoordinator2, 2));
                return modalInfoSheetScreen;
            case 10:
                final com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d dVar = (com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d) obj4;
                oe6.a aVar4 = dVar.f72893p;
                hm6.a aVar5 = dVar.u;
                le6.c cVar3 = dVar.f72897t;
                CrossBorderLinkAccountFlowContract$InputData crossBorderLinkAccountFlowContract$InputData = dVar.o;
                final yki.l FlowCoordinator = (yki.l) obj2;
                CrossBorderLinkAccountFlowContract$Step step6 = (CrossBorderLinkAccountFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof CrossBorderLinkAccountFlowContract$Step.Institutions) {
                    CrossBorderInstitutionsScreen crossBorderInstitutionsScreen = new CrossBorderInstitutionsScreen(new jo6.l(null, se6.g.LINK, crossBorderLinkAccountFlowContract$InputData.f72863h));
                    Function1 block24 = new Function1() { // from class: gm6.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i6) {
                                case 0:
                                    com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.a result2 = (com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.a) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z3 = result2 instanceof jo6.m;
                                    yki.l lVar = FlowCoordinator;
                                    ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                    if (z3) {
                                        se6.d dVar2 = ((jo6.m) result2).f176881a;
                                        se6.a aVar6 = dVar2.k;
                                        if (aVar6 == null) {
                                            com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d dVar3 = dVar;
                                            yki.a aVar7 = dVar3.f72900y;
                                            se6.f fVar = dVar2.d;
                                            String str = dVar2.f262126b;
                                            String str2 = dVar2.f262125a;
                                            int i66 = i.f144780a[fVar.ordinal()];
                                            if (i66 == 1) {
                                                se6.i iVar = dVar2.f262130j;
                                                if (iVar == null) {
                                                    oki.h.t2(dVar3, aVar7, new CrossBorderLinkAccountFlowContract$Step.CountryDepartments(str2, str), true, null, false, 12);
                                                } else {
                                                    dVar3.f72899x.getClass();
                                                    oki.h.w2(aVar7, new CrossBorderLinkAccountFlowContract$Step.TakeUserRegionForGlobalBankDialog(str2, str, im6.a.a(iVar)), bottom_dialog);
                                                }
                                            } else if (i66 == 2) {
                                                oki.h.t2(dVar3, aVar7, new CrossBorderLinkAccountFlowContract$Step.Consent(str2, str, null), true, null, false, 12);
                                            } else {
                                                if (i66 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                oki.h.t2(dVar3, aVar7, new CrossBorderLinkAccountFlowContract$Step.Branches(str2, str), true, null, false, 12);
                                            }
                                        } else {
                                            oki.h.w2(lVar, new CrossBorderLinkAccountFlowContract$Step.InstitutionNotAvailableDialog(aVar6.f262119a, aVar6.f262120b), bottom_dialog);
                                        }
                                    } else {
                                        if (!(result2 instanceof a.C0486a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(lVar, CrossBorderLinkAccountFlowContract$Step.InstitutionNotListedDialog.f72881a, bottom_dialog);
                                    }
                                    return Unit.f186387a;
                                default:
                                    dii.g result3 = (dii.g) obj9;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof dii.e) {
                                        oki.h.t2(dVar, FlowCoordinator, CrossBorderLinkAccountFlowContract$Step.Institutions.f72883a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    crossBorderInstitutionsScreen.H = block24;
                    return crossBorderInstitutionsScreen;
                }
                if (step6 instanceof CrossBorderLinkAccountFlowContract$Step.CountryDepartments) {
                    CrossBorderCountryDepartmentsScreen crossBorderCountryDepartmentsScreen = new CrossBorderCountryDepartmentsScreen(new ho6.i(((CrossBorderLinkAccountFlowContract$Step.CountryDepartments) step6).f72875a));
                    gm6.h block25 = new gm6.h(dVar, step6, FlowCoordinator, i6);
                    Intrinsics.checkNotNullParameter(block25, "block");
                    crossBorderCountryDepartmentsScreen.H = block25;
                    return crossBorderCountryDepartmentsScreen;
                }
                if (step6 instanceof CrossBorderLinkAccountFlowContract$Step.Branches) {
                    CrossBorderBranchesScreen crossBorderBranchesScreen = new CrossBorderBranchesScreen(new fo6.j(((CrossBorderLinkAccountFlowContract$Step.Branches) step6).f72868a));
                    gm6.h block26 = new gm6.h(dVar, FlowCoordinator, step6, i5);
                    Intrinsics.checkNotNullParameter(block26, "block");
                    crossBorderBranchesScreen.H = block26;
                    return crossBorderBranchesScreen;
                }
                if (step6 instanceof CrossBorderLinkAccountFlowContract$Step.Consent) {
                    consentScreen = new ConsentScreen(new tn6.g(crossBorderLinkAccountFlowContract$InputData.d, ((xg6.j) aVar4).a(((CrossBorderLinkAccountFlowContract$Step.Consent) step6).f72870a)));
                    gbi.c block27 = new gbi.c(dVar, step6, 25);
                    Intrinsics.checkNotNullParameter(block27, "block");
                    consentScreen.H = block27;
                } else {
                    if (!(step6 instanceof CrossBorderLinkAccountFlowContract$Step.ConsentForPreselectedInstitution)) {
                        if (step6 instanceof CrossBorderLinkAccountFlowContract$Step.InstitutionOffLineErrorDialog) {
                            com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(((fn6.b) cVar3).c(crossBorderLinkAccountFlowContract$InputData.f));
                            baa.c block28 = new baa.c(dVar, FlowCoordinator, i2);
                            Intrinsics.checkNotNullParameter(block28, "block");
                            actionsBottomSheetController.H = block28;
                            return actionsBottomSheetController;
                        }
                        if (step6 instanceof CrossBorderLinkAccountFlowContract$Step.InstitutionAlreadyLinkErrorDialog) {
                            com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController2 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(((fn6.b) cVar3).a(((CrossBorderLinkAccountFlowContract$Step.InstitutionAlreadyLinkErrorDialog) step6).f72877a, crossBorderLinkAccountFlowContract$InputData.f));
                            Function1 block29 = new Function1() { // from class: gm6.g
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj9) {
                                    switch (i5) {
                                        case 0:
                                            com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.a result2 = (com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.a) obj9;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            boolean z3 = result2 instanceof jo6.m;
                                            yki.l lVar = FlowCoordinator;
                                            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                            if (z3) {
                                                se6.d dVar2 = ((jo6.m) result2).f176881a;
                                                se6.a aVar6 = dVar2.k;
                                                if (aVar6 == null) {
                                                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d dVar3 = dVar;
                                                    yki.a aVar7 = dVar3.f72900y;
                                                    se6.f fVar = dVar2.d;
                                                    String str = dVar2.f262126b;
                                                    String str2 = dVar2.f262125a;
                                                    int i66 = i.f144780a[fVar.ordinal()];
                                                    if (i66 == 1) {
                                                        se6.i iVar = dVar2.f262130j;
                                                        if (iVar == null) {
                                                            oki.h.t2(dVar3, aVar7, new CrossBorderLinkAccountFlowContract$Step.CountryDepartments(str2, str), true, null, false, 12);
                                                        } else {
                                                            dVar3.f72899x.getClass();
                                                            oki.h.w2(aVar7, new CrossBorderLinkAccountFlowContract$Step.TakeUserRegionForGlobalBankDialog(str2, str, im6.a.a(iVar)), bottom_dialog);
                                                        }
                                                    } else if (i66 == 2) {
                                                        oki.h.t2(dVar3, aVar7, new CrossBorderLinkAccountFlowContract$Step.Consent(str2, str, null), true, null, false, 12);
                                                    } else {
                                                        if (i66 != 3) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        oki.h.t2(dVar3, aVar7, new CrossBorderLinkAccountFlowContract$Step.Branches(str2, str), true, null, false, 12);
                                                    }
                                                } else {
                                                    oki.h.w2(lVar, new CrossBorderLinkAccountFlowContract$Step.InstitutionNotAvailableDialog(aVar6.f262119a, aVar6.f262120b), bottom_dialog);
                                                }
                                            } else {
                                                if (!(result2 instanceof a.C0486a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                oki.h.w2(lVar, CrossBorderLinkAccountFlowContract$Step.InstitutionNotListedDialog.f72881a, bottom_dialog);
                                            }
                                            return Unit.f186387a;
                                        default:
                                            dii.g result3 = (dii.g) obj9;
                                            Intrinsics.checkNotNullParameter(result3, "result");
                                            if (result3 instanceof dii.e) {
                                                oki.h.t2(dVar, FlowCoordinator, CrossBorderLinkAccountFlowContract$Step.Institutions.f72883a, false, null, false, 12);
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block29, "block");
                            actionsBottomSheetController2.H = block29;
                            return actionsBottomSheetController2;
                        }
                        if (step6 instanceof CrossBorderLinkAccountFlowContract$Step.InstitutionLinkLimitErrorDialog) {
                            com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController3 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(((fn6.b) cVar3).b(((CrossBorderLinkAccountFlowContract$Step.InstitutionLinkLimitErrorDialog) step6).f72878a, crossBorderLinkAccountFlowContract$InputData.f));
                            baa.c block30 = new baa.c(dVar, FlowCoordinator, 11);
                            Intrinsics.checkNotNullParameter(block30, "block");
                            actionsBottomSheetController3.H = block30;
                            return actionsBottomSheetController3;
                        }
                        if (step6 instanceof CrossBorderLinkAccountFlowContract$Step.InstitutionNotListedDialog) {
                            k9 value = k9.OpenBanking;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                            Intrinsics.checkNotNullParameter(value, "value");
                            AnalyticsProduct.Retail analyticsProduct2 = new AnalyticsProduct.Retail(value);
                            aVar5.getClass();
                            Intrinsics.checkNotNullParameter(analyticsProduct2, "analyticsProduct");
                            return new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_bank_selection_bank_not_in_list, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_entity_not_in_list_linking_subtitle, null, null, 14), null, null, false, 28), hm6.a.a(), analyticsProduct2, null, null, 24));
                        }
                        if (step6 instanceof CrossBorderLinkAccountFlowContract$Step.CountryDepartmentNotListedDialog) {
                            k9 value2 = k9.OpenBanking;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                            Intrinsics.checkNotNullParameter(value2, "value");
                            AnalyticsProduct.Retail analyticsProduct3 = new AnalyticsProduct.Retail(value2);
                            aVar5.getClass();
                            Intrinsics.checkNotNullParameter(analyticsProduct3, "analyticsProduct");
                            return new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_country_selection_country_not_in_list, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_entity_not_in_list_linking_subtitle, null, null, 14), null, null, false, 28), hm6.a.a(), analyticsProduct3, null, null, 24));
                        }
                        if (step6 instanceof CrossBorderLinkAccountFlowContract$Step.BranchNotListedDialog) {
                            k9 value3 = k9.OpenBanking;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                            Intrinsics.checkNotNullParameter(value3, "value");
                            AnalyticsProduct.Retail analyticsProduct4 = new AnalyticsProduct.Retail(value3);
                            aVar5.getClass();
                            Intrinsics.checkNotNullParameter(analyticsProduct4, "analyticsProduct");
                            return new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_bank_selection_branch_not_in_list, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_entity_not_in_list_linking_subtitle, null, null, 14), null, null, false, 28), hm6.a.a(), analyticsProduct4, null, null, 24));
                        }
                        if (!(step6 instanceof CrossBorderLinkAccountFlowContract$Step.TakeUserRegionForGlobalBankDialog)) {
                            if (!(step6 instanceof CrossBorderLinkAccountFlowContract$Step.InstitutionNotAvailableDialog)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            CrossBorderLinkAccountFlowContract$Step.InstitutionNotAvailableDialog institutionNotAvailableDialog = (CrossBorderLinkAccountFlowContract$Step.InstitutionNotAvailableDialog) step6;
                            return new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(((fn6.a) dVar.f72898w).a(crossBorderLinkAccountFlowContract$InputData.f, institutionNotAvailableDialog.f72879a, institutionNotAvailableDialog.f72880b));
                        }
                        fm6.a aVar6 = dVar.v;
                        CrossBorderCountryDepartmentUiModel crossBorderCountryDepartmentUiModel = ((CrossBorderLinkAccountFlowContract$Step.TakeUserRegionForGlobalBankDialog) step6).f72886c;
                        String str = crossBorderCountryDepartmentUiModel.f72903c;
                        String str2 = crossBorderCountryDepartmentUiModel.f72902b;
                        AnalyticsProduct analyticsProduct5 = crossBorderLinkAccountFlowContract$InputData.f;
                        aVar6.getClass();
                        com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController4 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(fm6.a.a(analyticsProduct5, str, str2));
                        gm6.h block31 = new gm6.h(dVar, step6, FlowCoordinator, 3);
                        Intrinsics.checkNotNullParameter(block31, "block");
                        actionsBottomSheetController4.H = block31;
                        return actionsBottomSheetController4;
                    }
                    consentScreen = new ConsentScreen(new tn6.g(crossBorderLinkAccountFlowContract$InputData.d, ((xg6.j) aVar4).a(((CrossBorderLinkAccountFlowContract$Step.ConsentForPreselectedInstitution) step6).f72873a.f72864a)));
                    gm6.h block32 = new gm6.h(dVar, FlowCoordinator, step6, 2);
                    Intrinsics.checkNotNullParameter(block32, "block");
                    consentScreen.H = block32;
                }
                return consentScreen;
            case 11:
                Function1 errorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return new gna.g(((gna.e) obj4).f144942b, (List) errorItems.invoke(new iii.d(12, null, true, true, null)));
            case 12:
                gq2.h hVar = (gq2.h) obj4;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new gq2.k(iii.c.b(null, null, 6, false), o.d(hVar), o.b(hVar), o.a(hVar), null, false);
            case 13:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a aVar7 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CryptoBeneficiaryDetailsScreenInternalContract$ModalStep step7 = (CryptoBeneficiaryDetailsScreenInternalContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof CryptoBeneficiaryDetailsScreenInternalContract$ModalStep.MultichainInfo) {
                    return aVar7.e1(new rj5.b(rj5.c.ADDRESS_TYPE));
                }
                if (step7 instanceof CryptoBeneficiaryDetailsScreenInternalContract$ModalStep.CommonRemittanceField) {
                    return aVar7.e1(new rj5.a(((CryptoBeneficiaryDetailsScreenInternalContract$ModalStep.CommonRemittanceField) step7).f71287a));
                }
                if (!(step7 instanceof CryptoBeneficiaryDetailsScreenInternalContract$ModalStep.BelongToYouDialog)) {
                    if (Intrinsics.f(step7, CryptoBeneficiaryDetailsScreenInternalContract$ModalStep.ChangeBackgroundDialog.f71286a)) {
                        return aVar7.f71295x.Z2(aVar7.o.f71132a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                aVar7.f71292s.getClass();
                lw0.a aVar8 = new lw0.a(new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_address_details_belong_to_you_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_address_details_belong_to_you_description, null, null, 14), null, null, false, 28);
                aw0.h hVar2 = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_address_details_no_someone_else_title, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                x0 value4 = x0.Crypto;
                Parcelable.Creator<AnalyticsProduct.Business> creator4 = AnalyticsProduct.Business.CREATOR;
                Intrinsics.checkNotNullParameter(value4, "value");
                com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController5 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(aVar8, hVar2, new AnalyticsProduct.Business(value4), null, null, 24));
                gbi.c block33 = new gbi.c(aVar7, step7, 29);
                Intrinsics.checkNotNullParameter(block33, "block");
                actionsBottomSheetController5.H = block33;
                return actionsBottomSheetController5;
            case 14:
                AccountDetailsController accountDetailsController = (AccountDetailsController) obj4;
                InputTextDelegate.Model input = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                KProperty[] kPropertyArr = AccountDetailsController.R;
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(field, "field");
                String str3 = input.f52580a;
                MaskedTextInputEditText innerEditText = field.getInnerEditText();
                Object obj9 = input.P;
                return new zp0.y(innerEditText, null, obj9 == null ? "[0000] [0000] [0000] [0000] [000]" : String.valueOf(obj9), new gqk.b(accountDetailsController, 3), str3, DigitsKeyListener.getInstance("1234567890 "), false, 66);
            case 15:
                final com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) obj4;
                y yVar2 = dVar2.f87925x;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                final AddEditAssetContract$ModalStep step8 = (AddEditAssetContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof AddEditAssetContract$ModalStep.CountryPicker) {
                    Object obj10 = ((grd.a) ((j2) yVar2.f22677a).getValue()).c().get(((AddEditAssetContract$ModalStep.CountryPicker) step8).f87912a);
                    PickerController pickerController5 = new PickerController(new x(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_title_choose_country_or_region, null, null, 14), null, null, null, false, null, new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_placeholder_search, null, null, 14), null, null, false, null, obj10 instanceof String ? (String) obj10 : null, null, null, false, null, null, null, null, null, 2147352062), dVar2.f87919p);
                    Function1 block34 = new Function1() { // from class: grd.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            switch (i6) {
                                case 0:
                                    s7a.a0 result2 = (s7a.a0) obj11;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    c0 c0Var = result2.f260599a;
                                    if (c0Var instanceof c8a.a) {
                                        dVar2.J2(((AddEditAssetContract$ModalStep.CountryPicker) step8).f87912a, true, ((c8a.a) c0Var).f22154a);
                                    }
                                    break;
                                default:
                                    eii.k result3 = (eii.k) obj11;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof eii.i) {
                                        Object obj12 = ((eii.i) result3).f126655a;
                                        String str4 = obj12 instanceof String ? (String) obj12 : null;
                                        if (str4 != null) {
                                            dVar2.J2(((AddEditAssetContract$ModalStep.OptionsBottomSheet) step8).f87916a.f99227a, true, str4);
                                        }
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block34, "block");
                    pickerController5.H = block34;
                    return pickerController5;
                }
                if (Intrinsics.f(step8, AddEditAssetContract$ModalStep.CurrencyPicker.f87913a)) {
                    PickerController pickerController6 = new PickerController(new x(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_title_choose_currency, null, null, 14), null, null, null, false, null, new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_placeholder_search, null, null, 14), null, null, false, null, ((grd.a) ((j2) yVar2.f22677a).getValue()).f145984c.f306286a, null, null, false, null, null, null, null, null, 2147352062), dVar2.f87920q);
                    Function1 block35 = new Function1() { // from class: grd.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            switch (i6) {
                                case 0:
                                    s7a.a0 result2 = (s7a.a0) obj11;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    c0 c0Var = result2.f260599a;
                                    if (c0Var instanceof ird.c) {
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar3 = dVar2;
                                        dVar3.H2(dVar3.f87925x, new gi1.p(c0Var, 3));
                                    }
                                    break;
                                default:
                                    yja.b outputData = (yja.b) obj11;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar4 = dVar2;
                                    dVar4.n2(new gm6.j(outputData, dVar4, null, 8), new whi.b(6));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block35, "block");
                    pickerController6.H = block35;
                    return pickerController6;
                }
                if (step8 instanceof AddEditAssetContract$ModalStep.OptionsBottomSheet) {
                    LinkedHashMap linkedHashMapC = ((grd.a) ((j2) yVar2.f22677a).getValue()).c();
                    CustomAssetFieldDefinition customAssetFieldDefinition = ((AddEditAssetContract$ModalStep.OptionsBottomSheet) step8).f87916a;
                    Object obj11 = linkedHashMapC.get(customAssetFieldDefinition.f99227a);
                    String str4 = obj11 instanceof String ? (String) obj11 : null;
                    lw0.a aVar9 = new lw0.a(rrd.d.b(customAssetFieldDefinition), null, null, null, false, 30);
                    List<String> list = customAssetFieldDefinition.e;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    for (String str5 : list) {
                        arrayList.add(new eii.l((Clause) rrd.d.e(customAssetFieldDefinition, str5), (Clause) null, (RowDelegate.Model.MainImage) null, true, Intrinsics.f(str5, str4), (RowDelegate.Model.c) null, (Object) str5, 200));
                    }
                    RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar9, null, arrayList, AnalyticsProduct.Shared.Analytics.f, null));
                    Function1 block36 = new Function1() { // from class: grd.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj112) {
                            switch (i5) {
                                case 0:
                                    s7a.a0 result2 = (s7a.a0) obj112;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    c0 c0Var = result2.f260599a;
                                    if (c0Var instanceof c8a.a) {
                                        dVar2.J2(((AddEditAssetContract$ModalStep.CountryPicker) step8).f87912a, true, ((c8a.a) c0Var).f22154a);
                                    }
                                    break;
                                default:
                                    eii.k result3 = (eii.k) obj112;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof eii.i) {
                                        Object obj12 = ((eii.i) result3).f126655a;
                                        String str42 = obj12 instanceof String ? (String) obj12 : null;
                                        if (str42 != null) {
                                            dVar2.J2(((AddEditAssetContract$ModalStep.OptionsBottomSheet) step8).f87916a.f99227a, true, str42);
                                        }
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block36, "block");
                    rowActionsBottomSheetController.H = block36;
                    return rowActionsBottomSheetController;
                }
                if (!(step8 instanceof AddEditAssetContract$ModalStep.DatePicker)) {
                    if (!(step8 instanceof AddEditAssetContract$ModalStep.SmartEstimationProductArticle)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ViewController viewControllerE18 = dVar2.e1(dtd.e.a(((AddEditAssetContract$ModalStep.SmartEstimationProductArticle) step8).f87917a));
                    Function1 block37 = new Function1() { // from class: grd.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj112) {
                            switch (i5) {
                                case 0:
                                    s7a.a0 result2 = (s7a.a0) obj112;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    c0 c0Var = result2.f260599a;
                                    if (c0Var instanceof ird.c) {
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar3 = dVar2;
                                        dVar3.H2(dVar3.f87925x, new gi1.p(c0Var, 3));
                                    }
                                    break;
                                default:
                                    yja.b outputData = (yja.b) obj112;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar4 = dVar2;
                                    dVar4.n2(new gm6.j(outputData, dVar4, null, 8), new whi.b(6));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block37, "block");
                    viewControllerE18.H = block37;
                    return viewControllerE18;
                }
                AddEditAssetContract$ModalStep.DatePicker datePicker = (AddEditAssetContract$ModalStep.DatePicker) step8;
                LinkedHashMap linkedHashMapC2 = ((grd.a) ((j2) yVar2.f22677a).getValue()).c();
                CustomAssetFieldDefinition customAssetFieldDefinition2 = datePicker.f87914a;
                Object obj12 = linkedHashMapC2.get(customAssetFieldDefinition2.f99227a);
                jrd.a aVar10 = datePicker.f87915b;
                int i66 = grd.t.f146013a[aVar10.ordinal()];
                if (i66 == 1) {
                    TextLocalisedClause textLocalisedClauseB = rrd.d.b(customAssetFieldDefinition2);
                    String str6 = obj12 instanceof String ? (String) obj12 : null;
                    cVar = new jrd.c(textLocalisedClauseB, aVar10, str6 != null ? kotlin.text.z.m(str6) : null, null);
                } else {
                    if (i66 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str7 = obj12 instanceof String ? (String) obj12 : null;
                    LocalDate localDate = str7 != null ? LocalDate.parse(str7) : null;
                    cVar = new jrd.c(rrd.d.b(customAssetFieldDefinition2), aVar10, localDate != null ? Integer.valueOf(localDate.getYear()) : null, localDate != null ? Integer.valueOf(localDate.getMonthValue()) : null);
                }
                DatePickerBottomSheetController datePickerBottomSheetController = new DatePickerBottomSheetController(cVar);
                s block38 = new s(datePicker, dVar2, 2);
                Intrinsics.checkNotNullParameter(block38, "block");
                datePickerBottomSheetController.H = block38;
                return datePickerBottomSheetController;
            case 16:
                com.revolut.feature.raffle.impl.flow.a aVar11 = (com.revolut.feature.raffle.impl.flow.a) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                RaffleFlowContract$Step step9 = (RaffleFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof RaffleFlowContract$Step.Raffle) {
                    RaffleScreen raffleScreen = new RaffleScreen(new RaffleScreenContract$InputData(aVar11.o.f81635a));
                    s block39 = new s(aVar11, FlowCoordinator2, i3);
                    Intrinsics.checkNotNullParameter(block39, "block");
                    raffleScreen.H = block39;
                    return raffleScreen;
                }
                if (step9 instanceof RaffleFlowContract$Step.ShareRaffle) {
                    return new ShareRaffleScreen(new ShareRaffleScreenContract$InputData(((RaffleFlowContract$Step.ShareRaffle) step9).f81638a));
                }
                if (!Intrinsics.f(step9, RaffleFlowContract$Step.NotAvailable.f81636a)) {
                    throw new NoWhenBranchMatchedException();
                }
                RaffleNotAvailableScreen raffleNotAvailableScreen = new RaffleNotAvailableScreen();
                gmk.j block40 = new gmk.j(aVar11, 17);
                Intrinsics.checkNotNullParameter(block40, "block");
                raffleNotAvailableScreen.H = block40;
                return raffleNotAvailableScreen;
            case 17:
                return a(obj2, obj3);
            case 18:
                return b(obj2, obj3);
            case 19:
                com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.a aVar12 = (com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditCardAccruedInterestsScreenContract$ModalStep step10 = (CreditCardAccruedInterestsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof CreditCardAccruedInterestsScreenContract$ModalStep.InterestDetail) {
                    return new CreditCardAccruedInterestsBottomSheetController(new CreditCardAccruedInterestsBottomSheetControllerContract$InputData(aVar12.o.f69666a, ((CreditCardAccruedInterestsScreenContract$ModalStep.InterestDetail) step10).f69669a));
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                com.revolut.feature.security_hub.impl.ui.secure_account.a aVar13 = (com.revolut.feature.security_hub.impl.ui.secure_account.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SecureAccountControllerContract$ModalStep step11 = (SecureAccountControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (Intrinsics.f(step11, SecureAccountControllerContract$ModalStep.FreezeEsimInfoBottomSheet.f85630a)) {
                    return aVar13.e1(fej.a.f134636a);
                }
                throw new NoWhenBranchMatchedException();
            case 21:
                return c(obj2, obj3);
            case 22:
                return d(obj2, obj3);
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
                com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b bVar3 = (com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b) obj4;
                FreelancerPromotionIneligibilityFlowContract$Step step12 = (FreelancerPromotionIneligibilityFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof FreelancerPromotionIneligibilityFlowContract$Step.Prompt)) {
                    throw new NoWhenBranchMatchedException();
                }
                FreelancerPromotionIneligibilityFlowContract$Step.Prompt prompt = (FreelancerPromotionIneligibilityFlowContract$Step.Prompt) step12;
                Clause clause2 = prompt.f74097b;
                Clause clause3 = prompt.f74098c;
                PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(prompt.f74096a, null);
                Clause clause4 = prompt.d;
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("PromptId", clause2, clause3, mediaContent, null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, clause4 != null ? new PromptMarketingContentDelegate.Model.Button(clause4, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62) : null, null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30));
                gwe.d block41 = new gwe.d(bVar3, 16);
                Intrinsics.checkNotNullParameter(block41, "block");
                promptMarketingScreen.H = block41;
                return promptMarketingScreen;
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f144000a = i;
        this.f144001b = obj2;
    }
}
