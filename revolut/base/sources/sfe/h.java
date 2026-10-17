package sfe;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountId f262410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f262411b;

    public h(ProductAccountId accountId, Object obj2) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f262410a = accountId;
        this.f262411b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f262410a, hVar.f262410a) && Intrinsics.f(this.f262411b, hVar.f262411b);
    }

    public final int hashCode() {
        int iHashCode = this.f262410a.hashCode() * 31;
        Object obj2 = this.f262411b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
