package xkk;

import ggk.q0;
import ggk.u0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f306858w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a f306859x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a aVar, u0 u0Var, Continuation continuation) {
        super(2, continuation);
        this.f306859x = aVar;
        this.f306858w = u0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f306859x, this.f306858w, continuation);
            default:
                return new n(this.f306858w, this.f306859x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a aVar2 = this.f306859x;
                    xb4.g gVar = new xb4.g(aVar2, this.f306858w, null, 9);
                    this.v = 1;
                    if (aVar2.p2(this, gVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    u0 u0Var = this.f306858w;
                    boolean z = u0Var instanceof q0;
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a aVar4 = this.f306859x;
                    if (z) {
                        ajk.b bVar = aVar4.f103474s;
                        String str = ((q0) u0Var).f143772b;
                        xfj.a aVar5 = new xfj.a(aVar4, u0Var, 2);
                        this.v = 1;
                        if (igk.k.b(aVar4, bVar, str, aVar5, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        i4b.f fVar = aVar4.f103473r;
                        this.v = 2;
                        if (fVar.g(u0Var, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u0 u0Var, com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f306858w = u0Var;
        this.f306859x = aVar;
    }
}
