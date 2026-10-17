package cnc;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import k4l.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.robo.impl.ui.screen.manage_goal.a f25404w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.robo.impl.ui.screen.manage_goal.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f25404w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(continuation, this.f25404w, 0);
                wVar.v = obj2;
                return wVar;
            case 1:
                w wVar2 = new w(continuation, this.f25404w, 1);
                wVar2.v = obj2;
                return wVar2;
            case 2:
                w wVar3 = new w(this.f25404w, continuation, 2);
                wVar3.v = obj2;
                return wVar3;
            case 3:
                w wVar4 = new w(this.f25404w, continuation, 3);
                wVar4.v = obj2;
                return wVar4;
            case 4:
                w wVar5 = new w(this.f25404w, continuation, 4);
                wVar5.v = obj2;
                return wVar5;
            case 5:
                w wVar6 = new w(this.f25404w, continuation, 5);
                wVar6.v = obj2;
                return wVar6;
            default:
                w wVar7 = new w(this.f25404w, continuation, 6);
                wVar7.v = obj2;
                return wVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((w) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        c0 c0Var;
        int i;
        dj0.d dVar;
        int i2 = this.u;
        com.revolut.feature.robo.impl.ui.screen.manage_goal.a aVar = this.f25404w;
        switch (i2) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar = (yhm.r) pair.f186385a;
                Object obj3 = pair.f186386b;
                Object obj4 = rVar.f314201a;
                Object obj5 = rVar.f314202b;
                alc.j jVar = (alc.j) obj3;
                del.b bVar = (del.b) rVar.f314203c;
                c0 c0Var2 = (c0) obj5;
                PortfolioGoal portfolioGoal = (PortfolioGoal) obj4;
                woc.f fVar = aVar.f85143t;
                woc.d dVar2 = new woc.d(portfolioGoal.f95699a, mif.a.Q(bVar.f113708a), c0Var2, aVar.f85144w.h(portfolioGoal.a(), c0Var2), jVar.f6202b, jVar.d);
                fVar.getClass();
                dj0.d dVarA = woc.f.a(dVar2);
                aVar.f85145x.getClass();
                return yoc.n.a(dVarA);
            case 1:
                Pair pair2 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar2 = (yhm.r) pair2.f186385a;
                Object obj6 = pair2.f186386b;
                Object obj7 = rVar2.f314201a;
                alc.j jVar2 = (alc.j) obj6;
                PortfolioGoal portfolioGoal2 = (PortfolioGoal) rVar2.f314202b;
                del.b bVar2 = (del.b) obj7;
                PortfolioRecurringOrder portfolioRecurringOrder = (PortfolioRecurringOrder) ((od0.i) rVar2.f314203c).f224257a;
                if (portfolioRecurringOrder == null || (c0Var = portfolioRecurringOrder.e) == null) {
                    c0Var = com.revolut.feature.robo.impl.ui.screen.manage_goal.a.B;
                }
                c0 c0Var3 = c0Var;
                woc.c cVar = aVar.u;
                dj0.d dVar3 = portfolioGoal2.f95699a;
                dj0.d dVar4 = null;
                if (portfolioRecurringOrder != null) {
                    if (!nz8.d.k(portfolioRecurringOrder)) {
                        portfolioRecurringOrder = null;
                    }
                    if (portfolioRecurringOrder != null) {
                        dVar4 = portfolioRecurringOrder.i;
                    }
                }
                dj0.d dVar5 = dVar4;
                int iH = aVar.f85144w.h(portfolioGoal2.a(), c0Var3);
                BigDecimal bigDecimal = jVar2.f6202b;
                BigDecimal bigDecimal2 = jVar2.d;
                woc.a input = new woc.a(dVar3, dVar5, c0Var3, iH, bigDecimal, bigDecimal2);
                cVar.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                if (dVar5 != null && !Intrinsics.f(dVar5.f115083b, dVar3.f115083b)) {
                    hx7.e.n(new IllegalArgumentException("Monthly contribution and target amount should have the same currency"));
                    dVar = new dj0.d(0L, dVar3.f115083b);
                } else if (iH == 0) {
                    hx7.e.n(new IllegalArgumentException("Payments count should be greater than 0"));
                    dVar = new dj0.d(0L, dVar3.f115083b);
                } else if (bigDecimal2.compareTo(bigDecimal) >= 0) {
                    hx7.e.n(new IllegalArgumentException("Fee should be less than mean"));
                    dVar = new dj0.d(0L, dVar3.f115083b);
                } else {
                    BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                    BigDecimal scale = bigDecimalSubtract.setScale(8, RoundingMode.HALF_DOWN);
                    int i3 = woc.b.f298912a[c0Var3.ordinal()];
                    if (i3 == 1) {
                        i = 365;
                    } else if (i3 == 2) {
                        i = 52;
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = 12;
                    }
                    Intrinsics.h(scale);
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                    RoundingMode roundingMode = RoundingMode.HALF_EVEN;
                    BigDecimal bigDecimalDivide = scale.divide(bigDecimalValueOf, roundingMode);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                    BigDecimal bigDecimalY = pyd.c.Y(dVar3);
                    xi0.b bVar3 = dVar3.f115083b;
                    BigDecimal bigDecimalY2 = dVar5 != null ? pyd.c.Y(dVar5) : BigDecimal.ZERO;
                    MathContext mathContext = MathContext.DECIMAL64;
                    BigDecimal ONE = BigDecimal.ONE;
                    Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                    BigDecimal bigDecimalAdd = ONE.add(bigDecimalDivide);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                    BigDecimal bigDecimalPow = bigDecimalAdd.pow(iH, mathContext);
                    Intrinsics.h(bigDecimalPow);
                    Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                    BigDecimal bigDecimalSubtract2 = bigDecimalPow.subtract(ONE);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                    BigDecimal bigDecimalDivide2 = bigDecimalSubtract2.divide(bigDecimalDivide, roundingMode);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "divide(...)");
                    BigDecimal bigDecimalMultiply = bigDecimalY2.multiply(bigDecimalDivide2, mathContext);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                    BigDecimal bigDecimalSubtract3 = bigDecimalY.subtract(bigDecimalMultiply);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract3, "subtract(...)");
                    BigDecimal bigDecimalDivide3 = bigDecimalSubtract3.divide(bigDecimalPow, roundingMode);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalDivide3, "divide(...)");
                    BigDecimal scale2 = bigDecimalDivide3.compareTo(BigDecimal.ZERO) >= 0 ? bigDecimalDivide3.setScale(2, RoundingMode.CEILING) : bigDecimalDivide3.setScale(2, RoundingMode.FLOOR);
                    Intrinsics.h(scale2);
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(cp5.d.k(bVar3));
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                    BigDecimal bigDecimalMultiply2 = scale2.multiply(bigDecimalValueOf2);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
                    long jLongValue = bigDecimalMultiply2.longValue();
                    dVar = new dj0.d(jLongValue < 0 ? 0L : jLongValue, bVar3);
                }
                dj0.d dVarH = pyd.c.H(dVar, mif.a.Q(bVar2.f113708a));
                aVar.f85145x.getClass();
                return yoc.n.a(dVarH);
            case 2:
                Data data = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.z, new ck2.c(data, 6));
                return Unit.f186387a;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.z, new ck2.c(data2, 7));
                return Unit.f186387a;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.z, new ck2.c(data3, 8));
                return Unit.f186387a;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.z, new ck2.c(data4, 9));
                return Unit.f186387a;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.z, new ck2.c(data5, 10));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Continuation continuation, com.revolut.feature.robo.impl.ui.screen.manage_goal.a aVar, int i) {
        super(2, continuation);
        this.u = i;
        this.f25404w = aVar;
    }
}
