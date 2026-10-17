package qih;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;
import prk.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f246710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f246711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TradingLegalEntityInformation f246712c;

    public b(kel.b cashHolding, TradingAccount tradingAccount, TradingLegalEntityInformation tradingLegalEntityInformation) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        this.f246710a = cashHolding;
        this.f246711b = tradingAccount;
        this.f246712c = tradingLegalEntityInformation;
    }

    public final kel.b b() {
        return this.f246710a;
    }

    public final TradingAccount c() {
        return this.f246711b;
    }

    public final TradingLegalEntityInformation d() {
        return this.f246712c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f246710a, bVar.f246710a) && Intrinsics.f(this.f246711b, bVar.f246711b) && Intrinsics.f(this.f246712c, bVar.f246712c);
    }

    public final int hashCode() {
        return this.f246712c.hashCode() + o.b(this.f246711b, this.f246710a.hashCode() * 31, 31);
    }
}
