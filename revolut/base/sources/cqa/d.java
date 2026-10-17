package cqa;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f108063a;

    public d(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f108063a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f108063a, ((d) obj2).f108063a);
    }

    public final int hashCode() {
        return this.f108063a.hashCode();
    }
}
