package j3i;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature_exchange.api.models.TakeProfitStopLossParams;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b f171210w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f171210w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f171210w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            default:
                p pVar2 = new p(this.f171210w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((k59.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                k59.c cVar = (k59.c) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b bVar = this.f171210w;
                y yVar = bVar.v;
                TakeProfitStopLossParams takeProfitStopLossParams = bVar.o;
                if (takeProfitStopLossParams.f96827c == r0i.c.TP_SL) {
                    Intrinsics.h(cVar);
                    bVar.H2(yVar, new is6.t(bVar, cVar, 29));
                } else {
                    Intrinsics.h(cVar);
                    bVar.H2(yVar, new dqd.a(bVar, takeProfitStopLossParams.f96827c, takeProfitStopLossParams.e, cVar, 28));
                }
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = (String) pair.f186385a;
                Data data = (Data) pair.f186386b;
                com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b bVar2 = this.f171210w;
                bVar2.H2(bVar2.v, new bba.q(data, str, 4));
                break;
        }
        return Unit.f186387a;
    }
}
