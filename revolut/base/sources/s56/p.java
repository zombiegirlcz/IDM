package s56;

import com.revolut.feature.defi.remittances.impl.domain.model.DeFiTransferQuoteRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiTransferQuoteRequest f259980a;

    public p(DeFiTransferQuoteRequest quoteRequest) {
        Intrinsics.checkNotNullParameter(quoteRequest, "quoteRequest");
        this.f259980a = quoteRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f259980a, ((p) obj2).f259980a);
    }

    public final int hashCode() {
        return this.f259980a.hashCode();
    }
}
