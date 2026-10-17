package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f163612b;

    public bh0(Object obj2, boolean z) {
        this.f163611a = z;
        this.f163612b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bh0)) {
            return false;
        }
        bh0 bh0Var = (bh0) obj2;
        return this.f163611a == bh0Var.f163611a && Intrinsics.f(this.f163612b, bh0Var.f163612b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f163611a) * 31;
        Object obj2 = this.f163612b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
