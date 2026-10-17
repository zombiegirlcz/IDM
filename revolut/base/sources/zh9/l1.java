package zh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l1 implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f322301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f322302b;

    public l1(int i) {
        t1 blockReason = t1.NotAvailable;
        Intrinsics.checkNotNullParameter(blockReason, "blockReason");
        this.f322301a = i;
        this.f322302b = blockReason;
    }

    @Override // zh9.m1
    public final int a() {
        return this.f322301a;
    }

    @Override // zh9.m1
    public final t1 b() {
        return this.f322302b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return this.f322301a == l1Var.f322301a && this.f322302b == l1Var.f322302b;
    }

    public final int hashCode() {
        return this.f322302b.hashCode() + (Integer.hashCode(this.f322301a) * 31);
    }
}
