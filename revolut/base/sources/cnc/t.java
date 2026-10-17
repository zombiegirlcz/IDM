package cnc;

import android.os.Parcelable;
import av8.k;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import c84.t;
import ch.qos.logback.core.net.SyslogConstants;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.f24.impl.ui.F24FlowContract$Step;
import com.revolut.feature.apm.bills.f24.impl.ui.entry.F24EntryController;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.FormsListScreen;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.FormsListScreenContract$InputData;
import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType$DeviceContact$Phone;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserBannerContent;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserEmptyState;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData$AdditionalConfig$CustomEnableContactPermissionSubtitle;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserMode;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsPrimaryButtonClause;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import com.revolut.feature.credit.application.models.credit_health.CreditHealthContext;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.CoBorrowerConsentInitiatorFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.request_consent.RequestConsentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.request_consent.RequestConsentScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.CreditAddonFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.CreditAddonFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_health.flow.CreditHealthFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_health.flow.CreditHealthFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.KontomatikIncomeCheckFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.KontomatikIncomeCheckFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.external_bank_sign_in.KontomatikExternalBankSignInController;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.popup.KontomatikPopupScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.popup.KontomatikPopupScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.selection.KontomatikSelectionController;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInController;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.RejectedController;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.RejectedControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedLazyFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedLazyFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedRootFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedRootFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.SepaDirectDebitFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.SepaDirectDebitFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.SepaDirectDebitRepaymentMethodContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.SepaDirectDebitRepaymentMethodController;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.SepaDirectDebitSetUpContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.SepaDirectDebitSetUpController;
import com.revolut.feature.credit.card.api.models.cancellation.PayoffBreakdown;
import com.revolut.feature.credit.card.api.models.cancellation.RepaymentDeferral;
import com.revolut.feature.credit.card.impl.ui.cancellation.checkout.CancellationCheckoutScreen;
import com.revolut.feature.credit.card.impl.ui.cancellation.checkout.CancellationCheckoutScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.CreditCardCancellationFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.CreditCardCancellationFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.FreelancerAcquiringPaymentFiltersScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.dialog.date_picker.FreelancerDatePickerScreen;
import com.revolut.feature.freelancer.impl.ui.dialog.date_picker.FreelancerDatePickerScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsuranceActivateCoverageWidget;
import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsurancePortal;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation.InsuranceCoverageActivationFlow;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation.InsuranceCoverageActivationFlowContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.SchemeInsuranceDetailsScreenContract$ModalStep;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.card_claims.CardClaimsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.card_claims.CardClaimsScreenContract$InputData;
import com.revolut.feature.kyc.api.navigation.document_collection.DocumentCollectionInputData;
import com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionController;
import com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionControllerContract$InputData;
import com.revolut.feature.kyc.impl.document_collection.flow.DocumentCollectionFlowContract$Step;
import com.revolut.feature.pay_bills_taxes.api.navigation.FormFlowInputData;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.AddSplitItemControllerContract$ModalStep;
import com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.PricingPlansPromptResolverFlowContract$Step;
import com.revolut.feature.robo.impl.ui.flow.edit_goal.EditGoalFlow;
import com.revolut.feature.robo.impl.ui.screen.manage_goal.ManageGoalScreenContract$ModalStep;
import com.revolut.feature.security_hub.api.models.DigitizedCards;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.edit.EditCycleScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.edit.EditCycleScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.settings.SettingsContract$ModalStep;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flow.add_card.AddCardFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.TopupWithNewCardFlow;
import com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreen;
import com.revolut.feature.trading_orders.api.invest.placement.locked_period.SecurityAssetBalanceBreakdownScreenDescriptor$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.ScreenerMetaCollectionScreenContract$ModalStep;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipControllerDescriptor;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowInputData;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreenContract$ModalStep;
import com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserInputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.models.CategoryBudgetEditingInfo;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import com.revolut.tracking.v3.InvestNewOrderTypeChangedContext;
import com.revolut.trading.orders.R$string;
import com.revolut.trading.orders.TradingOrdersApi$Toggles;
import com.revolut.trading.orders.ui.invest.placement.expiry.ExpiryDateSelectorScreen;
import com.revolut.trading.orders.ui.invest.placement.models.OrderTypeWrapper;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreen;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$ModalStep;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreen;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreenContract$InputData;
import com.revolut.trading.orders.ui.invest.placement.tutorial.TutorialScreen;
import com.revolut.trading.orders.ui.invest.placement.tutorial.TutorialScreenContract$InputData;
import com.revolut.trading.orders.ui.screens.pocket_picker.SourcePocketPickerScreenContract$ModalStep;
import cuc.e0;
import cul.j1;
import cul.k0;
import cul.n0;
import ef9.f;
import grl.b6;
import grl.d6;
import grl.k9;
import hs3.k1;
import hs3.m1;
import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nel.z;
import oki.h;
import rd0.d;
import vkm.j2;
import wc4.g;
import wc4.i;
import yc4.p;
import yc4.q;
import yc4.r;
import yc4.s;
import yc4.u;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25401b;

    public /* synthetic */ t(Object obj2, int i) {
        this.f25400a = i;
        this.f25401b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        ttl.n hVar;
        Iterator it8;
        AccountCellItemDelegate.Model modelA;
        AccountCellItemDelegate.Model modelA2;
        Clause textLocalisedClause;
        Custom custom;
        Clause textLocalisedClause2;
        Custom custom2;
        com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f25401b;
        String securityRef = eVar.f106923o0;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        InvestOrderEditScreenContract$ModalStep step = (InvestOrderEditScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof InvestOrderEditScreenContract$ModalStep.SelectOrderType)) {
            if (step instanceof InvestOrderEditScreenContract$ModalStep.SourcePocketPicker) {
                InvestOrderEditScreenContract$ModalStep.SourcePocketPicker step2 = (InvestOrderEditScreenContract$ModalStep.SourcePocketPicker) step;
                bul.m mVar = eVar.E;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(step2, "step");
                odf.b bVar = ((jte.d) mVar.f18908a).c(TradingOrdersApi$Toggles.TradingFlexibleCurrency.f106796c) ? new odf.b(step2.f106897a, step2.f106898b) : null;
                List list = step2.f106899c;
                nel.n nVar = step2.e;
                ViewController viewControllerE1 = eVar.e1(new odf.c(new odf.f(list, step2.d, step2.f106898b, new odf.a(nVar), bVar, new odf.d(nVar.f214596b))));
                com.revolut.trading.orders.ui.invest.placement.screens.edit.a block = new com.revolut.trading.orders.ui.invest.placement.screens.edit.a(1, 8, com.revolut.trading.orders.ui.invest.placement.screens.edit.e.class, eVar, "handleSourcePocketPickerScreenResult", "handleSourcePocketPickerScreenResult(Lcom/revolut/feature/trading_orders/api/ui/pocket_picker/SourcePocketPickerContract$OutputData;)Lkotlinx/coroutines/Job;");
                Intrinsics.checkNotNullParameter(block, "block");
                viewControllerE1.H = block;
                return viewControllerE1;
            }
            if (step instanceof InvestOrderEditScreenContract$ModalStep.Tutorial) {
                InvestOrderEditScreenContract$ModalStep.Tutorial tutorial = (InvestOrderEditScreenContract$ModalStep.Tutorial) step;
                TutorialScreen tutorialScreen = new TutorialScreen(new TutorialScreenContract$InputData(tutorial.f106904a, tutorial.f106905b, tutorial.f106906c));
                k0 block2 = new k0(eVar, 8);
                Intrinsics.checkNotNullParameter(block2, "block");
                tutorialScreen.H = block2;
                return tutorialScreen;
            }
            if (step instanceof InvestOrderEditScreenContract$ModalStep.TargetPrice) {
                InvestOrderEditScreenContract$ModalStep.TargetPrice targetPrice = (InvestOrderEditScreenContract$ModalStep.TargetPrice) step;
                TargetPriceScreen targetPriceScreen = new TargetPriceScreen(new TargetPriceScreenContract$InputData(securityRef, targetPrice.f106901a, targetPrice.f106902b, targetPrice.f106903c), new oul.j(targetPrice.d));
                k0 block3 = new k0(eVar, 9);
                Intrinsics.checkNotNullParameter(block3, "block");
                targetPriceScreen.H = block3;
                return targetPriceScreen;
            }
            if (step instanceof InvestOrderEditScreenContract$ModalStep.ScheduleSettings) {
                InvestOrderEditScreenContract$ModalStep.ScheduleSettings scheduleSettings = (InvestOrderEditScreenContract$ModalStep.ScheduleSettings) step;
                ViewController viewControllerE12 = eVar.e1(new pdf.a(new pdf.b(scheduleSettings.f106891a, scheduleSettings.f106892b, scheduleSettings.f106893c, true, scheduleSettings.d, scheduleSettings.e, scheduleSettings.f)));
                k0 block4 = new k0(eVar, 11);
                Intrinsics.checkNotNullParameter(block4, "block");
                viewControllerE12.H = block4;
                return viewControllerE12;
            }
            if (!(step instanceof InvestOrderEditScreenContract$ModalStep.ExpiryDate)) {
                if (step instanceof InvestOrderEditScreenContract$ModalStep.TaaAllowanceDetail) {
                    return eVar.e1(new ygh.a(((InvestOrderEditScreenContract$ModalStep.TaaAllowanceDetail) step).f106900a));
                }
                if (step instanceof InvestOrderEditScreenContract$ModalStep.CommissionFreeTradeDialog) {
                    return eVar.Y.a(((InvestOrderEditScreenContract$ModalStep.CommissionFreeTradeDialog) step).f106887a);
                }
                if (!(step instanceof InvestOrderEditScreenContract$ModalStep.BalanceBreakdown)) {
                    throw new NoWhenBranchMatchedException();
                }
                InvestOrderEditScreenContract$ModalStep.BalanceBreakdown balanceBreakdown = (InvestOrderEditScreenContract$ModalStep.BalanceBreakdown) step;
                return eVar.e1(new gdf.a(new SecurityAssetBalanceBreakdownScreenDescriptor$InputData(balanceBreakdown.f106885a, eVar.p0, balanceBreakdown.f106886b)));
            }
            InvestOrderEditScreenContract$ModalStep.ExpiryDate expiryDate = (InvestOrderEditScreenContract$ModalStep.ExpiryDate) step;
            bul.i iVar = eVar.G;
            LocalDate expiryDate2 = expiryDate.f106888a;
            k4l.k expiryDateType = expiryDate.f106889b;
            List calendarExcludeDates = expiryDate.f106890c;
            k0 block5 = new k0(eVar, 12);
            iVar.getClass();
            Intrinsics.checkNotNullParameter(securityRef, "securityRef");
            Intrinsics.checkNotNullParameter(expiryDate2, "expiryDate");
            Intrinsics.checkNotNullParameter(expiryDateType, "expiryDateType");
            Intrinsics.checkNotNullParameter(calendarExcludeDates, "calendarExcludeDates");
            Intrinsics.checkNotNullParameter(block5, "onResult");
            switch (bul.h.f18907a[expiryDateType.ordinal()]) {
                case 1:
                    hVar = ttl.m.f274458a;
                    break;
                case 2:
                    hVar = ttl.i.f274450a;
                    break;
                case 3:
                    hVar = ttl.k.f274454a;
                    break;
                case 4:
                    hVar = ttl.j.f274452a;
                    break;
                case 5:
                    hVar = ttl.l.f274456a;
                    break;
                case 6:
                    hVar = new ttl.h(expiryDate2);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            ExpiryDateSelectorScreen expiryDateSelectorScreen = new ExpiryDateSelectorScreen(new ttl.o(securityRef, hVar, calendarExcludeDates));
            Intrinsics.checkNotNullParameter(block5, "block");
            expiryDateSelectorScreen.H = block5;
            return expiryDateSelectorScreen;
        }
        InvestOrderEditScreenContract$ModalStep.SelectOrderType selectOrderType = (InvestOrderEditScreenContract$ModalStep.SelectOrderType) step;
        eul.v vVar = eVar.f106924p;
        List availableOrderTypes = selectOrderType.f106894a;
        r0 previousOrderType = selectOrderType.f106895b;
        bfl.g orderSide = selectOrderType.f106896c;
        nel.n instrument = selectOrderType.d;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(availableOrderTypes, "availableOrderTypes");
        Intrinsics.checkNotNullParameter(previousOrderType, "selectedOrderType");
        Intrinsics.checkNotNullParameter(orderSide, "tradeSide");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        List listP0 = d0.P0(availableOrderTypes, new eul.u());
        ArrayList arrayList = new ArrayList();
        for (Iterator it9 = listP0.iterator(); it9.hasNext(); it9 = it8) {
            OrderTypeWrapper orderTypeWrapper = (OrderTypeWrapper) it9.next();
            dsl.a aVar = vVar.f129657a;
            r0 selectedOrderType = orderTypeWrapper.getF106867b();
            ((dsl.b) aVar).getClass();
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(previousOrderType, "previousOrderType");
            Intrinsics.checkNotNullParameter(selectedOrderType, "selectedOrderType");
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            InvestNewOrderTypeChangedContext.a aVarNewBuilder = InvestNewOrderTypeChangedContext.newBuilder();
            b6 b6VarO = v04.b.O(orderSide);
            aVarNewBuilder.c();
            ((InvestNewOrderTypeChangedContext) aVarNewBuilder.f49761b).setOrderSide(b6VarO);
            d6 d6VarP = v04.b.P(previousOrderType);
            aVarNewBuilder.c();
            ((InvestNewOrderTypeChangedContext) aVarNewBuilder.f49761b).setPreviousOrderType(d6VarP);
            d6 d6VarP2 = v04.b.P(selectedOrderType);
            aVarNewBuilder.c();
            ((InvestNewOrderTypeChangedContext) aVarNewBuilder.f49761b).setSelectedOrderType(d6VarP2);
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            w0 w0VarA2 = AnalyticsContext.Companion.a(w0VarA);
            boolean z = orderTypeWrapper.getF106867b() == previousOrderType;
            String str = instrument.e;
            z zVar = instrument.f214597c;
            if (orderTypeWrapper instanceof OrderTypeWrapper.MarketOrderType) {
                r0 r0Var = r0.MARKET;
                xul.n nVarB = vVar.b(zVar);
                modelA2 = eul.v.a("MARKET_ORDER_VALUE_DIALOG_ITEM", nVarB.c(r0Var, null), nVarB.a(r0Var, orderSide, str), nVarB.b(orderSide, r0Var), z, true, OrderTypeWrapper.MarketOrderType.f106863b);
                it8 = it9;
            } else if (orderTypeWrapper instanceof OrderTypeWrapper.LimitOrderType) {
                OrderTypeWrapper.LimitOrderType limitOrderType = (OrderTypeWrapper.LimitOrderType) orderTypeWrapper;
                r0 r0Var2 = r0.LIMIT;
                xul.n nVarB2 = vVar.b(zVar);
                if (limitOrderType.f106860a) {
                    textLocalisedClause2 = nVarB2.a(r0Var2, orderSide, str);
                    it8 = it9;
                    custom2 = null;
                } else {
                    it8 = it9;
                    custom2 = null;
                    textLocalisedClause2 = new TextLocalisedClause(R$string.trading_orders_type_selector_unavailable_eu_etf_description, null, null, 14);
                }
                modelA2 = eul.v.a("LIMIT_ORDER_DIALOG_ITEM", nVarB2.c(r0Var2, custom2), textLocalisedClause2, nVarB2.b(orderSide, r0Var2), z, limitOrderType.f106860a, limitOrderType.f106861b);
            } else {
                it8 = it9;
                if (orderTypeWrapper instanceof OrderTypeWrapper.StopOrderType) {
                    OrderTypeWrapper.StopOrderType stopOrderType = (OrderTypeWrapper.StopOrderType) orderTypeWrapper;
                    r0 r0Var3 = r0.STOP;
                    xul.n nVarB3 = vVar.b(zVar);
                    if (stopOrderType.f106866a) {
                        textLocalisedClause = nVarB3.a(r0Var3, orderSide, str);
                        custom = null;
                    } else {
                        custom = null;
                        textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_type_selector_unavailable_eu_etf_description, null, null, 14);
                    }
                    modelA2 = eul.v.a("STOP_ORDER_DIALOG_ITEM", nVarB3.c(r0Var3, custom), textLocalisedClause, nVarB3.b(orderSide, r0Var3), z, stopOrderType.f106866a, stopOrderType.f106867b);
                } else {
                    if (!(orderTypeWrapper instanceof OrderTypeWrapper.RecurringOrderType)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (v13.d.q(orderSide)) {
                        r0 r0Var4 = r0.RECURRING;
                        xul.n nVarB4 = vVar.b(zVar);
                        modelA = eul.v.a("RECURRING_ORDER_DIALOG_ITEM", nVarB4.c(r0Var4, null), nVarB4.a(r0Var4, orderSide, str), nVarB4.b(orderSide, r0Var4), z, true, OrderTypeWrapper.RecurringOrderType.f106865b);
                    } else {
                        modelA = null;
                    }
                    modelA2 = modelA;
                }
            }
            AccountCellItemDelegate.Model modelE = modelA2 != null ? AccountCellItemDelegate.Model.e(modelA2, null, null, new AnalyticsContext(w0VarA2), 2097151) : null;
            if (modelE != null) {
                arrayList.add(modelE);
            }
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_order_types, null, null, 14), null, null, null, false, 30);
        int i = 10;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it10 = arrayList.iterator();
        while (it10.hasNext()) {
            arrayList2.add(new eii.a((AccountCellItemDelegate.Model) it10.next()));
        }
        k9 k9Var = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar2, null, arrayList2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null));
        k0 block6 = new k0(eVar, i);
        Intrinsics.checkNotNullParameter(block6, "block");
        rowActionsBottomSheetController.H = block6;
        return rowActionsBottomSheetController;
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a aVar = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a) this.f25401b;
        l80.e eVar = aVar.f73722p;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        FreelancerAcquiringPaymentFiltersScreenContract$ModalStep step = (FreelancerAcquiringPaymentFiltersScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, FreelancerAcquiringPaymentFiltersScreenContract$ModalStep.StartDateRangePicker.f73721a)) {
            LocalDate localDateE = ((l80.f) eVar).e();
            FreelancerDatePickerScreen freelancerDatePickerScreen = new FreelancerDatePickerScreen(new FreelancerDatePickerScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_from, null, null, 14), localDateE, null, null, localDateE, 12));
            n0 block = new n0(aVar, 5);
            Intrinsics.checkNotNullParameter(block, "block");
            freelancerDatePickerScreen.H = block;
            return freelancerDatePickerScreen;
        }
        if (!(step instanceof FreelancerAcquiringPaymentFiltersScreenContract$ModalStep.EndDateRangePicker)) {
            throw new NoWhenBranchMatchedException();
        }
        FreelancerAcquiringPaymentFiltersScreenContract$ModalStep.EndDateRangePicker endDateRangePicker = (FreelancerAcquiringPaymentFiltersScreenContract$ModalStep.EndDateRangePicker) step;
        LocalDate localDateE2 = ((l80.f) eVar).e();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_to, null, null, 14);
        LocalDate localDate = endDateRangePicker.f73720a;
        FreelancerDatePickerScreen freelancerDatePickerScreen2 = new FreelancerDatePickerScreen(new FreelancerDatePickerScreenContract$InputData(textLocalisedClause, localDate, null, localDate, localDateE2, 4));
        cui.v block2 = new cui.v(aVar, endDateRangePicker, 7);
        Intrinsics.checkNotNullParameter(block2, "block");
        freelancerDatePickerScreen2.H = block2;
        return freelancerDatePickerScreen2;
    }

    private final Object c(Object obj2, Object obj3) {
        cv7.r rVar = (cv7.r) this.f25401b;
        Function1 defaultErrorItem = (Function1) obj3;
        Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
        List list = (List) defaultErrorItem.invoke(new iii.d(14, null, false, false, null));
        EmbeddedInsuranceDetailScreenContract$InputData embeddedInsuranceDetailScreenContract$InputData = rVar.f109319a;
        return new cv7.m(list, new cv7.k(cv7.r.f(embeddedInsuranceDetailScreenContract$InputData.f76092b), cv7.r.b(embeddedInsuranceDetailScreenContract$InputData.f76092b), 28), false);
    }

    private final Object d(Object obj2, Object obj3) {
        final com.revolut.feature.kyc.impl.document_collection.flow.a aVar = (com.revolut.feature.kyc.impl.document_collection.flow.a) this.f25401b;
        DocumentCollectionInputData documentCollectionInputData = aVar.o;
        yki.l FlowCoordinator = (yki.l) obj2;
        DocumentCollectionFlowContract$Step it8 = (DocumentCollectionFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(it8, "it");
        DocumentCollectionFlowContract$Step documentCollectionFlowContract$Step = (DocumentCollectionFlowContract$Step) FlowCoordinator.d();
        if (!(documentCollectionFlowContract$Step instanceof DocumentCollectionFlowContract$Step.DocumentSelection)) {
            if (!(documentCollectionFlowContract$Step instanceof DocumentCollectionFlowContract$Step.Citizenship)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewController viewControllerE1 = aVar.e1(new SubmitCitizenshipControllerDescriptor(new SubmitCitizenshipFlowInputData(false, !documentCollectionInputData.f77517c, documentCollectionInputData.f77515a, documentCollectionInputData.f77516b, null, null, null, new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_nationality_search_hint, null, null, 14), documentCollectionInputData.f77520j, documentCollectionInputData.f77519h, SyslogConstants.LOG_LOCAL6)));
            final int i = 0;
            Function1 block = new Function1() { // from class: cv8.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            SubmitCitizenshipFlowOutput output = (SubmitCitizenshipFlowOutput) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if ((output instanceof SubmitCitizenshipFlowOutput.Back) || (output instanceof SubmitCitizenshipFlowOutput.Close) || (output instanceof SubmitCitizenshipFlowOutput.Decline)) {
                                IllegalStateException illegalStateException = new IllegalStateException("Citizenship output " + output + " can't be handled in DocumentCollectionFlow");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                                d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            } else {
                                if (!(output instanceof SubmitCitizenshipFlowOutput.SelectedCitizenship)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.kyc.impl.document_collection.flow.a aVar2 = aVar;
                                h.t2(aVar2, aVar2.f77632p, new DocumentCollectionFlowContract$Step.DocumentSelection(f0.f322471a, ((SubmitCitizenshipFlowOutput.SelectedCitizenship) output).f97507a), false, null, false, 12);
                            }
                            return Unit.f186387a;
                        default:
                            k result = (k) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result != null) {
                                aVar.C2(new ht8.a(result.f9951a, result.f9952b));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        DocumentCollectionFlowContract$Step.DocumentSelection documentSelection = (DocumentCollectionFlowContract$Step.DocumentSelection) documentCollectionFlowContract$Step;
        DocumentSelectionController documentSelectionController = new DocumentSelectionController(new DocumentSelectionControllerContract$InputData(documentSelection.f77630a, documentCollectionInputData.f77516b, documentCollectionInputData.d, documentCollectionInputData.e, documentCollectionInputData.f, !documentCollectionInputData.f77517c && documentCollectionInputData.f77518g.isEmpty(), documentSelection.f77631b, documentCollectionInputData.f77519h, documentCollectionInputData.f77520j, documentCollectionInputData.k));
        final int i2 = 1;
        Function1 block2 = new Function1() { // from class: cv8.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        SubmitCitizenshipFlowOutput output = (SubmitCitizenshipFlowOutput) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        if ((output instanceof SubmitCitizenshipFlowOutput.Back) || (output instanceof SubmitCitizenshipFlowOutput.Close) || (output instanceof SubmitCitizenshipFlowOutput.Decline)) {
                            IllegalStateException illegalStateException = new IllegalStateException("Citizenship output " + output + " can't be handled in DocumentCollectionFlow");
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                            d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        } else {
                            if (!(output instanceof SubmitCitizenshipFlowOutput.SelectedCitizenship)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.kyc.impl.document_collection.flow.a aVar2 = aVar;
                            h.t2(aVar2, aVar2.f77632p, new DocumentCollectionFlowContract$Step.DocumentSelection(f0.f322471a, ((SubmitCitizenshipFlowOutput.SelectedCitizenship) output).f97507a), false, null, false, 12);
                        }
                        return Unit.f186387a;
                    default:
                        k result = (k) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result != null) {
                            aVar.C2(new ht8.a(result.f9951a, result.f9952b));
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        documentSelectionController.H = block2;
        return documentSelectionController;
    }

    private final Object e(Object obj2, Object obj3) {
        cve.c cVar = (cve.c) this.f25401b;
        String storedMethodId = (String) obj2;
        yte.e domain = (yte.e) obj3;
        Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
        Intrinsics.checkNotNullParameter(domain, "domain");
        cVar.f109337a.f(cve.c.a(storedMethodId), domain);
        return Unit.f186387a;
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.trading.orders.ui.screens.pocket_picker.b bVar = (com.revolut.trading.orders.ui.screens.pocket_picker.b) this.f25401b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        SourcePocketPickerScreenContract$ModalStep step = (SourcePocketPickerScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof SourcePocketPickerScreenContract$ModalStep.CurrencyChooser)) {
            if (Intrinsics.f(step, SourcePocketPickerScreenContract$ModalStep.MarginBorrowingLimitExplanation.f107047a)) {
                return com.revolut.trading.orders.ui.screens.pocket_picker.b.I2(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_cash_balance_margin_borrowingLimitItem_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_cash_balance_margin_dialog_borrowingLimitItem_description, null, null, 14));
            }
            if (!(step instanceof SourcePocketPickerScreenContract$ModalStep.SectionExplanation)) {
                throw new NoWhenBranchMatchedException();
            }
            SourcePocketPickerScreenContract$ModalStep.SectionExplanation sectionExplanation = (SourcePocketPickerScreenContract$ModalStep.SectionExplanation) step;
            return com.revolut.trading.orders.ui.screens.pocket_picker.b.I2(sectionExplanation.f107048a, sectionExplanation.f107049b);
        }
        SourcePocketPickerScreenContract$ModalStep.CurrencyChooser currencyChooser = (SourcePocketPickerScreenContract$ModalStep.CurrencyChooser) step;
        k1j.d dVar = k1j.d.RETAIL;
        Set set = currencyChooser.f107045a;
        ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(((xi0.b) it8.next()).f306286a);
        }
        ViewController viewControllerE1 = bVar.e1(new l1j.c(new CurrencyChooserInputData(dVar, null, currencyChooser.f107046b, new SupportedTargetCurrencies.Unordered(d0.i1(arrayList)), null, false, null, 82)));
        cvl.g block = new cvl.g(bVar, 0);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    private final Object h(Object obj2, Object obj3) {
        com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.a aVar = (com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.a) this.f25401b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        SchemeInsuranceDetailsScreenContract$ModalStep step = (SchemeInsuranceDetailsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof SchemeInsuranceDetailsScreenContract$ModalStep.CoverageActivation) {
            SchemeInsuranceActivateCoverageWidget schemeInsuranceActivateCoverageWidget = ((SchemeInsuranceDetailsScreenContract$ModalStep.CoverageActivation) step).f76147a;
            return new InsuranceCoverageActivationFlow(new InsuranceCoverageActivationFlowContract$InputData(schemeInsuranceActivateCoverageWidget.d, schemeInsuranceActivateCoverageWidget.e, schemeInsuranceActivateCoverageWidget.f));
        }
        if (!(step instanceof SchemeInsuranceDetailsScreenContract$ModalStep.CarClaims)) {
            throw new NoWhenBranchMatchedException();
        }
        SchemeInsuranceDetailsScreenContract$ModalStep.CarClaims carClaims = (SchemeInsuranceDetailsScreenContract$ModalStep.CarClaims) step;
        List list = carClaims.f76145a;
        SchemeInsurancePortal schemeInsurancePortal = carClaims.f76146b;
        aVar.getClass();
        return new CardClaimsScreen(new CardClaimsScreenContract$InputData(list, schemeInsurancePortal));
    }

    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23, types: [com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint] */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r1v109, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v127, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        TextLocalisedClause textLocalisedClause;
        int i;
        List listA;
        Object obj4;
        aw0.i eVar;
        int i2;
        ?? r152;
        TextLocalisedClause textLocalisedClause2;
        ?? r153;
        TextLocalisedClause textLocalisedClause3;
        int i3 = this.f25400a;
        int i5 = 11;
        Object obj5 = this.f25401b;
        switch (i3) {
            case 0:
                com.revolut.feature.robo.impl.ui.screen.manage_goal.a aVar = (com.revolut.feature.robo.impl.ui.screen.manage_goal.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ManageGoalScreenContract$ModalStep step = (ManageGoalScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!Intrinsics.f(step, ManageGoalScreenContract$ModalStep.EditGoal.f85138a)) {
                    throw new NoWhenBranchMatchedException();
                }
                EditGoalFlow editGoalFlow = new EditGoalFlow(new jmc.b(aVar.o.f25389a, false));
                u block = new u(aVar, 2);
                Intrinsics.checkNotNullParameter(block, "block");
                editGoalFlow.H = block;
                return editGoalFlow;
            case 1:
                com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.b) obj5;
                CoBorrowerConsentInitiatorFlowContract$Step step2 = (CoBorrowerConsentInitiatorFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof CoBorrowerConsentInitiatorFlowContract$Step.Initial) {
                    return com.revolut.feature.credit.application.plugins.impl.ui.loading.a.b();
                }
                if (!(step2 instanceof CoBorrowerConsentInitiatorFlowContract$Step.SelectContact)) {
                    if (!(step2 instanceof CoBorrowerConsentInitiatorFlowContract$Step.RequestConsent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CoBorrowerConsentInitiatorFlowContract$Step.RequestConsent requestConsent = (CoBorrowerConsentInitiatorFlowContract$Step.RequestConsent) step2;
                    RequestConsentScreen requestConsentScreen = new RequestConsentScreen(new RequestConsentScreenContract$InputData(bVar.f67222p.a9(), requestConsent.f67217a, requestConsent.f67218b, requestConsent.f67219c));
                    l0c.s block2 = new l0c.s(bVar, 15);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    requestConsentScreen.H = block2;
                    return requestConsentScreen;
                }
                CoBorrowerConsentInitiatorFlowContract$Step.SelectContact selectContact = (CoBorrowerConsentInitiatorFlowContract$Step.SelectContact) step2;
                iu3.i iVar = selectContact.f67220a;
                iu3.g gVar = selectContact.f67221b;
                TextLocalisedClause textLocalisedClause4 = bVar.P2() ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.co_borrower_consent_initiator_select_contact_empty_state_troubleshooting_placeholder, zhm.u.c(new HtmlClause(0, 30, (Integer) null, (Object) null, iVar.f)), null, 12) : null;
                ln3.b bVar2 = bVar.f67224r;
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.co_borrower_consent_initiator_select_contact_title, zhm.u.c(new TextClause(iVar.f168474a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                String str = iVar.f168475b;
                TextLocalisedClause textLocalisedClause6 = str != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.co_borrower_consent_initiator_select_contact_description, zhm.u.c(str), null, 12) : null;
                TextLocalisedClause textLocalisedClause7 = bVar.P2() ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.co_borrower_consent_initiator_select_contact_search_placeholder, zhm.u.c(iVar.f168476c), null, 12) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.co_borrower_consent_initiator_select_contact_search, null, null, 14);
                if (bVar.P2()) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.co_borrower_consent_initiator_select_contact_button_placeholder, zhm.u.c(iVar.f168477g), null, 12);
                    i = 14;
                } else {
                    i = 14;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.co_borrower_consent_initiator_select_contact_button, null, null, 14);
                }
                ContactsPrimaryButtonClause.Plain plain = new ContactsPrimaryButtonClause.Plain(textLocalisedClause);
                Set setB = y0.b(new ContactsChooserInputData$AdditionalConfig$CustomEnableContactPermissionSubtitle(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.co_borrower_consent_initiator_select_contact_contact_permission_subtitle, null, null, i)));
                int i6 = l64.c.f192354a[iVar.f168478h.ordinal()];
                ContactType.RevolutContact.Local local = ContactType.RevolutContact.Local.f66038a;
                if (i6 == 1) {
                    aim.e eVarB = zhm.u.b();
                    eVarB.add(local);
                    if (bVar.P2()) {
                        eVarB.addAll(zhm.v.k(new ContactType.RevolutContact.Remote(y0.b(zm3.k.INDIVIDUAL)), ContactType.UsernameContact.f66040a));
                    }
                    listA = zhm.u.a(eVarB);
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listA = zhm.v.k(local, ContactType$DeviceContact$Phone.f66036a);
                }
                List list = listA;
                ContactsChooserEmptyState invite = (bVar.P2() && iVar.i) ? new ContactsChooserEmptyState.Invite(textLocalisedClause4) : new ContactsChooserEmptyState.Default(new ContactsChooserEmptyState.Default.CustomContent(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.co_borrower_consent_initiator_select_contact_empty_result_title, zhm.u.c(new TextClause(iVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.co_borrower_consent_initiator_select_contact_empty_result_description, zhm.u.c(new TextClause(iVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)), textLocalisedClause4);
                int i21 = R$drawable.uikit_icn_24_cross;
                k9 value = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                ContactsChooserInputData contactsChooserInputData = new ContactsChooserInputData((Clause) textLocalisedClause5, (Clause) textLocalisedClause7, list, (List) null, (ContactsChooserMode) ContactsChooserMode.SingleSelect.f66078a, false, false, false, true, (ContactsFilter) null, (ContactsChooserBannerContent) null, invite, (AnalyticsProduct) new AnalyticsProduct.Retail(value), (Clause) textLocalisedClause6, (Set) null, (ContactsPrimaryButtonClause) plain, (cn3.h) null, i21, setB, 181896);
                bVar2.getClass();
                ContactsChooserScreen contactsChooserScreenA = ln3.b.a(contactsChooserInputData);
                kzc.a block3 = new kzc.a(bVar, gVar, 20);
                Intrinsics.checkNotNullParameter(block3, "block");
                contactsChooserScreenA.H = block3;
                return contactsChooserScreenA;
            case 2:
                com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.b bVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.b) obj5;
                CreditAddonFlowContract$InputData creditAddonFlowContract$InputData = bVar3.f67356p;
                yki.l FlowCoordinator = (yki.l) obj2;
                CreditAddonFlowContract$Step step3 = (CreditAddonFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof CreditAddonFlowContract$Step.Initial) {
                    return com.revolut.feature.credit.application.plugins.impl.ui.loading.a.a();
                }
                if (step3 instanceof CreditAddonFlowContract$Step.Intro) {
                    CreditPromptFlow creditPromptFlow = new CreditPromptFlow(new CreditPromptFlowContract$InputData(((CreditAddonFlowContract$Step.Intro) step3).f67355a, new CreditPromptAnalyticsConfiguration(com.revolut.feature.credit.core.R$string.credit_application_addon_intro_title, com.revolut.feature.credit.core.R$string.credit_application_addon_intro_description, com.revolut.feature.credit.core.R$string.credit_application_addon_intro_primary_button, com.revolut.feature.credit.core.R$string.credit_application_addon_intro_secondary_button), creditAddonFlowContract$InputData.f67352a));
                    f0d.l block4 = new f0d.l(bVar3, FlowCoordinator, i5);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    creditPromptFlow.H = block4;
                    obj4 = creditPromptFlow;
                } else {
                    if (!(step3 instanceof CreditAddonFlowContract$Step.Calculator)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CalculatorScreen calculatorScreen = new CalculatorScreen(new CalculatorScreenContract$InputData(creditAddonFlowContract$InputData.a9().f137835a, true, ((CreditAddonFlowContract$Step.Calculator) step3).f67353a, creditAddonFlowContract$InputData.f67352a));
                    eed.i block5 = new eed.i(step3, 14, bVar3, FlowCoordinator);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    calculatorScreen.H = block5;
                    obj4 = calculatorScreen;
                }
                return obj4;
            case 3:
                final com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar = (com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c) obj5;
                KontomatikIncomeCheckFlowContract$InputData kontomatikIncomeCheckFlowContract$InputData = cVar.f67811p;
                KontomatikIncomeCheckFlowContract$Step step4 = (KontomatikIncomeCheckFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof KontomatikIncomeCheckFlowContract$Step.Prompt) {
                    PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(iy4.a.d(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_kontomatik_verify_income_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_kontomatik_verify_income_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D243", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new AnalyticsContext(v7.m(kontomatikIncomeCheckFlowContract$InputData.f67800b, AnalyticsContext.INSTANCE)), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R.string.common_action_continue, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, 7904));
                    final int i22 = 2;
                    Function1 block6 = new Function1() { // from class: rc4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i32 = i22;
                            com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar2 = cVar;
                            switch (i32) {
                                case 0:
                                    uc4.d output = (uc4.d) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof uc4.b) {
                                        int i33 = d.f253191a[((uc4.b) output).f278981a.ordinal()];
                                        if (i33 == 1) {
                                            cVar2.l2(new e(cVar2, null, 3), new yi5.b(26));
                                        } else if (i33 == 2) {
                                            cVar2.l2(new e(cVar2, null, 2), new yi5.b(26));
                                        } else if (i33 == 3) {
                                            cVar2.l2(new e(cVar2, null, 0), new yi5.b(26));
                                        } else {
                                            if (i33 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            t.J2(cVar2, false, null, null, 7);
                                        }
                                    } else {
                                        if (!(output instanceof uc4.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        t.J2(cVar2, false, null, null, 7);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    yki.a aVar2 = cVar2.f67815t;
                                    u output2 = (u) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof s) {
                                        cVar2.l2(new f(cVar2, output2, (Continuation) null), new yi5.b(26));
                                    } else if (output2 instanceof q) {
                                        cVar2.l2(new f(output2, cVar2, (Continuation) null), new yi5.b(26));
                                    } else if (output2 instanceof yc4.t) {
                                        cVar2.l2(new e(cVar2, null, 1), new yi5.b(26));
                                    } else if (output2 instanceof r) {
                                        h.w2(aVar2, KontomatikIncomeCheckFlowContract$Step.ModalStep.ExternalBankSignIn.f67804a, ModalDestination.Style.POPUP.f98311a);
                                        Unit unit = Unit.f186387a;
                                    } else {
                                        if (!(output2 instanceof p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar2.e(false);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    d67.u it8 = (d67.u) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    boolean z = it8 instanceof d67.q;
                                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar3 = cVar;
                                    if (z) {
                                        t.J2(cVar3, false, null, null, 7);
                                    } else if (it8 instanceof d67.s) {
                                        yki.a aVar3 = cVar3.f67815t;
                                        if (cVar3.P2().f66888a.f154882b) {
                                            h.t2(cVar3, aVar3, KontomatikIncomeCheckFlowContract$Step.IncomeCheckSelection.f67802a, true, null, false, 12);
                                        } else {
                                            h.t2(cVar3, aVar3, KontomatikIncomeCheckFlowContract$Step.KontomatikSignIn.f67803a, true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    i output3 = (i) obj6;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z3 = output3 instanceof wc4.f;
                                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar4 = cVar;
                                    if (z3) {
                                        cVar4.f67815t.e(false);
                                    } else if (output3 instanceof g) {
                                        h.t2(cVar4, cVar4.f67815t, KontomatikIncomeCheckFlowContract$Step.KontomatikSignIn.f67803a, true, null, false, 12);
                                    } else {
                                        if (!(output3 instanceof wc4.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar4.l2(new e(cVar4, null, 4), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    promptMarketingScreen.H = block6;
                    return promptMarketingScreen;
                }
                if (step4 instanceof KontomatikIncomeCheckFlowContract$Step.IncomeCheckSelection) {
                    KontomatikSelectionController kontomatikSelectionController = new KontomatikSelectionController();
                    final int i32 = 3;
                    Function1 block7 = new Function1() { // from class: rc4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i322 = i32;
                            com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar2 = cVar;
                            switch (i322) {
                                case 0:
                                    uc4.d output = (uc4.d) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof uc4.b) {
                                        int i33 = d.f253191a[((uc4.b) output).f278981a.ordinal()];
                                        if (i33 == 1) {
                                            cVar2.l2(new e(cVar2, null, 3), new yi5.b(26));
                                        } else if (i33 == 2) {
                                            cVar2.l2(new e(cVar2, null, 2), new yi5.b(26));
                                        } else if (i33 == 3) {
                                            cVar2.l2(new e(cVar2, null, 0), new yi5.b(26));
                                        } else {
                                            if (i33 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            t.J2(cVar2, false, null, null, 7);
                                        }
                                    } else {
                                        if (!(output instanceof uc4.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        t.J2(cVar2, false, null, null, 7);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    yki.a aVar2 = cVar2.f67815t;
                                    u output2 = (u) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof s) {
                                        cVar2.l2(new f(cVar2, output2, (Continuation) null), new yi5.b(26));
                                    } else if (output2 instanceof q) {
                                        cVar2.l2(new f(output2, cVar2, (Continuation) null), new yi5.b(26));
                                    } else if (output2 instanceof yc4.t) {
                                        cVar2.l2(new e(cVar2, null, 1), new yi5.b(26));
                                    } else if (output2 instanceof r) {
                                        h.w2(aVar2, KontomatikIncomeCheckFlowContract$Step.ModalStep.ExternalBankSignIn.f67804a, ModalDestination.Style.POPUP.f98311a);
                                        Unit unit = Unit.f186387a;
                                    } else {
                                        if (!(output2 instanceof p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar2.e(false);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    d67.u it8 = (d67.u) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    boolean z = it8 instanceof d67.q;
                                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar3 = cVar;
                                    if (z) {
                                        t.J2(cVar3, false, null, null, 7);
                                    } else if (it8 instanceof d67.s) {
                                        yki.a aVar3 = cVar3.f67815t;
                                        if (cVar3.P2().f66888a.f154882b) {
                                            h.t2(cVar3, aVar3, KontomatikIncomeCheckFlowContract$Step.IncomeCheckSelection.f67802a, true, null, false, 12);
                                        } else {
                                            h.t2(cVar3, aVar3, KontomatikIncomeCheckFlowContract$Step.KontomatikSignIn.f67803a, true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    i output3 = (i) obj6;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z3 = output3 instanceof wc4.f;
                                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar4 = cVar;
                                    if (z3) {
                                        cVar4.f67815t.e(false);
                                    } else if (output3 instanceof g) {
                                        h.t2(cVar4, cVar4.f67815t, KontomatikIncomeCheckFlowContract$Step.KontomatikSignIn.f67803a, true, null, false, 12);
                                    } else {
                                        if (!(output3 instanceof wc4.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar4.l2(new e(cVar4, null, 4), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    kontomatikSelectionController.H = block7;
                    return kontomatikSelectionController;
                }
                if (step4 instanceof KontomatikIncomeCheckFlowContract$Step.KontomatikSignIn) {
                    CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = kontomatikIncomeCheckFlowContract$InputData.f67800b;
                    KontomatikSignInController kontomatikSignInController = new KontomatikSignInController(new KontomatikSignInControllerContract$InputData(creditApplicationPluginFlowContract$Configuration.f66892b, v7.m(creditApplicationPluginFlowContract$Configuration, AnalyticsContext.INSTANCE), false, cVar.P2().f66888a.f154881a, cVar.P2().f66888a.f154882b, kontomatikIncomeCheckFlowContract$InputData.a9()));
                    Function1 block8 = new Function1() { // from class: rc4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i322 = i;
                            com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar2 = cVar;
                            switch (i322) {
                                case 0:
                                    uc4.d output = (uc4.d) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof uc4.b) {
                                        int i33 = d.f253191a[((uc4.b) output).f278981a.ordinal()];
                                        if (i33 == 1) {
                                            cVar2.l2(new e(cVar2, null, 3), new yi5.b(26));
                                        } else if (i33 == 2) {
                                            cVar2.l2(new e(cVar2, null, 2), new yi5.b(26));
                                        } else if (i33 == 3) {
                                            cVar2.l2(new e(cVar2, null, 0), new yi5.b(26));
                                        } else {
                                            if (i33 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            t.J2(cVar2, false, null, null, 7);
                                        }
                                    } else {
                                        if (!(output instanceof uc4.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        t.J2(cVar2, false, null, null, 7);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    yki.a aVar2 = cVar2.f67815t;
                                    u output2 = (u) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof s) {
                                        cVar2.l2(new f(cVar2, output2, (Continuation) null), new yi5.b(26));
                                    } else if (output2 instanceof q) {
                                        cVar2.l2(new f(output2, cVar2, (Continuation) null), new yi5.b(26));
                                    } else if (output2 instanceof yc4.t) {
                                        cVar2.l2(new e(cVar2, null, 1), new yi5.b(26));
                                    } else if (output2 instanceof r) {
                                        h.w2(aVar2, KontomatikIncomeCheckFlowContract$Step.ModalStep.ExternalBankSignIn.f67804a, ModalDestination.Style.POPUP.f98311a);
                                        Unit unit = Unit.f186387a;
                                    } else {
                                        if (!(output2 instanceof p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar2.e(false);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    d67.u it8 = (d67.u) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    boolean z = it8 instanceof d67.q;
                                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar3 = cVar;
                                    if (z) {
                                        t.J2(cVar3, false, null, null, 7);
                                    } else if (it8 instanceof d67.s) {
                                        yki.a aVar3 = cVar3.f67815t;
                                        if (cVar3.P2().f66888a.f154882b) {
                                            h.t2(cVar3, aVar3, KontomatikIncomeCheckFlowContract$Step.IncomeCheckSelection.f67802a, true, null, false, 12);
                                        } else {
                                            h.t2(cVar3, aVar3, KontomatikIncomeCheckFlowContract$Step.KontomatikSignIn.f67803a, true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    i output3 = (i) obj6;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z3 = output3 instanceof wc4.f;
                                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar4 = cVar;
                                    if (z3) {
                                        cVar4.f67815t.e(false);
                                    } else if (output3 instanceof g) {
                                        h.t2(cVar4, cVar4.f67815t, KontomatikIncomeCheckFlowContract$Step.KontomatikSignIn.f67803a, true, null, false, 12);
                                    } else {
                                        if (!(output3 instanceof wc4.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar4.l2(new e(cVar4, null, 4), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    kontomatikSignInController.H = block8;
                    return kontomatikSignInController;
                }
                if (!(step4 instanceof KontomatikIncomeCheckFlowContract$Step.Popup)) {
                    if (step4 instanceof KontomatikIncomeCheckFlowContract$Step.ModalStep.ExternalBankSignIn) {
                        return new KontomatikExternalBankSignInController();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                KontomatikIncomeCheckFlowContract$Step.Popup popup = (KontomatikIncomeCheckFlowContract$Step.Popup) step4;
                KontomatikPopupScreen kontomatikPopupScreen = new KontomatikPopupScreen(new KontomatikPopupScreenContract$InputData(popup.f67805a, popup.f67806b, kontomatikIncomeCheckFlowContract$InputData.f67800b));
                final int i33 = 0;
                Function1 function1 = new Function1() { // from class: rc4.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i322 = i33;
                        com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar2 = cVar;
                        switch (i322) {
                            case 0:
                                uc4.d output = (uc4.d) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output instanceof uc4.b) {
                                    int i332 = d.f253191a[((uc4.b) output).f278981a.ordinal()];
                                    if (i332 == 1) {
                                        cVar2.l2(new e(cVar2, null, 3), new yi5.b(26));
                                    } else if (i332 == 2) {
                                        cVar2.l2(new e(cVar2, null, 2), new yi5.b(26));
                                    } else if (i332 == 3) {
                                        cVar2.l2(new e(cVar2, null, 0), new yi5.b(26));
                                    } else {
                                        if (i332 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        t.J2(cVar2, false, null, null, 7);
                                    }
                                } else {
                                    if (!(output instanceof uc4.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    t.J2(cVar2, false, null, null, 7);
                                }
                                return Unit.f186387a;
                            case 1:
                                yki.a aVar2 = cVar2.f67815t;
                                u output2 = (u) obj6;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (output2 instanceof s) {
                                    cVar2.l2(new f(cVar2, output2, (Continuation) null), new yi5.b(26));
                                } else if (output2 instanceof q) {
                                    cVar2.l2(new f(output2, cVar2, (Continuation) null), new yi5.b(26));
                                } else if (output2 instanceof yc4.t) {
                                    cVar2.l2(new e(cVar2, null, 1), new yi5.b(26));
                                } else if (output2 instanceof r) {
                                    h.w2(aVar2, KontomatikIncomeCheckFlowContract$Step.ModalStep.ExternalBankSignIn.f67804a, ModalDestination.Style.POPUP.f98311a);
                                    Unit unit = Unit.f186387a;
                                } else {
                                    if (!(output2 instanceof p)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar2.e(false);
                                }
                                return Unit.f186387a;
                            case 2:
                                d67.u it8 = (d67.u) obj6;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                boolean z = it8 instanceof d67.q;
                                com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar3 = cVar;
                                if (z) {
                                    t.J2(cVar3, false, null, null, 7);
                                } else if (it8 instanceof d67.s) {
                                    yki.a aVar3 = cVar3.f67815t;
                                    if (cVar3.P2().f66888a.f154882b) {
                                        h.t2(cVar3, aVar3, KontomatikIncomeCheckFlowContract$Step.IncomeCheckSelection.f67802a, true, null, false, 12);
                                    } else {
                                        h.t2(cVar3, aVar3, KontomatikIncomeCheckFlowContract$Step.KontomatikSignIn.f67803a, true, null, false, 12);
                                    }
                                }
                                return Unit.f186387a;
                            default:
                                i output3 = (i) obj6;
                                Intrinsics.checkNotNullParameter(output3, "output");
                                boolean z3 = output3 instanceof wc4.f;
                                com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar4 = cVar;
                                if (z3) {
                                    cVar4.f67815t.e(false);
                                } else if (output3 instanceof g) {
                                    h.t2(cVar4, cVar4.f67815t, KontomatikIncomeCheckFlowContract$Step.KontomatikSignIn.f67803a, true, null, false, 12);
                                } else {
                                    if (!(output3 instanceof wc4.h)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar4.l2(new e(cVar4, null, 4), new yi5.b(26));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(function1, "<set-?>");
                kontomatikPopupScreen.H = function1;
                return kontomatikPopupScreen;
            case 4:
                com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d dVar = (com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d) obj5;
                RejectedLazyFlowContract$InputData rejectedLazyFlowContract$InputData = dVar.f68313p;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                RejectedLazyFlowContract$Step step5 = (RejectedLazyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof RejectedLazyFlowContract$Step.Rejected) {
                    RejectedLazyFlowContract$Step.Rejected rejected = (RejectedLazyFlowContract$Step.Rejected) step5;
                    m1 m1Var = rejected.f68306a;
                    ActionsBottomSheetController.Companion companion = ActionsBottomSheetController.INSTANCE;
                    lw0.a aVar2 = new lw0.a(com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d.Q2(m1Var), com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d.P2(m1Var), null, null, false, 28);
                    TextLocalisedClause textLocalisedClauseU2 = com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d.U2(m1Var);
                    m6 m6Var = n6.Companion;
                    n6 n6VarC = m6.c(m6Var, com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d.T2(m1Var), LargeActionButton.ButtonStyle.f58725a, null, null, false, com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d.W2(m1Var.f154913c.f154904b), null, null, 956);
                    if (textLocalisedClauseU2 != null) {
                        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
                        k1 k1Var = m1Var.d;
                        eVar = new aw0.h(false, n6VarC, m6.c(m6Var, textLocalisedClauseU2, defaultFilledButton, null, null, false, com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d.W2(k1Var != null ? k1Var.f154904b : null), null, null, 956), null, null, null, 121);
                    } else {
                        eVar = new aw0.e(false, null, null, n6VarC, null, null, 55);
                    }
                    aw0.i iVar2 = eVar;
                    AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                    CreditApplicationCommonContext creditApplicationCommonContextO = t1.O(rejectedLazyFlowContract$InputData);
                    companion2.getClass();
                    ActionsBottomSheetController actionsBottomSheetControllerB = dy4.a.b(companion, aVar2, iVar2, new AnalyticsContext(AnalyticsContext.Companion.a(creditApplicationCommonContextO)), 8);
                    md6.s.E(actionsBottomSheetControllerB, new com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.b(2, 0, com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d.class, dVar, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;"), true, new com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.c(dVar, null), new p5e.h(dVar, rejected, 23));
                    return actionsBottomSheetControllerB;
                }
                if (!(step5 instanceof RejectedLazyFlowContract$Step.Bureaus)) {
                    if (!(step5 instanceof RejectedLazyFlowContract$Step.RejectedDetails)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CreditHealthFlowController creditHealthFlowController = new CreditHealthFlowController(new CreditHealthFlowContract$InputData(new CreditHealthContext.AfterApplication(rejectedLazyFlowContract$InputData.a9())));
                    ph4.c block9 = new ph4.c(dVar, 0);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    creditHealthFlowController.H = block9;
                    return creditHealthFlowController;
                }
                lw0.a aVar3 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.application_rejected_bureaus_title, null, null, 14), null, null, null, false, 30);
                aw0.e eVar2 = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.application_rejected_bureaus_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                Iterable iterable = ((RejectedLazyFlowContract$Step.Bureaus) step5).f68305a.e;
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                Iterable<hs3.n> iterable2 = iterable;
                ArrayList arrayList = new ArrayList(zhm.w.t(iterable2, 10));
                for (hs3.n nVar : iterable2) {
                    arrayList.add(new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.application_rejected_bureaus_bureau_title, zhm.u.c(new TextClause(nVar.f154914a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), null, 12), (Clause) new TextClause(nVar.f154915b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 62), true, false, (RowDelegate.Model.c) null, (Object) nVar, 232));
                }
                k9 k9Var = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                AnalyticsProduct.Retail retailH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
                AnalyticsContext.Companion companion3 = AnalyticsContext.INSTANCE;
                CreditApplicationCommonContext creditApplicationCommonContextO2 = t1.O(rejectedLazyFlowContract$InputData);
                companion3.getClass();
                RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar3, eVar2, arrayList, retailH, new AnalyticsContext(AnalyticsContext.Companion.a(creditApplicationCommonContextO2))));
                pfk.h0 h0Var = new pfk.h0(22);
                com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.a aVar4 = new com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.a(dVar, null);
                ph4.c cVar2 = new ph4.c(dVar, i);
                AtomicReference atomicReference = new AtomicReference(null);
                rowActionsBottomSheetController.l2(new bib.b(dVar, atomicReference, cVar2, aVar4, 28));
                dVar.a(rowActionsBottomSheetController, new a83.z(h0Var, i5, cVar2, atomicReference));
                return rowActionsBottomSheetController;
            case 5:
                final com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.e eVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.e) obj5;
                RejectedRootFlowContract$InputData rejectedRootFlowContract$InputData = eVar3.f68319p;
                RejectedRootFlowContract$Step step6 = (RejectedRootFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof RejectedRootFlowContract$Step.Rejected) {
                    RejectedController rejectedController = new RejectedController(new RejectedControllerContract$InputData(((RejectedRootFlowContract$Step.Rejected) step6).f68311a, rejectedRootFlowContract$InputData.f68309b, rejectedRootFlowContract$InputData.f68310c));
                    final int i43 = 0;
                    Function1 block10 = new Function1() { // from class: ph4.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i59 = i43;
                            com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.e eVar4 = eVar3;
                            switch (i59) {
                                case 0:
                                    oh4.f it8 = (oh4.f) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (it8 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar4.O2(it8.f225289a, eVar4.f68319p.getF67796a().f66892b);
                                    return Unit.f186387a;
                                default:
                                    l84.e output = (l84.e) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof l84.b) {
                                        eVar4.O2(null, eVar4.f68319p.f68310c.f66892b);
                                    } else if (output instanceof l84.d) {
                                        IllegalStateException illegalStateException = new IllegalStateException("Proceed credit health action was called after credit application");
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "RejectedRootFlowModel", null, illegalStateException, h0Var2);
                                    } else {
                                        if (!(output instanceof l84.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar4.l2(new pdi.j(eVar4, ((l84.c) output).f192778a, null, 12), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    rejectedController.H = block10;
                    return rejectedController;
                }
                if (!(step6 instanceof RejectedRootFlowContract$Step.RejectedDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditHealthFlowController creditHealthFlowController2 = new CreditHealthFlowController(new CreditHealthFlowContract$InputData(new CreditHealthContext.AfterApplication(rejectedRootFlowContract$InputData.a9())));
                Function1 block11 = new Function1() { // from class: ph4.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i59 = i;
                        com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.e eVar4 = eVar3;
                        switch (i59) {
                            case 0:
                                oh4.f it8 = (oh4.f) obj6;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                if (it8 == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar4.O2(it8.f225289a, eVar4.f68319p.getF67796a().f66892b);
                                return Unit.f186387a;
                            default:
                                l84.e output = (l84.e) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output instanceof l84.b) {
                                    eVar4.O2(null, eVar4.f68319p.f68310c.f66892b);
                                } else if (output instanceof l84.d) {
                                    IllegalStateException illegalStateException = new IllegalStateException("Proceed credit health action was called after credit application");
                                    h0 h0Var2 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, "RejectedRootFlowModel", null, illegalStateException, h0Var2);
                                } else {
                                    if (!(output instanceof l84.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar4.l2(new pdi.j(eVar4, ((l84.c) output).f192778a, null, 12), new yi5.b(26));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block11, "block");
                creditHealthFlowController2.H = block11;
                return creditHealthFlowController2;
            case 6:
                com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a aVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a) obj5;
                SepaDirectDebitFlowContract$InputData sepaDirectDebitFlowContract$InputData = aVar5.f68351p;
                SepaDirectDebitFlowContract$Step step7 = (SepaDirectDebitFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof SepaDirectDebitFlowContract$Step.SetUp) {
                    SepaDirectDebitSetUpController sepaDirectDebitSetUpController = new SepaDirectDebitSetUpController(new SepaDirectDebitSetUpContract$InputData(sepaDirectDebitFlowContract$InputData.a9(), v7.m(sepaDirectDebitFlowContract$InputData.f68348a, AnalyticsContext.INSTANCE)));
                    vh4.c block12 = new vh4.c(aVar5, 0);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    sepaDirectDebitSetUpController.H = block12;
                    return sepaDirectDebitSetUpController;
                }
                if (!(step7 instanceof SepaDirectDebitFlowContract$Step.RepaymentMethod)) {
                    throw new NoWhenBranchMatchedException();
                }
                SepaDirectDebitRepaymentMethodController sepaDirectDebitRepaymentMethodController = new SepaDirectDebitRepaymentMethodController(new SepaDirectDebitRepaymentMethodContract$InputData(sepaDirectDebitFlowContract$InputData.f68348a.o, sepaDirectDebitFlowContract$InputData.a9(), v7.m(sepaDirectDebitFlowContract$InputData.f68348a, AnalyticsContext.INSTANCE)));
                vh4.c block13 = new vh4.c(aVar5, i);
                Intrinsics.checkNotNullParameter(block13, "block");
                sepaDirectDebitRepaymentMethodController.H = block13;
                return sepaDirectDebitRepaymentMethodController;
            case 7:
                final com.revolut.feature.apm.bills.f24.impl.ui.a aVar6 = (com.revolut.feature.apm.bills.f24.impl.ui.a) obj5;
                F24FlowContract$Step step8 = (F24FlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof F24FlowContract$Step.Entry) {
                    F24EntryController f24EntryController = new F24EntryController();
                    final int i59 = 0;
                    Function1 block14 = new Function1() { // from class: cq1.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            FlowStep newForm;
                            switch (i59) {
                                case 0:
                                    eq1.d outputData = (eq1.d) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof eq1.b) {
                                        newForm = new F24FlowContract$Step.FormsList(((eq1.b) outputData).f128219a);
                                    } else {
                                        if (!(outputData instanceof eq1.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        newForm = new F24FlowContract$Step.NewForm(((eq1.c) outputData).f128220a);
                                    }
                                    FlowStep flowStep = newForm;
                                    com.revolut.feature.apm.bills.f24.impl.ui.a aVar7 = aVar6;
                                    h.t2(aVar7, aVar7.f61471q, flowStep, false, TransitionAnimation.FADE.f98392a, false, 8);
                                    return Unit.f186387a;
                                default:
                                    f outputData2 = (f) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z = outputData2 instanceof f.b;
                                    com.revolut.feature.apm.bills.f24.impl.ui.a aVar8 = aVar6;
                                    if (z) {
                                        aVar8.f61470p.getClass();
                                        aVar8.X1(new mii.k("F24_SUCCESS_SHOT_DIALOG_ID", new TextLocalisedClause(com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_tax_list_banner_success_f24, null, null, 14), null, null, null, 28));
                                    }
                                    h.t2(aVar8, aVar8.f61471q, F24FlowContract$Step.Entry.f61467a, false, TransitionAnimation.FADE.f98392a, false, 8);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block14, "block");
                    f24EntryController.H = block14;
                    return f24EntryController;
                }
                if (!(step8 instanceof F24FlowContract$Step.NewForm)) {
                    if (step8 instanceof F24FlowContract$Step.FormsList) {
                        return new FormsListScreen(new FormsListScreenContract$InputData(((F24FlowContract$Step.FormsList) step8).f61468a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                aVar6.o.getClass();
                ViewController viewControllerE1 = aVar6.e1(new ef9.e(new FormFlowInputData(xo1.g.F24, null)));
                Function1 block15 = new Function1() { // from class: cq1.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        FlowStep newForm;
                        switch (i) {
                            case 0:
                                eq1.d outputData = (eq1.d) obj6;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                if (outputData instanceof eq1.b) {
                                    newForm = new F24FlowContract$Step.FormsList(((eq1.b) outputData).f128219a);
                                } else {
                                    if (!(outputData instanceof eq1.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    newForm = new F24FlowContract$Step.NewForm(((eq1.c) outputData).f128220a);
                                }
                                FlowStep flowStep = newForm;
                                com.revolut.feature.apm.bills.f24.impl.ui.a aVar7 = aVar6;
                                h.t2(aVar7, aVar7.f61471q, flowStep, false, TransitionAnimation.FADE.f98392a, false, 8);
                                return Unit.f186387a;
                            default:
                                f outputData2 = (f) obj6;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                boolean z = outputData2 instanceof f.b;
                                com.revolut.feature.apm.bills.f24.impl.ui.a aVar8 = aVar6;
                                if (z) {
                                    aVar8.f61470p.getClass();
                                    aVar8.X1(new mii.k("F24_SUCCESS_SHOT_DIALOG_ID", new TextLocalisedClause(com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_tax_list_banner_success_f24, null, null, 14), null, null, null, 28));
                                }
                                h.t2(aVar8, aVar8.f61471q, F24FlowContract$Step.Entry.f61467a, false, TransitionAnimation.FADE.f98392a, false, 8);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block15, "block");
                viewControllerE1.H = block15;
                return viewControllerE1;
            case 8:
                com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a aVar7 = (com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a) obj5;
                CreditCardCancellationFlowContract$InputData creditCardCancellationFlowContract$InputData = aVar7.o;
                zp4.b bVar4 = aVar7.u;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                CreditCardCancellationFlowContract$Step step9 = (CreditCardCancellationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof CreditCardCancellationFlowContract$Step.ConfirmationScreen)) {
                    if (step9 instanceof CreditCardCancellationFlowContract$Step.CheckoutScreen) {
                        CreditCardCancellationFlowContract$Step.CheckoutScreen checkoutScreen = (CreditCardCancellationFlowContract$Step.CheckoutScreen) step9;
                        dj0.d dVar2 = checkoutScreen.f69121b;
                        hl4.g gVar2 = checkoutScreen.f69120a;
                        CancellationCheckoutScreen cancellationCheckoutScreen = new CancellationCheckoutScreen(new CancellationCheckoutScreenContract$InputData(dVar2, creditCardCancellationFlowContract$InputData.f69114a, checkoutScreen.f69122c, checkoutScreen.d));
                        c1g.o block16 = new c1g.o(aVar7, 20, dVar2, gVar2);
                        Intrinsics.checkNotNullParameter(block16, "block");
                        cancellationCheckoutScreen.H = block16;
                        return cancellationCheckoutScreen;
                    }
                    if (step9 instanceof CreditCardCancellationFlowContract$Step.AdditionalCardholderFacilityOwnerConfirmationScreen) {
                        String str2 = creditCardCancellationFlowContract$InputData.f69114a;
                        String str3 = ((CreditCardCancellationFlowContract$Step.AdditionalCardholderFacilityOwnerConfirmationScreen) step9).f69118a;
                        bVar4.getClass();
                        String str4 = null;
                        int i66 = 54;
                        ResourceImage resourceImage = null;
                        boolean z = false;
                        PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_cancelation_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_cancelation_subtitle, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_broken_heart, null, null, 6), null, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_cancelation_primary_action, null, null, 14), resourceImage, LargeActionButton.ButtonStyle.f58725a, z, str4, i66), new PromptMarketingContentDelegate.Model.Button(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_cancelation_secondary_action, null, null, 14), resourceImage, LargeActionButton.ButtonStyle.f58726b, z, str4, i66), null, null, null, null, null, 65112));
                        c1g.o block17 = new c1g.o(aVar7, 19, str2, str3);
                        Intrinsics.checkNotNullParameter(block17, "block");
                        promptMarketingScreen2.H = block17;
                        return promptMarketingScreen2;
                    }
                    if (!(step9 instanceof CreditCardCancellationFlowContract$Step.AdditionalCardholderSelfConfirmationScreen)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str5 = creditCardCancellationFlowContract$InputData.f69114a;
                    bVar4.getClass();
                    String str6 = null;
                    int i74 = 54;
                    ResourceImage resourceImage2 = null;
                    boolean z3 = false;
                    PromptMarketingScreen promptMarketingScreen3 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_self_cancelation_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_self_cancelation_subtitle, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_broken_heart, null, null, 6), null, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_self_cancelation_primary_action, null, null, 14), resourceImage2, LargeActionButton.ButtonStyle.f58725a, z3, str6, i74), new PromptMarketingContentDelegate.Model.Button(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_self_cancelation_secondary_action, null, null, 14), resourceImage2, LargeActionButton.ButtonStyle.f58726b, z3, str6, i74), null, null, null, null, null, 65112));
                    cma.b block18 = new cma.b(aVar7, str5, 14);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    promptMarketingScreen3.H = block18;
                    return promptMarketingScreen3;
                }
                CreditCardCancellationFlowContract$Step.ConfirmationScreen confirmationScreen = (CreditCardCancellationFlowContract$Step.ConfirmationScreen) step9;
                hl4.g gVar3 = confirmationScreen.f69123a;
                dj0.d dVar3 = confirmationScreen.f69124b;
                RepaymentDeferral repaymentDeferral = confirmationScreen.f69125c;
                PayoffBreakdown payoffBreakdown = confirmationScreen.d;
                wi0.b bVar5 = confirmationScreen.e;
                bVar4.getClass();
                wi0.b.Companion.getClass();
                wi0.b bVar6 = wi0.b.l2;
                if (Intrinsics.f(bVar5, bVar6)) {
                    i2 = 14;
                    r152 = 0;
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_accepted_title_nz, null, null, 14);
                } else {
                    i2 = 14;
                    r152 = 0;
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_accepted_title, null, null, 14);
                }
                TextLocalisedClause textLocalisedClause8 = textLocalisedClause2;
                if (Intrinsics.f(bVar5, bVar6)) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_accepted_description_nz, r152, r152, i2);
                    r153 = r152;
                } else if (Intrinsics.f(bVar5, wi0.b.p0)) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_accepted_description_gb, r152, r152, i2);
                    r153 = r152;
                } else if (Intrinsics.f(bVar5, wi0.b.f297756l)) {
                    i = (dVar3 == null || !dVar3.f(dj0.d.e)) ? 0 : 1;
                    if (i == 0 || payoffBreakdown == null || !payoffBreakdown.f68717c.f(dj0.d.e)) {
                        r153 = 0;
                        r153 = 0;
                        textLocalisedClause3 = i != 0 ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_accepted_description_Au_balance_repay, null, null, 14) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_accepted_description_Au_nothing_to_repay, null, null, 14);
                    } else {
                        r153 = 0;
                        textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_accepted_description_Au_balance_interest_repay, null, null, 14);
                    }
                } else {
                    r153 = 0;
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_accepted_description, null, null, 14);
                }
                String str7 = null;
                int i92 = 54;
                ResourceImage resourceImage3 = null;
                boolean z4 = false;
                PromptMarketingScreen promptMarketingScreen4 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause8, textLocalisedClause3, new GlyphImage(R$drawable.uikit_icn_24_broken_heart, r153, r153, 6), null, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_accepted_primary_button, null, null, 14), resourceImage3, LargeActionButton.ButtonStyle.f58725a, z4, str7, i92), new PromptMarketingContentDelegate.Model.Button(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_accepted_secondary_button, null, null, 14), resourceImage3, LargeActionButton.ButtonStyle.f58726b, z4, str7, i92), null, null, null, null, null, 65112));
                a5b.a block19 = new a5b.a((Object) aVar7, (Object) dVar3, (Object) gVar3, (Object) repaymentDeferral, (Object) payoffBreakdown, 8);
                Intrinsics.checkNotNullParameter(block19, "block");
                promptMarketingScreen4.H = block19;
                return promptMarketingScreen4;
            case 9:
                cq8.p pVar = (cq8.p) obj5;
                Throwable th10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                if (th10 != null) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var2);
                }
                return pVar.d;
            case 10:
                com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a aVar8 = (com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AddSplitItemControllerContract$ModalStep step10 = (AddSplitItemControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof AddSplitItemControllerContract$ModalStep.RemoveItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                bq9.d dVar4 = aVar8.f79274r;
                String str8 = ((AddSplitItemControllerContract$ModalStep.RemoveItem) step10).f79271a;
                dVar4.getClass();
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(bq9.d.a(str8));
                cp7.k block20 = new cp7.k(aVar8, 13);
                Intrinsics.checkNotNullParameter(block20, "block");
                actionsBottomSheetController.H = block20;
                return actionsBottomSheetController;
            case 11:
                com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.a aVar9 = (com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.a) obj5;
                y yVar = aVar9.f96250w;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ScreenerMetaCollectionScreenContract$ModalStep step11 = (ScreenerMetaCollectionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof ScreenerMetaCollectionScreenContract$ModalStep.SelectFilterOption)) {
                    throw new NoWhenBranchMatchedException();
                }
                poh.l lVar = (poh.l) ((cqh.g) ((j2) yVar.f22677a).getValue()).f108107c.f238003c.get(((ScreenerMetaCollectionScreenContract$ModalStep.SelectFilterOption) step11).f96244a);
                poh.k kVar = (poh.k) ((cqh.g) ((j2) yVar.f22677a).getValue()).f108106b.get(lVar);
                lw0.a aVar10 = new lw0.a(lVar.a(), null, null, null, false, 30);
                List<poh.k> options = lVar.getOptions();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(options, 10));
                for (poh.k kVar2 : options) {
                    arrayList2.add(new eii.l(kVar2.a(), (Clause) null, (RowDelegate.Model.MainImage) null, true, kVar2.equals(kVar), (RowDelegate.Model.c) null, (Object) kVar2, 200));
                }
                k9 k9Var2 = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                RowActionsBottomSheetController rowActionsBottomSheetController2 = new RowActionsBottomSheetController(new eii.c(aVar10, null, arrayList2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null));
                cma.b block21 = new cma.b(aVar9, lVar, 17);
                Intrinsics.checkNotNullParameter(block21, "block");
                rowActionsBottomSheetController2.H = block21;
                return rowActionsBottomSheetController2;
            case 12:
                com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a aVar11 = (com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SettingsContract$ModalStep step12 = (SettingsContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof SettingsContract$ModalStep.EditCycle)) {
                    throw new NoWhenBranchMatchedException();
                }
                SettingsContract$ModalStep.EditCycle editCycle = (SettingsContract$ModalStep.EditCycle) step12;
                EditCycleScreen editCycleScreen = new EditCycleScreen(new EditCycleScreenContract$InputData(editCycle.f87900a, editCycle.f87901b));
                cp7.k kVar3 = new cp7.k(aVar11, 16);
                Intrinsics.checkNotNullParameter(kVar3, "<set-?>");
                editCycleScreen.H = kVar3;
                return editCycleScreen;
            case 13:
                SetCategoryBudgetsScreen setCategoryBudgetsScreen = (SetCategoryBudgetsScreen) obj5;
                RowDelegate.Model model = (RowDelegate.Model) obj2;
                MaskedTextInputEditText field = (MaskedTextInputEditText) obj3;
                KProperty[] kPropertyArr = SetCategoryBudgetsScreen.f101550h0;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj6 = model.u;
                Intrinsics.i(obj6, "null cannot be cast to non-null type com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.models.CategoryBudgetEditingInfo");
                CategoryBudgetEditingInfo categoryBudgetEditingInfo = (CategoryBudgetEditingInfo) obj6;
                xi0.b bVar7 = categoryBudgetEditingInfo.f101549c.f115083b;
                zq.a aVar12 = new zq.a(setCategoryBudgetsScreen, categoryBudgetEditingInfo, 8);
                qd0.b bVarN = ((erj.l) setCategoryBudgetsScreen.f101553d0.getValue()).f128718b.e.n();
                vc.s.j(bVarN);
                return new zp0.d(field, bVar7, new u80.d(((s80.b) bVarN).b()), null, aVar12, true, true, 0, false, null, 1928);
            case 14:
                String campaignId = (String) obj2;
                com.revolut.feature.raffle.impl.data.models.b campaign = (com.revolut.feature.raffle.impl.data.models.b) obj3;
                Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                Intrinsics.checkNotNullParameter(campaign, "campaign");
                ((cta.c) obj5).f108654b.f(cta.c.b(campaignId), campaign);
                return Unit.f186387a;
            case 15:
                com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b bVar8 = (com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b) obj5;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                PricingPlansPromptResolverFlowContract$Step flowStep = (PricingPlansPromptResolverFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(flowStep, "flowStep");
                if (!(flowStep instanceof PricingPlansPromptResolverFlowContract$Step.Prompt)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE12 = bVar8.e1(new igk.s(((PricingPlansPromptResolverFlowContract$Step.Prompt) flowStep).f83405a));
                ctb.a block22 = new ctb.a(1, 0, com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b.class, bVar8, "handlePromptResult", "handlePromptResult(Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanPromotionalPrompt$Output;)V");
                Intrinsics.checkNotNullParameter(block22, "block");
                viewControllerE12.H = block22;
                return viewControllerE12;
            case 16:
                DigitizedCards domain = (DigitizedCards) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((cuc.d) obj5).f108949c.f("LINKED_WALLETS_KEY", domain);
                return Unit.f186387a;
            case 17:
                List domain2 = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain2, "domain");
                ((cuc.t) obj5).f108972b.f("SECURITY_HUB_CHECKLIST_COMPLETION_KEY", domain2);
                return Unit.f186387a;
            case 18:
                StreetModeInfo domain3 = (StreetModeInfo) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain3, "domain");
                ((e0) obj5).f108954b.f("STREET_MODE_INFO_KEY", domain3);
                return Unit.f186387a;
            case 19:
                String stepId = (String) obj2;
                String checkId = (String) obj3;
                Intrinsics.checkNotNullParameter(stepId, "stepId");
                Intrinsics.checkNotNullParameter(checkId, "checkId");
                ((cuh.b) obj5).f109000c.f(stepId, checkId);
                return Unit.f186387a;
            case 20:
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b bVar9 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) obj5;
                fui.c cVar3 = bVar9.v;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AsftCheckoutScreenContract$ModalStep step13 = (AsftCheckoutScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (Intrinsics.f(step13, AsftCheckoutScreenContract$ModalStep.RevPointsInfo.f98809a)) {
                    return bVar9.e1(new hub.c(m1c.e0.ASFT_CHECKOUT));
                }
                if (step13 instanceof AsftCheckoutScreenContract$ModalStep.RevPayPocketSelection) {
                    return cVar3.b3(((AsftCheckoutScreenContract$ModalStep.RevPayPocketSelection) step13).f98808a);
                }
                if (step13 instanceof AsftCheckoutScreenContract$ModalStep.ExchangeBreakdown) {
                    return cVar3.Z2(((AsftCheckoutScreenContract$ModalStep.ExchangeBreakdown) step13).f98807a);
                }
                throw new NoWhenBranchMatchedException();
            case 21:
                InvestOrderEditScreen investOrderEditScreen = (InvestOrderEditScreen) obj5;
                CenteredAmountDelegate.Model model2 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = InvestOrderEditScreen.f106875h0;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                Object obj7 = model2.f51981p;
                cul.s sVar = obj7 instanceof cul.s ? (cul.s) obj7 : null;
                if (sVar == null) {
                    return null;
                }
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar4 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) investOrderEditScreen.d();
                eVar4.getClass();
                eVar4.l2(new j1(eVar4, null, 7), new yi5.b(26));
                return new zp0.d(field2.getEditText(), new xi0.b(4, sVar.f109165a.f104720b, Integer.valueOf(sVar.f109166b)), new u80.d(((s80.b) ((qd0.b) investOrderEditScreen.P.getValue())).b()), null, new a61.a(investOrderEditScreen, sVar, 8), false, false, 0, false, null, 1928);
            case 22:
                return a(obj2, obj3);
            case 23:
                return b(obj2, obj3);
            case 24:
                return c(obj2, obj3);
            case 25:
                return d(obj2, obj3);
            case 26:
                return e(obj2, obj3);
            case 27:
                return g(obj2, obj3);
            case 28:
                return h(obj2, obj3);
            default:
                com.revolut.feature.topup_screen.impl.flow.add_card.b bVar10 = (com.revolut.feature.topup_screen.impl.flow.add_card.b) obj5;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                AddCardFlowContract$Step step14 = (AddCardFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof AddCardFlowContract$Step.CardDetails) {
                    CardDetailsScreen cardDetailsScreen = new CardDetailsScreen(new CardDetailsScreenDescriptor$InputData(true));
                    cui.v block23 = new cui.v(bVar10, FlowCoordinator2, i5);
                    Intrinsics.checkNotNullParameter(block23, "block");
                    cardDetailsScreen.H = block23;
                    return cardDetailsScreen;
                }
                if (!(step14 instanceof AddCardFlowContract$Step.PerformAddCard)) {
                    throw new NoWhenBranchMatchedException();
                }
                TopupWithNewCardFlow topupWithNewCardFlow = new TopupWithNewCardFlow(((AddCardFlowContract$Step.PerformAddCard) step14).f90594a);
                c1g.o block24 = new c1g.o(bVar10, 29, step14, FlowCoordinator2);
                Intrinsics.checkNotNullParameter(block24, "block");
                topupWithNewCardFlow.H = block24;
                return topupWithNewCardFlow;
        }
    }
}
