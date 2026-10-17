package a32;

import a32.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import nii.n1;

/* JADX INFO: loaded from: classes20.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ a0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(a0 a0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = a0Var;
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
                return ((u) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        a0 a0Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a0Var.C2(o.b.f1035a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a0Var.H2(a0Var.f1012t, w.f1041a);
                break;
        }
        return Unit.f186387a;
    }
}
