package ka2;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f182404a;

    public r(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f182404a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f182404a, ((r) obj2).f182404a);
    }

    public final int hashCode() {
        return this.f182404a.hashCode();
    }
}
