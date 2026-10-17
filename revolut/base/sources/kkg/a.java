package kkg;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f185062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f185063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.a f185064c;
    public final Map d;

    public a(List transactions, q transactionsExtraData, whf.a calculatorSumExtras, Map byWalletTransactionExtraData) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(calculatorSumExtras, "calculatorSumExtras");
        Intrinsics.checkNotNullParameter(byWalletTransactionExtraData, "byWalletTransactionExtraData");
        this.f185062a = transactions;
        this.f185063b = transactionsExtraData;
        this.f185064c = calculatorSumExtras;
        this.d = byWalletTransactionExtraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f185062a, aVar.f185062a) && Intrinsics.f(this.f185063b, aVar.f185063b) && Intrinsics.f(this.f185064c, aVar.f185064c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f185064c.hashCode() + ((this.f185063b.hashCode() + (this.f185062a.hashCode() * 31)) * 31)) * 31);
    }
}
