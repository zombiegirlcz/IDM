package xnd;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class z0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f307471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ od0.i f307472x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(od0.i iVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f307472x = iVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                z0 z0Var = new z0(this.f307472x, continuation, 0);
                z0Var.f307471w = flowCollector;
                return z0Var.invokeSuspend(Unit.f186387a);
            default:
                z0 z0Var2 = new z0(this.f307472x, continuation, 1);
                z0Var2.f307471w = flowCollector;
                return z0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = this.f307471w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    Data dataP = zi0.c.P(this.f307472x, false, null, 3);
                    this.f307471w = null;
                    this.v = 1;
                    if (flowCollector.emit(dataP, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = this.f307471w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Data dataP2 = zi0.c.P(this.f307472x, false, null, 3);
                    this.f307471w = null;
                    this.v = 1;
                    if (flowCollector2.emit(dataP2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
