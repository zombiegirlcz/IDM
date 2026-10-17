package o23;

import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nya.i0;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddressFormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(AddressFormController addressFormController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addressFormController;
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
        AddressFormController addressFormController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar = (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) addressFormController.e3();
                bVar.l2(new i0(bVar.K2(), bVar, null, 4), new yi5.b(26));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0m.e.c(addressFormController.m2());
                addressFormController.m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
