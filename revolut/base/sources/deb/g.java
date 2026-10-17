package deb;

import com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreen;
import com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import dcf.v0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CustomerDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CustomerDetailsScreen customerDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = customerDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            default:
                return new g(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CustomerDetailsScreen customerDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.v2(((com.revolut.feature.retail.restaurants.impl.ui.customerdetails.a) customerDetailsScreen.e3()).f82847s, CustomerDetailsScreenContract$ModalStep.PhoneNumberCountry.f82843a, ModalDestination.Style.POPUP.f98311a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((oki.h) customerDetailsScreen.e3()).B2();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.retail.restaurants.impl.ui.customerdetails.a aVar4 = (com.revolut.feature.retail.restaurants.impl.ui.customerdetails.a) customerDetailsScreen.e3();
                aVar4.getClass();
                aVar4.l2(new v0(aVar4, null, 1), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
