package dh4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.RefinancingAccountDetailsHomeController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ RefinancingAccountDetailsHomeController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RefinancingAccountDetailsHomeController refinancingAccountDetailsHomeController, Continuation continuation) {
        super(2, continuation);
        this.u = refinancingAccountDetailsHomeController;
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
        yhm.o.b(obj2);
        com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a aVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a) this.u.a();
        aVar2.H2(aVar2.f68259t, new dg3.d(2));
        aVar2.J2();
        return Unit.f186387a;
    }
}
