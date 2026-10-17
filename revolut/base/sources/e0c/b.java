package e0c;

import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoTradeDestination;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends c0c.d {
    @Override // c0c.d
    public final void Z2(c0c.c clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        xi0.b.Companion.getClass();
        A2(new CryptoTradeDestination(new BuyFundingCurrencyPrefill(xi0.a.a("PTS"), wd6.a.REV_POINTS_REDEEM), null, 2));
    }
}
