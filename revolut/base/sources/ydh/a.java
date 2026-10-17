package ydh;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final WealthAccountType a(TradingAccountType tradingAccountType) {
        Intrinsics.checkNotNullParameter(tradingAccountType, "<this>");
        if (Intrinsics.f(tradingAccountType, TradingAccountType.Gia.f105270a)) {
            return WealthAccountType.SECURITIES;
        }
        if (Intrinsics.f(tradingAccountType, TradingAccountType.Taa.f105275a)) {
            return WealthAccountType.TAA;
        }
        if (Intrinsics.f(tradingAccountType, TradingAccountType.Margin.f105271a)) {
            return WealthAccountType.MARGIN;
        }
        if (Intrinsics.f(tradingAccountType, TradingAccountType.Robo.f105274a)) {
            return WealthAccountType.ROBO;
        }
        if (!Intrinsics.f(tradingAccountType, TradingAccountType.Unknown.f105276a) && !Intrinsics.f(tradingAccountType, TradingAccountType.MoneyMarketFunds.f105272a) && !Intrinsics.f(tradingAccountType, TradingAccountType.PaperTrading.f105273a)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Unsupported account type " + tradingAccountType).toString());
    }
}
