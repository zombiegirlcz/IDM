package ybh;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuoteParams f312311a;

    public h(OrderQuoteParams orderQuoteParams) {
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        this.f312311a = orderQuoteParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f312311a, ((h) obj2).f312311a);
    }

    public final int hashCode() {
        return this.f312311a.hashCode();
    }
}
