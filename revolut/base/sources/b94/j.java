package b94;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu3.e f13650a;

    public j(qu3.e debt) {
        Intrinsics.checkNotNullParameter(debt, "debt");
        this.f13650a = debt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f13650a, ((j) obj2).f13650a);
    }

    public final int hashCode() {
        return this.f13650a.hashCode();
    }
}
