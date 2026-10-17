package o97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f223086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f223087b;

    public a0(c0 timings, t blockConstraints) {
        Intrinsics.checkNotNullParameter(timings, "timings");
        Intrinsics.checkNotNullParameter(blockConstraints, "blockConstraints");
        this.f223086a = timings;
        this.f223087b = blockConstraints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f223086a, a0Var.f223086a) && Intrinsics.f(this.f223087b, a0Var.f223087b);
    }

    public final int hashCode() {
        return this.f223087b.hashCode() + (this.f223086a.hashCode() * 31);
    }
}
