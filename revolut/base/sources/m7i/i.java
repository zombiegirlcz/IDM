package m7i;

import c7i.o;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import h7i.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f203409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f203410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f203411c;
    public final long d;
    public final c7i.f e;
    public final WalletAutomation.Limit f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OrderQuote f203412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f203413h;

    public i(o topAccount, o bottomAccount, long j2, long j3, c7i.f rule, WalletAutomation.Limit limit, OrderQuote orderQuote, p recurringPaymentContext) {
        Intrinsics.checkNotNullParameter(topAccount, "topAccount");
        Intrinsics.checkNotNullParameter(bottomAccount, "bottomAccount");
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(recurringPaymentContext, "recurringPaymentContext");
        this.f203409a = topAccount;
        this.f203410b = bottomAccount;
        this.f203411c = j2;
        this.d = j3;
        this.e = rule;
        this.f = limit;
        this.f203412g = orderQuote;
        this.f203413h = recurringPaymentContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f203409a, iVar.f203409a) && Intrinsics.f(this.f203410b, iVar.f203410b) && this.f203411c == iVar.f203411c && this.d == iVar.d && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f203412g, iVar.f203412g) && Intrinsics.f(this.f203413h, iVar.f203413h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + a0.d.c(a0.d.c((this.f203410b.hashCode() + (this.f203409a.hashCode() * 31)) * 31, 31, this.f203411c), 31, this.d)) * 31;
        WalletAutomation.Limit limit = this.f;
        int iHashCode2 = (iHashCode + (limit == null ? 0 : limit.hashCode())) * 31;
        OrderQuote orderQuote = this.f203412g;
        return this.f203413h.hashCode() + ((iHashCode2 + (orderQuote != null ? orderQuote.hashCode() : 0)) * 31);
    }
}
