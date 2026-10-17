package jhk;

import com.revolut.feature.pricingplans.models.SubscriptionPreviewId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SubscriptionPreviewId.Plan f174304w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar, SubscriptionPreviewId.Plan plan, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f174304w = plan;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.v, this.f174304w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        wfk.a aVar2 = this.v.v;
        this.u = 1;
        Object objB3 = aVar2.b3(this.f174304w, this);
        return objB3 == aVar ? aVar : objB3;
    }
}
