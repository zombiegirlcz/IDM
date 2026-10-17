package gr8;

import aw0.n6;
import com.revolut.feature.junior_transfer.impl.ui.screen.block_transfer.JuniorBlockInboundTransferController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ JuniorBlockInboundTransferController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(JuniorBlockInboundTransferController juniorBlockInboundTransferController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = juniorBlockInboundTransferController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.v, continuation, 0);
            default:
                return new a(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        JuniorBlockInboundTransferController juniorBlockInboundTransferController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                juniorBlockInboundTransferController.R.C2(c.f145946a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                juniorBlockInboundTransferController.R.C2(d.f145947a);
                break;
        }
        return Unit.f186387a;
    }
}
