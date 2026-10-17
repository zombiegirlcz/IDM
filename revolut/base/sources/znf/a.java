package znf;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f323812b;

    public a(List refundTransactions, q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(refundTransactions, "refundTransactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f323811a = refundTransactions;
        this.f323812b = transactionsExtraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f323811a, aVar.f323811a) && Intrinsics.f(this.f323812b, aVar.f323812b);
    }

    public final int hashCode() {
        return this.f323812b.hashCode() + (this.f323811a.hashCode() * 31);
    }
}
