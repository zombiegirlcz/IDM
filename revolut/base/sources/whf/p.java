package whf;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f297646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f297647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f297648c;
    public final Map d;

    public p(List transactions, q transactionsExtraData, a calculatorSumExtras, Map byWalletTransactionExtraData) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(calculatorSumExtras, "calculatorSumExtras");
        Intrinsics.checkNotNullParameter(byWalletTransactionExtraData, "byWalletTransactionExtraData");
        this.f297646a = transactions;
        this.f297647b = transactionsExtraData;
        this.f297648c = calculatorSumExtras;
        this.d = byWalletTransactionExtraData;
    }

    public static p a(List transactions, p pVar) {
        q transactionsExtraData = pVar.f297647b;
        a calculatorSumExtras = pVar.f297648c;
        Map byWalletTransactionExtraData = pVar.d;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(calculatorSumExtras, "calculatorSumExtras");
        Intrinsics.checkNotNullParameter(byWalletTransactionExtraData, "byWalletTransactionExtraData");
        return new p(transactions, transactionsExtraData, calculatorSumExtras, byWalletTransactionExtraData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f297646a, pVar.f297646a) && Intrinsics.f(this.f297647b, pVar.f297647b) && Intrinsics.f(this.f297648c, pVar.f297648c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f297648c.hashCode() + ((this.f297647b.hashCode() + (this.f297646a.hashCode() * 31)) * 31)) * 31);
    }

    public /* synthetic */ p(List list, q qVar, a aVar) {
        this(list, qVar, aVar, r0.g());
    }
}
