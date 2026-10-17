package n6i;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pcd.e0;
import pcd.g0;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static String a(AccountWrapper accountWrapper) {
        pcd.a aVar;
        SavingsAccountDetails savingsAccountDetails;
        pcd.s sVar;
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        if (!(accountWrapper.d instanceof AccountSource.NonExistingCurrencyAccount)) {
            switch (a.f212789a[accountWrapper.f97224a.ordinal()]) {
                case 1:
                    AccountSource accountSource = accountWrapper.d;
                    AccountSource.SavingsSource savingsSource = accountSource instanceof AccountSource.SavingsSource ? (AccountSource.SavingsSource) accountSource : null;
                    g0 g0Var = (savingsSource == null || (savingsAccountDetails = savingsSource.f97216a) == null || (sVar = savingsAccountDetails.f86460a) == null) ? null : sVar.f234885h;
                    e0 e0Var = g0Var instanceof e0 ? (e0) g0Var : null;
                    if (e0Var != null && (aVar = e0Var.d) != null) {
                        return aVar.f234843c;
                    }
                case 2:
                case 3:
                case 4:
                case 5:
                    return null;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    return accountWrapper.getPocketId();
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
