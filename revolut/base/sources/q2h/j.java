package q2h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n4l.c f241658a;

    public j(n4l.c stockLendingStatus) {
        Intrinsics.checkNotNullParameter(stockLendingStatus, "stockLendingStatus");
        this.f241658a = stockLendingStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f241658a, ((j) obj2).f241658a);
    }

    public final int hashCode() {
        return this.f241658a.hashCode();
    }
}
