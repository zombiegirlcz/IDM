package bwk;

import a3e.u;
import bs9.i0;
import bw4.t;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.StockOrderBookControllerContract$InputData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import qe0.o;
import ybl.q;
import yji.l;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends oki.h implements f {

    @NotNull
    public static final i Companion = new i();
    public final StockOrderBookControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cwk.a f19379p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pgl.a f19380q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vrl.g f19381r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybl.d f19382s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ybl.b f19383t;
    public final ybl.k u;
    public final q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final udf.a f19384w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f19385x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f19386y;

    public m(StockOrderBookControllerContract$InputData inputData, cwk.a stockOrderBookDialogMapper, pgl.a orderBookInteractor, vrl.g investOrdersInteractor, ybl.d portfolioInteractor, ybl.b instrumentTickerInteractor, ybl.k tradingAccountsInteractor, q wealthInstrumentStateDetailsInteractor, udf.a createTradingOrderCommandProvider, u mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stockOrderBookDialogMapper, "stockOrderBookDialogMapper");
        Intrinsics.checkNotNullParameter(orderBookInteractor, "orderBookInteractor");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthInstrumentStateDetailsInteractor, "wealthInstrumentStateDetailsInteractor");
        Intrinsics.checkNotNullParameter(createTradingOrderCommandProvider, "createTradingOrderCommandProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = inputData;
        this.f19379p = stockOrderBookDialogMapper;
        this.f19380q = orderBookInteractor;
        this.f19381r = investOrdersInteractor;
        this.f19382s = portfolioInteractor;
        this.f19383t = instrumentTickerInteractor;
        this.u = tradingAccountsInteractor;
        this.v = wealthInstrumentStateDetailsInteractor;
        this.f19384w = createTradingOrderCommandProvider;
        this.f19385x = mra.d.b(this, new g(new Data(null, null, true, 3, null), f0.f322471a, inputData.f104035b), mapper, null, false, 12);
        this.f19386y = hx7.e.a(this, new bwd.a(this, 1));
    }

    public static final vkm.d I2(m mVar) {
        r rVarFlatMap = m70.a.g(((ael.k) mVar.f19383t).f(mVar.o.f104034a), null, new t(2), 1).flatMap(new i0(13, new bq7.j(mVar, 22)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rd0.e.b(m70.a.g(rVarFlatMap, null, new t(3), 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(bwk.m r4, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r5, bfl.g r6, float r7, nel.w0 r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof bwk.k
            if (r0 == 0) goto L13
            r0 = r9
            bwk.k r0 = (bwk.k) r0
            int r1 = r0.f19378x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19378x = r1
            goto L18
        L13:
            bwk.k r0 = new bwk.k
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f19378x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            bwk.m r4 = r0.u
            yhm.o.b(r9)
            goto L64
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r9)
            java.math.BigDecimal r9 = new java.math.BigDecimal
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r9.<init>(r7)
            nel.n r7 = r8.n()
            xi0.b r7 = r7.i
            int r7 = r7.c()
            java.math.RoundingMode r8 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r7 = r9.setScale(r7, r8)
            udf.a r8 = r4.f19384w
            com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.StockOrderBookControllerContract$InputData r9 = r4.o
            java.lang.String r9 = r9.f104034a
            csl.c r8 = (csl.c) r8
            ufm.i r5 = r8.b(r9, r6, r5, r7)
            r0.u = r4
            r0.f19378x = r3
            java.lang.Object r9 = nim.a.b(r5, r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r5)
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r9)
            r4.C1(r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bwk.m.J2(bwk.m, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount, bfl.g, float, nel.w0, gim.c):java.lang.Object");
    }

    public static final jhi.b K2(m mVar) {
        return mo3.a.h(ybl.k.h(mVar.u, TradingAccountType.Gia.f105270a, null, 6), new b0c.a(16), new t(7), 2);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f19386y;
    }

    @Override // yji.l
    public final void T1(long j2) {
        StockOrderBookControllerContract$InputData stockOrderBookControllerContract$InputData = this.o;
        String securityRef = stockOrderBookControllerContract$InputData.f104034a;
        b.Companion companion = kotlin.time.b.INSTANCE;
        long jG = kotlin.time.c.g(500, pkm.e.MILLISECONDS);
        pgl.a aVar = this.f19380q;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        mgl.f fVar = aVar.f235999a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        vkm.d dVarC = o.c(fVar.e, securityRef, jG, null, 20);
        Continuation continuation = null;
        l.b1(this, dVarC, null, new j(this, continuation, 1), 3);
        xi0.a aVar2 = xi0.b.Companion;
        String str = stockOrderBookControllerContract$InputData.f104034a;
        aVar2.getClass();
        l.b1(this, rd0.e.e(mo3.a.e(((vrl.m) this.f19381r).g(new InvestOrdersParams.OrdersByCurrency(xi0.a.a(str), null, null, 30), 3L), new t(5), new t(6)), h0.f322473a, new a35.k(3, 28, continuation)), null, new j(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f19385x;
    }
}
