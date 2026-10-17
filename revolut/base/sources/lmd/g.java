package lmd;

import efm.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import l5i.q;
import lk7.m;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import wsg.n;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements xld.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xld.f f196960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f196961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ge3.a f196962c;
    public final n d;
    public final ang.f e;
    public final eqj.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kzi.a f196963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final eqj.g f196964h;
    public final djb.q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l80.e f196965j;

    public g(xld.f upcomingSpendingInteractor, q analyticsTransactionsInteractor, gmd.e spendingChartFactory, ge3.a analyticsPocketsInteractor, n walletInteractor, ang.f userInteractor, eqj.d analyticsCustomPeriodInteractor, kzi.a analyticsPeriodIntervalMapper, eqj.g transactionAnalyticsInteractor, djb.q savingsTransactionsInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(upcomingSpendingInteractor, "upcomingSpendingInteractor");
        Intrinsics.checkNotNullParameter(analyticsTransactionsInteractor, "analyticsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(spendingChartFactory, "spendingChartFactory");
        Intrinsics.checkNotNullParameter(analyticsPocketsInteractor, "analyticsPocketsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(analyticsCustomPeriodInteractor, "analyticsCustomPeriodInteractor");
        Intrinsics.checkNotNullParameter(analyticsPeriodIntervalMapper, "analyticsPeriodIntervalMapper");
        Intrinsics.checkNotNullParameter(transactionAnalyticsInteractor, "transactionAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(savingsTransactionsInteractor, "savingsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f196960a = upcomingSpendingInteractor;
        this.f196961b = analyticsTransactionsInteractor;
        this.f196962c = analyticsPocketsInteractor;
        this.d = walletInteractor;
        this.e = userInteractor;
        this.f = analyticsCustomPeriodInteractor;
        this.f196963g = analyticsPeriodIntervalMapper;
        this.f196964h = transactionAnalyticsInteractor;
        this.i = savingsTransactionsInteractor;
        this.f196965j = dateProvider;
    }

    public static he3.a a(he3.a aVar, Interval interval) {
        Map map = aVar.f151555b;
        LinkedHashMap amountPerDay = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (interval.contains(((LocalDate) entry.getKey()).toDateTimeAtStartOfDay().getMillis())) {
                amountPerDay.put(entry.getKey(), entry.getValue());
            }
        }
        if (amountPerDay.isEmpty()) {
            return null;
        }
        Map map2 = aVar.f151556c;
        LinkedHashMap amountPerDayCommitted = new LinkedHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (interval.contains(((LocalDate) entry2.getKey()).toDateTimeAtStartOfDay().getMillis())) {
                amountPerDayCommitted.put(entry2.getKey(), entry2.getValue());
            }
        }
        xi0.b currency = aVar.f151554a;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amountPerDay, "amountPerDay");
        Intrinsics.checkNotNullParameter(amountPerDayCommitted, "amountPerDayCommitted");
        return new he3.a(currency, amountPerDay, amountPerDayCommitted);
    }

    public final pfm.a b(String str) {
        k kVarFirstElement = m70.a.g(this.d.Z(str, w4l.h.f294642c), null, new m(16), 1).firstElement();
        llh.g gVar = new llh.g(11, new f(this, 1));
        kVarFirstElement.getClass();
        pfm.a aVar = new pfm.a(kVarFirstElement, gVar, 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
