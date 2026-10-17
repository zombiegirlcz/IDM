package kye;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class x2 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190873w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.f190873w = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        x2 x2Var = new x2(this.f190873w, continuation);
        x2Var.v = obj2;
        return x2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x2) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        k3 k3Var = this.f190873w;
        if (i == 0) {
            yhm.o.b(obj2);
            dj0.d dVar = (dj0.d) pair.f186385a;
            fo3.c cVar = (fo3.c) pair.f186386b;
            q3 q3Var = k3Var.f190766r;
            long jH = cVar.h();
            dj0.d dVarL = i26.l.l(cVar);
            xi0.b bVar = cVar.d;
            this.v = null;
            this.u = 1;
            obj2 = ((w3) q3Var).e(dVar, jH, dVarL, bVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        k3Var.H2(k3Var.f190763d0, new kv7.g((x3) obj2, 24));
        return Unit.f186387a;
    }
}
