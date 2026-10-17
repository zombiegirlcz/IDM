package lb1;

import com.revolut.core.ui_kit.delegates.w8;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.delivery_address.DeliveryAddressScreen;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.revpro.card_reader.order.impl.R$string;
import gfc.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DeliveryAddressScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(DeliveryAddressScreen deliveryAddressScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = deliveryAddressScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.v, continuation, 0);
            case 1:
                return new a(this.v, continuation, 1);
            default:
                return new a(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a) create((w8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DeliveryAddressScreen deliveryAddressScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                deliveryAddressScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar = (n) ((f) ((db1.g) deliveryAddressScreen.Z.getValue()).f112660b.get());
                Address address = (Address) ((c) nVar.t2()).f193572b.getContent();
                if (address != null) {
                    nVar.v2(new d(address));
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar2 = (n) ((f) ((db1.g) deliveryAddressScreen.Z.getValue()).f112660b.get());
                wa1.a aVar4 = nVar2.f193584q;
                Object content = ((c) nVar2.t2()).f193572b.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                a.d dVar = ((gfc.a) aVar4).f143389a;
                yji.l.j2(nVar2, nVar2.e1(new th1.a(new AddressFlowContract$InputData((Address) content, new TextLocalisedClause(R$string.rev_pro_card_reader_order_delivery_title, null, null, 14), new TextLocalisedClause(R$string.rev_pro_card_reader_order_delivery_description, null, null, 14), false, null, FieldMode.NotEditable.f60955a, null, null, false, null, 2097012), null, null, 6)), null, new k(nVar2, 0), 1);
                return Unit.f186387a;
        }
    }
}
