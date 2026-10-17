package mlk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanCancelFeaturesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PlanCancelFeaturesScreen planCancelFeaturesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planCancelFeaturesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarE3 = this.v.d();
        Intrinsics.h(model);
        h0 h0Var = (h0) xVarE3;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        j60.a.v(h0Var.B, false, null, 3);
        return Unit.f186387a;
    }
}
