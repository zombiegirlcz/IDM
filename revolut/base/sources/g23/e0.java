package g23;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f139784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f139785c;

    public e0(FlowCollector flowCollector, b4g.c cVar, i4g.h hVar) {
        this.f139783a = 28;
        this.f139784b = flowCollector;
        this.f139785c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof hmf.j0
            if (r0 == 0) goto L13
            r0 = r6
            hmf.j0 r0 = (hmf.j0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            hmf.j0 r0 = new hmf.j0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r4.f139785c
            hmc.a r6 = (hmc.a) r6
            java.lang.Object r5 = r6.invoke(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f139784b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.e0.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r32, kotlin.coroutines.Continuation r33) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.e0.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof hxa.b
            if (r0 == 0) goto L13
            r0 = r11
            hxa.b r0 = (hxa.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            hxa.b r0 = new hxa.b
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r11)
            goto L9c
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L30:
            yhm.o.b(r11)
            com.revolut.data.model.Data r10 = (com.revolut.data.model.Data) r10
            java.lang.Object r10 = r10.getContent()
            com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4 r10 = (com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4) r10
            r11 = 0
            if (r10 != 0) goto L3f
            goto L8d
        L3f:
            com.revolut.feature.referrals.common.data.api.domain.model.common.RewardInfo r2 = r10.u
            r4 = 0
            if (r2 == 0) goto L53
            com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralReward r6 = r2.f81775c
            if (r6 == 0) goto L53
            dj0.d r6 = r6.f81769a
            long r6 = r6.f115082a
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L53
            r6 = r3
            goto L54
        L53:
            r6 = r11
        L54:
            if (r2 == 0) goto L64
            com.revolut.feature.referrals.common.data.api.domain.model.common.MaxVariableReward r2 = r2.e
            if (r2 == 0) goto L64
            dj0.d r2 = r2.f81745a
            long r7 = r2.f115082a
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 <= 0) goto L64
            r2 = r3
            goto L65
        L64:
            r2 = r11
        L65:
            java.lang.Object r4 = r9.f139785c
            hxa.c r4 = (hxa.c) r4
            l80.e r4 = r4.f156420c
            l80.f r4 = (l80.f) r4
            java.time.Instant r4 = r4.b()
            java.lang.Object r5 = pwa.l.f240369a
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r5)
            java.lang.String r5 = "now"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.time.Instant r10 = r10.f81759m
            if (r10 == 0) goto L88
            boolean r10 = r10.isBefore(r4)
            if (r10 == 0) goto L88
            goto L8d
        L88:
            if (r6 != 0) goto L8c
            if (r2 == 0) goto L8d
        L8c:
            r11 = r3
        L8d:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r11)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r11 = r9.f139784b
            java.lang.Object r10 = r11.emit(r10, r0)
            if (r10 != r1) goto L9c
            return r1
        L9c:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.e0.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        if (r6.emit(r11, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof hzb.e
            if (r0 == 0) goto L13
            r0 = r12
            hzb.e r0 = (hzb.e) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            hzb.e r0 = new hzb.e
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r12)
            goto La7
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            int r11 = r0.f157097y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f157096x
            yhm.o.b(r12)
            goto L95
        L3c:
            yhm.o.b(r12)
            com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState r11 = (com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState) r11
            boolean r12 = r11 instanceof com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState.Active
            r2 = 0
            kotlinx.coroutines.flow.FlowCollector r6 = r10.f139784b
            if (r12 == 0) goto L7c
            com.revolut.feature.tab.accounts.models.ProductAccountId r12 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState$Active r11 = (com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState.Active) r11
            com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo r11 = r11.f97790b
            java.lang.String r11 = r11.f97784a
            com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType$RevPoints r3 = com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType.RevPoints.INSTANCE
            r12.<init>(r11, r3)
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r11 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main
            com.revolut.feature.tab.accounts.models.ProductId r3 = com.revolut.feature.tab.accounts.models.ProductId.SUBACCOUNT
            r11.<init>(r12, r3)
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r12 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration
            s49.a r3 = s49.a.SINGLE_TOP
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration r7 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId r8 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r9 = ibb.c.f160140a
            java.lang.String r9 = r9.f83420a
            r8.<init>(r9, r5)
            com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig r9 = new com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig
            r9.<init>(r11, r5)
            r11 = 4
            r7.<init>(r8, r9, r5, r11)
            r12.<init>(r3, r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r11 = zh9.u0.c(r12)
            goto L9a
        L7c:
            boolean r11 = r11 instanceof com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState.Inactive
            if (r11 == 0) goto Laa
            java.lang.Object r11 = r10.f139785c
            hzb.i r11 = (hzb.i) r11
            edi.a r11 = r11.o
            r0.f157096x = r6
            r0.f157097y = r2
            r0.v = r3
            java.lang.Object r12 = edi.a.a(r11, r0)
            if (r12 != r1) goto L93
            goto La6
        L93:
            r11 = r2
            r2 = r6
        L95:
            aii.u r12 = (aii.u) r12
            r6 = r2
            r2 = r11
            r11 = r12
        L9a:
            r0.f157096x = r5
            r0.f157097y = r2
            r0.v = r4
            java.lang.Object r11 = r6.emit(r11, r0)
            if (r11 != r1) goto La7
        La6:
            return r1
        La7:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        Laa:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.e0.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof i09.o
            if (r0 == 0) goto L13
            r0 = r6
            i09.o r0 = (i09.o) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            i09.o r0 = new i09.o
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L59
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r6 = r5
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r6 = r6.getContent()
            if (r6 != 0) goto L4e
            java.lang.Object r6 = r4.f139785c
            com.revolut.feature.learn.shared.impl.ui.course.overview.e r6 = (com.revolut.feature.learn.shared.impl.ui.course.overview.e) r6
            jki.i r6 = r6.t2()
            i09.g r6 = (i09.g) r6
            com.revolut.data.model.Data r6 = r6.f157324b
            java.lang.Object r6 = r6.getContent()
            if (r6 == 0) goto L4e
            goto L59
        L4e:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f139784b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L59
            return r1
        L59:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.e0.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof i0e.o
            if (r0 == 0) goto L13
            r0 = r9
            i0e.o r0 = (i0e.o) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            i0e.o r0 = new i0e.o
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L68
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r9 = r7.f139785c
            i0e.c r9 = (i0e.c) r9
            i0e.r r9 = (i0e.r) r9
            r9.getClass()
            java.lang.String r2 = "stateData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            hw9.a r2 = new hw9.a
            r4 = 22
            r2.<init>(r9, r4)
            hw9.b r4 = new hw9.b
            r5 = 15
            r4.<init>(r9, r5)
            hnc.a r5 = new hnc.a
            r6 = 10
            r5.<init>(r9, r6)
            java.lang.Object r8 = iii.c.f(r8, r2, r4, r5)
            i0e.w r8 = (i0e.w) r8
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r9 = r7.f139784b
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L68
            return r1
        L68:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.e0.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof i4g.e
            if (r0 == 0) goto L13
            r0 = r12
            i4g.e r0 = (i4g.e) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            i4g.e r0 = new i4g.e
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r12)
            goto La0
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            yhm.o.b(r12)
            com.revolut.data.model.Data r11 = (com.revolut.data.model.Data) r11
            java.lang.Object r12 = r11.getContent()
            com.revolut.feature.travel.flights.models.domain.search.FlightSearchResult r12 = (com.revolut.feature.travel.flights.models.domain.search.FlightSearchResult) r12
            r2 = 0
            if (r12 == 0) goto L41
            java.util.ArrayList r12 = r12.f93588c
            goto L42
        L41:
            r12 = r2
        L42:
            if (r12 != 0) goto L46
            zhm.f0 r12 = zhm.f0.f322471a
        L46:
            r5 = r12
            boolean r7 = r11.getLoading()
            java.lang.Throwable r9 = r11.getError()
            java.lang.Object r11 = r11.getContent()
            com.revolut.feature.travel.flights.models.domain.search.FlightSearchResult r11 = (com.revolut.feature.travel.flights.models.domain.search.FlightSearchResult) r11
            if (r11 == 0) goto L8a
            r7g.a r12 = new r7g.a
            java.lang.String r2 = r11.f93586a
            java.lang.String r11 = r11.d
            r12.<init>(r2, r11)
            java.lang.String r4 = "continuation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r4)
            rlm.t r12 = new rlm.t
            r12.<init>()
            java.lang.String r4 = "searchToken"
            kotlinx.serialization.json.b r11 = rlm.j.c(r11)
            r12.b(r11, r4)
            if (r2 == 0) goto L7b
            kotlinx.serialization.json.b r11 = rlm.j.c(r2)
            if (r11 != 0) goto L7d
        L7b:
            kotlinx.serialization.json.JsonNull r11 = kotlinx.serialization.json.JsonNull.INSTANCE
        L7d:
            java.lang.String r2 = "nextCursor"
            r12.b(r11, r2)
            kotlinx.serialization.json.JsonObject r11 = r12.a()
            java.lang.String r2 = r11.toString()
        L8a:
            r8 = r2
            lk0.e r4 = new lk0.e
            java.lang.Object r11 = r10.f139785c
            r6 = r11
            b4g.c r6 = (b4g.c) r6
            r4.<init>(r5, r6, r7, r8, r9)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r11 = r10.f139784b
            java.lang.Object r11 = r11.emit(r4, r0)
            if (r11 != r1) goto La0
            return r1
        La0:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.e0.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ca A[Catch: Exception -> 0x01d0, TRY_LEAVE, TryCatch #0 {Exception -> 0x01d0, blocks: (B:125:0x01c6, B:127:0x01ca), top: B:623:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01dd A[PHI: r2 r8 r9
      0x01dd: PHI (r2v65 int) = (r2v64 int), (r2v67 int) binds: [B:133:0x01d4, B:126:0x01c8] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r8v5 kotlinx.coroutines.flow.FlowCollector) = (r8v14 kotlinx.coroutines.flow.FlowCollector), (r8v15 kotlinx.coroutines.flow.FlowCollector) binds: [B:133:0x01d4, B:126:0x01c8] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r9v19 io3.d) = (r9v18 io3.d), (r9v21 io3.d) binds: [B:133:0x01d4, B:126:0x01c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02fa A[Catch: all -> 0x02f5, TryCatch #1 {all -> 0x02f5, blocks: (B:195:0x02dc, B:197:0x02e2, B:199:0x02ea, B:201:0x02f0, B:206:0x02f7, B:212:0x030b, B:207:0x02fa, B:209:0x0300, B:210:0x0303), top: B:625:0x02dc }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:655:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:659:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:675:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 2564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.e0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ e0(FlowCollector flowCollector, Object obj2, int i) {
        this.f139783a = i;
        this.f139784b = flowCollector;
        this.f139785c = obj2;
    }
}
