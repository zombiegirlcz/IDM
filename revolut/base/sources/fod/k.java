package fod;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.retail.feature.api.trips.models.TripTransactionAdjustment;
import efm.r;
import io3.l;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import knd.m;
import knd.o;
import knd.v;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import mjf.b0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Interval;
import tof.i1;
import vkm.y;
import zh9.u0;
import zhm.d0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f136940h;
    public static final List i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0j.a f136941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f136942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f136943c;
    public final le3.a d;
    public final com.revolut.domain.interactors.transactions.a e;
    public final ppk.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l80.e f136944g;

    static {
        l[] elements = {l.CURRENT, l.MERCHANT, l.CREDIT};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f136940h = kotlin.collections.d.y0(elements);
        i = zhm.v.k(CategorisationFilter.Exclusion.Investments.f65749a, CategorisationFilter.Exclusion.StakingTransactions.f65750a);
    }

    public k(j0j.a tripsInteractor, v analyticsDataProvider, ang.f userInteractor, le3.a analyticsCurrencyInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, ppk.f ratesInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(tripsInteractor, "tripsInteractor");
        Intrinsics.checkNotNullParameter(analyticsDataProvider, "analyticsDataProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(analyticsCurrencyInteractor, "analyticsCurrencyInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f136941a = tripsInteractor;
        this.f136942b = analyticsDataProvider;
        this.f136943c = userInteractor;
        this.d = analyticsCurrencyInteractor;
        this.e = transactionsInteractor;
        this.f = ratesInteractor;
        this.f136944g = dateProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(fod.k r6, fod.c r7, gim.c r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof fod.j
            if (r0 == 0) goto L16
            r0 = r8
            fod.j r0 = (fod.j) r0
            int r1 = r0.f136939w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f136939w = r1
            goto L1b
        L16:
            fod.j r0 = new fod.j
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136939w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L6f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            ind.e r8 = r7.f136926b
            boolean r2 = r8 instanceof ind.c
            if (r2 == 0) goto L47
            ind.c r8 = (ind.c) r8
            dj0.d r8 = r8.i
            long r4 = r8.f115082a
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r4)
            goto L58
        L47:
            boolean r2 = r8 instanceof ind.b
            if (r2 == 0) goto L53
            java.lang.Long r8 = new java.lang.Long
            r4 = 0
            r8.<init>(r4)
            goto L58
        L53:
            boolean r8 = r8 instanceof ind.d
            if (r8 == 0) goto L77
            r8 = 0
        L58:
            if (r8 == 0) goto L74
            long r4 = r8.longValue()
            j0j.a r6 = r6.f136941a
            com.revolut.retail.feature.api.trips.models.Trip r7 = r7.f136925a
            java.lang.String r7 = r7.f99263a
            r0.f136939w = r3
            vvj.g r6 = (vvj.g) r6
            java.lang.Object r8 = r6.f(r7, r4, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r8.getClass()
        L74:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L77:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fod.k.a(fod.k, fod.c, gim.c):java.lang.Object");
    }

    public final knd.l b(Trip trip) {
        List list = trip.e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((TripTransactionAdjustment) obj2).f99268b == k0j.a.INCLUDED) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        ZonedDateTime zonedDateTime = trip.f99264b;
        if (zonedDateTime == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ZonedDateTime zonedDateTimeK = trip.f99265c;
        if (zonedDateTimeK == null) {
            zonedDateTimeK = ((l80.f) this.f136944g).k();
        }
        Interval interval = new Interval(jli.b.h(zonedDateTime).minusMillis(100), jli.b.h(zonedDateTimeK).plusMillis(100));
        ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((TripTransactionAdjustment) it8.next()).f99267a);
        }
        Set setI1 = d0.i1(arrayList3);
        ArrayList arrayList4 = new ArrayList(w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            arrayList4.add(((TripTransactionAdjustment) it9.next()).f99267a);
        }
        return new knd.l(true, setI1, d0.i1(arrayList4), interval);
    }

    public final AnalyticsSpendingPeriod$Interval c(Trip trip) {
        LocalDate localDate;
        LocalDate localDateE;
        ZonedDateTime zonedDateTime = trip.f99264b;
        if (zonedDateTime == null || (localDate = zonedDateTime.toLocalDate()) == null) {
            return null;
        }
        ZonedDateTime zonedDateTime2 = trip.f99265c;
        if (zonedDateTime2 == null || (localDateE = zonedDateTime2.toLocalDate()) == null) {
            localDateE = ((l80.f) this.f136944g).e();
        }
        return new AnalyticsSpendingPeriod$Interval(localDate, localDateE);
    }

    public final y d(CoroutineScope coroutineScope, a aVar, List list, List list2, Map map, amd.i iVar) {
        AnalyticsAccountsSelection.INSTANCE.getClass();
        return this.f136942b.c(coroutineScope, new m(AnalyticsAccountsSelection.Companion.a(AnalyticsAccount.Personal.All.f99192a), y0.b(aVar.f136922a.f116408a), new CategorisationFilter.Scope.AllPockets(f136940h, true), aVar.f136923b), new o(list, list2, he3.b.CREATED_DATE, aVar.f136924c), new knd.i(yld.d.SPENDING, i, aVar.d, null, 8), map, new knd.k(iVar));
    }

    public final Flow e(List list) {
        r rVarX = this.f136943c.f(false).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return boh.f.e(u0.i(new fo6.d(rd0.e.b(rVarX), 2), this.d.a(AnalyticsAccount.Personal.All.f99192a), new fo6.d(rd0.e.b(((b0) this.e).m(i1.f272794a)), 3)), new fg8.y(list, this, 26));
    }
}
