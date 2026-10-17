package sfe;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountId f262416a;

    public k(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f262416a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f262416a, ((k) obj2).f262416a);
    }

    public final int hashCode() {
        return this.f262416a.hashCode();
    }
}
