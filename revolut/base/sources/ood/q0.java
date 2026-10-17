package ood;

import com.revolut.data.model.Data;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListContract$InputData;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.trips.models.Trip;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 extends oki.h implements c {
    public final ks0.n A;
    public final z1 B;
    public final cli.y C;
    public final AnalyticsAccount.Personal.All D;
    public final j0j.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fod.k f227069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x0 f227070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ge3.e f227071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lmd.a f227072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wsg.n f227073t;
    public final knd.x0 u;
    public final ge3.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l5i.q f227074w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TripsListContract$InputData f227075x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CoroutineScope f227076y;
    public final fmc.z z;

    public q0(cli.n stateMapper, j0j.a tripsInteractor, fod.k tripAnalyticsProvider, x0 stateHolder, ge3.e transactionCategorisationInteractor, lmd.a analyticsInteractor, wsg.n walletInteractor, knd.x0 groupClickHandler, ge3.d earliestTransactionFlowInteractor, l5i.q analyticsTransactionsInteractor, TripsListContract$InputData inputData, CoroutineScope coroutineScope, fmc.z tripsCountriesProvider, ks0.n globeResourcesInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(tripsInteractor, "tripsInteractor");
        Intrinsics.checkNotNullParameter(tripAnalyticsProvider, "tripAnalyticsProvider");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(transactionCategorisationInteractor, "transactionCategorisationInteractor");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(groupClickHandler, "groupClickHandler");
        Intrinsics.checkNotNullParameter(earliestTransactionFlowInteractor, "earliestTransactionFlowInteractor");
        Intrinsics.checkNotNullParameter(analyticsTransactionsInteractor, "analyticsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(tripsCountriesProvider, "tripsCountriesProvider");
        Intrinsics.checkNotNullParameter(globeResourcesInteractor, "globeResourcesInteractor");
        this.o = tripsInteractor;
        this.f227069p = tripAnalyticsProvider;
        this.f227070q = stateHolder;
        this.f227071r = transactionCategorisationInteractor;
        this.f227072s = analyticsInteractor;
        this.f227073t = walletInteractor;
        this.u = groupClickHandler;
        this.v = earliestTransactionFlowInteractor;
        this.f227074w = analyticsTransactionsInteractor;
        this.f227075x = inputData;
        this.f227076y = coroutineScope;
        this.z = tripsCountriesProvider;
        this.A = globeResourcesInteractor;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.B = z1VarB;
        this.C = mra.d.b(this, new a(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), amd.i.CATEGORIES, false, false, null), stateMapper, null, false, 12);
        this.D = AnalyticsAccount.Personal.All.f99192a;
    }

    public static CategorisationFilter J2(CategorisationFilter categorisationFilter, boolean z) {
        if (!z) {
            return CategorisationFilter.a(categorisationFilter, he3.d.SPENDINGS, null, null, null, null, 1022);
        }
        return CategorisationFilter.a(categorisationFilter, he3.d.SPENDINGS, null, null, null, he3.c.EXCLUDE_ONLY_FULLY_EXCLUDED, 894);
    }

    @Override // yji.l
    public final void I1() {
        amd.i filter = amd.i.CATEGORIES;
        lmd.a aVar = this.f227072s;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(filter, "filter");
        aVar.f196950b.onNext(filter);
        if (this.f227075x.f87631a != null) {
            l2(new omg.e(this, null, 4), new yi5.b(26));
        }
    }

    public final Set I2(String str) {
        LocalDate localDate;
        LocalDate localDate2;
        i iVar = (i) ((a) ((j2) this.C.f22677a).getValue()).f227028a.getContent();
        if (iVar == null) {
            return zhm.h0.f322473a;
        }
        List listI = iVar.i();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listI) {
            if (!Intrinsics.f(((fod.c) obj2).f136925a.f99263a, str)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            Trip trip = ((fod.c) it8.next()).f136925a;
            ZonedDateTime zonedDateTime = trip.f99264b;
            LocalDate localDateMinusDays = null;
            LocalDate localDatePlusDays = (zonedDateTime == null || (localDate2 = zonedDateTime.toLocalDate()) == null) ? null : localDate2.plusDays(1L);
            ZonedDateTime zonedDateTime2 = trip.f99265c;
            if (zonedDateTime2 != null && (localDate = zonedDateTime2.toLocalDate()) != null) {
                localDateMinusDays = localDate.minusDays(1L);
            }
            zhm.a0.x((localDatePlusDays == null || localDateMinusDays == null || localDatePlusDays.isAfter(localDateMinusDays)) ? zhm.f0.f322471a : nkm.y.J(nkm.t.g(localDatePlusDays, new a15.l(23, localDateMinusDays))), arrayList2);
        }
        return zhm.d0.i1(arrayList2);
    }

    @Override // yji.l
    public final void K1() {
        skm.e0.n(this.f227076y.getF74819h());
    }

    public final void K2() {
        i iVar = (i) ((a) ((j2) this.C.f22677a).getValue()).f227028a.getContent();
        if (iVar == null) {
            return;
        }
        List listI = iVar.i();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : listI) {
            wi0.b bVar = ((fod.c) obj2).f136925a.d;
            Object arrayList = linkedHashMap.get(bVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(bVar, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zhm.q0.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), Integer.valueOf(((List) entry.getValue()).size()));
        }
        l1().M0(new mod.o(linkedHashMap2));
    }

    public final void L2() {
        Object content = ((a) ((j2) this.C.f22677a).getValue()).f227028a.getContent();
        h hVar = content instanceof h ? (h) content : null;
        if (hVar == null) {
            return;
        }
        l2(new p0(hVar, this, null), new yi5.b(26));
    }

    public final void M2(String str, String str2) {
        i iVar = (i) ((a) ((j2) this.C.f22677a).getValue()).f227028a.getContent();
        if (iVar == null) {
            return;
        }
        List listI = iVar.i();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listI) {
            fod.c cVar = (fod.c) obj2;
            if (str2 != null ? Intrinsics.f(cVar.f136925a.f99263a, str2) : str != null ? Intrinsics.f(cVar.f136925a.d.f297794a, str) : false) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((fod.c) it8.next()).f136925a);
        }
        this.f227070q.b(arrayList2);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.B, new okf.m(continuation, this, 6)), null, new l0(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.C;
    }
}
