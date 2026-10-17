package sfe;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountId f262417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f262418b;

    public l(ProductAccountId accountId, Object obj2) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f262417a = accountId;
        this.f262418b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f262417a, lVar.f262417a) && Intrinsics.f(this.f262418b, lVar.f262418b);
    }

    public final int hashCode() {
        int iHashCode = this.f262417a.hashCode() * 31;
        Object obj2 = this.f262418b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
