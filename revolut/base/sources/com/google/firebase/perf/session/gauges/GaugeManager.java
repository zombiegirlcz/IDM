package com.google.firebase.perf.session.gauges;

import android.content.Context;
import androidx.annotation.Keep;
import ce.h;
import ce.p;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.f;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import nf.a;
import nf.o;
import nf.q;
import nf.r;
import vf.b;
import vf.c;
import vf.d;
import vf.e;
import vf.g;
import xf.n;
import xf.t;
import xf.u;
import xf.w;
import xf.x;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private n applicationProcessState;
    private final a configResolver;
    private final p cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final p gaugeManagerExecutor;
    private e gaugeMetadataManager;
    private final p memoryGaugeCollector;
    private String sessionId;
    private final wf.e transportManager;
    private static final qf.a logger = qf.a.d();
    private static final GaugeManager instance = new GaugeManager();

    private GaugeManager() {
        this(new p(new h(7)), wf.e.f296850s, a.e(), null, new p(new h(8)), new p(new h(9)));
    }

    private long getCpuGaugeCollectionFrequencyMs(n nVar) {
        long jLongValue;
        int i = d.f288378a[nVar.ordinal()];
        if (i == 1) {
            a aVar = this.configResolver;
            aVar.getClass();
            nf.n nVarH = nf.n.H();
            f fVarJ = aVar.j(nVarH);
            if (fVarJ.b() && a.n(((Long) fVarJ.a()).longValue())) {
                jLongValue = ((Long) fVarJ.a()).longValue();
            } else {
                f fVar = aVar.f214765a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                if (fVar.b() && a.n(((Long) fVar.a()).longValue())) {
                    aVar.f214767c.e(((Long) fVar.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    jLongValue = ((Long) fVar.a()).longValue();
                } else {
                    f fVarC = aVar.c(nVarH);
                    jLongValue = (fVarC.b() && a.n(((Long) fVarC.a()).longValue())) ? ((Long) fVarC.a()).longValue() : 0L;
                }
            }
        } else if (i != 2) {
            jLongValue = -1;
        } else {
            a aVar2 = this.configResolver;
            RemoteConfigManager remoteConfigManager = aVar2.f214765a;
            o oVarH = o.H();
            f fVarJ2 = aVar2.j(oVarH);
            if (fVarJ2.b() && a.n(((Long) fVarJ2.a()).longValue())) {
                jLongValue = ((Long) fVarJ2.a()).longValue();
            } else {
                f fVar2 = remoteConfigManager.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (fVar2.b() && a.n(((Long) fVar2.a()).longValue())) {
                    aVar2.f214767c.e(((Long) fVar2.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) fVar2.a()).longValue();
                } else {
                    f fVarC2 = aVar2.c(oVarH);
                    jLongValue = (fVarC2.b() && a.n(((Long) fVarC2.a()).longValue())) ? ((Long) fVarC2.a()).longValue() : remoteConfigManager.isLastFetchFailed() ? 300L : 100L;
                }
            }
        }
        if (b.b(jLongValue)) {
            return -1L;
        }
        return jLongValue;
    }

    private u getGaugeMetadata() {
        t tVarNewBuilder = u.newBuilder();
        e eVar = this.gaugeMetadataManager;
        com.google.firebase.perf.util.p pVar = com.google.firebase.perf.util.p.BYTES;
        tVarNewBuilder.h(jh.d.t(pVar.a(eVar.f288381c.totalMem)));
        tVarNewBuilder.i(jh.d.t(pVar.a(this.gaugeMetadataManager.f288379a.maxMemory())));
        tVarNewBuilder.j(jh.d.t(com.google.firebase.perf.util.p.MEGABYTES.a(this.gaugeMetadataManager.f288380b.getMemoryClass())));
        return (u) tVarNewBuilder.a();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(n nVar) {
        long jLongValue;
        int i = d.f288378a[nVar.ordinal()];
        if (i == 1) {
            a aVar = this.configResolver;
            aVar.getClass();
            q qVarH = q.H();
            f fVarJ = aVar.j(qVarH);
            if (fVarJ.b() && a.n(((Long) fVarJ.a()).longValue())) {
                jLongValue = ((Long) fVarJ.a()).longValue();
            } else {
                f fVar = aVar.f214765a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                if (fVar.b() && a.n(((Long) fVar.a()).longValue())) {
                    aVar.f214767c.e(((Long) fVar.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    jLongValue = ((Long) fVar.a()).longValue();
                } else {
                    f fVarC = aVar.c(qVarH);
                    jLongValue = (fVarC.b() && a.n(((Long) fVarC.a()).longValue())) ? ((Long) fVarC.a()).longValue() : 0L;
                }
            }
        } else if (i != 2) {
            jLongValue = -1;
        } else {
            a aVar2 = this.configResolver;
            RemoteConfigManager remoteConfigManager = aVar2.f214765a;
            r rVarH = r.H();
            f fVarJ2 = aVar2.j(rVarH);
            if (fVarJ2.b() && a.n(((Long) fVarJ2.a()).longValue())) {
                jLongValue = ((Long) fVarJ2.a()).longValue();
            } else {
                f fVar2 = remoteConfigManager.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (fVar2.b() && a.n(((Long) fVar2.a()).longValue())) {
                    aVar2.f214767c.e(((Long) fVar2.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) fVar2.a()).longValue();
                } else {
                    f fVarC2 = aVar2.c(rVarH);
                    jLongValue = (fVarC2.b() && a.n(((Long) fVarC2.a()).longValue())) ? ((Long) fVarC2.a()).longValue() : remoteConfigManager.isLastFetchFailed() ? 300L : 100L;
                }
            }
        }
        if (g.b(jLongValue)) {
            return -1L;
        }
        return jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b lambda$new$0() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$new$1() {
        return new g();
    }

    private boolean startCollectingCpuMetrics(long j2, Timer timer) {
        if (j2 == -1) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((b) this.cpuGaugeCollector.get()).d(j2, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j2, Timer timer) {
        if (j2 == -1) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((g) this.memoryGaugeCollector.get()).d(j2, timer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, n nVar) {
        w wVarNewBuilder = x.newBuilder();
        while (!((b) this.cpuGaugeCollector.get()).f288372a.isEmpty()) {
            wVarNewBuilder.i((xf.q) ((b) this.cpuGaugeCollector.get()).f288372a.poll());
        }
        while (!((g) this.memoryGaugeCollector.get()).f288386b.isEmpty()) {
            wVarNewBuilder.h((xf.f) ((g) this.memoryGaugeCollector.get()).f288386b.poll());
        }
        wVarNewBuilder.k(str);
        wf.e eVar = this.transportManager;
        eVar.i.execute(new c(eVar, 2, (x) wVarNewBuilder.a(), nVar));
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce((b) this.cpuGaugeCollector.get(), (g) this.memoryGaugeCollector.get(), timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new e(context);
    }

    public boolean logGaugeMetadata(String str, n nVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        w wVarNewBuilder = x.newBuilder();
        wVarNewBuilder.k(str);
        wVarNewBuilder.j(getGaugeMetadata());
        x xVar = (x) wVarNewBuilder.a();
        wf.e eVar = this.transportManager;
        eVar.i.execute(new c(eVar, 2, xVar, nVar));
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, n nVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(nVar, perfSession.f49590b);
        if (jStartCollectingGauges == -1) {
            logger.f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String str = perfSession.f49589a;
        this.sessionId = str;
        this.applicationProcessState = nVar;
        try {
            long j2 = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new c(this, 0, str, nVar), j2, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.f("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        n nVar = this.applicationProcessState;
        ((b) this.cpuGaugeCollector.get()).e();
        ((g) this.memoryGaugeCollector.get()).e();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new ag.n(this, 7, str, nVar), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = n.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(b bVar, g gVar, Timer timer) {
        bVar.a(timer);
        gVar.a(timer);
    }

    public GaugeManager(p pVar, wf.e eVar, a aVar, e eVar2, p pVar2, p pVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = n.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = pVar;
        this.transportManager = eVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = eVar2;
        this.cpuGaugeCollector = pVar2;
        this.memoryGaugeCollector = pVar3;
    }

    private long startCollectingGauges(n nVar, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(nVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(nVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
