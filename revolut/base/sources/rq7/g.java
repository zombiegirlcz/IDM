package rq7;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.summary.PolicySummaryScreen;
import ip0.x10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PolicySummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PolicySummaryScreen policySummaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = policySummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        x10 x10Var = (x10) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarT2 = this.v.T2();
        ActionsView.Item item = x10Var.f167082b;
        s sVar = (s) pVarT2;
        sVar.y2(item.f58324n, item.f58316a);
        return Unit.f186387a;
    }
}
