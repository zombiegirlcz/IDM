package d1g;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f110644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f110645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.a f110646c;

    public d(List transactions, q transactionsExtraData, whf.a calculatorSumExtras) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(calculatorSumExtras, "calculatorSumExtras");
        this.f110644a = transactions;
        this.f110645b = transactionsExtraData;
        this.f110646c = calculatorSumExtras;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f110644a, dVar.f110644a) && Intrinsics.f(this.f110645b, dVar.f110645b) && Intrinsics.f(this.f110646c, dVar.f110646c);
    }

    public final int hashCode() {
        return this.f110646c.hashCode() + ((this.f110645b.hashCode() + (this.f110644a.hashCode() * 31)) * 31);
    }
}
