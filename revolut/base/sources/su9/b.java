package su9;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f265692a;

    public b(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f265692a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f265692a, ((b) obj2).f265692a);
    }

    public final int hashCode() {
        return this.f265692a.hashCode();
    }
}
