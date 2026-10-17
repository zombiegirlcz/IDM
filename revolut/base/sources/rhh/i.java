package rhh;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;
import t1h.p;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount.TaxAdvantage f254480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kel.b f254481b;

    public i(TradingAccount.TaxAdvantage taxAdvantageAccount, kel.b cashHolding) {
        Intrinsics.checkNotNullParameter(taxAdvantageAccount, "taxAdvantageAccount");
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        this.f254480a = taxAdvantageAccount;
        this.f254481b = cashHolding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f254480a, iVar.f254480a) && Intrinsics.f(this.f254481b, iVar.f254481b);
    }

    public final int hashCode() {
        return this.f254481b.hashCode() + (this.f254480a.hashCode() * 31);
    }
}
