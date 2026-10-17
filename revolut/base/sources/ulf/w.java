package ulf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class w {

    @NotNull
    private static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f280999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f281000b;

    public w(wsg.b newWalletsInteractor, s directDebitInsufficientFundsRouterV2) {
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(directDebitInsufficientFundsRouterV2, "directDebitInsufficientFundsRouterV2");
        this.f280999a = newWalletsInteractor;
        this.f281000b = directDebitInsufficientFundsRouterV2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(tof.a3 r8, gim.c r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ulf.u
            if (r0 == 0) goto L13
            r0 = r9
            ulf.u r0 = (ulf.u) r0
            int r1 = r0.f280996w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280996w = r1
            goto L18
        L13:
            ulf.u r0 = new ulf.u
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280996w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L28
            goto L5a
        L28:
            r8 = move-exception
            goto L4d
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            yhm.o.b(r9)
            kotlin.time.b$a r9 = kotlin.time.b.INSTANCE     // Catch: java.lang.Exception -> L28
            pkm.e r9 = pkm.e.MILLISECONDS     // Catch: java.lang.Exception -> L28
            r5 = 5000(0x1388, double:2.4703E-320)
            long r5 = kotlin.time.c.h(r5, r9)     // Catch: java.lang.Exception -> L28
            ulf.v r9 = new ulf.v     // Catch: java.lang.Exception -> L28
            r9.<init>(r7, r8, r3, r4)     // Catch: java.lang.Exception -> L28
            r0.f280996w = r4     // Catch: java.lang.Exception -> L28
            java.lang.Object r8 = skm.h2.e(r5, r9, r0)     // Catch: java.lang.Exception -> L28
            if (r8 != r1) goto L5a
            return r1
        L4d:
            boolean r9 = r8 instanceof java.util.concurrent.CancellationException
            if (r9 != 0) goto L5d
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r3, r3, r8, r9)
        L5a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L5d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ulf.w.a(tof.a3, gim.c):java.lang.Object");
    }
}
