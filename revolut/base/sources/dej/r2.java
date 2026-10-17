package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r2 extends t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tof.a3 f113640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k71.q f113641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.a f113642c;

    public r2(tof.a3 transaction, k71.q transactionsExtraData, whf.a calculatorSumExtras) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(calculatorSumExtras, "calculatorSumExtras");
        this.f113640a = transaction;
        this.f113641b = transactionsExtraData;
        this.f113642c = calculatorSumExtras;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.f113640a, r2Var.f113640a) && Intrinsics.f(this.f113641b, r2Var.f113641b) && Intrinsics.f(this.f113642c, r2Var.f113642c);
    }

    public final int hashCode() {
        return this.f113642c.hashCode() + ((this.f113641b.hashCode() + (this.f113640a.hashCode() * 31)) * 31);
    }
}
