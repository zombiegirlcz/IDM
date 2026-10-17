package cmh;

import kotlin.jvm.internal.Intrinsics;
import nhe.p;
import org.jetbrains.annotations.NotNull;
import yfe.h;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends yfe.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tzg.m f25254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final oih.j f25255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y2f.a f25256n;

    public i(tzg.m wealthAccountsInteractor, oih.j wealthStocksAccountCommandProvider, y2f.a tradingTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthStocksAccountCommandProvider, "wealthStocksAccountCommandProvider");
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        this.f25254l = wealthAccountsInteractor;
        this.f25255m = wealthStocksAccountCommandProvider;
        this.f25256n = tradingTransactionsInteractor;
    }

    @Override // yfe.c
    public final /* bridge */ /* synthetic */ Object Z2(h.a aVar, nhe.k kVar) {
        return f3(kVar);
    }

    @Override // yfe.c
    public final /* bridge */ /* synthetic */ Object b3(h.c cVar, p pVar) {
        return g3(pVar);
    }

    @Override // yfe.c
    public final /* bridge */ /* synthetic */ Object c3(h.a aVar, p pVar) {
        return h3(pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof cmh.b
            if (r0 == 0) goto L13
            r0 = r8
            cmh.b r0 = (cmh.b) r0
            int r1 = r0.f25248w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25248w = r1
            goto L18
        L13:
            cmh.b r0 = new cmh.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25248w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r8)
            goto L6a
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L30:
            yhm.o.b(r8)
            tzg.m r8 = r7.f25254l
            cfl.m r2 = cfl.m.f23746a
            akg.n r8 = tzg.m.c(r8, r4, r2, r3)
            cmc.c r2 = new cmc.c
            r5 = 7
            r2.<init>(r5)
            akg.n r8 = nim.a.v(r8, r2)
            clk.b r2 = new clk.b
            r5 = 6
            r2.<init>(r5)
            jhi.b r8 = mo3.a.g(r8, r4, r2, r3)
            java.lang.String r2 = "InvestTotalWealthCategoryNavigationHandler"
            java.lang.String r5 = "getSecuritiesWealthAccount"
            java.util.Set r2 = m72.b.w(r2, r5)
            cmh.c r5 = new cmh.c
            r6 = 3
            r5.<init>(r6, r4)
            vkm.y r8 = rd0.e.e(r8, r2, r5)
            r0.f25248w = r3
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            od0.i r8 = (od0.i) r8
            if (r8 == 0) goto L73
            java.lang.Object r8 = r8.f224257a
            com.revolut.feature.wealth.api.domain.model.WealthAccount$Securities r8 = (com.revolut.feature.wealth.api.domain.model.WealthAccount.Securities) r8
            return r8
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cmh.i.d3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof cmh.d
            if (r0 == 0) goto L13
            r0 = r9
            cmh.d r0 = (cmh.d) r0
            int r1 = r0.f25249w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25249w = r1
            goto L18
        L13:
            cmh.d r0 = new cmh.d
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25249w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L7d
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            yhm.o.b(r9)
            z2f.f r9 = new z2f.f
            com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter$a r2 = com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter.INSTANCE
            com.revolut.shared.feature.wealth.models.account.WealthAccountType r4 = com.revolut.shared.feature.wealth.models.account.WealthAccountType.SECURITIES
            r2.getClass()
            com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter$InvestTransactionsFilterImpl r2 = com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter.Companion.a(r4)
            r9.<init>(r2)
            w4l.h r2 = w4l.h.f294642c
            y2f.a r4 = r8.f25256n
            d4f.p r4 = (d4f.p) r4
            jhi.k r9 = r4.j(r9, r2)
            cmc.c r2 = new cmc.c
            r4 = 6
            r2.<init>(r4)
            akg.n r9 = nim.a.v(r9, r2)
            clk.b r2 = new clk.b
            r4 = 5
            r2.<init>(r4)
            r4 = 0
            jhi.b r9 = mo3.a.g(r9, r4, r2, r3)
            java.lang.String r2 = "InvestTotalWealthCategoryNavigationHandler"
            java.lang.String r5 = "hasTradedBefore"
            java.util.Set r2 = m72.b.w(r2, r5)
            c9k.k r5 = new c9k.k
            r6 = 3
            r7 = 3
            r5.<init>(r6, r7, r4)
            vkm.y r9 = rd0.e.e(r9, r2, r5)
            r0.f25249w = r3
            java.lang.Object r9 = vkm.q.z(r9, r0)
            if (r9 != r1) goto L7d
            return r1
        L7d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = pd.b.j(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cmh.i.e3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(gim.c r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof cmh.e
            if (r2 == 0) goto L17
            r2 = r1
            cmh.e r2 = (cmh.e) r2
            int r3 = r2.f25250w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f25250w = r3
            goto L1c
        L17:
            cmh.e r2 = new cmh.e
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f25250w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L3d
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            r2.f25250w = r5
            kotlin.Unit r1 = kotlin.Unit.f186387a
            if (r1 != r3) goto L3d
            return r3
        L3d:
            com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController r1 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController
            dii.a r2 = new dii.a
            lw0.a r3 = new lw0.a
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.wealth.ui.impl.R$string.invest_total_wealth_tile_info_title
            r10 = 0
            r11 = 14
            r4.<init>(r5, r10, r10, r11)
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.feature.wealth.ui.impl.R$string.invest_total_wealth_tile_info_text
            r5.<init>(r6, r10, r10, r11)
            r8 = 0
            r9 = 28
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            aw0.e r4 = new aw0.e
            aw0.m6 r12 = aw0.n6.Companion
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.retail.common.ui.R$string.common_action_got_it
            r13.<init>(r5, r10, r10, r11)
            com.revolut.core.ui_kit.views.LargeActionButton$ButtonStyle$DefaultFilledButton r14 = com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.f58725a
            r20 = 0
            r21 = 1020(0x3fc, float:1.43E-42)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            aw0.n6 r16 = aw0.m6.c(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r19 = 55
            r13 = 0
            r14 = 0
            r17 = 0
            r12 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            grl.k9 r5 = grl.k9.Wealth
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r6 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r6 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r5 = com.google.android.gms.internal.mlkit_vision_face.a.h(r5, r6, r5)
            r8 = 24
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.<init>(r2)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r2 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r3 = 2
            yji.n.P2(r0, r1, r2, r10, r3)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cmh.i.f3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (i3(r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof cmh.f
            if (r0 == 0) goto L13
            r0 = r6
            cmh.f r0 = (cmh.f) r0
            int r1 = r0.f25251w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25251w = r1
            goto L18
        L13:
            cmh.f r0 = new cmh.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25251w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L42
        L36:
            yhm.o.b(r6)
            r0.f25251w = r4
            java.lang.Object r6 = r5.d3(r0)
            if (r6 != r1) goto L42
            goto L4e
        L42:
            com.revolut.feature.wealth.api.domain.model.WealthAccount$Securities r6 = (com.revolut.feature.wealth.api.domain.model.WealthAccount.Securities) r6
            if (r6 == 0) goto L4f
            r0.f25251w = r3
            java.lang.Object r6 = r5.i3(r6, r0)
            if (r6 != r1) goto L5e
        L4e:
            return r1
        L4f:
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r6 = new com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r0 = ibb.c.f160141b
            java.lang.String r0 = r0.f83420a
            r1 = 0
            r2 = 14
            r6.<init>(r0, r1, r1, r2)
            r5.A2(r6)
        L5e:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cmh.i.g3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof cmh.g
            if (r0 == 0) goto L13
            r0 = r5
            cmh.g r0 = (cmh.g) r0
            int r1 = r0.f25252w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25252w = r1
            goto L1a
        L13:
            cmh.g r0 = new cmh.g
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25252w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            r0.f25252w = r3
            java.lang.Object r5 = r4.e3(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L55
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r5 = new com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r0 = ibb.c.f160141b
            java.lang.String r0 = r0.f83420a
            r1 = 0
            r2 = 14
            r5.<init>(r0, r1, r1, r2)
            r4.A2(r5)
            goto L5f
        L55:
            com.revolut.feature.wealth_discovery.api.declaration.collection.PopularFirstBuyDestination r5 = new com.revolut.feature.wealth_discovery.api.declaration.collection.PopularFirstBuyDestination
            wnh.c r0 = wnh.c.STOCKS
            r5.<init>(r0)
            r4.A2(r5)
        L5f:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cmh.i.h3(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i3(com.revolut.feature.wealth.api.domain.model.WealthAccount.Securities r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof cmh.h
            if (r0 == 0) goto L13
            r0 = r11
            cmh.h r0 = (cmh.h) r0
            int r1 = r0.f25253w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25253w = r1
            goto L18
        L13:
            cmh.h r0 = new cmh.h
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25253w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L67
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            yhm.o.b(r11)
            com.revolut.retail.core.navigation.FeatureCommand r11 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r2 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration
            s49.a r4 = s49.a.SINGLE_TOP
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration r5 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId r6 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r7 = ibb.c.f160141b
            java.lang.String r7 = r7.f83420a
            r8 = 0
            r6.<init>(r7, r8)
            r7 = 6
            r5.<init>(r6, r8, r8, r7)
            r2.<init>(r4, r5)
            r11.<init>(r2)
            oih.j r2 = r9.f25255m
            llh.i r2 = (llh.i) r2
            r2.getClass()
            java.lang.String r4 = "targetCommandIfOnboardingComplete"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r4)
            efm.d0 r10 = r2.d(r11, r10)
            r0.f25253w = r3
            java.lang.Object r11 = nim.a.b(r10, r0)
            if (r11 != r1) goto L67
            return r1
        L67:
            com.revolut.retail.core.navigation.NaviCommand r11 = (com.revolut.retail.core.navigation.NaviCommand) r11
            kotlin.jvm.internal.Intrinsics.h(r11)
            com.revolut.kompot.bridge.navigation.BridgeDestination r10 = zh9.u0.b(r11)
            r9.A2(r10)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cmh.i.i3(com.revolut.feature.wealth.api.domain.model.WealthAccount$Securities, gim.c):java.lang.Object");
    }
}
