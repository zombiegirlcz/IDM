package com.revolut.feature_move_money.api.model;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature_move_money.api.model.AccountSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static final SavingsAccountDetails a(AccountWrapper accountWrapper) {
        Intrinsics.checkNotNullParameter(accountWrapper, "<this>");
        AccountSource accountSource = accountWrapper.d;
        if (accountSource instanceof AccountSource.SavingsSource) {
            return ((AccountSource.SavingsSource) accountSource).f97216a;
        }
        if (accountSource instanceof AccountSource.JointSavingsSource) {
            return ((AccountSource.JointSavingsSource) accountSource).f97201a;
        }
        if (accountSource instanceof AccountSource.JuniorSavingsSource) {
            return ((AccountSource.JuniorSavingsSource) accountSource).f97207b;
        }
        if ((accountSource instanceof AccountSource.CreditCardSource) || (accountSource instanceof AccountSource.PocketSource) || (accountSource instanceof AccountSource.VaultSource) || (accountSource instanceof AccountSource.JointVaultSource) || (accountSource instanceof AccountSource.JuniorPocketSource) || (accountSource instanceof AccountSource.JuniorVaultSource) || (accountSource instanceof AccountSource.TeenPocketSource) || (accountSource instanceof AccountSource.TeenVaultSource) || (accountSource instanceof AccountSource.InvestCashHolding) || (accountSource instanceof AccountSource.NonExistingCurrencyAccount) || (accountSource instanceof AccountSource.RevPointsPocketSource) || (accountSource instanceof AccountSource.SpotMarginCollateralSource) || (accountSource instanceof AccountSource.FuturesCollateralSource)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Boolean b(AccountWrapper accountWrapper) {
        Intrinsics.checkNotNullParameter(accountWrapper, "<this>");
        SavingsAccountDetails savingsAccountDetailsA = a(accountWrapper);
        if (savingsAccountDetailsA == null) {
            return Boolean.FALSE;
        }
        SavingsProductData savingsProductData = savingsAccountDetailsA.f86462c;
        if (savingsProductData == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        return Boolean.valueOf(ocd.a.d(savingsProductData));
    }

    public static final String c(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return j6.a.q("SPOT_MARGIN_COLLATERAL", currency.f306286a);
    }
}
