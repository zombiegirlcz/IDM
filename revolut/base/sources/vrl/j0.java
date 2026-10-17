package vrl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f291642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f291643b;

    public j0(dj0.d money, boolean z) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f291642a = money;
        this.f291643b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f291642a, j0Var.f291642a) && this.f291643b == j0Var.f291643b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f291643b) + (this.f291642a.hashCode() * 31);
    }
}
