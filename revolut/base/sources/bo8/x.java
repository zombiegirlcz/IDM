package bo8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f17331x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b0 f17332y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(b0 b0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f17332y = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(this.f17332y, continuation, 0);
                xVar.f17331x = obj2;
                return xVar;
            case 1:
                x xVar2 = new x(this.f17332y, continuation, 1);
                xVar2.f17331x = obj2;
                return xVar2;
            default:
                x xVar3 = new x(this.f17332y, continuation, 2);
                xVar3.f17331x = obj2;
                return xVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f17331x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f17330w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ty1.b bVar = (ty1.b) this.f17332y.u;
                    bVar.getClass();
                    pfm.z zVarC = bVar.c(yoj.c.APM_BIZUM);
                    this.f17331x = null;
                    this.v = flowCollector;
                    this.f17330w = 1;
                    obj2 = nim.a.b(zVarC, this);
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
                this.f17331x = null;
                this.v = null;
                this.f17330w = 2;
                if (flowCollector.emit(obj2, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                FlowCollector flowCollector2 = (FlowCollector) this.f17331x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f17330w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarA = ((ty1.b) this.f17332y.u).a();
                    this.f17331x = null;
                    this.v = flowCollector2;
                    this.f17330w = 1;
                    obj2 = nim.a.b(iVarA, this);
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
                this.f17331x = null;
                this.v = null;
                this.f17330w = 2;
                if (flowCollector2.emit(obj2, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector3 = (FlowCollector) this.f17331x;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f17330w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ty1.b bVar2 = (ty1.b) this.f17332y.u;
                    bVar2.getClass();
                    pfm.z zVarC2 = bVar2.c(yoj.c.APM_MULTIBANCO);
                    this.f17331x = null;
                    this.v = flowCollector3;
                    this.f17330w = 1;
                    obj2 = nim.a.b(zVarC2, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector3 = this.v;
                    yhm.o.b(obj2);
                }
                this.f17331x = null;
                this.v = null;
                this.f17330w = 2;
                if (flowCollector3.emit(obj2, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
        }
    }
}
