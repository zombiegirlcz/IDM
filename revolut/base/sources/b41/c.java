package b41;

import android.content.Context;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cei.c f12148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12149c;
    public final int d;
    public final hlm.c e;
    public Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public cei.a f12150g;

    public c(Context context, cei.c seonSdk, String sessionId, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(seonSdk, "seonSdk");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f12147a = context;
        this.f12148b = seonSdk;
        this.f12149c = sessionId;
        this.d = i;
        this.e = hlm.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof b41.a
            if (r0 == 0) goto L13
            r0 = r11
            b41.a r0 = (b41.a) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            b41.a r0 = new b41.a
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f12142x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            b41.c r1 = r0.v
            hlm.a r0 = r0.u
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L2f
            goto L70
        L2f:
            r11 = move-exception
            goto L86
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            int r2 = r0.f12141w
            hlm.a r4 = r0.u
            yhm.o.b(r11)
            r11 = r4
            goto L55
        L42:
            yhm.o.b(r11)
            hlm.c r11 = r10.e
            r0.u = r11
            r2 = 0
            r0.f12141w = r2
            r0.z = r4
            java.lang.Object r4 = r11.lock(r5, r0)
            if (r4 != r1) goto L55
            goto L6b
        L55:
            cei.c r4 = r10.f12148b     // Catch: java.lang.Throwable -> L82
            android.content.Context r6 = r10.f12147a     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = r10.f12149c     // Catch: java.lang.Throwable -> L82
            int r8 = r10.d     // Catch: java.lang.Throwable -> L82
            r0.u = r11     // Catch: java.lang.Throwable -> L82
            r0.v = r10     // Catch: java.lang.Throwable -> L82
            r0.f12141w = r2     // Catch: java.lang.Throwable -> L82
            r0.z = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r0 = r4.startBehaviourMonitoring(r6, r7, r8, r0)     // Catch: java.lang.Throwable -> L82
            if (r0 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r1 = r0
            r0 = r11
            r11 = r1
            r1 = r10
        L70:
            cei.a r11 = (cei.a) r11     // Catch: java.lang.Throwable -> L2f
            r1.f12150g = r11     // Catch: java.lang.Throwable -> L2f
            java.time.Instant r11 = java.time.Instant.now()     // Catch: java.lang.Throwable -> L2f
            r10.f = r11     // Catch: java.lang.Throwable -> L2f
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2f
            r0.unlock(r5)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L82:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
        L86:
            r0.unlock(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b41.c.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof b41.b
            if (r0 == 0) goto L13
            r0 = r10
            b41.b r0 = (b41.b) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            b41.b r0 = new b41.b
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f12145x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.time.Instant r1 = r0.v
            hlm.a r0 = r0.u
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L33
            dei.a r10 = (dei.a) r10     // Catch: java.lang.Throwable -> L33
            java.lang.String r10 = r10.f113467a     // Catch: java.lang.Throwable -> L33
            goto L77
        L33:
            r10 = move-exception
            goto La0
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3e:
            int r2 = r0.f12144w
            hlm.a r4 = r0.u
            yhm.o.b(r10)
            r10 = r4
            goto L5a
        L47:
            yhm.o.b(r10)
            hlm.c r10 = r9.e
            r0.u = r10
            r2 = 0
            r0.f12144w = r2
            r0.z = r4
            java.lang.Object r4 = r10.lock(r5, r0)
            if (r4 != r1) goto L5a
            goto L72
        L5a:
            java.time.Instant r4 = r9.f     // Catch: java.lang.Throwable -> L8f
            java.lang.String r6 = "Data collection was not started"
            if (r4 == 0) goto L9a
            cei.a r7 = r9.f12150g     // Catch: java.lang.Throwable -> L8f
            if (r7 == 0) goto L94
            r0.u = r10     // Catch: java.lang.Throwable -> L8f
            r0.v = r4     // Catch: java.lang.Throwable -> L8f
            r0.f12144w = r2     // Catch: java.lang.Throwable -> L8f
            r0.z = r3     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r7.a(r0)     // Catch: java.lang.Throwable -> L8f
            if (r0 != r1) goto L73
        L72:
            return r1
        L73:
            r1 = r0
            r0 = r10
            r10 = r1
            r1 = r4
        L77:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L33
            r9.f = r5     // Catch: java.lang.Throwable -> L33
            r9.f12150g = r5     // Catch: java.lang.Throwable -> L33
            t31.a r2 = new t31.a     // Catch: java.lang.Throwable -> L33
            java.time.Instant r3 = java.time.Instant.now()     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = "now(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.lang.Throwable -> L33
            r2.<init>(r10, r1, r3)     // Catch: java.lang.Throwable -> L33
            r0.unlock(r5)
            return r2
        L8f:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto La0
        L94:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L8f
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8f
        L9a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L8f
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8f
        La0:
            r0.unlock(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b41.c.b(gim.c):java.lang.Object");
    }
}
