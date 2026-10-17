package qdk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xck.l f244980a;

    public p0(xck.l item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f244980a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p0) && Intrinsics.f(this.f244980a, ((p0) obj2).f244980a);
    }

    public final int hashCode() {
        return this.f244980a.hashCode();
    }
}
