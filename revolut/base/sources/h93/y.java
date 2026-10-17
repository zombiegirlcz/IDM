package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f150170a;

    public y(x changeStatus) {
        Intrinsics.checkNotNullParameter(changeStatus, "changeStatus");
        this.f150170a = changeStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.f150170a == ((y) obj2).f150170a;
    }

    public final int hashCode() {
        return this.f150170a.hashCode();
    }
}
