package aik;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import igk.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zfk.c;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PricingPlanAction.Upgrade v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.d f5307w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PricingPlanAction.Upgrade upgrade, com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = upgrade;
        this.f5307w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, this.f5307w, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((c.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c.b bVar = (c.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (bVar instanceof zfk.i) {
            boolean z = this.v.d;
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.d dVar = this.f5307w;
            if (z) {
                dVar.C2(t.f161272a);
            } else {
                dVar.K2();
            }
        } else if (!(bVar instanceof zfk.g)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
