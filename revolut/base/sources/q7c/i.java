package q7c;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f242816w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ l6c.b f242817x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        l6c.b bVar = (l6c.b) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(3, 0, continuation);
                iVar.f242816w = flowCollector;
                iVar.f242817x = bVar;
                return iVar.invokeSuspend(Unit.f186387a);
            default:
                i iVar2 = new i(3, 1, continuation);
                iVar2.f242816w = flowCollector;
                iVar2.f242817x = bVar;
                return iVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = this.f242816w;
                l6c.b bVar = this.f242817x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.f242816w = null;
                    this.f242817x = bVar;
                    this.v = 1;
                    if (flowCollector.emit(bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Boolean.valueOf(bVar instanceof l6c.a);
            default:
                FlowCollector flowCollector2 = this.f242816w;
                l6c.b bVar2 = this.f242817x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                boolean z = true;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    if (!(bVar2 instanceof l6c.i)) {
                        this.f242816w = null;
                        this.f242817x = bVar2;
                        this.v = 1;
                        if (flowCollector2.emit(bVar2, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (!(bVar2 instanceof l6c.a) && !(bVar2 instanceof l6c.i)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
