package l5a;

import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar, Continuation continuation) {
        super(1, continuation);
        this.u = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new x(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((x) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return this.u.C1(new MainContainerScreenDestination.Slide(dy0.o.RIGHT, false));
    }
}
