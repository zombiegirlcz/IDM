package l40;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements p10.h {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee7.a f192027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m30.j f192028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hh0.e f192029c;
    public final z1 d;
    public final z1 e;

    public v(ee7.a inAppCallsApi, m30.j inAppCallRequestsInteractor, hh0.e cloudMessagingTokenProvider) {
        Intrinsics.checkNotNullParameter(inAppCallsApi, "inAppCallsApi");
        Intrinsics.checkNotNullParameter(inAppCallRequestsInteractor, "inAppCallRequestsInteractor");
        Intrinsics.checkNotNullParameter(cloudMessagingTokenProvider, "cloudMessagingTokenProvider");
        this.f192027a = inAppCallsApi;
        this.f192028b = inAppCallRequestsInteractor;
        this.f192029c = cloudMessagingTokenProvider;
        z1 z1VarB = vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
        this.d = z1VarB;
        this.e = z1VarB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (nim.a.a(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(l40.v r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof l40.u
            if (r0 == 0) goto L13
            r0 = r9
            l40.u r0 = (l40.u) r0
            int r1 = r0.f192026w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f192026w = r1
            goto L18
        L13:
            l40.u r0 = new l40.u
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f192026w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            goto L60
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            goto L4a
        L36:
            yhm.o.b(r9)
            hh0.e r9 = r8.f192029c     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            hi0.c r9 = (hi0.c) r9     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            ufm.b r9 = r9.a()     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            r0.f192026w = r4     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            java.lang.Object r9 = nim.a.b(r9, r0)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            if (r9 != r1) goto L4a
            goto L5f
        L4a:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            m30.j r8 = r8.f192028b     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            kotlin.jvm.internal.Intrinsics.h(r9)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            n30.p0 r8 = (n30.p0) r8     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            pfm.r r8 = r8.c(r9)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            r0.f192026w = r3     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            java.lang.Object r8 = nim.a.a(r8, r0)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            if (r8 != r1) goto L60
        L5f:
            return r1
        L60:
            java.lang.String r3 = "InAppCalls"
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            rd0.c r2 = rd0.c.DEBUG     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            java.lang.String r4 = "Register >> Twilio registered after module installation"
            r6 = 0
            r7 = 16
            r5 = 0
            rd0.d.b(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L70 java.util.concurrent.CancellationException -> L82
            goto L7f
        L70:
            r0 = move-exception
            r8 = r0
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "Register >> Failed to register after module installation"
            java.lang.String r2 = "InAppCalls"
            rd0.d.a(r0, r2, r1, r8, r9)
        L7f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L82:
            r0 = move-exception
            r8 = r0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.v.a(l40.v, gim.c):java.lang.Object");
    }

    public final boolean b() {
        return ((be7.t) this.f192027a.f125118m.get()).f14714c.isTwilioDynamicModuleAvailable();
    }
}
