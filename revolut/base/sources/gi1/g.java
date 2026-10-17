package gi1;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddAddressScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AddAddressScreen addAddressScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addAddressScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.address.common.impl.flow.screen.add.a) this.v.d()).L2(model.f52580a);
        return Unit.f186387a;
    }
}
