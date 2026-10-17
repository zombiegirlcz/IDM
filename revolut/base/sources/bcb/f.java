package bcb;

import com.revolut.core.model.account.AccountId;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f14427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f14428c;

    public f(AccountId accountId, dj0.d pocketBalance, String str) {
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f14426a = str;
        this.f14427b = pocketBalance;
        this.f14428c = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f14426a, fVar.f14426a) && Intrinsics.f(this.f14427b, fVar.f14427b) && Intrinsics.f(this.f14428c, fVar.f14428c);
    }

    public final int hashCode() {
        String str = this.f14426a;
        return this.f14428c.hashCode() + v7.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f14427b);
    }
}
