package unc;

import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreen;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreenContract$DomainState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PortfolioSpareChangeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PortfolioSpareChangeScreen portfolioSpareChangeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = portfolioSpareChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 1;
        Continuation continuation = null;
        PortfolioSpareChangeScreen portfolioSpareChangeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                portfolioSpareChangeScreen.R2().K2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarE3 = portfolioSpareChangeScreen.R2();
                e eVar = ((PortfolioSpareChangeScreenContract$DomainState) ((j2) b0VarE3.v.f22677a).getValue()).f85205c;
                int i3 = eVar == null ? -1 : v.f281412a[eVar.ordinal()];
                if (i3 != -1) {
                    if (i3 != 1) {
                        int i5 = 2;
                        if (i3 != 2 && i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        b0VarE3.n2(new x(b0VarE3, continuation, i5), new whi.b(6));
                    } else {
                        b0VarE3.n2(new x(b0VarE3, continuation, 0), new whi.b(6));
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarE32 = portfolioSpareChangeScreen.R2();
                b0VarE32.getClass();
                b0VarE32.l2(new un8.j(b0VarE32, continuation, i2), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
