package bwd;

import a83.c0;
import android.os.Parcelable;
import android.text.method.DigitsKeyListener;
import aw0.h;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import bwk.m;
import bzg.t;
import c69.i;
import c7i.p;
import c7i.q;
import c7i.x;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.CountryState;
import com.revolut.feature.apm.bills.billers.api.navigation.BillerSearchNavigation$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreenContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.v2.CryptoCommodityBuyCollectionAmountScreenV2;
import com.revolut.feature.defi.common.models.domain.DeFiAssetRiskContent;
import com.revolut.feature.defi.exchange.impl.ui.exchange_summary.DeFiExchangeSummaryContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.InvoiceTemplateDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.InvoiceTemplateDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.flow.InvoiceTemplatesFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.list.InvoiceTemplatesListScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.list.InvoiceTemplatesListScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.vat.FreelancerVatScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.TaxHubAssessmentScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.TaxHubAssessmentScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.TaxHubAssessmentFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow.TaxHubPaymentFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow.TaxHubPaymentFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlowContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.junior.accounts.impl.ui.saving_picker.JuniorSavingChildPickerScreen;
import com.revolut.feature.junior.accounts.impl.ui.saving_picker.flow.JuniorSavingChildPickerFlowContract$Step;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$FormField;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$ModalStep;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.masav.api.R$string;
import com.revolut.feature.masav.impl.model.DirectDebitData;
import com.revolut.feature.masav.impl.ui.form.MasavDirectDebitFormScreenContract$InputData;
import com.revolut.feature.masav.impl.ui.form.MasavDirectDebitFormScreenContract$ModalStep;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreenContract$ModalStep;
import com.revolut.feature.payments_migration.impl.ui.flow.PaymentsMigrationFlowContract$Step;
import com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.MigrateSubscriptionsController;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.AccountDetailsPaymentController;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.AccountDetailsPaymentControllerContract$InputData;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.cards.CardsPaymentController;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.cards.CardsPaymentControllerContract$InputData;
import com.revolut.feature.payments_migration.impl.ui.screen.search.SearchInBlockController;
import com.revolut.feature.payments_migration.impl.ui.screen.search.SearchInBlockControllerContract$InputData;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.restricted_access.impl.ui.flow.FeatureNotAvailableFlowContract$InputData;
import com.revolut.feature.restricted_access.impl.ui.flow.FeatureNotAvailableFlowContract$Step;
import com.revolut.feature.restricted_access.impl.ui.flow.RestrictedAccessPromptFlowContract$Step;
import com.revolut.feature.restricted_access.impl.ui.generic.RestrictedGenericScreen;
import com.revolut.feature.restricted_access.impl.ui.generic.RestrictedGenericScreenContract$InputData;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.wealth.analytics.insights.model.PortfolioInsightsInfo;
import com.revolut.feature.wealth.analytics.insights.model.PortfolioInsightsInfoItem;
import com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.PortfolioInsightsAssetIndicatorControllerContract$Step;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreenContract$ModalStep;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationBalancePickerProvider$BalancePickerData;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$ModalStep;
import com.revolut.feature_move_money.impl.automation.screen.limit.MoveMoneyAutomationLimitScreen;
import com.revolut.feature_move_money.impl.automation.screen.limit.MoveMoneyAutomationLimitScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.time.date_picker.DatePickerBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.definition_selector.DefinitionSelectorController;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.search_list.SearchListScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.MissingFieldsScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.MissingFieldsScreenContract$ModalStep;
import com.revolut.retail.feature.payments.bank_transfer.impl.structured_reference_transfer_note.StructuredReferenceTransferNoteScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.mapper.StructuredReferenceItemsMapper$ReferenceMaskConfig;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.StockOrderBookControllerContract$ModalStep;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.NationalIdentifierDocumentContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.NationalIdentifierDocumentController;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.NationalIdentifiersFlowContract$State;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.NationalIdentifiersFlowContract$Step;
import com.revolut.retail.feature.travel_status.impl.ui.flow.TravelStatusFlowContract$Step;
import com.revolut.retail.feature.travel_status.impl.ui.screens.enrollment.TravelStatusEnrollmentScreen;
import com.revolut.retail.feature.travel_status.impl.ui.screens.enrollment.TravelStatusEnrollmentScreenContract$InputData;
import com.revolut.retail.feature.travel_status.impl.ui.screens.overview.TravelStatusOverviewScreen;
import com.revolut.retail.feature.travel_status.impl.ui.screens.overview.TravelStatusOverviewScreenContract$InputData;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerScreen;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerScreenContract$InputData;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.action_bottomsheet.TravelStatusPartnerActionBottomSheetScreen;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.action_bottomsheet.TravelStatusPartnerActionBottomSheetScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import dj0.d;
import dz6.k;
import eii.l;
import grl.k9;
import h6i.e;
import h6i.o;
import h6i.p0;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import l80.f;
import n61.j;
import r10.r;
import s7a.a0;
import vkm.j2;
import xo1.g;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19318b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f19317a = i;
        this.f19318b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        final com.revolut.feature.masav.impl.ui.form.c cVar = (com.revolut.feature.masav.impl.ui.form.c) this.f19318b;
        y yVar = cVar.f78121s;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        MasavDirectDebitFormScreenContract$ModalStep step = (MasavDirectDebitFormScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, MasavDirectDebitFormScreenContract$ModalStep.InstitutionsList.f78114a)) {
            ViewController viewControllerE1 = cVar.e1(new dm1.a(new BillerSearchNavigation$InputData(g.MASAV_IL_DIRECT_DEBIT, null)));
            final int i = 0;
            Function1 block = new Function1() { // from class: c69.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    int i2 = i;
                    com.revolut.feature.masav.impl.ui.form.c cVar2 = cVar;
                    switch (i2) {
                        case 0:
                            dm1.d result = (dm1.d) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof dm1.c) {
                                cVar2.H2(cVar2.f78121s, new a31.k(9, new b77.m(result, 1)));
                            }
                            break;
                        case 1:
                            dii.g outputData = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof dii.e) {
                                DirectDebitData directDebitData = ((i) ((j2) cVar2.f78121s.f22677a).getValue()).f21729b;
                                MasavDirectDebitFormScreenContract$InputData masavDirectDebitFormScreenContract$InputData = cVar2.o;
                                if (masavDirectDebitFormScreenContract$InputData instanceof MasavDirectDebitFormScreenContract$InputData.Edit) {
                                    cVar2.l2(new y(cVar2, directDebitData, null, 0), new yi5.b(26));
                                } else if (masavDirectDebitFormScreenContract$InputData instanceof MasavDirectDebitFormScreenContract$InputData.AdjustLimits) {
                                    cVar2.l2(new y(cVar2, directDebitData, null, 1), new yi5.b(26));
                                } else {
                                    Unit unit = Unit.f186387a;
                                }
                            }
                            break;
                        default:
                            hii.a result2 = (hii.a) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            cVar2.H2(cVar2.f78121s, new a31.k(9, new a15.l(4, result2.f152606a)));
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (Intrinsics.f(step, MasavDirectDebitFormScreenContract$ModalStep.SelectDate.f78115a)) {
            LocalDate localDateE = ((f) cVar.f78118p).e();
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.masav_direct_debits_add_direct_debit_end_date, null, null, 14);
            LocalDate localDate = ((i) ((j2) yVar.f22677a).getValue()).f21729b.d;
            DatePickerBottomSheetController datePickerBottomSheetController = new DatePickerBottomSheetController(new DatePickerBottomSheetController.InputData(textLocalisedClause, localDate == null ? localDateE : localDate, localDateE, (LocalDate) null, 16));
            final int i2 = 2;
            Function1 block2 = new Function1() { // from class: c69.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    int i22 = i2;
                    com.revolut.feature.masav.impl.ui.form.c cVar2 = cVar;
                    switch (i22) {
                        case 0:
                            dm1.d result = (dm1.d) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof dm1.c) {
                                cVar2.H2(cVar2.f78121s, new a31.k(9, new b77.m(result, 1)));
                            }
                            break;
                        case 1:
                            dii.g outputData = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof dii.e) {
                                DirectDebitData directDebitData = ((i) ((j2) cVar2.f78121s.f22677a).getValue()).f21729b;
                                MasavDirectDebitFormScreenContract$InputData masavDirectDebitFormScreenContract$InputData = cVar2.o;
                                if (masavDirectDebitFormScreenContract$InputData instanceof MasavDirectDebitFormScreenContract$InputData.Edit) {
                                    cVar2.l2(new y(cVar2, directDebitData, null, 0), new yi5.b(26));
                                } else if (masavDirectDebitFormScreenContract$InputData instanceof MasavDirectDebitFormScreenContract$InputData.AdjustLimits) {
                                    cVar2.l2(new y(cVar2, directDebitData, null, 1), new yi5.b(26));
                                } else {
                                    Unit unit = Unit.f186387a;
                                }
                            }
                            break;
                        default:
                            hii.a result2 = (hii.a) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            cVar2.H2(cVar2.f78121s, new a31.k(9, new a15.l(4, result2.f152606a)));
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            datePickerBottomSheetController.H = block2;
            return datePickerBottomSheetController;
        }
        if (!Intrinsics.f(step, MasavDirectDebitFormScreenContract$ModalStep.EditDebit.f78113a)) {
            throw new NoWhenBranchMatchedException();
        }
        c69.a aVar = cVar.f78120r;
        String billerName = ((i) ((j2) yVar.f22677a).getValue()).f21729b.f78095a.f61146b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(billerName, "billerName");
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.masav_direct_debits_edit_direct_debit_dialog_title, null, null, 14), new TextLocalisedClause(R$string.masav_direct_debits_edit_direct_debit_dialog_subtitle, u.c(billerName), null, 12), null, null, false, 28);
        m6 m6Var = n6.Companion;
        h hVar = new h(false, m6.c(m6Var, new TextLocalisedClause(R$string.masav_direct_debits_edit_direct_debit_dialog_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.masav_direct_debits_edit_direct_debit_dialog_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        final int i3 = 1;
        Function1 block3 = new Function1() { // from class: c69.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                int i22 = i3;
                com.revolut.feature.masav.impl.ui.form.c cVar2 = cVar;
                switch (i22) {
                    case 0:
                        dm1.d result = (dm1.d) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result instanceof dm1.c) {
                            cVar2.H2(cVar2.f78121s, new a31.k(9, new b77.m(result, 1)));
                        }
                        break;
                    case 1:
                        dii.g outputData = (dii.g) obj4;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        if (outputData instanceof dii.e) {
                            DirectDebitData directDebitData = ((i) ((j2) cVar2.f78121s.f22677a).getValue()).f21729b;
                            MasavDirectDebitFormScreenContract$InputData masavDirectDebitFormScreenContract$InputData = cVar2.o;
                            if (masavDirectDebitFormScreenContract$InputData instanceof MasavDirectDebitFormScreenContract$InputData.Edit) {
                                cVar2.l2(new y(cVar2, directDebitData, null, 0), new yi5.b(26));
                            } else if (masavDirectDebitFormScreenContract$InputData instanceof MasavDirectDebitFormScreenContract$InputData.AdjustLimits) {
                                cVar2.l2(new y(cVar2, directDebitData, null, 1), new yi5.b(26));
                            } else {
                                Unit unit = Unit.f186387a;
                            }
                        }
                        break;
                    default:
                        hii.a result2 = (hii.a) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        cVar2.H2(cVar2.f78121s, new a31.k(9, new a15.l(4, result2.f152606a)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        actionsBottomSheetController.H = block3;
        return actionsBottomSheetController;
    }

    private final Object b(Object obj2, Object obj3) {
        MoveMoneyAutomationLimitScreenContract$InputData moveMoneyAutomationLimitScreenContract$InputData;
        final com.revolut.feature_move_money.impl.automation.screen.c cVar = (com.revolut.feature_move_money.impl.automation.screen.c) this.f19318b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        final MoveMoneyAutomationScreenContract$ModalStep step = (MoveMoneyAutomationScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        final int i = 1;
        if (step instanceof MoveMoneyAutomationScreenContract$ModalStep.BalancePicker) {
            c7i.b bVar = cVar.f97338r;
            MoveMoneyAutomationBalancePickerProvider$BalancePickerData data = ((MoveMoneyAutomationScreenContract$ModalStep.BalancePicker) step).f97329a;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(data, "data");
            q position = data.d;
            Intrinsics.checkNotNullParameter(position, "position");
            b7i.c cVar2 = new b7i.c(position);
            r rVar = bVar.f21986b;
            e filteringStrategy = new e(cVar2);
            i1j.a aVar = (i1j.a) bVar.f21987c.g();
            Intrinsics.checkNotNullParameter(filteringStrategy, "filteringStrategy");
            o oVar = (o) rVar.f250852b;
            r7i.u uVar = (r7i.u) rVar.f250851a;
            if (aVar == null) {
                aVar = (h6i.a) rVar.f250853c;
            }
            ViewController viewControllerE1 = cVar.e1(new g1j.a(data.f97322a, new p0(oVar, uVar, filteringStrategy, null, aVar)));
            Function1 block = new Function1() { // from class: c7i.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            dii.g output = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF = Intrinsics.f(output, dii.e.f115068a);
                            com.revolut.feature_move_money.impl.automation.screen.c cVar3 = cVar;
                            if (zF) {
                                cVar3.l2(new btk.j(cVar3, step, null, 28), new yi5.b(26));
                            } else if (Intrinsics.f(output, dii.f.f115069a)) {
                                oki.h.v2(cVar3.C, MoveMoneyAutomationScreenContract$ModalStep.LimitScreen.f97330a, ModalDestination.Style.POPUP.f98311a);
                            }
                            return Unit.f186387a;
                        default:
                            g1j.b output2 = (g1j.b) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            MoveMoneyAutomationScreenContract$ModalStep.BalancePicker balancePicker = (MoveMoneyAutomationScreenContract$ModalStep.BalancePicker) step;
                            if (output2 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature_move_money.impl.automation.screen.c cVar4 = cVar;
                            cVar4.l2(new com.revolut.feature_move_money.impl.automation.screen.a(cVar4, output2, balancePicker, null), new yi5.b(26));
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (!Intrinsics.f(step, MoveMoneyAutomationScreenContract$ModalStep.LimitScreen.f97330a)) {
            if (!(step instanceof MoveMoneyAutomationScreenContract$ModalStep.WealthProtectionConfirmation)) {
                throw new NoWhenBranchMatchedException();
            }
            c7i.p0 p0Var = cVar.z;
            AccountWrapper protectedAccount = ((MoveMoneyAutomationScreenContract$ModalStep.WealthProtectionConfirmation) step).f97332b;
            p0Var.getClass();
            Intrinsics.checkNotNullParameter(protectedAccount, "protectedAccount");
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.feature_move_money.impl.R$string.move_money_automation_wealth_protection_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature_move_money.impl.R$string.move_money_automation_wealth_protection_dialog_description, u.c(protectedAccount.f97225b), null, 12), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_android_face, null, null, 6)), null, false, 24);
            h hVar = new h(false, new n6(new TextLocalisedClause(com.revolut.feature_move_money.impl.R$string.move_money_automation_wealth_protection_dialog_button_primary, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature_move_money.impl.R$string.move_money_automation_wealth_protection_dialog_button_secondary, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
            k9 k9Var = k9.Payments;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            final int i2 = 0;
            Function1 block2 = new Function1() { // from class: c7i.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            dii.g output = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF = Intrinsics.f(output, dii.e.f115068a);
                            com.revolut.feature_move_money.impl.automation.screen.c cVar3 = cVar;
                            if (zF) {
                                cVar3.l2(new btk.j(cVar3, step, null, 28), new yi5.b(26));
                            } else if (Intrinsics.f(output, dii.f.f115069a)) {
                                oki.h.v2(cVar3.C, MoveMoneyAutomationScreenContract$ModalStep.LimitScreen.f97330a, ModalDestination.Style.POPUP.f98311a);
                            }
                            return Unit.f186387a;
                        default:
                            g1j.b output2 = (g1j.b) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            MoveMoneyAutomationScreenContract$ModalStep.BalancePicker balancePicker = (MoveMoneyAutomationScreenContract$ModalStep.BalancePicker) step;
                            if (output2 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature_move_money.impl.automation.screen.c cVar4 = cVar;
                            cVar4.l2(new com.revolut.feature_move_money.impl.automation.screen.a(cVar4, output2, balancePicker, null), new yi5.b(26));
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            actionsBottomSheetController.H = block2;
            return actionsBottomSheetController;
        }
        e7i.b bVar2 = cVar.f97340t;
        c7i.r domainState = (c7i.r) ((j2) cVar.D.f22677a).getValue();
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        WalletAutomation.Limit limit = domainState.f;
        if (limit != null) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            d dVar = limit.f86449a;
            moveMoneyAutomationLimitScreenContract$InputData = new MoveMoneyAutomationLimitScreenContract$InputData(dVar.f115083b, Long.valueOf(dVar.f115082a), limit.f86450b);
        } else {
            Object content = domainState.f22022a.getContent();
            if (content == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            moveMoneyAutomationLimitScreenContract$InputData = new MoveMoneyAutomationLimitScreenContract$InputData(((p) content).f22020a.getCurrency(), null, null);
        }
        MoveMoneyAutomationLimitScreen moveMoneyAutomationLimitScreen = new MoveMoneyAutomationLimitScreen(moveMoneyAutomationLimitScreenContract$InputData);
        x block3 = new x(cVar, i);
        Intrinsics.checkNotNullParameter(block3, "block");
        moveMoneyAutomationLimitScreen.H = block3;
        return moveMoneyAutomationLimitScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v122, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object next;
        my8.b bVar;
        k kVar;
        String str;
        ActionsBottomSheetController actionsBottomSheetController;
        int i = this.f19317a;
        int i2 = 0;
        final int i3 = 1;
        Object obj4 = this.f19318b;
        switch (i) {
            case 0:
                String code = (String) obj2;
                vtd.d summary = (vtd.d) obj3;
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(summary, "summary");
                ((c) obj4).f19320b.f(c.a(code), summary);
                return Unit.f186387a;
            case 1:
                cwk.a aVar = ((m) obj4).f19379p;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                StockOrderBookControllerContract$ModalStep step = (StockOrderBookControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof StockOrderBookControllerContract$ModalStep.UnableToTrade) {
                    aVar.getClass();
                    lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_asset_details_order_book_limit_error_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_asset_details_order_book_limit_error_description, null, null, 14), null, null, false, 28);
                    aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_asset_details_order_book_limit_sell_error_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var = k9.Trading;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                }
                if (!(step instanceof StockOrderBookControllerContract$ModalStep.NoShares)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.getClass();
                lw0.a aVar3 = new lw0.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_asset_details_order_book_limit_sell_error_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_asset_details_order_book_limit_sell_error_description, null, null, 14), null, null, false, 28);
                aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_asset_details_order_book_limit_sell_error_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var2 = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar3, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
            case 2:
                CryptoCommodityBuyCollectionAmountScreenV2 cryptoCommodityBuyCollectionAmountScreenV2 = (CryptoCommodityBuyCollectionAmountScreenV2) obj4;
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = CryptoCommodityBuyCollectionAmountScreenV2.g0;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                Object obj5 = data.f51981p;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(editText, (xi0.b) obj5, (u80.d) cryptoCommodityBuyCollectionAmountScreenV2.f71542b0.getValue(), null, new bx5.c(cryptoCommodityBuyCollectionAmountScreenV2), false, false, 0, false, null, 1928);
            case 3:
                final com.revolut.feature.kyc.impl.screens.documentid_input.b bVar2 = (com.revolut.feature.kyc.impl.screens.documentid_input.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                KYCDocumentIdInputScreenContract$ModalStep step2 = (KYCDocumentIdInputScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof KYCDocumentIdInputScreenContract$ModalStep.ShowConsent) {
                    final String consentKey = ((KYCDocumentIdInputScreenContract$ModalStep.ShowConsent) step2).f77865a;
                    bVar2.f77869q.getClass();
                    Intrinsics.checkNotNullParameter(consentKey, "consentKey");
                    if (!Intrinsics.f(consentKey, "AU_DVS_IDENTITY_SCREENING")) {
                        throw new IllegalStateException(p.a.p("Consent with key ", consentKey, " is yet not implemented in Document Id"));
                    }
                    lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_au_identity_consent_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_au_identity_consent_description, v.k(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_au_identity_ekyc_consent_terms, null, new Click(14, Integer.valueOf(R$attr.uikit_colorBlue), (Object) null, "TERMS_LINK_ID", false), 10), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_au_identity_ekyc_consent_privacy_policy, null, new Click(14, Integer.valueOf(R$attr.uikit_colorBlue), (Object) null, "PRIVACY_POLICY_LINK_ID", false), 10)), null, 12), null, null, false, 28);
                    aw0.e eVar3 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.common_action_verify_identity, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                    AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                    k9 k9Var3 = frl.a.k;
                    ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar4, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var3, k9Var3), null, null, 24));
                    final int i5 = 0;
                    Function1 block = new Function1() { // from class: bx8.r
                        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Map] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            Clause clauseW;
                            Object next2;
                            Object next3;
                            switch (i5) {
                                case 0:
                                    dii.g result = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof dii.e;
                                    Object obj7 = null;
                                    com.revolut.feature.kyc.impl.screens.documentid_input.b bVar3 = bVar2;
                                    if (z) {
                                        y yVar = bVar3.u;
                                        ArrayList arrayListF1 = d0.f1(((m) ((j2) yVar.f22677a).getValue()).f19521a);
                                        Iterator it8 = arrayListF1.iterator();
                                        while (true) {
                                            if (it8.hasNext()) {
                                                Object next4 = it8.next();
                                                if (Intrinsics.f(((l) next4).f19519a, consentKey)) {
                                                    obj7 = next4;
                                                }
                                            }
                                        }
                                        l lVar = (l) obj7;
                                        if (lVar != null) {
                                            String consentKey2 = lVar.f19519a;
                                            Intrinsics.checkNotNullParameter(consentKey2, "consentKey");
                                            l lVar2 = new l(consentKey2, true);
                                            ListIterator listIterator = arrayListF1.listIterator();
                                            while (listIterator.hasNext()) {
                                                Object next5 = listIterator.next();
                                                if (Intrinsics.f(((l) next5).f19519a, consentKey2)) {
                                                    next5 = lVar2;
                                                }
                                                listIterator.set(next5);
                                            }
                                            bVar3.H2(yVar, new c0(9, arrayListF1));
                                            bVar3.I2();
                                        }
                                    } else if (result instanceof dii.c) {
                                        String str2 = ((dii.c) result).f115066a.f275445a;
                                        if (Intrinsics.f(str2, "TERMS_LINK_ID")) {
                                            TermsScope.INSTANCE.getClass();
                                            bVar3.l2(new btk.j(bVar3, TermsScope.f90380s, null, 5), new yi5.b(26));
                                        } else if (Intrinsics.f(str2, "PRIVACY_POLICY_LINK_ID")) {
                                            TermsScope.INSTANCE.getClass();
                                            bVar3.l2(new btk.j(bVar3, TermsScope.f90360a0, null, 5), new yi5.b(26));
                                        }
                                    }
                                    break;
                                default:
                                    a0 output = (a0) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    s7a.c0 c0Var = output.f260599a;
                                    if (c0Var instanceof vi1.q) {
                                        com.revolut.feature.kyc.impl.screens.documentid_input.b bVar4 = bVar2;
                                        y yVar2 = bVar4.u;
                                        j2 j2Var = (j2) yVar2.f22677a;
                                        j2 j2Var2 = (j2) yVar2.f22677a;
                                        Iterator it9 = ((m) j2Var.getValue()).f19522b.iterator();
                                        while (true) {
                                            clauseW = null;
                                            if (it9.hasNext()) {
                                                next2 = it9.next();
                                                if (Intrinsics.f(((KYCDocumentIdInputScreenContract$FormField) next2).f77860a.e, consentKey)) {
                                                }
                                            } else {
                                                next2 = null;
                                            }
                                        }
                                        KYCDocumentIdInputScreenContract$FormField kYCDocumentIdInputScreenContract$FormField = (KYCDocumentIdInputScreenContract$FormField) next2;
                                        if (kYCDocumentIdInputScreenContract$FormField != null) {
                                            CountryState countryState = ((vi1.q) c0Var).f289515a;
                                            KYCDocumentIdInputScreenContract$FormField kYCDocumentIdInputScreenContract$FormFieldA = KYCDocumentIdInputScreenContract$FormField.a(kYCDocumentIdInputScreenContract$FormField, countryState.getName(), countryState.getCode(), true, null, null, 49);
                                            Iterator it10 = ((m) j2Var2.getValue()).f19522b.iterator();
                                            while (true) {
                                                if (it10.hasNext()) {
                                                    next3 = it10.next();
                                                    d dVar = f.Companion;
                                                    my8.b bVar5 = ((KYCDocumentIdInputScreenContract$FormField) next3).f77860a;
                                                    dVar.getClass();
                                                    if (d.a(bVar5)) {
                                                    }
                                                } else {
                                                    next3 = null;
                                                }
                                            }
                                            KYCDocumentIdInputScreenContract$FormField kYCDocumentIdInputScreenContract$FormField2 = (KYCDocumentIdInputScreenContract$FormField) next3;
                                            if (kYCDocumentIdInputScreenContract$FormField2 != null) {
                                                String code2 = countryState.getCode();
                                                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_document_id_field_hint_text_default, null, null, 14);
                                                Integer num = (Integer) com.revolut.feature.kyc.impl.screens.documentid_input.b.v.get(code2);
                                                if (num != null) {
                                                    clauseW = yoj.b.w(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(num.intValue(), null, null, 14));
                                                }
                                                KYCDocumentIdInputScreenContract$FormField kYCDocumentIdInputScreenContract$FormFieldA2 = KYCDocumentIdInputScreenContract$FormField.a(kYCDocumentIdInputScreenContract$FormField2, null, null, false, yoj.b.w(textLocalisedClause, clauseW), null, 47);
                                                ArrayList arrayListF12 = d0.f1(((m) j2Var2.getValue()).f19522b);
                                                ListIterator listIterator2 = arrayListF12.listIterator();
                                                while (listIterator2.hasNext()) {
                                                    Object next6 = listIterator2.next();
                                                    if (Intrinsics.f((KYCDocumentIdInputScreenContract$FormField) next6, kYCDocumentIdInputScreenContract$FormField2)) {
                                                        next6 = kYCDocumentIdInputScreenContract$FormFieldA2;
                                                    }
                                                    listIterator2.set(next6);
                                                }
                                                bVar4.H2(yVar2, new c0(10, arrayListF12));
                                            }
                                            bVar4.J2(kYCDocumentIdInputScreenContract$FormField, kYCDocumentIdInputScreenContract$FormFieldA);
                                        }
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    actionsBottomSheetController2.H = block;
                    return actionsBottomSheetController2;
                }
                if (!(step2 instanceof KYCDocumentIdInputScreenContract$ModalStep.ShowRegionPicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                final String str2 = ((KYCDocumentIdInputScreenContract$ModalStep.ShowRegionPicker) step2).f77866a;
                Iterator it8 = ((bx8.m) ((j2) bVar2.u.f22677a).getValue()).f19522b.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((KYCDocumentIdInputScreenContract$FormField) next).f77860a.e, str2)) {
                        }
                    } else {
                        next = null;
                    }
                }
                KYCDocumentIdInputScreenContract$FormField kYCDocumentIdInputScreenContract$FormField = (KYCDocumentIdInputScreenContract$FormField) next;
                String str3 = (kYCDocumentIdInputScreenContract$FormField == null || (bVar = kYCDocumentIdInputScreenContract$FormField.f77860a) == null) ? null : bVar.f;
                s7a.x xVar = new s7a.x(new TextClause(str3 == null ? "" : str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), bVar2.o.f77863a.f297794a, null, null, false, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, 2147483644);
                Object obj6 = bVar2.f77871s.get();
                Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                PickerController pickerController = new PickerController(xVar, (x7a.d) obj6);
                Function1 block2 = new Function1() { // from class: bx8.r
                    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj62) {
                        Clause clauseW;
                        Object next2;
                        Object next3;
                        switch (i3) {
                            case 0:
                                dii.g result = (dii.g) obj62;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z = result instanceof dii.e;
                                Object obj7 = null;
                                com.revolut.feature.kyc.impl.screens.documentid_input.b bVar3 = bVar2;
                                if (z) {
                                    y yVar = bVar3.u;
                                    ArrayList arrayListF1 = d0.f1(((m) ((j2) yVar.f22677a).getValue()).f19521a);
                                    Iterator it82 = arrayListF1.iterator();
                                    while (true) {
                                        if (it82.hasNext()) {
                                            Object next4 = it82.next();
                                            if (Intrinsics.f(((l) next4).f19519a, str2)) {
                                                obj7 = next4;
                                            }
                                        }
                                    }
                                    l lVar = (l) obj7;
                                    if (lVar != null) {
                                        String consentKey2 = lVar.f19519a;
                                        Intrinsics.checkNotNullParameter(consentKey2, "consentKey");
                                        l lVar2 = new l(consentKey2, true);
                                        ListIterator listIterator = arrayListF1.listIterator();
                                        while (listIterator.hasNext()) {
                                            Object next5 = listIterator.next();
                                            if (Intrinsics.f(((l) next5).f19519a, consentKey2)) {
                                                next5 = lVar2;
                                            }
                                            listIterator.set(next5);
                                        }
                                        bVar3.H2(yVar, new c0(9, arrayListF1));
                                        bVar3.I2();
                                    }
                                } else if (result instanceof dii.c) {
                                    String str22 = ((dii.c) result).f115066a.f275445a;
                                    if (Intrinsics.f(str22, "TERMS_LINK_ID")) {
                                        TermsScope.INSTANCE.getClass();
                                        bVar3.l2(new btk.j(bVar3, TermsScope.f90380s, null, 5), new yi5.b(26));
                                    } else if (Intrinsics.f(str22, "PRIVACY_POLICY_LINK_ID")) {
                                        TermsScope.INSTANCE.getClass();
                                        bVar3.l2(new btk.j(bVar3, TermsScope.f90360a0, null, 5), new yi5.b(26));
                                    }
                                }
                                break;
                            default:
                                a0 output = (a0) obj62;
                                Intrinsics.checkNotNullParameter(output, "output");
                                s7a.c0 c0Var = output.f260599a;
                                if (c0Var instanceof vi1.q) {
                                    com.revolut.feature.kyc.impl.screens.documentid_input.b bVar4 = bVar2;
                                    y yVar2 = bVar4.u;
                                    j2 j2Var = (j2) yVar2.f22677a;
                                    j2 j2Var2 = (j2) yVar2.f22677a;
                                    Iterator it9 = ((m) j2Var.getValue()).f19522b.iterator();
                                    while (true) {
                                        clauseW = null;
                                        if (it9.hasNext()) {
                                            next2 = it9.next();
                                            if (Intrinsics.f(((KYCDocumentIdInputScreenContract$FormField) next2).f77860a.e, str2)) {
                                            }
                                        } else {
                                            next2 = null;
                                        }
                                    }
                                    KYCDocumentIdInputScreenContract$FormField kYCDocumentIdInputScreenContract$FormField2 = (KYCDocumentIdInputScreenContract$FormField) next2;
                                    if (kYCDocumentIdInputScreenContract$FormField2 != null) {
                                        CountryState countryState = ((vi1.q) c0Var).f289515a;
                                        KYCDocumentIdInputScreenContract$FormField kYCDocumentIdInputScreenContract$FormFieldA = KYCDocumentIdInputScreenContract$FormField.a(kYCDocumentIdInputScreenContract$FormField2, countryState.getName(), countryState.getCode(), true, null, null, 49);
                                        Iterator it10 = ((m) j2Var2.getValue()).f19522b.iterator();
                                        while (true) {
                                            if (it10.hasNext()) {
                                                next3 = it10.next();
                                                d dVar = f.Companion;
                                                my8.b bVar5 = ((KYCDocumentIdInputScreenContract$FormField) next3).f77860a;
                                                dVar.getClass();
                                                if (d.a(bVar5)) {
                                                }
                                            } else {
                                                next3 = null;
                                            }
                                        }
                                        KYCDocumentIdInputScreenContract$FormField kYCDocumentIdInputScreenContract$FormField22 = (KYCDocumentIdInputScreenContract$FormField) next3;
                                        if (kYCDocumentIdInputScreenContract$FormField22 != null) {
                                            String code2 = countryState.getCode();
                                            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_document_id_field_hint_text_default, null, null, 14);
                                            Integer num = (Integer) com.revolut.feature.kyc.impl.screens.documentid_input.b.v.get(code2);
                                            if (num != null) {
                                                clauseW = yoj.b.w(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(num.intValue(), null, null, 14));
                                            }
                                            KYCDocumentIdInputScreenContract$FormField kYCDocumentIdInputScreenContract$FormFieldA2 = KYCDocumentIdInputScreenContract$FormField.a(kYCDocumentIdInputScreenContract$FormField22, null, null, false, yoj.b.w(textLocalisedClause, clauseW), null, 47);
                                            ArrayList arrayListF12 = d0.f1(((m) j2Var2.getValue()).f19522b);
                                            ListIterator listIterator2 = arrayListF12.listIterator();
                                            while (listIterator2.hasNext()) {
                                                Object next6 = listIterator2.next();
                                                if (Intrinsics.f((KYCDocumentIdInputScreenContract$FormField) next6, kYCDocumentIdInputScreenContract$FormField22)) {
                                                    next6 = kYCDocumentIdInputScreenContract$FormFieldA2;
                                                }
                                                listIterator2.set(next6);
                                            }
                                            bVar4.H2(yVar2, new c0(10, arrayListF12));
                                        }
                                        bVar4.J2(kYCDocumentIdInputScreenContract$FormField2, kYCDocumentIdInputScreenContract$FormFieldA);
                                    }
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block2, "block");
                pickerController.H = block2;
                return pickerController;
            case 4:
                com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a aVar5 = (com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PortfolioInsightsAssetIndicatorControllerContract$Step step3 = (PortfolioInsightsAssetIndicatorControllerContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof PortfolioInsightsAssetIndicatorControllerContract$Step.InfoStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                wwg.a aVar6 = aVar5.f95028r;
                PortfolioInsightsInfo portfolioInsightsInfo = ((PortfolioInsightsAssetIndicatorControllerContract$Step.InfoStep) step3).f95025a;
                AnalyticsProduct analyticsProduct = aVar5.o;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(portfolioInsightsInfo, "portfolioInsightsInfo");
                Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                lw0.a aVar7 = new lw0.a(new TextClause(portfolioInsightsInfo.f95008a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 28);
                ArrayList<PortfolioInsightsInfoItem> arrayList = portfolioInsightsInfo.f95009b;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (PortfolioInsightsInfoItem portfolioInsightsInfoItem : arrayList) {
                    arrayList2.add(new l((Clause) new TextClause(portfolioInsightsInfoItem.f95011b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) new TextClause(portfolioInsightsInfoItem.f95012c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(aVar6.f300668a.a(portfolioInsightsInfoItem.f95010a), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null == true ? 1 : 0, null == true ? 1 : 0, 4), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
                }
                return new RowActionsBottomSheetController(new eii.c(aVar7, new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), arrayList2, analyticsProduct, null));
            case 5:
                final com.revolut.feature.freelancer.impl.ui.invoice.templates.flow.a aVar8 = (com.revolut.feature.freelancer.impl.ui.invoice.templates.flow.a) obj4;
                InvoiceTemplatesFlowContract$Step step4 = (InvoiceTemplatesFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof InvoiceTemplatesFlowContract$Step.TemplateDetails) {
                    InvoiceTemplate invoiceTemplate = ((InvoiceTemplatesFlowContract$Step.TemplateDetails) step4).f73963a;
                    InvoiceTemplateDetailsScreen invoiceTemplateDetailsScreen = new InvoiceTemplateDetailsScreen(invoiceTemplate != null ? new InvoiceTemplateDetailsScreenContract$InputData.EditTemplate(invoiceTemplate) : InvoiceTemplateDetailsScreenContract$InputData.CreateTemplate.f73944a);
                    final Object[] objArr = null == true ? 1 : 0;
                    Function1 block3 = new Function1() { // from class: bz6.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (objArr) {
                                case 0:
                                    yy6.m result = (yy6.m) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!Intrinsics.f(result, yy6.m.f317849a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.freelancer.impl.ui.invoice.templates.flow.a aVar9 = aVar8;
                                    oki.h.t2(aVar9, aVar9.f73966p, InvoiceTemplatesFlowContract$Step.VatNumberSettings.f73965a, true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    y07.h result2 = (y07.h) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2.f310159a) {
                                        aVar8.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    invoiceTemplateDetailsScreen.H = block3;
                    return invoiceTemplateDetailsScreen;
                }
                if (!(step4 instanceof InvoiceTemplatesFlowContract$Step.TemplatesList)) {
                    if (!Intrinsics.f(step4, InvoiceTemplatesFlowContract$Step.VatNumberSettings.f73965a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FreelancerVatScreen freelancerVatScreen = new FreelancerVatScreen();
                    Function1 function1 = new Function1() { // from class: bz6.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i3) {
                                case 0:
                                    yy6.m result = (yy6.m) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!Intrinsics.f(result, yy6.m.f317849a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.freelancer.impl.ui.invoice.templates.flow.a aVar9 = aVar8;
                                    oki.h.t2(aVar9, aVar9.f73966p, InvoiceTemplatesFlowContract$Step.VatNumberSettings.f73965a, true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    y07.h result2 = (y07.h) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2.f310159a) {
                                        aVar8.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function1, "<set-?>");
                    freelancerVatScreen.H = function1;
                    return freelancerVatScreen;
                }
                InvoiceTemplatesFlowContract$Step.TemplatesList templatesList = (InvoiceTemplatesFlowContract$Step.TemplatesList) step4;
                String str4 = aVar8.o.f73961a;
                int i6 = bz6.f.f19933a[templatesList.f73964a.ordinal()];
                if (i6 == 1) {
                    kVar = k.MANAGEMENT;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar = k.SELECTION;
                }
                InvoiceTemplatesListScreen invoiceTemplatesListScreen = new InvoiceTemplatesListScreen(new InvoiceTemplatesListScreenContract$InputData(str4, kVar));
                byc.a block4 = new byc.a(aVar8, templatesList, i3);
                Intrinsics.checkNotNullParameter(block4, "block");
                invoiceTemplatesListScreen.H = block4;
                return invoiceTemplatesListScreen;
            case 6:
                bzg.a aVar9 = ((com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a) obj4).f95120r;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                WidgetisedAnalyticsPnLScreenContract$ModalStep step5 = (WidgetisedAnalyticsPnLScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (Intrinsics.f(step5, WidgetisedAnalyticsPnLScreenContract$ModalStep.ProfitFactorInfo.f95116a)) {
                    aVar9.getClass();
                    return aVar9.a(new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_profit_factor, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_profit_factor_description, null, null, 14));
                }
                if (!Intrinsics.f(step5, WidgetisedAnalyticsPnLScreenContract$ModalStep.WinRateInfo.f95117a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar9.getClass();
                return aVar9.a(new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_win_rate, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_win_rate_description, null, null, 14));
            case 7:
                com.revolut.feature.restricted_access.impl.ui.flow.a aVar10 = (com.revolut.feature.restricted_access.impl.ui.flow.a) obj4;
                FeatureNotAvailableFlowContract$InputData featureNotAvailableFlowContract$InputData = aVar10.o;
                yki.l FlowCoordinator = (yki.l) obj2;
                FeatureNotAvailableFlowContract$Step it9 = (FeatureNotAvailableFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it9, "it");
                if (!Intrinsics.f((FeatureNotAvailableFlowContract$Step) FlowCoordinator.d(), FeatureNotAvailableFlowContract$Step.Initial.f82048a)) {
                    throw new NoWhenBranchMatchedException();
                }
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("FEATURE_NOT_AVAILABLE_PROMPT_ID", featureNotAvailableFlowContract$InputData.f82045a, featureNotAvailableFlowContract$InputData.f82046b, new PromptMarketingContentDelegate.Model.Content.MediaContent(new GlyphImage(R$drawable.uikit_icn_24_logo_revolut, null, null, 6), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button(featureNotAvailableFlowContract$InputData.f82047c, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30));
                t block5 = new t(aVar10, 3);
                Intrinsics.checkNotNullParameter(block5, "block");
                promptMarketingScreen.H = block5;
                return promptMarketingScreen;
            case 8:
                com.revolut.feature.restricted_access.impl.ui.flow.b bVar3 = (com.revolut.feature.restricted_access.impl.ui.flow.b) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                RestrictedAccessPromptFlowContract$Step it10 = (RestrictedAccessPromptFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it10, "it");
                if (!Intrinsics.f((RestrictedAccessPromptFlowContract$Step) FlowCoordinator2.d(), RestrictedAccessPromptFlowContract$Step.Initial.f82050a)) {
                    throw new NoWhenBranchMatchedException();
                }
                switch (c0b.g.f20202a[bVar3.o.f82049a.ordinal()]) {
                    case 1:
                        PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("RESTRICTED_ACCESS_PROMPT_ID", new TextLocalisedClause(com.revolut.feature.restricted_access.R$string.restricted_root_devices_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.restricted_access.R$string.restricted_root_devices_description, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D281", null, null, null, 30), null), null, null, null, null, null, null, null, null, null, null, null, null, null, new TextLocalisedClause(com.revolut.feature.restricted_access.R$string.restricted_common_action_learn_more, null, new Click(14, Integer.valueOf(R$attr.uikit_colorBlue), (Object) null, "LEARN_MORE_CLICK_ID", false), 10), null, null, null, 1965488), AnalyticsProduct.Shared.FinCrime.f, true, false, null, 16));
                        byc.a block6 = new byc.a(promptMarketingScreen2, bVar3, 6);
                        Intrinsics.checkNotNullParameter(block6, "block");
                        promptMarketingScreen2.H = block6;
                        return promptMarketingScreen2;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        bVar3.f82053p.getClass();
                        return new RestrictedGenericScreen(new RestrictedGenericScreenContract$InputData("https://help.revolut.com/help/security-logging-in/device-integrity-requirements/why-is-the-revolut-app-no-longer-supported-on-my-device/?geo-redirect=true"));
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 9:
                com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b bVar4 = (com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                NationalIdentifiersFlowContract$Step step6 = (NationalIdentifiersFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof NationalIdentifiersFlowContract$Step.DocumentStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list = ((NationalIdentifiersFlowContract$State) ((j2) bVar4.f104218s.f22677a).getValue()).f104212a;
                if (list == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                NationalIdentifierDocumentController nationalIdentifierDocumentController = new NationalIdentifierDocumentController(new NationalIdentifierDocumentContract$InputData((xel.c) list.get(((NationalIdentifiersFlowContract$Step.DocumentStep) step6).f104214a)));
                byc.a block7 = new byc.a(bVar4, step6, 10);
                Intrinsics.checkNotNullParameter(block7, "block");
                nationalIdentifierDocumentController.H = block7;
                return nationalIdentifierDocumentController;
            case 10:
                pyf.f fVar = (pyf.f) obj4;
                lk0.e currentDayPage = (lk0.e) obj2;
                lk0.e nextDayPage = (lk0.e) obj3;
                Intrinsics.checkNotNullParameter(currentDayPage, "currentDayPage");
                Intrinsics.checkNotNullParameter(nextDayPage, "nextDayPage");
                ArrayList arrayListE0 = d0.E0(nextDayPage.f196171a, currentDayPage.f196171a);
                boolean z = currentDayPage.f196173c || nextDayPage.f196173c;
                pyf.h hVar = ((pyf.f) nextDayPage.f196172b).e;
                if (hVar != null) {
                    String string = hVar.f240829a.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    str = string;
                } else {
                    str = null;
                }
                return new lk0.e(arrayListE0, fVar, z, str, null, 16);
            case 11:
                oyf.b params = (oyf.b) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(params, "params");
                m0g.g gVar = (m0g.g) ((m0g.a) obj4);
                gVar.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                int i21 = 26;
                efm.r map = gVar.f201150g.f(params, zBooleanValue).map(new lxb.c(i21, new lu5.o(params, i21)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            case 12:
                com.revolut.retail.feature.travel_status.impl.ui.flow.b bVar5 = (com.revolut.retail.feature.travel_status.impl.ui.flow.b) obj4;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                TravelStatusFlowContract$Step step7 = (TravelStatusFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof TravelStatusFlowContract$Step.Overview) {
                    TravelStatusOverviewScreen travelStatusOverviewScreen = new TravelStatusOverviewScreen(TravelStatusOverviewScreenContract$InputData.f104316a);
                    c2l.c block8 = new c2l.c(bVar5, i3);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    travelStatusOverviewScreen.H = block8;
                    return travelStatusOverviewScreen;
                }
                if (step7 instanceof TravelStatusFlowContract$Step.Partner) {
                    TravelStatusPartnerScreen travelStatusPartnerScreen = new TravelStatusPartnerScreen(new TravelStatusPartnerScreenContract$InputData(((TravelStatusFlowContract$Step.Partner) step7).f104306a));
                    c2l.c block9 = new c2l.c(bVar5, 2);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    travelStatusPartnerScreen.H = block9;
                    return travelStatusPartnerScreen;
                }
                if (step7 instanceof TravelStatusFlowContract$Step.Enrollment) {
                    TravelStatusFlowContract$Step.Enrollment enrollment = (TravelStatusFlowContract$Step.Enrollment) step7;
                    return new TravelStatusEnrollmentScreen(new TravelStatusEnrollmentScreenContract$InputData(enrollment.f104303a, enrollment.f104304b));
                }
                if (step7 instanceof TravelStatusFlowContract$Step.ProductArticle) {
                    ViewController viewControllerE1 = bVar5.e1(new ProductArticleDescriptor(((TravelStatusFlowContract$Step.ProductArticle) step7).f104310a, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, null, null, false, 56));
                    c2l.c block10 = new c2l.c(bVar5, 3);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    viewControllerE1.H = block10;
                    return viewControllerE1;
                }
                if (!(step7 instanceof TravelStatusFlowContract$Step.PartnerActionBottomSheet)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelStatusPartnerActionBottomSheetScreen travelStatusPartnerActionBottomSheetScreen = new TravelStatusPartnerActionBottomSheetScreen(new TravelStatusPartnerActionBottomSheetScreenContract$InputData(((TravelStatusFlowContract$Step.PartnerActionBottomSheet) step7).f104307a));
                bVar5.a(travelStatusPartnerActionBottomSheetScreen, new a8a.a(bVar5, step7, 9));
                return travelStatusPartnerActionBottomSheetScreen;
            case 13:
                UUID feedId = (UUID) obj2;
                c30.a entry = (c30.a) obj3;
                Intrinsics.checkNotNullParameter(feedId, "feedId");
                Intrinsics.checkNotNullParameter(entry, "entry");
                ((c30.h) obj4).f20850c.f(c30.h.b(feedId), entry);
                return Unit.f186387a;
            case 14:
                com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.b bVar6 = (com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.b) obj4;
                TaxHubAssessmentFlowContract$Step step8 = (TaxHubAssessmentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof TaxHubAssessmentFlowContract$Step.MakePayment) {
                    TaxHubAssessmentFlowContract$Step.MakePayment makePayment = (TaxHubAssessmentFlowContract$Step.MakePayment) step8;
                    TaxHubPaymentFlow taxHubPaymentFlow = new TaxHubPaymentFlow(new TaxHubPaymentFlowContract$InputData(makePayment.f74251a, makePayment.f74252b, makePayment.d));
                    byc.a block11 = new byc.a(bVar6, makePayment, 17);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    taxHubPaymentFlow.H = block11;
                    return taxHubPaymentFlow;
                }
                if (step8 instanceof TaxHubAssessmentFlowContract$Step.TaxAssessment) {
                    TaxHubAssessmentFlowContract$Step.TaxAssessment taxAssessment = (TaxHubAssessmentFlowContract$Step.TaxAssessment) step8;
                    TaxHubAssessmentScreen taxHubAssessmentScreen = new TaxHubAssessmentScreen(new TaxHubAssessmentScreenContract$InputData(taxAssessment.f74255b, taxAssessment.f74254a));
                    t block12 = new t(bVar6, 20);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    taxHubAssessmentScreen.H = block12;
                    return taxHubAssessmentScreen;
                }
                if (!(step8 instanceof TaxHubAssessmentFlowContract$Step.TransactionExport)) {
                    throw new NoWhenBranchMatchedException();
                }
                TaxHubAssessmentFlowContract$Step.TransactionExport transactionExport = (TaxHubAssessmentFlowContract$Step.TransactionExport) step8;
                TaxHubTransactionExportFlow taxHubTransactionExportFlow = new TaxHubTransactionExportFlow(new TaxHubTransactionExportFlowContract$InputData(transactionExport.f74258c, transactionExport.f74256a, transactionExport.f74257b));
                byc.a block13 = new byc.a(bVar6, transactionExport, 18);
                Intrinsics.checkNotNullParameter(block13, "block");
                taxHubTransactionExportFlow.H = block13;
                return taxHubTransactionExportFlow;
            case 15:
                c3e.c cVar = (c3e.c) obj4;
                f3e.b params2 = (f3e.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(params2, "params");
                String carouselId = cVar.f20941c;
                if (carouselId == null) {
                    return efm.r.empty();
                }
                t1 t1Var = cVar.f20939a;
                params2.getClass();
                Integer numValueOf = Integer.valueOf(params2.f131960a);
                Intrinsics.checkNotNullParameter(new t1e.l(carouselId, numValueOf), "params");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                g2e.w wVar = (g2e.w) t1Var.f185240b;
                g2e.u params3 = new g2e.u(carouselId, 12, null, numValueOf);
                g2e.c0 c0Var = (g2e.c0) wVar;
                c0Var.getClass();
                Intrinsics.checkNotNullParameter(params3, "params");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                String strZ = c0Var.d.z();
                x4l.c cVar2 = c0Var.f139979g;
                Intrinsics.checkNotNullParameter(carouselId, "carouselId");
                vkm.d dVarB = cVar2.b(new g2e.u(carouselId, 12, strZ, numValueOf), loadingStrategy);
                skm.p0 p0Var = skm.p0.f264001a;
                return rd0.e.c(dVarB, elm.f.f127540b).map(new c2i.c(new t(params2, 22), 13));
            case 16:
                com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a aVar11 = (com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DeFiExchangeSummaryContract$ModalStep step9 = (DeFiExchangeSummaryContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof DeFiExchangeSummaryContract$ModalStep.RiskConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                i46.a aVar12 = aVar11.f71781w;
                DeFiAssetRiskContent content = ((DeFiExchangeSummaryContract$ModalStep.RiskConfirmation) step9).f71773a;
                aVar12.getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                b36.c cVarI = hx7.l.I(content, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 1);
                lw0.a aVar13 = new lw0.a(cVarI.f12009a, null, new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_warning, GlyphImageTint.WARNING.f59933a, null, 4)), null, false, 26);
                dii.i iVar = new dii.i(cVarI.f12010b);
                aw0.g gVar2 = new aw0.g(new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.d, null, null, false, null, null, 1016), (Clause) null, (aw0.f) null, 25);
                k9 value = k9.Crypto;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar13, gVar2, new AnalyticsProduct.Retail(value), null, iVar, 8));
                byc.a block14 = new byc.a(aVar11, step9, 19);
                Intrinsics.checkNotNullParameter(block14, "block");
                actionsBottomSheetController3.H = block14;
                return actionsBottomSheetController3;
            case 17:
                String addressString = (String) obj2;
                LocationDomain address = (LocationDomain) obj3;
                Intrinsics.checkNotNullParameter(addressString, "addressString");
                Intrinsics.checkNotNullParameter(address, "address");
                ((ne0.d) obj4).f(c49.d.k(addressString), new a49.b(address.f78066a, address.f78067b));
                return Unit.f186387a;
            case 18:
                StructuredReferenceTransferNoteScreen structuredReferenceTransferNoteScreen = (StructuredReferenceTransferNoteScreen) obj4;
                InputTextDelegate.Model data2 = (InputTextDelegate.Model) obj2;
                InputText field2 = (InputText) obj3;
                KProperty[] kPropertyArr2 = StructuredReferenceTransferNoteScreen.S;
                Intrinsics.checkNotNullParameter(data2, "data");
                Intrinsics.checkNotNullParameter(field2, "field");
                Object obj7 = data2.P;
                StructuredReferenceItemsMapper$ReferenceMaskConfig structuredReferenceItemsMapper$ReferenceMaskConfig = obj7 instanceof StructuredReferenceItemsMapper$ReferenceMaskConfig ? (StructuredReferenceItemsMapper$ReferenceMaskConfig) obj7 : null;
                if (structuredReferenceItemsMapper$ReferenceMaskConfig == null) {
                    return null;
                }
                String strA = i4k.o.a(data2, structuredReferenceItemsMapper$ReferenceMaskConfig.f102091b);
                return new zp0.y(field2.getInnerEditText(), null, structuredReferenceItemsMapper$ReferenceMaskConfig.f102091b, new abf.c(structuredReferenceTransferNoteScreen, data2, 10), data2.f52580a, strA != null ? DigitsKeyListener.getInstance(strA) : null, true, 2);
            case 19:
                final com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar2 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) obj4;
                h3j.y yVar = fVar2.c0;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                final ChatTransferScreenContract$ModalStep step10 = (ChatTransferScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof ChatTransferScreenContract$ModalStep.DeleteRevolutContactChatDialog) {
                    RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(((im3.c) fVar2.f80167a0).a());
                    final Object[] objArr2 = null == true ? 1 : 0;
                    Function1 block15 = new Function1() { // from class: c5a.x
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (objArr2) {
                                case 0:
                                    eii.k output = (eii.k) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (Intrinsics.f(output, eii.g.f126653a)) {
                                        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar3 = fVar2;
                                        fVar3.l2(new f0(fVar3, step10, null, 0), new bwc.i(1, fVar3, com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f.class, "handleGenericError", "handleGenericError(Ljava/lang/Throwable;)Z", 0, 4));
                                    }
                                    break;
                                case 1:
                                    dii.g outputData = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.f) {
                                        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar4 = fVar2;
                                        fVar4.l2(new f0(fVar4, step10, null, 1), new bwc.i(1, fVar4, com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f.class, "handleGenericError", "handleGenericError(Ljava/lang/Throwable;)Z", 0, 5));
                                    }
                                    break;
                                default:
                                    dii.g outputData2 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 instanceof dii.f) {
                                        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar5 = fVar2;
                                        fVar5.l2(new f0(fVar5, step10, null, 2), new bwc.i(1, fVar5, com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f.class, "handleGenericError", "handleGenericError(Ljava/lang/Throwable;)Z", 0, 6));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block15, "block");
                    rowActionsBottomSheetController.H = block15;
                    return rowActionsBottomSheetController;
                }
                if (step10 instanceof ChatTransferScreenContract$ModalStep.DeleteBankChatDialog) {
                    actionsBottomSheetController = new ActionsBottomSheetController(yVar.a(j.c(((ChatTransferScreenContract$ModalStep.DeleteBankChatDialog) step10).f80153a)));
                    Function1 block16 = new Function1() { // from class: c5a.x
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i3) {
                                case 0:
                                    eii.k output = (eii.k) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (Intrinsics.f(output, eii.g.f126653a)) {
                                        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar3 = fVar2;
                                        fVar3.l2(new f0(fVar3, step10, null, 0), new bwc.i(1, fVar3, com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f.class, "handleGenericError", "handleGenericError(Ljava/lang/Throwable;)Z", 0, 4));
                                    }
                                    break;
                                case 1:
                                    dii.g outputData = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.f) {
                                        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar4 = fVar2;
                                        fVar4.l2(new f0(fVar4, step10, null, 1), new bwc.i(1, fVar4, com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f.class, "handleGenericError", "handleGenericError(Ljava/lang/Throwable;)Z", 0, 5));
                                    }
                                    break;
                                default:
                                    dii.g outputData2 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 instanceof dii.f) {
                                        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar5 = fVar2;
                                        fVar5.l2(new f0(fVar5, step10, null, 2), new bwc.i(1, fVar5, com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f.class, "handleGenericError", "handleGenericError(Ljava/lang/Throwable;)Z", 0, 6));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block16, "block");
                    actionsBottomSheetController.H = block16;
                } else {
                    if (!(step10 instanceof ChatTransferScreenContract$ModalStep.DeleteCardChatDialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    actionsBottomSheetController = new ActionsBottomSheetController(yVar.a(((ChatTransferScreenContract$ModalStep.DeleteCardChatDialog) step10).f80154a.f81495a.a()));
                    final int i22 = 2;
                    Function1 block17 = new Function1() { // from class: c5a.x
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i22) {
                                case 0:
                                    eii.k output = (eii.k) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (Intrinsics.f(output, eii.g.f126653a)) {
                                        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar3 = fVar2;
                                        fVar3.l2(new f0(fVar3, step10, null, 0), new bwc.i(1, fVar3, com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f.class, "handleGenericError", "handleGenericError(Ljava/lang/Throwable;)Z", 0, 4));
                                    }
                                    break;
                                case 1:
                                    dii.g outputData = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.f) {
                                        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar4 = fVar2;
                                        fVar4.l2(new f0(fVar4, step10, null, 1), new bwc.i(1, fVar4, com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f.class, "handleGenericError", "handleGenericError(Ljava/lang/Throwable;)Z", 0, 5));
                                    }
                                    break;
                                default:
                                    dii.g outputData2 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 instanceof dii.f) {
                                        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar5 = fVar2;
                                        fVar5.l2(new f0(fVar5, step10, null, 2), new bwc.i(1, fVar5, com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f.class, "handleGenericError", "handleGenericError(Ljava/lang/Throwable;)Z", 0, 6));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    actionsBottomSheetController.H = block17;
                }
                return actionsBottomSheetController;
            case 20:
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText field3 = (InputText) obj3;
                KProperty[] kPropertyArr3 = MissingFieldsScreen.S;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field3, "field");
                return ((r4j.c) ((r4j.a) ((b3j.w) ((MissingFieldsScreen) obj4).P.getValue()).f12119j.get())).a(model, field3);
            case 21:
                final com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a aVar14 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a) obj4;
                n4j.i iVar2 = aVar14.o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                final MissingFieldsScreenContract$ModalStep step11 = (MissingFieldsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof MissingFieldsScreenContract$ModalStep.DefinitionSelector) {
                    DefinitionSelectorController definitionSelectorControllerA = iVar2.a(((MissingFieldsScreenContract$ModalStep.DefinitionSelector) step11).f99765b);
                    final Object[] objArr3 = null == true ? 1 : 0;
                    Function1 block18 = new Function1() { // from class: c5j.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (objArr3) {
                                case 0:
                                    o3j.b output = (o3j.b) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a aVar15 = aVar14;
                                    d5j.a aVar16 = aVar15.f99769q;
                                    MissingFieldsScreenContract$ModalStep.DefinitionSelector definitionSelector = (MissingFieldsScreenContract$ModalStep.DefinitionSelector) step11;
                                    List currentDefinitions = definitionSelector.f99764a;
                                    Field$BackendDefinition.DropdownDefinition dropdownDefinition = definitionSelector.f99765b;
                                    String choiceId = output.f221827a.f99693a;
                                    aVar16.getClass();
                                    Intrinsics.checkNotNullParameter(currentDefinitions, "currentDefinitions");
                                    Intrinsics.checkNotNullParameter(dropdownDefinition, "dropdownDefinition");
                                    Intrinsics.checkNotNullParameter(choiceId, "choiceId");
                                    aVar15.H2(aVar15.f99772t, new c0(12, d5j.a.b(currentDefinitions, Field$BackendDefinition.DropdownDefinition.b(dropdownDefinition, choiceId))));
                                    break;
                                default:
                                    m4j.h output2 = (m4j.h) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a aVar17 = aVar14;
                                    d5j.a aVar18 = aVar17.f99769q;
                                    MissingFieldsScreenContract$ModalStep.SearchList searchList = (MissingFieldsScreenContract$ModalStep.SearchList) step11;
                                    List currentDefinitions2 = searchList.f99766a;
                                    Field$BackendDefinition.SearchList searchListDefinition = searchList.f99767b;
                                    String selected = output2.f202739a.f60293a;
                                    aVar18.getClass();
                                    Intrinsics.checkNotNullParameter(currentDefinitions2, "currentDefinitions");
                                    Intrinsics.checkNotNullParameter(searchListDefinition, "searchListDefinition");
                                    Intrinsics.checkNotNullParameter(selected, "selected");
                                    aVar17.H2(aVar17.f99772t, new c0(12, d5j.a.b(currentDefinitions2, Field$BackendDefinition.SearchList.b(searchListDefinition, n4j.j.a(searchListDefinition.f99718a.f60271a, searchListDefinition.f99719b, selected)))));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    definitionSelectorControllerA.H = block18;
                    return definitionSelectorControllerA;
                }
                if (!(step11 instanceof MissingFieldsScreenContract$ModalStep.SearchList)) {
                    throw new NoWhenBranchMatchedException();
                }
                SearchListScreen searchListScreenB = iVar2.b(((MissingFieldsScreenContract$ModalStep.SearchList) step11).f99767b);
                Function1 block19 = new Function1() { // from class: c5j.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        switch (i3) {
                            case 0:
                                o3j.b output = (o3j.b) obj8;
                                Intrinsics.checkNotNullParameter(output, "output");
                                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a aVar15 = aVar14;
                                d5j.a aVar16 = aVar15.f99769q;
                                MissingFieldsScreenContract$ModalStep.DefinitionSelector definitionSelector = (MissingFieldsScreenContract$ModalStep.DefinitionSelector) step11;
                                List currentDefinitions = definitionSelector.f99764a;
                                Field$BackendDefinition.DropdownDefinition dropdownDefinition = definitionSelector.f99765b;
                                String choiceId = output.f221827a.f99693a;
                                aVar16.getClass();
                                Intrinsics.checkNotNullParameter(currentDefinitions, "currentDefinitions");
                                Intrinsics.checkNotNullParameter(dropdownDefinition, "dropdownDefinition");
                                Intrinsics.checkNotNullParameter(choiceId, "choiceId");
                                aVar15.H2(aVar15.f99772t, new c0(12, d5j.a.b(currentDefinitions, Field$BackendDefinition.DropdownDefinition.b(dropdownDefinition, choiceId))));
                                break;
                            default:
                                m4j.h output2 = (m4j.h) obj8;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a aVar17 = aVar14;
                                d5j.a aVar18 = aVar17.f99769q;
                                MissingFieldsScreenContract$ModalStep.SearchList searchList = (MissingFieldsScreenContract$ModalStep.SearchList) step11;
                                List currentDefinitions2 = searchList.f99766a;
                                Field$BackendDefinition.SearchList searchListDefinition = searchList.f99767b;
                                String selected = output2.f202739a.f60293a;
                                aVar18.getClass();
                                Intrinsics.checkNotNullParameter(currentDefinitions2, "currentDefinitions");
                                Intrinsics.checkNotNullParameter(searchListDefinition, "searchListDefinition");
                                Intrinsics.checkNotNullParameter(selected, "selected");
                                aVar17.H2(aVar17.f99772t, new c0(12, d5j.a.b(currentDefinitions2, Field$BackendDefinition.SearchList.b(searchListDefinition, n4j.j.a(searchListDefinition.f99718a.f60271a, searchListDefinition.f99719b, selected)))));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block19, "block");
                searchListScreenB.H = block19;
                return searchListScreenB;
            case 22:
                c64.e eVar4 = (c64.e) obj4;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter((CalculatorFlowContract$Step) obj3, "<unused var>");
                CalculatorScreen calculatorScreen = new CalculatorScreen(new CalculatorScreenContract$InputData(R$drawable.uikit_icn_24_cross, (Long) null, (Long) null, (fu3.a) null, eVar4.f21624q.f67184a, 24));
                t block20 = new t(eVar4, 28);
                Intrinsics.checkNotNullParameter(block20, "block");
                calculatorScreen.H = block20;
                return calculatorScreen;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new c64.p(((c64.d0) obj4).f21622b.f67186a, c64.d0.a(""), u.c(new FullScreenStateDelegate.Model("ID_ERROR_ITEM", new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, null, null, false, 0, 0, 32596)));
            case 24:
                return a(obj2, obj3);
            case 25:
                final com.revolut.feature.payments_migration.impl.ui.flow.c cVar3 = (com.revolut.feature.payments_migration.impl.ui.flow.c) obj4;
                PaymentsMigrationFlowContract$Step step12 = (PaymentsMigrationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof PaymentsMigrationFlowContract$Step.MoveSubscriptions) {
                    MigrateSubscriptionsController migrateSubscriptionsController = new MigrateSubscriptionsController();
                    Function1 block21 = new Function1() { // from class: c6a.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i3) {
                                case 0:
                                    p6a.g outputData = (p6a.g) obj8;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    cVar3.J2(outputData.f233238a, outputData.f233239b, outputData.f233240c);
                                    return Unit.f186387a;
                                default:
                                    g6a.j outputData2 = (g6a.j) obj8;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof g6a.h;
                                    com.revolut.feature.payments_migration.impl.ui.flow.c cVar4 = cVar3;
                                    if (z3) {
                                        g6a.h hVar2 = (g6a.h) outputData2;
                                        oki.h.t2(cVar4, cVar4.o, new PaymentsMigrationFlowContract$Step.SearchInBlock(hVar2.f140904c, hVar2.d, hVar2.f140902a, hVar2.f140903b), false, null, false, 14);
                                    } else {
                                        if (!(outputData2 instanceof g6a.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        g6a.i iVar3 = (g6a.i) outputData2;
                                        cVar4.J2(iVar3.f140905a, iVar3.f140906b, iVar3.f140907c);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    migrateSubscriptionsController.H = block21;
                    return migrateSubscriptionsController;
                }
                if (step12 instanceof PaymentsMigrationFlowContract$Step.SearchInBlock) {
                    PaymentsMigrationFlowContract$Step.SearchInBlock searchInBlock = (PaymentsMigrationFlowContract$Step.SearchInBlock) step12;
                    SearchInBlockController searchInBlockController = new SearchInBlockController(new SearchInBlockControllerContract$InputData(searchInBlock.f80258c, searchInBlock.d, searchInBlock.f80256a, searchInBlock.f80257b));
                    final Object[] objArr4 = null == true ? 1 : 0;
                    Function1 block22 = new Function1() { // from class: c6a.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (objArr4) {
                                case 0:
                                    p6a.g outputData = (p6a.g) obj8;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    cVar3.J2(outputData.f233238a, outputData.f233239b, outputData.f233240c);
                                    return Unit.f186387a;
                                default:
                                    g6a.j outputData2 = (g6a.j) obj8;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof g6a.h;
                                    com.revolut.feature.payments_migration.impl.ui.flow.c cVar4 = cVar3;
                                    if (z3) {
                                        g6a.h hVar2 = (g6a.h) outputData2;
                                        oki.h.t2(cVar4, cVar4.o, new PaymentsMigrationFlowContract$Step.SearchInBlock(hVar2.f140904c, hVar2.d, hVar2.f140902a, hVar2.f140903b), false, null, false, 14);
                                    } else {
                                        if (!(outputData2 instanceof g6a.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        g6a.i iVar3 = (g6a.i) outputData2;
                                        cVar4.J2(iVar3.f140905a, iVar3.f140906b, iVar3.f140907c);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block22, "block");
                    searchInBlockController.H = block22;
                    return searchInBlockController;
                }
                if (step12 instanceof PaymentsMigrationFlowContract$Step.AccountDetailsPaymentMigration) {
                    PaymentsMigrationFlowContract$Step.AccountDetailsPaymentMigration accountDetailsPaymentMigration = (PaymentsMigrationFlowContract$Step.AccountDetailsPaymentMigration) step12;
                    return gc0.c.b(new AccountDetailsPaymentController(new AccountDetailsPaymentControllerContract$InputData(accountDetailsPaymentMigration.f80251a, accountDetailsPaymentMigration.f80252b)), new com.revolut.feature.payments_migration.impl.ui.flow.a(cVar3));
                }
                if (!(step12 instanceof PaymentsMigrationFlowContract$Step.CardsPaymentMigration)) {
                    throw new NoWhenBranchMatchedException();
                }
                PaymentsMigrationFlowContract$Step.CardsPaymentMigration cardsPaymentMigration = (PaymentsMigrationFlowContract$Step.CardsPaymentMigration) step12;
                return gc0.c.b(new CardsPaymentController(new CardsPaymentControllerContract$InputData(cardsPaymentMigration.f80253a, cardsPaymentMigration.f80254b)), new com.revolut.feature.payments_migration.impl.ui.flow.b(cVar3));
            case 26:
                c6h.c params4 = (c6h.c) obj2;
                i6h.d page = (i6h.d) obj3;
                Intrinsics.checkNotNullParameter(params4, "params");
                Intrinsics.checkNotNullParameter(page, "page");
                ((c6h.e) obj4).f21805b.f(params4.a(), page);
                return Unit.f186387a;
            case 27:
                return b(obj2, obj3);
            case 28:
                com.revolut.feature.junior.accounts.impl.ui.saving_picker.flow.a aVar15 = (com.revolut.feature.junior.accounts.impl.ui.saving_picker.flow.a) obj4;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                JuniorSavingChildPickerFlowContract$Step step13 = (JuniorSavingChildPickerFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!Intrinsics.f(step13, JuniorSavingChildPickerFlowContract$Step.Picker.f76703a)) {
                    throw new NoWhenBranchMatchedException();
                }
                JuniorSavingChildPickerScreen juniorSavingChildPickerScreen = new JuniorSavingChildPickerScreen();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                c7e.i block23 = new c7e.i(ref$ObjectRef, aVar15, i3);
                Intrinsics.checkNotNullParameter(block23, "block");
                juniorSavingChildPickerScreen.H = block23;
                juniorSavingChildPickerScreen.l2(new c88.c(ref$ObjectRef, aVar15, LazyFlowCoordinator3, i2));
                return juniorSavingChildPickerScreen;
            default:
                c9f.g params5 = (c9f.g) obj2;
                List brokersList = (List) obj3;
                Intrinsics.checkNotNullParameter(params5, "params");
                Intrinsics.checkNotNullParameter(brokersList, "brokersList");
                ((ne0.j) ((c9f.b) obj4).f22369b.get()).f(c9f.b.a(params5), brokersList);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ a(ne0.d dVar, c49.d dVar2) {
        this.f19317a = 17;
        this.f19318b = dVar;
    }
}
