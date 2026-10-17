package nfk;

import gfk.k;
import gfk.m;
import gfk.o;
import java.math.BigDecimal;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mha.g;
import mha.h;
import mha.j;
import mha.n;
import mha.p;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d {
    public static final h a(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar instanceof k.f) {
            k.f fVar = (k.f) kVar;
            BigDecimal discountPercentage = fVar.getDiscountPercentage();
            if (discountPercentage != null) {
                return new mha.f(fVar.getPricingPlanId(), discountPercentage);
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PlanLimitDto.TransferLimitDto", "missing discountPercentage field for transfer limit", null, h0Var);
            return null;
        }
        if (kVar instanceof k.d) {
            k.d dVar = (k.d) kVar;
            xi0.a aVar = xi0.b.Companion;
            String currency = dVar.getCurrency();
            aVar.getClass();
            xi0.b bVarA = xi0.a.a(currency);
            o limit = dVar.getLimit();
            p pVarI = limit != null ? ksj.b.I(limit, bVarA) : null;
            if (pVarI == null || (pVarI instanceof n)) {
                n nVar = pVarI instanceof n ? (n) pVarI : null;
                return new mha.d(dVar.getPricingPlanId(), bVarA, nVar != null ? nVar.f205461a : null);
            }
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PlanLimitDto.ExchangeLimitDto", "unsupported limit value for exchange limit", null, h0Var2);
            return null;
        }
        if (kVar instanceof k.h) {
            k.h hVar = (k.h) kVar;
            xi0.a aVar2 = xi0.b.Companion;
            String currency2 = hVar.getCurrency();
            aVar2.getClass();
            xi0.b bVarA2 = xi0.a.a(currency2);
            m fee2 = hVar.getFee();
            mha.k kVarD = fee2 != null ? ksj.b.D(fee2, bVarA2) : null;
            if (kVarD == null ? true : kVarD instanceof j) {
                return new g(hVar.getPricingPlanId(), bVarA2, (j) kVarD);
            }
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PlanLimitDto.WeekendExchangeLimitDto", "unsupported fee value", null, h0Var3);
            return null;
        }
        if (kVar instanceof k.c) {
            k.c cVar = (k.c) kVar;
            xi0.a aVar3 = xi0.b.Companion;
            String currency3 = cVar.getCurrency();
            aVar3.getClass();
            xi0.b bVarA3 = xi0.a.a(currency3);
            o limit2 = cVar.getLimit();
            p pVarI2 = limit2 != null ? ksj.b.I(limit2, bVarA3) : null;
            n nVar2 = pVarI2 instanceof n ? (n) pVarI2 : null;
            m fee3 = cVar.getFee();
            mha.k kVarD2 = fee3 != null ? ksj.b.D(fee3, bVarA3) : null;
            if (kVarD2 == null) {
                h0 h0Var4 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PlanLimitDto.CryptoExchangeLimit", "missing fee value", null, h0Var4);
                return null;
            }
            if (!(kVarD2 instanceof j)) {
                h0 h0Var5 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PlanLimitDto.CryptoExchangeLimit", "unsupported fee value", null, h0Var5);
                return null;
            }
            m highestFee = cVar.getHighestFee();
            mha.k kVarD3 = highestFee != null ? ksj.b.D(highestFee, bVarA3) : null;
            if (kVarD3 instanceof j) {
                return new mha.c(cVar.getPricingPlanId(), bVarA3, nVar2 != null ? nVar2.f205461a : null, (j) kVarD2, (j) kVarD3);
            }
            h0 h0Var6 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList6 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PlanLimitDto.CryptoExchangeLimit", "unsupported highestFee value", null, h0Var6);
            return null;
        }
        if (kVar instanceof k.b) {
            k.b bVar = (k.b) kVar;
            xi0.a aVar4 = xi0.b.Companion;
            String currency4 = bVar.getCurrency();
            aVar4.getClass();
            xi0.b bVarA4 = xi0.a.a(currency4);
            m fee4 = bVar.getFee();
            mha.k kVarD4 = fee4 != null ? ksj.b.D(fee4, bVarA4) : null;
            if (kVarD4 == null) {
                h0 h0Var7 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList7 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PlanLimitDto.CommodityExchangeLimitDto", "missing fee value", null, h0Var7);
                return null;
            }
            if (!(kVarD4 instanceof j)) {
                h0 h0Var8 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList8 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PlanLimitDto.CommodityExchangeLimitDto", "unsupported fee value: " + kVarD4, null, h0Var8);
                return null;
            }
            m highestFee2 = bVar.getHighestFee();
            mha.k kVarD5 = highestFee2 != null ? ksj.b.D(highestFee2, bVarA4) : null;
            if (kVarD5 instanceof j) {
                return new mha.b(bVar.getPricingPlanId(), bVarA4, (j) kVarD4, (j) kVarD5);
            }
            h0 h0Var9 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList9 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PlanLimitDto.CommodityExchangeLimitDto", "unsupported highestFee value: " + kVarD5, null, h0Var9);
            return null;
        }
        if (kVar instanceof k.e) {
            k.e eVar = (k.e) kVar;
            xi0.a aVar5 = xi0.b.Companion;
            String currency5 = eVar.getCurrency();
            aVar5.getClass();
            xi0.b bVarA5 = xi0.a.a(currency5);
            m fee5 = eVar.getFee();
            mha.k kVarD6 = fee5 != null ? ksj.b.D(fee5, bVarA5) : null;
            o limit3 = eVar.getLimit();
            p pVarI3 = limit3 != null ? ksj.b.I(limit3, bVarA5) : null;
            mha.o oVar = pVarI3 instanceof mha.o ? (mha.o) pVarI3 : null;
            if (kVarD6 == null) {
                h0 h0Var10 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList10 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PlanLimitDto.TradeLimitDto", "missing fee value", null, h0Var10);
                return null;
            }
            if (kVarD6 instanceof j) {
                return new mha.e(eVar.getPricingPlanId(), bVarA5, oVar != null ? Long.valueOf(oVar.f205462a) : null, (j) kVarD6);
            }
            h0 h0Var11 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList11 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PlanLimitDto.TradeLimitDto", "unsupported fee value: " + kVarD6, null, h0Var11);
            return null;
        }
        if (!(kVar instanceof k.a)) {
            if (kVar instanceof k.g) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        k.a aVar6 = (k.a) kVar;
        xi0.a aVar7 = xi0.b.Companion;
        String currency6 = aVar6.getCurrency();
        aVar7.getClass();
        xi0.b bVarA6 = xi0.a.a(currency6);
        o limit4 = aVar6.getLimit();
        p pVarI4 = limit4 != null ? ksj.b.I(limit4, bVarA6) : null;
        n nVar3 = pVarI4 instanceof n ? (n) pVarI4 : null;
        if (nVar3 == null) {
            h0 h0Var12 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList12 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PlanLimitDto.AtmLimitDto", "missing limit value", null, h0Var12);
            return null;
        }
        m fee6 = aVar6.getFee();
        mha.k kVarD7 = fee6 != null ? ksj.b.D(fee6, bVarA6) : null;
        if (kVarD7 == null) {
            h0 h0Var13 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList13 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PlanLimitDto.AtmLimitDto", "missing fee value", null, h0Var13);
            return null;
        }
        if (kVarD7 instanceof j) {
            return new mha.a(aVar6.getPricingPlanId(), bVarA6, nVar3.f205461a, (j) kVarD7);
        }
        h0 h0Var14 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList14 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "PlanLimitDto.AtmLimitDto", "unsupported fee value: " + kVarD7, null, h0Var14);
        return null;
    }
}
