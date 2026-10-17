package u0i;

import android.content.Context;
import com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeBridgeFeatureConfig;
import com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeFlowInputData;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.impl.ui.exchange.order_summary.OrderSummaryContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import i2i.l;
import kotlin.jvm.internal.Intrinsics;
import m1i.f;
import m1i.o;
import sri.m;
import wd6.e;
import z1i.c;
import z1i.i;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof ExchangeFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        NaviCommand activityNavigateCommand;
        ExchangeFeatureConfig config = (ExchangeFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        boolean z = false;
        if (config instanceof ExchangeFeatureConfig.CryptoCommodityOnboarded) {
            i.Companion.getClass();
            activityNavigateCommand = com.revolut.retail.core.navigation.a.d(new ActivityNavigateCommand(c.f318816b, new OrderSummaryContract$Configuration(false, false, 6), null, null, 0, null, null, null, null, false, 1020));
        } else {
            boolean z3 = (config instanceof ExchangeFeatureConfig.Default) && ((ExchangeFeatureConfig.Default) config).f96842b == wd6.c.CRYPTO_ONLY;
            boolean z4 = config instanceof ExchangeFeatureConfig.Buy;
            boolean z6 = z4 && ((ExchangeFeatureConfig.Buy) config).d == wd6.c.CRYPTO_ONLY;
            boolean z11 = config instanceof ExchangeFeatureConfig.Sell;
            if (z11 && ((ExchangeFeatureConfig.Sell) config).e == wd6.c.CRYPTO_ONLY) {
                z = true;
            }
            if (!z3 && !z6 && !z) {
                o.Companion.getClass();
                activityNavigateCommand = new ActivityNavigateCommand(f.f201532b, config, null, null, 0, null, null, null, null, false, 1020);
            } else if (z4) {
                ExchangeFeatureConfig.Buy buy = (ExchangeFeatureConfig.Buy) config;
                activityNavigateCommand = gc0.c.f(new CryptoExchangeBridgeFeatureConfig(new CryptoExchangeFlowInputData(buy.f96831b, buy.f96830a, e.BUY, buy.f96832c, buy.k, buy.e, null, 64)));
            } else if (z11) {
                ExchangeFeatureConfig.Sell sell = (ExchangeFeatureConfig.Sell) config;
                activityNavigateCommand = gc0.c.f(new CryptoExchangeBridgeFeatureConfig(new CryptoExchangeFlowInputData(sell.f96850a, sell.f96851b, e.SELL, sell.d, false, sell.f, sell.f96852c, 16)));
            } else {
                l.Companion.getClass();
                activityNavigateCommand = new ActivityNavigateCommand(i2i.f.f157959b, config, null, null, 0, null, null, null, null, false, 1020);
            }
        }
        navigator.c(activityNavigateCommand);
    }
}
