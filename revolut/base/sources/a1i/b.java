package a1i;

import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.exchange.models.ExchangeOrderInfo;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import wd6.e;
import wd6.f;
import wd6.g;
import wd6.j;
import z0i.h;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public static final h a(ExchangeOrderInfo exchangeOrderInfo) {
        return new h(exchangeOrderInfo.f72137a, exchangeOrderInfo.f72138b, u1.g(exchangeOrderInfo.f72139c, c.f636a), u1.g(exchangeOrderInfo.d, c.f637b), d.d(new Pair(exchangeOrderInfo.e, exchangeOrderInfo.f)), mo3.a.p(exchangeOrderInfo.f72140g), String.valueOf(exchangeOrderInfo.f72141h), exchangeOrderInfo.i, exchangeOrderInfo.f72142j, u1.g(j.ACTIVE, c.f638c), "0", null, null, null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public static final ExchangeOrderInfo b(z0i.c cVar, z0i.d dVar) {
        Pair pairH = d.H(dVar.getCurrencyPair());
        xi0.b bVar = (xi0.b) pairH.f186385a;
        xi0.b bVar2 = (xi0.b) pairH.f186386b;
        String id10 = cVar.getId();
        String compoundId = cVar.getCompoundId();
        if (compoundId == null) {
            compoundId = com.google.android.gms.internal.mlkit_vision_face.a.o(f.FX_ORDER.a(), ":", cVar.getId());
        }
        return new ExchangeOrderInfo(id10, compoundId, (wd6.h) u1.u(cVar.getOrderType(), c.f636a), (e) u1.u(dVar.getExchangeMode(), c.f637b), bVar, bVar2, mo3.a.o(dVar.getAmount()), Double.parseDouble(cVar.getTargetRate()), cVar.getCreatedDate(), cVar.getUpdatedDate());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public static final ExchangeOrderInfo c(h hVar) {
        Pair pairH = d.H(hVar.getCurrencyPair());
        return new ExchangeOrderInfo(hVar.getId(), hVar.getCompoundId(), (wd6.h) u1.u(hVar.getOrderType(), c.f636a), (e) u1.u(hVar.getExchangeMode(), c.f637b), (xi0.b) pairH.f186385a, (xi0.b) pairH.f186386b, mo3.a.o(hVar.getAmount()), Double.parseDouble(hVar.getTargetRate()), hVar.getCreatedDate(), hVar.getUpdatedDate());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public static final ExchangeOrder d(h hVar) {
        dj0.d dVarO;
        dj0.d dVarO2;
        g gVar;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        int i = a.f635a[((j) u1.u(hVar.getState(), c.f638c)).ordinal()];
        if (i == 1) {
            return new ExchangeOrder.Active(c(hVar), null);
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ExchangeOrderInfo exchangeOrderInfoC = c(hVar);
            Integer errorCode = hVar.getErrorCode();
            if (errorCode == null || (gVar = (g) u1.v(errorCode, c.d)) == null) {
                gVar = g.UNKNOWN;
            }
            return new ExchangeOrder.Failed(exchangeOrderInfoC, null, gVar);
        }
        ExchangeOrderInfo exchangeOrderInfoC2 = c(hVar);
        String executedRate = hVar.getExecutedRate();
        double d = executedRate != null ? Double.parseDouble(executedRate) : 0.0d;
        jo3.a baseExecutedAmount = hVar.getBaseExecutedAmount();
        if (baseExecutedAmount != null) {
            dVarO = mo3.a.o(baseExecutedAmount);
        } else {
            dj0.d.Companion.getClass();
            dVarO = dj0.d.d;
        }
        dj0.d dVar = dVarO;
        jo3.a counterExecutedAmount = hVar.getCounterExecutedAmount();
        if (counterExecutedAmount != null) {
            dVarO2 = mo3.a.o(counterExecutedAmount);
        } else {
            dj0.d.Companion.getClass();
            dVarO2 = dj0.d.d;
        }
        return new ExchangeOrder.Completed(exchangeOrderInfoC2, null, d, dVar, dVarO2);
    }
}
