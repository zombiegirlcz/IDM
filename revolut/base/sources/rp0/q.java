package rp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f256154b;

    public q(String itemId, Object obj2) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f256153a = itemId;
        this.f256154b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f256153a, qVar.f256153a) && Intrinsics.f(this.f256154b, qVar.f256154b);
    }

    public final int hashCode() {
        int iHashCode = this.f256153a.hashCode() * 31;
        Object obj2 = this.f256154b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
