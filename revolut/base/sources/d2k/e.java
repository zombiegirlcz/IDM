package d2k;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f110877a;

    public e(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f110877a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f110877a, ((e) obj2).f110877a);
    }

    public final int hashCode() {
        return this.f110877a.hashCode();
    }
}
