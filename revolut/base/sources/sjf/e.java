package sjf;

import akl.w;
import aoi.h;
import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import elm.f;
import eoi.r;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.q;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f263725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.analytics.tracking.v3.d f263726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aoi.c f263727c;
    public final ue0.c d;
    public final tif.d e;
    public final j2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f263728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap.KeySetView f263729h;
    public final ConcurrentHashMap i;

    public e(CoroutineScope coroutineScope, l80.e dateProvider, com.revolut.analytics.tracking.v3.d diagnosticEventsTracker, aoi.c performanceAnalyticsInteractor, ue0.c storage, tif.d transactionsDaoWrapper) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(performanceAnalyticsInteractor, "performanceAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(transactionsDaoWrapper, "transactionsDaoWrapper");
        this.f263725a = coroutineScope;
        this.f263726b = diagnosticEventsTracker;
        this.f263727c = performanceAnalyticsInteractor;
        this.d = storage;
        this.e = transactionsDaoWrapper;
        this.f = q.c(-1);
        this.f263728g = new AtomicBoolean(false);
        this.f263729h = ConcurrentHashMap.newKeySet();
        this.i = new ConcurrentHashMap();
        p0 p0Var = p0.f264001a;
        e0.C(coroutineScope, f.f127540b, null, new w(this, null, 6), 2);
    }

    public final void a(TransactionsPerformanceTracker$Scenario scenario, String name, Object value) {
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f263727c.b(scenario.getTraceName()) != null) {
        }
    }

    public final void b(TransactionsPerformanceTracker$Scenario scenario) {
        Map map;
        Map mapB;
        Map mapB2;
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        String traceName = scenario.getTraceName();
        aoi.c cVar = this.f263727c;
        h hVarB = cVar.b(traceName);
        if (hVarB != null) {
            j2 j2Var = this.f;
            hVarB.a("TRANSACTIONS", String.valueOf(((Number) j2Var.getValue()).intValue()));
            ConcurrentHashMap concurrentHashMap = this.i;
            c cVar2 = (c) concurrentHashMap.get(scenario);
            if (cVar2 != null && (mapB2 = cVar2.b()) != null) {
                if (mapB2.isEmpty()) {
                    mapB2 = null;
                }
                if (mapB2 != null) {
                    hVarB.a("ATTRIBUTES", d0.k0(mapB2.entrySet(), "||", null, "||", 0, null, 58));
                }
            }
            String attribute = hVarB.getAttribute("DURATION");
            Long lN = attribute != null ? z.n(attribute) : null;
            h hVarF = cVar.f(scenario.getTraceName());
            if (hVarF != null) {
                long jLongValue = lN != null ? lN.longValue() : hVarF.getDuration();
                c cVar3 = (c) concurrentHashMap.get(scenario);
                if (cVar3 == null || (mapB = cVar3.b()) == null) {
                    map = null;
                } else {
                    if (scenario == TransactionsPerformanceTracker$Scenario.HOME_UI) {
                        AtomicReference atomicReference = r.f127969a;
                        mapB = r0.p(mapB, r.d());
                    }
                    map = mapB;
                }
                String lowerCase = scenario.getTraceName().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                ((com.revolut.analytics.tracking.v3.f) this.f263726b).l(lowerCase, jLongValue, ((Number) j2Var.getValue()).intValue(), map);
            }
            if (this.f263728g.compareAndSet(false, true)) {
                p0 p0Var = p0.f264001a;
                e0.C(this.f263725a, f.f127540b, null, new d(this, null), 2);
            }
        }
    }

    public final void c(TransactionsPerformanceTracker$Scenario scenario, String name) {
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        Intrinsics.checkNotNullParameter(name, "name");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f263727c.b(scenario.getTraceName()) != null) {
        }
    }

    public final boolean d(TransactionsPerformanceTracker$Scenario scenario) {
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        if (!this.f263729h.add(scenario)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f263727c.g(scenario.getTraceName()) == null) {
            return false;
        }
        this.i.put(scenario, new c(jCurrentTimeMillis));
        return true;
    }
}
