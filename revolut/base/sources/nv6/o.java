package nv6;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f219527a;

    public o(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f219527a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f219527a, ((o) obj2).f219527a);
    }

    public final int hashCode() {
        return this.f219527a.hashCode();
    }
}
