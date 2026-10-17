package n7i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.l f213133a;

    public o(ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f213133a = tradingConfigInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(j8l.a r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof n7i.n
            if (r0 == 0) goto L13
            r0 = r6
            n7i.n r0 = (n7i.n) r0
            int r1 = r0.f213132x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213132x = r1
            goto L18
        L13:
            n7i.n r0 = new n7i.n
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213132x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            j8l.a r5 = r0.u
            yhm.o.b(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ybl.l r6 = r4.f213133a
            akg.n r6 = ybl.l.d(r6)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r6 = rd0.e.n(r6, r2)
            zfd.e r6 = zi0.c.w(r6)
            r0.u = r5
            r0.f213132x = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r6 = r6.getContent()
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r6 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r6
            if (r6 == 0) goto L86
            hel.b r6 = r6.f105106a
            if (r6 == 0) goto L86
            int[] r0 = n7i.m.f213130a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L80;
                case 2: goto L80;
                case 3: goto L80;
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L74;
                case 7: goto L74;
                case 8: goto L74;
                case 9: goto L6e;
                case 10: goto L6e;
                case 11: goto L6e;
                case 12: goto L6e;
                case 13: goto L6e;
                case 14: goto L6e;
                case 15: goto L6e;
                case 16: goto L6e;
                case 17: goto L6e;
                case 18: goto L6e;
                case 19: goto L6e;
                case 20: goto L6e;
                case 21: goto L6e;
                case 22: goto L6e;
                default: goto L68;
            }
        L68:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L6e:
            com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTC r5 = new com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTC
            r5.<init>(r6)
            return r5
        L74:
            com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTCJunior r5 = new com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTCJunior
            r5.<init>(r6)
            return r5
        L7a:
            com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTCPro r5 = new com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTCPro
            r5.<init>(r6)
            return r5
        L80:
            com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTCJoint r5 = new com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTCJoint
            r5.<init>(r6)
            return r5
        L86:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Can't find trading context for move money disclaimer click."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n7i.o.a(j8l.a, gim.c):java.lang.Object");
    }
}
