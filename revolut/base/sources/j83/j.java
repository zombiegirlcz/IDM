package j83;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f172110a;

    public j(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f172110a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f172110a, ((j) obj2).f172110a);
    }

    public final int hashCode() {
        return this.f172110a.hashCode();
    }
}
