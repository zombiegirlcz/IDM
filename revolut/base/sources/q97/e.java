package q97;

import com.revolut.feature.alipay.api.AlipayApi$Toggles$AlipayPlus;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f243674b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243675c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t97.c productCellProvider, sla.h termsAndConditionsNavigationFactory) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(termsAndConditionsNavigationFactory, "termsAndConditionsNavigationFactory");
        this.d = termsAndConditionsNavigationFactory;
        this.f243675c = t97.d.TERMS_AND_CONDITIONS;
    }

    @Override // r97.b
    public Flow d() {
        switch (this.f243674b) {
            case 0:
                return new go.g(Boolean.valueOf(((vfg.g) this.d).b()), 2);
            case 1:
                return new go.g(Boolean.valueOf(((jte.d) ((gte.a) this.d)).c(AlipayApi$Toggles$AlipayPlus.f61059c)), 2);
            case 2:
                return ((cw9.d) this.d).c();
            case 3:
                int i = 22;
                return mo3.a.e(nim.a.v(tzg.m.c(((t0) this.d).f243789a, null, null, 3), new h(i)), new ku1.f0(i), new q92.f(10));
            case 4:
                return mo3.a.e(nim.a.v(com.revolut.data.database.models.openbanking.d.x("StockTransferProductSearchDelegate", "availability", ((o9f.a) this.d).a(w4l.h.f294642c)), new l1(9)), new ku1.f0(22), new q92.f(28));
            case 5:
                return mo3.a.e(nim.a.v(tzg.m.c((tzg.m) this.d, null, null, 3), new l1(13)), new ku1.f0(22), new q2(7));
            case 6:
                return mo3.a.f(zi0.c.w(rd0.e.b(((wbf.n) ((kbf.a) this.d)).b(lbf.f.TRADING_PRO, false))), new ku1.f0(22), new pv7.t(19), new q2(8));
            default:
                return super.d();
        }
    }

    @Override // r97.b
    public final p97.b f() {
        switch (this.f243674b) {
        }
        return this.f243675c;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // r97.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            int r0 = r4.f243674b
            switch(r0) {
                case 0: goto L91;
                case 1: goto L89;
                case 2: goto L81;
                case 3: goto L74;
                case 4: goto L68;
                case 5: goto L5c;
                case 6: goto L50;
                default: goto L5;
            }
        L5:
            boolean r0 = r5 instanceof u97.k
            if (r0 == 0) goto L18
            r0 = r5
            u97.k r0 = (u97.k) r0
            int r1 = r0.f278413w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f278413w = r1
            goto L1f
        L18:
            u97.k r0 = new u97.k
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1f:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278413w
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r5)
            goto L48
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L36:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.d
            sla.h r5 = (sla.h) r5
            r0.f278413w = r3
            yok.k r5 = (yok.k) r5
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L48
            goto L4f
        L48:
            aii.u r5 = (aii.u) r5
            o97.d r1 = new o97.d
            r1.<init>(r5)
        L4f:
            return r1
        L50:
            o97.d r5 = new o97.d
            com.revolut.feature.trading_add_ons.navigation.TradingAddOnsDestination$AddOnsMainDestination r0 = new com.revolut.feature.trading_add_ons.navigation.TradingAddOnsDestination$AddOnsMainDestination
            r1 = 0
            r0.<init>(r1)
            r5.<init>(r0)
            return r5
        L5c:
            o97.d r5 = new o97.d
            com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination r0 = new com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination
            r1 = 0
            r0.<init>(r1)
            r5.<init>(r0)
            return r5
        L68:
            com.revolut.feature.trading.transfer.investments.api.navigation.NewTransferDestination r5 = new com.revolut.feature.trading.transfer.investments.api.navigation.NewTransferDestination
            r0 = 0
            r5.<init>(r0)
            o97.d r0 = new o97.d
            r0.<init>(r5)
            return r0
        L74:
            o97.d r5 = new o97.d
            com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignDestination r0 = new com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignDestination
            r1 = 0
            r2 = 2
            r0.<init>(r1, r2)
            r5.<init>(r0)
            return r5
        L81:
            o97.d r5 = new o97.d
            com.revolut.feature.payments.groups.api.navigation.CreateGroupDestination r0 = com.revolut.feature.payments.groups.api.navigation.CreateGroupDestination.f79291a
            r5.<init>(r0)
            return r5
        L89:
            o97.d r5 = new o97.d
            com.revolut.feature.alipay.api.navigation.AlipayDestination r0 = com.revolut.feature.alipay.api.navigation.AlipayDestination.f61060a
            r5.<init>(r0)
            return r5
        L91:
            o97.d r5 = new o97.d
            com.revolut.feature.travel.miles.api.navigation.TravelMilesDestination r0 = new com.revolut.feature.travel.miles.api.navigation.TravelMilesDestination
            r1 = 0
            r0.<init>(r1, r1)
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q97.e.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t97.c productCellProvider, t0 investProductAvailabilityProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(investProductAvailabilityProvider, "investProductAvailabilityProvider");
        this.d = investProductAvailabilityProvider;
        this.f243675c = t97.d.SCREENER;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t97.c productCellProvider, cw9.d paymentsProductFeatureChecker) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.d = paymentsProductFeatureChecker;
        this.f243675c = t97.d.GROUP_CONTACTS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t97.c productCellProvider, vfg.g availabilityInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(availabilityInteractor, "availabilityInteractor");
        this.d = availabilityInteractor;
        this.f243675c = t97.d.AIR_MILES;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t97.c productCellProvider, gte.a featureToggleInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.d = featureToggleInteractor;
        this.f243675c = t97.d.ALIPAY_PLUS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t97.c productCellProvider, tzg.m wealthAccountsInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.d = wealthAccountsInteractor;
        this.f243675c = t97.d.TRADE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t97.c productCellProvider, kbf.a tradingAddOnsInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(tradingAddOnsInteractor, "tradingAddOnsInteractor");
        this.d = tradingAddOnsInteractor;
        this.f243675c = t97.d.TRADING_PRO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t97.c productCellProvider, o9f.a accountsForTransferInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(accountsForTransferInteractor, "accountsForTransferInteractor");
        this.d = accountsForTransferInteractor;
        this.f243675c = t97.d.STOCK_TRANSFER;
    }
}
