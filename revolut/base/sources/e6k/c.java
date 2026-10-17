package e6k;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.DeFiBalanceSource;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.feature.transfer.core.models.SavingsAccount;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.WealthPortfolio;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qua.r;
import qua.s;
import qua.v;

/* JADX INFO: loaded from: classes11.dex */
public final class c {
    private c() {
    }

    public static a a(FundingSource fundingSource) {
        Intrinsics.checkNotNullParameter(fundingSource, "<this>");
        if (fundingSource instanceof PocketSource) {
            return new a(fundingSource.f92240a, null, null);
        }
        if (fundingSource instanceof SavingsAccount) {
            return new a(null, ((SavingsAccount) fundingSource).e, v.SAVINGS_ACCOUNT);
        }
        if (fundingSource instanceof WealthPortfolio) {
            return new a(null, ((WealthPortfolio) fundingSource).d, v.PORTFOLIO);
        }
        if (fundingSource instanceof DeFiBalanceSource) {
            throw new IllegalStateException("DeFi is not supported as a recurring payment source");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static SourceAccount b(s sVar, String str, AccountId accountId) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        r rVar = sVar.f249336b;
        String str2 = sVar.f249335a;
        int i = b.f123015a[rVar.ordinal()];
        if (i == 1) {
            return new SourceAccount.SavingsAccount(accountId, str2);
        }
        if (i != 2) {
            if (i == 3) {
                return new SourceAccount.Pocket(null, null, accountId, 2);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (str == null || str.length() == 0) {
            return new SourceAccount.Pocket(null, null, accountId, 2);
        }
        xi0.b.Companion.getClass();
        return new SourceAccount.TradingPortfolioAccount(str2, xi0.a.a(str));
    }
}
