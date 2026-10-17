package sfe;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountId f262422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f262423b;

    public n(ProductAccountId accountId, Object sectionModel) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(sectionModel, "sectionModel");
        this.f262422a = accountId;
        this.f262423b = sectionModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f262422a, nVar.f262422a) && Intrinsics.f(this.f262423b, nVar.f262423b);
    }

    public final int hashCode() {
        return this.f262423b.hashCode() + (this.f262422a.hashCode() * 31);
    }
}
