package i28;

import com.revolut.feature.instruments.trend.collections.api.InstrumentsTrendCollectionDestination;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ n u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Continuation continuation) {
        super(2, continuation);
        this.u = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.f157898a.a(new InstrumentsTrendCollectionDestination(InstrumentsTrendCollectionId.RecommendedBuy.f74905a, null, ph7.c.RECOMMENDED_BUY));
        return Unit.f186387a;
    }
}
