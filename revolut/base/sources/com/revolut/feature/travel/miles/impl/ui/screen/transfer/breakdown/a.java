package com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown;

import cli.g;
import cli.y;
import java.math.BigDecimal;
import java.math.BigInteger;
import oki.h;
import qig.c;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements c {
    public final y o;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(cli.n r12, com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData r13, agg.a r14) {
        /*
            r11 = this;
            java.lang.String r1 = "stateMapper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "inputData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "milesCalculator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            r11.<init>()
            boolean r1 = r13 instanceof com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData.Points
            java.lang.String r2 = "rate"
            if (r1 == 0) goto L22
            r3 = r13
            com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData$Points r3 = (com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData.Points) r3
            com.revolut.feature.rev_points.models.RevPoints r3 = r3.f94398a
            double r5 = r3.J()
            goto L33
        L22:
            boolean r3 = r13 instanceof com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData.Miles
            if (r3 == 0) goto Lac
            r3 = r13
            com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData$Miles r3 = (com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData.Miles) r3
            double r5 = r3.f94395a
            com.revolut.feature.travel.miles.api.model.TravelMilesRate r3 = r3.f94396b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            double r7 = r3.f94112a
            double r5 = r5 * r7
        L33:
            if (r1 == 0) goto L47
            r3 = r13
            com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData$Points r3 = (com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData.Points) r3
            com.revolut.feature.rev_points.models.RevPoints r7 = r3.f94398a
            double r7 = r7.J()
            com.revolut.feature.travel.miles.api.model.TravelMilesRate r3 = r3.f94399b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            double r9 = r3.f94112a
            double r7 = r7 / r9
            goto L50
        L47:
            boolean r3 = r13 instanceof com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData.Miles
            if (r3 == 0) goto La6
            r3 = r13
            com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData$Miles r3 = (com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData.Miles) r3
            double r7 = r3.f94395a
        L50:
            if (r1 == 0) goto L6a
            boolean r3 = I2(r7)
            if (r3 == 0) goto L68
            double r9 = java.lang.Math.floor(r7)
            r3 = r13
            com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData$Points r3 = (com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData.Points) r3
            com.revolut.feature.travel.miles.api.model.TravelMilesRate r3 = r3.f94399b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            double r2 = r3.f94112a
            double r9 = r9 * r2
            goto L6f
        L68:
            r9 = r5
            goto L6f
        L6a:
            boolean r2 = r13 instanceof com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData.Miles
            if (r2 == 0) goto La0
            goto L68
        L6f:
            if (r1 == 0) goto L7c
            boolean r0 = I2(r7)
            if (r0 == 0) goto L80
            double r7 = java.lang.Math.floor(r7)
            goto L80
        L7c:
            boolean r0 = r13 instanceof com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData.Miles
            if (r0 == 0) goto L9a
        L80:
            qig.b r3 = new qig.b
            com.revolut.feature.rev_points.models.RevPoints r0 = qvb.a.a(r9)
            com.revolut.feature.rev_points.models.RevPoints r1 = qvb.a.a(r5)
            r3.<init>(r0, r7, r1)
            r6 = 0
            r7 = 12
            r5 = 0
            r2 = r11
            r4 = r12
            cli.y r0 = mra.d.b(r2, r3, r4, r5, r6, r7)
            r11.o = r0
            return
        L9a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        La0:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        La6:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        Lac:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.a.<init>(cli.n, com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData, agg.a):void");
    }

    public static boolean I2(double d) {
        BigDecimal bigDecimal = new BigDecimal(d);
        return (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).scale() > 0;
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
