package uhf;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f280228a;

    public j(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f280228a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f280228a, ((j) obj2).f280228a);
    }

    public final int hashCode() {
        return this.f280228a.hashCode();
    }
}
