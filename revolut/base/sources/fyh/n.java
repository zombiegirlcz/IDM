package fyh;

import a3e.u;
import b9.w2;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.exchange.models.ExchangeOrderInfo;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.feature_exchange.api.ExchangeApi$Toggles$TransparentPricing;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import cul.n0;
import d9.e1;
import efm.d0;
import efm.r;
import et6.u1;
import ewh.x;
import java.math.BigDecimal;
import java.math.MathContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import r10.q;
import r10.w;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends oki.h implements g {
    public final CryptoOrderDetailsInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w2 f139012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f139013q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f139014r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f139015s;

    public n(CryptoOrderDetailsInputData inputData, u stateMapper, w2 recurringBuysDomainStateProvider, w tpslDomainStateProvider, q stopLimitDomainStateProvider) {
        f cVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(recurringBuysDomainStateProvider, "recurringBuysDomainStateProvider");
        Intrinsics.checkNotNullParameter(tpslDomainStateProvider, "tpslDomainStateProvider");
        Intrinsics.checkNotNullParameter(stopLimitDomainStateProvider, "stopLimitDomainStateProvider");
        this.o = inputData;
        this.f139012p = recurringBuysDomainStateProvider;
        this.f139013q = tpslDomainStateProvider;
        this.f139014r = stopLimitDomainStateProvider;
        if (inputData instanceof CryptoOrderDetailsInputData.RecurringInputData) {
            CryptoOrderDetailsInputData.RecurringInputData recurringInputData = (CryptoOrderDetailsInputData.RecurringInputData) inputData;
            cVar = new b(recurringInputData.f96658a, recurringInputData.f96659b, recurringInputData.f96660c, recurringInputData.d, recurringInputData.e, recurringInputData.f, null);
        } else if (inputData instanceof CryptoOrderDetailsInputData.TpslInputData) {
            ExchangeOrder exchangeOrder = ((CryptoOrderDetailsInputData.TpslInputData) inputData).f96662a;
            myh.j jVar = (exchangeOrder.getF72135b() == null && exchangeOrder.getF72134a().f72139c == wd6.h.STOP_LOSS) ? myh.j.STOP_LOSS : myh.j.TAKE_PROFIT;
            ExchangeOrderInfo f72134a = ((CryptoOrderDetailsInputData.TpslInputData) inputData).f96662a.getF72134a();
            dj0.d dVar = f72134a.f72140g;
            dj0.d dVarL = f72134a.f72140g;
            xi0.b bVar = f72134a.e;
            if (!Intrinsics.f(dVar.f115083b, bVar)) {
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(f72134a.f72141h));
                if (e1.I(bigDecimal)) {
                    r6.b.D("The target rate should not be zero");
                    dj0.d.Companion.getClass();
                    dVarL = dj0.d.c(dj0.d.e, 0L, bVar, 1);
                } else {
                    BigDecimal bigDecimalDivide = BigDecimal.ONE.divide(bigDecimal, MathContext.DECIMAL128);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                    dVarL = pyd.c.L(dVarL, bigDecimalDivide, bVar);
                }
            }
            cVar = new d(jVar, dVarL, new eyh.a(0));
        } else {
            if (!(inputData instanceof CryptoOrderDetailsInputData.StopLimitInputData)) {
                throw new NoWhenBranchMatchedException();
            }
            ExchangeOrder exchangeOrder2 = ((CryptoOrderDetailsInputData.StopLimitInputData) inputData).f96661a;
            Intrinsics.checkNotNullParameter(exchangeOrder2, "exchangeOrder");
            cVar = new c(new dyh.a(((r39.a) stopLimitDomainStateProvider.f250849b).i(exchangeOrder2.getF72134a(), null), new Data(null, null, true, 3, null)));
        }
        this.f139015s = mra.d.b(this, new a(cVar), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        OrderQuoteParams orderQuoteParams;
        Flow flowU;
        ExchangeOrderInfo f72134a;
        ExchangeOrderInfo f72134a2;
        CryptoOrderDetailsInputData cryptoOrderDetailsInputData = this.o;
        if (cryptoOrderDetailsInputData instanceof CryptoOrderDetailsInputData.RecurringInputData) {
            CryptoOrderDetailsInputData.RecurringInputData recurringInputData = (CryptoOrderDetailsInputData.RecurringInputData) cryptoOrderDetailsInputData;
            String recurringPaymentId = recurringInputData.f96658a;
            String destinationPocketId = recurringInputData.e;
            w2 w2Var = this.f139012p;
            w2Var.getClass();
            whf.b bVar = (whf.b) w2Var.e;
            Intrinsics.checkNotNullParameter(recurringPaymentId, "recurringPaymentId");
            Intrinsics.checkNotNullParameter(destinationPocketId, "destinationPocketId");
            vkm.d dVarB = rd0.e.b(((yua.q) ((xua.a) w2Var.f13499b)).o(recurringPaymentId));
            akg.n nVarV = nim.a.v(((ang.f) w2Var.f13500c).j(w4l.h.f294642c), new cw7.j(19));
            nva.a aVar = (nva.a) w2Var.f13501g;
            vkm.d dVarB2 = rd0.e.b(nim.a.w(kli.a.h(whf.b.a(bVar, te0.w.h(aVar.b(recurringPaymentId, destinationPocketId)), null, null, null, 14), whf.b.a(bVar, te0.w.h(aVar.a(recurringPaymentId, destinationPocketId)), null, null, null, 14)), new n0(w2Var, 22)));
            w0i.b bVar2 = (w0i.b) w2Var.d;
            ufm.b bVarM = d0.m(Boolean.valueOf(((jte.d) bVar2.f293763a).c(ExchangeApi$Toggles$TransparentPricing.f96821c)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            r rVarX = bVarM.x();
            Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
            vkm.d dVarB3 = rd0.e.b(rVarX);
            d0 d0VarE = bVar2.f293764b.e();
            vz4.c cVar = new vz4.c(new vsl.f(1, bVar2, w0i.b.class, "hasCryptoFeeFreeLimitProduct", "hasCryptoFeeFreeLimitProduct(Lcom/revolut/feature/pricingplans/models/PricingPlan;)Z", 0, 8), 6);
            d0VarE.getClass();
            ufm.i iVar = new ufm.i(d0VarE, cVar, 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            r rVarX2 = iVar.x();
            Intrinsics.checkNotNullExpressionValue(rVarX2, "toObservable(...)");
            yji.l.a1(this, new cyh.f(yh5.b.h(dVarB, nVarV, dVarB2, dVarB3, rd0.e.b(rVarX2)), 0), null, null, new m(this, null, 0), 3);
            return;
        }
        if (cryptoOrderDetailsInputData instanceof CryptoOrderDetailsInputData.TpslInputData) {
            ExchangeOrder exchangeOrder = ((CryptoOrderDetailsInputData.TpslInputData) cryptoOrderDetailsInputData).f96662a;
            w wVar = this.f139013q;
            wVar.getClass();
            Intrinsics.checkNotNullParameter(exchangeOrder, "exchangeOrder");
            wd6.h hVar = wd6.h.TAKE_PROFIT;
            if (exchangeOrder.getF72134a().f72139c == hVar) {
                f72134a = exchangeOrder.getF72134a();
            } else {
                ExchangeOrderInfo f72135b = exchangeOrder.getF72135b();
                f72134a = (f72135b == null || f72135b.f72139c != hVar) ? null : f72135b;
            }
            wd6.h hVar2 = wd6.h.STOP_LOSS;
            if (exchangeOrder.getF72134a().f72139c == hVar2) {
                f72134a2 = exchangeOrder.getF72134a();
            } else {
                ExchangeOrderInfo f72135b2 = exchangeOrder.getF72135b();
                f72134a2 = (f72135b2 == null || f72135b2.f72139c != hVar2) ? null : f72135b2;
            }
            Flow flowR = wVar.r(f72134a, f8l.e.LIMIT);
            Flow flowR2 = wVar.r(f72134a2, f8l.e.STOP);
            ExchangeOrderInfo f72134a3 = exchangeOrder.getF72134a();
            yji.l.a1(this, new u1(yh5.b.e(flowR, flowR2, rd0.e.b(nim.a.w(((ppk.f) wVar.f250866b).c(zhm.u.c(new Pair(f72134a3.e, f72134a3.f)), n9l.b.SEC_3), new x(13)))), wVar, 4), null, null, new m(this, null, 1), 3);
            return;
        }
        if (!(cryptoOrderDetailsInputData instanceof CryptoOrderDetailsInputData.StopLimitInputData)) {
            throw new NoWhenBranchMatchedException();
        }
        ExchangeOrder exchangeOrder2 = ((CryptoOrderDetailsInputData.StopLimitInputData) cryptoOrderDetailsInputData).f96661a;
        q qVar = this.f139014r;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(exchangeOrder2, "exchangeOrder");
        ExchangeOrderInfo f72134a4 = exchangeOrder2.getF72134a();
        if (f72134a4 == null) {
            flowU = new go.g(new Data(null, null, false, 7, null), 2);
        } else {
            dj0.d dVar = f72134a4.f72140g;
            double d = f72134a4.f72141h;
            boolean z = cp5.d.z(dVar.f115083b) && Intrinsics.f(dVar.f115083b, f72134a4.e);
            f8l.e eVar = f72134a4.f72139c == wd6.h.LIMIT ? f8l.e.LIMIT : f8l.e.STOP;
            int i = dyh.c.f121133a[f72134a4.d.ordinal()];
            if (i == 1) {
                orderQuoteParams = new OrderQuoteParams(f72134a4.f, f72134a4.e, eVar, l4i.a.e(dVar).f104717a, z ? f8l.b.TO : f8l.b.FROM, f8l.b.TO, new BigDecimal(String.valueOf(d)), false, null, null, null, null, null, null, 16128);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                orderQuoteParams = new OrderQuoteParams(f72134a4.e, f72134a4.f, eVar, l4i.a.e(dVar).f104717a, z ? f8l.b.FROM : f8l.b.TO, f8l.b.FROM, new BigDecimal(String.valueOf(d)), false, null, null, null, null, null, null, 16128);
            }
            flowU = o7.b.u((o7.b) qVar.f250850c, orderQuoteParams);
        }
        wd6.e eVar2 = exchangeOrder2.getF72134a().d;
        ExchangeOrderInfo f72134a5 = exchangeOrder2.getF72134a();
        yji.l.a1(this, new ahd.y(yh5.b.d(flowU, rd0.e.b(nim.a.w(((ppk.f) qVar.d).c(zhm.u.c(new Pair(f72134a5.e, f72134a5.f)), n9l.b.SEC_3), new dyh.b(eVar2, 0)))), qVar, exchangeOrder2, 19), null, null, new m(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f139015s;
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof wxh.l;
        aii.w wVar = aii.w.f5295a;
        if (z) {
            B2();
            return wVar;
        }
        if (!(event instanceof yxh.h)) {
            if (!(event instanceof yxh.g) && !(event instanceof xxh.g)) {
                return super.o2(event);
            }
            B2();
            return wVar;
        }
        myh.j jVar = ((yxh.h) event).f317702b;
        y yVar = this.f139015s;
        f fVar = ((a) ((j2) yVar.f22677a).getValue()).f138994a;
        if (fVar instanceof d) {
            H2(yVar, new fpk.b(fVar, jVar, 23));
        }
        return wVar;
    }
}
