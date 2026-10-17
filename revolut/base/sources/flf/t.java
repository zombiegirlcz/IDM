package flf;

import elf.s0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import mkf.k0;
import org.jetbrains.annotations.NotNull;
import ulf.w;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends yji.n implements s0 {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f135978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ulf.s f135979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f135980n;
    public final u0f.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ulf.c f135981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f135982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k0 f135983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f135984s;

    public t(h0 commonDataSource, ulf.s directDebitInsufficientFundsRouterV2, com.revolut.domain.interactors.transactions.a transactionsInteractor, u0f.a topUpResultStateHolder, ulf.c balancesFilterInteractorFactory, w readyToRetryChecker, k0 directDebitRetryTagProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(directDebitInsufficientFundsRouterV2, "directDebitInsufficientFundsRouterV2");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(topUpResultStateHolder, "topUpResultStateHolder");
        Intrinsics.checkNotNullParameter(balancesFilterInteractorFactory, "balancesFilterInteractorFactory");
        Intrinsics.checkNotNullParameter(readyToRetryChecker, "readyToRetryChecker");
        Intrinsics.checkNotNullParameter(directDebitRetryTagProvider, "directDebitRetryTagProvider");
        this.f135978l = commonDataSource;
        this.f135979m = directDebitInsufficientFundsRouterV2;
        this.f135980n = transactionsInteractor;
        this.o = topUpResultStateHolder;
        this.f135981p = balancesFilterInteractorFactory;
        this.f135982q = readyToRetryChecker;
        this.f135983r = directDebitRetryTagProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cd, code lost:
    
        if (vkm.q.x(r2, r4) != r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(flf.t r22, tof.a3 r23, gim.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flf.t.Z2(flf.t, tof.a3, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void H2() {
        if (this.f135984s) {
            this.f135984s = false;
            if (this.o.f276169a) {
                T2(new ewa.d(this, null, 26), new yi5.b(27));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(kotlin.jvm.functions.Function1 r21, gim.c r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            boolean r2 = r0 instanceof flf.s
            if (r2 == 0) goto L17
            r2 = r0
            flf.s r2 = (flf.s) r2
            int r3 = r2.f135977w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f135977w = r3
            goto L1c
        L17:
            flf.s r2 = new flf.s
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f135977w
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            yhm.o.b(r0)     // Catch: java.lang.Exception -> L2b
            goto L80
        L2b:
            r0 = move-exception
            goto L43
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L35:
            yhm.o.b(r0)
            r2.f135977w = r5     // Catch: java.lang.Exception -> L2b
            r0 = r21
            java.lang.Object r0 = r0.invoke(r2)     // Catch: java.lang.Exception -> L2b
            if (r0 != r3) goto L80
            return r3
        L43:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L83
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            r4 = 0
            rd0.d.a(r3, r4, r4, r0, r2)
            nii.y0 r0 = new nii.y0
            nii.z r5 = new nii.z
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.transactions.impl.R$string.transaction_retryable_banner_error_title
            r3 = 14
            r6.<init>(r2, r4, r4, r3)
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.retail.common.ui.R$string.common_action_got_it
            r8.<init>(r2, r4, r4, r3)
            r18 = 0
            r19 = 32758(0x7ff6, float:4.5904E-41)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2 = 0
            r3 = 5
            r0.<init>(r4, r5, r2, r3)
            r1.L2(r0)
        L80:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        L83:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: flf.t.b3(kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r4, java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof flf.q
            if (r4 == 0) goto L13
            r4 = r6
            flf.q r4 = (flf.q) r4
            int r0 = r4.f135974w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f135974w = r0
            goto L1a
        L13:
            flf.q r4 = new flf.q
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f135974w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = "ID_RETRYABLE_BANNER_RETRY_ACTION"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 == 0) goto L4b
            flf.r r5 = new flf.r
            r6 = 0
            r5.<init>(r3, r6)
            r4.f135974w = r2
            java.lang.Object r4 = r3.b3(r5, r4)
            if (r4 != r0) goto L4c
            return r0
        L4b:
            r2 = 0
        L4c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: flf.t.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
