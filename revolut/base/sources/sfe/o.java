package sfe;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountId f262424a;

    public o(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f262424a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f262424a, ((o) obj2).f262424a);
    }

    public final int hashCode() {
        return this.f262424a.hashCode();
    }
}
