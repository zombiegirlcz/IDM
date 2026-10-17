package h7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountWrapper f149888a;

    public f(AccountWrapper account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f149888a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f149888a, ((f) obj2).f149888a);
    }

    @Override // h7i.a
    public final AccountWrapper getAccount() {
        return this.f149888a;
    }

    public final int hashCode() {
        return this.f149888a.hashCode();
    }
}
