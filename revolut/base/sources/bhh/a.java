package bhh;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import m72.b;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount.TaxAdvantage f15294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f15295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f15296c;
    public final double d;
    public final Double e;
    public final Long f;

    public a(TradingAccount.TaxAdvantage taxAdvantageAccount, d limit, d used, double d, Double d5, Long l2) {
        Intrinsics.checkNotNullParameter(taxAdvantageAccount, "taxAdvantageAccount");
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(used, "used");
        this.f15294a = taxAdvantageAccount;
        this.f15295b = limit;
        this.f15296c = used;
        this.d = d;
        this.e = d5;
        this.f = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f15294a, aVar.f15294a) && Intrinsics.f(this.f15295b, aVar.f15295b) && Intrinsics.f(this.f15296c, aVar.f15296c) && Double.compare(this.d, aVar.d) == 0 && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = b.c(v7.c(v7.c(this.f15294a.hashCode() * 31, 31, this.f15295b), 31, this.f15296c), this.d, 31);
        Double d = this.e;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        Long l2 = this.f;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
