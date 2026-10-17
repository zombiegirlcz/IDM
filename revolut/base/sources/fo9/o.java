package fo9;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f136851a;

    public o(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f136851a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f136851a, ((o) obj2).f136851a);
    }

    public final int hashCode() {
        return this.f136851a.hashCode();
    }
}
