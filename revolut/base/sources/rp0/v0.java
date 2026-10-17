package rp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f256202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f256203b;

    public v0(Object obj2, boolean z) {
        this.f256202a = z;
        this.f256203b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return this.f256202a == v0Var.f256202a && Intrinsics.f(this.f256203b, v0Var.f256203b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f256202a) * 31;
        Object obj2 = this.f256203b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
