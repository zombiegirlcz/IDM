package i7h;

import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import k4l.c0;
import k4l.d0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f159310a = r0.k(new Pair("P1D", c0.DAY), new Pair("P7D", c0.WEEK), new Pair("P1M", c0.MONTH));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f159311b = r0.k(new Pair("ACTIVE", d0.ACTIVE), new Pair("INACTIVE", d0.INACTIVE));

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public static final d a(PortfolioRecurringOrder portfolioRecurringOrder) {
        Intrinsics.checkNotNullParameter(portfolioRecurringOrder, "<this>");
        return new d(portfolioRecurringOrder.f104649a, portfolioRecurringOrder.f104650b, portfolioRecurringOrder.f104651c, u1.g(portfolioRecurringOrder.d, f159311b), u1.g(portfolioRecurringOrder.e, f159310a), portfolioRecurringOrder.f, portfolioRecurringOrder.f104652g, portfolioRecurringOrder.f104653h, hx7.a.A(portfolioRecurringOrder.i));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public static final PortfolioRecurringOrder b(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new PortfolioRecurringOrder(dVar.f159305a, dVar.f159306b, dVar.f159307c, (d0) u1.u(dVar.d, f159311b), (c0) u1.u(dVar.e, f159310a), dVar.f, dVar.f159308g, dVar.f159309h, hx7.a.v(dVar.i));
    }
}
