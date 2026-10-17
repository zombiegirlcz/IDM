package b8h;

import c8h.b;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import dj0.d;
import java.time.Instant;
import java.time.LocalDate;
import k4l.c0;
import k4l.d0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f13266a = r0.k(new Pair("ACTIVE", d0.ACTIVE), new Pair("INACTIVE", d0.INACTIVE));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f13267b = r0.k(new Pair("P1D", c0.DAY), new Pair("P7D", c0.WEEK), new Pair("P1M", c0.MONTH));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public static final PortfolioRecurringOrder a(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String orderId = bVar.getOrderId();
        String portfolioId = bVar.getPortfolioId();
        String sourcePocketId = bVar.getSourcePocketId();
        d0 d0Var = (d0) u1.u(bVar.getState(), f13266a);
        c0 c0Var = (c0) u1.u(bVar.getPeriod(), f13267b);
        LocalDate localDate = LocalDate.parse(bVar.getStartDate());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(bVar.getUpdatedDate());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        LocalDate localDate2 = LocalDate.parse(bVar.getNextDate());
        Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
        long amount = bVar.getAmount();
        xi0.a aVar = xi0.b.Companion;
        String currencyCode = bVar.getCurrencyCode();
        aVar.getClass();
        return new PortfolioRecurringOrder(orderId, portfolioId, sourcePocketId, d0Var, c0Var, localDate, localDate2, instantOfEpochMilli, new d(amount, xi0.a.a(currencyCode)));
    }
}
