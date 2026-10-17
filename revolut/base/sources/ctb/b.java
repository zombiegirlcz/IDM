package ctb;

import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import gim.i;
import igk.t;
import igk.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f108656w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b bVar, v vVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f108656w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f108656w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b bVar = this.v;
            jvh.a aVar2 = bVar.f83407q;
            String str = bVar.o.f105766b;
            MobileScreenParams.PricingPlansPrompt pricingPlansPrompt = new MobileScreenParams.PricingPlansPrompt(Intrinsics.f(this.f108656w, t.f161272a));
            this.u = 1;
            if (aVar2.j(str, pricingPlansPrompt, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
