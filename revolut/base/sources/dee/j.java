package dee;

import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status.InboundSwiftTransferStatusScreen;
import dee.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InboundSwiftTransferStatusScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(InboundSwiftTransferStatusScreen inboundSwiftTransferStatusScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = inboundSwiftTransferStatusScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            default:
                return new j(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InboundSwiftTransferStatusScreen inboundSwiftTransferStatusScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((z) inboundSwiftTransferStatusScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((z) inboundSwiftTransferStatusScreen.e3()).C2(o.a.f113416a);
                break;
        }
        return Unit.f186387a;
    }
}
