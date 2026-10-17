package yp0;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f315744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw0.f f315745b;

    public k0(Lifecycle lifecycle, uw0.f animationHost) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(animationHost, "animationHost");
        this.f315744a = lifecycle;
        this.f315745b = animationHost;
    }

    public final Lifecycle a() {
        return this.f315744a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f315744a, k0Var.f315744a) && Intrinsics.f(this.f315745b, k0Var.f315745b);
    }

    public final int hashCode() {
        return this.f315745b.hashCode() + (this.f315744a.hashCode() * 31);
    }
}
