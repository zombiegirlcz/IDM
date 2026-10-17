package wf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f296943b;

    public y0(String entityId, Boolean bool) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f296942a = entityId;
        this.f296943b = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f296942a, y0Var.f296942a) && Intrinsics.f(this.f296943b, y0Var.f296943b);
    }

    public final int hashCode() {
        int iHashCode = this.f296942a.hashCode() * 31;
        Boolean bool = this.f296943b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
