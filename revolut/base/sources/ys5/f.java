package ys5;

import aii.u;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import com.revolut.feature.cryptocommodity_invest.api.CryptoInvestFeatureConfig;
import com.revolut.feature.defi.trade.api.navigation.DefiTradeDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import org.jmrtd.lds.LDSFile;
import pfm.m;
import pt5.t;
import tof.a3;
import ypg.l;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sr5.a f316404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu5.e f316405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f316406c;
    public final lt5.a d;
    public final q46.a e;

    public f(sr5.a navigationHandler, pu5.e cryptoTransactionDetailsNavigator, t transactionsFilterProvider, lt5.a source, q46.a emptyStateDestinationProvider) {
        Intrinsics.checkNotNullParameter(navigationHandler, "navigationHandler");
        Intrinsics.checkNotNullParameter(cryptoTransactionDetailsNavigator, "cryptoTransactionDetailsNavigator");
        Intrinsics.checkNotNullParameter(transactionsFilterProvider, "transactionsFilterProvider");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(emptyStateDestinationProvider, "emptyStateDestinationProvider");
        this.f316404a = navigationHandler;
        this.f316405b = cryptoTransactionDetailsNavigator;
        this.f316406c = transactionsFilterProvider;
        this.d = source;
        this.e = emptyStateDestinationProvider;
    }

    public final pfm.h b(u uVar) {
        pfm.h hVar = new pfm.h(new xza.a(this, uVar, 9), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // csh.f
    public final Class j() {
        return CryptoWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        u defiTradeDestination;
        CryptoWidgetContext widgetContext2 = (CryptoWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof g3;
        lt5.a aVar = this.d;
        CryptoInvestmentsFeatureConfig.CurrencyMode.AllCurrencies allCurrencies = CryptoInvestmentsFeatureConfig.CurrencyMode.AllCurrencies.f71404a;
        if (z) {
            return b(new CryptoInvestmentsFeatureConfig.ActivityDestination(pt5.b.TRANSACTIONS, allCurrencies, aVar, LDSFile.EF_DG12_TAG));
        }
        boolean z3 = event instanceof i;
        m mVar = m.f235744a;
        if (z3) {
            return ((i) event).f55375c instanceof RowsWidgetDelegate.Model ? b(new CryptoInvestmentsFeatureConfig.ActivityDestination(pt5.b.TRANSACTIONS, allCurrencies, aVar, LDSFile.EF_DG12_TAG)) : mVar;
        }
        if (!(event instanceof i3)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        RowDelegate.Model model = ((i3) event).f55382c;
        Object obj2 = model.u;
        if (obj2 instanceof a3) {
            a3 a3Var = (a3) obj2;
            if (!this.f316405b.b(a3Var)) {
                return b(u0.c(new TransactionsFeatureConfig.Details(q.P(a3Var), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124)));
            }
            d0 d0VarFirstOrError = m70.a.g(this.f316406c.a(CryptoInvestmentsFeatureConfig.CurrencyMode.AllCurrencies.f71404a, new ft5.a(null, 7)), null, new ypg.h(13), 1).firstOrError();
            l lVar = new l(new e(this, a3Var, 0), 13);
            d0VarFirstOrError.getClass();
            pfm.a aVar2 = new pfm.a(new pfm.a(d0VarFirstOrError, lVar, 4), new l(new e(this, a3Var, 1), 14), 2);
            Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
            return aVar2;
        }
        if (!Intrinsics.f(model.f53228a, "START_TRADE_BUTTON_LIST_ID")) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        switch (this.e.f242066a) {
            case 0:
                defiTradeDestination = new DefiTradeDestination(h0.f322473a);
                break;
            default:
                defiTradeDestination = u0.c(CryptoInvestFeatureConfig.Invest.f71500a);
                break;
        }
        return b(defiTradeDestination);
    }
}
