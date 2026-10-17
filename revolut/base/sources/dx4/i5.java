package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i5 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f120637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f120638b;

    public i5(l1 left, l1 right) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        this.f120637a = left;
        this.f120638b = right;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj2;
        return Intrinsics.f(this.f120637a, i5Var.f120637a) && Intrinsics.f(this.f120638b, i5Var.f120638b);
    }

    public final int hashCode() {
        return this.f120638b.hashCode() + (this.f120637a.hashCode() * 31);
    }
}
