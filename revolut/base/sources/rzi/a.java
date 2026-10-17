package rzi;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f258686a;

    public a(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f258686a = accountId;
    }

    public final AccountId b() {
        return this.f258686a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f258686a, ((a) obj2).f258686a);
    }

    public final int hashCode() {
        return this.f258686a.hashCode();
    }
}
