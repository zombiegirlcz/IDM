package tgf;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.transaction_list.impl.ui.list.screen.filter.TransactionsFilterScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionsFilterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TransactionsFilterScreen transactionsFilterScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionsFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.v.Q.getValue();
        Object obj3 = model.i;
        ((l) jVar).I2(obj3 instanceof g ? (g) obj3 : null);
        return Unit.f186387a;
    }
}
