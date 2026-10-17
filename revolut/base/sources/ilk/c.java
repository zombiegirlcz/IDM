package ilk;

import beb.n;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_reason.PlanDowngradeReasonScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanDowngradeReasonScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PlanDowngradeReasonScreen planDowngradeReasonScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planDowngradeReasonScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.Z.getValue();
        Intrinsics.h(model);
        j jVar = (j) gVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        jVar.x2(new n(model, 2));
        return Unit.f186387a;
    }
}
