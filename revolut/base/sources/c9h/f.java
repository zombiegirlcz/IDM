package c9h;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccountType f22464a;

    public f(TradingAccountType accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f22464a = accountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f22464a, ((f) obj2).f22464a);
    }

    public final int hashCode() {
        return this.f22464a.hashCode();
    }
}
