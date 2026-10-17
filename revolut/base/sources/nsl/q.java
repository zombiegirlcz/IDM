package nsl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f218926a;

    public q(n cellPayload) {
        Intrinsics.checkNotNullParameter(cellPayload, "cellPayload");
        this.f218926a = cellPayload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f218926a, ((q) obj2).f218926a);
    }

    public final int hashCode() {
        return this.f218926a.hashCode();
    }
}
