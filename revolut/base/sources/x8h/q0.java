package x8h;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.api.domain.model.balance.WealthAccountBalance;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WealthAccount f303375b;

    public /* synthetic */ q0(WealthAccount wealthAccount, int i) {
        this.f303374a = i;
        this.f303375b = wealthAccount;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f303374a) {
            case 0:
                WealthAccountBalance balance = (WealthAccountBalance) obj2;
                Intrinsics.checkNotNullParameter(balance, "balance");
                return new Pair(this.f303375b, balance);
            case 1:
                WealthAccount it8 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                WealthAccountType wealthAccountTypeT0 = it8.T0();
                WealthAccount wealthAccount = this.f303375b;
                return Boolean.valueOf(wealthAccountTypeT0 == wealthAccount.T0() && it8.getF95256g() == wealthAccount.getF95256g());
            default:
                dj0.d accountBalance = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(accountBalance, "accountBalance");
                return new xke.a(accountBalance, this.f303375b);
        }
    }
}
