package pc1;

import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.CardReaderConnectionFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pb2.v;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ q u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q qVar, Continuation continuation) {
        super(2, continuation);
        this.u = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        CardReaderConnectionFlow cardReaderConnectionFlow = new CardReaderConnectionFlow(0);
        q qVar = this.u;
        yji.l.i2(qVar, cardReaderConnectionFlow, null, new v(qVar, 3), 1);
        return Unit.f186387a;
    }
}
