package n1h;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f211357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderQuoteParams f211358b;

    public c(dj0.d fee2, OrderQuoteParams orderQuoteParams) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        this.f211357a = fee2;
        this.f211358b = orderQuoteParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f211357a, cVar.f211357a) && Intrinsics.f(this.f211358b, cVar.f211358b);
    }

    public final int hashCode() {
        return this.f211358b.hashCode() + (this.f211357a.hashCode() * 31);
    }
}
