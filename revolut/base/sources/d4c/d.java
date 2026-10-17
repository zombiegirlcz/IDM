package d4c;

import avj.p;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.DeliveryAddressScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeliveryAddressScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DeliveryAddressScreen deliveryAddressScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deliveryAddressScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        if (obj3 instanceof a4c.a) {
            g gVarE3 = this.v.R2();
            Address address = ((a4c.a) obj3).f1251a;
            com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.a aVar2 = (com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.a) gVarE3;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(address, "address");
            aVar2.H2(aVar2.f84238r, new p(address, 4));
        }
        return Unit.f186387a;
    }
}
