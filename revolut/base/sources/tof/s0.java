package tof;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f273036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f273037b;

    public s0(List feesBreakdown, dj0.d total) {
        Intrinsics.checkNotNullParameter(feesBreakdown, "feesBreakdown");
        Intrinsics.checkNotNullParameter(total, "total");
        this.f273036a = feesBreakdown;
        this.f273037b = total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f273036a, s0Var.f273036a) && Intrinsics.f(this.f273037b, s0Var.f273037b);
    }

    public final int hashCode() {
        return this.f273037b.hashCode() + (this.f273036a.hashCode() * 31);
    }
}
