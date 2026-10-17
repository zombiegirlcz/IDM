package aqd;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f8391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncomeSorter f8392c;
    public final IncomeSorterExecution d;
    public final boolean e;
    public final q f;

    public r(String walletId, a3 transaction, IncomeSorter incomeSorter, IncomeSorterExecution incomeSorterExecution, boolean z, q state) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(incomeSorter, "incomeSorter");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f8390a = walletId;
        this.f8391b = transaction;
        this.f8392c = incomeSorter;
        this.d = incomeSorterExecution;
        this.e = z;
        this.f = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f8390a, rVar.f8390a) && Intrinsics.f(this.f8391b, rVar.f8391b) && Intrinsics.f(this.f8392c, rVar.f8392c) && Intrinsics.f(this.d, rVar.d) && this.e == rVar.e && this.f == rVar.f;
    }

    @Override // aqd.s
    public final a3 getTransaction() {
        return this.f8391b;
    }

    public final int hashCode() {
        int iHashCode = (this.f8392c.hashCode() + wp5.y.f(this.f8391b, this.f8390a.hashCode() * 31, 31)) * 31;
        IncomeSorterExecution incomeSorterExecution = this.d;
        return this.f.hashCode() + j6.a.c((iHashCode + (incomeSorterExecution == null ? 0 : incomeSorterExecution.hashCode())) * 31, 31, this.e);
    }
}
