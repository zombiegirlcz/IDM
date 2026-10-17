package l5d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5d.c f192252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f192253b;

    public l(e5d.c state, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f192252a = state;
        this.f192253b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f192252a, lVar.f192252a) && this.f192253b == lVar.f192253b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f192253b) + (this.f192252a.hashCode() * 31);
    }
}
