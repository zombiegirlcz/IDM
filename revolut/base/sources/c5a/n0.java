package c5a;

import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class n0 extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar, Continuation continuation) {
        super(1, continuation);
        this.u = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n0(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar = this.u;
        if (((l) ((j2) fVar.f80171h0.f22677a).getValue()).f21498a instanceof o) {
            fVar.C1(new MainContainerScreenDestination.Slide(dy0.o.RIGHT, false));
        }
        return Unit.f186387a;
    }
}
