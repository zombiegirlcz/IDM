package com.revolut.analytics.tracking.v3;

import android.os.Parcelable;
import com.google.protobuf.d4;
import com.google.protobuf.f3;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import icm.m;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.o;
import kp0.f0;
import no.g0;
import no.j1;
import no.v0;
import no.w0;
import skm.e0;
import tb4.t;
import uo.a0;
import uo.q0;
import uo.x;
import uo.y;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gpk.c f50314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mo.b f50315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mo.c f50316c;
    public final q0 d;
    public final uo.l e;
    public final d4m.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f50317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Optional f50318h;
    public final t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a0 f50319j;
    public final j1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y f50320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f50321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g5l.a f50322n;
    public final rh0.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kj0.d f50323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashSet f50324q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedHashSet f50325r;

    public f(gpk.c coroutineScopeProvider, mo.b eventOwnerProvider, mo.c screenOwnerProvider, q0 screenNameFinder, uo.l productMapper, d4m.a tracker, m appSizeProvider, Optional firebaseAppIdProvider, t biometricInfoProvider, a0 deviceDrmIdProvider, j1 flowNameNormalizer, y applicationStartInfoProvider, x applicationExitInfoProvider, g5l.a screenRecordingDetector, rh0.b mobileServicesAvailabilityManager, kj0.d circuitBreakerStateTransitionTracker) {
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(eventOwnerProvider, "eventOwnerProvider");
        Intrinsics.checkNotNullParameter(screenOwnerProvider, "screenOwnerProvider");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(appSizeProvider, "appSizeProvider");
        Intrinsics.checkNotNullParameter(firebaseAppIdProvider, "firebaseAppIdProvider");
        Intrinsics.checkNotNullParameter(biometricInfoProvider, "biometricInfoProvider");
        Intrinsics.checkNotNullParameter(deviceDrmIdProvider, "deviceDrmIdProvider");
        Intrinsics.checkNotNullParameter(flowNameNormalizer, "flowNameNormalizer");
        Intrinsics.checkNotNullParameter(applicationStartInfoProvider, "applicationStartInfoProvider");
        Intrinsics.checkNotNullParameter(applicationExitInfoProvider, "applicationExitInfoProvider");
        Intrinsics.checkNotNullParameter(screenRecordingDetector, "screenRecordingDetector");
        Intrinsics.checkNotNullParameter(mobileServicesAvailabilityManager, "mobileServicesAvailabilityManager");
        Intrinsics.checkNotNullParameter(circuitBreakerStateTransitionTracker, "circuitBreakerStateTransitionTracker");
        this.f50314a = coroutineScopeProvider;
        this.f50315b = eventOwnerProvider;
        this.f50316c = screenOwnerProvider;
        this.d = screenNameFinder;
        this.e = productMapper;
        this.f = tracker;
        this.f50317g = appSizeProvider;
        this.f50318h = firebaseAppIdProvider;
        this.i = biometricInfoProvider;
        this.f50319j = deviceDrmIdProvider;
        this.k = flowNameNormalizer;
        this.f50320l = applicationStartInfoProvider;
        this.f50321m = applicationExitInfoProvider;
        this.f50322n = screenRecordingDetector;
        this.o = mobileServicesAvailabilityManager;
        this.f50323p = circuitBreakerStateTransitionTracker;
        this.f50324q = new LinkedHashSet();
        this.f50325r = new LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.revolut.analytics.tracking.v3.f r7, gim.c r8) throws java.lang.Throwable {
        /*
            java.util.Optional r0 = r7.f50318h
            boolean r1 = r8 instanceof no.x0
            if (r1 == 0) goto L15
            r1 = r8
            no.x0 r1 = (no.x0) r1
            int r2 = r1.f217866w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f217866w = r2
            goto L1a
        L15:
            no.x0 r1 = new no.x0
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f217866w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r8)
            goto L5b
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            boolean r8 = r0.isPresent()
            if (r8 != 0) goto L3d
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L3d:
            java.lang.Object r8 = r0.get()
            qoi.b r8 = (qoi.b) r8
            r1.f217866w = r4
            r8.getClass()
            skm.p0 r0 = skm.p0.f264001a
            elm.f r0 = elm.f.f127540b
            az0.r1 r3 = new az0.r1
            r5 = 0
            r6 = 13
            r3.<init>(r8, r5, r6)
            java.lang.Object r8 = skm.e0.J(r0, r3, r1)
            if (r8 != r2) goto L5b
            return r2
        L5b:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L62
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L62:
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Shared$Analytics r1 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared.Analytics.f
            r0 = r4
            no.g0 r4 = new no.g0
            r4.<init>(r8, r0)
            r5 = 14
            r2 = 0
            r3 = 0
            r0 = r7
            g(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.analytics.tracking.v3.f.b(com.revolut.analytics.tracking.v3.f, gim.c):java.lang.Object");
    }

    public static void c(f3 f3Var, String str, Object obj2) {
        if (obj2 instanceof d4) {
            com.bumptech.glide.c.s(f3Var, str, (d4) obj2);
            return;
        }
        if (obj2 instanceof String) {
            com.bumptech.glide.c.x(f3Var, str, (String) obj2);
            return;
        }
        if (obj2 instanceof Boolean) {
            com.bumptech.glide.c.t(f3Var, str, (Boolean) obj2);
            return;
        }
        if (obj2 instanceof Double) {
            com.bumptech.glide.c.u(f3Var, str, (Double) obj2);
            return;
        }
        if (obj2 instanceof Integer) {
            com.bumptech.glide.c.v(f3Var, str, (Integer) obj2);
            return;
        }
        if (obj2 instanceof Long) {
            com.bumptech.glide.c.w(f3Var, str, (Long) obj2);
            return;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "DiagnosticTracker", "Unsupported value type for key '" + str + "': '" + obj2 + "'", null, h0Var);
    }

    public static void g(f fVar, AnalyticsProduct analyticsProduct, String str, mh1.d dVar, Function0 function0, int i) {
        String str2 = (i & 2) != 0 ? null : str;
        boolean z = (i & 4) == 0;
        Function1 v0Var = dVar;
        if ((i & 8) != 0) {
            v0Var = new v0(fVar, analyticsProduct, null);
        }
        e0.C(fVar.f50314a.c(), null, null, new w0(function0, fVar, analyticsProduct, str2, z, v0Var, null), 3);
    }

    public final void d(long j2, String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        g(this, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new b3.b(status, j2, 2), 14);
    }

    public final void e(final long j2, final eo.f type, final boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        g(this, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new Function0() { // from class: no.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new AnalyticsContext(m72.b.h("device_fingerprint", com.bumptech.glide.c.g(new h0(j2, type, z)), AnalyticsContext.INSTANCE));
            }
        }, 14);
    }

    public final void f(eo.f type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        g(this, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new f1.f(z, type, 3), 14);
    }

    public final void h(String originalName) {
        Intrinsics.checkNotNullParameter(originalName, "flowName");
        LinkedHashSet linkedHashSet = this.f50324q;
        if (linkedHashSet.contains(originalName)) {
            return;
        }
        Intrinsics.checkNotNullParameter(originalName, "originalName");
        Regex regex = this.k.f217799a;
        Regex.Companion companion = Regex.INSTANCE;
        o oVarB = regex.b(originalName);
        List listC = oVarB != null ? oVarB.c() : null;
        String missingDelimiterValue = listC != null ? (String) d0.e0(0, listC) : null;
        if (missingDelimiterValue == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "FlowNameOnlyNormalizer", "Failed to normalize flow name: ".concat(originalName), null, h0Var);
        }
        if (missingDelimiterValue != null) {
            Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
            Intrinsics.checkNotNullParameter("FLOW", "delimiter");
            Intrinsics.checkNotNullParameter("", "replacement");
            Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
            int iT = kotlin.text.d0.T(missingDelimiterValue, "FLOW", 0, false, 6);
            if (iT != -1) {
                missingDelimiterValue = kotlin.text.d0.j0(missingDelimiterValue, 4 + iT, missingDelimiterValue.length(), "").toString();
            }
        } else {
            missingDelimiterValue = null;
        }
        if (missingDelimiterValue != null) {
            g(this, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new g0(missingDelimiterValue, 3), 14);
            linkedHashSet.add(originalName);
        } else {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "DiagnosticTracker", "Failed to normalize flow name: ".concat(originalName), null, h0Var2);
        }
    }

    public final void i(String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        g(this, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new d8b.h(status, 4), 14);
    }

    public final void j(String name, long j2, Map attributes, AnalyticsProduct product) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(product, "product");
        g(this, product, null, null, new f0(name, j2, attributes, this, 1), 14);
    }

    public final void k(long j2, String dbName, String result, String str) {
        Intrinsics.checkNotNullParameter(dbName, "dbName");
        Intrinsics.checkNotNullParameter(result, "result");
        k9 k9Var = k9.Transaction;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        g(this, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, new f0(j2, dbName, result, str), 14);
    }

    public final void l(final String eventName, final long j2, final int i, final Map map) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        k9 k9Var = k9.Transaction;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        g(this, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, new Function0() { // from class: no.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new AnalyticsContext(m72.b.h(eventName, com.bumptech.glide.c.g(new ml3.e(j2, i, map, this)), AnalyticsContext.INSTANCE));
            }
        }, 14);
    }
}
