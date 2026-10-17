package zgh;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccountType f322123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322124b;

    public d(TradingAccountType accountType, String portfolioId) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f322123a = accountType;
        this.f322124b = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f322123a, dVar.f322123a) && Intrinsics.f(this.f322124b, dVar.f322124b);
    }

    public final int hashCode() {
        return this.f322124b.hashCode() + (this.f322123a.hashCode() * 31);
    }
}
