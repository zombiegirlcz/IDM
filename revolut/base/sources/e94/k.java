package e94;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu3.e f123910a;

    public k(qu3.e debt) {
        Intrinsics.checkNotNullParameter(debt, "debt");
        this.f123910a = debt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f123910a, ((k) obj2).f123910a);
    }

    public final int hashCode() {
        return this.f123910a.hashCode();
    }
}
