package sv4;

import k71.q;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f265838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f265839b;

    public g(a3 transaction, q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f265838a = transaction;
        this.f265839b = transactionsExtraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f265838a, gVar.f265838a) && Intrinsics.f(this.f265839b, gVar.f265839b);
    }

    public final int hashCode() {
        return this.f265839b.hashCode() + (this.f265838a.hashCode() * 31);
    }
}
