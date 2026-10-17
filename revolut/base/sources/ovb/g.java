package ovb;

import kotlin.jvm.internal.Intrinsics;
import m1c.x;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f230018a;

    public g(x revPointsAccount) {
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        this.f230018a = revPointsAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f230018a, ((g) obj2).f230018a);
    }

    public final int hashCode() {
        return this.f230018a.hashCode();
    }
}
