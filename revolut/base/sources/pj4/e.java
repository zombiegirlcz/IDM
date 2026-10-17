package pj4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.dashboard.WaitingListV3DashboardScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ WaitingListV3DashboardScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WaitingListV3DashboardScreen waitingListV3DashboardScreen, Continuation continuation) {
        super(2, continuation);
        this.u = waitingListV3DashboardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarR2 = this.u.R2();
        kVarR2.getClass();
        kVarR2.n2(new pe2.l(kVarR2, null, 9), new whi.b(6));
        return Unit.f186387a;
    }
}
