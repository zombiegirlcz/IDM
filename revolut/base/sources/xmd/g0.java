package xmd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wmd.e f307171a;

    public g0(wmd.e spent) {
        Intrinsics.checkNotNullParameter(spent, "spent");
        this.f307171a = spent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f307171a, ((g0) obj2).f307171a);
    }

    public final int hashCode() {
        return this.f307171a.hashCode();
    }
}
