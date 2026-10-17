package v23;

import com.revolut.feature.card_order_new.impl.kompot.screen.card_holder_name.CardHolderNameController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import v23.j;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ CardHolderNameController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CardHolderNameController cardHolderNameController, Continuation continuation) {
        super(2, continuation);
        this.u = cardHolderNameController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((n) ((e) this.u.P.getValue())).I2(j.a.f285636a);
        return Unit.f186387a;
    }
}
