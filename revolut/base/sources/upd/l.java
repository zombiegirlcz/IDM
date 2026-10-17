package upd;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((yoj.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        yoj.a aVar = (yoj.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean zK = yoj.b.k(aVar);
        Flow flowH = null;
        if (zK) {
            n nVar = this.v;
            flowH = xam.a.h(new k(nVar, null), u0.m(tzg.m.a(nVar.f281980c, WealthAccountType.ROBO), glc.a.c(nVar.f281979b)));
        }
        return flowH == null ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : flowH;
    }
}
