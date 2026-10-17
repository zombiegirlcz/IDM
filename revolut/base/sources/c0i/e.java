package c0i;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f20280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoExchangeContract$MoneyDetails.BalanceIdentifier f20281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f20282c;
    public final a d;
    public final long e;
    public final wd6.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f20283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f20284h;

    public e(dj0.d moneyFrom, CryptoExchangeContract$MoneyDetails.BalanceIdentifier balanceIdentifier, dj0.d moneyTo, a exchangeOperation, long j2, wd6.e exchangeMode, Double d, Double d5) {
        Intrinsics.checkNotNullParameter(moneyFrom, "moneyFrom");
        Intrinsics.checkNotNullParameter(balanceIdentifier, "balanceIdentifier");
        Intrinsics.checkNotNullParameter(moneyTo, "moneyTo");
        Intrinsics.checkNotNullParameter(exchangeOperation, "exchangeOperation");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f20280a = moneyFrom;
        this.f20281b = balanceIdentifier;
        this.f20282c = moneyTo;
        this.d = exchangeOperation;
        this.e = j2;
        this.f = exchangeMode;
        this.f20283g = d;
        this.f20284h = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f20280a, eVar.f20280a) && Intrinsics.f(this.f20281b, eVar.f20281b) && Intrinsics.f(this.f20282c, eVar.f20282c) && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && Intrinsics.f(this.f20283g, eVar.f20283g) && Intrinsics.f(this.f20284h, eVar.f20284h);
    }

    public final int hashCode() {
        int iG = y.g(this.f, a0.d.c((this.d.hashCode() + v7.c((this.f20281b.hashCode() + (this.f20280a.hashCode() * 31)) * 31, 31, this.f20282c)) * 31, 31, this.e), 961);
        Double d = this.f20283g;
        int iHashCode = (iG + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.f20284h;
        return iHashCode + (d5 != null ? d5.hashCode() : 0);
    }
}
