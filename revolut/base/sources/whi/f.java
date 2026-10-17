package whi;

import bjl.o0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f297677w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.kompot.bridge.impl.rootflow.a f297678x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.kompot.bridge.impl.rootflow.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f297678x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f297678x, continuation, 0);
                fVar.f297677w = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f297678x, continuation, 1);
                fVar2.f297677w = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable th10 = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(th10, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                Throwable th10 = (Throwable) this.f297677w;
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
                com.revolut.kompot.bridge.impl.rootflow.a aVar2 = this.f297678x;
                o0 o0Var = aVar2.K;
                aii.o oVarL1 = aVar2.l1();
                this.f297677w = null;
                this.v = 1;
                Object objA = ((fkl.f) o0Var).a(th10, oVarL1, this);
                return objA == aVar ? aVar : objA;
            default:
                Throwable th11 = (Throwable) this.f297677w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.kompot.bridge.impl.rootflow.a aVar4 = this.f297678x;
                o0 o0Var2 = aVar4.K;
                aii.o oVarL12 = aVar4.l1();
                this.f297677w = null;
                this.v = 1;
                Object objA2 = ((fkl.f) o0Var2).a(th11, oVarL12, this);
                return objA2 == aVar3 ? aVar3 : objA2;
        }
    }
}
