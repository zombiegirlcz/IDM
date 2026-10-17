package za7;

import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {
    public final String a(AccountWrapper account) {
        Intrinsics.checkNotNullParameter(account, "account");
        AccountSource accountSource = account.d;
        if (accountSource instanceof AccountSource.PocketSource) {
            return ((AccountSource.PocketSource) accountSource).f97213a.f163145a;
        }
        if (accountSource instanceof AccountSource.VaultSource) {
            return ((AccountSource.VaultSource) accountSource).f97223a.f234881a;
        }
        if (accountSource instanceof AccountSource.JointVaultSource) {
            return ((AccountSource.JointVaultSource) accountSource).f97202a.f234881a;
        }
        if (accountSource instanceof AccountSource.SavingsSource) {
            return ((AccountSource.SavingsSource) accountSource).f97216a.f86460a.f234881a;
        }
        if (accountSource instanceof AccountSource.JointSavingsSource) {
            return ((AccountSource.JointSavingsSource) accountSource).f97201a.f86460a.f234881a;
        }
        if (accountSource instanceof AccountSource.CreditCardSource) {
            return ((AccountSource.CreditCardSource) accountSource).f97192a.f69793b;
        }
        if (accountSource instanceof AccountSource.RevPointsPocketSource) {
            return ((AccountSource.RevPointsPocketSource) accountSource).f97214a.f97784a;
        }
        if (accountSource instanceof AccountSource.JuniorPocketSource) {
            return ((AccountSource.JuniorPocketSource) accountSource).f97204b.f163145a;
        }
        if (accountSource instanceof AccountSource.JuniorVaultSource) {
            return ((AccountSource.JuniorVaultSource) accountSource).f97209b.f234881a;
        }
        if (accountSource instanceof AccountSource.JuniorSavingsSource) {
            return ((AccountSource.JuniorSavingsSource) accountSource).f97207b.f86460a.f234881a;
        }
        if (accountSource instanceof AccountSource.TeenPocketSource) {
            return ((AccountSource.TeenPocketSource) accountSource).f97220b.f163145a;
        }
        if (accountSource instanceof AccountSource.TeenVaultSource) {
            return ((AccountSource.TeenVaultSource) accountSource).f97222b.f234881a;
        }
        if (accountSource instanceof AccountSource.InvestCashHolding) {
            return ((AccountSource.InvestCashHolding) accountSource).f97199b.f183150c;
        }
        if (accountSource instanceof AccountSource.NonExistingCurrencyAccount) {
            return ((AccountSource.NonExistingCurrencyAccount) accountSource).f97210a.f306286a;
        }
        if (accountSource instanceof AccountSource.SpotMarginCollateralSource) {
            return com.revolut.feature_move_money.api.model.b.c(((AccountSource.SpotMarginCollateralSource) accountSource).f97218b.f115083b);
        }
        if (accountSource instanceof AccountSource.FuturesCollateralSource) {
            return ((AccountSource.FuturesCollateralSource) accountSource).f97195a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String b(BalanceWrapper balance) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        if (!(balance instanceof BalanceWrapper.CreditCardBalanceWrapper) && !(balance instanceof BalanceWrapper.JuniorPocketBalanceWrapper)) {
            if (balance instanceof BalanceWrapper.JuniorSavingsBalanceWrapper) {
                return ((BalanceWrapper.JuniorSavingsBalanceWrapper) balance).f99423h.f86460a.f234881a;
            }
            if (balance instanceof BalanceWrapper.JuniorVaultBalanceWrapper) {
                return ((BalanceWrapper.JuniorVaultBalanceWrapper) balance).f99426j.f234881a;
            }
            if (balance instanceof BalanceWrapper.TeenPocketBalanceWrapper) {
                return balance.f99404a;
            }
            if (balance instanceof BalanceWrapper.TeenVaultBalanceWrapper) {
                return ((BalanceWrapper.TeenVaultBalanceWrapper) balance).f99445h.f234881a;
            }
            if (!(balance instanceof BalanceWrapper.NonExistingCurrencyBalanceWrapper) && !(balance instanceof BalanceWrapper.PocketBalanceWrapper)) {
                if (balance instanceof BalanceWrapper.ProVaultBalanceWrapper) {
                    return ((BalanceWrapper.ProVaultBalanceWrapper) balance).f99434h.f234881a;
                }
                if (balance instanceof BalanceWrapper.RevPointsAccountBalanceWrapper) {
                    return ((BalanceWrapper.RevPointsAccountBalanceWrapper) balance).f99435h;
                }
                if (balance instanceof BalanceWrapper.RevPointsPocketBalanceWrapper) {
                    return balance.f99404a;
                }
                if (balance instanceof BalanceWrapper.SavingsBalanceWrapper) {
                    return ((BalanceWrapper.SavingsBalanceWrapper) balance).f99439h.f86460a.f234881a;
                }
                if (balance instanceof BalanceWrapper.TradingAccountBalanceWrapper) {
                    return balance.f99404a;
                }
                if (balance instanceof BalanceWrapper.VaultBalanceWrapper) {
                    return ((BalanceWrapper.VaultBalanceWrapper) balance).f99452h.f234881a;
                }
                if (!(balance instanceof BalanceWrapper.CollateralBalanceWrapper) && !(balance instanceof BalanceWrapper.DeFiBalanceWrapper)) {
                    throw new NoWhenBranchMatchedException();
                }
                return balance.f99404a;
            }
            return balance.f99404a;
        }
        return balance.f99404a;
    }
}
