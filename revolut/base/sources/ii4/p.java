package ii4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f161540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f161541b;

    public p(q state, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f161540a = state;
        this.f161541b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f161540a, pVar.f161540a) && this.f161541b == pVar.f161541b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161541b) + (this.f161540a.hashCode() * 31);
    }
}
