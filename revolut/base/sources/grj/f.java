package grj;

import com.revolut.core.model.account.AccountId;
import efm.r;
import gqd.s;
import kotlin.jvm.internal.Intrinsics;
import l5i.q;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements pzi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final le3.i f146030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f146031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xua.a f146032c;
    public final pzi.b d;
    public final a e;
    public final tzi.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ang.f f146033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ge3.a f146034h;
    public final l80.e i;

    public f(le3.i analyticsRatesInteractor, q analyticsTransactionsInteractor, xua.a recurringPaymentInteractor, pzi.b budgetingInteractor, a budgetOverviewFactory, tzi.a budgetingCycleInteractor, ang.f userInteractor, ge3.a analyticsPocketsInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(analyticsRatesInteractor, "analyticsRatesInteractor");
        Intrinsics.checkNotNullParameter(analyticsTransactionsInteractor, "analyticsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(budgetingInteractor, "budgetingInteractor");
        Intrinsics.checkNotNullParameter(budgetOverviewFactory, "budgetOverviewFactory");
        Intrinsics.checkNotNullParameter(budgetingCycleInteractor, "budgetingCycleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(analyticsPocketsInteractor, "analyticsPocketsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f146030a = analyticsRatesInteractor;
        this.f146031b = analyticsTransactionsInteractor;
        this.f146032c = recurringPaymentInteractor;
        this.d = budgetingInteractor;
        this.e = budgetOverviewFactory;
        this.f = budgetingCycleInteractor;
        this.f146033g = userInteractor;
        this.f146034h = analyticsPocketsInteractor;
        this.i = dateProvider;
    }

    public final r a(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        String category = v13.d.u(qzi.l.OVERALL);
        i iVar = (i) this.d;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        o oVar = iVar.d;
        oVar.getClass();
        r rVarDefer = r.defer(new fag.g(oVar, accountId, 7));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        r rVarSwitchMap = m70.a.g(nim.a.w(rVarDefer, new gqh.a(category, 5)), null, new gp3.n(13), 1).distinctUntilChanged().switchMap(new gqk.b(new s(this, accountId, 3), 7));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }
}
