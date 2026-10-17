package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f201362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f201363b;

    public f0(dj0.d monthlySpent, dj0.d savings) {
        Intrinsics.checkNotNullParameter(monthlySpent, "monthlySpent");
        Intrinsics.checkNotNullParameter(savings, "savings");
        this.f201362a = monthlySpent;
        this.f201363b = savings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f201362a, f0Var.f201362a) && Intrinsics.f(this.f201363b, f0Var.f201363b);
    }

    public final int hashCode() {
        return this.f201363b.hashCode() + (this.f201362a.hashCode() * 31);
    }
}
