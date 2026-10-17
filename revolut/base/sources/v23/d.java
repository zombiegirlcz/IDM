package v23;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_holder_name.CardHolderNameController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardHolderNameController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CardHolderNameController cardHolderNameController, Continuation continuation) {
        super(2, continuation);
        this.v = cardHolderNameController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVar = (e) this.v.P.getValue();
        Intrinsics.h(model);
        ((n) eVar).I2(new k(model));
        return Unit.f186387a;
    }
}
