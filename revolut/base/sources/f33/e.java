package f33;

import cli.y;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods.DeliveryMethodsController;
import f33.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DeliveryMethodsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(DeliveryMethodsController deliveryMethodsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = deliveryMethodsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DeliveryMethodsController deliveryMethodsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar = (h) deliveryMethodsController.R2();
                y yVar = hVar.f131888t;
                if (((j) ((j2) yVar.f22677a).getValue()).f131893h) {
                    hVar.J2();
                } else {
                    d93.b bVar = ((j) ((j2) yVar.f22677a).getValue()).d;
                    if (bVar != null) {
                        hVar.C2(new k(bVar));
                    }
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((h) deliveryMethodsController.R2()).C2(l.a.f131896a);
                break;
        }
        return Unit.f186387a;
    }
}
