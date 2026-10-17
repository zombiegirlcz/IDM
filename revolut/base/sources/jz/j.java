package jz;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes16.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u = 1;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f179542w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, n0 n0Var, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
        this.f179542w = n0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f179542w, this.v, continuation);
            default:
                return new j(this.v, this.f179542w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((xv.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n0 n0Var = this.f179542w;
        l lVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                lVar.f179549q.getClass();
                n0Var.f186428a = System.currentTimeMillis();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sx.a aVar3 = lVar.f179551s;
                lVar.f179549q.getClass();
                ((sx.b) aVar3).k((System.currentTimeMillis() - n0Var.f186428a) / ((double) 1000));
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n0 n0Var, l lVar, Continuation continuation) {
        super(2, continuation);
        this.f179542w = n0Var;
        this.v = lVar;
    }
}
