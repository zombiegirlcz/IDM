package sm6;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.external_accounts.impl.ui.india.upi.screen.applications.UpiApplicationsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ UpiApplicationsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(UpiApplicationsScreen upiApplicationsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = upiApplicationsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarD3 = this.u.R2();
        pVarD3.getClass();
        pVarD3.l2(new s64.a(pVarD3, null, 28), new yi5.b(26));
        return Unit.f186387a;
    }
}
