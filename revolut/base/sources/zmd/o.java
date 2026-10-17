package zmd;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.impl.ui.budget.upcoming_payments.BudgetUpcomingPaymentsContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zfd.s;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends oki.h implements dli.b {
    public final BudgetUpcomingPaymentsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ou5.b f323472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c9e.c f323473q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z8e.a f323474r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f323475s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f323476t;

    public o(q stateMapper, BudgetUpcomingPaymentsContract$InputData inputData, ou5.b budgetUpcomingPaymentsDelegate, c9e.c subscriptionNavigationProvider, z8e.a subscriptionsAppNavigationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(budgetUpcomingPaymentsDelegate, "budgetUpcomingPaymentsDelegate");
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        Intrinsics.checkNotNullParameter(subscriptionsAppNavigationProvider, "subscriptionsAppNavigationProvider");
        this.o = inputData;
        this.f323472p = budgetUpcomingPaymentsDelegate;
        this.f323473q = subscriptionNavigationProvider;
        this.f323474r = subscriptionsAppNavigationProvider;
        this.f323475s = new vii.b();
        this.f323476t = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.f323475s, new z6e.g(continuation, this, 18)), null, new s(this, continuation, 15), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f323476t;
    }
}
