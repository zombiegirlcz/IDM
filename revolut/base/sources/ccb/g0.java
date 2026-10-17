package ccb;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f22988b;

    public g0(AccountId accountId, String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f22987a = pocketId;
        this.f22988b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f22987a, g0Var.f22987a) && Intrinsics.f(this.f22988b, g0Var.f22988b);
    }

    public final int hashCode() {
        return this.f22988b.hashCode() + (this.f22987a.hashCode() * 31);
    }
}
