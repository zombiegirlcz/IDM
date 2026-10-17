package rpd;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSorter f256364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f256365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f256366c;
    public final IncomeSorterExecution d;
    public final List e;

    public b(IncomeSorter incomeSorter, a3 transaction, q transactionsExtraData, IncomeSorterExecution incomeSorterExecution, List rates) {
        Intrinsics.checkNotNullParameter(incomeSorter, "incomeSorter");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f256364a = incomeSorter;
        this.f256365b = transaction;
        this.f256366c = transactionsExtraData;
        this.d = incomeSorterExecution;
        this.e = rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f256364a, bVar.f256364a) && Intrinsics.f(this.f256365b, bVar.f256365b) && Intrinsics.f(this.f256366c, bVar.f256366c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f256366c.hashCode() + y.f(this.f256365b, this.f256364a.hashCode() * 31, 31)) * 31;
        IncomeSorterExecution incomeSorterExecution = this.d;
        return this.e.hashCode() + ((iHashCode + (incomeSorterExecution == null ? 0 : incomeSorterExecution.hashCode())) * 31);
    }
}
