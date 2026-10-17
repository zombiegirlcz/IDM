package q6i;

import com.revolut.feature_move_money.api.model.AccountSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static prf.a a(AccountSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof AccountSource.SavingsSource) {
            return prf.a.SAVINGS;
        }
        if (source instanceof AccountSource.InvestCashHolding) {
            return prf.a.INVESTMENT;
        }
        if ((source instanceof AccountSource.VaultSource) || (source instanceof AccountSource.JointVaultSource) || (source instanceof AccountSource.JuniorVaultSource) || (source instanceof AccountSource.CreditCardSource) || (source instanceof AccountSource.RevPointsPocketSource) || (source instanceof AccountSource.JuniorSavingsSource) || (source instanceof AccountSource.JointSavingsSource) || (source instanceof AccountSource.PocketSource) || (source instanceof AccountSource.NonExistingCurrencyAccount) || (source instanceof AccountSource.JuniorPocketSource) || (source instanceof AccountSource.TeenPocketSource) || (source instanceof AccountSource.TeenVaultSource) || (source instanceof AccountSource.SpotMarginCollateralSource) || (source instanceof AccountSource.FuturesCollateralSource)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
