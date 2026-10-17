package esj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f128984a;

    public t(dj0.d overallBudget) {
        Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
        this.f128984a = overallBudget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f128984a, ((t) obj2).f128984a);
    }

    public final int hashCode() {
        return this.f128984a.hashCode();
    }
}
