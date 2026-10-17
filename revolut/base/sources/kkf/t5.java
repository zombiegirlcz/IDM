package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t5 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f184954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final eub.a f184955n;
    public final com.revolut.feature.rev_points.api.navigation.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vlf.b f184956p;

    public t5(klf.h0 commonDataSource, klf.m1 juniorDataSource, eub.a revPointsAvailabilityInteractor, com.revolut.feature.rev_points.api.navigation.a revPointsNavigationFactory, vlf.b commonUiMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsNavigationFactory, "revPointsNavigationFactory");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        this.f184953l = commonDataSource;
        this.f184954m = juniorDataSource;
        this.f184955n = revPointsAvailabilityInteractor;
        this.o = revPointsNavigationFactory;
        this.f184956p = commonUiMapper;
    }

    public final cmf.p Z2() {
        n1g.p pVarB = ((nyb.b) this.f184955n).b();
        klf.h0 h0Var = this.f184953l;
        return new cmf.p(ta6.a.g(pVarB, h0Var.d(), h0Var.c(), this.f184954m.a(), new amf.g(5, this, t5.class, "buildBlock", "buildBlock(ZLcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;", 4, 2)), new chc.c0(23), zhm.u.c(this), "RevPoints");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(boolean r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kkf.r5
            if (r0 == 0) goto L13
            r0 = r6
            kkf.r5 r0 = (kkf.r5) r0
            int r1 = r0.f184918x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184918x = r1
            goto L18
        L13:
            kkf.r5 r0 = new kkf.r5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184918x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kkf.t5 r5 = r0.u
            yhm.o.b(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            if (r5 == 0) goto L39
            com.revolut.feature.rev_points.models.RevPointsOptInSource$CreditWidget r5 = com.revolut.feature.rev_points.models.RevPointsOptInSource.CreditWidget.f83985a
            goto L3b
        L39:
            com.revolut.feature.rev_points.models.RevPointsOptInSource$TransactionDetails r5 = com.revolut.feature.rev_points.models.RevPointsOptInSource.TransactionDetails.f84009a
        L3b:
            com.revolut.feature.rev_points.api.navigation.a r6 = r4.o
            qyb.a r6 = (qyb.a) r6
            ufm.i r5 = r6.b(r5)
            r0.u = r4
            r0.f184918x = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r5 = r4
        L4f:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            aii.u r6 = (aii.u) r6
            r5.A2(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.t5.b3(boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (b3(r2, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r6, java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kkf.q5
            if (r0 == 0) goto L13
            r0 = r8
            kkf.q5 r0 = (kkf.q5) r0
            int r1 = r0.f184909w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184909w = r1
            goto L1a
        L13:
            kkf.q5 r0 = new kkf.q5
            gim.c r8 = (gim.c) r8
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184909w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r8)
            return r8
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r8)
            goto L76
        L38:
            yhm.o.b(r8)
            java.lang.String r8 = "ID_LOYALTY_POINTS"
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r7, r8)
            r2 = 0
            if (r8 == 0) goto L5c
            boolean r7 = r6 instanceof tof.o2
            if (r7 == 0) goto L4b
            tof.o2 r6 = (tof.o2) r6
            goto L4c
        L4b:
            r6 = 0
        L4c:
            if (r6 == 0) goto L53
            boolean r6 = r6.f272964c
            if (r6 != r4) goto L53
            r2 = r4
        L53:
            r0.f184909w = r4
            java.lang.Object r6 = r5.b3(r2, r0)
            if (r6 != r1) goto L76
            goto L73
        L5c:
            java.lang.String r8 = "CLICKABLE_END_TEXT_LIST_ID"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r8)
            if (r7 == 0) goto L75
            java.lang.String r7 = "null cannot be cast to non-null type com.revolut.feature.transactions.models.RelatedLoyaltyTransactionsDetails"
            kotlin.jvm.internal.Intrinsics.i(r6, r7)
            tof.o2 r6 = (tof.o2) r6
            r0.f184909w = r3
            java.lang.Object r6 = r5.c3(r6, r0)
            if (r6 != r1) goto L74
        L73:
            return r1
        L74:
            return r6
        L75:
            r4 = r2
        L76:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.t5.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(tof.o2 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kkf.s5
            if (r0 == 0) goto L13
            r0 = r6
            kkf.s5 r0 = (kkf.s5) r0
            int r1 = r0.f184934w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184934w = r1
            goto L18
        L13:
            kkf.s5 r0 = new kkf.s5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184934w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.util.List r6 = r5.f272963b
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L54
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L40
            goto L54
        L40:
            com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination r0 = new com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination
            com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination$StartType$OpenRelatedTransactionsBottomSheet r1 = new com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination$StartType$OpenRelatedTransactionsBottomSheet
            double r2 = r5.f272962a
            com.revolut.feature.rev_points.models.RevPoints r5 = qvb.a.a(r2)
            r1.<init>(r6, r5)
            r0.<init>(r1)
            r4.A2(r0)
            goto L5f
        L54:
            boolean r5 = r5.f272964c
            r0.f184934w = r3
            java.lang.Object r5 = r4.b3(r5, r0)
            if (r5 != r1) goto L5f
            return r1
        L5f:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.t5.c3(tof.o2, gim.c):java.lang.Object");
    }
}
