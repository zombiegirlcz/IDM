package d4c;

import com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.DeliveryAddressScreen;
import com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.DeliveryAddressScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DeliveryAddressScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DeliveryAddressScreen deliveryAddressScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = deliveryAddressScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DeliveryAddressScreen deliveryAddressScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                zji.d dVar = ((oki.h) deliveryAddressScreen.e3()).f226129n;
                Unit unit = Unit.f186387a;
                dVar.a(unit);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.v2(((com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.a) deliveryAddressScreen.e3()).f84239s, DeliveryAddressScreenContract$ModalStep.AddNewAddress.f84235a, ModalDestination.Style.POPUP.f98311a);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.a aVar4 = (com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.a) deliveryAddressScreen.e3();
                aVar4.C2(new f(((e) ((j2) aVar4.f84238r.f22677a).getValue()).f111273b));
                break;
        }
        return Unit.f186387a;
    }
}
