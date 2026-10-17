package u7k;

import android.os.Parcelable;
import aw0.ka;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import c12.j;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature.apm.aani.impl.ui.AaniFlowContract$Step;
import com.revolut.feature.apm.aani.impl.ui.registration.confirmation.AaniRegistrationConfirmationContract$InputData;
import com.revolut.feature.apm.aani.impl.ui.registration.confirmation.AaniRegistrationConfirmationScreen;
import com.revolut.feature.apm.core.api.product.ApmAani;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$Tab;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.amount.WithdrawalAmountScreen;
import com.revolut.feature.apm.payto.impl.screen.topup.flow.PayToTopupFlowContract$Step;
import com.revolut.feature.apm.payto.impl.screen.topup.linked_account.PayToTopupLinkedAccountScreen;
import com.revolut.feature.apm.payto.impl.screen.topup.status.PayToTopupStatusScreen;
import com.revolut.feature.apm.wero.impl.ui.home.WeroHomeFlowContract$Step;
import com.revolut.feature.apm.wero.impl.ui.home.area.WeroHomeAreaScreen;
import com.revolut.feature.apm.wero.impl.ui.home.payment_area.WeroPaymentAreaScreen;
import com.revolut.feature.backgroundpicker.api.model.BackgroundPickerFlowInput;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.feature.backgroundpicker.impl.flow.BackgroundPickerFlow;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$InputData;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$ModalStep;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$ThemeInfo;
import com.revolut.feature.backgroundpicker.impl.flow.themes_gallery.ThemesGalleryController;
import com.revolut.feature.backgroundpicker.impl.flow.themes_gallery.ThemesGalleryControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.MortgageSignatureSignedFlowContract$Step;
import com.revolut.feature.crypto.gift.asset.api.navigation.CryptoGiftAssetTransferInfoInputData;
import com.revolut.feature.devicemanagement.impl.ui.details.DeviceDetailsController;
import com.revolut.feature.devicemanagement.impl.ui.flow.DeviceManagementFlowContract$Step;
import com.revolut.feature.devicemanagement.impl.ui.list.DeviceListController;
import com.revolut.feature.esim.instructions.navigation.EsimInstructionsControllerDescriptor$InputData;
import com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow.JapanEasyBankAuthorizationFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.japan.authorization.webview.AuthorizationWebViewScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.JuniorAddPhoneNumberScreenContract$ModalStep;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Junior;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.ExchangeGlobalAccessFlowV2Contract$InputData;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.ExchangeGlobalAccessFlowV2Contract$Step;
import com.revolut.feature.payees.impl.ui.payees_overview.junior.JuniorPayeesOverviewScreenContract$Step;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.pix.impl.flow.PixFlowContract$Step;
import com.revolut.feature.pix.impl.flow.alias_registration.AliasRegistrationContract$InputData;
import com.revolut.feature.pix.impl.flow.alias_registration.AliasRegistrationFlow;
import com.revolut.feature.pix.impl.flow.authorisation_request.PixAuthorisationRequestFlow;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.PixAuthorisationTransactionLimitScreen;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.PixAuthorisationTransactionLimitScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.automatico.PixAutomaticoContract$InputData;
import com.revolut.feature.pix.impl.flow.automatico.PixAutomaticoFlow;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreenContract$ModalStep;
import com.revolut.feature.pix.impl.flow.common.PixCommonModalsContract$InputData;
import com.revolut.feature.pix.impl.flow.common.PixCommonModalsFlow;
import com.revolut.feature.pix.impl.flow.copy_paste.PixCopyPasteFlow;
import com.revolut.feature.pix.impl.flow.pix_area.PixAreaFlow;
import com.revolut.feature.pix.impl.flow.pix_area.PixAreaFlowContract$InputData;
import com.revolut.feature.pix.impl.flow.portability_details.PortabilityDetailsContract$InputData;
import com.revolut.feature.pix.impl.flow.portability_details.PortabilityDetailsFlow;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.PixQrCodeTransactionFlow;
import com.revolut.feature.pix.impl.flow.qr_request.PixQrRequestContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_request.PixQrRequestFlow;
import com.revolut.feature.pix.impl.flow.refund.PixRefundFlow;
import com.revolut.feature.pix.impl.flow.transfer.PixTransferFlow;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.payroll_manager_input.PayrollManagerInputController;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.request_summary.RequestSummaryContract$InputData;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.request_summary.RequestSummaryController;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.review_email.ReviewEmailBottomSheetContract$InputData;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.review_email.ReviewEmailBottomSheetController;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.entry.SwitchAssistantEntryController;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.SwitchAssistantFlowContract$InputData;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.SwitchAssistantFlowContract$Step;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.PayrollPlatformEmailInputContract$InputData;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.PayrollPlatformEmailInputController;
import com.revolut.feature.shops.impl.ui.bid_custom_input.BidCustomInputScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.TravelHotelsFiltersScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.sorting.TravelHotelsSortingOptionSelectorScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.sorting.TravelHotelsSortingOptionSelectorScreenContract$InputData;
import com.revolut.feature.uipersonalisation.api.ChristmasThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.HalloweenThemeDeclaration;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.feature_retail_user_declarations.transaction_countries.TransactionCountriesInputData;
import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.CountriesSelectionScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.TransactionCountriesScreen;
import com.revolut.feature_retail_user_declarations.transaction_countries.flow.TransactionCountriesFlowContract$Step;
import com.revolut.feature_retail_user_declarations.transaction_countries.models.TransactionDestination;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.details.RevPointsPocketDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.EsimGiftRecipientSelectionScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.EsimConnectivityTroubleshootingScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkDetailsContract$ModalStep;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$OutputData;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_percentage.PodNomineesPercentageScreen;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanCancelFeatures$CancelReason;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.PlanDowngradeFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block.PlanDowngradeBlockScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block.PlanDowngradeBlockScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_change_confirmation.PlanChangeConfirmationScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_change_confirmation.PlanChangeConfirmationScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.ui.auth_rejected.AuthenticationRejectedFlowContract$Step;
import com.youTransactor.uCube.rpc.Constants;
import d67.p;
import d67.q;
import d67.r;
import d67.s;
import d67.t;
import d67.u;
import grl.k9;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jkl.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.KProperty;
import oki.h;
import org.jmrtd.lds.LDSFile;
import tx0.g4;
import vkm.j2;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class w implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f277974b;

    public /* synthetic */ w(Object obj2, int i) {
        this.f277973a = i;
        this.f277974b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.sso.impl.ui.auth_rejected.a aVar = (com.revolut.sso.impl.ui.auth_rejected.a) this.f277974b;
        l80.e eVar = aVar.o;
        yki.l FlowCoordinator = (yki.l) obj2;
        AuthenticationRejectedFlowContract$Step step = (AuthenticationRejectedFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof AuthenticationRejectedFlowContract$Step.NoActionsAvailable) {
            ZonedDateTime zonedDateTime = ((AuthenticationRejectedFlowContract$Step.NoActionsAvailable) step).f106387a;
            com.revolut.sso.impl.ui.auth_rejected.a.Companion.getClass();
            return aVar.I2(new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_rejected_screen_description_with_cooldown, zhm.u.c(ukl.g.a(eVar, zonedDateTime)), null, 12), null, null);
        }
        if (step instanceof AuthenticationRejectedFlowContract$Step.PrimaryActionAvailable) {
            return aVar.J2(((AuthenticationRejectedFlowContract$Step.PrimaryActionAvailable) step).f106388a);
        }
        if (!(step instanceof AuthenticationRejectedFlowContract$Step.FallbackActionsAvailable)) {
            if (!(step instanceof AuthenticationRejectedFlowContract$Step.PrimaryAndFallbackActionsAvailable)) {
                throw new NoWhenBranchMatchedException();
            }
            AuthenticationRejectedFlowContract$Step.PrimaryAndFallbackActionsAvailable primaryAndFallbackActionsAvailable = (AuthenticationRejectedFlowContract$Step.PrimaryAndFallbackActionsAvailable) step;
            Set set = primaryAndFallbackActionsAvailable.f106389a;
            int i = primaryAndFallbackActionsAvailable.f106390b;
            a3 a3Var = a3.CHAT;
            return set.contains(a3Var) ? aVar.I2(new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_rejected_screen_description_with_chat, null, null, 14), new TextLocalisedClause(i, null, null, 14), a3Var) : aVar.J2(i);
        }
        AuthenticationRejectedFlowContract$Step.FallbackActionsAvailable fallbackActionsAvailable = (AuthenticationRejectedFlowContract$Step.FallbackActionsAvailable) step;
        ZonedDateTime zonedDateTime2 = fallbackActionsAvailable.f106385a;
        Set set2 = fallbackActionsAvailable.f106386b;
        a3 a3Var2 = a3.CHAT;
        if (set2.contains(a3Var2)) {
            com.revolut.sso.impl.ui.auth_rejected.a.Companion.getClass();
            return aVar.I2(new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_rejected_screen_description_with_cooldown_and_chat, zhm.u.c(ukl.g.a(eVar, zonedDateTime2)), null, 12), null, a3Var2);
        }
        com.revolut.sso.impl.ui.auth_rejected.a.Companion.getClass();
        return aVar.I2(new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_rejected_screen_description_with_cooldown, zhm.u.c(ukl.g.a(eVar, zonedDateTime2)), null, 12), null, null);
    }

    private final Object b(Object obj2, Object obj3) {
        final com.revolut.feature.apm.aani.impl.ui.c cVar = (com.revolut.feature.apm.aani.impl.ui.c) this.f277974b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        AaniFlowContract$Step step = (AaniFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        final int i = 0;
        if (step instanceof AaniFlowContract$Step.ProductArticle) {
            ViewController viewControllerE1 = cVar.e1(new ProductArticleDescriptor(cVar.u, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
            Function1 block = new Function1() { // from class: ul1.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    int i2 = i;
                    com.revolut.feature.apm.aani.impl.ui.c cVar2 = cVar;
                    switch (i2) {
                        case 0:
                            yja.b result = (yja.b) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            int i3 = e.f280849a[result.ordinal()];
                            com.revolut.feature.apm.aani.impl.ui.c cVar3 = cVar;
                            if (i3 == 1) {
                                oki.h.D2(cVar3.v);
                            } else if (i3 == 2) {
                                IllegalStateException illegalStateException = new IllegalStateException("Not found product article for Aani product article");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                cVar3.l2(new u83.f(cVar3, null, 12), new g4(1, cVar3, com.revolut.feature.apm.aani.impl.ui.c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 15));
                            } else {
                                if (i3 != 3 && i3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar3.l2(new u83.f(cVar3, null, 12), new g4(1, cVar3, com.revolut.feature.apm.aani.impl.ui.c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 15));
                            }
                            return Unit.f186387a;
                        case 1:
                            j it8 = (j) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            oki.h.D2(cVar2.v);
                            return Unit.f186387a;
                        case 2:
                            PendingPaymentContract$OutputData it9 = (PendingPaymentContract$OutputData) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            oki.h.D2(cVar2.v);
                            return Unit.f186387a;
                        default:
                            xl1.b result2 = (xl1.b) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!Intrinsics.f(result2, xl1.b.f306902a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.D2(cVar2.v);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (step instanceof AaniFlowContract$Step.Confirmation) {
            AaniRegistrationConfirmationScreen aaniRegistrationConfirmationScreen = new AaniRegistrationConfirmationScreen(new AaniRegistrationConfirmationContract$InputData(((AaniFlowContract$Step.Confirmation) step).f61127a));
            final int i2 = 3;
            Function1 block2 = new Function1() { // from class: ul1.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    int i22 = i2;
                    com.revolut.feature.apm.aani.impl.ui.c cVar2 = cVar;
                    switch (i22) {
                        case 0:
                            yja.b result = (yja.b) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            int i3 = e.f280849a[result.ordinal()];
                            com.revolut.feature.apm.aani.impl.ui.c cVar3 = cVar;
                            if (i3 == 1) {
                                oki.h.D2(cVar3.v);
                            } else if (i3 == 2) {
                                IllegalStateException illegalStateException = new IllegalStateException("Not found product article for Aani product article");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                cVar3.l2(new u83.f(cVar3, null, 12), new g4(1, cVar3, com.revolut.feature.apm.aani.impl.ui.c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 15));
                            } else {
                                if (i3 != 3 && i3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar3.l2(new u83.f(cVar3, null, 12), new g4(1, cVar3, com.revolut.feature.apm.aani.impl.ui.c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 15));
                            }
                            return Unit.f186387a;
                        case 1:
                            j it8 = (j) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            oki.h.D2(cVar2.v);
                            return Unit.f186387a;
                        case 2:
                            PendingPaymentContract$OutputData it9 = (PendingPaymentContract$OutputData) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            oki.h.D2(cVar2.v);
                            return Unit.f186387a;
                        default:
                            xl1.b result2 = (xl1.b) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!Intrinsics.f(result2, xl1.b.f306902a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.D2(cVar2.v);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            aaniRegistrationConfirmationScreen.H = block2;
            return aaniRegistrationConfirmationScreen;
        }
        final int i3 = 2;
        final int i5 = 1;
        if (!(step instanceof AaniFlowContract$Step.NewContact)) {
            if (!(step instanceof AaniFlowContract$Step.PendingPayment)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewController viewControllerE12 = cVar.e1(new tak.a(new PendingPaymentContract$InputData.Apm(((AaniFlowContract$Step.PendingPayment) step).f61129a, true), cVar.f61137t));
            Function1 block3 = new Function1() { // from class: ul1.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    int i22 = i3;
                    com.revolut.feature.apm.aani.impl.ui.c cVar2 = cVar;
                    switch (i22) {
                        case 0:
                            yja.b result = (yja.b) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            int i32 = e.f280849a[result.ordinal()];
                            com.revolut.feature.apm.aani.impl.ui.c cVar3 = cVar;
                            if (i32 == 1) {
                                oki.h.D2(cVar3.v);
                            } else if (i32 == 2) {
                                IllegalStateException illegalStateException = new IllegalStateException("Not found product article for Aani product article");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                cVar3.l2(new u83.f(cVar3, null, 12), new g4(1, cVar3, com.revolut.feature.apm.aani.impl.ui.c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 15));
                            } else {
                                if (i32 != 3 && i32 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar3.l2(new u83.f(cVar3, null, 12), new g4(1, cVar3, com.revolut.feature.apm.aani.impl.ui.c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 15));
                            }
                            return Unit.f186387a;
                        case 1:
                            j it8 = (j) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            oki.h.D2(cVar2.v);
                            return Unit.f186387a;
                        case 2:
                            PendingPaymentContract$OutputData it9 = (PendingPaymentContract$OutputData) obj4;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            oki.h.D2(cVar2.v);
                            return Unit.f186387a;
                        default:
                            xl1.b result2 = (xl1.b) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!Intrinsics.f(result2, xl1.b.f306902a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.D2(cVar2.v);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            viewControllerE12.H = block3;
            return viewControllerE12;
        }
        vl1.c cVar2 = cVar.f61135r;
        hrf.f transferDirection = hrf.f.OUTGOING;
        cVar2.getClass();
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        IconNavBarMenuItem iconNavBarMenuItem = new IconNavBarMenuItem("SETTINGS_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_action_settings, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        n02.b bVar = n02.b.AANI;
        List listK = zhm.v.k(ApmNewContactNavigation$Tab.PHONE.f62253b, ApmNewContactNavigation$Tab.EMAIL.f62252b);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_new_contact_title, zhm.u.c(ApmAani.f61807c.e()), null, 12);
        wi0.b.Companion.getClass();
        ViewController viewControllerE13 = cVar.e1(new c12.g(new ApmNewContactNavigation$InputData(bVar, listK, transferDirection, textLocalisedClause, wi0.b.f297734c, zhm.u.c(iconNavBarMenuItem), (String) null, 32), cVar2.f290168a));
        Function1 block4 = new Function1() { // from class: ul1.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                int i22 = i5;
                com.revolut.feature.apm.aani.impl.ui.c cVar22 = cVar;
                switch (i22) {
                    case 0:
                        yja.b result = (yja.b) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        int i32 = e.f280849a[result.ordinal()];
                        com.revolut.feature.apm.aani.impl.ui.c cVar3 = cVar;
                        if (i32 == 1) {
                            oki.h.D2(cVar3.v);
                        } else if (i32 == 2) {
                            IllegalStateException illegalStateException = new IllegalStateException("Not found product article for Aani product article");
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            cVar3.l2(new u83.f(cVar3, null, 12), new g4(1, cVar3, com.revolut.feature.apm.aani.impl.ui.c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 15));
                        } else {
                            if (i32 != 3 && i32 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar3.l2(new u83.f(cVar3, null, 12), new g4(1, cVar3, com.revolut.feature.apm.aani.impl.ui.c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 15));
                        }
                        return Unit.f186387a;
                    case 1:
                        j it8 = (j) obj4;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        oki.h.D2(cVar22.v);
                        return Unit.f186387a;
                    case 2:
                        PendingPaymentContract$OutputData it9 = (PendingPaymentContract$OutputData) obj4;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        oki.h.D2(cVar22.v);
                        return Unit.f186387a;
                    default:
                        xl1.b result2 = (xl1.b) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (!Intrinsics.f(result2, xl1.b.f306902a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.D2(cVar22.v);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block4, "block");
        viewControllerE13.H = block4;
        return viewControllerE13;
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.a aVar = (com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.a) this.f277974b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        JuniorAddPhoneNumberScreenContract$ModalStep step = (JuniorAddPhoneNumberScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof JuniorAddPhoneNumberScreenContract$ModalStep.ChangeCountryCode)) {
            if (!(step instanceof JuniorAddPhoneNumberScreenContract$ModalStep.PersonalDataConsentConfirmation)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewController viewControllerE1 = aVar.e1(new kl8.a(aVar.o.f77200a));
            ul8.h block = new ul8.h(ModalCoordinator, aVar);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        s7a.x xVar = new s7a.x(null, null, null, null, false, null, new TextLocalisedClause(R.string.search_country, null, null, 14), null, null, false, null, ((JuniorAddPhoneNumberScreenContract$ModalStep.ChangeCountryCode) step).f77202a, null, null, true, null, null, null, null, null, 2138963450);
        Object obj4 = aVar.f77208q.get();
        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
        PickerController pickerController = new PickerController(xVar, (x7a.d) obj4);
        ul8.h block2 = new ul8.h(aVar);
        Intrinsics.checkNotNullParameter(block2, "block");
        pickerController.H = block2;
        return pickerController;
    }

    private final Object d(Object obj2, Object obj3) {
        int i;
        List listD1;
        com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar = (com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) this.f277974b;
        cli.y yVar = bVar.B;
        um2.h0 h0Var = bVar.f63790r;
        ThemeCustomisationContract$InputData themeCustomisationContract$InputData = bVar.o;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        ThemeCustomisationContract$ModalStep step = (ThemeCustomisationContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        int i2 = 2;
        if (step instanceof ThemeCustomisationContract$ModalStep.BackgroundPicker) {
            ThemeCustomisationContract$ModalStep.BackgroundPicker backgroundPicker = (ThemeCustomisationContract$ModalStep.BackgroundPicker) step;
            ThemedBackgroundKey themedBackgroundKey = backgroundPicker.f63762a;
            List list = backgroundPicker.f63763b;
            if (list == null || (listD1 = zhm.d0.d1(zhm.d0.h0(list, zhm.d0.i1(themeCustomisationContract$InputData.f)))) == null) {
                listD1 = themeCustomisationContract$InputData.f;
            }
            BackgroundPickerFlow backgroundPickerFlow = new BackgroundPickerFlow(new BackgroundPickerFlowInput(themedBackgroundKey, listD1), bVar.u);
            um2.a0 block = new um2.a0(bVar, i2);
            Intrinsics.checkNotNullParameter(block, "block");
            backgroundPickerFlow.H = block;
            return backgroundPickerFlow;
        }
        if (step instanceof ThemeCustomisationContract$ModalStep.ThemesGallery) {
            ThemesGalleryController themesGalleryController = new ThemesGalleryController(new ThemesGalleryControllerContract$InputData(((ThemeCustomisationContract$ModalStep.ThemesGallery) step).f63766a));
            um2.a0 block2 = new um2.a0(bVar, 3);
            Intrinsics.checkNotNullParameter(block2, "block");
            themesGalleryController.H = block2;
            return themesGalleryController;
        }
        if (step instanceof ThemeCustomisationContract$ModalStep.ResetBackgroundsConfirmation) {
            GlobalThemeDeclaration theme = ((ThemeCustomisationContract$ThemeInfo) zi0.c.I(((um2.a) ((j2) yVar.f22677a).getValue()).f281178b)).f63778a.f94561a;
            h0Var.getClass();
            Intrinsics.checkNotNullParameter(theme, "theme");
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.backgroundpicker.api.R$string.appearance_theme_customisation_reset_theme_confirmation_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.backgroundpicker.api.R$string.appearance_theme_customisation_reset_theme_confirmation_message, zhm.v.k(theme.getF94526a(), new TextLocalisedClause(com.revolut.feature.backgroundpicker.impl.R$string.background_picker_catalogue_section_title_uploaded, null, null, 14)), null, 12), null, null, false, 28), new aw0.g(new n6(new TextLocalisedClause(com.revolut.feature.backgroundpicker.api.R$string.appearance_theme_customisation_reset_theme_confirmation_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.backgroundpicker.api.R$string.appearance_theme_customisation_reset_theme_confirmation_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25), um2.h0.f281197b, null, null, 24));
            um2.a0 block3 = new um2.a0(bVar, 4);
            Intrinsics.checkNotNullParameter(block3, "block");
            actionsBottomSheetController.H = block3;
            return actionsBottomSheetController;
        }
        if (!(step instanceof ThemeCustomisationContract$ModalStep.SeasonalStyleDisclaimer)) {
            throw new NoWhenBranchMatchedException();
        }
        GlobalThemeDeclaration theme2 = ((ThemeCustomisationContract$ThemeInfo) zi0.c.I(((um2.a) ((j2) yVar.f22677a).getValue()).f281178b)).f63778a.f94561a;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(theme2, "theme");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.backgroundpicker.api.R$string.appearance_seasonal_theme_action_title, null, null, 14);
        if (theme2 instanceof HalloweenThemeDeclaration) {
            i = com.revolut.feature.backgroundpicker.api.R$string.appearance_seasonal_theme_info_halloween_message;
        } else {
            if (!(theme2 instanceof ChristmasThemeDeclaration)) {
                throw new IllegalStateException(h30.l.r("Seasonal theme disclaimer is not supported for ", theme2.getF94454a()));
            }
            i = com.revolut.feature.backgroundpicker.api.R$string.appearance_seasonal_theme_info_christmas_message;
        }
        vjg.f fVarE2 = theme2.e2();
        if (fVarE2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        LocalDateTime localDateTimeWith = ((l80.f) h0Var.f281198a).f().with((TemporalAdjuster) fVarE2.f289742b);
        Intrinsics.checkNotNullExpressionValue(localDateTimeWith, "with(...)");
        return new ActionsBottomSheetController(new dii.a(new lw0.a(textLocalisedClause, new TextLocalisedClause(i, zhm.u.c(new TimeClause(oi0.d.R(localDateTimeWith), new TimeClause.Format.DayAndMonth(ka.FULL), null, null, 12)), null, 12), null, null, false, 28), new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.backgroundpicker.api.R$string.appearance_seasonal_theme_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), um2.h0.f281197b, null, null, 24));
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v25 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Object portabilityDetailsFlow;
        String str;
        Set setA;
        Object value;
        pg6.a aVarJ;
        BaseBottomSheetController actionsBottomSheetController;
        Object inputData;
        ViewController promptMarketingScreen;
        int i;
        ?? r92;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        PayrollPlatformEmailInputContract$InputData accountToWorkEmail;
        int i2 = this.f277973a;
        final int i3 = 3;
        final int i5 = 2;
        final int i6 = 1;
        final int i21 = 0;
        Object obj4 = this.f277974b;
        switch (i2) {
            case 0:
                com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar = (com.revolut.retail.feature.payments.payment_links.impl.ui.details.b) obj4;
                l lVar = bVar.f102190s;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PaymentLinkDetailsContract$ModalStep step = (PaymentLinkDetailsContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof PaymentLinkDetailsContract$ModalStep.CancelPaymentLink) {
                    lVar.getClass();
                    lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.core.R$string.payments_payment_links_action_cancel_confirmation_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.core.R$string.payments_payment_links_action_cancel_confirmation_description, null, null, 14), null, null, false, 28);
                    aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.core.R$string.payments_payment_links_action_cancel_confirmation_positive, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.core.R$string.payments_payment_links_action_cancel_confirmation_negative, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                    k9 k9Var = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                    u6b.k block = new u6b.k(bVar, 4);
                    Intrinsics.checkNotNullParameter(block, "block");
                    actionsBottomSheetController2.H = block;
                    return actionsBottomSheetController2;
                }
                if (!(step instanceof PaymentLinkDetailsContract$ModalStep.DeclinePaymentLink)) {
                    throw new NoWhenBranchMatchedException();
                }
                TransferLinkDetails.Active transferLinkDetails = ((PaymentLinkDetailsContract$ModalStep.DeclinePaymentLink) step).f102183a;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(transferLinkDetails, "transferLinkDetails");
                TextClause textClauseB = q.b(transferLinkDetails);
                lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.core.R$string.payments_payment_links_action_decline_confirmation_title, zhm.v.k(new MoneyClause(transferLinkDetails.k, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), textClauseB), null, 12), new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.core.R$string.payments_payment_links_action_decline_confirmation_description, zhm.u.c(textClauseB), null, 12), null, null, false, 28);
                aw0.g gVar2 = new aw0.g(new n6(new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.core.R$string.payments_payment_links_action_decline_confirmation_positive, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.core.R$string.payments_payment_links_action_decline_confirmation_negative, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                k9 k9Var2 = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar2, gVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                u69.g block2 = new u69.g(bVar, step, 6);
                Intrinsics.checkNotNullParameter(block2, "block");
                actionsBottomSheetController3.H = block2;
                return actionsBottomSheetController3;
            case 1:
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = WithdrawalAmountScreen.T;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                Object obj5 = data.f51981p;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.transfer.core.api.mapper.TransferAmountInputPayload");
                return new zp0.d(editText, ((yof.b) obj5).f315672a, (u80.d) ((WithdrawalAmountScreen) obj4).O.getValue(), null, null, false, false, 0, false, null, 1944);
            case 2:
                com.revolut.feature.devicemanagement.impl.ui.flow.b bVar2 = (com.revolut.feature.devicemanagement.impl.ui.flow.b) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                DeviceManagementFlowContract$Step step2 = (DeviceManagementFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                int i22 = 9;
                if (Intrinsics.f(step2, DeviceManagementFlowContract$Step.DeviceList.f71937a)) {
                    DeviceListController deviceListController = new DeviceListController();
                    u69.g block3 = new u69.g(bVar2, FlowCoordinator, i22);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    deviceListController.H = block3;
                    return deviceListController;
                }
                if (!(step2 instanceof DeviceManagementFlowContract$Step.DeviceDetails)) {
                    if (Intrinsics.f(step2, DeviceManagementFlowContract$Step.PasscodeChange.f71938a)) {
                        return bVar2.e1(new ejl.c(0));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                DeviceDetailsController deviceDetailsController = new DeviceDetailsController(((DeviceManagementFlowContract$Step.DeviceDetails) step2).f71936a);
                u6b.k block4 = new u6b.k(bVar2, i22);
                Intrinsics.checkNotNullParameter(block4, "block");
                deviceDetailsController.H = block4;
                return deviceDetailsController;
            case 3:
                com.revolut.feature.pix.impl.flow.b bVar3 = (com.revolut.feature.pix.impl.flow.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                PixFlowContract$Step step3 = (PixFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (Intrinsics.f(step3, PixFlowContract$Step.Intro.f80554a)) {
                    ViewController viewControllerE1 = bVar3.e1(new ProductArticleDescriptor(iaa.f.ONBOARDING.a(), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, true, null, null, false, 56));
                    u69.g block5 = new u69.g(bVar3, LazyFlowCoordinator, 11);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    viewControllerE1.H = block5;
                    return viewControllerE1;
                }
                if (step3 instanceof PixFlowContract$Step.AliasRegistration) {
                    PixFlowContract$Step.AliasRegistration aliasRegistration = (PixFlowContract$Step.AliasRegistration) step3;
                    AliasRegistrationFlow aliasRegistrationFlow = new AliasRegistrationFlow(new AliasRegistrationContract$InputData(aliasRegistration.f80545a, aliasRegistration.f80546b));
                    toh.h block6 = new toh.h(step3, 15, bVar3, LazyFlowCoordinator);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    aliasRegistrationFlow.H = block6;
                    return aliasRegistrationFlow;
                }
                if (step3 instanceof PixFlowContract$Step.Area) {
                    portabilityDetailsFlow = new PixAreaFlow(new PixAreaFlowContract$InputData(((PixFlowContract$Step.Area) step3).f80548a));
                } else if (step3 instanceof PixFlowContract$Step.Transfer) {
                    portabilityDetailsFlow = new PixTransferFlow(((PixFlowContract$Step.Transfer) step3).f80567a);
                } else {
                    if (Intrinsics.f(step3, PixFlowContract$Step.CopyPaste.f80553a)) {
                        return new PixCopyPasteFlow();
                    }
                    if (Intrinsics.f(step3, PixFlowContract$Step.Automatico.f80552a)) {
                        return new PixAutomaticoFlow(new PixAutomaticoContract$InputData(null));
                    }
                    if (step3 instanceof PixFlowContract$Step.AuthorisationDetails) {
                        portabilityDetailsFlow = new PixAutomaticoFlow(new PixAutomaticoContract$InputData(((PixFlowContract$Step.AuthorisationDetails) step3).f80549a));
                    } else if (step3 instanceof PixFlowContract$Step.AuthorisationRequest) {
                        PixFlowContract$Step.AuthorisationRequest authorisationRequest = (PixFlowContract$Step.AuthorisationRequest) step3;
                        portabilityDetailsFlow = new PixAuthorisationRequestFlow(new h9a.b(authorisationRequest.f80550a, authorisationRequest.f80551b));
                    } else if (step3 instanceof PixFlowContract$Step.QrPayment) {
                        PixFlowContract$Step.QrPayment qrPayment = (PixFlowContract$Step.QrPayment) step3;
                        portabilityDetailsFlow = new PixQrCodeTransactionFlow(new kba.c(qrPayment.f80558a, qrPayment.f80559b));
                    } else if (step3 instanceof PixFlowContract$Step.QrRequest) {
                        PixFlowContract$Step.QrRequest qrRequest = (PixFlowContract$Step.QrRequest) step3;
                        portabilityDetailsFlow = new PixQrRequestFlow(new PixQrRequestContract$InputData(qrRequest.f80560a, qrRequest.f80561b, qrRequest.f80562c));
                    } else if (step3 instanceof PixFlowContract$Step.Refund) {
                        PixFlowContract$Step.Refund refund = (PixFlowContract$Step.Refund) step3;
                        portabilityDetailsFlow = new PixRefundFlow(new fca.c(refund.f80563a, refund.f80564b, refund.f80565c, refund.d, refund.e, refund.f, refund.f80566g));
                    } else if (step3 instanceof PixFlowContract$Step.OpenModal) {
                        portabilityDetailsFlow = new PixCommonModalsFlow(new PixCommonModalsContract$InputData(((PixFlowContract$Step.OpenModal) step3).f80555a));
                    } else {
                        if (!(step3 instanceof PixFlowContract$Step.PortabilityDetails)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PixFlowContract$Step.PortabilityDetails portabilityDetails = (PixFlowContract$Step.PortabilityDetails) step3;
                        portabilityDetailsFlow = new PortabilityDetailsFlow(new PortabilityDetailsContract$InputData(portabilityDetails.f80556a, portabilityDetails.f80557b));
                    }
                }
                return portabilityDetailsFlow;
            case 4:
                com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a aVar3 = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CryptoAssetDetailsScreenContract$ModalStep step4 = (CryptoAssetDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof CryptoAssetDetailsScreenContract$ModalStep.GiftAssetTransferInfo)) {
                    throw new NoWhenBranchMatchedException();
                }
                CryptoAssetDetailsScreenContract$ModalStep.GiftAssetTransferInfo giftAssetTransferInfo = (CryptoAssetDetailsScreenContract$ModalStep.GiftAssetTransferInfo) step4;
                ViewController viewControllerE12 = aVar3.e1(new og5.a(new CryptoGiftAssetTransferInfoInputData(giftAssetTransferInfo.f99964a, giftAssetTransferInfo.f99965b)));
                u69.g block7 = new u69.g(viewControllerE12, aVar3, 14);
                Intrinsics.checkNotNullParameter(block7, "block");
                viewControllerE12.H = block7;
                return viewControllerE12;
            case 5:
                com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c cVar = (com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c) obj4;
                ExchangeGlobalAccessFlowV2Contract$InputData exchangeGlobalAccessFlowV2Contract$InputData = cVar.o;
                ExchangeGlobalAccessFlowV2Contract$Step step5 = (ExchangeGlobalAccessFlowV2Contract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof ExchangeGlobalAccessFlowV2Contract$Step.Article) {
                    return cVar.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(((ExchangeGlobalAccessFlowV2Contract$Step.Article) step5).f78273a)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, exchangeGlobalAccessFlowV2Contract$InputData.f78270a, null, false, 20));
                }
                if (!(step5 instanceof ExchangeGlobalAccessFlowV2Contract$Step.Workflow)) {
                    throw new NoWhenBranchMatchedException();
                }
                WorkflowFlow workflowFlowB = til.m.b(cVar.u, new WorkflowConfiguration.Workflow(((ExchangeGlobalAccessFlowV2Contract$Step.Workflow) step5).f78274a, (wi0.b) null, (NaviCommand) null, (String) null, exchangeGlobalAccessFlowV2Contract$InputData.f78270a, (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG), WorkflowFlowType.Inner.f105817a, null, 56);
                u6b.k block8 = new u6b.k(cVar, 14);
                Intrinsics.checkNotNullParameter(block8, "block");
                workflowFlowB.H = block8;
                return workflowFlowB;
            case 6:
                com.revolut.feature.pix.impl.flow.automatico.screens.details.a aVar4 = (com.revolut.feature.pix.impl.flow.automatico.screens.details.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PixAutomaticoPaymentDetailsScreenContract$ModalStep step6 = (PixAutomaticoPaymentDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof PixAutomaticoPaymentDetailsScreenContract$ModalStep.NotifyBeforePaymentInfo) {
                    return o9a.a.a();
                }
                if (!(step6 instanceof PixAutomaticoPaymentDetailsScreenContract$ModalStep.TransactionLimitChange)) {
                    throw new NoWhenBranchMatchedException();
                }
                PixAutomaticoPaymentDetailsScreenContract$ModalStep.TransactionLimitChange transactionLimitChange = (PixAutomaticoPaymentDetailsScreenContract$ModalStep.TransactionLimitChange) step6;
                PixAuthorisationTransactionLimitScreen pixAuthorisationTransactionLimitScreen = new PixAuthorisationTransactionLimitScreen(new PixAuthorisationTransactionLimitScreenContract$InputData(transactionLimitChange.f80613a, transactionLimitChange.f80614b, aVar4.o.f80611a));
                g4 block9 = new g4(1, aVar4, com.revolut.feature.pix.impl.flow.automatico.screens.details.a.class, "handleLimitResult", "handleLimitResult(Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/transaction_limit/PixAuthorisationTransactionLimitScreenContract$Output;)V", 0, 7);
                Intrinsics.checkNotNullParameter(block9, "block");
                pixAuthorisationTransactionLimitScreen.H = block9;
                return pixAuthorisationTransactionLimitScreen;
            case 7:
                com.revolut.feature.apm.payto.impl.screen.topup.flow.b bVar4 = (com.revolut.feature.apm.payto.impl.screen.topup.flow.b) obj4;
                PayToTopupFlowContract$Step step7 = (PayToTopupFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!(step7 instanceof PayToTopupFlowContract$Step.LinkedAccount)) {
                    if (step7 instanceof PayToTopupFlowContract$Step.CompleteAuthorization) {
                        return new PayToTopupStatusScreen(new yb2.e(bVar4.o.f62759a, ((PayToTopupFlowContract$Step.CompleteAuthorization) step7).f62760a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                PayToTopupLinkedAccountScreen payToTopupLinkedAccountScreen = new PayToTopupLinkedAccountScreen();
                u6b.k block10 = new u6b.k(bVar4, 18);
                Intrinsics.checkNotNullParameter(block10, "block");
                payToTopupLinkedAccountScreen.H = block10;
                return payToTopupLinkedAccountScreen;
            case 8:
                qee.s sVar = (qee.s) obj4;
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new ubi.h(sVar.b(), sVar.a(), (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), false);
            case 9:
                List requests = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(requests, "requests");
                ((ucd.b) obj4).f279030b.f("SAVING_ACCOUNT_REQUESTS_KEY", requests);
                return Unit.f186387a;
            case 10:
                com.revolut.feature_retail_user_declarations.transaction_countries.flow.a aVar5 = (com.revolut.feature_retail_user_declarations.transaction_countries.flow.a) obj4;
                TransactionCountriesFlowContract$Step step8 = (TransactionCountriesFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!Intrinsics.f(step8, TransactionCountriesFlowContract$Step.CountrySelection.f97770a)) {
                    throw new NoWhenBranchMatchedException();
                }
                TransactionCountriesInputData transactionCountriesInputData = aVar5.o;
                String str2 = transactionCountriesInputData.d;
                ArrayList arrayList = transactionCountriesInputData.f97754g;
                ArrayList arrayList2 = transactionCountriesInputData.f;
                String str3 = transactionCountriesInputData.e;
                boolean z = transactionCountriesInputData.f97752b;
                boolean z3 = transactionCountriesInputData.f97753c;
                wi0.b bVar5 = transactionCountriesInputData.f97755h;
                boolean z4 = transactionCountriesInputData.i;
                if (z4) {
                    setA = zhm.h0.f322473a;
                    str = str2;
                } else {
                    aim.o oVar = new aim.o();
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        oVar.add(new TransactionDestination((wi0.b) it8.next(), null, null));
                        str2 = str2;
                    }
                    str = str2;
                    wi0.b bVar6 = transactionCountriesInputData.f97755h;
                    if (arrayList.contains(bVar6)) {
                        oVar.add(new TransactionDestination(bVar6, null, null));
                    }
                    setA = y0.a(oVar);
                }
                TransactionCountriesScreen transactionCountriesScreen = new TransactionCountriesScreen(new CountriesSelectionScreenContract$InputData(str, str3, z, z3, arrayList2, arrayList, bVar5, z4, setA));
                u6b.k block11 = new u6b.k(aVar5, 26);
                Intrinsics.checkNotNullParameter(block11, "block");
                transactionCountriesScreen.H = block11;
                return transactionCountriesScreen;
            case 11:
                pck.g data2 = (pck.g) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(data2, "data");
                ((uck.f) obj4).f279051b.f("PLAN_REFERRALS_CAMPAIGN_INFO", data2);
                return Unit.f186387a;
            case 12:
                com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b bVar7 = (com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RevPointsPocketDetailsScreenContract$ModalStep step9 = (RevPointsPocketDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof RevPointsPocketDetailsScreenContract$ModalStep.ThresholdsBreakdown) {
                    return bVar7.e1(new edi.c(((RevPointsPocketDetailsScreenContract$ModalStep.ThresholdsBreakdown) step9).f97813a));
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.b bVar8 = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.b) obj4;
                MortgageSignatureSignedFlowContract$Step step10 = (MortgageSignatureSignedFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof MortgageSignatureSignedFlowContract$Step.Initial) {
                    return com.revolut.feature.credit.application.plugins.impl.ui.loading.a.a();
                }
                if (!(step10 instanceof MortgageSignatureSignedFlowContract$Step.Prompt)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditPromptFlow creditPromptFlow = new CreditPromptFlow(new CreditPromptFlowContract$InputData(((MortgageSignatureSignedFlowContract$Step.Prompt) step10).f68045a, new CreditPromptAnalyticsConfiguration(com.revolut.feature.credit.core.R$string.credit_application_mortgage_signature_confirmation_title, com.revolut.feature.credit.core.R$string.credit_application_mortgage_signature_confirmation_description, com.revolut.feature.credit.core.R$string.credit_application_mortgage_signature_confirmation_button, 0, 8), bVar8.f68048p.f68043a));
                ud3.n block12 = new ud3.n(bVar8, 4);
                Intrinsics.checkNotNullParameter(block12, "block");
                creditPromptFlow.H = block12;
                return creditPromptFlow;
            case 14:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar9 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelHotelsSearchResultsMapScreenContract$ModalStep step11 = (TravelHotelsSearchResultsMapScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof TravelHotelsSearchResultsMapScreenContract$ModalStep.SortingOptions) {
                    return new TravelHotelsSortingOptionSelectorScreen(new TravelHotelsSortingOptionSelectorScreenContract$InputData(((TravelHotelsSearchResultsMapScreenContract$ModalStep.SortingOptions) step11).f94057a));
                }
                if (!(step11 instanceof TravelHotelsSearchResultsMapScreenContract$ModalStep.Filters)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelHotelsFiltersScreen travelHotelsFiltersScreen = new TravelHotelsFiltersScreen();
                ud3.n block13 = new ud3.n(bVar9, 12);
                Intrinsics.checkNotNullParameter(block13, "block");
                travelHotelsFiltersScreen.H = block13;
                return travelHotelsFiltersScreen;
            case 15:
                PodNomineesPercentageScreen podNomineesPercentageScreen = (PodNomineesPercentageScreen) obj4;
                RowDelegate.Model item = (RowDelegate.Model) obj2;
                MaskedTextInputEditText field2 = (MaskedTextInputEditText) obj3;
                KProperty[] kPropertyArr2 = PodNomineesPercentageScreen.R;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(field2, "field");
                Object obj6 = item.u;
                uek.i iVar = obj6 instanceof uek.i ? (uek.i) obj6 : null;
                if (iVar != null) {
                    return new zp0.y(field2, null, "[000]", new ag.p(field2, 19, podNomineesPercentageScreen, iVar), item.f53228a, null, false, 98);
                }
                throw new IllegalStateException("RowDelegate.Model.parcel must be ValueInputParcel");
            case 16:
                String newValue = (String) obj3;
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(newValue, "newValue");
                j2 j2Var = ((uf9.d) obj4).o;
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, uf9.f.a((uf9.f) value, null, newValue, 1)));
                return Unit.f186387a;
            case 17:
                ug6.b bVar10 = (ug6.b) obj4;
                int iIntValue = ((Integer) obj2).intValue();
                Throwable errorThrowable = (Throwable) obj3;
                Intrinsics.checkNotNullParameter(errorThrowable, "errorThrowable");
                if (iIntValue != 110903 || (aVarJ = bVar10.f279935b.j(errorThrowable)) == null) {
                    return null;
                }
                TextClause textClause = new TextClause(aVarJ.getTitle(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String strA = aVarJ.getMessage();
                return new nii.z(textClause, strA != null ? new TextClause(strA, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
            case 18:
                final com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.b bVar11 = (com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.b) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                EsimConnectivityTroubleshootingFlowContract$Step step12 = (EsimConnectivityTroubleshootingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof EsimConnectivityTroubleshootingFlowContract$Step.Suggestions) {
                    EsimConnectivityTroubleshootingScreen esimConnectivityTroubleshootingScreen = new EsimConnectivityTroubleshootingScreen();
                    u69.g block14 = new u69.g(bVar11, FlowCoordinator2, 27);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    esimConnectivityTroubleshootingScreen.H = block14;
                    return esimConnectivityTroubleshootingScreen;
                }
                if (step12 instanceof EsimConnectivityTroubleshootingFlowContract$Step.Instructions) {
                    EsimConnectivityTroubleshootingFlowContract$Step.Instructions instructions = (EsimConnectivityTroubleshootingFlowContract$Step.Instructions) step12;
                    ViewController viewControllerE13 = bVar11.e1(new sd6.b(new EsimInstructionsControllerDescriptor$InputData(instructions.f100898a, instructions.f100899b)));
                    Function1 block15 = new Function1() { // from class: ugj.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i21) {
                                case 0:
                                    sd6.a result = (sd6.a) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof sd6.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar11.B2();
                                    return Unit.f186387a;
                                default:
                                    u it9 = (u) obj7;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    h.D2(bVar11.f100902r);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block15, "block");
                    viewControllerE13.H = block15;
                    return viewControllerE13;
                }
                if (!(step12 instanceof EsimConnectivityTroubleshootingFlowContract$Step.Restricted)) {
                    throw new NoWhenBranchMatchedException();
                }
                PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(((EsimConnectivityTroubleshootingFlowContract$Step.Restricted) step12).f100900a);
                Function1 block16 = new Function1() { // from class: ugj.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i6) {
                            case 0:
                                sd6.a result = (sd6.a) obj7;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (!(result instanceof sd6.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar11.B2();
                                return Unit.f186387a;
                            default:
                                u it9 = (u) obj7;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                h.D2(bVar11.f100902r);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block16, "block");
                promptMarketingScreen2.H = block16;
                return promptMarketingScreen2;
            case 19:
                com.revolut.feature.apm.wero.impl.ui.home.a aVar6 = (com.revolut.feature.apm.wero.impl.ui.home.a) obj4;
                WeroHomeFlowContract$Step step13 = (WeroHomeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (Intrinsics.f(step13, WeroHomeFlowContract$Step.Area.f63064a)) {
                    aVar6.getClass();
                    return new WeroHomeAreaScreen();
                }
                if (!Intrinsics.f(step13, WeroHomeFlowContract$Step.PaymentArea.f63065a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar6.getClass();
                return new WeroPaymentAreaScreen();
            case 20:
                final com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar12 = (com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b) obj4;
                SwitchAssistantFlowContract$InputData switchAssistantFlowContract$InputData = bVar12.o;
                SwitchAssistantFlowContract$Step step14 = (SwitchAssistantFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (Intrinsics.f(step14, SwitchAssistantFlowContract$Step.Entry.f83042a)) {
                    SwitchAssistantEntryController switchAssistantEntryController = new SwitchAssistantEntryController();
                    Function1 block17 = new Function1() { // from class: uhb.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i21) {
                                case 0:
                                    shb.d outputData = (shb.d) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean zF = Intrinsics.f(outputData, shb.b.f263450a);
                                    com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar13 = bVar12;
                                    if (zF) {
                                        oki.h.t2(bVar13, bVar13.f83056x, SwitchAssistantFlowContract$Step.PayrollManagerInput.f83043a, false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData, shb.c.f263451a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar13, bVar13.f83056x, SwitchAssistantFlowContract$Step.PayrollPlatformAccountDetails.f83044a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ohb.c outputData2 = (ohb.c) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (!Intrinsics.f(outputData2, ohb.c.f225336a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.D2(bVar12.f83056x);
                                    return Unit.f186387a;
                                case 2:
                                    zhb.d outputData3 = (zhb.d) obj7;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    if (outputData3 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.w2(bVar12.f83056x, new SwitchAssistantFlowContract$Step.PayrollPlatformEmailSent(outputData3.f322384a), ModalDestination.Style.POPUP.f98311a);
                                    return Unit.f186387a;
                                case 3:
                                    u outputData4 = (u) obj7;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    if (Intrinsics.f(outputData4, q.f111462a) || Intrinsics.f(outputData4, s.f111464a)) {
                                        bVar12.C2(aii.q.f5292a);
                                    } else if (!(outputData4 instanceof p) && !Intrinsics.f(outputData4, r.f111463a) && !Intrinsics.f(outputData4, t.f111465a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    mhb.c outputData5 = (mhb.c) obj7;
                                    Intrinsics.checkNotNullParameter(outputData5, "outputData");
                                    if (outputData5 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar14 = bVar12;
                                    oki.h.t2(bVar14, bVar14.f83056x, new SwitchAssistantFlowContract$Step.RequestSummary(outputData5.f205473a), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    wpc.j outputData6 = (wpc.j) obj7;
                                    Intrinsics.checkNotNullParameter(outputData6, "outputData");
                                    boolean zF2 = Intrinsics.f(outputData6, wpc.g.f299221a);
                                    com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar15 = bVar12;
                                    if (zF2) {
                                        oki.h.D2(bVar15.f83056x);
                                    } else if (Intrinsics.f(outputData6, wpc.h.f299222a)) {
                                        oki.h.t2(bVar15, bVar15.f83056x, SwitchAssistantFlowContract$Step.PayrollPlatformEmailInput.f83045a, true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData6, wpc.i.f299223a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar15.l2(new g(bVar15, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    switchAssistantEntryController.H = block17;
                    return switchAssistantEntryController;
                }
                if (Intrinsics.f(step14, SwitchAssistantFlowContract$Step.PayrollManagerInput.f83043a)) {
                    PayrollManagerInputController payrollManagerInputController = new PayrollManagerInputController();
                    final int i32 = 4;
                    Function1 block18 = new Function1() { // from class: uhb.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i32) {
                                case 0:
                                    shb.d outputData = (shb.d) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean zF = Intrinsics.f(outputData, shb.b.f263450a);
                                    com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar13 = bVar12;
                                    if (zF) {
                                        oki.h.t2(bVar13, bVar13.f83056x, SwitchAssistantFlowContract$Step.PayrollManagerInput.f83043a, false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData, shb.c.f263451a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar13, bVar13.f83056x, SwitchAssistantFlowContract$Step.PayrollPlatformAccountDetails.f83044a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ohb.c outputData2 = (ohb.c) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (!Intrinsics.f(outputData2, ohb.c.f225336a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.D2(bVar12.f83056x);
                                    return Unit.f186387a;
                                case 2:
                                    zhb.d outputData3 = (zhb.d) obj7;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    if (outputData3 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.w2(bVar12.f83056x, new SwitchAssistantFlowContract$Step.PayrollPlatformEmailSent(outputData3.f322384a), ModalDestination.Style.POPUP.f98311a);
                                    return Unit.f186387a;
                                case 3:
                                    u outputData4 = (u) obj7;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    if (Intrinsics.f(outputData4, q.f111462a) || Intrinsics.f(outputData4, s.f111464a)) {
                                        bVar12.C2(aii.q.f5292a);
                                    } else if (!(outputData4 instanceof p) && !Intrinsics.f(outputData4, r.f111463a) && !Intrinsics.f(outputData4, t.f111465a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    mhb.c outputData5 = (mhb.c) obj7;
                                    Intrinsics.checkNotNullParameter(outputData5, "outputData");
                                    if (outputData5 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar14 = bVar12;
                                    oki.h.t2(bVar14, bVar14.f83056x, new SwitchAssistantFlowContract$Step.RequestSummary(outputData5.f205473a), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    wpc.j outputData6 = (wpc.j) obj7;
                                    Intrinsics.checkNotNullParameter(outputData6, "outputData");
                                    boolean zF2 = Intrinsics.f(outputData6, wpc.g.f299221a);
                                    com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar15 = bVar12;
                                    if (zF2) {
                                        oki.h.D2(bVar15.f83056x);
                                    } else if (Intrinsics.f(outputData6, wpc.h.f299222a)) {
                                        oki.h.t2(bVar15, bVar15.f83056x, SwitchAssistantFlowContract$Step.PayrollPlatformEmailInput.f83045a, true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData6, wpc.i.f299223a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar15.l2(new g(bVar15, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    payrollManagerInputController.H = block18;
                    return payrollManagerInputController;
                }
                if (step14 instanceof SwitchAssistantFlowContract$Step.RequestSummary) {
                    promptMarketingScreen = new RequestSummaryController(new RequestSummaryContract$InputData(((SwitchAssistantFlowContract$Step.RequestSummary) step14).f83047a));
                    Function1 block19 = new Function1() { // from class: uhb.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i6) {
                                case 0:
                                    shb.d outputData = (shb.d) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean zF = Intrinsics.f(outputData, shb.b.f263450a);
                                    com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar13 = bVar12;
                                    if (zF) {
                                        oki.h.t2(bVar13, bVar13.f83056x, SwitchAssistantFlowContract$Step.PayrollManagerInput.f83043a, false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData, shb.c.f263451a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar13, bVar13.f83056x, SwitchAssistantFlowContract$Step.PayrollPlatformAccountDetails.f83044a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ohb.c outputData2 = (ohb.c) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (!Intrinsics.f(outputData2, ohb.c.f225336a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.D2(bVar12.f83056x);
                                    return Unit.f186387a;
                                case 2:
                                    zhb.d outputData3 = (zhb.d) obj7;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    if (outputData3 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.w2(bVar12.f83056x, new SwitchAssistantFlowContract$Step.PayrollPlatformEmailSent(outputData3.f322384a), ModalDestination.Style.POPUP.f98311a);
                                    return Unit.f186387a;
                                case 3:
                                    u outputData4 = (u) obj7;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    if (Intrinsics.f(outputData4, q.f111462a) || Intrinsics.f(outputData4, s.f111464a)) {
                                        bVar12.C2(aii.q.f5292a);
                                    } else if (!(outputData4 instanceof p) && !Intrinsics.f(outputData4, r.f111463a) && !Intrinsics.f(outputData4, t.f111465a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    mhb.c outputData5 = (mhb.c) obj7;
                                    Intrinsics.checkNotNullParameter(outputData5, "outputData");
                                    if (outputData5 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar14 = bVar12;
                                    oki.h.t2(bVar14, bVar14.f83056x, new SwitchAssistantFlowContract$Step.RequestSummary(outputData5.f205473a), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    wpc.j outputData6 = (wpc.j) obj7;
                                    Intrinsics.checkNotNullParameter(outputData6, "outputData");
                                    boolean zF2 = Intrinsics.f(outputData6, wpc.g.f299221a);
                                    com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar15 = bVar12;
                                    if (zF2) {
                                        oki.h.D2(bVar15.f83056x);
                                    } else if (Intrinsics.f(outputData6, wpc.h.f299222a)) {
                                        oki.h.t2(bVar15, bVar15.f83056x, SwitchAssistantFlowContract$Step.PayrollPlatformEmailInput.f83045a, true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData6, wpc.i.f299223a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar15.l2(new g(bVar15, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    promptMarketingScreen.H = block19;
                } else {
                    if (Intrinsics.f(step14, SwitchAssistantFlowContract$Step.PayrollPlatformAccountDetails.f83044a)) {
                        ViewController viewControllerE14 = bVar12.e1(new wpc.k(new wpc.c(wpc.e.FULL_SCREEN, new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_switch_assistant_payroll_platform_entry_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_switch_assistant_payroll_platform_entry_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_switch_assistant_payroll_platform_entry_cta_work_email, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_switch_share_details_action_share_details, null, null, 14))));
                        final int i33 = 5;
                        Function1 block20 = new Function1() { // from class: uhb.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i33) {
                                    case 0:
                                        shb.d outputData = (shb.d) obj7;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        boolean zF = Intrinsics.f(outputData, shb.b.f263450a);
                                        com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar13 = bVar12;
                                        if (zF) {
                                            oki.h.t2(bVar13, bVar13.f83056x, SwitchAssistantFlowContract$Step.PayrollManagerInput.f83043a, false, null, false, 12);
                                        } else {
                                            if (!Intrinsics.f(outputData, shb.c.f263451a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.t2(bVar13, bVar13.f83056x, SwitchAssistantFlowContract$Step.PayrollPlatformAccountDetails.f83044a, false, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        ohb.c outputData2 = (ohb.c) obj7;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        if (!Intrinsics.f(outputData2, ohb.c.f225336a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(bVar12.f83056x);
                                        return Unit.f186387a;
                                    case 2:
                                        zhb.d outputData3 = (zhb.d) obj7;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        if (outputData3 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(bVar12.f83056x, new SwitchAssistantFlowContract$Step.PayrollPlatformEmailSent(outputData3.f322384a), ModalDestination.Style.POPUP.f98311a);
                                        return Unit.f186387a;
                                    case 3:
                                        u outputData4 = (u) obj7;
                                        Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                        if (Intrinsics.f(outputData4, q.f111462a) || Intrinsics.f(outputData4, s.f111464a)) {
                                            bVar12.C2(aii.q.f5292a);
                                        } else if (!(outputData4 instanceof p) && !Intrinsics.f(outputData4, r.f111463a) && !Intrinsics.f(outputData4, t.f111465a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                    case 4:
                                        mhb.c outputData5 = (mhb.c) obj7;
                                        Intrinsics.checkNotNullParameter(outputData5, "outputData");
                                        if (outputData5 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar14 = bVar12;
                                        oki.h.t2(bVar14, bVar14.f83056x, new SwitchAssistantFlowContract$Step.RequestSummary(outputData5.f205473a), true, null, false, 12);
                                        return Unit.f186387a;
                                    default:
                                        wpc.j outputData6 = (wpc.j) obj7;
                                        Intrinsics.checkNotNullParameter(outputData6, "outputData");
                                        boolean zF2 = Intrinsics.f(outputData6, wpc.g.f299221a);
                                        com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar15 = bVar12;
                                        if (zF2) {
                                            oki.h.D2(bVar15.f83056x);
                                        } else if (Intrinsics.f(outputData6, wpc.h.f299222a)) {
                                            oki.h.t2(bVar15, bVar15.f83056x, SwitchAssistantFlowContract$Step.PayrollPlatformEmailInput.f83045a, true, null, false, 12);
                                        } else {
                                            if (!Intrinsics.f(outputData6, wpc.i.f299223a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar15.l2(new g(bVar15, null, 1), new yi5.b(26));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block20, "block");
                        viewControllerE14.H = block20;
                        return viewControllerE14;
                    }
                    boolean zF = Intrinsics.f(step14, SwitchAssistantFlowContract$Step.PayrollPlatformEmailInput.f83045a);
                    SwitchAssistantFlowContract$InputData.PayrollManagerInput payrollManagerInput = SwitchAssistantFlowContract$InputData.PayrollManagerInput.f83037a;
                    SwitchAssistantFlowContract$InputData.OpenEmailApp openEmailApp = SwitchAssistantFlowContract$InputData.OpenEmailApp.f83036a;
                    SwitchAssistantFlowContract$InputData.Tracker tracker = SwitchAssistantFlowContract$InputData.Tracker.f83040a;
                    SwitchAssistantFlowContract$InputData.UpdatePayroll updatePayroll = SwitchAssistantFlowContract$InputData.UpdatePayroll.f83041a;
                    SwitchAssistantFlowContract$InputData.Empty empty = SwitchAssistantFlowContract$InputData.Empty.f83033a;
                    if (zF) {
                        if (Intrinsics.f(switchAssistantFlowContract$InputData, empty) || Intrinsics.f(switchAssistantFlowContract$InputData, updatePayroll) || Intrinsics.f(switchAssistantFlowContract$InputData, tracker)) {
                            accountToWorkEmail = PayrollPlatformEmailInputContract$InputData.UpdatePayrollPlatform.f83058a;
                        } else {
                            if (Intrinsics.f(switchAssistantFlowContract$InputData, openEmailApp)) {
                                throw new IllegalStateException("Payroll platform email input is not available in the open email app flow");
                            }
                            if (Intrinsics.f(switchAssistantFlowContract$InputData, payrollManagerInput)) {
                                throw new IllegalStateException("Payroll platform email input is not available in the payroll manager input flow");
                            }
                            if (!(switchAssistantFlowContract$InputData instanceof SwitchAssistantFlowContract$InputData.EnterWorkEmail)) {
                                if (switchAssistantFlowContract$InputData instanceof SwitchAssistantFlowContract$InputData.SendFollowUp) {
                                    throw new IllegalStateException("Payroll platform email input is not available in the send follow-up flow");
                                }
                                if (switchAssistantFlowContract$InputData instanceof SwitchAssistantFlowContract$InputData.MarkCompleted) {
                                    throw new IllegalStateException("Payroll platform email input is not available in the mark completed flow");
                                }
                                if (switchAssistantFlowContract$InputData instanceof SwitchAssistantFlowContract$InputData.StartOver) {
                                    throw new IllegalStateException("Payroll platform email input is not available in the start over flow");
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            accountToWorkEmail = new PayrollPlatformEmailInputContract$InputData.AccountToWorkEmail(((SwitchAssistantFlowContract$InputData.EnterWorkEmail) switchAssistantFlowContract$InputData).f83034a);
                        }
                        PayrollPlatformEmailInputController payrollPlatformEmailInputController = new PayrollPlatformEmailInputController(accountToWorkEmail);
                        Function1 block21 = new Function1() { // from class: uhb.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i5) {
                                    case 0:
                                        shb.d outputData = (shb.d) obj7;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        boolean zF2 = Intrinsics.f(outputData, shb.b.f263450a);
                                        com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar13 = bVar12;
                                        if (zF2) {
                                            oki.h.t2(bVar13, bVar13.f83056x, SwitchAssistantFlowContract$Step.PayrollManagerInput.f83043a, false, null, false, 12);
                                        } else {
                                            if (!Intrinsics.f(outputData, shb.c.f263451a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.t2(bVar13, bVar13.f83056x, SwitchAssistantFlowContract$Step.PayrollPlatformAccountDetails.f83044a, false, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        ohb.c outputData2 = (ohb.c) obj7;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        if (!Intrinsics.f(outputData2, ohb.c.f225336a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(bVar12.f83056x);
                                        return Unit.f186387a;
                                    case 2:
                                        zhb.d outputData3 = (zhb.d) obj7;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        if (outputData3 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(bVar12.f83056x, new SwitchAssistantFlowContract$Step.PayrollPlatformEmailSent(outputData3.f322384a), ModalDestination.Style.POPUP.f98311a);
                                        return Unit.f186387a;
                                    case 3:
                                        u outputData4 = (u) obj7;
                                        Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                        if (Intrinsics.f(outputData4, q.f111462a) || Intrinsics.f(outputData4, s.f111464a)) {
                                            bVar12.C2(aii.q.f5292a);
                                        } else if (!(outputData4 instanceof p) && !Intrinsics.f(outputData4, r.f111463a) && !Intrinsics.f(outputData4, t.f111465a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                    case 4:
                                        mhb.c outputData5 = (mhb.c) obj7;
                                        Intrinsics.checkNotNullParameter(outputData5, "outputData");
                                        if (outputData5 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar14 = bVar12;
                                        oki.h.t2(bVar14, bVar14.f83056x, new SwitchAssistantFlowContract$Step.RequestSummary(outputData5.f205473a), true, null, false, 12);
                                        return Unit.f186387a;
                                    default:
                                        wpc.j outputData6 = (wpc.j) obj7;
                                        Intrinsics.checkNotNullParameter(outputData6, "outputData");
                                        boolean zF22 = Intrinsics.f(outputData6, wpc.g.f299221a);
                                        com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar15 = bVar12;
                                        if (zF22) {
                                            oki.h.D2(bVar15.f83056x);
                                        } else if (Intrinsics.f(outputData6, wpc.h.f299222a)) {
                                            oki.h.t2(bVar15, bVar15.f83056x, SwitchAssistantFlowContract$Step.PayrollPlatformEmailInput.f83045a, true, null, false, 12);
                                        } else {
                                            if (!Intrinsics.f(outputData6, wpc.i.f299223a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar15.l2(new g(bVar15, null, 1), new yi5.b(26));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block21, "block");
                        payrollPlatformEmailInputController.H = block21;
                        return payrollPlatformEmailInputController;
                    }
                    if (!(step14 instanceof SwitchAssistantFlowContract$Step.PayrollPlatformEmailSent)) {
                        if (step14 instanceof SwitchAssistantFlowContract$Step.ReviewEmail) {
                            String str4 = ((SwitchAssistantFlowContract$Step.ReviewEmail) step14).f83048a;
                            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                            actionsBottomSheetController = new ReviewEmailBottomSheetController(new ReviewEmailBottomSheetContract$InputData(str4));
                            actionsBottomSheetController.l2(new uhb.e(bVar12, ref$BooleanRef));
                            u69.g block22 = new u69.g(ref$BooleanRef, bVar12, 28);
                            Intrinsics.checkNotNullParameter(block22, "block");
                            actionsBottomSheetController.H = block22;
                        } else {
                            if (!(step14 instanceof SwitchAssistantFlowContract$Step.StartOverConfirmation)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String str5 = ((SwitchAssistantFlowContract$Step.StartOverConfirmation) step14).f83049a;
                            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                            bVar12.f83054t.getClass();
                            lw0.a aVar7 = new lw0.a(new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_switch_assistant_start_over_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_switch_assistant_start_over_description, null, null, 14), null, null, false, 28);
                            aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_switch_assistant_start_over_primary_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_switch_assistant_start_over_secondary_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                            k9 k9Var3 = k9.Salary;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                            actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar7, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                            toh.h block23 = new toh.h(ref$BooleanRef2, 19, bVar12, str5);
                            Intrinsics.checkNotNullParameter(block23, "block");
                            actionsBottomSheetController.H = block23;
                            actionsBottomSheetController.k2(new uhb.e(ref$BooleanRef2, bVar12));
                        }
                        return actionsBottomSheetController;
                    }
                    String workEmail = ((SwitchAssistantFlowContract$Step.PayrollPlatformEmailSent) step14).f83046a;
                    Intrinsics.checkNotNullParameter(workEmail, "workEmail");
                    boolean zF2 = Intrinsics.f(switchAssistantFlowContract$InputData, empty);
                    yhb.b bVar13 = yhb.b.f313906a;
                    if (zF2 || Intrinsics.f(switchAssistantFlowContract$InputData, updatePayroll) || Intrinsics.f(switchAssistantFlowContract$InputData, tracker)) {
                        inputData = bVar13;
                    } else {
                        if (Intrinsics.f(switchAssistantFlowContract$InputData, openEmailApp)) {
                            throw new IllegalStateException("Payroll platform email sent prompt is not available in the open email app flow");
                        }
                        if (Intrinsics.f(switchAssistantFlowContract$InputData, payrollManagerInput)) {
                            throw new IllegalStateException("Payroll platform email sent prompt is not available in the payroll manager input flow");
                        }
                        if (!(switchAssistantFlowContract$InputData instanceof SwitchAssistantFlowContract$InputData.EnterWorkEmail)) {
                            if (switchAssistantFlowContract$InputData instanceof SwitchAssistantFlowContract$InputData.SendFollowUp) {
                                throw new IllegalStateException("Payroll platform email sent prompt is not available in the send follow-up flow");
                            }
                            if (switchAssistantFlowContract$InputData instanceof SwitchAssistantFlowContract$InputData.MarkCompleted) {
                                throw new IllegalStateException("Payroll platform email sent prompt is not available in the mark completed flow");
                            }
                            if (switchAssistantFlowContract$InputData instanceof SwitchAssistantFlowContract$InputData.StartOver) {
                                throw new IllegalStateException("Payroll platform email sent prompt is not available in the start over flow");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        inputData = new yhb.a(workEmail);
                    }
                    bVar12.f83050p.getClass();
                    Intrinsics.checkNotNullParameter(inputData, "inputData");
                    if (inputData.equals(bVar13)) {
                        i = 14;
                        r92 = 0;
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_switch_assistant_payroll_platform_email_sent_title, null, null, 14);
                    } else {
                        i = 14;
                        r92 = 0;
                        if (!(inputData instanceof yhb.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_switch_assistant_account_to_work_email_email_sent_title, null, null, 14);
                    }
                    TextLocalisedClause textLocalisedClause4 = textLocalisedClause;
                    if (inputData.equals(bVar13)) {
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_switch_assistant_payroll_platform_email_sent_description, r92, r92, i);
                    } else {
                        if (!(inputData instanceof yhb.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_switch_assistant_account_to_work_email_email_sent_description, zhm.u.c(((yhb.a) inputData).f313905a), r92, 12);
                    }
                    TextLocalisedClause textLocalisedClause5 = textLocalisedClause2;
                    GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_24_envelope, r92, r92, 6);
                    ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    if (inputData.equals(bVar13)) {
                        textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_switch_assistant_payroll_platform_email_sent_cta, null, null, 14);
                    } else {
                        if (!(inputData instanceof yhb.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.retail.salary_account.impl.R$string.salary_switch_assistant_account_to_work_email_email_sent_cta, null, null, 14);
                    }
                    PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) textLocalisedClause3, (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54);
                    k9 k9Var4 = k9.Salary;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause4, textLocalisedClause5, glyphImage, null, null, resourceImage, null, button, null, null, null, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, 61272));
                    Function1 block24 = new Function1() { // from class: uhb.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i3) {
                                case 0:
                                    shb.d outputData = (shb.d) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean zF22 = Intrinsics.f(outputData, shb.b.f263450a);
                                    com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar132 = bVar12;
                                    if (zF22) {
                                        oki.h.t2(bVar132, bVar132.f83056x, SwitchAssistantFlowContract$Step.PayrollManagerInput.f83043a, false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData, shb.c.f263451a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar132, bVar132.f83056x, SwitchAssistantFlowContract$Step.PayrollPlatformAccountDetails.f83044a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ohb.c outputData2 = (ohb.c) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (!Intrinsics.f(outputData2, ohb.c.f225336a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.D2(bVar12.f83056x);
                                    return Unit.f186387a;
                                case 2:
                                    zhb.d outputData3 = (zhb.d) obj7;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    if (outputData3 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.w2(bVar12.f83056x, new SwitchAssistantFlowContract$Step.PayrollPlatformEmailSent(outputData3.f322384a), ModalDestination.Style.POPUP.f98311a);
                                    return Unit.f186387a;
                                case 3:
                                    u outputData4 = (u) obj7;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    if (Intrinsics.f(outputData4, q.f111462a) || Intrinsics.f(outputData4, s.f111464a)) {
                                        bVar12.C2(aii.q.f5292a);
                                    } else if (!(outputData4 instanceof p) && !Intrinsics.f(outputData4, r.f111463a) && !Intrinsics.f(outputData4, t.f111465a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    mhb.c outputData5 = (mhb.c) obj7;
                                    Intrinsics.checkNotNullParameter(outputData5, "outputData");
                                    if (outputData5 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar14 = bVar12;
                                    oki.h.t2(bVar14, bVar14.f83056x, new SwitchAssistantFlowContract$Step.RequestSummary(outputData5.f205473a), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    wpc.j outputData6 = (wpc.j) obj7;
                                    Intrinsics.checkNotNullParameter(outputData6, "outputData");
                                    boolean zF222 = Intrinsics.f(outputData6, wpc.g.f299221a);
                                    com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar15 = bVar12;
                                    if (zF222) {
                                        oki.h.D2(bVar15.f83056x);
                                    } else if (Intrinsics.f(outputData6, wpc.h.f299222a)) {
                                        oki.h.t2(bVar15, bVar15.f83056x, SwitchAssistantFlowContract$Step.PayrollPlatformEmailInput.f83045a, true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData6, wpc.i.f299223a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar15.l2(new g(bVar15, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    promptMarketingScreen.H = block24;
                }
                return promptMarketingScreen;
            case 21:
                com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a aVar8 = (com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimGiftRecipientSelectionScreenContract$ModalStep step15 = (EsimGiftRecipientSelectionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (!(step15 instanceof EsimGiftRecipientSelectionScreenContract$ModalStep.RecipientNotEligible)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar8.f100970p.getClass();
                lw0.a aVar9 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_gifting_recipients_not_eligible_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_gifting_recipients_not_eligible_description, null, null, 14), null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_gifting_recipients_not_eligible_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                k9 k9Var5 = k9.ESim;
                Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar9, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
            case 22:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar10 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a) obj4;
                PlanDowngradeFlowContract$Step step16 = (PlanDowngradeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (step16 instanceof PlanDowngradeFlowContract$Step.BenefitsToLose) {
                    PlanDowngradeFlowContract$Step.BenefitsToLose benefitsToLose = (PlanDowngradeFlowContract$Step.BenefitsToLose) step16;
                    PlanCancelFeaturesScreen planCancelFeaturesScreen = new PlanCancelFeaturesScreen(new PlanCancelFeaturesScreenContract$InputData(new PlanCancelFeatures$CancelReason.LowerPaidPlan(benefitsToLose.f103156a, benefitsToLose.f103157b), aVar10.o.f103155c));
                    uhk.e block25 = new uhk.e(aVar10, i21);
                    Intrinsics.checkNotNullParameter(block25, "block");
                    planCancelFeaturesScreen.H = block25;
                    return planCancelFeaturesScreen;
                }
                if (step16 instanceof PlanDowngradeFlowContract$Step.PlanChangeConfirmation) {
                    PlanDowngradeFlowContract$Step.PlanChangeConfirmation planChangeConfirmation = (PlanDowngradeFlowContract$Step.PlanChangeConfirmation) step16;
                    PlanChangeConfirmationScreen planChangeConfirmationScreen = new PlanChangeConfirmationScreen(new PlanChangeConfirmationScreenContract$InputData(planChangeConfirmation.f103160a, planChangeConfirmation.f103161b));
                    uhk.e block26 = new uhk.e(aVar10, i6);
                    Intrinsics.checkNotNullParameter(block26, "block");
                    planChangeConfirmationScreen.H = block26;
                    return planChangeConfirmationScreen;
                }
                if (step16 instanceof PlanDowngradeFlowContract$Step.BlockDowngrade) {
                    PlanDowngradeBlockScreen planDowngradeBlockScreen = new PlanDowngradeBlockScreen(new PlanDowngradeBlockScreenContract$InputData(((PlanDowngradeFlowContract$Step.BlockDowngrade) step16).f103158a));
                    uhk.e block27 = new uhk.e(aVar10, i5);
                    Intrinsics.checkNotNullParameter(block27, "block");
                    planDowngradeBlockScreen.H = block27;
                    return planDowngradeBlockScreen;
                }
                if (!(step16 instanceof PlanDowngradeFlowContract$Step.FeesAndRefunds)) {
                    throw new NoWhenBranchMatchedException();
                }
                PlanDowngradeFeesAndTermsScreen planDowngradeFeesAndTermsScreen = new PlanDowngradeFeesAndTermsScreen(new PlanDowngradeFeesAndTermsScreenContract$InputData(((PlanDowngradeFlowContract$Step.FeesAndRefunds) step16).f103159a));
                uhk.e block28 = new uhk.e(aVar10, i3);
                Intrinsics.checkNotNullParameter(block28, "block");
                planDowngradeFeesAndTermsScreen.H = block28;
                return planDowngradeFeesAndTermsScreen;
            case 23:
                CenteredAmountView field3 = (CenteredAmountView) obj3;
                int i43 = BidCustomInputScreen.X;
                Intrinsics.checkNotNullParameter((CenteredAmountDelegate.Model) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(field3, "field");
                return new uid.h(field3.getEditText(), new ud3.n((BidCustomInputScreen) obj4, 22));
            case 24:
                return a(obj2, obj3);
            case 25:
                return b(obj2, obj3);
            case 26:
                return c(obj2, obj3);
            case 27:
                return d(obj2, obj3);
            case 28:
                com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow.b bVar14 = (com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow.b) obj4;
                JapanEasyBankAuthorizationFlowContract$Step step17 = (JapanEasyBankAuthorizationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (!(step17 instanceof JapanEasyBankAuthorizationFlowContract$Step.AuthorizationWebView)) {
                    throw new NoWhenBranchMatchedException();
                }
                AuthorizationWebViewScreen authorizationWebViewScreen = new AuthorizationWebViewScreen(new vm6.c(((JapanEasyBankAuthorizationFlowContract$Step.AuthorizationWebView) step17).f72948a));
                uif.d block29 = new uif.d(bVar14, step17, i5);
                Intrinsics.checkNotNullParameter(block29, "block");
                authorizationWebViewScreen.H = block29;
                return authorizationWebViewScreen;
            default:
                com.revolut.feature.payees.impl.ui.payees_overview.junior.a aVar11 = (com.revolut.feature.payees.impl.ui.payees_overview.junior.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                JuniorPayeesOverviewScreenContract$Step step18 = (JuniorPayeesOverviewScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step18, "step");
                if (!(step18 instanceof JuniorPayeesOverviewScreenContract$Step.BlockedUsers)) {
                    throw new NoWhenBranchMatchedException();
                }
                JuniorPayeesOverviewScreenContract$Step.BlockedUsers blockedUsers = (JuniorPayeesOverviewScreenContract$Step.BlockedUsers) step18;
                return aVar11.e1(new lq8.a(new JuniorBlockInboundTransferNavigation$Junior(blockedUsers.f79011a, blockedUsers.f79012b), JuniorBlockInboundTransferNavigation$Mode.Informational.f77411a, false));
        }
    }
}
