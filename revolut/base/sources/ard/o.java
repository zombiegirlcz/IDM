package ard;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectTransactionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SelectTransactionController selectTransactionController, Continuation continuation) {
        super(2, continuation);
        this.v = selectTransactionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52373a;
        boolean zF = Intrinsics.f(str, "EMPTY_SEARCH");
        SelectTransactionController selectTransactionController = this.v;
        if (zF) {
            com.revolut.feature.spending_analytics.impl.ui.rev10.select.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.select.a) selectTransactionController.d();
            aVar2.H2(aVar2.f87897x, new aqb.s(26));
            aVar2.J2();
        } else if (Intrinsics.f(str, "ERROR_STATE_ID")) {
            ((com.revolut.feature.spending_analytics.impl.ui.rev10.select.a) selectTransactionController.d()).J2();
        }
        return Unit.f186387a;
    }
}
