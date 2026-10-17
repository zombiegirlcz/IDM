package elf;

import com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends yji.n implements s0 {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kye.e f127431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final osg.b f127432n;
    public final jof.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b2k.e f127433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tkf.b f127434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mjf.d f127435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f127436s;

    public x(klf.h0 commonDataSource, kye.e transactionFeeBreakdownInteractor, osg.b walletInteractor, jof.e feesBreakdownContentProvider, b2k.e taxesItemProvider, tkf.b feeItemProvider, mjf.d atmTransactionLimitsBottomSheetIdProvider, j60.a bottomDialogExtension) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionFeeBreakdownInteractor, "transactionFeeBreakdownInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(feesBreakdownContentProvider, "feesBreakdownContentProvider");
        Intrinsics.checkNotNullParameter(taxesItemProvider, "taxesItemProvider");
        Intrinsics.checkNotNullParameter(feeItemProvider, "feeItemProvider");
        Intrinsics.checkNotNullParameter(atmTransactionLimitsBottomSheetIdProvider, "atmTransactionLimitsBottomSheetIdProvider");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        this.f127430l = commonDataSource;
        this.f127431m = transactionFeeBreakdownInteractor;
        this.f127432n = walletInteractor;
        this.o = feesBreakdownContentProvider;
        this.f127433p = taxesItemProvider;
        this.f127434q = feeItemProvider;
        this.f127435r = atmTransactionLimitsBottomSheetIdProvider;
        this.f127436s = bottomDialogExtension;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof elf.r
            if (r0 == 0) goto L13
            r0 = r6
            elf.r r0 = (elf.r) r0
            int r1 = r0.f127400w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127400w = r1
            goto L18
        L13:
            elf.r r0 = new elf.r
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127400w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            mjf.d r6 = r5.f127435r
            ufm.i r6 = r6.a()
            r0.f127400w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r6 = (java.lang.String) r6
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r0 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig$BottomSheetDestination r1 = new com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig$BottomSheetDestination
            com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor$BottomSheet r2 = new com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor$BottomSheet
            kotlin.jvm.internal.Intrinsics.h(r6)
            r3 = 6
            r4 = 0
            r2.<init>(r6, r4, r3)
            r1.<init>(r2)
            yhi.b r6 = yhi.b.BOTTOM_DIALOG
            r2 = 12
            r0.<init>(r1, r6, r4, r2)
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.c(r0)
            r5.A2(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.x.Z2(gim.c):java.lang.Object");
    }

    public final void b3(String str) {
        A2(zh9.u0.c(new HelpCentreFeatureConfig.Topic(str, "transaction_details_redesign")));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r39.equals("ID_FINAL_EXCHANGE_RATE_ACTION_GOT_IT") == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0204, code lost:
    
        if (r39.equals("ID_CONVERSION_TYPE_ACTION_GOT_IT") == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0208, code lost:
    
        j60.a.v(r8, false, null, 3);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r38, java.lang.String r39, kotlin.coroutines.Continuation r40) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.x.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof elf.s
            if (r0 == 0) goto L13
            r0 = r7
            elf.s r0 = (elf.s) r0
            int r1 = r0.f127406w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127406w = r1
            goto L18
        L13:
            elf.s r0 = new elf.s
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127406w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L6f
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L48
        L36:
            yhm.o.b(r7)
            klf.h0 r7 = r6.f127430l
            kotlinx.coroutines.flow.SharedFlow r7 = r7.d()
            r0.f127406w = r4
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L48
            goto L6e
        L48:
            tof.a3 r7 = (tof.a3) r7
            java.lang.String r7 = r7.f272584c
            if (r7 == 0) goto L7e
            osg.b r2 = r6.f127432n
            wsg.n r2 = (wsg.n) r2
            efm.r r7 = r2.b0(r7)
            vkm.d r7 = rd0.e.b(r7)
            ej9.t r2 = new ej9.t
            r5 = 19
            r2.<init>(r5)
            r5 = 0
            jhi.b r7 = mo3.a.g(r7, r5, r2, r4)
            r0.f127406w = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            psg.a r7 = (psg.a) r7
            com.revolut.feature.junior_settings.api.navigation.JuniorSettingsLimitsDestination r0 = new com.revolut.feature.junior_settings.api.navigation.JuniorSettingsLimitsDestination
            java.lang.String r7 = r7.f239485b
            r0.<init>(r7)
            r6.A2(r0)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L7e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "cannot show junior product limits, walletId is null"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.x.c3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof elf.t
            if (r0 == 0) goto L13
            r0 = r6
            elf.t r0 = (elf.t) r0
            int r1 = r0.f127411w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127411w = r1
            goto L18
        L13:
            elf.t r0 = new elf.t
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127411w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L71
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
            klf.h0 r6 = r5.f127430l
            kotlinx.coroutines.flow.SharedFlow r6 = r6.d()
            r0.f127411w = r4
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L48
            goto L70
        L48:
            tof.a3 r6 = (tof.a3) r6
            jof.e r2 = r5.o
            jof.d r2 = (jof.d) r2
            r2.getClass()
            java.lang.String r2 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            h4d.d r2 = new h4d.d
            r4 = 11
            r2.<init>(r6, r4)
            ufm.c r6 = new ufm.c
            r4 = 2
            r6.<init>(r2, r4)
            java.lang.String r2 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.f127411w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L71
        L70:
            return r1
        L71:
            rp0.y r6 = (rp0.y) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            j60.a r0 = r5.f127436s
            r0.x(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.x.d3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0199, code lost:
    
        if (nim.a.a(r14, r0) != r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(jof.f r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.x.e3(jof.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(jof.g r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof elf.v
            if (r0 == 0) goto L13
            r0 = r10
            elf.v r0 = (elf.v) r0
            int r1 = r0.f127419x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127419x = r1
            goto L18
        L13:
            elf.v r0 = new elf.v
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127419x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r10)
            goto L9f
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            jof.g r9 = r0.u
            yhm.o.b(r10)
            goto L4c
        L38:
            yhm.o.b(r10)
            klf.h0 r10 = r8.f127430l
            kotlinx.coroutines.flow.SharedFlow r10 = r10.d()
            r0.u = r9
            r0.f127419x = r4
            java.lang.Object r10 = vkm.q.x(r10, r0)
            if (r10 != r1) goto L4c
            goto L9e
        L4c:
            tof.a3 r10 = (tof.a3) r10
            jof.e r2 = r8.o
            jof.d r2 = (jof.d) r2
            r2.getClass()
            java.lang.String r4 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r4)
            java.lang.String r4 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            ylg.b r4 = r2.f176954c
            r5 = 0
            ang.f r4 = (ang.f) r4
            efm.d0 r4 = r4.f(r5)
            jn2.a r5 = new jn2.a
            r6 = 23
            r5.<init>(r6)
            jof.a r6 = new jof.a
            r7 = 3
            r6.<init>(r7, r5)
            ufm.i r5 = new ufm.i
            r7 = 1
            r5.<init>(r4, r6, r7)
            j2c.o r4 = new j2c.o
            r6 = 11
            r4.<init>(r9, r6, r10, r2)
            jof.a r9 = new jof.a
            r10 = 4
            r9.<init>(r10, r4)
            ufm.i r10 = new ufm.i
            r2 = 0
            r10.<init>(r5, r9, r2)
            java.lang.String r9 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r9)
            r9 = 0
            r0.u = r9
            r0.f127419x = r3
            java.lang.Object r10 = nim.a.b(r10, r0)
            if (r10 != r1) goto L9f
        L9e:
            return r1
        L9f:
            rp0.y r10 = (rp0.y) r10
            kotlin.jvm.internal.Intrinsics.h(r10)
            j60.a r9 = r8.f127436s
            r9.x(r10)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.x.f3(jof.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof elf.w
            if (r0 == 0) goto L13
            r0 = r8
            elf.w r0 = (elf.w) r0
            int r1 = r0.f127426x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127426x = r1
            goto L18
        L13:
            elf.w r0 = new elf.w
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127426x
            klf.h0 r3 = r7.f127430l
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            yhm.o.b(r8)
            goto L9e
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            tof.a3 r2 = r0.u
            yhm.o.b(r8)
            goto L64
        L3e:
            yhm.o.b(r8)
            goto L52
        L42:
            yhm.o.b(r8)
            kotlinx.coroutines.flow.SharedFlow r8 = r3.d()
            r0.f127426x = r6
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L52
            goto L9d
        L52:
            r2 = r8
            tof.a3 r2 = (tof.a3) r2
            kotlinx.coroutines.flow.SharedFlow r8 = r3.c()
            r0.u = r2
            r0.f127426x = r5
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L64
            goto L9d
        L64:
            tof.t3 r8 = (tof.t3) r8
            r3 = 0
            if (r8 == 0) goto L6c
            java.lang.Double r8 = r8.f273060d0
            goto L6d
        L6c:
            r8 = r3
        L6d:
            if (r8 == 0) goto Lab
            double r5 = r8.doubleValue()
            dj0.d r8 = r2.k
            xi0.b r8 = r8.f115083b
            jof.e r2 = r7.o
            jof.d r2 = (jof.d) r2
            r2.getClass()
            java.lang.String r2 = "transactionAmountCurrency"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            jof.b r2 = new jof.b
            r2.<init>()
            ufm.c r8 = new ufm.c
            r5 = 2
            r8.<init>(r2, r5)
            java.lang.String r2 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.u = r3
            r0.f127426x = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L9e
        L9d:
            return r1
        L9e:
            rp0.y r8 = (rp0.y) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            j60.a r0 = r7.f127436s
            r0.x(r8)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        Lab:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.x.g3(gim.c):java.lang.Object");
    }
}
