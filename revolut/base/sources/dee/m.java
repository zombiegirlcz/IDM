package dee;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status.InboundSwiftTransferStatusScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ InboundSwiftTransferStatusScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InboundSwiftTransferStatusScreen inboundSwiftTransferStatusScreen, Continuation continuation) {
        super(2, continuation);
        this.u = inboundSwiftTransferStatusScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVar = (z) this.u.R2();
        zVar.getClass();
        zVar.l2(new t(3, zVar, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
