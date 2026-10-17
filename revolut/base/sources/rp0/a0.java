package rp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f256040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f256041b;

    public a0(Object obj2, boolean z) {
        this.f256040a = z;
        this.f256041b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f256040a == a0Var.f256040a && Intrinsics.f(this.f256041b, a0Var.f256041b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f256040a) * 31;
        Object obj2 = this.f256041b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
