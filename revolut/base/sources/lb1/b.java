package lb1;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.delivery_address.DeliveryAddressScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ DeliveryAddressScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DeliveryAddressScreen deliveryAddressScreen, Continuation continuation) {
        super(2, continuation);
        this.u = deliveryAddressScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVar = (n) ((f) ((db1.g) this.u.Z.getValue()).f112660b.get());
        nVar.getClass();
        nVar.x2(new k(nVar, 1));
        nVar.l2(new m(nVar, null, 0), new yi5.b(26));
        nVar.l2(new m(nVar, null, 1), new yi5.b(26));
        return Unit.f186387a;
    }
}
