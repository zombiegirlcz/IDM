package ael;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 implements ybl.a {
    @Override // ybl.a
    public final Set a() {
        return zhm.h0.f322473a;
    }

    @Override // ybl.a
    public final Set b() {
        TradingProductCode[] elements = {TradingProductCode.PrivateBankEUFunds.f105324a, TradingProductCode.PrivateBankUSFunds.f105326a, TradingProductCode.PrivateBankCHFunds.f105322a, TradingProductCode.PrivateBankGBFunds.f105325a, TradingProductCode.PrivateBankEUCleanFunds.f105323a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }
}
