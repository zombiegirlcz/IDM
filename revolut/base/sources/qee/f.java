package qee;

import aw0.n6;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CardDeliveryDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(CardDeliveryDetailsController cardDeliveryDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cardDeliveryDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CardDeliveryDetailsController cardDeliveryDetailsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a) cardDeliveryDetailsController.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar3 = (com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a) cardDeliveryDetailsController.d();
                aVar3.getClass();
                aVar3.A1(new o(aVar3, null, 3), new yi5.b(25));
                break;
        }
        return Unit.f186387a;
    }
}
