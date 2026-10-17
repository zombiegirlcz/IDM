package xg6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f305605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f305606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x f305607y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, Continuation continuation, x xVar) {
        super(2, continuation);
        this.u = i;
        this.f305607y = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(0, continuation, this.f305607y);
                uVar.f305606x = obj2;
                return uVar;
            default:
                u uVar2 = new u(1, continuation, this.f305607y);
                uVar2.f305606x = obj2;
                return uVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((u) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f305606x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f305605w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.f305606x = null;
                    this.v = flowCollector;
                    this.f305605w = 1;
                    obj2 = this.f305607y.c(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector = this.v;
                    yhm.o.b(obj2);
                }
                this.f305606x = null;
                this.v = null;
                this.f305605w = 2;
                if (flowCollector.emit(obj2, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.f305606x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f305605w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.f305606x = null;
                    this.v = flowCollector2;
                    this.f305605w = 1;
                    obj2 = this.f305607y.c(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector2 = this.v;
                    yhm.o.b(obj2);
                }
                this.f305606x = null;
                this.v = null;
                this.f305605w = 2;
                if (flowCollector2.emit(obj2, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
