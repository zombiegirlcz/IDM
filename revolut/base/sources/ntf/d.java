package ntf;

import com.revolut.feature.transfer_reasons.impl.ui.search.TransferReasonsSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransferReasonsSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TransferReasonsSearchScreen transferReasonsSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transferReasonsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransferReasonsSearchScreen transferReasonsSearchScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE3 = transferReasonsSearchScreen.e3();
                if (!rVarE3.I2()) {
                    rVarE3.B2();
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE32 = transferReasonsSearchScreen.e3();
                rVarE32.getClass();
                rVarE32.l2(new nt4.f(rVarE32, null, 1), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
