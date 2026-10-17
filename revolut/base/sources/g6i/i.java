package g6i;

import aah.m;
import kotlin.jvm.internal.Intrinsics;
import n7i.o;
import n7i.z;
import org.jetbrains.annotations.NotNull;
import q06.l;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends n implements v5i.b {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f140955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z0h.a f140956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f140957n;
    public final q6i.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f140958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l61.a f140959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f140960r;

    public i(m wealthDisclaimersMapper, z0h.a wealthClauseDestinationProvider, o investDisclaimerProvider, q6i.n moveMoneyCryptoBuyDisclaimerProvider, z moveMoneyCreditCardDisclaimerProvider, l61.a userCompanyInteractor, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        Intrinsics.checkNotNullParameter(wealthClauseDestinationProvider, "wealthClauseDestinationProvider");
        Intrinsics.checkNotNullParameter(investDisclaimerProvider, "investDisclaimerProvider");
        Intrinsics.checkNotNullParameter(moveMoneyCryptoBuyDisclaimerProvider, "moveMoneyCryptoBuyDisclaimerProvider");
        Intrinsics.checkNotNullParameter(moveMoneyCreditCardDisclaimerProvider, "moveMoneyCreditCardDisclaimerProvider");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.f140955l = wealthDisclaimersMapper;
        this.f140956m = wealthClauseDestinationProvider;
        this.f140957n = investDisclaimerProvider;
        this.o = moveMoneyCryptoBuyDisclaimerProvider;
        this.f140958p = moveMoneyCreditCardDisclaimerProvider;
        this.f140959q = userCompanyInteractor;
        this.f140960r = deeplinkRouter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r26.c3(r3) == r4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0235, code lost:
    
        if (r26.b3(r27, r3) == r4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0237, code lost:
    
        return r4;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(g6i.i r26, ty0.a r27, gim.c r28) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6i.i.Z2(g6i.i, ty0.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(ty0.a r19, gim.c r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof g6i.g
            if (r2 == 0) goto L17
            r2 = r1
            g6i.g r2 = (g6i.g) r2
            int r3 = r2.f140953w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f140953w = r3
            goto L1c
        L17:
            g6i.g r2 = new g6i.g
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f140953w
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            yhm.o.b(r1)
            goto L52
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            yhm.o.b(r1)
            r1 = r19
            java.lang.Object r1 = r1.d
            boolean r4 = r1 instanceof z5i.b
            if (r4 == 0) goto L42
            z5i.b r1 = (z5i.b) r1
            goto L43
        L42:
            r1 = r6
        L43:
            if (r1 == 0) goto Lba
            j8l.a r1 = r1.f319630a
            r2.f140953w = r5
            n7i.o r4 = r0.f140957n
            java.lang.Object r1 = r4.a(r1, r2)
            if (r1 != r3) goto L52
            return r3
        L52:
            z0h.f1 r1 = (z0h.f1) r1
            aah.m r2 = r0.f140955l
            java.util.List r1 = zhm.u.c(r1)
            com.revolut.core.ui_kit.models.CompositeClause r9 = z0h.q1.a(r2, r1, r6)
            com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController r1 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController
            dii.a r2 = new dii.a
            lw0.a r7 = new lw0.a
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature_move_money.impl.R$string.move_money_invest_bottom_sheet_tandc_title
            r4 = 14
            r8.<init>(r3, r6, r6, r4)
            r12 = 0
            r13 = 28
            r10 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            aw0.e r8 = new aw0.e
            aw0.n6 r9 = new aw0.n6
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature_move_money.impl.R$string.move_money_invest_bottom_sheet_tandc_button
            r10.<init>(r3, r6, r6, r4)
            com.revolut.core.ui_kit.views.LargeActionButton$ButtonStyle$DefaultFilledButton r11 = com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.f58725a
            r16 = 0
            r17 = 1020(0x3fc, float:1.43E-42)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r14 = 0
            r15 = 55
            r12 = r9
            r9 = 0
            r10 = 0
            r11 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            grl.k9 r3 = grl.k9.Trading
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r4 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r4 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r13 = com.google.android.gms.internal.mlkit_vision_face.a.h(r3, r4, r3)
            r15 = 0
            r16 = 24
            r10 = r2
            r11 = r7
            r12 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r1.<init>(r10)
            g6i.d r2 = new g6i.d
            r2.<init>(r0, r5)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r3 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r0.N2(r1, r3, r2)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        Lba:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Investment disclaimer id clicked but parcel is not InvestTAndCFromSource"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g6i.i.b3(ty0.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof g6i.h
            if (r0 == 0) goto L13
            r0 = r9
            g6i.h r0 = (g6i.h) r0
            int r1 = r0.f140954w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140954w = r1
            goto L18
        L13:
            g6i.h r0 = new g6i.h
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140954w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L43
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            yhm.o.b(r9)
            l61.a r9 = r8.f140959q
            ang.b r9 = (ang.b) r9
            efm.d0 r9 = r9.a()
            r0.f140954w = r3
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L43
            return r1
        L43:
            l71.d r9 = (l71.d) r9
            java.util.Set r0 = q6i.b0.f242608a
            l71.a r1 = r9.b()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L5c
            boolean r9 = l71.f.f(r9)
            if (r9 == 0) goto L58
            goto L5c
        L58:
            java.lang.String r9 = "https://www.revolut.com/en-LT/legal/investment-services-terms/?geo-redirect=true"
        L5a:
            r1 = r9
            goto L5f
        L5c:
            java.lang.String r9 = "https://www.revolut.com/en-SG/legal/trading/"
            goto L5a
        L5f:
            com.revolut.feature_web_view.WebViewFeatureConfig r0 = new com.revolut.feature_web_view.WebViewFeatureConfig
            r6 = 0
            r7 = 130958(0x1ff8e, float:1.83511E-40)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r9 = zh9.u0.c(r0)
            r8.A2(r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g6i.i.c3(gim.c):java.lang.Object");
    }

    public final void d3(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        T2(new g1k.i(this, clickData, null, 11), new yi5.b(27));
    }
}
