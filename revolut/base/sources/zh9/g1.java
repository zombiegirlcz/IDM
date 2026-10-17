package zh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g1 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f322266a;

    public g1(g0 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f322266a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g1) && Intrinsics.f(this.f322266a, ((g1) obj2).f322266a);
    }

    public final int hashCode() {
        return this.f322266a.hashCode();
    }
}
