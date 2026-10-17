package z2h;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import ip0.v7;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentTicker f319076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f319077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f319078c;
    public final BigDecimal d;
    public final TradingLegalEntityInformation e;
    public final List f;

    public a(InstrumentTicker ticker, dj0.d totalBalance, dj0.d totalDeltaCost, BigDecimal bigDecimal, TradingLegalEntityInformation tradingLegalEntityInformation, List accountsWithBalance) {
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(totalDeltaCost, "totalDeltaCost");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(accountsWithBalance, "accountsWithBalance");
        this.f319076a = ticker;
        this.f319077b = totalBalance;
        this.f319078c = totalDeltaCost;
        this.d = bigDecimal;
        this.e = tradingLegalEntityInformation;
        this.f = accountsWithBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f319076a, aVar.f319076a) && Intrinsics.f(this.f319077b, aVar.f319077b) && Intrinsics.f(this.f319078c, aVar.f319078c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f319076a.hashCode() * 31, 31, this.f319077b), 31, this.f319078c);
        BigDecimal bigDecimal = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iC + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31)) * 31);
    }
}
