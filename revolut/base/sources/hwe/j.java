package hwe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f156144a;

    public j(io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f156144a = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f156144a, ((j) obj2).f156144a);
    }

    public final int hashCode() {
        return this.f156144a.hashCode();
    }
}
