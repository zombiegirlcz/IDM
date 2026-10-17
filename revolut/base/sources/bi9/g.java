package bi9;

import kotlin.jvm.internal.Intrinsics;
import zh9.y;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f15454a;

    public g(y instalmentWithPlan) {
        Intrinsics.checkNotNullParameter(instalmentWithPlan, "instalmentWithPlan");
        this.f15454a = instalmentWithPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f15454a, ((g) obj2).f15454a);
    }

    public final int hashCode() {
        return this.f15454a.hashCode();
    }
}
