package rw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f257811a;

    public k(e point) {
        Intrinsics.checkNotNullParameter(point, "point");
        this.f257811a = point;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f257811a, ((k) obj2).f257811a);
    }

    public final int hashCode() {
        return this.f257811a.hashCode();
    }
}
