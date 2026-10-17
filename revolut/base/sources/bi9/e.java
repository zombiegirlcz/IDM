package bi9;

import kotlin.jvm.internal.Intrinsics;
import zh9.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f15450a;

    public e(r0 plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f15450a = plan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f15450a, ((e) obj2).f15450a);
    }

    public final int hashCode() {
        return this.f15450a.hashCode();
    }
}
