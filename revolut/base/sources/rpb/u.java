package rpb;

import com.revolut.core.model.account.AccountId;
import g48.r0;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pcd.j;
import rp0.n0;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class u implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final djb.n f256342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final elb.b f256343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rnb.w f256344c;
    public final djb.p d;
    public final wsg.n e;
    public final l80.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rnb.a f256345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ijb.a f256346h;
    public final djb.q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final eqj.d f256347j;
    public final kzi.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f256348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r0 f256349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ugc.a f256350n;

    public u(djb.n savingsAccountsDetailsInteractor, elb.b savingsFeatureConfigInteractor, rnb.w savingsVaultInteractor, djb.p savingsStatisticsInteractor, wsg.n walletInteractor, l80.e dateProvider, rnb.a earnInterestDetailsProvider, ijb.a savingsProductInteractor, djb.q savingsTransactionsInteractor, eqj.d analyticsCustomPeriodInteractor, kzi.a analyticsPeriodIntervalMapper, d savingsWidgetNavigationProvider, r0 jointAccountsInteractor, ugc.a savingsChallengeInteractor, gjb.b teenSavingsAccountIdResolver) {
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsStatisticsInteractor, "savingsStatisticsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(earnInterestDetailsProvider, "earnInterestDetailsProvider");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsTransactionsInteractor, "savingsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(analyticsCustomPeriodInteractor, "analyticsCustomPeriodInteractor");
        Intrinsics.checkNotNullParameter(analyticsPeriodIntervalMapper, "analyticsPeriodIntervalMapper");
        Intrinsics.checkNotNullParameter(savingsWidgetNavigationProvider, "savingsWidgetNavigationProvider");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        Intrinsics.checkNotNullParameter(teenSavingsAccountIdResolver, "teenSavingsAccountIdResolver");
        this.f256342a = savingsAccountsDetailsInteractor;
        this.f256343b = savingsFeatureConfigInteractor;
        this.f256344c = savingsVaultInteractor;
        this.d = savingsStatisticsInteractor;
        this.e = walletInteractor;
        this.f = dateProvider;
        this.f256345g = earnInterestDetailsProvider;
        this.f256346h = savingsProductInteractor;
        this.i = savingsTransactionsInteractor;
        this.f256347j = analyticsCustomPeriodInteractor;
        this.k = analyticsPeriodIntervalMapper;
        this.f256348l = savingsWidgetNavigationProvider;
        this.f256349m = jointAccountsInteractor;
        this.f256350n = savingsChallengeInteractor;
    }

    public static go.g f(String str, String str2, pcd.b bVar) {
        return Intrinsics.f(str, str2) ? zi0.c.i(new l(bVar)) : zi0.c.i(new n(str));
    }

    public final Flow a(String str, String str2, pcd.j jVar) {
        Flow flowH = h(str, str2, jVar);
        Flow flowG = g(str, str2);
        Flow flowC = c(jVar);
        return boh.f.e(nim.a.u(new qkg.a(2, 11, null), u0.m(u0.i(flowH, flowG, flowC), f(str, str2, jVar.a()))), new rgf.m(this, jVar, 21));
    }

    public final vkm.d b(djb.k kVar) {
        return rd0.e.b(nim.a.w(((rnb.i) this.f256342a).a(kVar, w4l.h.f294642c), new n0(20)));
    }

    public final Flow c(pcd.j jVar) {
        if (jVar.equals(j.d.f234867a) || jVar.equals(j.c.f234866a)) {
            return nim.a.v(this.f256347j.f128475a.e.c(Unit.f186387a, false), new r(this, 1));
        }
        if (!(jVar instanceof pcd.k) && !(jVar instanceof j.a) && !(jVar instanceof j.b) && !(jVar instanceof pcd.l)) {
            throw new NoWhenBranchMatchedException();
        }
        LocalDate localDateE = ((l80.f) this.f).e();
        f fVar = f.MONTHLY;
        LocalDate localDateWithDayOfMonth = localDateE.withDayOfMonth(1);
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
        return new go.g(zi0.c.P(new g(fVar, localDateWithDayOfMonth, oc.c.O(localDateE)), false, null, 3), 2);
    }

    public final Flow d(String str, String str2, pcd.j jVar) {
        Flow flowH = h(str, str2, jVar);
        Flow flowG = g(str, str2);
        go.g gVarF = f(str, str2, jVar.a());
        t38.e eVarM = u0.m(u0.i(flowH, flowG, gVarF), c(jVar));
        int i = 2;
        return boh.f.e(nim.a.u(new qkg.a(i, 13, null), eVarM), new r(this, i));
    }

    public final Flow e(String str, String str2, pcd.j jVar) {
        Flow flowV;
        Flow flowH = h(str, str2, jVar);
        Flow flowG = g(str, str2);
        go.g gVarF = f(str, str2, jVar.a());
        Continuation continuation = null;
        if (jVar.equals(j.d.f234867a) || jVar.equals(j.c.f234866a)) {
            flowV = nim.a.v(this.f256347j.f128475a.e.c(Unit.f186387a, false), new r(this, 4));
        } else {
            if (!(jVar instanceof pcd.k) && !(jVar instanceof j.a) && !(jVar instanceof j.b) && !(jVar instanceof pcd.l)) {
                throw new NoWhenBranchMatchedException();
            }
            l80.e eVar = this.f;
            LocalDate localDateE = ((l80.f) eVar).e();
            f fVar = f.MONTHLY;
            LocalDate localDateWithDayOfMonth = localDateE.withDayOfMonth(1);
            Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
            g gVar = new g(fVar, localDateWithDayOfMonth, oc.c.O(localDateE));
            LocalDate localDateMinusMonths = ((l80.f) eVar).e().minusMonths(1L);
            LocalDate localDateWithDayOfMonth2 = localDateMinusMonths.withDayOfMonth(1);
            Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth2, "withDayOfMonth(...)");
            flowV = new go.g(zi0.c.P(new Pair(gVar, new g(fVar, localDateWithDayOfMonth2, oc.c.O(localDateMinusMonths))), false, null, 3), 2);
        }
        return boh.f.e(nim.a.u(new qkg.a(2, 14, continuation), u0.m(u0.i(flowH, flowG, gVarF), flowV)), new r(this, 0));
    }

    public final Flow g(String str, String str2) {
        boolean zF = Intrinsics.f(str, str2);
        w4l.h hVar = w4l.h.f294642c;
        return zF ? rd0.e.b(this.e.J(AccountId.Personal.f51414a, hVar)) : nim.a.v(this.f256344c.c(str, hVar), new n0(15));
    }

    public final Flow h(String str, String str2, pcd.j jVar) {
        boolean zF = Intrinsics.f(str, str2);
        rnb.w wVar = this.f256344c;
        return zF ? wVar.d(new pcd.e(jVar)) : nim.a.v(wVar.c(str, w4l.h.f294642c), new n0(21));
    }
}
