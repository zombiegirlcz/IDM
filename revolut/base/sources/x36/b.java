package x36;

import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapQuoteParams;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiSwapQuoteParams f302660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiExchangeOrderDraft f302661b;

    public b(DeFiSwapQuoteParams quoteParams, DeFiExchangeOrderDraft draft) {
        Intrinsics.checkNotNullParameter(quoteParams, "quoteParams");
        Intrinsics.checkNotNullParameter(draft, "draft");
        this.f302660a = quoteParams;
        this.f302661b = draft;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f302660a, bVar.f302660a) && Intrinsics.f(this.f302661b, bVar.f302661b);
    }

    public final int hashCode() {
        return this.f302661b.hashCode() + (this.f302660a.hashCode() * 31);
    }
}
