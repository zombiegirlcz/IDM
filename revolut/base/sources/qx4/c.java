package qx4;

import com.revolut.data.model.Data;
import grl.r2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f250019w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r2 f250020x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Continuation continuation, f fVar, r2 r2Var) {
        super(2, continuation);
        this.u = 0;
        this.f250019w = fVar;
        this.f250020x = r2Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(continuation, this.f250019w, this.f250020x);
                cVar.v = ((Boolean) obj2).booleanValue();
                return cVar;
            case 1:
                c cVar2 = new c(this.f250019w, this.f250020x, continuation, 1);
                cVar2.v = ((Boolean) obj2).booleanValue();
                return cVar2;
            default:
                c cVar3 = new c(this.f250019w, this.f250020x, continuation, 2);
                cVar3.v = ((Boolean) obj2).booleanValue();
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.u;
        Boolean bool = (Boolean) obj2;
        bool.getClass();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
        }
        return ((c) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        r2 r2Var = this.f250020x;
        f fVar = this.f250019w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return z ? fVar.k(r2Var) : new go.g(new Data(Boolean.FALSE, null, false, 6, null), 2);
            case 1:
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return fVar.g(r2Var, z3);
            default:
                boolean z4 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return fVar.g(r2Var, z4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, r2 r2Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f250019w = fVar;
        this.f250020x = r2Var;
    }
}
