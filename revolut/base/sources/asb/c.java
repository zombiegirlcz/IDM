package asb;

import aii.u;
import android.os.Parcelable;
import aw0.e;
import aw0.n6;
import bfl.g;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.stock.StockSellAllController;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.stock.StockSellAllControllerContract$InputData;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$Destination;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dfl.r;
import grl.k9;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import k4l.e0;
import k4l.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import qrb.k;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {
    @Override // asb.d
    public final boolean a() {
        return true;
    }

    @Override // asb.d
    public final boolean b(k tradeInstrumentData) {
        Object next;
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        e0 e0VarB = tradeInstrumentData.b();
        Boolean boolValueOf = null;
        if (e0VarB != null) {
            Iterator it8 = e0VarB.f180958j.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (next instanceof g0) {
                    break;
                }
            }
            if (!(next instanceof g0)) {
                next = null;
            }
            g0 g0Var = (g0) next;
            if (g0Var != null) {
                boolValueOf = Boolean.valueOf(g0Var.f180971a.containsAll(v.k(r.STOCK_QUANTITY, r.MONEY_AMOUNT)));
            }
        }
        return pd.b.j(boolValueOf);
    }

    @Override // asb.d
    public final ViewController c(k tradeInstrumentData) {
        Object next;
        int i;
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        e0 e0VarB = tradeInstrumentData.b();
        if (e0VarB != null) {
            Iterator it8 = e0VarB.f180958j.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (next instanceof g0) {
                    break;
                }
            }
            if (!(next instanceof g0)) {
                next = null;
            }
            g0 g0Var = (g0) next;
            if (g0Var != null) {
                ArrayList arrayList = g0Var.f180971a;
                if (arrayList.size() <= 1) {
                    int i2 = b.f8911c[((r) d0.b0(arrayList)).ordinal()];
                    if (i2 == 1) {
                        i = R$string.wealth_stock_orders_market_order_amount_based_unavailable_description;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$string.wealth_stock_orders_market_order_quantity_based_unavailable_description;
                    }
                    lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.wealth_stock_orders_market_order_quantity_based_unavailable_title, null, null, 14), new TextLocalisedClause(i, null, null, 14), null, null, false, 28);
                    e eVar = new e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var = k9.Wealth;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                }
            }
        }
        return null;
    }

    @Override // asb.d
    public final ViewController d(TradingAccount tradingAccount, n instrument) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        String str = instrument.f214596b;
        String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new StockSellAllController(new StockSellAllControllerContract$InputData(str, string));
    }

    @Override // asb.d
    public final u e(g tradeSide, n instrument, TradingAccount tradingAccount, qrb.b inputType, BigDecimal inputValue) {
        r rVar;
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        InvestOrderContract$InputData.Companion companion = InvestOrderContract$InputData.INSTANCE;
        UUID f105262a = tradingAccount.getF105262a();
        int i = b.f8909a[inputType.ordinal()];
        if (i == 1) {
            rVar = r.MONEY_AMOUNT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            rVar = r.STOCK_QUANTITY;
        }
        companion.getClass();
        return new InvestOrderContract$Destination(InvestOrderContract$InputData.Companion.b(instrument, f105262a, tradeSide, inputValue, rVar));
    }

    @Override // asb.d
    public final u f(g tradeSide, n instrument, TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        throw new IllegalStateException("Stocks is available when market is closed");
    }

    @Override // asb.d
    public final qrb.b g(g tradeSide) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        int i = b.f8910b[tradeSide.ordinal()];
        if (i == 1) {
            return qrb.b.AMOUNT;
        }
        if (i == 2) {
            return qrb.b.QUANTITY;
        }
        throw new NoWhenBranchMatchedException();
    }
}
