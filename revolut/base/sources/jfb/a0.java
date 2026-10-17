package jfb;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.analytics.tracking.v3.d f173770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f173771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i90.b f173772c;
    public long d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f173773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f173774h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f173775j;
    public Double k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Double f173776l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Double f173777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f173778n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f173779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f173780q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f173781r;

    public a0(com.revolut.analytics.tracking.v3.d diagnosticEventsTracker, l80.e dateProvider, i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.f173770a = diagnosticEventsTracker;
        this.f173771b = dateProvider;
        this.f173772c = uuidUtils;
        this.f173774h = "";
        this.i = 200;
        this.f173775j = "";
    }

    public final void a() {
        Long lValueOf;
        if (this.f173780q) {
            return;
        }
        long j2 = this.f173773g;
        if (j2 == 0) {
            return;
        }
        long j3 = j2 - this.d;
        Double d = this.f173777m;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            Double d5 = this.k;
            lValueOf = Long.valueOf((long) (((d5 != null ? d5.doubleValue() : 0.0d) + dDoubleValue) - this.d));
        } else {
            lValueOf = null;
        }
        this.f173780q = true;
        LinkedHashMap linkedHashMapN = zhm.r0.n(new Pair("true_tti_ms", Long.valueOf(j3)), new Pair("url_host", this.f173774h), new Pair("session_id", this.f173775j));
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            linkedHashMapN.put("true_fcp_ms", Long.valueOf(jLongValue));
            long j5 = this.o;
            if (j5 > 0) {
                long j16 = jLongValue - j5;
                if (j16 >= 0) {
                    linkedHashMapN.put("fcp_after_ttfb_ms", Long.valueOf(j16));
                }
            }
        }
        if (lValueOf == null) {
            linkedHashMapN.put("tti_timeout", Boolean.TRUE);
        }
        ((com.revolut.analytics.tracking.v3.f) this.f173770a).j("web_app_render", j3, linkedHashMapN, AnalyticsProduct.Shared.MobilePlatform.f);
    }

    public final void b() {
        long jDoubleValue;
        if (this.f173779p) {
            return;
        }
        long j2 = this.e;
        if (j2 == 0) {
            return;
        }
        this.f173779p = true;
        long j3 = j2 - this.d;
        Double d = this.f173776l;
        Long lValueOf = d != null ? Long.valueOf((long) d.doubleValue()) : null;
        long j5 = this.f;
        long j16 = j5 > 0 ? j5 - this.e : 0L;
        long jLongValue = lValueOf != null ? lValueOf.longValue() : j16;
        Double d5 = this.k;
        if (lValueOf == null || d5 == null) {
            long j22 = this.f;
            jDoubleValue = j22 > 0 ? j22 - this.d : j3 + jLongValue;
        } else {
            jDoubleValue = (long) ((d5.doubleValue() + lValueOf.longValue()) - this.d);
        }
        this.o = jDoubleValue;
        long j42 = this.f;
        long j46 = j42 > 0 ? j42 - this.d : 0L;
        Integer num = this.f173778n;
        ((com.revolut.analytics.tracking.v3.f) this.f173770a).j("web_app_ttfb", jDoubleValue, zhm.r0.k(new Pair("true_ttfb_ms", Long.valueOf(jDoubleValue)), new Pair("webview_setup_ms", Long.valueOf(j3)), new Pair("network_ms", Long.valueOf(jLongValue)), new Pair("url_host", this.f173774h), new Pair("http_status", Integer.valueOf(num != null ? num.intValue() : this.i)), new Pair("native_true_ttfb_ms", Long.valueOf(j46)), new Pair("native_network_ms", Long.valueOf(j16)), new Pair("session_id", this.f173775j)), AnalyticsProduct.Shared.MobilePlatform.f);
    }
}
