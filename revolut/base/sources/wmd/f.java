package wmd;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l5i.q;
import le3.w;
import org.jetbrains.annotations.NotNull;
import vx9.v;
import wg9.p;
import wk2.x;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f298642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ge3.a f298643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f298644c;
    public final ge3.d d;
    public final kzi.a e;

    public f(q analyticsTransactionsInteractor, ge3.a analyticsPocketsInteractor, ang.f userInteractor, ge3.d earliestTransactionInteractor, kzi.a periodIntervalMapper) {
        Intrinsics.checkNotNullParameter(analyticsTransactionsInteractor, "analyticsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(analyticsPocketsInteractor, "analyticsPocketsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(earliestTransactionInteractor, "earliestTransactionInteractor");
        Intrinsics.checkNotNullParameter(periodIntervalMapper, "periodIntervalMapper");
        this.f298642a = analyticsTransactionsInteractor;
        this.f298643b = analyticsPocketsInteractor;
        this.f298644c = userInteractor;
        this.d = earliestTransactionInteractor;
        this.e = periodIntervalMapper;
    }

    public static AnalyticsAccountsSelection c(AccountId accountId) {
        AnalyticsAccount all2;
        AnalyticsAccountsSelection.Companion companion = AnalyticsAccountsSelection.INSTANCE;
        if (Intrinsics.f(accountId, AccountId.Personal.f51414a)) {
            all2 = AnalyticsAccount.Personal.All.f99192a;
        } else {
            if (!(accountId instanceof AccountId.Joint)) {
                throw new NoWhenBranchMatchedException();
            }
            all2 = new AnalyticsAccount.Joint.All((AccountId.Joint) accountId);
        }
        companion.getClass();
        return AnalyticsAccountsSelection.Companion.a(all2);
    }

    public final Flow a(AccountId accountId, AnalyticsSpendingPeriod$Interval currentInterval, lzi.h cycle, xi0.b currency, Integer num) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(currentInterval, "currentInterval");
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return boh.f.e(nim.a.v(((w) this.d).b(d0.d1(c(accountId).getF99208a())), new v(this, 21, cycle, currentInterval)), new p(num, currency, this, accountId, 1));
    }

    public final Flow b(AccountId accountId, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, xi0.b bVar, String str) {
        AnalyticsAccountsSelection analyticsAccountsSelectionC = c(accountId);
        return boh.f.e(u0.m(((le3.f) this.f298643b).e(analyticsAccountsSelectionC.getF99208a()), nim.a.v(this.f298644c.j(w4l.h.f294642c), new x(analyticsAccountsSelectionC, 15))), new ryd.f((Object) this, (Object) analyticsSpendingPeriod$Interval, (Object) analyticsAccountsSelectionC, str, (Object) bVar, 14));
    }
}
