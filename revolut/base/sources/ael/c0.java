package ael;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 implements ybl.a {
    @Override // ybl.a
    public final Set b() {
        TradingProductCode[] elements = {TradingProductCode.StockLendingUS.f105336a, TradingProductCode.GiaSecurityLending.f105307a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }
}
