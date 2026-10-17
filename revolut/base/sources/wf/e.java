package wf;

import android.content.Context;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import pd.g;
import xf.f0;
import xf.i;
import xf.i0;
import xf.j0;
import xf.n;
import xf.t0;
import xf.x;

/* JADX INFO: loaded from: classes.dex */
public final class e implements mf.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final qf.a f296849r = qf.a.d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f296850s = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f296851a;
    public g d;
    public lf.b e;
    public df.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public cf.b f296854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f296855h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f296856j;
    public nf.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f296857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public mf.c f296858m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f296859n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f296860p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f296852b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f296853c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f296861q = false;
    public final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public e() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f296851a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(j0 j0Var) {
        if (j0Var.hasTraceMetric()) {
            t0 traceMetric = j0Var.getTraceMetric();
            long durationUs = traceMetric.getDurationUs();
            Locale locale = Locale.ENGLISH;
            return j6.a.s("trace metric: ", traceMetric.getName(), " (duration: ", new DecimalFormat("#.####").format(durationUs / 1000.0d), "ms)");
        }
        if (j0Var.hasNetworkRequestMetric()) {
            f0 networkRequestMetric = j0Var.getNetworkRequestMetric();
            long timeToResponseCompletedUs = networkRequestMetric.hasTimeToResponseCompletedUs() ? networkRequestMetric.getTimeToResponseCompletedUs() : 0L;
            String strValueOf = networkRequestMetric.hasHttpResponseCode() ? String.valueOf(networkRequestMetric.getHttpResponseCode()) : "UNKNOWN";
            Locale locale2 = Locale.ENGLISH;
            return v0.a.i(v0.a.m("network request trace: ", networkRequestMetric.getUrl(), " (responseCode: ", strValueOf, ", responseTime: "), new DecimalFormat("#.####").format(timeToResponseCompletedUs / 1000.0d), "ms)");
        }
        if (!j0Var.hasGaugeMetric()) {
            return "log";
        }
        x gaugeMetric = j0Var.getGaugeMetric();
        Locale locale3 = Locale.ENGLISH;
        boolean zHasGaugeMetadata = gaugeMetric.hasGaugeMetadata();
        int cpuMetricReadingsCount = gaugeMetric.getCpuMetricReadingsCount();
        int androidMemoryReadingsCount = gaugeMetric.getAndroidMemoryReadingsCount();
        StringBuilder sb6 = new StringBuilder("gauges (hasMetadata: ");
        sb6.append(zHasGaugeMetadata);
        sb6.append(", cpuGaugeCount: ");
        sb6.append(cpuMetricReadingsCount);
        sb6.append(", memoryGaugeCount: ");
        return j6.a.v(sb6, ")", androidMemoryReadingsCount);
    }

    public final void b(i0 i0Var) {
        if (i0Var.hasTraceMetric()) {
            this.f296858m.b(com.google.firebase.perf.util.a.TRACE_EVENT_RATE_LIMITED.toString());
        } else if (i0Var.hasNetworkRequestMetric()) {
            this.f296858m.b(com.google.firebase.perf.util.a.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
        }
    }

    public final void c(t0 t0Var, n nVar) {
        this.i.execute(new ag.n(this, 8, t0Var, nVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(xf.h0 r18, xf.n r19) {
        /*
            Method dump skipped, instruction units count: 1410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.e.d(xf.h0, xf.n):void");
    }

    @Override // mf.b
    public final void onUpdateAppState(n nVar) {
        this.f296861q = nVar == n.FOREGROUND;
        if (this.f296853c.get()) {
            this.i.execute(new t70.x(this, 26));
        }
    }
}
