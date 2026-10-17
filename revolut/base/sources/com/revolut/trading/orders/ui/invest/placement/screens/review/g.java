package com.revolut.trading.orders.ui.invest.placement.screens.review;

import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function1 {
    public FiatExchangeOrderQuoteParams u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f106975w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f106976x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, Object obj2, Continuation continuation) {
        super(1, continuation);
        this.f106975w = oVar;
        this.f106976x = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f106975w, this.f106976x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1 A[RETURN] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.revolut.trading.orders.ui.invest.placement.screens.review.o r0 = r9.f106975w
            bul.j r1 = r0.F
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.v
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams r1 = r9.u
            yhm.o.b(r10)
            goto L8d
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            yhm.o.b(r10)
            goto L41
        L24:
            yhm.o.b(r10)
            wtl.e r10 = r0.f106990w
            vkm.t1 r10 = r10.Z2()
            ht1.l r3 = new ht1.l
            r7 = 15
            r3.<init>(r7)
            jhi.b r10 = mo3.a.g(r10, r6, r3, r5)
            r9.v = r5
            java.lang.Object r10 = vkm.q.x(r10, r9)
            if (r10 != r2) goto L41
            goto L89
        L41:
            com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult r10 = (com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult) r10
            com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams r10 = r10.f106842a
            java.lang.Object r3 = r9.f106976x
            boolean r7 = r3 instanceof com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown
            if (r7 == 0) goto L57
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams r10 = r10.f91689a
            com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r3 = (com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown) r3
            r1.getClass()
            com.revolut.retail.core.navigation.FeatureCommand r10 = bul.j.a(r10, r3)
            goto La6
        L57:
            boolean r3 = r3 instanceof hul.i
            if (r3 == 0) goto L9b
            rcf.a r3 = r10.f91690b
            rcf.a r7 = rcf.a.TRADING_GIA_CBP
            if (r3 != r7) goto L9d
            cli.y r1 = r0.g0
            hu1.h0 r3 = new hu1.h0
            r7 = 20
            r3.<init>(r7)
            kotlinx.coroutines.flow.Flow r1 = r1.B(r3)
            vkm.t0 r3 = new vkm.t0
            r7 = 1
            r3.<init>(r1, r7)
            ht1.l r1 = new ht1.l
            r7 = 16
            r1.<init>(r7)
            jhi.b r1 = mo3.a.g(r3, r6, r1, r5)
            r9.u = r10
            r9.v = r4
            java.lang.Object r1 = vkm.q.x(r1, r9)
            if (r1 != r2) goto L8a
        L89:
            return r2
        L8a:
            r8 = r1
            r1 = r10
            r10 = r8
        L8d:
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r10 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r10
            com.revolut.kompot.navigable.vc.modal.a r2 = r0.f106983h0
            com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$ModalStep$TotalExchangeFeesDialog r3 = new com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$ModalStep$TotalExchangeFeesDialog
            r3.<init>(r1, r10)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r10 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r2, r3, r10)
        L9b:
            r10 = r6
            goto La6
        L9d:
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams r10 = r10.f91689a
            r1.getClass()
            com.revolut.retail.core.navigation.FeatureCommand r10 = bul.j.a(r10, r6)
        La6:
            if (r10 == 0) goto Lb1
            com.revolut.kompot.bridge.navigation.BridgeDestination r10 = zh9.u0.b(r10)
            aii.n r10 = r0.C1(r10)
            return r10
        Lb1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.review.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
