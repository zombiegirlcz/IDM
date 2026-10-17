package nel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f214573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f214574b;

    public f0(dj0.d high, dj0.d low) {
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(low, "low");
        this.f214573a = high;
        this.f214574b = low;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f214573a, f0Var.f214573a) && Intrinsics.f(this.f214574b, f0Var.f214574b);
    }

    public final int hashCode() {
        return this.f214574b.hashCode() + (this.f214573a.hashCode() * 31);
    }
}
