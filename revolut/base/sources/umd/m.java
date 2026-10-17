package umd;

import b9.w2;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.impl.ui.budget.overview.BudgetOverviewContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends oki.h implements dli.b {
    public final BudgetOverviewContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w2 f281298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f281299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f281300r;

    public m(q stateMapper, BudgetOverviewContract$InputData inputData, w2 budgetOverviewDelegate) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(budgetOverviewDelegate, "budgetOverviewDelegate");
        this.o = inputData;
        this.f281298p = budgetOverviewDelegate;
        this.f281299q = new vii.b();
        this.f281300r = mra.d.b(this, new c(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public final void I2() {
        a aVar = (a) ((c) ((j2) this.f281300r.f22677a).getValue()).f281286a.getContent();
        if (aVar != null) {
            l1().M0(new rmd.b(aVar.f281282g));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.f281299q, new uec.d(continuation, this, 6)), null, new uf0.d(this, continuation, 17), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f281300r;
    }
}
