package o23;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddressFormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AddressFormController addressFormController, Continuation continuation) {
        super(2, continuation);
        this.v = addressFormController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) this.v.e3()).N2(model.f52580a);
        return Unit.f186387a;
    }
}
