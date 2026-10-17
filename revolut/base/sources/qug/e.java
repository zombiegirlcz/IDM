package qug;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f249443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountClosureFeedbackChoice f249444b;

    public e(TradingAccount account, AccountClosureFeedbackChoice accountClosureFeedbackChoice) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f249443a = account;
        this.f249444b = accountClosureFeedbackChoice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f249443a, eVar.f249443a) && Intrinsics.f(this.f249444b, eVar.f249444b);
    }

    public final int hashCode() {
        int iHashCode = this.f249443a.hashCode() * 31;
        AccountClosureFeedbackChoice accountClosureFeedbackChoice = this.f249444b;
        return iHashCode + (accountClosureFeedbackChoice == null ? 0 : accountClosureFeedbackChoice.hashCode());
    }
}
