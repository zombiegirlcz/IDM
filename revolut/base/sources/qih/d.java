package qih;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f246716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f246717b;

    public d(kel.b cashHolding, TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f246716a = cashHolding;
        this.f246717b = tradingAccount;
    }

    public final kel.b b() {
        return this.f246716a;
    }

    public final TradingAccount c() {
        return this.f246717b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f246716a, dVar.f246716a) && Intrinsics.f(this.f246717b, dVar.f246717b);
    }

    public final int hashCode() {
        return this.f246717b.hashCode() + (this.f246716a.hashCode() * 31);
    }
}
