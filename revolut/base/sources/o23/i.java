package o23;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddressFormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AddressFormController addressFormController, Continuation continuation) {
        super(2, continuation);
        this.v = addressFormController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextDelegate.Model model = (TextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarE3 = this.v.e3();
        String listId = model.f53531a;
        com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar = (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) uVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        bVar.H2(bVar.D, new o17.x(3));
        return Unit.f186387a;
    }
}
