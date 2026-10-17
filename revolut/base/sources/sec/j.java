package sec;

import com.revolut.feature.revolutpay.shipping.shared.ui.delivery_methods.DeliveryMethodsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DeliveryMethodsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(DeliveryMethodsScreen deliveryMethodsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = deliveryMethodsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            case 1:
                return new j(this.v, continuation, 1);
            default:
                return new j(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DeliveryMethodsScreen deliveryMethodsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) deliveryMethodsScreen.R2();
                oVar.C2(new c(((b) ((j2) oVar.f262177r.f22677a).getValue()).f262166b));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                deliveryMethodsScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar2 = (o) deliveryMethodsScreen.R2();
                oVar2.C2(new d(((b) ((j2) oVar2.f262177r.f22677a).getValue()).f262167c));
                break;
        }
        return Unit.f186387a;
    }
}
