package zrd;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ TotalWealthController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(TotalWealthController totalWealthController, Continuation continuation) {
        super(2, continuation);
        this.u = totalWealthController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z1 z1Var = ((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a) this.u.R2()).z;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}
