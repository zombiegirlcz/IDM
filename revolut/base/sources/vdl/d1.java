package vdl;

import com.revolut.shared.feature.wealth.domain.api.WealthDomainApi$Toggles$ChartsCachingImprovements;
import com.revolut.shared.feature.wealth.domain.impl.data.network.TradingChartsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class d1 {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingChartsService f287954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dcl.o f287955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f287956c;
    public final ne0.d d;
    public final l80.e e;
    public final qe0.s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f287957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f287958h;

    public d1(TradingChartsService service, dcl.o dao, ue0.c storage, ne0.d memoryCache, l80.e dateProvider, qe0.s forceReloadLimitationStrategy, gte.a featureToggleInteractor, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(forceReloadLimitationStrategy, "forceReloadLimitationStrategy");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f287954a = service;
        this.f287955b = dao;
        this.f287956c = storage;
        this.d = memoryCache;
        this.e = dateProvider;
        this.f = forceReloadLimitationStrategy;
        this.f287957g = featureToggleInteractor;
        Continuation continuation = null;
        this.f287958h = new x4l.c(new c1(networkStateRepository, this, (Continuation) null), new a(this, 7), new v48.d(this, 19), new v44.e(this, continuation, 25), new sne.e(this, continuation, 22));
    }

    public static final String a(d1 d1Var, z0 z0Var) {
        String str = z0Var.f288074a;
        String id10 = z0Var.f288075b.getId();
        String strG = le.u1.g(z0Var.f288076c, l9.l.n());
        StringBuilder sbM = v0.a.m("INSTRUMENT_CHART_BOUNDS_", str, "_", id10, "_");
        sbM.append(strG);
        return sbM.toString();
    }

    public static String c(z0 z0Var) {
        String str = z0Var.f288074a;
        String id10 = z0Var.f288075b.getId();
        return v0.a.i(v0.a.m("INSTRUMENT_CHART_", str, "_", id10, "_"), le.u1.g(z0Var.f288076c, l9.l.n()), "_LAST_UPDATED_AT");
    }

    public static String d(z0 z0Var) {
        String str = z0Var.f288074a;
        String id10 = z0Var.f288075b.getId();
        String strG = le.u1.g(z0Var.f288076c, l9.l.n());
        StringBuilder sbM = v0.a.m("INSTRUMENT_CHART_", str, "_", id10, "_");
        sbM.append(strG);
        return sbM.toString();
    }

    public final efm.r b(String ref2, eel.c chartPeriod, eel.m tradingHours, w4l.k loadingStrategy) {
        w4l.k kVarD;
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(tradingHours, "tradingHours");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        z0 z0Var = new z0(ref2, chartPeriod, tradingHours);
        if (b1.f287939a[chartPeriod.ordinal()] == 1) {
            kVarD = w4l.i.f294643c;
        } else {
            kVarD = this.f.d(loadingStrategy, c(z0Var), ((jte.d) this.f287957g).c(WealthDomainApi$Toggles$ChartsCachingImprovements.f105071c));
        }
        return rd0.e.c(this.f287958h.b(z0Var, kVarD), kotlin.coroutines.g.f186406a);
    }
}
