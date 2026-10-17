package esj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f128982a;

    public r(dj0.d overallBudget) {
        Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
        this.f128982a = overallBudget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f128982a, ((r) obj2).f128982a);
    }

    public final int hashCode() {
        return this.f128982a.hashCode();
    }
}
