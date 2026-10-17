package zrd;

import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TotalWealthController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TotalWealthController totalWealthController, Continuation continuation) {
        super(2, continuation);
        this.v = totalWealthController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((pf) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        pf action = (pf) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a) this.v.R2();
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        aVar2.B.setValue(null);
        return Unit.f186387a;
    }
}
