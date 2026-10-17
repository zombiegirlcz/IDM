package rrj;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget.CategoryBudgetContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import le3.b0;
import rnd.d0;
import vkm.z1;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CategoryBudgetContract$InputData f256869p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pzi.b f256870q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ge3.e f256871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ang.f f256872s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l5i.q f256873t;
    public final pzi.a u;
    public final mrj.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l80.e f256874w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ge3.a f256875x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f256876y;
    public final z1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jki.p stateMapper, CategoryBudgetContract$InputData inputData, pzi.b budgetingInteractor, ge3.e categorisationInteractor, ang.f userInteractor, l5i.q analyticsTransactionsInteractor, pzi.a budgetOverviewInteractor, mrj.a spentAmountsLoader, l80.e dateProvider, ge3.a analyticsPocketsInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(budgetingInteractor, "budgetingInteractor");
        Intrinsics.checkNotNullParameter(categorisationInteractor, "categorisationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(analyticsTransactionsInteractor, "analyticsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(budgetOverviewInteractor, "budgetOverviewInteractor");
        Intrinsics.checkNotNullParameter(spentAmountsLoader, "spentAmountsLoader");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(analyticsPocketsInteractor, "analyticsPocketsInteractor");
        this.f256869p = inputData;
        this.f256870q = budgetingInteractor;
        this.f256871r = categorisationInteractor;
        this.f256872s = userInteractor;
        this.f256873t = analyticsTransactionsInteractor;
        this.u = budgetOverviewInteractor;
        this.v = spentAmountsLoader;
        this.f256874w = dateProvider;
        this.f256875x = analyticsPocketsInteractor;
        this.f256876y = new d(new Data(null, null, true, 3, null));
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.z = z1VarB;
    }

    public static Data z2(Object obj2) {
        return obj2 != null ? new Data(obj2, null, false, 6, null) : new Data(null, new IllegalStateException("Missing content"), false, 5, null);
    }

    public final efm.r A2() {
        CategoryBudgetContract$InputData categoryBudgetContract$InputData = this.f256869p;
        String category = categoryBudgetContract$InputData.f101519a;
        AccountId accountId = categoryBudgetContract$InputData.f101520b;
        grj.i iVar = (grj.i) this.f256870q;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        grj.o oVar = iVar.d;
        oVar.getClass();
        efm.r rVarDefer = efm.r.defer(new fag.g(oVar, accountId, 7));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        return ue0.e.H(nim.a.w(nim.a.w(rVarDefer, new gqh.a(category, 5)), new rpi.e(16)), h0.f322473a, new rpi.e(17));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.z, new r3k.c(continuation, this, 11)), null, new rk9.d(this, continuation, 25), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f256876y;
    }

    public final efm.r y2() {
        String id10;
        efm.r rVarG = m70.a.g(A2(), null, new d0(16), 1);
        CategoryBudgetContract$InputData categoryBudgetContract$InputData = this.f256869p;
        String strP = v13.d.p(categoryBudgetContract$InputData.f101519a);
        AccountId accountId = categoryBudgetContract$InputData.f101520b;
        AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
        if (joint == null || (id10 = joint.f51413b) == null) {
            id10 = null;
        } else {
            Intrinsics.checkNotNullParameter(id10, "id");
        }
        efm.r rVarE = ((b0) this.f256871r).e(strP, id10);
        efm.r rVarN = this.f256872s.d.c().n();
        Intrinsics.checkNotNullExpressionValue(rVarN, "toObservable(...)");
        efm.r map = te0.w.n(rVarG, rVarE, rVarN, m70.a.g(rd0.e.c(((le3.f) this.f256875x).e(y0.b(com.revolut.retail.feature.api.a.b(accountId))), kotlin.coroutines.g.f186406a), null, new d0(17), 1)).map(new rpi.d(new k(this, 1), 12));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
