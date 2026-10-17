package kg7;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f183921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f183922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f183923c;

    public b(List transactions, q transactionsExtraData, boolean z) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f183921a = transactions;
        this.f183922b = transactionsExtraData;
        this.f183923c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f183921a, bVar.f183921a) && Intrinsics.f(this.f183922b, bVar.f183922b) && this.f183923c == bVar.f183923c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f183923c) + ((this.f183922b.hashCode() + (this.f183921a.hashCode() * 31)) * 31);
    }
}
