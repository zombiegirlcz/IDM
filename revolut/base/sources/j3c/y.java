package j3c;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.feature.apm.multibanco.impl.ui.pending.confirmation.PendingPaymentConfirmationScreen;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationController;
import com.revolut.feature.card_screen.impl.kompot.reactivate.chargeback.TerminatedCardChargebackScreen;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.SelectAccountV2Controller;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.LoanManageRepaymentsController;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.setup.DirectDepositSetupScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.CobrandedCardsPlanHubRewardsScreen;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerController;
import com.revolut.retail.feature.beneficiary.impl.R$string;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.order_type_selection.CommodityOrderTypeSelectionScreen;
import j3c.c0;
import j3c.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171164a;

    public /* synthetic */ y(int i) {
        this.f171164a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f171164a) {
            case 0:
                z.Companion companion = z.INSTANCE;
                return new qlm.e(c0.a.f171035a);
            case 1:
                KProperty[] kPropertyArr = ChartLimitPickerController.U;
                return new TrendViewDelegate(1000L);
            case 2:
                KProperty[] kPropertyArr2 = ChartLimitPickerController.U;
                return new FixedTabsDelegate();
            case 3:
                KProperty[] kPropertyArr3 = ChartLimitPickerController.U;
                return new LargeActionButtonDelegate();
            case 4:
                KProperty[] kPropertyArr4 = ChartLimitPickerController.U;
                return new RowDelegate(null, null, 7);
            case 5:
                KProperty[] kPropertyArr5 = SelectAccountV2Controller.U;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr6 = SelectAccountV2Controller.U;
                return new FullScreenStateDelegate();
            case 7:
                KProperty[] kPropertyArr7 = SelectAccountV2Controller.U;
                return new ListSubheaderDelegate();
            case 8:
                return zhm.v.k(new FixedTabs.Item("PERSONAL", new TextLocalisedClause(R$string.bank_transfer_type_switcher_individual, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("BUSINESS", new TextLocalisedClause(R$string.bank_transfer_type_switcher_business, null, null, 14), (AnalyticsContext) null, 12));
            case 9:
                CustomisationImageGenerationController.a aVar = CustomisationImageGenerationController.Companion;
                return new FullScreenStateDelegate();
            case 10:
                CustomisationImageGenerationController.a aVar2 = CustomisationImageGenerationController.Companion;
                return new SuggestionsBarDelegate();
            case 11:
                return Unit.f186387a;
            case 12:
                return Unit.f186387a;
            case 13:
                KProperty[] kPropertyArr8 = LoanManageRepaymentsController.U;
                return new RowDelegate(null, null, 7);
            case 14:
                KProperty[] kPropertyArr9 = LoanManageRepaymentsController.U;
                return new CellDetailsActionDelegate();
            case 15:
                KProperty[] kPropertyArr10 = LoanManageRepaymentsController.U;
                return new FullScreenStateDelegate();
            case 16:
                KProperty[] kPropertyArr11 = CobrandedCardsPlanHubRewardsScreen.V;
                return new ListSubheaderDelegate();
            case 17:
                KProperty[] kPropertyArr12 = CobrandedCardsPlanHubRewardsScreen.V;
                return new RowDelegate(null, null, 7);
            case 18:
                KProperty[] kPropertyArr13 = CobrandedCardsPlanHubRewardsScreen.V;
                return new InputDisclosureDelegate();
            case 19:
                KProperty[] kPropertyArr14 = CobrandedCardsPlanHubRewardsScreen.V;
                return new FullScreenStateDelegate();
            case 20:
                KProperty[] kPropertyArr15 = CobrandedCardsPlanHubRewardsScreen.V;
                return new LargeActionButtonDelegate();
            case 21:
                KProperty[] kPropertyArr16 = CommodityOrderTypeSelectionScreen.S;
                return new AccountCellItemDelegate();
            case 22:
                KProperty[] kPropertyArr17 = PendingPaymentConfirmationScreen.S;
                return new RowDelegate(null, null, 7);
            case 23:
                KProperty[] kPropertyArr18 = PendingPaymentConfirmationScreen.S;
                return new TimerDelegate();
            case 24:
                KProperty[] kPropertyArr19 = PendingPaymentConfirmationScreen.S;
                return new FullScreenStateDelegate();
            case 25:
                KProperty[] kPropertyArr20 = TerminatedCardChargebackScreen.f65492e0;
                return new RowDelegate(null, null, 7);
            case 26:
                KProperty[] kPropertyArr21 = TerminatedCardChargebackScreen.f65492e0;
                return new LargeActionButtonDelegate();
            case 27:
                KProperty[] kPropertyArr22 = TerminatedCardChargebackScreen.f65492e0;
                return new FullScreenStateDelegate();
            case 28:
                KProperty[] kPropertyArr23 = DirectDepositSetupScreen.T;
                return new ListSubheaderDelegate();
            default:
                KProperty[] kPropertyArr24 = DirectDepositSetupScreen.T;
                return new WebViewDelegate();
        }
    }
}
