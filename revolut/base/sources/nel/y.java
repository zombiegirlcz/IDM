package nel;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f214637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccountType f214638b;

    public y(n instrument, TradingAccountType accountType) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f214637a = instrument;
        this.f214638b = accountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f214637a, yVar.f214637a) && Intrinsics.f(this.f214638b, yVar.f214638b);
    }

    public final int hashCode() {
        return this.f214638b.hashCode() + (this.f214637a.hashCode() * 31);
    }
}
