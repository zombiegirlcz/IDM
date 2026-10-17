package z2h;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f319082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f319083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f319084c;
    public final TradingAccount d;

    public c(int i, Instant instant, n instrument, TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f319082a = i;
        this.f319083b = instant;
        this.f319084c = instrument;
        this.d = tradingAccount;
    }

    @Override // z2h.d
    public final int a() {
        return this.f319082a;
    }

    @Override // z2h.d
    public final Instant b() {
        return this.f319083b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f319082a == cVar.f319082a && Intrinsics.f(this.f319083b, cVar.f319083b) && Intrinsics.f(this.f319084c, cVar.f319084c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f319082a) * 31;
        Instant instant = this.f319083b;
        int iD = a10.b.d(this.f319084c, (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31, 31);
        TradingAccount tradingAccount = this.d;
        return iD + (tradingAccount != null ? tradingAccount.hashCode() : 0);
    }
}
