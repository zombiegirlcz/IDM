package whh;

import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountClosureStatus f297659b;

    public b(String portfolioId, AccountClosureStatus status) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f297658a = portfolioId;
        this.f297659b = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f297658a, bVar.f297658a) && Intrinsics.f(this.f297659b, bVar.f297659b);
    }

    public final int hashCode() {
        return this.f297659b.hashCode() + (this.f297658a.hashCode() * 31);
    }
}
