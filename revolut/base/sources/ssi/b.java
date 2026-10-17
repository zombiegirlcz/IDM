package ssi;

import com.revolut.domain.interactors.transactions.TransactionContext;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.i7;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f265403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7 f265404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionContext f265405c;

    public b(a3 transaction, i7 i7Var, TransactionContext transactionContext) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f265403a = transaction;
        this.f265404b = i7Var;
        this.f265405c = transactionContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f265403a, bVar.f265403a) && Intrinsics.f(this.f265404b, bVar.f265404b) && Intrinsics.f(this.f265405c, bVar.f265405c);
    }

    public final int hashCode() {
        int iHashCode = this.f265403a.hashCode() * 31;
        i7 i7Var = this.f265404b;
        int iHashCode2 = (iHashCode + (i7Var == null ? 0 : i7Var.hashCode())) * 31;
        TransactionContext transactionContext = this.f265405c;
        return iHashCode2 + (transactionContext != null ? transactionContext.hashCode() : 0);
    }
}
