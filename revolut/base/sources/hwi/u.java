package hwi;

import gwi.i2;
import gwi.j3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ v v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.v, continuation, 0);
            default:
                return new u(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        v vVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j3 j3Var = (j3) vVar.f156257b.T2("KEY_PASSES_QUOTES", j3.class);
                if (j3Var != null) {
                    return kp0.w0.B(j3Var);
                }
                return null;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i2 i2Var = (i2) vVar.f156257b.T2("KEY_PASSES_PRICING", i2.class);
                if (i2Var != null) {
                    return kotlin.jvm.internal.s.I(i2Var);
                }
                return null;
        }
    }
}
