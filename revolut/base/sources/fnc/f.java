package fnc;

import com.revolut.data.model.Data;
import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PortfolioDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(PortfolioDetailsScreen portfolioDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = portfolioDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        List list2;
        int i = this.u;
        PortfolioDetailsScreen portfolioDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0 d0Var = (d0) portfolioDetailsScreen.d();
                Data data = ((m) ((j2) d0Var.F.f22677a).getValue()).i;
                if (data != null && (list = (List) data.getContent()) != null) {
                    Object objD0 = zhm.d0.d0(list);
                    if (objD0 == null) {
                        throw new IllegalArgumentException("Action button displayed and clicked without actions available");
                    }
                    ((boc.h) d0Var.f136631s).Z2(new boc.j((alc.d) objD0, d0Var.f136630r.f85166a));
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0 d0Var2 = (d0) portfolioDetailsScreen.d();
                Data data2 = ((m) ((j2) d0Var2.F.f22677a).getValue()).i;
                if (data2 != null && (list2 = (List) data2.getContent()) != null) {
                    List listV = zhm.d0.V(list2, 1);
                    if (listV.isEmpty()) {
                        throw new IllegalArgumentException("Other Actions button displayed and clicked without other actions available");
                    }
                    ((boc.h) d0Var2.f136631s).Z2(new boc.k(listV));
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((d0) portfolioDetailsScreen.d()).B2();
                return Unit.f186387a;
        }
    }
}
