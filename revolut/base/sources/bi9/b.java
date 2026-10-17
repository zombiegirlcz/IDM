package bi9;

import kotlin.jvm.internal.Intrinsics;
import zh9.y;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f15447a;

    public b(y instalmentWithPlan) {
        Intrinsics.checkNotNullParameter(instalmentWithPlan, "instalmentWithPlan");
        this.f15447a = instalmentWithPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f15447a, ((b) obj2).f15447a);
    }

    public final int hashCode() {
        return this.f15447a.hashCode();
    }
}
