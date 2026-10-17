package n2l;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class l {
    public static final j a(WealthAccount wealthAccount) {
        Intrinsics.checkNotNullParameter(wealthAccount, "<this>");
        if (wealthAccount instanceof WealthAccount.Commodities) {
            return b.f211584a;
        }
        if (wealthAccount instanceof WealthAccount.Margin) {
            return a.f211583a;
        }
        if (wealthAccount instanceof WealthAccount.Robo) {
            return h.f211590a;
        }
        if (wealthAccount instanceof WealthAccount.Securities) {
            int i = k.f211592a[((WealthAccount.Securities) wealthAccount).f95239b.ordinal()];
            if (i == 1) {
                return i.f211591a;
            }
            if (i == 2) {
                return e.f211587a;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) {
            return d.f211586a;
        }
        if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Pea) {
            return f.f211588a;
        }
        if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa.Personal) {
            return g.f211589a;
        }
        if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa.Custodian) {
            return new c(((WealthAccount.TaxAdvantageWealthAccount.JIsa.Custodian) wealthAccount).f.f105176b);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final j b(TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "<this>");
        if (tradingAccount instanceof TradingAccount.GIA) {
            int i = k.f211593b[((TradingAccount.GIA) tradingAccount).e.ordinal()];
            if (i == 1) {
                return i.f211591a;
            }
            if (i == 2) {
                return e.f211587a;
            }
            if (i == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (tradingAccount instanceof TradingAccount.Margin) {
            return a.f211583a;
        }
        if (tradingAccount instanceof TradingAccount.Robo.Regular) {
            return h.f211590a;
        }
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) {
            return d.f211586a;
        }
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) {
            return f.f211588a;
        }
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) {
            return new c(((TradingAccount.TaxAdvantage.JIsa.Custodian) tradingAccount).f105237n.f105176b);
        }
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Personal) {
            return g.f211589a;
        }
        if ((tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) || (tradingAccount instanceof TradingAccount.MoneyMarketFunds) || (tradingAccount instanceof TradingAccount.PaperTrading) || (tradingAccount instanceof TradingAccount.Unknown)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final j c(TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard) {
        Intrinsics.checkNotNullParameter(tradingAccountAvailableToOnboard, "<this>");
        TradingAccountType tradingAccountType = tradingAccountAvailableToOnboard.d;
        if (Intrinsics.f(tradingAccountType, TradingAccountType.Gia.f105270a)) {
            int i = k.f211593b[tradingAccountAvailableToOnboard.e.ordinal()];
            if (i == 1) {
                return i.f211591a;
            }
            if (i == 2) {
                return e.f211587a;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (Intrinsics.f(tradingAccountType, TradingAccountType.Margin.f105271a)) {
                return a.f211583a;
            }
            if (Intrinsics.f(tradingAccountType, TradingAccountType.Robo.f105274a)) {
                return h.f211590a;
            }
            if (Intrinsics.f(tradingAccountType, TradingAccountType.Taa.f105275a)) {
                if (com.revolut.shared.feature.wealth.models.trading_accounts.b.a(tradingAccountAvailableToOnboard)) {
                    return d.f211586a;
                }
                if (com.revolut.shared.feature.wealth.models.trading_accounts.b.f(tradingAccountAvailableToOnboard)) {
                    return f.f211588a;
                }
                if (com.revolut.shared.feature.wealth.models.trading_accounts.b.h(tradingAccountAvailableToOnboard)) {
                    return g.f211589a;
                }
                Intrinsics.checkNotNullParameter(tradingAccountAvailableToOnboard, "<this>");
                if (com.revolut.shared.feature.wealth.models.trading_accounts.b.c(tradingAccountAvailableToOnboard) && tradingAccountAvailableToOnboard.f105269h.f105177c == cfl.a.DEPENDANT) {
                    return new c(null);
                }
                return null;
            }
            if (!Intrinsics.f(tradingAccountType, TradingAccountType.MoneyMarketFunds.f105272a) && !Intrinsics.f(tradingAccountType, TradingAccountType.PaperTrading.f105273a) && !Intrinsics.f(tradingAccountType, TradingAccountType.Unknown.f105276a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
