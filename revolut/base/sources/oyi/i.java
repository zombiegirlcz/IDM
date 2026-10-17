package oyi;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c f231048w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f231048w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f231048w, continuation, 0);
            default:
                return new i(this.f231048w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c cVar = this.f231048w;
                mtd.e eVar = new mtd.e(cVar, null, 28);
                this.v = 1;
                Object objB = pu7.a.B(cVar.k, "load_pass_refund_breakdown", eVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c cVar2 = this.f231048w;
                com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.b bVar = new com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.b(cVar2, null);
                this.v = 1;
                Object objB0 = u0.b0(cVar2.X(), "TAG_LOADING_BUTTON_SUBMIT_REFUND", bVar, this);
                return objB0 == aVar2 ? aVar2 : objB0;
        }
    }
}
