package asj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f8938a;

    public g(dj0.d overallBudget) {
        Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
        this.f8938a = overallBudget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f8938a, ((g) obj2).f8938a);
    }

    public final int hashCode() {
        return this.f8938a.hashCode();
    }
}
