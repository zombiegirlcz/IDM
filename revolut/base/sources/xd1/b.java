package xd1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.LitePosFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ LitePosFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(LitePosFlow litePosFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = litePosFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            default:
                return new b(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        LitePosFlow litePosFlow = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                litePosFlow.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g) litePosFlow.R2();
                gVar.getClass();
                gVar.l2(new wtj.f(gVar, new wp0.b(gVar, 28), null, 28), new yi5.b(26));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar2 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g) litePosFlow.R2();
                gVar2.getClass();
                gVar2.l2(new com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.d(gVar2, null), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
