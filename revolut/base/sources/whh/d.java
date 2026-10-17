package whh;

import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountClosureStatus f297662b;

    public d(String portfolioId, AccountClosureStatus closureData) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(closureData, "closureData");
        this.f297661a = portfolioId;
        this.f297662b = closureData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f297661a, dVar.f297661a) && Intrinsics.f(this.f297662b, dVar.f297662b);
    }

    public final int hashCode() {
        return this.f297662b.hashCode() + (this.f297661a.hashCode() * 31);
    }
}
