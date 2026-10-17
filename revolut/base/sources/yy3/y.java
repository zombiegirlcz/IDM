package yy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f317806a;

    public y(x state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f317806a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.f317806a == ((y) obj2).f317806a;
    }

    public final int hashCode() {
        return this.f317806a.hashCode();
    }
}
