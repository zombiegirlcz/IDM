package x7i;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuote f303213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderQuoteParams f303214b;

    public b(OrderQuote previousQuote, OrderQuoteParams newQuoteParams) {
        Intrinsics.checkNotNullParameter(previousQuote, "previousQuote");
        Intrinsics.checkNotNullParameter(newQuoteParams, "newQuoteParams");
        this.f303213a = previousQuote;
        this.f303214b = newQuoteParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f303213a, bVar.f303213a) && Intrinsics.f(this.f303214b, bVar.f303214b);
    }

    public final int hashCode() {
        return this.f303214b.hashCode() + (this.f303213a.hashCode() * 31);
    }
}
