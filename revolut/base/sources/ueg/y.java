package ueg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ah0.a f279444a;

    public y(ah0.a latLngBounds) {
        Intrinsics.checkNotNullParameter(latLngBounds, "latLngBounds");
        this.f279444a = latLngBounds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f279444a, ((y) obj2).f279444a);
    }

    public final int hashCode() {
        return this.f279444a.hashCode();
    }
}
