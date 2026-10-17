package ccb;

import ccb.l;
import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f23005b;

    public m(AccountId accountId, String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f23004a = pocketId;
        this.f23005b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f23004a, mVar.f23004a) && Intrinsics.f(this.f23005b, mVar.f23005b);
    }

    public final int hashCode() {
        return this.f23005b.hashCode() + (this.f23004a.hashCode() * 31);
    }
}
