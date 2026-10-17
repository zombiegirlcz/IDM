package sfe;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductAccountId f262420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f262421c;

    public m(String id10, ProductAccountId accountId, Object obj2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f262419a = id10;
        this.f262420b = accountId;
        this.f262421c = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f262419a, mVar.f262419a) && Intrinsics.f(this.f262420b, mVar.f262420b) && Intrinsics.f(this.f262421c, mVar.f262421c);
    }

    public final int hashCode() {
        int iHashCode = (this.f262420b.hashCode() + (this.f262419a.hashCode() * 31)) * 31;
        Object obj2 = this.f262421c;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
