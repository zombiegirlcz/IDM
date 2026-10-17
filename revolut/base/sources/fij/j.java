package fij;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimGetPlanScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(EsimGetPlanScreen esimGetPlanScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimGetPlanScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) this.v.R2()).Q2(((RowDelegate.Model) model.f53305b).u);
        return Unit.f186387a;
    }
}
