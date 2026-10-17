package m1c;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes6.dex */
public final class c1 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f201349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(a3 transaction) {
        super(transaction.f272579a, transaction.f272591g.getMillis());
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f201349c = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c1) && Intrinsics.f(this.f201349c, ((c1) obj2).f201349c);
    }

    public final int hashCode() {
        return this.f201349c.hashCode();
    }
}
