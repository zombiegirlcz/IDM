package whh;

import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountClosureStatus f297657b;

    public a(String portfolioId, AccountClosureStatus closureData) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(closureData, "closureData");
        this.f297656a = portfolioId;
        this.f297657b = closureData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f297656a, aVar.f297656a) && Intrinsics.f(this.f297657b, aVar.f297657b);
    }

    public final int hashCode() {
        return this.f297657b.hashCode() + (this.f297656a.hashCode() * 31);
    }
}
