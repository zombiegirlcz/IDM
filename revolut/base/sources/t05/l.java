package t05;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.health.impl.ui.dashboard.DashboardScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import sqd.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ DashboardScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(DashboardScreen dashboardScreen, Continuation continuation) {
        super(2, continuation);
        this.u = dashboardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarD3 = this.u.R2();
        xVarD3.getClass();
        xVarD3.n2(new h0(xVarD3, null, 8), new whi.b(6));
        return Unit.f186387a;
    }
}
