package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountWrapper f203164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountWrapper f203165b;

    public i0(AccountWrapper source, AccountWrapper target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f203164a = source;
        this.f203165b = target;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f203164a, i0Var.f203164a) && Intrinsics.f(this.f203165b, i0Var.f203165b);
    }

    public final int hashCode() {
        return this.f203165b.hashCode() + (this.f203164a.hashCode() * 31);
    }
}
