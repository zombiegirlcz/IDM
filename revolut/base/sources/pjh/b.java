package pjh;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccountType f236775b;

    public b(TradingAccountType accountType, String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f236774a = portfolioId;
        this.f236775b = accountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f236774a, bVar.f236774a) && Intrinsics.f(this.f236775b, bVar.f236775b);
    }

    public final int hashCode() {
        return this.f236775b.hashCode() + (this.f236774a.hashCode() * 31);
    }
}
