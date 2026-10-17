package xd4;

import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ticketor.ManualUnderwritingTicketorController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import xd4.b;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ManualUnderwritingTicketorController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ManualUnderwritingTicketorController manualUnderwritingTicketorController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = manualUnderwritingTicketorController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ManualUnderwritingTicketorController manualUnderwritingTicketorController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i) manualUnderwritingTicketorController.e3()).C2(b.C1693b.f304258a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i) manualUnderwritingTicketorController.e3()).C2(b.a.f304257a);
                break;
        }
        return Unit.f186387a;
    }
}
