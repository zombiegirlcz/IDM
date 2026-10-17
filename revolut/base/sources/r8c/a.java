package r8c;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData a(u6c.l r10, java.lang.String r11, long r12) {
        /*
            java.lang.String r0 = "moveMoneyTarget"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData r0 = new com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData
            r1 = 0
            if (r11 == 0) goto L15
            u6c.l r2 = u6c.l.PERSONAL_FIAT
            if (r10 != r2) goto L15
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$FiatCurrencyAccount r10 = new com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$FiatCurrencyAccount
            r10.<init>(r11)
        L13:
            r3 = r10
            goto L22
        L15:
            if (r11 == 0) goto L21
            u6c.l r2 = u6c.l.JOINT
            if (r10 != r2) goto L21
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$JointAccount r10 = new com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$JointAccount
            r10.<init>(r11)
            goto L13
        L21:
            r3 = r1
        L22:
            if (r3 == 0) goto L32
            com.revolut.shared.feature.move_money.api.navigation.Action$MoveWithFixedAccount r2 = new com.revolut.shared.feature.move_money.api.navigation.Action$MoveWithFixedAccount
            com.revolut.shared.feature.move_money.api.navigation.b r4 = com.revolut.shared.feature.move_money.api.navigation.b.TARGET
            k8l.a r5 = k8l.a.MOVE
            r8 = 0
            r9 = 240(0xf0, float:3.36E-43)
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r8, r9)
            goto L3a
        L32:
            com.revolut.shared.feature.move_money.api.navigation.Action$MoveMoney r2 = new com.revolut.shared.feature.move_money.api.navigation.Action$MoveMoney
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$FiatAccountsAll r10 = com.revolut.shared.feature.move_money.api.navigation.StartUpPocket.FiatAccountsAll.f104847a
            r11 = 6
            r2.<init>(r10, r1, r11)
        L3a:
            r10 = 4
            r0.<init>(r2, r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r8c.a.a(u6c.l, java.lang.String, long):com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData");
    }
}
