package xkf;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f306719a;

    public k(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f306719a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f306719a, ((k) obj2).f306719a);
    }

    public final int hashCode() {
        return this.f306719a.hashCode();
    }
}
