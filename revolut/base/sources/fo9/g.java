package fo9;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.payment.counterparty.impl.screen.profile.CounterPartyDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CounterPartyDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CounterPartyDetailsScreen counterPartyDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = counterPartyDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        Intrinsics.h(item);
        ((com.revolut.feature.payment.counterparty.impl.screen.profile.a) iVarE3).I2(new n(item));
        return Unit.f186387a;
    }
}
