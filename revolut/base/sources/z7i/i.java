package z7i;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuote f320018a;

    public i(OrderQuote lastQuote) {
        Intrinsics.checkNotNullParameter(lastQuote, "lastQuote");
        this.f320018a = lastQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f320018a, ((i) obj2).f320018a);
    }

    public final int hashCode() {
        return this.f320018a.hashCode();
    }
}
