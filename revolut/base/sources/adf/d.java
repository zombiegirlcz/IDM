package adf;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuote f3332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Amount f3333b;

    public d(OrderQuote orderQuote, Amount feeConverted) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(feeConverted, "feeConverted");
        this.f3332a = orderQuote;
        this.f3333b = feeConverted;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f3332a, dVar.f3332a) && Intrinsics.f(this.f3333b, dVar.f3333b);
    }

    public final int hashCode() {
        return this.f3333b.hashCode() + (this.f3332a.hashCode() * 31);
    }
}
