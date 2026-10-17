package uhk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a f280266w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f280266w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f280266w, continuation, 0);
            case 1:
                return new g(this.f280266w, continuation, 1);
            case 2:
                return new g(this.f280266w, continuation, 2);
            case 3:
                return new g(this.f280266w, continuation, 3);
            default:
                return new g(this.f280266w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar2 = this.f280266w;
                    f fVar = new f(aVar2, null, 0);
                    this.v = 1;
                    if (aVar2.p2(this, fVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar4 = this.f280266w;
                f fVar2 = new f(aVar4, null, 2);
                this.v = 1;
                Object objB = pu7.a.B(aVar4.k, "onDowngradeConfirmed", fVar2, this);
                return objB == aVar3 ? aVar3 : objB;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar6 = this.f280266w;
                f fVar3 = new f(aVar6, null, 4);
                this.v = 1;
                Object objP2 = aVar6.p2(this, fVar3);
                return objP2 == aVar5 ? aVar5 : objP2;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar8 = this.f280266w;
                f fVar4 = new f(aVar8, null, 5);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar8.k, "proceedWithDowngrade", fVar4, this);
                return objB2 == aVar7 ? aVar7 : objB2;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar10 = this.f280266w;
                f fVar5 = new f(aVar10, null, 7);
                this.v = 1;
                Object objB3 = pu7.a.B(aVar10.k, "showFeesAndTerms", fVar5, this);
                return objB3 == aVar9 ? aVar9 : objB3;
        }
    }
}
