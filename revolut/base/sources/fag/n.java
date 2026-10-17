package fag;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f133347w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ qei.n f133348x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, qei.n nVar, Continuation continuation) {
        super(2, continuation);
        this.f133347w = oVar;
        this.f133348x = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.f133347w, this.f133348x, continuation);
        nVar.v = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = (FlowCollector) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            b.Companion companion = kotlin.time.b.INSTANCE;
            long jH = kotlin.time.c.h(1000L, pkm.e.MILLISECONDS);
            o oVar = this.f133347w;
            dp4.z0 z0Var = new dp4.z0(oVar, (Continuation) null, 9);
            afa.u uVar = new afa.u(oVar, this.f133348x, flowCollector, (Continuation) null, 19);
            this.v = null;
            this.u = 1;
            if (a.a.y(jH, z0Var, uVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
