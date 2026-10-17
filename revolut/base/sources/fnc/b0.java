package fnc;

import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d0 f136623w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(d0 d0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f136623w = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(this.f136623w, continuation, 0);
                b0Var.v = ((Boolean) obj2).booleanValue();
                return b0Var;
            default:
                b0 b0Var2 = new b0(this.f136623w, continuation, 1);
                b0Var2.v = ((Boolean) obj2).booleanValue();
                return b0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.u;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
        }
        return ((b0) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        d0 d0Var = this.f136623w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((ppc.u) d0Var.u).a(z ? jlc.t.PORTFOLIO_DETAILS : jlc.t.PREFUNDED_PORTFOLIO_DETAILS);
            default:
                PortfolioDetailsScreenContract$InputData portfolioDetailsScreenContract$InputData = d0Var.f136630r;
                doc.f fVar = d0Var.z;
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z3) {
                    fVar.e3(new doc.b(portfolioDetailsScreenContract$InputData.f85166a));
                } else {
                    fVar.e3(new doc.a(portfolioDetailsScreenContract$InputData.f85166a));
                    fVar.f3(pdh.c.FIVE_YEARS);
                }
                return Unit.f186387a;
        }
    }
}
