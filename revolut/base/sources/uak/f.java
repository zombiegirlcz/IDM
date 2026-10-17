package uak;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sri.m;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h61.c f278681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f278682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tz1.b f278683c;
    public final gte.a d;
    public final m e;
    public volatile long f;

    public f(h61.c threeDSInteractor, l93.f revolutCardsInteractor, tz1.b apmPendingPaymentsHandler, l80.e dateProvider, gte.a featureToggleInteractor, m navigator) {
        Intrinsics.checkNotNullParameter(threeDSInteractor, "threeDSInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(apmPendingPaymentsHandler, "apmPendingPaymentsHandler");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f278681a = threeDSInteractor;
        this.f278682b = revolutCardsInteractor;
        this.f278683c = apmPendingPaymentsHandler;
        this.d = featureToggleInteractor;
        this.e = navigator;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(uak.f r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof uak.e
            if (r0 == 0) goto L13
            r0 = r9
            uak.e r0 = (uak.e) r0
            int r1 = r0.f278680w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278680w = r1
            goto L18
        L13:
            uak.e r0 = new uak.e
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278680w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L78
            goto L59
        L27:
            r9 = move-exception
            goto L5e
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r9)
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r8.f
            long r4 = r4 - r6
            r6 = 300000(0x493e0, double:1.482197E-318)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L7a
            yhm.m$a r9 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L78
            l93.f r9 = r8.f278682b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L78
            ufm.b r9 = l93.f.e(r9)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L78
            zhm.f0 r2 = zhm.f0.f322471a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L78
            pfm.z r9 = ue0.e.F(r9, r2)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L78
            r0.f278680w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L78
            java.lang.Object r9 = nim.a.b(r9, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L78
            if (r9 != r1) goto L59
            return r1
        L59:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L78
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L78
            goto L64
        L5e:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
        L64:
            boolean r0 = r9 instanceof yhm.n
            if (r0 == 0) goto L69
            r9 = 0
        L69:
            java.util.List r9 = (java.util.List) r9
            boolean r0 = ue0.e.n(r9)
            if (r0 != 0) goto L7a
            long r0 = java.lang.System.currentTimeMillis()
            r8.f = r0
            goto L7c
        L78:
            r8 = move-exception
            throw r8
        L7a:
            zhm.f0 r9 = zhm.f0.f322471a
        L7c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uak.f.a(uak.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof uak.b
            if (r0 == 0) goto L13
            r0 = r5
            uak.b r0 = (uak.b) r0
            int r1 = r0.f278675w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278675w = r1
            goto L18
        L13:
            uak.b r0 = new uak.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278675w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            uak.d r5 = new uak.d
            r2 = 0
            r5.<init>(r4, r2)
            r0.f278675w = r3
            java.lang.Object r5 = skm.e0.o(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            if (r5 == 0) goto L4a
            sri.m r0 = r4.e
            r0.c(r5)
        L4a:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uak.f.b(gim.c):java.lang.Object");
    }
}
