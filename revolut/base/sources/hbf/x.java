package hbf;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends gim.i implements Function1 {
    public final /* synthetic */ FullScreenStateDelegate.Model u;
    public final /* synthetic */ com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(FullScreenStateDelegate.Model model, com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new x(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((x) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!Intrinsics.f(this.u.f52373a, "ERROR_STATE_ID")) {
            return Unit.f186387a;
        }
        com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a aVar2 = this.v;
        return aVar2.n2(new gqh.o(aVar2, null, 29), new whi.b(6));
    }
}
