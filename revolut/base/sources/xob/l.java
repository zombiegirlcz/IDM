package xob;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f307776a;

    public l(dj0.d amountToReach) {
        Intrinsics.checkNotNullParameter(amountToReach, "amountToReach");
        this.f307776a = amountToReach;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f307776a, ((l) obj2).f307776a);
    }

    public final int hashCode() {
        return this.f307776a.hashCode();
    }
}
