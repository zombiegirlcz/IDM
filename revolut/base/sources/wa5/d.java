package wa5;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.PostTerminationPlanDetailsFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import vkm.q;
import yhm.o;
import zfd.e;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.a f295821w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f295821w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f295821w, continuation, 0);
            default:
                return new d(this.f295821w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.a aVar2 = this.f295821w;
                if (i == 0) {
                    o.b(obj2);
                    e eVarW = zi0.c.w(ra5.b.b(aVar2.f70670p, aVar2.o.f70666a));
                    this.v = 1;
                    obj2 = q.x(eVarW, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Data data = (Data) obj2;
                CreditPostTerminationPlanDetails creditPostTerminationPlanDetails = (CreditPostTerminationPlanDetails) data.getContent();
                if (creditPostTerminationPlanDetails != null) {
                    h.w2(aVar2.f70673s, new PostTerminationPlanDetailsFlowContract$Step.PlanDetails(creditPostTerminationPlanDetails), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    return Unit.f186387a;
                }
                Throwable error = data.getError();
                if (error == null) {
                    throw new c();
                }
                throw error;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.a aVar4 = this.f295821w;
                    d dVar = new d(aVar4, null, 0);
                    this.v = 1;
                    if (aVar4.p2(this, dVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
