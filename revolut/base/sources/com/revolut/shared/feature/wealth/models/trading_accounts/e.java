package com.revolut.shared.feature.wealth.models.trading_accounts;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e {
    public static final boolean a(TradingProduct tradingProduct) {
        Intrinsics.checkNotNullParameter(tradingProduct, "<this>");
        TradingProductCode tradingProductCode = tradingProduct.f105281b;
        return Intrinsics.f(tradingProductCode, TradingProductCode.RoboEU.f105332a) || Intrinsics.f(tradingProductCode, TradingProductCode.RoboGB.f105333a) || Intrinsics.f(tradingProductCode, TradingProductCode.RoboSG.f105334a) || Intrinsics.f(tradingProductCode, TradingProductCode.RoboUS.f105335a);
    }
}
