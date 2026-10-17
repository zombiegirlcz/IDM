package s36;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    @NotNull
    private static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o36.f f259446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f259447b;

    public p(o36.f swapRepository, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(swapRepository, "swapRepository");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f259446a = swapRepository;
        this.f259447b = transactionsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r5, xhf.d1 r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof s36.n
            if (r0 == 0) goto L13
            r0 = r7
            s36.n r0 = (s36.n) r0
            int r1 = r0.f259442x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f259442x = r1
            goto L18
        L13:
            s36.n r0 = new s36.n
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f259442x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            xhf.d1 r6 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            goto L47
        L29:
            r5 = move-exception
            goto L55
        L2b:
            r5 = move-exception
            goto L62
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r7)
            com.revolut.domain.interactors.transactions.a r7 = r4.f259447b     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.u = r6     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.f259442x = r3     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            mjf.b0 r7 = (mjf.b0) r7     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r5 = r7.q(r5, r0)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            if (r5 != r1) goto L47
            return r1
        L47:
            t36.h r5 = new t36.h     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.String r7 = r6.getId()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.String r6 = r6.getLegId()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            return r5
        L55:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            java.lang.String r0 = "Failed to persist DeFi swap transactions"
            r1 = 0
            rd0.d.a(r7, r1, r0, r5, r6)
            return r1
        L62:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s36.p.a(java.util.List, xhf.d1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
    
        if (r14 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, wd6.e r13, gim.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s36.p.b(java.lang.String, wd6.e, gim.c):java.lang.Object");
    }
}
