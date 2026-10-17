package ht0;

/* JADX INFO: loaded from: classes19.dex */
public final class r {
    private r() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.models.CompositeClause a(xi0.b r16, float r17, float r18, xi0.b r19, com.revolut.core.ui_kit.models.Clause r20) {
        /*
            float r0 = r17 - r18
            float r0 = r0 / r18
            double r0 = (double) r0
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            boolean r2 = cp5.d.z(r19)
            r3 = 0
            if (r2 == 0) goto L41
            java.math.BigDecimal r2 = new java.math.BigDecimal
            java.lang.String r4 = java.lang.String.valueOf(r17)
            r2.<init>(r4)
            java.math.RoundingMode r4 = java.math.RoundingMode.DOWN
            r5 = 8
            java.math.BigDecimal r2 = r2.setScale(r5, r4)
            int r4 = r2.signum()
            if (r4 != 0) goto L2e
            java.math.BigDecimal r2 = new java.math.BigDecimal
            java.math.BigInteger r4 = java.math.BigInteger.ZERO
            r2.<init>(r4, r3)
            goto L32
        L2e:
            java.math.BigDecimal r2 = r2.stripTrailingZeros()
        L32:
            java.math.BigDecimal r4 = java.math.BigDecimal.ZERO
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r4)
            if (r2 == 0) goto L41
            r6 = 1
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r6, r5)
            goto L4a
        L41:
            java.math.BigDecimal r2 = new java.math.BigDecimal
            java.lang.String r4 = java.lang.String.valueOf(r17)
            r2.<init>(r4)
        L4a:
            com.revolut.core.ui_kit.models.CompositeClause r4 = new com.revolut.core.ui_kit.models.CompositeClause
            com.revolut.core.ui_kit.models.RateClause r5 = new com.revolut.core.ui_kit.models.RateClause
            kotlin.jvm.internal.Intrinsics.h(r2)
            com.revolut.core.ui_kit.models.RateClause$Format$Default r6 = new com.revolut.core.ui_kit.models.RateClause$Format$Default
            r7 = 1
            r8 = r19
            r6.<init>(r8, r7)
            r8 = 0
            r9 = r16
            r5.<init>(r2, r9, r6, r8)
            com.revolut.core.ui_kit.models.PercentageClause r2 = new com.revolut.core.ui_kit.models.PercentageClause
            com.revolut.core.ui_kit.models.PercentageClause$Format$Custom r8 = new com.revolut.core.ui_kit.models.PercentageClause$Format$Custom
            java.math.RoundingMode r13 = java.math.RoundingMode.HALF_UP
            aw0.p9 r11 = aw0.p9.ALWAYS
            r12 = 0
            r10 = 8
            r9 = 2
            r8.<init>(r9, r10, r11, r12, r13)
            com.revolut.core.ui_kit.models.Custom r9 = new com.revolut.core.ui_kit.models.Custom
            int r6 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorWhite_60
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r14 = 0
            r15 = 254(0xfe, float:3.56E-43)
            r11 = 0
            r13 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r2.<init>(r0, r8, r9)
            r0 = 3
            com.revolut.core.ui_kit.models.Clause[] r0 = new com.revolut.core.ui_kit.models.Clause[r0]
            r0[r3] = r20
            r0[r7] = r5
            r1 = 2
            r0[r1] = r2
            java.lang.String r1 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.util.List r5 = kotlin.collections.d.L(r0)
            com.revolut.core.ui_kit.models.TextClause r6 = new com.revolut.core.ui_kit.models.TextClause
            r13 = 126(0x7e, float:1.77E-43)
            java.lang.String r7 = " "
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r9 = 12
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ht0.r.a(xi0.b, float, float, xi0.b, com.revolut.core.ui_kit.models.Clause):com.revolut.core.ui_kit.models.CompositeClause");
    }
}
