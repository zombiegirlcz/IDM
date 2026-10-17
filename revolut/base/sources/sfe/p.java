package sfe;

import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountId f262425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TabAccountsInitialPayload f262426b;

    public p(ProductAccountId accountId, TabAccountsInitialPayload tabAccountsInitialPayload) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f262425a = accountId;
        this.f262426b = tabAccountsInitialPayload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f262425a, pVar.f262425a) && Intrinsics.f(this.f262426b, pVar.f262426b);
    }

    public final int hashCode() {
        int iHashCode = this.f262425a.hashCode() * 31;
        TabAccountsInitialPayload tabAccountsInitialPayload = this.f262426b;
        return iHashCode + (tabAccountsInitialPayload == null ? 0 : tabAccountsInitialPayload.hashCode());
    }
}
