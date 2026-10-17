package usb;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuoteParams f282867a;

    public d(OrderQuoteParams orderQuoteParams) {
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        this.f282867a = orderQuoteParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f282867a, ((d) obj2).f282867a);
    }

    public final int hashCode() {
        return this.f282867a.hashCode();
    }
}
