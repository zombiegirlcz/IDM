package kye;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kye.u;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.v = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        k3 k3Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            y51.a aVar2 = k3Var.A;
            this.u = 1;
            obj2 = ((e0f.z) aVar2).h(true, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            k3Var.H2(k3Var.f190763d0, new m0(3));
            k3Var.C2(u.b.f190843a);
            k3Var.P2();
        }
        return Unit.f186387a;
    }
}
