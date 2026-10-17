package dee;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f113418a;

    public p(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f113418a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f113418a, ((p) obj2).f113418a);
    }

    public final int hashCode() {
        return this.f113418a.hashCode();
    }
}
