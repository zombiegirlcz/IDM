package smd;

import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.CategoryBudgetsContract$InputData;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tof.i3;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends oki.h implements dli.b {
    public final CategoryBudgetsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f264435p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ou5.b f264436q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f264437r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jzi.a f264438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f264439t;
    public final cli.y u;

    public u(CategoryBudgetsContract$InputData inputData, w80.b amountFormatter, ou5.b categoryBudgetsDelegate, y categoryBudgetsUpdatesProvider, jzi.a budgetInteractor, x stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(categoryBudgetsDelegate, "categoryBudgetsDelegate");
        Intrinsics.checkNotNullParameter(categoryBudgetsUpdatesProvider, "categoryBudgetsUpdatesProvider");
        Intrinsics.checkNotNullParameter(budgetInteractor, "budgetInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f264435p = amountFormatter;
        this.f264436q = categoryBudgetsDelegate;
        this.f264437r = categoryBudgetsUpdatesProvider;
        this.f264438s = budgetInteractor;
        this.f264439t = new vii.b();
        this.u = mra.d.b(this, new j(new Data(null, null, true, 3, null), r0.g(), r0.g()), stateMapper, null, false, 12);
    }

    public static Map I2(g gVar, a aVar, Map map) {
        i3 i3Var = gVar.f264414a;
        return Intrinsics.f(aVar.f264408a, gVar.d) ? r0.l(i3Var.getId(), map) : r0.q(map, new Pair(i3Var.getId(), aVar));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f264437r.f264441a, null, null, new t(this, null, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.f264439t, new s9b.n(continuation, this, 5)), null, new t(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
