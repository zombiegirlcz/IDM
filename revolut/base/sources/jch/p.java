package jch;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.CategoryDetailsScreenContract$ModalStep;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreenContract$Step;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.bills.billers.api.navigation.BillersChooserNavigation$InputData;
import com.revolut.feature.apm.bills.billers.impl.ui.BillersFlowContract$State;
import com.revolut.feature.apm.bills.billers.impl.ui.BillersFlowContract$Step;
import com.revolut.feature.apm.bills.billers.impl.ui.chooser.BillersChooserScreen;
import com.revolut.feature.apm.services.ideal.impl.ui.accounts.IDealAccountsListController;
import com.revolut.feature.apm.services.ideal.impl.ui.accounts.IDealAccountsListControllerContract$InputData;
import com.revolut.feature.apm.services.ideal.impl.ui.auth.IdealAuthScreenContract$InputData;
import com.revolut.feature.apm.services.ideal.impl.ui.auth.IdealAuthViewController;
import com.revolut.feature.apm.services.ideal.impl.ui.confirmation.IDealPaymentConfirmedScreen;
import com.revolut.feature.apm.services.ideal.impl.ui.confirmation.IDealPaymentConfirmedScreenContract$InputData;
import com.revolut.feature.apm.services.ideal.impl.ui.confirmation.IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint;
import com.revolut.feature.apm.services.ideal.impl.ui.flow.IDealFlowContract$Step;
import com.revolut.feature.apm.services.ideal.impl.ui.qr_auth.IdealQrAuthViewController;
import com.revolut.feature.apm.services.ideal.impl.ui.registration.IDealStartRegistrationScreen;
import com.revolut.feature.apm.services.ideal.impl.ui.registration.IDealStartRegistrationScreenContract$InputData;
import com.revolut.feature.apm.swish.impl.articles.SwishArticles;
import com.revolut.feature.apm.swish.impl.ui.SwishFlowContract$Step;
import com.revolut.feature.apm.swish.impl.ui.confirmation.SwishConfirmationScreen;
import com.revolut.feature.apm.swish.impl.ui.confirmation.SwishConfirmationScreenContract$InputData;
import com.revolut.feature.apm.swish.impl.ui.entry.SwishEntryScreen;
import com.revolut.feature.apm.swish.impl.ui.home.area.SwishHomeAreaScreen;
import com.revolut.feature.apm.swish.impl.ui.home.area.SwishHomeAreaScreenContract$InputData;
import com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints;
import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.address.confirmation.AddressConfirmationController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.address.confirmation.AddressConfirmationControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.MortgageRefinancingDetailsV2FlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.loan_selector.LoanSelectorController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.loan_selector.LoanSelectorControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input.MoneyInputController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input.MoneyInputControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.single_selection.SingleSelectionController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.single_selection.SingleSelectionControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.PhotosUploadFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.PhotosUploadFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary.PhotosUploadSummaryController;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary.PhotosUploadSummaryControllerContract$InputData;
import com.revolut.feature.credit.autopay.models.CreditAutopaySourceConfig;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit.autopay.ui.screen.amount.input.InputAmountScreenContract$ModalStep;
import com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController;
import com.revolut.feature.crypto.currency_pair.picker.impl.ui.currency_pair_picker.CryptoCurrencyPairPickerScreen;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.api.navigation.SelectAccountToLinkDestination;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.OpenBankingAuthAccountsFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.OpenBankingAuthAccountsFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.access_details.AccessDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.accounts_selection.AccountsSelectionScreen;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlow;
import com.revolut.feature.external_accounts.impl.ui.flow.link_external.LinkExternalAccountFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.flow.link_external.webview.LinkExternalAccountWebViewScreen;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlow;
import com.revolut.feature.external_accounts.impl.ui.us.plaid.flow.UsPlaidFlow;
import com.revolut.feature.external_accounts.impl.ui.us.plaid.flow.UsPlaidFlowContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$Step;
import com.revolut.feature.robo.impl.ui.flow.edit_goal.EditGoalFlow;
import com.revolut.feature.robo.impl.ui.flow.edit_goal.EditGoalFlowContract$Step;
import com.revolut.feature.robo.impl.ui.screen.edit_goal.EditGoalScreen;
import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreen;
import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreenContract$Input;
import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreenContract$ModalStep;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreen;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreenContract$Input;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreen;
import com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem;
import com.revolut.feature.travel.miles.impl.ui.flow.main.TravelMilesMainFlowContract$Step;
import com.revolut.feature.travel.miles.impl.ui.screen.home.TravelMilesHomeScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.home.b;
import com.revolut.feature.travel.miles.impl.ui.screen.main.TravelMilesMainScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.main.b;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.details.TrustedMerchantDetailsContract$ModalStep;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.dialog.TrustedMerchantsConfirmDialogContract$InputData;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.dialog.TrustedMerchantsConfirmDialogController;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.BondsCollectionFilterId;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterId;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.InstrumentsCollectionFiltersControllerContract$ModalStep;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.see_all.InstrumentsCollectionFiltersSeeAllController;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.see_all.InstrumentsCollectionFiltersSeeAllControllerContract$InputData;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskAssessmentScreenContract$ModalStep;
import com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskItem;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.ReturnCryptoDepositSummaryScreenContract$Modal;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingInstruction;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPacInfo;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.EsimMobilePlanPacNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData;
import com.revolut.retail.feature.plan_rewards.api.model.RewardInfo;
import com.revolut.retail.feature.plan_rewards.api.model.RewardInfoItem;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.MilestoneRewardsFlowContract$Step;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.screen.MilestoneRewardsScreen;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.screen.additional_rewards.AdditionalRewardsBottomSheetContract$InputData;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.screen.additional_rewards.AdditionalRewardsBottomSheetScreen;
import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow.PlanRewardsRevealFlow;
import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow.PlanRewardsRevealFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$UiConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.PlanSelectionCoreFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.PlanDowngradeFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.PlanDowngradeFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.PlanLayoutType;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.cancel_downgrade.CancelDowngradeScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.sso.impl.ui.consolidation.continue_with_revolut.ContinueWithRevolutScreenContract$ModalStep;
import e7l.g;
import grl.k9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import m1c.e0;
import oki.h;
import org.bouncycastle.asn1.eac.CertificateBody;
import sjk.c;
import vc.s;
import vkm.j2;
import we6.p0;
import xy3.a;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f172812b;

    public /* synthetic */ p(Object obj2, int i) {
        this.f172811a = i;
        this.f172812b = obj2;
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, kotlin.Lazy] */
    private final Object a(Object obj2, Object obj3) {
        SharedConverterScreen sharedConverterScreen = (SharedConverterScreen) this.f172812b;
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        MaskedTextInputEditText field = (MaskedTextInputEditText) obj3;
        KProperty[] kPropertyArr = SharedConverterScreen.f86850h0;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(field, "field");
        Object obj4 = model.u;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem");
        SharedConverterItem sharedConverterItem = (SharedConverterItem) obj4;
        xi0.b bVar = sharedConverterItem.f86893b;
        qd0.b bVarN = ((fgd.g) sharedConverterScreen.f86854e0.getValue()).f135052c.f135044c.n();
        s.j(bVarN);
        return new zp0.d(field, bVar, new u80.d(((s80.b) bVarN).b()), null, new r10.a(sharedConverterScreen, sharedConverterItem), false, false, 0, false, null, 1928);
    }

    private final Object b(Object obj2, Object obj3) {
        final com.revolut.feature.travel.miles.impl.ui.flow.main.a aVar = (com.revolut.feature.travel.miles.impl.ui.flow.main.a) this.f172812b;
        yki.l FlowCoordinator = (yki.l) obj2;
        TravelMilesMainFlowContract$Step step = (TravelMilesMainFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof TravelMilesMainFlowContract$Step.HomeScreen) {
            TravelMilesHomeScreen travelMilesHomeScreen = new TravelMilesHomeScreen();
            final int i = 0;
            Function1 block = new Function1() { // from class: jgg.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            com.revolut.feature.travel.miles.impl.ui.screen.home.b output = (com.revolut.feature.travel.miles.impl.ui.screen.home.b) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (!(output instanceof b.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.C2(new d((b.a) output));
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.travel.miles.impl.ui.screen.main.b output2 = (com.revolut.feature.travel.miles.impl.ui.screen.main.b) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!(output2 instanceof b.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.C2(new e((b.a) output2));
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            travelMilesHomeScreen.H = block;
            return travelMilesHomeScreen;
        }
        if (!(step instanceof TravelMilesMainFlowContract$Step.MainScreen)) {
            if (step instanceof TravelMilesMainFlowContract$Step.RevPointsBottomSheet) {
                return aVar.e1(new hub.c(e0.MILES));
            }
            throw new NoWhenBranchMatchedException();
        }
        TravelMilesMainScreen travelMilesMainScreen = new TravelMilesMainScreen();
        final int i2 = 1;
        Function1 block2 = new Function1() { // from class: jgg.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        com.revolut.feature.travel.miles.impl.ui.screen.home.b output = (com.revolut.feature.travel.miles.impl.ui.screen.home.b) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        if (!(output instanceof b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.C2(new d((b.a) output));
                        return Unit.f186387a;
                    default:
                        com.revolut.feature.travel.miles.impl.ui.screen.main.b output2 = (com.revolut.feature.travel.miles.impl.ui.screen.main.b) obj4;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        if (!(output2 instanceof b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.C2(new e((b.a) output2));
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        travelMilesMainScreen.H = block2;
        return travelMilesMainScreen;
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.b bVar = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.b) this.f172812b;
        EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData = bVar.o;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step step = (EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step.PortabilityInstruction) {
            EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step.PortabilityInstruction portabilityInstruction = (EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step.PortabilityInstruction) step;
            String str = portabilityInstruction.f100792c;
            Pair pair = new Pair("phoneNumber", bVar.f100794p.a(portabilityInstruction.f100791b));
            EsimGiftRecipient esimGiftRecipient = esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.f100788g;
            BackendFlowInput.Source.Remote remote = new BackendFlowInput.Source.Remote(str, foh.i.q(pair, new Pair("receiverName", esimGiftRecipient != null ? esimGiftRecipient.d : null)));
            BackendFlowApiEndpoints.INSTANCE.getClass();
            return bVar.e1(new n90.a(new BackendFlowInput(remote, null, null, esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.f == hgj.c.DEFAULT ? BackendFlowNavigationIcon.BackArrow.f63285a : BackendFlowNavigationIcon.Cross.f63286a, false, BackendFlowApiEndpoints.Companion.a(str), 54)));
        }
        if (!(step instanceof EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step.NumberTransferConfirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.f100785a;
        String str3 = esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.f100786b;
        EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.f100787c;
        EsimCheckoutPortingSteps esimCheckoutPortingSteps = esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.d;
        EsimPhoneNumberPortingPacInfo esimPhoneNumberPortingPacInfo = esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.e;
        EsimMobilePlanPacNumberTransferConfirmationScreen esimMobilePlanPacNumberTransferConfirmationScreen = new EsimMobilePlanPacNumberTransferConfirmationScreen(new EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData(esimCheckoutPortingSteps, esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.f100788g, esimPhoneNumberPortingInstruction, esimPhoneNumberPortingPacInfo, esimPhoneNumberPortingPacInfo.f100370b != null ? hgj.c.DEFAULT : esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.f, str2, str3));
        jeg.g block = new jeg.g(bVar, 10);
        Intrinsics.checkNotNullParameter(block, "block");
        esimMobilePlanPacNumberTransferConfirmationScreen.H = block;
        return esimMobilePlanPacNumberTransferConfirmationScreen;
    }

    private final Object d(Object obj2, Object obj3) {
        final com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b) this.f172812b;
        gte.a aVar = bVar.f103096x;
        yki.l FlowCoordinator = (yki.l) obj2;
        PlanSelectionCoreFlowContract$Step step = (PlanSelectionCoreFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof PlanSelectionCoreFlowContract$Step.SelectPlan) {
            jhk.c cVar = bVar.o;
            PlanFilter planFilter = cVar.f174279a;
            jhk.j jVar = cVar.d;
            PlanSelection planSelection = cVar.f174280b;
            xfa.b bVar2 = cVar.f174281c;
            Clause clause = jVar.f174293a;
            PlanPagerFlow planPagerFlow = new PlanPagerFlow(new PlanPagerFlowContract$InputData(planFilter, planSelection, bVar2, new PlanPagerFlowContract$UiConfig(clause != null ? new PlanPagerFlowContract$UiConfig.TitleConfig.Custom(clause) : PlanPagerFlowContract$UiConfig.TitleConfig.Default.f103063a, PlanLayoutType.Default.f103311a, jVar.f174295c, jVar.f174294b), cVar.f, new AnalyticsContext(bVar.f103095w.b(cVar.f174281c, cVar.f174282g)), aVar.a(PricingPlansUiApi$Toggles.RevampedPlanBackgrounds.f102640c), jVar.d, cVar.f174282g));
            final int i = 1;
            Function1 block = new Function1() { // from class: jhk.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            sjk.c output = (sjk.c) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (!Intrinsics.f(output, c.a.f263737a)) {
                                if (!(output instanceof sjk.d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.D2(bVar.f103097y);
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c output2 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z = output2 instanceof ghk.m;
                            com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar3 = bVar;
                            if (z) {
                                ghk.m mVar = (ghk.m) output2;
                                bVar3.n2(new i4g.d(12, mVar.f143968a, bVar3, mVar.f143969b, (Continuation) null), new whi.b(6));
                            } else if (output2 instanceof c.b) {
                                bVar3.C2(g.f174291a);
                            } else if (output2 instanceof c.a) {
                                oki.h.w2(bVar3.f103097y, PlanSelectionCoreFlowContract$Step.CancelDowngrade.f103082a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            } else if (output2 instanceof ghk.n) {
                                ghk.n nVar = (ghk.n) output2;
                                hha.d dVar = nVar.f143970a;
                                if (dVar.f152296p) {
                                    bVar3.C2(new h(dVar));
                                } else {
                                    bVar3.f103092r.b3(dVar, new jeg.g(new m(bVar3, dVar, nVar.f143971b, nVar.f143972c, 0), 15));
                                }
                            } else {
                                if (!(output2 instanceof ghk.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ghk.l lVar = (ghk.l) output2;
                                bVar3.C2(new d(lVar.f143965a, lVar.f143966b, lVar.f143967c));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            planPagerFlow.H = block;
            return planPagerFlow;
        }
        if (step instanceof PlanSelectionCoreFlowContract$Step.PlanDowngrade) {
            PlanSelectionCoreFlowContract$Step.PlanDowngrade planDowngrade = (PlanSelectionCoreFlowContract$Step.PlanDowngrade) step;
            PlanDowngradeFlow planDowngradeFlow = new PlanDowngradeFlow(new PlanDowngradeFlowContract$InputData(planDowngrade.f103083a, planDowngrade.f103084b, aVar.a(PricingPlansUiApi$Toggles.RevampedPlanBackgrounds.f102640c)));
            je2.d block2 = new je2.d(bVar, planDowngrade, 14);
            Intrinsics.checkNotNullParameter(block2, "block");
            planDowngradeFlow.H = block2;
            return planDowngradeFlow;
        }
        if (!(step instanceof PlanSelectionCoreFlowContract$Step.CancelDowngrade)) {
            throw new NoWhenBranchMatchedException();
        }
        CancelDowngradeScreen cancelDowngradeScreen = new CancelDowngradeScreen();
        final int i2 = 0;
        Function1 block3 = new Function1() { // from class: jhk.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        sjk.c output = (sjk.c) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        if (!Intrinsics.f(output, c.a.f263737a)) {
                            if (!(output instanceof sjk.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.D2(bVar.f103097y);
                        }
                        return Unit.f186387a;
                    default:
                        com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c output2 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c) obj4;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        boolean z = output2 instanceof ghk.m;
                        com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar3 = bVar;
                        if (z) {
                            ghk.m mVar = (ghk.m) output2;
                            bVar3.n2(new i4g.d(12, mVar.f143968a, bVar3, mVar.f143969b, (Continuation) null), new whi.b(6));
                        } else if (output2 instanceof c.b) {
                            bVar3.C2(g.f174291a);
                        } else if (output2 instanceof c.a) {
                            oki.h.w2(bVar3.f103097y, PlanSelectionCoreFlowContract$Step.CancelDowngrade.f103082a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        } else if (output2 instanceof ghk.n) {
                            ghk.n nVar = (ghk.n) output2;
                            hha.d dVar = nVar.f143970a;
                            if (dVar.f152296p) {
                                bVar3.C2(new h(dVar));
                            } else {
                                bVar3.f103092r.b3(dVar, new jeg.g(new m(bVar3, dVar, nVar.f143971b, nVar.f143972c, 0), 15));
                            }
                        } else {
                            if (!(output2 instanceof ghk.l)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ghk.l lVar = (ghk.l) output2;
                            bVar3.C2(new d(lVar.f143965a, lVar.f143966b, lVar.f143967c));
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        cancelDowngradeScreen.H = block3;
        return cancelDowngradeScreen;
    }

    private final Object e(Object obj2, Object obj3) {
        com.revolut.feature.address.common.impl.flow.screen.find.b bVar = (com.revolut.feature.address.common.impl.flow.screen.find.b) this.f172812b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        AddressSearchScreenContract$Step step = (AddressSearchScreenContract$Step) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof AddressSearchScreenContract$Step.LocationPermissions) {
            return mi1.d.Z2(bVar.f61018r, new iv0.p(bVar, 29));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a aVar = (com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a) this.f172812b;
        yki.l FlowCoordinator = (yki.l) obj2;
        OpenBankingAuthAccountsFlowContract$Step step = (OpenBankingAuthAccountsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof OpenBankingAuthAccountsFlowContract$Step.AccountsSelection)) {
            if (step instanceof OpenBankingAuthAccountsFlowContract$Step.AccessDetails) {
                return new AccessDetailsScreen(new ui6.c(((OpenBankingAuthAccountsFlowContract$Step.AccessDetails) step).f72493a));
            }
            throw new NoWhenBranchMatchedException();
        }
        OpenBankingAuthAccountsFlowContract$InputData openBankingAuthAccountsFlowContract$InputData = aVar.o;
        AccountsSelectionScreen accountsSelectionScreen = new AccountsSelectionScreen(new wi6.i(openBankingAuthAccountsFlowContract$InputData.d, openBankingAuthAccountsFlowContract$InputData.f72492c));
        je2.d block = new je2.d(aVar, FlowCoordinator, 17);
        Intrinsics.checkNotNullParameter(block, "block");
        accountsSelectionScreen.H = block;
        return accountsSelectionScreen;
    }

    private final Object h(Object obj2, Object obj3) {
        jid.d dVar = (jid.d) this.f172812b;
        mid.l params = (mid.l) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        String carrouselId = dVar.f174432c;
        if (carrouselId == null) {
            return efm.r.empty();
        }
        oid.e eVar = dVar.f174430a;
        params.getClass();
        int i = params.f205723a;
        Intrinsics.checkNotNullParameter(carrouselId, "carrouselId");
        return nim.a.w(eVar.d.e(new oid.s(carrouselId, i), w4l.i.f294643c), new gvi.n(i, carrouselId, 3)).map(new jeg.h(new jeg.g(params, 21), 8));
    }

    private final Object i(Object obj2, Object obj3) {
        jj3.e eVar = (jj3.e) this.f172812b;
        jj3.c params = (jj3.c) obj2;
        hj3.a story = (hj3.a) obj3;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(story, "story");
        eVar.f174633b.f(eVar.a(params), story);
        return Unit.f186387a;
    }

    private final Object j(Object obj2, Object obj3) {
        com.revolut.feature.trusted_merchants.impl.ui.kompot.details.a aVar = (com.revolut.feature.trusted_merchants.impl.ui.kompot.details.a) this.f172812b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        TrustedMerchantDetailsContract$ModalStep step = (TrustedMerchantDetailsContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof TrustedMerchantDetailsContract$ModalStep.RemoveConfirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        TrustedMerchantsConfirmDialogController trustedMerchantsConfirmDialogController = new TrustedMerchantsConfirmDialogController(new TrustedMerchantsConfirmDialogContract$InputData.RemoveConfirmation(((TrustedMerchantDetailsContract$ModalStep.RemoveConfirmation) step).f94424a));
        je2.d block = new je2.d(aVar, step, 19);
        Intrinsics.checkNotNullParameter(block, "block");
        trustedMerchantsConfirmDialogController.H = block;
        return trustedMerchantsConfirmDialogController;
    }

    private final Object k(Object obj2, Object obj3) {
        k1j.a aVar;
        com.revolut.feature.credit.autopay.ui.screen.amount.input.b bVar = (com.revolut.feature.credit.autopay.ui.screen.amount.input.b) this.f172812b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        InputAmountScreenContract$ModalStep step = (InputAmountScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof InputAmountScreenContract$ModalStep.Picker)) {
            throw new NoWhenBranchMatchedException();
        }
        CreditAutopaySourceConfig creditAutopaySourceConfig = ((InputAmountScreenContract$ModalStep.Picker) step).f68606a;
        RepaymentSource repaymentSource = (RepaymentSource) ((jk4.g) ((j2) bVar.f68613t.f22677a).getValue()).f175070a.getContent();
        String f68556a = repaymentSource != null ? repaymentSource.getF68556a() : null;
        if (jk4.o.f175083a[creditAutopaySourceConfig.f68545a.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        k1j.d dVar = k1j.d.RETAIL;
        io3.l lVar = creditAutopaySourceConfig.f68546b;
        Set set = creditAutopaySourceConfig.f68547c;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            int i = jk4.o.f175084b[((bk4.h) it8.next()).ordinal()];
            if (i == 1) {
                aVar = k1j.a.POCKETS;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = k1j.a.JOINT_ACCOUNT;
            }
            arrayList.add(aVar);
        }
        Set setI1 = d0.i1(arrayList);
        Set set2 = creditAutopaySourceConfig.d;
        ArrayList arrayList2 = new ArrayList(w.t(set2, 10));
        Iterator it9 = set2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((xi0.b) it9.next()).f306286a);
        }
        ViewController viewControllerE1 = bVar.e1(new g1j.a(new BalanceSelector$InputData(setI1, dVar, lVar, null, creditAutopaySourceConfig.e, d0.i1(arrayList2), creditAutopaySourceConfig.f, f68556a, null, 264), bVar.f68611r));
        jk4.n block = new jk4.n(bVar, 1);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    private final Object l(Object obj2, Object obj3) {
        com.revolut.feature.apm.bills.billers.impl.ui.a aVar = (com.revolut.feature.apm.bills.billers.impl.ui.a) this.f172812b;
        yki.l FlowCoordinator = (yki.l) obj2;
        BillersFlowContract$Step step = (BillersFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof BillersFlowContract$Step.Chooser)) {
            throw new NoWhenBranchMatchedException();
        }
        BillersChooserScreen billersChooserScreen = new BillersChooserScreen(new BillersChooserNavigation$InputData(((BillersFlowContract$State) ((j2) aVar.o.f22677a).getValue()).f61159a, null));
        baa.c block = new baa.c(aVar, FlowCoordinator, 12);
        Intrinsics.checkNotNullParameter(block, "block");
        billersChooserScreen.H = block;
        return billersChooserScreen;
    }

    private final Object m(Object obj2, Object obj3) {
        final com.revolut.feature.external_accounts.impl.ui.flow.link_external.b bVar = (com.revolut.feature.external_accounts.impl.ui.flow.link_external.b) this.f172812b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        LinkExternalAccountFlowContract$Step step = (LinkExternalAccountFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof LinkExternalAccountFlowContract$Step.OpenBanking) {
            LinkAccountFlow linkAccountFlow = new LinkAccountFlow(((LinkExternalAccountFlowContract$Step.OpenBanking) step).f72916a);
            final int i = 0;
            Function1 block = new Function1() { // from class: jm6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            return com.revolut.feature.external_accounts.impl.ui.flow.link_external.b.I2(bVar, (dn6.g) obj4);
                        case 1:
                            return com.revolut.feature.external_accounts.impl.ui.flow.link_external.b.J2(bVar, (gm6.f) obj4);
                        case 2:
                            km6.f result = (km6.f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof km6.d;
                            com.revolut.feature.external_accounts.impl.ui.flow.link_external.b bVar2 = bVar;
                            if (z) {
                                km6.d dVar = (km6.d) result;
                                String str = dVar.f185725a;
                                boolean z3 = dVar.f185726b;
                                bVar2.B2();
                                if (z3) {
                                    bVar2.l2(new m(bVar2, false, str, null), new yi5.b(26));
                                } else {
                                    bVar2.M2();
                                }
                            } else {
                                if (!(result instanceof km6.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.C1(new SelectAccountToLinkDestination(((km6.e) result).f185727a));
                            }
                            return Unit.f186387a;
                        default:
                            mo6.c it8 = (mo6.c) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            bVar.C2(p0.e.f296665a);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            linkAccountFlow.H = block;
            return linkAccountFlow;
        }
        if (step instanceof LinkExternalAccountFlowContract$Step.CrossBorderLinking) {
            CrossBorderLinkAccountFlow crossBorderLinkAccountFlow = new CrossBorderLinkAccountFlow(((LinkExternalAccountFlowContract$Step.CrossBorderLinking) step).f72915a);
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: jm6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            return com.revolut.feature.external_accounts.impl.ui.flow.link_external.b.I2(bVar, (dn6.g) obj4);
                        case 1:
                            return com.revolut.feature.external_accounts.impl.ui.flow.link_external.b.J2(bVar, (gm6.f) obj4);
                        case 2:
                            km6.f result = (km6.f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof km6.d;
                            com.revolut.feature.external_accounts.impl.ui.flow.link_external.b bVar2 = bVar;
                            if (z) {
                                km6.d dVar = (km6.d) result;
                                String str = dVar.f185725a;
                                boolean z3 = dVar.f185726b;
                                bVar2.B2();
                                if (z3) {
                                    bVar2.l2(new m(bVar2, false, str, null), new yi5.b(26));
                                } else {
                                    bVar2.M2();
                                }
                            } else {
                                if (!(result instanceof km6.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.C1(new SelectAccountToLinkDestination(((km6.e) result).f185727a));
                            }
                            return Unit.f186387a;
                        default:
                            mo6.c it8 = (mo6.c) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            bVar.C2(p0.e.f296665a);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            crossBorderLinkAccountFlow.H = block2;
            return crossBorderLinkAccountFlow;
        }
        if (step instanceof LinkExternalAccountFlowContract$Step.WebView) {
            LinkExternalAccountWebViewScreen linkExternalAccountWebViewScreen = new LinkExternalAccountWebViewScreen(new km6.c(((LinkExternalAccountFlowContract$Step.WebView) step).f72918a));
            final int i3 = 2;
            Function1 block3 = new Function1() { // from class: jm6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            return com.revolut.feature.external_accounts.impl.ui.flow.link_external.b.I2(bVar, (dn6.g) obj4);
                        case 1:
                            return com.revolut.feature.external_accounts.impl.ui.flow.link_external.b.J2(bVar, (gm6.f) obj4);
                        case 2:
                            km6.f result = (km6.f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof km6.d;
                            com.revolut.feature.external_accounts.impl.ui.flow.link_external.b bVar2 = bVar;
                            if (z) {
                                km6.d dVar = (km6.d) result;
                                String str = dVar.f185725a;
                                boolean z3 = dVar.f185726b;
                                bVar2.B2();
                                if (z3) {
                                    bVar2.l2(new m(bVar2, false, str, null), new yi5.b(26));
                                } else {
                                    bVar2.M2();
                                }
                            } else {
                                if (!(result instanceof km6.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.C1(new SelectAccountToLinkDestination(((km6.e) result).f185727a));
                            }
                            return Unit.f186387a;
                        default:
                            mo6.c it8 = (mo6.c) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            bVar.C2(p0.e.f296665a);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            linkExternalAccountWebViewScreen.H = block3;
            return linkExternalAccountWebViewScreen;
        }
        if (!(step instanceof LinkExternalAccountFlowContract$Step.Plaid)) {
            throw new NoWhenBranchMatchedException();
        }
        ExternalAccountsFeatureConfig.Configuration.DirectLink directLink = bVar.o.f72913b;
        if (directLink == null) {
            directLink = new ExternalAccountsFeatureConfig.Configuration.DirectLink(null, null, null, null, null, CertificateBody.profileType);
        }
        UsPlaidFlow usPlaidFlow = new UsPlaidFlow(new UsPlaidFlowContract$InputData(directLink));
        final int i5 = 3;
        Function1 block4 = new Function1() { // from class: jm6.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i5) {
                    case 0:
                        return com.revolut.feature.external_accounts.impl.ui.flow.link_external.b.I2(bVar, (dn6.g) obj4);
                    case 1:
                        return com.revolut.feature.external_accounts.impl.ui.flow.link_external.b.J2(bVar, (gm6.f) obj4);
                    case 2:
                        km6.f result = (km6.f) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z = result instanceof km6.d;
                        com.revolut.feature.external_accounts.impl.ui.flow.link_external.b bVar2 = bVar;
                        if (z) {
                            km6.d dVar = (km6.d) result;
                            String str = dVar.f185725a;
                            boolean z3 = dVar.f185726b;
                            bVar2.B2();
                            if (z3) {
                                bVar2.l2(new m(bVar2, false, str, null), new yi5.b(26));
                            } else {
                                bVar2.M2();
                            }
                        } else {
                            if (!(result instanceof km6.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar2.C1(new SelectAccountToLinkDestination(((km6.e) result).f185727a));
                        }
                        return Unit.f186387a;
                    default:
                        mo6.c it8 = (mo6.c) obj4;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        bVar.C2(p0.e.f296665a);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block4, "block");
        usPlaidFlow.H = block4;
        return usPlaidFlow;
    }

    private final Object n(Object obj2, Object obj3) {
        jm8.b bVar = (jm8.b) this.f172812b;
        String juniorId = (String) obj2;
        hm8.b eligibility = (hm8.b) obj3;
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        bVar.f176490b.f(jm8.b.b(juniorId), eligibility);
        return Unit.f186387a;
    }

    private final Object o(Object obj2, Object obj3) {
        int i;
        com.revolut.feature.robo.impl.ui.flow.edit_goal.f fVar = (com.revolut.feature.robo.impl.ui.flow.edit_goal.f) this.f172812b;
        jmc.b bVar = fVar.o;
        yki.l FlowCoordinator = (yki.l) obj2;
        EditGoalFlowContract$Step step = (EditGoalFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof EditGoalFlowContract$Step.EditGoalScreen) {
            EditGoalScreen editGoalScreen = new EditGoalScreen(new anc.f(bVar.f176523a, bVar.f176524b));
            je2.d block = new je2.d(fVar, FlowCoordinator, 23);
            Intrinsics.checkNotNullParameter(block, "block");
            editGoalScreen.H = block;
            return editGoalScreen;
        }
        if (step instanceof EditGoalFlowContract$Step.DeleteGoalConfirmation) {
            fVar.f85115q.getClass();
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.wealth_robo_edit_goal_delete_confirmation_dialog_title, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_edit_goal_delete_confirmation_dialog_description, null, null, 14), null, null, false, 28);
            aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.wealth_robo_edit_goal_delete_confirmation_dialog_button_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.wealth_robo_edit_goal_delete_confirmation_dialog_button_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
            k9 k9Var = k9.RoboAdvisor;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            jlh.g block2 = new jlh.g(fVar, 3);
            Intrinsics.checkNotNullParameter(block2, "block");
            actionsBottomSheetController.H = block2;
            return actionsBottomSheetController;
        }
        if (!(step instanceof EditGoalFlowContract$Step.Projections)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = bVar.f176523a;
        EditGoalFlowContract$Step.Projections projections = (EditGoalFlowContract$Step.Projections) step;
        PortfolioGoal portfolioGoal = projections.f85103a;
        int i2 = com.revolut.feature.robo.impl.ui.flow.edit_goal.d.f85111a[projections.f85104b.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_robo_edit_goal_projections_button_update;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_robo_edit_goal_projections_button_create;
        }
        ProjectionScreen projectionScreen = new ProjectionScreen(new ProjectionScreenContract$Input(str, portfolioGoal, new TextLocalisedClause(i, null, null, 14)));
        je2.d block3 = new je2.d(fVar, step, 24);
        Intrinsics.checkNotNullParameter(block3, "block");
        projectionScreen.H = block3;
        return projectionScreen;
    }

    private final Object p(Object obj2, Object obj3) {
        com.revolut.sso.impl.ui.consolidation.continue_with_revolut.a aVar = (com.revolut.sso.impl.ui.consolidation.continue_with_revolut.a) this.f172812b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        ContinueWithRevolutScreenContract$ModalStep step = (ContinueWithRevolutScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, ContinueWithRevolutScreenContract$ModalStep.LearnMore.f106492a)) {
            return aVar.o.a();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15, types: [int] */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r4v94, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i;
        TextLocalisedClause textLocalisedClause;
        Object obj4;
        ?? r162;
        Object obj5;
        Object editGoalFlow;
        int i2 = this.f172811a;
        int i3 = 5;
        int i5 = 4;
        int i6 = 6;
        final ?? r112 = 0;
        r112 = 0;
        int i21 = 2;
        final int i22 = 1;
        Continuation continuation = null;
        Object obj6 = this.f172812b;
        switch (i2) {
            case 0:
                com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.a aVar = (com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InstrumentsCollectionFiltersControllerContract$ModalStep step = (InstrumentsCollectionFiltersControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof InstrumentsCollectionFiltersControllerContract$ModalStep.SeeAll) {
                    InstrumentsCollectionFiltersSeeAllController instrumentsCollectionFiltersSeeAllController = new InstrumentsCollectionFiltersSeeAllController(new InstrumentsCollectionFiltersSeeAllControllerContract$InputData(((InstrumentsCollectionFiltersControllerContract$ModalStep.SeeAll) step).f95618a));
                    j87.m block = new j87.m(aVar, 16);
                    Intrinsics.checkNotNullParameter(block, "block");
                    instrumentsCollectionFiltersSeeAllController.H = block;
                    return instrumentsCollectionFiltersSeeAllController;
                }
                if (!(step instanceof InstrumentsCollectionFiltersControllerContract$ModalStep.Info)) {
                    throw new NoWhenBranchMatchedException();
                }
                lch.a aVar2 = aVar.o;
                InstrumentsCollectionFilterId filterId = ((InstrumentsCollectionFiltersControllerContract$ModalStep.Info) step).f95617a;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(filterId, "filterId");
                TextLocalisedClause textLocalisedClauseB = adh.d.b(filterId);
                if (filterId == BondsCollectionFilterId.CREDIT_QUALITY) {
                    i = 14;
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_credit_quality_info, null, null, 14);
                } else {
                    i = 14;
                    if (filterId == BondsCollectionFilterId.YIELD_TO_MATURITY) {
                        textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_yield_to_maturity_info, null, null, 14);
                    } else if (filterId == BondsCollectionFilterId.MATURITY_TYPE) {
                        textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_maturity_type_info, null, null, 14);
                    } else if (filterId == BondsCollectionFilterId.MATURITY) {
                        textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_maturity_info, null, null, 14);
                    } else {
                        if (filterId != BondsCollectionFilterId.COUPON_TYPE) {
                            throw new NotImplementedError(null, 1, null);
                        }
                        textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_coupon_type_info, null, null, 14);
                    }
                }
                lw0.a aVar3 = new lw0.a(textLocalisedClauseB, textLocalisedClause, null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, i), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                k9 k9Var = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar3, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 1:
                com.revolut.feature_retail_user_declarations.risk_assessment.screen.c cVar = (com.revolut.feature_retail_user_declarations.risk_assessment.screen.c) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RiskAssessmentScreenContract$ModalStep step2 = (RiskAssessmentScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof RiskAssessmentScreenContract$ModalStep.ConfirmDialog)) {
                    if (!(step2 instanceof RiskAssessmentScreenContract$ModalStep.InfoDialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RiskItem.Option option = ((RiskAssessmentScreenContract$ModalStep.InfoDialog) step2).f97733a;
                    lw0.a aVar4 = new lw0.a(option.e, option.f, null, null, false, 28);
                    aw0.e eVar2 = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                    f0 f0Var = f0.f322471a;
                    k9 k9Var2 = k9.Onboarding;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    return new RowActionsBottomSheetController(new eii.c(aVar4, eVar2, f0Var, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null));
                }
                RiskItem.Option option2 = ((RiskAssessmentScreenContract$ModalStep.ConfirmDialog) step2).f97732a;
                lw0.a aVar5 = new lw0.a(option2.f97738g, option2.d, null, null, false, 28);
                m6 m6Var = n6.Companion;
                aw0.g gVar = new aw0.g(m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_no, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                f0 f0Var2 = f0.f322471a;
                k9 k9Var3 = k9.Onboarding;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar5, gVar, f0Var2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null));
                j4h.m block2 = new j4h.m(cVar, step2, 25);
                Intrinsics.checkNotNullParameter(block2, "block");
                rowActionsBottomSheetController.H = block2;
                return rowActionsBottomSheetController;
            case 2:
                com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.a aVar6 = (com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ReturnCryptoDepositSummaryScreenContract$Modal modal = (ReturnCryptoDepositSummaryScreenContract$Modal) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(modal, "modal");
                if (!Intrinsics.f(modal, ReturnCryptoDepositSummaryScreenContract$Modal.FeeInfo.f100129a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar6.f100130p.getClass();
                lw0.a aVar7 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.crypto_receive_deposit_return_address_list_fees_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.crypto_receive_deposit_return_summary_fee_dialog_subtitle, null, null, 14), null, null, false, 28);
                aw0.e eVar3 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_learn_more, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var4 = k9.Crypto;
                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar7, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
                j87.m block3 = new j87.m(aVar6, 17);
                Intrinsics.checkNotNullParameter(block3, "block");
                actionsBottomSheetController.H = block3;
                return actionsBottomSheetController;
            case 3:
                final com.revolut.feature.apm.services.ideal.impl.ui.flow.a aVar8 = (com.revolut.feature.apm.services.ideal.impl.ui.flow.a) obj6;
                yki.l FlowCoordinator = (yki.l) obj2;
                IDealFlowContract$Step step3 = (IDealFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof IDealFlowContract$Step.PaymentConfirmedMobile) {
                    return new IDealPaymentConfirmedScreen(new IDealPaymentConfirmedScreenContract$InputData(new IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint.Mobile(((IDealFlowContract$Step.PaymentConfirmedMobile) step3).f62851a)));
                }
                if (step3 instanceof IDealFlowContract$Step.SuccessAuth) {
                    return new IdealAuthViewController(new IdealAuthScreenContract$InputData(((IDealFlowContract$Step.SuccessAuth) step3).f62854a));
                }
                if (Intrinsics.f(step3, IDealFlowContract$Step.SuccessQrAuth.f62855a)) {
                    return new IdealQrAuthViewController();
                }
                if (Intrinsics.f(step3, IDealFlowContract$Step.PaymentConfirmedDesktop.f62850a)) {
                    return new IDealPaymentConfirmedScreen(new IDealPaymentConfirmedScreenContract$InputData(IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint.Desktop.f62842a));
                }
                if (Intrinsics.f(step3, IDealFlowContract$Step.StartRegistrationFromSettings.f62853a)) {
                    IDealStartRegistrationScreen iDealStartRegistrationScreen = new IDealStartRegistrationScreen(new IDealStartRegistrationScreenContract$InputData(jd2.b.SETTINGS, null));
                    Function1 block4 = new Function1() { // from class: jd2.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            f output = (f) obj7;
                            switch (i22) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof e) {
                                        aVar8.I2(((e) output).f172948a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean zF = Intrinsics.f(output, d.f172947a);
                                    com.revolut.feature.apm.services.ideal.impl.ui.flow.a aVar9 = aVar8;
                                    if (zF) {
                                        h.t2(aVar9, aVar9.f62857q, new IDealFlowContract$Step.AddAccounts(null, gd2.d.START_REGISTRATION), true, null, false, 12);
                                    } else {
                                        if (!(output instanceof e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar9.I2(((e) output).f172948a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block4, "block");
                    iDealStartRegistrationScreen.H = block4;
                    return iDealStartRegistrationScreen;
                }
                if (step3 instanceof IDealFlowContract$Step.StartRegistrationFromPayment) {
                    IDealStartRegistrationScreen iDealStartRegistrationScreen2 = new IDealStartRegistrationScreen(new IDealStartRegistrationScreenContract$InputData(jd2.b.PAYMENT_CONFIRMATION, ((IDealFlowContract$Step.StartRegistrationFromPayment) step3).f62852a));
                    Function1 block5 = new Function1() { // from class: jd2.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            f output = (f) obj7;
                            switch (i22) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof e) {
                                        aVar8.I2(((e) output).f172948a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean zF = Intrinsics.f(output, d.f172947a);
                                    com.revolut.feature.apm.services.ideal.impl.ui.flow.a aVar9 = aVar8;
                                    if (zF) {
                                        h.t2(aVar9, aVar9.f62857q, new IDealFlowContract$Step.AddAccounts(null, gd2.d.START_REGISTRATION), true, null, false, 12);
                                    } else {
                                        if (!(output instanceof e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar9.I2(((e) output).f172948a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    iDealStartRegistrationScreen2.H = block5;
                    return iDealStartRegistrationScreen2;
                }
                if (!(step3 instanceof IDealFlowContract$Step.AddAccounts)) {
                    throw new NoWhenBranchMatchedException();
                }
                IDealFlowContract$Step.AddAccounts addAccounts = (IDealFlowContract$Step.AddAccounts) step3;
                IDealAccountsListController iDealAccountsListController = new IDealAccountsListController(new IDealAccountsListControllerContract$InputData(addAccounts.f62848a, addAccounts.f62849b));
                Function1 block6 = new Function1() { // from class: jd2.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        f output = (f) obj7;
                        switch (r112) {
                            case 0:
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output instanceof e) {
                                    aVar8.I2(((e) output).f172948a);
                                }
                                return Unit.f186387a;
                            default:
                                Intrinsics.checkNotNullParameter(output, "output");
                                boolean zF = Intrinsics.f(output, d.f172947a);
                                com.revolut.feature.apm.services.ideal.impl.ui.flow.a aVar9 = aVar8;
                                if (zF) {
                                    h.t2(aVar9, aVar9.f62857q, new IDealFlowContract$Step.AddAccounts(null, gd2.d.START_REGISTRATION), true, null, false, 12);
                                } else {
                                    if (!(output instanceof e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar9.I2(((e) output).f172948a);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block6, "block");
                iDealAccountsListController.H = block6;
                return iDealAccountsListController;
            case 4:
                Data data = (Data) obj6;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new Data(null, data.getError(), data.getLoading(), 1, null);
            case 5:
                com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c cVar2 = (com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c) obj6;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                MilestoneRewardsFlowContract$Step step4 = (MilestoneRewardsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof MilestoneRewardsFlowContract$Step.ProductArticle) {
                    ViewController viewControllerE1 = cVar2.e1(new ProductArticleDescriptor(((MilestoneRewardsFlowContract$Step.ProductArticle) step4).f102559a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                    jdk.e block7 = new jdk.e(cVar2, step4);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    viewControllerE1.H = block7;
                    return viewControllerE1;
                }
                if (Intrinsics.f(step4, MilestoneRewardsFlowContract$Step.RewardsList.f102561a)) {
                    MilestoneRewardsScreen milestoneRewardsScreen = new MilestoneRewardsScreen();
                    jdk.d block8 = new jdk.d(cVar2, i22);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    milestoneRewardsScreen.H = block8;
                    return milestoneRewardsScreen;
                }
                if (step4 instanceof MilestoneRewardsFlowContract$Step.Reveal) {
                    PlanRewardsRevealFlow planRewardsRevealFlow = new PlanRewardsRevealFlow(new PlanRewardsRevealFlowContract$InputData(xck.o.MILESTONE, ((MilestoneRewardsFlowContract$Step.Reveal) step4).f102560a));
                    jdk.d block9 = new jdk.d(cVar2, i21);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    planRewardsRevealFlow.H = block9;
                    return planRewardsRevealFlow;
                }
                if (!(step4 instanceof MilestoneRewardsFlowContract$Step.ShowRewardDetails)) {
                    if (step4 instanceof MilestoneRewardsFlowContract$Step.ShowAdditionalRewards) {
                        return new AdditionalRewardsBottomSheetScreen(new AdditionalRewardsBottomSheetContract$InputData(((MilestoneRewardsFlowContract$Step.ShowAdditionalRewards) step4).f102562a));
                    }
                    if (!(step4 instanceof MilestoneRewardsFlowContract$Step.OptOut)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z = false ? 1 : 0;
                    PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("LIST_ID_PROMPT_MARKETING_OPT_OUT", new TextLocalisedClause(com.revolut.retail.feature.plan_rewards.impl.R$string.premium_plan_reward_opt_out_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.plan_rewards.impl.R$string.premium_plan_reward_opt_out_description, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(new GlyphImage(R$drawable.uikit_icn_24_cross_circle, null, null, 6), null), z, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.feature.plan_rewards.impl.R$string.premium_plan_reward_opt_out_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "LOADING_TAG_OPT_OUT", 30), null, null, null, null, null, null, null, new TextLocalisedClause(com.revolut.retail.feature.plan_rewards.impl.R$string.premium_plan_reward_opt_out_terms_apply, null, null, 14), null, null, null, 1965488), null, false, false, null, 30));
                    j4h.m block10 = new j4h.m(cVar2, ((MilestoneRewardsFlowContract$Step.OptOut) step4).f102558a, 28);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    promptMarketingScreen.H = block10;
                    return promptMarketingScreen;
                }
                jdk.a aVar9 = cVar2.f102564p;
                RewardInfo info = ((MilestoneRewardsFlowContract$Step.ShowRewardDetails) step4).f102563a;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(info, "info");
                TextClause textClause = new TextClause(info.f102531a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause2 = new TextClause(info.f102532b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                f01.c cVar3 = aVar9.f173145a;
                lw0.a aVar10 = new lw0.a(textClause, textClause2, new lw0.b(new ResourceImage(cVar3.a(info.f102533c), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null), null, false, 24);
                aw0.e eVar4 = new aw0.e(false, null, null, new n6(new TextClause(info.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                ArrayList<RewardInfoItem> arrayList = info.d;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (RewardInfoItem rewardInfoItem : arrayList) {
                    Clause clause = null;
                    arrayList2.add(new eii.l((Clause) new TextClause(rewardInfoItem.f102534a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), clause, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(cVar3.a(rewardInfoItem.f102535b), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), r112, r112, i6), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
                }
                k9 k9Var5 = k9.Premium;
                Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                RowActionsBottomSheetController rowActionsBottomSheetController2 = new RowActionsBottomSheetController(new eii.c(aVar10, eVar4, arrayList2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null));
                jdk.e block11 = new jdk.e(step4, cVar2);
                Intrinsics.checkNotNullParameter(block11, "block");
                rowActionsBottomSheetController2.H = block11;
                return rowActionsBottomSheetController2;
            case 6:
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a aVar11 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CategoryDetailsScreenContract$ModalStep it8 = (CategoryDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8, CategoryDetailsScreenContract$ModalStep.DeleteConfirmation.f60787a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_category_details_delete_confirmation_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_category_details_delete_confirmation_capture, null, null, 14), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_category_details_delete_confirmation_action_delete, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), AnalyticsProduct.Shared.Environment.f, null, null, 24));
                j87.m block12 = new j87.m(aVar11, 23);
                Intrinsics.checkNotNullParameter(block12, "block");
                actionsBottomSheetController2.H = block12;
                return actionsBottomSheetController2;
            case 7:
                com.revolut.feature.apm.swish.impl.ui.a aVar12 = (com.revolut.feature.apm.swish.impl.ui.a) obj6;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                SwishFlowContract$Step step5 = (SwishFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof SwishFlowContract$Step.Intro) {
                    SwishEntryScreen swishEntryScreen = new SwishEntryScreen();
                    je2.c block13 = new je2.c(aVar12, i22);
                    Intrinsics.checkNotNullParameter(block13, "block");
                    swishEntryScreen.H = block13;
                    return swishEntryScreen;
                }
                if (step5 instanceof SwishFlowContract$Step.ProductArticle) {
                    ViewController viewControllerE12 = aVar12.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(SwishArticles.ONBOARDING)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                    je2.d block14 = new je2.d(aVar12, (SwishFlowContract$Step.ProductArticle) step5, r112);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    viewControllerE12.H = block14;
                    return viewControllerE12;
                }
                if (step5 instanceof SwishFlowContract$Step.Registration) {
                    SwishConfirmationScreen swishConfirmationScreen = new SwishConfirmationScreen(new SwishConfirmationScreenContract$InputData(((SwishFlowContract$Step.Registration) step5).f62916a));
                    je2.c block15 = new je2.c(aVar12, r112);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    swishConfirmationScreen.H = block15;
                    return swishConfirmationScreen;
                }
                if (step5 instanceof SwishFlowContract$Step.Area) {
                    return new SwishHomeAreaScreen(new SwishHomeAreaScreenContract$InputData(((SwishFlowContract$Step.Area) step5).f62911a));
                }
                if (step5 instanceof SwishFlowContract$Step.PendingUserAction) {
                    PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_onboarding_pending_user_action_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_onboarding_pending_user_action_subtitle, null, null, 14), new GlyphImage(dx1.g.f120518b, null, null, 6), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_onboarding_pending_user_action_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368));
                    je2.c block16 = new je2.c(aVar12, i21);
                    Intrinsics.checkNotNullParameter(block16, "block");
                    promptMarketingScreen2.H = block16;
                    return promptMarketingScreen2;
                }
                if (!(step5 instanceof SwishFlowContract$Step.MissingTaxId)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((SwishFlowContract$Step.MissingTaxId) step5).f62913a;
                PromptMarketingScreen promptMarketingScreen3 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_onboarding_pin_missing_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_onboarding_pin_missing_description, null, null, 14), new GlyphImage(dx1.g.f120518b, null, null, 6), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.apm.swish.api.R$string.swish_onboarding_pin_missing_action_add, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), (ResourceImage) (false ? 1 : 0), (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, 65112));
                je2.d block17 = new je2.d(aVar12, str, i22);
                Intrinsics.checkNotNullParameter(block17, "block");
                promptMarketingScreen3.H = block17;
                return promptMarketingScreen3;
            case 8:
                com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d dVar = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d) obj6;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                MortgageRefinancingDetailsV2FlowContract$Step step6 = (MortgageRefinancingDetailsV2FlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof MortgageRefinancingDetailsV2FlowContract$Step.Initial) {
                    return com.revolut.feature.credit.application.plugins.impl.ui.loading.a.a();
                }
                if (!(step6 instanceof MortgageRefinancingDetailsV2FlowContract$Step.QuestionnaireStep)) {
                    if (!(step6 instanceof MortgageRefinancingDetailsV2FlowContract$Step.ChangeAddressStep)) {
                        if (!(step6 instanceof MortgageRefinancingDetailsV2FlowContract$Step.DeclinePopup)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        xy3.l lVar = ((MortgageRefinancingDetailsV2FlowContract$Step.DeclinePopup) step6).f68009a;
                        ActionsBottomSheetController actionsBottomSheetControllerB = dy4.a.b(ActionsBottomSheetController.INSTANCE, new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_prompt_decline_popup_title, u.c(lVar.f309580a), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_prompt_decline_popup_description, u.c(lVar.f309581b), null, 12), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_prompt_decline_popup_primary_button, u.c(lVar.f309582c), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_prompt_decline_popup_secondary_button, u.c(lVar.d), null, 12), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), null, 12);
                        j87.m block18 = new j87.m(dVar, 24);
                        Intrinsics.checkNotNullParameter(block18, "block");
                        actionsBottomSheetControllerB.H = block18;
                        return actionsBottomSheetControllerB;
                    }
                    MortgageRefinancingDetailsV2FlowContract$Step.ChangeAddressStep changeAddressStep = (MortgageRefinancingDetailsV2FlowContract$Step.ChangeAddressStep) step6;
                    Address address = changeAddressStep.f68007b;
                    int i32 = com.revolut.feature.credit.core.R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_address_change_title;
                    xy3.c cVar4 = changeAddressStep.f68008c;
                    ViewController viewControllerE13 = dVar.e1(new th1.a(new AddressFlowContract$InputData(address, new TextLocalisedClause(i32, u.c(cVar4.f309559a), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_address_change_second_description, u.c(cVar4.f309560b), null, 12), false, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_address_change_primary_button, u.c(cVar4.f309561c), null, 12), FieldMode.Hidden.f60954a, null, null, true, null, 1965876), null, null, 6));
                    je2.d block19 = new je2.d(dVar, changeAddressStep, i21);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    viewControllerE13.H = block19;
                    return viewControllerE13;
                }
                MortgageRefinancingDetailsV2FlowContract$Step.QuestionnaireStep questionnaireStep = (MortgageRefinancingDetailsV2FlowContract$Step.QuestionnaireStep) step6;
                boolean z3 = questionnaireStep.f68011a;
                a.b bVar = questionnaireStep.f68012b;
                if (bVar instanceof xy3.e) {
                    xy3.e eVar5 = (xy3.e) bVar;
                    AddressConfirmationController addressConfirmationController = new AddressConfirmationController(new AddressConfirmationControllerContract$InputData(z3 ? zv3.a.CLOSE : zv3.a.BACK, eVar5.f309566b));
                    g48.h block20 = new g48.h(dVar, z3, eVar5, 19);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    addressConfirmationController.H = block20;
                    obj4 = addressConfirmationController;
                } else if (bVar instanceof xy3.h) {
                    xy3.h hVar = (xy3.h) bVar;
                    MoneyInputController moneyInputController = new MoneyInputController(new MoneyInputControllerContract$InputData(z3 ? zv3.a.CLOSE : zv3.a.BACK, hVar));
                    g48.h block21 = new g48.h(dVar, z3, hVar, 18);
                    Intrinsics.checkNotNullParameter(block21, "block");
                    moneyInputController.H = block21;
                    obj4 = moneyInputController;
                } else if (bVar instanceof xy3.g) {
                    xy3.g gVar2 = (xy3.g) bVar;
                    LoanSelectorController loanSelectorController = new LoanSelectorController(new LoanSelectorControllerContract$InputData(z3 ? zv3.a.CLOSE : zv3.a.BACK, gVar2));
                    g48.h block22 = new g48.h(dVar, z3, gVar2, 16);
                    Intrinsics.checkNotNullParameter(block22, "block");
                    loanSelectorController.H = block22;
                    obj4 = loanSelectorController;
                } else if (bVar instanceof xy3.n) {
                    xy3.n nVar = (xy3.n) bVar;
                    CreditPromptFlow creditPromptFlow = new CreditPromptFlow(new CreditPromptFlowContract$InputData(z3 ? zv3.a.CLOSE : zv3.a.BACK, nVar.f309585b, new CreditPromptAnalyticsConfiguration(com.revolut.feature.credit.core.R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_prompt_title, 0, 0, 0, 14), dVar.f68017p.f68004a));
                    g48.h block23 = new g48.h(dVar, z3, nVar, 20);
                    Intrinsics.checkNotNullParameter(block23, "block");
                    creditPromptFlow.H = block23;
                    obj4 = creditPromptFlow;
                } else {
                    if (!(bVar instanceof xy3.r)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xy3.r rVar = (xy3.r) bVar;
                    SingleSelectionController singleSelectionController = new SingleSelectionController(new SingleSelectionControllerContract$InputData(z3 ? zv3.a.CLOSE : zv3.a.BACK, rVar));
                    g48.h block24 = new g48.h(dVar, z3, rVar, 17);
                    Intrinsics.checkNotNullParameter(block24, "block");
                    singleSelectionController.H = block24;
                    obj4 = singleSelectionController;
                }
                return obj4;
            case 9:
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                KProperty[] kPropertyArr = CryptoCurrencyPairPickerScreen.T;
                ((je5.q) ((CryptoCurrencyPairPickerScreen) obj6).R2()).I2(new je5.k(iIntValue, iIntValue2));
                return Unit.f186387a;
            case 10:
                je5.q qVar = (je5.q) obj6;
                ce9.p pVar = (ce9.p) obj2;
                ce9.n action = (ce9.n) obj3;
                Intrinsics.checkNotNullParameter(action, "action");
                ce9.o oVar = pVar != null ? pVar.f : null;
                hw5.a aVar13 = oVar instanceof hw5.a ? (hw5.a) oVar : null;
                int i33 = aVar13 != null ? aVar13.f156099a : 0;
                int i43 = je5.p.f173226a[action.ordinal()];
                if (i43 == 1 || i43 == 2) {
                    r162 = r112;
                } else if (i43 == 3) {
                    r112 = i33 + 1;
                    r162 = r112;
                } else {
                    if (i43 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r162 = i33;
                }
                ge5.a aVar14 = qVar.f173227p;
                String query = ((je5.g) ((j2) qVar.f173228q.f22677a).getValue()).f173217b;
                xi0.b bVar2 = qVar.o.f173218a;
                ge5.g gVar3 = (ge5.g) aVar14;
                gVar3.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                return nim.a.w(rd0.e.c(new d38.f(xam.a.h(new gaa.g(gVar3, continuation, 13), u0.m(rd0.e.b(nim.a.w(((ik3.c) gVar3.f143228a).k(g.b.f123407a), new gd3.i(gVar3, i3))), rd0.e.b(gVar3.d.J(AccountId.Personal.f51414a, w4l.h.f294642c)))), gVar3, query, (int) r162, bVar2), kotlin.coroutines.g.f186406a), new a5g.i(r162 == true ? 1 : 0, 26));
            case 11:
                com.revolut.feature.retail.reverywhere.impl.web_app.d dVar2 = (com.revolut.feature.retail.reverywhere.impl.web_app.d) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ReverywhereWebAppScreenContract$Step step7 = (ReverywhereWebAppScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!Intrinsics.f(step7, ReverywhereWebAppScreenContract$Step.LocationPermission.f82924a)) {
                    throw new NoWhenBranchMatchedException();
                }
                PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(u.c(new PermissionsControllerContract$Permission("android.permission.ACCESS_FINE_LOCATION", null, null, true, 6))));
                permissionsController.k2(new iv0.p(dVar2, 27));
                jeg.g block25 = new jeg.g(dVar2, i21);
                Intrinsics.checkNotNullParameter(block25, "block");
                permissionsController.H = block25;
                return permissionsController;
            case 12:
                com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c cVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c) obj6;
                PhotosUploadFlowContract$InputData photosUploadFlowContract$InputData = cVar5.f68198p;
                yki.l FlowCoordinator4 = (yki.l) obj2;
                PhotosUploadFlowContract$Step step8 = (PhotosUploadFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof PhotosUploadFlowContract$Step.Loading) {
                    return com.revolut.feature.credit.application.plugins.impl.ui.loading.a.a();
                }
                if (step8 instanceof PhotosUploadFlowContract$Step.Intro) {
                    CreditPromptFlow creditPromptFlow2 = new CreditPromptFlow(new CreditPromptFlowContract$InputData(((PhotosUploadFlowContract$Step.Intro) step8).f68192a.f19922a, new CreditPromptAnalyticsConfiguration(com.revolut.feature.credit.core.R$string.credit_application_photos_upload_intro_title, 0, com.revolut.feature.credit.core.R$string.credit_application_photos_upload_intro_button, 0, 10), photosUploadFlowContract$InputData.f68189a));
                    jeg.g block26 = new jeg.g(cVar5, i6);
                    Intrinsics.checkNotNullParameter(block26, "block");
                    creditPromptFlow2.H = block26;
                    obj5 = creditPromptFlow2;
                } else {
                    if (!(step8 instanceof PhotosUploadFlowContract$Step.Summary)) {
                        if (step8 instanceof PhotosUploadFlowContract$Step.Requirements) {
                            return new CreditPromptFlow(new CreditPromptFlowContract$InputData(((PhotosUploadFlowContract$Step.Requirements) step8).f68194a, new CreditPromptAnalyticsConfiguration(com.revolut.feature.credit.core.R$string.credit_application_photos_upload_requirements_title, 0, com.revolut.feature.credit.core.R$string.credit_application_photos_upload_requirements_button, 0, 10), photosUploadFlowContract$InputData.f68189a));
                        }
                        if (!(step8 instanceof PhotosUploadFlowContract$Step.DeleteConfirmation)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jg4.a aVar15 = cVar5.f68201s;
                        bz3.c config = ((PhotosUploadFlowContract$Step.DeleteConfirmation) step8).f68190a;
                        aVar15.getClass();
                        Intrinsics.checkNotNullParameter(config, "config");
                        lw0.a aVar16 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_photos_upload_delete_dialog_title, u.c(config.f19912a), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_photos_upload_delete_dialog_description, u.c(config.f19913b), null, 12), null, null, false, 28);
                        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CONFIRM_DELETION_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_photos_upload_delete_dialog_primary_button, u.c(config.f19914c), null, 12), false, null, null, null, null, 1000);
                        yp0.b.r(model, 0, 0, 0, 0, 15);
                        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CANCEL_DELETION_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_photos_upload_delete_dialog_secondary_button, u.c(config.d), null, 12), false, null, null, null, null, 1000);
                        yp0.b.r(model2, 0, 0, 0, 0, 15);
                        List listK = v.k(model, model2);
                        k9 k9Var6 = k9.Credit;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                        CreditBottomSheetListItemsController creditBottomSheetListItemsController = new CreditBottomSheetListItemsController(new cy4.a(aVar16, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6)));
                        je2.d block27 = new je2.d(cVar5, step8, i3);
                        Intrinsics.checkNotNullParameter(block27, "block");
                        creditBottomSheetListItemsController.H = block27;
                        return creditBottomSheetListItemsController;
                    }
                    PhotosUploadSummaryController photosUploadSummaryController = new PhotosUploadSummaryController(new PhotosUploadSummaryControllerContract$InputData(photosUploadFlowContract$InputData.f68189a.f66892b, ((PhotosUploadFlowContract$Step.Summary) step8).f68195a));
                    je2.d block28 = new je2.d(cVar5, FlowCoordinator4, i5);
                    Intrinsics.checkNotNullParameter(block28, "block");
                    photosUploadSummaryController.H = block28;
                    obj5 = photosUploadSummaryController;
                }
                return obj5;
            case 13:
                return a(obj2, obj3);
            case 14:
                return b(obj2, obj3);
            case 15:
                return c(obj2, obj3);
            case 16:
                return d(obj2, obj3);
            case 17:
                return e(obj2, obj3);
            case 18:
                return g(obj2, obj3);
            case 19:
                return h(obj2, obj3);
            case 20:
                dil.a params = (dil.a) obj2;
                tel.d projections = (tel.d) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(projections, "projections");
                hx7.q.U(((jil.a) obj6).f174609b, params, projections);
                return Unit.f186387a;
            case 21:
                return i(obj2, obj3);
            case 22:
                return j(obj2, obj3);
            case 23:
                return k(obj2, obj3);
            case 24:
                return l(obj2, obj3);
            case 25:
                return m(obj2, obj3);
            case 26:
                return n(obj2, obj3);
            case 27:
                return o(obj2, obj3);
            case 28:
                return p(obj2, obj3);
            default:
                com.revolut.feature.robo.impl.ui.screen.projection.a aVar17 = (com.revolut.feature.robo.impl.ui.screen.projection.a) obj6;
                ProjectionScreenContract$Input projectionScreenContract$Input = aVar17.o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ProjectionScreenContract$ModalStep step9 = (ProjectionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof ProjectionScreenContract$ModalStep.Strategy) {
                    if (((Boolean) aVar17.f85190w.getValue()).booleanValue()) {
                        ViewController viewControllerE14 = aVar17.e1(new k5f.f(new k5f.b(projectionScreenContract$Input.f85180a, ((ProjectionScreenContract$ModalStep.Strategy) step9).f85184a)));
                        jnc.p block29 = new jnc.p(aVar17, i22);
                        Intrinsics.checkNotNullParameter(block29, "block");
                        viewControllerE14.H = block29;
                        return viewControllerE14;
                    }
                    TemplatesScreen templatesScreen = new TemplatesScreen(new TemplatesScreenContract$Input.ChangeInitialTemplate(projectionScreenContract$Input.f85180a, ((ProjectionScreenContract$ModalStep.Strategy) step9).f85184a));
                    jnc.p pVar2 = new jnc.p(aVar17, i21);
                    Intrinsics.checkNotNullParameter(pVar2, "<set-?>");
                    templatesScreen.H = pVar2;
                    editGoalFlow = templatesScreen;
                } else {
                    if (!(step9 instanceof ProjectionScreenContract$ModalStep.EditGoal)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    editGoalFlow = new EditGoalFlow(new jmc.b(projectionScreenContract$Input.f85180a, false));
                }
                return editGoalFlow;
        }
    }
}
