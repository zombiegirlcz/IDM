package ale;

import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends hih.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oih.j f6253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ybl.k f6254m;

    public h(oih.j wealthStocksAccountCommandProvider, ybl.k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(wealthStocksAccountCommandProvider, "wealthStocksAccountCommandProvider");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f6253l = wealthStocksAccountCommandProvider;
        this.f6254m = tradingAccountsInteractor;
    }

    @Override // hih.d
    public final boolean Z2(WealthAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action instanceof WealthAction.StartOnboarding;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // hih.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.wealth.ui.api.actions.WealthAction r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ale.g
            if (r0 == 0) goto L13
            r0 = r9
            ale.g r0 = (ale.g) r0
            int r1 = r0.f6252x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6252x = r1
            goto L1a
        L13:
            ale.g r0 = new ale.g
            gim.c r9 = (gim.c) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f6252x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            ale.h r8 = r0.u
            yhm.o.b(r9)
            goto L75
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            yhm.o.b(r9)
            goto L5b
        L3c:
            yhm.o.b(r9)
            boolean r8 = r8 instanceof com.revolut.feature.wealth.ui.api.actions.WealthAction.StartOnboarding
            if (r8 != 0) goto L46
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L46:
            ybl.k r8 = r7.f6254m
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$Gia r9 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Gia.f105270a
            akg.n r8 = ybl.k.b(r8, r9, r4)
            jhi.b r8 = mo3.a.g(r8, r6, r6, r3)
            r0.f6252x = r5
            java.lang.Object r9 = vkm.q.x(r8, r0)
            if (r9 != r1) goto L5b
            goto L73
        L5b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 == 0) goto L84
            oih.j r8 = r7.f6253l
            ufm.i r8 = oih.j.a(r8, r6, r6, r3)
            r0.u = r7
            r0.f6252x = r4
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto L74
        L73:
            return r1
        L74:
            r8 = r7
        L75:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            com.revolut.kompot.bridge.navigation.BridgeDestination r9 = zh9.u0.b(r9)
            r8.A2(r9)
            goto L8c
        L84:
            com.revolut.feature.wealth.ui.api.navigation.account.WealthAccountsGetStartedOnboardingDestination r8 = new com.revolut.feature.wealth.ui.api.navigation.account.WealthAccountsGetStartedOnboardingDestination
            r8.<init>(r6)
            r7.A2(r8)
        L8c:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ale.h.b3(com.revolut.feature.wealth.ui.api.actions.WealthAction, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
