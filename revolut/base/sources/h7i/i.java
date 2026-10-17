package h7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountWrapper f149892a;

    public i(AccountWrapper account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f149892a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f149892a, ((i) obj2).f149892a);
    }

    @Override // h7i.a
    public final AccountWrapper getAccount() {
        return this.f149892a;
    }

    public final int hashCode() {
        return this.f149892a.hashCode();
    }
}
