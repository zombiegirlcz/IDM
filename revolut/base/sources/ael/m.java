package ael;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements ybl.a {
    @Override // ybl.a
    public final Set a() {
        return zhm.h0.f322473a;
    }

    @Override // ybl.a
    public final Set b() {
        TradingProductCode[] elements = {TradingProductCode.MutualEUFunds.f105319a, TradingProductCode.MutualUSFunds.f105320a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }
}
