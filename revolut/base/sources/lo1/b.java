package lo1;

import com.revolut.feature.apm.bills.bpay.impl.screen.input.InputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(InputScreen inputScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = inputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InputScreen inputScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                inputScreen.e3().I2(j.f197374a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                inputScreen.e3().I2(g.f197369a);
                break;
        }
        return Unit.f186387a;
    }
}
