package esj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f128979a;

    public p(dj0.d overallBudget) {
        Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
        this.f128979a = overallBudget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f128979a, ((p) obj2).f128979a);
    }

    public final int hashCode() {
        return this.f128979a.hashCode();
    }
}
