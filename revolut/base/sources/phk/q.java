package phk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a f236338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f236339x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a aVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f236338w = aVar;
        this.f236339x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f236338w, this.f236339x, continuation, 0);
            default:
                return new q(this.f236338w, this.f236339x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a aVar2 = this.f236338w;
                p pVar = new p(aVar2, this.f236339x, null, 0);
                this.v = 1;
                Object objP2 = aVar2.p2(this, pVar);
                return objP2 == aVar ? aVar : objP2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a aVar4 = this.f236338w;
                    p pVar2 = new p(aVar4, this.f236339x, null, 1);
                    this.v = 1;
                    if (aVar4.p2(this, pVar2) == aVar3) {
                        return aVar3;
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
