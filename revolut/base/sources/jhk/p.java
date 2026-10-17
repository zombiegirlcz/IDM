package jhk;

import com.revolut.feature.pricingplans.models.SubscriptionPreviewId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f174305w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SubscriptionPreviewId.Plan f174306x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar, m mVar, SubscriptionPreviewId.Plan plan, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f174305w = mVar;
        this.f174306x = plan;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.v, this.f174305w, this.f174306x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        SubscriptionPreviewId.Plan plan = this.f174306x;
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            o oVar = new o(bVar, plan, null);
            this.u = 1;
            obj2 = bVar.p2(this, oVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        m mVar = this.f174305w;
        if (zBooleanValue) {
            bVar.v.c3(plan, new jeg.g(mVar, 16));
            return Unit.f186387a;
        }
        mVar.invoke();
        return Unit.f186387a;
    }
}
