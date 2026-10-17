package u1k;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f276421a;

    public f(dj0.d withdrawnAmount) {
        Intrinsics.checkNotNullParameter(withdrawnAmount, "withdrawnAmount");
        this.f276421a = withdrawnAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f276421a, ((f) obj2).f276421a);
    }

    public final int hashCode() {
        return this.f276421a.hashCode();
    }
}
