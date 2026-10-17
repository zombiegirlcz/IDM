package x19;

import kotlin.jvm.internal.Intrinsics;
import m1c.x;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f302354a;

    public b(x pointsAccount) {
        Intrinsics.checkNotNullParameter(pointsAccount, "pointsAccount");
        this.f302354a = pointsAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f302354a, ((b) obj2).f302354a);
    }

    public final int hashCode() {
        return this.f302354a.hashCode();
    }
}
