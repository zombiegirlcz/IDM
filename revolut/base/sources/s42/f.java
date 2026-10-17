package s42;

import android.os.Parcelable;
import android.text.InputFilter;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import c12.r0;
import c12.s0;
import c12.t0;
import cli.j;
import cli.n;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;
import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationTerms;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.ApmTransferFlowContract$Step;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountScreen;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewScreen;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.MultibancoExternalEnrollmentFlowContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.MultibancoExternalEnrollmentFlowContract$Step;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.card.MultibancoExternalEnrollmentCardScreen;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.card.MultibancoExternalEnrollmentCardScreenContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.entry.MultibancoExternalEnrollmentEntryScreen;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.entry.MultibancoExternalEnrollmentEntryScreenContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.registration.MultibancoRegistrationFlow;
import com.revolut.feature.apm.multibanco.impl.ui.registration.MultibancoRegistrationFlowContract$InputData;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.register.EnrollmentRegistrationScreen;
import com.revolut.feature.apm.qvik.impl.ui.new_recipient.QvikNewRecipientFlowContract$Step;
import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserBannerContent;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserEmptyState;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserMode;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsPrimaryButtonClause;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.banner.BannerFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.banner.BannerFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.ConstructorCreditPromptControllerContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.AddEvidenceFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.AddEvidenceFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.evidence_holder_selection.EvidenceHolderSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.evidence_holder_selection.EvidenceHolderSelectionScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreenContract$InputData;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.common.models.domain.DeFiQuoteAmountLimitError;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreen;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreenContract$ModalStep;
import com.revolut.feature.derivatives.models.DerivativesBalance;
import com.revolut.feature.donations.impl.domain.model.CharityTransactionsParams;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreenContract$ModalStep;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$Details$ById;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.picker.PickerControllerContract$ModalStep;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.PixQrCodeChangeAmountScreen;
import com.revolut.feature.shared.branding.api.destination.BrandingParams;
import com.revolut.feature.shared.branding.impl.R$string;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreen;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreenContract$ModalStep;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreenContract$Parcel$RestoreSettings;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.subaccount.impl.ui.create.flow.group.ContactsPickerFlowContract$InputData;
import com.revolut.feature.subaccount.impl.ui.create.flow.group.ContactsPickerFlowContract$Step;
import com.revolut.feature.subaccount.impl.ui.create.screen.permission.UserPermissionSelectorScreen;
import com.revolut.feature.subaccount.impl.ui.create.screen.permission.UserPermissionSelectorScreenContract$InputData;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreenContract$SelectedBalanceInfo;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreenContract$Step;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsControllerContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.ManagedPortfoliosDetailsFlowControllerContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.ManagedPortfoliosDetailsFlowControllerContract$Step;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.flow.InvestorUpdateFlow;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.flow.InvestorUpdateFlowContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.PortfolioInsightsFlow;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.PortfolioInsightsFlowContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.ManagedPortfoliosTopHoldingsController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.ManagedPortfoliosTopHoldingsControllerContract$InputData;
import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import com.revolut.feature.vaults.R$plurals;
import com.revolut.feature_market_data_api.navigation.Breakdown;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow.BreakdownFlowContract$ModalStep;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow.BreakdownFlowContract$Payloads$ChargeDescriptionLink;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow.BreakdownFlowContract$Payloads$TaxDescription;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow.BreakdownFlowContract$Payloads$TermsLink;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.fee.FeeBreakdownScreen;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.fee.FeeBreakdownScreenContract$InputData;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.TransactionBreakdownScreen;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.TransactionBreakdownScreenContract$InputData;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction_price_description.TransactionPriceDescriptionScreen;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction_price_description.TransactionPriceDescriptionScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.occupation.OccupationChooserFlowInputData;
import com.revolut.feature_retail_user_declarations.occupation.flow.OccupationChooserFlowContract$Step;
import com.revolut.feature_retail_user_declarations.occupation.screen.OccupationChooserScreen;
import com.revolut.feature_retail_user_declarations.occupation.screen.OccupationChooserScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.ExpectedAmountController;
import com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.ExpectedAmountControllerContract$ModalStep;
import com.revolut.feature_retail_user_declarations.transaction_countries.frequency_picker.TransactionFrequencyController;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntryDetails;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import eii.l;
import fy4.s;
import fy4.t;
import grl.k9;
import grl.x0;
import ip0.m7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import pcd.x;
import s44.q;
import s56.j0;
import s65.o;
import s6d.p;
import s6h.h;
import s6h.m;
import s7a.i0;
import sa6.i;
import sae.k;
import sgm.e3;
import vkm.j2;
import w72.f;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;
import zp0.y;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f259727b;

    public /* synthetic */ f(int i, j jVar, n nVar) {
        this.f259726a = i;
        this.f259727b = jVar;
    }

    private final Object a(Object obj2, Object obj3) {
        AnalyticsProduct analyticsProductH;
        com.revolut.feature.shared.branding.impl.ui.settings.a aVar = (com.revolut.feature.shared.branding.impl.ui.settings.a) this.f259727b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        BrandingSettingsScreenContract$ModalStep step = (BrandingSettingsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, BrandingSettingsScreenContract$ModalStep.MenuItems.f86076a)) {
            throw new NoWhenBranchMatchedException();
        }
        s6d.a aVar2 = aVar.v;
        BrandingParams brandingParams = aVar.f86083w.f86065a;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(brandingParams, "brandingParams");
        List listC = u.c(new l((Clause) new TextLocalisedClause(R$string.merchant_profile_branding_reset_action_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), (Clause) null, (RowDelegate.Model.MainImage) null, true, false, (RowDelegate.Model.c) null, (Object) BrandingSettingsScreenContract$Parcel$RestoreSettings.f86077a, 232));
        if (brandingParams instanceof BrandingParams.BusinessBrandingParams) {
            x0 value = x0.Merchant;
            Parcelable.Creator<AnalyticsProduct.Business> creator = AnalyticsProduct.Business.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            analyticsProductH = new AnalyticsProduct.Business(value);
        } else {
            if (!(brandingParams instanceof BrandingParams.RetailBrandingParams)) {
                throw new NoWhenBranchMatchedException();
            }
            k9 k9Var = k9.Freelancer;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            analyticsProductH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        }
        RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(null, null, listC, analyticsProductH, null));
        p block = new p(aVar, 0);
        Intrinsics.checkNotNullParameter(block, "block");
        rowActionsBottomSheetController.H = block;
        return rowActionsBottomSheetController;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    private final Object b(Object obj2, Object obj3) {
        m mVar = (m) this.f259727b;
        m.a aVar = m.Companion;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return new h(null, (List) mVar.f260359b.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj2, Object obj3) {
        final com.revolut.feature.apm.multibanco.impl.ui.enrollment.d dVar = (com.revolut.feature.apm.multibanco.impl.ui.enrollment.d) this.f259727b;
        MultibancoExternalEnrollmentFlowContract$InputData multibancoExternalEnrollmentFlowContract$InputData = dVar.o;
        yki.l FlowCoordinator = (yki.l) obj2;
        MultibancoExternalEnrollmentFlowContract$Step step = (MultibancoExternalEnrollmentFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, MultibancoExternalEnrollmentFlowContract$Step.Entry.f62579a)) {
            MultibancoExternalEnrollmentEntryScreen multibancoExternalEnrollmentEntryScreen = new MultibancoExternalEnrollmentEntryScreen(new MultibancoExternalEnrollmentEntryScreenContract$InputData(multibancoExternalEnrollmentFlowContract$InputData.f62575a));
            final int i = 0;
            Function1 block = new Function1() { // from class: s72.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            f result = (f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof w72.d;
                            com.revolut.feature.apm.multibanco.impl.ui.enrollment.d dVar2 = dVar;
                            if (z) {
                                w72.d dVar3 = (w72.d) result;
                                oki.h.t2(dVar2, dVar2.f62589r, new MultibancoExternalEnrollmentFlowContract$Step.Confirmation(dVar3.f295457a, dVar3.f295458b), false, null, false, 12);
                            } else if (result instanceof w72.e) {
                                oki.h.t2(dVar2, dVar2.f62589r, new MultibancoExternalEnrollmentFlowContract$Step.NoMultibancoCard(((w72.e) result).f295459a), false, null, false, 12);
                            } else {
                                if (!Intrinsics.f(result, w72.c.f295456a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2.I2();
                            }
                            return Unit.f186387a;
                        default:
                            o82.f result2 = (o82.f) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean zF = Intrinsics.f(result2, o82.c.f222905a);
                            com.revolut.feature.apm.multibanco.impl.ui.enrollment.d dVar4 = dVar;
                            if (zF) {
                                dVar4.I2();
                            } else if (Intrinsics.f(result2, o82.d.f222906a)) {
                                oki.h.t2(dVar4, dVar4.f62589r, MultibancoExternalEnrollmentFlowContract$Step.Entry.f62579a, false, null, false, 12);
                            } else {
                                if (!(result2 instanceof o82.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(dVar4, dVar4.f62589r, new MultibancoExternalEnrollmentFlowContract$Step.Confirmation(((o82.e) result2).f222907a.getRevolutCardId(), true), false, null, false, 12);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            multibancoExternalEnrollmentEntryScreen.H = block;
            return multibancoExternalEnrollmentEntryScreen;
        }
        if (step instanceof MultibancoExternalEnrollmentFlowContract$Step.Confirmation) {
            MultibancoExternalEnrollmentFlowContract$Step.Confirmation confirmation = (MultibancoExternalEnrollmentFlowContract$Step.Confirmation) step;
            MultibancoExternalEnrollmentCardScreen multibancoExternalEnrollmentCardScreen = new MultibancoExternalEnrollmentCardScreen(new MultibancoExternalEnrollmentCardScreenContract$InputData(confirmation.f62577a, confirmation.f62578b));
            s31.a block2 = new s31.a(dVar, confirmation, 11);
            Intrinsics.checkNotNullParameter(block2, "block");
            multibancoExternalEnrollmentCardScreen.H = block2;
            return multibancoExternalEnrollmentCardScreen;
        }
        if (!(step instanceof MultibancoExternalEnrollmentFlowContract$Step.NoMultibancoCard)) {
            if (!(step instanceof MultibancoExternalEnrollmentFlowContract$Step.Registration)) {
                throw new NoWhenBranchMatchedException();
            }
            MultibancoRegistrationFlow multibancoRegistrationFlow = new MultibancoRegistrationFlow(new MultibancoRegistrationFlowContract$InputData(new MultibancoRegistrationStatus.NotRegistered(((MultibancoExternalEnrollmentFlowContract$Step.Registration) step).f62581a), multibancoExternalEnrollmentFlowContract$InputData.f62575a));
            final int i2 = 1;
            Function1 block3 = new Function1() { // from class: s72.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            f result = (f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof w72.d;
                            com.revolut.feature.apm.multibanco.impl.ui.enrollment.d dVar2 = dVar;
                            if (z) {
                                w72.d dVar3 = (w72.d) result;
                                oki.h.t2(dVar2, dVar2.f62589r, new MultibancoExternalEnrollmentFlowContract$Step.Confirmation(dVar3.f295457a, dVar3.f295458b), false, null, false, 12);
                            } else if (result instanceof w72.e) {
                                oki.h.t2(dVar2, dVar2.f62589r, new MultibancoExternalEnrollmentFlowContract$Step.NoMultibancoCard(((w72.e) result).f295459a), false, null, false, 12);
                            } else {
                                if (!Intrinsics.f(result, w72.c.f295456a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2.I2();
                            }
                            return Unit.f186387a;
                        default:
                            o82.f result2 = (o82.f) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean zF = Intrinsics.f(result2, o82.c.f222905a);
                            com.revolut.feature.apm.multibanco.impl.ui.enrollment.d dVar4 = dVar;
                            if (zF) {
                                dVar4.I2();
                            } else if (Intrinsics.f(result2, o82.d.f222906a)) {
                                oki.h.t2(dVar4, dVar4.f62589r, MultibancoExternalEnrollmentFlowContract$Step.Entry.f62579a, false, null, false, 12);
                            } else {
                                if (!(result2 instanceof o82.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(dVar4, dVar4.f62589r, new MultibancoExternalEnrollmentFlowContract$Step.Confirmation(((o82.e) result2).f222907a.getRevolutCardId(), true), false, null, false, 12);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            multibancoRegistrationFlow.H = block3;
            return multibancoRegistrationFlow;
        }
        MultibancoRegistrationTerms multibancoRegistrationTerms = ((MultibancoExternalEnrollmentFlowContract$Step.NoMultibancoCard) step).f62580a;
        dVar.f62587p.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_external_enrollment_no_multibanco_card_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_external_enrollment_no_multibanco_card_subtitle, null, null, 14), y72.a.a(), null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_external_enrollment_no_multibanco_card_action_activate, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), (ResourceImage) objArr, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, 65112));
        s31.a block4 = new s31.a(dVar, multibancoRegistrationTerms, 10);
        Intrinsics.checkNotNullParameter(block4, "block");
        promptMarketingScreen.H = block4;
        return promptMarketingScreen;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.b) this.f259727b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        ConstructorCreditPromptControllerContract$ModalStep step = (ConstructorCreditPromptControllerContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ConstructorCreditPromptControllerContract$ModalStep.Info) {
            return bVar.e1(new s(new t(((ConstructorCreditPromptControllerContract$ModalStep.Info) step).f67341a)));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object e(Object obj2, Object obj3) {
        s76.b bVar = (s76.b) this.f259727b;
        DerivativesBalance balance = (DerivativesBalance) obj3;
        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
        Intrinsics.checkNotNullParameter(balance, "balance");
        bVar.f260524b.f("DERIVATIVES_BALANCES_CACHE_KEY", balance);
        return Unit.f186387a;
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.feature.picker.a aVar = (com.revolut.feature.picker.a) this.f259727b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        PickerControllerContract$ModalStep step = (PickerControllerContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof PickerControllerContract$ModalStep.ShowPostSelectionModal)) {
            throw new NoWhenBranchMatchedException();
        }
        i0 i0VarB = aVar.o.b(((PickerControllerContract$ModalStep.ShowPostSelectionModal) step).f80347a);
        if (i0VarB == null) {
            throw new IllegalStateException("Unhandled modal config type in ModalStep.ShowModal");
        }
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(i0VarB.f260609a);
        s06.e block = new s06.e(aVar, 4, i0VarB, step);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }

    private final Object h(Object obj2, Object obj3) {
        ContactsFilter.Not notA;
        ContactsFilter contactsFilterA;
        ln3.b bVar;
        TextLocalisedClause textLocalisedClause;
        char c2;
        char c3;
        int i;
        int i2;
        Clause textLocalisedClause2;
        com.revolut.feature.subaccount.impl.ui.create.flow.group.c cVar = (com.revolut.feature.subaccount.impl.ui.create.flow.group.c) this.f259727b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        ContactsPickerFlowContract$Step step = (ContactsPickerFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ContactsPickerFlowContract$Step.Permissions) {
            UserPermissionSelectorScreen userPermissionSelectorScreen = new UserPermissionSelectorScreen(new UserPermissionSelectorScreenContract$InputData(((ContactsPickerFlowContract$Step.Permissions) step).f89007a));
            com.revolut.feature.subaccount.impl.ui.create.flow.group.a aVar = new com.revolut.feature.subaccount.impl.ui.create.flow.group.a(1, 0, com.revolut.feature.subaccount.impl.ui.create.flow.group.c.class, cVar, "handlePermissionSelectorResult", "handlePermissionSelectorResult(Lcom/revolut/feature/subaccount/impl/ui/create/screen/permission/UserPermissionSelectorScreenContract$OutputData;)V");
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            userPermissionSelectorScreen.H = aVar;
            return userPermissionSelectorScreen;
        }
        if (!(step instanceof ContactsPickerFlowContract$Step.Contacts)) {
            throw new NoWhenBranchMatchedException();
        }
        ln3.b bVar2 = cVar.f89010p;
        ContactsPickerFlowContract$Step.Contacts contacts = (ContactsPickerFlowContract$Step.Contacts) step;
        wi0.b bVar3 = contacts.f89004a;
        NaviCommand naviCommand = contacts.f89006c;
        ContactsPickerFlowContract$InputData contactsPickerFlowContract$InputData = cVar.o;
        if (contactsPickerFlowContract$InputData.f89003a.isEmpty()) {
            notA = null;
        } else {
            List list = contactsPickerFlowContract$InputData.f89003a;
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                String str = ((x) it8.next()).f234907h;
                ContactsFilter.Code code = str != null ? new ContactsFilter.Code(str) : null;
                if (code != null) {
                    arrayList.add(code);
                }
            }
            ContactsFilter.Companion companion = ContactsFilter.INSTANCE;
            ContactsFilter.Code[] codeArr = (ContactsFilter.Code[]) arrayList.toArray(new ContactsFilter.Code[0]);
            ContactsFilter[] contactsFilterArr = (ContactsFilter[]) Arrays.copyOf(codeArr, codeArr.length);
            companion.getClass();
            notA = ContactsFilter.Companion.a(contactsFilterArr);
        }
        Set set = com.revolut.feature.subaccount.impl.ui.create.flow.group.c.u;
        if (set.contains(bVar3)) {
            contactsFilterA = new ContactsFilter.Country(bVar3);
        } else {
            Set set2 = set;
            ArrayList arrayList2 = new ArrayList(w.t(set2, 10));
            Iterator it9 = set2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(new ContactsFilter.Country((wi0.b) it9.next()));
            }
            ContactsFilter.Companion companion2 = ContactsFilter.INSTANCE;
            ContactsFilter.Country[] countryArr = (ContactsFilter.Country[]) arrayList2.toArray(new ContactsFilter.Country[0]);
            ContactsFilter[] contactsFilterArr2 = (ContactsFilter[]) Arrays.copyOf(countryArr, countryArr.length);
            companion2.getClass();
            contactsFilterA = ContactsFilter.Companion.a(contactsFilterArr2);
        }
        if (notA != null) {
            Intrinsics.checkNotNullParameter(notA, "<this>");
            ContactsFilter[] filters = {notA, contactsFilterA};
            ContactsFilter.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(filters, "filters");
            contactsFilterA = new ContactsFilter.And(v.k(Arrays.copyOf(filters, 2)));
        }
        ContactsFilter contactsFilter = contactsFilterA;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.vaults_creation_contacts_picker_title, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.vaults_creation_contacts_picker_search_hint, null, null, 14);
        if (naviCommand != null) {
            c2 = 1;
            i = 0;
            bVar = bVar2;
            textLocalisedClause = textLocalisedClause3;
            c3 = 2;
            textLocalisedClause2 = new CompositeClause(v.k(new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.vaults_creation_contacts_picker_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.vaults.R$string.group_pockets_invitation_screen_privacy_policy_footer_privacy_disclaimer, u.c(new TextLocalisedClause(com.revolut.feature.vaults.R$string.group_pockets_invitation_screen_privacy_policy_footer_privacy_disclaimer_action, null, new Click(28, (Integer) null, (Object) naviCommand, "privacy_policy", false), 10)), null, 12)), com.revolut.core.ui_kit.models.b.a(), null, null, 12);
            i2 = 14;
        } else {
            bVar = bVar2;
            textLocalisedClause = textLocalisedClause3;
            c2 = 1;
            c3 = 2;
            i = 0;
            i2 = 14;
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.vaults_creation_contacts_picker_description, null, null, 14);
        }
        int i3 = i;
        ContactType.RevolutContact.Remote remote = new ContactType.RevolutContact.Remote(i3);
        ContactType[] contactTypeArr = new ContactType[3];
        contactTypeArr[i3] = ContactType.RevolutContact.Local.f66038a;
        contactTypeArr[c2] = remote;
        contactTypeArr[c3] = ContactType.UsernameContact.f66040a;
        List listK = v.k(contactTypeArr);
        ContactsChooserMode.MultiSelect multiSelect = new ContactsChooserMode.MultiSelect(null);
        k9 value = k9.Vaults;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        ContactsChooserInputData contactsChooserInputData = new ContactsChooserInputData((Clause) textLocalisedClause, (Clause) textLocalisedClause4, listK, (List) null, (ContactsChooserMode) multiSelect, false, false, false, true, contactsFilter, (ContactsChooserBannerContent) null, (ContactsChooserEmptyState) null, (AnalyticsProduct) new AnalyticsProduct.Retail(value), textLocalisedClause2, (Set) null, (ContactsPrimaryButtonClause) new ContactsPrimaryButtonClause.Plural(R$plurals.vaults_invite_contact_cta_button_title), (cn3.h) null, 0, (Set) null, 969928);
        bVar.getClass();
        ContactsChooserScreen contactsChooserScreenA = ln3.b.a(contactsChooserInputData);
        s31.a block = new s31.a(cVar, step, i2);
        Intrinsics.checkNotNullParameter(block, "block");
        contactsChooserScreenA.H = block;
        return contactsChooserScreenA;
    }

    private final Object i(Object obj2, Object obj3) {
        EnrollmentRegistrationScreen enrollmentRegistrationScreen = (EnrollmentRegistrationScreen) this.f259727b;
        InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
        InputText field = (InputText) obj3;
        KProperty[] kPropertyArr = EnrollmentRegistrationScreen.S;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(field, "field");
        return new y(field.getInnerEditText(), null, "[00000000000]", new o(enrollmentRegistrationScreen, 21), model.f52580a, null, model.e == rx0.j.Inline, 34);
    }

    private final Object j(Object obj2, Object obj3) {
        sa6.b bVar = (sa6.b) this.f259727b;
        Data collectionsData = (Data) obj2;
        Data charitiesData = (Data) obj3;
        Intrinsics.checkNotNullParameter(collectionsData, "collectionsData");
        Intrinsics.checkNotNullParameter(charitiesData, "charitiesData");
        List list = (List) charitiesData.getContent();
        if (list == null) {
            return new Data(null, charitiesData.getError(), charitiesData.getLoading(), 1, null);
        }
        List list2 = (List) collectionsData.getContent();
        if (list2 == null) {
            return new Data(null, collectionsData.getError(), collectionsData.getLoading(), 1, null);
        }
        List list3 = list;
        int iB = q0.b(w.t(list3, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj4 : list3) {
            linkedHashMap.put(((ba6.l) obj4).f13938a, obj4);
        }
        List<za6.b> list4 = list2;
        ArrayList arrayList = new ArrayList(w.t(list4, 10));
        for (za6.b bVar2 : list4) {
            List list5 = bVar2.e;
            bVar.getClass();
            ArrayList charities = sa6.b.a(linkedHashMap, list5);
            Intrinsics.checkNotNullParameter(bVar2, "<this>");
            Intrinsics.checkNotNullParameter(charities, "charities");
            arrayList.add(new ba6.f(bVar2.f320569a, bVar2.f320570b, bVar2.f320571c, bVar2.d, charities, bVar2.f));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : arrayList) {
            if (!((ba6.f) obj5).e.isEmpty()) {
                arrayList2.add(obj5);
            }
        }
        return new Data(arrayList2, null, false, 6, null);
    }

    private final Object k(Object obj2, Object obj3) {
        i iVar = (i) this.f259727b;
        CharityTransactionsParams params = (CharityTransactionsParams) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        return iVar.f261323a.a(params).map(new sa6.a(new sa6.f(params, 2), 3));
    }

    private final Object l(Object obj2, Object obj3) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        com.revolut.feature.subscriptions.impl.payment_balance_picker.b bVar = (com.revolut.feature.subscriptions.impl.payment_balance_picker.b) this.f259727b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        PaymentBalancePickerScreenContract$Step step = (PaymentBalancePickerScreenContract$Step) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof PaymentBalancePickerScreenContract$Step.ConfirmationForAccount)) {
            throw new NoWhenBranchMatchedException();
        }
        com.revolut.feature.subscriptions.impl.payment_balance_picker.a aVar = bVar.f89229p;
        PaymentBalancePickerScreenContract$SelectedBalanceInfo balanceInfo = ((PaymentBalancePickerScreenContract$Step.ConfirmationForAccount) step).f89228a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(balanceInfo, "balanceInfo");
        boolean z = balanceInfo instanceof PaymentBalancePickerScreenContract$SelectedBalanceInfo.Balance;
        if (z) {
            PaymentBalancePickerScreenContract$SelectedBalanceInfo.Balance balance = (PaymentBalancePickerScreenContract$SelectedBalanceInfo.Balance) balanceInfo;
            String str = balance.f89225b;
            textLocalisedClause = balance.f89226c ? new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.direct_debit_payment_method_pocket_confirm_title, u.c(str), null, 12) : new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.direct_debit_payment_method_currency_confirm_title, u.c(str), null, 12);
        } else {
            if (!(balanceInfo instanceof PaymentBalancePickerScreenContract$SelectedBalanceInfo.AllCashAccounts) && !(balanceInfo instanceof PaymentBalancePickerScreenContract$SelectedBalanceInfo.Undefined)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.direct_debit_payment_method_all_accounts_cash_confirm_title, null, null, 14);
        }
        if (z) {
            PaymentBalancePickerScreenContract$SelectedBalanceInfo.Balance balance2 = (PaymentBalancePickerScreenContract$SelectedBalanceInfo.Balance) balanceInfo;
            String str2 = balance2.d;
            textLocalisedClause2 = balance2.f89226c ? new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.direct_debit_payment_method_pocket_confirm_text, u.c(str2), null, 12) : new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.direct_debit_payment_method_pocket_confirm_description, u.c(str2), null, 12);
        } else {
            if (!(balanceInfo instanceof PaymentBalancePickerScreenContract$SelectedBalanceInfo.AllCashAccounts) && !(balanceInfo instanceof PaymentBalancePickerScreenContract$SelectedBalanceInfo.Undefined)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_payment_balance_picker_confirmation_any_cash_account_text, u.c(new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_payment_balance_picker_confirmation_any_cash_account_text_link, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "ANY_CASH_ACCOUNT_LINK_ID", false), 10)), null, 12);
        }
        lw0.a aVar2 = new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.card_payment_method_spend_from_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Subscriptions;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        s31.a block = new s31.a(bVar, step, 19);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }

    private final Object m(Object obj2, Object obj3) {
        sae.i iVar = (sae.i) this.f259727b;
        Function1 getDefaultErrorItems = (Function1) obj3;
        Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
        return new k((List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)), vae.c.a(iVar), null);
    }

    private final Object n(Object obj2, Object obj3) {
        com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e eVar = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e) this.f259727b;
        FinancialEvidenceFlowContract$InputData financialEvidenceFlowContract$InputData = eVar.f67731q;
        yki.l FlowCoordinator = (yki.l) obj2;
        FinancialEvidenceFlowContract$Step step = (FinancialEvidenceFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof FinancialEvidenceFlowContract$Step.Initial) {
            return com.revolut.feature.credit.application.plugins.impl.ui.loading.a.a();
        }
        if (step instanceof FinancialEvidenceFlowContract$Step.EvidenceHolderSelection) {
            EvidenceHolderSelectionScreen evidenceHolderSelectionScreen = new EvidenceHolderSelectionScreen(new EvidenceHolderSelectionScreenContract$InputData(((FinancialEvidenceFlowContract$Step.EvidenceHolderSelection) step).f67716a));
            sb4.d block = new sb4.d(eVar, FlowCoordinator);
            Intrinsics.checkNotNullParameter(block, "block");
            evidenceHolderSelectionScreen.H = block;
            return evidenceHolderSelectionScreen;
        }
        if (step instanceof FinancialEvidenceFlowContract$Step.AddEvidence) {
            return new AddEvidenceFlow(new AddEvidenceFlowContract$InputData(((FinancialEvidenceFlowContract$Step.AddEvidence) step).f67714a, financialEvidenceFlowContract$InputData.f67712a));
        }
        if (step instanceof FinancialEvidenceFlowContract$Step.Summary) {
            FinancialEvidenceFlowContract$Step.Summary summary = (FinancialEvidenceFlowContract$Step.Summary) step;
            SummaryScreen summaryScreen = new SummaryScreen(new SummaryScreenContract$InputData(summary.f67720a, summary.f67721b));
            s06.e block2 = new s06.e(eVar, 7, FlowCoordinator, step);
            Intrinsics.checkNotNullParameter(block2, "block");
            summaryScreen.H = block2;
            return summaryScreen;
        }
        if (step instanceof FinancialEvidenceFlowContract$Step.CoApplicantConfirmation) {
            CreditPromptFlow creditPromptFlow = new CreditPromptFlow(new CreditPromptFlowContract$InputData(zv3.a.BACK, ((FinancialEvidenceFlowContract$Step.CoApplicantConfirmation) step).f67715a, new CreditPromptAnalyticsConfiguration(com.revolut.feature.credit.core.R$string.financial_evidence_co_applicant_confirmation_title, 0, com.revolut.feature.credit.core.R$string.financial_evidence_co_applicant_confirmation_action, 0, 10), financialEvidenceFlowContract$InputData.f67712a));
            sb4.d block3 = new sb4.d(FlowCoordinator, eVar);
            Intrinsics.checkNotNullParameter(block3, "block");
            creditPromptFlow.H = block3;
            return creditPromptFlow;
        }
        if (!(step instanceof FinancialEvidenceFlowContract$Step.JointApplicantsConfirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        CreditPromptFlow creditPromptFlow2 = new CreditPromptFlow(new CreditPromptFlowContract$InputData(zv3.a.CLOSE, ((FinancialEvidenceFlowContract$Step.JointApplicantsConfirmation) step).f67719b, new CreditPromptAnalyticsConfiguration(com.revolut.feature.credit.core.R$string.financial_evidence_joint_applicants_confirmation_title, 0, com.revolut.feature.credit.core.R$string.financial_evidence_joint_applicants_confirmation_action, 0, 10), financialEvidenceFlowContract$InputData.f67712a));
        s31.a block4 = new s31.a(eVar, step, 21);
        Intrinsics.checkNotNullParameter(block4, "block");
        creditPromptFlow2.H = block4;
        return creditPromptFlow2;
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlin.Lazy] */
    private final Object o(Object obj2, Object obj3) {
        PixQrCodeChangeAmountScreen pixQrCodeChangeAmountScreen = (PixQrCodeChangeAmountScreen) this.f259727b;
        CenteredAmountView field = (CenteredAmountView) obj3;
        KProperty[] kPropertyArr = PixQrCodeChangeAmountScreen.T;
        Intrinsics.checkNotNullParameter((CenteredAmountDelegate.Model) obj2, "<unused var>");
        Intrinsics.checkNotNullParameter(field, "field");
        MaskedTextInputEditText editText = field.getEditText();
        xi0.b.Companion.getClass();
        return new zp0.d(editText, xi0.b.D, (u80.d) pixQrCodeChangeAmountScreen.M.getValue(), null, null, false, false, 0, false, null, 1944);
    }

    private final Object p(Object obj2, Object obj3) {
        com.revolut.feature_retail_user_declarations.occupation.flow.a aVar = (com.revolut.feature_retail_user_declarations.occupation.flow.a) this.f259727b;
        yki.l FlowCoordinator = (yki.l) obj2;
        OccupationChooserFlowContract$Step step = (OccupationChooserFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, OccupationChooserFlowContract$Step.ChooseOccupation.f97700a)) {
            throw new NoWhenBranchMatchedException();
        }
        OccupationChooserFlowInputData occupationChooserFlowInputData = aVar.o;
        OccupationChooserScreen occupationChooserScreen = new OccupationChooserScreen(new OccupationChooserScreenContract$InputData(occupationChooserFlowInputData.f97697a, occupationChooserFlowInputData.f97698b, occupationChooserFlowInputData.f97699c, occupationChooserFlowInputData.d, occupationChooserFlowInputData.e));
        s78.d block = new s78.d(aVar, 23);
        Intrinsics.checkNotNullParameter(block, "block");
        occupationChooserScreen.H = block;
        return occupationChooserScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object q(Object obj2, Object obj3) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        com.revolut.feature.apm.qvik.impl.ui.new_recipient.a aVar = (com.revolut.feature.apm.qvik.impl.ui.new_recipient.a) this.f259727b;
        yki.l FlowCoordinator = (yki.l) obj2;
        QvikNewRecipientFlowContract$Step step = (QvikNewRecipientFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, QvikNewRecipientFlowContract$Step.Dialog.f62811a)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = sc2.f.f261625b[aVar.o.f261621a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.qvik.api.R$string.qvik_send_new_contact_dialog_title, null, null, 14);
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.qvik.api.R$string.qvik_send_new_contact_dialog_option_bank_account, null, null, 14);
            textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.qvik.api.R$string.qvik_send_new_contact_dialog_option_secondary_id, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.qvik.api.R$string.qvik_request_new_contact_dialog_title, null, null, 14);
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.qvik.api.R$string.qvik_request_new_contact_dialog_option_bank_account, null, null, 14);
            textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.qvik.api.R$string.qvik_request_new_contact_dialog_option_secondary_id, null, null, 14);
        }
        lw0.a aVar2 = new lw0.a(textLocalisedClause, null, null, null, false, 30);
        boolean z = false;
        Clause clause = null;
        boolean z3 = true;
        TextLocalisedClause textLocalisedClause4 = textLocalisedClause2;
        Object[] objArr = 0 == true ? 1 : 0;
        boolean z4 = false;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Clause clause2 = null;
        boolean z6 = true;
        TextLocalisedClause textLocalisedClause5 = textLocalisedClause3;
        Object[] objArr3 = 0 == true ? 1 : 0;
        List listK = v.k(new l((Clause) textLocalisedClause4, clause, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, z, null, false, 62), z3, z, (RowDelegate.Model.c) objArr, (Object) sc2.d.BENEFICIARY, 232), new l((Clause) textLocalisedClause5, clause2, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_add_contact, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, z4, objArr2, false, 62), z6, z4, (RowDelegate.Model.c) objArr3, (Object) sc2.d.CONTACT, 232));
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar2, null, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null));
        sc2.e block = new sc2.e(aVar, 0);
        Intrinsics.checkNotNullParameter(block, "block");
        rowActionsBottomSheetController.H = block;
        return rowActionsBottomSheetController;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    private final Object r(Object obj2, Object obj3) {
        ExpectedAmountController expectedAmountController = (ExpectedAmountController) this.f259727b;
        InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
        InputText field = (InputText) obj3;
        ExpectedAmountController.Companion aVar = ExpectedAmountController.INSTANCE;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(field, "field");
        Object obj4 = model.P;
        if (!(obj4 instanceof dj0.d)) {
            return null;
        }
        return new zp0.d(field.getInnerEditText(), ((dj0.d) obj4).f115083b, (u80.d) expectedAmountController.N.getValue(), null, null, false, false, 0, false, ExpectedAmountController.T, 888);
    }

    private final Object s(Object obj2, Object obj3) {
        com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.a aVar = (com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.a) this.f259727b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        ExpectedAmountControllerContract$ModalStep step = (ExpectedAmountControllerContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof ExpectedAmountControllerContract$ModalStep.TransactionFrequency)) {
            throw new NoWhenBranchMatchedException();
        }
        TransactionFrequencyController transactionFrequencyController = new TransactionFrequencyController(new vci.c(((sci.f) ((j2) aVar.f97768q.f22677a).getValue()).f261751b));
        s78.d block = new s78.d(aVar, 27);
        Intrinsics.checkNotNullParameter(block, "block");
        transactionFrequencyController.H = block;
        return transactionFrequencyController;
    }

    private final Object t(Object obj2, Object obj3) {
        scl.c cVar = (scl.c) this.f259727b;
        List instruments = (List) obj3;
        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        cVar.d.f("INSTRUMENTS", instruments);
        return Unit.f186387a;
    }

    private final Object u(Object obj2, Object obj3) {
        k18.c cVar = (k18.c) this.f259727b;
        scl.d params = (scl.d) obj2;
        List performanceParameters = (List) obj3;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(performanceParameters, "performanceParameters");
        ((ne0.d) cVar.d).f(yoj.b.z(params), performanceParameters);
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        BaseBottomSheetController feeBreakdownScreen;
        BaseBottomSheetController actionsBottomSheetController;
        ActionsBottomSheetController actionsBottomSheetController2;
        eii.c cVar;
        Pair pair;
        tf tfVar;
        int i = this.f259726a;
        final int i2 = 2;
        int i3 = 3;
        Object obj4 = this.f259727b;
        switch (i) {
            case 0:
                final com.revolut.feature.apm.core.ui.impl.ui.transfer.a aVar = (com.revolut.feature.apm.core.ui.impl.ui.transfer.a) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                ApmTransferFlowContract$Step step = (ApmTransferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof ApmTransferFlowContract$Step.Amount) {
                    TransferAmountScreen transferAmountScreen = new TransferAmountScreen(((ApmTransferFlowContract$Step.Amount) step).f62418a);
                    final int i5 = 0;
                    Function1 block = new Function1() { // from class: s42.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            CompositeCommand compositeCommandC;
                            NaviCommand naviCommandF;
                            switch (i5) {
                                case 0:
                                    com.revolut.feature.apm.core.ui.impl.ui.transfer.a aVar2 = aVar;
                                    ApmTransferContract$InputData apmTransferContract$InputData = aVar2.o;
                                    t42.f output = (t42.f) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof t42.d) {
                                        if (apmTransferContract$InputData.f62286l) {
                                            aVar2.C2(r0.f20348a);
                                        } else {
                                            oki.h.D2(aVar2.f62423s);
                                        }
                                    } else {
                                        if (!(output instanceof t42.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        t42.e eVar = (t42.e) output;
                                        oki.h.t2(aVar2, aVar2.f62423s, new ApmTransferFlowContract$Step.Review(new TransferReviewContract$InputData(apmTransferContract$InputData.d, apmTransferContract$InputData.f62280a, eVar.f267849a, eVar.f267850b, apmTransferContract$InputData.f62282c, apmTransferContract$InputData.k, apmTransferContract$InputData.f62287m)), false, TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.apm.core.ui.impl.ui.transfer.a aVar3 = aVar;
                                    ApmTransferContract$InputData apmTransferContract$InputData2 = aVar3.o;
                                    i52.g output2 = (i52.g) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof i52.d) {
                                        oki.h.t2(aVar3, aVar3.f62423s, new ApmTransferFlowContract$Step.Amount(new TransferAmountContract$InputData.WithTransferData(apmTransferContract$InputData2.f62280a, apmTransferContract$InputData2.f62281b, apmTransferContract$InputData2.k, apmTransferContract$InputData2.f62284h, apmTransferContract$InputData2.i, apmTransferContract$InputData2.f62288n, ((i52.d) output2).f158553a)), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    } else if (output2 instanceof i52.f) {
                                        i52.f fVar = (i52.f) output2;
                                        b3a.a aVar4 = aVar3.f62421q;
                                        g52.c cVar2 = fVar.f158557a;
                                        ApmTransferRecipient apmTransferRecipient = fVar.f158558b;
                                        if (cVar2 instanceof g52.b) {
                                            k71.c cVar3 = ((g52.b) cVar2).f140607a;
                                            if (apmTransferRecipient instanceof ApmTransferRecipient.Contact) {
                                                ApmContact apmContact = ((ApmTransferRecipient.Contact) apmTransferRecipient).f62299a;
                                                if (apmContact.getF62134a() instanceof ApmIdentifier.Uuid) {
                                                    naviCommandF = ((v3a.b) aVar4).b(new ChatTransferRecipient.ApmTransferRecipient(apmContact));
                                                } else {
                                                    naviCommandF = gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, u0.f(new TransactionDetailsDestination(cVar3, (rhf.d) null, 6)), 2)));
                                                }
                                            } else {
                                                if (!(apmTransferRecipient instanceof ApmTransferRecipient.OpenRequest)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                naviCommandF = gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, u0.f(new TransactionDetailsDestination(cVar3, (rhf.d) null, 6)), 2)));
                                            }
                                            aVar3.C1(new BridgeDestination(r6.b.g(null, null, null, 7, naviCommandF)));
                                        } else {
                                            if (!(cVar2 instanceof g52.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            g52.a aVar5 = (g52.a) cVar2;
                                            if (apmTransferRecipient instanceof ApmTransferRecipient.Contact) {
                                                compositeCommandC = ((v3a.b) aVar4).b(new ChatTransferRecipient.ApmTransferRecipient(((ApmTransferRecipient.Contact) apmTransferRecipient).f62299a));
                                            } else {
                                                if (!(apmTransferRecipient instanceof ApmTransferRecipient.OpenRequest)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                String moneyRequestId = aVar5.f140606a;
                                                v3a.b bVar = (v3a.b) aVar4;
                                                bVar.getClass();
                                                Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
                                                compositeCommandC = com.revolut.retail.core.navigation.a.c(b3a.a.a(bVar), new FeatureCommand(new MoneyRequestFeatureConfig$Details$ById(moneyRequestId, null, null)));
                                            }
                                            aVar3.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), compositeCommandC)));
                                        }
                                        if (apmTransferContract$InputData2.f62286l) {
                                            aVar3.C2(t0.f20352a);
                                        }
                                    } else {
                                        if (!(output2 instanceof i52.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (apmTransferContract$InputData2.f62286l) {
                                            aVar3.C2(s0.f20350a);
                                        } else {
                                            oki.h.D2(aVar3.f62423s);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    transferAmountScreen.H = block;
                    return transferAmountScreen;
                }
                if (!(step instanceof ApmTransferFlowContract$Step.Review)) {
                    throw new NoWhenBranchMatchedException();
                }
                TransferReviewScreen transferReviewScreen = new TransferReviewScreen(((ApmTransferFlowContract$Step.Review) step).f62419a);
                final int i6 = 1;
                Function1 block2 = new Function1() { // from class: s42.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        CompositeCommand compositeCommandC;
                        NaviCommand naviCommandF;
                        switch (i6) {
                            case 0:
                                com.revolut.feature.apm.core.ui.impl.ui.transfer.a aVar2 = aVar;
                                ApmTransferContract$InputData apmTransferContract$InputData = aVar2.o;
                                t42.f output = (t42.f) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output instanceof t42.d) {
                                    if (apmTransferContract$InputData.f62286l) {
                                        aVar2.C2(r0.f20348a);
                                    } else {
                                        oki.h.D2(aVar2.f62423s);
                                    }
                                } else {
                                    if (!(output instanceof t42.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    t42.e eVar = (t42.e) output;
                                    oki.h.t2(aVar2, aVar2.f62423s, new ApmTransferFlowContract$Step.Review(new TransferReviewContract$InputData(apmTransferContract$InputData.d, apmTransferContract$InputData.f62280a, eVar.f267849a, eVar.f267850b, apmTransferContract$InputData.f62282c, apmTransferContract$InputData.k, apmTransferContract$InputData.f62287m)), false, TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                                }
                                return Unit.f186387a;
                            default:
                                com.revolut.feature.apm.core.ui.impl.ui.transfer.a aVar3 = aVar;
                                ApmTransferContract$InputData apmTransferContract$InputData2 = aVar3.o;
                                i52.g output2 = (i52.g) obj5;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (output2 instanceof i52.d) {
                                    oki.h.t2(aVar3, aVar3.f62423s, new ApmTransferFlowContract$Step.Amount(new TransferAmountContract$InputData.WithTransferData(apmTransferContract$InputData2.f62280a, apmTransferContract$InputData2.f62281b, apmTransferContract$InputData2.k, apmTransferContract$InputData2.f62284h, apmTransferContract$InputData2.i, apmTransferContract$InputData2.f62288n, ((i52.d) output2).f158553a)), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                } else if (output2 instanceof i52.f) {
                                    i52.f fVar = (i52.f) output2;
                                    b3a.a aVar4 = aVar3.f62421q;
                                    g52.c cVar2 = fVar.f158557a;
                                    ApmTransferRecipient apmTransferRecipient = fVar.f158558b;
                                    if (cVar2 instanceof g52.b) {
                                        k71.c cVar3 = ((g52.b) cVar2).f140607a;
                                        if (apmTransferRecipient instanceof ApmTransferRecipient.Contact) {
                                            ApmContact apmContact = ((ApmTransferRecipient.Contact) apmTransferRecipient).f62299a;
                                            if (apmContact.getF62134a() instanceof ApmIdentifier.Uuid) {
                                                naviCommandF = ((v3a.b) aVar4).b(new ChatTransferRecipient.ApmTransferRecipient(apmContact));
                                            } else {
                                                naviCommandF = gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, u0.f(new TransactionDetailsDestination(cVar3, (rhf.d) null, 6)), 2)));
                                            }
                                        } else {
                                            if (!(apmTransferRecipient instanceof ApmTransferRecipient.OpenRequest)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            naviCommandF = gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, u0.f(new TransactionDetailsDestination(cVar3, (rhf.d) null, 6)), 2)));
                                        }
                                        aVar3.C1(new BridgeDestination(r6.b.g(null, null, null, 7, naviCommandF)));
                                    } else {
                                        if (!(cVar2 instanceof g52.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        g52.a aVar5 = (g52.a) cVar2;
                                        if (apmTransferRecipient instanceof ApmTransferRecipient.Contact) {
                                            compositeCommandC = ((v3a.b) aVar4).b(new ChatTransferRecipient.ApmTransferRecipient(((ApmTransferRecipient.Contact) apmTransferRecipient).f62299a));
                                        } else {
                                            if (!(apmTransferRecipient instanceof ApmTransferRecipient.OpenRequest)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            String moneyRequestId = aVar5.f140606a;
                                            v3a.b bVar = (v3a.b) aVar4;
                                            bVar.getClass();
                                            Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
                                            compositeCommandC = com.revolut.retail.core.navigation.a.c(b3a.a.a(bVar), new FeatureCommand(new MoneyRequestFeatureConfig$Details$ById(moneyRequestId, null, null)));
                                        }
                                        aVar3.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), compositeCommandC)));
                                    }
                                    if (apmTransferContract$InputData2.f62286l) {
                                        aVar3.C2(t0.f20352a);
                                    }
                                } else {
                                    if (!(output2 instanceof i52.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (apmTransferContract$InputData2.f62286l) {
                                        aVar3.C2(s0.f20350a);
                                    } else {
                                        oki.h.D2(aVar3.f62423s);
                                    }
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block2, "block");
                transferReviewScreen.H = block2;
                return transferReviewScreen;
            case 1:
                s44.g gVar = (s44.g) obj4;
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new s44.m(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_v2_title, u.c(gVar.f259754a), null, 12), q.a(gVar.f259755b), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_continue, null, null, 14), (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), false);
            case 2:
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a aVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TaxHubTransactionExportReviewScreenContract$ModalStep step2 = (TaxHubTransactionExportReviewScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!Intrinsics.f(step2, TaxHubTransactionExportReviewScreenContract$ModalStep.VatSummaryInfo.f74430a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.o.getClass();
                lw0.a aVar3 = new lw0.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_review_details_estimated_vat, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_summary_estimation_explainer_subtitle, null, null, 14), null, null, false, 28);
                k9 k9Var = k9.Freelancer;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar3, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 3:
                final s4i.h hVar = (s4i.h) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                BreakdownFlowContract$ModalStep step3 = (BreakdownFlowContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                s4i.a aVar4 = hVar.f259884p;
                AnalyticsProduct analyticsProduct = hVar.o.f97164b;
                Breakdown breakdown = step3.f97165a;
                if (breakdown instanceof Breakdown.Transaction) {
                    feeBreakdownScreen = new TransactionBreakdownScreen(new TransactionBreakdownScreenContract$InputData((Breakdown.Transaction) breakdown, analyticsProduct));
                    hVar.M2(feeBreakdownScreen, new s31.a(hVar, breakdown, 6));
                } else if ((breakdown instanceof Breakdown.FeeDynamic) || (breakdown instanceof Breakdown.FeeTransferQuoteDynamic) || (breakdown instanceof Breakdown.FeeStatic)) {
                    feeBreakdownScreen = new FeeBreakdownScreen(new FeeBreakdownScreenContract$InputData((Breakdown.Fee) breakdown, analyticsProduct));
                    hVar.M2(feeBreakdownScreen, new Function1() { // from class: s4i.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i2) {
                                case 0:
                                    dii.g output = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof dii.c) {
                                        Object obj6 = ((dii.c) output).f115066a.d;
                                        if (obj6 instanceof BreakdownFlowContract$Payloads$TermsLink) {
                                            TermsScope termsScope = ((BreakdownFlowContract$Payloads$TermsLink) obj6).f97170a;
                                            h hVar2 = hVar;
                                            hVar2.getClass();
                                            hVar2.I2(new r25.a(hVar2, termsScope, null, 24));
                                        } else {
                                            hx7.e.h(new IllegalArgumentException(a0.d.m(obj6, "Unknown parcel ")));
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    dii.g output2 = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof dii.c) {
                                        Object obj7 = ((dii.c) output2).f115066a.d;
                                        if (obj7 instanceof RateExplanationDialogMapper.LearnMoreFaq) {
                                            hVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((RateExplanationDialogMapper.LearnMoreFaq) obj7).f102137a, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                        } else {
                                            hx7.e.h(new IllegalArgumentException(a0.d.m(obj7, "Unknown parcel ")));
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    u4i.o it8 = (u4i.o) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    boolean z = it8 instanceof u4i.m;
                                    h hVar3 = hVar;
                                    if (z) {
                                        u4i.m mVar = (u4i.m) it8;
                                        hVar3.K2(new Breakdown.FeeDynamic(mVar.f277356a, null, mVar.f277358c, null, mVar.f277357b, true, true, false, false));
                                    } else if (it8 instanceof u4i.k) {
                                        hVar3.K2(new Breakdown.ChargeDescription(((u4i.k) it8).f277354a));
                                    } else if (it8 instanceof u4i.l) {
                                        hVar3.I2(new r25.a(hVar3, ((u4i.l) it8).f277355a, null, 23));
                                    } else {
                                        if (!(it8 instanceof u4i.n)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        hVar3.I2(new e(hVar3, ((u4i.n) it8).f277359a, null));
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    eii.k output3 = (eii.k) obj5;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (output3 instanceof eii.i) {
                                        Object obj8 = ((eii.i) output3).f126655a;
                                        if (obj8 instanceof BreakdownFlowContract$Payloads$TaxDescription) {
                                            hVar.K2(new Breakdown.ChargeDescription(((BreakdownFlowContract$Payloads$TaxDescription) obj8).f97169a));
                                        } else {
                                            hx7.e.h(new IllegalArgumentException(a0.d.m(obj8, "Unknown parcel ")));
                                        }
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    dii.g output4 = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (output4 instanceof dii.b) {
                                        Object obj9 = ((dii.b) output4).f115065a.d;
                                        if (obj9 instanceof BreakdownFlowContract$Payloads$ChargeDescriptionLink) {
                                            String str = ((BreakdownFlowContract$Payloads$ChargeDescriptionLink) obj9).f97166a;
                                            h hVar4 = hVar;
                                            hVar4.I2(new r25.a(hVar4, str, null, 23));
                                        } else {
                                            hx7.e.h(new IllegalArgumentException(a0.d.m(obj9, "Unknown parcel ")));
                                        }
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    a5i.k it9 = (a5i.k) obj5;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    h hVar5 = hVar;
                                    hVar5.getClass();
                                    if (it9 instanceof a5i.i) {
                                        a5i.i iVar = (a5i.i) it9;
                                        hVar5.K2(new Breakdown.DirtyPrice(iVar.f1420a, iVar.f1421b));
                                    } else {
                                        if (!(it9 instanceof a5i.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        a5i.j jVar = (a5i.j) it9;
                                        hVar5.K2(new Breakdown.Units(jVar.f1422a, jVar.f1423b));
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    eii.k output5 = (eii.k) obj5;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    if (output5 instanceof eii.i) {
                                        hVar.J2(((eii.i) output5).f126655a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    eii.k output6 = (eii.k) obj5;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    if (output6 instanceof eii.i) {
                                        hVar.J2(((eii.i) output6).f126655a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    });
                } else {
                    if (breakdown instanceof Breakdown.Tax) {
                        Breakdown.Tax breakdown2 = (Breakdown.Tax) breakdown;
                        aVar4.getClass();
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                        ChargeBreakdown chargeBreakdown = breakdown2.f97049a;
                        List list = chargeBreakdown.f104723b;
                        Amount amount = chargeBreakdown.f104722a;
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        int i21 = 0;
                        for (Object obj5 : list2) {
                            int i22 = i21 + 1;
                            if (i21 < 0) {
                                v.s();
                                throw null;
                            }
                            ChargeEntry chargeEntry = (ChargeEntry) obj5;
                            String strN = a0.d.n("TAX_BREAKDOWN_ITEM_", i21);
                            String str = chargeEntry.f104726b;
                            Amount amount2 = chargeEntry.e;
                            arrayList.add(new eii.b(new CellDetailsDelegate.Model(strN, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new AssetClause(amount2.f104717a, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), amount2.f104718b.f104720b, null, o9.SENSITIVE, 8), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, new BreakdownFlowContract$Payloads$TaxDescription(chargeEntry), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008)));
                            i21 = i22;
                        }
                        actionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(new lw0.a(new TextLocalisedClause(com.revolut.feature_market_data.impl.R$string.market_data_taxes_breakdown_title, null, null, 14), null, null, null, false, 30), null, d0.E0(v.l(arrayList.size() > 1 ? new eii.b(new CellDetailsDelegate.Model("TAX_BREAKDOWN_TOTAL_ID", new TextLocalisedClause(com.revolut.feature_market_data.impl.R$string.market_data_transfer_breakdown_total, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new AssetClause(amount.f104717a, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), amount.f104718b.f104720b, null, o9.SENSITIVE, 8), 0, null, null, null, null, null, false, 0, 0, 32760)) : null), arrayList), analyticsProduct, null));
                        final int i32 = 3;
                        hVar.M2(actionsBottomSheetController, new Function1() { // from class: s4i.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                switch (i32) {
                                    case 0:
                                        dii.g output = (dii.g) obj52;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        if (output instanceof dii.c) {
                                            Object obj6 = ((dii.c) output).f115066a.d;
                                            if (obj6 instanceof BreakdownFlowContract$Payloads$TermsLink) {
                                                TermsScope termsScope = ((BreakdownFlowContract$Payloads$TermsLink) obj6).f97170a;
                                                h hVar2 = hVar;
                                                hVar2.getClass();
                                                hVar2.I2(new r25.a(hVar2, termsScope, null, 24));
                                            } else {
                                                hx7.e.h(new IllegalArgumentException(a0.d.m(obj6, "Unknown parcel ")));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        dii.g output2 = (dii.g) obj52;
                                        Intrinsics.checkNotNullParameter(output2, "output");
                                        if (output2 instanceof dii.c) {
                                            Object obj7 = ((dii.c) output2).f115066a.d;
                                            if (obj7 instanceof RateExplanationDialogMapper.LearnMoreFaq) {
                                                hVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((RateExplanationDialogMapper.LearnMoreFaq) obj7).f102137a, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                            } else {
                                                hx7.e.h(new IllegalArgumentException(a0.d.m(obj7, "Unknown parcel ")));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        u4i.o it8 = (u4i.o) obj52;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        boolean z = it8 instanceof u4i.m;
                                        h hVar3 = hVar;
                                        if (z) {
                                            u4i.m mVar = (u4i.m) it8;
                                            hVar3.K2(new Breakdown.FeeDynamic(mVar.f277356a, null, mVar.f277358c, null, mVar.f277357b, true, true, false, false));
                                        } else if (it8 instanceof u4i.k) {
                                            hVar3.K2(new Breakdown.ChargeDescription(((u4i.k) it8).f277354a));
                                        } else if (it8 instanceof u4i.l) {
                                            hVar3.I2(new r25.a(hVar3, ((u4i.l) it8).f277355a, null, 23));
                                        } else {
                                            if (!(it8 instanceof u4i.n)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            hVar3.I2(new e(hVar3, ((u4i.n) it8).f277359a, null));
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        eii.k output3 = (eii.k) obj52;
                                        Intrinsics.checkNotNullParameter(output3, "output");
                                        if (output3 instanceof eii.i) {
                                            Object obj8 = ((eii.i) output3).f126655a;
                                            if (obj8 instanceof BreakdownFlowContract$Payloads$TaxDescription) {
                                                hVar.K2(new Breakdown.ChargeDescription(((BreakdownFlowContract$Payloads$TaxDescription) obj8).f97169a));
                                            } else {
                                                hx7.e.h(new IllegalArgumentException(a0.d.m(obj8, "Unknown parcel ")));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 4:
                                        dii.g output4 = (dii.g) obj52;
                                        Intrinsics.checkNotNullParameter(output4, "output");
                                        if (output4 instanceof dii.b) {
                                            Object obj9 = ((dii.b) output4).f115065a.d;
                                            if (obj9 instanceof BreakdownFlowContract$Payloads$ChargeDescriptionLink) {
                                                String str2 = ((BreakdownFlowContract$Payloads$ChargeDescriptionLink) obj9).f97166a;
                                                h hVar4 = hVar;
                                                hVar4.I2(new r25.a(hVar4, str2, null, 23));
                                            } else {
                                                hx7.e.h(new IllegalArgumentException(a0.d.m(obj9, "Unknown parcel ")));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 5:
                                        a5i.k it9 = (a5i.k) obj52;
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        h hVar5 = hVar;
                                        hVar5.getClass();
                                        if (it9 instanceof a5i.i) {
                                            a5i.i iVar = (a5i.i) it9;
                                            hVar5.K2(new Breakdown.DirtyPrice(iVar.f1420a, iVar.f1421b));
                                        } else {
                                            if (!(it9 instanceof a5i.j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            a5i.j jVar = (a5i.j) it9;
                                            hVar5.K2(new Breakdown.Units(jVar.f1422a, jVar.f1423b));
                                        }
                                        return Unit.f186387a;
                                    case 6:
                                        eii.k output5 = (eii.k) obj52;
                                        Intrinsics.checkNotNullParameter(output5, "output");
                                        if (output5 instanceof eii.i) {
                                            hVar.J2(((eii.i) output5).f126655a);
                                        }
                                        return Unit.f186387a;
                                    default:
                                        eii.k output6 = (eii.k) obj52;
                                        Intrinsics.checkNotNullParameter(output6, "output");
                                        if (output6 instanceof eii.i) {
                                            hVar.J2(((eii.i) output6).f126655a);
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        });
                    } else if (breakdown instanceof Breakdown.Interest) {
                        Breakdown.Interest breakdown3 = (Breakdown.Interest) breakdown;
                        aVar4.getClass();
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                        if (breakdown3 instanceof Breakdown.Interest.EstimatedInterest) {
                            lw0.a aVar5 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.review_transfer_dialog_estimated_interest_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.review_transfer_dialog_estimated_interest_subtitle, null, null, 14), null, null, false, 28);
                            aw0.e eVar = new aw0.e(false, null, null, s4i.a.b(), null, null, 55);
                            Breakdown.Interest.EstimatedInterest estimatedInterest = (Breakdown.Interest.EstimatedInterest) breakdown3;
                            eii.b bVar = new eii.b(new CellDetailsDelegate.Model("INTEREST_INSTALMENT_DIALOG_DISCLAIMER_ESTIMATED_INTEREST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.review_transfer_dialog_estimated_interest_title, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(estimatedInterest.f97043a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
                            aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.review_transfer_dialog_estimated_interest_item_current_rate, null, null, 14), (Image) null, 0, false, 30);
                            BigDecimal bigDecimalMultiply = BigDecimal.valueOf(estimatedInterest.f97044b).multiply(BigDecimal.valueOf(100L));
                            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                            cVar = new eii.c(aVar5, eVar, v.k(bVar, new eii.b(new CellDetailsDelegate.Model("INTEREST_INSTALMENT_DIALOG_DISCLAIMER_ID", t0Var, new PercentageClause(bigDecimalMultiply, (PercentageClause.Format) null, (Style) null, 6), null, null, null, null, 0, null, false, false, null, null, 32760))), analyticsProduct, null);
                        } else if (breakdown3 instanceof Breakdown.Interest.DailyEstimatedInterest) {
                            lw0.a aVar6 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.review_transfer_dialog_estimated_interest_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.review_transfer_dialog_estimated_interest_subtitle, null, null, 14), null, null, false, 28);
                            aw0.e eVar2 = new aw0.e(false, null, null, s4i.a.b(), null, null, 55);
                            Breakdown.Interest.DailyEstimatedInterest dailyEstimatedInterest = (Breakdown.Interest.DailyEstimatedInterest) breakdown3;
                            eii.b bVar2 = new eii.b(new CellDetailsDelegate.Model("INTEREST_INSTALMENT_DIALOG_DISCLAIMER_ESTIMATED_INTEREST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.review_transfer_dialog_estimated_interest_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_fees_breakdown_section_interest_applies_value, u.c(new MoneyClause(dailyEstimatedInterest.f97041a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
                            String str2 = dailyEstimatedInterest.f97042b;
                            eii.b[] elements = {bVar2, str2 != null ? new eii.b(new CellDetailsDelegate.Model("INTEREST_INSTALMENT_DIALOG_DISCLAIMER_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.review_transfer_dialog_estimated_interest_item_current_rate, null, null, 14), (Image) null, 0, false, 30), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760)) : null};
                            Intrinsics.checkNotNullParameter(elements, "elements");
                            cVar = new eii.c(aVar6, eVar2, kotlin.collections.d.L(elements), analyticsProduct, null);
                        } else {
                            if (!(breakdown3 instanceof Breakdown.Interest.InterestApplies)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Breakdown.Interest.InterestApplies interestApplies = (Breakdown.Interest.InterestApplies) breakdown3;
                            wi0.b bVar3 = interestApplies.d;
                            wi0.b.Companion.getClass();
                            if (Intrinsics.f(bVar3, wi0.b.p0)) {
                                cVar = new eii.c(new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_interest_dialog_credit_limit_transfer_interest_title, null, null, 14), null, null, null, false, 30), new aw0.e(false, new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_interest_dialog_credit_limit_transfer_interest_description_without_rate, null, null, 14), null, s4i.a.b(), null, null, 53), f0.f322471a, analyticsProduct, null);
                            } else {
                                lw0.a aVar7 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_interest_dialog_interest_applies_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_interest_dialog_interest_applies_description, null, null, 14), null, null, false, 28);
                                aw0.e eVar3 = new aw0.e(false, new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_interest_dialog_common_disclaimer, null, null, 14), null, s4i.a.b(), null, null, 53);
                                String str3 = interestApplies.f97047c;
                                eii.b bVar4 = str3 != null ? new eii.b(new CellDetailsDelegate.Model("INTEREST_COMMON_DIALOG_ANNUAL_INTEREST_RATE_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_interest_dialog_common_annual_interest_rate_label, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_interest_dialog_common_annual_interest_rate_value, u.c(str3), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760)) : null;
                                String str4 = interestApplies.f97046b;
                                eii.b[] elements2 = {bVar4, str4 != null ? new eii.b(new CellDetailsDelegate.Model("INTEREST_COMMON_DIALOG_APR_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_interest_dialog_common_apr_label, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_interest_dialog_common_apr_value, u.c(str4), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760)) : null, new eii.b(new CellDetailsDelegate.Model("INTEREST_COMMON_DIALOG_DAILY_INTEREST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_interest_dialog_common_estimated_interest_label, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_interest_dialog_common_estimated_interest_value, u.c(new MoneyClause(interestApplies.f97045a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760))};
                                Intrinsics.checkNotNullParameter(elements2, "elements");
                                cVar = new eii.c(aVar7, eVar3, kotlin.collections.d.L(elements2), analyticsProduct, null);
                            }
                        }
                        actionsBottomSheetController = new RowActionsBottomSheetController(cVar);
                        hVar.M2(actionsBottomSheetController, new s4b.e(10));
                    } else if (breakdown instanceof Breakdown.ChargeDescription) {
                        Breakdown.ChargeDescription breakdown4 = (Breakdown.ChargeDescription) breakdown;
                        aVar4.getClass();
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                        ChargeEntry chargeEntry2 = breakdown4.f97020a;
                        ChargeEntryDetails chargeEntryDetails = chargeEntry2.d;
                        TextClause textClause = chargeEntryDetails != null ? new TextClause(chargeEntryDetails.f104729a, (Style) new Click(28, (Integer) null, (Object) new BreakdownFlowContract$Payloads$ChargeDescriptionLink(chargeEntryDetails.f104730b), "CHARGE_DESCRIPTION_CLICK_ID", false), (Integer) null, false, (o9) null, (List) null, 124) : null;
                        lw0.a aVar8 = new lw0.a(new TextClause(chargeEntry2.f104725a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30);
                        TextClause[] elements3 = {new TextClause(chargeEntry2.f104727c, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), textClause};
                        Intrinsics.checkNotNullParameter(elements3, "elements");
                        actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar8, new aw0.e(false, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements3)), null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature_market_data.impl.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 53), analyticsProduct, null, null, 24));
                        final int i33 = 4;
                        hVar.M2(actionsBottomSheetController, new Function1() { // from class: s4i.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                switch (i33) {
                                    case 0:
                                        dii.g output = (dii.g) obj52;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        if (output instanceof dii.c) {
                                            Object obj6 = ((dii.c) output).f115066a.d;
                                            if (obj6 instanceof BreakdownFlowContract$Payloads$TermsLink) {
                                                TermsScope termsScope = ((BreakdownFlowContract$Payloads$TermsLink) obj6).f97170a;
                                                h hVar2 = hVar;
                                                hVar2.getClass();
                                                hVar2.I2(new r25.a(hVar2, termsScope, null, 24));
                                            } else {
                                                hx7.e.h(new IllegalArgumentException(a0.d.m(obj6, "Unknown parcel ")));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        dii.g output2 = (dii.g) obj52;
                                        Intrinsics.checkNotNullParameter(output2, "output");
                                        if (output2 instanceof dii.c) {
                                            Object obj7 = ((dii.c) output2).f115066a.d;
                                            if (obj7 instanceof RateExplanationDialogMapper.LearnMoreFaq) {
                                                hVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((RateExplanationDialogMapper.LearnMoreFaq) obj7).f102137a, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                            } else {
                                                hx7.e.h(new IllegalArgumentException(a0.d.m(obj7, "Unknown parcel ")));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        u4i.o it8 = (u4i.o) obj52;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        boolean z = it8 instanceof u4i.m;
                                        h hVar3 = hVar;
                                        if (z) {
                                            u4i.m mVar = (u4i.m) it8;
                                            hVar3.K2(new Breakdown.FeeDynamic(mVar.f277356a, null, mVar.f277358c, null, mVar.f277357b, true, true, false, false));
                                        } else if (it8 instanceof u4i.k) {
                                            hVar3.K2(new Breakdown.ChargeDescription(((u4i.k) it8).f277354a));
                                        } else if (it8 instanceof u4i.l) {
                                            hVar3.I2(new r25.a(hVar3, ((u4i.l) it8).f277355a, null, 23));
                                        } else {
                                            if (!(it8 instanceof u4i.n)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            hVar3.I2(new e(hVar3, ((u4i.n) it8).f277359a, null));
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        eii.k output3 = (eii.k) obj52;
                                        Intrinsics.checkNotNullParameter(output3, "output");
                                        if (output3 instanceof eii.i) {
                                            Object obj8 = ((eii.i) output3).f126655a;
                                            if (obj8 instanceof BreakdownFlowContract$Payloads$TaxDescription) {
                                                hVar.K2(new Breakdown.ChargeDescription(((BreakdownFlowContract$Payloads$TaxDescription) obj8).f97169a));
                                            } else {
                                                hx7.e.h(new IllegalArgumentException(a0.d.m(obj8, "Unknown parcel ")));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 4:
                                        dii.g output4 = (dii.g) obj52;
                                        Intrinsics.checkNotNullParameter(output4, "output");
                                        if (output4 instanceof dii.b) {
                                            Object obj9 = ((dii.b) output4).f115065a.d;
                                            if (obj9 instanceof BreakdownFlowContract$Payloads$ChargeDescriptionLink) {
                                                String str22 = ((BreakdownFlowContract$Payloads$ChargeDescriptionLink) obj9).f97166a;
                                                h hVar4 = hVar;
                                                hVar4.I2(new r25.a(hVar4, str22, null, 23));
                                            } else {
                                                hx7.e.h(new IllegalArgumentException(a0.d.m(obj9, "Unknown parcel ")));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 5:
                                        a5i.k it9 = (a5i.k) obj52;
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        h hVar5 = hVar;
                                        hVar5.getClass();
                                        if (it9 instanceof a5i.i) {
                                            a5i.i iVar = (a5i.i) it9;
                                            hVar5.K2(new Breakdown.DirtyPrice(iVar.f1420a, iVar.f1421b));
                                        } else {
                                            if (!(it9 instanceof a5i.j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            a5i.j jVar = (a5i.j) it9;
                                            hVar5.K2(new Breakdown.Units(jVar.f1422a, jVar.f1423b));
                                        }
                                        return Unit.f186387a;
                                    case 6:
                                        eii.k output5 = (eii.k) obj52;
                                        Intrinsics.checkNotNullParameter(output5, "output");
                                        if (output5 instanceof eii.i) {
                                            hVar.J2(((eii.i) output5).f126655a);
                                        }
                                        return Unit.f186387a;
                                    default:
                                        eii.k output6 = (eii.k) obj52;
                                        Intrinsics.checkNotNullParameter(output6, "output");
                                        if (output6 instanceof eii.i) {
                                            hVar.J2(((eii.i) output6).f126655a);
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        });
                    } else if (breakdown instanceof Breakdown.TransactionPriceDescription) {
                        feeBreakdownScreen = new TransactionPriceDescriptionScreen(new TransactionPriceDescriptionScreenContract$InputData((Breakdown.TransactionPriceDescription) breakdown, analyticsProduct));
                        final int i43 = 5;
                        hVar.M2(feeBreakdownScreen, new Function1() { // from class: s4i.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                switch (i43) {
                                    case 0:
                                        dii.g output = (dii.g) obj52;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        if (output instanceof dii.c) {
                                            Object obj6 = ((dii.c) output).f115066a.d;
                                            if (obj6 instanceof BreakdownFlowContract$Payloads$TermsLink) {
                                                TermsScope termsScope = ((BreakdownFlowContract$Payloads$TermsLink) obj6).f97170a;
                                                h hVar2 = hVar;
                                                hVar2.getClass();
                                                hVar2.I2(new r25.a(hVar2, termsScope, null, 24));
                                            } else {
                                                hx7.e.h(new IllegalArgumentException(a0.d.m(obj6, "Unknown parcel ")));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        dii.g output2 = (dii.g) obj52;
                                        Intrinsics.checkNotNullParameter(output2, "output");
                                        if (output2 instanceof dii.c) {
                                            Object obj7 = ((dii.c) output2).f115066a.d;
                                            if (obj7 instanceof RateExplanationDialogMapper.LearnMoreFaq) {
                                                hVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((RateExplanationDialogMapper.LearnMoreFaq) obj7).f102137a, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                            } else {
                                                hx7.e.h(new IllegalArgumentException(a0.d.m(obj7, "Unknown parcel ")));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        u4i.o it8 = (u4i.o) obj52;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        boolean z = it8 instanceof u4i.m;
                                        h hVar3 = hVar;
                                        if (z) {
                                            u4i.m mVar = (u4i.m) it8;
                                            hVar3.K2(new Breakdown.FeeDynamic(mVar.f277356a, null, mVar.f277358c, null, mVar.f277357b, true, true, false, false));
                                        } else if (it8 instanceof u4i.k) {
                                            hVar3.K2(new Breakdown.ChargeDescription(((u4i.k) it8).f277354a));
                                        } else if (it8 instanceof u4i.l) {
                                            hVar3.I2(new r25.a(hVar3, ((u4i.l) it8).f277355a, null, 23));
                                        } else {
                                            if (!(it8 instanceof u4i.n)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            hVar3.I2(new e(hVar3, ((u4i.n) it8).f277359a, null));
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        eii.k output3 = (eii.k) obj52;
                                        Intrinsics.checkNotNullParameter(output3, "output");
                                        if (output3 instanceof eii.i) {
                                            Object obj8 = ((eii.i) output3).f126655a;
                                            if (obj8 instanceof BreakdownFlowContract$Payloads$TaxDescription) {
                                                hVar.K2(new Breakdown.ChargeDescription(((BreakdownFlowContract$Payloads$TaxDescription) obj8).f97169a));
                                            } else {
                                                hx7.e.h(new IllegalArgumentException(a0.d.m(obj8, "Unknown parcel ")));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 4:
                                        dii.g output4 = (dii.g) obj52;
                                        Intrinsics.checkNotNullParameter(output4, "output");
                                        if (output4 instanceof dii.b) {
                                            Object obj9 = ((dii.b) output4).f115065a.d;
                                            if (obj9 instanceof BreakdownFlowContract$Payloads$ChargeDescriptionLink) {
                                                String str22 = ((BreakdownFlowContract$Payloads$ChargeDescriptionLink) obj9).f97166a;
                                                h hVar4 = hVar;
                                                hVar4.I2(new r25.a(hVar4, str22, null, 23));
                                            } else {
                                                hx7.e.h(new IllegalArgumentException(a0.d.m(obj9, "Unknown parcel ")));
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 5:
                                        a5i.k it9 = (a5i.k) obj52;
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        h hVar5 = hVar;
                                        hVar5.getClass();
                                        if (it9 instanceof a5i.i) {
                                            a5i.i iVar = (a5i.i) it9;
                                            hVar5.K2(new Breakdown.DirtyPrice(iVar.f1420a, iVar.f1421b));
                                        } else {
                                            if (!(it9 instanceof a5i.j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            a5i.j jVar = (a5i.j) it9;
                                            hVar5.K2(new Breakdown.Units(jVar.f1422a, jVar.f1423b));
                                        }
                                        return Unit.f186387a;
                                    case 6:
                                        eii.k output5 = (eii.k) obj52;
                                        Intrinsics.checkNotNullParameter(output5, "output");
                                        if (output5 instanceof eii.i) {
                                            hVar.J2(((eii.i) output5).f126655a);
                                        }
                                        return Unit.f186387a;
                                    default:
                                        eii.k output6 = (eii.k) obj52;
                                        Intrinsics.checkNotNullParameter(output6, "output");
                                        if (output6 instanceof eii.i) {
                                            hVar.J2(((eii.i) output6).f126655a);
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        });
                    } else {
                        boolean z = breakdown instanceof Breakdown.DirtyPrice;
                        ScaleMode.TradingPrecise tradingPrecise = ScaleMode.TradingPrecise.f51443a;
                        if (z) {
                            Breakdown.DirtyPrice breakdown5 = (Breakdown.DirtyPrice) breakdown;
                            aVar4.getClass();
                            Intrinsics.checkNotNullParameter(breakdown5, "breakdown");
                            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                            lw0.a aVar9 = new lw0.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_dirty_price, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_dirty_price_description, null, null, 14), null, null, false, 28);
                            int i59 = com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_clean_price;
                            ej0.b bVar5 = breakdown5.f97022a;
                            eii.b bVarA = s4i.a.a("CLEAN_PRICE_CELL", i59, bVar5 != null ? new MoneyClause(mif.a.P(bVar5, 0, 3), new MoneyClause.Format.Defaults(null, tradingPrecise, false, false, 5), null, null, 12) : null, com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_clean_price_description);
                            int i66 = com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_accrued_interest;
                            ej0.b bVar6 = breakdown5.f97023b;
                            actionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar9, null, v.k(bVarA, s4i.a.a("ACCRUED_INTEREST_CELL", i66, bVar6 != null ? new MoneyClause(mif.a.R(bVar6), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_accrued_interest_description)), analyticsProduct, null));
                            final int i74 = 6;
                            hVar.M2(actionsBottomSheetController, new Function1() { // from class: s4i.d
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj52) {
                                    switch (i74) {
                                        case 0:
                                            dii.g output = (dii.g) obj52;
                                            Intrinsics.checkNotNullParameter(output, "output");
                                            if (output instanceof dii.c) {
                                                Object obj6 = ((dii.c) output).f115066a.d;
                                                if (obj6 instanceof BreakdownFlowContract$Payloads$TermsLink) {
                                                    TermsScope termsScope = ((BreakdownFlowContract$Payloads$TermsLink) obj6).f97170a;
                                                    h hVar2 = hVar;
                                                    hVar2.getClass();
                                                    hVar2.I2(new r25.a(hVar2, termsScope, null, 24));
                                                } else {
                                                    hx7.e.h(new IllegalArgumentException(a0.d.m(obj6, "Unknown parcel ")));
                                                }
                                            }
                                            return Unit.f186387a;
                                        case 1:
                                            dii.g output2 = (dii.g) obj52;
                                            Intrinsics.checkNotNullParameter(output2, "output");
                                            if (output2 instanceof dii.c) {
                                                Object obj7 = ((dii.c) output2).f115066a.d;
                                                if (obj7 instanceof RateExplanationDialogMapper.LearnMoreFaq) {
                                                    hVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((RateExplanationDialogMapper.LearnMoreFaq) obj7).f102137a, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                                } else {
                                                    hx7.e.h(new IllegalArgumentException(a0.d.m(obj7, "Unknown parcel ")));
                                                }
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            u4i.o it8 = (u4i.o) obj52;
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            boolean z3 = it8 instanceof u4i.m;
                                            h hVar3 = hVar;
                                            if (z3) {
                                                u4i.m mVar = (u4i.m) it8;
                                                hVar3.K2(new Breakdown.FeeDynamic(mVar.f277356a, null, mVar.f277358c, null, mVar.f277357b, true, true, false, false));
                                            } else if (it8 instanceof u4i.k) {
                                                hVar3.K2(new Breakdown.ChargeDescription(((u4i.k) it8).f277354a));
                                            } else if (it8 instanceof u4i.l) {
                                                hVar3.I2(new r25.a(hVar3, ((u4i.l) it8).f277355a, null, 23));
                                            } else {
                                                if (!(it8 instanceof u4i.n)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                hVar3.I2(new e(hVar3, ((u4i.n) it8).f277359a, null));
                                            }
                                            return Unit.f186387a;
                                        case 3:
                                            eii.k output3 = (eii.k) obj52;
                                            Intrinsics.checkNotNullParameter(output3, "output");
                                            if (output3 instanceof eii.i) {
                                                Object obj8 = ((eii.i) output3).f126655a;
                                                if (obj8 instanceof BreakdownFlowContract$Payloads$TaxDescription) {
                                                    hVar.K2(new Breakdown.ChargeDescription(((BreakdownFlowContract$Payloads$TaxDescription) obj8).f97169a));
                                                } else {
                                                    hx7.e.h(new IllegalArgumentException(a0.d.m(obj8, "Unknown parcel ")));
                                                }
                                            }
                                            return Unit.f186387a;
                                        case 4:
                                            dii.g output4 = (dii.g) obj52;
                                            Intrinsics.checkNotNullParameter(output4, "output");
                                            if (output4 instanceof dii.b) {
                                                Object obj9 = ((dii.b) output4).f115065a.d;
                                                if (obj9 instanceof BreakdownFlowContract$Payloads$ChargeDescriptionLink) {
                                                    String str22 = ((BreakdownFlowContract$Payloads$ChargeDescriptionLink) obj9).f97166a;
                                                    h hVar4 = hVar;
                                                    hVar4.I2(new r25.a(hVar4, str22, null, 23));
                                                } else {
                                                    hx7.e.h(new IllegalArgumentException(a0.d.m(obj9, "Unknown parcel ")));
                                                }
                                            }
                                            return Unit.f186387a;
                                        case 5:
                                            a5i.k it9 = (a5i.k) obj52;
                                            Intrinsics.checkNotNullParameter(it9, "it");
                                            h hVar5 = hVar;
                                            hVar5.getClass();
                                            if (it9 instanceof a5i.i) {
                                                a5i.i iVar = (a5i.i) it9;
                                                hVar5.K2(new Breakdown.DirtyPrice(iVar.f1420a, iVar.f1421b));
                                            } else {
                                                if (!(it9 instanceof a5i.j)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                a5i.j jVar = (a5i.j) it9;
                                                hVar5.K2(new Breakdown.Units(jVar.f1422a, jVar.f1423b));
                                            }
                                            return Unit.f186387a;
                                        case 6:
                                            eii.k output5 = (eii.k) obj52;
                                            Intrinsics.checkNotNullParameter(output5, "output");
                                            if (output5 instanceof eii.i) {
                                                hVar.J2(((eii.i) output5).f126655a);
                                            }
                                            return Unit.f186387a;
                                        default:
                                            eii.k output6 = (eii.k) obj52;
                                            Intrinsics.checkNotNullParameter(output6, "output");
                                            if (output6 instanceof eii.i) {
                                                hVar.J2(((eii.i) output6).f126655a);
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            });
                        } else if (breakdown instanceof Breakdown.Units) {
                            Breakdown.Units breakdown6 = (Breakdown.Units) breakdown;
                            dj0.d dVar = breakdown6.f97059a;
                            aVar4.getClass();
                            Intrinsics.checkNotNullParameter(breakdown6, "breakdown");
                            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                            actionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(new lw0.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_units, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_units_description, null, null, 14), null, null, false, 28), null, v.k(s4i.a.a("INVESTMENT_SENSITIVITY_CELL", com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_investment_sensitivity, dVar != null ? new MoneyClause(pyd.c.V(dVar, breakdown6.f97060b), new MoneyClause.Format.Defaults(null, tradingPrecise, false, false, 5), null, null, 12) : null, com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_investment_sensitivity_description), s4i.a.a("FACE_VALUE_CELL", com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_face_value, dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_face_value_description)), analyticsProduct, null));
                            final int i92 = 7;
                            hVar.M2(actionsBottomSheetController, new Function1() { // from class: s4i.d
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj52) {
                                    switch (i92) {
                                        case 0:
                                            dii.g output = (dii.g) obj52;
                                            Intrinsics.checkNotNullParameter(output, "output");
                                            if (output instanceof dii.c) {
                                                Object obj6 = ((dii.c) output).f115066a.d;
                                                if (obj6 instanceof BreakdownFlowContract$Payloads$TermsLink) {
                                                    TermsScope termsScope = ((BreakdownFlowContract$Payloads$TermsLink) obj6).f97170a;
                                                    h hVar2 = hVar;
                                                    hVar2.getClass();
                                                    hVar2.I2(new r25.a(hVar2, termsScope, null, 24));
                                                } else {
                                                    hx7.e.h(new IllegalArgumentException(a0.d.m(obj6, "Unknown parcel ")));
                                                }
                                            }
                                            return Unit.f186387a;
                                        case 1:
                                            dii.g output2 = (dii.g) obj52;
                                            Intrinsics.checkNotNullParameter(output2, "output");
                                            if (output2 instanceof dii.c) {
                                                Object obj7 = ((dii.c) output2).f115066a.d;
                                                if (obj7 instanceof RateExplanationDialogMapper.LearnMoreFaq) {
                                                    hVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((RateExplanationDialogMapper.LearnMoreFaq) obj7).f102137a, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                                } else {
                                                    hx7.e.h(new IllegalArgumentException(a0.d.m(obj7, "Unknown parcel ")));
                                                }
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            u4i.o it8 = (u4i.o) obj52;
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            boolean z3 = it8 instanceof u4i.m;
                                            h hVar3 = hVar;
                                            if (z3) {
                                                u4i.m mVar = (u4i.m) it8;
                                                hVar3.K2(new Breakdown.FeeDynamic(mVar.f277356a, null, mVar.f277358c, null, mVar.f277357b, true, true, false, false));
                                            } else if (it8 instanceof u4i.k) {
                                                hVar3.K2(new Breakdown.ChargeDescription(((u4i.k) it8).f277354a));
                                            } else if (it8 instanceof u4i.l) {
                                                hVar3.I2(new r25.a(hVar3, ((u4i.l) it8).f277355a, null, 23));
                                            } else {
                                                if (!(it8 instanceof u4i.n)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                hVar3.I2(new e(hVar3, ((u4i.n) it8).f277359a, null));
                                            }
                                            return Unit.f186387a;
                                        case 3:
                                            eii.k output3 = (eii.k) obj52;
                                            Intrinsics.checkNotNullParameter(output3, "output");
                                            if (output3 instanceof eii.i) {
                                                Object obj8 = ((eii.i) output3).f126655a;
                                                if (obj8 instanceof BreakdownFlowContract$Payloads$TaxDescription) {
                                                    hVar.K2(new Breakdown.ChargeDescription(((BreakdownFlowContract$Payloads$TaxDescription) obj8).f97169a));
                                                } else {
                                                    hx7.e.h(new IllegalArgumentException(a0.d.m(obj8, "Unknown parcel ")));
                                                }
                                            }
                                            return Unit.f186387a;
                                        case 4:
                                            dii.g output4 = (dii.g) obj52;
                                            Intrinsics.checkNotNullParameter(output4, "output");
                                            if (output4 instanceof dii.b) {
                                                Object obj9 = ((dii.b) output4).f115065a.d;
                                                if (obj9 instanceof BreakdownFlowContract$Payloads$ChargeDescriptionLink) {
                                                    String str22 = ((BreakdownFlowContract$Payloads$ChargeDescriptionLink) obj9).f97166a;
                                                    h hVar4 = hVar;
                                                    hVar4.I2(new r25.a(hVar4, str22, null, 23));
                                                } else {
                                                    hx7.e.h(new IllegalArgumentException(a0.d.m(obj9, "Unknown parcel ")));
                                                }
                                            }
                                            return Unit.f186387a;
                                        case 5:
                                            a5i.k it9 = (a5i.k) obj52;
                                            Intrinsics.checkNotNullParameter(it9, "it");
                                            h hVar5 = hVar;
                                            hVar5.getClass();
                                            if (it9 instanceof a5i.i) {
                                                a5i.i iVar = (a5i.i) it9;
                                                hVar5.K2(new Breakdown.DirtyPrice(iVar.f1420a, iVar.f1421b));
                                            } else {
                                                if (!(it9 instanceof a5i.j)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                a5i.j jVar = (a5i.j) it9;
                                                hVar5.K2(new Breakdown.Units(jVar.f1422a, jVar.f1423b));
                                            }
                                            return Unit.f186387a;
                                        case 6:
                                            eii.k output5 = (eii.k) obj52;
                                            Intrinsics.checkNotNullParameter(output5, "output");
                                            if (output5 instanceof eii.i) {
                                                hVar.J2(((eii.i) output5).f126655a);
                                            }
                                            return Unit.f186387a;
                                        default:
                                            eii.k output6 = (eii.k) obj52;
                                            Intrinsics.checkNotNullParameter(output6, "output");
                                            if (output6 instanceof eii.i) {
                                                hVar.J2(((eii.i) output6).f126655a);
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            });
                        } else {
                            if (breakdown instanceof Breakdown.CharityDescription) {
                                aVar4.getClass();
                                Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                                actionsBottomSheetController2 = new ActionsBottomSheetController(s4i.a.c(com.revolut.feature_market_data.impl.R$string.donations_one_off_transfer_transfer_breakdown_charity_gets, com.revolut.feature_market_data.impl.R$string.donations_one_off_transfer_transfer_breakdown_charity_gets_explanation, analyticsProduct));
                            } else if (breakdown instanceof Breakdown.EffectiveRateDescription) {
                                aVar4.getClass();
                                Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                                actionsBottomSheetController2 = new ActionsBottomSheetController(s4i.a.c(com.revolut.feature_market_data.impl.R$string.rates_transaction_vet_title, com.revolut.feature_market_data.impl.R$string.rates_transaction_vet_prompt_description, analyticsProduct));
                            } else if (breakdown instanceof Breakdown.Faq) {
                                Breakdown.Faq breakdown7 = (Breakdown.Faq) breakdown;
                                aVar4.getClass();
                                Intrinsics.checkNotNullParameter(breakdown7, "breakdown");
                                Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                                actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(breakdown7.f97025a, breakdown7.f97026b, null, null, false, 28), breakdown7.f97027c ? new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature_market_data.impl.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55) : null, analyticsProduct, null, null, 24));
                                final int i96 = 0;
                                hVar.M2(actionsBottomSheetController, new Function1() { // from class: s4i.d
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj52) {
                                        switch (i96) {
                                            case 0:
                                                dii.g output = (dii.g) obj52;
                                                Intrinsics.checkNotNullParameter(output, "output");
                                                if (output instanceof dii.c) {
                                                    Object obj6 = ((dii.c) output).f115066a.d;
                                                    if (obj6 instanceof BreakdownFlowContract$Payloads$TermsLink) {
                                                        TermsScope termsScope = ((BreakdownFlowContract$Payloads$TermsLink) obj6).f97170a;
                                                        h hVar2 = hVar;
                                                        hVar2.getClass();
                                                        hVar2.I2(new r25.a(hVar2, termsScope, null, 24));
                                                    } else {
                                                        hx7.e.h(new IllegalArgumentException(a0.d.m(obj6, "Unknown parcel ")));
                                                    }
                                                }
                                                return Unit.f186387a;
                                            case 1:
                                                dii.g output2 = (dii.g) obj52;
                                                Intrinsics.checkNotNullParameter(output2, "output");
                                                if (output2 instanceof dii.c) {
                                                    Object obj7 = ((dii.c) output2).f115066a.d;
                                                    if (obj7 instanceof RateExplanationDialogMapper.LearnMoreFaq) {
                                                        hVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((RateExplanationDialogMapper.LearnMoreFaq) obj7).f102137a, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                                    } else {
                                                        hx7.e.h(new IllegalArgumentException(a0.d.m(obj7, "Unknown parcel ")));
                                                    }
                                                }
                                                return Unit.f186387a;
                                            case 2:
                                                u4i.o it8 = (u4i.o) obj52;
                                                Intrinsics.checkNotNullParameter(it8, "it");
                                                boolean z3 = it8 instanceof u4i.m;
                                                h hVar3 = hVar;
                                                if (z3) {
                                                    u4i.m mVar = (u4i.m) it8;
                                                    hVar3.K2(new Breakdown.FeeDynamic(mVar.f277356a, null, mVar.f277358c, null, mVar.f277357b, true, true, false, false));
                                                } else if (it8 instanceof u4i.k) {
                                                    hVar3.K2(new Breakdown.ChargeDescription(((u4i.k) it8).f277354a));
                                                } else if (it8 instanceof u4i.l) {
                                                    hVar3.I2(new r25.a(hVar3, ((u4i.l) it8).f277355a, null, 23));
                                                } else {
                                                    if (!(it8 instanceof u4i.n)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    hVar3.I2(new e(hVar3, ((u4i.n) it8).f277359a, null));
                                                }
                                                return Unit.f186387a;
                                            case 3:
                                                eii.k output3 = (eii.k) obj52;
                                                Intrinsics.checkNotNullParameter(output3, "output");
                                                if (output3 instanceof eii.i) {
                                                    Object obj8 = ((eii.i) output3).f126655a;
                                                    if (obj8 instanceof BreakdownFlowContract$Payloads$TaxDescription) {
                                                        hVar.K2(new Breakdown.ChargeDescription(((BreakdownFlowContract$Payloads$TaxDescription) obj8).f97169a));
                                                    } else {
                                                        hx7.e.h(new IllegalArgumentException(a0.d.m(obj8, "Unknown parcel ")));
                                                    }
                                                }
                                                return Unit.f186387a;
                                            case 4:
                                                dii.g output4 = (dii.g) obj52;
                                                Intrinsics.checkNotNullParameter(output4, "output");
                                                if (output4 instanceof dii.b) {
                                                    Object obj9 = ((dii.b) output4).f115065a.d;
                                                    if (obj9 instanceof BreakdownFlowContract$Payloads$ChargeDescriptionLink) {
                                                        String str22 = ((BreakdownFlowContract$Payloads$ChargeDescriptionLink) obj9).f97166a;
                                                        h hVar4 = hVar;
                                                        hVar4.I2(new r25.a(hVar4, str22, null, 23));
                                                    } else {
                                                        hx7.e.h(new IllegalArgumentException(a0.d.m(obj9, "Unknown parcel ")));
                                                    }
                                                }
                                                return Unit.f186387a;
                                            case 5:
                                                a5i.k it9 = (a5i.k) obj52;
                                                Intrinsics.checkNotNullParameter(it9, "it");
                                                h hVar5 = hVar;
                                                hVar5.getClass();
                                                if (it9 instanceof a5i.i) {
                                                    a5i.i iVar = (a5i.i) it9;
                                                    hVar5.K2(new Breakdown.DirtyPrice(iVar.f1420a, iVar.f1421b));
                                                } else {
                                                    if (!(it9 instanceof a5i.j)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    a5i.j jVar = (a5i.j) it9;
                                                    hVar5.K2(new Breakdown.Units(jVar.f1422a, jVar.f1423b));
                                                }
                                                return Unit.f186387a;
                                            case 6:
                                                eii.k output5 = (eii.k) obj52;
                                                Intrinsics.checkNotNullParameter(output5, "output");
                                                if (output5 instanceof eii.i) {
                                                    hVar.J2(((eii.i) output5).f126655a);
                                                }
                                                return Unit.f186387a;
                                            default:
                                                eii.k output6 = (eii.k) obj52;
                                                Intrinsics.checkNotNullParameter(output6, "output");
                                                if (output6 instanceof eii.i) {
                                                    hVar.J2(((eii.i) output6).f126655a);
                                                }
                                                return Unit.f186387a;
                                        }
                                    }
                                });
                            } else {
                                if (!(breakdown instanceof Breakdown.RateExplanation)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                hVar.u.getClass();
                                feeBreakdownScreen = RateExplanationDialogMapper.a(analyticsProduct);
                                final int i99 = 1;
                                hVar.M2(feeBreakdownScreen, new Function1() { // from class: s4i.d
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj52) {
                                        switch (i99) {
                                            case 0:
                                                dii.g output = (dii.g) obj52;
                                                Intrinsics.checkNotNullParameter(output, "output");
                                                if (output instanceof dii.c) {
                                                    Object obj6 = ((dii.c) output).f115066a.d;
                                                    if (obj6 instanceof BreakdownFlowContract$Payloads$TermsLink) {
                                                        TermsScope termsScope = ((BreakdownFlowContract$Payloads$TermsLink) obj6).f97170a;
                                                        h hVar2 = hVar;
                                                        hVar2.getClass();
                                                        hVar2.I2(new r25.a(hVar2, termsScope, null, 24));
                                                    } else {
                                                        hx7.e.h(new IllegalArgumentException(a0.d.m(obj6, "Unknown parcel ")));
                                                    }
                                                }
                                                return Unit.f186387a;
                                            case 1:
                                                dii.g output2 = (dii.g) obj52;
                                                Intrinsics.checkNotNullParameter(output2, "output");
                                                if (output2 instanceof dii.c) {
                                                    Object obj7 = ((dii.c) output2).f115066a.d;
                                                    if (obj7 instanceof RateExplanationDialogMapper.LearnMoreFaq) {
                                                        hVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((RateExplanationDialogMapper.LearnMoreFaq) obj7).f102137a, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                                    } else {
                                                        hx7.e.h(new IllegalArgumentException(a0.d.m(obj7, "Unknown parcel ")));
                                                    }
                                                }
                                                return Unit.f186387a;
                                            case 2:
                                                u4i.o it8 = (u4i.o) obj52;
                                                Intrinsics.checkNotNullParameter(it8, "it");
                                                boolean z3 = it8 instanceof u4i.m;
                                                h hVar3 = hVar;
                                                if (z3) {
                                                    u4i.m mVar = (u4i.m) it8;
                                                    hVar3.K2(new Breakdown.FeeDynamic(mVar.f277356a, null, mVar.f277358c, null, mVar.f277357b, true, true, false, false));
                                                } else if (it8 instanceof u4i.k) {
                                                    hVar3.K2(new Breakdown.ChargeDescription(((u4i.k) it8).f277354a));
                                                } else if (it8 instanceof u4i.l) {
                                                    hVar3.I2(new r25.a(hVar3, ((u4i.l) it8).f277355a, null, 23));
                                                } else {
                                                    if (!(it8 instanceof u4i.n)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    hVar3.I2(new e(hVar3, ((u4i.n) it8).f277359a, null));
                                                }
                                                return Unit.f186387a;
                                            case 3:
                                                eii.k output3 = (eii.k) obj52;
                                                Intrinsics.checkNotNullParameter(output3, "output");
                                                if (output3 instanceof eii.i) {
                                                    Object obj8 = ((eii.i) output3).f126655a;
                                                    if (obj8 instanceof BreakdownFlowContract$Payloads$TaxDescription) {
                                                        hVar.K2(new Breakdown.ChargeDescription(((BreakdownFlowContract$Payloads$TaxDescription) obj8).f97169a));
                                                    } else {
                                                        hx7.e.h(new IllegalArgumentException(a0.d.m(obj8, "Unknown parcel ")));
                                                    }
                                                }
                                                return Unit.f186387a;
                                            case 4:
                                                dii.g output4 = (dii.g) obj52;
                                                Intrinsics.checkNotNullParameter(output4, "output");
                                                if (output4 instanceof dii.b) {
                                                    Object obj9 = ((dii.b) output4).f115065a.d;
                                                    if (obj9 instanceof BreakdownFlowContract$Payloads$ChargeDescriptionLink) {
                                                        String str22 = ((BreakdownFlowContract$Payloads$ChargeDescriptionLink) obj9).f97166a;
                                                        h hVar4 = hVar;
                                                        hVar4.I2(new r25.a(hVar4, str22, null, 23));
                                                    } else {
                                                        hx7.e.h(new IllegalArgumentException(a0.d.m(obj9, "Unknown parcel ")));
                                                    }
                                                }
                                                return Unit.f186387a;
                                            case 5:
                                                a5i.k it9 = (a5i.k) obj52;
                                                Intrinsics.checkNotNullParameter(it9, "it");
                                                h hVar5 = hVar;
                                                hVar5.getClass();
                                                if (it9 instanceof a5i.i) {
                                                    a5i.i iVar = (a5i.i) it9;
                                                    hVar5.K2(new Breakdown.DirtyPrice(iVar.f1420a, iVar.f1421b));
                                                } else {
                                                    if (!(it9 instanceof a5i.j)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    a5i.j jVar = (a5i.j) it9;
                                                    hVar5.K2(new Breakdown.Units(jVar.f1422a, jVar.f1423b));
                                                }
                                                return Unit.f186387a;
                                            case 6:
                                                eii.k output5 = (eii.k) obj52;
                                                Intrinsics.checkNotNullParameter(output5, "output");
                                                if (output5 instanceof eii.i) {
                                                    hVar.J2(((eii.i) output5).f126655a);
                                                }
                                                return Unit.f186387a;
                                            default:
                                                eii.k output6 = (eii.k) obj52;
                                                Intrinsics.checkNotNullParameter(output6, "output");
                                                if (output6 instanceof eii.i) {
                                                    hVar.J2(((eii.i) output6).f126655a);
                                                }
                                                return Unit.f186387a;
                                        }
                                    }
                                });
                            }
                            feeBreakdownScreen = actionsBottomSheetController2;
                        }
                    }
                    feeBreakdownScreen = actionsBottomSheetController;
                }
                feeBreakdownScreen.k2(new rxe.b(hVar, feeBreakdownScreen, 21));
                hVar.f259889w = feeBreakdownScreen;
                return feeBreakdownScreen;
            case 4:
                com.revolut.feature.credit.application.plugins.impl.ui.banner.a aVar10 = (com.revolut.feature.credit.application.plugins.impl.ui.banner.a) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                BannerFlowContract$Step step4 = (BannerFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof BannerFlowContract$Step.Banner)) {
                    throw new NoWhenBranchMatchedException();
                }
                BannerFlowContract$InputData bannerFlowContract$InputData = aVar10.f67160q;
                CreditPromptFlow creditPromptFlow = new CreditPromptFlow(new CreditPromptFlowContract$InputData(bannerFlowContract$InputData.f67156a.f154907a, new CreditPromptAnalyticsConfiguration(com.revolut.feature.credit.core.R$string.credit_application_banner_title, 0, com.revolut.feature.credit.core.R$string.credit_application_banner_primary_button, com.revolut.feature.credit.core.R$string.credit_application_banner_secondary_button, 2), bannerFlowContract$InputData.f67157b));
                s54.b block3 = new s54.b(aVar10, 0);
                Intrinsics.checkNotNullParameter(block3, "block");
                creditPromptFlow.H = block3;
                return creditPromptFlow;
            case 5:
                DeFiSendAmountScreen deFiSendAmountScreen = (DeFiSendAmountScreen) obj4;
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = DeFiSendAmountScreen.U;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj6 = data.f51981p;
                xi0.b bVar7 = obj6 instanceof xi0.b ? (xi0.b) obj6 : null;
                if (bVar7 == null) {
                    return null;
                }
                MaskedTextInputEditText editText = field.getEditText();
                qd0.b bVarN = ((g56.f) deFiSendAmountScreen.S.getValue()).f140652b.f140639j.n();
                vc.s.j(bVarN);
                return new zp0.d(editText, bVar7, new u80.d(((s80.b) bVarN).b()), null, new s56.c(deFiSendAmountScreen, data), false, false, 0, false, null, 1928);
            case 6:
                com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar8 = (com.revolut.feature.defi.remittances.impl.ui.send.amount.b) obj4;
                s56.m mVar = bVar8.f71836t;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DeFiSendAmountScreenContract$ModalStep step5 = (DeFiSendAmountScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof DeFiSendAmountScreenContract$ModalStep.ChainPicker) {
                    DeFiSendAmountScreenContract$ModalStep.ChainPicker chainPicker = (DeFiSendAmountScreenContract$ModalStep.ChainPicker) step5;
                    ArrayList<wk5.a> compatibleChains = chainPicker.f71825a;
                    wk5.a selectedChain = chainPicker.f71826b;
                    mVar.getClass();
                    uj5.a aVar11 = mVar.f259966a;
                    Intrinsics.checkNotNullParameter(compatibleChains, "compatibleChains");
                    Intrinsics.checkNotNullParameter(selectedChain, "selectedChain");
                    lw0.a aVar12 = new lw0.a(new TextLocalisedClause(com.revolut.feature.defi.remittances.impl.R$string.crypto_defi_receive_network_picker_title, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(com.revolut.feature.defi.remittances.impl.R$string.crypto_defi_receive_network_picker_subtitle, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "DeFiChainPicker_LearnMore", false), 10))), null, null, false, 28);
                    ArrayList arrayList2 = new ArrayList(w.t(compatibleChains, 10));
                    for (wk5.a aVar13 : compatibleChains) {
                        boolean z3 = aVar13 == selectedChain;
                        Clause clauseB = ((ik5.a) aVar11).b(aVar13, false, null);
                        boolean z4 = false;
                        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(((ik5.a) aVar11).c(aVar13), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, 6);
                        if (z3) {
                            yy0.i iVar = yy0.l.Companion;
                            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                            iVar.getClass();
                            tfVar = new tf(yy0.i.a(resourceImage));
                        } else {
                            tfVar = null;
                        }
                        arrayList2.add(new l(clauseB, (Clause) null, (RowDelegate.Model.MainImage) image24, true, z3, (RowDelegate.Model.c) tfVar, (Object) aVar13, 136));
                    }
                    k9 k9Var2 = k9.Crypto;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar12, null, arrayList2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null));
                    j0 block4 = new j0(bVar8, chainPicker);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    rowActionsBottomSheetController.H = block4;
                    return rowActionsBottomSheetController;
                }
                if (step5 instanceof DeFiSendAmountScreenContract$ModalStep.AmountLimitError) {
                    DeFiQuoteAmountLimitError error = ((DeFiSendAmountScreenContract$ModalStep.AmountLimitError) step5).f71824a;
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(error, "error");
                    AssetClause assetClauseE = u5l.a.e(error.getF71698a(), null);
                    if (error instanceof DeFiQuoteAmountLimitError.BelowMinimum) {
                        pair = new Pair(new TextLocalisedClause(com.revolut.feature.defi.remittances.impl.R$string.crypto_defi_swap_amount_input_error_below_minimum_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.defi.remittances.impl.R$string.crypto_defi_swap_amount_input_error_below_minimum_subtitle, u.c(assetClauseE), null, 12));
                    } else {
                        if (!(error instanceof DeFiQuoteAmountLimitError.AboveMaximum)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pair = new Pair(new TextLocalisedClause(com.revolut.feature.defi.remittances.impl.R$string.crypto_defi_swap_amount_input_error_exceeds_limit_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.defi.remittances.impl.R$string.crypto_defi_swap_amount_input_error_exceeds_limit_subtitle, u.c(assetClauseE), null, 12));
                    }
                    lw0.a aVar14 = new lw0.a((TextLocalisedClause) pair.f186385a, (TextLocalisedClause) pair.f186386b, null, null, false, 28);
                    aw0.e eVar4 = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                    k9 k9Var3 = k9.Crypto;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar14, eVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                }
                if (!(step5 instanceof DeFiSendAmountScreenContract$ModalStep.DualChooser)) {
                    throw new NoWhenBranchMatchedException();
                }
                DeFiSendAmountScreenContract$ModalStep.DualChooser dualChooser = (DeFiSendAmountScreenContract$ModalStep.DualChooser) step5;
                DualChooserContract$InputData dualChooserContract$InputData = dualChooser.f71827a;
                e3 e3Var = bVar8.f71838x;
                wk5.a chain = dualChooser.f71828b;
                String accountId = bVar8.o.f71821a;
                DeFiBalance selectedBalance = dualChooser.f71829c;
                e3Var.getClass();
                Intrinsics.checkNotNullParameter(chain, "chain");
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(selectedBalance, "selectedBalance");
                ViewController viewControllerE1 = bVar8.e1(new l1j.d(dualChooserContract$InputData, new u56.b(chain, accountId, selectedBalance, (g26.b) e3Var.f262806b, (k18.c) e3Var.f262807c)));
                j0 block5 = new j0(bVar8);
                Intrinsics.checkNotNullParameter(block5, "block");
                viewControllerE1.H = block5;
                return viewControllerE1;
            case 7:
                BrandingSettingsScreen brandingSettingsScreen = (BrandingSettingsScreen) obj4;
                m7 model = (m7) obj2;
                MaskedTextInputEditText field2 = (MaskedTextInputEditText) obj3;
                BrandingSettingsScreen.Companion aVar15 = BrandingSettingsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                model.getClass();
                InputFilter[] filters = field2.getFilters();
                Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
                field2.setFilters((InputFilter[]) zhm.p.A(filters, new InputFilter[]{new InputFilter.AllCaps(), brandingSettingsScreen.P}));
                return new y(field2, null, "[------]", new o(brandingSettingsScreen, i3), "COLOR_INPUT_ID", null, false, 98);
            case 8:
                return a(obj2, obj3);
            case 9:
                com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a aVar16 = (com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a) obj4;
                ManagedPortfoliosDetailsFlowControllerContract$InputData managedPortfoliosDetailsFlowControllerContract$InputData = aVar16.o;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                ManagedPortfoliosDetailsFlowControllerContract$Step it8 = (ManagedPortfoliosDetailsFlowControllerContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (Intrinsics.f(it8, ManagedPortfoliosDetailsFlowControllerContract$Step.PortfoliosDetails.f91313a)) {
                    ManagedPortfolioDetailsController managedPortfolioDetailsController = new ManagedPortfolioDetailsController(new ManagedPortfolioDetailsControllerContract$InputData(managedPortfoliosDetailsFlowControllerContract$InputData.f91311a));
                    ryd.i block6 = new ryd.i(aVar16, 28);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    managedPortfolioDetailsController.H = block6;
                    return managedPortfolioDetailsController;
                }
                if (Intrinsics.f(it8, ManagedPortfoliosDetailsFlowControllerContract$Step.TopHoldings.f91315a)) {
                    return new ManagedPortfoliosTopHoldingsController(new ManagedPortfoliosTopHoldingsControllerContract$InputData(managedPortfoliosDetailsFlowControllerContract$InputData.f91311a));
                }
                if (Intrinsics.f(it8, ManagedPortfoliosDetailsFlowControllerContract$Step.ExploreInsights.f91312a)) {
                    return new PortfolioInsightsFlow(new PortfolioInsightsFlowContract$InputData(managedPortfoliosDetailsFlowControllerContract$InputData.f91311a));
                }
                if (it8 instanceof ManagedPortfoliosDetailsFlowControllerContract$Step.StrategyReport) {
                    return new InvestorUpdateFlow(new InvestorUpdateFlowContract$InputData(((ManagedPortfoliosDetailsFlowControllerContract$Step.StrategyReport) it8).f91314a));
                }
                throw new NoWhenBranchMatchedException();
            case 10:
                return b(obj2, obj3);
            case 11:
                return c(obj2, obj3);
            case 12:
                return d(obj2, obj3);
            case 13:
                return e(obj2, obj3);
            case 14:
                return g(obj2, obj3);
            case 15:
                return h(obj2, obj3);
            case 16:
                return i(obj2, obj3);
            case 17:
                return j(obj2, obj3);
            case 18:
                return k(obj2, obj3);
            case 19:
                return l(obj2, obj3);
            case 20:
                return m(obj2, obj3);
            case 21:
                return n(obj2, obj3);
            case 22:
                return o(obj2, obj3);
            case 23:
                return p(obj2, obj3);
            case 24:
                return q(obj2, obj3);
            case 25:
                return r(obj2, obj3);
            case 26:
                return s(obj2, obj3);
            case 27:
                return t(obj2, obj3);
            case 28:
                return u(obj2, obj3);
            default:
                TradingAccounts domain = (TradingAccounts) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((scl.g) obj4).f261767a.f("TradingAccounts-availableTradingAccounts", domain);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ f(Object obj2, int i) {
        this.f259726a = i;
        this.f259727b = obj2;
    }
}
