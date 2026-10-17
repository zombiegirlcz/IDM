package tsd;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f274070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingLegalEntityInformation f274071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2l.j f274072c;

    public b(a netWorthInvestGroup, TradingLegalEntityInformation tradingLegalEntityInformation, n2l.j wealthUiType) {
        Intrinsics.checkNotNullParameter(netWorthInvestGroup, "netWorthInvestGroup");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(wealthUiType, "wealthUiType");
        this.f274070a = netWorthInvestGroup;
        this.f274071b = tradingLegalEntityInformation;
        this.f274072c = wealthUiType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f274070a == bVar.f274070a && Intrinsics.f(this.f274071b, bVar.f274071b) && Intrinsics.f(this.f274072c, bVar.f274072c);
    }

    public final int hashCode() {
        return this.f274072c.hashCode() + ((this.f274071b.hashCode() + (this.f274070a.hashCode() * 31)) * 31);
    }
}
