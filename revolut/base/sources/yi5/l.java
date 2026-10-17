package yi5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.orders_widget.impl.R$string;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.feature_crypto_order_details.api.CryptoOrderDetailsApi$Toggles$CryptoOrderDetailsPager;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.feature_crypto_order_details.api.navigation.TPSLOrderDetailsFeatureConfig;
import com.revolut.feature_exchange.api.navigation.OrderDetailsFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import hx7.q;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import qua.p;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ss5.a f314257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iva.a f314258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f314259c;
    public final pu5.a d;
    public final xh5.a e;

    public l(ss5.a cryptoFeedWidgetsEventDispatcher, iva.a recurringBuysNavigationProvider, a0 widgetsUiInteractor, pu5.a cryptoOrderDetailsNavigator, xh5.a cryptoFeatureEnabledInteractor) {
        Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher, "cryptoFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(recurringBuysNavigationProvider, "recurringBuysNavigationProvider");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(cryptoOrderDetailsNavigator, "cryptoOrderDetailsNavigator");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        this.f314257a = cryptoFeedWidgetsEventDispatcher;
        this.f314258b = recurringBuysNavigationProvider;
        this.f314259c = widgetsUiInteractor;
        this.d = cryptoOrderDetailsNavigator;
        this.e = cryptoFeatureEnabledInteractor;
    }

    public final pfm.h b(ParcelableDestination parcelableDestination) {
        pfm.h hVar = new pfm.h(new xza.a(this, parcelableDestination, 6), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // csh.f
    public final Class j() {
        return CryptoWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        CryptoWidgetContext widgetContext2 = (CryptoWidgetContext) widgetContext;
        gte.a aVar = this.d.f239824a;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.i;
        CryptoInvestmentsFeatureConfig.CurrencyMode.AllCurrencies allCurrencies = CryptoInvestmentsFeatureConfig.CurrencyMode.AllCurrencies.f71404a;
        m mVar = m.f235744a;
        if (z) {
            return ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c instanceof RowsWidgetDelegate.Model ? b(new CryptoInvestmentsFeatureConfig.ActivityDestination(pt5.b.ORDERS, allCurrencies, null, 124)) : mVar;
        }
        if (event instanceof g3) {
            return b(new CryptoInvestmentsFeatureConfig.ActivityDestination(pt5.b.ORDERS, allCurrencies, null, 124));
        }
        if (event instanceof q0) {
            pfm.h hVar = new pfm.h(new yc7.k(this, 1, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        if (!(event instanceof i3)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        RowDelegate.Model model = ((i3) event).f55382c;
        Object obj2 = model.u;
        if (obj2 instanceof p) {
            p pVar = (p) obj2;
            boolean zC = ((jte.d) aVar).c(CryptoOrderDetailsApi$Toggles$CryptoOrderDetailsPager.f96656c);
            iva.a aVar2 = this.f314258b;
            if (!zC) {
                pfm.a aVar3 = new pfm.a(((pva.d) aVar2).b(pVar), new ya6.f(new k(this, 1), 27), 4);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                return aVar3;
            }
            CryptoOrderDetailsInputData.RecurringInputData recurringInputDataA = ((pva.d) aVar2).a(pVar);
            if (recurringInputDataA == null) {
                pfm.a aVar4 = new pfm.a(((pva.d) aVar2).b(pVar), new ya6.f(new k(this, 1), 27), 4);
                Intrinsics.checkNotNullExpressionValue(aVar4, "flatMapCompletable(...)");
                return aVar4;
            }
            pfm.h hVar2 = new pfm.h(new xza.a(this, recurringInputDataA, 7), 2);
            Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
            return hVar2;
        }
        if (obj2 instanceof ExchangeOrder.Active) {
            ExchangeOrder.Active order = (ExchangeOrder.Active) obj2;
            Intrinsics.checkNotNullParameter(order, "order");
            if (((jte.d) aVar).c(CryptoOrderDetailsApi$Toggles$CryptoOrderDetailsPager.f96656c)) {
                return new pfm.h(new xza.a(this, order, 5), 2);
            }
            return b(u0.b(new FeatureCommand(q.P(order) ? new TPSLOrderDetailsFeatureConfig(order) : new OrderDetailsFeatureConfig(order))));
        }
        if (!Intrinsics.f(model.f53228a, "ADD_ORDER_AUTOMATION_BUTTON_ID")) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        d0 d0VarA = xh5.a.a(this.e, gc0.c.f(new CryptoRemittanceKompotFeatureConfig.CurrencyPicker(new CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData((CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies) null, new TextLocalisedClause(R$string.crypto_orders_widget_currency_chooser_title, null, null, 14), (CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint) CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.OrdersWidget.f70940a, (pj5.a) null, (TextLocalisedClause) null, false, false, Constants.TAG_F5), null)));
        ya6.f fVar = new ya6.f(new k(this, 0), 26);
        d0VarA.getClass();
        pfm.a aVar5 = new pfm.a(d0VarA, fVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar5, "flatMapCompletable(...)");
        return aVar5;
    }
}
