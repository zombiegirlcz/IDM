package s1j;

import kotlin.jvm.internal.Intrinsics;
import ybl.l;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f259145a;

    public b(l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f259145a = tradingConfigInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r14, gim.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof s1j.a
            if (r0 == 0) goto L13
            r0 = r15
            s1j.a r0 = (s1j.a) r0
            int r1 = r0.f259144y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f259144y = r1
            goto L18
        L13:
            s1j.a r0 = new s1j.a
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f259142w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f259144y
            ybl.l r3 = r13.f259145a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            hel.b r14 = r0.v
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r0 = r0.u
            yhm.o.b(r15)
            r11 = r14
            r12 = r0
            goto L7b
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r14 = r0.u
            yhm.o.b(r15)
            goto L5e
        L41:
            yhm.o.b(r15)
            akg.n r15 = ybl.l.d(r3)
            ryd.l r2 = new ryd.l
            r7 = 27
            r2.<init>(r7)
            jhi.b r15 = mo3.a.g(r15, r6, r2, r5)
            r0.u = r14
            r0.f259144y = r5
            java.lang.Object r15 = vkm.q.x(r15, r0)
            if (r15 != r1) goto L5e
            goto L77
        L5e:
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r15 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r15
            hel.b r15 = r15.f105106a
            if (r15 != 0) goto L65
            return r6
        L65:
            ael.t0 r3 = (ael.t0) r3
            ufm.i r2 = r3.f()
            r0.u = r14
            r0.v = r15
            r0.f259144y = r4
            java.lang.Object r0 = nim.a.b(r2, r0)
            if (r0 != r1) goto L78
        L77:
            return r1
        L78:
            r12 = r14
            r11 = r15
            r15 = r0
        L7b:
            com.revolut.shared.feature.wealth.models.config.Links r15 = (com.revolut.shared.feature.wealth.models.config.Links) r15
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.retail.feature.balance.picker.api.R$string.picker_investment_select_account_sheet_title
            r0 = 14
            r8.<init>(r14, r6, r6, r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.retail.feature.payments.core.R$string.payments_picker_breakdown_investment_title
            r9.<init>(r14, r6, r6, r0)
            com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment$TransferBalancePicker r10 = new com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment$TransferBalancePicker
            kotlin.jvm.internal.Intrinsics.h(r15)
            r10.<init>(r15, r11)
            qih.f r7 = new qih.f
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s1j.b.a(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount, gim.c):java.lang.Object");
    }
}
