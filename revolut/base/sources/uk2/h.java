package uk2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280651a;

    public h(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f280651a = itemId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f280651a, ((h) obj2).f280651a);
    }

    public final int hashCode() {
        return this.f280651a.hashCode();
    }
}
