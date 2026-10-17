package mf4;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.bigtile.BigTileOfferContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.regular.RegularOfferContentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class l0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g f204869w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f204870x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f204869w = gVar;
        this.f204870x = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l0(this.f204869w, this.f204870x, continuation, 0);
            default:
                return new l0(this.f204869w, this.f204870x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar = this.f204869w;
                e eVar = gVar.f68151q;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.kompot.navigable.a aVarS = gVar.v.s();
                    boolean z = aVarS instanceof RegularOfferContentScreen;
                    Object obj3 = this.f204870x;
                    if (z || (aVarS instanceof BigTileOfferContentScreen)) {
                        cv3.t tVar = cv3.u.Companion;
                        String strA = cv3.a0.REPAYMENT_TYPE.a();
                        fu3.a aVar2 = ((fu3.b) obj3).f138077b;
                        tVar.getClass();
                        cv3.u uVarB = cv3.t.b(aVar2, strA);
                        this.v = 1;
                        Object objW = ((a0) eVar).w(uVarB, this);
                        if (objW != aVar) {
                            objW = Unit.f186387a;
                        }
                        if (objW == aVar) {
                            return aVar;
                        }
                        a0 a0Var = (a0) eVar;
                        a0Var.f = null;
                        a0Var.f204836g = null;
                        a0Var.f204837h = null;
                        a0Var.d.k(Unit.f186387a);
                    } else if (aVarS instanceof CalculatorScreen) {
                        String str = ((CalculatorScreen) aVarS).L.f68120a;
                        cv3.t tVar2 = cv3.u.Companion;
                        String strA2 = cv3.a0.REPAYMENT_TYPE.a();
                        fu3.a aVar3 = ((fu3.b) obj3).f138077b;
                        tVar2.getClass();
                        cv3.u uVarB2 = cv3.t.b(aVar3, strA2);
                        this.v = 2;
                        if (((a0) eVar).i(str, uVarB2, this) == aVar) {
                            return aVar;
                        }
                        ((a0) eVar).e.k(Unit.f186387a);
                    }
                } else if (i == 1) {
                    yhm.o.b(obj2);
                    a0 a0Var2 = (a0) eVar;
                    a0Var2.f = null;
                    a0Var2.f204836g = null;
                    a0Var2.f204837h = null;
                    a0Var2.d.k(Unit.f186387a);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    ((a0) eVar).e.k(Unit.f186387a);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar2 = this.f204869w;
                    l0 l0Var = new l0(gVar2, this.f204870x, null, 0);
                    this.v = 1;
                    if (gVar2.p2(this, l0Var) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
