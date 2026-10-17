package orb;

import ael.d0;
import ael.y;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import d9.e1;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import jel.h1;
import k4l.b0;
import k4l.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n68.w;
import nel.s0;
import vkm.q;
import vrl.l0;
import vrl.s;
import vrl.y0;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f228107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.d f228108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ddf.a f228109c;
    public final ybl.l d;
    public final prb.c e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ybl.b f228110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0 f228111h;
    public final s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lal.a f228112j;

    public o(l4i.a amountConverter, d0 stocksInteractor, ybl.d portfolioInteractor, ddf.a sourcePocketInteractor, ybl.l tradingConfigInteractor, prb.c placeOrderRequestMapper, c stockQuoteProvider, ybl.b instrumentTickerInteractor, y0 tradingPlaceOrderInteractor, zrb.b autoTopUpBuilder, s orderLimitsByPortfolioInteractor, lal.a openPositionInteractor) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(sourcePocketInteractor, "sourcePocketInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(placeOrderRequestMapper, "placeOrderRequestMapper");
        Intrinsics.checkNotNullParameter(stockQuoteProvider, "stockQuoteProvider");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingPlaceOrderInteractor, "tradingPlaceOrderInteractor");
        Intrinsics.checkNotNullParameter(autoTopUpBuilder, "autoTopUpBuilder");
        Intrinsics.checkNotNullParameter(orderLimitsByPortfolioInteractor, "orderLimitsByPortfolioInteractor");
        Intrinsics.checkNotNullParameter(openPositionInteractor, "openPositionInteractor");
        this.f228107a = stocksInteractor;
        this.f228108b = portfolioInteractor;
        this.f228109c = sourcePocketInteractor;
        this.d = tradingConfigInteractor;
        this.e = placeOrderRequestMapper;
        this.f = stockQuoteProvider;
        this.f228110g = instrumentTickerInteractor;
        this.f228111h = tradingPlaceOrderInteractor;
        this.i = orderLimitsByPortfolioInteractor;
        this.f228112j = openPositionInteractor;
    }

    @Override // orb.j
    public final BigDecimal a(qrb.e quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        if (!(quote instanceof qrb.d)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        OrderQuote orderQuote = ((qrb.d) quote).f248684a;
        Amount amountM = e1.m(orderQuote);
        f8l.b bVar = orderQuote.f104752a;
        BigDecimal bigDecimal = amountM.f104717a;
        BigDecimal bigDecimal2 = e1.v(orderQuote).f104717a;
        f8l.b bVar2 = orderQuote.f104753b;
        int[] iArr = l.f228104b;
        int i = iArr[bVar2.ordinal()];
        if (i == 1) {
            int i2 = iArr[bVar.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return bigDecimal;
            }
            return bigDecimal2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = iArr[bVar.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return bigDecimal2;
        }
        return bigDecimal;
    }

    @Override // orb.j
    public final Flow b(bfl.g tradeSide, s0 onboardedDetails) {
        Flow flowI;
        Flow flowI2;
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(onboardedDetails, "onboardedDetails");
        int i = l.f228103a[tradeSide.ordinal()];
        d0 d0Var = this.f228107a;
        ybl.b bVar = this.f228110g;
        Continuation continuation = null;
        w4l.h hVar = w4l.h.f294642c;
        int i2 = 2;
        if (i == 1) {
            final nel.n nVar = onboardedDetails.e;
            final TradingAccount tradingAccount = onboardedDetails.d;
            bfl.g gVar = bfl.g.BUY;
            String str = nVar.f214596b;
            String str2 = nVar.f214596b;
            final int i3 = 1;
            return boh.f.e(nim.a.u(new m84.c(i2, 20, continuation), u0.m(u0.i(boh.f.e(((ael.k) bVar).o(str, hVar), new w(this, tradingAccount, nVar, gVar, 23)), rd0.e.b(nim.a.w(d0Var.a(str2, false), new or4.h(17))), ((ael.k) bVar).o(str2, hVar)), ybl.l.d(this.d))), new Function1(this) { // from class: orb.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f228101b;

                {
                    this.f228101b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    vf0.h hVar2 = (vf0.h) obj2;
                    switch (i3) {
                        case 0:
                            Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                            Optional optional = (Optional) hVar2.f288433a;
                            Object obj3 = hVar2.f288434b;
                            Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                            Optional optional2 = (Optional) obj3;
                            h1 h1Var = (h1) hVar2.f288435c;
                            InstrumentTicker instrumentTicker = (InstrumentTicker) hVar2.d;
                            kel.n nVar2 = (kel.n) gj7.b.m(optional);
                            nel.n instrument = nVar;
                            TradingAccount tradingAccount2 = tradingAccount;
                            if (nVar2 != null) {
                                c cVar = this.f228101b.f;
                                BigDecimal quantity = nVar2.f183175c;
                                Intrinsics.checkNotNullParameter(instrument, "instrument");
                                Intrinsics.checkNotNullParameter(quantity, "quantity");
                                return nim.a.v(nim.a.v(zi0.c.w(cVar.a(instrument, bfl.g.SELL, qrb.b.QUANTITY, quantity)), new or4.h(cVar, 9)), new kwg.e(optional2, tradingAccount2, instrument, instrumentTicker, h1Var, 19));
                            }
                            dj0.d.Companion.getClass();
                            dj0.d dVar = dj0.d.d;
                            BigDecimal ZERO = BigDecimal.ZERO;
                            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                            return new go.g(zi0.c.P(new qrb.i(tradingAccount2, instrument, instrumentTicker, h1Var, null, new qrb.a(dVar, new Amount(ZERO, new Asset(f8l.c.SECURITY, instrument.d, instrument.i)))), false, null, 3), 2);
                        default:
                            Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                            e0 e0Var = (e0) hVar2.f288433a;
                            h1 h1Var2 = (h1) hVar2.f288434b;
                            InstrumentTicker instrumentTicker2 = (InstrumentTicker) hVar2.f288435c;
                            TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) hVar2.d;
                            o oVar = this.f228101b;
                            ddf.a aVar = oVar.f228109c;
                            b0 b0Var = e0Var.f180961n;
                            List list = b0Var != null ? b0Var.f180948b : null;
                            if (list == null) {
                                list = f0.f322471a;
                            }
                            nel.n nVar3 = nVar;
                            return boh.f.e(((l0) aVar).a(list, new xdf.g(nVar3)), new krl.m(oVar, nVar3, tradingLegalEntityInformation, tradingAccount, instrumentTicker2, h1Var2, e0Var, 4));
                    }
                }
            });
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        final nel.n nVar2 = onboardedDetails.e;
        final TradingAccount tradingAccount2 = onboardedDetails.d;
        boolean z = onboardedDetails.f214619c;
        if (z) {
            String str3 = nVar2.f214596b;
            String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount2).f105210a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            flowI = nim.a.v(((y) this.f228108b).d(new kel.j(str3, string), hVar), new or4.h(14));
        } else {
            flowI = null;
        }
        if (flowI == null) {
            flowI = zi0.c.i(Optional.empty());
        }
        Flow flow = flowI;
        if (z) {
            flowI2 = nim.a.v(boh.f.e(((ael.k) bVar).o(nVar2.f214596b, hVar), new w(this, tradingAccount2, nVar2, bfl.g.SELL, 23)), new or4.h(15));
        } else {
            flowI2 = null;
        }
        if (flowI2 == null) {
            flowI2 = zi0.c.i(Optional.empty());
        }
        final int i5 = 0;
        return boh.f.e(nim.a.u(new m84.c(i2, 21, continuation), u0.m(u0.i(flow, flowI2, rd0.e.b(nim.a.w(d0Var.a(nVar2.f214596b, false), new or4.h(17)))), ((ael.k) bVar).o(nVar2.f214596b, hVar))), new Function1(this) { // from class: orb.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f228101b;

            {
                this.f228101b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                vf0.h hVar2 = (vf0.h) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                        Optional optional = (Optional) hVar2.f288433a;
                        Object obj3 = hVar2.f288434b;
                        Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                        Optional optional2 = (Optional) obj3;
                        h1 h1Var = (h1) hVar2.f288435c;
                        InstrumentTicker instrumentTicker = (InstrumentTicker) hVar2.d;
                        kel.n nVar22 = (kel.n) gj7.b.m(optional);
                        nel.n instrument = nVar2;
                        TradingAccount tradingAccount22 = tradingAccount2;
                        if (nVar22 != null) {
                            c cVar = this.f228101b.f;
                            BigDecimal quantity = nVar22.f183175c;
                            Intrinsics.checkNotNullParameter(instrument, "instrument");
                            Intrinsics.checkNotNullParameter(quantity, "quantity");
                            return nim.a.v(nim.a.v(zi0.c.w(cVar.a(instrument, bfl.g.SELL, qrb.b.QUANTITY, quantity)), new or4.h(cVar, 9)), new kwg.e(optional2, tradingAccount22, instrument, instrumentTicker, h1Var, 19));
                        }
                        dj0.d.Companion.getClass();
                        dj0.d dVar = dj0.d.d;
                        BigDecimal ZERO = BigDecimal.ZERO;
                        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                        return new go.g(zi0.c.P(new qrb.i(tradingAccount22, instrument, instrumentTicker, h1Var, null, new qrb.a(dVar, new Amount(ZERO, new Asset(f8l.c.SECURITY, instrument.d, instrument.i)))), false, null, 3), 2);
                    default:
                        Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                        e0 e0Var = (e0) hVar2.f288433a;
                        h1 h1Var2 = (h1) hVar2.f288434b;
                        InstrumentTicker instrumentTicker2 = (InstrumentTicker) hVar2.f288435c;
                        TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) hVar2.d;
                        o oVar = this.f228101b;
                        ddf.a aVar = oVar.f228109c;
                        b0 b0Var = e0Var.f180961n;
                        List list = b0Var != null ? b0Var.f180948b : null;
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        nel.n nVar3 = nVar2;
                        return boh.f.e(((l0) aVar).a(list, new xdf.g(nVar3)), new krl.m(oVar, nVar3, tradingLegalEntityInformation, tradingAccount2, instrumentTicker2, h1Var2, e0Var, 4));
                }
            }
        });
    }

    @Override // orb.j
    public final Flow c(TradingAccount tradingAccount, nel.n instrument) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        String securityRef = instrument.f214596b;
        String portfolioId = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(portfolioId, "toString(...)");
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        lal.a aVar = this.f228112j;
        ybl.d dVar = (ybl.d) aVar.f193426b;
        ybl.c cVar = ybl.d.Companion;
        return new g(mo3.a.e(boh.f.e(q.q(nim.a.v(((y) dVar).f(3L, portfolioId), new nj8.b(securityRef, 14))), new no.e0(aVar, securityRef, 8)), new oq3.e(11), new oq3.e(12)), instrument, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    @Override // orb.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final akg.n d(bfl.g r22, qrb.k r23, java.math.BigDecimal r24, qrb.b r25) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r6 = r24
            r2 = r25
            java.lang.String r3 = "tradeSide"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r4 = "tradeInstrumentData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r5 = "inputValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            java.lang.String r7 = "inputType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            boolean r3 = r1 instanceof qrb.h
            r4 = 0
            if (r3 == 0) goto L31
            r3 = r1
            qrb.h r3 = (qrb.h) r3
            goto L32
        L31:
            r3 = r4
        L32:
            if (r3 == 0) goto L3c
            com.revolut.feature.trading_orders.common.models.SourcePocket r3 = r3.f248692a
            if (r3 == 0) goto L3c
            xi0.b r4 = r3.getF91784h()
        L3c:
            r3 = r4
            r4 = r21
            orb.c r5 = r4.f
            if (r3 == 0) goto L8d
            r7 = r1
            qrb.h r7 = (qrb.h) r7
            nel.n r8 = r7.d
            xi0.b r8 = r8.i
            boolean r8 = r3.equals(r8)
            if (r8 != 0) goto L8d
            o7.b r8 = r5.f228085a
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams r2 = new com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams
            nel.n r7 = r7.d
            xi0.b r7 = r7.i
            r9 = r5
            f8l.e r5 = f8l.e.MARKET
            r4 = r7
            f8l.b r7 = f8l.b.TO
            r10 = r8
            f8l.b r8 = f8l.b.FROM
            f8l.f r12 = f8l.f.TRADING
            r16 = 0
            r17 = 15616(0x3d00, float:2.1883E-41)
            r11 = r9
            r9 = 0
            r13 = r10
            r10 = 0
            r14 = r11
            r11 = 0
            r15 = r13
            r13 = 0
            r18 = r14
            r14 = 0
            r19 = r15
            r15 = 0
            r1 = r25
            r20 = r18
            r0 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            vkm.d r0 = o7.b.u(r0, r2)
            or4.h r2 = new or4.h
            r3 = 7
            r2.<init>(r3)
            akg.n r0 = nim.a.v(r0, r2)
            goto L98
        L8d:
            r1 = r2
            r20 = r5
            java.util.Optional r0 = java.util.Optional.empty()
            go.g r0 = zi0.c.i(r0)
        L98:
            nel.n r2 = r23.n()
            r3 = r22
            r11 = r20
            vkm.d r1 = r11.a(r2, r3, r1, r6)
            t38.e r0 = zh9.u0.m(r1, r0)
            or4.h r1 = new or4.h
            r2 = 8
            r1.<init>(r2)
            akg.n r0 = nim.a.v(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: orb.o.d(bfl.g, qrb.k, java.math.BigDecimal, qrb.b):akg.n");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // orb.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(bfl.g r21, qrb.k r22, qrb.e r23, java.lang.String r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: orb.o.e(bfl.g, qrb.k, qrb.e, java.lang.String, gim.c):java.lang.Object");
    }
}
