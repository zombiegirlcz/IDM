package k71;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f181782b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a3 transaction) {
        super(transaction.f272581b);
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f181782b = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f181782b, ((g) obj2).f181782b);
    }

    public final int hashCode() {
        return this.f181782b.hashCode();
    }
}
