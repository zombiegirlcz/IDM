package jh9;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.PocketSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ p v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Continuation continuation) {
        super(1, continuation);
        this.v = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        p pVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            x02.a aVar2 = pVar.f174175p;
            xi0.b bVar = pVar.u.f78786c.f115083b;
            this.u = 1;
            obj2 = ((q12.d) aVar2).c(AccountId.Personal.f51414a, this, bVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        pVar.H2(pVar.v, new je2.d((PocketSource) obj2, pVar, 11));
        return Unit.f186387a;
    }
}
