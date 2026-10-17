package flf;

import elf.s0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f135963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ulf.q f135964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vz1.g f135965n;

    public j(h0 commonDataSource, ulf.q directDebitInsufficientFundsRouter, vz1.g apmPaymentsAuthorisationsRepository) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(directDebitInsufficientFundsRouter, "directDebitInsufficientFundsRouter");
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        this.f135963l = commonDataSource;
        this.f135964m = directDebitInsufficientFundsRouter;
        this.f135965n = apmPaymentsAuthorisationsRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof flf.g
            if (r0 == 0) goto L13
            r0 = r6
            flf.g r0 = (flf.g) r0
            int r1 = r0.f135960w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135960w = r1
            goto L18
        L13:
            flf.g r0 = new flf.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135960w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L48
        L36:
            yhm.o.b(r6)
            klf.h0 r6 = r5.f135963l
            kotlinx.coroutines.flow.SharedFlow r6 = r6.d()
            r0.f135960w = r4
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L48
            goto L63
        L48:
            tof.a3 r6 = (tof.a3) r6
            ibd.i r6 = r6.C
            if (r6 == 0) goto L7c
            java.lang.String r6 = r6.getId()
            if (r6 != 0) goto L55
            goto L7c
        L55:
            vz1.g r2 = r5.f135965n
            vkm.d r6 = r2.b(r6)
            r0.f135960w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r6 = r6.getContent()
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r6 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary) r6
            if (r6 != 0) goto L71
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L71:
            com.revolut.feature.masav.api.navigation.MasavDirectDebitsAdjustLimitsDestination r0 = new com.revolut.feature.masav.api.navigation.MasavDirectDebitsAdjustLimitsDestination
            r0.<init>(r6)
            r5.A2(r0)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L7c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: flf.j.Z2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof flf.i
            if (r0 == 0) goto L13
            r0 = r6
            flf.i r0 = (flf.i) r0
            int r1 = r0.f135962w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135962w = r1
            goto L18
        L13:
            flf.i r0 = new flf.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135962w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L48
        L36:
            yhm.o.b(r6)
            klf.h0 r6 = r5.f135963l
            kotlinx.coroutines.flow.SharedFlow r6 = r6.d()
            r0.f135962w = r4
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L48
            goto L54
        L48:
            tof.a3 r6 = (tof.a3) r6
            r0.f135962w = r3
            ulf.q r2 = r5.f135964m
            java.lang.Object r6 = r2.b(r6, r0)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            ulf.z r6 = (ulf.z) r6
            boolean r0 = r6 instanceof ulf.x
            r1 = 0
            if (r0 == 0) goto L77
            y5i.a r0 = new y5i.a
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData r2 = new com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData
            ulf.x r6 = (ulf.x) r6
            com.revolut.shared.feature.move_money.api.navigation.Action$MoveWithFixedAccount r6 = r6.f281001a
            r4 = 6
            r2.<init>(r6, r1, r4)
            r6 = 14
            r0.<init>(r2, r1, r6)
            com.revolut.kompot.navigable.vc.ViewController r6 = r5.o2(r0)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_FADE r0 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_FADE.f98307a
            yji.n.P2(r5, r6, r0, r1, r3)
            goto L8f
        L77:
            boolean r0 = r6 instanceof ulf.y
            if (r0 == 0) goto L92
            com.revolut.feature.topup_screen.api.destination.InitTopUpDestination r0 = new com.revolut.feature.topup_screen.api.destination.InitTopUpDestination
            com.revolut.feature.topup_screen.api.config.TopUpConfig$a r2 = com.revolut.feature.topup_screen.api.config.TopUpConfig.INSTANCE
            ulf.y r6 = (ulf.y) r6
            dj0.d r6 = r6.f281002a
            r3 = 30
            com.revolut.feature.topup_screen.api.config.TopUpConfig r6 = com.revolut.feature.topup_screen.api.config.TopUpConfig.Companion.a(r2, r6, r1, r1, r3)
            r0.<init>(r6)
            r5.A2(r0)
        L8f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L92:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: flf.j.b3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (b3(r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (Z2(r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r5 = r7 instanceof flf.h
            if (r5 == 0) goto L13
            r5 = r7
            flf.h r5 = (flf.h) r5
            int r0 = r5.f135961w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f135961w = r0
            goto L1a
        L13:
            flf.h r5 = new flf.h
            gim.c r7 = (gim.c) r7
            r5.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f135961w
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            goto L5b
        L35:
            yhm.o.b(r7)
            java.lang.String r7 = "ID_MASAV_INSUFFICIENT_FUNDS_ACTION"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 == 0) goto L49
            r5.f135961w = r3
            java.lang.Object r5 = r4.b3(r5)
            if (r5 != r0) goto L5b
            goto L59
        L49:
            java.lang.String r7 = "ID_MASAV_EXCEEDED_LIMITS_ACTION"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L5a
            r5.f135961w = r2
            java.lang.Object r5 = r4.Z2(r5)
            if (r5 != r0) goto L5b
        L59:
            return r0
        L5a:
            r3 = 0
        L5b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: flf.j.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
