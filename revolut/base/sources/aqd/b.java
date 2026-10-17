package aqd;

import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od0.i f8325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f8326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io3.d f8327c;
    public final IncomeSorterExecution d;

    public b(od0.i incomeSorter, a3 transaction, io3.d pocket, IncomeSorterExecution incomeSorterExecution) {
        Intrinsics.checkNotNullParameter(incomeSorter, "incomeSorter");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f8325a = incomeSorter;
        this.f8326b = transaction;
        this.f8327c = pocket;
        this.d = incomeSorterExecution;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f8325a, bVar.f8325a) && Intrinsics.f(this.f8326b, bVar.f8326b) && Intrinsics.f(this.f8327c, bVar.f8327c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iG = h30.l.g(this.f8327c, wp5.y.f(this.f8326b, this.f8325a.hashCode() * 31, 31), 31);
        IncomeSorterExecution incomeSorterExecution = this.d;
        return iG + (incomeSorterExecution == null ? 0 : incomeSorterExecution.hashCode());
    }
}
