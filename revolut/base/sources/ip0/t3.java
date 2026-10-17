package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f166426a;

    public t3(i3 i3Var) {
        this.f166426a = i3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t3) && Intrinsics.f(this.f166426a, ((t3) obj2).f166426a);
    }

    public final int hashCode() {
        i3 i3Var = this.f166426a;
        if (i3Var == null) {
            return 0;
        }
        return i3Var.hashCode();
    }
}
