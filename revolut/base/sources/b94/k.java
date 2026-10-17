package b94;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu3.e f13651a;

    public k(qu3.e debt) {
        Intrinsics.checkNotNullParameter(debt, "debt");
        this.f13651a = debt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f13651a, ((k) obj2).f13651a);
    }

    public final int hashCode() {
        return this.f13651a.hashCode();
    }
}
