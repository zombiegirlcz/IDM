package bi9;

import kotlin.jvm.internal.Intrinsics;
import zh9.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f15449a;

    public d(r0 plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f15449a = plan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f15449a, ((d) obj2).f15449a);
    }

    public final int hashCode() {
        return this.f15449a.hashCode();
    }
}
