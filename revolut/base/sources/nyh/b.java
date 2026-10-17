package nyh;

import aii.r;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuote f220875a;

    public b(OrderQuote newQuote) {
        Intrinsics.checkNotNullParameter(newQuote, "newQuote");
        this.f220875a = newQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f220875a, ((b) obj2).f220875a);
    }

    public final int hashCode() {
        return this.f220875a.hashCode();
    }
}
