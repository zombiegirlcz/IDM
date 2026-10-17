package tjf;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f271659a;

    public h(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f271659a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f271659a, ((h) obj2).f271659a);
    }

    public final int hashCode() {
        return this.f271659a.hashCode();
    }
}
