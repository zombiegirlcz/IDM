package kug;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingProductCode f189803b;

    public n(String accountId, TradingProductCode product) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f189802a = accountId;
        this.f189803b = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f189802a, nVar.f189802a) && Intrinsics.f(this.f189803b, nVar.f189803b);
    }

    public final int hashCode() {
        return this.f189803b.hashCode() + (this.f189802a.hashCode() * 31);
    }
}
