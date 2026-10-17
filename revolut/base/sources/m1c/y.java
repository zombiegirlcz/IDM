package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f201475a;

    public y(x revPointsAccount) {
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        this.f201475a = revPointsAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f201475a, ((y) obj2).f201475a);
    }

    public final int hashCode() {
        return this.f201475a.hashCode();
    }
}
