package ble;

import com.revolut.feature.globalsearch.api.navigation.GlobalSearchScreenDestination;
import com.revolut.feature.globalsearch.models.RetailGlobalSearchContext;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TabInvestController f16580w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(TabInvestController tabInvestController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f16580w = tabInvestController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f16580w, continuation, 0);
            case 1:
                return new k(this.f16580w, continuation, 1);
            default:
                return new k(this.f16580w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    q qVarR2 = this.f16580w.R2();
                    this.v = 1;
                    com.revolut.feature.tab.invest.impl.ui.home.f fVar = (com.revolut.feature.tab.invest.impl.ui.home.f) qVarR2;
                    fVar.getClass();
                    fVar.n2(new com.revolut.feature.tab.invest.impl.ui.home.e(fVar, null), new whi.b(6));
                    if (Unit.f186387a == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    q qVarR22 = this.f16580w.R2();
                    this.v = 1;
                    com.revolut.feature.tab.invest.impl.ui.home.f fVar2 = (com.revolut.feature.tab.invest.impl.ui.home.f) qVarR22;
                    fVar2.getClass();
                    Object objN2 = fVar2.N2(eel.c.ONE_WEEK, null, this);
                    if (objN2 != aVar2) {
                        objN2 = Unit.f186387a;
                    }
                    if (objN2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    q qVarR23 = this.f16580w.R2();
                    this.v = 1;
                    com.revolut.feature.tab.invest.impl.ui.home.f fVar3 = (com.revolut.feature.tab.invest.impl.ui.home.f) qVarR23;
                    fVar3.getClass();
                    fVar3.C1(new GlobalSearchScreenDestination(RetailGlobalSearchContext.WEALTH_HOME));
                    if (Unit.f186387a == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
