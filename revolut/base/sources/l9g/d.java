package l9g;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f193248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f193249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.a f193250c;

    public d(List transactions, q transactionsExtraData, whf.a calculatorSumExtras) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(calculatorSumExtras, "calculatorSumExtras");
        this.f193248a = transactions;
        this.f193249b = transactionsExtraData;
        this.f193250c = calculatorSumExtras;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f193248a, dVar.f193248a) && Intrinsics.f(this.f193249b, dVar.f193249b) && Intrinsics.f(this.f193250c, dVar.f193250c);
    }

    public final int hashCode() {
        return this.f193250c.hashCode() + ((this.f193249b.hashCode() + (this.f193248a.hashCode() * 31)) * 31);
    }
}
