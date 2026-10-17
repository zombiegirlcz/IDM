package om4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9e.c f226566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k71.q f226567b;

    public e4(b9e.c payments, k71.q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f226566a = payments;
        this.f226567b = transactionsExtraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj2;
        return Intrinsics.f(this.f226566a, e4Var.f226566a) && Intrinsics.f(this.f226567b, e4Var.f226567b);
    }

    public final int hashCode() {
        return this.f226567b.hashCode() + (this.f226566a.hashCode() * 31);
    }
}
