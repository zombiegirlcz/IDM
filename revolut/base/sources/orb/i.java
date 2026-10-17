package orb;

import ael.d0;
import ael.y;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuoteParams;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.math.BigDecimal;
import java.util.ArrayList;
import k4l.q0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nel.s0;
import om4.l0;
import vrl.s;
import vrl.y0;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1b.a f228095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f228096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lal.a f228097c;
    public final s d;
    public final prb.c e;
    public final ybl.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d0 f228098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0 f228099h;

    public i(l4i.a amountConverter, y1b.a cfdInteractor, p2b.c cfdMarketPriceCalculator, ybl.b instrumentTickerInteractor, lal.a openPositionInteractor, s orderLimitsByPortfolioInteractor, prb.c placeOrderRequestMapper, ybl.d portfolioInteractor, d0 stocksInteractor, y0 tradingPlaceOrderInteractor) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(cfdInteractor, "cfdInteractor");
        Intrinsics.checkNotNullParameter(cfdMarketPriceCalculator, "cfdMarketPriceCalculator");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(openPositionInteractor, "openPositionInteractor");
        Intrinsics.checkNotNullParameter(orderLimitsByPortfolioInteractor, "orderLimitsByPortfolioInteractor");
        Intrinsics.checkNotNullParameter(placeOrderRequestMapper, "placeOrderRequestMapper");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(tradingPlaceOrderInteractor, "tradingPlaceOrderInteractor");
        this.f228095a = cfdInteractor;
        this.f228096b = instrumentTickerInteractor;
        this.f228097c = openPositionInteractor;
        this.d = orderLimitsByPortfolioInteractor;
        this.e = placeOrderRequestMapper;
        this.f = portfolioInteractor;
        this.f228098g = stocksInteractor;
        this.f228099h = tradingPlaceOrderInteractor;
    }

    public static Pair f(wel.e eVar, nel.n nVar) {
        ArrayList arrayList = eVar.e;
        ArrayList<kel.g> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            kel.g gVar = (kel.g) obj2;
            if (gVar instanceof kel.n) {
                kel.n nVar2 = (kel.n) gVar;
                if (Intrinsics.f(nVar2.e, nVar.f214596b) && nVar2.f183174b.compareTo(BigDecimal.ZERO) > 0) {
                    arrayList2.add(obj2);
                }
            }
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (kel.g gVar2 : arrayList2) {
            Intrinsics.i(gVar2, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.holding.StockHolding");
            bigDecimalValueOf = bigDecimalValueOf.add(((kel.n) gVar2).f183174b);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        ArrayList<kel.g> arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            kel.g gVar3 = (kel.g) obj3;
            if (gVar3 instanceof kel.n) {
                kel.n nVar3 = (kel.n) gVar3;
                if (Intrinsics.f(nVar3.e, nVar.f214596b) && nVar3.f183174b.compareTo(BigDecimal.ZERO) < 0) {
                    arrayList3.add(obj3);
                }
            }
        }
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        for (kel.g gVar4 : arrayList3) {
            Intrinsics.i(gVar4, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.holding.StockHolding");
            bigDecimalValueOf2 = bigDecimalValueOf2.add(((kel.n) gVar4).f183174b);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "add(...)");
        }
        return new Pair(bigDecimalValueOf, bigDecimalValueOf2);
    }

    @Override // orb.j
    public final BigDecimal a(qrb.e quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    @Override // orb.j
    public final Flow b(bfl.g tradeSide, s0 onboardedDetails) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(onboardedDetails, "onboardedDetails");
        nel.n nVar = onboardedDetails.e;
        TradingAccount tradingAccount = onboardedDetails.d;
        String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        y yVar = (y) this.f;
        w4l.h hVar = w4l.h.f294642c;
        vkm.d dVarE = yVar.e(string, hVar);
        akg.n nVarP = ((ael.k) this.f228096b).p(nVar.f214596b, hVar, n9l.b.SEC_3.a());
        vkm.d dVarG = g(tradeSide, nVar, tradingAccount);
        String string2 = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        akg.n nVarA = y1b.a.a(this.f228095a, string2, null, 6);
        vkm.d dVarB = rd0.e.b(nim.a.w(this.f228098g.a(nVar.f214596b, false), new or4.h(11)));
        nel.n nVar2 = onboardedDetails.e;
        String string3 = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return nim.a.v(nim.a.u(new m84.c(2, 19, null), u0.m(u0.i(dVarE, nVarP, dVarG), u0.i(nVarA, dVarB, boh.f.e(u0.m(yVar.e(string3, hVar), g(tradeSide, nVar2, tradingAccount)), new l0(this, 12, nVar2, tradeSide))))), new l0(this, nVar, tradeSide, onboardedDetails));
    }

    @Override // orb.j
    public final Flow c(TradingAccount tradingAccount, nel.n instrument) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        String str = instrument.f214596b;
        String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new g(mo3.a.e(this.f228097c.w(str, string), new oq3.e(9), new oq3.e(10)), instrument, 0);
    }

    @Override // orb.j
    public final akg.n d(bfl.g tradeSide, qrb.k tradeInstrumentData, BigDecimal inputValue, qrb.b inputType) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        if (!(tradeInstrumentData instanceof qrb.g)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        qrb.g gVar = (qrb.g) tradeInstrumentData;
        nel.n nVar = gVar.f248690c;
        Pair pairF = f(gVar.f248688a, nVar);
        BigDecimal bigDecimal = (BigDecimal) pairF.f186385a;
        BigDecimal bigDecimal2 = (BigDecimal) pairF.f186386b;
        f8l.e eVar = f8l.e.MARKET;
        Float f = gVar.f.k;
        BigDecimal bigDecimal3 = f != null ? new BigDecimal(String.valueOf(f.floatValue())) : BigDecimal.ZERO;
        Intrinsics.h(bigDecimal3);
        BigDecimal bigDecimal4 = bigDecimal3;
        xi0.b bVar = nVar.i;
        xi0.a aVar = xi0.b.Companion;
        String str = nVar.f214596b;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        BigDecimal bigDecimalAbs = bigDecimal2.abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        return nim.a.v(((p2b.b) this.f228095a).c(new MarginQuoteParams(eVar, tradeSide, bigDecimal4, bVar, bVarA, inputValue, bigDecimal, bigDecimalAbs, null)), new or4.h(10));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // orb.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(bfl.g r19, qrb.k r20, qrb.e r21, java.lang.String r22, gim.c r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            r2 = r23
            boolean r3 = r2 instanceof orb.h
            if (r3 == 0) goto L19
            r3 = r2
            orb.h r3 = (orb.h) r3
            int r4 = r3.f228094w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f228094w = r4
            goto L1e
        L19:
            orb.h r3 = new orb.h
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f228094w
            r6 = 1
            if (r5 == 0) goto L35
            if (r5 != r6) goto L2d
            yhm.o.b(r2)
            goto L94
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            yhm.o.b(r2)
            boolean r2 = r1 instanceof qrb.c
            if (r2 == 0) goto L9a
            qrb.c r1 = (qrb.c) r1
            com.revolut.feature.retail.cfd.api.domain.models.MarginQuote r1 = r1.f248683a
            nel.n r2 = r20.n()
            java.lang.String r8 = r2.f214596b
            dfl.x r10 = new dfl.x
            com.revolut.shared.feature.market_data.models.domain.models.Amount r2 = r1.d
            java.math.BigDecimal r2 = r2.f104717a
            r10.<init>(r2)
            com.revolut.shared.feature.market_data.models.domain.models.Amount r2 = new com.revolut.shared.feature.market_data.models.domain.models.Amount
            com.revolut.shared.feature.market_data.models.domain.models.OrderRate r5 = r1.f
            java.math.BigDecimal r5 = r5.f104792a
            com.revolut.shared.feature.market_data.models.domain.models.Amount r1 = r1.f82110a
            com.revolut.shared.feature.market_data.models.domain.models.Asset r1 = r1.f104718b
            r2.<init>(r5, r1)
            ej0.b r12 = l4i.a.a(r2)
            k4l.q0 r15 = k4l.q0.DAY
            r16 = 0
            r17 = 256(0x100, float:3.59E-43)
            prb.c r7 = r0.e
            r11 = 0
            r13 = 0
            r9 = r19
            r14 = r22
            k4l.z r1 = prb.b.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r2 = r20.N()
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r2 = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(r2)
            java.util.UUID r2 = r2.f105210a
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            vrl.y0 r5 = r0.f228099h
            ufm.i r1 = r5.a(r2, r1)
            r3.f228094w = r6
            java.lang.Object r2 = nim.a.b(r1, r3)
            if (r2 != r4) goto L94
            return r4
        L94:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            return r2
        L9a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed requirement."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: orb.i.e(bfl.g, qrb.k, qrb.e, java.lang.String, gim.c):java.lang.Object");
    }

    public final vkm.d g(bfl.g gVar, nel.n nVar, TradingAccount tradingAccount) {
        String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return rd0.e.b(this.d.a(string, nVar.f214596b, gVar, (56 & 8) != 0 ? null : q0.DAY, (56 & 16) != 0 ? null : Boolean.FALSE, null, (56 & 64) != 0 ? w4l.h.f294642c : null));
    }
}
