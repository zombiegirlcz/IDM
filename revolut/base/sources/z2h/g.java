package z2h;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import d9.e1;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f319086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y49.h f319088c;
    public final BigDecimal d;
    public final dj0.d e;
    public final BigDecimal f;

    public g(TradingAccount tradingAccount, String cfdInstrumentRef, y49.h positionsPerformance) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(cfdInstrumentRef, "cfdInstrumentRef");
        Intrinsics.checkNotNullParameter(positionsPerformance, "positionsPerformance");
        this.f319086a = tradingAccount;
        this.f319087b = cfdInstrumentRef;
        this.f319088c = positionsPerformance;
        this.d = positionsPerformance.f310848b;
        this.e = positionsPerformance.f310849c;
        this.f = e1.Z(positionsPerformance.d);
    }

    @Override // z2h.i
    public final TradingAccount N() {
        return this.f319086a;
    }

    @Override // z2h.i
    public final BigDecimal a() {
        return this.f;
    }

    @Override // z2h.i
    public final dj0.d b() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f319086a, gVar.f319086a) && Intrinsics.f(this.f319087b, gVar.f319087b) && Intrinsics.f(this.f319088c, gVar.f319088c);
    }

    public final int hashCode() {
        return this.f319088c.hashCode() + p.a.c(this.f319086a.hashCode() * 31, 31, this.f319087b);
    }

    @Override // z2h.i
    public final BigDecimal u() {
        return this.d;
    }
}
