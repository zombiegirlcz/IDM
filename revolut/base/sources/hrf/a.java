package hrf;

import com.revolut.feature.transfer.models.quotes.TransferQuoteSplit;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuote f154810a;

    public a(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        this.f154810a = orderQuote;
    }

    @Override // hrf.c
    public final String a() {
        return this.f154810a.f104764s;
    }

    @Override // hrf.c
    public final dj0.d b() {
        OrderQuote orderQuote = this.f154810a;
        Amount amount = orderQuote.d;
        return amount != null ? a.a.L(amount) : a.a.L(orderQuote.f104754c);
    }

    @Override // hrf.c
    public final dj0.d c() {
        Charges charges = this.f154810a.f104755g;
        return pyd.c.O(a.a.L(charges.f104731a.f104722a), a.a.L(charges.f104732b.f104722a));
    }

    @Override // hrf.c
    public final TransferQuoteSplit d() {
        return this.f154810a.o;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f154810a, ((a) obj2).f154810a);
    }

    public final int hashCode() {
        return this.f154810a.hashCode();
    }
}
