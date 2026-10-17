package pqg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i0 i0Var, Continuation continuation) {
        super(1, continuation);
        this.v = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        i0 i0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            obj2 = i0.B2(i0Var, this);
            if (obj2 != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        zbb.a aVar2 = i0Var.H;
        xi0.b bVar = ((o) i0Var.t2()).f238752g;
        this.u = 2;
        Object objB = ((zbb.i) aVar2).b(bVar, (zbb.f) obj2, this);
        return objB == aVar ? aVar : objB;
    }
}
