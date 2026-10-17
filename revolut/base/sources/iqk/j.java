package iqk;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f167890a;

    public j(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f167890a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f167890a, ((j) obj2).f167890a);
    }

    public final int hashCode() {
        return this.f167890a.hashCode();
    }
}
