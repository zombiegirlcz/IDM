package com.revolut.analytics.tracking.v3;

import ho.z;
import java.time.Duration;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements no.e, z {

    @NotNull
    public static final no.f Companion = new no.f();
    public static final Duration f = Duration.ofSeconds(60);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f50307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gpk.c f50308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f50309c;
    public final hlm.c d;
    public final e0m.b e;

    public a(d4m.a analyticsTracker, gpk.c scopeProvider) {
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f50307a = analyticsTracker;
        this.f50308b = scopeProvider;
        this.f50309c = new LinkedHashMap();
        this.d = hlm.d.a();
        this.e = new e0m.b(new ite.d(this, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.revolut.analytics.tracking.v3.a r6, gim.c r7) {
        /*
            java.util.LinkedHashMap r0 = r6.f50309c
            boolean r1 = r7 instanceof no.h
            if (r1 == 0) goto L15
            r1 = r7
            no.h r1 = (no.h) r1
            int r2 = r1.f217778x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f217778x = r2
            goto L1a
        L15:
            no.h r1 = new no.h
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f217778x
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            hlm.c r1 = r1.u
            yhm.o.b(r7)
            goto L45
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            hlm.c r7 = r6.d
            r1.u = r7
            r1.f217778x = r4
            java.lang.Object r1 = r7.lock(r5, r1)
            if (r1 != r2) goto L44
            return r2
        L44:
            r1 = r7
        L45:
            java.util.Map r7 = zhm.r0.u(r0)     // Catch: java.lang.Throwable -> L94
            r0.clear()     // Catch: java.lang.Throwable -> L94
            r1.unlock(r5)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L57:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            com.google.protobuf.h3 r0 = (com.google.protobuf.h3) r0
            d4m.a r2 = r6.f50307a
            java.lang.Object r2 = r2.get()
            ho.t r2 = (ho.t) r2
            ho.c r3 = new ho.c
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Shared$MobilePlatform r4 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared.MobilePlatform.f
            com.revolut.analytics.tracking.v3.AnalyticsContext$b r5 = com.revolut.analytics.tracking.v3.AnalyticsContext.INSTANCE
            com.google.protobuf.w0 r0 = m72.b.h(r1, r0, r5)
            mo.d r1 = mo.e.Companion
            r1.getClass()
            mo.e r1 = mo.e.a()
            r3.<init>(r4, r0, r1)
            r2.e2(r3)
            goto L57
        L91:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L94:
            r6 = move-exception
            r1.unlock(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.analytics.tracking.v3.a.a(com.revolut.analytics.tracking.v3.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, com.google.protobuf.h3 r8, k50.b2 r9, gim.c r10) {
        /*
            r6 = this;
            java.util.LinkedHashMap r0 = r6.f50309c
            boolean r1 = r10 instanceof no.i
            if (r1 == 0) goto L15
            r1 = r10
            no.i r1 = (no.i) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            no.i r1 = new no.i
            r1.<init>(r6, r10)
        L1a:
            java.lang.Object r10 = r1.f217786y
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.A
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L34
            hlm.c r7 = r1.f217785x
            k50.b2 r9 = r1.f217784w
            com.google.protobuf.h3 r8 = r1.v
            java.lang.String r1 = r1.u
            yhm.o.b(r10)
            r10 = r7
            r7 = r1
            goto L57
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            yhm.o.b(r10)
            e0m.b r10 = r6.e
            r10.init()
            r1.u = r7
            r1.v = r8
            r1.f217784w = r9
            hlm.c r10 = r6.d
            r1.f217785x = r10
            r1.A = r4
            java.lang.Object r1 = r10.lock(r5, r1)
            if (r1 != r2) goto L57
            return r2
        L57:
            java.lang.Object r1 = r0.get(r7)     // Catch: java.lang.Throwable -> L71
            com.google.protobuf.h3 r1 = (com.google.protobuf.h3) r1     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto L60
            goto L66
        L60:
            java.lang.Object r8 = r9.invoke(r1, r8)     // Catch: java.lang.Throwable -> L71
            com.google.protobuf.h3 r8 = (com.google.protobuf.h3) r8     // Catch: java.lang.Throwable -> L71
        L66:
            r0.put(r7, r8)     // Catch: java.lang.Throwable -> L71
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L71
            r10.unlock(r5)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L71:
            r7 = move-exception
            r10.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.analytics.tracking.v3.a.b(java.lang.String, com.google.protobuf.h3, k50.b2, gim.c):java.lang.Object");
    }

    @Override // ho.z
    public final void pause() {
        e0.C(this.f50308b.c(), null, null, new no.g(this, null, 1), 3);
    }

    @Override // ho.z
    public final void resume() {
    }
}
