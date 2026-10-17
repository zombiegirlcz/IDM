package zmd;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f323467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f323468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lzi.h f323469c;
    public final wmd.i d;
    public final k71.q e;

    public j(AccountId accountId, AnalyticsSpendingPeriod$Interval interval, lzi.h cycle, wmd.i upcomingPayments, k71.q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        Intrinsics.checkNotNullParameter(upcomingPayments, "upcomingPayments");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f323467a = accountId;
        this.f323468b = interval;
        this.f323469c = cycle;
        this.d = upcomingPayments;
        this.e = transactionsExtraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f323467a, jVar.f323467a) && Intrinsics.f(this.f323468b, jVar.f323468b) && Intrinsics.f(this.f323469c, jVar.f323469c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f323469c.hashCode() + ((this.f323468b.hashCode() + (this.f323467a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
