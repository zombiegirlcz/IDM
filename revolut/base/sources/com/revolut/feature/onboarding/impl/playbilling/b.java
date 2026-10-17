package com.revolut.feature.onboarding.impl.playbilling;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final fc9.c Companion = new fc9.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f78522a;

    public b(e session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f78522a = session;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof fc9.d
            if (r0 == 0) goto L13
            r0 = r5
            fc9.d r0 = (fc9.d) r0
            int r1 = r0.f133662w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133662w = r1
            goto L18
        L13:
            fc9.d r0 = new fc9.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f133662w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            goto L47
        L27:
            r5 = move-exception
            goto L5a
        L29:
            r5 = move-exception
            goto L61
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            yhm.o.b(r5)
            com.revolut.feature.onboarding.impl.playbilling.a r5 = new com.revolut.feature.onboarding.impl.playbilling.a     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r2 = 0
            r5.<init>(r4, r2)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r0.f133662w = r3     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r5 = skm.h2.d(r2, r5, r0)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L47
            return r1
        L47:
            yhm.m r5 = (yhm.m) r5     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r5.f314193a     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            return r5
        L4e:
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            com.revolut.feature.onboarding.impl.playbilling.OnboardingPlayBillingFailure$Timeout r5 = new com.revolut.feature.onboarding.impl.playbilling.OnboardingPlayBillingFailure$Timeout     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r5.<init>()     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            yhm.n r5 = yhm.o.a(r5)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            return r5
        L5a:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
            return r5
        L61:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.playbilling.b.a(gim.c):java.lang.Object");
    }
}
