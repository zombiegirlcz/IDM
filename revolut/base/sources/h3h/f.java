package h3h;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f149129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149130b;

    public f(TradingAccount tradingAccount, String ref2) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f149129a = tradingAccount;
        this.f149130b = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f149129a, fVar.f149129a) && Intrinsics.f(this.f149130b, fVar.f149130b);
    }

    public final int hashCode() {
        return this.f149130b.hashCode() + (this.f149129a.hashCode() * 31);
    }
}
