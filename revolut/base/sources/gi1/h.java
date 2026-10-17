package gi1;

import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddAddressScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AddAddressScreen addAddressScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addAddressScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((SearchButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SearchButtonDelegate.Model model = (SearchButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.address.common.impl.flow.screen.add.a) this.v.d()).L2(model.f53284a);
        return Unit.f186387a;
    }
}
