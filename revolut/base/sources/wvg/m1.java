package wvg;

import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class m1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n1 f300419w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(n1 n1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f300419w = n1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m1 m1Var = new m1(this.f300419w, continuation, 0);
                m1Var.v = obj2;
                return m1Var;
            default:
                m1 m1Var2 = new m1(this.f300419w, continuation, 1);
                m1Var2.v = obj2;
                return m1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m1) create((h1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m1) create((o1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n1 n1Var = this.f300419w;
        switch (i) {
            case 0:
                h1 h1Var = (h1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                PerformanceChart performanceChartC = n1Var.c(h1Var);
                if (performanceChartC != null) {
                    return new xvg.a(performanceChartC, performanceChartC);
                }
                return null;
            default:
                o1 o1Var = (o1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                PerformanceChart performanceChartD = n1Var.d(o1Var);
                if (performanceChartD != null) {
                    return new xvg.a(performanceChartD, performanceChartD);
                }
                return null;
        }
    }
}
