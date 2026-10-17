package su9;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f265691a;

    public a(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f265691a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f265691a, ((a) obj2).f265691a);
    }

    public final int hashCode() {
        return this.f265691a.hashCode();
    }
}
