package nqd;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSorter f218405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f218406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncomeSorterExecution f218407c;

    public b(IncomeSorter incomeSorter, a3 transaction, IncomeSorterExecution incomeSorterExecution) {
        Intrinsics.checkNotNullParameter(incomeSorter, "incomeSorter");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f218405a = incomeSorter;
        this.f218406b = transaction;
        this.f218407c = incomeSorterExecution;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f218405a, bVar.f218405a) && Intrinsics.f(this.f218406b, bVar.f218406b) && Intrinsics.f(this.f218407c, bVar.f218407c);
    }

    public final int hashCode() {
        int iF = y.f(this.f218406b, this.f218405a.hashCode() * 31, 31);
        IncomeSorterExecution incomeSorterExecution = this.f218407c;
        return iF + (incomeSorterExecution == null ? 0 : incomeSorterExecution.hashCode());
    }
}
