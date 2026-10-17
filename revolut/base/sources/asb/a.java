package asb;

import aii.u;
import bfl.g;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.cfd.CfdClosePositionsSelectorContract$InputData;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.cfd.CfdClosePositionsSelectorController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import qrb.k;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements d {
    @Override // asb.d
    public final boolean a() {
        return false;
    }

    @Override // asb.d
    public final boolean b(k tradeInstrumentData) {
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        return false;
    }

    @Override // asb.d
    public final ViewController c(k tradeInstrumentData) {
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        return null;
    }

    @Override // asb.d
    public final ViewController d(TradingAccount tradingAccount, n instrument) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        String str = instrument.f214596b;
        String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new CfdClosePositionsSelectorController(new CfdClosePositionsSelectorContract$InputData(str, string));
    }

    @Override // asb.d
    public final u e(g tradeSide, n instrument, TradingAccount tradingAccount, qrb.b inputType, BigDecimal inputValue) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return u0.c(new CfdTradingFeatureConfig.OrderFlow(tradeSide, instrument, string, inputValue, 32));
    }

    @Override // asb.d
    public final u f(g tradeSide, n instrument, TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return u0.c(new CfdTradingFeatureConfig.OrderFlow(tradeSide, instrument, string, null, 40));
    }

    @Override // asb.d
    public final qrb.b g(g tradeSide) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        return qrb.b.QUANTITY;
    }
}
