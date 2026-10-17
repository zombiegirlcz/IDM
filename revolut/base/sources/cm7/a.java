package cm7;

import com.revolut.feature.insurance_car.impl.ui.flow.delivery.DeliveryFlow;
import gim.i;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DeliveryFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(DeliveryFlow deliveryFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = deliveryFlow;
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
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DeliveryFlow deliveryFlow = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j60.a.v(((com.revolut.feature.insurance_car.impl.ui.flow.delivery.a) ((b) deliveryFlow.R.getValue())).f75352w, false, null, 3);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.insurance_car.impl.ui.flow.delivery.a aVar3 = (com.revolut.feature.insurance_car.impl.ui.flow.delivery.a) ((b) deliveryFlow.R.getValue());
                j60.a.v(aVar3.f75352w, false, null, 3);
                aVar3.l2(new d(aVar3, null, 0), new bwc.i(1, aVar3, vl7.a.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 20));
                break;
        }
        return Unit.f186387a;
    }
}
