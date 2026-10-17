package l13;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_order_new.impl.brazil.CardSubtypePickerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardSubtypePickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CardSubtypePickerController cardSubtypePickerController, Continuation continuation) {
        super(2, continuation);
        this.v = cardSubtypePickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((l) ((e) this.v.Q.getValue())).I2(new j(model.f53228a));
        return Unit.f186387a;
    }
}
