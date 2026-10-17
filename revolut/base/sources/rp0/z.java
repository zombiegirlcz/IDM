package rp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f256228b;

    public z(String clickItemId, Object obj2) {
        Intrinsics.checkNotNullParameter(clickItemId, "clickItemId");
        this.f256227a = clickItemId;
        this.f256228b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f256227a, zVar.f256227a) && Intrinsics.f(this.f256228b, zVar.f256228b);
    }

    public final int hashCode() {
        int iHashCode = this.f256227a.hashCode() * 31;
        Object obj2 = this.f256228b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
