package ql4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f247122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f247123b;

    public g0(dj0.d amountToRepay, String utilizationThreshold) {
        Intrinsics.checkNotNullParameter(amountToRepay, "amountToRepay");
        Intrinsics.checkNotNullParameter(utilizationThreshold, "utilizationThreshold");
        this.f247122a = amountToRepay;
        this.f247123b = utilizationThreshold;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f247122a, g0Var.f247122a) && Intrinsics.f(this.f247123b, g0Var.f247123b);
    }

    public final int hashCode() {
        return this.f247123b.hashCode() + (this.f247122a.hashCode() * 31);
    }
}
