package vpk;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.retail.feature.ratedetails.impl.network.RatesPlotApiService;
import com.revolut.shared.feature.wealth.domain.api.WealthDomainApi$Toggles$ChartsCachingImprovements;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class p {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RatesPlotApiService f291248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final apk.a f291249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ipk.b f291250c;
    public final jpk.c d;
    public final ne0.d e;
    public final CoroutineScope f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qe0.s f291251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f291252h;
    public final x4l.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qe0.o f291253j;
    public final qe0.o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x4l.c f291254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qe0.o f291255m;

    public p(RatesPlotApiService service, apk.a rateRangeQueryParams, ipk.b midRatesPlotDao, jpk.c candlesDao, ne0.d memoryCache, b80.c networkStateRepository, CoroutineScope appCoroutineScope, l80.e dateProvider, qe0.s forceReloadLimitationStrategy, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(rateRangeQueryParams, "rateRangeQueryParams");
        Intrinsics.checkNotNullParameter(midRatesPlotDao, "midRatesPlotDao");
        Intrinsics.checkNotNullParameter(candlesDao, "candlesDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(forceReloadLimitationStrategy, "forceReloadLimitationStrategy");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f291248a = service;
        this.f291249b = rateRangeQueryParams;
        this.f291250c = midRatesPlotDao;
        this.d = candlesDao;
        this.e = memoryCache;
        this.f = appCoroutineScope;
        this.f291251g = forceReloadLimitationStrategy;
        this.f291252h = featureToggleInteractor;
        Continuation continuation = null;
        final int i = 0;
        x4l.c cVar = new x4l.c(new l(networkStateRepository, this, continuation, 1), new Function1(this) { // from class: vpk.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f291234b;

            {
                this.f291234b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                g params = (g) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.d) this.f291234b.e.get(p.a(params));
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.b) this.f291234b.e.get(p.a(params));
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.b) this.f291234b.e.get(p.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.d) this.f291234b.e.get(p.a(params));
                }
            }
        }, new Function2(this) { // from class: vpk.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f291236b;

            {
                this.f291236b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                g params = (g) obj2;
                switch (i) {
                    case 0:
                        qta.d domain = (qta.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f291236b.e.f(p.a(params), domain);
                        break;
                    case 1:
                        qta.b domain2 = (qta.b) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f291236b.e.f(p.a(params), domain2);
                        break;
                    case 2:
                        qta.b domain3 = (qta.b) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f291236b.e.f(p.a(params), domain3);
                        break;
                    default:
                        qta.d domain4 = (qta.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f291236b.e.f(p.a(params), domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new m(this, continuation, 1), new o(this, continuation, 0));
        this.i = cVar;
        this.f291253j = do3.q.f(cVar, appCoroutineScope);
        final int i2 = 1;
        this.k = do3.q.f(new x4l.c(new l(networkStateRepository, this, continuation, 0), new Function1(this) { // from class: vpk.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f291234b;

            {
                this.f291234b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                g params = (g) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.d) this.f291234b.e.get(p.a(params));
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.b) this.f291234b.e.get(p.a(params));
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.b) this.f291234b.e.get(p.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.d) this.f291234b.e.get(p.a(params));
                }
            }
        }, new Function2(this) { // from class: vpk.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f291236b;

            {
                this.f291236b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                g params = (g) obj2;
                switch (i2) {
                    case 0:
                        qta.d domain = (qta.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f291236b.e.f(p.a(params), domain);
                        break;
                    case 1:
                        qta.b domain2 = (qta.b) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f291236b.e.f(p.a(params), domain2);
                        break;
                    case 2:
                        qta.b domain3 = (qta.b) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f291236b.e.f(p.a(params), domain3);
                        break;
                    default:
                        qta.d domain4 = (qta.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f291236b.e.f(p.a(params), domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new m(this, continuation, 0), new sne.e(this, continuation, 25)), appCoroutineScope);
        final int i3 = 2;
        this.f291254l = new x4l.c(new ekg.a(networkStateRepository, this, (Continuation) null), new Function1(this) { // from class: vpk.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f291234b;

            {
                this.f291234b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                g params = (g) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.d) this.f291234b.e.get(p.a(params));
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.b) this.f291234b.e.get(p.a(params));
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.b) this.f291234b.e.get(p.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.d) this.f291234b.e.get(p.a(params));
                }
            }
        }, new Function2(this) { // from class: vpk.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f291236b;

            {
                this.f291236b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                g params = (g) obj2;
                switch (i3) {
                    case 0:
                        qta.d domain = (qta.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f291236b.e.f(p.a(params), domain);
                        break;
                    case 1:
                        qta.b domain2 = (qta.b) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f291236b.e.f(p.a(params), domain2);
                        break;
                    case 2:
                        qta.b domain3 = (qta.b) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f291236b.e.f(p.a(params), domain3);
                        break;
                    default:
                        qta.d domain4 = (qta.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f291236b.e.f(p.a(params), domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new ald.p(this, continuation, 13), new ald.q(this, continuation, 5));
        final int i5 = 3;
        final int i6 = 3;
        this.f291255m = do3.q.f(new x4l.c(new l(networkStateRepository, this, continuation, 2), new Function1(this) { // from class: vpk.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f291234b;

            {
                this.f291234b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                g params = (g) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.d) this.f291234b.e.get(p.a(params));
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.b) this.f291234b.e.get(p.a(params));
                    case 2:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.b) this.f291234b.e.get(p.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (qta.d) this.f291234b.e.get(p.a(params));
                }
            }
        }, new Function2(this) { // from class: vpk.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f291236b;

            {
                this.f291236b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                g params = (g) obj2;
                switch (i6) {
                    case 0:
                        qta.d domain = (qta.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f291236b.e.f(p.a(params), domain);
                        break;
                    case 1:
                        qta.b domain2 = (qta.b) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f291236b.e.f(p.a(params), domain2);
                        break;
                    case 2:
                        qta.b domain3 = (qta.b) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f291236b.e.f(p.a(params), domain3);
                        break;
                    default:
                        qta.d domain4 = (qta.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f291236b.e.f(p.a(params), domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new m(this, continuation, 2), new o(this, continuation, 1)), appCoroutineScope);
    }

    public static String a(g gVar) {
        StringBuilder sb6 = new StringBuilder("from=");
        sb6.append(((xi0.b) gVar.a().f186385a).f306286a);
        sb6.append(";to=");
        sb6.append(((xi0.b) gVar.a().f186386b).f306286a);
        sb6.append(";duration=");
        sb6.append(gVar.c().name());
        sb6.append(";type=");
        sb6.append(gVar.g().name());
        sb6.append(";polling=");
        sb6.append(gVar.d());
        sb6.append(";side=");
        e eVarF = gVar.f();
        sb6.append(eVarF != null ? eVarF.name() : null);
        sb6.append(";precise=");
        sb6.append(gVar.e());
        sb6.append(";improved=");
        sb6.append(gVar.b());
        return sb6.toString();
    }

    public static /* synthetic */ efm.r d(p pVar, Pair pair, qta.f fVar, w4l.k kVar, int i) {
        if ((i & 8) != 0) {
            kVar = w4l.i.f294643c;
        }
        return pVar.c(pair, fVar, null, kVar);
    }

    public static String f(g gVar) {
        return a0.d.r(a(gVar), "_LAST_UPDATED_KEY");
    }

    public final boolean b() {
        return ((jte.d) this.f291252h).c(WealthDomainApi$Toggles$ChartsCachingImprovements.f105071c);
    }

    public final efm.r c(Pair currencyPair, qta.f duration, Long l2, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g gVar = new g(currencyPair, duration, f.MID_LINE, null, null, false, SyslogConstants.LOG_CLOCK);
        return rd0.e.c(qe0.o.a(this.f291253j, gVar, l2 != null ? l2.longValue() : 10L, loadingStrategy, e(gVar), null, 16), kotlin.coroutines.g.f186406a);
    }

    public final boolean e(g gVar) {
        List listB;
        Pair pair;
        qta.d dVar = (qta.d) this.e.get(a(gVar));
        Long l2 = (dVar == null || (listB = dVar.b()) == null || (pair = (Pair) d0.o0(listB)) == null) ? null : (Long) pair.f186385a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.SECONDS.toMillis(300L);
        if (dVar == null) {
            return false;
        }
        return l2 == null || jCurrentTimeMillis < l2.longValue() || jCurrentTimeMillis - l2.longValue() >= millis;
    }
}
