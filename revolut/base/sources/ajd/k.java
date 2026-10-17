package ajd;

import kotlin.jvm.internal.Intrinsics;
import m1c.x;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f5548a;

    public k(x revPointsAccount) {
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        this.f5548a = revPointsAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f5548a, ((k) obj2).f5548a);
    }

    public final int hashCode() {
        return this.f5548a.hashCode();
    }
}
