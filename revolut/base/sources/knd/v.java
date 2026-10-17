package knd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kkf.b4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import tof.g9;
import tof.i7;
import tof.na;
import tof.q7;
import tof.s9;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class v {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f186140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f186141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f186142c;
    public final ge3.d d;
    public final kzi.a e;
    public final ge3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l5i.q f186143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jid.z f186144h;
    public final lnd.n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j2 f186145j;

    public v(k1 intervalDataProvider, x analyticsExtraTransactionFilterProvider, l80.e dateProvider, ge3.d earliestTransactionInteractor, kzi.a periodIntervalMapper, ge3.a analyticsPocketsInteractor, l5i.q analyticsTransactionsInteractor, jid.z proCategorisationInteractor, lnd.r0 categoryTypeMapper, lnd.n analyticsByPeriodMapper) {
        Intrinsics.checkNotNullParameter(intervalDataProvider, "intervalDataProvider");
        Intrinsics.checkNotNullParameter(analyticsExtraTransactionFilterProvider, "analyticsExtraTransactionFilterProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(earliestTransactionInteractor, "earliestTransactionInteractor");
        Intrinsics.checkNotNullParameter(periodIntervalMapper, "periodIntervalMapper");
        Intrinsics.checkNotNullParameter(analyticsPocketsInteractor, "analyticsPocketsInteractor");
        Intrinsics.checkNotNullParameter(analyticsTransactionsInteractor, "analyticsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(proCategorisationInteractor, "proCategorisationInteractor");
        Intrinsics.checkNotNullParameter(categoryTypeMapper, "categoryTypeMapper");
        Intrinsics.checkNotNullParameter(analyticsByPeriodMapper, "analyticsByPeriodMapper");
        this.f186140a = intervalDataProvider;
        this.f186141b = analyticsExtraTransactionFilterProvider;
        this.f186142c = dateProvider;
        this.d = earliestTransactionInteractor;
        this.e = periodIntervalMapper;
        this.f = analyticsPocketsInteractor;
        this.f186143g = analyticsTransactionsInteractor;
        this.f186144h = proCategorisationInteractor;
        this.i = analyticsByPeriodMapper;
        this.f186145j = vkm.q.c(null);
    }

    public static final vkm.h a(v vVar, m mVar, i iVar, he3.b bVar, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, l lVar) {
        Flow gVar;
        Flow flowS;
        AnalyticsAccountsSelection analyticsAccountsSelection = mVar.f186110a;
        pq0.d dVar = vkm.q.f290100b;
        yld.d screenType = iVar.f186090a;
        switch (q.f186123a[screenType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                x xVar = vVar.f186141b;
                Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "analyticsAccountsSelection");
                Intrinsics.checkNotNullParameter(screenType, "screenType");
                if ((analyticsAccountsSelection instanceof AnalyticsAccountsSelection.TotalWealth) || (analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Pro) || (analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Spending)) {
                    gVar = new go.g(null, 2);
                } else {
                    if (!(analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Savings)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g9 g9VarA = x.a(screenType);
                    Set set = ((AnalyticsAccountsSelection.Savings) analyticsAccountsSelection).f99206a;
                    ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
                    Iterator it8 = set.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(xVar.f186152a.a((AnalyticsAccount.Savings) it8.next()));
                    }
                    gVar = mo3.a.g(nim.a.v(zh9.u0.k(arrayList), new ke7.v(g9VarA, 26)), null, new b4(19), 1);
                }
                flowS = vkm.q.s(vkm.q.Q(gVar, new e0f.m1(1, lVar, vVar, mVar, analyticsSpendingPeriod$Interval, iVar, bVar, null)), new a(6), dVar);
                break;
            case 6:
                Set f99208a = analyticsAccountsSelection.getF99208a();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : f99208a) {
                    if (obj2 instanceof AnalyticsAccount.Pro.CurrencyPocket) {
                        arrayList2.add(obj2);
                    }
                }
                Set setI1 = zhm.d0.i1(arrayList2);
                flowS = nim.a.v(setI1.isEmpty() ? vVar.f186144h.q(analyticsSpendingPeriod$Interval.f99210a, analyticsSpendingPeriod$Interval.f99211b, null) : boh.f.e(vkm.q.q(nim.a.v(((le3.f) vVar.f).b(setI1), new imk.e(6, setI1))), new k79.b(vVar, analyticsSpendingPeriod$Interval, 26)), new a(5));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return vkm.q.s(flowS, new a(4), dVar);
    }

    public static h b(i7 i7Var, Set set, Set set2) {
        if (set.isEmpty() && set2.isEmpty()) {
            return new h(i7Var, null);
        }
        s9 s9Var = set.isEmpty() ? null : new s9(set);
        if (!set2.isEmpty()) {
            na naVar = new na(new s9(set2));
            i7Var = i7Var != null ? new q7(zhm.v.k(i7Var, naVar)) : naVar;
        }
        return new h(i7Var, s9Var);
    }

    public final vkm.y c(CoroutineScope coroutineScope, m query, p timeframe, i commonFilter, Map intervalOptions, k kVar) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(commonFilter, "commonFilter");
        Intrinsics.checkNotNullParameter(intervalOptions, "intervalOptions");
        this.f186145j.setValue(kVar);
        Continuation continuation = null;
        return rd0.e.e(vkm.q.q(new vkm.t0(vkm.q.H(new cul.j2(timeframe, this, kVar, commonFilter, query, (Continuation) null, 2), vkm.q.Q(vkm.q.H(new im9.h(timeframe, this, continuation, 18), cj9.c.O(mo3.a.g(((le3.w) this.d).b(zhm.d0.d1(query.f186110a.getF99208a())), null, new b4(18), 1), 1000L)), new e0f.m1(2, coroutineScope, this, query, timeframe, commonFilter, intervalOptions, null))), 1)), zhm.h0.f322473a, new klf.l1(3, 5, continuation));
    }
}
