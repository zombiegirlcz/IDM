package com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown;

import cli.g;
import cli.y;
import n2f.d;
import oki.h;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements d {
    public final y o;

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(cli.n r17, com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData r18, m2f.a r19) {
        /*
            r16 = this;
            r0 = r18
            java.lang.String r1 = "stateMapper"
            r4 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            java.lang.String r1 = "inputData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "pointsCalculator"
            r2 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r16.<init>()
            boolean r1 = r0 instanceof com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData.RevPoints
            java.lang.String r2 = "rate"
            if (r1 == 0) goto L25
            r3 = r0
            com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData$RevPoints r3 = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData.RevPoints) r3
            double r5 = r3.f91174a
        L23:
            r12 = r5
            goto L37
        L25:
            boolean r3 = r0 instanceof com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData.PartnerPoints
            if (r3 == 0) goto Lbd
            r3 = r0
            com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData$PartnerPoints r3 = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData.PartnerPoints) r3
            double r5 = r3.f91172a
            com.revolut.feature.trade_rev_points.models.TradeRevPointsRate r3 = r3.f91173b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            double r7 = r3.f91190a
            double r5 = r5 * r7
            goto L23
        L37:
            if (r1 == 0) goto L47
            r3 = r0
            com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData$RevPoints r3 = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData.RevPoints) r3
            double r5 = r3.f91174a
            com.revolut.feature.trade_rev_points.models.TradeRevPointsRate r3 = r3.f91175b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            double r7 = r3.f91190a
            double r5 = r5 / r7
            goto L50
        L47:
            boolean r3 = r0 instanceof com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData.PartnerPoints
            if (r3 == 0) goto Lb5
            r3 = r0
            com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData$PartnerPoints r3 = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData.PartnerPoints) r3
            double r5 = r3.f91172a
        L50:
            r7 = 0
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = 1
            if (r1 == 0) goto L74
            double r14 = r5 % r9
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 != 0) goto L5f
            r14 = r11
            goto L60
        L5f:
            r14 = 0
        L60:
            if (r14 != 0) goto L72
            double r14 = java.lang.Math.floor(r5)
            r3 = r0
            com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData$RevPoints r3 = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData.RevPoints) r3
            com.revolut.feature.trade_rev_points.models.TradeRevPointsRate r3 = r3.f91175b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            double r2 = r3.f91190a
            double r14 = r14 * r2
            goto L79
        L72:
            r14 = r12
            goto L79
        L74:
            boolean r2 = r0 instanceof com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData.PartnerPoints
            if (r2 == 0) goto Lad
            goto L72
        L79:
            if (r1 == 0) goto L8c
            double r0 = r5 % r9
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L83
            r3 = r11
            goto L84
        L83:
            r3 = 0
        L84:
            if (r3 != 0) goto L8a
            double r5 = java.lang.Math.floor(r5)
        L8a:
            r10 = r5
            goto L91
        L8c:
            boolean r0 = r0 instanceof com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData.PartnerPoints
            if (r0 == 0) goto La5
            goto L8a
        L91:
            n2f.c r3 = new n2f.c
            r7 = r3
            r8 = r14
            r7.<init>(r8, r10, r12)
            r6 = 0
            r7 = 12
            r5 = 0
            r2 = r16
            cli.y r0 = mra.d.b(r2, r3, r4, r5, r6, r7)
            r2.o = r0
            return
        La5:
            r2 = r16
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        Lad:
            r2 = r16
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        Lb5:
            r2 = r16
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        Lbd:
            r2 = r16
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.a.<init>(cli.n, com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData, m2f.a):void");
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
