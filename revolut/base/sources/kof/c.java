package kof;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSorter f186339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncomeSorterExecution f186340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f186341c;
    public final List d;

    public c(IncomeSorter incomeSorter, IncomeSorterExecution execution, List rates, a3 transaction) {
        Intrinsics.checkNotNullParameter(incomeSorter, "incomeSorter");
        Intrinsics.checkNotNullParameter(execution, "execution");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f186339a = incomeSorter;
        this.f186340b = execution;
        this.f186341c = transaction;
        this.d = rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f186339a, cVar.f186339a) && Intrinsics.f(this.f186340b, cVar.f186340b) && Intrinsics.f(this.f186341c, cVar.f186341c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + y.f(this.f186341c, (this.f186340b.hashCode() + (this.f186339a.hashCode() * 31)) * 31, 31);
    }
}
