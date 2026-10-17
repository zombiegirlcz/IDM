package e1c;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.impl.ui.upsell.select_plan.SelectPlanUpsellScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectPlanUpsellScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SelectPlanUpsellScreen selectPlanUpsellScreen, Continuation continuation) {
        super(2, continuation);
        this.v = selectPlanUpsellScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVar = (l) this.v.Q.getValue();
        Object obj3 = model.u;
        q qVar = (q) lVar;
        if (obj3 instanceof b) {
            qVar.H2(qVar.f121961r, new av8.o(obj3, 10));
        } else {
            qVar.getClass();
        }
        return Unit.f186387a;
    }
}
