package a9g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f2564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f2565b;

    public q0(o0 promotion, n0 location) {
        Intrinsics.checkNotNullParameter(promotion, "promotion");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f2564a = promotion;
        this.f2565b = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f2564a, q0Var.f2564a) && Intrinsics.f(this.f2565b, q0Var.f2565b);
    }

    public final int hashCode() {
        return this.f2565b.hashCode() + (this.f2564a.hashCode() * 31);
    }
}
