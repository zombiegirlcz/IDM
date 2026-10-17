package h5a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f149523a;

    public j(com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f149523a = transactionsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(h5a.j r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof h5a.i
            if (r0 == 0) goto L13
            r0 = r12
            h5a.i r0 = (h5a.i) r0
            int r1 = r0.f149522w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149522w = r1
            goto L18
        L13:
            h5a.i r0 = new h5a.i
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149522w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L5a
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            com.revolut.domain.interactors.transactions.a r4 = r11.f149523a
            tof.i7$c r11 = tof.i7.Companion
            tof.y6 r12 = tof.y6.TRANSFER
            tof.y6[] r12 = new tof.y6[]{r12}
            r11.getClass()
            tof.cc r5 = tof.i7.c.d(r12)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r3)
            r9 = 0
            r10 = 26
            r6 = 0
            r8 = 0
            ufm.i r11 = com.revolut.domain.interactors.transactions.a.b(r4, r5, r6, r7, r8, r9, r10)
            r0.f149522w = r3
            java.lang.Object r12 = nim.a.b(r11, r0)
            if (r12 != r1) goto L5a
            return r1
        L5a:
            java.lang.String r11 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r11)
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r11 = r12.isEmpty()
            r11 = r11 ^ r3
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h5a.j.a(h5a.j, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof h5a.g
            if (r0 == 0) goto L13
            r0 = r5
            h5a.g r0 = (h5a.g) r0
            int r1 = r0.f149521w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149521w = r1
            goto L18
        L13:
            h5a.g r0 = new h5a.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149521w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L27
            goto L47
        L27:
            r5 = move-exception
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            h5a.h r5 = new h5a.h     // Catch: java.lang.Throwable -> L27
            r2 = 0
            r5.<init>(r4, r2)     // Catch: java.lang.Throwable -> L27
            r0.f149521w = r3     // Catch: java.lang.Throwable -> L27
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r5 = skm.h2.b(r2, r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L47
            return r1
        L47:
            com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.b r5 = (com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.b) r5     // Catch: java.lang.Throwable -> L27
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L52
        L4c:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L52:
            java.lang.Throwable r0 = yhm.m.a(r5)
            if (r0 != 0) goto L59
            goto L65
        L59:
            boolean r5 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r5 != 0) goto L63
            boolean r5 = r0 instanceof java.util.concurrent.CancellationException
            if (r5 != 0) goto L62
            goto L63
        L62:
            throw r0
        L63:
            com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.b$a r5 = com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.b.a.f80194a
        L65:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h5a.j.b(gim.c):java.lang.Object");
    }
}
