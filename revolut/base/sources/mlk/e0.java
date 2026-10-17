package mlk;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanCancelFeatures$CancelReason;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ h0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, Continuation continuation) {
        super(2, continuation);
        this.v = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        od0.i iVar;
        h0 h0Var = this.v;
        PlanCancelFeaturesScreenContract$InputData planCancelFeaturesScreenContract$InputData = h0Var.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            PlanCancelFeatures$CancelReason planCancelFeatures$CancelReason = planCancelFeaturesScreenContract$InputData.f103509a;
            if (Intrinsics.f(planCancelFeatures$CancelReason, PlanCancelFeatures$CancelReason.CloseAccount.f102909a) || Intrinsics.f(planCancelFeatures$CancelReason, PlanCancelFeatures$CancelReason.StandardPlan.f102912a)) {
                od0.i.Companion.getClass();
                iVar = od0.i.f224256b;
                h0Var.H2(h0Var.E, new me7.h(new Data(iVar, null, false, 6, null), 17));
                return Unit.f186387a;
            }
            if (!(planCancelFeatures$CancelReason instanceof PlanCancelFeatures$CancelReason.LowerPaidPlan)) {
                throw new NoWhenBranchMatchedException();
            }
            efm.d0 d0VarF = h0Var.f207009p.f(((PlanCancelFeatures$CancelReason.LowerPaidPlan) planCancelFeaturesScreenContract$InputData.f103509a).f102910a);
            this.u = 1;
            obj2 = nim.a.b(d0VarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        iVar = (od0.i) obj2;
        h0Var.H2(h0Var.E, new me7.h(new Data(iVar, null, false, 6, null), 17));
        return Unit.f186387a;
    }
}
