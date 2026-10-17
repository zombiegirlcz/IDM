package vdl;

import com.revolut.shared.feature.wealth.domain.impl.data.network.TradingChartsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class l1 {

    @NotNull
    public static final i1 Companion = new i1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b80.c f287996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dcl.t f287997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f287998c;
    public final TradingChartsService d;
    public final ne0.d e;
    public final qe0.s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f287999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l80.e f288000h;
    public final x4l.c i;

    public l1(b80.c networkStateRepository, dcl.t instrumentHistoricalPricesDao, ue0.c storage, TradingChartsService service, ne0.d memoryCache, qe0.s forceReloadLimitationStrategy, gte.a featureToggleInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(instrumentHistoricalPricesDao, "instrumentHistoricalPricesDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(forceReloadLimitationStrategy, "forceReloadLimitationStrategy");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f287996a = networkStateRepository;
        this.f287997b = instrumentHistoricalPricesDao;
        this.f287998c = storage;
        this.d = service;
        this.e = memoryCache;
        this.f = forceReloadLimitationStrategy;
        this.f287999g = featureToggleInteractor;
        this.f288000h = dateProvider;
        Continuation continuation = null;
        this.i = new x4l.c(new th6.p(this, continuation, 20), new a(this, 8), new v48.d(this, 20), new v44.e(this, continuation, 26), new sne.e(this, continuation, 23));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public static final String a(l1 l1Var, j1 j1Var) {
        String str = j1Var.f287986a;
        String id10 = j1Var.f287987b.getId();
        eel.i iVar = j1Var.f287988c;
        Object obj2 = tcl.f.f269881a;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return a0.d.u(v0.a.m("INSTRUMENT_CHART_BOUNDS_", str, "_", id10, "_"), le.u1.g(iVar, tcl.f.f269881a), "_", le.u1.g(j1Var.d, l9.l.n()));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public static String b(j1 j1Var) {
        String str = j1Var.f287986a;
        String id10 = j1Var.f287987b.getId();
        eel.i iVar = j1Var.f287988c;
        Object obj2 = tcl.f.f269881a;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return j6.a.w(v0.a.m("INSTRUMENT_CHART_", str, "_", id10, "_"), le.u1.g(iVar, tcl.f.f269881a), "_", le.u1.g(j1Var.d, l9.l.n()), "_LAST_UPDATED_AT");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public static String c(j1 j1Var) {
        String str = j1Var.f287986a;
        String id10 = j1Var.f287987b.getId();
        eel.i iVar = j1Var.f287988c;
        Object obj2 = tcl.f.f269881a;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return a0.d.u(v0.a.m("INSTRUMENT_CHART_", str, "_", id10, "_"), le.u1.g(iVar, tcl.f.f269881a), "_", le.u1.g(j1Var.d, l9.l.n()));
    }
}
