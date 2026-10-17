package qrb;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuote f248684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderQuote f248685b;

    public d(OrderQuote orderQuote, OrderQuote orderQuote2) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        this.f248684a = orderQuote;
        this.f248685b = orderQuote2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f248684a, dVar.f248684a) && Intrinsics.f(this.f248685b, dVar.f248685b);
    }

    public final int hashCode() {
        int iHashCode = this.f248684a.hashCode() * 31;
        OrderQuote orderQuote = this.f248685b;
        return iHashCode + (orderQuote == null ? 0 : orderQuote.hashCode());
    }
}
