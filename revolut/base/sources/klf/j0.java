package klf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tof.a3 f185515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k71.q f185516b;

    public j0(tof.a3 transaction, k71.q extraData) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f185515a = transaction;
        this.f185516b = extraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f185515a, j0Var.f185515a) && Intrinsics.f(this.f185516b, j0Var.f185516b);
    }

    public final int hashCode() {
        return this.f185516b.hashCode() + (this.f185515a.hashCode() * 31);
    }
}
