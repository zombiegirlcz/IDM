package bec;

import aw0.n6;
import com.revolut.feature.revolutpay.shared.ui.pay_with_any.PayWithAnyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PayWithAnyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(PayWithAnyScreen payWithAnyScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = payWithAnyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.v, continuation, 0);
            default:
                return new v(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PayWithAnyScreen payWithAnyScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.revolutpay.shared.ui.pay_with_any.a) payWithAnyScreen.d()).onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar3 = (com.revolut.feature.revolutpay.shared.ui.pay_with_any.a) payWithAnyScreen.d();
                aVar3.getClass();
                aVar3.l2(new aza.g(aVar3, null, 13), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
