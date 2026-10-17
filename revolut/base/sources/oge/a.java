package oge;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductId f225125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductAccountId f225126b;

    public a(ProductAccountId accountId, ProductId productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f225125a = productId;
        this.f225126b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f225125a == aVar.f225125a && Intrinsics.f(this.f225126b, aVar.f225126b);
    }

    public final int hashCode() {
        return this.f225126b.hashCode() + (this.f225125a.hashCode() * 31);
    }
}
