package a0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f407b;

    public h0(dj0.d current, dj0.d target) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f406a = current;
        this.f407b = target;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f406a, h0Var.f406a) && Intrinsics.f(this.f407b, h0Var.f407b);
    }

    public final int hashCode() {
        return this.f407b.hashCode() + (this.f406a.hashCode() * 31);
    }
}
