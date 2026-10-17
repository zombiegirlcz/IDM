package l9g;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f193245b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a3 transaction) {
        super(transaction.f272591g.getMillis());
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f193245b = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f193245b, ((a) obj2).f193245b);
    }

    public final int hashCode() {
        return this.f193245b.hashCode();
    }
}
