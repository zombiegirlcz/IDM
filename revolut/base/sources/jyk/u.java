package jyk;

import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements oxk.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f179504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.k f179505b;

    public u(sri.m navigator, ybl.k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f179504a = navigator;
        this.f179505b = tradingAccountsInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "extended-hours-onboarding");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof jyk.t
            if (r6 == 0) goto L13
            r6 = r7
            jyk.t r6 = (jyk.t) r6
            int r0 = r6.f179503w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f179503w = r0
            goto L1a
        L13:
            jyk.t r6 = new jyk.t
            gim.c r7 = (gim.c) r7
            r6.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f179503w
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            yhm.o.b(r7)
            goto L4c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$Gia r7 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Gia.f105270a
            r1 = 6
            ybl.k r4 = r5.f179505b
            akg.n r7 = ybl.k.h(r4, r7, r3, r1)
            r1 = 3
            jhi.b r7 = mo3.a.g(r7, r3, r3, r1)
            r6.f179503w = r2
            java.lang.Object r7 = vkm.q.z(r7, r6)
            if (r7 != r0) goto L4c
            return r0
        L4c:
            od0.i r7 = (od0.i) r7
            if (r7 == 0) goto L9a
            java.lang.Object r6 = r7.f224257a
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r6 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r6
            if (r6 == 0) goto L9a
            java.util.List r6 = r6.J()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L60:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L74
            java.lang.Object r7 = r6.next()
            r0 = r7
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r0 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Portfolio) r0
            com.revolut.shared.feature.wealth.models.trading_accounts.a r0 = r0.f105211b
            com.revolut.shared.feature.wealth.models.trading_accounts.a r1 = com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE
            if (r0 != r1) goto L60
            goto L75
        L74:
            r7 = r3
        L75:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r7 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Portfolio) r7
            if (r7 != 0) goto L7a
            goto L9a
        L7a:
            q06.h r6 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingExtendedHoursOnboardingFeatureConfig r2 = new com.revolut.retail.feature.trading_onboarding.api.navigation.TradingExtendedHoursOnboardingFeatureConfig
            java.util.UUID r7 = r7.f105210a
            java.lang.String r7 = r7.toString()
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)
            r2.<init>(r3, r7)
            r1.<init>(r2)
            r0.<init>(r1)
            r6.<init>(r0, r3)
            return r6
        L9a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jyk.u.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return te0.w.o0(p0.f264003c, new s(this, null));
    }
}
