package x2g;

import android.os.Parcelable;
import au0.z5;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import c84.t;
import com.google.protobuf.w0;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.WithdrawalCodeDetailsContract$ModalStep;
import com.revolut.feature.apm.spin.impl.ui.deregister.SpinDeregisterPromptScreen;
import com.revolut.feature.apm.spin.impl.ui.deregister.SpinDeregisterPromptScreenContract$InputData;
import com.revolut.feature.apm.spin.impl.ui.settings.SpinSettingsScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.CreditApplicationAgreementsFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.FinancialSituationConfirmationFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.changes.FinancialSituationChangesScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.changes.FinancialSituationChangesScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.details.FinancialSituationDetailsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.details.FinancialSituationDetailsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.SigningMethodsInfoScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.StatusDialogFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.StatusDialogFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.screen.StatusDialogScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.screen.StatusDialogScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.statements.LoanStatementsListScreen;
import com.revolut.feature.credit.loan.impl.ui.statements.LoanStatementsListScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.statements.flow.LoanStatementsFlowContract$Step;
import com.revolut.feature.defi.exchange.api.DeFiExchangeApi$Toggles$CryptoCeFiToDeFi;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountContract$ModalStep;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountScreen;
import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.feature.esim.instructions.navigation.EsimInstructionsControllerDescriptor$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow.TaxHubProfileFlowContract$Step;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.trading_account_picker.flow.JuniorTradingAccountPickerFlowContract$Step;
import com.revolut.feature.junior.isa.impl.ui.trading_account_picker.screen.JuniorTradingAccountPickerScreen;
import com.revolut.feature.onboarding.impl.language_change.flow.LanguageChangeFlowContract$Step;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.WaitingListAwaitingScreenContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.WaitingListAwaitingScreenContract$ModalStep;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestActionNavigation$InputData;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.salary_account.impl.model.salary_promotion.SalaryPromotionParams;
import com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.RevolutXLauncherFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.bottom_sheet.new_watchlist.NewWatchlistController;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.bottom_sheet.rename_watchlist.RenameWatchlistController;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.EditWatchlistsControllerContract$InputData;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.EditWatchlistsControllerContract$ModalStep;
import com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details.TravelExperiencesPickupDetailsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.rooms_selection.TravelHotelsRoomsSelectionFlowContract$Step;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.TravelHotelsRoomsSelectionScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$ExtraConfiguration;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.CommodityOrderFlowContract$Step;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$InputData;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.review.CommodityOrderReviewScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.review.CommodityOrderReviewScreenContract$InputData;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import com.revolut.retail.feature.crypto_deposits.impl.navigation.CryptoReceiveProductArticleKey;
import com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.CryptoDepositFlowContract$Step;
import com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlow;
import com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$InputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.CryptoDepositsOverviewFlow;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.CryptoDepositsOverviewFlowContract$InputData;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$InputData;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$Start;
import com.revolut.retail.feature.esim.impl.ui.screens.help.EsimHelpScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.info.EsimInfoBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.info.EsimInfoBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.MoneyRequestActionFlowContract$Step;
import com.revolut.retail.feature.pending_payments.impl.common.PendingPaymentBottomSheetInputData;
import com.revolut.retail.feature.pending_payments.impl.ui.PendingPaymentFlowContract$Step;
import com.revolut.retail.feature.pending_payments.impl.ui.confirmation.PendingPaymentConfirmationScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.PlanDurableTermsFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_terms_screen.PlanTermsScreen;
import fej.d;
import grl.k9;
import hs3.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import oki.h;
import rv3.b;
import vc.s;
import vkm.j2;
import x36.y;
import y44.j;
import y44.k;
import yy3.q;
import zbj.u0;
import zhm.u;
import zhm.w;
import zhm.y0;
import zp0.u;
import zp0.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f302553b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f302552a = i;
        this.f302553b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.a) this.f302553b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        SigningMethodsInfoScreenContract$ModalStep step = (SigningMethodsInfoScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof SigningMethodsInfoScreenContract$ModalStep.InfoPopup)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = R$string.credit_application_mortgage_signature_signing_methods_info_popup_title;
        q qVar = ((SigningMethodsInfoScreenContract$ModalStep.InfoPopup) step).f68052a;
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(i, u.c(new TextClause(qVar.f317790a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.credit_application_mortgage_signature_signing_methods_info_popup_description, u.c(new TextClause(qVar.f317791b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, false, 28);
        ArrayList<yy3.p> arrayList = qVar.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (yy3.p pVar : arrayList) {
            Clause clause = null;
            boolean z = true;
            boolean z3 = false;
            arrayList2.add(new eii.l(new TextLocalisedClause(R$string.credit_application_mortgage_signature_signing_methods_info_popup_item_title, u.c(new TextClause(pVar.f317787a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), null, 12), clause, new RowDelegate.Model.MainImage.Image40(new UrlImage(pVar.f317788b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 62), z, z3, (RowDelegate.Model.c) null, pVar, 232));
        }
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.credit_application_mortgage_signature_signing_methods_info_popup_button, u.c(new TextClause(qVar.f317792c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 value = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar2, eVar, arrayList2, new AnalyticsProduct.Retail(value), null));
        x8h.d block = new x8h.d(aVar, 29);
        Intrinsics.checkNotNullParameter(block, "block");
        rowActionsBottomSheetController.H = block;
        return rowActionsBottomSheetController;
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a aVar = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) this.f302553b;
        EditWatchlistsControllerContract$InputData editWatchlistsControllerContract$InputData = aVar.o;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        EditWatchlistsControllerContract$ModalStep modalStep = (EditWatchlistsControllerContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(modalStep, "modalStep");
        if (modalStep instanceof EditWatchlistsControllerContract$ModalStep.ConfirmWatchlistRemoval) {
            pgd.a aVar2 = aVar.f86926r;
            Watchlist watchlist = ((EditWatchlistsControllerContract$ModalStep.ConfirmWatchlistRemoval) modalStep).f86922a;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(watchlist, "watchlist");
            lw0.a aVar3 = new lw0.a(new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.watchlists_remove_watchlist_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.watchlists_remove_watchlist_description, u.c(new TextClause(watchlist.f86896b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, false, 28);
            aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.watchlists_remove_watchlist_options_no, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.watchlists_remove_watchlist_options_yes, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
            k9 k9Var = k9.Favourites;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar3, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            xf0.j block = new xf0.j(aVar, modalStep, 6);
            Intrinsics.checkNotNullParameter(block, "block");
            actionsBottomSheetController.H = block;
            return actionsBottomSheetController;
        }
        if (modalStep instanceof EditWatchlistsControllerContract$ModalStep.RenameWatchlist) {
            RenameWatchlistController renameWatchlistController = new RenameWatchlistController(new sgd.d(editWatchlistsControllerContract$InputData.f86920a, ((EditWatchlistsControllerContract$ModalStep.RenameWatchlist) modalStep).f86923a));
            xgd.q block2 = new xgd.q(aVar, 1);
            Intrinsics.checkNotNullParameter(block2, "block");
            renameWatchlistController.H = block2;
            return renameWatchlistController;
        }
        if (!(modalStep instanceof EditWatchlistsControllerContract$ModalStep.AddNewWatchlist)) {
            throw new NoWhenBranchMatchedException();
        }
        NewWatchlistController newWatchlistController = new NewWatchlistController(new qgd.d(editWatchlistsControllerContract$InputData.f86920a.f86890b));
        xgd.q block3 = new xgd.q(aVar, 2);
        Intrinsics.checkNotNullParameter(block3, "block");
        newWatchlistController.H = block3;
        return newWatchlistController;
    }

    private final Object c(Object obj2, Object obj3) {
        final com.revolut.retail.feature.esim.impl.ui.screens.help.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.help.b) this.f302553b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        EsimHelpScreenContract$ModalStep step = (EsimHelpScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof EsimHelpScreenContract$ModalStep.Info) {
            return new EsimInfoBottomSheetScreen(new EsimInfoBottomSheetScreenContract$InputData(null, ((EsimHelpScreenContract$ModalStep.Info) step).f100975a));
        }
        final int i = 0;
        if (step instanceof EsimHelpScreenContract$ModalStep.InstallEsim) {
            EsimProfile esimProfile = ((EsimHelpScreenContract$ModalStep.InstallEsim) step).f100976a;
            ViewController viewControllerE1 = bVar.e1(new fej.c(new EsimInstallationFlowDescriptor$InputData(esimProfile, EsimInstallationFlowDescriptor$Start.InstallationPicker, false)));
            final String str = esimProfile.f100423a;
            final int i2 = 1;
            Function1 block = new Function1() { // from class: xhj.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            dii.g output = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof dii.e) {
                                com.revolut.retail.feature.esim.impl.ui.screens.help.b bVar2 = bVar;
                                bVar2.l2(new com.revolut.retail.feature.esim.impl.ui.screens.help.a(bVar2, str, null), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        default:
                            fej.d output2 = (fej.d) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z = output2 instanceof d.a;
                            com.revolut.retail.feature.esim.impl.ui.screens.help.b bVar3 = bVar;
                            if (z) {
                                bVar3.v.a();
                            } else {
                                if (!(output2 instanceof d.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.kompot.navigable.vc.modal.a aVar = bVar3.u;
                                EsimInstructionType.INSTANCE.getClass();
                                oki.h.v2(aVar, new EsimHelpScreenContract$ModalStep.Instructions("INSTALLATION", str), ModalDestination.Style.POPUP.f98311a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (!(step instanceof EsimHelpScreenContract$ModalStep.ReinstallEsim)) {
            if (!(step instanceof EsimHelpScreenContract$ModalStep.Instructions)) {
                throw new NoWhenBranchMatchedException();
            }
            EsimHelpScreenContract$ModalStep.Instructions instructions = (EsimHelpScreenContract$ModalStep.Instructions) step;
            return bVar.e1(new sd6.b(new EsimInstructionsControllerDescriptor$InputData(instructions.f100977a, instructions.f100978b)));
        }
        bVar.f100984s.getClass();
        lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_installation_troubleshoot_reinstall_sheet_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_installation_troubleshoot_reinstall_sheet_description, null, null, 14), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_installation_troubleshoot_reinstall_sheet_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
        k9 k9Var = k9.ESim;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        final String str2 = ((EsimHelpScreenContract$ModalStep.ReinstallEsim) step).f100979a;
        Function1 block2 = new Function1() { // from class: xhj.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i) {
                    case 0:
                        dii.g output = (dii.g) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        if (output instanceof dii.e) {
                            com.revolut.retail.feature.esim.impl.ui.screens.help.b bVar2 = bVar;
                            bVar2.l2(new com.revolut.retail.feature.esim.impl.ui.screens.help.a(bVar2, str2, null), new yi5.b(26));
                        }
                        return Unit.f186387a;
                    default:
                        fej.d output2 = (fej.d) obj4;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        boolean z = output2 instanceof d.a;
                        com.revolut.retail.feature.esim.impl.ui.screens.help.b bVar3 = bVar;
                        if (z) {
                            bVar3.v.a();
                        } else {
                            if (!(output2 instanceof d.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar3.u;
                            EsimInstructionType.INSTANCE.getClass();
                            oki.h.v2(aVar2, new EsimHelpScreenContract$ModalStep.Instructions("INSTALLATION", str2), ModalDestination.Style.POPUP.f98311a);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        actionsBottomSheetController.H = block2;
        return actionsBottomSheetController;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.c cVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.c) this.f302553b;
        yki.l FlowCoordinator = (yki.l) obj2;
        PlanDurableTermsFlowContract$Step step = (PlanDurableTermsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof PlanDurableTermsFlowContract$Step.PlanTerms)) {
            throw new NoWhenBranchMatchedException();
        }
        PlanTermsScreen planTermsScreen = new PlanTermsScreen();
        wma.e block = new wma.e(1, cVar, com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.c.class, "notifyTermsResult", "notifyTermsResult(Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_terms_screen/PlanTermsScreenContract$OutputData;)V", 0, 26);
        Intrinsics.checkNotNullParameter(block, "block");
        planTermsScreen.H = block;
        return planTermsScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Set setA;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        dii.a aVar;
        CryptoDirectDepositFlowContract$InputData option;
        CryptoDepositsOverviewFlowContract$InputData cryptoDepositsOverviewFlowContract$InputData;
        u0 u0Var;
        int i = this.f302552a;
        int i2 = 14;
        final int i3 = 0;
        u0 u0Var2 = null;
        final int i5 = 1;
        Object obj4 = this.f302553b;
        switch (i) {
            case 0:
                TravelExperiencesPickupDetailsScreen travelExperiencesPickupDetailsScreen = (TravelExperiencesPickupDetailsScreen) obj4;
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                KProperty[] kPropertyArr = TravelExperiencesPickupDetailsScreen.f0;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = model.P;
                v vVar = obj5 instanceof v ? (v) obj5 : null;
                if (vVar != null) {
                    return new zp0.w(vVar, field.getInnerEditText(), u.b.f324147a, new wwa.a(travelExperiencesPickupDetailsScreen, model, 20), DefaultFrameSampler.DESIRED_FRAME_WIDTH);
                }
                return null;
            case 1:
                DeFiExchangeAmountScreen deFiExchangeAmountScreen = (DeFiExchangeAmountScreen) obj4;
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = DeFiExchangeAmountScreen.T;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field2, "field");
                Object obj6 = data.f51981p;
                xi0.b bVar = obj6 instanceof xi0.b ? (xi0.b) obj6 : null;
                if (bVar == null) {
                    return null;
                }
                MaskedTextInputEditText editText = field2.getEditText();
                qd0.b bVarN = ((r36.c) deFiExchangeAmountScreen.M.getValue()).f251159c.f251170j.n();
                s.j(bVarN);
                return new zp0.d(editText, bVar, new u80.d(((s80.b) bVarN).b()), null, new x36.g(deFiExchangeAmountScreen, data), false, false, 0, false, null, 1928);
            case 2:
                y yVar = (y) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DeFiExchangeAmountContract$ModalStep step = (DeFiExchangeAmountContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy)) {
                    if (!(step instanceof DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell deFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell = (DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell) step;
                    ViewController viewControllerE1 = yVar.e1(new r66.b(deFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell.f71761a, deFiExchangeAmountContract$ModalStep$CurrencyPicker$Sell.f71762b, null, null, 12));
                    wma.e block = new wma.e(1, yVar, y.class, "onSellCurrencySelected", "onSellCurrencySelected(Lcom/revolut/feature/defi/trade/api/navigation/DeFiAssetPickerDescriptor$OutputData;)V", 0, 11);
                    Intrinsics.checkNotNullParameter(block, "block");
                    viewControllerE1.H = block;
                    return viewControllerE1;
                }
                int i6 = x36.o.f302674c[yVar.o.d.ordinal()];
                if (i6 == 1) {
                    aim.o oVar = new aim.o();
                    oVar.add(k1j.a.DEFI);
                    if (((jte.d) yVar.f302693w).c(DeFiExchangeApi$Toggles$CryptoCeFiToDeFi.f71717c)) {
                        oVar.addAll(t36.d.f267662a);
                    }
                    setA = y0.a(oVar);
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    setA = t36.d.f267662a;
                }
                DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy deFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy = (DeFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy) step;
                BalanceSelector$InputData balanceSelector$InputData = new BalanceSelector$InputData(setA, k1j.d.RETAIL, null, null, deFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy.f71760b, null, null, deFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy.f71759a, y0.b(new BalanceSelector$ExtraConfiguration.CustomPersonalSectionOrder(zhm.v.k(g1j.c.ACCOUNTS, g1j.c.DEFI, g1j.c.CRYPTO))), 104);
                z36.a aVar2 = yVar.v;
                Set excludedAssetExternalIds = deFiExchangeAmountContract$ModalStep$CurrencyPicker$Buy.f71760b;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(excludedAssetExternalIds, "excludedAssetExternalIds");
                ViewController viewControllerE12 = yVar.e1(new g1j.a(balanceSelector$InputData, new ulf.b(excludedAssetExternalIds)));
                wma.e block2 = new wma.e(1, yVar, y.class, "onBuyBalanceSelected", "onBuyBalanceSelected(Lcom/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$OutputData;)V", 0, 10);
                Intrinsics.checkNotNullParameter(block2, "block");
                viewControllerE12.H = block2;
                return viewControllerE12;
            case 3:
                com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow.b bVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                TaxHubProfileFlowContract$Step step2 = (TaxHubProfileFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof TaxHubProfileFlowContract$Step.CreateProfile)) {
                    throw new NoWhenBranchMatchedException();
                }
                TaxHubCreateProfileScreen taxHubCreateProfileScreen = new TaxHubCreateProfileScreen(new TaxHubCreateProfileScreenContract$InputData(true, false, ((TaxHubProfileFlowContract$Step.CreateProfile) step2).f74355a, null));
                x0b.c block3 = new x0b.c(bVar2, i2);
                Intrinsics.checkNotNullParameter(block3, "block");
                taxHubCreateProfileScreen.H = block3;
                return taxHubCreateProfileScreen;
            case 4:
                final com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.a aVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.a) obj4;
                w0 w0Var = aVar3.f67001s;
                CreditApplicationAgreementsFlowContract$Step step3 = (CreditApplicationAgreementsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof CreditApplicationAgreementsFlowContract$Step.Documents) {
                    CreditApplicationDocumentsScreen creditApplicationDocumentsScreen = new CreditApplicationDocumentsScreen(new CreditApplicationDocumentsScreenContract$InputData(null == true ? 1 : 0, new AnalyticsContext(w0Var), i5));
                    Function1 block4 = new Function1() { // from class: x44.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i3) {
                                case 0:
                                    k outputData = (k) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z = outputData instanceof j;
                                    com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.a aVar4 = aVar3;
                                    if (z) {
                                        oki.h.t2(aVar4, aVar4.f67002t, new CreditApplicationAgreementsFlowContract$Step.DocumentViewer(((j) outputData).f310779a, new DocumentViewerScreenConfig(true, true, ju3.b.QUICK_READ_ACTION_SUPPORT, aVar4.f66999q.f66993b, new TextLocalisedClause(R$string.agreements_document_viewer_action, null, null, 14), null, 32)), true, null, false, 12);
                                        Unit unit = Unit.f186387a;
                                    } else if (outputData instanceof y44.h) {
                                        aVar4.l2(new g(aVar4, null, 0), new yi5.b(26));
                                    } else {
                                        if (!(outputData instanceof y44.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar4.l2(new g(aVar4, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                default:
                                    v44.j outputData2 = (v44.j) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof v44.h;
                                    com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.a aVar5 = aVar3;
                                    if (z3) {
                                        aVar5.l2(new wtj.f(aVar5, outputData2, null, 22), new yi5.b(26));
                                    } else {
                                        if (!(outputData2 instanceof v44.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar5.f67002t.e(false);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block4, "block");
                    creditApplicationDocumentsScreen.H = block4;
                    return creditApplicationDocumentsScreen;
                }
                if (!(step3 instanceof CreditApplicationAgreementsFlowContract$Step.DocumentViewer)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i21 = R$string.agreements_document_viewer_title;
                CreditApplicationAgreementsFlowContract$Step.DocumentViewer documentViewer = (CreditApplicationAgreementsFlowContract$Step.DocumentViewer) step3;
                du3.a aVar4 = documentViewer.f66995a;
                CreditApplicationDocumentViewerScreen creditApplicationDocumentViewerScreen = new CreditApplicationDocumentViewerScreen(new CreditApplicationDocumentViewerScreenContract$InputData(new TextLocalisedClause(i21, zhm.u.c(new TextClause(aVar4.f117552b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), aVar4.f117551a, new v44.f(aVar4.d, aVar4.e), documentViewer.f66996b, null, new AnalyticsContext(w0Var), null, null, 208));
                Function1 block5 = new Function1() { // from class: x44.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i5) {
                            case 0:
                                k outputData = (k) obj7;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean z = outputData instanceof j;
                                com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.a aVar42 = aVar3;
                                if (z) {
                                    oki.h.t2(aVar42, aVar42.f67002t, new CreditApplicationAgreementsFlowContract$Step.DocumentViewer(((j) outputData).f310779a, new DocumentViewerScreenConfig(true, true, ju3.b.QUICK_READ_ACTION_SUPPORT, aVar42.f66999q.f66993b, new TextLocalisedClause(R$string.agreements_document_viewer_action, null, null, 14), null, 32)), true, null, false, 12);
                                    Unit unit = Unit.f186387a;
                                } else if (outputData instanceof y44.h) {
                                    aVar42.l2(new g(aVar42, null, 0), new yi5.b(26));
                                } else {
                                    if (!(outputData instanceof y44.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar42.l2(new g(aVar42, null, 1), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            default:
                                v44.j outputData2 = (v44.j) obj7;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                boolean z3 = outputData2 instanceof v44.h;
                                com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.a aVar5 = aVar3;
                                if (z3) {
                                    aVar5.l2(new wtj.f(aVar5, outputData2, null, 22), new yi5.b(26));
                                } else {
                                    if (!(outputData2 instanceof v44.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar5.f67002t.e(false);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block5, "block");
                creditApplicationDocumentViewerScreen.H = block5;
                return creditApplicationDocumentViewerScreen;
            case 5:
                x46.b bVar3 = (x46.b) obj4;
                List<qta.c> rates = (List) obj3;
                Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(rates, "rates");
                for (qta.c cVar : rates) {
                    bVar3.d.put(new Pair(cVar.f249046a, cVar.f249047b), cVar);
                }
                return Unit.f186387a;
            case 6:
                com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.b bVar4 = (com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.b) obj4;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                RevolutXLauncherFlowContract$Step step4 = (RevolutXLauncherFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof RevolutXLauncherFlowContract$Step.Article)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE13 = bVar4.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(((RevolutXLauncherFlowContract$Step.Article) step4).f84269a)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                x0b.c block6 = new x0b.c(bVar4, 19);
                Intrinsics.checkNotNullParameter(block6, "block");
                viewControllerE13.H = block6;
                return viewControllerE13;
            case 7:
                com.revolut.retail.feature.commodity.order_flow.impl.ui.a aVar5 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.a) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                CommodityOrderFlowContract$Step step5 = (CommodityOrderFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof CommodityOrderFlowContract$Step.Edit) {
                    CommodityOrderEditScreen commodityOrderEditScreen = new CommodityOrderEditScreen(new CommodityOrderEditScreenContract$InputData(aVar5.f99816p.f99810a));
                    x52.a block7 = new x52.a(aVar5, FlowCoordinator, 3);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    commodityOrderEditScreen.H = block7;
                    return commodityOrderEditScreen;
                }
                if (!(step5 instanceof CommodityOrderFlowContract$Step.ScaPrompt)) {
                    if (!(step5 instanceof CommodityOrderFlowContract$Step.Review)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CommodityOrderReviewScreen commodityOrderReviewScreen = new CommodityOrderReviewScreen(new CommodityOrderReviewScreenContract$InputData(((CommodityOrderFlowContract$Step.Review) step5).f99813a));
                    x0b.c block8 = new x0b.c(aVar5, 24);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    commodityOrderReviewScreen.H = block8;
                    return commodityOrderReviewScreen;
                }
                CommodityOrderFlowContract$Step.ScaPrompt scaPrompt = (CommodityOrderFlowContract$Step.ScaPrompt) step5;
                String str = scaPrompt.f99814a;
                k9 k9Var = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ViewController viewControllerE14 = aVar5.e1(new wrc.a(str, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 10));
                wtl.f block9 = new wtl.f(aVar5, 9, scaPrompt, FlowCoordinator);
                Intrinsics.checkNotNullParameter(block9, "block");
                viewControllerE14.H = block9;
                return viewControllerE14;
            case 8:
                com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.a aVar6 = (com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.a) obj4;
                MoneyRequestActionFlowContract$Step step6 = (MoneyRequestActionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!Intrinsics.f(step6, MoneyRequestActionFlowContract$Step.Dialog.f102141a)) {
                    throw new NoWhenBranchMatchedException();
                }
                x6k.a aVar7 = aVar6.f102142p;
                MoneyRequestActionNavigation$InputData moneyRequestActionNavigation$InputData = aVar6.o;
                yv9.a aVar8 = moneyRequestActionNavigation$InputData.f79600b;
                MoneyRequest moneyRequest = moneyRequestActionNavigation$InputData.f79599a;
                int i22 = x6k.e.f303116a[aVar8.ordinal()];
                if (i22 == 1) {
                    aVar7.getClass();
                    Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
                    MoneyClause moneyClause = new MoneyClause(moneyRequest.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                    String strG = ((v6k.c) aVar7.f303111a).g(moneyRequest);
                    TextClause textClause = strG != null ? new TextClause(strG, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                    if (textClause == null) {
                        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.core.R$string.money_request_core_notification_friend, null, null, 14);
                        textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.core.R$string.money_request_core_details_alert_cancel_request_title, zhm.v.k(moneyClause, textLocalisedClause3), null, 12);
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.core.R$string.money_request_core_link_cancel_alert_request_message, zhm.v.k(textLocalisedClause3, moneyClause), null, 12);
                    } else {
                        textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.core.R$string.money_request_core_details_cancel_request_title, zhm.v.k(moneyClause, textClause), null, 12);
                        textLocalisedClause2 = null;
                    }
                    lw0.a aVar9 = new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 28);
                    m6 m6Var = n6.Companion;
                    aw0.g gVar = new aw0.g(m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.core.R$string.money_request_core_details_cancel_request_no, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.core.R$string.money_request_core_details_cancel_request_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                    k9 k9Var2 = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    aVar = new dii.a(aVar9, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24);
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar7.getClass();
                    Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
                    MoneyClause moneyClause2 = new MoneyClause(moneyRequest.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                    String strG2 = ((v6k.c) aVar7.f303111a).g(moneyRequest);
                    int i32 = com.revolut.retail.feature.payments.money_request.core.R$string.request_details_alert_decline_request_title;
                    if (strG2 == null) {
                        strG2 = "";
                    }
                    lw0.a aVar10 = new lw0.a(new TextLocalisedClause(i32, zhm.v.k(moneyClause2, new TextClause(strG2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, null, false, 30);
                    m6 m6Var2 = n6.Companion;
                    aw0.g gVar2 = new aw0.g(m6.c(m6Var2, new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.core.R$string.money_request_core_details_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), m6.c(m6Var2, new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.core.R$string.request_details_action_decline, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                    k9 k9Var3 = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    aVar = new dii.a(aVar10, gVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24);
                }
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(aVar);
                x6k.d block10 = new x6k.d(aVar6, i3);
                Intrinsics.checkNotNullParameter(block10, "block");
                actionsBottomSheetController.H = block10;
                return actionsBottomSheetController;
            case 9:
                final com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a aVar11 = (com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                WithdrawalCodeDetailsContract$ModalStep step7 = (WithdrawalCodeDetailsContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (Intrinsics.f(step7, WithdrawalCodeDetailsContract$ModalStep.ShareConfirmation.f62635a)) {
                    lw0.a aVar12 = new lw0.a(new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_share_confirm_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_share_confirm_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_16_warning, null, null, 6)), null, false, 24);
                    aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_share_confirm_action_share, null, null, 14), LargeActionButton.ButtonStyle.f58725a, new ResourceImage(R$drawable.uikit_icn_24_share, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, false, null, null, 1016), new n6(new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_share_confirm_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                    k9 k9Var4 = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar12, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
                    Function1 block11 = new Function1() { // from class: x82.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            dii.g outputData = (dii.g) obj7;
                            switch (i5) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a aVar13 = aVar11;
                                        aVar13.l2(new wr1.s(aVar13, null, 23), new yi5.b(26));
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a aVar14 = aVar11;
                                        MultibancoWithdrawalCode multibancoWithdrawalCode = (MultibancoWithdrawalCode) ((b) ((j2) aVar14.u.f22677a).getValue()).f303259a.getContent();
                                        if (multibancoWithdrawalCode != null) {
                                            f01.c cVar2 = aVar14.f62640t;
                                            int i33 = com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_share_message;
                                            MoneyClause moneyClauseB = c92.a.b(multibancoWithdrawalCode);
                                            String strC = c92.a.c(multibancoWithdrawalCode);
                                            Intrinsics.checkNotNullParameter(multibancoWithdrawalCode, "<this>");
                                            String string = cVar2.b(new TextLocalisedClause(i33, zhm.v.k(moneyClauseB, strC, new TimeClause(oi0.d.R(multibancoWithdrawalCode.i), TimeClause.Format.TimeDefault.f57977b, null, null, 12)), null, 12)).toString();
                                            tqi.g gVar3 = aVar14.f62638r;
                                            m70.a.c(t0.f186434a);
                                            aVar14.C1(zh9.u0.b(gVar3.f(0, "", string)));
                                        }
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    actionsBottomSheetController2.H = block11;
                    return actionsBottomSheetController2;
                }
                if (!Intrinsics.f(step7, WithdrawalCodeDetailsContract$ModalStep.CancelConfirmation.f62634a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar13 = new lw0.a(new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cancellation_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cancellation_subtitle, null, null, 14), null, null, false, 28);
                aw0.h hVar2 = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cancellation_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cancellation_action_decline, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                k9 k9Var5 = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar13, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
                Function1 block12 = new Function1() { // from class: x82.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        dii.g outputData = (dii.g) obj7;
                        switch (i3) {
                            case 0:
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                if (outputData instanceof dii.e) {
                                    com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a aVar132 = aVar11;
                                    aVar132.l2(new wr1.s(aVar132, null, 23), new yi5.b(26));
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                if (outputData instanceof dii.e) {
                                    com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a aVar14 = aVar11;
                                    MultibancoWithdrawalCode multibancoWithdrawalCode = (MultibancoWithdrawalCode) ((b) ((j2) aVar14.u.f22677a).getValue()).f303259a.getContent();
                                    if (multibancoWithdrawalCode != null) {
                                        f01.c cVar2 = aVar14.f62640t;
                                        int i33 = com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_share_message;
                                        MoneyClause moneyClauseB = c92.a.b(multibancoWithdrawalCode);
                                        String strC = c92.a.c(multibancoWithdrawalCode);
                                        Intrinsics.checkNotNullParameter(multibancoWithdrawalCode, "<this>");
                                        String string = cVar2.b(new TextLocalisedClause(i33, zhm.v.k(moneyClauseB, strC, new TimeClause(oi0.d.R(multibancoWithdrawalCode.i), TimeClause.Format.TimeDefault.f57977b, null, null, 12)), null, 12)).toString();
                                        tqi.g gVar3 = aVar14.f62638r;
                                        m70.a.c(t0.f186434a);
                                        aVar14.C1(zh9.u0.b(gVar3.f(0, "", string)));
                                    }
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block12, "block");
                actionsBottomSheetController3.H = block12;
                return actionsBottomSheetController3;
            case 10:
                com.revolut.feature.credit.loan.impl.ui.statements.flow.a aVar14 = (com.revolut.feature.credit.loan.impl.ui.statements.flow.a) obj4;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                LoanStatementsFlowContract$Step step8 = (LoanStatementsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (Intrinsics.f(step8, LoanStatementsFlowContract$Step.List.f70617a)) {
                    return new LoanStatementsListScreen(new LoanStatementsListScreenContract$InputData(aVar14.o.f70615a));
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                com.revolut.feature.onboarding.impl.language_change.flow.a aVar15 = (com.revolut.feature.onboarding.impl.language_change.flow.a) obj4;
                LanguageChangeFlowContract$Step step9 = (LanguageChangeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!Intrinsics.f(step9, LanguageChangeFlowContract$Step.LanguageChangePrompt.f78284a)) {
                    throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.forced_language_change_full_screen_prompt_title_us, null, null, 14);
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.forced_language_change_full_screen_prompt_message_us, null, null, 14);
                wi0.b.Companion.getClass();
                CountryImage countryImage = new CountryImage("US", (Integer) null, (ez0.e) null, 14);
                PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.forcedLanguageChange_prompt_action_relaunch, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
                k9 value = k9.Onboarding;
                Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause4, textLocalisedClause5, countryImage, null, null, aVar15.o.f78283a ? new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, null, button, null, null, null, null, new AnalyticsProduct.Retail(value), null, 61272));
                x8h.d block13 = new x8h.d(aVar15, 16);
                Intrinsics.checkNotNullParameter(block13, "block");
                promptMarketingScreen.H = block13;
                return promptMarketingScreen;
            case 12:
                com.revolut.feature.junior.isa.impl.ui.trading_account_picker.flow.a aVar16 = (com.revolut.feature.junior.isa.impl.ui.trading_account_picker.flow.a) obj4;
                yki.b LazyFlowCoordinator4 = (yki.b) obj2;
                JuniorTradingAccountPickerFlowContract$Step step10 = (JuniorTradingAccountPickerFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator4, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!Intrinsics.f(step10, JuniorTradingAccountPickerFlowContract$Step.JuniorAccountPicker.f76810a)) {
                    throw new NoWhenBranchMatchedException();
                }
                JuniorTradingAccountPickerScreen juniorTradingAccountPickerScreen = new JuniorTradingAccountPickerScreen();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                x52.a block14 = new x52.a(ref$ObjectRef, aVar16, 18);
                Intrinsics.checkNotNullParameter(block14, "block");
                juniorTradingAccountPickerScreen.H = block14;
                juniorTradingAccountPickerScreen.l2(new c88.c(ref$ObjectRef, aVar16, LazyFlowCoordinator4, i5));
                return juniorTradingAccountPickerScreen;
            case 13:
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.rooms_selection.a aVar17 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.rooms_selection.a) obj4;
                TravelHotelsRoomsSelectionFlowContract$Step step11 = (TravelHotelsRoomsSelectionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof TravelHotelsRoomsSelectionFlowContract$Step.RoomsSelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelHotelsRoomsSelectionScreen travelHotelsRoomsSelectionScreen = new TravelHotelsRoomsSelectionScreen();
                xag.f block15 = new xag.f(aVar17, i5);
                Intrinsics.checkNotNullParameter(block15, "block");
                travelHotelsRoomsSelectionScreen.H = block15;
                return travelHotelsRoomsSelectionScreen;
            case 14:
                com.revolut.retail.feature.pending_payments.impl.ui.a aVar18 = (com.revolut.retail.feature.pending_payments.impl.ui.a) obj4;
                PendingPaymentFlowContract$Step step12 = (PendingPaymentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof PendingPaymentFlowContract$Step.Confirmation) {
                    PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = new PendingPaymentConfirmationScreen(aVar18.f102426q);
                    x8h.d block16 = new x8h.d(aVar18, 21);
                    Intrinsics.checkNotNullParameter(block16, "block");
                    pendingPaymentConfirmationScreen.H = block16;
                    return pendingPaymentConfirmationScreen;
                }
                if (!(step12 instanceof PendingPaymentFlowContract$Step.BottomDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                PendingPaymentFlowContract$Step.BottomDialog bottomDialog = (PendingPaymentFlowContract$Step.BottomDialog) step12;
                xak.a aVar19 = aVar18.o;
                PendingPaymentBottomSheetInputData pendingPaymentBottomSheetInputData = bottomDialog.f102422a;
                aVar19.getClass();
                ActionsBottomSheetController actionsBottomSheetController4 = new ActionsBottomSheetController(xak.a.a(pendingPaymentBottomSheetInputData));
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                wtl.f block17 = new wtl.f(ref$BooleanRef, 15, bottomDialog, aVar18);
                Intrinsics.checkNotNullParameter(block17, "block");
                actionsBottomSheetController4.H = block17;
                actionsBottomSheetController4.l2(new qg7.k(ref$BooleanRef, 20, bottomDialog, aVar18));
                return actionsBottomSheetController4;
            case 15:
                final com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c cVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c) obj4;
                final FinancialSituationConfirmationFlowContract$Step step13 = (FinancialSituationConfirmationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof FinancialSituationConfirmationFlowContract$Step.Initial) {
                    return com.revolut.feature.credit.application.plugins.impl.ui.loading.a.b();
                }
                if (step13 instanceof FinancialSituationConfirmationFlowContract$Step.Intro) {
                    CreditPromptFlow creditPromptFlow = new CreditPromptFlow(new CreditPromptFlowContract$InputData(((FinancialSituationConfirmationFlowContract$Step.Intro) step13).f67757a.f266611a, new CreditPromptAnalyticsConfiguration(R$string.financial_situation_confirmation_confirmation_title, R$string.credit_prompt_description, R$string.credit_prompt_primary_button, R$string.credit_prompt_secondary_button), cVar2.f67760q.f67753a));
                    Function1 block18 = new Function1() { // from class: xb4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            int i33 = i3;
                            FinancialSituationConfirmationFlowContract$Step financialSituationConfirmationFlowContract$Step = step13;
                            switch (i33) {
                                case 0:
                                    rv3.b outputData = (rv3.b) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z = outputData instanceof b.a;
                                    com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c cVar3 = cVar2;
                                    if (z) {
                                        t.J2(cVar3, false, null, null, 7);
                                    } else if (outputData instanceof rv3.c) {
                                        int i43 = d.f303980a[((rv3.c) outputData).f257692a.ordinal()];
                                        if (i43 == 1) {
                                            cVar3.l2(new z5(cVar3, "confirm financial situation", R$string.financial_situation_confirmation_confirmation_popup_title, ((FinancialSituationConfirmationFlowContract$Step.Intro) financialSituationConfirmationFlowContract$Step).f67757a.d, R$string.financial_situation_confirmation_confirmation_popup_description, (Integer) null, new com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.a(cVar3, financialSituationConfirmationFlowContract$Step, null), (Continuation) null), new yi5.b(26));
                                        } else if (i43 != 2) {
                                            int i59 = jli.h.f175850a;
                                        } else {
                                            oki.h.t2(cVar3, cVar3.f67761r, new FinancialSituationConfirmationFlowContract$Step.Changes(((FinancialSituationConfirmationFlowContract$Step.Intro) financialSituationConfirmationFlowContract$Step).f67757a), true, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                        }
                                    } else {
                                        if (!(outputData instanceof b.C1428b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(cVar3.f67761r, new FinancialSituationConfirmationFlowContract$Step.Details(((FinancialSituationConfirmationFlowContract$Step.Intro) financialSituationConfirmationFlowContract$Step).f67757a.f266612b), ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yb4.h outputData2 = (yb4.h) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (!(outputData2 instanceof yb4.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    sy3.h hVar3 = ((FinancialSituationConfirmationFlowContract$Step.Changes) financialSituationConfirmationFlowContract$Step).f67754a.e;
                                    com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c cVar4 = cVar2;
                                    cVar4.l2(new z5(cVar4, "submit financial situation changes", R$string.financial_situation_confirmation_changes_popup_title, hVar3, R$string.financial_situation_confirmation_changes_popup_description, Integer.valueOf(R$string.financial_situation_confirmation_changes_popup_primary_button), new c64.d(cVar4, outputData2, null, 13), (Continuation) null), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    creditPromptFlow.H = block18;
                    return creditPromptFlow;
                }
                if (step13 instanceof FinancialSituationConfirmationFlowContract$Step.Details) {
                    return new FinancialSituationDetailsScreen(new FinancialSituationDetailsScreenContract$InputData(((FinancialSituationConfirmationFlowContract$Step.Details) step13).f67755a));
                }
                if (!(step13 instanceof FinancialSituationConfirmationFlowContract$Step.Changes)) {
                    throw new NoWhenBranchMatchedException();
                }
                FinancialSituationChangesScreen financialSituationChangesScreen = new FinancialSituationChangesScreen(new FinancialSituationChangesScreenContract$InputData(((FinancialSituationConfirmationFlowContract$Step.Changes) step13).f67754a.f266613c));
                Function1 block19 = new Function1() { // from class: xb4.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        int i33 = i5;
                        FinancialSituationConfirmationFlowContract$Step financialSituationConfirmationFlowContract$Step = step13;
                        switch (i33) {
                            case 0:
                                rv3.b outputData = (rv3.b) obj7;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean z = outputData instanceof b.a;
                                com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c cVar3 = cVar2;
                                if (z) {
                                    t.J2(cVar3, false, null, null, 7);
                                } else if (outputData instanceof rv3.c) {
                                    int i43 = d.f303980a[((rv3.c) outputData).f257692a.ordinal()];
                                    if (i43 == 1) {
                                        cVar3.l2(new z5(cVar3, "confirm financial situation", R$string.financial_situation_confirmation_confirmation_popup_title, ((FinancialSituationConfirmationFlowContract$Step.Intro) financialSituationConfirmationFlowContract$Step).f67757a.d, R$string.financial_situation_confirmation_confirmation_popup_description, (Integer) null, new com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.a(cVar3, financialSituationConfirmationFlowContract$Step, null), (Continuation) null), new yi5.b(26));
                                    } else if (i43 != 2) {
                                        int i59 = jli.h.f175850a;
                                    } else {
                                        oki.h.t2(cVar3, cVar3.f67761r, new FinancialSituationConfirmationFlowContract$Step.Changes(((FinancialSituationConfirmationFlowContract$Step.Intro) financialSituationConfirmationFlowContract$Step).f67757a), true, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    }
                                } else {
                                    if (!(outputData instanceof b.C1428b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.w2(cVar3.f67761r, new FinancialSituationConfirmationFlowContract$Step.Details(((FinancialSituationConfirmationFlowContract$Step.Intro) financialSituationConfirmationFlowContract$Step).f67757a.f266612b), ModalDestination.Style.POPUP.f98311a);
                                }
                                return Unit.f186387a;
                            default:
                                yb4.h outputData2 = (yb4.h) obj7;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                if (!(outputData2 instanceof yb4.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                sy3.h hVar3 = ((FinancialSituationConfirmationFlowContract$Step.Changes) financialSituationConfirmationFlowContract$Step).f67754a.e;
                                com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c cVar4 = cVar2;
                                cVar4.l2(new z5(cVar4, "submit financial situation changes", R$string.financial_situation_confirmation_changes_popup_title, hVar3, R$string.financial_situation_confirmation_changes_popup_description, Integer.valueOf(R$string.financial_situation_confirmation_changes_popup_primary_button), new c64.d(cVar4, outputData2, null, 13), (Continuation) null), new yi5.b(26));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block19, "block");
                financialSituationChangesScreen.H = block19;
                return financialSituationChangesScreen;
            case 16:
                final com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a aVar20 = (com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a) obj4;
                WaitingListAwaitingScreenContract$InputData waitingListAwaitingScreenContract$InputData = aVar20.o;
                n8b.a aVar21 = aVar20.f78503p;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                WaitingListAwaitingScreenContract$ModalStep step14 = (WaitingListAwaitingScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (Intrinsics.f(step14, WaitingListAwaitingScreenContract$ModalStep.ChangeCountryConfirmationDialog.f78501a)) {
                    lw0.a aVar22 = new lw0.a(new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.waiting_list_awaiting_change_country_confirmation_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.waiting_list_awaiting_change_country_confirmation_subtitle, zhm.u.c(((o8b.c) aVar21).b(waitingListAwaitingScreenContract$InputData.f78499a.f297794a)), null, 12), null, null, false, 28);
                    aw0.g gVar3 = new aw0.g(new n6(new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.waiting_list_awaiting_change_country_confirmation_change_button, null, null, 14), LargeActionButton.ButtonStyle.d, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.uicomponent.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), (Clause) null, aw0.f.EQUAL_BUTTONS_REVERSED, 9);
                    AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                    k9 k9Var6 = frl.a.k;
                    ActionsBottomSheetController actionsBottomSheetController5 = new ActionsBottomSheetController(new dii.a(aVar22, gVar3, com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var6, k9Var6), null, null, 24));
                    Function1 block20 = new Function1() { // from class: xb9.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            dii.g result = (dii.g) obj7;
                            switch (i3) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a aVar23 = aVar20;
                                    aVar23.getClass();
                                    if (Intrinsics.f(result, dii.e.f115068a)) {
                                        aVar23.C2(g.f304023a);
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a aVar24 = aVar20;
                                    aVar24.getClass();
                                    if (Intrinsics.f(result, dii.e.f115068a)) {
                                        aVar24.C2(h.f304024a);
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block20, "block");
                    actionsBottomSheetController5.H = block20;
                    return actionsBottomSheetController5;
                }
                if (!Intrinsics.f(step14, WaitingListAwaitingScreenContract$ModalStep.LogOutConfirmationDialog.f78502a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar23 = new lw0.a(new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.waiting_list_awaiting_logout_confirmation_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.waiting_list_awaiting_logout_confirmation_description, zhm.u.c(((o8b.c) aVar21).b(waitingListAwaitingScreenContract$InputData.f78499a.f297794a)), null, 12), null, null, false, 28);
                aw0.g gVar4 = new aw0.g(new n6(new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.common_action_log_out, null, null, 14), LargeActionButton.ButtonStyle.d, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.uicomponent.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), (Clause) null, aw0.f.EQUAL_BUTTONS_REVERSED, 9);
                AnalyticsProduct.Companion companion2 = AnalyticsProduct.INSTANCE;
                k9 k9Var7 = frl.a.k;
                ActionsBottomSheetController actionsBottomSheetController6 = new ActionsBottomSheetController(new dii.a(aVar23, gVar4, com.google.android.gms.internal.mlkit_vision_face.a.g(companion2, k9Var7, k9Var7), null, null, 24));
                Function1 block21 = new Function1() { // from class: xb9.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        dii.g result = (dii.g) obj7;
                        switch (i5) {
                            case 0:
                                Intrinsics.checkNotNullParameter(result, "result");
                                com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a aVar232 = aVar20;
                                aVar232.getClass();
                                if (Intrinsics.f(result, dii.e.f115068a)) {
                                    aVar232.C2(g.f304023a);
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(result, "result");
                                com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a aVar24 = aVar20;
                                aVar24.getClass();
                                if (Intrinsics.f(result, dii.e.f115068a)) {
                                    aVar24.C2(h.f304024a);
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block21, "block");
                actionsBottomSheetController6.H = block21;
                return actionsBottomSheetController6;
            case 17:
                final com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.b bVar5 = (com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.b) obj4;
                yki.b LazyFlowCoordinator5 = (yki.b) obj2;
                CryptoDepositFlowContract$Step step15 = (CryptoDepositFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator5, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (Intrinsics.f(step15, CryptoDepositFlowContract$Step.Restricted.f100055a)) {
                    ((ik5.g) bVar5.f100057q).getClass();
                    PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.crypto.remittance.impl.R$string.crypto_restrictions_deposit_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.crypto.remittance.impl.R$string.crypto_restrictions_deposit_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.crypto.remittance.impl.R$string.crypto_restrictions_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, AnalyticsProduct.Shared.Crypto.f, null, 61272));
                    promptMarketingScreen2.k2(new Function0() { // from class: xbj.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    bVar5.I2();
                                    break;
                                default:
                                    h.D2(bVar5.f100059s);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return promptMarketingScreen2;
                }
                if (Intrinsics.f(step15, CryptoDepositFlowContract$Step.ProductArticle.f100054a)) {
                    ViewController viewControllerE15 = bVar5.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(CryptoReceiveProductArticleKey.RECEIVE)), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, AnalyticsProduct.Shared.Crypto.f, null, false, 48));
                    viewControllerE15.k2(new Function0() { // from class: xbj.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    bVar5.I2();
                                    break;
                                default:
                                    h.D2(bVar5.f100059s);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return viewControllerE15;
                }
                if (!(step15 instanceof CryptoDepositFlowContract$Step.Overview)) {
                    if (!(step15 instanceof CryptoDepositFlowContract$Step.DirectDeposit)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CryptoDepositInput.DirectDeposit directDeposit = ((CryptoDepositFlowContract$Step.DirectDeposit) step15).f100052a;
                    if (directDeposit instanceof CryptoDepositInput.DirectDeposit.AllOptions) {
                        option = new CryptoDirectDepositFlowContract$InputData.AllOptions(((CryptoDepositInput.DirectDeposit.AllOptions) directDeposit).f100043a);
                    } else {
                        if (!(directDeposit instanceof CryptoDepositInput.DirectDeposit.Option)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CryptoDepositInput.DirectDeposit.Option option2 = (CryptoDepositInput.DirectDeposit.Option) directDeposit;
                        option = new CryptoDirectDepositFlowContract$InputData.Option(option2.f100045b, option2.f100044a);
                    }
                    return new CryptoDirectDepositFlow(option);
                }
                CryptoDepositsOverviewFlowContract$InputData.Companion aVar24 = CryptoDepositsOverviewFlowContract$InputData.INSTANCE;
                CryptoDepositInput cryptoDepositInput = ((CryptoDepositFlowContract$Step.Overview) step15).f100053a;
                aVar24.getClass();
                Intrinsics.checkNotNullParameter(cryptoDepositInput, "<this>");
                if (cryptoDepositInput instanceof CryptoDepositInput.Overview) {
                    CryptoDepositInput.Overview overview = (CryptoDepositInput.Overview) cryptoDepositInput;
                    xi0.b bVar6 = overview.f100046a;
                    com.revolut.retail.feature.crypto_deposits.api.navigation.a aVar25 = overview.f100047b;
                    if (aVar25 != null) {
                        int i33 = com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.a.f100108a[aVar25.ordinal()];
                        if (i33 == 1) {
                            u0Var = u0.WALLET;
                        } else {
                            if (i33 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            u0Var = u0.FRIENDS;
                        }
                        u0Var2 = u0Var;
                    }
                    cryptoDepositsOverviewFlowContract$InputData = new CryptoDepositsOverviewFlowContract$InputData(CryptoDepositsOverviewFlowContract$InputData.Source.CeFi.f100099a, overview.d, overview.f, bVar6, u0Var2, overview.f100048c);
                } else {
                    if (!(cryptoDepositInput instanceof CryptoDepositInput.DeFi)) {
                        if (cryptoDepositInput instanceof CryptoDepositInput.DirectDeposit) {
                            throw new IllegalStateException("Direct deposit does not use the overview flow");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    CryptoDepositInput.DeFi deFi = (CryptoDepositInput.DeFi) cryptoDepositInput;
                    String str2 = deFi.f100042b;
                    cryptoDepositsOverviewFlowContract$InputData = new CryptoDepositsOverviewFlowContract$InputData(new CryptoDepositsOverviewFlowContract$InputData.Source.DeFi(deFi.f100041a, str2), hbj.b.NETWORK_PICKER, null, new xi0.b(4, str2, 0), null, true);
                }
                return new CryptoDepositsOverviewFlow(cryptoDepositsOverviewFlowContract$InputData);
            case 18:
                com.revolut.feature.apm.spin.impl.ui.settings.a aVar26 = (com.revolut.feature.apm.spin.impl.ui.settings.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SpinSettingsScreenContract$ModalStep step16 = (SpinSettingsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (step16 instanceof SpinSettingsScreenContract$ModalStep.HandleClaim) {
                    SpinDeregisterPromptScreen spinDeregisterPromptScreen = new SpinDeregisterPromptScreen(new SpinDeregisterPromptScreenContract$InputData(((SpinSettingsScreenContract$ModalStep.HandleClaim) step16).f62881a));
                    x8h.d block22 = new x8h.d(aVar26, 25);
                    Intrinsics.checkNotNullParameter(block22, "block");
                    spinDeregisterPromptScreen.H = block22;
                    return spinDeregisterPromptScreen;
                }
                if (!Intrinsics.f(step16, SpinSettingsScreenContract$ModalStep.AliasAlreadyLinked.f62880a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar27 = new lw0.a(new TextLocalisedClause(com.revolut.feature.apm.spin.api.R$string.spin_settings_registration_error_number_already_linked_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.spin.api.R$string.spin_settings_registration_error_number_already_linked_description, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_16_info_outline, null, null, 6)), null, false, 24);
                k9 k9Var8 = k9.ProductUnspecified;
                Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar27, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var8, "value", k9Var8), null, null, 24));
            case 19:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
                z1 z1Var = ((xd4.a) obj4).f304255a;
                return new xd4.d(ky4.a.a(R$string.credit_manual_underwriting_ticketor_header_title, z1Var.f154980a), ky4.a.a(R$string.credit_manual_underwriting_ticketor_header_subtitle, z1Var.f154981b), null, list, false, false);
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((xdi.w) obj4).b();
            case 21:
                return a(obj2, obj3);
            case 22:
                ve7.n domain = (ve7.n) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((xe7.d) obj4).f304543b.f("INCENTIVE_EXPERIMENTS_KEY", domain);
                return Unit.f186387a;
            case 23:
                od0.i asset = (od0.i) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(asset, "asset");
                ((xg8.j) obj4).f305633c.f("ASSET_MEMORY_CACHE_KEY", asset);
                return Unit.f186387a;
            case 24:
                SalaryPromotionParams params = (SalaryPromotionParams) obj2;
                egb.c promotion = (egb.c) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(promotion, "promotion");
                ((xgb.a) obj4).f305671b.f(xgb.a.a(params), promotion);
                return Unit.f186387a;
            case 25:
                return b(obj2, obj3);
            case 26:
                return c(obj2, obj3);
            case 27:
                return d(obj2, obj3);
            case 28:
                xi4.a aVar28 = (xi4.a) obj4;
                StatusDialogFlowContract$Step it8 = (StatusDialogFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                StatusDialogFlowContract$InputData statusDialogFlowContract$InputData = aVar28.f306305p;
                StatusDialogScreen statusDialogScreen = new StatusDialogScreen(new StatusDialogScreenContract$InputData(statusDialogFlowContract$InputData.f68486a, statusDialogFlowContract$InputData.f68487b));
                xe7.a block23 = new xe7.a(aVar28, 8);
                Intrinsics.checkNotNullParameter(block23, "block");
                statusDialogScreen.H = block23;
                return statusDialogScreen;
            default:
                via.a flow = (via.a) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(flow, "flow");
                ((xia.b) obj4).f306316b.f("PRO_POST_ACTIVATION_KEY", flow);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ b(xd4.l lVar, xd4.a aVar) {
        this.f302552a = 19;
        this.f302553b = aVar;
    }
}
