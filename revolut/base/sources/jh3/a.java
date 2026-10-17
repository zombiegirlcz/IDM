package jh3;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f174138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f174139b;

    public a(List transactions, q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f174138a = transactions;
        this.f174139b = transactionsExtraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f174138a, aVar.f174138a) && Intrinsics.f(this.f174139b, aVar.f174139b);
    }

    public final int hashCode() {
        return this.f174139b.hashCode() + (this.f174138a.hashCode() * 31);
    }
}
