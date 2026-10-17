package d33;

import aw0.n6;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.guidelines.CardPersonalisationGuidelinesController;
import d33.e;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CardPersonalisationGuidelinesController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CardPersonalisationGuidelinesController cardPersonalisationGuidelinesController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cardPersonalisationGuidelinesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CardPersonalisationGuidelinesController cardPersonalisationGuidelinesController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) ((c) cardPersonalisationGuidelinesController.S.getValue())).C2(e.b.f110905a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) ((c) cardPersonalisationGuidelinesController.S.getValue())).C2(e.a.f110904a);
                break;
        }
        return Unit.f186387a;
    }
}
