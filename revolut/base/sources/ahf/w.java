package ahf;

import com.revolut.feature.exchange.models.ExchangeOrder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ExchangeOrder f5100w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, ExchangeOrder exchangeOrder, Continuation continuation) {
        super(2, continuation);
        this.v = zVar;
        this.f5100w = exchangeOrder;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.v, this.f5100w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            z zVar = this.v;
            a2j.c cVar = new a2j.c(zVar, this.f5100w, null, 17);
            this.u = 1;
            if (zVar.p2(this, cVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
