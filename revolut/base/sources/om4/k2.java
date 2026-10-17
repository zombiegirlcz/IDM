package om4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes22.dex */
public final class k2 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f226617x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x2 f226618y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(x2 x2Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f226618y = x2Var;
        this.z = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k2 k2Var = new k2(this.f226618y, this.z, continuation, 0);
                k2Var.f226617x = obj2;
                return k2Var;
            default:
                k2 k2Var2 = new k2(this.f226618y, this.z, continuation, 1);
                k2Var2.f226617x = obj2;
                return k2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k2) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f226617x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f226616w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.f226617x = null;
                    this.v = flowCollector;
                    this.f226616w = 1;
                    obj2 = this.f226618y.k.b(this.z, yw4.f.CREDIT_LIMIT_DECREASE, this);
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
                this.f226617x = null;
                this.v = null;
                this.f226616w = 2;
                if (flowCollector.emit(obj2, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.f226617x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f226616w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ll4.m mVar = ll4.m.CHANGE_DUE_DATE_BUTTON;
                    this.f226617x = null;
                    this.v = flowCollector2;
                    this.f226616w = 1;
                    obj2 = this.f226618y.v(this.z, mVar, this);
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
                this.f226617x = null;
                this.v = null;
                this.f226616w = 2;
                if (flowCollector2.emit(obj2, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
