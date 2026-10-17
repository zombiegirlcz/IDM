package yna;

import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import com.revolut.retail.feature.pricing_plans.waitlist.api.navigation.PricingPlanWaitlistDestination;
import com.revolut.sso.api.revolut_id.RevolutIDDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class a1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ c1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(c1 c1Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.v = c1Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a1(this.v, continuation, 0);
            case 1:
                return new a1(this.v, continuation, 1);
            default:
                return new a1(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((a1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c1 c1Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1Var.C1(new RevolutIDDestination(!((Boolean) c1Var.f315319s0.getValue()).booleanValue()));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1Var.C1(new SecurityHubDestination((SecurityHubStartScreen) null, false, (String) null, false, 31));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                PricingPlanWaitlistEntry pricingPlanWaitlistEntry = ((a) c1Var.t2()).f315281m;
                if (pricingPlanWaitlistEntry != null) {
                    return c1Var.C1(new PricingPlanWaitlistDestination(pricingPlanWaitlistEntry.f103654c, null, zhm.u.c(gok.b.ACTIVE)));
                }
                return null;
        }
    }
}
