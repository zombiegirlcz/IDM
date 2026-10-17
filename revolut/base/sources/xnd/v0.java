package xnd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f307463a;

    public v0(u0 destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f307463a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v0) && this.f307463a == ((v0) obj2).f307463a;
    }

    public final int hashCode() {
        return this.f307463a.hashCode();
    }
}
