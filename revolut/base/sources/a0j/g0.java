package a0j;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f405c;

    public g0(f0 period, dj0.d money, boolean z) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(money, "money");
        this.f403a = period;
        this.f404b = money;
        this.f405c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.f403a == g0Var.f403a && this.f404b.equals(g0Var.f404b) && this.f405c == g0Var.f405c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f405c) + v7.c(this.f403a.hashCode() * 31, 31, this.f404b);
    }
}
