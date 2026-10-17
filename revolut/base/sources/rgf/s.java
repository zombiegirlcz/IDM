package rgf;

import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ t v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Continuation continuation) {
        super(2, continuation);
        this.v = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((PocketBalancesWithSum) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PocketBalancesWithSum pocketBalancesWithSum = (PocketBalancesWithSum) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVar = this.v;
        tVar.H2(tVar.f254174w, new raf.o(pocketBalancesWithSum, 20));
        return Unit.f186387a;
    }
}
