package k50;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class n3 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ j4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3(int i, j4 j4Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.v = j4Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n3(0, this.v, continuation);
            default:
                return new n3(1, this.v, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n3) create((l40.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n3) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        j4 j4Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j4Var.H2(j4Var.f181140w0, new l2(23));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j4Var.H2(j4Var.f181140w0, new l2(24));
                break;
        }
        return Unit.f186387a;
    }
}
