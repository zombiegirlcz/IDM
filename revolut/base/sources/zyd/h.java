package zyd;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f326440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.l f326441b;

    public h(AccountId accountId, io3.l lVar) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f326440a = accountId;
        this.f326441b = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f326440a, hVar.f326440a) && this.f326441b == hVar.f326441b;
    }

    public final int hashCode() {
        int iHashCode = this.f326440a.hashCode() * 31;
        io3.l lVar = this.f326441b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }
}
