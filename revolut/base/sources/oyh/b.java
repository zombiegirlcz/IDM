package oyh;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import dj0.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static final String a(CryptoExchangeContract$MoneyDetails.BalanceIdentifier balanceIdentifier) {
        Intrinsics.checkNotNullParameter(balanceIdentifier, "<this>");
        if (balanceIdentifier instanceof CryptoExchangeContract$MoneyDetails.BalanceIdentifier.Pocket) {
            return ((CryptoExchangeContract$MoneyDetails.BalanceIdentifier.Pocket) balanceIdentifier).f96687a;
        }
        if (balanceIdentifier instanceof CryptoExchangeContract$MoneyDetails.BalanceIdentifier.LoyaltyAccount) {
            return ((CryptoExchangeContract$MoneyDetails.BalanceIdentifier.LoyaltyAccount) balanceIdentifier).f96686a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AccountId b(CryptoExchangeContract$MoneyDetails.BalanceIdentifier balanceIdentifier) {
        Intrinsics.checkNotNullParameter(balanceIdentifier, "<this>");
        if (balanceIdentifier instanceof CryptoExchangeContract$MoneyDetails.BalanceIdentifier.Pocket) {
            return ((CryptoExchangeContract$MoneyDetails.BalanceIdentifier.Pocket) balanceIdentifier).f96688b;
        }
        if (balanceIdentifier instanceof CryptoExchangeContract$MoneyDetails.BalanceIdentifier.LoyaltyAccount) {
            return AccountId.Personal.f51414a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean c(CryptoExchangeContract$MoneyDetails.BalanceIdentifier balanceIdentifier) {
        Intrinsics.checkNotNullParameter(balanceIdentifier, "<this>");
        if (balanceIdentifier instanceof CryptoExchangeContract$MoneyDetails.BalanceIdentifier.Pocket) {
            return false;
        }
        if (balanceIdentifier instanceof CryptoExchangeContract$MoneyDetails.BalanceIdentifier.LoyaltyAccount) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final d d(CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails) {
        Intrinsics.checkNotNullParameter(cryptoExchangeContract$MoneyDetails, "<this>");
        Long l2 = cryptoExchangeContract$MoneyDetails.f96684b;
        return new d(l2 != null ? l2.longValue() : 0L, cryptoExchangeContract$MoneyDetails.f96683a);
    }
}
