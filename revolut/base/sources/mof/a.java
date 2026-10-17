package mof;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f207651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f207652b;

    public a(List sentTransactions, q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(sentTransactions, "sentTransactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f207651a = sentTransactions;
        this.f207652b = transactionsExtraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f207651a, aVar.f207651a) && Intrinsics.f(this.f207652b, aVar.f207652b);
    }

    public final int hashCode() {
        return this.f207652b.hashCode() + (this.f207651a.hashCode() * 31);
    }
}
