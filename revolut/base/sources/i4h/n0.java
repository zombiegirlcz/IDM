package i4h;

import com.revolut.retail.feature.trading_hours.api.TradingHoursDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ p0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, Continuation continuation) {
        super(1, continuation);
        this.v = p0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        p0 p0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.i iVarE = ((ael.k) p0Var.f158471p).e(((e3h.c) ((j2) p0Var.f158478y.f22677a).getValue()).f122272a);
            this.u = 1;
            obj2 = nim.a.b(iVarE, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        nel.n nVar = (nel.n) obj2;
        Intrinsics.h(nVar);
        return p0Var.A2(new TradingHoursDestination.MarketHours(nVar));
    }
}
