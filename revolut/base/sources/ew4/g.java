package ew4;

import com.revolut.feature.credit.card.impl.ui.statement_financing.details.CreditCardStatementFinancingDetailsScreenContract$CancellationModel;
import kotlin.jvm.internal.Intrinsics;
import ql4.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f130074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardStatementFinancingDetailsScreenContract$CancellationModel f130075b;

    public g(d0 plan, CreditCardStatementFinancingDetailsScreenContract$CancellationModel creditCardStatementFinancingDetailsScreenContract$CancellationModel) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f130074a = plan;
        this.f130075b = creditCardStatementFinancingDetailsScreenContract$CancellationModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f130074a, gVar.f130074a) && Intrinsics.f(this.f130075b, gVar.f130075b);
    }

    public final int hashCode() {
        int iHashCode = this.f130074a.hashCode() * 31;
        CreditCardStatementFinancingDetailsScreenContract$CancellationModel creditCardStatementFinancingDetailsScreenContract$CancellationModel = this.f130075b;
        return iHashCode + (creditCardStatementFinancingDetailsScreenContract$CancellationModel == null ? 0 : creditCardStatementFinancingDetailsScreenContract$CancellationModel.hashCode());
    }
}
