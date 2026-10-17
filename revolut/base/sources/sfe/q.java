package sfe;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountId f262427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262428b;

    public q(ProductAccountId accountId, String deeplink) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f262427a = accountId;
        this.f262428b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f262427a, qVar.f262427a) && Intrinsics.f(this.f262428b, qVar.f262428b);
    }

    public final int hashCode() {
        return this.f262428b.hashCode() + (this.f262427a.hashCode() * 31);
    }
}
