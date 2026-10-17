package anf;

import com.revolut.domain.interactors.transactions.TransactionContext;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.q f7741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.k f7742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i7 f7743c;
    public final TransactionContext d;

    public m(k71.q extraData, thf.k formattingOptions, i7 i7Var, TransactionContext transactionContext) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(formattingOptions, "formattingOptions");
        this.f7741a = extraData;
        this.f7742b = formattingOptions;
        this.f7743c = i7Var;
        this.d = transactionContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f7741a, mVar.f7741a) && Intrinsics.f(this.f7742b, mVar.f7742b) && Intrinsics.f(this.f7743c, mVar.f7743c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f7742b.hashCode() + (this.f7741a.hashCode() * 31)) * 31;
        i7 i7Var = this.f7743c;
        int iHashCode2 = (iHashCode + (i7Var == null ? 0 : i7Var.hashCode())) * 31;
        TransactionContext transactionContext = this.d;
        return iHashCode2 + (transactionContext != null ? transactionContext.hashCode() : 0);
    }
}
