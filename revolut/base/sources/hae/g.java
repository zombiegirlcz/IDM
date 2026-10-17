package hae;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f150489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f150490c;

    public g(List transactions, q transactionsExtraData, dj0.d totalMoneyAmount) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(totalMoneyAmount, "totalMoneyAmount");
        this.f150488a = transactions;
        this.f150489b = transactionsExtraData;
        this.f150490c = totalMoneyAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f150488a, gVar.f150488a) && Intrinsics.f(this.f150489b, gVar.f150489b) && Intrinsics.f(this.f150490c, gVar.f150490c);
    }

    public final int hashCode() {
        return this.f150490c.hashCode() + ((this.f150489b.hashCode() + (this.f150488a.hashCode() * 31)) * 31);
    }
}
