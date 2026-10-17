package t05;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreDetails;
import com.revolut.feature.credit.health.impl.ui.dashboard.DashboardScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ DashboardScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DashboardScreen dashboardScreen, Continuation continuation) {
        super(2, continuation);
        this.u = dashboardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarD3 = this.u.R2();
        xVarD3.C2(new r((CreditScoreDetails) zi0.c.I(((n) ((j2) xVarD3.f266939s.f22677a).getValue()).f266923a)));
        return Unit.f186387a;
    }
}
