package ael;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements ybl.a {
    @Override // ybl.a
    public final Set a() {
        TradingProductCode[] elements = {TradingProductCode.GiaEUComplexBonds.f105296a, TradingProductCode.GiaUSComplexBonds.f105310a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    @Override // ybl.a
    public final Set b() {
        TradingProductCode[] elements = {TradingProductCode.GiaGBUSBonds.f105305a, TradingProductCode.GiaGBEUBonds.f105301a, TradingProductCode.GiaGBBonds.f105300a, TradingProductCode.GiaEUBonds.f105295a, TradingProductCode.GiaUSBonds.f105309a, TradingProductCode.GiaEUComplexBonds.f105296a, TradingProductCode.GiaUSComplexBonds.f105310a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }
}
