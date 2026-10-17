package wvg;

import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartFacade;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartPointFacade;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class w1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x1 f300491w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(x1 x1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f300491w = x1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w1 w1Var = new w1(this.f300491w, continuation, 0);
                w1Var.v = obj2;
                return w1Var;
            default:
                w1 w1Var2 = new w1(this.f300491w, continuation, 1);
                w1Var2.v = obj2;
                return w1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((w1) create((i1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((w1) create((p1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        int i = this.u;
        x1 x1Var = this.f300491w;
        switch (i) {
            case 0:
                i1 i1Var = (i1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                TotalValueChartFacade totalValueChartFacadeF = x1Var.f(i1Var);
                if (totalValueChartFacadeF != null) {
                    return ngm.n.H(totalValueChartFacadeF, (TotalValueChartPointFacade) x1Var.f300495b.get(i1Var.f300396g));
                }
                return null;
            default:
                p1 p1Var = (p1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nvg.t0 t0Var = x1Var.f300496c;
                iwg.a aVar3 = p1Var.f300447b;
                eel.c cVar = p1Var.d;
                String str = p1Var.e.f306286a;
                String str2 = p1Var.f300448c;
                if (str2 == null) {
                    str2 = "LOCAL_PORTFOLIO_ID";
                }
                TotalValueChartFacade totalValueChartFacadeR = md6.s.r(t0Var.d(aVar3, cVar, str, str2, p1Var.f));
                if (totalValueChartFacadeR != null) {
                    return ngm.n.H(totalValueChartFacadeR, (TotalValueChartPointFacade) x1Var.f300495b.get(p1Var.f300450h));
                }
                return null;
        }
    }
}
