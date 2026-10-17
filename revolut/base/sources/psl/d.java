package psl;

import ael.q0;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import dfl.o0;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Optional;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f239518b;

    public /* synthetic */ d(n nVar, int i) {
        this.f239517a = i;
        this.f239518b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f239517a) {
            case 0:
                tsl.j investOrderWrapper = (tsl.j) obj2;
                Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                String strE = com.revolut.retail.trading.core.domain.orders.a.e(investOrderWrapper.a());
                if (strE != null) {
                    return ((q0) this.f239518b.f239536r).o(strE, w4l.h.f294642c);
                }
                od0.i.Companion.getClass();
                return zi0.c.i(od0.i.f224256b);
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                tsl.j jVar = (tsl.j) pair.f186385a;
                do3.n nVar = (do3.n) pair.f186386b;
                o0 f104636l = jVar.a().getF104636l();
                String str = f104636l != null ? f104636l.f114446a : null;
                return (str == null || str.equals(nVar.f116408a)) ? nim.a.y(nim.a.v(rd0.e.b(this.f239518b.f239533n.a(jVar.a().getF104630a())), new e(5)), new e(6)) : zi0.c.i(jsl.m.f178223a);
            case 2:
                tsl.j investOrderWrapper2 = (tsl.j) obj2;
                Intrinsics.checkNotNullParameter(investOrderWrapper2, "investOrderWrapper");
                return rd0.e.b(((ael.k) this.f239518b.o).f(tsl.g.a(investOrderWrapper2)));
            case 3:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                tsl.j jVar2 = (tsl.j) pair2.f186385a;
                nel.n nVar2 = (nel.n) pair2.f186386b;
                InvestOrder investOrderA = jVar2.a();
                if (!com.revolut.retail.trading.core.domain.orders.a.l(investOrderA) || oi0.d.B(investOrderA.getF104635j()) || !pu7.a.D(nVar2.f214597c) || (io3.h.j(nVar2.f214597c) && oi0.d.z(investOrderA.getF104635j()))) {
                    return zi0.c.i(Optional.empty());
                }
                return this.f239518b.z.a(tsl.g.a(jVar2), nVar2.k.a(), investOrderA.getF104635j(), (investOrderA instanceof InvestOrder.InvestSecuritiesOrder) && oi0.d.y(investOrderA.getF104635j()) && ((InvestOrder.InvestSecuritiesOrder) investOrderA).getB() == k4l.q0.GOOD_TIL_EXT_MARKET);
            case 4:
                tsl.j investOrderWrapper3 = (tsl.j) obj2;
                Intrinsics.checkNotNullParameter(investOrderWrapper3, "investOrderWrapper");
                return ((ael.k) this.f239518b.o).o(tsl.g.a(investOrderWrapper3), w4l.h.f294642c);
            case 5:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                tsl.j jVar3 = (tsl.j) pair3.f186385a;
                nel.n nVar3 = (nel.n) pair3.f186386b;
                InvestOrder investOrderA2 = jVar3.a();
                boolean z = oi0.d.B(investOrderA2.getF104635j()) && nVar3.d();
                if (!(investOrderA2 instanceof InvestOrder.InvestSecuritiesOrder) || !z) {
                    return zi0.c.i(Optional.empty());
                }
                hsl.q qVar = this.f239518b.f239538t;
                String securityRef = tsl.g.a(jVar3);
                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder = (InvestOrder.InvestSecuritiesOrder) investOrderA2;
                Instant c2 = investSecuritiesOrder.getC();
                if (c2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                LocalDate localDateW = oi0.d.W(c2);
                sel.a period = investSecuritiesOrder.getG();
                if (period == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dj0.d investment = investSecuritiesOrder.getF104641r();
                qVar.getClass();
                Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                Intrinsics.checkNotNullParameter(period, "period");
                Intrinsics.checkNotNullParameter(investment, "investment");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(qVar.a(securityRef, localDateW, period, new ar3.a(12, investment), loadingStrategy), new e(8));
            default:
                String securityRef2 = (String) obj2;
                Intrinsics.checkNotNullParameter(securityRef2, "securityRef");
                return ((ael.k) this.f239518b.o).p(securityRef2, w4l.i.f294643c, n9l.b.SEC_10.a());
        }
    }
}
