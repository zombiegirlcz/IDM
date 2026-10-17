package kye;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class q2 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190818w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.f190818w = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q2 q2Var = new q2(this.f190818w, continuation);
        q2Var.v = obj2;
        return q2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q2) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        k3 k3Var = this.f190818w;
        if (i == 0) {
            yhm.o.b(obj2);
            String str = (String) pair.f186386b;
            wsg.n nVar = k3Var.M;
            xi0.b.Companion.getClass();
            ufm.i iVarC = ue0.e.C(osg.b.r(nVar, xi0.a.a(str), null, null, null, 62), k3Var.M.y(e1f.c.a(k3Var.f190767s.f190795a)));
            this.v = null;
            this.u = 1;
            obj2 = nim.a.b(iVarC, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        k3Var.H2(k3Var.f190763d0, new afa.s((io3.d) obj2, 10));
        return Unit.f186387a;
    }
}
