package h7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountWrapper f149896a;

    public n(AccountWrapper account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f149896a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f149896a, ((n) obj2).f149896a);
    }

    public final int hashCode() {
        return this.f149896a.hashCode();
    }
}
