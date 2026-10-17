package sfe;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountId f262415a;

    public j(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f262415a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f262415a, ((j) obj2).f262415a);
    }

    public final int hashCode() {
        return this.f262415a.hashCode();
    }
}
