package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j5 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2 f120641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k2 f120642b;

    public j5(k2 left, k2 right) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        this.f120641a = left;
        this.f120642b = right;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj2;
        return Intrinsics.f(this.f120641a, j5Var.f120641a) && Intrinsics.f(this.f120642b, j5Var.f120642b);
    }

    public final int hashCode() {
        return this.f120642b.hashCode() + (this.f120641a.hashCode() * 31);
    }
}
