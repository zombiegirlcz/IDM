package l7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountWrapper f192663a;

    public b(AccountWrapper protectedAccount) {
        Intrinsics.checkNotNullParameter(protectedAccount, "protectedAccount");
        this.f192663a = protectedAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f192663a, ((b) obj2).f192663a);
    }

    public final int hashCode() {
        return this.f192663a.hashCode();
    }
}
