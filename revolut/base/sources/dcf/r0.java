package dcf;

import com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen.TradingAddOnsMainScreenRevamp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class r0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TradingAddOnsMainScreenRevamp f112964w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(TradingAddOnsMainScreenRevamp tradingAddOnsMainScreenRevamp, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112964w = tradingAddOnsMainScreenRevamp;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r0 r0Var = new r0(this.f112964w, continuation, 0);
                r0Var.v = obj2;
                return r0Var;
            default:
                r0 r0Var2 = new r0(this.f112964w, continuation, 1);
                r0Var2.v = obj2;
                return r0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r0) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TradingAddOnsMainScreenRevamp tradingAddOnsMainScreenRevamp = this.f112964w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i0) tradingAddOnsMainScreenRevamp.j3()).S0((String) aVar.d);
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i0) tradingAddOnsMainScreenRevamp.j3()).S0((String) aVar3.d);
                break;
        }
        return Unit.f186387a;
    }
}
