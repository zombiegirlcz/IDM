package gae;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f142152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f142153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f142154c;

    public h(List transactions, q transactionsExtraData, dj0.d totalMoneyAmount) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(totalMoneyAmount, "totalMoneyAmount");
        this.f142152a = transactions;
        this.f142153b = transactionsExtraData;
        this.f142154c = totalMoneyAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f142152a, hVar.f142152a) && Intrinsics.f(this.f142153b, hVar.f142153b) && Intrinsics.f(this.f142154c, hVar.f142154c);
    }

    public final int hashCode() {
        return this.f142154c.hashCode() + ((this.f142153b.hashCode() + (this.f142152a.hashCode() * 31)) * 31);
    }
}
