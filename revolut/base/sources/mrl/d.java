package mrl;

import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrderData;
import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrderData;
import com.revolut.retail.trading.core.domain.orders.InvestOptionOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOptionProperties;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.retail.trading.core.domain.orders.InvestStockOrder;
import com.revolut.retail.trading.core.domain.orders.InvestTaaOrder;
import com.revolut.retail.trading.core.domain.orders.TradingAutoTopUp;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import k4l.o0;
import k4l.q0;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import kotlin.text.d0;
import krl.p;
import krl.q;
import krl.r;
import krl.s;
import le.u1;
import nel.z;
import orl.l;
import orl.o;
import orl.s0;
import yhm.m;
import yhm.n;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {
    public static final String a(String str, String str2, String str3) throws IOException {
        String[] elements = {str, str2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listL) {
            if (!d0.W((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        String strK0 = zhm.d0.k0(arrayList, " ", null, null, 0, null, 62);
        if (d0.W(strK0)) {
            strK0 = null;
        }
        if (strK0 != null) {
            return strK0;
        }
        if (str3 == null || d0.W(str3)) {
            return null;
        }
        return str3;
    }

    public static final cfl.j b(krl.k kVar) {
        cfl.j jVar;
        String str = kVar.v;
        cfl.j[] jVarArrValues = cfl.j.values();
        int length = jVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jVar = null;
                break;
            }
            jVar = jVarArrValues[i];
            if (a0.z(jVar.name(), str, true)) {
                break;
            }
            i++;
        }
        return jVar == null ? cfl.j.PERSONAL : jVar;
    }

    public static final cfl.j c(o oVar) {
        cfl.j jVar;
        String accountHolderType = oVar.getAccountHolderType();
        if (accountHolderType != null) {
            cfl.j[] jVarArrValues = cfl.j.values();
            int length = jVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jVar = null;
                    break;
                }
                jVar = jVarArrValues[i];
                if (a0.z(jVar.name(), accountHolderType, true)) {
                    break;
                }
                i++;
            }
            if (jVar != null) {
                return jVar;
            }
        }
        return cfl.j.PERSONAL;
    }

    public static final k4l.d d(krl.k kVar, k4l.d dVar) {
        k4l.d dVar2;
        String str = kVar.f188986b;
        k4l.d[] dVarArrValues = k4l.d.values();
        int length = dVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                dVar2 = null;
                break;
            }
            dVar2 = dVarArrValues[i];
            if (a0.z(dVar2.name(), str, true)) {
                break;
            }
            i++;
        }
        return dVar2 == null ? dVar : dVar2;
    }

    public static final InvestOrder e(krl.k kVar) {
        String str;
        Instant instant;
        Pair pair;
        InvestOptionProperties investOptionProperties;
        Object objA;
        krl.i iVar;
        LocalDate localDate;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        p pVar = kVar.f188993n;
        krl.h hVar = kVar.f188998t;
        krl.g gVar = kVar.f188997s;
        String str6 = kVar.f188991l;
        String str7 = kVar.f189000x;
        krl.a aVar = kVar.u;
        String str8 = kVar.f188992m;
        String str9 = kVar.k;
        String str10 = kVar.f188990j;
        String str11 = kVar.i;
        String str12 = kVar.f188989h;
        String str13 = kVar.f188988g;
        Long l2 = kVar.f;
        long j2 = kVar.e;
        long j3 = kVar.d;
        krl.b bVar = kVar.f188994p;
        q qVar = kVar.o;
        krl.d dVar = kVar.f188996r;
        krl.e eVar = kVar.f188995q;
        if (pVar != null) {
            String str14 = kVar.f188985a;
            k4l.d dVarD = d(kVar, k4l.d.STOCKS);
            String str15 = kVar.f188987c;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(j3);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "let(...)");
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(j2);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "let(...)");
            Instant instantOfEpochMilli3 = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null;
            bfl.g gVarC = f4l.a.c(str13);
            o0 o0VarA = g.a(str12);
            r0 r0VarA = j.a(str11);
            xi0.b.Companion.getClass();
            Pair pair2 = new Pair(xi0.a.a(str10), xi0.a.a(str9));
            jo3.b thresholdPrice = pVar.getThresholdPrice();
            dj0.d dVarV = thresholdPrice != null ? hx7.a.v(thresholdPrice) : null;
            if (str6 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dfl.q qVarK = yh5.b.K(pVar.getValue());
            z zVarA = tbl.a.a(str8);
            String instrumentName = pVar.getInstrumentName();
            if (instrumentName == null) {
                m70.a.c(t0.f186434a);
                str5 = "";
            } else {
                str5 = instrumentName;
            }
            dj0.d dVarV2 = hx7.a.v(pVar.getEstimatedNet());
            dj0.d dVarV3 = hx7.a.v(pVar.getEstimatedPrice());
            BigDecimal bigDecimal = new BigDecimal(pVar.getEstimatedQuantity());
            dj0.d dVarV4 = hx7.a.v(pVar.getEstimatedTotal());
            jo3.b gross = pVar.getGross();
            dj0.d dVarV5 = gross != null ? hx7.a.v(gross) : null;
            jo3.b net2 = pVar.getNet();
            dj0.d dVarV6 = net2 != null ? hx7.a.v(net2) : null;
            jo3.b executedPrice = pVar.getExecutedPrice();
            dj0.d dVarV7 = executedPrice != null ? hx7.a.v(executedPrice) : null;
            String executedQuantity = pVar.getExecutedQuantity();
            BigDecimal bigDecimal2 = executedQuantity != null ? new BigDecimal(executedQuantity) : null;
            Long expirationDate = pVar.getExpirationDate();
            Instant instantOfEpochMilli4 = expirationDate != null ? Instant.ofEpochMilli(expirationDate.longValue()) : null;
            Long expectedSettlementDate = pVar.getExpectedSettlementDate();
            Instant instantOfEpochMilli5 = expectedSettlementDate != null ? Instant.ofEpochMilli(expectedSettlementDate.longValue()) : null;
            q0 q0VarB = h.b(pVar.getTimeInForce());
            Long startDate = pVar.getStartDate();
            Instant instantOfEpochMilli6 = startDate != null ? Instant.ofEpochMilli(startDate.longValue()) : null;
            String period = pVar.getPeriod();
            sel.a aVarA = period != null ? k.a(period) : null;
            Long scheduledExecutionDate = pVar.getScheduledExecutionDate();
            Instant instantOfEpochMilli7 = scheduledExecutionDate != null ? Instant.ofEpochMilli(scheduledExecutionDate.longValue()) : null;
            s autoTopUp = pVar.getAutoTopUp();
            TradingAutoTopUp tradingAutoTopUpB = autoTopUp != null ? a.b(autoTopUp) : null;
            String declineReason = pVar.getDeclineReason();
            String portfolioId = str7 == null ? pVar.getPortfolioId() : str7;
            String badge = pVar.getBadge();
            k4l.e eVarB = badge != null ? xam.a.B(badge) : null;
            if (aVar != null) {
                o0VarG = g(aVar);
            } else {
                krl.a initiatedBy = pVar.getInitiatedBy();
                if (initiatedBy != null) {
                    o0VarG = g(initiatedBy);
                }
            }
            return new InvestStockOrder(str14, str15, dVarD, zVarA, instantOfEpochMilli, instantOfEpochMilli2, instantOfEpochMilli3, gVarC, o0VarA, r0VarA, pair2, o0VarG, b(kVar), dVarV, str6, qVarK, str5, dVarV2, dVarV3, bigDecimal, dVarV4, dVarV5, dVarV6, dVarV7, bigDecimal2, instantOfEpochMilli4, instantOfEpochMilli5, q0VarB, instantOfEpochMilli6, instantOfEpochMilli7, tradingAutoTopUpB, declineReason, aVarA, portfolioId, eVarB, kVar.f188999w);
        }
        if (qVar != null) {
            String str16 = kVar.f188985a;
            k4l.d dVarD2 = d(kVar, k4l.d.TAA);
            String str17 = kVar.f188987c;
            Instant instantOfEpochMilli8 = Instant.ofEpochMilli(j3);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli8, "let(...)");
            Instant instantOfEpochMilli9 = Instant.ofEpochMilli(j2);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli9, "let(...)");
            Instant instantOfEpochMilli10 = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null;
            bfl.g gVarC2 = f4l.a.c(str13);
            o0 o0VarA2 = g.a(str12);
            r0 r0VarA2 = j.a(str11);
            xi0.b.Companion.getClass();
            Pair pair3 = new Pair(xi0.a.a(str10), xi0.a.a(str9));
            jo3.b thresholdPrice2 = qVar.getThresholdPrice();
            dj0.d dVarV8 = thresholdPrice2 != null ? hx7.a.v(thresholdPrice2) : null;
            if (str6 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dfl.q qVarK2 = yh5.b.K(qVar.getValue());
            z zVarA2 = tbl.a.a(str8);
            String instrumentName2 = qVar.getInstrumentName();
            if (instrumentName2 == null) {
                m70.a.c(t0.f186434a);
                str4 = "";
            } else {
                str4 = instrumentName2;
            }
            dj0.d dVarV9 = hx7.a.v(qVar.getEstimatedNet());
            dj0.d dVarV10 = hx7.a.v(qVar.getEstimatedPrice());
            BigDecimal bigDecimal3 = new BigDecimal(qVar.getEstimatedQuantity());
            dj0.d dVarV11 = hx7.a.v(qVar.getEstimatedTotal());
            jo3.b gross2 = qVar.getGross();
            dj0.d dVarV12 = gross2 != null ? hx7.a.v(gross2) : null;
            jo3.b net3 = qVar.getNet();
            dj0.d dVarV13 = net3 != null ? hx7.a.v(net3) : null;
            jo3.b executedPrice2 = qVar.getExecutedPrice();
            dj0.d dVarV14 = executedPrice2 != null ? hx7.a.v(executedPrice2) : null;
            String executedQuantity2 = qVar.getExecutedQuantity();
            BigDecimal bigDecimal4 = executedQuantity2 != null ? new BigDecimal(executedQuantity2) : null;
            Long expirationDate2 = qVar.getExpirationDate();
            Instant instantOfEpochMilli11 = expirationDate2 != null ? Instant.ofEpochMilli(expirationDate2.longValue()) : null;
            Long expectedSettlementDate2 = qVar.getExpectedSettlementDate();
            Instant instantOfEpochMilli12 = expectedSettlementDate2 != null ? Instant.ofEpochMilli(expectedSettlementDate2.longValue()) : null;
            q0 q0VarB2 = h.b(qVar.getTimeInForce());
            Long startDate2 = qVar.getStartDate();
            Instant instantOfEpochMilli13 = startDate2 != null ? Instant.ofEpochMilli(startDate2.longValue()) : null;
            String period2 = qVar.getPeriod();
            sel.a aVarA2 = period2 != null ? k.a(period2) : null;
            Long scheduledExecutionDate2 = qVar.getScheduledExecutionDate();
            Instant instantOfEpochMilli14 = scheduledExecutionDate2 != null ? Instant.ofEpochMilli(scheduledExecutionDate2.longValue()) : null;
            s autoTopUp2 = qVar.getAutoTopUp();
            TradingAutoTopUp tradingAutoTopUpB2 = autoTopUp2 != null ? a.b(autoTopUp2) : null;
            String declineReason2 = qVar.getDeclineReason();
            String portfolioId2 = str7 == null ? qVar.getPortfolioId() : str7;
            String badge2 = qVar.getBadge();
            return new InvestTaaOrder(str16, str17, dVarD2, zVarA2, instantOfEpochMilli8, instantOfEpochMilli9, instantOfEpochMilli10, gVarC2, o0VarA2, r0VarA2, pair3, aVar != null ? g(aVar) : null, b(kVar), dVarV8, str6, qVarK2, str4, dVarV9, dVarV10, bigDecimal3, dVarV11, dVarV12, dVarV13, dVarV14, bigDecimal4, instantOfEpochMilli11, instantOfEpochMilli12, q0VarB2, instantOfEpochMilli13, instantOfEpochMilli14, tradingAutoTopUpB2, declineReason2, aVarA2, portfolioId2, badge2 != null ? xam.a.B(badge2) : null, kVar.f188999w);
        }
        if (bVar != null) {
            String str18 = kVar.f188985a;
            k4l.d dVarD3 = d(kVar, k4l.d.COMMODITIES);
            String str19 = kVar.f188987c;
            z zVarA3 = tbl.a.a(str8);
            Instant instantOfEpochMilli15 = Instant.ofEpochMilli(j3);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli15, "let(...)");
            Instant instantOfEpochMilli16 = Instant.ofEpochMilli(j2);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli16, "let(...)");
            Instant instantOfEpochMilli17 = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null;
            bfl.g gVarC3 = f4l.a.c(str13);
            o0 o0VarA3 = g.a(str12);
            r0 r0VarA3 = j.a(str11);
            xi0.b.Companion.getClass();
            Pair pair4 = new Pair(xi0.a.a(str10), xi0.a.a(str9));
            jo3.b thresholdPrice3 = bVar.getThresholdPrice();
            dj0.d dVarV15 = thresholdPrice3 != null ? hx7.a.v(thresholdPrice3) : null;
            dj0.d dVarV16 = hx7.a.v(bVar.getValue());
            jo3.b estimatedNet = bVar.getEstimatedNet();
            dj0.d dVarV17 = estimatedNet != null ? hx7.a.v(estimatedNet) : null;
            jo3.b gross3 = bVar.getGross();
            dj0.d dVarV18 = gross3 != null ? hx7.a.v(gross3) : null;
            String executedQuantity3 = bVar.getExecutedQuantity();
            BigDecimal bigDecimal5 = executedQuantity3 != null ? new BigDecimal(executedQuantity3) : null;
            Long startDate3 = bVar.getStartDate();
            Instant instantOfEpochMilli18 = startDate3 != null ? Instant.ofEpochMilli(startDate3.longValue()) : null;
            String period3 = bVar.getPeriod();
            sel.a aVarA3 = period3 != null ? k.a(period3) : null;
            Long scheduledExecutionDate3 = bVar.getScheduledExecutionDate();
            Instant instantOfEpochMilli19 = scheduledExecutionDate3 != null ? Instant.ofEpochMilli(scheduledExecutionDate3.longValue()) : null;
            Integer errorCode = bVar.getErrorCode();
            return new InvestCommodityOrder(str18, str19, dVarD3, zVarA3, instantOfEpochMilli15, instantOfEpochMilli16, instantOfEpochMilli17, gVarC3, o0VarA3, r0VarA3, pair4, aVar != null ? g(aVar) : null, b(kVar), kVar.f188999w, dVarV15, dVarV16, dVarV17, dVarV18, bigDecimal5, instantOfEpochMilli18, aVarA3, instantOfEpochMilli19, errorCode != null ? new InvestCommodityOrder.ErrorCode(errorCode.intValue()) : null);
        }
        if (eVar != null) {
            String str20 = kVar.f188985a;
            k4l.d dVarD4 = d(kVar, k4l.d.MARGIN);
            String str21 = kVar.f188987c;
            z zVarA4 = tbl.a.a(str8);
            Instant instantOfEpochMilli20 = Instant.ofEpochMilli(j3);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli20, "let(...)");
            Instant instantOfEpochMilli21 = Instant.ofEpochMilli(j2);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli21, "let(...)");
            Instant instantOfEpochMilli22 = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null;
            bfl.g gVarC4 = f4l.a.c(str13);
            o0 o0VarA4 = g.a(str12);
            r0 r0VarA4 = j.a(str11);
            xi0.b.Companion.getClass();
            Pair pair5 = new Pair(xi0.a.a(str10), xi0.a.a(str9));
            String symbol = eVar.getSymbol();
            BigDecimal estimatedQuantity = eVar.getEstimatedQuantity();
            BigDecimal executedQuantity4 = eVar.getExecutedQuantity();
            jo3.b gross4 = eVar.getGross();
            dj0.d dVarV19 = gross4 != null ? hx7.a.v(gross4) : null;
            dj0.d dVarV20 = hx7.a.v(eVar.getEstimatedTotal());
            Long expirationDate3 = eVar.getExpirationDate();
            Instant instantOfEpochMilli23 = expirationDate3 != null ? Instant.ofEpochMilli(expirationDate3.longValue()) : null;
            ko3.b executedPrice3 = eVar.getExecutedPrice();
            ej0.b bVarI = executedPrice3 != null ? cp5.c.I(executedPrice3) : null;
            ko3.b estimatedPrice = eVar.getEstimatedPrice();
            ej0.b bVarI2 = estimatedPrice != null ? cp5.c.I(estimatedPrice) : null;
            s autoTopUp3 = eVar.getAutoTopUp();
            TradingAutoTopUp tradingAutoTopUpB3 = autoTopUp3 != null ? a.b(autoTopUp3) : null;
            jo3.b estimatedNet2 = eVar.getEstimatedNet();
            dj0.d dVarV21 = estimatedNet2 != null ? hx7.a.v(estimatedNet2) : null;
            Long expectedSettlementDate3 = eVar.getExpectedSettlementDate();
            Instant instantOfEpochMilli24 = expectedSettlementDate3 != null ? Instant.ofEpochMilli(expectedSettlementDate3.longValue()) : null;
            String instrumentName3 = eVar.getInstrumentName();
            jo3.b net4 = eVar.getNet();
            dj0.d dVarV22 = net4 != null ? hx7.a.v(net4) : null;
            String period4 = eVar.getPeriod();
            sel.a aVarA4 = period4 != null ? k.a(period4) : null;
            Long scheduledExecutionDate4 = eVar.getScheduledExecutionDate();
            Instant instantOfEpochMilli25 = scheduledExecutionDate4 != null ? Instant.ofEpochMilli(scheduledExecutionDate4.longValue()) : null;
            Long startDate4 = eVar.getStartDate();
            Instant instantOfEpochMilli26 = startDate4 != null ? Instant.ofEpochMilli(startDate4.longValue()) : null;
            ko3.b thresholdPrice4 = eVar.getThresholdPrice();
            return new InvestMarginOrder(str20, str21, dVarD4, zVarA4, instantOfEpochMilli20, instantOfEpochMilli21, instantOfEpochMilli22, gVarC4, o0VarA4, r0VarA4, pair5, aVar != null ? g(aVar) : null, b(kVar), kVar.f188999w, symbol, estimatedQuantity, executedQuantity4, dVarV19, dVarV20, instantOfEpochMilli23, bVarI, bVarI2, tradingAutoTopUpB3, dVarV21, instantOfEpochMilli24, instrumentName3, dVarV22, aVarA4, instantOfEpochMilli25, instantOfEpochMilli26, thresholdPrice4 != null ? cp5.c.I(thresholdPrice4) : null, h.b(eVar.getTimeInForce()), yh5.b.K(eVar.getValue()), hx7.a.v(eVar.getMargin()), hx7.a.v(eVar.getExposure()), eVar.getLeverage(), hx7.a.v(eVar.getTotalMargin()), eVar.getDeclineReason(), str7 == null ? eVar.getPortfolioId() : str7);
        }
        if (dVar != null) {
            String str22 = kVar.f188985a;
            k4l.d dVarD5 = d(kVar, k4l.d.STOCKS);
            String str23 = kVar.f188987c;
            Instant instantOfEpochMilli27 = Instant.ofEpochMilli(j3);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli27, "let(...)");
            Instant instantOfEpochMilli28 = Instant.ofEpochMilli(j2);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli28, "let(...)");
            Instant instantOfEpochMilli29 = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null;
            bfl.g gVarC5 = f4l.a.c(str13);
            o0 o0VarA5 = g.a(str12);
            r0 r0VarA5 = j.a(str11);
            xi0.b.Companion.getClass();
            Instant instant2 = instantOfEpochMilli29;
            Pair pair6 = new Pair(xi0.a.a(str10), xi0.a.a(str9));
            jo3.b thresholdPrice5 = dVar.getThresholdPrice();
            dj0.d dVarV23 = thresholdPrice5 != null ? hx7.a.v(thresholdPrice5) : null;
            if (str6 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dfl.q qVarK3 = yh5.b.K(dVar.getValue());
            z zVarA5 = tbl.a.a(str8);
            String instrumentName4 = dVar.getInstrumentName();
            if (instrumentName4 == null) {
                m70.a.c(t0.f186434a);
                str3 = "";
            } else {
                str3 = instrumentName4;
            }
            dj0.d dVarV24 = hx7.a.v(dVar.getEstimatedNet());
            dj0.d dVarV25 = hx7.a.v(dVar.getEstimatedPrice());
            BigDecimal bigDecimal6 = new BigDecimal(dVar.getEstimatedQuantity());
            dj0.d dVarV26 = hx7.a.v(dVar.getEstimatedTotal());
            krl.c fundData = dVar.getFundData();
            Intrinsics.checkNotNullParameter(fundData, "<this>");
            Instant instantOfEpochMilli30 = Instant.ofEpochMilli(fundData.getSubmissionDate());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli30, "ofEpochMilli(...)");
            Long settlementDate = fundData.getSettlementDate();
            Instant instantOfEpochMilli31 = settlementDate != null ? Instant.ofEpochMilli(settlementDate.longValue()) : null;
            Instant instantOfEpochMilli32 = Instant.ofEpochMilli(fundData.getInternalCutoffDate());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli32, "ofEpochMilli(...)");
            Instant instantOfEpochMilli33 = Instant.ofEpochMilli(fundData.getTradeDate());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli33, "ofEpochMilli(...)");
            Instant instantOfEpochMilli34 = Instant.ofEpochMilli(fundData.getNavDate());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli34, "ofEpochMilli(...)");
            InvestFundOrderData investFundOrderData = new InvestFundOrderData(instantOfEpochMilli30, instantOfEpochMilli31, instantOfEpochMilli32, instantOfEpochMilli33, instantOfEpochMilli34);
            jo3.b gross5 = dVar.getGross();
            dj0.d dVarV27 = gross5 != null ? hx7.a.v(gross5) : null;
            jo3.b net5 = dVar.getNet();
            dj0.d dVarV28 = net5 != null ? hx7.a.v(net5) : null;
            jo3.b executedPrice4 = dVar.getExecutedPrice();
            dj0.d dVarV29 = executedPrice4 != null ? hx7.a.v(executedPrice4) : null;
            String executedQuantity5 = dVar.getExecutedQuantity();
            BigDecimal bigDecimal7 = executedQuantity5 != null ? new BigDecimal(executedQuantity5) : null;
            Long expirationDate4 = dVar.getExpirationDate();
            Instant instantOfEpochMilli35 = expirationDate4 != null ? Instant.ofEpochMilli(expirationDate4.longValue()) : null;
            Long expectedSettlementDate4 = dVar.getExpectedSettlementDate();
            Instant instantOfEpochMilli36 = expectedSettlementDate4 != null ? Instant.ofEpochMilli(expectedSettlementDate4.longValue()) : null;
            q0 q0VarB3 = h.b(dVar.getTimeInForce());
            Long startDate5 = dVar.getStartDate();
            Instant instantOfEpochMilli37 = startDate5 != null ? Instant.ofEpochMilli(startDate5.longValue()) : null;
            String period5 = dVar.getPeriod();
            sel.a aVarA5 = period5 != null ? k.a(period5) : null;
            Long scheduledExecutionDate5 = dVar.getScheduledExecutionDate();
            Instant instantOfEpochMilli38 = scheduledExecutionDate5 != null ? Instant.ofEpochMilli(scheduledExecutionDate5.longValue()) : null;
            s autoTopUp4 = dVar.getAutoTopUp();
            TradingAutoTopUp tradingAutoTopUpB4 = autoTopUp4 != null ? a.b(autoTopUp4) : null;
            String declineReason3 = dVar.getDeclineReason();
            String portfolioId3 = str7 == null ? dVar.getPortfolioId() : str7;
            String badge3 = dVar.getBadge();
            k4l.e eVarB2 = badge3 != null ? xam.a.B(badge3) : null;
            if (aVar != null) {
                o0VarG = g(aVar);
            } else {
                krl.a initiatedBy2 = dVar.getInitiatedBy();
                if (initiatedBy2 != null) {
                    o0VarG = g(initiatedBy2);
                }
            }
            return new InvestFundOrder(str22, str23, dVarD5, zVarA5, instantOfEpochMilli27, instantOfEpochMilli28, instant2, gVarC5, o0VarA5, r0VarA5, pair6, o0VarG, b(kVar), kVar.f188999w, investFundOrderData, dVarV23, str6, qVarK3, str3, dVarV24, dVarV25, bigDecimal6, dVarV26, dVarV27, dVarV28, dVarV29, bigDecimal7, instantOfEpochMilli35, instantOfEpochMilli36, q0VarB3, instantOfEpochMilli37, instantOfEpochMilli38, tradingAutoTopUpB4, declineReason3, aVarA5, portfolioId3, eVarB2);
        }
        if (gVar != null) {
            String str24 = kVar.f188985a;
            k4l.d dVarD6 = d(kVar, k4l.d.STOCKS);
            String str25 = kVar.f188987c;
            Instant instantOfEpochMilli39 = Instant.ofEpochMilli(j3);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli39, "let(...)");
            Instant instantOfEpochMilli40 = Instant.ofEpochMilli(j2);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli40, "let(...)");
            Instant instantOfEpochMilli41 = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null;
            bfl.g gVarC6 = f4l.a.c(str13);
            o0 o0VarA6 = g.a(str12);
            r0 r0VarA6 = j.a(str11);
            xi0.b.Companion.getClass();
            Instant instant3 = instantOfEpochMilli41;
            Pair pair7 = new Pair(xi0.a.a(str10), xi0.a.a(str9));
            jo3.b thresholdPrice6 = gVar.getThresholdPrice();
            dj0.d dVarV30 = thresholdPrice6 != null ? hx7.a.v(thresholdPrice6) : null;
            if (str6 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dfl.q qVarK4 = yh5.b.K(gVar.getValue());
            z zVarA6 = tbl.a.a(str8);
            String instrumentName5 = gVar.getInstrumentName();
            if (instrumentName5 == null) {
                m70.a.c(t0.f186434a);
                str2 = "";
            } else {
                str2 = instrumentName5;
            }
            dj0.d dVarV31 = hx7.a.v(gVar.getEstimatedNet());
            dj0.d dVarV32 = hx7.a.v(gVar.getEstimatedPrice());
            BigDecimal bigDecimal8 = new BigDecimal(gVar.getEstimatedQuantity());
            dj0.d dVarV33 = hx7.a.v(gVar.getEstimatedTotal());
            krl.f fundData2 = gVar.getFundData();
            Intrinsics.checkNotNullParameter(fundData2, "<this>");
            Instant instantOfEpochMilli42 = Instant.ofEpochMilli(fundData2.getTradeDate());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli42, "ofEpochMilli(...)");
            Instant instantOfEpochMilli43 = Instant.ofEpochMilli(fundData2.getSettlementDate());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli43, "ofEpochMilli(...)");
            InvestMutualFundOrderData investMutualFundOrderData = new InvestMutualFundOrderData(instantOfEpochMilli42, instantOfEpochMilli43);
            jo3.b gross6 = gVar.getGross();
            dj0.d dVarV34 = gross6 != null ? hx7.a.v(gross6) : null;
            jo3.b net6 = gVar.getNet();
            dj0.d dVarV35 = net6 != null ? hx7.a.v(net6) : null;
            jo3.b executedPrice5 = gVar.getExecutedPrice();
            dj0.d dVarV36 = executedPrice5 != null ? hx7.a.v(executedPrice5) : null;
            String executedQuantity6 = gVar.getExecutedQuantity();
            BigDecimal bigDecimal9 = executedQuantity6 != null ? new BigDecimal(executedQuantity6) : null;
            Long expirationDate5 = gVar.getExpirationDate();
            Instant instantOfEpochMilli44 = expirationDate5 != null ? Instant.ofEpochMilli(expirationDate5.longValue()) : null;
            Long expectedSettlementDate5 = gVar.getExpectedSettlementDate();
            Instant instantOfEpochMilli45 = expectedSettlementDate5 != null ? Instant.ofEpochMilli(expectedSettlementDate5.longValue()) : null;
            q0 q0VarB4 = h.b(gVar.getTimeInForce());
            Long startDate6 = gVar.getStartDate();
            Instant instantOfEpochMilli46 = startDate6 != null ? Instant.ofEpochMilli(startDate6.longValue()) : null;
            String period6 = gVar.getPeriod();
            sel.a aVarA6 = period6 != null ? k.a(period6) : null;
            Long scheduledExecutionDate6 = gVar.getScheduledExecutionDate();
            Instant instantOfEpochMilli47 = scheduledExecutionDate6 != null ? Instant.ofEpochMilli(scheduledExecutionDate6.longValue()) : null;
            s autoTopUp5 = gVar.getAutoTopUp();
            TradingAutoTopUp tradingAutoTopUpB5 = autoTopUp5 != null ? a.b(autoTopUp5) : null;
            String declineReason4 = gVar.getDeclineReason();
            String portfolioId4 = str7 == null ? gVar.getPortfolioId() : str7;
            String badge4 = gVar.getBadge();
            k4l.e eVarB3 = badge4 != null ? xam.a.B(badge4) : null;
            if (aVar != null) {
                o0VarG = g(aVar);
            } else {
                krl.a initiatedBy3 = gVar.getInitiatedBy();
                if (initiatedBy3 != null) {
                    o0VarG = g(initiatedBy3);
                }
            }
            return new InvestMutualFundOrder(str24, str25, dVarD6, zVarA6, instantOfEpochMilli39, instantOfEpochMilli40, instant3, gVarC6, o0VarA6, r0VarA6, pair7, o0VarG, b(kVar), kVar.f188999w, investMutualFundOrderData, dVarV30, str6, qVarK4, str2, dVarV31, dVarV32, bigDecimal8, dVarV33, dVarV34, dVarV35, dVarV36, bigDecimal9, instantOfEpochMilli44, instantOfEpochMilli45, q0VarB4, instantOfEpochMilli46, instantOfEpochMilli47, tradingAutoTopUpB5, declineReason4, aVarA6, portfolioId4, eVarB3);
        }
        if (hVar == null) {
            throw new IllegalStateException("Unknown type");
        }
        String str26 = kVar.f188985a;
        k4l.d dVarD7 = d(kVar, k4l.d.STOCKS);
        String str27 = kVar.f188987c;
        Instant instantOfEpochMilli48 = Instant.ofEpochMilli(j3);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli48, "let(...)");
        Instant instantOfEpochMilli49 = Instant.ofEpochMilli(j2);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli49, "let(...)");
        Instant instantOfEpochMilli50 = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null;
        bfl.g gVarC7 = f4l.a.c(str13);
        o0 o0VarA7 = g.a(str12);
        r0 r0VarA7 = j.a(str11);
        xi0.b.Companion.getClass();
        Pair pair8 = new Pair(xi0.a.a(str10), xi0.a.a(str9));
        jo3.b thresholdPrice7 = hVar.getThresholdPrice();
        dj0.d dVarV37 = thresholdPrice7 != null ? hx7.a.v(thresholdPrice7) : null;
        if (str6 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        dfl.q qVarK5 = yh5.b.K(hVar.getValue());
        z zVarA7 = tbl.a.a(str8);
        String instrumentName6 = hVar.getInstrumentName();
        if (instrumentName6 == null) {
            m70.a.c(t0.f186434a);
            str = "";
        } else {
            str = instrumentName6;
        }
        dj0.d dVarV38 = hx7.a.v(hVar.getEstimatedNet());
        dj0.d dVarV39 = hx7.a.v(hVar.getEstimatedPrice());
        BigDecimal bigDecimal10 = new BigDecimal(hVar.getEstimatedQuantity());
        dj0.d dVarV40 = hx7.a.v(hVar.getEstimatedTotal());
        krl.i optionProperties = hVar.getOptionProperties();
        if (optionProperties != null) {
            Intrinsics.checkNotNullParameter(optionProperties, "<this>");
            String expirationDate6 = optionProperties.getExpirationDate();
            if (expirationDate6 != null) {
                try {
                    m.Companion companion = m.INSTANCE;
                    objA = LocalDate.parse(expirationDate6);
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                iVar = optionProperties;
                if (objA instanceof n) {
                    objA = null;
                }
                localDate = (LocalDate) objA;
            } else {
                iVar = optionProperties;
                localDate = null;
            }
            Integer contractSize = iVar.getContractSize();
            instant = instantOfEpochMilli50;
            String underlyingCurrency = iVar.getUnderlyingCurrency();
            pair = pair8;
            investOptionProperties = new InvestOptionProperties(localDate, contractSize, underlyingCurrency);
        } else {
            instant = instantOfEpochMilli50;
            pair = pair8;
            investOptionProperties = null;
        }
        jo3.b gross7 = hVar.getGross();
        dj0.d dVarV41 = gross7 != null ? hx7.a.v(gross7) : null;
        jo3.b net7 = hVar.getNet();
        dj0.d dVarV42 = net7 != null ? hx7.a.v(net7) : null;
        jo3.b executedPrice6 = hVar.getExecutedPrice();
        dj0.d dVarV43 = executedPrice6 != null ? hx7.a.v(executedPrice6) : null;
        String executedQuantity7 = hVar.getExecutedQuantity();
        BigDecimal bigDecimal11 = executedQuantity7 != null ? new BigDecimal(executedQuantity7) : null;
        Long expirationDate7 = hVar.getExpirationDate();
        Instant instantOfEpochMilli51 = expirationDate7 != null ? Instant.ofEpochMilli(expirationDate7.longValue()) : null;
        Long expectedSettlementDate6 = hVar.getExpectedSettlementDate();
        Instant instantOfEpochMilli52 = expectedSettlementDate6 != null ? Instant.ofEpochMilli(expectedSettlementDate6.longValue()) : null;
        q0 q0VarB5 = h.b(hVar.getTimeInForce());
        Long startDate7 = hVar.getStartDate();
        Instant instantOfEpochMilli53 = startDate7 != null ? Instant.ofEpochMilli(startDate7.longValue()) : null;
        String period7 = hVar.getPeriod();
        sel.a aVarA7 = period7 != null ? k.a(period7) : null;
        Long scheduledExecutionDate7 = hVar.getScheduledExecutionDate();
        Instant instantOfEpochMilli54 = scheduledExecutionDate7 != null ? Instant.ofEpochMilli(scheduledExecutionDate7.longValue()) : null;
        s autoTopUp6 = hVar.getAutoTopUp();
        TradingAutoTopUp tradingAutoTopUpB6 = autoTopUp6 != null ? a.b(autoTopUp6) : null;
        String declineReason5 = hVar.getDeclineReason();
        String portfolioId5 = str7 == null ? hVar.getPortfolioId() : str7;
        String badge5 = hVar.getBadge();
        k4l.e eVarB4 = badge5 != null ? xam.a.B(badge5) : null;
        if (aVar != null) {
            o0VarG = g(aVar);
        } else {
            krl.a initiatedBy4 = hVar.getInitiatedBy();
            if (initiatedBy4 != null) {
                o0VarG = g(initiatedBy4);
            }
        }
        return new InvestOptionOrder(str26, str27, dVarD7, zVarA7, instantOfEpochMilli48, instantOfEpochMilli49, instant, gVarC7, o0VarA7, r0VarA7, pair, o0VarG, b(kVar), kVar.f188999w, investOptionProperties, dVarV37, str6, qVarK5, str, dVarV38, dVarV39, bigDecimal10, dVarV40, dVarV41, dVarV42, dVarV43, bigDecimal11, instantOfEpochMilli51, instantOfEpochMilli52, q0VarB5, instantOfEpochMilli53, instantOfEpochMilli54, tradingAutoTopUpB6, declineReason5, aVarA7, portfolioId5, eVarB4);
    }

    public static final InvestOrder f(o oVar) {
        z zVarA;
        InvestOptionProperties investOptionProperties;
        InvestOrder investOptionOrder;
        Object objA;
        LocalDate localDate;
        InvestOrder investFundOrder;
        z zVarA2;
        InvestMutualFundOrderData investMutualFundOrderData;
        z zVarA3;
        z zVarA4;
        z zVarA5;
        z zVarA6;
        String str;
        InvestOrder investTaaOrder;
        z zVarA7;
        String str2;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar instanceof orl.p) {
            k4l.d dVarI = i(oVar.getAccountType());
            String id10 = oVar.getId();
            String compoundId = oVar.getCompoundId();
            Instant instantOfEpochMilli = Instant.ofEpochMilli(oVar.getCreatedAt());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "let(...)");
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(oVar.getUpdatedAt());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "let(...)");
            Long completedAt = oVar.getCompletedAt();
            Instant instantOfEpochMilli3 = completedAt != null ? Instant.ofEpochMilli(completedAt.longValue()) : null;
            bfl.g gVarC = f4l.a.c(oVar.getSide());
            o0 o0VarA = g.a(oVar.getState());
            r0 r0VarA = j.a(oVar.getOrderType());
            Pair pairH = cp5.d.H(oVar.getCurrencyPair());
            orl.p pVar = (orl.p) oVar;
            jo3.a thresholdPrice = pVar.getThresholdPrice();
            dj0.d dVarO = thresholdPrice != null ? mo3.a.o(thresholdPrice) : null;
            String symbol = pVar.getSymbol();
            dfl.q qVarL = yh5.b.L(pVar.getValue());
            String instrumentType = oVar.getInstrumentType();
            if (instrumentType == null || (zVarA7 = tbl.a.a(instrumentType)) == null) {
                zVarA7 = z.UNSPECIFIED;
            }
            z zVar = zVarA7;
            String instrumentName = pVar.getInstrumentName();
            if (instrumentName == null) {
                m70.a.c(t0.f186434a);
                str2 = "";
            } else {
                str2 = instrumentName;
            }
            dj0.d dVarO2 = mo3.a.o(pVar.getEstimatedNet());
            dj0.d dVarO3 = mo3.a.o(pVar.getEstimatedPrice());
            BigDecimal bigDecimal = new BigDecimal(pVar.getEstimatedQuantity());
            dj0.d dVarO4 = mo3.a.o(pVar.getEstimatedTotal());
            jo3.a gross = pVar.getGross();
            dj0.d dVarO5 = gross != null ? mo3.a.o(gross) : null;
            jo3.a net2 = pVar.getNet();
            dj0.d dVarO6 = net2 != null ? mo3.a.o(net2) : null;
            jo3.a executedPrice = pVar.getExecutedPrice();
            dj0.d dVarO7 = executedPrice != null ? mo3.a.o(executedPrice) : null;
            String executedQuantity = pVar.getExecutedQuantity();
            BigDecimal bigDecimal2 = executedQuantity != null ? new BigDecimal(executedQuantity) : null;
            Long expirationDate = pVar.getExpirationDate();
            Instant instantOfEpochMilli4 = expirationDate != null ? Instant.ofEpochMilli(expirationDate.longValue()) : null;
            Long expectedSettlementDate = pVar.getExpectedSettlementDate();
            Instant instantOfEpochMilli5 = expectedSettlementDate != null ? Instant.ofEpochMilli(expectedSettlementDate.longValue()) : null;
            q0 q0VarB = h.b(pVar.getTimeInForce());
            Long startDate = pVar.getStartDate();
            Instant instantOfEpochMilli6 = startDate != null ? Instant.ofEpochMilli(startDate.longValue()) : null;
            String period = pVar.getPeriod();
            sel.a aVarA = period != null ? k.a(period) : null;
            Long scheduledExecutionDate = pVar.getScheduledExecutionDate();
            Instant instantOfEpochMilli7 = scheduledExecutionDate != null ? Instant.ofEpochMilli(scheduledExecutionDate.longValue()) : null;
            s0 autoTopUp = pVar.getAutoTopUp();
            TradingAutoTopUp tradingAutoTopUpC = autoTopUp != null ? a.c(autoTopUp) : null;
            String declineReason = pVar.getDeclineReason();
            String portfolioId = pVar.getPortfolioId();
            String badge = pVar.getBadge();
            k4l.e eVarB = badge != null ? xam.a.B(badge) : null;
            orl.e initiatedBy = pVar.getInitiatedBy();
            investFundOrder = new InvestStockOrder(id10, compoundId, dVarI, zVar, instantOfEpochMilli, instantOfEpochMilli2, instantOfEpochMilli3, gVarC, o0VarA, r0VarA, pairH, initiatedBy != null ? h(initiatedBy) : null, c(oVar), dVarO, symbol, qVarL, str2, dVarO2, dVarO3, bigDecimal, dVarO4, dVarO5, dVarO6, dVarO7, bigDecimal2, instantOfEpochMilli4, instantOfEpochMilli5, q0VarB, instantOfEpochMilli6, instantOfEpochMilli7, tradingAutoTopUpC, declineReason, aVarA, portfolioId, eVarB, oVar.getBlocking());
        } else if (oVar instanceof orl.q) {
            k4l.d dVarI2 = i(oVar.getAccountType());
            String id11 = oVar.getId();
            String compoundId2 = oVar.getCompoundId();
            Instant instantOfEpochMilli8 = Instant.ofEpochMilli(oVar.getCreatedAt());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli8, "let(...)");
            Instant instantOfEpochMilli9 = Instant.ofEpochMilli(oVar.getUpdatedAt());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli9, "let(...)");
            Long completedAt2 = oVar.getCompletedAt();
            Instant instantOfEpochMilli10 = completedAt2 != null ? Instant.ofEpochMilli(completedAt2.longValue()) : null;
            bfl.g gVarC2 = f4l.a.c(oVar.getSide());
            o0 o0VarA2 = g.a(oVar.getState());
            r0 r0VarA2 = j.a(oVar.getOrderType());
            Pair pairH2 = cp5.d.H(oVar.getCurrencyPair());
            orl.q qVar = (orl.q) oVar;
            jo3.a thresholdPrice2 = qVar.getThresholdPrice();
            dj0.d dVarO8 = thresholdPrice2 != null ? mo3.a.o(thresholdPrice2) : null;
            String symbol2 = qVar.getSymbol();
            dfl.q qVarL2 = yh5.b.L(qVar.getValue());
            String instrumentType2 = oVar.getInstrumentType();
            if (instrumentType2 == null || (zVarA6 = tbl.a.a(instrumentType2)) == null) {
                zVarA6 = z.UNSPECIFIED;
            }
            z zVar2 = zVarA6;
            String instrumentName2 = qVar.getInstrumentName();
            if (instrumentName2 == null) {
                m70.a.c(t0.f186434a);
                str = "";
            } else {
                str = instrumentName2;
            }
            dj0.d dVarO9 = mo3.a.o(qVar.getEstimatedNet());
            dj0.d dVarO10 = mo3.a.o(qVar.getEstimatedPrice());
            BigDecimal bigDecimal3 = new BigDecimal(qVar.getEstimatedQuantity());
            dj0.d dVarO11 = mo3.a.o(qVar.getEstimatedTotal());
            jo3.a gross2 = qVar.getGross();
            dj0.d dVarO12 = gross2 != null ? mo3.a.o(gross2) : null;
            jo3.a net3 = qVar.getNet();
            dj0.d dVarO13 = net3 != null ? mo3.a.o(net3) : null;
            jo3.a executedPrice2 = qVar.getExecutedPrice();
            dj0.d dVarO14 = executedPrice2 != null ? mo3.a.o(executedPrice2) : null;
            String executedQuantity2 = qVar.getExecutedQuantity();
            BigDecimal bigDecimal4 = executedQuantity2 != null ? new BigDecimal(executedQuantity2) : null;
            Long expirationDate2 = qVar.getExpirationDate();
            Instant instantOfEpochMilli11 = expirationDate2 != null ? Instant.ofEpochMilli(expirationDate2.longValue()) : null;
            Long expectedSettlementDate2 = qVar.getExpectedSettlementDate();
            Instant instantOfEpochMilli12 = expectedSettlementDate2 != null ? Instant.ofEpochMilli(expectedSettlementDate2.longValue()) : null;
            q0 q0VarB2 = h.b(qVar.getTimeInForce());
            Long startDate2 = qVar.getStartDate();
            Instant instantOfEpochMilli13 = startDate2 != null ? Instant.ofEpochMilli(startDate2.longValue()) : null;
            String period2 = qVar.getPeriod();
            sel.a aVarA2 = period2 != null ? k.a(period2) : null;
            Long scheduledExecutionDate2 = qVar.getScheduledExecutionDate();
            Instant instantOfEpochMilli14 = scheduledExecutionDate2 != null ? Instant.ofEpochMilli(scheduledExecutionDate2.longValue()) : null;
            s0 autoTopUp2 = qVar.getAutoTopUp();
            TradingAutoTopUp tradingAutoTopUpC2 = autoTopUp2 != null ? a.c(autoTopUp2) : null;
            String declineReason2 = qVar.getDeclineReason();
            String portfolioId2 = qVar.getPortfolioId();
            String badge2 = qVar.getBadge();
            investFundOrder = new InvestTaaOrder(id11, compoundId2, dVarI2, zVar2, instantOfEpochMilli8, instantOfEpochMilli9, instantOfEpochMilli10, gVarC2, o0VarA2, r0VarA2, pairH2, null, c(oVar), dVarO8, symbol2, qVarL2, str, dVarO9, dVarO10, bigDecimal3, dVarO11, dVarO12, dVarO13, dVarO14, bigDecimal4, instantOfEpochMilli11, instantOfEpochMilli12, q0VarB2, instantOfEpochMilli13, instantOfEpochMilli14, tradingAutoTopUpC2, declineReason2, aVarA2, portfolioId2, badge2 != null ? xam.a.B(badge2) : null, oVar.getBlocking());
        } else if (oVar instanceof orl.f) {
            k4l.d dVarI3 = i(oVar.getAccountType());
            String id12 = oVar.getId();
            String compoundId3 = oVar.getCompoundId();
            String instrumentType3 = oVar.getInstrumentType();
            if (instrumentType3 == null || (zVarA5 = tbl.a.a(instrumentType3)) == null) {
                zVarA5 = z.COMMODITY;
            }
            z zVar3 = zVarA5;
            Instant instantOfEpochMilli15 = Instant.ofEpochMilli(oVar.getCreatedAt());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli15, "let(...)");
            Instant instantOfEpochMilli16 = Instant.ofEpochMilli(oVar.getUpdatedAt());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli16, "let(...)");
            Long completedAt3 = oVar.getCompletedAt();
            Instant instantOfEpochMilli17 = completedAt3 != null ? Instant.ofEpochMilli(completedAt3.longValue()) : null;
            bfl.g gVarC3 = f4l.a.c(oVar.getSide());
            o0 o0VarA3 = g.a(oVar.getState());
            r0 r0VarA3 = j.a(oVar.getOrderType());
            Pair pairH3 = cp5.d.H(oVar.getCurrencyPair());
            orl.f fVar = (orl.f) oVar;
            jo3.a thresholdPrice3 = fVar.getThresholdPrice();
            dj0.d dVarO15 = thresholdPrice3 != null ? mo3.a.o(thresholdPrice3) : null;
            dj0.d dVarO16 = mo3.a.o(fVar.getValue());
            jo3.a estimatedNet = fVar.getEstimatedNet();
            dj0.d dVarO17 = estimatedNet != null ? mo3.a.o(estimatedNet) : null;
            jo3.a gross3 = fVar.getGross();
            dj0.d dVarO18 = gross3 != null ? mo3.a.o(gross3) : null;
            String executedQuantity3 = fVar.getExecutedQuantity();
            BigDecimal bigDecimal5 = executedQuantity3 != null ? new BigDecimal(executedQuantity3) : null;
            Long startDate3 = fVar.getStartDate();
            Instant instantOfEpochMilli18 = startDate3 != null ? Instant.ofEpochMilli(startDate3.longValue()) : null;
            String period3 = fVar.getPeriod();
            sel.a aVarA3 = period3 != null ? k.a(period3) : null;
            Long scheduledExecutionDate3 = fVar.getScheduledExecutionDate();
            Instant instantOfEpochMilli19 = scheduledExecutionDate3 != null ? Instant.ofEpochMilli(scheduledExecutionDate3.longValue()) : null;
            Integer errorCode = fVar.getErrorCode();
            investFundOrder = new InvestCommodityOrder(id12, compoundId3, dVarI3, zVar3, instantOfEpochMilli15, instantOfEpochMilli16, instantOfEpochMilli17, gVarC3, o0VarA3, r0VarA3, pairH3, null, c(oVar), oVar.getBlocking(), dVarO15, dVarO16, dVarO17, dVarO18, bigDecimal5, instantOfEpochMilli18, aVarA3, instantOfEpochMilli19, errorCode != null ? new InvestCommodityOrder.ErrorCode(errorCode.intValue()) : null);
        } else if (oVar instanceof orl.i) {
            k4l.d dVarI4 = i(oVar.getAccountType());
            String id13 = oVar.getId();
            String compoundId4 = oVar.getCompoundId();
            String instrumentType4 = oVar.getInstrumentType();
            if (instrumentType4 == null || (zVarA4 = tbl.a.a(instrumentType4)) == null) {
                zVarA4 = z.UNSPECIFIED;
            }
            z zVar4 = zVarA4;
            Instant instantOfEpochMilli20 = Instant.ofEpochMilli(oVar.getCreatedAt());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli20, "let(...)");
            Instant instantOfEpochMilli21 = Instant.ofEpochMilli(oVar.getUpdatedAt());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli21, "let(...)");
            Long completedAt4 = oVar.getCompletedAt();
            Instant instantOfEpochMilli22 = completedAt4 != null ? Instant.ofEpochMilli(completedAt4.longValue()) : null;
            bfl.g gVarC4 = f4l.a.c(oVar.getSide());
            o0 o0VarA4 = g.a(oVar.getState());
            r0 r0VarA4 = j.a(oVar.getOrderType());
            Pair pairH4 = cp5.d.H(oVar.getCurrencyPair());
            orl.i iVar = (orl.i) oVar;
            String symbol3 = iVar.getSymbol();
            BigDecimal estimatedQuantity = iVar.getEstimatedQuantity();
            BigDecimal executedQuantity4 = iVar.getExecutedQuantity();
            jo3.a gross4 = iVar.getGross();
            dj0.d dVarO19 = gross4 != null ? mo3.a.o(gross4) : null;
            dj0.d dVarO20 = mo3.a.o(iVar.getEstimatedTotal());
            Long expirationDate3 = iVar.getExpirationDate();
            Instant instantOfEpochMilli23 = expirationDate3 != null ? Instant.ofEpochMilli(expirationDate3.longValue()) : null;
            ko3.a executedPrice3 = iVar.getExecutedPrice();
            ej0.b bVarQ = executedPrice3 != null ? cj9.c.Q(executedPrice3) : null;
            ko3.a estimatedPrice = iVar.getEstimatedPrice();
            ej0.b bVarQ2 = estimatedPrice != null ? cj9.c.Q(estimatedPrice) : null;
            s0 autoTopUp3 = iVar.getAutoTopUp();
            TradingAutoTopUp tradingAutoTopUpC3 = autoTopUp3 != null ? a.c(autoTopUp3) : null;
            jo3.a estimatedNet2 = iVar.getEstimatedNet();
            dj0.d dVarO21 = estimatedNet2 != null ? mo3.a.o(estimatedNet2) : null;
            Long expectedSettlementDate3 = iVar.getExpectedSettlementDate();
            Instant instantOfEpochMilli24 = expectedSettlementDate3 != null ? Instant.ofEpochMilli(expectedSettlementDate3.longValue()) : null;
            String instrumentName3 = iVar.getInstrumentName();
            jo3.a net4 = iVar.getNet();
            dj0.d dVarO22 = net4 != null ? mo3.a.o(net4) : null;
            String period4 = iVar.getPeriod();
            sel.a aVarA4 = period4 != null ? k.a(period4) : null;
            Long scheduledExecutionDate4 = iVar.getScheduledExecutionDate();
            Instant instantOfEpochMilli25 = scheduledExecutionDate4 != null ? Instant.ofEpochMilli(scheduledExecutionDate4.longValue()) : null;
            Long startDate4 = iVar.getStartDate();
            Instant instantOfEpochMilli26 = startDate4 != null ? Instant.ofEpochMilli(startDate4.longValue()) : null;
            ko3.a thresholdPrice4 = iVar.getThresholdPrice();
            investFundOrder = new InvestMarginOrder(id13, compoundId4, dVarI4, zVar4, instantOfEpochMilli20, instantOfEpochMilli21, instantOfEpochMilli22, gVarC4, o0VarA4, r0VarA4, pairH4, null, c(oVar), oVar.getBlocking(), symbol3, estimatedQuantity, executedQuantity4, dVarO19, dVarO20, instantOfEpochMilli23, bVarQ, bVarQ2, tradingAutoTopUpC3, dVarO21, instantOfEpochMilli24, instrumentName3, dVarO22, aVarA4, instantOfEpochMilli25, instantOfEpochMilli26, thresholdPrice4 != null ? cj9.c.Q(thresholdPrice4) : null, h.b(iVar.getTimeInForce()), yh5.b.L(iVar.getValue()), mo3.a.o(iVar.getMargin()), mo3.a.o(iVar.getExposure()), iVar.getLeverage(), mo3.a.o(iVar.getTotalMargin()), iVar.getDeclineReason(), iVar.getPortfolioId());
        } else if (oVar instanceof orl.h) {
            k4l.d dVarI5 = i(oVar.getAccountType());
            String id14 = oVar.getId();
            String compoundId5 = oVar.getCompoundId();
            Instant instantOfEpochMilli27 = Instant.ofEpochMilli(oVar.getCreatedAt());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli27, "let(...)");
            Instant instantOfEpochMilli28 = Instant.ofEpochMilli(oVar.getUpdatedAt());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli28, "let(...)");
            Long completedAt5 = oVar.getCompletedAt();
            Instant instantOfEpochMilli29 = completedAt5 != null ? Instant.ofEpochMilli(completedAt5.longValue()) : null;
            bfl.g gVarC5 = f4l.a.c(oVar.getSide());
            o0 o0VarA5 = g.a(oVar.getState());
            r0 r0VarA5 = j.a(oVar.getOrderType());
            Pair pairH5 = cp5.d.H(oVar.getCurrencyPair());
            orl.h hVar = (orl.h) oVar;
            jo3.a thresholdPrice5 = hVar.getThresholdPrice();
            dj0.d dVarO23 = thresholdPrice5 != null ? mo3.a.o(thresholdPrice5) : null;
            String symbol4 = hVar.getSymbol();
            dfl.q qVarL3 = yh5.b.L(hVar.getValue());
            String instrumentType5 = oVar.getInstrumentType();
            if (instrumentType5 == null || (zVarA3 = tbl.a.a(instrumentType5)) == null) {
                zVarA3 = z.UNSPECIFIED;
            }
            z zVar5 = zVarA3;
            String instrumentName4 = hVar.getInstrumentName();
            dj0.d dVarO24 = mo3.a.o(hVar.getEstimatedNet());
            dj0.d dVarO25 = mo3.a.o(hVar.getEstimatedPrice());
            BigDecimal bigDecimal6 = new BigDecimal(hVar.getEstimatedQuantity());
            dj0.d dVarO26 = mo3.a.o(hVar.getEstimatedTotal());
            orl.g fundData = hVar.getFundData();
            Intrinsics.checkNotNullParameter(fundData, "<this>");
            Instant instantOfEpochMilli30 = Instant.ofEpochMilli(fundData.getSubmissionDate());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli30, "ofEpochMilli(...)");
            Long settlementDate = fundData.getSettlementDate();
            Instant instantOfEpochMilli31 = settlementDate != null ? Instant.ofEpochMilli(settlementDate.longValue()) : null;
            Instant instantOfEpochMilli32 = Instant.ofEpochMilli(fundData.getInternalCutoffDate());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli32, "ofEpochMilli(...)");
            Instant instantOfEpochMilli33 = Instant.ofEpochMilli(fundData.getTradeDate());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli33, "ofEpochMilli(...)");
            Instant instantOfEpochMilli34 = Instant.ofEpochMilli(fundData.getNavDate());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli34, "ofEpochMilli(...)");
            InvestFundOrderData investFundOrderData = new InvestFundOrderData(instantOfEpochMilli30, instantOfEpochMilli31, instantOfEpochMilli32, instantOfEpochMilli33, instantOfEpochMilli34);
            jo3.a gross5 = hVar.getGross();
            dj0.d dVarO27 = gross5 != null ? mo3.a.o(gross5) : null;
            jo3.a net5 = hVar.getNet();
            dj0.d dVarO28 = net5 != null ? mo3.a.o(net5) : null;
            jo3.a executedPrice4 = hVar.getExecutedPrice();
            dj0.d dVarO29 = executedPrice4 != null ? mo3.a.o(executedPrice4) : null;
            String executedQuantity5 = hVar.getExecutedQuantity();
            BigDecimal bigDecimal7 = executedQuantity5 != null ? new BigDecimal(executedQuantity5) : null;
            Long expirationDate4 = hVar.getExpirationDate();
            Instant instantOfEpochMilli35 = expirationDate4 != null ? Instant.ofEpochMilli(expirationDate4.longValue()) : null;
            Long expectedSettlementDate4 = hVar.getExpectedSettlementDate();
            Instant instantOfEpochMilli36 = expectedSettlementDate4 != null ? Instant.ofEpochMilli(expectedSettlementDate4.longValue()) : null;
            q0 q0VarB3 = h.b(hVar.getTimeInForce());
            Long startDate5 = hVar.getStartDate();
            Instant instantOfEpochMilli37 = startDate5 != null ? Instant.ofEpochMilli(startDate5.longValue()) : null;
            String period5 = hVar.getPeriod();
            sel.a aVarA5 = period5 != null ? k.a(period5) : null;
            Long scheduledExecutionDate5 = hVar.getScheduledExecutionDate();
            Instant instantOfEpochMilli38 = scheduledExecutionDate5 != null ? Instant.ofEpochMilli(scheduledExecutionDate5.longValue()) : null;
            s0 autoTopUp4 = hVar.getAutoTopUp();
            TradingAutoTopUp tradingAutoTopUpC4 = autoTopUp4 != null ? a.c(autoTopUp4) : null;
            String declineReason3 = hVar.getDeclineReason();
            String portfolioId3 = hVar.getPortfolioId();
            String badge3 = hVar.getBadge();
            k4l.e eVarB2 = badge3 != null ? xam.a.B(badge3) : null;
            orl.e initiatedBy2 = hVar.getInitiatedBy();
            investFundOrder = new InvestFundOrder(id14, compoundId5, dVarI5, zVar5, instantOfEpochMilli27, instantOfEpochMilli28, instantOfEpochMilli29, gVarC5, o0VarA5, r0VarA5, pairH5, initiatedBy2 != null ? h(initiatedBy2) : null, c(oVar), oVar.getBlocking(), investFundOrderData, dVarO23, symbol4, qVarL3, instrumentName4, dVarO24, dVarO25, bigDecimal6, dVarO26, dVarO27, dVarO28, dVarO29, bigDecimal7, instantOfEpochMilli35, instantOfEpochMilli36, q0VarB3, instantOfEpochMilli37, instantOfEpochMilli38, tradingAutoTopUpC4, declineReason3, aVarA5, portfolioId3, eVarB2);
        } else {
            if (oVar instanceof orl.k) {
                k4l.d dVarI6 = i(oVar.getAccountType());
                String id15 = oVar.getId();
                String compoundId6 = oVar.getCompoundId();
                Instant instantOfEpochMilli39 = Instant.ofEpochMilli(oVar.getCreatedAt());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli39, "let(...)");
                Instant instantOfEpochMilli40 = Instant.ofEpochMilli(oVar.getUpdatedAt());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli40, "let(...)");
                Long completedAt6 = oVar.getCompletedAt();
                Instant instantOfEpochMilli41 = completedAt6 != null ? Instant.ofEpochMilli(completedAt6.longValue()) : null;
                bfl.g gVarC6 = f4l.a.c(oVar.getSide());
                o0 o0VarA6 = g.a(oVar.getState());
                r0 r0VarA6 = j.a(oVar.getOrderType());
                Pair pairH6 = cp5.d.H(oVar.getCurrencyPair());
                orl.k kVar = (orl.k) oVar;
                jo3.a thresholdPrice6 = kVar.getThresholdPrice();
                dj0.d dVarO30 = thresholdPrice6 != null ? mo3.a.o(thresholdPrice6) : null;
                String symbol5 = kVar.getSymbol();
                dfl.q qVarL4 = yh5.b.L(kVar.getValue());
                String instrumentType6 = oVar.getInstrumentType();
                if (instrumentType6 == null || (zVarA2 = tbl.a.a(instrumentType6)) == null) {
                    zVarA2 = z.UNSPECIFIED;
                }
                z zVar6 = zVarA2;
                String instrumentName5 = kVar.getInstrumentName();
                dj0.d dVarO31 = mo3.a.o(kVar.getEstimatedNet());
                dj0.d dVarO32 = mo3.a.o(kVar.getEstimatedPrice());
                BigDecimal bigDecimal8 = new BigDecimal(kVar.getEstimatedQuantity());
                dj0.d dVarO33 = mo3.a.o(kVar.getEstimatedTotal());
                orl.j fundData2 = kVar.getFundData();
                if (fundData2 != null) {
                    Intrinsics.checkNotNullParameter(fundData2, "<this>");
                    Instant instantOfEpochMilli42 = Instant.ofEpochMilli(fundData2.getTradeDate());
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli42, "ofEpochMilli(...)");
                    Instant instantOfEpochMilli43 = Instant.ofEpochMilli(fundData2.getSettlementDate());
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli43, "ofEpochMilli(...)");
                    investMutualFundOrderData = new InvestMutualFundOrderData(instantOfEpochMilli42, instantOfEpochMilli43);
                } else {
                    Instant instantNow = Instant.now();
                    Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                    Instant instantNow2 = Instant.now();
                    Intrinsics.checkNotNullExpressionValue(instantNow2, "now(...)");
                    investMutualFundOrderData = new InvestMutualFundOrderData(instantNow, instantNow2);
                }
                InvestMutualFundOrderData investMutualFundOrderData2 = investMutualFundOrderData;
                jo3.a gross6 = kVar.getGross();
                dj0.d dVarO34 = gross6 != null ? mo3.a.o(gross6) : null;
                jo3.a net6 = kVar.getNet();
                dj0.d dVarO35 = net6 != null ? mo3.a.o(net6) : null;
                jo3.a executedPrice5 = kVar.getExecutedPrice();
                dj0.d dVarO36 = executedPrice5 != null ? mo3.a.o(executedPrice5) : null;
                String executedQuantity6 = kVar.getExecutedQuantity();
                BigDecimal bigDecimal9 = executedQuantity6 != null ? new BigDecimal(executedQuantity6) : null;
                Long expirationDate5 = kVar.getExpirationDate();
                Instant instantOfEpochMilli44 = expirationDate5 != null ? Instant.ofEpochMilli(expirationDate5.longValue()) : null;
                Long expectedSettlementDate5 = kVar.getExpectedSettlementDate();
                Instant instantOfEpochMilli45 = expectedSettlementDate5 != null ? Instant.ofEpochMilli(expectedSettlementDate5.longValue()) : null;
                q0 q0VarB4 = h.b(kVar.getTimeInForce());
                Long startDate6 = kVar.getStartDate();
                Instant instantOfEpochMilli46 = startDate6 != null ? Instant.ofEpochMilli(startDate6.longValue()) : null;
                String period6 = kVar.getPeriod();
                sel.a aVarA6 = period6 != null ? k.a(period6) : null;
                Long scheduledExecutionDate6 = kVar.getScheduledExecutionDate();
                Instant instantOfEpochMilli47 = scheduledExecutionDate6 != null ? Instant.ofEpochMilli(scheduledExecutionDate6.longValue()) : null;
                s0 autoTopUp5 = kVar.getAutoTopUp();
                TradingAutoTopUp tradingAutoTopUpC5 = autoTopUp5 != null ? a.c(autoTopUp5) : null;
                String declineReason4 = kVar.getDeclineReason();
                String portfolioId4 = kVar.getPortfolioId();
                String badge4 = kVar.getBadge();
                k4l.e eVarB3 = badge4 != null ? xam.a.B(badge4) : null;
                orl.e initiatedBy3 = kVar.getInitiatedBy();
                investOptionOrder = new InvestMutualFundOrder(id15, compoundId6, dVarI6, zVar6, instantOfEpochMilli39, instantOfEpochMilli40, instantOfEpochMilli41, gVarC6, o0VarA6, r0VarA6, pairH6, initiatedBy3 != null ? h(initiatedBy3) : null, c(oVar), oVar.getBlocking(), investMutualFundOrderData2, dVarO30, symbol5, qVarL4, instrumentName5, dVarO31, dVarO32, bigDecimal8, dVarO33, dVarO34, dVarO35, dVarO36, bigDecimal9, instantOfEpochMilli44, instantOfEpochMilli45, q0VarB4, instantOfEpochMilli46, instantOfEpochMilli47, tradingAutoTopUpC5, declineReason4, aVarA6, portfolioId4, eVarB3);
            } else {
                if (!(oVar instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                k4l.d dVarI7 = i(oVar.getAccountType());
                String id16 = oVar.getId();
                String compoundId7 = oVar.getCompoundId();
                Instant instantOfEpochMilli48 = Instant.ofEpochMilli(oVar.getCreatedAt());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli48, "let(...)");
                Instant instantOfEpochMilli49 = Instant.ofEpochMilli(oVar.getUpdatedAt());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli49, "let(...)");
                Long completedAt7 = oVar.getCompletedAt();
                Instant instantOfEpochMilli50 = completedAt7 != null ? Instant.ofEpochMilli(completedAt7.longValue()) : null;
                bfl.g gVarC7 = f4l.a.c(oVar.getSide());
                o0 o0VarA7 = g.a(oVar.getState());
                r0 r0VarA7 = j.a(oVar.getOrderType());
                Pair pairH7 = cp5.d.H(oVar.getCurrencyPair());
                l lVar = (l) oVar;
                jo3.a thresholdPrice7 = lVar.getThresholdPrice();
                dj0.d dVarO37 = thresholdPrice7 != null ? mo3.a.o(thresholdPrice7) : null;
                String symbol6 = lVar.getSymbol();
                dfl.q qVarL5 = yh5.b.L(lVar.getValue());
                String instrumentType7 = oVar.getInstrumentType();
                if (instrumentType7 == null || (zVarA = tbl.a.a(instrumentType7)) == null) {
                    zVarA = z.UNSPECIFIED;
                }
                z zVar7 = zVarA;
                String instrumentName6 = lVar.getInstrumentName();
                dj0.d dVarO38 = mo3.a.o(lVar.getEstimatedNet());
                dj0.d dVarO39 = mo3.a.o(lVar.getEstimatedPrice());
                BigDecimal bigDecimal10 = new BigDecimal(lVar.getEstimatedQuantity());
                dj0.d dVarO40 = mo3.a.o(lVar.getEstimatedTotal());
                orl.m optionProperties = lVar.getOptionProperties();
                if (optionProperties != null) {
                    Intrinsics.checkNotNullParameter(optionProperties, "<this>");
                    String expirationDate6 = optionProperties.getExpirationDate();
                    if (expirationDate6 != null) {
                        try {
                            m.Companion companion = m.INSTANCE;
                            objA = LocalDate.parse(expirationDate6);
                        } catch (Throwable th10) {
                            m.Companion companion2 = m.INSTANCE;
                            objA = yhm.o.a(th10);
                        }
                        if (objA instanceof n) {
                            objA = null;
                        }
                        localDate = (LocalDate) objA;
                    } else {
                        localDate = null;
                    }
                    investOptionProperties = new InvestOptionProperties(localDate, optionProperties.getContractSize(), optionProperties.getUnderlyingCurrency());
                } else {
                    investOptionProperties = null;
                }
                jo3.a gross7 = lVar.getGross();
                dj0.d dVarO41 = gross7 != null ? mo3.a.o(gross7) : null;
                jo3.a net7 = lVar.getNet();
                dj0.d dVarO42 = net7 != null ? mo3.a.o(net7) : null;
                jo3.a executedPrice6 = lVar.getExecutedPrice();
                dj0.d dVarO43 = executedPrice6 != null ? mo3.a.o(executedPrice6) : null;
                String executedQuantity7 = lVar.getExecutedQuantity();
                BigDecimal bigDecimal11 = executedQuantity7 != null ? new BigDecimal(executedQuantity7) : null;
                Long expirationDate7 = lVar.getExpirationDate();
                Instant instantOfEpochMilli51 = expirationDate7 != null ? Instant.ofEpochMilli(expirationDate7.longValue()) : null;
                Long expectedSettlementDate6 = lVar.getExpectedSettlementDate();
                Instant instantOfEpochMilli52 = expectedSettlementDate6 != null ? Instant.ofEpochMilli(expectedSettlementDate6.longValue()) : null;
                q0 q0VarB5 = h.b(lVar.getTimeInForce());
                Long startDate7 = lVar.getStartDate();
                Instant instantOfEpochMilli53 = startDate7 != null ? Instant.ofEpochMilli(startDate7.longValue()) : null;
                String period7 = lVar.getPeriod();
                sel.a aVarA7 = period7 != null ? k.a(period7) : null;
                Long scheduledExecutionDate7 = lVar.getScheduledExecutionDate();
                Instant instantOfEpochMilli54 = scheduledExecutionDate7 != null ? Instant.ofEpochMilli(scheduledExecutionDate7.longValue()) : null;
                s0 autoTopUp6 = lVar.getAutoTopUp();
                TradingAutoTopUp tradingAutoTopUpC6 = autoTopUp6 != null ? a.c(autoTopUp6) : null;
                String declineReason5 = lVar.getDeclineReason();
                String portfolioId5 = lVar.getPortfolioId();
                String badge5 = lVar.getBadge();
                k4l.e eVarB4 = badge5 != null ? xam.a.B(badge5) : null;
                orl.e initiatedBy4 = lVar.getInitiatedBy();
                investOptionOrder = new InvestOptionOrder(id16, compoundId7, dVarI7, zVar7, instantOfEpochMilli48, instantOfEpochMilli49, instantOfEpochMilli50, gVarC7, o0VarA7, r0VarA7, pairH7, initiatedBy4 != null ? h(initiatedBy4) : null, c(oVar), oVar.getBlocking(), investOptionProperties, dVarO37, symbol6, qVarL5, instrumentName6, dVarO38, dVarO39, bigDecimal10, dVarO40, dVarO41, dVarO42, dVarO43, bigDecimal11, instantOfEpochMilli51, instantOfEpochMilli52, q0VarB5, instantOfEpochMilli53, instantOfEpochMilli54, tradingAutoTopUpC6, declineReason5, aVarA7, portfolioId5, eVarB4);
            }
            investFundOrder = investOptionOrder;
        }
        if (!(investFundOrder instanceof InvestOrder.InvestSecuritiesOrder)) {
            if (!(investFundOrder instanceof InvestCommodityOrder)) {
                if ((investFundOrder instanceof InvestMarginOrder) || (investFundOrder instanceof InvestFundOrder) || (investFundOrder instanceof InvestMutualFundOrder) || (investFundOrder instanceof InvestOptionOrder)) {
                    return investFundOrder;
                }
                throw new NoWhenBranchMatchedException();
            }
            InvestCommodityOrder investCommodityOrder = (InvestCommodityOrder) investFundOrder;
            if (!oi0.d.z(investCommodityOrder.f104512j) || investCommodityOrder.u == null) {
                return investCommodityOrder;
            }
            r0 orderType = r0.RECURRING;
            String id17 = investCommodityOrder.f104507a;
            Intrinsics.checkNotNullParameter(id17, "id");
            String compoundId8 = investCommodityOrder.f104508b;
            Intrinsics.checkNotNullParameter(compoundId8, "compoundId");
            k4l.d accountType = investCommodityOrder.f104509c;
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            z instrumentType8 = investCommodityOrder.d;
            Intrinsics.checkNotNullParameter(instrumentType8, "instrumentType");
            Instant createdAt = investCommodityOrder.e;
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            Instant updatedAt = investCommodityOrder.f;
            Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
            bfl.g side = investCommodityOrder.f104511h;
            Intrinsics.checkNotNullParameter(side, "side");
            o0 state = investCommodityOrder.i;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Pair currencyPair = investCommodityOrder.k;
            Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
            cfl.j accountHolderType = investCommodityOrder.f104514m;
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            dj0.d value = investCommodityOrder.f104516p;
            Intrinsics.checkNotNullParameter(value, "value");
            return new InvestCommodityOrder(id17, compoundId8, accountType, instrumentType8, createdAt, updatedAt, investCommodityOrder.f104510g, side, state, orderType, currencyPair, investCommodityOrder.f104513l, accountHolderType, investCommodityOrder.f104515n, investCommodityOrder.o, value, investCommodityOrder.f104517q, investCommodityOrder.f104518r, investCommodityOrder.f104519s, investCommodityOrder.f104520t, investCommodityOrder.u, investCommodityOrder.v, investCommodityOrder.f104521w);
        }
        r0 f104635j = investFundOrder.getF104635j();
        InvestOrder.InvestSecuritiesOrder investSecuritiesOrder = (InvestOrder.InvestSecuritiesOrder) investFundOrder;
        sel.a g3 = investSecuritiesOrder.getG();
        if (!oi0.d.z(f104635j) || g3 == null) {
            return investSecuritiesOrder;
        }
        InvestOrder investOrder = investFundOrder;
        if (investSecuritiesOrder instanceof InvestStockOrder) {
            InvestStockOrder investStockOrder = (InvestStockOrder) investOrder;
            r0 orderType2 = r0.RECURRING;
            String id18 = investStockOrder.f104613a;
            Intrinsics.checkNotNullParameter(id18, "id");
            String compoundId9 = investStockOrder.f104614b;
            Intrinsics.checkNotNullParameter(compoundId9, "compoundId");
            k4l.d accountType2 = investStockOrder.f104615c;
            Intrinsics.checkNotNullParameter(accountType2, "accountType");
            z instrumentType9 = investStockOrder.d;
            Intrinsics.checkNotNullParameter(instrumentType9, "instrumentType");
            Instant createdAt2 = investStockOrder.e;
            Intrinsics.checkNotNullParameter(createdAt2, "createdAt");
            Instant updatedAt2 = investStockOrder.f;
            Intrinsics.checkNotNullParameter(updatedAt2, "updatedAt");
            bfl.g side2 = investStockOrder.f104617h;
            Intrinsics.checkNotNullParameter(side2, "side");
            o0 state2 = investStockOrder.i;
            Intrinsics.checkNotNullParameter(state2, "state");
            Intrinsics.checkNotNullParameter(orderType2, "orderType");
            Pair currencyPair2 = investStockOrder.k;
            Intrinsics.checkNotNullParameter(currencyPair2, "currencyPair");
            cfl.j accountHolderType2 = investStockOrder.f104620m;
            Intrinsics.checkNotNullParameter(accountHolderType2, "accountHolderType");
            String symbol7 = investStockOrder.o;
            Intrinsics.checkNotNullParameter(symbol7, "symbol");
            dfl.q value2 = investStockOrder.f104622p;
            Intrinsics.checkNotNullParameter(value2, "value");
            String instrumentName7 = investStockOrder.f104623q;
            Intrinsics.checkNotNullParameter(instrumentName7, "instrumentName");
            dj0.d estimatedNet3 = investStockOrder.f104624r;
            Intrinsics.checkNotNullParameter(estimatedNet3, "estimatedNet");
            dj0.d estimatedPrice2 = investStockOrder.f104625s;
            Intrinsics.checkNotNullParameter(estimatedPrice2, "estimatedPrice");
            BigDecimal estimatedQuantity2 = investStockOrder.f104626t;
            Intrinsics.checkNotNullParameter(estimatedQuantity2, "estimatedQuantity");
            dj0.d estimatedTotal = investStockOrder.u;
            Intrinsics.checkNotNullParameter(estimatedTotal, "estimatedTotal");
            q0 timeInForce = investStockOrder.B;
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            String portfolioId6 = investStockOrder.H;
            Intrinsics.checkNotNullParameter(portfolioId6, "portfolioId");
            investTaaOrder = new InvestStockOrder(id18, compoundId9, accountType2, instrumentType9, createdAt2, updatedAt2, investStockOrder.f104616g, side2, state2, orderType2, currencyPair2, investStockOrder.f104619l, accountHolderType2, investStockOrder.f104621n, symbol7, value2, instrumentName7, estimatedNet3, estimatedPrice2, estimatedQuantity2, estimatedTotal, investStockOrder.v, investStockOrder.f104627w, investStockOrder.f104628x, investStockOrder.f104629y, investStockOrder.z, investStockOrder.A, timeInForce, investStockOrder.C, investStockOrder.D, investStockOrder.E, investStockOrder.F, investStockOrder.G, portfolioId6, investStockOrder.I, investStockOrder.J);
        } else {
            if (!(investSecuritiesOrder instanceof InvestTaaOrder)) {
                throw new NoWhenBranchMatchedException();
            }
            InvestTaaOrder investTaaOrder2 = (InvestTaaOrder) investOrder;
            r0 orderType3 = r0.RECURRING;
            String id19 = investTaaOrder2.f104630a;
            Intrinsics.checkNotNullParameter(id19, "id");
            String compoundId10 = investTaaOrder2.f104631b;
            Intrinsics.checkNotNullParameter(compoundId10, "compoundId");
            k4l.d accountType3 = investTaaOrder2.f104632c;
            Intrinsics.checkNotNullParameter(accountType3, "accountType");
            z instrumentType10 = investTaaOrder2.d;
            Intrinsics.checkNotNullParameter(instrumentType10, "instrumentType");
            Instant createdAt3 = investTaaOrder2.e;
            Intrinsics.checkNotNullParameter(createdAt3, "createdAt");
            Instant updatedAt3 = investTaaOrder2.f;
            Intrinsics.checkNotNullParameter(updatedAt3, "updatedAt");
            bfl.g side3 = investTaaOrder2.f104634h;
            Intrinsics.checkNotNullParameter(side3, "side");
            o0 state3 = investTaaOrder2.i;
            Intrinsics.checkNotNullParameter(state3, "state");
            Intrinsics.checkNotNullParameter(orderType3, "orderType");
            Pair currencyPair3 = investTaaOrder2.k;
            Intrinsics.checkNotNullParameter(currencyPair3, "currencyPair");
            cfl.j accountHolderType3 = investTaaOrder2.f104637m;
            Intrinsics.checkNotNullParameter(accountHolderType3, "accountHolderType");
            String symbol8 = investTaaOrder2.o;
            Intrinsics.checkNotNullParameter(symbol8, "symbol");
            dfl.q value3 = investTaaOrder2.f104639p;
            Intrinsics.checkNotNullParameter(value3, "value");
            String instrumentName8 = investTaaOrder2.f104640q;
            Intrinsics.checkNotNullParameter(instrumentName8, "instrumentName");
            dj0.d estimatedNet4 = investTaaOrder2.f104641r;
            Intrinsics.checkNotNullParameter(estimatedNet4, "estimatedNet");
            dj0.d estimatedPrice3 = investTaaOrder2.f104642s;
            Intrinsics.checkNotNullParameter(estimatedPrice3, "estimatedPrice");
            BigDecimal estimatedQuantity3 = investTaaOrder2.f104643t;
            Intrinsics.checkNotNullParameter(estimatedQuantity3, "estimatedQuantity");
            dj0.d estimatedTotal2 = investTaaOrder2.u;
            Intrinsics.checkNotNullParameter(estimatedTotal2, "estimatedTotal");
            q0 timeInForce2 = investTaaOrder2.B;
            Intrinsics.checkNotNullParameter(timeInForce2, "timeInForce");
            String portfolioId7 = investTaaOrder2.H;
            Intrinsics.checkNotNullParameter(portfolioId7, "portfolioId");
            investTaaOrder = new InvestTaaOrder(id19, compoundId10, accountType3, instrumentType10, createdAt3, updatedAt3, investTaaOrder2.f104633g, side3, state3, orderType3, currencyPair3, investTaaOrder2.f104636l, accountHolderType3, investTaaOrder2.f104638n, symbol8, value3, instrumentName8, estimatedNet4, estimatedPrice3, estimatedQuantity3, estimatedTotal2, investTaaOrder2.v, investTaaOrder2.f104644w, investTaaOrder2.f104645x, investTaaOrder2.f104646y, investTaaOrder2.z, investTaaOrder2.A, timeInForce2, investTaaOrder2.C, investTaaOrder2.D, investTaaOrder2.E, investTaaOrder2.F, investTaaOrder2.G, portfolioId7, investTaaOrder2.I, investTaaOrder2.J);
        }
        return investTaaOrder;
    }

    public static final dfl.o0 g(krl.a aVar) {
        return new dfl.o0(aVar.getId(), aVar.getName(), aVar.getFirstName(), aVar.getLastName(), aVar.getCode(), a(aVar.getFirstName(), aVar.getLastName(), aVar.getName()));
    }

    public static final dfl.o0 h(orl.e eVar) {
        return new dfl.o0(eVar.getId(), eVar.getName(), eVar.getFirstName(), eVar.getLastName(), eVar.getCode(), a(eVar.getFirstName(), eVar.getLastName(), eVar.getName()));
    }

    public static final k4l.d i(orl.n nVar) {
        int i = c.f208157a[nVar.ordinal()];
        if (i == 1) {
            return k4l.d.COMMODITIES;
        }
        if (i == 2) {
            return k4l.d.MARGIN;
        }
        if (i == 3) {
            return k4l.d.STOCKS;
        }
        if (i == 4) {
            return k4l.d.TAA;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final krl.a j(dfl.o0 o0Var) {
        return new krl.a(o0Var.f114446a, o0Var.f114447b, o0Var.f114448c, o0Var.d, o0Var.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Map] */
    public static final krl.k k(InvestOrder investOrder) {
        krl.i iVar;
        Intrinsics.checkNotNullParameter(investOrder, "<this>");
        String f104630a = investOrder.getF104630a();
        String strName = investOrder.getF104632c().name();
        String f104631b = investOrder.getF104631b();
        long epochMilli = investOrder.getE().toEpochMilli();
        long epochMilli2 = investOrder.getF().toEpochMilli();
        Instant f104633g = investOrder.getF104633g();
        Long lValueOf = f104633g != null ? Long.valueOf(f104633g.toEpochMilli()) : null;
        String strA = f4l.a.a(investOrder.getF104634h());
        o0 i = investOrder.getI();
        Object obj2 = g.f208161a;
        Intrinsics.checkNotNullParameter(i, "<this>");
        String strG = u1.g(i, g.f208161a);
        r0 f104635j = investOrder.getF104635j();
        Object obj3 = j.f208164a;
        Intrinsics.checkNotNullParameter(f104635j, "<this>");
        String strG2 = u1.g(f104635j, j.f208164a);
        String str = ((xi0.b) investOrder.getK().f186385a).f306286a;
        String str2 = ((xi0.b) investOrder.getK().f186386b).f306286a;
        String strB = tbl.a.b(investOrder.getD());
        String strName2 = investOrder.getF104637m().name();
        dfl.o0 f104636l = investOrder.getF104636l();
        krl.k kVar = new krl.k(f104630a, strName, f104631b, epochMilli, epochMilli2, lValueOf, strA, strG, strG2, str, str2, null, strB, null, null, null, null, null, null, null, f104636l != null ? j(f104636l) : null, strName2, investOrder.getJ(), com.revolut.retail.trading.core.domain.orders.a.e(investOrder));
        if (investOrder instanceof InvestStockOrder) {
            InvestStockOrder investStockOrder = (InvestStockOrder) investOrder;
            String str3 = investStockOrder.o;
            dj0.d dVar = investStockOrder.f104621n;
            jo3.b bVarA = dVar != null ? hx7.a.A(dVar) : null;
            r rVarD = yh5.b.D(investStockOrder.f104622p);
            String str4 = investStockOrder.f104623q;
            jo3.b bVarA2 = hx7.a.A(investStockOrder.f104624r);
            jo3.b bVarA3 = hx7.a.A(investStockOrder.f104625s);
            String string = investStockOrder.f104626t.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            jo3.b bVarA4 = hx7.a.A(investStockOrder.u);
            dj0.d dVar2 = investStockOrder.v;
            jo3.b bVarA5 = dVar2 != null ? hx7.a.A(dVar2) : null;
            dj0.d dVar3 = investStockOrder.f104627w;
            jo3.b bVarA6 = dVar3 != null ? hx7.a.A(dVar3) : null;
            dj0.d dVar4 = investStockOrder.f104628x;
            jo3.b bVarA7 = dVar4 != null ? hx7.a.A(dVar4) : null;
            BigDecimal bigDecimal = investStockOrder.f104629y;
            String string2 = bigDecimal != null ? bigDecimal.toString() : null;
            Instant instant = investStockOrder.z;
            Long lValueOf2 = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
            Instant instant2 = investStockOrder.A;
            Long lValueOf3 = instant2 != null ? Long.valueOf(instant2.toEpochMilli()) : null;
            String strA2 = h.a(investStockOrder.B);
            Instant instant3 = investStockOrder.C;
            Long lValueOf4 = instant3 != null ? Long.valueOf(instant3.toEpochMilli()) : null;
            sel.a aVar = investStockOrder.G;
            String strB2 = aVar != null ? k.b(aVar) : null;
            Instant instant4 = investStockOrder.D;
            Long lValueOf5 = instant4 != null ? Long.valueOf(instant4.toEpochMilli()) : null;
            TradingAutoTopUp tradingAutoTopUp = investStockOrder.E;
            s sVarA = tradingAutoTopUp != null ? a.a(tradingAutoTopUp) : null;
            String str5 = investStockOrder.F;
            String str6 = investStockOrder.H;
            k4l.e eVar = investStockOrder.I;
            String strName3 = eVar != null ? eVar.name() : null;
            dfl.o0 o0Var = investStockOrder.f104619l;
            return krl.k.a(kVar, str3, new p(bVarA, rVarD, str4, bVarA2, bVarA3, string, bVarA4, bVarA5, bVarA6, bVarA7, string2, lValueOf2, lValueOf3, strA2, lValueOf4, strB2, lValueOf5, sVarA, str5, str6, strName3, o0Var != null ? j(o0Var) : null), null, null, null, null, null, null, 16766975);
        }
        if (investOrder instanceof InvestTaaOrder) {
            InvestTaaOrder investTaaOrder = (InvestTaaOrder) investOrder;
            String str7 = investTaaOrder.o;
            dj0.d dVar5 = investTaaOrder.f104638n;
            jo3.b bVarA8 = dVar5 != null ? hx7.a.A(dVar5) : null;
            r rVarD2 = yh5.b.D(investTaaOrder.f104639p);
            String str8 = investTaaOrder.f104640q;
            jo3.b bVarA9 = hx7.a.A(investTaaOrder.f104641r);
            jo3.b bVarA10 = hx7.a.A(investTaaOrder.f104642s);
            String string3 = investTaaOrder.f104643t.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            jo3.b bVarA11 = hx7.a.A(investTaaOrder.u);
            dj0.d dVar6 = investTaaOrder.v;
            jo3.b bVarA12 = dVar6 != null ? hx7.a.A(dVar6) : null;
            dj0.d dVar7 = investTaaOrder.f104644w;
            jo3.b bVarA13 = dVar7 != null ? hx7.a.A(dVar7) : null;
            dj0.d dVar8 = investTaaOrder.f104645x;
            jo3.b bVarA14 = dVar8 != null ? hx7.a.A(dVar8) : null;
            BigDecimal bigDecimal2 = investTaaOrder.f104646y;
            String string4 = bigDecimal2 != null ? bigDecimal2.toString() : null;
            Instant instant5 = investTaaOrder.z;
            Long lValueOf6 = instant5 != null ? Long.valueOf(instant5.toEpochMilli()) : null;
            Instant instant6 = investTaaOrder.A;
            Long lValueOf7 = instant6 != null ? Long.valueOf(instant6.toEpochMilli()) : null;
            String strA3 = h.a(investTaaOrder.B);
            Instant instant7 = investTaaOrder.C;
            Long lValueOf8 = instant7 != null ? Long.valueOf(instant7.toEpochMilli()) : null;
            sel.a aVar2 = investTaaOrder.G;
            String strB3 = aVar2 != null ? k.b(aVar2) : null;
            Instant instant8 = investTaaOrder.D;
            Long lValueOf9 = instant8 != null ? Long.valueOf(instant8.toEpochMilli()) : null;
            TradingAutoTopUp tradingAutoTopUp2 = investTaaOrder.E;
            s sVarA2 = tradingAutoTopUp2 != null ? a.a(tradingAutoTopUp2) : null;
            String str9 = investTaaOrder.F;
            String str10 = investTaaOrder.H;
            k4l.e eVar2 = investTaaOrder.I;
            return krl.k.a(kVar, str7, null, new q(bVarA8, rVarD2, str8, bVarA9, bVarA10, string3, bVarA11, bVarA12, bVarA13, bVarA14, string4, lValueOf6, lValueOf7, strA3, lValueOf8, strB3, lValueOf9, sVarA2, str9, str10, eVar2 != null ? eVar2.name() : null), null, null, null, null, null, 16758783);
        }
        if (investOrder instanceof InvestCommodityOrder) {
            InvestCommodityOrder investCommodityOrder = (InvestCommodityOrder) investOrder;
            dj0.d dVar9 = investCommodityOrder.o;
            jo3.b bVarA15 = dVar9 != null ? hx7.a.A(dVar9) : null;
            jo3.b bVarA16 = hx7.a.A(investCommodityOrder.f104516p);
            dj0.d dVar10 = investCommodityOrder.f104517q;
            jo3.b bVarA17 = dVar10 != null ? hx7.a.A(dVar10) : null;
            dj0.d dVar11 = investCommodityOrder.f104518r;
            jo3.b bVarA18 = dVar11 != null ? hx7.a.A(dVar11) : null;
            BigDecimal bigDecimal3 = investCommodityOrder.f104519s;
            String string5 = bigDecimal3 != null ? bigDecimal3.toString() : null;
            Instant instant9 = investCommodityOrder.f104520t;
            Long lValueOf10 = instant9 != null ? Long.valueOf(instant9.toEpochMilli()) : null;
            sel.a aVar3 = investCommodityOrder.u;
            String strB4 = aVar3 != null ? k.b(aVar3) : null;
            Instant instant10 = investCommodityOrder.v;
            Long lValueOf11 = instant10 != null ? Long.valueOf(instant10.toEpochMilli()) : null;
            InvestCommodityOrder.ErrorCode errorCode = investCommodityOrder.f104521w;
            return krl.k.a(kVar, null, null, null, new krl.b(bVarA15, bVarA16, bVarA17, bVarA18, string5, lValueOf10, strB4, lValueOf11, errorCode != null ? Integer.valueOf(errorCode.f104522a) : null), null, null, null, null, 16744447);
        }
        if (investOrder instanceof InvestMarginOrder) {
            InvestMarginOrder investMarginOrder = (InvestMarginOrder) investOrder;
            String str11 = investMarginOrder.o;
            BigDecimal bigDecimal4 = investMarginOrder.f104556p;
            BigDecimal bigDecimal5 = investMarginOrder.f104557q;
            dj0.d dVar12 = investMarginOrder.f104558r;
            jo3.b bVarA19 = dVar12 != null ? hx7.a.A(dVar12) : null;
            jo3.b bVarA20 = hx7.a.A(investMarginOrder.f104559s);
            Instant instant11 = investMarginOrder.f104560t;
            Long lValueOf12 = instant11 != null ? Long.valueOf(instant11.toEpochMilli()) : null;
            ej0.b bVar = investMarginOrder.u;
            ko3.b bVarM = bVar != null ? cp5.c.M(bVar) : null;
            ej0.b bVar2 = investMarginOrder.v;
            ko3.b bVarM2 = bVar2 != null ? cp5.c.M(bVar2) : null;
            TradingAutoTopUp tradingAutoTopUp3 = investMarginOrder.f104561w;
            s sVarA3 = tradingAutoTopUp3 != null ? a.a(tradingAutoTopUp3) : null;
            dj0.d dVar13 = investMarginOrder.f104562x;
            jo3.b bVarA21 = dVar13 != null ? hx7.a.A(dVar13) : null;
            Instant instant12 = investMarginOrder.f104563y;
            Long lValueOf13 = instant12 != null ? Long.valueOf(instant12.toEpochMilli()) : null;
            String str12 = investMarginOrder.z;
            dj0.d dVar14 = investMarginOrder.A;
            jo3.b bVarA22 = dVar14 != null ? hx7.a.A(dVar14) : null;
            sel.a aVar4 = investMarginOrder.B;
            String strB5 = aVar4 != null ? k.b(aVar4) : null;
            Instant instant13 = investMarginOrder.C;
            Long lValueOf14 = instant13 != null ? Long.valueOf(instant13.toEpochMilli()) : null;
            Instant instant14 = investMarginOrder.D;
            Long lValueOf15 = instant14 != null ? Long.valueOf(instant14.toEpochMilli()) : null;
            ej0.b bVar3 = investMarginOrder.E;
            return krl.k.a(kVar, null, null, null, null, new krl.e(str11, bigDecimal4, bigDecimal5, bVarA19, bVarA20, lValueOf12, bVarM, bVarM2, sVarA3, bVarA21, lValueOf13, str12, bVarA22, strB5, lValueOf14, lValueOf15, bVar3 != null ? cp5.c.M(bVar3) : null, h.a(investMarginOrder.F), yh5.b.D(investMarginOrder.G), hx7.a.A(investMarginOrder.H), hx7.a.A(investMarginOrder.I), investMarginOrder.J, hx7.a.A(investMarginOrder.K), investMarginOrder.L, investMarginOrder.M), null, null, null, 16711679);
        }
        if (investOrder instanceof InvestFundOrder) {
            InvestFundOrder investFundOrder = (InvestFundOrder) investOrder;
            String str13 = investFundOrder.f104535q;
            dj0.d dVar15 = investFundOrder.f104534p;
            jo3.b bVarA23 = dVar15 != null ? hx7.a.A(dVar15) : null;
            r rVarD3 = yh5.b.D(investFundOrder.f104536r);
            String str14 = investFundOrder.f104537s;
            jo3.b bVarA24 = hx7.a.A(investFundOrder.f104538t);
            jo3.b bVarA25 = hx7.a.A(investFundOrder.u);
            String string6 = investFundOrder.v.toString();
            Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
            jo3.b bVarA26 = hx7.a.A(investFundOrder.f104539w);
            InvestFundOrderData investFundOrderData = investFundOrder.o;
            Intrinsics.checkNotNullParameter(investFundOrderData, "<this>");
            long epochMilli3 = investFundOrderData.f104542a.toEpochMilli();
            Instant instant15 = investFundOrderData.f104543b;
            krl.c cVar = new krl.c(epochMilli3, instant15 != null ? Long.valueOf(instant15.toEpochMilli()) : null, investFundOrderData.f104544c.toEpochMilli(), investFundOrderData.d.toEpochMilli(), investFundOrderData.e.toEpochMilli());
            dj0.d dVar16 = investFundOrder.f104540x;
            jo3.b bVarA27 = dVar16 != null ? hx7.a.A(dVar16) : null;
            dj0.d dVar17 = investFundOrder.f104541y;
            jo3.b bVarA28 = dVar17 != null ? hx7.a.A(dVar17) : null;
            dj0.d dVar18 = investFundOrder.z;
            jo3.b bVarA29 = dVar18 != null ? hx7.a.A(dVar18) : null;
            BigDecimal bigDecimal6 = investFundOrder.A;
            String string7 = bigDecimal6 != null ? bigDecimal6.toString() : null;
            Instant instant16 = investFundOrder.B;
            Long lValueOf16 = instant16 != null ? Long.valueOf(instant16.toEpochMilli()) : null;
            Instant instant17 = investFundOrder.C;
            Long lValueOf17 = instant17 != null ? Long.valueOf(instant17.toEpochMilli()) : null;
            String strA4 = h.a(investFundOrder.D);
            Instant instant18 = investFundOrder.E;
            Long lValueOf18 = instant18 != null ? Long.valueOf(instant18.toEpochMilli()) : null;
            sel.a aVar5 = investFundOrder.I;
            String strB6 = aVar5 != null ? k.b(aVar5) : null;
            Instant instant19 = investFundOrder.F;
            Long lValueOf19 = instant19 != null ? Long.valueOf(instant19.toEpochMilli()) : null;
            TradingAutoTopUp tradingAutoTopUp4 = investFundOrder.G;
            s sVarA4 = tradingAutoTopUp4 != null ? a.a(tradingAutoTopUp4) : null;
            String str15 = investFundOrder.H;
            String str16 = investFundOrder.J;
            k4l.e eVar3 = investFundOrder.K;
            String strName4 = eVar3 != null ? eVar3.name() : null;
            dfl.o0 o0Var2 = investFundOrder.f104531l;
            return krl.k.a(kVar, str13, null, null, null, null, new krl.d(cVar, bVarA23, rVarD3, str14, bVarA24, bVarA25, string6, bVarA26, bVarA27, bVarA28, bVarA29, string7, lValueOf16, lValueOf17, strA4, lValueOf18, strB6, lValueOf19, sVarA4, str15, str16, strName4, o0Var2 != null ? j(o0Var2) : null), null, null, 16644095);
        }
        if (investOrder instanceof InvestMutualFundOrder) {
            InvestMutualFundOrder investMutualFundOrder = (InvestMutualFundOrder) investOrder;
            String str17 = investMutualFundOrder.f104577q;
            dj0.d dVar19 = investMutualFundOrder.f104576p;
            jo3.b bVarA30 = dVar19 != null ? hx7.a.A(dVar19) : null;
            r rVarD4 = yh5.b.D(investMutualFundOrder.f104578r);
            String str18 = investMutualFundOrder.f104579s;
            jo3.b bVarA31 = hx7.a.A(investMutualFundOrder.f104580t);
            jo3.b bVarA32 = hx7.a.A(investMutualFundOrder.u);
            String string8 = investMutualFundOrder.v.toString();
            Intrinsics.checkNotNullExpressionValue(string8, "toString(...)");
            jo3.b bVarA33 = hx7.a.A(investMutualFundOrder.f104581w);
            InvestMutualFundOrderData investMutualFundOrderData = investMutualFundOrder.o;
            Intrinsics.checkNotNullParameter(investMutualFundOrderData, "<this>");
            krl.f fVar = new krl.f(investMutualFundOrderData.f104584a.toEpochMilli(), investMutualFundOrderData.f104585b.toEpochMilli());
            dj0.d dVar20 = investMutualFundOrder.f104582x;
            jo3.b bVarA34 = dVar20 != null ? hx7.a.A(dVar20) : null;
            dj0.d dVar21 = investMutualFundOrder.f104583y;
            jo3.b bVarA35 = dVar21 != null ? hx7.a.A(dVar21) : null;
            dj0.d dVar22 = investMutualFundOrder.z;
            jo3.b bVarA36 = dVar22 != null ? hx7.a.A(dVar22) : null;
            BigDecimal bigDecimal7 = investMutualFundOrder.A;
            String string9 = bigDecimal7 != null ? bigDecimal7.toString() : null;
            Instant instant20 = investMutualFundOrder.B;
            Long lValueOf20 = instant20 != null ? Long.valueOf(instant20.toEpochMilli()) : null;
            Instant instant21 = investMutualFundOrder.C;
            Long lValueOf21 = instant21 != null ? Long.valueOf(instant21.toEpochMilli()) : null;
            String strA5 = h.a(investMutualFundOrder.D);
            Instant instant22 = investMutualFundOrder.E;
            Long lValueOf22 = instant22 != null ? Long.valueOf(instant22.toEpochMilli()) : null;
            sel.a aVar6 = investMutualFundOrder.I;
            String strB7 = aVar6 != null ? k.b(aVar6) : null;
            Instant instant23 = investMutualFundOrder.F;
            Long lValueOf23 = instant23 != null ? Long.valueOf(instant23.toEpochMilli()) : null;
            TradingAutoTopUp tradingAutoTopUp5 = investMutualFundOrder.G;
            s sVarA5 = tradingAutoTopUp5 != null ? a.a(tradingAutoTopUp5) : null;
            String str19 = investMutualFundOrder.H;
            String str20 = investMutualFundOrder.J;
            k4l.e eVar4 = investMutualFundOrder.K;
            String strName5 = eVar4 != null ? eVar4.name() : null;
            dfl.o0 o0Var3 = investMutualFundOrder.f104573l;
            return krl.k.a(kVar, str17, null, null, null, null, null, new krl.g(fVar, bVarA30, rVarD4, str18, bVarA31, bVarA32, string8, bVarA33, bVarA34, bVarA35, bVarA36, string9, lValueOf20, lValueOf21, strA5, lValueOf22, strB7, lValueOf23, sVarA5, str19, str20, strName5, o0Var3 != null ? j(o0Var3) : null), null, 16513023);
        }
        if (!(investOrder instanceof InvestOptionOrder)) {
            throw new NoWhenBranchMatchedException();
        }
        InvestOptionOrder investOptionOrder = (InvestOptionOrder) investOrder;
        String str21 = investOptionOrder.f104598q;
        dj0.d dVar23 = investOptionOrder.f104597p;
        jo3.b bVarA37 = dVar23 != null ? hx7.a.A(dVar23) : null;
        r rVarD5 = yh5.b.D(investOptionOrder.f104599r);
        String str22 = investOptionOrder.f104600s;
        jo3.b bVarA38 = hx7.a.A(investOptionOrder.f104601t);
        jo3.b bVarA39 = hx7.a.A(investOptionOrder.u);
        String string10 = investOptionOrder.v.toString();
        Intrinsics.checkNotNullExpressionValue(string10, "toString(...)");
        jo3.b bVarA40 = hx7.a.A(investOptionOrder.f104602w);
        InvestOptionProperties investOptionProperties = investOptionOrder.o;
        if (investOptionProperties != null) {
            Intrinsics.checkNotNullParameter(investOptionProperties, "<this>");
            LocalDate localDate = investOptionProperties.f104607a;
            iVar = new krl.i(localDate != null ? localDate.toString() : null, investOptionProperties.f104608b, investOptionProperties.f104609c);
        } else {
            iVar = null;
        }
        dj0.d dVar24 = investOptionOrder.f104603x;
        jo3.b bVarA41 = dVar24 != null ? hx7.a.A(dVar24) : null;
        dj0.d dVar25 = investOptionOrder.f104604y;
        jo3.b bVarA42 = dVar25 != null ? hx7.a.A(dVar25) : null;
        dj0.d dVar26 = investOptionOrder.z;
        jo3.b bVarA43 = dVar26 != null ? hx7.a.A(dVar26) : null;
        BigDecimal bigDecimal8 = investOptionOrder.A;
        String string11 = bigDecimal8 != null ? bigDecimal8.toString() : null;
        Instant instant24 = investOptionOrder.B;
        Long lValueOf24 = instant24 != null ? Long.valueOf(instant24.toEpochMilli()) : null;
        Instant instant25 = investOptionOrder.C;
        Long lValueOf25 = instant25 != null ? Long.valueOf(instant25.toEpochMilli()) : null;
        String strA6 = h.a(investOptionOrder.D);
        Instant instant26 = investOptionOrder.E;
        Long lValueOf26 = instant26 != null ? Long.valueOf(instant26.toEpochMilli()) : null;
        sel.a aVar7 = investOptionOrder.I;
        String strB8 = aVar7 != null ? k.b(aVar7) : null;
        Instant instant27 = investOptionOrder.F;
        Long lValueOf27 = instant27 != null ? Long.valueOf(instant27.toEpochMilli()) : null;
        TradingAutoTopUp tradingAutoTopUp6 = investOptionOrder.G;
        s sVarA6 = tradingAutoTopUp6 != null ? a.a(tradingAutoTopUp6) : null;
        String str23 = investOptionOrder.H;
        String str24 = investOptionOrder.J;
        k4l.e eVar5 = investOptionOrder.K;
        String strName6 = eVar5 != null ? eVar5.name() : null;
        dfl.o0 o0Var4 = investOptionOrder.f104594l;
        return krl.k.a(kVar, str21, null, null, null, null, null, null, new krl.h(iVar, bVarA37, rVarD5, str22, bVarA38, bVarA39, string10, bVarA40, bVarA41, bVarA42, bVarA43, string11, lValueOf24, lValueOf25, strA6, lValueOf26, strB8, lValueOf27, sVarA6, str23, str24, strName6, o0Var4 != null ? j(o0Var4) : null), 16250879);
    }
}
