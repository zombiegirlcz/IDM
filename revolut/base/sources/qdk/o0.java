package qdk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xck.j f244979a;

    public o0(xck.j item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f244979a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o0) && Intrinsics.f(this.f244979a, ((o0) obj2).f244979a);
    }

    public final int hashCode() {
        return this.f244979a.hashCode();
    }
}
