package mg7;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.IncentiveSelectionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ IncentiveSelectionController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(IncentiveSelectionController incentiveSelectionController, Continuation continuation) {
        super(2, continuation);
        this.u = incentiveSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVar = (u) this.u.d();
        uVar.getClass();
        uVar.n2(new mci.e(uVar, null, 2), new whi.b(6));
        return Unit.f186387a;
    }
}
