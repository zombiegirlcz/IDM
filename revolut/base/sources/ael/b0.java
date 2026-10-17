package ael;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 implements ybl.a {
    @Override // ybl.a
    public final Set a() {
        return zhm.h0.f322473a;
    }

    @Override // ybl.a
    public final Set b() {
        TradingProductCode[] elements = {TradingProductCode.PrivateEquityEUFunds.f105329a, TradingProductCode.PrivateEquityUSFunds.f105331a, TradingProductCode.PrivateEquityCHFunds.f105327a, TradingProductCode.PrivateEquityGBFunds.f105330a, TradingProductCode.PrivateEquityEUCleanFunds.f105328a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }
}
