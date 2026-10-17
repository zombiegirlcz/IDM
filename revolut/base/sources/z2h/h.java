package z2h;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f319089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final del.a f319090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f319091c;
    public final dj0.d d;
    public final BigDecimal e;

    public h(TradingAccount tradingAccount, del.a instrumentBalance) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(instrumentBalance, "instrumentBalance");
        this.f319089a = tradingAccount;
        this.f319090b = instrumentBalance;
        this.f319091c = instrumentBalance.e.f183174b;
        this.d = instrumentBalance.a();
        this.e = instrumentBalance.d;
    }

    @Override // z2h.i
    public final TradingAccount N() {
        return this.f319089a;
    }

    @Override // z2h.i
    public final BigDecimal a() {
        return this.e;
    }

    @Override // z2h.i
    public final dj0.d b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f319089a, hVar.f319089a) && Intrinsics.f(this.f319090b, hVar.f319090b);
    }

    public final int hashCode() {
        return this.f319090b.hashCode() + (this.f319089a.hashCode() * 31);
    }

    @Override // z2h.i
    public final BigDecimal u() {
        return this.f319091c;
    }
}
